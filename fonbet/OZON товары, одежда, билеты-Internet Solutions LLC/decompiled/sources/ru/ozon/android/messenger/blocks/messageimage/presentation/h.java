package ru.ozon.android.messenger.blocks.messageimage.presentation;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pikazon.image.ImageSize;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<Bitmap, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ImageSize f85790b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f85791c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ImageView f85792d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<ImageSize, Unit> f85793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    h(ImageSize imageSize, e eVar, ImageView imageView, Function1<? super ImageSize, Unit> function1) {
        super(1);
        this.f85790b = imageSize;
        this.f85791c = eVar;
        this.f85792d = imageView;
        this.f85793e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        int i11;
        int i12;
        Bitmap it = bitmap;
        Intrinsics.checkNotNullParameter(it, "it");
        e eVar = this.f85791c;
        ImageSize imageSize = this.f85790b;
        if (imageSize == null) {
            i11 = eVar.f85774e;
            i12 = eVar.f85772c;
            ImageSize a11 = ru.ozon.android.messenger.utils.image.e.a(new ImageSize(ru.ozon.android.messenger.utils.h.c(it.getWidth()), ru.ozon.android.messenger.utils.h.c(it.getHeight())), i11, i12);
            it = Bitmap.createScaledBitmap(it, a11.getWidth(), a11.getHeight(), false);
            Intrinsics.checkNotNullExpressionValue(it, "createScaledBitmap(...)");
        }
        if (imageSize == null) {
            imageSize = new ImageSize(it.getWidth(), it.getHeight());
        }
        ImageView imageView = this.f85792d;
        e.k(eVar, imageView, imageSize);
        imageView.setImageBitmap(it);
        ((g) this.f85793e).invoke(imageSize);
        return Unit.f71690a;
    }
}
