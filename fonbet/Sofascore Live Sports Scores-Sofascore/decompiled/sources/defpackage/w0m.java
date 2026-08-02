package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface w0m {
    static /* synthetic */ void detachPlayer$default(w0m w0mVar, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: detachPlayer");
            return;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        ((qdm) w0mVar).b(z);
    }
}
