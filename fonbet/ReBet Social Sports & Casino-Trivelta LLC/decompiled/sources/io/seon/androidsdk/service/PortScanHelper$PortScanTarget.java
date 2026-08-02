package io.seon.androidsdk.service;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ANYDESK' uses external variables
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
/* loaded from: classes3.dex */
final class PortScanHelper$PortScanTarget {
    private static final /* synthetic */ PortScanHelper$PortScanTarget[] $VALUES;
    public static final PortScanHelper$PortScanTarget ADB_WIRELESS;
    public static final PortScanHelper$PortScanTarget ANDROID_HOTSPOT;
    public static final PortScanHelper$PortScanTarget ANDROID_HOTSPOT2;
    public static final PortScanHelper$PortScanTarget ANYDESK;
    public static final PortScanHelper$PortScanTarget IOS_HOTSPOT;
    public static final PortScanHelper$PortScanTarget RUST_DESK;
    public static final PortScanHelper$PortScanTarget TEAMVIEWER;
    public static final PortScanHelper$PortScanTarget UIAUTOMATOR;
    final String address;
    final Integer[] ports;
    final PortScanHelper$Protocol proto;

    private static /* synthetic */ PortScanHelper$PortScanTarget[] $values() {
        return new PortScanHelper$PortScanTarget[]{ANYDESK, TEAMVIEWER, ADB_WIRELESS, IOS_HOTSPOT, ANDROID_HOTSPOT, ANDROID_HOTSPOT2, UIAUTOMATOR, RUST_DESK};
    }

    static {
        PortScanHelper$Protocol portScanHelper$Protocol = PortScanHelper$Protocol.TCP;
        ANYDESK = new PortScanHelper$PortScanTarget("ANYDESK", 0, "127.0.0.1", new Integer[]{7070}, portScanHelper$Protocol);
        TEAMVIEWER = new PortScanHelper$PortScanTarget("TEAMVIEWER", 1, "127.0.0.1", new Integer[]{5938}, portScanHelper$Protocol);
        ADB_WIRELESS = new PortScanHelper$PortScanTarget("ADB_WIRELESS", 2, "127.0.0.1", new Integer[]{5555}, portScanHelper$Protocol);
        IOS_HOTSPOT = new PortScanHelper$PortScanTarget("IOS_HOTSPOT", 3, "172.20.10.1", new Integer[]{62078}, portScanHelper$Protocol);
        ANDROID_HOTSPOT = new PortScanHelper$PortScanTarget("ANDROID_HOTSPOT", 4, "192.168.42.254", new Integer[]{53}, portScanHelper$Protocol);
        ANDROID_HOTSPOT2 = new PortScanHelper$PortScanTarget("ANDROID_HOTSPOT2", 5, "192.168.42.1", new Integer[]{53}, portScanHelper$Protocol);
        UIAUTOMATOR = new PortScanHelper$PortScanTarget("UIAUTOMATOR", 6, "127.0.0.1", portRange(6790, 6799), portScanHelper$Protocol);
        RUST_DESK = new PortScanHelper$PortScanTarget("RUST_DESK", 7, "", new Integer[]{21119}, PortScanHelper$Protocol.UDP);
        $VALUES = $values();
    }

    private PortScanHelper$PortScanTarget(String str, int i10, String str2, Integer[] numArr, PortScanHelper$Protocol portScanHelper$Protocol) {
        this.address = str2;
        this.ports = numArr;
        this.proto = portScanHelper$Protocol;
    }

    private static Integer[] portRange(int i10, int i11) {
        int i12 = (i11 - i10) + 1;
        if (i12 <= 0) {
            return new Integer[0];
        }
        Integer[] numArr = new Integer[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            numArr[i13] = Integer.valueOf(i10 + i13);
        }
        return numArr;
    }

    public static PortScanHelper$PortScanTarget valueOf(String str) {
        return (PortScanHelper$PortScanTarget) Enum.valueOf(PortScanHelper$PortScanTarget.class, str);
    }

    public static PortScanHelper$PortScanTarget[] values() {
        return (PortScanHelper$PortScanTarget[]) $VALUES.clone();
    }
}
