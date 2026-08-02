package ru.ozon.inapp.push.sdk.internal.data.dto;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest;", "", "application", "Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application;", "page", "", "<init>", "(Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application;Ljava/lang/String;)V", "getApplication", "()Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application;", "getPage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Application", "in-app-push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ActionProcessRequest {

    @NotNull
    private final Application application;

    @NotNull
    private final String page;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application;", "", "platform", "", "buildType", "Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application$BuildType;", "applicationName", "Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application$ApplicationName;", "<init>", "(Ljava/lang/String;Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application$BuildType;Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application$ApplicationName;)V", "getPlatform", "()Ljava/lang/String;", "getBuildType", "()Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application$BuildType;", "getApplicationName", "()Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application$ApplicationName;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "BuildType", "ApplicationName", "in-app-push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    /* loaded from: classes3.dex */
    public static final /* data */ class Application {

        @NotNull
        private final ApplicationName applicationName;

        @NotNull
        private final BuildType buildType;

        @NotNull
        private final String platform;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application$ApplicationName;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "BX", "BANK", "BANK_SME", "SX", "CA", "FC", "FX", "FT", "PushSDKDemo", "HIRE", "TRAVEL", "SELECT", "FRESH", "PVZ", "BENEFIT", "MPX", "SX_CY", "PROFIT", "in-app-push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ApplicationName {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ApplicationName[] $VALUES;
            private final int id;

            /* renamed from: BX, reason: collision with root package name */
            public static final ApplicationName f97528BX = new ApplicationName("BX", 0, 1);
            public static final ApplicationName BANK = new ApplicationName("BANK", 1, 2);
            public static final ApplicationName BANK_SME = new ApplicationName("BANK_SME", 2, 3);
            public static final ApplicationName SX = new ApplicationName("SX", 3, 4);

            /* renamed from: CA, reason: collision with root package name */
            public static final ApplicationName f97529CA = new ApplicationName("CA", 4, 5);
            public static final ApplicationName FC = new ApplicationName("FC", 5, 6);

            /* renamed from: FX, reason: collision with root package name */
            public static final ApplicationName f97530FX = new ApplicationName("FX", 6, 7);
            public static final ApplicationName FT = new ApplicationName("FT", 7, 8);
            public static final ApplicationName PushSDKDemo = new ApplicationName("PushSDKDemo", 8, 9);
            public static final ApplicationName HIRE = new ApplicationName("HIRE", 9, 10);
            public static final ApplicationName TRAVEL = new ApplicationName("TRAVEL", 10, 11);
            public static final ApplicationName SELECT = new ApplicationName("SELECT", 11, 12);
            public static final ApplicationName FRESH = new ApplicationName("FRESH", 12, 13);
            public static final ApplicationName PVZ = new ApplicationName("PVZ", 13, 14);
            public static final ApplicationName BENEFIT = new ApplicationName("BENEFIT", 14, 15);
            public static final ApplicationName MPX = new ApplicationName("MPX", 15, 16);
            public static final ApplicationName SX_CY = new ApplicationName("SX_CY", 16, 17);
            public static final ApplicationName PROFIT = new ApplicationName("PROFIT", 17, 18);

            private static final /* synthetic */ ApplicationName[] $values() {
                return new ApplicationName[]{f97528BX, BANK, BANK_SME, SX, f97529CA, FC, f97530FX, FT, PushSDKDemo, HIRE, TRAVEL, SELECT, FRESH, PVZ, BENEFIT, MPX, SX_CY, PROFIT};
            }

            static {
                ApplicationName[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private ApplicationName(String str, int i11, int i12) {
                this.id = i12;
            }

            @NotNull
            public static a<ApplicationName> getEntries() {
                return $ENTRIES;
            }

            public static ApplicationName valueOf(String str) {
                return (ApplicationName) Enum.valueOf(ApplicationName.class, str);
            }

            public static ApplicationName[] values() {
                return (ApplicationName[]) $VALUES.clone();
            }

            public final int getId() {
                return this.id;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application$BuildType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "PROD", "PROD_RELEASE", "PROD_DEBUG", "QA_RELEASE", "QA_DEBUG", "QA", "RELEASE", "ENTERPRISE", "DEBUG", "BETA", "in-app-push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BuildType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ BuildType[] $VALUES;
            private final int id;
            public static final BuildType PROD = new BuildType("PROD", 0, 1);
            public static final BuildType PROD_RELEASE = new BuildType("PROD_RELEASE", 1, 2);
            public static final BuildType PROD_DEBUG = new BuildType("PROD_DEBUG", 2, 3);
            public static final BuildType QA_RELEASE = new BuildType("QA_RELEASE", 3, 4);
            public static final BuildType QA_DEBUG = new BuildType("QA_DEBUG", 4, 5);

            /* renamed from: QA, reason: collision with root package name */
            public static final BuildType f97532QA = new BuildType("QA", 5, 6);
            public static final BuildType RELEASE = new BuildType("RELEASE", 6, 7);
            public static final BuildType ENTERPRISE = new BuildType("ENTERPRISE", 7, 8);
            public static final BuildType DEBUG = new BuildType("DEBUG", 8, 9);
            public static final BuildType BETA = new BuildType("BETA", 9, 10);

            private static final /* synthetic */ BuildType[] $values() {
                return new BuildType[]{PROD, PROD_RELEASE, PROD_DEBUG, QA_RELEASE, QA_DEBUG, f97532QA, RELEASE, ENTERPRISE, DEBUG, BETA};
            }

            static {
                BuildType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private BuildType(String str, int i11, int i12) {
                this.id = i12;
            }

            @NotNull
            public static a<BuildType> getEntries() {
                return $ENTRIES;
            }

            public static BuildType valueOf(String str) {
                return (BuildType) Enum.valueOf(BuildType.class, str);
            }

            public static BuildType[] values() {
                return (BuildType[]) $VALUES.clone();
            }

            public final int getId() {
                return this.id;
            }
        }

        public Application(@i(name = "platform") @NotNull String platform, @i(name = "build") @NotNull BuildType buildType, @i(name = "name") @NotNull ApplicationName applicationName) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(buildType, "buildType");
            Intrinsics.checkNotNullParameter(applicationName, "applicationName");
            this.platform = platform;
            this.buildType = buildType;
            this.applicationName = applicationName;
        }

        public static /* synthetic */ Application copy$default(Application application, String str, BuildType buildType, ApplicationName applicationName, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = application.platform;
            }
            if ((i11 & 2) != 0) {
                buildType = application.buildType;
            }
            if ((i11 & 4) != 0) {
                applicationName = application.applicationName;
            }
            return application.copy(str, buildType, applicationName);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final BuildType getBuildType() {
            return this.buildType;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ApplicationName getApplicationName() {
            return this.applicationName;
        }

        @NotNull
        public final Application copy(@i(name = "platform") @NotNull String platform, @i(name = "build") @NotNull BuildType buildType, @i(name = "name") @NotNull ApplicationName applicationName) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(buildType, "buildType");
            Intrinsics.checkNotNullParameter(applicationName, "applicationName");
            return new Application(platform, buildType, applicationName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Application)) {
                return false;
            }
            Application application = (Application) other;
            return Intrinsics.d(this.platform, application.platform) && this.buildType == application.buildType && this.applicationName == application.applicationName;
        }

        @NotNull
        public final ApplicationName getApplicationName() {
            return this.applicationName;
        }

        @NotNull
        public final BuildType getBuildType() {
            return this.buildType;
        }

        @NotNull
        public final String getPlatform() {
            return this.platform;
        }

        public int hashCode() {
            return this.applicationName.hashCode() + ((this.buildType.hashCode() + (this.platform.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Application(platform=" + this.platform + ", buildType=" + this.buildType + ", applicationName=" + this.applicationName + ")";
        }
    }

    public ActionProcessRequest(@i(name = "application") @NotNull Application application, @i(name = "page") @NotNull String page) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(page, "page");
        this.application = application;
        this.page = page;
    }

    public static /* synthetic */ ActionProcessRequest copy$default(ActionProcessRequest actionProcessRequest, Application application, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            application = actionProcessRequest.application;
        }
        if ((i11 & 2) != 0) {
            str = actionProcessRequest.page;
        }
        return actionProcessRequest.copy(application, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Application getApplication() {
        return this.application;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPage() {
        return this.page;
    }

    @NotNull
    public final ActionProcessRequest copy(@i(name = "application") @NotNull Application application, @i(name = "page") @NotNull String page) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(page, "page");
        return new ActionProcessRequest(application, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionProcessRequest)) {
            return false;
        }
        ActionProcessRequest actionProcessRequest = (ActionProcessRequest) other;
        return Intrinsics.d(this.application, actionProcessRequest.application) && Intrinsics.d(this.page, actionProcessRequest.page);
    }

    @NotNull
    public final Application getApplication() {
        return this.application;
    }

    @NotNull
    public final String getPage() {
        return this.page;
    }

    public int hashCode() {
        return this.page.hashCode() + (this.application.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ActionProcessRequest(application=" + this.application + ", page=" + this.page + ")";
    }
}
