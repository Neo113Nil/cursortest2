package td;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Tc.d f99416a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f99417b = 0;

    /* loaded from: classes.dex */
    public static final class a extends s0 {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f99418c = new a("inherited", false);
    }

    /* loaded from: classes.dex */
    public static final class b extends s0 {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f99419c = new b("internal", false);
    }

    /* loaded from: classes.dex */
    public static final class c extends s0 {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final c f99420c = new c("invisible_fake", false);
    }

    /* loaded from: classes.dex */
    public static final class d extends s0 {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final d f99421c = new d(ImagesContract.LOCAL, false);
    }

    /* loaded from: classes.dex */
    public static final class e extends s0 {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final e f99422c = new e("private", false);
    }

    /* loaded from: classes.dex */
    public static final class f extends s0 {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final f f99423c = new f("private_to_this", false);

        @Override // td.s0
        @NotNull
        public final String b() {
            return "private/*private to this*/";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends s0 {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final g f99424c = new g("protected", true);
    }

    /* loaded from: classes.dex */
    public static final class h extends s0 {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final h f99425c = new h("public", true);
    }

    /* loaded from: classes.dex */
    public static final class i extends s0 {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final i f99426c = new i("unknown", false);
    }

    static {
        Tc.d builder = new Tc.d();
        builder.put(f.f99423c, 0);
        builder.put(e.f99422c, 0);
        builder.put(b.f99419c, 1);
        builder.put(g.f99424c, 1);
        builder.put(h.f99425c, 2);
        Intrinsics.checkNotNullParameter(builder, "builder");
        f99416a = builder.u();
    }

    public static Integer a(@NotNull s0 first, @NotNull s0 second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first == second) {
            return 0;
        }
        Tc.d dVar = f99416a;
        Integer num = (Integer) dVar.get(first);
        Integer num2 = (Integer) dVar.get(second);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }
}
