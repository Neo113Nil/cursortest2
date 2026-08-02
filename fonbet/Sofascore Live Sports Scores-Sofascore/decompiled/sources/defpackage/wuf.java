package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wuf implements vuf {
    public static final /* synthetic */ wuf[] c;
    public static final /* synthetic */ kp5 d;
    public final String a;
    public final String b;

    static {
        wuf[] wufVarArr = {new wuf("NO_REGION", 0, "None", null), new wuf("ALBERTA", 1, "Alberta", "AB"), new wuf("BRITISH_COLUMBIA", 2, "British Columbia", "BC"), new wuf("MANITOBA", 3, "Manitoba", PlayerKt.VOLLEYBALL_MIDDLE_BLOCKER), new wuf("NEW_BRUNSWICK", 4, "New Brunswick", "NB"), new wuf("NEWFOUNDLAND_AND_LABRADOR", 5, "Newfoundland and Labrador", "NL"), new wuf("NORTHWEST_TERRITORIES", 6, "Northwest Territories", PlayerKt.AMERICAN_FOOTBALL_NOSE_TACKLE), new wuf("NOVA_SCOTIA", 7, "Nova Scotia", "NS"), new wuf("NUNAVUT", 8, "Nunavut", "NU"), new wuf("ONTARIO", 9, "Ontario", "ON"), new wuf("PRINCE_EDWARD_ISLAND", 10, "Prince Edward Island", "PE"), new wuf("QUEBEC", 11, "Quebec", "QC"), new wuf("SASKATCHEWAN", 12, "Saskatchewan", "SK"), new wuf("YUKON", 13, "Yukon", "YT")};
        c = wufVarArr;
        d = new kp5(wufVarArr);
    }

    public wuf(String str, int i, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }

    public static wuf valueOf(String str) {
        return (wuf) Enum.valueOf(wuf.class, str);
    }

    public static wuf[] values() {
        return (wuf[]) c.clone();
    }

    @Override // defpackage.vuf
    public final String d() {
        return this.a;
    }

    @Override // defpackage.vuf
    public final String getCode() {
        return this.b;
    }
}
