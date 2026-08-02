package zd0;

import Sc.InterfaceC3999a;
import We.B;
import We.InterfaceC4875q;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f108882a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4875q f108883b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<B> f108884c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<B> f108885d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a OZONRUCN_ME;
        public static final a OZONRU_CN;
        public static final a OZONRU_ME;
        public static final a OZON_RU;

        static {
            a aVar = new a("OZON_RU", 0);
            OZON_RU = aVar;
            a aVar2 = new a("OZONRU_CN", 1);
            OZONRU_CN = aVar2;
            a aVar3 = new a("OZONRU_ME", 2);
            OZONRU_ME = aVar3;
            a aVar4 = new a("OZONRUCN_ME", 3);
            OZONRUCN_ME = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f108886a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC4875q f108887b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f108888c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ArrayList f108889d;

        public b(@NotNull a appDomain, @NotNull InterfaceC4875q cookieJar) {
            Intrinsics.checkNotNullParameter(appDomain, "appDomain");
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            this.f108886a = appDomain;
            this.f108887b = cookieJar;
            this.f108888c = new ArrayList();
            this.f108889d = new ArrayList();
        }

        @NotNull
        public final void a(@NotNull List interceptors) {
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            this.f108888c.addAll(interceptors);
        }

        @NotNull
        public final f b() {
            return new f(this.f108886a, this.f108887b, C7714v.U0(this.f108888c), C7714v.U0(this.f108889d));
        }
    }

    public f(a aVar, InterfaceC4875q interfaceC4875q, List list, List list2) {
        this.f108882a = aVar;
        this.f108883b = interfaceC4875q;
        this.f108884c = list;
        this.f108885d = list2;
    }

    @NotNull
    public final a a() {
        return this.f108882a;
    }

    @NotNull
    public final InterfaceC4875q b() {
        return this.f108883b;
    }

    @NotNull
    public final List<B> c() {
        return this.f108884c;
    }

    @NotNull
    public final List<B> d() {
        return this.f108885d;
    }
}
