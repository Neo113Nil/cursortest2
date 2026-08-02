package re;

import android.os.CountDownTimer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f22481b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, long j, int i5) {
        super(j, 1000L);
        this.f22480a = i5;
        this.f22481b = kVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.f22480a) {
            case 0:
                k kVar = this.f22481b;
                kVar.f22482a.e(-3, kVar.f22485d, kVar.f22486e, kVar.f22487f, 0L);
                cancel();
                break;
            case 1:
                k kVar2 = this.f22481b;
                kVar2.f22482a.e(-3, kVar2.f22485d, kVar2.f22486e, kVar2.f22487f, 0L);
                cancel();
                break;
            default:
                k kVar3 = this.f22481b;
                kVar3.f22482a.e(-3, kVar3.f22485d, kVar3.f22486e, kVar3.f22487f, 0L);
                cancel();
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.f22480a) {
            case 0:
                long j6 = j / 1000;
                if (j6 <= 0) {
                    j6 = 0;
                }
                this.f22481b.f22482a.i(j6);
                break;
            case 1:
                long j10 = j / 1000;
                if (j10 <= 0) {
                    j10 = 0;
                }
                this.f22481b.f22482a.i(j10);
                break;
            default:
                long j11 = j / 1000;
                if (j11 <= 0) {
                    j11 = 0;
                }
                this.f22481b.f22482a.i(j11);
                break;
        }
    }
}
