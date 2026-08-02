package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import Sc.s;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.data.requests.b;
import ru.ozon.android.messenger.framework.domain.model.c;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.ChatLoadingDelegateImpl$handleLoadedUiItems$1$1", f = "ChatLoadingDelegate.kt", l = {385, 386, 388}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90125d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f90126e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.responses.h f90127f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ a.b f90128g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.data.local.a f90129h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ b.a f90130i;

    static final class a extends AbstractC7737t implements Function1<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.responses.h f90131b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.android.messenger.framework.presentation.models.responses.h hVar) {
            super(1);
            this.f90131b = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            num.intValue();
            ru.ozon.android.messenger.framework.presentation.models.responses.f c11 = this.f90131b.c();
            return Integer.valueOf(c11 != null ? c11.h() : 0);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90132a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f90133b;

        static {
            int[] iArr = new int[a.b.values().length];
            try {
                iArr[a.b.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.SCROLL_TO_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90132a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            try {
                iArr2[b.a.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[b.a.BACKWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[b.a.BACK_AND_FORTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f90133b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(d dVar, ru.ozon.android.messenger.framework.presentation.models.responses.h hVar, a.b bVar, ru.ozon.android.messenger.framework.data.local.a aVar, b.a aVar2, kotlin.coroutines.d<? super f> dVar2) {
        super(2, dVar2);
        this.f90126e = dVar;
        this.f90127f = hVar;
        this.f90128g = bVar;
        this.f90129h = aVar;
        this.f90130i = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f90126e, this.f90127f, this.f90128g, this.f90129h, this.f90130i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r5.a(r13, r1, r12) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (r5.a(r13, r1, r12) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r5.a(r13, r1, r12) == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o oVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90125d;
        a.b bVar = this.f90128g;
        ru.ozon.android.messenger.framework.data.local.a aVar2 = this.f90129h;
        d dVar = this.f90126e;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                s.b(obj);
                if (bVar == a.b.FIRST) {
                    d.m(dVar, aVar2.k());
                }
                return Unit.f71690a;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            dVar.x().setValue(new ru.ozon.android.messenger.framework.presentation.common.screen.l(false));
            if (bVar == a.b.FIRST) {
            }
            return Unit.f71690a;
        }
        s.b(obj);
        ru.ozon.android.messenger.framework.presentation.models.responses.h hVar = this.f90127f;
        ArrayList l11 = d.l(dVar, hVar.f(), dVar.r(), Boolean.valueOf(dVar.A()), Boolean.valueOf(dVar.S()));
        int i12 = b.f90132a[bVar.ordinal()];
        if (i12 == 1) {
            oVar = dVar.f90076l;
            oVar.l(new a(hVar));
        } else if (i12 == 2) {
            aVar2.d(new ArrayList());
        }
        int i13 = b.f90133b[this.f90130i.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                c.C1634c c1634c = new c.C1634c(true);
                this.f90125d = 2;
            } else {
                if (i13 != 3) {
                    throw new Sc.o();
                }
                c.a aVar3 = new c.a(false);
                this.f90125d = 3;
            }
            return aVar;
        }
        c.a aVar4 = new c.a(true);
        this.f90125d = 1;
    }
}
