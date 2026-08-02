package ph;

/* renamed from: ph.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6074e {
    public static Object a(Object obj, String str) {
        try {
            return Class.forName(str).getDeclaredMethod("getNoop", null).invoke(null, null);
        } catch (Exception unused) {
            return obj;
        }
    }
}
