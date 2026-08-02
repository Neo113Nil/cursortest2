package ru.ozon.uni.atoms.v3.holders.badge;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikit.view.atoms.badge.ImagePosition;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "drawable", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BadgeHolder$loadImage$1 extends AbstractC7737t implements Function1<Drawable, Unit> {
    final /* synthetic */ boolean $isLarge;
    final /* synthetic */ ImagePosition $position;
    final /* synthetic */ BadgeHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgeHolder$loadImage$1(BadgeHolder badgeHolder, ImagePosition imagePosition, boolean z11) {
        super(1);
        this.this$0 = badgeHolder;
        this.$position = imagePosition;
        this.$isLarge = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
        invoke2(drawable);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Drawable drawable) {
        this.this$0.getContainerView().setImageDrawable(drawable, this.$position, this.$isLarge);
    }
}
