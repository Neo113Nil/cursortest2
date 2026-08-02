package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation;

import Sc.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.f;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.l;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.v;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.AiMessageActionsViewModel$1", f = "AiMessageActionsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<f, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f84022d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f84023e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f84023e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        g gVar = new g(this.f84023e, dVar);
        gVar.f84022d = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(f fVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(fVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object f02;
        l lVar;
        ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        f aiMessageActionsVO = (f) this.f84022d;
        h hVar = this.f84023e;
        f02 = hVar.f0();
        lVar = hVar.f84025f;
        ((l.a) lVar).getClass();
        Intrinsics.checkNotNullParameter(aiMessageActionsVO, "aiMessageActionsVO");
        List<f.a> b11 = aiMessageActionsVO.b();
        ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
        Iterator it = ((ArrayList) b11).iterator();
        while (it.hasNext()) {
            f.a aVar2 = (f.a) it.next();
            boolean d11 = Intrinsics.d(aVar2.f(), Boolean.TRUE);
            if (aVar2.b() != null) {
                IconButtonV3DTO b12 = d11 ? aVar2.b() : aVar2.c();
                bVar = aVar2.e() != null ? new a.C1454a(aVar2.d(), b12, aVar2.e().longValue(), d11) : new a.c(aVar2.d(), b12, d11);
            } else {
                bVar = new a.b(aVar2.c(), aVar2.d());
            }
            arrayList.add(bVar);
        }
        AiMessageActionsDTO.SourcesBadge c11 = aiMessageActionsVO.c();
        v.e0(hVar, new ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.e(c11 != null ? c11.getBadge() : null, arrayList));
        return Unit.f71690a;
    }
}
