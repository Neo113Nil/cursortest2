package defpackage;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class is1 implements xse {
    public static final f7a d;
    public static final is1 e;
    public static final is1 f;
    public static final /* synthetic */ is1[] g;
    public static final /* synthetic */ kp5 h;
    public final String a;
    public final Function1 b;
    public final int c;

    static {
        is1 is1Var = new is1(NativeAdContent.ViewTag.RATING, 0, "Rating", new qr1(2), R.string.sofascore_rating_short);
        e = is1Var;
        is1 is1Var2 = new is1("POINTS", 1, "Points", new qr1(3), R.string.points_basketball);
        f = is1Var2;
        is1[] is1VarArr = {is1Var, is1Var2, new is1("REBOUNDS", 2, "Rebounds", new qr1(4), R.string.rebounds), new is1("ASSISTS", 3, "Assists", new qr1(5), R.string.basketball_assists), new is1("BLOCKS", 4, "Blocks", new qr1(6), R.string.blocks), new is1("STEALS", 5, "Steals", new qr1(7), R.string.steals)};
        g = is1VarArr;
        h = new kp5(is1VarArr);
        d = new f7a(17);
    }

    public is1(String str, int i, String str2, Function1 function1, int i2) {
        this.a = str2;
        this.b = function1;
        this.c = i2;
    }

    public static is1 valueOf(String str) {
        return (is1) Enum.valueOf(is1.class, str);
    }

    public static is1[] values() {
        return (is1[]) g.clone();
    }

    @Override // defpackage.xse
    public final Function1 d() {
        return this.b;
    }

    @Override // defpackage.xse
    public final int g() {
        return this.c;
    }

    @Override // defpackage.xse
    public final String getValue() {
        return this.a;
    }
}
