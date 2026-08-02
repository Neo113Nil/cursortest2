package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshProgressBarVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation.CheckoutButtonVO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00018B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b+\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/presentation/CheckoutButtonVO;", "button", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeInfo", "", "borderColor", "backgroundColor", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalVO$Spacers;", "spacers", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "hasRoundedCorners", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;", "progressBar", "<init>", "(JLru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/presentation/CheckoutButtonVO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalVO$Spacers;LWZ/t;ZLru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/presentation/CheckoutButtonVO;", "getButton", "()Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/presentation/CheckoutButtonVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadgeInfo", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/String;", "getBorderColor", "getBackgroundColor", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalVO$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalVO$Spacers;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getHasRoundedCorners", "()Z", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;", "getProgressBar", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;", "Spacers", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutStickyTotalVO implements c {
    private final String backgroundColor;
    private final BadgeDTO badgeInfo;
    private final String borderColor;

    @NotNull
    private final CheckoutButtonVO button;
    private final boolean hasRoundedCorners;
    private final long id;
    private final FreshProgressBarVO progressBar;

    @NotNull
    private final Spacers spacers;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalVO$Spacers;", "", "", "top", "bottom", "left", "right", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getLeft", "getRight", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public Spacers(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.bottom = i12;
            this.left = i13;
            this.right = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.top == spacers.top && this.bottom == spacers.bottom && this.left == spacers.left && this.right == spacers.right;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.right) + C2454a.a(this.left, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.left, this.right, ", right=", ")", C2438a.a("Spacers(top=", this.top, ", bottom=", ", left=", this.bottom));
        }
    }

    public CheckoutStickyTotalVO(long j11, @NotNull CheckoutButtonVO button, BadgeDTO badgeDTO, String str, String str2, @NotNull Spacers spacers, t tVar, boolean z11, FreshProgressBarVO freshProgressBarVO) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.button = button;
        this.badgeInfo = badgeDTO;
        this.borderColor = str;
        this.backgroundColor = str2;
        this.spacers = spacers;
        this.tokenizedEvent = tVar;
        this.hasRoundedCorners = z11;
        this.progressBar = freshProgressBarVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutStickyTotalVO)) {
            return false;
        }
        CheckoutStickyTotalVO checkoutStickyTotalVO = (CheckoutStickyTotalVO) other;
        return this.id == checkoutStickyTotalVO.id && Intrinsics.d(this.button, checkoutStickyTotalVO.button) && Intrinsics.d(this.badgeInfo, checkoutStickyTotalVO.badgeInfo) && Intrinsics.d(this.borderColor, checkoutStickyTotalVO.borderColor) && Intrinsics.d(this.backgroundColor, checkoutStickyTotalVO.backgroundColor) && Intrinsics.d(this.spacers, checkoutStickyTotalVO.spacers) && Intrinsics.d(this.tokenizedEvent, checkoutStickyTotalVO.tokenizedEvent) && this.hasRoundedCorners == checkoutStickyTotalVO.hasRoundedCorners && Intrinsics.d(this.progressBar, checkoutStickyTotalVO.progressBar);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadgeInfo() {
        return this.badgeInfo;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final CheckoutButtonVO getButton() {
        return this.button;
    }

    public final boolean getHasRoundedCorners() {
        return this.hasRoundedCorners;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final FreshProgressBarVO getProgressBar() {
        return this.progressBar;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.button.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        BadgeDTO badgeDTO = this.badgeInfo;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        String str = this.borderColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode4 = (this.spacers.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        int a11 = C3532b.a((hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.hasRoundedCorners);
        FreshProgressBarVO freshProgressBarVO = this.progressBar;
        return a11 + (freshProgressBarVO != null ? freshProgressBarVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CheckoutStickyTotalVO(id=" + this.id + ", button=" + this.button + ", badgeInfo=" + this.badgeInfo + ", borderColor=" + this.borderColor + ", backgroundColor=" + this.backgroundColor + ", spacers=" + this.spacers + ", tokenizedEvent=" + this.tokenizedEvent + ", hasRoundedCorners=" + this.hasRoundedCorners + ", progressBar=" + this.progressBar + ")";
    }
}
