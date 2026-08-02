package dZ;

import Sc.InterfaceC4008j;
import Sc.o;
import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import cZ.EnumC5791a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import hZ.C6894a;
import iZ.f;
import jZ.C7320a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import mZ.C8117b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.cdn.chooser.internal.data.dto.PerfMetricsDto;
import ru.ozon.cdn.chooser.internal.data.popreachability.PoPReachabilityApi;
import ve.EnumC10311b;

/* renamed from: dZ.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6132a implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f61432a;

    /* renamed from: dZ.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0955a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61433a;

        static {
            int[] iArr = new int[EnumC5791a.values().length];
            try {
                iArr[EnumC5791a.DNS_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5791a.TCP_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5791a.TLS_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5791a.TIME_TO_FIRST_BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5791a.TIME_TO_LAST_BYTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f61433a = iArr;
        }
    }

    @e(c = "ru.ozon.cdn.chooser.internal.data.popreachability.PoPReachabilityRepositoryImpl$sendMetrics$2", f = "PoPReachabilityRepositoryImpl.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: dZ.a$b */
    static final class b extends j implements Function1<d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f61434d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PerfMetricsDto f61436f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PerfMetricsDto perfMetricsDto, d<? super b> dVar) {
            super(1, dVar);
            this.f61436f = perfMetricsDto;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(d<?> dVar) {
            return C6132a.this.new b(this.f61436f, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f61434d;
            if (i11 == 0) {
                s.b(obj);
                PoPReachabilityApi c11 = C6132a.c(C6132a.this);
                this.f61434d = 1;
                if (c11.sendPopStats(this.f61436f, this) == aVar) {
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

    public C6132a(@NotNull InterfaceC4008j<PoPReachabilityApi> apiLazy, @NotNull Ae0.c currentTimestampProvider) {
        Intrinsics.checkNotNullParameter(apiLazy, "apiLazy");
        Intrinsics.checkNotNullParameter(currentTimestampProvider, "currentTimestampProvider");
        this.f61432a = apiLazy;
    }

    public static final PoPReachabilityApi c(C6132a c6132a) {
        return (PoPReachabilityApi) c6132a.f61432a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // iZ.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull C6894a.c.b.C1061a c1061a, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        dZ.b bVar;
        int i11;
        Object a11;
        if (cVar instanceof dZ.b) {
            bVar = (dZ.b) cVar;
            int i12 = bVar.f61439f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f61439f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f61437d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f61439f;
                if (i11 != 0) {
                    s.b(obj);
                    c cVar2 = new c(this, c1061a, str, null);
                    bVar.f61439f = 1;
                    a11 = mZ.e.a(cVar2, bVar);
                    if (a11 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    a11 = ((r) obj).getF26106a();
                }
                r.Companion companion = r.INSTANCE;
                if (a11 instanceof r.b) {
                    return a11;
                }
                return null;
            }
        }
        bVar = new dZ.b(this, cVar);
        Object obj2 = bVar.f61437d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f61439f;
        if (i11 != 0) {
        }
        r.Companion companion2 = r.INSTANCE;
        if (a11 instanceof r.b) {
        }
    }

    @Override // iZ.f
    public final Object b(@NotNull C7320a c7320a, @NotNull d<? super Unit> dVar) {
        long a11;
        if (((ArrayList) c7320a.a()).isEmpty()) {
            return Unit.f71690a;
        }
        List<C7320a.C1133a> a12 = c7320a.a();
        ArrayList arrayList = new ArrayList(C7714v.z(a12, 10));
        for (C7320a.C1133a c1133a : a12) {
            String c11 = c1133a.c();
            String b11 = c1133a.b();
            C7320a.b d11 = c1133a.d();
            Xc.a<EnumC5791a> a13 = EnumC5791a.a();
            int h11 = U.h(C7714v.z(a13, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
            for (EnumC5791a enumC5791a : a13) {
                String b12 = enumC5791a.b();
                int i11 = C0955a.f61433a[enumC5791a.ordinal()];
                if (i11 == 1) {
                    a11 = d11.a();
                } else if (i11 == 2) {
                    a11 = d11.b();
                } else if (i11 == 3) {
                    a11 = d11.c();
                } else if (i11 == 4) {
                    a11 = d11.d();
                } else {
                    if (i11 != 5) {
                        throw new o();
                    }
                    a11 = d11.e();
                }
                b.Companion companion = kotlin.time.b.INSTANCE;
                linkedHashMap.put(b12, Double.valueOf(kotlin.time.b.m(kotlin.time.c.h(a11, EnumC10311b.NANOSECONDS), EnumC10311b.MILLISECONDS)));
            }
            arrayList.add(new PerfMetricsDto.EventDto(c11, b11, linkedHashMap, c1133a.a()));
        }
        Object b13 = C8117b.b(3, 1000L, 2.0d, new b(new PerfMetricsDto(arrayList), null), (kotlin.coroutines.jvm.internal.c) dVar);
        return b13 == Wc.a.COROUTINE_SUSPENDED ? b13 : Unit.f71690a;
    }
}
