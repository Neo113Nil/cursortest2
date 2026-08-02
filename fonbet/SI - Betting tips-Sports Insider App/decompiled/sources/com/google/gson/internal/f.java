package com.google.gson.internal;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6318a;

    static {
        int i5;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]", 3);
            i5 = Integer.parseInt(split[0]);
            if (i5 == 1 && split.length > 1) {
                i5 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i5 = -1;
        }
        if (i5 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < property.length(); i10++) {
                    char charAt = property.charAt(i10);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb2.append(charAt);
                }
                i5 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i5 = -1;
            }
        }
        if (i5 == -1) {
            i5 = 6;
        }
        f6318a = i5;
    }
}
