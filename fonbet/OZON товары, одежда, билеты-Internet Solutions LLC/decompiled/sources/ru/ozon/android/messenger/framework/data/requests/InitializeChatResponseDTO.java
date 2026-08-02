package ru.ozon.android.messenger.framework.data.requests;

import C.o0;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/InitializeChatResponseDTO;", "", "userId", "", "analytics", "Lru/ozon/android/messenger/framework/data/requests/InitializeChatResponseDTO$AnalyticsTokens;", "<init>", "(Ljava/lang/String;Lru/ozon/android/messenger/framework/data/requests/InitializeChatResponseDTO$AnalyticsTokens;)V", "getUserId", "()Ljava/lang/String;", "getAnalytics", "()Lru/ozon/android/messenger/framework/data/requests/InitializeChatResponseDTO$AnalyticsTokens;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AnalyticsTokens", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InitializeChatResponseDTO {
    public static final int $stable = 0;
    private final AnalyticsTokens analytics;
    private final String userId;

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/InitializeChatResponseDTO$AnalyticsTokens;", "", "pageToken", "", "widgetToken", "userToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPageToken", "()Ljava/lang/String;", "getWidgetToken", "getUserToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnalyticsTokens {
        public static final int $stable = 0;
        private final String pageToken;
        private final String userToken;
        private final String widgetToken;

        public AnalyticsTokens(String str, String str2, String str3) {
            this.pageToken = str;
            this.widgetToken = str2;
            this.userToken = str3;
        }

        public static /* synthetic */ AnalyticsTokens copy$default(AnalyticsTokens analyticsTokens, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = analyticsTokens.pageToken;
            }
            if ((i11 & 2) != 0) {
                str2 = analyticsTokens.widgetToken;
            }
            if ((i11 & 4) != 0) {
                str3 = analyticsTokens.userToken;
            }
            return analyticsTokens.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPageToken() {
            return this.pageToken;
        }

        /* renamed from: component2, reason: from getter */
        public final String getWidgetToken() {
            return this.widgetToken;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUserToken() {
            return this.userToken;
        }

        @NotNull
        public final AnalyticsTokens copy(String pageToken, String widgetToken, String userToken) {
            return new AnalyticsTokens(pageToken, widgetToken, userToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalyticsTokens)) {
                return false;
            }
            AnalyticsTokens analyticsTokens = (AnalyticsTokens) other;
            return Intrinsics.d(this.pageToken, analyticsTokens.pageToken) && Intrinsics.d(this.widgetToken, analyticsTokens.widgetToken) && Intrinsics.d(this.userToken, analyticsTokens.userToken);
        }

        public final String getPageToken() {
            return this.pageToken;
        }

        public final String getUserToken() {
            return this.userToken;
        }

        public final String getWidgetToken() {
            return this.widgetToken;
        }

        public int hashCode() {
            String str = this.pageToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.widgetToken;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.userToken;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.pageToken;
            String str2 = this.widgetToken;
            return o0.c(C3660k.d("AnalyticsTokens(pageToken=", str, ", widgetToken=", str2, ", userToken="), this.userToken, ")");
        }
    }

    public InitializeChatResponseDTO(String str, AnalyticsTokens analyticsTokens) {
        this.userId = str;
        this.analytics = analyticsTokens;
    }

    public static /* synthetic */ InitializeChatResponseDTO copy$default(InitializeChatResponseDTO initializeChatResponseDTO, String str, AnalyticsTokens analyticsTokens, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = initializeChatResponseDTO.userId;
        }
        if ((i11 & 2) != 0) {
            analyticsTokens = initializeChatResponseDTO.analytics;
        }
        return initializeChatResponseDTO.copy(str, analyticsTokens);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final AnalyticsTokens getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final InitializeChatResponseDTO copy(String userId, AnalyticsTokens analytics) {
        return new InitializeChatResponseDTO(userId, analytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializeChatResponseDTO)) {
            return false;
        }
        InitializeChatResponseDTO initializeChatResponseDTO = (InitializeChatResponseDTO) other;
        return Intrinsics.d(this.userId, initializeChatResponseDTO.userId) && Intrinsics.d(this.analytics, initializeChatResponseDTO.analytics);
    }

    public final AnalyticsTokens getAnalytics() {
        return this.analytics;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AnalyticsTokens analyticsTokens = this.analytics;
        return hashCode + (analyticsTokens != null ? analyticsTokens.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InitializeChatResponseDTO(userId=" + this.userId + ", analytics=" + this.analytics + ")";
    }
}
