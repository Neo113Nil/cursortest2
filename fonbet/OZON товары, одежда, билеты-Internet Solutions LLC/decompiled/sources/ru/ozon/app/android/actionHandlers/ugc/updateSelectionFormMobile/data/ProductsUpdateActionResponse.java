package ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductsUpdateActionResponse;", "", SelectionItemFormDTO.PRODUCT_PICKER_FIELD_NAME, "Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "<init>", "(Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", "getProductPicker", "()Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductsUpdateActionResponse {
    private final AtomActionDTO action;
    private final NotificationModelWrapper notification;
    private final ProductPickerDTO productPicker;

    public ProductsUpdateActionResponse(ProductPickerDTO productPickerDTO, AtomActionDTO atomActionDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "notification", type = NotificationAtom.Notification.class), @ProtoOneOfSignature(name = "notificationWithIcon", type = NotificationAtom.NotificationWithIcon.class), @ProtoOneOfSignature(name = "notificationBar", type = NotificationDTO.class)}) @ProtoOneOf(label = "type") NotificationModelWrapper notificationModelWrapper) {
        this.productPicker = productPickerDTO;
        this.action = atomActionDTO;
        this.notification = notificationModelWrapper;
    }

    public static /* synthetic */ ProductsUpdateActionResponse copy$default(ProductsUpdateActionResponse productsUpdateActionResponse, ProductPickerDTO productPickerDTO, AtomActionDTO atomActionDTO, NotificationModelWrapper notificationModelWrapper, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            productPickerDTO = productsUpdateActionResponse.productPicker;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = productsUpdateActionResponse.action;
        }
        if ((i11 & 4) != 0) {
            notificationModelWrapper = productsUpdateActionResponse.notification;
        }
        return productsUpdateActionResponse.copy(productPickerDTO, atomActionDTO, notificationModelWrapper);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductPickerDTO getProductPicker() {
        return this.productPicker;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationModelWrapper getNotification() {
        return this.notification;
    }

    @NotNull
    public final ProductsUpdateActionResponse copy(ProductPickerDTO productPicker, AtomActionDTO action, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "notification", type = NotificationAtom.Notification.class), @ProtoOneOfSignature(name = "notificationWithIcon", type = NotificationAtom.NotificationWithIcon.class), @ProtoOneOfSignature(name = "notificationBar", type = NotificationDTO.class)}) @ProtoOneOf(label = "type") NotificationModelWrapper notification) {
        return new ProductsUpdateActionResponse(productPicker, action, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsUpdateActionResponse)) {
            return false;
        }
        ProductsUpdateActionResponse productsUpdateActionResponse = (ProductsUpdateActionResponse) other;
        return Intrinsics.d(this.productPicker, productsUpdateActionResponse.productPicker) && Intrinsics.d(this.action, productsUpdateActionResponse.action) && Intrinsics.d(this.notification, productsUpdateActionResponse.notification);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final NotificationModelWrapper getNotification() {
        return this.notification;
    }

    public final ProductPickerDTO getProductPicker() {
        return this.productPicker;
    }

    public int hashCode() {
        ProductPickerDTO productPickerDTO = this.productPicker;
        int hashCode = (productPickerDTO == null ? 0 : productPickerDTO.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        NotificationModelWrapper notificationModelWrapper = this.notification;
        return hashCode2 + (notificationModelWrapper != null ? notificationModelWrapper.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductsUpdateActionResponse(productPicker=" + this.productPicker + ", action=" + this.action + ", notification=" + this.notification + ")";
    }
}
