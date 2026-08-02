package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public enum yy6 {
    AVAILABLE,
    AVAILABLE_REMOVED(true, true),
    REMOVED(false, true),
    SUBSTITUTING_IN,
    SUBSTITUTING_OUT,
    TRANSFERRING_IN;

    public final boolean a;
    public final boolean b;

    yy6(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* synthetic */ yy6() {
        this(true, false);
    }
}
