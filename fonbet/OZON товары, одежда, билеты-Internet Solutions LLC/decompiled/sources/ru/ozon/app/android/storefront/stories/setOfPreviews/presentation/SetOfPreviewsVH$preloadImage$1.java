package ru.ozon.app.android.storefront.stories.setOfPreviews.presentation;

import android.graphics.Bitmap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SetOfPreviewsVH$preloadImage$1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ SetOfPreviewsVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetOfPreviewsVH$preloadImage$1(SetOfPreviewsVH setOfPreviewsVH, String str) {
        super(1);
        this.this$0 = setOfPreviewsVH;
        this.$imageUrl = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap it) {
        Set set;
        Intrinsics.checkNotNullParameter(it, "it");
        set = this.this$0.preloadedImages;
        set.add(this.$imageUrl);
    }
}
