package ru.ozon.app.android.storefront.widgets.fashionOnboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingDialogState;", "", "<init>", "()V", "Error", "StartAnimation", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingDialogState$Error;", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingDialogState$StartAnimation;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class OnBoardingDialogState {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingDialogState$Error;", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingDialogState;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends OnBoardingDialogState {

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingDialogState$StartAnimation;", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingDialogState;", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingVO;", "onBoardingVO", "<init>", "(Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingVO;", "getOnBoardingVO", "()Lru/ozon/app/android/storefront/widgets/fashionOnboarding/OnBoardingVO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartAnimation extends OnBoardingDialogState {

        @NotNull
        private final OnBoardingVO onBoardingVO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartAnimation(@NotNull OnBoardingVO onBoardingVO) {
            super(null);
            Intrinsics.checkNotNullParameter(onBoardingVO, "onBoardingVO");
            this.onBoardingVO = onBoardingVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartAnimation) && Intrinsics.d(this.onBoardingVO, ((StartAnimation) other).onBoardingVO);
        }

        @NotNull
        public final OnBoardingVO getOnBoardingVO() {
            return this.onBoardingVO;
        }

        public int hashCode() {
            return this.onBoardingVO.hashCode();
        }

        @NotNull
        public String toString() {
            return "StartAnimation(onBoardingVO=" + this.onBoardingVO + ")";
        }
    }

    public /* synthetic */ OnBoardingDialogState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OnBoardingDialogState() {
    }
}
