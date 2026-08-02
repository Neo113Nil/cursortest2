package ru.ozon.android.messenger.framework.presentation.search.composable;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.AbstractC9510a;
import ru.ozon.app.android.messenger.R$id;

/* loaded from: classes10.dex */
final class B extends AbstractC7737t implements Function1<View, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.viewmapper.a<?, ru.ozon.android.messenger.framework.presentation.models.g, X4.a> f91639b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.e f91640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(ru.ozon.android.messenger.framework.core.viewmapper.a<?, ru.ozon.android.messenger.framework.presentation.models.g, X4.a> aVar, ru.ozon.android.messenger.framework.presentation.models.e eVar) {
        super(1);
        this.f91639b = aVar;
        this.f91640c = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        Intrinsics.checkNotNullParameter(view2, "view");
        a.AbstractC1563a blockContainerSettings = this.f91639b.getBlockContainerSettings();
        if (Intrinsics.d(blockContainerSettings, a.AbstractC1563a.C1564a.f87356a)) {
            Object tag = view2.getTag(R$id.m_view_holder_tag);
            ru.ozon.android.messenger.framework.presentation.common.view.recycler.lifecycle.a aVar = tag instanceof ru.ozon.android.messenger.framework.presentation.common.view.recycler.lifecycle.a ? (ru.ozon.android.messenger.framework.presentation.common.view.recycler.lifecycle.a) tag : null;
            if (aVar == null) {
                throw new IllegalStateException("ViewHolder not found in View tags!");
            }
            ru.ozon.android.messenger.framework.presentation.models.e eVar = this.f91640c;
            ru.ozon.android.messenger.framework.presentation.models.g b11 = eVar.b();
            ru.ozon.android.messenger.framework.presentation.models.p c11 = eVar.c();
            ru.ozon.android.messenger.framework.presentation.models.d a11 = eVar.a();
            int i11 = AbstractC9510a.f91211d;
            ((AbstractC9510a) aVar).e(b11, c11, a11, null);
        } else if (!(blockContainerSettings instanceof a.AbstractC1563a.b)) {
            throw new Sc.o();
        }
        return Unit.f71690a;
    }
}
