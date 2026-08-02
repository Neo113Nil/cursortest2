package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class g0c {
    public static u0c a(Object obj) {
        rha.x(obj, "item is null");
        return new u0c(obj);
    }

    public final void b(w0c w0cVar) {
        rha.x(w0cVar, "observer is null");
        try {
            c(w0cVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            td4.w0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(w0c w0cVar);
}
