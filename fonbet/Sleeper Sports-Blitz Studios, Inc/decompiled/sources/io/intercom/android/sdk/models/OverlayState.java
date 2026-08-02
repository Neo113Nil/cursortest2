package io.intercom.android.sdk.models;

import android.app.Activity;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OverlayState.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u0000 52\u00020\u0001:\u00015Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003Js\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÇ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00103\u001a\u00020\u0007H×\u0001J\t\u00104\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$¨\u00066"}, d2 = {"Lio/intercom/android/sdk/models/OverlayState;", "", "surveyData", "Lio/intercom/android/sdk/survey/model/SurveyData;", "carousel", "Lio/intercom/android/sdk/models/carousel/Carousel;", "bottomPadding", "", "launcherVisibility", "Lio/intercom/android/sdk/Intercom$Visibility;", "inAppNotificationsVisibility", "conversations", "", "Lio/intercom/android/sdk/models/Conversation;", "dismissedPartIds", "", "", "resumedHostActivity", "Landroid/app/Activity;", "pausedHostActivity", "<init>", "(Lio/intercom/android/sdk/survey/model/SurveyData;Lio/intercom/android/sdk/models/carousel/Carousel;ILio/intercom/android/sdk/Intercom$Visibility;Lio/intercom/android/sdk/Intercom$Visibility;Ljava/util/List;Ljava/util/Set;Landroid/app/Activity;Landroid/app/Activity;)V", "getSurveyData", "()Lio/intercom/android/sdk/survey/model/SurveyData;", "getCarousel", "()Lio/intercom/android/sdk/models/carousel/Carousel;", "getBottomPadding", "()I", "getLauncherVisibility", "()Lio/intercom/android/sdk/Intercom$Visibility;", "getInAppNotificationsVisibility", "getConversations", "()Ljava/util/List;", "getDismissedPartIds", "()Ljava/util/Set;", "getResumedHostActivity", "()Landroid/app/Activity;", "getPausedHostActivity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OverlayState {
    private final int bottomPadding;
    private final Carousel carousel;
    private final List<Conversation> conversations;
    private final Set<String> dismissedPartIds;
    private final Intercom.Visibility inAppNotificationsVisibility;
    private final Intercom.Visibility launcherVisibility;
    private final Activity pausedHostActivity;
    private final Activity resumedHostActivity;
    private final SurveyData surveyData;
    public static final int $stable = 8;
    public static final OverlayState NULL = new OverlayState(null, null, 0, null, null, null, null, null, null, 511, null);

    public OverlayState() {
        this(null, null, 0, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ OverlayState copy$default(OverlayState overlayState, SurveyData surveyData, Carousel carousel, int i, Intercom.Visibility visibility, Intercom.Visibility visibility2, List list, Set set, Activity activity, Activity activity2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            surveyData = overlayState.surveyData;
        }
        if ((i2 & 2) != 0) {
            carousel = overlayState.carousel;
        }
        if ((i2 & 4) != 0) {
            i = overlayState.bottomPadding;
        }
        if ((i2 & 8) != 0) {
            visibility = overlayState.launcherVisibility;
        }
        if ((i2 & 16) != 0) {
            visibility2 = overlayState.inAppNotificationsVisibility;
        }
        if ((i2 & 32) != 0) {
            list = overlayState.conversations;
        }
        if ((i2 & 64) != 0) {
            set = overlayState.dismissedPartIds;
        }
        if ((i2 & 128) != 0) {
            activity = overlayState.resumedHostActivity;
        }
        if ((i2 & 256) != 0) {
            activity2 = overlayState.pausedHostActivity;
        }
        Activity activity3 = activity;
        Activity activity4 = activity2;
        List list2 = list;
        Set set2 = set;
        Intercom.Visibility visibility3 = visibility2;
        int i3 = i;
        return overlayState.copy(surveyData, carousel, i3, visibility, visibility3, list2, set2, activity3, activity4);
    }

    /* renamed from: component1, reason: from getter */
    public final SurveyData getSurveyData() {
        return this.surveyData;
    }

    /* renamed from: component2, reason: from getter */
    public final Carousel getCarousel() {
        return this.carousel;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final Intercom.Visibility getLauncherVisibility() {
        return this.launcherVisibility;
    }

    /* renamed from: component5, reason: from getter */
    public final Intercom.Visibility getInAppNotificationsVisibility() {
        return this.inAppNotificationsVisibility;
    }

    public final List<Conversation> component6() {
        return this.conversations;
    }

    public final Set<String> component7() {
        return this.dismissedPartIds;
    }

    /* renamed from: component8, reason: from getter */
    public final Activity getResumedHostActivity() {
        return this.resumedHostActivity;
    }

    /* renamed from: component9, reason: from getter */
    public final Activity getPausedHostActivity() {
        return this.pausedHostActivity;
    }

    public final OverlayState copy(SurveyData surveyData, Carousel carousel, int bottomPadding, Intercom.Visibility launcherVisibility, Intercom.Visibility inAppNotificationsVisibility, List<Conversation> conversations, Set<String> dismissedPartIds, Activity resumedHostActivity, Activity pausedHostActivity) {
        Intrinsics.checkNotNullParameter(surveyData, "surveyData");
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        Intrinsics.checkNotNullParameter(launcherVisibility, "launcherVisibility");
        Intrinsics.checkNotNullParameter(inAppNotificationsVisibility, "inAppNotificationsVisibility");
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        Intrinsics.checkNotNullParameter(dismissedPartIds, "dismissedPartIds");
        return new OverlayState(surveyData, carousel, bottomPadding, launcherVisibility, inAppNotificationsVisibility, conversations, dismissedPartIds, resumedHostActivity, pausedHostActivity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayState)) {
            return false;
        }
        OverlayState overlayState = (OverlayState) other;
        return Intrinsics.areEqual(this.surveyData, overlayState.surveyData) && Intrinsics.areEqual(this.carousel, overlayState.carousel) && this.bottomPadding == overlayState.bottomPadding && this.launcherVisibility == overlayState.launcherVisibility && this.inAppNotificationsVisibility == overlayState.inAppNotificationsVisibility && Intrinsics.areEqual(this.conversations, overlayState.conversations) && Intrinsics.areEqual(this.dismissedPartIds, overlayState.dismissedPartIds) && Intrinsics.areEqual(this.resumedHostActivity, overlayState.resumedHostActivity) && Intrinsics.areEqual(this.pausedHostActivity, overlayState.pausedHostActivity);
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.surveyData.hashCode() * 31) + this.carousel.hashCode()) * 31) + Integer.hashCode(this.bottomPadding)) * 31) + this.launcherVisibility.hashCode()) * 31) + this.inAppNotificationsVisibility.hashCode()) * 31) + this.conversations.hashCode()) * 31) + this.dismissedPartIds.hashCode()) * 31;
        Activity activity = this.resumedHostActivity;
        int hashCode2 = (hashCode + (activity == null ? 0 : activity.hashCode())) * 31;
        Activity activity2 = this.pausedHostActivity;
        return hashCode2 + (activity2 != null ? activity2.hashCode() : 0);
    }

    public String toString() {
        return "OverlayState(surveyData=" + this.surveyData + ", carousel=" + this.carousel + ", bottomPadding=" + this.bottomPadding + ", launcherVisibility=" + this.launcherVisibility + ", inAppNotificationsVisibility=" + this.inAppNotificationsVisibility + ", conversations=" + this.conversations + ", dismissedPartIds=" + this.dismissedPartIds + ", resumedHostActivity=" + this.resumedHostActivity + ", pausedHostActivity=" + this.pausedHostActivity + ')';
    }

    public OverlayState(SurveyData surveyData, Carousel carousel, int i, Intercom.Visibility launcherVisibility, Intercom.Visibility inAppNotificationsVisibility, List<Conversation> conversations, Set<String> dismissedPartIds, Activity activity, Activity activity2) {
        Intrinsics.checkNotNullParameter(surveyData, "surveyData");
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        Intrinsics.checkNotNullParameter(launcherVisibility, "launcherVisibility");
        Intrinsics.checkNotNullParameter(inAppNotificationsVisibility, "inAppNotificationsVisibility");
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        Intrinsics.checkNotNullParameter(dismissedPartIds, "dismissedPartIds");
        this.surveyData = surveyData;
        this.carousel = carousel;
        this.bottomPadding = i;
        this.launcherVisibility = launcherVisibility;
        this.inAppNotificationsVisibility = inAppNotificationsVisibility;
        this.conversations = conversations;
        this.dismissedPartIds = dismissedPartIds;
        this.resumedHostActivity = activity;
        this.pausedHostActivity = activity2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OverlayState(io.intercom.android.sdk.survey.model.SurveyData r2, io.intercom.android.sdk.models.carousel.Carousel r3, int r4, io.intercom.android.sdk.Intercom.Visibility r5, io.intercom.android.sdk.Intercom.Visibility r6, java.util.List r7, java.util.Set r8, android.app.Activity r9, android.app.Activity r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto La
            io.intercom.android.sdk.survey.model.SurveyData$Companion r2 = io.intercom.android.sdk.survey.model.SurveyData.INSTANCE
            io.intercom.android.sdk.survey.model.SurveyData r2 = r2.getNULL()
        La:
            r12 = r11 & 2
            if (r12 == 0) goto L10
            io.intercom.android.sdk.models.carousel.Carousel r3 = io.intercom.android.sdk.models.carousel.Carousel.NULL
        L10:
            r12 = r11 & 4
            if (r12 == 0) goto L15
            r4 = 0
        L15:
            r12 = r11 & 8
            if (r12 == 0) goto L1b
            io.intercom.android.sdk.Intercom$Visibility r5 = io.intercom.android.sdk.Intercom.Visibility.GONE
        L1b:
            r12 = r11 & 16
            if (r12 == 0) goto L21
            io.intercom.android.sdk.Intercom$Visibility r6 = io.intercom.android.sdk.Intercom.Visibility.VISIBLE
        L21:
            r12 = r11 & 32
            if (r12 == 0) goto L29
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L29:
            r12 = r11 & 64
            if (r12 == 0) goto L31
            java.util.Set r8 = kotlin.collections.SetsKt.emptySet()
        L31:
            r12 = r11 & 128(0x80, float:1.8E-43)
            r0 = 0
            if (r12 == 0) goto L37
            r9 = r0
        L37:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L46
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L50
        L46:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L50:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.OverlayState.<init>(io.intercom.android.sdk.survey.model.SurveyData, io.intercom.android.sdk.models.carousel.Carousel, int, io.intercom.android.sdk.Intercom$Visibility, io.intercom.android.sdk.Intercom$Visibility, java.util.List, java.util.Set, android.app.Activity, android.app.Activity, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final SurveyData getSurveyData() {
        return this.surveyData;
    }

    public final Carousel getCarousel() {
        return this.carousel;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final Intercom.Visibility getLauncherVisibility() {
        return this.launcherVisibility;
    }

    public final Intercom.Visibility getInAppNotificationsVisibility() {
        return this.inAppNotificationsVisibility;
    }

    public final List<Conversation> getConversations() {
        return this.conversations;
    }

    public final Set<String> getDismissedPartIds() {
        return this.dismissedPartIds;
    }

    public final Activity getResumedHostActivity() {
        return this.resumedHostActivity;
    }

    public final Activity getPausedHostActivity() {
        return this.pausedHostActivity;
    }
}
