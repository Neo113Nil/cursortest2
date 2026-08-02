package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x0l extends s90 {
    @Override // defpackage.t90
    public final boolean b() {
        if (!super.b() || !y0l.b("MULTI_PROCESS")) {
            return false;
        }
        int i = v0l.a;
        if (y0l.e.b()) {
            return a1l.a.getStatics().isMultiProcessEnabled();
        }
        throw y0l.a();
    }
}
