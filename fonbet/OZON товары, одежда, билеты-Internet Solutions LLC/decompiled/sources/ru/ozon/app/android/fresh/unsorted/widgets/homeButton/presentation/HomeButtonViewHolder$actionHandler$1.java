package ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class HomeButtonViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ HomeButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeButtonViewHolder$actionHandler$1(HomeButtonViewHolder homeButtonViewHolder) {
        super(1);
        this.this$0 = homeButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        i iVar;
        View view;
        AppBarLayout composerAppbar;
        Intrinsics.checkNotNullParameter(it, "it");
        iVar = this.this$0.uiContainer;
        this.this$0.smartScrollToStart(iVar.e0());
        ComponentCallbacksC5392m b11 = iVar.K().b();
        if (b11 == null || (view = b11.getView()) == null || (composerAppbar = ComposerViewExtensionKt.composerAppbar(view)) == null) {
            return;
        }
        composerAppbar.s(true);
    }
}
