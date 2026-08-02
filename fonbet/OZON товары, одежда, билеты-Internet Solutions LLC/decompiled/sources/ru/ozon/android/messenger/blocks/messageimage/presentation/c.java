package ru.ozon.android.messenger.blocks.messageimage.presentation;

import android.graphics.drawable.Drawable;
import com.github.chrisbanes.photoview.PhotoView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<Drawable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f85766b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ PhotoView f85767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(PhotoView photoView, a aVar) {
        super(1);
        this.f85766b = aVar;
        this.f85767c = photoView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Drawable drawable) {
        PhotoView photoView = this.f85767c;
        a aVar = this.f85766b;
        aVar.t(new b(photoView, aVar));
        return Unit.f71690a;
    }
}
