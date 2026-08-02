package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke", "(Landroid/graphics/Bitmap;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BaseStoryV3Fragment$setBlurredBackground$2 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ ImageView $this_setBlurredBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseStoryV3Fragment$setBlurredBackground$2(ImageView imageView) {
        super(1);
        this.$this_setBlurredBackground = imageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        this.$this_setBlurredBackground.setImageBitmap(bitmap);
    }
}
