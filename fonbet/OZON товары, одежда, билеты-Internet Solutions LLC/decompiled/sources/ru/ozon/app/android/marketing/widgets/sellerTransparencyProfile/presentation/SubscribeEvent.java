package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent;", "", "sellerId", "", "<init>", "(Ljava/lang/String;)V", "getSellerId", "()Ljava/lang/String;", "SuccessfulEvent", "ErrorEvent", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent$ErrorEvent;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent$SuccessfulEvent;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class SubscribeEvent {
    private final String sellerId;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent$ErrorEvent;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent;", "", "action", "sellerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ErrorEvent extends SubscribeEvent {

        @NotNull
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorEvent(@NotNull String action, String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent$SuccessfulEvent;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent;", "action", "", "sellerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuccessfulEvent extends SubscribeEvent {

        @NotNull
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessfulEvent(@NotNull String action, String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }
    }

    public /* synthetic */ SubscribeEvent(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    private SubscribeEvent(String str) {
        this.sellerId = str;
    }
}
