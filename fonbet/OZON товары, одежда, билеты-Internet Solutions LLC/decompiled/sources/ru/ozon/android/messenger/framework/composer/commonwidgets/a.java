package ru.ozon.android.messenger.framework.composer.commonwidgets;

import androidx.lifecycle.D;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function1<Tg.b, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f86609b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D f86610c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC7851b f86611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, D d11, InterfaceC7851b interfaceC7851b) {
        super(1);
        this.f86609b = cVar;
        this.f86610c = d11;
        this.f86611d = interfaceC7851b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Tg.b bVar) {
        ru.ozon.android.messenger.framework.composer.navigation.router.a aVar;
        Tg.b action = bVar;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z11 = action instanceof AtomAction.Click;
        c cVar = this.f86609b;
        boolean z12 = false;
        if (z11) {
            AtomAction.Click click = (AtomAction.Click) action;
            if (Intrinsics.d(click.getId(), ru.ozon.android.messenger.framework.composer.action.a.REMOVE_FAST_ANSWER_TEMPLATE.a())) {
                C10727i.c(this.f86610c, null, null, new b(click, cVar, this.f86611d, null), 3);
                z12 = true;
            }
        } else if (action instanceof AtomAction.Move) {
            AtomAction.Move move = (AtomAction.Move) action;
            aVar = cVar.f86619a;
            String link = move.getLink();
            Map<String, String> params = move.getParams();
            if (params == null) {
                params = U.c();
            }
            aVar.a(link, params);
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
