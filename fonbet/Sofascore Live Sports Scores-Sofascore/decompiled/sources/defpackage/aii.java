package defpackage;

/* loaded from: classes7.dex */
public abstract class aii {
    public static final /* synthetic */ int a = 0;

    static {
        try {
            try {
            } catch (Exception unused) {
                String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
        }
    }

    public static String a(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
