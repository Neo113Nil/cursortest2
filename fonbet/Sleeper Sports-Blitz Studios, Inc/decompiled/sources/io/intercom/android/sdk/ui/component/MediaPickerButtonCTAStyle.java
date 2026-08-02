package io.intercom.android.sdk.ui.component;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaPickerButton.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;", "", "TextButton", "TopBarButton", "None", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$None;", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$TextButton;", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$TopBarButton;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface MediaPickerButtonCTAStyle {

    /* compiled from: MediaPickerButton.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$TextButton;", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;", "ctaText", "", "<init>", "(Ljava/lang/String;)V", "getCtaText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextButton implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;
        private final String ctaText;

        public static /* synthetic */ TextButton copy$default(TextButton textButton, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textButton.ctaText;
            }
            return textButton.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        public final TextButton copy(String ctaText) {
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            return new TextButton(ctaText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextButton) && Intrinsics.areEqual(this.ctaText, ((TextButton) other).ctaText);
        }

        public int hashCode() {
            return this.ctaText.hashCode();
        }

        public String toString() {
            return "TextButton(ctaText=" + this.ctaText + ')';
        }

        public TextButton(String ctaText) {
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            this.ctaText = ctaText;
        }

        public final String getCtaText() {
            return this.ctaText;
        }
    }

    /* compiled from: MediaPickerButton.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$TopBarButton;", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopBarButton implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;
        public static final TopBarButton INSTANCE = new TopBarButton();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopBarButton)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1620873520;
        }

        public String toString() {
            return "TopBarButton";
        }

        private TopBarButton() {
        }
    }

    /* compiled from: MediaPickerButton.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle$None;", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None implements MediaPickerButtonCTAStyle {
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
            return 1542232760;
        }

        public String toString() {
            return "None";
        }

        private None() {
        }
    }
}
