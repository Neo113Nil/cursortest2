package defpackage;

import android.content.Context;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h3j {
    public static final h3j a;
    public static final /* synthetic */ h3j[] b;
    public static final /* synthetic */ kp5 c;

    static {
        h3j h3jVar = new h3j("AtLeastXPercent", 0);
        a = h3jVar;
        h3j[] h3jVarArr = {h3jVar, new h3j("All", 1)};
        b = h3jVarArr;
        c = new kp5(h3jVarArr);
    }

    public static h3j valueOf(String str) {
        return (h3j) Enum.valueOf(h3j.class, str);
    }

    public static h3j[] values() {
        return (h3j[]) b.clone();
    }

    public final String a(Context context, boolean z) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            String string = context.getString(R.string.at_least_percent_appearances, yid.r(z ? 70 : 50));
            string.getClass();
            return string;
        }
        if (ordinal != 1) {
            zzl.b();
            return null;
        }
        String string2 = context.getString(R.string.all_players);
        string2.getClass();
        return string2;
    }
}
