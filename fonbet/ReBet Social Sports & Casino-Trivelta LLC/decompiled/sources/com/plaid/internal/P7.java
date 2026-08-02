package com.plaid.internal;

import Ph.AbstractC1459k;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC2194t;
import com.plaid.internal.C3556a6;
import com.plaid.internal.F6;
import com.plaid.internal.P5;
import com.plaid.internal.P7;
import com.plaid.link.R;
import j.AbstractC5086b;
import j.InterfaceC5085a;
import java.util.List;
import k.C5141b;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5322g;
import l0.AbstractC5338c;
import l0.AbstractC5342g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/P7;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewFragment.kt\ncom/plaid/internal/workflow/webview/WebviewFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,213:1\n168#2,2:214\n168#2,2:216\n*S KotlinDebug\n*F\n+ 1 WebviewFragment.kt\ncom/plaid/internal/workflow/webview/WebviewFragment\n*L\n145#1:214,2\n153#1:216,2\n*E\n"})
/* loaded from: classes3.dex */
public final class P7 extends Fragment {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f39528l = 0;

    /* renamed from: a, reason: collision with root package name */
    public Z5 f39529a;

    /* renamed from: b, reason: collision with root package name */
    public P5 f39530b;

    /* renamed from: c, reason: collision with root package name */
    public U7 f39531c;

    /* renamed from: d, reason: collision with root package name */
    public C3765v f39532d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f39533e = LazyKt.lazy(new a());

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public Lambda f39534f = f.f39549a;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f39535g = e.f39548a;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final AbstractC5086b f39536h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final AbstractC5086b f39537i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC5086b f39538j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public final g f39539k;

    public static final class a extends Lambda implements Function0<C3655i5> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3655i5 invoke() {
            U7 u72 = P7.this.f39531c;
            if (u72 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                u72 = null;
            }
            C3655i5 c3655i5 = u72.f39675d;
            if (c3655i5 != null) {
                return c3655i5;
            }
            Intrinsics.throwUninitializedPropertyAccessException("internalPictureStorage");
            return null;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$2", f = "WebviewFragment.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f39541a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return P7.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return P7.this.new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39541a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                P5 p52 = P7.this.f39530b;
                if (p52 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    p52 = null;
                }
                this.f39541a = 1;
                Object collect = p52.f39511b.f40966d.collect(new Q5(new T5(p52)), this);
                if (collect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    collect = Unit.INSTANCE;
                }
                if (collect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    collect = Unit.INSTANCE;
                }
                if (collect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$4", f = "WebviewFragment.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f39543a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return P7.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return P7.this.new c(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39543a;
            Z5 z52 = null;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                U7 u72 = P7.this.f39531c;
                if (u72 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    u72 = null;
                }
                this.f39543a = 1;
                A6 a62 = u72.f39677f;
                if (a62 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("readWebviewBackgroundTransparencyState");
                    a62 = null;
                }
                obj = a62.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                Z5 z53 = P7.this.f39529a;
                if (z53 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    z53 = null;
                }
                z53.f39809a.setBackground(AbstractC5338c.getDrawable(P7.this.requireContext(), R.drawable.plaid_transparent_webview_animation));
                Z5 z54 = P7.this.f39529a;
                if (z54 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    z52 = z54;
                }
                Drawable background = z52.f39809a.getBackground();
                Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.setOneShot(true);
                animationDrawable.start();
            } else {
                Z5 z55 = P7.this.f39529a;
                if (z55 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    z52 = z55;
                }
                z52.f39809a.setBackgroundColor(-1);
                AbstractActivityC2168s activity = P7.this.getActivity();
                if (activity != null) {
                    C3702n7.a(activity);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$5", f = "WebviewFragment.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f39545a;

        public static final class a<T> implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ P7 f39547a;

            public a(P7 p72) {
                this.f39547a = p72;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            public final Object emit(Object obj, Continuation continuation) {
                String str = (String) obj;
                P5 p52 = this.f39547a.f39530b;
                P5 p53 = null;
                if (p52 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    p52 = null;
                }
                if (!p52.f39515f.get()) {
                    U7 u72 = this.f39547a.f39531c;
                    if (u72 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        u72 = null;
                    }
                    u72.getClass();
                    AbstractC1459k.d(androidx.lifecycle.S.a(u72), null, null, new W7(u72, null), 3, null);
                    P5 p54 = this.f39547a.f39530b;
                    if (p54 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webView");
                        p54 = null;
                    }
                    if (!Intrinsics.areEqual(p54.getUrl(), str)) {
                        P5 p55 = this.f39547a.f39530b;
                        if (p55 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("webView");
                        } else {
                            p53 = p55;
                        }
                        p53.loadUrl(str);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return P7.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return P7.this.new d(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39545a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                U7 u72 = P7.this.f39531c;
                if (u72 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    u72 = null;
                }
                kotlinx.coroutines.flow.C a10 = AbstractC5323h.a(u72.f39684m);
                a aVar = new a(P7.this);
                this.f39545a = 1;
                if (a10.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public static final class e extends Lambda implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f39548a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f39549a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public P7() {
        AbstractC5086b registerForActivityResult = registerForActivityResult(new k.h(), new InterfaceC5085a() { // from class: hc.c
            @Override // j.InterfaceC5085a
            public final void a(Object obj) {
                P7.a(P7.this, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f39536h = registerForActivityResult;
        AbstractC5086b registerForActivityResult2 = registerForActivityResult(new C5141b(), new InterfaceC5085a() { // from class: hc.d
            @Override // j.InterfaceC5085a
            public final void a(Object obj) {
                P7.a(P7.this, (List) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.f39537i = registerForActivityResult2;
        this.f39539k = new g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater.Factory activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.plaid.internal.workflow.panes.WorkflowViewModelFactoryProvider");
        this.f39531c = (U7) new androidx.lifecycle.U(this, ((w8) activity).a()).a(U7.class);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        Z5 z52 = null;
        EnumC3612d7 enumC3612d7 = (EnumC3612d7) (arguments != null ? arguments.get("smsAutofillType") : null);
        g listener = this.f39539k;
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3765v c3630f7 = (enumC3612d7 == null ? -1 : C3756u.f41105a[enumC3612d7.ordinal()]) == 1 ? new C3630f7(listener) : new C3765v();
        this.f39532d = c3630f7;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        c3630f7.a(requireContext);
        View inflate = inflater.inflate(R.layout.plaid_webview_fragment, viewGroup, false);
        if (inflate == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        Z5 z53 = new Z5(frameLayout, frameLayout);
        Intrinsics.checkNotNullExpressionValue(z53, "inflate(...)");
        this.f39529a = z53;
        AbstractC5086b registerForActivityResult = registerForActivityResult(new C3693m7((C3655i5) this.f39533e.getValue()), new InterfaceC5085a() { // from class: hc.e
            @Override // j.InterfaceC5085a
            public final void a(Object obj) {
                P7.a(P7.this, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f39538j = registerForActivityResult;
        U7 u72 = this.f39531c;
        if (u72 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            u72 = null;
        }
        N5 n52 = u72.f39679h;
        if (n52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewRegistry");
            n52 = null;
        }
        P5 c10 = n52.c();
        this.f39530b = c10;
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        U7 listener2 = this.f39531c;
        if (listener2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            listener2 = null;
        }
        U7 listener3 = this.f39531c;
        if (listener3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            listener3 = null;
        }
        AbstractC5086b fileInputContract = this.f39537i;
        AbstractC5086b takePictureContract = this.f39538j;
        if (takePictureContract == null) {
            Intrinsics.throwUninitializedPropertyAccessException("takePictureContract");
            takePictureContract = null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener2, "interceptor");
        Intrinsics.checkNotNullParameter(listener3, "listener");
        Intrinsics.checkNotNullParameter(fileInputContract, "fileInputContract");
        Intrinsics.checkNotNullParameter(takePictureContract, "takePictureContract");
        Intrinsics.checkNotNullParameter(this, "permissionHelper");
        Context context2 = c10.getContext();
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(P5.a.a(context));
        }
        c10.f39512c = listener3;
        C3609d4 c3609d4 = c10.f39510a;
        c3609d4.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        c3609d4.f40555a = listener2;
        c10.setWebChromeClient(new R4(fileInputContract, takePictureContract, listener3, this));
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new b(null), 3, null);
        Z5 z54 = this.f39529a;
        if (z54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            z54 = null;
        }
        FrameLayout frameLayout2 = z54.f39810b;
        P5 p52 = this.f39530b;
        if (p52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            p52 = null;
        }
        frameLayout2.addView(p52);
        Z5 z55 = this.f39529a;
        if (z55 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            z55 = null;
        }
        AbstractC2082d0.x0(z55.f39810b, new androidx.core.view.J() { // from class: hc.f
            @Override // androidx.core.view.J
            public final F0 f(View view, F0 f02) {
                return P7.a(P7.this, view, f02);
            }
        });
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new c(null), 3, null);
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new d(null), 3, null);
        Z5 z56 = this.f39529a;
        if (z56 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            z52 = z56;
        }
        FrameLayout frameLayout3 = z52.f39809a;
        Intrinsics.checkNotNullExpressionValue(frameLayout3, "getRoot(...)");
        return frameLayout3;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        P5 p52 = this.f39530b;
        C3765v c3765v = null;
        if (p52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            p52 = null;
        }
        if (!p52.f39515f.getAndSet(true)) {
            Z5 z52 = this.f39529a;
            if (z52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                z52 = null;
            }
            z52.f39809a.setBackground(AbstractC5338c.getDrawable(requireContext(), R.drawable.plaid_transparent_webview_animation_fade_out));
            Z5 z53 = this.f39529a;
            if (z53 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                z53 = null;
            }
            if (z53.f39809a.getBackground() instanceof AnimationDrawable) {
                Z5 z54 = this.f39529a;
                if (z54 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    z54 = null;
                }
                Drawable background = z54.f39809a.getBackground();
                Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.setOneShot(true);
                animationDrawable.start();
            }
            Z5 z55 = this.f39529a;
            if (z55 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                z55 = null;
            }
            FrameLayout frameLayout = z55.f39810b;
            P5 p53 = this.f39530b;
            if (p53 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                p53 = null;
            }
            frameLayout.removeView(p53);
            P5 p54 = this.f39530b;
            if (p54 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                p54 = null;
            }
            p54.destroy();
        }
        C3765v c3765v2 = this.f39532d;
        if (c3765v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autofillManager");
        } else {
            c3765v = c3765v2;
        }
        c3765v.b(getContext());
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public static final void a(P7 this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            this$0.f39534f.invoke();
        } else {
            Toast.makeText(this$0.getContext(), this$0.getResources().getString(R.string.grant_camera_permission_to_continue), 0).show();
            this$0.f39535g.invoke();
        }
    }

    public static final void a(P7 this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        U7 u72 = this$0.f39531c;
        if (u72 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            u72 = null;
        }
        Intrinsics.checkNotNull(list);
        u72.a(list);
    }

    public static final void a(P7 this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        U7 u72 = this$0.f39531c;
        if (u72 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            u72 = null;
        }
        u72.a(CollectionsKt.listOf(uri));
    }

    public static final androidx.core.view.F0 a(P7 this$0, View v10, androidx.core.view.F0 windowInsets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        androidx.core.graphics.e f10 = windowInsets.f(F0.p.g());
        Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
        if (this$0.requireContext().getApplicationInfo().targetSdkVersion >= 35) {
            v10.setPadding(f10.f19098a, f10.f19099b, f10.f19100c, f10.f19101d);
        } else {
            v10.setPadding(f10.f19098a, f10.f19099b, f10.f19100c, 0);
        }
        return androidx.core.view.F0.f19136b;
    }

    public static final class g implements InterfaceC3621e7 {
        public g() {
        }

        @Override // com.plaid.internal.InterfaceC3621e7
        public final void a(@NotNull String smsMessage) {
            final String str;
            String value;
            Intrinsics.checkNotNullParameter(smsMessage, "smsMessage");
            P5 p52 = null;
            MatchResult find$default = Regex.find$default(new Regex("[:]\\s?[\\d]{4,8}\\s?[.]?"), smsMessage, 0, 2, null);
            if (find$default != null && find$default.getValue().length() < 7) {
                Intrinsics.checkNotNullParameter("No OTP code found in SMS message.", "message");
                C3556a6.a.b(C3556a6.f39823a, "No OTP code found in SMS message.");
                J5 j52 = Y6.f39796a;
                if (j52 != null) {
                    j52.a("No OTP code found in SMS message.");
                    return;
                }
                return;
            }
            if (find$default == null || (value = find$default.getValue()) == null) {
                str = null;
            } else {
                str = value.substring(2, find$default.getValue().length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            }
            P5 p53 = P7.this.f39530b;
            if (p53 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
            } else {
                p52 = p53;
            }
            final P7 p72 = P7.this;
            p52.post(new Runnable() { // from class: hc.g
                @Override // java.lang.Runnable
                public final void run() {
                    P7.g.a(P7.this, str);
                }
            });
        }

        public static final void a(P7 this$0, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            P5 p52 = this$0.f39530b;
            if (p52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                p52 = null;
            }
            p52.loadUrl("javascript:window.SdkJsBridge.send('{\"message_type\": \"rm-otp-code-input\", \"data\": {\"otpCode\": \"" + str + "\"}}')");
            F6.a.b(MapsKt.emptyMap(), "JSBridge - sent rm-otp-code-input");
        }

        @Override // com.plaid.internal.InterfaceC3621e7
        public final void a() {
            C3556a6.f39823a.getClass();
            C3556a6.a.a("OTP TimeOut", true);
        }
    }

    public final boolean a() {
        return AbstractC5342g.b(requireContext(), "android.permission.CAMERA") == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@NotNull Function0<Unit> success, @NotNull Function0<Unit> failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.f39534f = (Lambda) success;
        this.f39535g = failure;
        this.f39536h.b("android.permission.CAMERA");
    }
}
