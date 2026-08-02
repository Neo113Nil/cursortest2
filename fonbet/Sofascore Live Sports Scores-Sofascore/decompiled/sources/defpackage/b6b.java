package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b6b {
    public static d6b a(e6b e6bVar) {
        e6bVar.getClass();
        int ordinal = e6bVar.ordinal();
        if (ordinal == 2) {
            return d6b.ON_DESTROY;
        }
        if (ordinal == 3) {
            return d6b.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return d6b.ON_PAUSE;
    }

    public static d6b b(e6b e6bVar) {
        e6bVar.getClass();
        int ordinal = e6bVar.ordinal();
        if (ordinal == 2) {
            return d6b.ON_CREATE;
        }
        if (ordinal == 3) {
            return d6b.ON_START;
        }
        if (ordinal != 4) {
            return null;
        }
        return d6b.ON_RESUME;
    }
}
