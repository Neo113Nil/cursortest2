package ru.ozon.android.composerCommonViewKit.actions;

import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\t\u0010\nJ1\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH&¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "", "Ll10/i;", "container", "Lru/ozon/composer/ui/widget/k;", "vh", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "createActionHandler", "(Ll10/i;Lru/ozon/composer/ui/widget/k;)Lkotlin/jvm/functions/Function1;", "Ld20/b;", "overlayWidgetViewHolder", "(Ll10/i;Ld20/b;)Lkotlin/jvm/functions/Function1;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ActionHandlersFactory {
    Function1<AtomAction, Unit> createActionHandler(@NotNull i container, @NotNull AbstractC6065b<?> overlayWidgetViewHolder);

    Function1<AtomAction, Unit> createActionHandler(@NotNull i container, @NotNull k<?> vh2);
}
