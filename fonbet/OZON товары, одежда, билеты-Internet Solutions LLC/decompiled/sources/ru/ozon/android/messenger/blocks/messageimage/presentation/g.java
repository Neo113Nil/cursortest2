package ru.ozon.android.messenger.blocks.messageimage.presentation;

import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.app.android.pikazon.image.ImageSize;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<ImageSize, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ShapeableImageView f85786b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f85787c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ s f85788d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.d f85789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(ShapeableImageView shapeableImageView, e eVar, ru.ozon.android.messenger.framework.presentation.models.d dVar, s sVar) {
        super(1);
        this.f85786b = shapeableImageView;
        this.f85787c = eVar;
        this.f85788d = sVar;
        this.f85789e = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ImageSize imageSize) {
        ImageSize it = imageSize;
        Intrinsics.checkNotNullParameter(it, "it");
        ShapeableImageView shapeableImageView = this.f85786b;
        Intrinsics.f(shapeableImageView);
        shapeableImageView.addOnLayoutChangeListener(new f(shapeableImageView, this.f85787c, this.f85789e, this.f85788d));
        return Unit.f71690a;
    }
}
