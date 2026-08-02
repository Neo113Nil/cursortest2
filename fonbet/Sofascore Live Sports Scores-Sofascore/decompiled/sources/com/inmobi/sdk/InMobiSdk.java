package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.appsflyer.internal.i;
import com.appsflyer.sdk_base.referrer.Payload;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.media.AbstractC3286aa;
import com.inmobi.media.AbstractC3292ag;
import com.inmobi.media.AbstractC3386e7;
import com.inmobi.media.AbstractC3424fj;
import com.inmobi.media.AbstractC3448gh;
import com.inmobi.media.AbstractC3551kh;
import com.inmobi.media.AbstractC3632nk;
import com.inmobi.media.C3345ch;
import com.inmobi.media.C3398ej;
import com.inmobi.media.C3422fh;
import com.inmobi.media.C3892xl;
import com.inmobi.media.F5;
import com.inmobi.media.F8;
import com.inmobi.media.I1;
import com.inmobi.media.J9;
import com.inmobi.media.K9;
import com.inmobi.media.L9;
import com.inmobi.media.Pa;
import com.inmobi.media.Q2;
import com.inmobi.media.Qa;
import com.inmobi.media.Sk;
import com.inmobi.media.Xb;
import com.inmobi.media.Yk;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.C4259pg;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.gz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.kx0;
import defpackage.lm5;
import defpackage.tub;
import defpackage.x;
import defpackage.xw3;
import defpackage.yq5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005MNOPQJ9\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b(\u0010&J-\u0010,\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u001aH\u0007¢\u0006\u0004\b/\u0010\u001dJ\u0017\u00102\u001a\u00020\n2\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b9\u0010&J\u0019\u0010;\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b;\u0010&J\u0019\u0010>\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b@\u0010\u0015J1\u0010@\u001a\u0004\u0018\u00010\u00042\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010A2\b\u0010C\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b@\u0010DJ\u0019\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bF\u0010\u000eJ\u000f\u0010G\u001a\u00020\u0010H\u0007¢\u0006\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010L\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bL\u0010J¨\u0006R"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk;", "", "Landroid/content/Context;", "context", "", "accountId", "Lorg/json/JSONObject;", "consentObject", "Lcom/inmobi/sdk/SdkInitializationListener;", "sdkInitializationListener", "", "init", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Lcom/inmobi/sdk/SdkInitializationListener;)V", "updateGDPRConsent", "(Lorg/json/JSONObject;)V", "setPartnerGDPRConsent", "", "muted", "setApplicationMuted", "(Z)V", C4259pg.b, "()Ljava/lang/String;", "Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "logLevel", "setLogLevel", "(Lcom/inmobi/sdk/InMobiSdk$LogLevel;)V", "", "age", "setAge", "(I)V", "isAgeRestricted", "setIsAgeRestricted", "Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "group", "setAgeGroup", "(Lcom/inmobi/sdk/InMobiSdk$AgeGroup;)V", "areaCode", "setAreaCode", "(Ljava/lang/String;)V", "postalCode", "setPostalCode", "city", "state", "country", "setLocationWithCityStateCountry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "yearOfBirth", "setYearOfBirth", "Lcom/inmobi/sdk/InMobiSdk$Gender;", InneractiveMediationDefs.KEY_GENDER, "setGender", "(Lcom/inmobi/sdk/InMobiSdk$Gender;)V", "Lcom/inmobi/sdk/InMobiSdk$Education;", "education", "setEducation", "(Lcom/inmobi/sdk/InMobiSdk$Education;)V", "language", "setLanguage", "interests", "setInterests", "Landroid/location/Location;", "location", "setLocation", "(Landroid/location/Location;)V", "getToken", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "keywords", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "jsonObject", "setPublisherProvidedUnifiedId", "isSDKInitialized", "()Z", "IM_GDPR_CONSENT_AVAILABLE", "Ljava/lang/String;", "IM_GDPR_CONSENT_IAB", "IM_GDPR_CONSENT_GDPR_APPLIES", "LogLevel", "Education", "PublisherSignals", "Gender", "AgeGroup", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InMobiSdk {

    @NotNull
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";

    @NotNull
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";

    @NotNull
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";

    @NotNull
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "BELOW_18", "BETWEEN_18_AND_24", "BETWEEN_25_AND_29", "BETWEEN_30_AND_34", "BETWEEN_35_AND_44", "BETWEEN_45_AND_54", "BETWEEN_55_AND_65", "ABOVE_65", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class AgeGroup {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ AgeGroup[] $VALUES;

        @NotNull
        private final String value;
        public static final AgeGroup BELOW_18 = new AgeGroup("BELOW_18", 0, "below18");
        public static final AgeGroup BETWEEN_18_AND_24 = new AgeGroup("BETWEEN_18_AND_24", 1, "between18and24");
        public static final AgeGroup BETWEEN_25_AND_29 = new AgeGroup("BETWEEN_25_AND_29", 2, "between25and29");
        public static final AgeGroup BETWEEN_30_AND_34 = new AgeGroup("BETWEEN_30_AND_34", 3, "between30and34");
        public static final AgeGroup BETWEEN_35_AND_44 = new AgeGroup("BETWEEN_35_AND_44", 4, "between35and44");
        public static final AgeGroup BETWEEN_45_AND_54 = new AgeGroup("BETWEEN_45_AND_54", 5, "between45and54");
        public static final AgeGroup BETWEEN_55_AND_65 = new AgeGroup("BETWEEN_55_AND_65", 6, "between55and65");
        public static final AgeGroup ABOVE_65 = new AgeGroup("ABOVE_65", 7, "above65");

        private static final /* synthetic */ AgeGroup[] $values() {
            return new AgeGroup[]{BELOW_18, BETWEEN_18_AND_24, BETWEEN_25_AND_29, BETWEEN_30_AND_34, BETWEEN_35_AND_44, BETWEEN_45_AND_54, BETWEEN_55_AND_65, ABOVE_65};
        }

        static {
            AgeGroup[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private AgeGroup(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static AgeGroup valueOf(String str) {
            return (AgeGroup) Enum.valueOf(AgeGroup.class, str);
        }

        public static AgeGroup[] values() {
            return (AgeGroup[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Education;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "HIGH_SCHOOL_OR_LESS", "COLLEGE_OR_GRADUATE", "POST_GRADUATE_OR_ABOVE", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Education {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ Education[] $VALUES;

        @NotNull
        private final String value;
        public static final Education HIGH_SCHOOL_OR_LESS = new Education("HIGH_SCHOOL_OR_LESS", 0, "highschoolorless");
        public static final Education COLLEGE_OR_GRADUATE = new Education("COLLEGE_OR_GRADUATE", 1, "collegeorgraduate");
        public static final Education POST_GRADUATE_OR_ABOVE = new Education("POST_GRADUATE_OR_ABOVE", 2, "postgraduateorabove");

        private static final /* synthetic */ Education[] $values() {
            return new Education[]{HIGH_SCHOOL_OR_LESS, COLLEGE_OR_GRADUATE, POST_GRADUATE_OR_ABOVE};
        }

        static {
            Education[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private Education(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static Education valueOf(String str) {
            return (Education) Enum.valueOf(Education.class, str);
        }

        public static Education[] values() {
            return (Education[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Gender;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FEMALE", "MALE", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Gender {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ Gender[] $VALUES;
        public static final Gender FEMALE = new Gender("FEMALE", 0, InneractiveMediationDefs.GENDER_FEMALE);
        public static final Gender MALE = new Gender("MALE", 1, InneractiveMediationDefs.GENDER_MALE);

        @NotNull
        private final String value;

        private static final /* synthetic */ Gender[] $values() {
            return new Gender[]{FEMALE, MALE};
        }

        static {
            Gender[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private Gender(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static Gender valueOf(String str) {
            return (Gender) Enum.valueOf(Gender.class, str);
        }

        public static Gender[] values() {
            return (Gender[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ERROR", "DEBUG", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LogLevel {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel NONE = new LogLevel("NONE", 0);
        public static final LogLevel ERROR = new LogLevel("ERROR", 1);
        public static final LogLevel DEBUG = new LogLevel("DEBUG", 2);

        private static final /* synthetic */ LogLevel[] $values() {
            return new LogLevel[]{NONE, ERROR, DEBUG};
        }

        static {
            LogLevel[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private LogLevel(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$PublisherSignals;", "", "", "", "signals", "", "putPublisherSignals", "(Ljava/util/Map;)V", "getPublisherSignals", "()Ljava/util/Map;", "resetPublisherSignals", "()V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PublisherSignals {

        @NotNull
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:5:0x000c, B:7:0x001b, B:10:0x0022, B:20:0x006b, B:21:0x009a, B:23:0x00a1, B:26:0x00b9, B:28:0x00d0, B:30:0x00db, B:32:0x0111, B:35:0x00e8, B:37:0x0104, B:41:0x0115, B:42:0x0122, B:44:0x0128, B:47:0x013c, B:56:0x005c, B:14:0x002b, B:16:0x0038, B:19:0x003f, B:53:0x0047), top: B:4:0x000c, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0115 A[EDGE_INSN: B:40:0x0115->B:41:0x0115 BREAK  A[LOOP:0: B:21:0x009a->B:34:0x009a], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0128 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:5:0x000c, B:7:0x001b, B:10:0x0022, B:20:0x006b, B:21:0x009a, B:23:0x00a1, B:26:0x00b9, B:28:0x00d0, B:30:0x00db, B:32:0x0111, B:35:0x00e8, B:37:0x0104, B:41:0x0115, B:42:0x0122, B:44:0x0128, B:47:0x013c, B:56:0x005c, B:14:0x002b, B:16:0x0038, B:19:0x003f, B:53:0x0047), top: B:4:0x000c, inners: #1 }] */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Map<String, Object> getPublisherSignals() {
            Map map;
            Iterator it;
            ArrayList arrayList;
            SignalsConfig.PublisherConfig c;
            if (!InMobiSdk.isSDKInitialized()) {
                String access$getTAG$p = InMobiSdk.access$getTAG$p();
                access$getTAG$p.getClass();
                Xb.a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
                return null;
            }
            C3422fh c3422fh = C3422fh.a;
            c3422fh.getClass();
            try {
                SignalsConfig.PublisherConfig c2 = C3422fh.c();
                Map map2 = AbstractC3448gh.a;
                c2.getClass();
                if (!c2.getEnableMCO() && !c2.getEnableAB()) {
                    lm5 lm5Var = lm5.a;
                    lm5Var.getClass();
                    return lm5Var;
                }
                try {
                    c = C3422fh.c();
                    c.getClass();
                } catch (Exception e) {
                    joa joaVar = AbstractC3286aa.a;
                    AbstractC3286aa.a(new Q2(e));
                    map = lm5.a;
                    map.getClass();
                }
                if (!c.getEnableMCO() && !c.getEnableAB()) {
                    map = lm5.a;
                    map.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    it = b.j(new Pair(C3422fh.c().getObj(), "o_i_dep"), new Pair(C3422fh.c().getDirect(), "d_i_dep")).iterator();
                    while (true) {
                        int i = 0;
                        if (it.hasNext()) {
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) pair.a;
                        String str = (String) pair.b;
                        if (baseInputData.getDepth().getEnabled()) {
                            C3422fh c3422fh2 = C3422fh.a;
                            c3422fh2.getClass();
                            JSONArray optJSONArray = ((JSONObject) C3422fh.f.getValue(c3422fh2, C3422fh.b[1])).optJSONArray(str);
                            if (optJSONArray != null) {
                                arrayList = new ArrayList();
                                int length = optJSONArray.length();
                                while (i < length) {
                                    Object obj = optJSONArray.get(i);
                                    obj.getClass();
                                    arrayList.add(obj);
                                    i++;
                                }
                            } else {
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(0);
                                jSONArray.put(0);
                                jSONArray.put(0);
                                jSONArray.put(0);
                                arrayList = new ArrayList();
                                int length2 = jSONArray.length();
                                while (i < length2) {
                                    Object obj2 = jSONArray.get(i);
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    i++;
                                }
                            }
                            linkedHashMap.put(str, arrayList);
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (!c.v((String) entry.getKey(), "auto_", false)) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    return linkedHashMap2;
                }
                map = tub.k(AbstractC3448gh.a(c3422fh.b(), C3422fh.c()), c3422fh.d());
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(map);
                it = b.j(new Pair(C3422fh.c().getObj(), "o_i_dep"), new Pair(C3422fh.c().getDirect(), "d_i_dep")).iterator();
                while (true) {
                    int i2 = 0;
                    if (it.hasNext()) {
                    }
                }
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                while (r1.hasNext()) {
                }
                return linkedHashMap22;
            } catch (Exception e2) {
                joa joaVar2 = AbstractC3286aa.a;
                AbstractC3286aa.a(new Q2(e2));
                Xb.a((byte) 1, "PubSignals", "Publisher signals could not be retrieved.");
                lm5 lm5Var2 = lm5.a;
                lm5Var2.getClass();
                return lm5Var2;
            }
        }

        public final void putPublisherSignals(@Nullable Map<String, ? extends Object> signals) {
            if (!InMobiSdk.isSDKInitialized()) {
                String access$getTAG$p = InMobiSdk.access$getTAG$p();
                access$getTAG$p.getClass();
                Xb.a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
            } else if (signals != null) {
                C3422fh.a.getClass();
                C3422fh.a(signals);
            }
        }

        public final void resetPublisherSignals() {
            if (!InMobiSdk.isSDKInitialized()) {
                String access$getTAG$p = InMobiSdk.access$getTAG$p();
                access$getTAG$p.getClass();
                Xb.a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot reset publisher signals.");
            } else {
                C3422fh.a.getClass();
                Context context = AbstractC3424fj.a;
                if (context != null) {
                    xw3.L(L9.e, null, null, new C3345ch(context, null), 3);
                } else {
                    Unit unit = Unit.a;
                }
            }
        }
    }

    public static final void a(Context context, SdkInitializationListener sdkInitializationListener, String str, JSONObject jSONObject) {
        SdkInitializationListener sdkInitializationListener2;
        Exception exc;
        if (context == null) {
            INSTANCE.getClass();
            a(sdkInitializationListener, SdkInitializationListener.MISSING_CONTEXT);
            return;
        }
        if (str == null) {
            INSTANCE.getClass();
            a(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (C3892xl.a()) {
            INSTANCE.getClass();
            a(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.d(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
        try {
            AbstractC3386e7.a(jSONObject);
            try {
                if (obj.length() == 0) {
                    INSTANCE.getClass();
                    a(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                    return;
                }
                if (!AbstractC3292ag.a(context, "android.permission.ACCESS_COARSE_LOCATION") && !AbstractC3292ag.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                    Xb.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
                }
                if (AbstractC3424fj.d()) {
                    INSTANCE.getClass();
                    a(sdkInitializationListener, null);
                    return;
                }
                if (AbstractC3424fj.i == 1) {
                    return;
                }
                AbstractC3424fj.i = 1;
                AbstractC3424fj.a = context.getApplicationContext();
                AbstractC3424fj.d.set(true);
                AbstractC3424fj.c = obj;
                if (!AbstractC3424fj.c(context)) {
                    AbstractC3424fj.c = null;
                    AbstractC3424fj.a = null;
                    AbstractC3424fj.i = 3;
                    INSTANCE.getClass();
                    a(sdkInitializationListener, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                    return;
                }
                I1.b(context);
                INSTANCE.getClass();
                a();
                sdkInitializationListener2 = sdkInitializationListener;
                try {
                    xw3.L(AbstractC3424fj.h, null, null, new C3398ej(new J9(context, obj, sdkInitializationListener2, elapsedRealtime, null), null), 3);
                } catch (Exception e) {
                    e = e;
                    exc = e;
                    exc.getMessage();
                    AbstractC3424fj.c = null;
                    AbstractC3424fj.a = null;
                    AbstractC3424fj.i = 3;
                    INSTANCE.getClass();
                    a(sdkInitializationListener2, "SDK could not be initialized; an unexpected error was encountered.");
                }
            } catch (Exception e2) {
                exc = e2;
                sdkInitializationListener2 = sdkInitializationListener;
                exc.getMessage();
                AbstractC3424fj.c = null;
                AbstractC3424fj.a = null;
                AbstractC3424fj.i = 3;
                INSTANCE.getClass();
                a(sdkInitializationListener2, "SDK could not be initialized; an unexpected error was encountered.");
            }
        } catch (Exception e3) {
            e = e3;
            sdkInitializationListener2 = sdkInitializationListener;
        }
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    public static final /* synthetic */ Map access$prepareTelemetryPayload(InMobiSdk inMobiSdk, long j) {
        inMobiSdk.getClass();
        return a(j);
    }

    public static final /* synthetic */ void access$provideCallback(InMobiSdk inMobiSdk, SdkInitializationListener sdkInitializationListener, String str) {
        inMobiSdk.getClass();
        a(sdkInitializationListener, str);
    }

    public static final void b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (AbstractC3292ag.a(AbstractC3424fj.a, str)) {
                sb.append("\n");
                sb.append(str);
            }
        }
        Xb.a((byte) 2, "InMobiSdk", sb.toString());
    }

    @Nullable
    public static final String getToken() {
        return getToken(null, null);
    }

    @NotNull
    public static final String getVersion() {
        return "11.3.0";
    }

    public static final void init(@Nullable Context context, @Nullable String accountId, @Nullable JSONObject consentObject, @Nullable SdkInitializationListener sdkInitializationListener) {
        InMobiSdk inMobiSdk = INSTANCE;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        inMobiSdk.getClass();
        a(applicationContext, accountId, consentObject, sdkInitializationListener);
    }

    public static final boolean isSDKInitialized() {
        return AbstractC3424fj.d();
    }

    public static final void setAge(int age) {
        Context context = AbstractC3424fj.a;
        if (age != Integer.MIN_VALUE) {
            AbstractC3551kh.a = age;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Pa.a(context, "user_info_store").a("user_age", age, false);
            }
        }
    }

    public static final void setAgeGroup(@NotNull AgeGroup group) {
        group.getClass();
        String ageGroup = group.toString();
        Locale locale = Locale.ENGLISH;
        String k = i.k(locale, ageGroup, locale);
        Context context = AbstractC3424fj.a;
        if (k != null) {
            AbstractC3551kh.c = k;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Pa.a(context, "user_info_store").a("user_age_group", k, false);
            }
        }
    }

    public static final void setApplicationMuted(boolean muted) {
        AbstractC3424fj.f = muted;
    }

    public static final void setAreaCode(@Nullable String areaCode) {
        Context context = AbstractC3424fj.a;
        AbstractC3551kh.d = areaCode;
        if (context == null || areaCode == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Pa.a(context, "user_info_store").a("user_area_code", areaCode, false);
    }

    public static final void setEducation(@NotNull Education education) {
        education.getClass();
        String education2 = education.toString();
        Locale locale = Locale.ENGLISH;
        String k = i.k(locale, education2, locale);
        Context context = AbstractC3424fj.a;
        if (k != null) {
            AbstractC3551kh.k = k;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Pa.a(context, "user_info_store").a("user_education", k, false);
            }
        }
    }

    public static final void setGender(@NotNull Gender gender) {
        gender.getClass();
        String gender2 = gender.toString();
        Locale locale = Locale.ENGLISH;
        String k = i.k(locale, gender2, locale);
        Context context = AbstractC3424fj.a;
        if (k != null) {
            AbstractC3551kh.j = k;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Pa.a(context, "user_info_store").a("user_gender", k, false);
            }
        }
    }

    public static final void setInterests(@Nullable String interests) {
        Context context = AbstractC3424fj.a;
        if (interests != null) {
            AbstractC3551kh.m = interests;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Pa.a(context, "user_info_store").a("user_interest", interests, false);
            }
        }
    }

    public static final void setIsAgeRestricted(boolean isAgeRestricted) {
        AbstractC3551kh.a(isAgeRestricted);
        Yk.a(isAgeRestricted);
        if (isAgeRestricted) {
            InMobiUnifiedIdService.reset();
            F8.a(null);
        }
    }

    public static final void setLanguage(@Nullable String language) {
        Context context = AbstractC3424fj.a;
        if (language != null) {
            AbstractC3551kh.l = language;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Pa.a(context, "user_info_store").a("user_language", language, false);
            }
        }
    }

    public static final void setLocation(@Nullable Location location) {
        Context context = AbstractC3424fj.a;
        if (location != null) {
            AbstractC3551kh.n = location;
            if (context != null) {
                String a = AbstractC3551kh.a(location);
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Pa.a(context, "user_info_store").a("user_location", a, false);
            }
        }
    }

    public static final void setLocationWithCityStateCountry(@Nullable String city, @Nullable String state, @Nullable String country) {
        Context context = AbstractC3424fj.a;
        if (city != null) {
            AbstractC3551kh.f = city;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Pa.a(context, "user_info_store").a("user_city_code", city, false);
            }
        }
        Context context2 = AbstractC3424fj.a;
        if (state != null) {
            AbstractC3551kh.g = state;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Qa.b;
                Pa.a(context2, "user_info_store").a("user_state_code", state, false);
            }
        }
        Context context3 = AbstractC3424fj.a;
        if (country != null) {
            AbstractC3551kh.h = country;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap3 = Qa.b;
                Pa.a(context3, "user_info_store").a("user_country_code", country, false);
            }
        }
    }

    public static final void setLogLevel(@Nullable LogLevel logLevel) {
        int i = logLevel == null ? -1 : a.a[logLevel.ordinal()];
        if (i == 1) {
            Xb.a = (byte) 0;
            return;
        }
        if (i == 2) {
            Xb.a = (byte) 1;
        } else if (i != 3) {
            Xb.a = (byte) 2;
        } else {
            Xb.a = (byte) 2;
        }
    }

    public static final void setPartnerGDPRConsent(@Nullable JSONObject consentObject) {
        if (consentObject != null) {
            AbstractC3386e7.b = consentObject;
        }
    }

    public static final void setPostalCode(@Nullable String postalCode) {
        Context context = AbstractC3424fj.a;
        if (postalCode != null) {
            AbstractC3551kh.e = postalCode;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Pa.a(context, "user_info_store").a("user_post_code", postalCode, false);
            }
        }
    }

    public static final void setPublisherProvidedUnifiedId(@Nullable JSONObject jsonObject) {
        Objects.toString(jsonObject);
        AbstractC3424fj.g.submit(new K9(jsonObject));
    }

    public static final void setYearOfBirth(int yearOfBirth) {
        Context context = AbstractC3424fj.a;
        if (yearOfBirth != Integer.MIN_VALUE) {
            AbstractC3551kh.i = yearOfBirth;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Pa.a(context, "user_info_store").a("user_yob", yearOfBirth, false);
            }
        }
    }

    public static final void updateGDPRConsent(@Nullable JSONObject consentObject) {
        AbstractC3386e7.a(consentObject);
    }

    @Nullable
    public static final String getToken(@Nullable Map<String, String> extras, @Nullable String keywords) {
        return Sk.a(extras, keywords);
    }

    public static final void b(SdkInitializationListener sdkInitializationListener, String str) {
        INSTANCE.getClass();
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    public static void a(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        AbstractC3632nk.a(new kx0(context, sdkInitializationListener, str, jSONObject, 6));
    }

    public static void a(SdkInitializationListener sdkInitializationListener, String str) {
        if (sdkInitializationListener != null) {
            AbstractC3632nk.a(new yq5(13, sdkInitializationListener, str));
        }
        if (str == null) {
            Xb.a((byte) 2, "InMobiSdk", "InMobi SDK initialized with account id: " + AbstractC3424fj.c);
            return;
        }
        Xb.a((byte) 1, "InMobiSdk", str);
    }

    public static LinkedHashMap a(long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        Objects.toString(linkedHashMap.get(Payload.LATENCY));
        linkedHashMap.put("networkType", F5.o());
        linkedHashMap.put("integrationType", "InMobi");
        return linkedHashMap;
    }

    public static void a() {
        AbstractC3424fj.g.submit(new x(17));
    }
}
