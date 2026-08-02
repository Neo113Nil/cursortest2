package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.stories.story.presentation.blur.StoriesBlur;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "it", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BaseStoryV3Fragment$setBlurredBackground$1 extends AbstractC7737t implements Function1<Bitmap, Bitmap> {
    final /* synthetic */ BaseStoryV3Fragment<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseStoryV3Fragment$setBlurredBackground$1(BaseStoryV3Fragment<T> baseStoryV3Fragment) {
        super(1);
        this.this$0 = baseStoryV3Fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Bitmap invoke(Bitmap it) {
        StoriesBlur storiesBlur;
        Intrinsics.checkNotNullParameter(it, "it");
        storiesBlur = ((BaseStoryV3Fragment) this.this$0).storiesBlur;
        return storiesBlur.blur(it);
    }
}
