package p40;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import androidx.fragment.app.r;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l90.C7901a;
import org.jetbrains.annotations.NotNull;
import p40.n;
import ze.u;

/* loaded from: classes3.dex */
public final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Q90.c f80175a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7901a f80176b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC8852a f80177c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80178a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f80179b;

        static {
            int[] iArr = new int[C7901a.b.values().length];
            try {
                iArr[C7901a.b.UPDATE_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C7901a.b.UPDATE_NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C7901a.b.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f80178a = iArr;
            int[] iArr2 = new int[C7901a.EnumC1227a.values().length];
            try {
                iArr2[C7901a.EnumC1227a.OZON_UPDATE_SDK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[C7901a.EnumC1227a.UPDATE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f80179b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.appupdate.service.OzonUpdateService$needInAppUpdate$1", f = "OzonUpdateService.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 29}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super h>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f80180d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f80181e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = i.this.new b(dVar);
            bVar.f80181e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC2397i<? super h> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            h hVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f80180d;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.f80181e;
                i iVar = i.this;
                if (n.a.a(iVar, iVar.f80175a)) {
                    iVar.f80176b.getClass();
                    int i12 = a.f80178a[C7901a.b.ERROR.ordinal()];
                    if (i12 == 1) {
                        hVar = h.AVAILABLE;
                    } else if (i12 == 2) {
                        hVar = h.NOT_AVAILABLE;
                    } else {
                        if (i12 != 3) {
                            throw new o();
                        }
                        hVar = h.ERROR;
                    }
                    this.f80180d = 1;
                } else {
                    h hVar2 = h.NOT_AVAILABLE;
                    this.f80180d = 2;
                }
            } else {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.appupdate.service.OzonUpdateService$startInAppUpdate$1", f = "OzonUpdateService.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<u<? super g>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f80183d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ r f80184e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f80185f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r rVar, i iVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f80184e = rVar;
            this.f80185f = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f80184e, this.f80185f, dVar);
            cVar.f80183d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super g> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            u uVar = (u) this.f80183d;
            r activity = this.f80184e;
            if (activity != null) {
                this.f80185f.f80176b.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                int i11 = a.f80179b[C7901a.EnumC1227a.UPDATE_ERROR.ordinal()];
                if (i11 == 1) {
                    gVar = g.OZON_UPDATE_SDK;
                } else {
                    if (i11 != 2) {
                        throw new o();
                    }
                    gVar = g.UPDATE_ERROR;
                }
                uVar.b(gVar);
            } else {
                uVar.b(g.UPDATE_ERROR);
            }
            uVar.l(null);
            return Unit.f71690a;
        }
    }

    public i(@NotNull Q90.c featureToggles, @NotNull C7901a ozonInAppUpdateInteractor) {
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(ozonInAppUpdateInteractor, "ozonInAppUpdateInteractor");
        this.f80175a = featureToggles;
        this.f80176b = ozonInAppUpdateInteractor;
        this.f80177c = EnumC8852a.OZON_SDK;
    }

    @Override // p40.n
    @NotNull
    public final InterfaceC2395h<h> a(boolean z11) {
        return C2399j.A(new b(null));
    }

    @Override // p40.n
    @NotNull
    public final EnumC8852a b() {
        return this.f80177c;
    }

    @Override // p40.n
    @NotNull
    public final InterfaceC2395h<g> c(r rVar, boolean z11) {
        return C2399j.f(new c(rVar, this, null));
    }
}
