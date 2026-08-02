package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.Np, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class EnumC1925Np {
    public static byte[] A01;
    public static final /* synthetic */ EnumC1925Np[] A02;
    public static final EnumC1925Np A03;
    public static final EnumC1925Np A04;
    public static final EnumC1925Np A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-91, -88, -85, -92, -66, -81, -79, -92, -94, -96, -94, -89, -92, 5, 7, 4, 13, 14, 20, 5, 7, -6, -8, -10, -8, -3, -6, 15, -3, -6, 14, 1, -3, 15, 23, 8, 10, -3, -5, -7, -5, 0, -3};
    }

    static {
        A02();
        String A012 = A01(27, 16, 101);
        A05 = new EnumC1925Np(A012, 0, A012);
        String A013 = A01(13, 14, 98);
        A04 = new EnumC1925Np(A013, 1, A013);
        String A014 = A01(0, 13, 12);
        A03 = new EnumC1925Np(A014, 2, A014);
        A02 = A03();
    }

    public EnumC1925Np(String str, int i, String str2) {
        this.A00 = str2;
    }

    public static EnumC1925Np A00(String str) {
        for (EnumC1925Np enumC1925Np : values()) {
            if (enumC1925Np.A00.equalsIgnoreCase(str)) {
                return enumC1925Np;
            }
        }
        return A03;
    }

    public static /* synthetic */ EnumC1925Np[] A03() {
        return new EnumC1925Np[]{A05, A04, A03};
    }

    public static EnumC1925Np valueOf(String str) {
        return (EnumC1925Np) Enum.valueOf(EnumC1925Np.class, str);
    }

    public static EnumC1925Np[] values() {
        return (EnumC1925Np[]) A02.clone();
    }
}
