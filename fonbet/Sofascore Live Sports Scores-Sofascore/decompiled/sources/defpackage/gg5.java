package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class gg5 {
    public static final String a;

    static {
        a = (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("i/705e36b11b4831faf07264be0bdbf3ee");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static Drawable a(Context context, int i, String str) {
        int i2;
        context.getClass();
        if (i == 1570) {
            int hashCode = str.hashCode();
            if (hashCode != 3323) {
                if (hashCode != 3339) {
                    if (hashCode != 3680) {
                        if (hashCode != 108104) {
                            if (hashCode != 109935 || !str.equals(PlayerKt.E_SPORTS_OFFLANER)) {
                                return null;
                            }
                            i2 = R.drawable.ic_dota_role_offlaner;
                        } else {
                            if (!str.equals(PlayerKt.E_SPORTS_MID)) {
                                return null;
                            }
                            i2 = R.drawable.ic_dota_role_mid;
                        }
                    } else {
                        if (!str.equals(PlayerKt.E_SPORTS_SOFT_SUPPORT)) {
                            return null;
                        }
                        i2 = R.drawable.ic_dota_role_soft_support;
                    }
                } else {
                    if (!str.equals(PlayerKt.E_SPORTS_HARD_SUPPORT)) {
                        return null;
                    }
                    i2 = R.drawable.ic_dota_role_hard_support;
                }
            } else {
                if (!str.equals(PlayerKt.E_SPORTS_HARD_CARRY)) {
                    return null;
                }
                i2 = R.drawable.ic_dota_role_hard_carry;
            }
        } else {
            if (i != 1571) {
                return null;
            }
            switch (str.hashCode()) {
                case 96416:
                    if (!str.equals(PlayerKt.E_SPORTS_ADC)) {
                        return null;
                    }
                    i2 = R.drawable.ic_lol_role_botlane;
                    break;
                case 105603:
                    if (!str.equals(PlayerKt.E_SPORTS_JUN)) {
                        return null;
                    }
                    i2 = R.drawable.ic_lol_role_jungle;
                    break;
                case 108104:
                    if (!str.equals(PlayerKt.E_SPORTS_MID)) {
                        return null;
                    }
                    i2 = R.drawable.ic_lol_role_midlane;
                    break;
                case 114254:
                    if (!str.equals(PlayerKt.E_SPORTS_SUP)) {
                        return null;
                    }
                    i2 = R.drawable.ic_lol_role_support;
                    break;
                case 115029:
                    if (!str.equals(PlayerKt.E_SPORTS_TOP)) {
                        return null;
                    }
                    i2 = R.drawable.ic_lol_role_toplane;
                    break;
                default:
                    return null;
            }
        }
        return context.getDrawable(i2);
    }
}
