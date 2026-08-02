package ru.ozon.app.android.returns.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.v3.holders.listed.gallery.GalleryHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.list.GalleryView;
import ru.ozon.app.android.returns.actionModal.presentation.viewObject.ReturnActionModalVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Lru/ozon/app/android/atoms/v3/molecules/list/GalleryView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnActionModalComposableKt$ReturnActionModalComposable$2$3$2$1 extends AbstractC7737t implements Function1<GalleryView, Unit> {
    final /* synthetic */ ReturnActionModalVO $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnActionModalComposableKt$ReturnActionModalComposable$2$3$2$1(ReturnActionModalVO returnActionModalVO) {
        super(1);
        this.$item = returnActionModalVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GalleryView galleryView) {
        invoke2(galleryView);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GalleryView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        GalleryHolderKt.bindOrGone$default(view, this.$item.getPhotos(), null, 2, null);
    }
}
