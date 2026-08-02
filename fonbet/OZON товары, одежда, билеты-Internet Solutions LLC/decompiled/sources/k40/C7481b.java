package k40;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Q90.c;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import fd.InterfaceC6511n;
import g30.InterfaceC6618a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l40.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import ze.u;

/* renamed from: k40.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7481b implements InterfaceC7480a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f70494a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7871a f70495b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7871a f70496c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final c f70497d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f70498e;

    @e(c = "ru.ozon.fintech.features.appreview.interactor.AppReviewInteractorImpl$getAvailableStore$1", f = "AppReviewInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: k40.b$a */
    static final class a extends j implements InterfaceC6511n<Boolean, Boolean, d<? super List<l40.b>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ boolean f70499d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ boolean f70500e;

        @Override // fd.InterfaceC6511n
        public final Object invoke(Boolean bool, Boolean bool2, d<? super List<l40.b>> dVar) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            a aVar = new a(3, dVar);
            aVar.f70499d = booleanValue;
            aVar.f70500e = booleanValue2;
            return aVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            boolean z11 = this.f70499d;
            boolean z12 = this.f70500e;
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object obj2 : C7714v.b0(Boolean.valueOf(z11), Boolean.valueOf(z12))) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                if (((Boolean) obj2).booleanValue()) {
                    arrayList.add(l40.b.a().get(i11));
                }
                i11 = i12;
            }
            return arrayList;
        }
    }

    @e(c = "ru.ozon.fintech.features.appreview.interactor.AppReviewInteractorImpl$startReview$1", f = "AppReviewInteractorImpl.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 74}, m = "invokeSuspend")
    /* renamed from: k40.b$b, reason: collision with other inner class name */
    static final class C1155b extends j implements Function2<u<? super l40.b>, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f70501d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f70502e;

        /* renamed from: k40.b$b$a */
        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7481b f70504a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ u<l40.b> f70505b;

            @e(c = "ru.ozon.fintech.features.appreview.interactor.AppReviewInteractorImpl$startReview$1$1", f = "AppReviewInteractorImpl.kt", l = {56}, m = "emit")
            /* renamed from: k40.b$b$a$a, reason: collision with other inner class name */
            static final class C1156a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                Object f70506d;

                /* renamed from: e, reason: collision with root package name */
                l40.b f70507e;

                /* renamed from: f, reason: collision with root package name */
                Iterator f70508f;

                /* renamed from: g, reason: collision with root package name */
                Pair f70509g;

                /* renamed from: h, reason: collision with root package name */
                /* synthetic */ Object f70510h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ a<T> f70511i;

                /* renamed from: j, reason: collision with root package name */
                int f70512j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1156a(a<? super T> aVar, d<? super C1156a> dVar) {
                    super(dVar);
                    this.f70511i = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f70510h = obj;
                    this.f70512j |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f70511i.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(C7481b c7481b, u<? super l40.b> uVar) {
                this.f70504a = c7481b;
                this.f70505b = uVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x00cc  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x011d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00f5 A[Catch: Exception -> 0x00c6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c6, blocks: (B:11:0x002d, B:12:0x00ed, B:26:0x00f5, B:17:0x00d2), top: B:10:0x002d }] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ea -> B:12:0x00ed). Please report as a decompilation issue!!! */
            @Override // Ae.InterfaceC2397i
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(List<l40.b> list, d<? super Unit> dVar) {
                C1156a c1156a;
                int i11;
                a<T> aVar;
                l40.b bVar;
                Iterator it;
                if (dVar instanceof C1156a) {
                    c1156a = (C1156a) dVar;
                    int i12 = c1156a.f70512j;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1156a.f70512j = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c1156a.f70510h;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1156a.f70512j;
                        if (i11 != 0) {
                            s.b(obj);
                            C7481b c7481b = this.f70504a;
                            List<String> stringArrayData = c7481b.f70497d.q(S90.c.MOB_SHOW_REVIEW_APP).b().getStringArrayData();
                            ArrayList arrayList = new ArrayList();
                            if (stringArrayData != null) {
                                for (String str : stringArrayData) {
                                    if (list.contains(l40.b.valueOf(str))) {
                                        int hashCode = str.hashCode();
                                        if (hashCode != -2021398434) {
                                            if (hashCode == 2402104) {
                                                str.equals("NONE");
                                            } else if (hashCode == 1847682426 && str.equals("GOOGLE_PLAY")) {
                                                arrayList.add(new Pair(l40.b.GOOGLE_PLAY, c7481b.f70495b));
                                            }
                                        } else if (str.equals("RUSTORE")) {
                                            arrayList.add(new Pair(l40.b.RUSTORE, c7481b.f70496c));
                                        }
                                    }
                                }
                            }
                            l40.b bVar2 = l40.b.NONE;
                            Iterator it2 = arrayList.iterator();
                            aVar = this;
                            bVar = bVar2;
                            it = it2;
                            if (it.hasNext()) {
                            }
                            if (!aVar.f70505b.g()) {
                            }
                            return Unit.f71690a;
                        }
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Pair pair = c1156a.f70509g;
                        it = c1156a.f70508f;
                        bVar = c1156a.f70507e;
                        aVar = (a) c1156a.f70506d;
                        try {
                            s.b(obj);
                        } catch (Exception unused) {
                        }
                        if (((Boolean) obj).booleanValue()) {
                            aVar.f70504a.f70494a.A();
                            l40.b bVar3 = (l40.b) pair.e();
                            try {
                            } catch (Exception unused2) {
                                bVar = bVar3;
                            }
                            aVar.f70504a.f70498e.j0(bVar3.name());
                            bVar = bVar3;
                            if (!aVar.f70505b.g()) {
                                u<l40.b> uVar = aVar.f70505b;
                                uVar.b(bVar);
                                uVar.l(null);
                            }
                            return Unit.f71690a;
                        }
                        if (it.hasNext()) {
                            pair = (Pair) it.next();
                            InterfaceC2395h<Boolean> a11 = ((InterfaceC7871a) pair.f()).a();
                            c1156a.f70506d = aVar;
                            c1156a.f70507e = bVar;
                            c1156a.f70508f = it;
                            c1156a.f70509g = pair;
                            c1156a.f70512j = 1;
                            obj = C2399j.u(a11, c1156a);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                            if (it.hasNext()) {
                            }
                        }
                        if (!aVar.f70505b.g()) {
                        }
                        return Unit.f71690a;
                    }
                }
                c1156a = new C1156a(this, dVar);
                Object obj2 = c1156a.f70510h;
                Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1156a.f70512j;
                if (i11 != 0) {
                }
            }
        }

        C1155b(d<? super C1155b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C1155b c1155b = C7481b.this.new C1155b(dVar);
            c1155b.f70502e = obj;
            return c1155b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super l40.b> uVar, d<? super Unit> dVar) {
            return ((C1155b) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        
            if (r7 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        
            if (r4.collect(r5, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u uVar;
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f70501d;
            if (i11 == 0) {
                s.b(obj);
                uVar = (u) this.f70502e;
                C7481b c7481b = C7481b.this;
                InterfaceC2395h<List<l40.b>> g10 = c7481b.g();
                a aVar2 = new a(c7481b, uVar);
                this.f70502e = uVar;
                this.f70501d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                uVar = (u) this.f70502e;
                s.b(obj);
            }
            this.f70502e = null;
            this.f70501d = 2;
            a11 = ze.s.a(uVar, new Q90.b(2), this);
        }
    }

    public C7481b(@NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC7871a gmsReviewService, @NotNull InterfaceC7871a rustoreReviewService, @NotNull c featureToggles, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(gmsReviewService, "gmsReviewService");
        Intrinsics.checkNotNullParameter(rustoreReviewService, "rustoreReviewService");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f70494a = fintechSettings;
        this.f70495b = gmsReviewService;
        this.f70496c = rustoreReviewService;
        this.f70497d = featureToggles;
        this.f70498e = fintechAnalyticInteractor;
    }

    @Override // k40.InterfaceC7480a
    @NotNull
    public final InterfaceC2395h<l40.b> a() {
        return C2399j.f(new C1155b(null));
    }

    @NotNull
    public final InterfaceC2395h<List<l40.b>> g() {
        C2417s0 c2417s0 = new C2417s0(this.f70496c.b(), this.f70495b.b(), new a(3, null));
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C2399j.B(c2417s0, He.b.f10879b);
    }
}
