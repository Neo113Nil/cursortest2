package ru.rustore.sdk.appupdate.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl0.T;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001,Bo\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\u000e\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\fJ\r\u0010)\u001a\u00020*H\u0000¢\u0006\u0002\b+R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017¨\u0006-"}, d2 = {"Lru/rustore/sdk/appupdate/model/AppUpdateInfo;", "", "appId", "", "appName", "", "iconUrl", "fileSize", "packageName", "availableVersionName", "availableVersionCode", "installStatus", "", "updateAvailability", "updatePriority", "updatedAt", "forceUpdateAvailable", "", "whatsNew", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JIIILjava/lang/String;ZLjava/lang/String;)V", "getAppId$sdk_public_appupdate_release", "()J", "getAppName$sdk_public_appupdate_release", "()Ljava/lang/String;", "getAvailableVersionCode", "getAvailableVersionName", "getFileSize", "getIconUrl$sdk_public_appupdate_release", "getInstallStatus", "()I", "<set-?>", "isUsed", "isUsed$sdk_public_appupdate_release", "()Z", "getPackageName", "getUpdateAvailability", "getUpdatePriority", "getUpdatedAt", "getWhatsNew", "isUpdateTypeAllowed", "updateType", "markIsUsed", "", "markIsUsed$sdk_public_appupdate_release", "Factory", "sdk-public-appupdate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppUpdateInfo {
    private final long appId;

    @NotNull
    private final String appName;
    private final long availableVersionCode;

    @NotNull
    private final String availableVersionName;
    private final long fileSize;
    private final boolean forceUpdateAvailable;

    @NotNull
    private final String iconUrl;
    private final int installStatus;
    private boolean isUsed;

    @NotNull
    private final String packageName;
    private final int updateAvailability;
    private final int updatePriority;

    @NotNull
    private final String updatedAt;

    @NotNull
    private final String whatsNew;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011Jo\u0010 \u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006#"}, d2 = {"Lru/rustore/sdk/appupdate/model/AppUpdateInfo$Factory;", "", "Lrl0/T;", "timeProvider", "<init>", "(Lrl0/T;)V", "", "updatePriority", "", "updatedAt", "", "getForceUpdateAvailable", "(ILjava/lang/String;)Z", "Ljava/util/Date;", "currentTime", "updatedAtDate", "calcDayBetween", "(Ljava/util/Date;Ljava/util/Date;)I", "", "appId", "appName", "iconUrl", "fileSize", "packageName", "availableVersionName", "availableVersionCode", "installStatus", "updateAvailability", "whatsNew", "Lru/rustore/sdk/appupdate/model/AppUpdateInfo;", "create$sdk_public_appupdate_release", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JIIILjava/lang/String;Ljava/lang/String;)Lru/rustore/sdk/appupdate/model/AppUpdateInfo;", "create", "Lrl0/T;", "Companion", "sdk-public-appupdate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Factory {

        @NotNull
        private static final Companion Companion = new Companion(null);

        @Deprecated
        public static final int DAYS_BETWEEN_10 = 10;

        @Deprecated
        public static final int DAYS_BETWEEN_20 = 20;

        @Deprecated
        public static final int DAYS_BETWEEN_3 = 3;

        @Deprecated
        public static final int DAYS_BETWEEN_30 = 30;

        @Deprecated
        @NotNull
        public static final String UPDATED_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

        @NotNull
        private final T timeProvider;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/rustore/sdk/appupdate/model/AppUpdateInfo$Factory$Companion;", "", "()V", "DAYS_BETWEEN_10", "", "DAYS_BETWEEN_20", "DAYS_BETWEEN_3", "DAYS_BETWEEN_30", "UPDATED_FORMAT", "", "sdk-public-appupdate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Factory(@NotNull T timeProvider) {
            Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
            this.timeProvider = timeProvider;
        }

        private final int calcDayBetween(Date currentTime, Date updatedAtDate) {
            return (int) TimeUnit.DAYS.convert(currentTime.getTime() - updatedAtDate.getTime(), TimeUnit.MILLISECONDS);
        }

        private final boolean getForceUpdateAvailable(int updatePriority, String updatedAt) {
            this.timeProvider.getClass();
            Intrinsics.checkNotNullParameter(updatedAt, "string");
            Intrinsics.checkNotNullParameter(UPDATED_FORMAT, "dateFormat");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(UPDATED_FORMAT, T.f83642b);
            simpleDateFormat.setTimeZone(T.f83643c);
            Date parse = simpleDateFormat.parse(updatedAt);
            Intrinsics.f(parse);
            Date time = this.timeProvider.f83644a.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
            int calcDayBetween = calcDayBetween(time, parse);
            return updatePriority != 1 ? updatePriority != 2 ? updatePriority != 3 ? updatePriority != 4 ? updatePriority == 5 : calcDayBetween >= 3 : calcDayBetween >= 10 : calcDayBetween >= 20 : calcDayBetween >= 30;
        }

        @NotNull
        public final AppUpdateInfo create$sdk_public_appupdate_release(long appId, @NotNull String appName, @NotNull String iconUrl, long fileSize, @NotNull String packageName, @NotNull String availableVersionName, long availableVersionCode, int installStatus, int updateAvailability, int updatePriority, @NotNull String updatedAt, @NotNull String whatsNew) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(availableVersionName, "availableVersionName");
            Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
            Intrinsics.checkNotNullParameter(whatsNew, "whatsNew");
            return new AppUpdateInfo(appId, appName, iconUrl, fileSize, packageName, availableVersionName, availableVersionCode, installStatus, updateAvailability, updatePriority, updatedAt, getForceUpdateAvailable(updatePriority, updatedAt), whatsNew, null);
        }
    }

    public /* synthetic */ AppUpdateInfo(long j11, String str, String str2, long j12, String str3, String str4, long j13, int i11, int i12, int i13, String str5, boolean z11, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, str2, j12, str3, str4, j13, i11, i12, i13, str5, z11, str6);
    }

    /* renamed from: getAppId$sdk_public_appupdate_release, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    /* renamed from: getAppName$sdk_public_appupdate_release, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    public final long getAvailableVersionCode() {
        return this.availableVersionCode;
    }

    @NotNull
    public final String getAvailableVersionName() {
        return this.availableVersionName;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    /* renamed from: getIconUrl$sdk_public_appupdate_release, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getInstallStatus() {
        return this.installStatus;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final int getUpdateAvailability() {
        return this.updateAvailability;
    }

    public final int getUpdatePriority() {
        return this.updatePriority;
    }

    @NotNull
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    @NotNull
    public final String getWhatsNew() {
        return this.whatsNew;
    }

    public final boolean isUpdateTypeAllowed(int updateType) {
        if (updateType != 0) {
            if (updateType == 1) {
                return this.updateAvailability == 2 && this.forceUpdateAvailable;
            }
            if (updateType != 2) {
                return false;
            }
        }
        return this.updateAvailability == 2;
    }

    /* renamed from: isUsed$sdk_public_appupdate_release, reason: from getter */
    public final boolean getIsUsed() {
        return this.isUsed;
    }

    public final void markIsUsed$sdk_public_appupdate_release() {
        this.isUsed = true;
    }

    private AppUpdateInfo(long j11, String str, String str2, long j12, String str3, String str4, long j13, int i11, int i12, int i13, String str5, boolean z11, String str6) {
        this.appId = j11;
        this.appName = str;
        this.iconUrl = str2;
        this.fileSize = j12;
        this.packageName = str3;
        this.availableVersionName = str4;
        this.availableVersionCode = j13;
        this.installStatus = i11;
        this.updateAvailability = i12;
        this.updatePriority = i13;
        this.updatedAt = str5;
        this.forceUpdateAvailable = z11;
        this.whatsNew = str6;
    }
}
