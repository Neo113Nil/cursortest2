package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsPageButtonV5WidgetViewHolder$scrollOffset$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ i $container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsPageButtonV5WidgetViewHolder$scrollOffset$2(i iVar) {
        super(0);
        this.$container = iVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        View view;
        AppBarLayout composerAppbar;
        ComponentCallbacksC5392m b11 = this.$container.K().b();
        return Integer.valueOf((b11 == null || (view = b11.getView()) == null || (composerAppbar = ComposerViewExtensionKt.composerAppbar(view)) == null) ? 0 : composerAppbar.getHeight());
    }
}
