package defpackage;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vz2 {
    public static final vz2 b = new vz2(new HashMap());
    public final Map a;

    public vz2(HashMap hashMap) {
        this.a = Collections.unmodifiableMap(hashMap);
    }

    public static uz2 a(MediaFormat mediaFormat, Set set) {
        uz2 uz2Var = new uz2();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                HashMap hashMap = uz2Var.a;
                if (valueTypeForKey == 1) {
                    hashMap.put(str, Integer.valueOf(mediaFormat.getInteger(str)));
                } else if (valueTypeForKey == 2) {
                    hashMap.put(str, Long.valueOf(mediaFormat.getLong(str)));
                } else if (valueTypeForKey == 3) {
                    hashMap.put(str, Float.valueOf(mediaFormat.getFloat(str)));
                } else if (valueTypeForKey == 4) {
                    hashMap.put(str, mediaFormat.getString(str));
                } else if (valueTypeForKey == 5) {
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                    if (byteBuffer == null) {
                        hashMap.put(str, null);
                    } else {
                        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                        allocate.put(byteBuffer.duplicate());
                        allocate.flip();
                        hashMap.put(str, allocate);
                    }
                }
            }
        }
        return uz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vz2) {
            return this.a.equals(((vz2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
