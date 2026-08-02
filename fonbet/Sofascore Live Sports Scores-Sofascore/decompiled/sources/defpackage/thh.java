package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class thh {
    public final void a(zhh zhhVar) {
        try {
            b(zhhVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            td4.w0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(zhh zhhVar);
}
