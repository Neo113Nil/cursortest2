package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.image.Image;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MilesForBuyersCardViewBinder$prepareAnimation$1$1$listener$1 extends AbstractC7737t implements Function1<Animator, Unit> {
    final /* synthetic */ Image $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MilesForBuyersCardViewBinder$prepareAnimation$1$1$listener$1(Image image) {
        super(1);
        this.$this_with = image;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
        invoke2(animator);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$this_with.setAlpha(1.0f);
        this.$this_with.setTranslationY(0.0f);
        this.$this_with.setTranslationZ(0.0f);
        this.$this_with.animate().setListener(null);
    }
}
