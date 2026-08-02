package com.vk.superapp.core.js.bridge.api.events;

import com.google.gson.JsonParseException;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bd6;
import xsna.epx;
import xsna.hay;
import xsna.ho8;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GetClientVersion.kt */
/* loaded from: classes6.dex */
public final class GetClientVersion$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetClientVersion$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetClientVersion$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetClientVersion$Response)) {
            return false;
        }
        GetClientVersion$Response getClientVersion$Response = (GetClientVersion$Response) obj;
        return epx.f(this.type, getClientVersion$Response.type) && epx.f(this.data, getClientVersion$Response.data) && epx.f(this.requestId, getClientVersion$Response.requestId);
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

    public /* synthetic */ GetClientVersion$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetClientVersionResult" : str, data, str2);
    }

    /* compiled from: GetClientVersion.kt */
    public static final class Data {

        /* renamed from: app, reason: collision with root package name */
        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        private final String f98app;

        @pmi0("build")
        private final String build;

        @pmi0("client_user_agent")
        private final String clientUserAgent;

        @pmi0("code_version")
        private final String codeVersion;

        @pmi0("install_referrer")
        private final String installReferrer;

        @pmi0("is_google_services_available")
        private final Boolean isGoogleServicesAvailable;

        @pmi0("is_new_navigation")
        private final Boolean isNewNavigation;

        @pmi0("is_voice_assistant_available")
        private final Boolean isVoiceAssistantAvailable;

        @pmi0("platform")
        private final Platform platform;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("version")
        private final String version;

        @pmi0("vk_client_exists")
        private final Boolean vkClientExists;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetClientVersion.kt */
        public static final class Platform {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Platform[] $VALUES;
            public static final Platform ANDROID;
            public static final Platform IOS;
            public static final Platform MOBILE_WEB;
            public static final Platform UNIVERSAL_WEB;
            public static final Platform WEB;
            private final String value;

            /* compiled from: GetClientVersion.kt */
            public static final class Serializer implements uay<Platform>, a9y<Platform> {
                @Override // xsna.a9y
                public final Object a(b9y b9yVar, z8y z8yVar) {
                    Platform platform;
                    Platform[] values = Platform.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            platform = null;
                            break;
                        }
                        platform = values[i];
                        if (epx.f(platform.value.toString(), b9yVar.i().k())) {
                            break;
                        }
                        i++;
                    }
                    if (platform != null) {
                        return platform;
                    }
                    throw new JsonParseException(String.valueOf(b9yVar));
                }

                @Override // xsna.uay
                public final b9y b(Object obj, tay tayVar) {
                    return new hay(((Platform) obj).value);
                }
            }

            static {
                Platform platform = new Platform("IOS", 0, "ios");
                IOS = platform;
                Platform platform2 = new Platform("ANDROID", 1, "android");
                ANDROID = platform2;
                Platform platform3 = new Platform("WEB", 2, "web");
                WEB = platform3;
                Platform platform4 = new Platform("MOBILE_WEB", 3, "mobile-web");
                MOBILE_WEB = platform4;
                Platform platform5 = new Platform("UNIVERSAL_WEB", 4, "universal_web");
                UNIVERSAL_WEB = platform5;
                Platform[] platformArr = {platform, platform2, platform3, platform4, platform5};
                $VALUES = platformArr;
                $ENTRIES = new asp(platformArr);
            }

            public Platform(String str, int i, String str2) {
                this.value = str2;
            }

            public static Platform valueOf(String str) {
                return (Platform) Enum.valueOf(Platform.class, str);
            }

            public static Platform[] values() {
                return (Platform[]) $VALUES.clone();
            }
        }

        public Data(Platform platform, String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, Boolean bool3, String str5, Boolean bool4, String str6, String str7) {
            this.platform = platform;
            this.version = str;
            this.f98app = str2;
            this.isGoogleServicesAvailable = bool;
            this.clientUserAgent = str3;
            this.build = str4;
            this.isNewNavigation = bool2;
            this.isVoiceAssistantAvailable = bool3;
            this.installReferrer = str5;
            this.vkClientExists = bool4;
            this.codeVersion = str6;
            this.requestId = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.platform == data.platform && epx.f(this.version, data.version) && epx.f(this.f98app, data.f98app) && epx.f(this.isGoogleServicesAvailable, data.isGoogleServicesAvailable) && epx.f(this.clientUserAgent, data.clientUserAgent) && epx.f(this.build, data.build) && epx.f(this.isNewNavigation, data.isNewNavigation) && epx.f(this.isVoiceAssistantAvailable, data.isVoiceAssistantAvailable) && epx.f(this.installReferrer, data.installReferrer) && epx.f(this.vkClientExists, data.vkClientExists) && epx.f(this.codeVersion, data.codeVersion) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = urd0.a(this.platform.hashCode() * 31, 31, this.version);
            String str = this.f98app;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isGoogleServicesAvailable;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.clientUserAgent;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.build;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool2 = this.isNewNavigation;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isVoiceAssistantAvailable;
            int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str4 = this.installReferrer;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool4 = this.vkClientExists;
            int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str5 = this.codeVersion;
            int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.requestId;
            return hashCode9 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(platform=");
            sb.append(this.platform);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", app=");
            sb.append(this.f98app);
            sb.append(", isGoogleServicesAvailable=");
            sb.append(this.isGoogleServicesAvailable);
            sb.append(", clientUserAgent=");
            sb.append(this.clientUserAgent);
            sb.append(", build=");
            sb.append(this.build);
            sb.append(", isNewNavigation=");
            sb.append(this.isNewNavigation);
            sb.append(", isVoiceAssistantAvailable=");
            sb.append(this.isVoiceAssistantAvailable);
            sb.append(", installReferrer=");
            sb.append(this.installReferrer);
            sb.append(", vkClientExists=");
            sb.append(this.vkClientExists);
            sb.append(", codeVersion=");
            sb.append(this.codeVersion);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Data(Platform platform, String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, Boolean bool3, String str5, Boolean bool4, String str6, String str7, int i, zcl zclVar) {
            this(platform, str, str2, bool, str3, str4, bool2, bool3, str5, bool4, r13, r14);
            String str8;
            String str9;
            str2 = (i & 4) != 0 ? null : str2;
            bool = (i & 8) != 0 ? null : bool;
            str3 = (i & 16) != 0 ? null : str3;
            str4 = (i & 32) != 0 ? null : str4;
            bool2 = (i & 64) != 0 ? null : bool2;
            bool3 = (i & 128) != 0 ? null : bool3;
            str5 = (i & 256) != 0 ? null : str5;
            bool4 = (i & 512) != 0 ? null : bool4;
            if ((i & 1024) != 0) {
                str8 = str7;
                str9 = null;
            } else {
                str8 = str7;
                str9 = str6;
            }
        }
    }
}
