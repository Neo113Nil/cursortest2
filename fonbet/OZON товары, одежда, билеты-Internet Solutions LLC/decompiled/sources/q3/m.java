package q3;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f81475c = new m(Collections.EMPTY_MAP);

    /* renamed from: a, reason: collision with root package name */
    private int f81476a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, byte[]> f81477b;

    public m() {
        this(Collections.EMPTY_MAP);
    }

    private static boolean e(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final m a(l lVar) {
        byte[] bArr;
        Map<String, byte[]> map = this.f81477b;
        HashMap hashMap = new HashMap(map);
        List<String> b11 = lVar.b();
        for (int i11 = 0; i11 < b11.size(); i11++) {
            hashMap.remove(b11.get(i11));
        }
        for (Map.Entry<String, Object> entry : lVar.a().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bArr = ((String) value).getBytes(StandardCharsets.UTF_8);
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bArr = (byte[]) value;
            }
            hashMap.put(key, bArr);
        }
        return e(map, hashMap) ? this : new m(hashMap);
    }

    public final Set<Map.Entry<String, byte[]>> b() {
        return this.f81477b.entrySet();
    }

    public final long c() {
        byte[] bArr = this.f81477b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public final String d() {
        byte[] bArr = this.f81477b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return e(this.f81477b, ((m) obj).f81477b);
    }

    public final int hashCode() {
        if (this.f81476a == 0) {
            int i11 = 0;
            for (Map.Entry<String, byte[]> entry : this.f81477b.entrySet()) {
                i11 += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f81476a = i11;
        }
        return this.f81476a;
    }

    public m(Map<String, byte[]> map) {
        this.f81477b = Collections.unmodifiableMap(map);
    }
}
