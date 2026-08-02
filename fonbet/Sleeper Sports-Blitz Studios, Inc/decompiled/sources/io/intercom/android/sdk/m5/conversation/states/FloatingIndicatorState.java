package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "", "JumpToBottomIndicator", "FooterNoticeIndicator", "None", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$FooterNoticeIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$JumpToBottomIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$None;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface FloatingIndicatorState {

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$JumpToBottomIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "jumpToBottomButtonState", "Lio/intercom/android/sdk/m5/conversation/states/JumpToBottomButtonState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/JumpToBottomButtonState;)V", "getJumpToBottomButtonState", "()Lio/intercom/android/sdk/m5/conversation/states/JumpToBottomButtonState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class JumpToBottomIndicator implements FloatingIndicatorState {
        public static final int $stable = 0;
        private final JumpToBottomButtonState jumpToBottomButtonState;

        public static /* synthetic */ JumpToBottomIndicator copy$default(JumpToBottomIndicator jumpToBottomIndicator, JumpToBottomButtonState jumpToBottomButtonState, int i, Object obj) {
            if ((i & 1) != 0) {
                jumpToBottomButtonState = jumpToBottomIndicator.jumpToBottomButtonState;
            }
            return jumpToBottomIndicator.copy(jumpToBottomButtonState);
        }

        /* renamed from: component1, reason: from getter */
        public final JumpToBottomButtonState getJumpToBottomButtonState() {
            return this.jumpToBottomButtonState;
        }

        public final JumpToBottomIndicator copy(JumpToBottomButtonState jumpToBottomButtonState) {
            Intrinsics.checkNotNullParameter(jumpToBottomButtonState, "jumpToBottomButtonState");
            return new JumpToBottomIndicator(jumpToBottomButtonState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof JumpToBottomIndicator) && Intrinsics.areEqual(this.jumpToBottomButtonState, ((JumpToBottomIndicator) other).jumpToBottomButtonState);
        }

        public int hashCode() {
            return this.jumpToBottomButtonState.hashCode();
        }

        public String toString() {
            return "JumpToBottomIndicator(jumpToBottomButtonState=" + this.jumpToBottomButtonState + ')';
        }

        public JumpToBottomIndicator(JumpToBottomButtonState jumpToBottomButtonState) {
            Intrinsics.checkNotNullParameter(jumpToBottomButtonState, "jumpToBottomButtonState");
            this.jumpToBottomButtonState = jumpToBottomButtonState;
        }

        public final JumpToBottomButtonState getJumpToBottomButtonState() {
            return this.jumpToBottomButtonState;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$FooterNoticeIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "footerNoticeState", "Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;)V", "getFooterNoticeState", "()Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FooterNoticeIndicator implements FloatingIndicatorState {
        public static final int $stable = 8;
        private final FooterNoticeState footerNoticeState;

        public static /* synthetic */ FooterNoticeIndicator copy$default(FooterNoticeIndicator footerNoticeIndicator, FooterNoticeState footerNoticeState, int i, Object obj) {
            if ((i & 1) != 0) {
                footerNoticeState = footerNoticeIndicator.footerNoticeState;
            }
            return footerNoticeIndicator.copy(footerNoticeState);
        }

        /* renamed from: component1, reason: from getter */
        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        public final FooterNoticeIndicator copy(FooterNoticeState footerNoticeState) {
            Intrinsics.checkNotNullParameter(footerNoticeState, "footerNoticeState");
            return new FooterNoticeIndicator(footerNoticeState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FooterNoticeIndicator) && Intrinsics.areEqual(this.footerNoticeState, ((FooterNoticeIndicator) other).footerNoticeState);
        }

        public int hashCode() {
            return this.footerNoticeState.hashCode();
        }

        public String toString() {
            return "FooterNoticeIndicator(footerNoticeState=" + this.footerNoticeState + ')';
        }

        public FooterNoticeIndicator(FooterNoticeState footerNoticeState) {
            Intrinsics.checkNotNullParameter(footerNoticeState, "footerNoticeState");
            this.footerNoticeState = footerNoticeState;
        }

        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$None;", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None implements FloatingIndicatorState {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof None)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1010280075;
        }

        public String toString() {
            return "None";
        }

        private None() {
        }
    }
}
