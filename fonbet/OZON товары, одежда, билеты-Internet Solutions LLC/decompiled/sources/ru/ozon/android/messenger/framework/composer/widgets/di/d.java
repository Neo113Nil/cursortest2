package ru.ozon.android.messenger.framework.composer.widgets.di;

import k20.C7475g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<C7475g, ActionHandlersFactory> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ActionHandlersFactory f86833b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(ActionHandlersFactory actionHandlersFactory) {
        super(1);
        this.f86833b = actionHandlersFactory;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActionHandlersFactory invoke(C7475g c7475g) {
        C7475g StatusWidget = c7475g;
        Intrinsics.checkNotNullParameter(StatusWidget, "$this$StatusWidget");
        return this.f86833b;
    }
}
