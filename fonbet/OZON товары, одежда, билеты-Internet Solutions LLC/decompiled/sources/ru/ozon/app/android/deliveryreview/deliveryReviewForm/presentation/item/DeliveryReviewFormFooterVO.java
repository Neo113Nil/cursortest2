package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item;

import B0.C2454a;
import G.g;
import Ql.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J|\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b4\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormFooterVO;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "", "id", "", "footerGroupId", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "footerComponents", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "defaultAnnotation", "errorAnnotation", "errorEmptyWithCheckboxAnnotation", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "", "footerRequired", "wholeFormRequired", "<init>", "(JILjava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "components", "copy", "(Ljava/util/List;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormFooterVO;", "(JILjava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormFooterVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getFooterGroupId", "Ljava/util/List;", "getFooterComponents", "()Ljava/util/List;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDefaultAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getErrorAnnotation", "getErrorEmptyWithCheckboxAnnotation", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/lang/Boolean;", "getFooterRequired", "()Ljava/lang/Boolean;", "getWholeFormRequired", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryReviewFormFooterVO extends DeliveryReviewItemVO {
    private final ButtonV3Atom.LargeButton button;
    private final DisclaimerAtom defaultAnnotation;
    private final DisclaimerAtom errorAnnotation;
    private final DisclaimerAtom errorEmptyWithCheckboxAnnotation;

    @NotNull
    private final List<ComponentVO> footerComponents;
    private final int footerGroupId;
    private final Boolean footerRequired;
    private final long id;
    private final Boolean wholeFormRequired;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryReviewFormFooterVO(long j11, int i11, @NotNull List<ComponentVO> footerComponents, DisclaimerAtom disclaimerAtom, DisclaimerAtom disclaimerAtom2, DisclaimerAtom disclaimerAtom3, ButtonV3Atom.LargeButton largeButton, Boolean bool, Boolean bool2) {
        super(j11, i11, footerComponents, bool);
        Intrinsics.checkNotNullParameter(footerComponents, "footerComponents");
        this.id = j11;
        this.footerGroupId = i11;
        this.footerComponents = footerComponents;
        this.defaultAnnotation = disclaimerAtom;
        this.errorAnnotation = disclaimerAtom2;
        this.errorEmptyWithCheckboxAnnotation = disclaimerAtom3;
        this.button = largeButton;
        this.footerRequired = bool;
        this.wholeFormRequired = bool2;
    }

    public static /* synthetic */ DeliveryReviewFormFooterVO copy$default(DeliveryReviewFormFooterVO deliveryReviewFormFooterVO, long j11, int i11, List list, DisclaimerAtom disclaimerAtom, DisclaimerAtom disclaimerAtom2, DisclaimerAtom disclaimerAtom3, ButtonV3Atom.LargeButton largeButton, Boolean bool, Boolean bool2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = deliveryReviewFormFooterVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            i11 = deliveryReviewFormFooterVO.footerGroupId;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            list = deliveryReviewFormFooterVO.footerComponents;
        }
        return deliveryReviewFormFooterVO.copy(j12, i13, list, (i12 & 8) != 0 ? deliveryReviewFormFooterVO.defaultAnnotation : disclaimerAtom, (i12 & 16) != 0 ? deliveryReviewFormFooterVO.errorAnnotation : disclaimerAtom2, (i12 & 32) != 0 ? deliveryReviewFormFooterVO.errorEmptyWithCheckboxAnnotation : disclaimerAtom3, (i12 & 64) != 0 ? deliveryReviewFormFooterVO.button : largeButton, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? deliveryReviewFormFooterVO.footerRequired : bool, (i12 & 256) != 0 ? deliveryReviewFormFooterVO.wholeFormRequired : bool2);
    }

    @NotNull
    public final DeliveryReviewFormFooterVO copy(long id2, int footerGroupId, @NotNull List<ComponentVO> footerComponents, DisclaimerAtom defaultAnnotation, DisclaimerAtom errorAnnotation, DisclaimerAtom errorEmptyWithCheckboxAnnotation, ButtonV3Atom.LargeButton button, Boolean footerRequired, Boolean wholeFormRequired) {
        Intrinsics.checkNotNullParameter(footerComponents, "footerComponents");
        return new DeliveryReviewFormFooterVO(id2, footerGroupId, footerComponents, defaultAnnotation, errorAnnotation, errorEmptyWithCheckboxAnnotation, button, footerRequired, wholeFormRequired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryReviewFormFooterVO)) {
            return false;
        }
        DeliveryReviewFormFooterVO deliveryReviewFormFooterVO = (DeliveryReviewFormFooterVO) other;
        return this.id == deliveryReviewFormFooterVO.id && this.footerGroupId == deliveryReviewFormFooterVO.footerGroupId && Intrinsics.d(this.footerComponents, deliveryReviewFormFooterVO.footerComponents) && Intrinsics.d(this.defaultAnnotation, deliveryReviewFormFooterVO.defaultAnnotation) && Intrinsics.d(this.errorAnnotation, deliveryReviewFormFooterVO.errorAnnotation) && Intrinsics.d(this.errorEmptyWithCheckboxAnnotation, deliveryReviewFormFooterVO.errorEmptyWithCheckboxAnnotation) && Intrinsics.d(this.button, deliveryReviewFormFooterVO.button) && Intrinsics.d(this.footerRequired, deliveryReviewFormFooterVO.footerRequired) && Intrinsics.d(this.wholeFormRequired, deliveryReviewFormFooterVO.wholeFormRequired);
    }

    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final DisclaimerAtom getDefaultAnnotation() {
        return this.defaultAnnotation;
    }

    public final DisclaimerAtom getErrorAnnotation() {
        return this.errorAnnotation;
    }

    public final DisclaimerAtom getErrorEmptyWithCheckboxAnnotation() {
        return this.errorEmptyWithCheckboxAnnotation;
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO, l20.c
    public long getId() {
        return this.id;
    }

    public final Boolean getWholeFormRequired() {
        return this.wholeFormRequired;
    }

    public int hashCode() {
        int b11 = g.b(C2454a.a(this.footerGroupId, Long.hashCode(this.id) * 31, 31), 31, this.footerComponents);
        DisclaimerAtom disclaimerAtom = this.defaultAnnotation;
        int hashCode = (b11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom2 = this.errorAnnotation;
        int hashCode2 = (hashCode + (disclaimerAtom2 == null ? 0 : disclaimerAtom2.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom3 = this.errorEmptyWithCheckboxAnnotation;
        int hashCode3 = (hashCode2 + (disclaimerAtom3 == null ? 0 : disclaimerAtom3.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.button;
        int hashCode4 = (hashCode3 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        Boolean bool = this.footerRequired;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.wholeFormRequired;
        return hashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.footerGroupId;
        List<ComponentVO> list = this.footerComponents;
        DisclaimerAtom disclaimerAtom = this.defaultAnnotation;
        DisclaimerAtom disclaimerAtom2 = this.errorAnnotation;
        DisclaimerAtom disclaimerAtom3 = this.errorEmptyWithCheckboxAnnotation;
        ButtonV3Atom.LargeButton largeButton = this.button;
        Boolean bool = this.footerRequired;
        Boolean bool2 = this.wholeFormRequired;
        StringBuilder b11 = c.b(j11, "DeliveryReviewFormFooterVO(id=", i11, ", footerGroupId=");
        b11.append(", footerComponents=");
        b11.append(list);
        b11.append(", defaultAnnotation=");
        b11.append(disclaimerAtom);
        b11.append(", errorAnnotation=");
        b11.append(disclaimerAtom2);
        b11.append(", errorEmptyWithCheckboxAnnotation=");
        b11.append(disclaimerAtom3);
        b11.append(", button=");
        b11.append(largeButton);
        b11.append(", footerRequired=");
        b11.append(bool);
        b11.append(", wholeFormRequired=");
        b11.append(bool2);
        b11.append(")");
        return b11.toString();
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO
    public /* bridge */ /* synthetic */ DeliveryReviewItemVO copy(List list) {
        return copy((List<ComponentVO>) list);
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO
    @NotNull
    public DeliveryReviewFormFooterVO copy(@NotNull List<ComponentVO> components) {
        Intrinsics.checkNotNullParameter(components, "components");
        return copy$default(this, 0L, 0, components, null, null, null, null, null, null, 507, null);
    }
}
