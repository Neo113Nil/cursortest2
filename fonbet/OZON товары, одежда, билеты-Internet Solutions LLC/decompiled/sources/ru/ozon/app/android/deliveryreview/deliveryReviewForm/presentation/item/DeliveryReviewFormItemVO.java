package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item;

import Ak.C2436a;
import B0.C2454a;
import G.g;
import Kk.C3532b;
import Nh.a;
import Ql.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014Jj\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0017R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b\r\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b.\u0010*¨\u0006/"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemVO;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "", "id", "", "formGroupId", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "formComponents", "", "alwaysOpen", "isOpen", "formRequired", "formError", "<init>", "(JILjava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;Z)V", "components", "copy", "(Ljava/util/List;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemVO;", "(JILjava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;Z)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getFormGroupId", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getFormComponents", "()Ljava/util/List;", "Z", "getAlwaysOpen", "()Z", "Ljava/lang/Boolean;", "getFormRequired", "()Ljava/lang/Boolean;", "getFormError", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryReviewFormItemVO extends DeliveryReviewItemVO {
    private final boolean alwaysOpen;

    @NotNull
    private final List<ComponentVO> formComponents;
    private final boolean formError;
    private final int formGroupId;
    private final Boolean formRequired;
    private final long id;
    private final boolean isOpen;
    private final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryReviewFormItemVO(long j11, int i11, String str, @NotNull List<ComponentVO> formComponents, boolean z11, boolean z12, Boolean bool, boolean z13) {
        super(j11, i11, formComponents, bool);
        Intrinsics.checkNotNullParameter(formComponents, "formComponents");
        this.id = j11;
        this.formGroupId = i11;
        this.title = str;
        this.formComponents = formComponents;
        this.alwaysOpen = z11;
        this.isOpen = z12;
        this.formRequired = bool;
        this.formError = z13;
    }

    public static /* synthetic */ DeliveryReviewFormItemVO copy$default(DeliveryReviewFormItemVO deliveryReviewFormItemVO, long j11, int i11, String str, List list, boolean z11, boolean z12, Boolean bool, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = deliveryReviewFormItemVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            i11 = deliveryReviewFormItemVO.formGroupId;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str = deliveryReviewFormItemVO.title;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            list = deliveryReviewFormItemVO.formComponents;
        }
        return deliveryReviewFormItemVO.copy(j12, i13, str2, list, (i12 & 16) != 0 ? deliveryReviewFormItemVO.alwaysOpen : z11, (i12 & 32) != 0 ? deliveryReviewFormItemVO.isOpen : z12, (i12 & 64) != 0 ? deliveryReviewFormItemVO.formRequired : bool, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? deliveryReviewFormItemVO.formError : z13);
    }

    @NotNull
    public final DeliveryReviewFormItemVO copy(long id2, int formGroupId, String title, @NotNull List<ComponentVO> formComponents, boolean alwaysOpen, boolean isOpen, Boolean formRequired, boolean formError) {
        Intrinsics.checkNotNullParameter(formComponents, "formComponents");
        return new DeliveryReviewFormItemVO(id2, formGroupId, title, formComponents, alwaysOpen, isOpen, formRequired, formError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryReviewFormItemVO)) {
            return false;
        }
        DeliveryReviewFormItemVO deliveryReviewFormItemVO = (DeliveryReviewFormItemVO) other;
        return this.id == deliveryReviewFormItemVO.id && this.formGroupId == deliveryReviewFormItemVO.formGroupId && Intrinsics.d(this.title, deliveryReviewFormItemVO.title) && Intrinsics.d(this.formComponents, deliveryReviewFormItemVO.formComponents) && this.alwaysOpen == deliveryReviewFormItemVO.alwaysOpen && this.isOpen == deliveryReviewFormItemVO.isOpen && Intrinsics.d(this.formRequired, deliveryReviewFormItemVO.formRequired) && this.formError == deliveryReviewFormItemVO.formError;
    }

    public final boolean getAlwaysOpen() {
        return this.alwaysOpen;
    }

    @NotNull
    public final List<ComponentVO> getFormComponents() {
        return this.formComponents;
    }

    public final boolean getFormError() {
        return this.formError;
    }

    public final int getFormGroupId() {
        return this.formGroupId;
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO, l20.c
    public long getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.formGroupId, Long.hashCode(this.id) * 31, 31);
        String str = this.title;
        int a12 = C3532b.a(C3532b.a(g.b((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.formComponents), 31, this.alwaysOpen), 31, this.isOpen);
        Boolean bool = this.formRequired;
        return Boolean.hashCode(this.formError) + ((a12 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    /* renamed from: isOpen, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.formGroupId;
        String str = this.title;
        List<ComponentVO> list = this.formComponents;
        boolean z11 = this.alwaysOpen;
        boolean z12 = this.isOpen;
        Boolean bool = this.formRequired;
        boolean z13 = this.formError;
        StringBuilder b11 = c.b(j11, "DeliveryReviewFormItemVO(id=", i11, ", formGroupId=");
        a.g(", title=", str, ", formComponents=", b11, list);
        C2436a.e(", alwaysOpen=", ", isOpen=", b11, z11, z12);
        b11.append(", formRequired=");
        b11.append(bool);
        b11.append(", formError=");
        b11.append(z13);
        b11.append(")");
        return b11.toString();
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO
    public /* bridge */ /* synthetic */ DeliveryReviewItemVO copy(List list) {
        return copy((List<ComponentVO>) list);
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO
    @NotNull
    public DeliveryReviewFormItemVO copy(@NotNull List<ComponentVO> components) {
        Intrinsics.checkNotNullParameter(components, "components");
        return copy$default(this, 0L, 0, null, components, false, false, null, false, 247, null);
    }
}
