package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3WithImage;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StoryV3MediaFragment$preloadImage$1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ StoryV3WithImage $asset;
    final /* synthetic */ StoryV3MediaFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoryV3MediaFragment$preloadImage$1(StoryV3MediaFragment storyV3MediaFragment, StoryV3WithImage storyV3WithImage) {
        super(1);
        this.this$0 = storyV3MediaFragment;
        this.$asset = storyV3WithImage;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        StoryV3MediaViewModel viewModel = this.this$0.getViewModel();
        if (viewModel != null) {
            viewModel.putStoryImageInCache(this.$asset.getImage(), it);
        }
    }
}
