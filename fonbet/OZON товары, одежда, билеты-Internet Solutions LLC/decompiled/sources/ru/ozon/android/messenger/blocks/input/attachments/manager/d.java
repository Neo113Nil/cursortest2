package ru.ozon.android.messenger.blocks.input.attachments.manager;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import De.C2862e;
import Sc.o;
import Sc.s;
import android.content.Context;
import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.attachments.data.j;
import ru.ozon.android.messenger.blocks.input.attachments.manager.a;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;
import ru.ozon.android.messenger.blocks.input.pickerlauncher.e;
import ru.ozon.android.messenger.blocks.input.pickerlauncher.f;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.utils.n;
import xe.B0;
import xe.C10727i;
import xe.I;
import xe.J;
import xe.M;
import xe.N;
import ze.C11115c;
import ze.EnumC11113a;
import ze.k;

/* loaded from: classes10.dex */
public final class d implements ru.ozon.android.messenger.blocks.input.attachments.manager.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f85401a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I f85402b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.utils.file.d f85403c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final j f85404d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.viewmodel.f f85405e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final d.f f85406f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C11115c f85407g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<a.C1497a> f85408h;

    /* renamed from: i, reason: collision with root package name */
    private int f85409i;

    /* renamed from: j, reason: collision with root package name */
    private long f85410j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<UUID, B0> f85411k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<UUID, ru.ozon.android.messenger.blocks.input.attachments.presentation.b> f85412l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private Object f85413m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private C2862e f85414n;

    /* renamed from: o, reason: collision with root package name */
    private String f85415o;

    /* renamed from: p, reason: collision with root package name */
    private int f85416p;

    /* renamed from: q, reason: collision with root package name */
    private int f85417q;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.manager.InputAttachmentsManagerImpl$consumeIncidents$1", f = "InputAttachmentsManager.kt", l = {173}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85418d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85418d;
            if (i11 == 0) {
                s.b(obj);
                d dVar = d.this;
                C11115c c11115c = dVar.f85407g;
                a.C1497a q11 = dVar.q();
                this.f85418d = 1;
                if (c11115c.n(q11, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.manager.InputAttachmentsManagerImpl$handleNewAttachments$2", f = "InputAttachmentsManager.kt", l = {241}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85420d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> f85422f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LinkedHashSet f85423g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, LinkedHashSet linkedHashSet, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f85422f = list;
            this.f85423g = linkedHashSet;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new b(this.f85422f, this.f85423g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85420d;
            if (i11 == 0) {
                s.b(obj);
                d dVar = d.this;
                String str = dVar.f85415o;
                List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list = this.f85422f;
                if (str != null) {
                    dVar.f85405e.c(str, list);
                }
                this.f85420d = 1;
                if (d.b(dVar, list, this.f85423g, this) == aVar) {
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

    static final class c extends AbstractC7737t implements Function1<Uri, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f85424b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Uri uri) {
            Uri it = uri;
            Intrinsics.checkNotNullParameter(it, "it");
            String path = it.getPath();
            return Boolean.valueOf(path == null || path.length() == 0);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.input.attachments.manager.d$d, reason: collision with other inner class name */
    static final class C1498d extends AbstractC7737t implements Function1<Uri, Boolean> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkedHashSet f85426c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f85427d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1498d(LinkedHashSet linkedHashSet, boolean z11) {
            super(1);
            this.f85426c = linkedHashSet;
            this.f85427d = z11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Uri uri) {
            Uri uri2 = uri;
            Intrinsics.checkNotNullParameter(uri2, "uri");
            d dVar = d.this;
            boolean d11 = dVar.f85403c.d(uri2);
            LinkedHashSet linkedHashSet = this.f85426c;
            boolean z11 = false;
            if (d11) {
                linkedHashSet.add(e.d.f85558a);
            } else if (!this.f85427d || dVar.f85403c.e(uri2, dVar.f85410j)) {
                z11 = true;
            } else {
                linkedHashSet.add(e.a.f85555a);
            }
            return Boolean.valueOf(z11);
        }
    }

    static final class e extends AbstractC7737t implements Function1<Uri, ru.ozon.android.messenger.blocks.input.attachments.presentation.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f85428b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super Uri, ? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> function1) {
            super(1);
            this.f85428b = (AbstractC7737t) function1;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.blocks.input.attachments.presentation.b invoke(Uri uri) {
            Uri it = uri;
            Intrinsics.checkNotNullParameter(it, "it");
            return (ru.ozon.android.messenger.blocks.input.attachments.presentation.b) this.f85428b.invoke(it);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.manager.InputAttachmentsManagerImpl$removeAttachment$1", f = "InputAttachmentsManager.kt", l = {166}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85429d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ UUID f85431f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(UUID uuid, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f85431f = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new f(this.f85431f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85429d;
            if (i11 == 0) {
                s.b(obj);
                d dVar = d.this;
                ru.ozon.android.messenger.blocks.input.viewmodel.f fVar = dVar.f85405e;
                String uuid = this.f85431f.toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                fVar.b(uuid);
                C11115c c11115c = dVar.f85407g;
                a.C1497a q11 = dVar.q();
                this.f85429d = 1;
                if (c11115c.n(q11, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.manager.InputAttachmentsManagerImpl$setAttachmentsConfig$4", f = "InputAttachmentsManager.kt", l = {135}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85432d;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new g(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85432d;
            if (i11 == 0) {
                s.b(obj);
                d dVar = d.this;
                C11115c c11115c = dVar.f85407g;
                a.C1497a q11 = dVar.q();
                this.f85432d = 1;
                if (c11115c.n(q11, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.manager.InputAttachmentsManagerImpl$uploadAttachmentAndUpdateState$1", f = "InputAttachmentsManager.kt", l = {253, 254, 260, 261, 265}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        ru.ozon.android.messenger.blocks.input.attachments.presentation.b f85434d;

        /* renamed from: e, reason: collision with root package name */
        int f85435e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.input.attachments.presentation.b f85436f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f85437g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Integer f85438h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar, d dVar, Integer num, kotlin.coroutines.d<? super h> dVar2) {
            super(2, dVar2);
            this.f85436f = bVar;
            this.f85437g = dVar;
            this.f85438h = num;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f85436f, this.f85437g, this.f85438h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
        
            if (ru.ozon.android.messenger.blocks.input.attachments.manager.d.a(r9, r13, r12) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        
            if (r13 == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        
            if (r13 == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        
            if (ru.ozon.android.messenger.blocks.input.attachments.manager.d.a(r9, r1, r12) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        
            if (ru.ozon.android.messenger.blocks.input.attachments.manager.d.a(r9, r1, r12) == r0) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b.a i11;
            b.C1500b i12;
            ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i13 = this.f85435e;
            Integer num = this.f85438h;
            d dVar = this.f85437g;
            if (i13 == 0) {
                s.b(obj);
                ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar2 = this.f85436f;
                if (bVar2 instanceof b.C1500b) {
                    i12 = b.C1500b.i((b.C1500b) bVar2, b.c.C1502b.f85481a, 0, 1007);
                    this.f85434d = i12;
                    this.f85435e = 1;
                } else {
                    if (!(bVar2 instanceof b.a)) {
                        throw new o();
                    }
                    i11 = b.a.i((b.a) bVar2, b.c.C1502b.f85481a, 0, 1007);
                    this.f85434d = i11;
                    this.f85435e = 3;
                }
                return aVar;
            }
            if (i13 == 1) {
                i12 = (b.C1500b) this.f85434d;
                s.b(obj);
                this.f85434d = null;
                this.f85435e = 2;
                obj = d.n(num, this, dVar, i12);
            } else if (i13 == 2) {
                s.b(obj);
                bVar = (ru.ozon.android.messenger.blocks.input.attachments.presentation.b) obj;
            } else if (i13 == 3) {
                i11 = (b.a) this.f85434d;
                s.b(obj);
                this.f85434d = null;
                this.f85435e = 4;
                obj = d.m(num, this, dVar, i11);
            } else {
                if (i13 != 4) {
                    if (i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
                bVar = (ru.ozon.android.messenger.blocks.input.attachments.presentation.b) obj;
            }
            this.f85435e = 5;
        }
    }

    public d(@NotNull Context context, @NotNull I ioDispatcher, @NotNull ru.ozon.android.messenger.utils.file.d fileHelper, @NotNull j uploadAttachmentsRepository, @NotNull ru.ozon.android.messenger.blocks.input.viewmodel.f draftSaver, @NotNull d.f networkConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        Intrinsics.checkNotNullParameter(uploadAttachmentsRepository, "uploadAttachmentsRepository");
        Intrinsics.checkNotNullParameter(draftSaver, "draftSaver");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        this.f85401a = context;
        this.f85402b = ioDispatcher;
        this.f85403c = fileHelper;
        this.f85404d = uploadAttachmentsRepository;
        this.f85405e = draftSaver;
        this.f85406f = networkConfig;
        C11115c a11 = k.a(1, 4, EnumC11113a.SUSPEND);
        this.f85407g = a11;
        this.f85408h = C2399j.H(a11);
        this.f85409i = 10;
        this.f85410j = 20971520L;
        this.f85411k = new ConcurrentHashMap<>();
        this.f85412l = new ConcurrentHashMap<>();
        this.f85413m = kotlin.collections.M.f71699a;
        this.f85414n = N.a(ioDispatcher.plus(new ru.ozon.android.messenger.blocks.input.attachments.manager.e(J.f105405n0)));
    }

    public static final Object a(d dVar, ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar, kotlin.coroutines.d dVar2) {
        dVar.f85412l.put(bVar.b(), bVar);
        Object n11 = dVar.f85407g.n(dVar.q(), dVar2);
        return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
    }

    public static final Object b(d dVar, List list, LinkedHashSet linkedHashSet, kotlin.coroutines.d dVar2) {
        dVar.f85413m = linkedHashSet;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar = (ru.ozon.android.messenger.blocks.input.attachments.presentation.b) it.next();
            dVar.f85412l.put(bVar.b(), bVar);
        }
        Object n11 = dVar.f85407g.n(dVar.q(), dVar2);
        return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
    }

    public static final Object m(Integer num, kotlin.coroutines.d dVar, d dVar2, b.a aVar) {
        dVar2.getClass();
        return C10727i.f(dVar2.f85402b, new ru.ozon.android.messenger.blocks.input.attachments.manager.f(num, null, dVar2, aVar), dVar);
    }

    public static final Object n(Integer num, kotlin.coroutines.d dVar, d dVar2, b.C1500b c1500b) {
        dVar2.getClass();
        return C10727i.f(dVar2.f85402b, new ru.ozon.android.messenger.blocks.input.attachments.manager.g(num, null, dVar2, c1500b), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final a.C1497a q() {
        Collection<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> values = this.f85412l.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        return new a.C1497a(C7714v.U0(values), this.f85413m);
    }

    private final void t(List<? extends Uri> list, boolean z11, Function1<? super Uri, ? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> function1) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ConcurrentHashMap<UUID, ru.ozon.android.messenger.blocks.input.attachments.presentation.b> concurrentHashMap = this.f85412l;
        if (list.size() + concurrentHashMap.size() > this.f85409i) {
            linkedHashSet.add(e.b.f85556a);
        }
        List C11 = l.C(l.v(l.B(l.h(l.i(C7714v.w(list), c.f85424b), new C1498d(linkedHashSet, z11)), this.f85409i - concurrentHashMap.size()), new e(function1)));
        this.f85416p++;
        Iterator it = C11.iterator();
        while (it.hasNext()) {
            y((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) it.next(), null);
        }
        C10727i.c(this.f85414n, null, null, new b(C11, linkedHashSet, null), 3);
    }

    private final void y(ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar, Integer num) {
        ConcurrentHashMap<UUID, B0> concurrentHashMap = this.f85411k;
        B0 b02 = concurrentHashMap.get(bVar.b());
        if (b02 != null) {
            b02.j(null);
        }
        concurrentHashMap.put(bVar.b(), C10727i.c(this.f85414n, null, null, new h(bVar, this, num, null), 3));
    }

    public final void o(@NotNull ru.ozon.android.messenger.blocks.input.pickerlauncher.f attachments) {
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        if (!(attachments instanceof f.a)) {
            if (!(attachments instanceof f.b)) {
                throw new o();
            }
            t(((f.b) attachments).a(), false, new ru.ozon.android.messenger.blocks.input.attachments.manager.c(this));
            return;
        }
        List<Uri> a11 = ((f.a) attachments).a();
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            try {
                this.f85401a.getContentResolver().takePersistableUriPermission((Uri) it.next(), 1);
            } catch (Exception e11) {
                Lm0.a.f17149a.e("addAttachmentFromFilePicker takePersistableUriPermission failed, e = " + e11, new Object[0]);
            }
        }
        t(a11, true, new ru.ozon.android.messenger.blocks.input.attachments.manager.b(this));
    }

    public final void p() {
        ConcurrentHashMap<UUID, B0> concurrentHashMap = this.f85411k;
        Iterator<Map.Entry<UUID, B0>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            B0 value = it.next().getValue();
            if (value != null) {
                value.j(null);
            }
        }
        concurrentHashMap.clear();
        this.f85412l.clear();
        this.f85413m = kotlin.collections.M.f71699a;
        this.f85407g.b(q());
    }

    public final void r() {
        this.f85413m = kotlin.collections.M.f71699a;
        C10727i.c(this.f85414n, null, null, new a(null), 3);
    }

    @NotNull
    public final InterfaceC2395h<a.C1497a> s() {
        return this.f85408h;
    }

    public final void u(@NotNull UUID id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f85412l.remove(id2);
        ConcurrentHashMap<UUID, B0> concurrentHashMap = this.f85411k;
        B0 b02 = concurrentHashMap.get(id2);
        if (b02 != null) {
            b02.j(null);
        }
        concurrentHashMap.remove(id2);
        C10727i.c(this.f85414n, null, null, new f(id2, null), 3);
    }

    public final void v(@NotNull UUID id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar = this.f85412l.get(id2);
        if (bVar instanceof b.C1500b) {
            y(bVar, Integer.valueOf(this.f85416p - 1));
        } else if (bVar instanceof b.a) {
            y(bVar, Integer.valueOf(this.f85416p - 1));
        } else if (bVar != null) {
            throw new o();
        }
    }

    public final void w(Integer num, Integer num2, @NotNull String uploadUrl, @NotNull List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> initialItems, @NotNull String chatId) {
        Integer valueOf;
        Integer valueOf2;
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(initialItems, "initialItems");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        p();
        this.f85415o = chatId;
        this.f85410j = num.intValue();
        this.f85409i = num2.intValue();
        d.f fVar = this.f85406f;
        fVar.getClass();
        a.b.b(n.b(uploadUrl, "", fVar.c()));
        List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list = initialItems;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            valueOf = Integer.valueOf(((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) it.next()).a());
            while (it.hasNext()) {
                Integer valueOf3 = Integer.valueOf(((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) it.next()).a());
                if (valueOf.compareTo(valueOf3) < 0) {
                    valueOf = valueOf3;
                }
            }
        } else {
            valueOf = null;
        }
        this.f85416p = valueOf != null ? valueOf.intValue() + 1 : 0;
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            valueOf2 = Integer.valueOf(((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) it2.next()).e());
            while (it2.hasNext()) {
                Integer valueOf4 = Integer.valueOf(((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) it2.next()).e());
                if (valueOf2.compareTo(valueOf4) < 0) {
                    valueOf2 = valueOf4;
                }
            }
        } else {
            valueOf2 = null;
        }
        this.f85417q = valueOf2 != null ? valueOf2.intValue() + 1 : 0;
        for (ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar : list) {
            this.f85412l.put(bVar.b(), bVar);
            if (!Intrinsics.d(bVar.f(), b.c.a.f85479a)) {
                v(bVar.b());
            }
        }
        this.f85413m = kotlin.collections.M.f71699a;
        C10727i.c(this.f85414n, null, null, new g(null), 3);
    }

    public final void x(@NotNull List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> attachments) {
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Iterator<T> it = attachments.iterator();
        while (it.hasNext()) {
            y((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) it.next(), null);
        }
        this.f85416p++;
        this.f85417q = attachments.size();
    }
}
