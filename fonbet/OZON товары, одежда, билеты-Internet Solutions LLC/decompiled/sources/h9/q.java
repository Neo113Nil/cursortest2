package h9;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f65120a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f65121b;

    /* renamed from: c, reason: collision with root package name */
    private s[] f65122c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC6876a f65123d;

    /* renamed from: e, reason: collision with root package name */
    private Map<r, Object> f65124e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(String str, byte[] bArr, s[] sVarArr, EnumC6876a enumC6876a) {
        this(str, bArr, sVarArr, enumC6876a, 0);
        System.currentTimeMillis();
    }

    public final void a(s[] sVarArr) {
        s[] sVarArr2 = this.f65122c;
        if (sVarArr2 == null) {
            this.f65122c = sVarArr;
            return;
        }
        if (sVarArr == null || sVarArr.length <= 0) {
            return;
        }
        s[] sVarArr3 = new s[sVarArr2.length + sVarArr.length];
        System.arraycopy(sVarArr2, 0, sVarArr3, 0, sVarArr2.length);
        System.arraycopy(sVarArr, 0, sVarArr3, sVarArr2.length, sVarArr.length);
        this.f65122c = sVarArr3;
    }

    public final EnumC6876a b() {
        return this.f65123d;
    }

    public final byte[] c() {
        return this.f65121b;
    }

    public final Map<r, Object> d() {
        return this.f65124e;
    }

    public final s[] e() {
        return this.f65122c;
    }

    public final String f() {
        return this.f65120a;
    }

    public final void g(Map<r, Object> map) {
        if (map != null) {
            Map<r, Object> map2 = this.f65124e;
            if (map2 == null) {
                this.f65124e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public final void h(r rVar, Object obj) {
        if (this.f65124e == null) {
            this.f65124e = new EnumMap(r.class);
        }
        this.f65124e.put(rVar, obj);
    }

    public final String toString() {
        return this.f65120a;
    }

    public q(String str, byte[] bArr, s[] sVarArr, EnumC6876a enumC6876a, int i11) {
        this.f65120a = str;
        this.f65121b = bArr;
        this.f65122c = sVarArr;
        this.f65123d = enumC6876a;
        this.f65124e = null;
    }
}
