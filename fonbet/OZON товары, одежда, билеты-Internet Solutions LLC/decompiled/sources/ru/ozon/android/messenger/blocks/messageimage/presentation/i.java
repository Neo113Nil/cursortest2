package ru.ozon.android.messenger.blocks.messageimage.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function1<View, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f85794b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f85795c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.messageimage.c f85796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(p pVar, e eVar, ru.ozon.android.messenger.blocks.messageimage.c cVar) {
        super(1);
        this.f85794b = pVar;
        this.f85795c = eVar;
        this.f85796d = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        AtomAction atomAction;
        ru.ozon.android.messenger.framework.core.d dVar;
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        p pVar = this.f85794b;
        s sVar = pVar instanceof s ? (s) pVar : null;
        boolean d11 = Intrinsics.d(sVar != null ? sVar.k() : null, z.b.f91564a);
        e eVar = this.f85795c;
        if (d11) {
            ViewParent parent = eVar.getBinding().blockImageRootFl.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.callOnClick();
            }
        } else {
            ru.ozon.android.messenger.blocks.messageimage.c cVar = this.f85796d;
            AtomActionDTO b11 = cVar.b();
            if (b11 == null || (atomAction = AtomActionMapperKt.toAtomAction(b11, null)) == null) {
                e.i(eVar, cVar);
            } else {
                dVar = eVar.f85770a;
                dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(atomAction, cVar.b(), 2));
            }
        }
        return Unit.f71690a;
    }
}
