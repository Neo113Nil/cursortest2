package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tik {
    public static final Pattern a = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static tik b;

    public tik(kif kifVar) {
    }

    public final boolean a(uu0 uu0Var) {
        return TextUtils.isEmpty(uu0Var.c) || uu0Var.f + uu0Var.e < (System.currentTimeMillis() / 1000) + 3600;
    }
}
