package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BaseGalleryV5ViewHolder$bindInternal$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Integer $galleryPosition;
    final /* synthetic */ GalleryV5VO $item;
    final /* synthetic */ BaseGalleryV5ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseGalleryV5ViewHolder$bindInternal$1(BaseGalleryV5ViewHolder baseGalleryV5ViewHolder, GalleryV5VO galleryV5VO, Integer num) {
        super(0);
        this.this$0 = baseGalleryV5ViewHolder;
        this.$item = galleryV5VO;
        this.$galleryPosition = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Integer num;
        if (this.this$0.getIsScrollAfterFoldable()) {
            this.this$0.setScrollAfterFoldable(false);
            num = this.$item.getPosition();
        } else {
            num = this.$galleryPosition;
        }
        if (num != null) {
            BaseGalleryV5ViewHolder baseGalleryV5ViewHolder = this.this$0;
            int intValue = num.intValue();
            int i11 = intValue != 0 ? -GalleryV5Const.INSTANCE.getITEMS_OFFSET() : 0;
            RecyclerView.o layoutManager = baseGalleryV5ViewHolder.galleryView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.scrollToPositionWithOffset(intValue, i11);
            }
        }
    }
}
