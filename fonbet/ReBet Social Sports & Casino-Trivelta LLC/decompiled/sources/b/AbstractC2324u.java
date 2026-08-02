package b;

/* renamed from: b.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2324u {
    public static String a(int i10, int i11) {
        StringBuilder sb2 = i10 != 64 ? i10 != 128 ? i10 != 192 ? new StringBuilder("[UNIVERSAL ") : new StringBuilder("[PRIVATE ") : new StringBuilder("[CONTEXT ") : new StringBuilder("[APPLICATION ");
        sb2.append(i11);
        sb2.append("]");
        return sb2.toString();
    }
}
