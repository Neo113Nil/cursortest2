package com.zoho.salesiq.core.config;

import androidx.annotation.Keep;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig;", "", "()V", "BinaryRating", "BypassCreditCardMaskingConsent", "CarouselCardImageVisibility", "CarouselCardOrientation", "FallbackDepartmentsOnReopenIfOffline", "FeedbackCardsDeletionExpiryDuration", "IncludeVisitorInfoWithDisplayFields", "JwtExpiryReductionDuration", "ReplyEnabled", "StopAVLibraryInitialization", "UseCustomTransferInfoMessage", "Lcom/zoho/salesiq/core/config/SalesIQConfig$BinaryRating;", "Lcom/zoho/salesiq/core/config/SalesIQConfig$BypassCreditCardMaskingConsent;", "Lcom/zoho/salesiq/core/config/SalesIQConfig$CarouselCardImageVisibility;", "Lcom/zoho/salesiq/core/config/SalesIQConfig$CarouselCardOrientation;", "Lcom/zoho/salesiq/core/config/SalesIQConfig$FallbackDepartmentsOnReopenIfOffline;", "Lcom/zoho/salesiq/core/config/SalesIQConfig$FeedbackCardsDeletionExpiryDuration;", "Lcom/zoho/salesiq/core/config/SalesIQConfig$IncludeVisitorInfoWithDisplayFields;", "Lcom/zoho/salesiq/core/config/SalesIQConfig$JwtExpiryReductionDuration;", "Lcom/zoho/salesiq/core/config/SalesIQConfig$ReplyEnabled;", "Lcom/zoho/salesiq/core/config/SalesIQConfig$StopAVLibraryInitialization;", "Lcom/zoho/salesiq/core/config/SalesIQConfig$UseCustomTransferInfoMessage;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SalesIQConfig {

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig$BinaryRating;", "Lcom/zoho/salesiq/core/config/SalesIQConfig;", ViewProps.ENABLED, "", "(Z)V", "getEnabled", "()Z", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BinaryRating extends SalesIQConfig {
        private final boolean enabled;

        public BinaryRating() {
            this(false, 1, null);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public BinaryRating(boolean z10) {
            super(null);
            this.enabled = z10;
        }

        public /* synthetic */ BinaryRating(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig$BypassCreditCardMaskingConsent;", "Lcom/zoho/salesiq/core/config/SalesIQConfig;", ViewProps.ENABLED, "", "(Z)V", "getEnabled", "()Z", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BypassCreditCardMaskingConsent extends SalesIQConfig {
        private final boolean enabled;

        public BypassCreditCardMaskingConsent() {
            this(false, 1, null);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public BypassCreditCardMaskingConsent(boolean z10) {
            super(null);
            this.enabled = z10;
        }

        public /* synthetic */ BypassCreditCardMaskingConsent(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig$CarouselCardImageVisibility;", "Lcom/zoho/salesiq/core/config/SalesIQConfig;", ViewProps.ENABLED, "", "(Z)V", "getEnabled", "()Z", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CarouselCardImageVisibility extends SalesIQConfig {
        private final boolean enabled;

        public CarouselCardImageVisibility() {
            this(false, 1, null);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public CarouselCardImageVisibility(boolean z10) {
            super(null);
            this.enabled = z10;
        }

        public /* synthetic */ CarouselCardImageVisibility(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig$CarouselCardOrientation;", "Lcom/zoho/salesiq/core/config/SalesIQConfig;", "orientation", "", "(Ljava/lang/String;)V", "getOrientation", "()Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CarouselCardOrientation extends SalesIQConfig {

        @NotNull
        private final String orientation;

        /* JADX WARN: Multi-variable type inference failed */
        public CarouselCardOrientation() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final String getOrientation() {
            return this.orientation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CarouselCardOrientation(@NotNull String orientation) {
            super(null);
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            this.orientation = orientation;
        }

        public /* synthetic */ CarouselCardOrientation(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "horizontal" : str);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig$FallbackDepartmentsOnReopenIfOffline;", "Lcom/zoho/salesiq/core/config/SalesIQConfig;", ViewProps.ENABLED, "", "(Z)V", "getEnabled", "()Z", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FallbackDepartmentsOnReopenIfOffline extends SalesIQConfig {
        private final boolean enabled;

        public FallbackDepartmentsOnReopenIfOffline() {
            this(false, 1, null);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public FallbackDepartmentsOnReopenIfOffline(boolean z10) {
            super(null);
            this.enabled = z10;
        }

        public /* synthetic */ FallbackDepartmentsOnReopenIfOffline(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig$FeedbackCardsDeletionExpiryDuration;", "Lcom/zoho/salesiq/core/config/SalesIQConfig;", "millis", "", "(Ljava/lang/Long;)V", "getMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FeedbackCardsDeletionExpiryDuration extends SalesIQConfig {

        @Nullable
        private final Long millis;

        public FeedbackCardsDeletionExpiryDuration(@Nullable Long l10) {
            super(null);
            this.millis = l10;
        }

        @Nullable
        public final Long getMillis() {
            return this.millis;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig$IncludeVisitorInfoWithDisplayFields;", "Lcom/zoho/salesiq/core/config/SalesIQConfig;", ViewProps.ENABLED, "", "(Z)V", "getEnabled", "()Z", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IncludeVisitorInfoWithDisplayFields extends SalesIQConfig {
        private final boolean enabled;

        public IncludeVisitorInfoWithDisplayFields() {
            this(false, 1, null);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public IncludeVisitorInfoWithDisplayFields(boolean z10) {
            super(null);
            this.enabled = z10;
        }

        public /* synthetic */ IncludeVisitorInfoWithDisplayFields(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig$JwtExpiryReductionDuration;", "Lcom/zoho/salesiq/core/config/SalesIQConfig;", "millis", "", "(Ljava/lang/Long;)V", "getMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class JwtExpiryReductionDuration extends SalesIQConfig {

        @Nullable
        private final Long millis;

        public JwtExpiryReductionDuration(@Nullable Long l10) {
            super(null);
            this.millis = l10;
        }

        @Nullable
        public final Long getMillis() {
            return this.millis;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig$ReplyEnabled;", "Lcom/zoho/salesiq/core/config/SalesIQConfig;", ViewProps.ENABLED, "", "(Z)V", "getEnabled", "()Z", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReplyEnabled extends SalesIQConfig {
        private final boolean enabled;

        public ReplyEnabled() {
            this(false, 1, null);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public ReplyEnabled(boolean z10) {
            super(null);
            this.enabled = z10;
        }

        public /* synthetic */ ReplyEnabled(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig$StopAVLibraryInitialization;", "Lcom/zoho/salesiq/core/config/SalesIQConfig;", ViewProps.ENABLED, "", "(Z)V", "getEnabled", "()Z", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StopAVLibraryInitialization extends SalesIQConfig {
        private final boolean enabled;

        public StopAVLibraryInitialization() {
            this(false, 1, null);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public StopAVLibraryInitialization(boolean z10) {
            super(null);
            this.enabled = z10;
        }

        public /* synthetic */ StopAVLibraryInitialization(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/zoho/salesiq/core/config/SalesIQConfig$UseCustomTransferInfoMessage;", "Lcom/zoho/salesiq/core/config/SalesIQConfig;", ViewProps.ENABLED, "", "(Z)V", "getEnabled", "()Z", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UseCustomTransferInfoMessage extends SalesIQConfig {
        private final boolean enabled;

        public UseCustomTransferInfoMessage() {
            this(false, 1, null);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public UseCustomTransferInfoMessage(boolean z10) {
            super(null);
            this.enabled = z10;
        }

        public /* synthetic */ UseCustomTransferInfoMessage(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }

    public /* synthetic */ SalesIQConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SalesIQConfig() {
    }
}
