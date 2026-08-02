package ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation;

import AI.a;
import AI.b;
import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import Sc.o;
import WZ.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.K;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.p;
import java.util.ArrayList;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.databinding.ItemMediaPickerBinding;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaPickerMapper;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.views.CircularProgressBar;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerItemVH;", "Ljk0/j;", "Lru/ozon/app/android/ugc/databinding/ItemMediaPickerBinding;", "binding", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function0;", "", "onAddClick", "Lkotlin/Function1;", "", "onRemoveClick", "onRetryClick", "onCancelClick", "<init>", "(Lru/ozon/app/android/ugc/databinding/ItemMediaPickerBinding;LWZ/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;", "item", "bindImage", "(Lru/ozon/app/android/ugc/databinding/ItemMediaPickerBinding;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;)V", "bindLoadingView", "bindRemoveButton", "bindRetryButton", "bindBorder", "bindBadge", "bind", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;)V", "bindUploadingProgress", "Lru/ozon/app/android/ugc/databinding/ItemMediaPickerBinding;", "LWZ/l;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;", "Landroid/graphics/drawable/Drawable;", "badgeBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaPickerItemVH extends j {
    private Drawable badgeBackgroundDrawable;

    @NotNull
    private final ItemMediaPickerBinding binding;
    private MediaPickerVO.PickerItemVO item;

    @NotNull
    private final Function0<Unit> onAddClick;

    @NotNull
    private final Function1<Long, Unit> onCancelClick;

    @NotNull
    private final Function1<Long, Unit> onRemoveClick;

    @NotNull
    private final Function1<Long, Unit> onRetryClick;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaPickerItemVH(@NotNull ItemMediaPickerBinding binding, @NotNull l tokenizedAnalytics, @NotNull Function0<Unit> onAddClick, @NotNull Function1<? super Long, Unit> onRemoveClick, @NotNull Function1<? super Long, Unit> onRetryClick, @NotNull Function1<? super Long, Unit> onCancelClick) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onAddClick, "onAddClick");
        Intrinsics.checkNotNullParameter(onRemoveClick, "onRemoveClick");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onAddClick = onAddClick;
        this.onRemoveClick = onRemoveClick;
        this.onRetryClick = onRetryClick;
        this.onCancelClick = onCancelClick;
        IconView retryIcon = binding.retryIcon;
        Intrinsics.checkNotNullExpressionValue(retryIcon, "retryIcon");
        MediaPickerMapper.Companion companion = MediaPickerMapper.INSTANCE;
        IconHolderKt.bind$default(retryIcon, companion.getRetryIcon(), null, 2, null);
        IconView cancelIcon = binding.cancelIcon;
        Intrinsics.checkNotNullExpressionValue(cancelIcon, "cancelIcon");
        IconHolderKt.bind$default(cancelIcon, companion.getCancelIcon(), null, 2, null);
        binding.cancelIcon.setOnClickListener(new a(this, 8));
        binding.retryIcon.setOnClickListener(new b(this, 14));
        binding.removeIcon.setOnClickListener(new Dc0.j(this, 5));
        this.itemView.setOnClickListener(new CC.a(this, 6));
    }

    private final void bindBadge(ItemMediaPickerBinding itemMediaPickerBinding, MediaPickerVO.PickerItemVO pickerItemVO) {
        float[] fArr = null;
        MediaPickerVO.PickerVO pickerVO = pickerItemVO instanceof MediaPickerVO.PickerVO ? (MediaPickerVO.PickerVO) pickerItemVO : null;
        BadgeDTO badge = pickerVO != null ? pickerVO.getBadge() : null;
        Group badgeGroup = itemMediaPickerBinding.badgeGroup;
        Intrinsics.checkNotNullExpressionValue(badgeGroup, "badgeGroup");
        ViewExtKt.showOrGone(badgeGroup, Boolean.valueOf(badge != null));
        if (badge == null) {
            View badgeBackgroundView = itemMediaPickerBinding.badgeBackgroundView;
            Intrinsics.checkNotNullExpressionValue(badgeBackgroundView, "badgeBackgroundView");
            ViewExtKt.gone(badgeBackgroundView);
            BadgeView badgeView = itemMediaPickerBinding.badgeView;
            Intrinsics.checkNotNullExpressionValue(badgeView, "badgeView");
            ViewExtKt.gone(badgeView);
            return;
        }
        BadgeView badgeView2 = itemMediaPickerBinding.badgeView;
        Intrinsics.checkNotNullExpressionValue(badgeView2, "badgeView");
        BadgeHolderKt.bindOrGone$default(badgeView2, badge, (Function1) null, 2, (Object) null);
        Drawable background = itemMediaPickerBinding.badgeView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            View view = itemMediaPickerBinding.badgeBackgroundView;
            Drawable drawable = this.badgeBackgroundDrawable;
            Drawable drawable2 = drawable;
            if (drawable == null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                float[] cornerRadii = gradientDrawable.getCornerRadii();
                if (cornerRadii != null) {
                    ArrayList arrayList = new ArrayList(cornerRadii.length);
                    for (float f7 : cornerRadii) {
                        arrayList.add(Float.valueOf(Dimens.INSTANCE.getDPF_2() + f7));
                    }
                    fArr = C7714v.R0(arrayList);
                }
                gradientDrawable2.setCornerRadii(fArr);
                Context context = itemMediaPickerBinding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gradientDrawable2.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
                this.badgeBackgroundDrawable = gradientDrawable2;
                drawable2 = gradientDrawable2;
            }
            view.setBackground(drawable2);
        }
    }

    private final void bindBorder(ItemMediaPickerBinding itemMediaPickerBinding, MediaPickerVO.PickerItemVO pickerItemVO) {
        View borderView = itemMediaPickerBinding.borderView;
        Intrinsics.checkNotNullExpressionValue(borderView, "borderView");
        ViewExtKt.showOrGone(borderView, Boolean.valueOf(pickerItemVO instanceof MediaPickerVO.EmptyVO));
    }

    private final void bindImage(ItemMediaPickerBinding itemMediaPickerBinding, MediaPickerVO.PickerItemVO pickerItemVO) {
        ImageDTO copy;
        CommonAtomIconDTO icon;
        ImageDTO copy2;
        CommonAtomIconDTO icon2;
        String str = null;
        if (pickerItemVO instanceof MediaPickerVO.PickerVO) {
            Image image = itemMediaPickerBinding.image;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            MediaPickerVO.PickerVO pickerVO = (MediaPickerVO.PickerVO) pickerItemVO;
            ImageHolderKt.bind$default(image, pickerVO.getImage(), null, 2, null);
            IconView centerIcon = itemMediaPickerBinding.centerIcon;
            Intrinsics.checkNotNullExpressionValue(centerIcon, "centerIcon");
            IconHolderKt.bindOrGone$default(centerIcon, pickerVO.getCenterIcon(), null, 2, null);
            IconView iconView = itemMediaPickerBinding.centerIcon;
            IconDTO centerIcon2 = pickerVO.getCenterIcon();
            if (centerIcon2 != null && (icon2 = centerIcon2.getIcon()) != null) {
                str = icon2.getIcon();
            }
            iconView.setContentDescription(str);
            return;
        }
        if (pickerItemVO instanceof MediaPickerVO.EmptyVO) {
            Image image2 = itemMediaPickerBinding.image;
            Intrinsics.checkNotNullExpressionValue(image2, "image");
            copy2 = r7.copy((r34 & 1) != 0 ? r7.image : null, (r34 & 2) != 0 ? r7.backgroundColor : null, (r34 & 4) != 0 ? r7.aspectRatio : null, (r34 & 8) != 0 ? r7.hasParanja : false, (r34 & 16) != 0 ? r7.layoutPaddingLeft : null, (r34 & 32) != 0 ? r7.layoutPaddingRight : null, (r34 & 64) != 0 ? r7.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r7.layoutPaddingBottom : null, (r34 & 256) != 0 ? r7.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r7.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r7.testInfo : null, (r34 & 2048) != 0 ? r7.trackingInfo : null, (r34 & 4096) != 0 ? r7.imageWidth : null, (r34 & 8192) != 0 ? r7.imageType : null, (r34 & 16384) != 0 ? r7.fitType : null, (r34 & 32768) != 0 ? ((MediaPickerVO.EmptyVO) pickerItemVO).getImage().customRatio : null);
            ImageHolderKt.bind$default(image2, copy2, null, 2, null);
            IconView centerIcon3 = itemMediaPickerBinding.centerIcon;
            Intrinsics.checkNotNullExpressionValue(centerIcon3, "centerIcon");
            ViewExtKt.gone(centerIcon3);
            return;
        }
        if (!(pickerItemVO instanceof MediaPickerVO.MediaVO)) {
            throw new o();
        }
        AttachmentVO.Status status = ((MediaPickerVO.MediaVO) pickerItemVO).getAttachment().getStatus();
        boolean z11 = (!(pickerItemVO instanceof MediaPickerVO.VideoVO) || status.getIsShowLoader() || status.getIsShowRetry()) ? false : true;
        Image image3 = itemMediaPickerBinding.image;
        Intrinsics.checkNotNullExpressionValue(image3, "image");
        copy = r8.copy((r34 & 1) != 0 ? r8.image : null, (r34 & 2) != 0 ? r8.backgroundColor : null, (r34 & 4) != 0 ? r8.aspectRatio : null, (r34 & 8) != 0 ? r8.hasParanja : true, (r34 & 16) != 0 ? r8.layoutPaddingLeft : null, (r34 & 32) != 0 ? r8.layoutPaddingRight : null, (r34 & 64) != 0 ? r8.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r8.layoutPaddingBottom : null, (r34 & 256) != 0 ? r8.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r8.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r8.testInfo : null, (r34 & 2048) != 0 ? r8.trackingInfo : null, (r34 & 4096) != 0 ? r8.imageWidth : null, (r34 & 8192) != 0 ? r8.imageType : null, (r34 & 16384) != 0 ? r8.fitType : null, (r34 & 32768) != 0 ? pickerItemVO.getImage().customRatio : null);
        ImageHolderKt.bind$default(image3, copy, null, 2, null);
        IconView centerIcon4 = itemMediaPickerBinding.centerIcon;
        Intrinsics.checkNotNullExpressionValue(centerIcon4, "centerIcon");
        IconHolderKt.bindOrGone$default(centerIcon4, pickerItemVO.getCenterIcon(), null, 2, null);
        IconView centerIcon5 = itemMediaPickerBinding.centerIcon;
        Intrinsics.checkNotNullExpressionValue(centerIcon5, "centerIcon");
        ViewExtKt.showOrGone(centerIcon5, Boolean.valueOf(z11));
        IconView iconView2 = itemMediaPickerBinding.centerIcon;
        IconDTO centerIcon6 = pickerItemVO.getCenterIcon();
        if (centerIcon6 != null && (icon = centerIcon6.getIcon()) != null) {
            str = icon.getIcon();
        }
        iconView2.setContentDescription(str);
    }

    private final void bindLoadingView(ItemMediaPickerBinding itemMediaPickerBinding, MediaPickerVO.PickerItemVO pickerItemVO) {
        boolean z11 = (pickerItemVO instanceof MediaPickerVO.MediaVO) && ((MediaPickerVO.MediaVO) pickerItemVO).getAttachment().getStatus().getIsShowLoader();
        if (z11) {
            itemMediaPickerBinding.progressView.reset();
        }
        CircularProgressBar progressView = itemMediaPickerBinding.progressView;
        Intrinsics.checkNotNullExpressionValue(progressView, "progressView");
        ViewExtKt.showOrGone(progressView, Boolean.valueOf(z11));
        IconView cancelIcon = itemMediaPickerBinding.cancelIcon;
        Intrinsics.checkNotNullExpressionValue(cancelIcon, "cancelIcon");
        ViewExtKt.showOrGone(cancelIcon, Boolean.valueOf(z11));
    }

    private final void bindRemoveButton(ItemMediaPickerBinding itemMediaPickerBinding, MediaPickerVO.PickerItemVO pickerItemVO) {
        boolean z11 = pickerItemVO instanceof MediaPickerVO.MediaVO;
        if (z11) {
            IconView removeIcon = itemMediaPickerBinding.removeIcon;
            Intrinsics.checkNotNullExpressionValue(removeIcon, "removeIcon");
            IconHolderKt.bind$default(removeIcon, ((MediaPickerVO.MediaVO) pickerItemVO).getRemoveIcon(), null, 2, null);
        }
        IconView removeIcon2 = itemMediaPickerBinding.removeIcon;
        Intrinsics.checkNotNullExpressionValue(removeIcon2, "removeIcon");
        ViewExtKt.showOrInvisible(removeIcon2, z11 && ((MediaPickerVO.MediaVO) pickerItemVO).getAttachment().getStatus().getIsShowRemover());
    }

    private final void bindRetryButton(ItemMediaPickerBinding itemMediaPickerBinding, MediaPickerVO.PickerItemVO pickerItemVO) {
        IconView retryIcon = itemMediaPickerBinding.retryIcon;
        Intrinsics.checkNotNullExpressionValue(retryIcon, "retryIcon");
        ViewExtKt.showOrGone(retryIcon, Boolean.valueOf((pickerItemVO instanceof MediaPickerVO.MediaVO) && ((MediaPickerVO.MediaVO) pickerItemVO).getAttachment().getStatus().getIsShowRetry()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$0(MediaPickerItemVH mediaPickerItemVH, View view) {
        AttachmentVO attachment;
        MediaPickerVO.PickerItemVO pickerItemVO = mediaPickerItemVH.item;
        MediaPickerVO.MediaVO mediaVO = pickerItemVO instanceof MediaPickerVO.MediaVO ? (MediaPickerVO.MediaVO) pickerItemVO : null;
        if (mediaVO == null || (attachment = mediaVO.getAttachment()) == null) {
            return;
        }
        mediaPickerItemVH.onCancelClick.invoke(Long.valueOf(attachment.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$2(MediaPickerItemVH mediaPickerItemVH, View view) {
        AttachmentVO attachment;
        MediaPickerVO.PickerItemVO pickerItemVO = mediaPickerItemVH.item;
        MediaPickerVO.MediaVO mediaVO = pickerItemVO instanceof MediaPickerVO.MediaVO ? (MediaPickerVO.MediaVO) pickerItemVO : null;
        if (mediaVO == null || (attachment = mediaVO.getAttachment()) == null) {
            return;
        }
        mediaPickerItemVH.onRetryClick.invoke(Long.valueOf(attachment.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$4(MediaPickerItemVH mediaPickerItemVH, View view) {
        AttachmentVO attachment;
        MediaPickerVO.PickerItemVO pickerItemVO = mediaPickerItemVH.item;
        MediaPickerVO.MediaVO mediaVO = pickerItemVO instanceof MediaPickerVO.MediaVO ? (MediaPickerVO.MediaVO) pickerItemVO : null;
        if (mediaVO == null || (attachment = mediaVO.getAttachment()) == null) {
            return;
        }
        mediaPickerItemVH.onRemoveClick.invoke(Long.valueOf(attachment.getId()));
        l lVar = mediaPickerItemVH.tokenizedAnalytics;
        MediaPickerVO.PickerItemVO pickerItemVO2 = mediaPickerItemVH.item;
        TokenizedAnalyticsExtKt.processClickEvents(lVar, pickerItemVO2 != null ? pickerItemVO2.getTokenizedEvent() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$5(MediaPickerItemVH mediaPickerItemVH, View view) {
        if (mediaPickerItemVH.item instanceof MediaPickerVO.PickerVO) {
            mediaPickerItemVH.onAddClick.invoke();
            l lVar = mediaPickerItemVH.tokenizedAnalytics;
            MediaPickerVO.PickerItemVO pickerItemVO = mediaPickerItemVH.item;
            TokenizedAnalyticsExtKt.processClickEvents(lVar, pickerItemVO != null ? pickerItemVO.getTokenizedEvent() : null);
        }
    }

    public final void bind(@NotNull MediaPickerVO.PickerItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemMediaPickerBinding itemMediaPickerBinding = this.binding;
        this.item = item;
        bindImage(itemMediaPickerBinding, item);
        bindBorder(itemMediaPickerBinding, item);
        bindRemoveButton(itemMediaPickerBinding, item);
        bindLoadingView(itemMediaPickerBinding, item);
        bindRetryButton(itemMediaPickerBinding, item);
        bindBadge(itemMediaPickerBinding, item);
    }

    public final void bindUploadingProgress(@NotNull MediaPickerVO.PickerItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        p<Integer> uploadingProgress = ((MediaPickerVO.MediaVO) item).getAttachment().getUploadingProgress();
        if (uploadingProgress != null) {
            C2399j.C(new C2408n0(new C(n.a(uploadingProgress), new MediaPickerItemVH$bindUploadingProgress$1(null)), new MediaPickerItemVH$bindUploadingProgress$2(this, null)), K.a(this));
        }
    }
}
