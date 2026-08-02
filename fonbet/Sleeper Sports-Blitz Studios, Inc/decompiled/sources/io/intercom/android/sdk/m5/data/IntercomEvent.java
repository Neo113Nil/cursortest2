package io.intercom.android.sdk.m5.data;

import android.app.Activity;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.Conversation;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomDataLayer.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent;", "", "<init>", "()V", "NewConversation", "CardUpdated", "BaseResponseReceived", "SoftReset", "AppEnteredForeground", "ActivityReadyForViewAttachment", "ActivityPaused", "ActivityStopped", "AppEnteredBackground", "Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityPaused;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityReadyForViewAttachment;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityStopped;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$AppEnteredBackground;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$AppEnteredForeground;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$BaseResponseReceived;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$CardUpdated;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$NewConversation;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$SoftReset;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class IntercomEvent {
    public static final int $stable = 0;

    public /* synthetic */ IntercomEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: IntercomDataLayer.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$NewConversation;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "<init>", "(Lio/intercom/android/sdk/models/Conversation;)V", "getConversation", "()Lio/intercom/android/sdk/models/Conversation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewConversation extends IntercomEvent {
        public static final int $stable = 8;
        private final Conversation conversation;

        public static /* synthetic */ NewConversation copy$default(NewConversation newConversation, Conversation conversation, int i, Object obj) {
            if ((i & 1) != 0) {
                conversation = newConversation.conversation;
            }
            return newConversation.copy(conversation);
        }

        /* renamed from: component1, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        public final NewConversation copy(Conversation conversation) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            return new NewConversation(conversation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewConversation) && Intrinsics.areEqual(this.conversation, ((NewConversation) other).conversation);
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        public String toString() {
            return "NewConversation(conversation=" + this.conversation + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewConversation(Conversation conversation) {
            super(null);
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.conversation = conversation;
        }

        public final Conversation getConversation() {
            return this.conversation;
        }
    }

    private IntercomEvent() {
    }

    /* compiled from: IntercomDataLayer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$CardUpdated;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CardUpdated extends IntercomEvent {
        public static final int $stable = 0;
        public static final CardUpdated INSTANCE = new CardUpdated();

        private CardUpdated() {
            super(null);
        }
    }

    /* compiled from: IntercomDataLayer.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$BaseResponseReceived;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "baseResponse", "Lio/intercom/android/sdk/models/BaseResponse;", "<init>", "(Lio/intercom/android/sdk/models/BaseResponse;)V", "getBaseResponse", "()Lio/intercom/android/sdk/models/BaseResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BaseResponseReceived extends IntercomEvent {
        public static final int $stable = 8;
        private final BaseResponse baseResponse;

        public static /* synthetic */ BaseResponseReceived copy$default(BaseResponseReceived baseResponseReceived, BaseResponse baseResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                baseResponse = baseResponseReceived.baseResponse;
            }
            return baseResponseReceived.copy(baseResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final BaseResponse getBaseResponse() {
            return this.baseResponse;
        }

        public final BaseResponseReceived copy(BaseResponse baseResponse) {
            Intrinsics.checkNotNullParameter(baseResponse, "baseResponse");
            return new BaseResponseReceived(baseResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BaseResponseReceived) && Intrinsics.areEqual(this.baseResponse, ((BaseResponseReceived) other).baseResponse);
        }

        public int hashCode() {
            return this.baseResponse.hashCode();
        }

        public String toString() {
            return "BaseResponseReceived(baseResponse=" + this.baseResponse + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseResponseReceived(BaseResponse baseResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(baseResponse, "baseResponse");
            this.baseResponse = baseResponse;
        }

        public final BaseResponse getBaseResponse() {
            return this.baseResponse;
        }
    }

    /* compiled from: IntercomDataLayer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$SoftReset;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SoftReset extends IntercomEvent {
        public static final int $stable = 0;
        public static final SoftReset INSTANCE = new SoftReset();

        private SoftReset() {
            super(null);
        }
    }

    /* compiled from: IntercomDataLayer.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$AppEnteredForeground;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "timestamp", "", "<init>", "(J)V", "getTimestamp", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AppEnteredForeground extends IntercomEvent {
        public static final int $stable = 0;
        private final long timestamp;

        public static /* synthetic */ AppEnteredForeground copy$default(AppEnteredForeground appEnteredForeground, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = appEnteredForeground.timestamp;
            }
            return appEnteredForeground.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final AppEnteredForeground copy(long timestamp) {
            return new AppEnteredForeground(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AppEnteredForeground) && this.timestamp == ((AppEnteredForeground) other).timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "AppEnteredForeground(timestamp=" + this.timestamp + ')';
        }

        public AppEnteredForeground(long j) {
            super(null);
            this.timestamp = j;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }
    }

    /* compiled from: IntercomDataLayer.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityReadyForViewAttachment;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActivityReadyForViewAttachment extends IntercomEvent {
        public static final int $stable = 8;
        private final Activity activity;

        public static /* synthetic */ ActivityReadyForViewAttachment copy$default(ActivityReadyForViewAttachment activityReadyForViewAttachment, Activity activity, int i, Object obj) {
            if ((i & 1) != 0) {
                activity = activityReadyForViewAttachment.activity;
            }
            return activityReadyForViewAttachment.copy(activity);
        }

        /* renamed from: component1, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        public final ActivityReadyForViewAttachment copy(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new ActivityReadyForViewAttachment(activity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActivityReadyForViewAttachment) && Intrinsics.areEqual(this.activity, ((ActivityReadyForViewAttachment) other).activity);
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "ActivityReadyForViewAttachment(activity=" + this.activity + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityReadyForViewAttachment(Activity activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        public final Activity getActivity() {
            return this.activity;
        }
    }

    /* compiled from: IntercomDataLayer.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityPaused;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActivityPaused extends IntercomEvent {
        public static final int $stable = 8;
        private final Activity activity;

        public static /* synthetic */ ActivityPaused copy$default(ActivityPaused activityPaused, Activity activity, int i, Object obj) {
            if ((i & 1) != 0) {
                activity = activityPaused.activity;
            }
            return activityPaused.copy(activity);
        }

        /* renamed from: component1, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        public final ActivityPaused copy(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new ActivityPaused(activity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActivityPaused) && Intrinsics.areEqual(this.activity, ((ActivityPaused) other).activity);
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "ActivityPaused(activity=" + this.activity + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityPaused(Activity activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        public final Activity getActivity() {
            return this.activity;
        }
    }

    /* compiled from: IntercomDataLayer.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityStopped;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActivityStopped extends IntercomEvent {
        public static final int $stable = 8;
        private final Activity activity;

        public static /* synthetic */ ActivityStopped copy$default(ActivityStopped activityStopped, Activity activity, int i, Object obj) {
            if ((i & 1) != 0) {
                activity = activityStopped.activity;
            }
            return activityStopped.copy(activity);
        }

        /* renamed from: component1, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        public final ActivityStopped copy(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new ActivityStopped(activity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActivityStopped) && Intrinsics.areEqual(this.activity, ((ActivityStopped) other).activity);
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "ActivityStopped(activity=" + this.activity + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityStopped(Activity activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        public final Activity getActivity() {
            return this.activity;
        }
    }

    /* compiled from: IntercomDataLayer.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$AppEnteredBackground;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "timestamp", "", "<init>", "(J)V", "getTimestamp", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AppEnteredBackground extends IntercomEvent {
        public static final int $stable = 0;
        private final long timestamp;

        public static /* synthetic */ AppEnteredBackground copy$default(AppEnteredBackground appEnteredBackground, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = appEnteredBackground.timestamp;
            }
            return appEnteredBackground.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final AppEnteredBackground copy(long timestamp) {
            return new AppEnteredBackground(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AppEnteredBackground) && this.timestamp == ((AppEnteredBackground) other).timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "AppEnteredBackground(timestamp=" + this.timestamp + ')';
        }

        public AppEnteredBackground(long j) {
            super(null);
            this.timestamp = j;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }
    }
}
