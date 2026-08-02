package ru.ozon.app.android.storefront.stories.story.presentation.media;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.stories.story.data.StoryWithImage;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StoryMediaFragment$preloadImage$1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ StoryWithImage $asset;
    final /* synthetic */ StoryMediaFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoryMediaFragment$preloadImage$1(StoryMediaFragment storyMediaFragment, StoryWithImage storyWithImage) {
        super(1);
        this.this$0 = storyMediaFragment;
        this.$asset = storyWithImage;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap it) {
        StoryMediaViewModel viewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        viewModel = this.this$0.getViewModel();
        if (viewModel != null) {
            viewModel.putStoryImageInCache(this.$asset.getImageUrl(), it);
        }
    }
}
