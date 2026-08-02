package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation;

import G.g;
import Kk.C3532b;
import Pk0.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.data.TransparentNavBarV2DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003123B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013Jr\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b\f\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b0\u0010/¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$Button;", "leftButtons", "rightButtons", "", "offset", "", "isDynamicAlpha", "", "scrollAnchorId", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;", "buttonIconColors", "buttonShapeColors", "<init>", "(JLjava/util/List;Ljava/util/List;FZLjava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;)V", "copy", "(JLjava/util/List;Ljava/util/List;FZLjava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;)Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getLeftButtons", "()Ljava/util/List;", "getRightButtons", "F", "getOffset", "()F", "Z", "()Z", "Ljava/lang/String;", "getScrollAnchorId", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;", "getButtonIconColors", "()Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;", "getButtonShapeColors", "Button", "IconButton", "FavoriteButton", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TransparentNavBarV2VO implements c {
    private final TransparentNavBarV2DTO.ButtonsColors buttonIconColors;
    private final TransparentNavBarV2DTO.ButtonsColors buttonShapeColors;
    private final long id;
    private final boolean isDynamicAlpha;

    @NotNull
    private final List<Button> leftButtons;
    private final float offset;

    @NotNull
    private final List<Button> rightButtons;
    private final String scrollAnchorId;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$Button;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$FavoriteButton;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$IconButton;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Button {
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$FavoriteButton;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$Button;", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "button", "<init>", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "getButton", "()Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FavoriteButton implements Button {

        @NotNull
        private final FavoriteProductModel button;

        public FavoriteButton(@NotNull FavoriteProductModel button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FavoriteButton) && Intrinsics.d(this.button, ((FavoriteButton) other).button);
        }

        @NotNull
        public final FavoriteProductModel getButton() {
            return this.button;
        }

        public int hashCode() {
            return this.button.hashCode();
        }

        @NotNull
        public String toString() {
            return "FavoriteButton(button=" + this.button + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$IconButton;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$Button;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "button", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconButton implements Button {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final IconButtonV3DTO button;

        public IconButton(@NotNull IconButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IconButton) && Intrinsics.d(this.button, ((IconButton) other).button);
        }

        @NotNull
        public final IconButtonV3DTO getButton() {
            return this.button;
        }

        public int hashCode() {
            return this.button.hashCode();
        }

        @NotNull
        public String toString() {
            return "IconButton(button=" + this.button + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransparentNavBarV2VO(long j11, @NotNull List<? extends Button> leftButtons, @NotNull List<? extends Button> rightButtons, float f7, boolean z11, String str, TransparentNavBarV2DTO.ButtonsColors buttonsColors, TransparentNavBarV2DTO.ButtonsColors buttonsColors2) {
        Intrinsics.checkNotNullParameter(leftButtons, "leftButtons");
        Intrinsics.checkNotNullParameter(rightButtons, "rightButtons");
        this.id = j11;
        this.leftButtons = leftButtons;
        this.rightButtons = rightButtons;
        this.offset = f7;
        this.isDynamicAlpha = z11;
        this.scrollAnchorId = str;
        this.buttonIconColors = buttonsColors;
        this.buttonShapeColors = buttonsColors2;
    }

    public static /* synthetic */ TransparentNavBarV2VO copy$default(TransparentNavBarV2VO transparentNavBarV2VO, long j11, List list, List list2, float f7, boolean z11, String str, TransparentNavBarV2DTO.ButtonsColors buttonsColors, TransparentNavBarV2DTO.ButtonsColors buttonsColors2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = transparentNavBarV2VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = transparentNavBarV2VO.leftButtons;
        }
        List list3 = list;
        if ((i11 & 4) != 0) {
            list2 = transparentNavBarV2VO.rightButtons;
        }
        List list4 = list2;
        if ((i11 & 8) != 0) {
            f7 = transparentNavBarV2VO.offset;
        }
        return transparentNavBarV2VO.copy(j12, list3, list4, f7, (i11 & 16) != 0 ? transparentNavBarV2VO.isDynamicAlpha : z11, (i11 & 32) != 0 ? transparentNavBarV2VO.scrollAnchorId : str, (i11 & 64) != 0 ? transparentNavBarV2VO.buttonIconColors : buttonsColors, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? transparentNavBarV2VO.buttonShapeColors : buttonsColors2);
    }

    @NotNull
    public final TransparentNavBarV2VO copy(long id2, @NotNull List<? extends Button> leftButtons, @NotNull List<? extends Button> rightButtons, float offset, boolean isDynamicAlpha, String scrollAnchorId, TransparentNavBarV2DTO.ButtonsColors buttonIconColors, TransparentNavBarV2DTO.ButtonsColors buttonShapeColors) {
        Intrinsics.checkNotNullParameter(leftButtons, "leftButtons");
        Intrinsics.checkNotNullParameter(rightButtons, "rightButtons");
        return new TransparentNavBarV2VO(id2, leftButtons, rightButtons, offset, isDynamicAlpha, scrollAnchorId, buttonIconColors, buttonShapeColors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransparentNavBarV2VO)) {
            return false;
        }
        TransparentNavBarV2VO transparentNavBarV2VO = (TransparentNavBarV2VO) other;
        return this.id == transparentNavBarV2VO.id && Intrinsics.d(this.leftButtons, transparentNavBarV2VO.leftButtons) && Intrinsics.d(this.rightButtons, transparentNavBarV2VO.rightButtons) && Float.compare(this.offset, transparentNavBarV2VO.offset) == 0 && this.isDynamicAlpha == transparentNavBarV2VO.isDynamicAlpha && Intrinsics.d(this.scrollAnchorId, transparentNavBarV2VO.scrollAnchorId) && Intrinsics.d(this.buttonIconColors, transparentNavBarV2VO.buttonIconColors) && Intrinsics.d(this.buttonShapeColors, transparentNavBarV2VO.buttonShapeColors);
    }

    public final TransparentNavBarV2DTO.ButtonsColors getButtonIconColors() {
        return this.buttonIconColors;
    }

    public final TransparentNavBarV2DTO.ButtonsColors getButtonShapeColors() {
        return this.buttonShapeColors;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Button> getLeftButtons() {
        return this.leftButtons;
    }

    @NotNull
    public final List<Button> getRightButtons() {
        return this.rightButtons;
    }

    public final String getScrollAnchorId() {
        return this.scrollAnchorId;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(b.a(this.offset, g.b(g.b(Long.hashCode(this.id) * 31, 31, this.leftButtons), 31, this.rightButtons), 31), 31, this.isDynamicAlpha);
        String str = this.scrollAnchorId;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        TransparentNavBarV2DTO.ButtonsColors buttonsColors = this.buttonIconColors;
        int hashCode2 = (hashCode + (buttonsColors == null ? 0 : buttonsColors.hashCode())) * 31;
        TransparentNavBarV2DTO.ButtonsColors buttonsColors2 = this.buttonShapeColors;
        return hashCode2 + (buttonsColors2 != null ? buttonsColors2.hashCode() : 0);
    }

    /* renamed from: isDynamicAlpha, reason: from getter */
    public final boolean getIsDynamicAlpha() {
        return this.isDynamicAlpha;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Button> list = this.leftButtons;
        List<Button> list2 = this.rightButtons;
        float f7 = this.offset;
        boolean z11 = this.isDynamicAlpha;
        String str = this.scrollAnchorId;
        TransparentNavBarV2DTO.ButtonsColors buttonsColors = this.buttonIconColors;
        TransparentNavBarV2DTO.ButtonsColors buttonsColors2 = this.buttonShapeColors;
        StringBuilder b11 = Lh.b.b(j11, "TransparentNavBarV2VO(id=", ", leftButtons=", list);
        b11.append(", rightButtons=");
        b11.append(list2);
        b11.append(", offset=");
        b11.append(f7);
        b11.append(", isDynamicAlpha=");
        b11.append(z11);
        b11.append(", scrollAnchorId=");
        b11.append(str);
        b11.append(", buttonIconColors=");
        b11.append(buttonsColors);
        b11.append(", buttonShapeColors=");
        b11.append(buttonsColors2);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ TransparentNavBarV2VO(long j11, List list, List list2, float f7, boolean z11, String str, TransparentNavBarV2DTO.ButtonsColors buttonsColors, TransparentNavBarV2DTO.ButtonsColors buttonsColors2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, list2, (i11 & 8) != 0 ? 1.0f : f7, z11, str, buttonsColors, buttonsColors2);
    }
}
