package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.request.PikazonRequestBuilder;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ImageComposableKt$AdultImage$painter$1$1$1 extends AbstractC7737t implements Function1<PikazonRequestBuilder<Drawable>, Unit> {
    final /* synthetic */ int $fallbackRes;
    final /* synthetic */ ImageSlotSize $slotSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageComposableKt$AdultImage$painter$1$1$1(ImageSlotSize imageSlotSize, int i11) {
        super(1);
        this.$slotSize = imageSlotSize;
        this.$fallbackRes = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PikazonRequestBuilder<Drawable> pikazonRequestBuilder) {
        invoke2(pikazonRequestBuilder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PikazonRequestBuilder<Drawable> rememberPikazonImagePainter) {
        Intrinsics.checkNotNullParameter(rememberPikazonImagePainter, "$this$rememberPikazonImagePainter");
        rememberPikazonImagePainter.size(new ImageSize((int) this.$slotSize.getWidth(), (int) this.$slotSize.getHeight()));
        rememberPikazonImagePainter.placeholder(this.$fallbackRes);
    }
}
