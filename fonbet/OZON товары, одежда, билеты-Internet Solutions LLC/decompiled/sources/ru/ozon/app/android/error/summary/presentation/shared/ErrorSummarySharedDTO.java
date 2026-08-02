package ru.ozon.app.android.error.summary.presentation.shared;

import B4.V;
import B90.C2616s;
import Ef0.c;
import G.g;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010%J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012HÆ\u0003Jà\u0001\u0010A\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00122\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u000bHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010&\u001a\u0004\b*\u0010%R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010&\u001a\u0004\b+\u0010%R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-¨\u0006H"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummarySharedDTO;", "", "platform", "", "appVersion", "commitHash", "errorDate", "traceId", "userId", "", "responseCode", "", "responseMessage", "pageUrl", "mesh", "layoutId", "layoutVersion", "featureFlags", "", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryFeatureFlagSharedDTO;", "localExperiments", "experiments", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryExperimentSharedDTO;", "invalidWidget", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryInvalidWidgetSharedDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPlatform", "()Ljava/lang/String;", "getAppVersion", "getCommitHash", "getErrorDate", "getTraceId", "getUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getResponseCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResponseMessage", "getPageUrl", "getMesh", "getLayoutId", "getLayoutVersion", "getFeatureFlags", "()Ljava/util/List;", "getLocalExperiments", "getExperiments", "getInvalidWidget", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummarySharedDTO;", "equals", "", "other", "hashCode", "toString", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ErrorSummarySharedDTO {

    @NotNull
    private final String appVersion;

    @NotNull
    private final String commitHash;
    private final String errorDate;
    private final List<ErrorSummaryExperimentSharedDTO> experiments;
    private final List<ErrorSummaryFeatureFlagSharedDTO> featureFlags;
    private final List<ErrorSummaryInvalidWidgetSharedDTO> invalidWidget;
    private final Integer layoutId;
    private final Integer layoutVersion;
    private final List<String> localExperiments;
    private final String mesh;
    private final String pageUrl;

    @NotNull
    private final String platform;
    private final Integer responseCode;
    private final String responseMessage;
    private final String traceId;
    private final Long userId;

    public ErrorSummarySharedDTO(@i(name = "platform") @NotNull String platform, @i(name = "app_version") @NotNull String appVersion, @i(name = "commit_hash") @NotNull String commitHash, @i(name = "error_date") String str, @i(name = "trace_id") String str2, @i(name = "user_id") Long l11, @i(name = "response_code") Integer num, @i(name = "response_message") String str3, @i(name = "page_url") String str4, @i(name = "mesh") String str5, @i(name = "layout_id") Integer num2, @i(name = "layout_version") Integer num3, @i(name = "feature_flags") List<ErrorSummaryFeatureFlagSharedDTO> list, @i(name = "local_experiments") List<String> list2, @i(name = "experiments") List<ErrorSummaryExperimentSharedDTO> list3, @i(name = "invalid_widget") List<ErrorSummaryInvalidWidgetSharedDTO> list4) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(commitHash, "commitHash");
        this.platform = platform;
        this.appVersion = appVersion;
        this.commitHash = commitHash;
        this.errorDate = str;
        this.traceId = str2;
        this.userId = l11;
        this.responseCode = num;
        this.responseMessage = str3;
        this.pageUrl = str4;
        this.mesh = str5;
        this.layoutId = num2;
        this.layoutVersion = num3;
        this.featureFlags = list;
        this.localExperiments = list2;
        this.experiments = list3;
        this.invalidWidget = list4;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMesh() {
        return this.mesh;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getLayoutId() {
        return this.layoutId;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getLayoutVersion() {
        return this.layoutVersion;
    }

    public final List<ErrorSummaryFeatureFlagSharedDTO> component13() {
        return this.featureFlags;
    }

    public final List<String> component14() {
        return this.localExperiments;
    }

    public final List<ErrorSummaryExperimentSharedDTO> component15() {
        return this.experiments;
    }

    public final List<ErrorSummaryInvalidWidgetSharedDTO> component16() {
        return this.invalidWidget;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCommitHash() {
        return this.commitHash;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrorDate() {
        return this.errorDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getResponseCode() {
        return this.responseCode;
    }

    /* renamed from: component8, reason: from getter */
    public final String getResponseMessage() {
        return this.responseMessage;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPageUrl() {
        return this.pageUrl;
    }

    @NotNull
    public final ErrorSummarySharedDTO copy(@i(name = "platform") @NotNull String platform, @i(name = "app_version") @NotNull String appVersion, @i(name = "commit_hash") @NotNull String commitHash, @i(name = "error_date") String errorDate, @i(name = "trace_id") String traceId, @i(name = "user_id") Long userId, @i(name = "response_code") Integer responseCode, @i(name = "response_message") String responseMessage, @i(name = "page_url") String pageUrl, @i(name = "mesh") String mesh, @i(name = "layout_id") Integer layoutId, @i(name = "layout_version") Integer layoutVersion, @i(name = "feature_flags") List<ErrorSummaryFeatureFlagSharedDTO> featureFlags, @i(name = "local_experiments") List<String> localExperiments, @i(name = "experiments") List<ErrorSummaryExperimentSharedDTO> experiments, @i(name = "invalid_widget") List<ErrorSummaryInvalidWidgetSharedDTO> invalidWidget) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(commitHash, "commitHash");
        return new ErrorSummarySharedDTO(platform, appVersion, commitHash, errorDate, traceId, userId, responseCode, responseMessage, pageUrl, mesh, layoutId, layoutVersion, featureFlags, localExperiments, experiments, invalidWidget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorSummarySharedDTO)) {
            return false;
        }
        ErrorSummarySharedDTO errorSummarySharedDTO = (ErrorSummarySharedDTO) other;
        return Intrinsics.d(this.platform, errorSummarySharedDTO.platform) && Intrinsics.d(this.appVersion, errorSummarySharedDTO.appVersion) && Intrinsics.d(this.commitHash, errorSummarySharedDTO.commitHash) && Intrinsics.d(this.errorDate, errorSummarySharedDTO.errorDate) && Intrinsics.d(this.traceId, errorSummarySharedDTO.traceId) && Intrinsics.d(this.userId, errorSummarySharedDTO.userId) && Intrinsics.d(this.responseCode, errorSummarySharedDTO.responseCode) && Intrinsics.d(this.responseMessage, errorSummarySharedDTO.responseMessage) && Intrinsics.d(this.pageUrl, errorSummarySharedDTO.pageUrl) && Intrinsics.d(this.mesh, errorSummarySharedDTO.mesh) && Intrinsics.d(this.layoutId, errorSummarySharedDTO.layoutId) && Intrinsics.d(this.layoutVersion, errorSummarySharedDTO.layoutVersion) && Intrinsics.d(this.featureFlags, errorSummarySharedDTO.featureFlags) && Intrinsics.d(this.localExperiments, errorSummarySharedDTO.localExperiments) && Intrinsics.d(this.experiments, errorSummarySharedDTO.experiments) && Intrinsics.d(this.invalidWidget, errorSummarySharedDTO.invalidWidget);
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getCommitHash() {
        return this.commitHash;
    }

    public final String getErrorDate() {
        return this.errorDate;
    }

    public final List<ErrorSummaryExperimentSharedDTO> getExperiments() {
        return this.experiments;
    }

    public final List<ErrorSummaryFeatureFlagSharedDTO> getFeatureFlags() {
        return this.featureFlags;
    }

    public final List<ErrorSummaryInvalidWidgetSharedDTO> getInvalidWidget() {
        return this.invalidWidget;
    }

    public final Integer getLayoutId() {
        return this.layoutId;
    }

    public final Integer getLayoutVersion() {
        return this.layoutVersion;
    }

    public final List<String> getLocalExperiments() {
        return this.localExperiments;
    }

    public final String getMesh() {
        return this.mesh;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    public final Integer getResponseCode() {
        return this.responseCode;
    }

    public final String getResponseMessage() {
        return this.responseMessage;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.platform.hashCode() * 31, 31, this.appVersion), 31, this.commitHash);
        String str = this.errorDate;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.traceId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.userId;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.responseCode;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.responseMessage;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pageUrl;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mesh;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.layoutId;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.layoutVersion;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<ErrorSummaryFeatureFlagSharedDTO> list = this.featureFlags;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.localExperiments;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ErrorSummaryExperimentSharedDTO> list3 = this.experiments;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ErrorSummaryInvalidWidgetSharedDTO> list4 = this.invalidWidget;
        return hashCode12 + (list4 != null ? list4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.platform;
        String str2 = this.appVersion;
        String str3 = this.commitHash;
        String str4 = this.errorDate;
        String str5 = this.traceId;
        Long l11 = this.userId;
        Integer num = this.responseCode;
        String str6 = this.responseMessage;
        String str7 = this.pageUrl;
        String str8 = this.mesh;
        Integer num2 = this.layoutId;
        Integer num3 = this.layoutVersion;
        List<ErrorSummaryFeatureFlagSharedDTO> list = this.featureFlags;
        List<String> list2 = this.localExperiments;
        List<ErrorSummaryExperimentSharedDTO> list3 = this.experiments;
        List<ErrorSummaryInvalidWidgetSharedDTO> list4 = this.invalidWidget;
        StringBuilder d11 = C3660k.d("ErrorSummarySharedDTO(platform=", str, ", appVersion=", str2, ", commitHash=");
        a.h(d11, str3, ", errorDate=", str4, ", traceId=");
        d11.append(str5);
        d11.append(", userId=");
        d11.append(l11);
        d11.append(", responseCode=");
        V.f(num, ", responseMessage=", str6, ", pageUrl=", d11);
        a.h(d11, str7, ", mesh=", str8, ", layoutId=");
        c.e(d11, num2, ", layoutVersion=", num3, ", featureFlags=");
        C2616s.g(", localExperiments=", ", experiments=", d11, list, list2);
        d11.append(list3);
        d11.append(", invalidWidget=");
        d11.append(list4);
        d11.append(")");
        return d11.toString();
    }
}
