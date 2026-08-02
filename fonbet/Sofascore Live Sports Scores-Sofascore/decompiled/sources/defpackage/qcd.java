package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qcd extends Exception {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcd(int i, String str, Throwable th) {
        super(str, th);
        if (i == 0) {
            throw null;
        }
        str.getClass();
        this.a = i;
    }
}
