package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4452n4;
import com.ironsource.InterfaceC4322g;
import com.ironsource.InterfaceC4340h;
import com.ironsource.Rc;
import com.ironsource.Sc;
import com.ironsource.X3;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import xsna.epx;
import xsna.zcl;
import xsna.zr;

/* loaded from: classes13.dex */
public interface p {

    public interface b {

        public static final class a implements b {
            private final Sc a;
            private final InterfaceC4322g b;

            public a(Sc sc, InterfaceC4322g interfaceC4322g) {
                this.a = sc;
                this.b = interfaceC4322g;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc rc) {
                if (TextUtils.isEmpty(rc.d())) {
                    return new c.a("url is empty");
                }
                Intent a = this.b.a();
                a.setData(Uri.parse(rc.d()));
                String c = rc.c();
                if (c != null && c.length() != 0) {
                    a = a.setPackage(rc.c());
                }
                if (!(context instanceof Activity)) {
                    a = a.addFlags(this.a.c());
                }
                context.startActivity(a);
                return c.b.a;
            }
        }

        /* renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C0233b implements b {
            private final String a;

            public C0233b(String str) {
                this.a = str;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc rc) {
                return new c.a(zr.a("method ", this.a, " is unsupported"));
            }
        }

        public static final class c implements b {
            private final Sc a;
            private final InterfaceC4340h b;

            public c(Sc sc, InterfaceC4340h interfaceC4340h) {
                this.a = sc;
                this.b = interfaceC4340h;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc rc) {
                context.startActivity(new OpenUrlActivity.e(this.b).a(this.a.c()).a(rc.d()).b(true).c(true).a(context));
                return c.b.a;
            }
        }

        public static final class d implements b {
            private final Sc a;
            private final InterfaceC4340h b;

            public d(Sc sc, InterfaceC4340h interfaceC4340h) {
                this.a = sc;
                this.b = interfaceC4340h;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc rc) {
                context.startActivity(new OpenUrlActivity.e(this.b).a(this.a.c()).a(rc.d()).a(this.a.d()).b(true).a(context));
                return c.b.a;
            }
        }

        c a(Context context, Rc rc);
    }

    public static abstract class c {

        public static final class a extends c {
            private final String a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.a;
            }

            public final String b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return zr.a("Error(errorMessage=", this.a, ")");
            }

            public a(String str) {
                super(null);
                this.a = str;
            }

            public final a a(String str) {
                return new a(str);
            }

            public /* synthetic */ a(String str, int i, zcl zclVar) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.a;
                }
                return aVar.a(str);
            }
        }

        public static final class b extends c {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(zcl zclVar) {
            this();
        }

        private c() {
        }
    }

    c a(Context context, Rc rc);

    public static final class a implements p {
        private b a;

        public a(String str, Sc sc, InterfaceC4340h interfaceC4340h, InterfaceC4322g interfaceC4322g) {
            b aVar;
            int hashCode = str.hashCode();
            if (hashCode == -1455867212) {
                if (str.equals(X3.i.J)) {
                    aVar = new b.a(sc, interfaceC4322g);
                }
                aVar = new b.C0233b(str);
            } else if (hashCode != 109770977) {
                if (hashCode == 1224424441 && str.equals(X3.i.K)) {
                    aVar = new b.d(sc, interfaceC4340h);
                }
                aVar = new b.C0233b(str);
            } else {
                if (str.equals(X3.i.U)) {
                    aVar = new b.c(sc, interfaceC4340h);
                }
                aVar = new b.C0233b(str);
            }
            this.a = aVar;
        }

        @Override // com.ironsource.sdk.controller.p
        public c a(Context context, Rc rc) {
            try {
                return this.a.a(context, rc);
            } catch (Exception e) {
                C4452n4.d().a(e);
                String message = e.getMessage();
                return new c.a((message == null || message.length() == 0) ? "" : e.getMessage());
            }
        }

        public a(String str, Sc sc) {
            this(str, sc, new k.c(), new k.a());
        }
    }
}
