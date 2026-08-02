package ru.ozon.android.messenger.blocks.recommendations.presentation;

import Ae.AbstractC2381a;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.MutableDateTime;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.android.atom.badge.BadgeView;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.recommendations.presentation.BadgeTimerView$startTimer$1$1", f = "BadgeTimerView.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f86308d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f86309e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f86310a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.recommendations.presentation.BadgeTimerView$startTimer$1$1$1$1$1", f = "BadgeTimerView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.blocks.recommendations.presentation.b$a$a, reason: collision with other inner class name */
        static final class C1527a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ d f86311d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1527a(d dVar, kotlin.coroutines.d<? super C1527a> dVar2) {
                super(2, dVar2);
                this.f86311d = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1527a(this.f86311d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1527a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                org.joda.time.format.b bVar;
                MutableDateTime mutableDateTime;
                BadgeView badgeView;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                d dVar = this.f86311d;
                Context context = dVar.getContext();
                int i11 = R$string.messenger_timer_countdown_prefix;
                bVar = dVar.f86322a;
                mutableDateTime = dVar.f86324c;
                String string = context.getString(i11, bVar.g(mutableDateTime));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                badgeView = dVar.f86326e;
                badgeView.setText(string);
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.recommendations.presentation.BadgeTimerView$startTimer$1$1$1", f = "BadgeTimerView.kt", l = {95}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.blocks.recommendations.presentation.b$a$b, reason: collision with other inner class name */
        static final class C1528b extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            Object f86312d;

            /* renamed from: e, reason: collision with root package name */
            d f86313e;

            /* renamed from: f, reason: collision with root package name */
            MutableDateTime f86314f;

            /* renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f86315g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ a<T> f86316h;

            /* renamed from: i, reason: collision with root package name */
            int f86317i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1528b(a<? super T> aVar, kotlin.coroutines.d<? super C1528b> dVar) {
                super(dVar);
                this.f86316h = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f86315g = obj;
                this.f86317i |= LinearLayoutManager.INVALID_OFFSET;
                return this.f86316h.emit(null, this);
            }
        }

        a(d dVar) {
            this.f86310a = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Unit unit, kotlin.coroutines.d<? super Unit> dVar) {
            C1528b c1528b;
            int i11;
            MutableDateTime mutableDateTime;
            d dVar2;
            MutableDateTime mutableDateTime2;
            if (dVar instanceof C1528b) {
                c1528b = (C1528b) dVar;
                int i12 = c1528b.f86317i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1528b.f86317i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c1528b.f86315g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1528b.f86317i;
                    if (i11 != 0) {
                        s.b(obj);
                        d dVar3 = this.f86310a;
                        mutableDateTime = dVar3.f86324c;
                        if (mutableDateTime == null) {
                            d.e(dVar3);
                            return Unit.f71690a;
                        }
                        mutableDateTime.i().h();
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        L0 l02 = De.s.f6650a;
                        C1527a c1527a = new C1527a(dVar3, null);
                        c1528b.f86312d = this;
                        c1528b.f86313e = dVar3;
                        c1528b.f86314f = mutableDateTime;
                        c1528b.f86317i = 1;
                        if (C10727i.f(l02, c1527a, c1528b) == aVar) {
                            return aVar;
                        }
                        dVar2 = dVar3;
                        mutableDateTime2 = mutableDateTime;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableDateTime2 = c1528b.f86314f;
                        dVar2 = c1528b.f86313e;
                        s.b(obj);
                    }
                    if (mutableDateTime2.getMillis() < 1000) {
                        d.e(dVar2);
                    }
                    return Unit.f71690a;
                }
            }
            c1528b = new C1528b(this, dVar);
            Object obj2 = c1528b.f86315g;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1528b.f86317i;
            if (i11 != 0) {
            }
            if (mutableDateTime2.getMillis() < 1000) {
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar, kotlin.coroutines.d<? super b> dVar2) {
        super(2, dVar2);
        this.f86309e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f86309e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f86308d;
        if (i11 == 0) {
            s.b(obj);
            int i12 = d.f86321h;
            d dVar = this.f86309e;
            dVar.getClass();
            InterfaceC2395h A11 = C2399j.A(new c(2, null));
            a aVar2 = new a(dVar);
            this.f86308d = 1;
            if (((AbstractC2381a) A11).collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
