package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.adapter;

import CC.a;
import Dc0.m;
import Dc0.n;
import Sc.o;
import WZ.l;
import WZ.t;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.data.ParcelPhotoAddMapper;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhoto;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddVO;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.view.ParcelPhotoAddItemView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/adapter/ParcelPhotoAddItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/ParcelPhotoAddItemView;", "view", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function0;", "", "onAddClick", "Lkotlin/Function1;", "", "onDeleteClick", "onRetryClick", "onCancelClick", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/ParcelPhotoAddItemView;LWZ/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;", "item", "bindImage", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/ParcelPhotoAddItemView;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;)V", "bindLoadingView", "bindRemoveButton", "bindRetryButton", "bindBorder", "bindDeletingProgress", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;)V", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/ParcelPhotoAddItemView;", "LWZ/l;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParcelPhotoAddItemViewHolder extends j {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private ParcelPhotoAddVO.PickerItemVO item;

    @NotNull
    private final Function0<Unit> onAddClick;

    @NotNull
    private final Function1<String, Unit> onCancelClick;

    @NotNull
    private final Function1<String, Unit> onDeleteClick;

    @NotNull
    private final Function1<String, Unit> onRetryClick;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ParcelPhotoAddItemView view;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/adapter/ParcelPhotoAddItemViewHolder$Companion;", "", "<init>", "()V", "PHOTO_OVERLAY", "", "PHOTO_NO_OVERLAY", "PHOTO_RESIZING_PROGRESS", "", "PHOTO_UPLOADING_PROGRESS", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachedPhoto.Status.values().length];
            try {
                iArr[AttachedPhoto.Status.RESIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachedPhoto.Status.UPLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ParcelPhotoAddItemViewHolder(@NotNull ParcelPhotoAddItemView view, @NotNull l tokenizedAnalytics, @NotNull Function0<Unit> onAddClick, @NotNull Function1<? super String, Unit> onDeleteClick, @NotNull Function1<? super String, Unit> onRetryClick, @NotNull Function1<? super String, Unit> onCancelClick) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onAddClick, "onAddClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onAddClick = onAddClick;
        this.onDeleteClick = onDeleteClick;
        this.onRetryClick = onRetryClick;
        this.onCancelClick = onCancelClick;
        IconView retryIcon = view.getRetryIcon();
        ParcelPhotoAddMapper.Companion companion = ParcelPhotoAddMapper.INSTANCE;
        IconHolderKt.bind$default(retryIcon, companion.getRetryIcon(), null, 2, null);
        IconHolderKt.bind$default(view.getCancelIcon(), companion.getCancelIcon(), null, 2, null);
        view.getCancelIcon().setOnClickListener(new a(this, 4));
        view.getRetryIcon().setOnClickListener(new CD.a(this, 3));
        view.getDeleteIcon().setOnClickListener(new m(this, 5));
        this.itemView.setOnClickListener(new n(this, 7));
    }

    private final void bindBorder(ParcelPhotoAddItemView parcelPhotoAddItemView, ParcelPhotoAddVO.PickerItemVO pickerItemVO) {
        View borderView = parcelPhotoAddItemView.getBorderView();
        boolean z11 = pickerItemVO instanceof ParcelPhotoAddVO.EmptyVO;
        if (z11) {
            Drawable background = borderView.getBackground();
            Intrinsics.checkNotNullExpressionValue(background, "getBackground(...)");
            parcelPhotoAddItemView.setBorderColor(background, ((ParcelPhotoAddVO.EmptyVO) pickerItemVO).getBorderColor());
        }
        ViewExtKt.showOrGone(borderView, Boolean.valueOf(z11));
    }

    private final void bindDeletingProgress(ParcelPhotoAddItemView parcelPhotoAddItemView, ParcelPhotoAddVO.PickerItemVO pickerItemVO) {
        parcelPhotoAddItemView.getImage().setAlpha((pickerItemVO instanceof ParcelPhotoAddVO.PhotoVO) && ((ParcelPhotoAddVO.PhotoVO) pickerItemVO).getPhoto().getStatus().getIsShowOverlay() ? 0.6f : 1.0f);
    }

    private final void bindImage(ParcelPhotoAddItemView parcelPhotoAddItemView, ParcelPhotoAddVO.PickerItemVO pickerItemVO) {
        ImageDTO copy;
        ImageDTO copy2;
        CommonAtomIconDTO icon;
        String str = null;
        if (pickerItemVO instanceof ParcelPhotoAddVO.PickerVO) {
            ParcelPhotoAddVO.PickerVO pickerVO = (ParcelPhotoAddVO.PickerVO) pickerItemVO;
            ImageHolderKt.bind$default(parcelPhotoAddItemView.getImage(), pickerVO.getImage(), null, 2, null);
            IconHolderKt.bindOrGone$default(parcelPhotoAddItemView.getCenterIcon(), pickerVO.getIcon(), null, 2, null);
            IconView centerIcon = parcelPhotoAddItemView.getCenterIcon();
            IconDTO icon2 = pickerVO.getIcon();
            if (icon2 != null && (icon = icon2.getIcon()) != null) {
                str = icon.getIcon();
            }
            centerIcon.setContentDescription(str);
            return;
        }
        if (pickerItemVO instanceof ParcelPhotoAddVO.EmptyVO) {
            Image image = parcelPhotoAddItemView.getImage();
            copy2 = r4.copy((r34 & 1) != 0 ? r4.image : null, (r34 & 2) != 0 ? r4.backgroundColor : null, (r34 & 4) != 0 ? r4.aspectRatio : null, (r34 & 8) != 0 ? r4.hasParanja : false, (r34 & 16) != 0 ? r4.layoutPaddingLeft : null, (r34 & 32) != 0 ? r4.layoutPaddingRight : null, (r34 & 64) != 0 ? r4.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r4.layoutPaddingBottom : null, (r34 & 256) != 0 ? r4.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r4.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r4.testInfo : null, (r34 & 2048) != 0 ? r4.trackingInfo : null, (r34 & 4096) != 0 ? r4.imageWidth : null, (r34 & 8192) != 0 ? r4.imageType : null, (r34 & 16384) != 0 ? r4.fitType : null, (r34 & 32768) != 0 ? ((ParcelPhotoAddVO.EmptyVO) pickerItemVO).getImage().customRatio : null);
            ImageHolderKt.bind$default(image, copy2, null, 2, null);
        } else {
            if (!(pickerItemVO instanceof ParcelPhotoAddVO.PhotoVO)) {
                throw new o();
            }
            Image image2 = parcelPhotoAddItemView.getImage();
            copy = r4.copy((r34 & 1) != 0 ? r4.image : null, (r34 & 2) != 0 ? r4.backgroundColor : null, (r34 & 4) != 0 ? r4.aspectRatio : null, (r34 & 8) != 0 ? r4.hasParanja : true, (r34 & 16) != 0 ? r4.layoutPaddingLeft : null, (r34 & 32) != 0 ? r4.layoutPaddingRight : null, (r34 & 64) != 0 ? r4.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r4.layoutPaddingBottom : null, (r34 & 256) != 0 ? r4.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r4.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r4.testInfo : null, (r34 & 2048) != 0 ? r4.trackingInfo : null, (r34 & 4096) != 0 ? r4.imageWidth : null, (r34 & 8192) != 0 ? r4.imageType : null, (r34 & 16384) != 0 ? r4.fitType : null, (r34 & 32768) != 0 ? ((ParcelPhotoAddVO.PhotoVO) pickerItemVO).getImage().customRatio : null);
            ImageHolderKt.bind$default(image2, copy, null, 2, null);
        }
    }

    private final void bindLoadingView(ParcelPhotoAddItemView parcelPhotoAddItemView, ParcelPhotoAddVO.PickerItemVO pickerItemVO) {
        AttachedPhoto photo;
        AttachedPhoto.Status status = null;
        ParcelPhotoAddVO.PhotoVO photoVO = pickerItemVO instanceof ParcelPhotoAddVO.PhotoVO ? (ParcelPhotoAddVO.PhotoVO) pickerItemVO : null;
        if (photoVO != null && (photo = photoVO.getPhoto()) != null) {
            status = photo.getStatus();
        }
        boolean z11 = false;
        if (status != null && status.getIsShowLoader()) {
            z11 = true;
        }
        ViewExtKt.showOrGone(parcelPhotoAddItemView.getProgressView(), Boolean.valueOf(z11));
        ViewExtKt.showOrGone(parcelPhotoAddItemView.getCancelIcon(), Boolean.valueOf(z11));
        if (z11) {
            int i11 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i11 == 1) {
                this.view.getProgressView().reset();
                this.view.getProgressView().setProgressSmoothly(5);
            } else if (i11 != 2) {
                this.view.getProgressView().reset();
            } else {
                this.view.getProgressView().setProgressSmoothly(65);
            }
        }
    }

    private final void bindRemoveButton(ParcelPhotoAddItemView parcelPhotoAddItemView, ParcelPhotoAddVO.PickerItemVO pickerItemVO) {
        boolean z11 = pickerItemVO instanceof ParcelPhotoAddVO.PhotoVO;
        if (z11) {
            IconHolderKt.bind$default(parcelPhotoAddItemView.getDeleteIcon(), ((ParcelPhotoAddVO.PhotoVO) pickerItemVO).getRemoveIcon(), null, 2, null);
        }
        ViewExtKt.showOrInvisible(parcelPhotoAddItemView.getDeleteIcon(), z11 && ((ParcelPhotoAddVO.PhotoVO) pickerItemVO).getPhoto().getStatus().getIsShowRemover());
    }

    private final void bindRetryButton(ParcelPhotoAddItemView parcelPhotoAddItemView, ParcelPhotoAddVO.PickerItemVO pickerItemVO) {
        ViewExtKt.showOrGone(parcelPhotoAddItemView.getRetryIcon(), Boolean.valueOf((pickerItemVO instanceof ParcelPhotoAddVO.PhotoVO) && ((ParcelPhotoAddVO.PhotoVO) pickerItemVO).getPhoto().getStatus().getIsShowRetry()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$8$lambda$0(ParcelPhotoAddItemViewHolder parcelPhotoAddItemViewHolder, View view) {
        AttachedPhoto photo;
        String photoKey;
        ParcelPhotoAddVO.PickerItemVO pickerItemVO = parcelPhotoAddItemViewHolder.item;
        ParcelPhotoAddVO.PhotoVO photoVO = pickerItemVO instanceof ParcelPhotoAddVO.PhotoVO ? (ParcelPhotoAddVO.PhotoVO) pickerItemVO : null;
        if (photoVO == null || (photo = photoVO.getPhoto()) == null || (photoKey = photo.getPhotoKey()) == null) {
            return;
        }
        parcelPhotoAddItemViewHolder.onCancelClick.invoke(photoKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$8$lambda$2(ParcelPhotoAddItemViewHolder parcelPhotoAddItemViewHolder, View view) {
        AttachedPhoto photo;
        String photoKey;
        ParcelPhotoAddVO.PickerItemVO pickerItemVO = parcelPhotoAddItemViewHolder.item;
        ParcelPhotoAddVO.PhotoVO photoVO = pickerItemVO instanceof ParcelPhotoAddVO.PhotoVO ? (ParcelPhotoAddVO.PhotoVO) pickerItemVO : null;
        if (photoVO == null || (photo = photoVO.getPhoto()) == null || (photoKey = photo.getPhotoKey()) == null) {
            return;
        }
        parcelPhotoAddItemViewHolder.onRetryClick.invoke(photoKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$8$lambda$4(ParcelPhotoAddItemViewHolder parcelPhotoAddItemViewHolder, View view) {
        ParcelPhotoAddVO.PickerItemVO pickerItemVO = parcelPhotoAddItemViewHolder.item;
        ParcelPhotoAddVO.PhotoVO photoVO = pickerItemVO instanceof ParcelPhotoAddVO.PhotoVO ? (ParcelPhotoAddVO.PhotoVO) pickerItemVO : null;
        if (photoVO != null) {
            parcelPhotoAddItemViewHolder.onDeleteClick.invoke(photoVO.getPhoto().getPhotoKey());
            t deletePhotoEvent = photoVO.getDeletePhotoEvent();
            if (deletePhotoEvent != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(parcelPhotoAddItemViewHolder.tokenizedAnalytics, deletePhotoEvent, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$8$lambda$7(ParcelPhotoAddItemViewHolder parcelPhotoAddItemViewHolder, View view) {
        ParcelPhotoAddVO.PickerItemVO pickerItemVO = parcelPhotoAddItemViewHolder.item;
        ParcelPhotoAddVO.PickerVO pickerVO = pickerItemVO instanceof ParcelPhotoAddVO.PickerVO ? (ParcelPhotoAddVO.PickerVO) pickerItemVO : null;
        if (pickerVO != null) {
            parcelPhotoAddItemViewHolder.onAddClick.invoke();
            t tokenizedEvent = pickerVO.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(parcelPhotoAddItemViewHolder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
            }
        }
    }

    public final void bind(@NotNull ParcelPhotoAddVO.PickerItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ParcelPhotoAddItemView parcelPhotoAddItemView = this.view;
        this.item = item;
        bindImage(parcelPhotoAddItemView, item);
        bindBorder(parcelPhotoAddItemView, item);
        bindRemoveButton(parcelPhotoAddItemView, item);
        bindLoadingView(parcelPhotoAddItemView, item);
        bindRetryButton(parcelPhotoAddItemView, item);
        bindDeletingProgress(parcelPhotoAddItemView, item);
    }
}
