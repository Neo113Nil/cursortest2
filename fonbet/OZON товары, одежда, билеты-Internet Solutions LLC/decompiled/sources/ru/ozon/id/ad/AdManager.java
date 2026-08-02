package ru.ozon.id.ad;

import Hb0.f;
import Kb0.K;
import Sc.InterfaceC4008j;
import Sc.s;
import Vb0.b;
import We.A;
import We.G;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6171q;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td0.C9862b;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eJF\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/id/ad/AdManager;", "", "", "s1", "s2", "s3", "s4", "s5", "s6", "", "getValue1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B", "getValue2", "()Ljava/lang/String;", "b", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdManager {

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f97136d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<vc0.c> f97138a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f97139b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final b f97135c = new b();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final CountDownLatch f97137e = new CountDownLatch(1);

    @e(c = "ru.ozon.id.ad.AdManager$Companion$1", f = "AdManager.kt", l = {43}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97140d;

        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97140d;
            if (i11 == 0) {
                s.b(obj);
                b bVar = AdManager.f97135c;
                this.f97140d = 1;
                if (b.a(bVar, this) == aVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        /* JADX WARN: Can't wrap try/catch for region: R(5:(2:3|(6:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(2:26|(1:28))(2:29|30))|11|(3:13|14|15)(4:17|18|19|20)))|7|(0)(0)|11|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
        
            r4 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            Vb0.b.a.c(Vb0.b.f28514a, r4);
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: UnsatisfiedLinkError -> 0x006c, Exception -> 0x0074, all -> 0x0085, TRY_LEAVE, TryCatch #3 {Exception -> 0x0074, UnsatisfiedLinkError -> 0x006c, blocks: (B:10:0x0026, B:11:0x0052, B:13:0x005a, B:17:0x0064, B:24:0x0035, B:26:0x003b, B:29:0x0076, B:30:0x007b), top: B:7:0x0022, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[Catch: UnsatisfiedLinkError -> 0x006c, Exception -> 0x0074, all -> 0x0085, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0074, UnsatisfiedLinkError -> 0x006c, blocks: (B:10:0x0026, B:11:0x0052, B:13:0x005a, B:17:0x0064, B:24:0x0035, B:26:0x003b, B:29:0x0076, B:30:0x007b), top: B:7:0x0022, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object a(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
            ru.ozon.id.ad.a aVar;
            Object obj;
            int i11;
            bVar.getClass();
            try {
                if (cVar instanceof ru.ozon.id.ad.a) {
                    aVar = (ru.ozon.id.ad.a) cVar;
                    int i12 = aVar.f97146g;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        aVar.f97146g = i12 - LinearLayoutManager.INVALID_OFFSET;
                        obj = aVar.f97144e;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = aVar.f97146g;
                        if (i11 != 0) {
                            s.b(obj);
                            K k11 = Tb0.a.f26975d;
                            if (k11 == null) {
                                throw new Lb0.a();
                            }
                            Hb0.c value = k11.z().getValue();
                            f.a aVar3 = f.a.f10795a;
                            aVar.f97143d = bVar;
                            aVar.f97146g = 1;
                            obj = value.a(aVar3, aVar);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                        }
                        if (((Boolean) obj).booleanValue()) {
                            return Unit.f71690a;
                        }
                        System.loadLibrary("ozon-id-sdk");
                        AdManager.f97136d = true;
                        return Unit.f71690a;
                    }
                }
                if (i11 != 0) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } finally {
                AdManager.f97137e.countDown();
            }
            aVar = new ru.ozon.id.ad.a(bVar, cVar);
            obj = aVar.f97144e;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = aVar.f97146g;
        }
    }

    @e(c = "ru.ozon.id.ad.AdManager$addHeader$applicationId$1", f = "AdManager.kt", l = {72}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, d<? super String>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97141d;

        c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return AdManager.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super String> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97141d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            vc0.c cVar = (vc0.c) AdManager.this.f97138a.getValue();
            this.f97141d = 1;
            Object b11 = cVar.b(this);
            return b11 == aVar ? aVar : b11;
        }
    }

    static {
        C10727i.c(td0.f.a(), null, null, new a(2, null), 3);
    }

    public AdManager(@NotNull InterfaceC4008j<vc0.c> appInfoRepository) {
        Intrinsics.checkNotNullParameter(appInfoRepository, "appInfoRepository");
        this.f97138a = appInfoRepository;
    }

    private final native byte[] getValue1(String s12, String s22, String s32, String s42, String s52, String s62);

    private final native String getValue2();

    @NotNull
    public final G e(@NotNull G request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            f97137e.await();
        } catch (Exception e11) {
            e = e11;
        }
        if (!f97136d) {
            return request;
        }
        String d11 = request.d("Cookie");
        ArrayList B11 = d11 != null ? C6171q.B(d11) : null;
        String str = (String) C10727i.d(g.f71771a, new c(null));
        String h11 = request.h();
        String f7 = B11 != null ? C6171q.f("x-o3-app-name", B11) : null;
        String f11 = B11 != null ? C6171q.f("x-o3-app-version", B11) : null;
        String d12 = request.d("x-o3-fp");
        A j11 = request.j();
        if (j11.g() != null) {
            A.a j12 = j11.j();
            j12.h();
            j11 = j12.e();
        }
        try {
            String a11 = C9862b.a(1, getValue1(h11, f7, f11, d12, j11.toString(), str));
            if (this.f97139b == null) {
                this.f97139b = getValue2();
            }
            G.a aVar = new G.a(request);
            String str2 = this.f97139b;
            Intrinsics.f(str2);
            aVar.a(str2, a11);
            return aVar.b();
        } catch (Exception e12) {
            e = e12;
            b.a.c(Vb0.b.f28514a, e);
            return request;
        }
    }
}
