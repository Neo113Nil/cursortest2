package ru.ozon.app.android.search.widgets.feedbackForm.v2.data;

import D3.g;
import De.C2860c;
import J0.P;
import Nh.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO;", "", "options", "", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO;", "actions", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$ActionsDTO;", "notification", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$NotificationWrapper;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$ActionsDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$NotificationWrapper;)V", "getOptions", "()Ljava/util/List;", "getActions", "()Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$ActionsDTO;", "getNotification", "()Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$NotificationWrapper;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "OptionDTO", "ActionsDTO", "NotificationWrapper", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedbackFormV2DTO {
    public static final int $stable = 8;
    private final ActionsDTO actions;
    private final NotificationWrapper notification;

    @NotNull
    private final List<OptionDTO> options;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$ActionsDTO;", "", "submit", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "skip", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$ActionsDTO$SearchCommonControlSettings;", "customAnalytics", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$ActionsDTO$SearchCommonControlSettings;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$ActionsDTO$SearchCommonControlSettings;)V", "getSubmit", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSkip", "()Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$ActionsDTO$SearchCommonControlSettings;", "getCustomAnalytics", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SearchCommonControlSettings", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ActionsDTO {
        public static final int $stable = 0;
        private final SearchCommonControlSettings customAnalytics;
        private final SearchCommonControlSettings skip;
        private final ButtonV3DTO submit;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$ActionsDTO$SearchCommonControlSettings;", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SearchCommonControlSettings {
            public static final int $stable = 0;

            @NotNull
            private final CommonControlSettings common;

            public SearchCommonControlSettings(@NotNull CommonControlSettings common) {
                Intrinsics.checkNotNullParameter(common, "common");
                this.common = common;
            }

            public static /* synthetic */ SearchCommonControlSettings copy$default(SearchCommonControlSettings searchCommonControlSettings, CommonControlSettings commonControlSettings, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    commonControlSettings = searchCommonControlSettings.common;
                }
                return searchCommonControlSettings.copy(commonControlSettings);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final CommonControlSettings getCommon() {
                return this.common;
            }

            @NotNull
            public final SearchCommonControlSettings copy(@NotNull CommonControlSettings common) {
                Intrinsics.checkNotNullParameter(common, "common");
                return new SearchCommonControlSettings(common);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SearchCommonControlSettings) && Intrinsics.d(this.common, ((SearchCommonControlSettings) other).common);
            }

            @NotNull
            public final CommonControlSettings getCommon() {
                return this.common;
            }

            public int hashCode() {
                return this.common.hashCode();
            }

            @NotNull
            public String toString() {
                return "SearchCommonControlSettings(common=" + this.common + ")";
            }
        }

        public ActionsDTO(ButtonV3DTO buttonV3DTO, SearchCommonControlSettings searchCommonControlSettings, SearchCommonControlSettings searchCommonControlSettings2) {
            this.submit = buttonV3DTO;
            this.skip = searchCommonControlSettings;
            this.customAnalytics = searchCommonControlSettings2;
        }

        public static /* synthetic */ ActionsDTO copy$default(ActionsDTO actionsDTO, ButtonV3DTO buttonV3DTO, SearchCommonControlSettings searchCommonControlSettings, SearchCommonControlSettings searchCommonControlSettings2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = actionsDTO.submit;
            }
            if ((i11 & 2) != 0) {
                searchCommonControlSettings = actionsDTO.skip;
            }
            if ((i11 & 4) != 0) {
                searchCommonControlSettings2 = actionsDTO.customAnalytics;
            }
            return actionsDTO.copy(buttonV3DTO, searchCommonControlSettings, searchCommonControlSettings2);
        }

        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getSubmit() {
            return this.submit;
        }

        /* renamed from: component2, reason: from getter */
        public final SearchCommonControlSettings getSkip() {
            return this.skip;
        }

        /* renamed from: component3, reason: from getter */
        public final SearchCommonControlSettings getCustomAnalytics() {
            return this.customAnalytics;
        }

        @NotNull
        public final ActionsDTO copy(ButtonV3DTO submit, SearchCommonControlSettings skip, SearchCommonControlSettings customAnalytics) {
            return new ActionsDTO(submit, skip, customAnalytics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionsDTO)) {
                return false;
            }
            ActionsDTO actionsDTO = (ActionsDTO) other;
            return Intrinsics.d(this.submit, actionsDTO.submit) && Intrinsics.d(this.skip, actionsDTO.skip) && Intrinsics.d(this.customAnalytics, actionsDTO.customAnalytics);
        }

        public final SearchCommonControlSettings getCustomAnalytics() {
            return this.customAnalytics;
        }

        public final SearchCommonControlSettings getSkip() {
            return this.skip;
        }

        public final ButtonV3DTO getSubmit() {
            return this.submit;
        }

        public int hashCode() {
            ButtonV3DTO buttonV3DTO = this.submit;
            int hashCode = (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31;
            SearchCommonControlSettings searchCommonControlSettings = this.skip;
            int hashCode2 = (hashCode + (searchCommonControlSettings == null ? 0 : searchCommonControlSettings.hashCode())) * 31;
            SearchCommonControlSettings searchCommonControlSettings2 = this.customAnalytics;
            return hashCode2 + (searchCommonControlSettings2 != null ? searchCommonControlSettings2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ActionsDTO(submit=" + this.submit + ", skip=" + this.skip + ", customAnalytics=" + this.customAnalytics + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$NotificationWrapper;", "", "success", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getSuccess", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationWrapper {
        public static final int $stable = NotificationDTO.$stable;

        @NotNull
        private final NotificationDTO success;

        public NotificationWrapper(@NotNull NotificationDTO success) {
            Intrinsics.checkNotNullParameter(success, "success");
            this.success = success;
        }

        public static /* synthetic */ NotificationWrapper copy$default(NotificationWrapper notificationWrapper, NotificationDTO notificationDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                notificationDTO = notificationWrapper.success;
            }
            return notificationWrapper.copy(notificationDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final NotificationDTO getSuccess() {
            return this.success;
        }

        @NotNull
        public final NotificationWrapper copy(@NotNull NotificationDTO success) {
            Intrinsics.checkNotNullParameter(success, "success");
            return new NotificationWrapper(success);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotificationWrapper) && Intrinsics.d(this.success, ((NotificationWrapper) other).success);
        }

        @NotNull
        public final NotificationDTO getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return this.success.hashCode();
        }

        @NotNull
        public String toString() {
            return a.e("NotificationWrapper(success=", ")", this.success);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "input", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;", "type", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getInput", "()Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;", "getType", "()Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InputDTO", "OptionType", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class OptionDTO {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO cell;
        private final InputDTO input;

        @NotNull
        private final OptionType type;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;", "", "label", "", "maxLength", "", "rows", "resize", "", "scrollBar", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getLabel", "()Ljava/lang/String;", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRows", "getResize", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScrollBar", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;", "equals", "other", "hashCode", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InputDTO {
            public static final int $stable = 0;

            @NotNull
            private final String label;
            private final Integer maxLength;
            private final Boolean resize;
            private final Integer rows;
            private final Boolean scrollBar;

            public InputDTO(@NotNull String label, Integer num, Integer num2, Boolean bool, Boolean bool2) {
                Intrinsics.checkNotNullParameter(label, "label");
                this.label = label;
                this.maxLength = num;
                this.rows = num2;
                this.resize = bool;
                this.scrollBar = bool2;
            }

            public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, Integer num, Integer num2, Boolean bool, Boolean bool2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = inputDTO.label;
                }
                if ((i11 & 2) != 0) {
                    num = inputDTO.maxLength;
                }
                if ((i11 & 4) != 0) {
                    num2 = inputDTO.rows;
                }
                if ((i11 & 8) != 0) {
                    bool = inputDTO.resize;
                }
                if ((i11 & 16) != 0) {
                    bool2 = inputDTO.scrollBar;
                }
                Boolean bool3 = bool2;
                Integer num3 = num2;
                return inputDTO.copy(str, num, num3, bool, bool3);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getMaxLength() {
                return this.maxLength;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getRows() {
                return this.rows;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getResize() {
                return this.resize;
            }

            /* renamed from: component5, reason: from getter */
            public final Boolean getScrollBar() {
                return this.scrollBar;
            }

            @NotNull
            public final InputDTO copy(@NotNull String label, Integer maxLength, Integer rows, Boolean resize, Boolean scrollBar) {
                Intrinsics.checkNotNullParameter(label, "label");
                return new InputDTO(label, maxLength, rows, resize, scrollBar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InputDTO)) {
                    return false;
                }
                InputDTO inputDTO = (InputDTO) other;
                return Intrinsics.d(this.label, inputDTO.label) && Intrinsics.d(this.maxLength, inputDTO.maxLength) && Intrinsics.d(this.rows, inputDTO.rows) && Intrinsics.d(this.resize, inputDTO.resize) && Intrinsics.d(this.scrollBar, inputDTO.scrollBar);
            }

            @NotNull
            public final String getLabel() {
                return this.label;
            }

            public final Integer getMaxLength() {
                return this.maxLength;
            }

            public final Boolean getResize() {
                return this.resize;
            }

            public final Integer getRows() {
                return this.rows;
            }

            public final Boolean getScrollBar() {
                return this.scrollBar;
            }

            public int hashCode() {
                int hashCode = this.label.hashCode() * 31;
                Integer num = this.maxLength;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.rows;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.resize;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.scrollBar;
                return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.label;
                Integer num = this.maxLength;
                Integer num2 = this.rows;
                Boolean bool = this.resize;
                Boolean bool2 = this.scrollBar;
                StringBuilder b11 = P.b("InputDTO(label=", str, num, ", maxLength=", ", rows=");
                C2860c.f(bool, num2, ", resize=", ", scrollBar=", b11);
                return g.d(b11, bool2, ")");
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "PLAIN", "CUSTOM", "AUTO_DISMISS", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OptionType {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ OptionType[] $VALUES;
            public static final OptionType INVALID = new OptionType("INVALID", 0);
            public static final OptionType PLAIN = new OptionType("PLAIN", 1);
            public static final OptionType CUSTOM = new OptionType("CUSTOM", 2);
            public static final OptionType AUTO_DISMISS = new OptionType("AUTO_DISMISS", 3);

            private static final /* synthetic */ OptionType[] $values() {
                return new OptionType[]{INVALID, PLAIN, CUSTOM, AUTO_DISMISS};
            }

            static {
                OptionType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private OptionType(String str, int i11) {
            }

            public static OptionType valueOf(String str) {
                return (OptionType) Enum.valueOf(OptionType.class, str);
            }

            public static OptionType[] values() {
                return (OptionType[]) $VALUES.clone();
            }
        }

        public OptionDTO(@NotNull CellDTO cell, InputDTO inputDTO, @NotNull OptionType type) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(type, "type");
            this.cell = cell;
            this.input = inputDTO;
            this.type = type;
        }

        public static /* synthetic */ OptionDTO copy$default(OptionDTO optionDTO, CellDTO cellDTO, InputDTO inputDTO, OptionType optionType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = optionDTO.cell;
            }
            if ((i11 & 2) != 0) {
                inputDTO = optionDTO.input;
            }
            if ((i11 & 4) != 0) {
                optionType = optionDTO.type;
            }
            return optionDTO.copy(cellDTO, inputDTO, optionType);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        /* renamed from: component2, reason: from getter */
        public final InputDTO getInput() {
            return this.input;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final OptionType getType() {
            return this.type;
        }

        @NotNull
        public final OptionDTO copy(@NotNull CellDTO cell, InputDTO input, @NotNull OptionType type) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(type, "type");
            return new OptionDTO(cell, input, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionDTO)) {
                return false;
            }
            OptionDTO optionDTO = (OptionDTO) other;
            return Intrinsics.d(this.cell, optionDTO.cell) && Intrinsics.d(this.input, optionDTO.input) && this.type == optionDTO.type;
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final InputDTO getInput() {
            return this.input;
        }

        @NotNull
        public final OptionType getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.cell.hashCode() * 31;
            InputDTO inputDTO = this.input;
            return this.type.hashCode() + ((hashCode + (inputDTO == null ? 0 : inputDTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "OptionDTO(cell=" + this.cell + ", input=" + this.input + ", type=" + this.type + ")";
        }
    }

    public FeedbackFormV2DTO(@NotNull List<OptionDTO> options, ActionsDTO actionsDTO, NotificationWrapper notificationWrapper) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        this.actions = actionsDTO;
        this.notification = notificationWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackFormV2DTO copy$default(FeedbackFormV2DTO feedbackFormV2DTO, List list, ActionsDTO actionsDTO, NotificationWrapper notificationWrapper, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = feedbackFormV2DTO.options;
        }
        if ((i11 & 2) != 0) {
            actionsDTO = feedbackFormV2DTO.actions;
        }
        if ((i11 & 4) != 0) {
            notificationWrapper = feedbackFormV2DTO.notification;
        }
        return feedbackFormV2DTO.copy(list, actionsDTO, notificationWrapper);
    }

    @NotNull
    public final List<OptionDTO> component1() {
        return this.options;
    }

    /* renamed from: component2, reason: from getter */
    public final ActionsDTO getActions() {
        return this.actions;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationWrapper getNotification() {
        return this.notification;
    }

    @NotNull
    public final FeedbackFormV2DTO copy(@NotNull List<OptionDTO> options, ActionsDTO actions, NotificationWrapper notification) {
        Intrinsics.checkNotNullParameter(options, "options");
        return new FeedbackFormV2DTO(options, actions, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackFormV2DTO)) {
            return false;
        }
        FeedbackFormV2DTO feedbackFormV2DTO = (FeedbackFormV2DTO) other;
        return Intrinsics.d(this.options, feedbackFormV2DTO.options) && Intrinsics.d(this.actions, feedbackFormV2DTO.actions) && Intrinsics.d(this.notification, feedbackFormV2DTO.notification);
    }

    public final ActionsDTO getActions() {
        return this.actions;
    }

    public final NotificationWrapper getNotification() {
        return this.notification;
    }

    @NotNull
    public final List<OptionDTO> getOptions() {
        return this.options;
    }

    public int hashCode() {
        int hashCode = this.options.hashCode() * 31;
        ActionsDTO actionsDTO = this.actions;
        int hashCode2 = (hashCode + (actionsDTO == null ? 0 : actionsDTO.hashCode())) * 31;
        NotificationWrapper notificationWrapper = this.notification;
        return hashCode2 + (notificationWrapper != null ? notificationWrapper.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FeedbackFormV2DTO(options=" + this.options + ", actions=" + this.actions + ", notification=" + this.notification + ")";
    }
}
