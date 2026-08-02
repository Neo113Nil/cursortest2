package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum cv {
    ACCEPT("accept"),
    REJECT("reject"),
    AGE_18_TO_24("18_to_24"),
    AGE_25_OR_OLDER("25_or_older"),
    AGE_UNDER_18("under_18"),
    ALLOW("allow"),
    DENY("deny"),
    APP_RATING_1("1"),
    APP_RATING_2("2"),
    APP_RATING_3("3"),
    APP_RATING_4("4"),
    APP_RATING_5(CampaignEx.CLICKMODE_ON),
    SHOW_AGAIN("show_again"),
    DO_NOT_SHOW_AGAIN("no_show_again");

    public static final hjg b = new hjg();
    public final String a;

    cv(String str) {
        this.a = str;
    }
}
