package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.ilg;
import defpackage.is8;
import defpackage.ljg;
import defpackage.sw9;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class DefaultContentMetadata implements ContentMetadata {
    public static final DefaultContentMetadata EMPTY = new DefaultContentMetadata(Collections.EMPTY_MAP);
    private static final int MAX_VALUE_LENGTH = 10485760;
    private int hashCode;
    private final Map<String, byte[]> metadata;

    private DefaultContentMetadata(Map<String, byte[]> map) {
        this.metadata = Collections.unmodifiableMap(map);
    }

    private static void addValues(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (String str : map.keySet()) {
            byte[] bytes = getBytes(map.get(str));
            if (bytes.length > MAX_VALUE_LENGTH) {
                sw9.n("The size of %s (%d) is greater than maximum allowed: %d", new Object[]{str, Integer.valueOf(bytes.length), Integer.valueOf(MAX_VALUE_LENGTH)});
                return;
            }
            hashMap.put(str, bytes);
        }
    }

    private static Map<String, byte[]> applyMutations(Map<String, byte[]> map, ContentMetadataMutations contentMetadataMutations) {
        HashMap hashMap = new HashMap(map);
        removeValues(hashMap, contentMetadataMutations.getRemovedValues());
        addValues(hashMap, contentMetadataMutations.getEditedValues());
        return hashMap;
    }

    private static byte[] getBytes(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName(C.UTF8_NAME));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        ilg.c();
        return null;
    }

    private boolean isMetadataEqual(Map<String, byte[]> map) {
        if (this.metadata.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : this.metadata.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static DefaultContentMetadata readFromStream(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0 || readInt2 > MAX_VALUE_LENGTH) {
                is8.e(ljg.j(readInt2, "Invalid value size: "));
                return null;
            }
            byte[] bArr = new byte[readInt2];
            dataInputStream.readFully(bArr);
            hashMap.put(readUTF, bArr);
        }
        return new DefaultContentMetadata(hashMap);
    }

    private static void removeValues(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            hashMap.remove(list.get(i));
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.ContentMetadata
    public final boolean contains(String str) {
        return this.metadata.containsKey(str);
    }

    public DefaultContentMetadata copyWithMutationsApplied(ContentMetadataMutations contentMetadataMutations) {
        Map<String, byte[]> applyMutations = applyMutations(this.metadata, contentMetadataMutations);
        return isMetadataEqual(applyMutations) ? this : new DefaultContentMetadata(applyMutations);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultContentMetadata.class != obj.getClass()) {
            return false;
        }
        return isMetadataEqual(((DefaultContentMetadata) obj).metadata);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.ContentMetadata
    public final String get(String str, String str2) {
        return this.metadata.containsKey(str) ? new String(this.metadata.get(str), Charset.forName(C.UTF8_NAME)) : str2;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        for (Map.Entry<String, byte[]> entry : this.metadata.entrySet()) {
            i2 += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
        }
        this.hashCode = i2;
        return i2;
    }

    public void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.metadata.size());
        for (Map.Entry<String, byte[]> entry : this.metadata.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.ContentMetadata
    public final byte[] get(String str, byte[] bArr) {
        if (!this.metadata.containsKey(str)) {
            return bArr;
        }
        byte[] bArr2 = this.metadata.get(str);
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.ContentMetadata
    public final long get(String str, long j) {
        return this.metadata.containsKey(str) ? ByteBuffer.wrap(this.metadata.get(str)).getLong() : j;
    }
}
