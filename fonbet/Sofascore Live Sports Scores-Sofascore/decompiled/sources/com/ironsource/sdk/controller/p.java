package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4157k4;
import com.ironsource.InterfaceC4081g;
import com.ironsource.InterfaceC4099h;
import com.ironsource.Qc;
import com.ironsource.Rc;
import com.ironsource.U3;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import defpackage.lnb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface p {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface b {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements b {

            @NotNull
            private final Rc a;

            @NotNull
            private final InterfaceC4081g b;

            public a(@NotNull Rc rc, @NotNull InterfaceC4081g interfaceC4081g) {
                rc.getClass();
                interfaceC4081g.getClass();
                this.a = rc;
                this.b = interfaceC4081g;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Qc qc) {
                context.getClass();
                qc.getClass();
                if (TextUtils.isEmpty(qc.d())) {
                    return new c.a("url is empty");
                }
                Intent a = this.b.a();
                a.setData(Uri.parse(qc.d()));
                String c = qc.c();
                if (c != null && c.length() != 0) {
                    a = a.setPackage(qc.c());
                    a.getClass();
                }
                if (!(context instanceof Activity)) {
                    a = a.addFlags(this.a.c());
                }
                a.getClass();
                context.startActivity(a);
                return c.b.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C1215b implements b {

            @NotNull
            private final String a;

            public C1215b(@NotNull String str) {
                str.getClass();
                this.a = str;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Qc qc) {
                context.getClass();
                qc.getClass();
                return new c.a(lnb.o("method ", this.a, " is unsupported"));
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class c implements b {

            @NotNull
            private final Rc a;

            @NotNull
            private final InterfaceC4099h b;

            public c(@NotNull Rc rc, @NotNull InterfaceC4099h interfaceC4099h) {
                rc.getClass();
                interfaceC4099h.getClass();
                this.a = rc;
                this.b = interfaceC4099h;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Qc qc) {
                context.getClass();
                qc.getClass();
                context.startActivity(new OpenUrlActivity.e(this.b).a(this.a.c()).a(qc.d()).b(true).c(true).a(context));
                return c.b.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class d implements b {

            @NotNull
            private final Rc a;

            @NotNull
            private final InterfaceC4099h b;

            public d(@NotNull Rc rc, @NotNull InterfaceC4099h interfaceC4099h) {
                rc.getClass();
                interfaceC4099h.getClass();
                this.a = rc;
                this.b = interfaceC4099h;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Qc qc) {
                context.getClass();
                qc.getClass();
                context.startActivity(new OpenUrlActivity.e(this.b).a(this.a.c()).a(qc.d()).a(this.a.d()).b(true).a(context));
                return c.b.a;
            }
        }

        @NotNull
        c a(@NotNull Context context, @NotNull Qc qc);
    }

    @NotNull
    c a(@NotNull Context context, @NotNull Qc qc);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class c {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class b extends c {

            @NotNull
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a extends c {

            @NotNull
            private final String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String str) {
                super(null);
                str.getClass();
                this.a = str;
            }

            public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.a;
                }
                return aVar.a(str);
            }

            @NotNull
            public final String b() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public String toString() {
                return lnb.o("Error(errorMessage=", this.a, ")");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            @NotNull
            public final a a(@NotNull String str) {
                str.getClass();
                return new a(str);
            }

            @NotNull
            public final String a() {
                return this.a;
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements p {

        @NotNull
        private b a;

        public a(@NotNull String str, @NotNull Rc rc, @NotNull InterfaceC4099h interfaceC4099h, @NotNull InterfaceC4081g interfaceC4081g) {
            b aVar;
            str.getClass();
            rc.getClass();
            interfaceC4099h.getClass();
            interfaceC4081g.getClass();
            int hashCode = str.hashCode();
            if (hashCode == -1455867212) {
                if (str.equals(U3.i.J)) {
                    aVar = new b.a(rc, interfaceC4081g);
                }
                aVar = new b.C1215b(str);
            } else if (hashCode != 109770977) {
                if (hashCode == 1224424441 && str.equals(U3.i.K)) {
                    aVar = new b.d(rc, interfaceC4099h);
                }
                aVar = new b.C1215b(str);
            } else {
                if (str.equals("store")) {
                    aVar = new b.c(rc, interfaceC4099h);
                }
                aVar = new b.C1215b(str);
            }
            this.a = aVar;
        }

        @Override // com.ironsource.sdk.controller.p
        @NotNull
        public c a(@NotNull Context context, @NotNull Qc qc) {
            context.getClass();
            qc.getClass();
            try {
                return this.a.a(context, qc);
            } catch (Exception e) {
                C4157k4.d().a(e);
                String message = e.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e.getMessage();
                message2.getClass();
                return new c.a(message2);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str, @NotNull Rc rc) {
            this(str, rc, new k.c(), new k.a());
            str.getClass();
            rc.getClass();
        }
    }
}
