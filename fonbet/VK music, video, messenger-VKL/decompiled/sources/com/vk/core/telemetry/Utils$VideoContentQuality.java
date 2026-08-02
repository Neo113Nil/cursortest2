package com.vk.core.telemetry;

import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.air;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Utils.kt */
/* loaded from: classes17.dex */
public final class Utils$VideoContentQuality {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Utils$VideoContentQuality[] $VALUES;
    public static final a Companion;
    public static final Utils$VideoContentQuality FULL;
    public static final Utils$VideoContentQuality HD;
    public static final Utils$VideoContentQuality LOW;
    public static final Utils$VideoContentQuality LOWEST;
    public static final Utils$VideoContentQuality MOBILE;
    public static final Utils$VideoContentQuality QUAD;
    public static final Utils$VideoContentQuality SD;
    public static final Utils$VideoContentQuality ULTRA;

    /* compiled from: Utils.kt */
    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public static String a(String str) {
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case 48:
                    if (str.equals("0")) {
                        return "LOWEST";
                    }
                    break;
                case 49:
                    if (str.equals("1")) {
                        return "LOW";
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return "SD";
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return "HD";
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        return "MOBILE";
                    }
                    break;
                case 53:
                    if (str.equals(CampaignEx.CLICKMODE_ON)) {
                        return "FULL";
                    }
                    break;
                case 54:
                    if (str.equals("6")) {
                        return "QUAD";
                    }
                    break;
                case 55:
                    if (str.equals(Gc.e)) {
                        return "ULTRA";
                    }
                    break;
            }
            return air.b(')', "UNKNOWN(", str);
        }
    }

    static {
        Utils$VideoContentQuality utils$VideoContentQuality = new Utils$VideoContentQuality("LOWEST", 0);
        LOWEST = utils$VideoContentQuality;
        Utils$VideoContentQuality utils$VideoContentQuality2 = new Utils$VideoContentQuality("LOW", 1);
        LOW = utils$VideoContentQuality2;
        Utils$VideoContentQuality utils$VideoContentQuality3 = new Utils$VideoContentQuality("SD", 2);
        SD = utils$VideoContentQuality3;
        Utils$VideoContentQuality utils$VideoContentQuality4 = new Utils$VideoContentQuality("HD", 3);
        HD = utils$VideoContentQuality4;
        Utils$VideoContentQuality utils$VideoContentQuality5 = new Utils$VideoContentQuality("MOBILE", 4);
        MOBILE = utils$VideoContentQuality5;
        Utils$VideoContentQuality utils$VideoContentQuality6 = new Utils$VideoContentQuality("FULL", 5);
        FULL = utils$VideoContentQuality6;
        Utils$VideoContentQuality utils$VideoContentQuality7 = new Utils$VideoContentQuality("QUAD", 6);
        QUAD = utils$VideoContentQuality7;
        Utils$VideoContentQuality utils$VideoContentQuality8 = new Utils$VideoContentQuality("ULTRA", 7);
        ULTRA = utils$VideoContentQuality8;
        Utils$VideoContentQuality[] utils$VideoContentQualityArr = {utils$VideoContentQuality, utils$VideoContentQuality2, utils$VideoContentQuality3, utils$VideoContentQuality4, utils$VideoContentQuality5, utils$VideoContentQuality6, utils$VideoContentQuality7, utils$VideoContentQuality8};
        $VALUES = utils$VideoContentQualityArr;
        $ENTRIES = new asp(utils$VideoContentQualityArr);
        Companion = new a();
    }

    public Utils$VideoContentQuality() {
        throw null;
    }

    public static Utils$VideoContentQuality valueOf(String str) {
        return (Utils$VideoContentQuality) Enum.valueOf(Utils$VideoContentQuality.class, str);
    }

    public static Utils$VideoContentQuality[] values() {
        return (Utils$VideoContentQuality[]) $VALUES.clone();
    }
}
