package ru.ozon.android.messenger.framework.composer.commonwidgets;

import androidx.lifecycle.K;
import d20.AbstractC6065b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l10.InterfaceC7851b;
import l10.i;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.messenger.framework.composer.action.b;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
public final class c implements ActionHandlersFactory {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.composer.navigation.router.a f86619a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.a f86620b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.composer.navigation.router.c f86621c;

    public c(@NotNull ru.ozon.android.messenger.framework.composer.navigation.router.a actionNavigator, @NotNull ru.ozon.android.messenger.framework.domain.repository.a actionRepository, @NotNull ru.ozon.android.messenger.framework.composer.navigation.router.c screenRouter) {
        Intrinsics.checkNotNullParameter(actionNavigator, "actionNavigator");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        this.f86619a = actionNavigator;
        this.f86620b = actionRepository;
        this.f86621c = screenRouter;
    }

    @Override // ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory
    public final Function1<AtomAction, Unit> createActionHandler(@NotNull i container, @NotNull k<?> vh2) {
        h<Unit> hVar;
        InterfaceC7851b o11;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(vh2, "vh");
        ru.ozon.android.messenger.framework.composer.navigation.router.a aVar = this.f86619a;
        QZ.a<? extends C7854a> composer = aVar.getComposer();
        if (composer == null || (o11 = composer.o()) == null) {
            hVar = null;
        } else {
            b.a aVar2 = new b.a(o11, aVar);
            aVar2.c(new a(this, K.a(vh2), o11));
            hVar = aVar2.b();
        }
        return (Function1) hVar;
    }

    @Override // ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory
    public final Function1<AtomAction, Unit> createActionHandler(@NotNull i container, @NotNull AbstractC6065b<?> overlayWidgetViewHolder) {
        h<Unit> hVar;
        InterfaceC7851b o11;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(overlayWidgetViewHolder, "overlayWidgetViewHolder");
        ru.ozon.android.messenger.framework.composer.navigation.router.a aVar = this.f86619a;
        QZ.a<? extends C7854a> composer = aVar.getComposer();
        if (composer == null || (o11 = composer.o()) == null) {
            hVar = null;
        } else {
            b.a aVar2 = new b.a(o11, aVar);
            aVar2.c(new a(this, K.a(overlayWidgetViewHolder), o11));
            hVar = aVar2.b();
        }
        return (Function1) hVar;
    }
}
