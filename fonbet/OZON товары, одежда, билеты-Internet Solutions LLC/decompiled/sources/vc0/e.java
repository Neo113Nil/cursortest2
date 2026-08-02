package vc0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.r;
import Sc.s;
import W2.f;
import W2.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.core.FeatureFlagConf;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC3917k<W2.f>> f102832a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f102833b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f102834c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f102835d;

    static final class a extends AbstractC7737t implements Function0<JsonAdapter<FeatureFlagConf>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4008j<Moshi> f102836b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC4008j<Moshi> interfaceC4008j) {
            super(0);
            this.f102836b = interfaceC4008j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final JsonAdapter<FeatureFlagConf> invoke() {
            return this.f102836b.getValue().c(FeatureFlagConf.class);
        }
    }

    static final class b extends AbstractC7737t implements Function0<f.a<String>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f102837b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final f.a<String> invoke() {
            return i.c("OZON_ID_ENTRY_PAGE_FEATURE_FLAGS");
        }
    }

    static final class c extends AbstractC7737t implements Function0<M> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f102838b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final M invoke() {
            return td0.f.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull InterfaceC4008j<? extends InterfaceC3917k<W2.f>> dataStore, @NotNull InterfaceC4008j<Moshi> moshi) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f102832a = dataStore;
        this.f102833b = k.b(c.f102838b);
        this.f102834c = k.b(new a(moshi));
        this.f102835d = k.b(b.f102837b);
    }

    public static final JsonAdapter a(e eVar) {
        return (JsonAdapter) eVar.f102834c.getValue();
    }

    public static final f.a c(e eVar) {
        return (f.a) eVar.f102835d.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29)(1:30))|12|(1:14)(1:23)|15|16|(1:21)(2:18|19)))|33|6|7|(0)(0)|12|(0)(0)|15|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        r0 = Sc.r.INSTANCE;
        r6 = Sc.s.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0051, B:14:0x0063, B:15:0x0073, B:27:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i11;
        Object a11;
        e eVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.f102842g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f102842g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f102840e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar.f102842g;
                if (i11 != 0) {
                    s.b(obj);
                    r.Companion companion = r.INSTANCE;
                    InterfaceC2395h<W2.f> data = this.f102832a.getValue().getData();
                    fVar.f102839d = this;
                    fVar.f102842g = 1;
                    obj = C2399j.u(data, fVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    eVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = fVar.f102839d;
                    s.b(obj);
                }
                String str = (String) ((W2.f) obj).c((f.a) eVar.f102835d.getValue());
                a11 = str == null ? (FeatureFlagConf) ((JsonAdapter) eVar.f102834c.getValue()).fromJson(str) : null;
                r.Companion companion2 = r.INSTANCE;
                if (a11 instanceof r.b) {
                    return a11;
                }
                return null;
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f102840e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f102842g;
        if (i11 != 0) {
        }
        String str2 = (String) ((W2.f) obj2).c((f.a) eVar.f102835d.getValue());
        if (str2 == null) {
        }
        r.Companion companion22 = r.INSTANCE;
        if (a11 instanceof r.b) {
        }
    }

    @NotNull
    public final void e(@NotNull FeatureFlagConf flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        M m11 = (M) this.f102833b.getValue();
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(m11, He.b.f10879b, null, new g(this, flags, null), 2);
    }
}
