package ru.ozon.android.composerCommonViewKit.emptyState.statusWidget;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.di.EmptyStateWidgetComponent;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.core.StatusWidgetConfig;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/Function1;", "Lk20/g;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonParserProvider", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactoryProvider", "Ln20/i;", "StatusWidget", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ln20/i;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StatusWidgetKt {
    @NotNull
    public static final i StatusWidget(@NotNull final Function1<? super C7475g, ? extends JsonParser> jsonParserProvider, @NotNull final Function1<? super C7475g, ? extends ActionHandlersFactory> actionHandlersFactoryProvider) {
        Intrinsics.checkNotNullParameter(jsonParserProvider, "jsonParserProvider");
        Intrinsics.checkNotNullParameter(actionHandlersFactoryProvider, "actionHandlersFactoryProvider");
        final long[] b11 = j.b();
        final String str = "common";
        final String str2 = "statusWidget";
        return new i(str, str2, b11) { // from class: ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.StatusWidgetKt$StatusWidget$$inlined$WidgetFactory$default$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new StatusWidgetConfig(((EmptyStateWidgetComponent) storage.getComponent(EmptyStateWidgetComponent.class)).getStatusParser());
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return ((EmptyStateWidgetComponent) storage.getComponent(EmptyStateWidgetComponent.class)).getViewMappers();
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{EmptyStateWidgetComponent.Companion.invoke(storage, jsonParserProvider, actionHandlersFactoryProvider)};
            }
        };
    }
}
