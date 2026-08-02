package te0;

import B0.C0;
import Sc.o;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;
import ue0.C10047d;
import ue0.C10048e;
import ue0.C10052i;
import ue0.C10053j;
import ue0.InterfaceC10046c;

/* renamed from: te0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9867b implements InterfaceC10046c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C9867b f99466a = new C9867b();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static InterfaceC10046c f99467b = new C10047d();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static InterfaceC10046c.b f99468c = InterfaceC10046c.b.LOGCAT;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static InterfaceC10046c.a f99469d = InterfaceC10046c.a.DEBUG;

    /* renamed from: te0.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99470a;

        static {
            int[] iArr = new int[InterfaceC10046c.b.values().length];
            try {
                iArr[InterfaceC10046c.b.FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC10046c.b.LOGCAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC10046c.b.FILE_AND_LOGCAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f99470a = iArr;
        }
    }

    /* renamed from: te0.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C2190b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f99471b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f99472c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2190b(String str, String str2) {
            super(0);
            this.f99471b = str;
            this.f99472c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C9867b c9867b = C9867b.f99466a;
            C9867b.e().b(this.f99471b, this.f99472c);
            return Unit.f71690a;
        }
    }

    /* renamed from: te0.b$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f99473b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f99474c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f99475d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, Throwable th2) {
            super(0);
            this.f99473b = str;
            this.f99474c = str2;
            this.f99475d = th2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C9867b c9867b = C9867b.f99466a;
            C9867b.e().a(this.f99473b, this.f99474c, this.f99475d);
            return Unit.f71690a;
        }
    }

    /* renamed from: te0.b$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f99476b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f99477c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2) {
            super(0);
            this.f99476b = str;
            this.f99477c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C9867b c9867b = C9867b.f99466a;
            C9867b.e().c(this.f99476b, this.f99477c);
            return Unit.f71690a;
        }
    }

    /* renamed from: te0.b$e */
    static final class e extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC10046c.a f99478b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f99479c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f99480d;

        /* renamed from: te0.b$e$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f99481a;

            static {
                int[] iArr = new int[InterfaceC10046c.a.values().length];
                try {
                    iArr[InterfaceC10046c.a.DEBUG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InterfaceC10046c.a.INFO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InterfaceC10046c.a.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f99481a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Throwable th2, InterfaceC10046c.a aVar) {
            super(0);
            this.f99478b = aVar;
            this.f99479c = str;
            this.f99480d = th2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String str;
            C9867b c9867b = C9867b.f99466a;
            try {
                str = Thread.currentThread().getStackTrace()[9].getClassName();
                Intrinsics.f(str);
                String str2 = (String) C7714v.Z(h.m(str, new String[]{"."}, 0, 6));
                if (str2 == null) {
                    str2 = null;
                } else if (h.t(str2, "$", false)) {
                    str2 = (String) C7714v.M(h.m(str2, new String[]{"$"}, 0, 6));
                }
                if (str2 != null) {
                    str = str2;
                }
            } catch (Exception unused) {
                str = FraudMonInfo.UNKNOWN;
            }
            int i11 = a.f99481a[this.f99478b.ordinal()];
            String str3 = this.f99479c;
            if (i11 == 1) {
                C9867b c9867b2 = C9867b.f99466a;
                C9867b.e().b(str, str3);
            } else if (i11 == 2) {
                C9867b c9867b3 = C9867b.f99466a;
                C9867b.e().c(str, str3);
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                C9867b c9867b4 = C9867b.f99466a;
                C9867b.e().a(str, str3, this.f99480d);
            }
            return Unit.f71690a;
        }
    }

    private static void d(InterfaceC10046c.a aVar, Function0 function0) {
        if (f99469d.ordinal() <= aVar.ordinal() && C0.c()) {
            function0.invoke();
        }
        if (aVar.ordinal() < InterfaceC10046c.a.ERROR.ordinal() || C0.c()) {
            return;
        }
        function0.invoke();
    }

    @NotNull
    public static InterfaceC10046c e() {
        return f99467b;
    }

    public static void f(@NotNull String message, Throwable th2, @NotNull InterfaceC10046c.a level) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(level, "level");
        d(level, new e(message, th2, level));
    }

    public static /* synthetic */ void g(String str, InterfaceC10046c.a aVar, int i11) {
        if ((i11 & 2) != 0) {
            aVar = InterfaceC10046c.a.DEBUG;
        }
        f(str, null, aVar);
    }

    public static void h() {
        InterfaceC10046c c10052i;
        int i11 = a.f99470a[f99468c.ordinal()];
        if (i11 == 1) {
            c10052i = new C10052i();
        } else if (i11 == 2) {
            c10052i = new C10047d();
        } else {
            if (i11 != 3) {
                throw new o();
            }
            c10052i = new C10048e(C7714v.b0(new C10047d(), new C10052i()));
        }
        f99467b = new C10048e(C7714v.b0(c10052i, new C10053j()));
    }

    @Override // ue0.InterfaceC10046c
    public final void a(@NotNull String tag, @NotNull String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        d(InterfaceC10046c.a.ERROR, new c(tag, message, th2));
    }

    @Override // ue0.InterfaceC10046c
    public final void b(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        d(InterfaceC10046c.a.DEBUG, new C2190b(tag, message));
    }

    @Override // ue0.InterfaceC10046c
    public final void c(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        d(InterfaceC10046c.a.INFO, new d(tag, message));
    }
}
