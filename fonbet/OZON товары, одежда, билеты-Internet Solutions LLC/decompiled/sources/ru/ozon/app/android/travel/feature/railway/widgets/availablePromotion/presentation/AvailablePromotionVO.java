package ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.presentation;

import Ak.C2436a;
import Kk.C3532b;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012Jb\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b\u000f\u0010.R\"\u0010\u0010\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010-\u001a\u0004\b/\u0010.\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/presentation/AvailablePromotionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "bgColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "promo", "details", "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "", "isOpened", "playAnimation", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZZ)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZZ)Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/presentation/AvailablePromotionVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBgColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPromo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getDetails", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "()Z", "getPlayAnimation", "setPlayAnimation", "(Z)V", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AvailablePromotionVO implements c {
    private final String bgColor;

    @NotNull
    private final CornerRadius cornerRadius;

    @NotNull
    private final TextDTO description;

    @NotNull
    private final CellDTO details;
    private final long id;
    private final boolean isOpened;
    private boolean playAnimation;

    @NotNull
    private final CellDTO promo;

    public AvailablePromotionVO(long j11, String str, @NotNull CornerRadius cornerRadius, @NotNull CellDTO promo, @NotNull CellDTO details, @NotNull TextDTO description, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(promo, "promo");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = j11;
        this.bgColor = str;
        this.cornerRadius = cornerRadius;
        this.promo = promo;
        this.details = details;
        this.description = description;
        this.isOpened = z11;
        this.playAnimation = z12;
    }

    public static /* synthetic */ AvailablePromotionVO copy$default(AvailablePromotionVO availablePromotionVO, long j11, String str, CornerRadius cornerRadius, CellDTO cellDTO, CellDTO cellDTO2, TextDTO textDTO, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = availablePromotionVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = availablePromotionVO.bgColor;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            cornerRadius = availablePromotionVO.cornerRadius;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        if ((i11 & 8) != 0) {
            cellDTO = availablePromotionVO.promo;
        }
        return availablePromotionVO.copy(j12, str2, cornerRadius2, cellDTO, (i11 & 16) != 0 ? availablePromotionVO.details : cellDTO2, (i11 & 32) != 0 ? availablePromotionVO.description : textDTO, (i11 & 64) != 0 ? availablePromotionVO.isOpened : z11, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? availablePromotionVO.playAnimation : z12);
    }

    @NotNull
    public final AvailablePromotionVO copy(long id2, String bgColor, @NotNull CornerRadius cornerRadius, @NotNull CellDTO promo, @NotNull CellDTO details, @NotNull TextDTO description, boolean isOpened, boolean playAnimation) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(promo, "promo");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(description, "description");
        return new AvailablePromotionVO(id2, bgColor, cornerRadius, promo, details, description, isOpened, playAnimation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailablePromotionVO)) {
            return false;
        }
        AvailablePromotionVO availablePromotionVO = (AvailablePromotionVO) other;
        return this.id == availablePromotionVO.id && Intrinsics.d(this.bgColor, availablePromotionVO.bgColor) && this.cornerRadius == availablePromotionVO.cornerRadius && Intrinsics.d(this.promo, availablePromotionVO.promo) && Intrinsics.d(this.details, availablePromotionVO.details) && Intrinsics.d(this.description, availablePromotionVO.description) && this.isOpened == availablePromotionVO.isOpened && this.playAnimation == availablePromotionVO.playAnimation;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final CellDTO getDetails() {
        return this.details;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final boolean getPlayAnimation() {
        return this.playAnimation;
    }

    @NotNull
    public final CellDTO getPromo() {
        return this.promo;
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
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.bgColor;
        return Boolean.hashCode(this.playAnimation) + C3532b.a(b.a(this.description, Bi.b.c(this.details, Bi.b.c(this.promo, Tl.b.b(this.cornerRadius, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31, this.isOpened);
    }

    /* renamed from: isOpened, reason: from getter */
    public final boolean getIsOpened() {
        return this.isOpened;
    }

    public final void setPlayAnimation(boolean z11) {
        this.playAnimation = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.bgColor;
        CornerRadius cornerRadius = this.cornerRadius;
        CellDTO cellDTO = this.promo;
        CellDTO cellDTO2 = this.details;
        TextDTO textDTO = this.description;
        boolean z11 = this.isOpened;
        boolean z12 = this.playAnimation;
        StringBuilder c11 = C2436a.c(j11, "AvailablePromotionVO(id=", ", bgColor=", str);
        c11.append(", cornerRadius=");
        c11.append(cornerRadius);
        c11.append(", promo=");
        c11.append(cellDTO);
        c11.append(", details=");
        c11.append(cellDTO2);
        c11.append(", description=");
        c11.append(textDTO);
        C2436a.e(", isOpened=", ", playAnimation=", c11, z11, z12);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ AvailablePromotionVO(long j11, String str, CornerRadius cornerRadius, CellDTO cellDTO, CellDTO cellDTO2, TextDTO textDTO, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, cornerRadius, cellDTO, cellDTO2, textDTO, z11, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z12);
    }
}
