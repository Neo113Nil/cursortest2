package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import android.R;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.plaid.internal.C3556a6;
import com.plaid.internal.C3647h6;
import com.plaid.internal.L5;
import com.plaid.internal.P5;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.serialization.json.JsonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nPlaidWebview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidWebview.kt\ncom/plaid/core/webview/PlaidWebview\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,206:1\n1855#2,2:207\n20#3:209\n22#3:213\n50#4:210\n55#4:212\n106#5:211\n26#6,4:214\n*S KotlinDebug\n*F\n+ 1 PlaidWebview.kt\ncom/plaid/core/webview/PlaidWebview\n*L\n94#1:207,2\n108#1:209\n108#1:213\n108#1:210\n108#1:212\n108#1:211\n143#1:214,4\n*E\n"})
/* loaded from: classes3.dex */
public final class P5 extends WebView {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f39509g = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C3609d4 f39510a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3719p6 f39511b;

    /* renamed from: c, reason: collision with root package name */
    public L5 f39512c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Ph.C0 f39513d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f39514e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f39515f;

    public static final class a {
        public static final Context a(Context context) {
            int i10 = P5.f39509g;
            if (Build.VERSION.SDK_INT < 29) {
                return context;
            }
            context.setTheme(R.style.Theme.DeviceDefault.DayNight);
            return context;
        }
    }

    @DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$submit$1", f = "PlaidWebview.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPlaidWebview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidWebview.kt\ncom/plaid/core/webview/PlaidWebview$submit$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,206:1\n20#2:207\n22#2:211\n50#3:208\n55#3:210\n106#4:209\n*S KotlinDebug\n*F\n+ 1 PlaidWebview.kt\ncom/plaid/core/webview/PlaidWebview$submit$1\n*L\n156#1:207\n156#1:211\n156#1:208\n156#1:210\n156#1:209\n*E\n"})
    public static final class b extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f39516a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f39518c;

        public static final class a<T> implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ P5 f39519a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f39520b;

            public a(P5 p52, String str) {
                this.f39519a = p52;
                this.f39520b = str;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            public final Object emit(Object obj, Continuation continuation) {
                ((Boolean) obj).getClass();
                Object g10 = AbstractC1455i.g(C1452g0.c(), new W5(this.f39519a, this.f39520b, null), continuation);
                return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f39518c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return P5.this.new b(this.f39518c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return P5.this.new b(this.f39518c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39516a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                P5 p52 = P5.this;
                kotlinx.coroutines.flow.L l10 = p52.f39511b.f40966d;
                a aVar = new a(p52, this.f39518c);
                this.f39516a = 1;
                Object collect = l10.collect(new X5(aVar), this);
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

    public static final class c extends Lambda implements Function1<ei.C, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f39521a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f39522b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f39523c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Map<String, String> map) {
            super(1);
            this.f39521a = str;
            this.f39522b = str2;
            this.f39523c = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ei.C c10) {
            ei.C putJsonObject = c10;
            Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
            String str = this.f39521a;
            if (str != null) {
                ei.i.a(putJsonObject, "phone_number", str);
            } else {
                putJsonObject.b("phone_number", JsonNull.INSTANCE);
            }
            String str2 = this.f39522b;
            if (str2 != null) {
                ei.i.a(putJsonObject, "date_of_birth", str2);
            } else {
                putJsonObject.b("date_of_birth", JsonNull.INSTANCE);
            }
            ei.i.b(putJsonObject, "params", new Y5(this.f39523c));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P5(@NotNull Context context) {
        super(new MutableContextWrapper(a.a(context)), null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        C3609d4 c3609d4 = new C3609d4();
        this.f39510a = c3609d4;
        C3719p6 c3719p6 = new C3719p6(c3609d4);
        this.f39511b = c3719p6;
        this.f39514e = new ArrayList();
        this.f39515f = new AtomicBoolean(false);
        if (Build.VERSION.SDK_INT >= 26) {
            setRendererPriorityPolicy(2, false);
        }
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setBackgroundColor(0);
        addJavascriptInterface(c3719p6, "PlaidAndroid");
        setWebViewClient(new K5(c3609d4));
    }

    @NotNull
    public final AtomicBoolean a() {
        return this.f39515f;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f39510a.f40555a = null;
        Ph.C0 c02 = this.f39513d;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        Iterator it = this.f39514e.iterator();
        while (it.hasNext()) {
            C0.a.b((Ph.C0) it.next(), null, 1, null);
        }
        this.f39514e.clear();
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, event);
        }
        if (canGoBack()) {
            goBack();
            return true;
        }
        L5 l52 = this.f39512c;
        L5 l53 = null;
        if (l52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
            l52 = null;
        }
        l52.a();
        L5 l54 = this.f39512c;
        if (l54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
        } else {
            l53 = l54;
        }
        if (Intrinsics.areEqual(l53, L5.a.f39346a)) {
            return super.onKeyDown(i10, event);
        }
        return true;
    }

    public final void a(@NotNull final C3647h6.a callback) {
        Ph.C0 d10;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (((Boolean) this.f39511b.f40966d.getValue()).booleanValue()) {
            post(new Runnable() { // from class: hc.b
                @Override // java.lang.Runnable
                public final void run() {
                    P5.a(Function0.this);
                }
            });
            return;
        }
        d10 = AbstractC1459k.d(Ph.Q.a(C1452g0.c()), null, null, new V5(this, callback, null), 3, null);
        this.f39514e.add(d10);
        d10.invokeOnCompletion(new U5(this, d10));
    }

    public static final void a(Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke();
    }

    public final void a(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map) {
        Ph.C0 d10;
        if (str == null && str2 == null && (map == null || map.isEmpty())) {
            C3556a6.a.b(C3556a6.f39823a, "null phone number && null DOB && null/empty params passed to submit -- noop");
            return;
        }
        ei.C c10 = new ei.C();
        ei.i.a(c10, "message_type", "submit");
        ei.i.b(c10, EventKeys.DATA, new c(str, str2, map));
        String jsonObject = c10.a().toString();
        Ph.C0 c02 = this.f39513d;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(Ph.Q.a(C1452g0.b()), null, null, new b(jsonObject, null), 3, null);
        this.f39513d = d10;
    }
}
