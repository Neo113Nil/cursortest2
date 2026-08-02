package re;

import android.os.CountDownTimer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f22476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, long j, int i5) {
        super(j, 1000L);
        this.f22475a = i5;
        this.f22476b = gVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.f22475a) {
            case 0:
                this.f22476b.f22477a.l(0L);
                cancel();
                break;
            default:
                this.f22476b.f22477a.l(0L);
                cancel();
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.f22475a) {
            case 0:
                long j6 = j / 1000;
                if (j6 <= 0) {
                    j6 = 0;
                }
                this.f22476b.f22477a.l(j6);
                break;
            default:
                long j10 = j / 1000;
                if (j10 <= 0) {
                    j10 = 0;
                }
                this.f22476b.f22477a.l(j10);
                break;
        }
    }
}
