package pf0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: pf0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC8919b {

    /* renamed from: pf0.b$a */
    public static final class a extends AbstractC8919b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f80501a = new a(null);
    }

    /* renamed from: pf0.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC1361b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f80502a;

        /* renamed from: pf0.b$b$a */
        public static final class a extends AbstractC1361b {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            public static final a f80503b = new a("abtool_android");
        }

        /* renamed from: pf0.b$b$b, reason: collision with other inner class name */
        public static final class C1362b extends AbstractC1361b {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C1362b f80504b = new C1362b("cdnchooser_android");
        }

        /* renamed from: pf0.b$b$c */
        public static final class c extends AbstractC1361b {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            public static final c f80505b = new c("in_app_push_android");
        }

        /* renamed from: pf0.b$b$d */
        /* loaded from: classes3.dex */
        public static final class d extends AbstractC1361b {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            public static final d f80506b = new d("inapppupdate_android");
        }

        /* renamed from: pf0.b$b$e */
        /* loaded from: classes3.dex */
        public static final class e extends AbstractC1361b {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            public static final e f80507b = new e("ozonid_android");
        }

        /* renamed from: pf0.b$b$f */
        public static final class f extends AbstractC1361b {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            public static final f f80508b = new f("ozontracker_android");
        }

        /* renamed from: pf0.b$b$g */
        public static final class g extends AbstractC1361b {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            public static final g f80509b = new g("pikazon_android");
        }

        /* renamed from: pf0.b$b$h */
        public static final class h extends AbstractC1361b {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            public static final h f80510b = new h("push_sdk_android");
        }

        protected AbstractC1361b(@NotNull String libName) {
            Intrinsics.checkNotNullParameter(libName, "libName");
            this.f80502a = libName;
        }

        @NotNull
        public final String a() {
            return this.f80502a;
        }
    }

    /* renamed from: pf0.b$c */
    public static abstract class c extends AbstractC8919b {
        public c() {
            super(null);
        }

        @NotNull
        public abstract AbstractC1361b getName();

        @NotNull
        public abstract String getVersion();
    }

    public /* synthetic */ AbstractC8919b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC8919b() {
    }
}
