package l5;

import A5.p;
import A5.t;
import De.C2862e;
import Sc.InterfaceC4008j;
import Sc.s;
import We.A;
import We.InterfaceC4865g;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import l5.C7873b;
import l5.InterfaceC7874c;
import n5.C8442b;
import o5.InterfaceC8643a;
import org.jetbrains.annotations.NotNull;
import p5.C8856a;
import p5.C8857b;
import p5.C8858c;
import p5.C8859d;
import p5.C8860e;
import p5.i;
import p5.j;
import p5.l;
import q5.C8986a;
import r5.C9171a;
import r5.C9173c;
import s5.C9593a;
import s5.C9594b;
import s5.C9595c;
import s5.C9597e;
import s5.C9598f;
import s5.C9599g;
import t5.InterfaceC9758c;
import v5.AbstractC10235i;
import v5.C10229c;
import v5.C10232f;
import v5.C10234h;
import v5.C10236j;
import v5.C10237k;
import v5.C10238l;
import v5.C10242p;
import v5.C10243q;
import v5.InterfaceC10231e;
import v5.InterfaceC10241o;
import w5.C10435g;
import w5.InterfaceC10436h;
import x5.InterfaceC10658b;
import x5.InterfaceC10659c;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.E0;
import xe.H0;
import xe.I;
import xe.J;
import xe.L0;
import xe.M;
import xe.N;
import xe.U;
import xe.X0;
import z5.InterfaceC10986d;

/* loaded from: classes8.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10229c f72818a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC9758c> f72819b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC8643a> f72820c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC4865g.a> f72821d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f72822e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C10242p f72823f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C7873b f72824g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList f72825h;

    @kotlin.coroutines.jvm.internal.e(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {117}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super AbstractC10235i>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f72826d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f72827e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C10234h f72828f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.coroutines.d dVar, i iVar, C10234h c10234h) {
            super(2, dVar);
            this.f72827e = iVar;
            this.f72828f = c10234h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(dVar, this.f72827e, this.f72828f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super AbstractC10235i> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f72826d;
            i iVar = this.f72827e;
            if (i11 == 0) {
                s.b(obj);
                this.f72826d = 1;
                obj = i.d(iVar, this.f72828f, 0, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            if (((AbstractC10235i) obj) instanceof C10232f) {
                iVar.getClass();
            }
            return obj;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {140}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super AbstractC10235i>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f72829d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f72830e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C10234h f72831f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i f72832g;

        @kotlin.coroutines.jvm.internal.e(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {133}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super AbstractC10235i>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f72833d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ i f72834e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C10234h f72835f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.coroutines.d dVar, i iVar, C10234h c10234h) {
                super(2, dVar);
                this.f72834e = iVar;
                this.f72835f = c10234h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(dVar, this.f72834e, this.f72835f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super AbstractC10235i> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f72833d;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                s.b(obj);
                this.f72833d = 1;
                Object d11 = i.d(this.f72834e, this.f72835f, 1, this);
                return d11 == aVar ? aVar : d11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.coroutines.d dVar, i iVar, C10234h c10234h) {
            super(2, dVar);
            this.f72831f = c10234h;
            this.f72832g = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(dVar, this.f72832g, this.f72831f);
            bVar.f72830e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super AbstractC10235i> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f72829d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            M m11 = (M) this.f72830e;
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 x11 = De.s.f6650a.x();
            C10234h c10234h = this.f72831f;
            U<? extends AbstractC10235i> a11 = C10727i.a(m11, x11, null, new a(null, this.f72832g, c10234h), 2);
            if (c10234h.M() instanceof InterfaceC10659c) {
                A5.k.d(((InterfaceC10659c) c10234h.M()).getView()).b(a11);
            }
            this.f72829d = 1;
            Object s11 = a11.s(this);
            return s11 == aVar ? aVar : s11;
        }
    }

    public i(@NotNull Context context, @NotNull C10229c c10229c, @NotNull InterfaceC4008j interfaceC4008j, @NotNull InterfaceC4008j interfaceC4008j2, @NotNull InterfaceC4008j interfaceC4008j3, @NotNull C7873b c7873b, @NotNull p pVar) {
        this.f72818a = c10229c;
        this.f72819b = interfaceC4008j;
        this.f72820c = interfaceC4008j2;
        this.f72821d = interfaceC4008j3;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f72822e = N.a(CoroutineContext.Element.a.d(De.s.f6650a.x(), (H0) b11).plus(new l(J.f105405n0, this)));
        pVar.getClass();
        t tVar = new t(this, context, true);
        C10242p c10242p = new C10242p(this, tVar);
        this.f72823f = c10242p;
        C7873b.a aVar = new C7873b.a(c7873b);
        aVar.d(new C9595c(), A.class);
        aVar.d(new C9599g(), String.class);
        aVar.d(new C9594b(), Uri.class);
        aVar.d(new C9598f(), Uri.class);
        aVar.d(new C9597e(), Integer.class);
        aVar.d(new C9593a(), byte[].class);
        aVar.c(new C9173c(), Uri.class);
        aVar.c(new C9171a(true), File.class);
        aVar.b(new j.a(interfaceC4008j3, interfaceC4008j2, true), Uri.class);
        aVar.b(new i.a(), File.class);
        aVar.b(new C8856a.C1345a(), Uri.class);
        aVar.b(new C8859d.a(), Uri.class);
        aVar.b(new l.a(), Uri.class);
        aVar.b(new C8860e.a(), Drawable.class);
        aVar.b(new C8857b.a(), Bitmap.class);
        aVar.b(new C8858c.a(), ByteBuffer.class);
        aVar.a(new C8442b.C1290b(4, pVar.a()));
        C7873b e11 = aVar.e();
        this.f72824g = e11;
        this.f72825h = C7714v.q0(new C8986a(this, c10242p), e11.c());
        new AtomicBoolean(false);
        tVar.c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:3|(15:5|6|(5:(1:(1:(9:11|12|13|14|15|16|(5:18|(3:(1:21)|23|(1:25))(1:29)|22|23|(0))(2:30|(1:32))|26|27)(2:56|57))(9:58|59|60|61|62|63|64|(6:67|15|16|(0)(0)|26|27)|66))(4:75|76|77|78)|74|36|37|(5:39|(2:41|(1:43))(1:47)|44|45|46)(2:48|49))(4:107|108|109|(3:111|(1:113)|115)(2:116|117))|79|80|(3:82|(1:84)(1:100)|(9:86|(1:88)(1:99)|89|(1:91)|92|(1:94)|95|(5:97|62|63|64|(0))|66))|101|(0)(0)|89|(0)|92|(0)|95|(0)|66))|120|6|(0)(0)|79|80|(0)|101|(0)(0)|89|(0)|92|(0)|95|(0)|66|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00db, code lost:
    
        r3 = r4;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00be, code lost:
    
        if (A5.h.a(r0, r2) == r3) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015c A[Catch: all -> 0x019b, TryCatch #6 {all -> 0x019b, blocks: (B:16:0x0156, B:18:0x015c, B:21:0x0170, B:22:0x0174, B:23:0x018b, B:25:0x0194, B:29:0x0178, B:30:0x019d, B:32:0x01a1), top: B:15:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0194 A[Catch: all -> 0x019b, TryCatch #6 {all -> 0x019b, blocks: (B:16:0x0156, B:18:0x015c, B:21:0x0170, B:22:0x0174, B:23:0x018b, B:25:0x0194, B:29:0x0178, B:30:0x019d, B:32:0x01a1), top: B:15:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019d A[Catch: all -> 0x019b, TryCatch #6 {all -> 0x019b, blocks: (B:16:0x0156, B:18:0x015c, B:21:0x0170, B:22:0x0174, B:23:0x018b, B:25:0x0194, B:29:0x0178, B:30:0x019d, B:32:0x01a1), top: B:15:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cf A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:80:0x00c9, B:82:0x00cf, B:84:0x00d5, B:86:0x00e2, B:88:0x00ea, B:89:0x00fc, B:91:0x0102, B:92:0x0105, B:94:0x010e, B:95:0x0111, B:99:0x00f8), top: B:79:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:80:0x00c9, B:82:0x00cf, B:84:0x00d5, B:86:0x00e2, B:88:0x00ea, B:89:0x00fc, B:91:0x0102, B:92:0x0105, B:94:0x010e, B:95:0x0111, B:99:0x00f8), top: B:79:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:80:0x00c9, B:82:0x00cf, B:84:0x00d5, B:86:0x00e2, B:88:0x00ea, B:89:0x00fc, B:91:0x0102, B:92:0x0105, B:94:0x010e, B:95:0x0111, B:99:0x00f8), top: B:79:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:80:0x00c9, B:82:0x00cf, B:84:0x00d5, B:86:0x00e2, B:88:0x00ea, B:89:0x00fc, B:91:0x0102, B:92:0x0105, B:94:0x010e, B:95:0x0111, B:99:0x00f8), top: B:79:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f8 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:80:0x00c9, B:82:0x00cf, B:84:0x00d5, B:86:0x00e2, B:88:0x00ea, B:89:0x00fc, B:91:0x0102, B:92:0x0105, B:94:0x010e, B:95:0x0111, B:99:0x00f8), top: B:79:0x00c9 }] */
    /* JADX WARN: Type inference failed for: r1v14, types: [l5.c] */
    /* JADX WARN: Type inference failed for: r1v9, types: [l5.c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [l5.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(i iVar, C10234h c10234h, int i11, kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        Wc.a aVar;
        int i12;
        InterfaceC10241o d11;
        InterfaceC7874c.a aVar2;
        C10234h c10234h2;
        InterfaceC10241o interfaceC10241o;
        C10234h c10234h3;
        InterfaceC9758c g10;
        Bitmap bitmap;
        InterfaceC10658b M11;
        C10234h.b A11;
        Object a11;
        Bitmap bitmap2;
        i iVar2;
        C10234h c10234h4;
        InterfaceC7874c.a aVar3;
        InterfaceC7874c.a aVar4;
        Drawable t2;
        AbstractC10235i abstractC10235i;
        Drawable a12;
        C10234h.b A12;
        i iVar3;
        i iVar4 = iVar;
        iVar4.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i13 = jVar.f72843k;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f72843k = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f72841i;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i12 = jVar.f72843k;
                if (i12 == 0) {
                    if (i12 == 1) {
                        ?? r12 = jVar.f72839g;
                        c10234h3 = jVar.f72838f;
                        interfaceC10241o = jVar.f72837e;
                        iVar3 = jVar.f72836d;
                        try {
                            s.b(obj);
                            aVar2 = r12;
                            iVar4 = iVar3;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2 = r12;
                            c10234h2 = c10234h3;
                        }
                    } else if (i12 == 2) {
                        Bitmap bitmap3 = jVar.f72840h;
                        ?? r42 = jVar.f72839g;
                        C10234h c10234h5 = jVar.f72838f;
                        interfaceC10241o = jVar.f72837e;
                        iVar3 = jVar.f72836d;
                        try {
                            s.b(obj);
                            bitmap2 = bitmap3;
                            aVar3 = r42;
                            c10234h4 = c10234h5;
                            iVar2 = iVar3;
                            d11 = interfaceC10241o;
                            try {
                                C10435g c10435g = (C10435g) obj;
                                aVar3.getClass();
                                I y11 = c10234h4.y();
                                k kVar = new k(c10234h4, iVar2, c10435g, aVar3, bitmap2, null);
                                jVar.f72836d = iVar2;
                                jVar.f72837e = d11;
                                jVar.f72838f = c10234h4;
                                jVar.f72839g = aVar3;
                                jVar.f72840h = null;
                                jVar.f72843k = 3;
                                obj = C10727i.f(y11, kVar, jVar);
                                if (obj != aVar) {
                                    c10234h2 = c10234h4;
                                    aVar4 = aVar3;
                                    abstractC10235i = (AbstractC10235i) obj;
                                    if (!(abstractC10235i instanceof C10243q)) {
                                    }
                                    return abstractC10235i;
                                }
                                return aVar;
                            } catch (Throwable th3) {
                                th = th3;
                                c10234h2 = c10234h4;
                                iVar4 = iVar2;
                                aVar2 = aVar3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            aVar2 = r42;
                            c10234h2 = c10234h5;
                        }
                    } else {
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r13 = jVar.f72839g;
                        c10234h2 = jVar.f72838f;
                        d11 = jVar.f72837e;
                        i iVar5 = jVar.f72836d;
                        try {
                            s.b(obj);
                            iVar2 = iVar5;
                            aVar4 = r13;
                            try {
                                abstractC10235i = (AbstractC10235i) obj;
                                if (!(abstractC10235i instanceof C10243q)) {
                                    C10243q c10243q = (C10243q) abstractC10235i;
                                    InterfaceC10658b M12 = c10234h2.M();
                                    iVar2.getClass();
                                    C10234h b11 = c10243q.b();
                                    if (M12 instanceof InterfaceC10986d) {
                                        c10243q.b().P().getClass();
                                        a12 = c10243q.a();
                                    } else {
                                        if (M12 != null) {
                                            a12 = c10243q.a();
                                        }
                                        aVar4.getClass();
                                        A12 = b11.A();
                                        if (A12 != null) {
                                            A12.c(b11, c10243q);
                                        }
                                    }
                                    M12.a(a12);
                                    aVar4.getClass();
                                    A12 = b11.A();
                                    if (A12 != null) {
                                    }
                                } else if (abstractC10235i instanceof C10232f) {
                                    InterfaceC10658b M13 = c10234h2.M();
                                    iVar2.getClass();
                                    h((C10232f) abstractC10235i, M13, aVar4);
                                }
                                return abstractC10235i;
                            } catch (Throwable th5) {
                                th = th5;
                                aVar2 = aVar4;
                                iVar4 = iVar2;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            aVar2 = r13;
                            iVar4 = iVar5;
                        }
                    }
                    d11 = interfaceC10241o;
                    iVar4 = iVar3;
                    try {
                        if (th instanceof CancellationException) {
                            iVar4.getClass();
                            aVar2.getClass();
                            c10234h2.getClass();
                            throw th;
                        }
                        iVar4.f72823f.getClass();
                        if (th instanceof C10237k) {
                            t2 = c10234h2.u();
                            if (t2 == null) {
                                t2 = c10234h2.t();
                            }
                        } else {
                            t2 = c10234h2.t();
                        }
                        C10232f c10232f = new C10232f(t2, c10234h2, th);
                        h(c10232f, c10234h2.M(), aVar2);
                        return c10232f;
                    } finally {
                        d11.m();
                    }
                }
                s.b(obj);
                d11 = iVar4.f72823f.d(c10234h, E0.g(jVar.getContext()));
                d11.o0();
                C10234h.a Q11 = C10234h.Q(c10234h);
                Q11.c(iVar4.f72818a);
                C10234h a13 = Q11.a();
                aVar2 = InterfaceC7874c.f72809a;
                try {
                    if (a13.m() == C10236j.f102246a) {
                        throw new C10237k("The request's data is null.");
                    }
                    d11.start();
                    if (i11 == 0) {
                        AbstractC5434v z11 = a13.z();
                        jVar.f72836d = iVar4;
                        jVar.f72837e = d11;
                        jVar.f72838f = a13;
                        jVar.f72839g = aVar2;
                        jVar.f72843k = 1;
                    }
                    interfaceC10241o = d11;
                    c10234h3 = a13;
                } catch (Throwable th7) {
                    th = th7;
                    c10234h2 = a13;
                }
                g10 = iVar4.g();
                if (g10 != null) {
                    InterfaceC9758c.b G11 = c10234h3.G();
                    InterfaceC9758c.C2178c b12 = G11 != null ? g10.b(G11) : null;
                    if (b12 != null) {
                        bitmap = b12.a();
                        Drawable bitmapDrawable = bitmap != null ? new BitmapDrawable(c10234h3.l().getResources(), bitmap) : c10234h3.F();
                        M11 = c10234h3.M();
                        if (M11 != null) {
                            M11.b(bitmapDrawable);
                        }
                        aVar2.getClass();
                        A11 = c10234h3.A();
                        if (A11 != null) {
                            A11.a(c10234h3);
                        }
                        InterfaceC10436h K11 = c10234h3.K();
                        jVar.f72836d = iVar4;
                        jVar.f72837e = interfaceC10241o;
                        jVar.f72838f = c10234h3;
                        jVar.f72839g = aVar2;
                        jVar.f72840h = bitmap;
                        jVar.f72843k = 2;
                        a11 = K11.a(jVar);
                        if (a11 != aVar) {
                            bitmap2 = bitmap;
                            iVar2 = iVar4;
                            c10234h4 = c10234h3;
                            obj = a11;
                            aVar3 = aVar2;
                            d11 = interfaceC10241o;
                            C10435g c10435g2 = (C10435g) obj;
                            aVar3.getClass();
                            I y112 = c10234h4.y();
                            k kVar2 = new k(c10234h4, iVar2, c10435g2, aVar3, bitmap2, null);
                            jVar.f72836d = iVar2;
                            jVar.f72837e = d11;
                            jVar.f72838f = c10234h4;
                            jVar.f72839g = aVar3;
                            jVar.f72840h = null;
                            jVar.f72843k = 3;
                            obj = C10727i.f(y112, kVar2, jVar);
                            if (obj != aVar) {
                            }
                        }
                        return aVar;
                    }
                }
                bitmap = null;
                if (bitmap != null) {
                }
                M11 = c10234h3.M();
                if (M11 != null) {
                }
                aVar2.getClass();
                A11 = c10234h3.A();
                if (A11 != null) {
                }
                InterfaceC10436h K112 = c10234h3.K();
                jVar.f72836d = iVar4;
                jVar.f72837e = interfaceC10241o;
                jVar.f72838f = c10234h3;
                jVar.f72839g = aVar2;
                jVar.f72840h = bitmap;
                jVar.f72843k = 2;
                a11 = K112.a(jVar);
                if (a11 != aVar) {
                }
                return aVar;
            }
        }
        jVar = new j(iVar4, cVar);
        Object obj2 = jVar.f72841i;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i12 = jVar.f72843k;
        if (i12 == 0) {
        }
        g10 = iVar4.g();
        if (g10 != null) {
        }
        bitmap = null;
        if (bitmap != null) {
        }
        M11 = c10234h3.M();
        if (M11 != null) {
        }
        aVar2.getClass();
        A11 = c10234h3.A();
        if (A11 != null) {
        }
        InterfaceC10436h K1122 = c10234h3.K();
        jVar.f72836d = iVar4;
        jVar.f72837e = interfaceC10241o;
        jVar.f72838f = c10234h3;
        jVar.f72839g = aVar2;
        jVar.f72840h = bitmap;
        jVar.f72843k = 2;
        a11 = K1122.a(jVar);
        if (a11 != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r4 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(C10232f c10232f, InterfaceC10658b interfaceC10658b, InterfaceC7874c interfaceC7874c) {
        C10234h b11 = c10232f.b();
        if (interfaceC10658b instanceof InterfaceC10986d) {
            c10232f.b().P().a((InterfaceC10986d) interfaceC10658b, c10232f);
        }
        interfaceC10658b.c(c10232f.a());
        interfaceC7874c.getClass();
        C10234h.b A11 = b11.A();
        if (A11 != null) {
            A11.b(b11, c10232f);
        }
    }

    @Override // l5.g
    @NotNull
    public final InterfaceC10231e a(@NotNull C10234h c10234h) {
        U<? extends AbstractC10235i> a11 = C10727i.a(this.f72822e, null, null, new a(null, this, c10234h), 3);
        return c10234h.M() instanceof InterfaceC10659c ? A5.k.d(((InterfaceC10659c) c10234h.M()).getView()).b(a11) : new C10238l(a11);
    }

    @Override // l5.g
    @NotNull
    public final C10229c b() {
        return this.f72818a;
    }

    @Override // l5.g
    public final Object c(@NotNull C10234h c10234h, @NotNull kotlin.coroutines.d<? super AbstractC10235i> dVar) {
        return N.d(new b(null, this, c10234h), dVar);
    }

    @NotNull
    public final C7873b f() {
        return this.f72824g;
    }

    public final InterfaceC9758c g() {
        return this.f72819b.getValue();
    }

    public final void i(int i11) {
        InterfaceC9758c value = this.f72819b.getValue();
        if (value != null) {
            value.a(i11);
        }
    }
}
