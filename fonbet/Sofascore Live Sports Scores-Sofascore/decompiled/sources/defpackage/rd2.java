package defpackage;

import com.sofascore.model.mvvm.model.Season;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rd2 {
    public static final rd2 a;
    public static final rd2 b;
    public static final /* synthetic */ rd2[] c;

    static {
        rd2 rd2Var = new rd2(Season.YEAR_ALL_TIME, 0);
        a = rd2Var;
        rd2 rd2Var2 = new rd2("aural", 1);
        rd2 rd2Var3 = new rd2("braille", 2);
        rd2 rd2Var4 = new rd2("embossed", 3);
        rd2 rd2Var5 = new rd2("handheld", 4);
        rd2 rd2Var6 = new rd2("print", 5);
        rd2 rd2Var7 = new rd2("projection", 6);
        rd2 rd2Var8 = new rd2("screen", 7);
        b = rd2Var8;
        c = new rd2[]{rd2Var, rd2Var2, rd2Var3, rd2Var4, rd2Var5, rd2Var6, rd2Var7, rd2Var8, new rd2("speech", 8), new rd2("tty", 9), new rd2("tv", 10)};
    }

    public static rd2 valueOf(String str) {
        return (rd2) Enum.valueOf(rd2.class, str);
    }

    public static rd2[] values() {
        return (rd2[]) c.clone();
    }
}
