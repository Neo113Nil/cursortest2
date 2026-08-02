package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.domain.model.f;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.uni.atoms.af.AtomAction;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleRemoveMessageAction$1", f = "ChatViewModel.kt", l = {1105}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class G extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89984d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89985e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9467e f89986f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f89985e = aVar;
        this.f89986f = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new G(dVar, this.f89985e, this.f89986f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((G) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.usecases.F f7;
        Map<String, String> params;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89984d;
        if (i11 == 0) {
            Sc.s.b(obj);
            AtomAction c11 = this.f89985e.c();
            String str = null;
            AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
            if (click != null && (params = click.getParams()) != null) {
                str = (String) ru.ozon.android.messenger.framework.navigation.action.b.a(d.c.REMOVE_MESSAGE.a(), params);
            }
            if (str != null) {
                f7 = this.f89986f.f90226t;
                f.c cVar = new f.c(str);
                this.f89984d = 1;
                if (f7.g(cVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
