package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons;

import android.graphics.drawable.Drawable;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GallerySoundButtonVH$soundOffDrawable$2 extends AbstractC7737t implements Function0<Drawable> {
    final /* synthetic */ GallerySoundButtonVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GallerySoundButtonVH$soundOffDrawable$2(GallerySoundButtonVH gallerySoundButtonVH) {
        super(0);
        this.this$0 = gallerySoundButtonVH;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        return C7232a.a(this.this$0.itemView.getContext(), R$drawable.ic_l_volume_no_filled);
    }
}
