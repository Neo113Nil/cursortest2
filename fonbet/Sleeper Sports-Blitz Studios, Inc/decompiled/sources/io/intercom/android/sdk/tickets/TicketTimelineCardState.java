package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.microsoft.codepush.react.CodePushConstants;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketDetailState.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002/0BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001cJd\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÇ\u0001¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010,\u001a\u00020-H×\u0001J\t\u0010.\u001a\u00020\u0006H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketTimelineCardState;", "", "adminAvatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "statusTitle", "", "statusSubtitle", "progressColor", "Landroidx/compose/ui/graphics/Color;", "progressSections", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ProgressSection;", "statusLabel", "timestamp", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdminAvatars", "()Ljava/util/List;", "getStatusTitle", "()Ljava/lang/String;", "getStatusSubtitle", "getProgressColor-0d7_KjU", "()J", "J", "getProgressSections", "getStatusLabel", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component4-0d7_KjU", "component5", "component6", "component7", "copy", "copy-ww6aTOc", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/Long;)Lio/intercom/android/sdk/tickets/TicketTimelineCardState;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "ProgressSection", "ActualStringOrRes", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TicketTimelineCardState {
    public static final int $stable = 8;
    private final List<AvatarWrapper> adminAvatars;
    private final long progressColor;
    private final List<ProgressSection> progressSections;
    private final String statusLabel;
    private final String statusSubtitle;
    private final String statusTitle;
    private final Long timestamp;

    public /* synthetic */ TicketTimelineCardState(List list, String str, String str2, long j, List list2, String str3, Long l, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, j, list2, str3, l);
    }

    /* renamed from: copy-ww6aTOc$default, reason: not valid java name */
    public static /* synthetic */ TicketTimelineCardState m12840copyww6aTOc$default(TicketTimelineCardState ticketTimelineCardState, List list, String str, String str2, long j, List list2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ticketTimelineCardState.adminAvatars;
        }
        if ((i & 2) != 0) {
            str = ticketTimelineCardState.statusTitle;
        }
        if ((i & 4) != 0) {
            str2 = ticketTimelineCardState.statusSubtitle;
        }
        if ((i & 8) != 0) {
            j = ticketTimelineCardState.progressColor;
        }
        if ((i & 16) != 0) {
            list2 = ticketTimelineCardState.progressSections;
        }
        if ((i & 32) != 0) {
            str3 = ticketTimelineCardState.statusLabel;
        }
        if ((i & 64) != 0) {
            l = ticketTimelineCardState.timestamp;
        }
        Long l2 = l;
        List list3 = list2;
        long j2 = j;
        String str4 = str2;
        return ticketTimelineCardState.m12842copyww6aTOc(list, str, str4, j2, list3, str3, l2);
    }

    public final List<AvatarWrapper> component1() {
        return this.adminAvatars;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatusTitle() {
        return this.statusTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatusSubtitle() {
        return this.statusSubtitle;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getProgressColor() {
        return this.progressColor;
    }

    public final List<ProgressSection> component5() {
        return this.progressSections;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStatusLabel() {
        return this.statusLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: copy-ww6aTOc, reason: not valid java name */
    public final TicketTimelineCardState m12842copyww6aTOc(List<AvatarWrapper> adminAvatars, String statusTitle, String statusSubtitle, long progressColor, List<ProgressSection> progressSections, String statusLabel, Long timestamp) {
        Intrinsics.checkNotNullParameter(adminAvatars, "adminAvatars");
        Intrinsics.checkNotNullParameter(statusTitle, "statusTitle");
        Intrinsics.checkNotNullParameter(statusSubtitle, "statusSubtitle");
        Intrinsics.checkNotNullParameter(progressSections, "progressSections");
        Intrinsics.checkNotNullParameter(statusLabel, "statusLabel");
        return new TicketTimelineCardState(adminAvatars, statusTitle, statusSubtitle, progressColor, progressSections, statusLabel, timestamp, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketTimelineCardState)) {
            return false;
        }
        TicketTimelineCardState ticketTimelineCardState = (TicketTimelineCardState) other;
        return Intrinsics.areEqual(this.adminAvatars, ticketTimelineCardState.adminAvatars) && Intrinsics.areEqual(this.statusTitle, ticketTimelineCardState.statusTitle) && Intrinsics.areEqual(this.statusSubtitle, ticketTimelineCardState.statusSubtitle) && Color.m6040equalsimpl0(this.progressColor, ticketTimelineCardState.progressColor) && Intrinsics.areEqual(this.progressSections, ticketTimelineCardState.progressSections) && Intrinsics.areEqual(this.statusLabel, ticketTimelineCardState.statusLabel) && Intrinsics.areEqual(this.timestamp, ticketTimelineCardState.timestamp);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.adminAvatars.hashCode() * 31) + this.statusTitle.hashCode()) * 31) + this.statusSubtitle.hashCode()) * 31) + Color.m6046hashCodeimpl(this.progressColor)) * 31) + this.progressSections.hashCode()) * 31) + this.statusLabel.hashCode()) * 31;
        Long l = this.timestamp;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "TicketTimelineCardState(adminAvatars=" + this.adminAvatars + ", statusTitle=" + this.statusTitle + ", statusSubtitle=" + this.statusSubtitle + ", progressColor=" + ((Object) Color.m6047toStringimpl(this.progressColor)) + ", progressSections=" + this.progressSections + ", statusLabel=" + this.statusLabel + ", timestamp=" + this.timestamp + ')';
    }

    private TicketTimelineCardState(List<AvatarWrapper> adminAvatars, String statusTitle, String statusSubtitle, long j, List<ProgressSection> progressSections, String statusLabel, Long l) {
        Intrinsics.checkNotNullParameter(adminAvatars, "adminAvatars");
        Intrinsics.checkNotNullParameter(statusTitle, "statusTitle");
        Intrinsics.checkNotNullParameter(statusSubtitle, "statusSubtitle");
        Intrinsics.checkNotNullParameter(progressSections, "progressSections");
        Intrinsics.checkNotNullParameter(statusLabel, "statusLabel");
        this.adminAvatars = adminAvatars;
        this.statusTitle = statusTitle;
        this.statusSubtitle = statusSubtitle;
        this.progressColor = j;
        this.progressSections = progressSections;
        this.statusLabel = statusLabel;
        this.timestamp = l;
    }

    public final List<AvatarWrapper> getAdminAvatars() {
        return this.adminAvatars;
    }

    public final String getStatusTitle() {
        return this.statusTitle;
    }

    public final String getStatusSubtitle() {
        return this.statusSubtitle;
    }

    /* renamed from: getProgressColor-0d7_KjU, reason: not valid java name */
    public final long m12843getProgressColor0d7_KjU() {
        return this.progressColor;
    }

    public final List<ProgressSection> getProgressSections() {
        return this.progressSections;
    }

    public final String getStatusLabel() {
        return this.statusLabel;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* compiled from: TicketDetailState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ProgressSection;", "", "isDone", "", CodePushConstants.PENDING_UPDATE_IS_LOADING_KEY, "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressSection {
        public static final int $stable = 0;
        private final boolean isDone;
        private final boolean isLoading;

        public static /* synthetic */ ProgressSection copy$default(ProgressSection progressSection, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = progressSection.isDone;
            }
            if ((i & 2) != 0) {
                z2 = progressSection.isLoading;
            }
            return progressSection.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsDone() {
            return this.isDone;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final ProgressSection copy(boolean isDone, boolean isLoading) {
            return new ProgressSection(isDone, isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressSection)) {
                return false;
            }
            ProgressSection progressSection = (ProgressSection) other;
            return this.isDone == progressSection.isDone && this.isLoading == progressSection.isLoading;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isDone) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "ProgressSection(isDone=" + this.isDone + ", isLoading=" + this.isLoading + ')';
        }

        public ProgressSection(boolean z, boolean z2) {
            this.isDone = z;
            this.isLoading = z2;
        }

        public final boolean isDone() {
            return this.isDone;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }
    }

    /* compiled from: TicketDetailState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes;", "", "<init>", "()V", "getText", "", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "StringRes", "ActualString", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes$ActualString;", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes$StringRes;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated(message = "Use StringProvider instead")
    public static abstract class ActualStringOrRes {
        public static final int $stable = 0;

        public /* synthetic */ ActualStringOrRes(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActualStringOrRes() {
        }

        /* compiled from: TicketDetailState.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes$StringRes;", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes;", "stringRes", "", "<init>", "(I)V", "getStringRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StringRes extends ActualStringOrRes {
            public static final int $stable = 0;
            private final int stringRes;

            public static /* synthetic */ StringRes copy$default(StringRes stringRes, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = stringRes.stringRes;
                }
                return stringRes.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getStringRes() {
                return this.stringRes;
            }

            public final StringRes copy(int stringRes) {
                return new StringRes(stringRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StringRes) && this.stringRes == ((StringRes) other).stringRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.stringRes);
            }

            public String toString() {
                return "StringRes(stringRes=" + this.stringRes + ')';
            }

            public final int getStringRes() {
                return this.stringRes;
            }

            public StringRes(int i) {
                super(null);
                this.stringRes = i;
            }
        }

        /* compiled from: TicketDetailState.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes$ActualString;", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes;", "string", "", "<init>", "(Ljava/lang/String;)V", "getString", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ActualString extends ActualStringOrRes {
            public static final int $stable = 0;
            private final String string;

            public static /* synthetic */ ActualString copy$default(ActualString actualString, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actualString.string;
                }
                return actualString.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getString() {
                return this.string;
            }

            public final ActualString copy(String string) {
                Intrinsics.checkNotNullParameter(string, "string");
                return new ActualString(string);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ActualString) && Intrinsics.areEqual(this.string, ((ActualString) other).string);
            }

            public int hashCode() {
                return this.string.hashCode();
            }

            public String toString() {
                return "ActualString(string=" + this.string + ')';
            }

            public final String getString() {
                return this.string;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActualString(String string) {
                super(null);
                Intrinsics.checkNotNullParameter(string, "string");
                this.string = string;
            }
        }

        public final String getText(Composer composer, int i) {
            String stringResource;
            composer.startReplaceGroup(796462681);
            if (this instanceof ActualString) {
                stringResource = ((ActualString) this).getString();
            } else {
                if (!(this instanceof StringRes)) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResource = StringResources_androidKt.stringResource(((StringRes) this).getStringRes(), composer, 0);
            }
            composer.endReplaceGroup();
            return stringResource;
        }
    }
}
