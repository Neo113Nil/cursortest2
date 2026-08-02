package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l8f {
    public static final mi6 a;
    public static final ArrayList b;
    public static final ArrayList c;

    static {
        Double valueOf = Double.valueOf(0.2d);
        List j = b.j(valueOf, valueOf, valueOf);
        j.getClass();
        int i = 0;
        ArrayList l = b.l(new zi6(oi6.a, ((Number) j.get(0)).doubleValue()));
        List subList = j.subList(1, j.size());
        ArrayList arrayList = new ArrayList(k13.r(subList, 10));
        for (Object obj : subList) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            arrayList.add(new zi6(new qi6(i2), ((Number) obj).doubleValue()));
            i = i2;
        }
        l.addAll(arrayList);
        a = new mi6(a.c(new ni6(ph0.X(new l28[]{l28.a}))), l);
        b = new ArrayList();
        c = b.l("android_test_aa_1", "android_test_aa_2", "android_onboarding", "android_dark_theme", "android_remove_score_event_search", "android_goal_animation_match_list", "android_remove_score_event_search_repeat", "android_goal_animation_match_list_repeat", "android_simplified_matches_screen", "android_new_live_button_icon", "android_onboarding_splash_screen", "android_favorites_default_tab", "android_matches_screen_versions", "android_mute_wc_popup", "android_onboarding_favourite_pick", "android_onboarding_sign_up", "android_propose_follow", "android_onboarding_favourite_pick_repeat", "android_homescreen_navigation_live_search", "android_favorites_directly_search", "android_new_main_screen", "android_analyst_longer_trial_other_countries", "android_analyst_longer_trial_br_de_us", "android_sticky_top_banner", "android_sport_selector_more");
    }
}
