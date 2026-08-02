package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sza {
    public static final sza c;
    public static final sza d;
    public static final sza e;
    public static final sza f;
    public static final sza g;
    public static final sza h;
    public static final /* synthetic */ sza[] i;
    public static final /* synthetic */ kp5 j;
    public final String a;
    public final String b;

    static {
        sza szaVar = new sza("POINTS", 0, "PTS", "points");
        c = szaVar;
        sza szaVar2 = new sza("REBOUNDS", 1, "REB", "rebounds");
        d = szaVar2;
        sza szaVar3 = new sza("ASSISTS", 2, "AST", "assists");
        e = szaVar3;
        sza szaVar4 = new sza("STEALS", 3, "STL", "steals");
        f = szaVar4;
        sza szaVar5 = new sza("BLOCKS", 4, "BLK", "blocks");
        g = szaVar5;
        sza szaVar6 = new sza("RATINGS", 5, "RTG", CampaignEx.JSON_KEY_STAR);
        h = szaVar6;
        sza[] szaVarArr = {szaVar, szaVar2, szaVar3, szaVar4, szaVar5, szaVar6};
        i = szaVarArr;
        j = new kp5(szaVarArr);
    }

    public sza(String str, int i2, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }

    public static sza valueOf(String str) {
        return (sza) Enum.valueOf(sza.class, str);
    }

    public static sza[] values() {
        return (sza[]) i.clone();
    }
}
