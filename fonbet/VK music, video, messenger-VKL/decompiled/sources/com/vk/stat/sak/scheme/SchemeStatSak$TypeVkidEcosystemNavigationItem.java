package com.vk.stat.sak.scheme;

import androidx.core.app.NotificationCompat;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;
import java.util.List;
import ru.ok.android.api.methods.users.changePassword.ChangePasswordApiRequestV1;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$TypeVkidEcosystemNavigationItem implements SchemeStatSak$TypeAction.b {

    @pmi0("app_language")
    private final String appLanguage;

    @pmi0(B5.o)
    private final Env env;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final SchemeStatSak$EcosystemNavigationItem item;

    @pmi0("metadata")
    private final String metadata;

    @pmi0("multiacc_id")
    private final String multiaccId;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<SchemeStatSak$EcosystemNavigationOptionItem> options;

    @pmi0("os_country")
    private final String osCountry;

    @pmi0("os_language")
    private final String osLanguage;

    @pmi0("screen")
    private final String screen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStatSak.kt */
    public static final class Env {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Env[] $VALUES;

        @pmi0("development")
        public static final Env DEVELOPMENT;

        @pmi0("production")
        public static final Env PRODUCTION;

        @pmi0("testing")
        public static final Env TESTING;

        static {
            Env env = new Env("DEVELOPMENT", 0);
            DEVELOPMENT = env;
            Env env2 = new Env("PRODUCTION", 1);
            PRODUCTION = env2;
            Env env3 = new Env("TESTING", 2);
            TESTING = env3;
            Env[] envArr = {env, env2, env3};
            $VALUES = envArr;
            $ENTRIES = new asp(envArr);
        }

        private Env(String str, int i) {
        }

        public static Env valueOf(String str) {
            return (Env) Enum.valueOf(Env.class, str);
        }

        public static Env[] values() {
            return (Env[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStatSak.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final Event CLOSE;

        @pmi0("error_api")
        public static final Event ERROR_API;

        @pmi0("error_switcher")
        public static final Event ERROR_SWITCHER;

        @pmi0(ChangePasswordApiRequestV1.PARAM_NAME_LOGOUT_ALL)
        public static final Event LOGOUT;

        @pmi0("multiacc_add_another_account_tap")
        public static final Event MULTIACC_ADD_ANOTHER_ACCOUNT_TAP;

        @pmi0("multiacc_drop_account_tap")
        public static final Event MULTIACC_DROP_ACCOUNT_TAP;

        @pmi0("open")
        public static final Event OPEN;

        @pmi0("security_recommendation_show")
        public static final Event SECURITY_RECOMMENDATION_SHOW;

        @pmi0("switch_account_tap")
        public static final Event SWITCH_ACCOUNT_TAP;

        @pmi0("tap")
        public static final Event TAP;

        @pmi0("theme_changed")
        public static final Event THEME_CHANGED;

        static {
            Event event = new Event("OPEN", 0);
            OPEN = event;
            Event event2 = new Event("CLOSE", 1);
            CLOSE = event2;
            Event event3 = new Event("TAP", 2);
            TAP = event3;
            Event event4 = new Event("LOGOUT", 3);
            LOGOUT = event4;
            Event event5 = new Event("MULTIACC_ADD_ANOTHER_ACCOUNT_TAP", 4);
            MULTIACC_ADD_ANOTHER_ACCOUNT_TAP = event5;
            Event event6 = new Event("SWITCH_ACCOUNT_TAP", 5);
            SWITCH_ACCOUNT_TAP = event6;
            Event event7 = new Event("MULTIACC_DROP_ACCOUNT_TAP", 6);
            MULTIACC_DROP_ACCOUNT_TAP = event7;
            Event event8 = new Event("SECURITY_RECOMMENDATION_SHOW", 7);
            SECURITY_RECOMMENDATION_SHOW = event8;
            Event event9 = new Event("ERROR_API", 8);
            ERROR_API = event9;
            Event event10 = new Event("ERROR_SWITCHER", 9);
            ERROR_SWITCHER = event10;
            Event event11 = new Event("THEME_CHANGED", 10);
            THEME_CHANGED = event11;
            Event[] eventArr = {event, event2, event3, event4, event5, event6, event7, event8, event9, event10, event11};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public SchemeStatSak$TypeVkidEcosystemNavigationItem(Event event, String str, List<SchemeStatSak$EcosystemNavigationOptionItem> list, String str2, SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem, String str3, String str4, String str5, String str6, Env env) {
        this.event = event;
        this.screen = str;
        this.options = list;
        this.metadata = str2;
        this.item = schemeStatSak$EcosystemNavigationItem;
        this.multiaccId = str3;
        this.appLanguage = str4;
        this.osLanguage = str5;
        this.osCountry = str6;
        this.env = env;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStatSak$TypeVkidEcosystemNavigationItem)) {
            return false;
        }
        SchemeStatSak$TypeVkidEcosystemNavigationItem schemeStatSak$TypeVkidEcosystemNavigationItem = (SchemeStatSak$TypeVkidEcosystemNavigationItem) obj;
        return this.event == schemeStatSak$TypeVkidEcosystemNavigationItem.event && epx.f(this.screen, schemeStatSak$TypeVkidEcosystemNavigationItem.screen) && epx.f(this.options, schemeStatSak$TypeVkidEcosystemNavigationItem.options) && epx.f(this.metadata, schemeStatSak$TypeVkidEcosystemNavigationItem.metadata) && this.item == schemeStatSak$TypeVkidEcosystemNavigationItem.item && epx.f(this.multiaccId, schemeStatSak$TypeVkidEcosystemNavigationItem.multiaccId) && epx.f(this.appLanguage, schemeStatSak$TypeVkidEcosystemNavigationItem.appLanguage) && epx.f(this.osLanguage, schemeStatSak$TypeVkidEcosystemNavigationItem.osLanguage) && epx.f(this.osCountry, schemeStatSak$TypeVkidEcosystemNavigationItem.osCountry) && this.env == schemeStatSak$TypeVkidEcosystemNavigationItem.env;
    }

    public final int hashCode() {
        int a = urd0.a(fw3.a(urd0.a(this.event.hashCode() * 31, 31, this.screen), 31, this.options), 31, this.metadata);
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem = this.item;
        int hashCode = (a + (schemeStatSak$EcosystemNavigationItem == null ? 0 : schemeStatSak$EcosystemNavigationItem.hashCode())) * 31;
        String str = this.multiaccId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appLanguage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.osLanguage;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.osCountry;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Env env = this.env;
        return hashCode5 + (env != null ? env.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVkidEcosystemNavigationItem(event=" + this.event + ", screen=" + this.screen + ", options=" + this.options + ", metadata=" + this.metadata + ", item=" + this.item + ", multiaccId=" + this.multiaccId + ", appLanguage=" + this.appLanguage + ", osLanguage=" + this.osLanguage + ", osCountry=" + this.osCountry + ", env=" + this.env + ')';
    }

    public /* synthetic */ SchemeStatSak$TypeVkidEcosystemNavigationItem(Event event, String str, List list, String str2, SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem, String str3, String str4, String str5, String str6, Env env, int i, zcl zclVar) {
        this(event, str, list, str2, (i & 16) != 0 ? null : schemeStatSak$EcosystemNavigationItem, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : env);
    }
}
