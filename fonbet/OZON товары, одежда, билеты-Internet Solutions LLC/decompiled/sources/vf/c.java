package vf;

/* loaded from: classes6.dex */
public final class c implements AutoCloseable {
    public static void c(String str) {
        if (str.length() > 127) {
            str.substring(0, 124);
        }
    }
}
