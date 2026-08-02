package ru.ozon.android.messenger.framework.presentation.search.composable;

import S0.InterfaceC3978p0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.app.android.messenger.R$id;

/* loaded from: classes10.dex */
final class A extends AbstractC7737t implements Function1<Context, View> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.viewmapper.a<?, ru.ozon.android.messenger.framework.presentation.models.g, X4.a> f91636b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91637c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<ru.ozon.android.messenger.framework.presentation.common.view.recycler.q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>> f91638d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(ru.ozon.android.messenger.framework.core.viewmapper.a aVar, ru.ozon.android.messenger.framework.core.d dVar, InterfaceC3978p0 interfaceC3978p0) {
        super(1);
        this.f91636b = aVar;
        this.f91637c = dVar;
        this.f91638d = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Context context) {
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        ru.ozon.android.messenger.framework.core.viewmapper.a<?, ru.ozon.android.messenger.framework.presentation.models.g, X4.a> aVar = this.f91636b;
        InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, X4.a> inflate = aVar.getInflate();
        LayoutInflater from = LayoutInflater.from(context2);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        X4.a invoke = inflate.invoke(from, null, Boolean.FALSE);
        View constraintLayout = invoke.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        constraintLayout.setTag(R$id.m_view_binding_tag, invoke);
        invoke.getConstraintLayout().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a.AbstractC1563a blockContainerSettings = aVar.getBlockContainerSettings();
        if (Intrinsics.d(blockContainerSettings, a.AbstractC1563a.C1564a.f87356a)) {
            Function2<X4.a, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.framework.presentation.common.view.recycler.q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>> viewProducer = aVar.getViewProducer();
            ru.ozon.android.messenger.framework.core.d dVar = this.f91637c;
            ru.ozon.android.messenger.framework.presentation.common.view.recycler.q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a> invoke2 = viewProducer.invoke(invoke, dVar);
            this.f91638d.setValue(invoke2);
            Object rVar = invoke2 instanceof ru.ozon.android.messenger.framework.presentation.common.view.recycler.B ? new ru.ozon.android.messenger.framework.presentation.common.view.recycler.r((ru.ozon.android.messenger.framework.presentation.common.view.recycler.B) invoke2, null, new z((ru.ozon.android.messenger.framework.presentation.common.view.recycler.B) invoke2, dVar)) : new ru.ozon.android.messenger.framework.presentation.common.view.recycler.s(invoke2);
            View constraintLayout2 = invoke.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            constraintLayout2.setTag(R$id.m_view_holder_tag, rVar);
        } else {
            if (!(blockContainerSettings instanceof a.AbstractC1563a.b)) {
                throw new Sc.o();
            }
            invoke.getConstraintLayout().setVisibility(8);
        }
        return invoke.getConstraintLayout();
    }
}
