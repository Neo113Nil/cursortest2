package re;

import android.os.CountDownTimer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f22462b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, long j, int i5) {
        super(j, 1000L);
        this.f22461a = i5;
        this.f22462b = cVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.f22461a) {
            case 0:
                c cVar = this.f22462b;
                cVar.f22463a.e(-3, cVar.f22466d, cVar.f22467e, cVar.f22468f, 0L);
                cancel();
                break;
            case 1:
                c cVar2 = this.f22462b;
                cVar2.f22463a.e(-3, cVar2.f22466d, cVar2.f22467e, cVar2.f22468f, 0L);
                cancel();
                break;
            default:
                c cVar3 = this.f22462b;
                cVar3.f22463a.e(-3, cVar3.f22466d, cVar3.f22467e, cVar3.f22468f, 0L);
                cancel();
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.f22461a) {
            case 0:
                long j6 = j / 1000;
                if (j6 <= 0) {
                    j6 = 0;
                }
                this.f22462b.f22463a.i(j6);
                break;
            case 1:
                long j10 = j / 1000;
                if (j10 <= 0) {
                    j10 = 0;
                }
                this.f22462b.f22463a.i(j10);
                break;
            default:
                long j11 = j / 1000;
                if (j11 <= 0) {
                    j11 = 0;
                }
                this.f22462b.f22463a.i(j11);
                break;
        }
    }
}
