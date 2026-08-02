package zendesk.core;

import java.util.Map;

/* loaded from: classes5.dex */
class BlipsRequest {

    @Gb.c("appId")
    private String appId;
    private String channel;

    @Gb.c("pageView")
    private ApiPageView pageView;

    @Gb.c("schemaVersion")
    private String schemaVersion = "1";
    private String timestamp;
    private String url;

    @Gb.c("userAction")
    private ApiUserAction userAction;

    @Gb.c("userId")
    private Long userId;
    private String uuid;
    private String version;

    public static class ApiPageView {

        @Gb.c("navigatorLanguage")
        private String navigatorLanguage;

        @Gb.c("pageId")
        private Long pageId;

        @Gb.c("pageLocale")
        private String pageLocale;

        @Gb.c("pageTitle")
        private String pageTitle;
        private Map<String, Object> value;

        public ApiPageView(String str, String str2, Long l10, String str3, Map<String, Object> map) {
            this.navigatorLanguage = str;
            this.pageTitle = str2;
            this.value = map;
            this.pageId = l10;
            this.pageLocale = str3;
        }

        public String getNavigatorLanguage() {
            return this.navigatorLanguage;
        }

        public Long getPageId() {
            return this.pageId;
        }

        public String getPageLocale() {
            return this.pageLocale;
        }

        public String getPageTitle() {
            return this.pageTitle;
        }

        public Map<String, Object> getValue() {
            return this.value;
        }
    }

    public static class ApiUserAction {
        private String action;
        private String category;
        private String label;
        private Map<String, Object> value;

        public ApiUserAction(String str, String str2, String str3, Map<String, Object> map) {
            this.category = str;
            this.action = str2;
            this.label = str3;
            this.value = map;
        }

        public String getAction() {
            return this.action;
        }

        public String getCategory() {
            return this.category;
        }

        public String getLabel() {
            return this.label;
        }

        public Map<String, Object> getValue() {
            return this.value;
        }
    }

    private BlipsRequest() {
    }

    public static BlipsRequest buildPageView(String str, String str2, Long l10, String str3, String str4, String str5, String str6, String str7, String str8, Long l11, String str9, Map<String, Object> map) {
        BlipsRequest blipsRequest = new BlipsRequest();
        blipsRequest.uuid = str;
        blipsRequest.timestamp = str2;
        blipsRequest.userId = l10;
        blipsRequest.appId = str3;
        blipsRequest.version = str4;
        blipsRequest.channel = str5;
        blipsRequest.url = str6;
        blipsRequest.pageView = new ApiPageView(str7, str8, l11, str9, map);
        return blipsRequest;
    }

    public static BlipsRequest buildUserAction(String str, String str2, Long l10, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map) {
        BlipsRequest blipsRequest = new BlipsRequest();
        blipsRequest.uuid = str;
        blipsRequest.timestamp = str2;
        blipsRequest.userId = l10;
        blipsRequest.appId = str3;
        blipsRequest.version = str4;
        blipsRequest.channel = str5;
        blipsRequest.userAction = new ApiUserAction(str6, str7, str8, map);
        return blipsRequest;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getChannel() {
        return this.channel;
    }

    public ApiPageView getPageView() {
        return this.pageView;
    }

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getUrl() {
        return this.url;
    }

    public ApiUserAction getUserAction() {
        return this.userAction;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getVersion() {
        return this.version;
    }
}
