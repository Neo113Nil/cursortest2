package ru.ozon.android.messenger.framework.domain.usecases;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.A;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9399p implements InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.models.A> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f89109a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.x[] f89110b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f89111c;

    /* renamed from: ru.ozon.android.messenger.framework.domain.usecases.p$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f89112a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.x[] f89113b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f89114c;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.GetSocketEventsUseCase$invoke$$inlined$filter$1$2", f = "GetSocketEventsUseCase.kt", l = {223}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.framework.domain.usecases.p$a$a, reason: collision with other inner class name */
        public static final class C1637a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f89115d;

            /* renamed from: e, reason: collision with root package name */
            int f89116e;

            public C1637a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f89115d = obj;
                this.f89116e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, ru.ozon.android.messenger.framework.presentation.models.x[] xVarArr, String str) {
            this.f89112a = interfaceC2397i;
            this.f89113b = xVarArr;
            this.f89114c = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.d(r7.f89114c, r2) != false) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1637a c1637a;
            int i11;
            List m11;
            if (dVar instanceof C1637a) {
                c1637a = (C1637a) dVar;
                int i12 = c1637a.f89116e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1637a.f89116e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1637a.f89115d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1637a.f89116e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        ru.ozon.android.messenger.framework.presentation.models.A a11 = (ru.ozon.android.messenger.framework.presentation.models.A) obj;
                        if (a11 instanceof A.a) {
                            A.a aVar2 = (A.a) a11;
                            String a12 = aVar2.a();
                            String str = (a12 == null || (m11 = kotlin.text.h.m(a12, new String[]{"/"}, 0, 6)) == null) ? null : (String) C7714v.K(m11);
                            if (C7705l.m(this.f89113b, aVar2.c())) {
                                if (aVar2.c() != ru.ozon.android.messenger.framework.presentation.models.x.CHATS) {
                                }
                            }
                        }
                        c1637a.f89116e = 1;
                        if (this.f89112a.emit(obj, c1637a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c1637a = new C1637a(dVar);
            Object obj22 = c1637a.f89115d;
            Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1637a.f89116e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public C9399p(InterfaceC2395h interfaceC2395h, ru.ozon.android.messenger.framework.presentation.models.x[] xVarArr, String str) {
        this.f89109a = interfaceC2395h;
        this.f89110b = xVarArr;
        this.f89111c = str;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super ru.ozon.android.messenger.framework.presentation.models.A> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f89109a.collect(new a(interfaceC2397i, this.f89110b, this.f89111c), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
