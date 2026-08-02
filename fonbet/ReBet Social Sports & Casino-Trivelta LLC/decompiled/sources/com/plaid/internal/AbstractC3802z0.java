package com.plaid.internal;

import com.plaid.internal.N2;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3802z0 {

    /* renamed from: com.plaid.internal.z0$a */
    public static final class a extends AbstractC3802z0 {
    }

    /* renamed from: com.plaid.internal.z0$b */
    public static final class b extends AbstractC3802z0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f41218a;

        public b(boolean z10) {
            this.f41218a = z10;
        }

        public final boolean a() {
            return this.f41218a;
        }
    }

    /* renamed from: com.plaid.internal.z0$c */
    public static final class c extends AbstractC3802z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final N2.i f41219a;

        public c(@NotNull N2.i error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f41219a = error;
        }

        @NotNull
        public final N2.i a() {
            return this.f41219a;
        }
    }

    /* renamed from: com.plaid.internal.z0$d */
    public static final class d extends AbstractC3802z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final LinkExit f41220a;

        public d(@NotNull LinkExit exit) {
            Intrinsics.checkNotNullParameter(exit, "exit");
            this.f41220a = exit;
        }

        @NotNull
        public final LinkExit a() {
            return this.f41220a;
        }
    }

    /* renamed from: com.plaid.internal.z0$e */
    public static final class e extends AbstractC3802z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f41221a = new e();
    }

    /* renamed from: com.plaid.internal.z0$f */
    public static final class f extends AbstractC3802z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f41222a;

        public f(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f41222a = url;
        }

        @NotNull
        public final String a() {
            return this.f41222a;
        }
    }

    /* renamed from: com.plaid.internal.z0$g */
    public static final class g extends AbstractC3802z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final AbstractC3743s4 f41223a;

        public g(@NotNull AbstractC3743s4 openMethod) {
            Intrinsics.checkNotNullParameter(openMethod, "openMethod");
            this.f41223a = openMethod;
        }

        @NotNull
        public final AbstractC3743s4 a() {
            return this.f41223a;
        }
    }

    /* renamed from: com.plaid.internal.z0$h */
    public static final class h extends AbstractC3802z0 {
        public h(@NotNull String url, @NotNull String webviewFallbackId, @NotNull A channelInfo) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
            Intrinsics.checkNotNullParameter(channelInfo, "channelInfo");
        }
    }

    /* renamed from: com.plaid.internal.z0$i */
    public static abstract class i<F extends p8<?>> extends AbstractC3802z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final a.C0589a f41224a;

        /* renamed from: com.plaid.internal.z0$i$a */
        public static final class a extends i<C3669k1> {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            public final r8 f41225b;

            @SourceDebugExtension({"SMAP\nDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Destination.kt\ncom/plaid/internal/workflow/model/Destination$Pane$HeadlessOAuth$1\n+ 2 WorkflowPaneFragmentFactory.kt\ncom/plaid/internal/workflow/panes/WorkflowPaneFragmentFactory\n+ 3 WorkflowPaneFragment.kt\ncom/plaid/internal/workflow/panes/WorkflowPaneFragment$Companion\n*L\n1#1,55:1\n10#2:56\n25#3:57\n*S KotlinDebug\n*F\n+ 1 Destination.kt\ncom/plaid/internal/workflow/model/Destination$Pane$HeadlessOAuth$1\n*L\n28#1:56\n28#1:57\n*E\n"})
            /* renamed from: com.plaid.internal.z0$i$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0589a extends FunctionReferenceImpl implements Function1<r8, C3669k1> {
                public C0589a(q8 q8Var) {
                    super(1, q8Var, q8.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public final C3669k1 invoke(r8 r8Var) {
                    r8 paneId = r8Var;
                    Intrinsics.checkNotNullParameter(paneId, "p0");
                    int i10 = p8.f40976d;
                    p8 p8Var = (p8) C3669k1.class.newInstance();
                    p8Var.getClass();
                    Intrinsics.checkNotNullParameter(paneId, "paneId");
                    Intrinsics.checkNotNullParameter(paneId, "paneId");
                    p8Var.setArguments(u0.c.a(TuplesKt.to("workflow_pane_id", paneId)));
                    return (C3669k1) p8Var;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull r8 pane) {
                super(new C0589a(q8.f41007a));
                Intrinsics.checkNotNullParameter(pane, "pane");
                this.f41225b = pane;
            }

            @Override // com.plaid.internal.AbstractC3802z0.i
            @NotNull
            public final r8 b() {
                return this.f41225b;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f41225b, ((a) obj).f41225b);
            }

            public final int hashCode() {
                return this.f41225b.hashCode();
            }

            @NotNull
            public final String toString() {
                return "HeadlessOAuth(pane=" + this.f41225b + ")";
            }
        }

        public i() {
            throw null;
        }

        @NotNull
        public final Function1<r8, F> a() {
            return this.f41224a;
        }

        @NotNull
        public abstract r8 b();

        public i(a.C0589a c0589a) {
            this.f41224a = c0589a;
        }
    }

    /* renamed from: com.plaid.internal.z0$j */
    public static final class j extends AbstractC3802z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final LinkSuccess f41226a;

        public j(@NotNull LinkSuccess success) {
            Intrinsics.checkNotNullParameter(success, "success");
            this.f41226a = success;
        }

        @NotNull
        public final LinkSuccess a() {
            return this.f41226a;
        }
    }

    /* renamed from: com.plaid.internal.z0$k */
    public static final class k extends AbstractC3802z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final EnumC3612d7 f41227a;

        public k(@NotNull String url, @NotNull String webviewFallbackId, @NotNull EnumC3612d7 smsAutofillType) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
            Intrinsics.checkNotNullParameter(smsAutofillType, "smsAutofillType");
            this.f41227a = smsAutofillType;
        }

        @NotNull
        public final EnumC3612d7 a() {
            return this.f41227a;
        }
    }

    public AbstractC3802z0() {
        Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "getSimpleName(...)");
    }
}
