package D5;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class d extends D5.f {

    /* renamed from: f, reason: collision with root package name */
    public static final a f2553f = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f2554c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2555d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2556e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(fragment, "fragmentAttached", null, 4, null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }
    }

    public static final class c extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(fragment, "fragmentCreated", null, 4, null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }
    }

    /* renamed from: D5.d$d, reason: collision with other inner class name */
    public static final class C0052d extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0052d(Fragment fragment) {
            super(fragment, "fragmentDestroyed", null, 4, null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }
    }

    public static final class e extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(fragment, "fragmentDetached", null, 4, null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }
    }

    public static final class f extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(fragment, "fragmentPaused", null, 4, null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }
    }

    public static final class g extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(fragment, "fragmentResumed", null, 4, null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }
    }

    public static final class h extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(fragment, "fragmentSaveInstanceState", null, 4, null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }
    }

    public static final class i extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(fragment, "fragmentStarted", null, 4, null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }
    }

    public static final class j extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(fragment, "fragmentStopped", null, 4, null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }
    }

    public static final class k extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(fragment, "fragmentViewCreated", null, 4, null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }
    }

    public static final class l extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(fragment, "fragmentViewDestroyed", null, 4, null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }
    }

    public /* synthetic */ d(Fragment fragment, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, str, str2);
    }

    @Override // D5.f
    public String a() {
        return this.f2555d;
    }

    @Override // D5.f
    public String b() {
        return this.f2556e;
    }

    public final Fragment c() {
        return this.f2554c;
    }

    public /* synthetic */ d(Fragment fragment, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, str, (i10 & 4) != 0 ? fragment.getClass().getSimpleName() : str2, null);
    }

    public d(Fragment fragment, String str, String str2) {
        super(str, str2, null);
        this.f2554c = fragment;
        this.f2555d = str;
        this.f2556e = str2;
    }
}
