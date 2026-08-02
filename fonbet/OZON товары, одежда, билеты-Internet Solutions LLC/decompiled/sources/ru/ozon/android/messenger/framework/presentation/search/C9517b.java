package ru.ozon.android.messenger.framework.presentation.search;

import S0.InterfaceC3978p0;
import android.net.Uri;
import androidx.fragment.app.Q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.chatdetail.d;
import ru.ozon.android.messenger.framework.presentation.search.InterfaceC9526f;
import ru.ozon.app.android.messenger.R$id;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchFragment$onViewCreated$3$1$1", f = "ChatSearchFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.search.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9517b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f91632d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9516a f91633e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91634f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9517b(InterfaceC3978p0 interfaceC3978p0, C9516a c9516a, ru.ozon.android.messenger.framework.core.d dVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f91632d = interfaceC3978p0;
        this.f91633e = c9516a;
        this.f91634f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9517b(this.f91632d, this.f91633e, this.f91634f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9517b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        InterfaceC9526f interfaceC9526f = (InterfaceC9526f) this.f91632d.getValue();
        boolean z11 = interfaceC9526f instanceof InterfaceC9526f.b;
        C9516a fragment = this.f91633e;
        if (z11) {
            List<ru.ozon.android.messenger.framework.presentation.models.e> a11 = ((InterfaceC9526f.b) interfaceC9526f).a();
            if (!((ArrayList) a11).isEmpty()) {
                for (ru.ozon.android.messenger.framework.presentation.models.e eVar : a11) {
                    ru.ozon.android.messenger.framework.data.b bVar = fragment.f91604c;
                    if (bVar == null) {
                        Intrinsics.n("blockStore");
                        throw null;
                    }
                    ru.ozon.android.messenger.framework.data.d.d(bVar, eVar).k(this.f91634f.e());
                }
            }
        } else if (interfaceC9526f instanceof InterfaceC9526f.d) {
            if (fragment.f91607f == null) {
                Intrinsics.n("router");
                throw null;
            }
            ru.ozon.android.messenger.framework.navigation.d.f(fragment, ((InterfaceC9526f.d) interfaceC9526f).a());
        } else if (interfaceC9526f instanceof InterfaceC9526f.a) {
            if (fragment.f91607f == null) {
                Intrinsics.n("router");
                throw null;
            }
            InterfaceC9526f.a aVar2 = (InterfaceC9526f.a) interfaceC9526f;
            Uri deeplink = Uri.parse(aVar2.a().e());
            String chatId = aVar2.a().c();
            String f7 = aVar2.a().f();
            d.EnumC9455c scrollPosition = d.EnumC9455c.CENTER;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
            ru.ozon.android.messenger.framework.presentation.chatdetail.d a12 = d.C9454b.a(deeplink, chatId, f7, true, true, scrollPosition);
            androidx.fragment.app.G parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            Q p11 = parentFragmentManager.p();
            p11.r(R$id.fragmentChatContainer, a12, deeplink.toString());
            p11.g(deeplink.toString());
            p11.i();
        } else if (interfaceC9526f instanceof InterfaceC9526f.c) {
            if (fragment.f91607f == null) {
                Intrinsics.n("router");
                throw null;
            }
            ru.ozon.android.messenger.framework.navigation.d.e(fragment, ((InterfaceC9526f.c) interfaceC9526f).a());
        } else if (interfaceC9526f != null) {
            throw new Sc.o();
        }
        return Unit.f71690a;
    }
}
