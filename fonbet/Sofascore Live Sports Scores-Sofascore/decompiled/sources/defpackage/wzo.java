package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wzo extends c0p {
    public volatile long e;
    public final long f;

    public wzo(String str, ggf ggfVar, long j) {
        super(str, ggfVar);
        this.f = j;
    }

    @Override // defpackage.c0p
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.f);
    }

    @Override // defpackage.c0p
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.c0p
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.c0p
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.e);
    }

    @Override // defpackage.c0p
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Long) obj).longValue();
    }
}
