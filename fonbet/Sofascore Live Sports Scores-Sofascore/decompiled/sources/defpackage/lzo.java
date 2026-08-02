package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lzo extends c0p {
    public volatile boolean e;
    public final boolean f;

    public lzo(String str, ggf ggfVar, boolean z) {
        super(str, ggfVar);
        this.f = z;
    }

    @Override // defpackage.c0p
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.c0p
    public final /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.c0p
    public final /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.c0p
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.c0p
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Boolean) obj).booleanValue();
    }
}
