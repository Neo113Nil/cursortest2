package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final t2 f5416a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5417b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5418c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5419d;

    public c4(t2 t2Var, String str, Object[] objArr) {
        this.f5416a = t2Var;
        this.f5417b = str;
        this.f5418c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5419d = charAt;
            return;
        }
        int i5 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.f5419d = i5 | (charAt2 << i11);
                return;
            } else {
                i5 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i5 = this.f5419d;
        if ((i5 & 1) != 0) {
            return 1;
        }
        return (i5 & 4) == 4 ? 3 : 2;
    }
}
