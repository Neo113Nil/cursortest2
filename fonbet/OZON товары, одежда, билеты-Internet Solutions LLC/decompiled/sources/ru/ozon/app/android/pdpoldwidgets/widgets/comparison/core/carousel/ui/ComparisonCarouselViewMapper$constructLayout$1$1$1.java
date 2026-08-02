package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui;

import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ComparisonCarouselViewMapper$constructLayout$1$1$1 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ AppBarLayout $composerAppBar;
    final /* synthetic */ LinearLayout $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonCarouselViewMapper$constructLayout$1$1$1(AppBarLayout appBarLayout, LinearLayout linearLayout) {
        super(1);
        this.$composerAppBar = appBarLayout;
        this.$this_apply = linearLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        this.$composerAppBar.setElevation(f7);
        this.$this_apply.setElevation(f7);
    }
}
