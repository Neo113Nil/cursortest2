package i1;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class n implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final n f47992c = new n(Collections.EMPTY_MAP);

    /* renamed from: a, reason: collision with root package name */
    public int f47993a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f47994b;

    public n(Map map) {
        this.f47994b = Collections.unmodifiableMap(map);
    }

    public static void e(HashMap hashMap, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), i(entry.getValue()));
        }
    }

    public static Map f(Map map, m mVar) {
        HashMap hashMap = new HashMap(map);
        k(hashMap, mVar.c());
        e(hashMap, mVar.b());
        return hashMap;
    }

    public static byte[] i(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static boolean j(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void k(HashMap hashMap, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashMap.remove(list.get(i10));
        }
    }

    @Override // i1.l
    public final long a(String str, long j10) {
        byte[] bArr = (byte[]) this.f47994b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j10;
    }

    @Override // i1.l
    public final String d(String str, String str2) {
        byte[] bArr = (byte[]) this.f47994b.get(str);
        return bArr != null ? new String(bArr, StandardCharsets.UTF_8) : str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        return j(this.f47994b, ((n) obj).f47994b);
    }

    public n g(m mVar) {
        Map f10 = f(this.f47994b, mVar);
        return j(this.f47994b, f10) ? this : new n(f10);
    }

    public Set h() {
        return this.f47994b.entrySet();
    }

    public int hashCode() {
        if (this.f47993a == 0) {
            int i10 = 0;
            for (Map.Entry entry : this.f47994b.entrySet()) {
                i10 += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f47993a = i10;
        }
        return this.f47993a;
    }
}
