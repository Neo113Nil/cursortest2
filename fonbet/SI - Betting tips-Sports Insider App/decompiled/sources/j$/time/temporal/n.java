package j$.time.temporal;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17529b;

    public /* synthetic */ n(int i5, int i10) {
        this.f17528a = i10;
        this.f17529b = i5;
    }

    @Override // j$.time.temporal.m
    public final l n(l lVar) {
        switch (this.f17528a) {
            case 0:
                int i5 = lVar.i(a.DAY_OF_WEEK);
                int i10 = this.f17529b;
                if (i5 == i10) {
                    return lVar;
                }
                return lVar.d(i5 - i10 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int i11 = lVar.i(a.DAY_OF_WEEK);
                int i12 = this.f17529b;
                if (i11 == i12) {
                    return lVar;
                }
                return lVar.x(i12 - i11 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
