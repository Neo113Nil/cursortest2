package io.intercom.android.sdk.m5.conversation.metrics;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MetricData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "", "<init>", "()V", "MoreMenuClicked", "ConversationsInMoreMenuClicked", "NewConversationInMoreMenuClicked", "TicketsInMoreMenuClicked", "HelpInMoreMenuClicked", "PoweredByClicked", "ComposerInputClicked", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ComposerInputClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ConversationsInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$HelpInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$MoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$NewConversationInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$PoweredByClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$TicketsInMoreMenuClicked;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class MetricData {
    public static final int $stable = 0;

    public /* synthetic */ MetricData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: MetricData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$MoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        public static final MoreMenuClicked INSTANCE = new MoreMenuClicked();

        private MoreMenuClicked() {
            super(null);
        }
    }

    private MetricData() {
    }

    /* compiled from: MetricData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ConversationsInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "isMoreMenuContext", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConversationsInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public static /* synthetic */ ConversationsInMoreMenuClicked copy$default(ConversationsInMoreMenuClicked conversationsInMoreMenuClicked, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = conversationsInMoreMenuClicked.isMoreMenuContext;
            }
            return conversationsInMoreMenuClicked.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        public final ConversationsInMoreMenuClicked copy(boolean isMoreMenuContext) {
            return new ConversationsInMoreMenuClicked(isMoreMenuContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationsInMoreMenuClicked) && this.isMoreMenuContext == ((ConversationsInMoreMenuClicked) other).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public String toString() {
            return "ConversationsInMoreMenuClicked(isMoreMenuContext=" + this.isMoreMenuContext + ')';
        }

        public ConversationsInMoreMenuClicked(boolean z) {
            super(null);
            this.isMoreMenuContext = z;
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }
    }

    /* compiled from: MetricData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$NewConversationInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "isMoreMenuContext", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewConversationInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public static /* synthetic */ NewConversationInMoreMenuClicked copy$default(NewConversationInMoreMenuClicked newConversationInMoreMenuClicked, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = newConversationInMoreMenuClicked.isMoreMenuContext;
            }
            return newConversationInMoreMenuClicked.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        public final NewConversationInMoreMenuClicked copy(boolean isMoreMenuContext) {
            return new NewConversationInMoreMenuClicked(isMoreMenuContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewConversationInMoreMenuClicked) && this.isMoreMenuContext == ((NewConversationInMoreMenuClicked) other).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public String toString() {
            return "NewConversationInMoreMenuClicked(isMoreMenuContext=" + this.isMoreMenuContext + ')';
        }

        public NewConversationInMoreMenuClicked(boolean z) {
            super(null);
            this.isMoreMenuContext = z;
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }
    }

    /* compiled from: MetricData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$TicketsInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "isMoreMenuContext", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketsInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public static /* synthetic */ TicketsInMoreMenuClicked copy$default(TicketsInMoreMenuClicked ticketsInMoreMenuClicked, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = ticketsInMoreMenuClicked.isMoreMenuContext;
            }
            return ticketsInMoreMenuClicked.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        public final TicketsInMoreMenuClicked copy(boolean isMoreMenuContext) {
            return new TicketsInMoreMenuClicked(isMoreMenuContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TicketsInMoreMenuClicked) && this.isMoreMenuContext == ((TicketsInMoreMenuClicked) other).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public String toString() {
            return "TicketsInMoreMenuClicked(isMoreMenuContext=" + this.isMoreMenuContext + ')';
        }

        public TicketsInMoreMenuClicked(boolean z) {
            super(null);
            this.isMoreMenuContext = z;
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }
    }

    /* compiled from: MetricData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$HelpInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HelpInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        public static final HelpInMoreMenuClicked INSTANCE = new HelpInMoreMenuClicked();

        private HelpInMoreMenuClicked() {
            super(null);
        }
    }

    /* compiled from: MetricData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$PoweredByClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PoweredByClicked extends MetricData {
        public static final int $stable = 0;
        public static final PoweredByClicked INSTANCE = new PoweredByClicked();

        private PoweredByClicked() {
            super(null);
        }
    }

    /* compiled from: MetricData.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ComposerInputClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", MetricTracker.Object.INPUT, "", "<init>", "(Ljava/lang/String;)V", "getInput", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ComposerInputClicked extends MetricData {
        public static final int $stable = 0;
        private final String input;

        public static /* synthetic */ ComposerInputClicked copy$default(ComposerInputClicked composerInputClicked, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = composerInputClicked.input;
            }
            return composerInputClicked.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInput() {
            return this.input;
        }

        public final ComposerInputClicked copy(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return new ComposerInputClicked(input);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ComposerInputClicked) && Intrinsics.areEqual(this.input, ((ComposerInputClicked) other).input);
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        public String toString() {
            return "ComposerInputClicked(input=" + this.input + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComposerInputClicked(String input) {
            super(null);
            Intrinsics.checkNotNullParameter(input, "input");
            this.input = input;
        }

        public final String getInput() {
            return this.input;
        }
    }
}
