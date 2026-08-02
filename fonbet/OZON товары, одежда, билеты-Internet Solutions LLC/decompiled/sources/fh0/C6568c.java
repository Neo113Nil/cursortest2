package fh0;

import android.content.Intent;
import androidx.core.app.l;
import fh0.AbstractC6567b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import qh0.C9059c;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.push.sdk.external.service.RemoteMessage;

/* renamed from: fh0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6568c {

    /* renamed from: a, reason: collision with root package name */
    private final int f63441a;

    /* renamed from: b, reason: collision with root package name */
    private final String f63442b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final RemoteMessage f63443c;

    /* renamed from: d, reason: collision with root package name */
    private final long f63444d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f63445e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f63446f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f63447g;

    /* renamed from: h, reason: collision with root package name */
    private final String f63448h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f63449i;

    /* renamed from: j, reason: collision with root package name */
    private final String f63450j;

    /* renamed from: k, reason: collision with root package name */
    private final String f63451k;

    /* renamed from: l, reason: collision with root package name */
    private final int f63452l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f63453m;

    /* renamed from: n, reason: collision with root package name */
    private final String f63454n;

    /* renamed from: o, reason: collision with root package name */
    private final Intent f63455o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC6567b f63456p;

    /* renamed from: q, reason: collision with root package name */
    private final b f63457q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final String f63458r;

    /* renamed from: s, reason: collision with root package name */
    private final int f63459s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final ArrayList f63460t;

    /* renamed from: u, reason: collision with root package name */
    private final AbstractC6566a f63461u;

    /* renamed from: v, reason: collision with root package name */
    private final C9059c f63462v;

    /* renamed from: fh0.c$b */
    public interface b {

        /* renamed from: fh0.c$b$a */
        public static final class a implements b {
        }

        /* renamed from: fh0.c$b$b, reason: collision with other inner class name */
        public static final class C1025b implements b {
        }

        /* renamed from: fh0.c$b$c, reason: collision with other inner class name */
        public static final class C1026c implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f63486a;

            public C1026c(@NotNull String source) {
                Intrinsics.checkNotNullParameter(source, "source");
                this.f63486a = source;
            }

            @NotNull
            public final String a() {
                return this.f63486a;
            }
        }
    }

    private C6568c() {
        throw null;
    }

    public C6568c(int i11, String str, RemoteMessage remoteMessage, long j11, boolean z11, String str2, String str3, String str4, Integer num, String str5, String str6, int i12, Map map, String str7, Intent intent, AbstractC6567b abstractC6567b, b bVar, String str8, int i13, ArrayList arrayList, AbstractC6566a abstractC6566a, C9059c c9059c) {
        this.f63441a = i11;
        this.f63442b = str;
        this.f63443c = remoteMessage;
        this.f63444d = j11;
        this.f63445e = z11;
        this.f63446f = str2;
        this.f63447g = str3;
        this.f63448h = str4;
        this.f63449i = num;
        this.f63450j = str5;
        this.f63451k = str6;
        this.f63452l = i12;
        this.f63453m = map;
        this.f63454n = str7;
        this.f63455o = intent;
        this.f63456p = abstractC6567b;
        this.f63457q = bVar;
        this.f63458r = str8;
        this.f63459s = i13;
        this.f63460t = arrayList;
        this.f63461u = abstractC6566a;
        this.f63462v = c9059c;
    }

    @NotNull
    public final void b(@NotNull l.d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Iterator it = this.f63460t.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(builder);
        }
    }

    public final int c() {
        return this.f63452l;
    }

    @NotNull
    public final String d() {
        return this.f63458r;
    }

    public final AbstractC6567b e() {
        return this.f63456p;
    }

    @NotNull
    public final Map<String, String> f() {
        return this.f63453m;
    }

    public final AbstractC6566a g() {
        return this.f63461u;
    }

    public final C9059c h() {
        return this.f63462v;
    }

    public final Integer i() {
        return this.f63449i;
    }

    public final String j() {
        return this.f63448h;
    }

    public final b k() {
        return this.f63457q;
    }

    @NotNull
    public final String l() {
        return this.f63447g;
    }

    public final String m() {
        return this.f63442b;
    }

    public final int n() {
        return this.f63441a;
    }

    public final Intent o() {
        return this.f63455o;
    }

    @NotNull
    public final RemoteMessage p() {
        return this.f63443c;
    }

    public final String q() {
        return this.f63454n;
    }

    public final boolean r() {
        return this.f63445e;
    }

    public final String s() {
        return this.f63451k;
    }

    public final long t() {
        return this.f63444d;
    }

    @NotNull
    public final String u() {
        return this.f63446f;
    }

    public final String v() {
        return this.f63450j;
    }

    public final int w() {
        return this.f63459s;
    }

    /* renamed from: fh0.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private LinkedHashMap f63463a;

        /* renamed from: b, reason: collision with root package name */
        private int f63464b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private RemoteMessage f63465c;

        /* renamed from: d, reason: collision with root package name */
        private long f63466d;

        /* renamed from: e, reason: collision with root package name */
        private String f63467e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f63468f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private String f63469g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private String f63470h;

        /* renamed from: i, reason: collision with root package name */
        private String f63471i;

        /* renamed from: j, reason: collision with root package name */
        private Integer f63472j;

        /* renamed from: k, reason: collision with root package name */
        private String f63473k;

        /* renamed from: l, reason: collision with root package name */
        private String f63474l;

        /* renamed from: m, reason: collision with root package name */
        private int f63475m;

        /* renamed from: n, reason: collision with root package name */
        private String f63476n;

        /* renamed from: o, reason: collision with root package name */
        private Intent f63477o;

        /* renamed from: p, reason: collision with root package name */
        private AbstractC6567b f63478p;

        /* renamed from: q, reason: collision with root package name */
        private b f63479q;

        /* renamed from: r, reason: collision with root package name */
        @NotNull
        private String f63480r;

        /* renamed from: s, reason: collision with root package name */
        private AbstractC6566a f63481s;

        /* renamed from: t, reason: collision with root package name */
        private C9059c f63482t;

        /* renamed from: u, reason: collision with root package name */
        private int f63483u;

        /* renamed from: v, reason: collision with root package name */
        @NotNull
        private ArrayList f63484v;

        /* renamed from: fh0.c$a$a, reason: collision with other inner class name */
        static final class C1024a extends AbstractC7737t implements Function1<l.d, l.d> {

            /* renamed from: b, reason: collision with root package name */
            public static final C1024a f63485b = new C1024a(1);

            @Override // kotlin.jvm.functions.Function1
            public final l.d invoke(l.d dVar) {
                l.d mutableListOf = dVar;
                Intrinsics.checkNotNullParameter(mutableListOf, "$this$mutableListOf");
                return mutableListOf;
            }
        }

        public a(int i11, @NotNull RemoteMessage originalMessage) {
            Integer w02;
            int i12 = 0;
            Intrinsics.checkNotNullParameter(originalMessage, "originalMessage");
            this.f63463a = new LinkedHashMap();
            this.f63469g = "";
            this.f63470h = "";
            this.f63480r = null;
            this.f63484v = C7714v.m0(C1024a.f63485b);
            this.f63464b = i11;
            this.f63465c = originalMessage;
            LinkedHashMap u11 = U.u(originalMessage.b());
            this.f63463a = u11;
            this.f63466d = System.currentTimeMillis();
            this.f63467e = originalMessage.getF97687a();
            this.f63468f = Intrinsics.d(u11.get("silent"), "true");
            String str = (String) u11.get(CommentV3DTO.HEADER_FIELD_NAME);
            this.f63469g = str == null ? "" : str;
            String str2 = (String) u11.get(SelectionItemFormDTO.TITLE_FIELD_NAME);
            this.f63470h = str2 != null ? str2 : "";
            this.f63471i = (String) u11.get("b");
            this.f63473k = (String) u11.get("l");
            String str3 = (String) u11.get("badge");
            this.f63475m = (str3 == null || (w02 = h.w0(str3)) == null) ? 0 : w02.intValue();
            this.f63474l = (String) u11.get("thread-id");
            this.f63476n = (String) u11.get("service");
            this.f63480r = (String) u11.get("android_category");
            String str4 = (String) u11.get("visibility");
            if (str4 != null) {
                String lowerCase = str4.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                int hashCode = lowerCase.hashCode();
                if (hashCode != -977423767) {
                    if (hashCode != -906277200) {
                        if (hashCode == -314497661) {
                            lowerCase.equals("private");
                        }
                    } else if (lowerCase.equals("secret")) {
                        i12 = -1;
                    }
                } else if (lowerCase.equals("public")) {
                    i12 = 1;
                }
            }
            this.f63483u = i12;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        
            if (r4 != null) goto L12;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C6568c a() {
            AbstractC6566a abstractC6566a;
            String str = this.f63469g;
            String str2 = this.f63470h;
            String str3 = this.f63471i;
            Integer num = this.f63472j;
            Map t2 = U.t(this.f63463a);
            ArrayList arrayList = this.f63484v;
            b bVar = this.f63479q;
            AbstractC6567b abstractC6567b = this.f63478p;
            C9059c c9059c = this.f63482t;
            if (c9059c != null) {
                if (!c9059c.c()) {
                    c9059c = null;
                }
                if (c9059c != null) {
                    abstractC6566a = c9059c.a();
                }
            }
            abstractC6566a = this.f63481s;
            return new C6568c(this.f63464b, this.f63467e, this.f63465c, this.f63466d, this.f63468f, str, str2, str3, num, this.f63473k, this.f63474l, this.f63475m, t2, this.f63476n, this.f63477o, abstractC6567b, bVar, this.f63480r, this.f63483u, arrayList, abstractC6566a, this.f63482t);
        }

        @NotNull
        public final void b(@NotNull AbstractC6567b.C1023b contentIntent) {
            Intrinsics.checkNotNullParameter(contentIntent, "contentIntent");
            this.f63478p = contentIntent;
        }

        @NotNull
        public final void c(@NotNull AbstractC6566a deliveryStatus) {
            Intrinsics.checkNotNullParameter(deliveryStatus, "deliveryStatus");
            this.f63481s = deliveryStatus;
        }

        @NotNull
        public final void d(C9059c c9059c) {
            this.f63482t = c9059c;
        }

        @NotNull
        public final void e(@NotNull Function1 builderTransformation) {
            Intrinsics.checkNotNullParameter(builderTransformation, "builderTransformation");
            this.f63484v.add(builderTransformation);
        }

        @NotNull
        public final void f(int i11) {
            this.f63472j = Integer.valueOf(i11);
        }

        @NotNull
        public final void g() {
            Intrinsics.checkNotNullParameter("", "imageUrl");
            this.f63471i = "";
        }

        @NotNull
        public final void h(@NotNull b.C1026c largeIcon) {
            Intrinsics.checkNotNullParameter(largeIcon, "largeIcon");
            this.f63479q = largeIcon;
        }

        @NotNull
        public final void i(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f63470h = message;
        }

        @NotNull
        public final void j(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f63469g = title;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C6568c pushModel) {
            this(pushModel.n(), pushModel.p());
            Intrinsics.checkNotNullParameter(pushModel, "pushModel");
            this.f63467e = pushModel.m();
            this.f63468f = pushModel.r();
            this.f63469g = pushModel.u();
            this.f63470h = pushModel.l();
            this.f63471i = pushModel.j();
            this.f63472j = pushModel.i();
            this.f63473k = pushModel.v();
            this.f63474l = pushModel.s();
            this.f63475m = pushModel.c();
            this.f63463a = U.u(pushModel.f());
            this.f63476n = pushModel.q();
            this.f63477o = pushModel.o();
            this.f63478p = pushModel.e();
            this.f63479q = pushModel.k();
            this.f63480r = pushModel.d();
            this.f63484v = C7714v.W0(pushModel.f63460t);
            this.f63481s = pushModel.g();
            this.f63482t = pushModel.h();
        }
    }
}
