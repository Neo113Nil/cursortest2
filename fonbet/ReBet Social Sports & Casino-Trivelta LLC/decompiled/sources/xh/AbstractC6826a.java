package xh;

/* renamed from: xh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6826a {
    public static int a(int i10) {
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("There is no larger power of 2 int for value:" + i10 + " since it exceeds 2^31.");
        }
        if (i10 >= 0) {
            return 1 << (32 - Integer.numberOfLeadingZeros(i10 - 1));
        }
        throw new IllegalArgumentException("Given value:" + i10 + ". Expecting value >= 0.");
    }
}
