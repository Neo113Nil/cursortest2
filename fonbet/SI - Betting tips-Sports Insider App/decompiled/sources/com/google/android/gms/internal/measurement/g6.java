package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    public final q4 f5060a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5061b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5062c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5063d;

    public g6(q4 q4Var, String str, Object[] objArr) {
        this.f5060a = q4Var;
        this.f5061b = str;
        this.f5062c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5063d = charAt;
            return;
        }
        int i5 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.f5063d = i5 | (charAt2 << i11);
                return;
            } else {
                i5 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i5 = this.f5063d;
        if ((i5 & 1) != 0) {
            return 1;
        }
        return (i5 & 4) == 4 ? 3 : 2;
    }
}
