package io.sentry.android.core;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f15769b;

    public /* synthetic */ l(e0 e0Var, int i5) {
        this.f15768a = i5;
        this.f15769b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15768a) {
            case 0:
                ((m) this.f15769b).b(5000L);
                break;
            default:
                ((o) this.f15769b).b(5000L);
                break;
        }
    }
}
