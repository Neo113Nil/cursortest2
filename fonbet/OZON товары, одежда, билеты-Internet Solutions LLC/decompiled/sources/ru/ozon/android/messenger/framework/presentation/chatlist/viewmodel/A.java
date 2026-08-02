package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import androidx.lifecycle.x0;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.action.g;
import ru.ozon.android.messenger.framework.presentation.chatlist.w;
import xe.C10727i;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$handleReadAllAction$2", f = "ChatListViewModel.kt", l = {615}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class A extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90560d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90561e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9509v f90562f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$handleReadAllAction$2$1$1", f = "ChatListViewModel.kt", l = {610}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90563d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9509v f90564e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f90565f;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.A$a$a, reason: collision with other inner class name */
        static final class C1680a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

            /* renamed from: b, reason: collision with root package name */
            public static final C1680a f90566b = new C1680a(1);

            @Override // kotlin.jvm.functions.Function1
            public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
                ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
                Intrinsics.checkNotNullParameter(it, "it");
                return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, null, null, null, new w.b(true), null, null, null, null, null, 2039);
            }
        }

        static final class b extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f90567b = new b(1);

            @Override // kotlin.jvm.functions.Function1
            public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
                ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
                Intrinsics.checkNotNullParameter(it, "it");
                return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, null, null, null, new w.b(false), null, null, null, null, null, 2039);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9509v c9509v, int i11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f90564e = c9509v;
            this.f90565f = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f90564e, this.f90565f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ru.ozon.android.messenger.framework.presentation.chatlist.d dVar;
            ru.ozon.android.messenger.framework.presentation.chatlist.d dVar2;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90563d;
            C9509v c9509v = this.f90564e;
            if (i11 == 0) {
                Sc.s.b(obj);
                dVar = c9509v.f90700h;
                dVar.a(C1680a.f90566b);
                long millis = TimeUnit.SECONDS.toMillis(this.f90565f);
                this.f90563d = 1;
                if (Y.b(millis, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            dVar2 = c9509v.f90700h;
            dVar2.a(b.f90567b);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(ru.ozon.android.messenger.framework.navigation.action.a aVar, C9509v c9509v, kotlin.coroutines.d<? super A> dVar) {
        super(1, dVar);
        this.f90561e = aVar;
        this.f90562f = c9509v;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new A(this.f90561e, this.f90562f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((A) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90560d;
        C9509v c9509v = this.f90562f;
        ru.ozon.android.messenger.framework.navigation.action.a aVar3 = this.f90561e;
        if (i11 == 0) {
            Sc.s.b(obj);
            Integer num = (Integer) ru.ozon.android.messenger.framework.navigation.action.b.b(g.b.LOADING_TTL.a(), aVar3.d());
            if (num != null) {
                C10727i.c(x0.a(c9509v), null, null, new a(c9509v, num.intValue(), null), 3);
            }
            aVar = c9509v.f90704l;
            this.f90560d = 1;
            obj = aVar.e(aVar3, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        C9509v.B0(c9509v, (ru.ozon.android.messenger.utils.i) obj, aVar3);
        return Unit.f71690a;
    }
}
