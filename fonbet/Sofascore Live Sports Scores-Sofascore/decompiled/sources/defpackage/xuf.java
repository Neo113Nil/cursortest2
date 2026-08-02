package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xuf implements vuf {
    public static final /* synthetic */ xuf[] c;
    public static final /* synthetic */ kp5 d;
    public final String a;
    public final String b;

    static {
        xuf[] xufVarArr = {new xuf("NO_REGION", 0, "None", null), new xuf("AARGAU", 1, "Aargau", "AG"), new xuf("APPENZELL_INNERRHODEN", 2, "Appenzell Innerrhoden", "AI"), new xuf("APPENZELL_AUSSERRHODEN", 3, "Appenzell Ausserrhoden", PlayerKt.CRICKET_ALLROUNDER), new xuf("BERN", 4, "Bern", "BE"), new xuf("BASEL_LANDSCHAFT", 5, "Basel-Landschaft", "BL"), new xuf("BASEL_STADT", 6, "Basel-Stadt", "BS"), new xuf("FRIBOURG", 7, "Fribourg", "FR"), new xuf("GENEVA", 8, "Geneva", "GE"), new xuf("GLARUS", 9, "Glarus", "GL"), new xuf("GRAUBUNDEN", 10, "Graubünden", "GR"), new xuf("JURA", 11, "Jura", "JU"), new xuf("LUCERNE", 12, "Lucerne", "LU"), new xuf("NEUCHATEL", 13, "Neuchâtel", "NE"), new xuf("NIDWALDEN", 14, "Nidwalden", "NW"), new xuf("OBWALDEN", 15, "Obwalden", "OW"), new xuf("ST_GALLEN", 16, "St. Gallen", "SG"), new xuf("SCHAFFHAUSEN", 17, "Schaffhausen", "SH"), new xuf("SOLOTHURN", 18, "Solothurn", "SO"), new xuf("SCHWYZ", 19, "Schwyz", "SZ"), new xuf("THURGAU", 20, "Thurgau", "TG"), new xuf("TESSIN", 21, "Tessin", "TI"), new xuf("URI", 22, "Uri", "UR"), new xuf("VAUD", 23, "Vaud", "VD"), new xuf("VALAIS", 24, "Valais", "VS"), new xuf("ZUG", 25, "Zug", "ZG"), new xuf("ZURICH", 26, "Zurich", "ZH")};
        c = xufVarArr;
        d = new kp5(xufVarArr);
    }

    public xuf(String str, int i, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }

    public static xuf valueOf(String str) {
        return (xuf) Enum.valueOf(xuf.class, str);
    }

    public static xuf[] values() {
        return (xuf[]) c.clone();
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
