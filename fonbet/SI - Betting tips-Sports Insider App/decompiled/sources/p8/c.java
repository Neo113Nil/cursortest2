package p8;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f21540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f21541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f21542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f21543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f21544f;

    public /* synthetic */ c(e eVar, Runnable runnable, long j, long j6, TimeUnit timeUnit, int i5) {
        this.f21539a = i5;
        this.f21540b = eVar;
        this.f21541c = runnable;
        this.f21542d = j;
        this.f21543e = j6;
        this.f21544f = timeUnit;
    }

    @Override // p8.f
    public final ScheduledFuture a(i2.d dVar) {
        switch (this.f21539a) {
            case 0:
                e eVar = this.f21540b;
                return eVar.f21550b.scheduleAtFixedRate(new d(eVar, this.f21541c, dVar, 0), this.f21542d, this.f21543e, this.f21544f);
            default:
                e eVar2 = this.f21540b;
                return eVar2.f21550b.scheduleWithFixedDelay(new d(eVar2, this.f21541c, dVar, 2), this.f21542d, this.f21543e, this.f21544f);
        }
    }
}
