package com.vk.superapp.core.js.bridge.api.events;

import com.ironsource.D1;
import com.ironsource.O6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.api.core.ApiUris;
import sg.bigo.ads.api.AdSize;
import xsna.asp;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UpdateConfig.kt */
/* loaded from: classes6.dex */
public final class UpdateConfig$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public UpdateConfig$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new UpdateConfig$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateConfig$Response)) {
            return false;
        }
        UpdateConfig$Response updateConfig$Response = (UpdateConfig$Response) obj;
        return epx.f(this.type, updateConfig$Response.type) && epx.f(this.data, updateConfig$Response.data) && epx.f(this.requestId, updateConfig$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ UpdateConfig$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppUpdateConfig" : str, data, str2);
    }

    /* compiled from: UpdateConfig.kt */
    public static final class Data {

        @pmi0("adaptivity")
        private final Adaptivity adaptivity;

        @pmi0("api_host")
        private final String apiHost;

        /* renamed from: app, reason: collision with root package name */
        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        private final App f100app;

        @pmi0("app_id")
        private final Integer appId;

        @pmi0("appearance")
        private final Appearance appearance;

        @pmi0("auth_app_id")
        private final String authAppId;

        @pmi0("back_button")
        private final BackButton backButton;

        @pmi0("device_id")
        private final String deviceId;

        @pmi0("external_device_id")
        private final String externalDeviceId;

        @pmi0("flow_source")
        private final String flowSource;

        @pmi0("flow_type")
        private final String flowType;

        @pmi0(O6.X0)
        private final String gaid;

        @pmi0("idfa")
        private final String idfa;

        @pmi0("idfv")
        private final String idfv;

        @pmi0("insets")
        private final Insets insets;

        @pmi0(D1.g)
        private final Integration integration;

        @pmi0("is_multi_window_mode")
        private final Boolean isMultiWindowMode;

        @pmi0("is_vpn")
        private final Integer isVpn;

        @pmi0(CommonUrlParts.HUAWEI_OAID)
        private final String oaid;

        @pmi0("parent_app_id")
        private final String parentAppId;

        @pmi0("provider_app_id")
        private final String providerAppId;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("sak_version")
        private final String sakVersion;

        @pmi0("scheme")
        private final Scheme scheme;

        @pmi0("service_group")
        private final String serviceGroup;

        @pmi0("start_time")
        private final Long startTime;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UpdateConfig.kt */
        public static final class Adaptivity {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Adaptivity[] $VALUES;

            @pmi0(AdSize.ADAPTIVE)
            public static final Adaptivity ADAPTIVE;

            @pmi0("auto")
            public static final Adaptivity AUTO;

            @pmi0("force_mobile")
            public static final Adaptivity FORCE_MOBILE;

            static {
                Adaptivity adaptivity = new Adaptivity("AUTO", 0);
                AUTO = adaptivity;
                Adaptivity adaptivity2 = new Adaptivity("ADAPTIVE", 1);
                ADAPTIVE = adaptivity2;
                Adaptivity adaptivity3 = new Adaptivity("FORCE_MOBILE", 2);
                FORCE_MOBILE = adaptivity3;
                Adaptivity[] adaptivityArr = {adaptivity, adaptivity2, adaptivity3};
                $VALUES = adaptivityArr;
                $ENTRIES = new asp(adaptivityArr);
            }

            private Adaptivity(String str, int i) {
            }

            public static zrp<Adaptivity> h() {
                return $ENTRIES;
            }

            public static Adaptivity valueOf(String str) {
                return (Adaptivity) Enum.valueOf(Adaptivity.class, str);
            }

            public static Adaptivity[] values() {
                return (Adaptivity[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UpdateConfig.kt */
        public static final class App {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ App[] $VALUES;

            @pmi0("mini_app_native_client")
            public static final App MINI_APP_NATIVE_CLIENT;

            @pmi0("mini_app_native_client_mail")
            public static final App MINI_APP_NATIVE_CLIENT_MAIL;

            @pmi0("mini_app_native_client_ok")
            public static final App MINI_APP_NATIVE_CLIENT_OK;

            @pmi0("mini_app_native_client_spinoff")
            public static final App MINI_APP_NATIVE_CLIENT_SPINOFF;

            @pmi0(ApiUris.SCHEME_OK)
            public static final App OK;

            @pmi0("universal_web")
            public static final App UNIVERSAL_WEB;

            @pmi0("vkcalls")
            public static final App VKCALLS;

            @pmi0("vkclient")
            public static final App VKCLIENT;

            @pmi0("vkme")
            public static final App VKME;

            @pmi0("vkmusic")
            public static final App VKMUSIC;

            @pmi0("vkvideo")
            public static final App VKVIDEO;

            static {
                App app2 = new App("VKCLIENT", 0);
                VKCLIENT = app2;
                App app3 = new App("VKME", 1);
                VKME = app3;
                App app4 = new App("VKCALLS", 2);
                VKCALLS = app4;
                App app5 = new App("UNIVERSAL_WEB", 3);
                UNIVERSAL_WEB = app5;
                App app6 = new App("OK", 4);
                OK = app6;
                App app7 = new App("MINI_APP_NATIVE_CLIENT", 5);
                MINI_APP_NATIVE_CLIENT = app7;
                App app8 = new App("MINI_APP_NATIVE_CLIENT_OK", 6);
                MINI_APP_NATIVE_CLIENT_OK = app8;
                App app9 = new App("MINI_APP_NATIVE_CLIENT_MAIL", 7);
                MINI_APP_NATIVE_CLIENT_MAIL = app9;
                App app10 = new App("MINI_APP_NATIVE_CLIENT_SPINOFF", 8);
                MINI_APP_NATIVE_CLIENT_SPINOFF = app10;
                App app11 = new App("VKVIDEO", 9);
                VKVIDEO = app11;
                App app12 = new App("VKMUSIC", 10);
                VKMUSIC = app12;
                App[] appArr = {app2, app3, app4, app5, app6, app7, app8, app9, app10, app11, app12};
                $VALUES = appArr;
                $ENTRIES = new asp(appArr);
            }

            private App(String str, int i) {
            }

            public static zrp<App> h() {
                return $ENTRIES;
            }

            public static App valueOf(String str) {
                return (App) Enum.valueOf(App.class, str);
            }

            public static App[] values() {
                return (App[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UpdateConfig.kt */
        public static final class Appearance {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Appearance[] $VALUES;

            @pmi0("dark")
            public static final Appearance DARK;

            @pmi0("light")
            public static final Appearance LIGHT;

            static {
                Appearance appearance = new Appearance("LIGHT", 0);
                LIGHT = appearance;
                Appearance appearance2 = new Appearance("DARK", 1);
                DARK = appearance2;
                Appearance[] appearanceArr = {appearance, appearance2};
                $VALUES = appearanceArr;
                $ENTRIES = new asp(appearanceArr);
            }

            private Appearance(String str, int i) {
            }

            public static zrp<Appearance> h() {
                return $ENTRIES;
            }

            public static Appearance valueOf(String str) {
                return (Appearance) Enum.valueOf(Appearance.class, str);
            }

            public static Appearance[] values() {
                return (Appearance[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UpdateConfig.kt */
        public static final class BackButton {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ BackButton[] $VALUES;

            @pmi0("back")
            public static final BackButton BACK;

            @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
            public static final BackButton CLOSE;

            @pmi0("none")
            public static final BackButton NONE;

            static {
                BackButton backButton = new BackButton("BACK", 0);
                BACK = backButton;
                BackButton backButton2 = new BackButton("CLOSE", 1);
                CLOSE = backButton2;
                BackButton backButton3 = new BackButton("NONE", 2);
                NONE = backButton3;
                BackButton[] backButtonArr = {backButton, backButton2, backButton3};
                $VALUES = backButtonArr;
                $ENTRIES = new asp(backButtonArr);
            }

            private BackButton(String str, int i) {
            }

            public static zrp<BackButton> h() {
                return $ENTRIES;
            }

            public static BackButton valueOf(String str) {
                return (BackButton) Enum.valueOf(BackButton.class, str);
            }

            public static BackButton[] values() {
                return (BackButton[]) $VALUES.clone();
            }
        }

        /* compiled from: UpdateConfig.kt */
        public static final class Insets {

            @pmi0("bottom")
            private final Float bottom;

            @pmi0(TtmlNode.LEFT)
            private final Float left;

            @pmi0(TtmlNode.RIGHT)
            private final Float right;

            @pmi0("top")
            private final Float top;

            public Insets() {
                this(null, null, null, null, 15, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Insets)) {
                    return false;
                }
                Insets insets = (Insets) obj;
                return epx.f(this.top, insets.top) && epx.f(this.left, insets.left) && epx.f(this.right, insets.right) && epx.f(this.bottom, insets.bottom);
            }

            public final int hashCode() {
                Float f = this.top;
                int hashCode = (f == null ? 0 : f.hashCode()) * 31;
                Float f2 = this.left;
                int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
                Float f3 = this.right;
                int hashCode3 = (hashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
                Float f4 = this.bottom;
                return hashCode3 + (f4 != null ? f4.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Insets(top=");
                sb.append(this.top);
                sb.append(", left=");
                sb.append(this.left);
                sb.append(", right=");
                sb.append(this.right);
                sb.append(", bottom=");
                return so.b(sb, this.bottom, ')');
            }

            public Insets(Float f, Float f2, Float f3, Float f4) {
                this.top = f;
                this.left = f2;
                this.right = f3;
                this.bottom = f4;
            }

            public /* synthetic */ Insets(Float f, Float f2, Float f3, Float f4, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : f4);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UpdateConfig.kt */
        public static final class Integration {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Integration[] $VALUES;

            @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
            public static final Integration CONTENT;

            @pmi0("fullscreen")
            public static final Integration FULLSCREEN;

            @pmi0("popup")
            public static final Integration POPUP;

            @pmi0("popup_fullscreen")
            public static final Integration POPUP_FULLSCREEN;

            static {
                Integration integration = new Integration("FULLSCREEN", 0);
                FULLSCREEN = integration;
                Integration integration2 = new Integration("CONTENT", 1);
                CONTENT = integration2;
                Integration integration3 = new Integration("POPUP", 2);
                POPUP = integration3;
                Integration integration4 = new Integration("POPUP_FULLSCREEN", 3);
                POPUP_FULLSCREEN = integration4;
                Integration[] integrationArr = {integration, integration2, integration3, integration4};
                $VALUES = integrationArr;
                $ENTRIES = new asp(integrationArr);
            }

            private Integration(String str, int i) {
            }

            public static zrp<Integration> h() {
                return $ENTRIES;
            }

            public static Integration valueOf(String str) {
                return (Integration) Enum.valueOf(Integration.class, str);
            }

            public static Integration[] values() {
                return (Integration[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UpdateConfig.kt */
        public static final class Scheme {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Scheme[] $VALUES;

            @pmi0("bright_light")
            public static final Scheme BRIGHT_LIGHT;

            @pmi0("space_gray")
            public static final Scheme SPACE_GRAY;

            @pmi0("vkcom_dark")
            public static final Scheme VKCOM_DARK;

            @pmi0("vkcom_light")
            public static final Scheme VKCOM_LIGHT;

            static {
                Scheme scheme = new Scheme("SPACE_GRAY", 0);
                SPACE_GRAY = scheme;
                Scheme scheme2 = new Scheme("BRIGHT_LIGHT", 1);
                BRIGHT_LIGHT = scheme2;
                Scheme scheme3 = new Scheme("VKCOM_LIGHT", 2);
                VKCOM_LIGHT = scheme3;
                Scheme scheme4 = new Scheme("VKCOM_DARK", 3);
                VKCOM_DARK = scheme4;
                Scheme[] schemeArr = {scheme, scheme2, scheme3, scheme4};
                $VALUES = schemeArr;
                $ENTRIES = new asp(schemeArr);
            }

            private Scheme(String str, int i) {
            }

            public static zrp<Scheme> h() {
                return $ENTRIES;
            }

            public static Scheme valueOf(String str) {
                return (Scheme) Enum.valueOf(Scheme.class, str);
            }

            public static Scheme[] values() {
                return (Scheme[]) $VALUES.clone();
            }
        }

        public Data(App app2, Integer num, Appearance appearance, Insets insets, Scheme scheme, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Adaptivity adaptivity, BackButton backButton, Integration integration, Boolean bool, Integer num2, String str15) {
            this.f100app = app2;
            this.appId = num;
            this.appearance = appearance;
            this.insets = insets;
            this.scheme = scheme;
            this.startTime = l;
            this.apiHost = str;
            this.deviceId = str2;
            this.serviceGroup = str3;
            this.flowSource = str4;
            this.sakVersion = str5;
            this.externalDeviceId = str6;
            this.flowType = str7;
            this.parentAppId = str8;
            this.authAppId = str9;
            this.providerAppId = str10;
            this.gaid = str11;
            this.oaid = str12;
            this.idfa = str13;
            this.idfv = str14;
            this.adaptivity = adaptivity;
            this.backButton = backButton;
            this.integration = integration;
            this.isMultiWindowMode = bool;
            this.isVpn = num2;
            this.requestId = str15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.f100app == data.f100app && epx.f(this.appId, data.appId) && this.appearance == data.appearance && epx.f(this.insets, data.insets) && this.scheme == data.scheme && epx.f(this.startTime, data.startTime) && epx.f(this.apiHost, data.apiHost) && epx.f(this.deviceId, data.deviceId) && epx.f(this.serviceGroup, data.serviceGroup) && epx.f(this.flowSource, data.flowSource) && epx.f(this.sakVersion, data.sakVersion) && epx.f(this.externalDeviceId, data.externalDeviceId) && epx.f(this.flowType, data.flowType) && epx.f(this.parentAppId, data.parentAppId) && epx.f(this.authAppId, data.authAppId) && epx.f(this.providerAppId, data.providerAppId) && epx.f(this.gaid, data.gaid) && epx.f(this.oaid, data.oaid) && epx.f(this.idfa, data.idfa) && epx.f(this.idfv, data.idfv) && this.adaptivity == data.adaptivity && this.backButton == data.backButton && this.integration == data.integration && epx.f(this.isMultiWindowMode, data.isMultiWindowMode) && epx.f(this.isVpn, data.isVpn) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            App app2 = this.f100app;
            int hashCode = (app2 == null ? 0 : app2.hashCode()) * 31;
            Integer num = this.appId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Appearance appearance = this.appearance;
            int hashCode3 = (hashCode2 + (appearance == null ? 0 : appearance.hashCode())) * 31;
            Insets insets = this.insets;
            int hashCode4 = (hashCode3 + (insets == null ? 0 : insets.hashCode())) * 31;
            Scheme scheme = this.scheme;
            int hashCode5 = (hashCode4 + (scheme == null ? 0 : scheme.hashCode())) * 31;
            Long l = this.startTime;
            int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.apiHost;
            int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deviceId;
            int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.serviceGroup;
            int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.flowSource;
            int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.sakVersion;
            int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.externalDeviceId;
            int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.flowType;
            int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.parentAppId;
            int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.authAppId;
            int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.providerAppId;
            int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.gaid;
            int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.oaid;
            int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.idfa;
            int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.idfv;
            int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
            Adaptivity adaptivity = this.adaptivity;
            int hashCode21 = (hashCode20 + (adaptivity == null ? 0 : adaptivity.hashCode())) * 31;
            BackButton backButton = this.backButton;
            int hashCode22 = (hashCode21 + (backButton == null ? 0 : backButton.hashCode())) * 31;
            Integration integration = this.integration;
            int hashCode23 = (hashCode22 + (integration == null ? 0 : integration.hashCode())) * 31;
            Boolean bool = this.isMultiWindowMode;
            int hashCode24 = (hashCode23 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num2 = this.isVpn;
            int hashCode25 = (hashCode24 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str15 = this.requestId;
            return hashCode25 + (str15 != null ? str15.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(app=");
            sb.append(this.f100app);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", appearance=");
            sb.append(this.appearance);
            sb.append(", insets=");
            sb.append(this.insets);
            sb.append(", scheme=");
            sb.append(this.scheme);
            sb.append(", startTime=");
            sb.append(this.startTime);
            sb.append(", apiHost=");
            sb.append(this.apiHost);
            sb.append(", deviceId=");
            sb.append(this.deviceId);
            sb.append(", serviceGroup=");
            sb.append(this.serviceGroup);
            sb.append(", flowSource=");
            sb.append(this.flowSource);
            sb.append(", sakVersion=");
            sb.append(this.sakVersion);
            sb.append(", externalDeviceId=");
            sb.append(this.externalDeviceId);
            sb.append(", flowType=");
            sb.append(this.flowType);
            sb.append(", parentAppId=");
            sb.append(this.parentAppId);
            sb.append(", authAppId=");
            sb.append(this.authAppId);
            sb.append(", providerAppId=");
            sb.append(this.providerAppId);
            sb.append(", gaid=");
            sb.append(this.gaid);
            sb.append(", oaid=");
            sb.append(this.oaid);
            sb.append(", idfa=");
            sb.append(this.idfa);
            sb.append(", idfv=");
            sb.append(this.idfv);
            sb.append(", adaptivity=");
            sb.append(this.adaptivity);
            sb.append(", backButton=");
            sb.append(this.backButton);
            sb.append(", integration=");
            sb.append(this.integration);
            sb.append(", isMultiWindowMode=");
            sb.append(this.isMultiWindowMode);
            sb.append(", isVpn=");
            sb.append(this.isVpn);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(App app2, Integer num, Appearance appearance, Insets insets, Scheme scheme, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Adaptivity adaptivity, BackButton backButton, Integration integration, Boolean bool, Integer num2, String str15, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : app2, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : appearance, (i & 8) != 0 ? null : insets, (i & 16) != 0 ? null : scheme, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : str11, (131072 & i) != 0 ? null : str12, (262144 & i) != 0 ? null : str13, (524288 & i) != 0 ? null : str14, (1048576 & i) != 0 ? null : adaptivity, (2097152 & i) != 0 ? null : backButton, (4194304 & i) != 0 ? null : integration, (8388608 & i) != 0 ? null : bool, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num2, str15);
        }
    }
}
