package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.chatlist.w;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$handleSocketConnectionError$2$1", f = "ChatListViewModel.kt", l = {586}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class C extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90569d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9509v f90570e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f90571f;

    static final class a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f90572b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
            super(1);
            this.f90572b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.f old = fVar;
            Intrinsics.checkNotNullParameter(old, "old");
            return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(old, kotlin.collections.K.f71697a, this.f90572b, null, new w.a(false), null, null, null, null, null, 2036);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(C9509v c9509v, List<ru.ozon.android.messenger.framework.presentation.models.q> list, kotlin.coroutines.d<? super C> dVar) {
        super(2, dVar);
        this.f90570e = c9509v;
        this.f90571f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C(this.f90570e, this.f90571f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.presentation.chatlist.d dVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90569d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f90569d = 1;
            if (Y.b(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        b7.d.a();
        dVar = this.f90570e.f90700h;
        dVar.a(new a(this.f90571f));
        return Unit.f71690a;
    }
}
