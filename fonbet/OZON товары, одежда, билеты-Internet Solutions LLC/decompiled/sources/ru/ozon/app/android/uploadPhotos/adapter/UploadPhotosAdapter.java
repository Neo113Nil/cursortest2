package ru.ozon.app.android.uploadPhotos.adapter;

import Sc.o;
import Ve.C4636t5;
import Xc.a;
import Xc.b;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.uploadPhotos.adapter.viewHolder.AddPhotoItemVH;
import ru.ozon.app.android.uploadPhotos.adapter.viewHolder.PhotoItemVH;
import ru.ozon.app.android.uploadPhotos.adapter.viewHolder.UploadPhotoItemVH;
import ru.ozon.app.android.uploadPhotos.databinding.ItemDeliveryReviewAddPhotoItemBinding;
import ru.ozon.app.android.uploadPhotos.databinding.ItemDeliveryReviewPhotoItemBinding;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000b\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003$%&Be\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012&\u0010\r\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001f\u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R4\u0010\r\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#¨\u0006'"}, d2 = {"Lru/ozon/app/android/uploadPhotos/adapter/UploadPhotosAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "Lru/ozon/app/android/uploadPhotos/adapter/viewHolder/UploadPhotoItemVH;", "Lkotlin/Function0;", "", "onAddPhotoClick", "Lkotlin/Function1;", "", "onRetryLoadPhotoClick", "onRemovePhotoClick", "Lkotlin/Function2;", "", "onListChanged", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uploadPhotos/adapter/viewHolder/UploadPhotoItemVH;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/uploadPhotos/adapter/viewHolder/UploadPhotoItemVH;I)V", "", "previousList", "currentList", "onCurrentListChanged", "(Ljava/util/List;Ljava/util/List;)V", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Companion", "DiffCallback", "ViewType", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadPhotosAdapter extends t<AttachmentVO.AttachedImageVO, UploadPhotoItemVH> {

    @NotNull
    private static final AttachmentVO.AttachedImageVO ADD_PHOTO_STUB;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Function0<Unit> onAddPhotoClick;
    private final Function2<List<AttachmentVO.AttachedImageVO>, List<AttachmentVO.AttachedImageVO>, Unit> onListChanged;

    @NotNull
    private final Function1<Long, Unit> onRemovePhotoClick;

    @NotNull
    private final Function1<Long, Unit> onRetryLoadPhotoClick;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/uploadPhotos/adapter/UploadPhotosAdapter$Companion;", "", "<init>", "()V", "ADD_PHOTO_STUB", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "getADD_PHOTO_STUB", "()Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AttachmentVO.AttachedImageVO getADD_PHOTO_STUB() {
            return UploadPhotosAdapter.ADD_PHOTO_STUB;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/uploadPhotos/adapter/UploadPhotosAdapter$DiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;)Z", "areContentsTheSame", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DiffCallback extends i.d<AttachmentVO.AttachedImageVO> {

        @NotNull
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull AttachmentVO.AttachedImageVO oldItem, @NotNull AttachmentVO.AttachedImageVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull AttachmentVO.AttachedImageVO oldItem, @NotNull AttachmentVO.AttachedImageVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/uploadPhotos/adapter/UploadPhotosAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "ADD_PHOTO", "PHOTO", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType ADD_PHOTO = new ViewType("ADD_PHOTO", 0);
        public static final ViewType PHOTO = new ViewType("PHOTO", 1);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{ADD_PHOTO, PHOTO};
        }

        static {
            ViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewType(String str, int i11) {
        }

        @NotNull
        public static a<ViewType> getEntries() {
            return $ENTRIES;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.ADD_PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        long generateViewId = View.generateViewId();
        AttachmentVO.AttachedImageVO.ImageType imageType = AttachmentVO.AttachedImageVO.ImageType.REVIEW;
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        ADD_PHOTO_STUB = new AttachmentVO.AttachedImageVO(imageType, null, null, null, null, null, null, null, null, generateViewId, null, "stub", "", EMPTY, null, AttachmentVO.Status.ONLY_SHOW.INSTANCE, null, false, 67064, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UploadPhotosAdapter(@NotNull Function0<Unit> onAddPhotoClick, @NotNull Function1<? super Long, Unit> onRetryLoadPhotoClick, @NotNull Function1<? super Long, Unit> onRemovePhotoClick, Function2<? super List<AttachmentVO.AttachedImageVO>, ? super List<AttachmentVO.AttachedImageVO>, Unit> function2) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(onAddPhotoClick, "onAddPhotoClick");
        Intrinsics.checkNotNullParameter(onRetryLoadPhotoClick, "onRetryLoadPhotoClick");
        Intrinsics.checkNotNullParameter(onRemovePhotoClick, "onRemovePhotoClick");
        this.onAddPhotoClick = onAddPhotoClick;
        this.onRetryLoadPhotoClick = onRetryLoadPhotoClick;
        this.onRemovePhotoClick = onRemovePhotoClick;
        this.onListChanged = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return (Intrinsics.d(getItem(position), ADD_PHOTO_STUB) ? ViewType.ADD_PHOTO : ViewType.PHOTO).ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public UploadPhotoItemVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        int i11 = WhenMappings.$EnumSwitchMapping$0[((ViewType) ViewType.getEntries().get(viewType)).ordinal()];
        if (i11 == 1) {
            ItemDeliveryReviewAddPhotoItemBinding inflate = ItemDeliveryReviewAddPhotoItemBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new AddPhotoItemVH(inflate, this.onAddPhotoClick);
        }
        if (i11 != 2) {
            throw new o();
        }
        ItemDeliveryReviewPhotoItemBinding inflate2 = ItemDeliveryReviewPhotoItemBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        return new PhotoItemVH(inflate2, this.onRemovePhotoClick, this.onRetryLoadPhotoClick);
    }

    @Override // androidx.recyclerview.widget.t
    public void onCurrentListChanged(@NotNull List<AttachmentVO.AttachedImageVO> previousList, @NotNull List<AttachmentVO.AttachedImageVO> currentList) {
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
        Function2<List<AttachmentVO.AttachedImageVO>, List<AttachmentVO.AttachedImageVO>, Unit> function2 = this.onListChanged;
        if (function2 != null) {
            function2.invoke(previousList, currentList);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull UploadPhotoItemVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof PhotoItemVH) {
            AttachmentVO.AttachedImageVO item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            ((PhotoItemVH) holder).bind(item);
        }
    }
}
