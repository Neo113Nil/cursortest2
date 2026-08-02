package com.logrocket.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f6674a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6675b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f6676c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6677d;

    public c1(a aVar, String str, Object[] objArr) {
        this.f6674a = aVar;
        this.f6675b = str;
        this.f6676c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f6677d = charAt;
            return;
        }
        int i5 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f6677d = i5 | (charAt2 << i10);
                return;
            } else {
                i5 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }
}
