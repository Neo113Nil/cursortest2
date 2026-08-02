package ru.ozon.app.android.uploadPhotos.delegate;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "oldList", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "newList", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UploadPhotosDelegate$uploadPhotosAdapter$4 extends AbstractC7737t implements Function2<List<? extends AttachmentVO.AttachedImageVO>, List<? extends AttachmentVO.AttachedImageVO>, Unit> {
    final /* synthetic */ UploadPhotosDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadPhotosDelegate$uploadPhotosAdapter$4(UploadPhotosDelegate uploadPhotosDelegate) {
        super(2);
        this.this$0 = uploadPhotosDelegate;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends AttachmentVO.AttachedImageVO> list, List<? extends AttachmentVO.AttachedImageVO> list2) {
        invoke2((List<AttachmentVO.AttachedImageVO>) list, (List<AttachmentVO.AttachedImageVO>) list2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<AttachmentVO.AttachedImageVO> oldList, List<AttachmentVO.AttachedImageVO> newList) {
        UploadPhotosViewModel uploadPhotosViewModel;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        uploadPhotosViewModel = this.this$0.viewModel;
        if (uploadPhotosViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        int pickImagesLimit = uploadPhotosViewModel.getPickImagesLimit();
        if (oldList.size() < newList.size() || newList.size() == pickImagesLimit) {
            recyclerView = this.this$0.photosRecyclerView;
            recyclerView.smoothScrollToPosition(C7714v.P(newList));
        }
        recyclerView2 = this.this$0.photosRecyclerView;
        recyclerView2.invalidateItemDecorations();
    }
}
