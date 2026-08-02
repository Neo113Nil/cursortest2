package ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation;

import WZ.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.ugc.databinding.ItemMediaPickerBinding;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.image.ImageSizeKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000278B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u000e\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\r2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R*\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R0\u00101\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R0\u00104\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100¨\u00069"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerAdapter;", "Ljk0/i;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerItemVH;", "LWZ/l;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(LWZ/l;Landroidx/lifecycle/J;)V", "holder", "", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerItemVH;I)V", "", "", "payloads", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerItemVH;ILjava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerItemVH;", "list", "Ljava/lang/Runnable;", "runnable", "submitList", "(Ljava/util/List;Ljava/lang/Runnable;)V", "LWZ/l;", "Landroid/view/ViewGroup$LayoutParams;", "itemLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "Lkotlin/Function0;", "onAddClick", "Lkotlin/jvm/functions/Function0;", "getOnAddClick", "()Lkotlin/jvm/functions/Function0;", "setOnAddClick", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "", "onRemoveClick", "Lkotlin/jvm/functions/Function1;", "getOnRemoveClick", "()Lkotlin/jvm/functions/Function1;", "setOnRemoveClick", "(Lkotlin/jvm/functions/Function1;)V", "onRetryClick", "getOnRetryClick", "setOnRetryClick", "onCancelClick", "getOnCancelClick", "setOnCancelClick", "MediaPickerItemDiffCallback", "UploadingProgressPayload", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaPickerAdapter extends i<MediaPickerVO.PickerItemVO, MediaPickerItemVH> {
    private ViewGroup.LayoutParams itemLayoutParams;
    private Function0<Unit> onAddClick;
    private Function1<? super Long, Unit> onCancelClick;
    private Function1<? super Long, Unit> onRemoveClick;
    private Function1<? super Long, Unit> onRetryClick;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerAdapter$MediaPickerItemDiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;", "<init>", "()V", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "other", "", "hasSameStatus", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;)Z", "oldItem", "newItem", "areItemsTheSame", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;)Z", "areContentsTheSame", "", "getChangePayload", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;)Ljava/lang/Object;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaPickerItemDiffCallback extends i.d<MediaPickerVO.PickerItemVO> {

        @NotNull
        public static final MediaPickerItemDiffCallback INSTANCE = new MediaPickerItemDiffCallback();

        private MediaPickerItemDiffCallback() {
        }

        private final boolean hasSameStatus(AttachmentVO attachmentVO, AttachmentVO attachmentVO2) {
            if (!Intrinsics.d(attachmentVO.getStatus(), attachmentVO2.getStatus())) {
                return false;
            }
            if (attachmentVO.getUploadingProgress() == null && attachmentVO2.getUploadingProgress() == null) {
                return true;
            }
            return (attachmentVO.getUploadingProgress() == null || attachmentVO2.getUploadingProgress() == null) ? false : true;
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull MediaPickerVO.PickerItemVO oldItem, @NotNull MediaPickerVO.PickerItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof MediaPickerVO.MediaVO) && (newItem instanceof MediaPickerVO.MediaVO)) {
                return hasSameStatus(((MediaPickerVO.MediaVO) oldItem).getAttachment(), ((MediaPickerVO.MediaVO) newItem).getAttachment());
            }
            if ((oldItem instanceof MediaPickerVO.PickerVO) && (newItem instanceof MediaPickerVO.PickerVO)) {
                return Intrinsics.d(oldItem, newItem);
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull MediaPickerVO.PickerItemVO oldItem, @NotNull MediaPickerVO.PickerItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(newItem.getId(), oldItem.getId());
        }

        @Override // androidx.recyclerview.widget.i.d
        public Object getChangePayload(@NotNull MediaPickerVO.PickerItemVO oldItem, @NotNull MediaPickerVO.PickerItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (!(oldItem instanceof MediaPickerVO.MediaVO) || !(newItem instanceof MediaPickerVO.MediaVO)) {
                return null;
            }
            MediaPickerVO.MediaVO mediaVO = (MediaPickerVO.MediaVO) oldItem;
            MediaPickerVO.MediaVO mediaVO2 = (MediaPickerVO.MediaVO) newItem;
            if (Intrinsics.d(mediaVO.getAttachment().getStatus(), mediaVO2.getAttachment().getStatus()) && mediaVO.getAttachment().getUploadingProgress() == null && mediaVO2.getAttachment().getUploadingProgress() != null) {
                return UploadingProgressPayload.INSTANCE;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerAdapter$UploadingProgressPayload;", "", "<init>", "()V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UploadingProgressPayload {

        @NotNull
        public static final UploadingProgressPayload INSTANCE = new UploadingProgressPayload();

        private UploadingProgressPayload() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerAdapter(@NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner) {
        super(MediaPickerItemDiffCallback.INSTANCE, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    public final Function0<Unit> getOnAddClick() {
        return this.onAddClick;
    }

    public final Function1<Long, Unit> getOnCancelClick() {
        return this.onCancelClick;
    }

    public final Function1<Long, Unit> getOnRemoveClick() {
        return this.onRemoveClick;
    }

    public final Function1<Long, Unit> getOnRetryClick() {
        return this.onRetryClick;
    }

    public final void setOnAddClick(Function0<Unit> function0) {
        this.onAddClick = function0;
    }

    public final void setOnCancelClick(Function1<? super Long, Unit> function1) {
        this.onCancelClick = function1;
    }

    public final void setOnRemoveClick(Function1<? super Long, Unit> function1) {
        this.onRemoveClick = function1;
    }

    public final void setOnRetryClick(Function1<? super Long, Unit> function1) {
        this.onRetryClick = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r1 = r2.copy((r34 & 1) != 0 ? r2.image : null, (r34 & 2) != 0 ? r2.backgroundColor : null, (r34 & 4) != 0 ? r2.aspectRatio : null, (r34 & 8) != 0 ? r2.hasParanja : false, (r34 & 16) != 0 ? r2.layoutPaddingLeft : null, (r34 & 32) != 0 ? r2.layoutPaddingRight : null, (r34 & 64) != 0 ? r2.layoutPaddingTop : null, (r34 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r2.layoutPaddingBottom : null, (r34 & 256) != 0 ? r2.cornerRadius : null, (r34 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r2.context : null, (r34 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r2.testInfo : null, (r34 & 2048) != 0 ? r2.trackingInfo : null, (r34 & 4096) != 0 ? r2.imageWidth : null, (r34 & 8192) != 0 ? r2.imageType : ru.ozon.uni.atoms.data.image.ImageDTO.ImageType.FIX, (r34 & 16384) != 0 ? r2.fitType : null, (r34 & 32768) != 0 ? r2.customRatio : null);
     */
    @Override // androidx.recyclerview.widget.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void submitList(List<MediaPickerVO.PickerItemVO> list, Runnable runnable) {
        MediaPickerVO.PickerItemVO pickerItemVO;
        ImageDTO copy;
        if (this.itemLayoutParams == null) {
            ImageSize imageSize = (list == null || (pickerItemVO = (MediaPickerVO.PickerItemVO) C7714v.M(list)) == null || (r2 = pickerItemVO.getImage()) == null || copy == null) ? null : ImageSizeKt.getImageSize(copy);
            this.itemLayoutParams = new ViewGroup.LayoutParams(imageSize != null ? Dimens.INSTANCE.getDP_4() + imageSize.getWidth() : -2, imageSize != null ? Dimens.INSTANCE.getDP_4() + imageSize.getHeight() : -2);
        }
        super.submitList(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((MediaPickerItemVH) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public MediaPickerItemVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemMediaPickerBinding inflate = ItemMediaPickerBinding.inflate(LayoutInflater.from(parent.getContext()));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        MediaPickerItemVH mediaPickerItemVH = new MediaPickerItemVH(inflate, this.tokenizedAnalytics, new MediaPickerAdapter$onCreateViewHolder$1(this), new MediaPickerAdapter$onCreateViewHolder$2(this), new MediaPickerAdapter$onCreateViewHolder$3(this), new MediaPickerAdapter$onCreateViewHolder$4(this));
        mediaPickerItemVH.itemView.setLayoutParams(this.itemLayoutParams);
        return mediaPickerItemVH;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull MediaPickerItemVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MediaPickerVO.PickerItemVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    public void onBindViewHolder(@NotNull MediaPickerItemVH holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (!payloads.isEmpty()) {
            MediaPickerVO.PickerItemVO item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            holder.bindUploadingProgress(item);
            return;
        }
        super.onBindViewHolder((MediaPickerAdapter) holder, position, payloads);
    }
}
