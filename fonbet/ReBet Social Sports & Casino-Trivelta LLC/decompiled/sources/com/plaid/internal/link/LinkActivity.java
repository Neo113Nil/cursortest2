package com.plaid.internal.link;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.P;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowMetrics;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.N;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import com.plaid.internal.AbstractActivityC3752t4;
import com.plaid.internal.AbstractC3743s4;
import com.plaid.internal.AbstractC3802z0;
import com.plaid.internal.C1;
import com.plaid.internal.C3;
import com.plaid.internal.C3556a6;
import com.plaid.internal.C3661j2;
import com.plaid.internal.C3670k2;
import com.plaid.internal.C3679l2;
import com.plaid.internal.C3702n7;
import com.plaid.internal.C3761u4;
import com.plaid.internal.C3806z4;
import com.plaid.internal.D6;
import com.plaid.internal.E3;
import com.plaid.internal.EnumC3612d7;
import com.plaid.internal.EnumC3631g;
import com.plaid.internal.F6;
import com.plaid.internal.G1;
import com.plaid.internal.G2;
import com.plaid.internal.J5;
import com.plaid.internal.J6;
import com.plaid.internal.L2;
import com.plaid.internal.P7;
import com.plaid.internal.U0;
import com.plaid.internal.X7;
import com.plaid.internal.Y6;
import com.plaid.internal.p8;
import com.plaid.internal.v8;
import com.plaid.internal.w8;
import com.plaid.link.Plaid;
import com.plaid.link.R;
import com.twilio.voice.EventKeys;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.d;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/link/LinkActivity;", "Lcom/plaid/internal/t4;", "Lcom/plaid/internal/w8;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinkActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkActivity.kt\ncom/plaid/internal/link/LinkActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,280:1\n75#2,13:281\n75#2,13:294\n32#3,8:307\n*S KotlinDebug\n*F\n+ 1 LinkActivity.kt\ncom/plaid/internal/link/LinkActivity\n*L\n79#1:281,13\n81#1:294,13\n249#1:307,8\n*E\n"})
/* loaded from: classes4.dex */
public class LinkActivity extends AbstractActivityC3752t4 implements w8 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f40774e = 0;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final T f40775c = new T(Reflection.getOrCreateKotlinClass(C3661j2.class), new d(), new h(), new e());

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final T f40776d = new T(Reflection.getOrCreateKotlinClass(C3806z4.class), new f(), new c(), new g());

    @DebugMetadata(c = "com.plaid.internal.link.LinkActivity$onBackPressed$1", f = "LinkActivity.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f40777a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LinkActivity.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation<? super Unit> continuation) {
            return LinkActivity.this.new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f40777a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C3661j2 c3661j2 = (C3661j2) LinkActivity.this.f40775c.getValue();
                this.f40777a = 1;
                obj = c3661j2.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                LinkActivity.super.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<AbstractC3802z0, Unit> {
        public b(LinkActivity linkActivity) {
            super(1, linkActivity, LinkActivity.class, "navigate", "navigate(Lcom/plaid/internal/workflow/model/Destination;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AbstractC3802z0 abstractC3802z0) {
            AbstractC3802z0 p02 = abstractC3802z0;
            Intrinsics.checkNotNullParameter(p02, "p0");
            LinkActivity linkActivity = (LinkActivity) this.receiver;
            int i10 = LinkActivity.f40774e;
            linkActivity.a(p02);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0<U.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final U.c invoke() {
            return new C3761u4(((C3661j2) LinkActivity.this.f40775c.getValue()).f40696a);
        }
    }

    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
    public static final class d extends Lambda implements Function0<V> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final V invoke() {
            return LinkActivity.this.getViewModelStore();
        }
    }

    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
    public static final class e extends Lambda implements Function0<X0.a> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final X0.a invoke() {
            return LinkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
    public static final class f extends Lambda implements Function0<V> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final V invoke() {
            return LinkActivity.this.getViewModelStore();
        }
    }

    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
    public static final class g extends Lambda implements Function0<X0.a> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final X0.a invoke() {
            return LinkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class h extends Lambda implements Function0<U.c> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final U.c invoke() {
            LinkActivity linkActivity = LinkActivity.this;
            linkActivity.getClass();
            Plaid plaid = Plaid.INSTANCE;
            Application application = linkActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            return new C3679l2(plaid.provideLinkTokenComponent$link_sdk_release(application));
        }
    }

    public static final void c(LinkActivity linkActivity) {
        linkActivity.f41092b = true;
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public final void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 3365) {
            if (i11 != -1 || intent == null) {
                C3556a6.f39823a.getClass();
                C3556a6.a.a("User denied SMS permission", true);
            } else {
                String stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                Intent intent2 = new Intent("link_share_sms_from_consent_result_action");
                intent2.putExtra("link_shared_sms_content_extra", stringExtra);
                sendBroadcast(intent2);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        AbstractC1459k.d(S.a((C3661j2) this.f40775c.getValue()), null, null, new a(null), 3, null);
    }

    @Override // com.plaid.internal.AbstractActivityC3752t4, androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        C0 d10;
        C3556a6.f39823a.getClass();
        C3556a6.a.a("OnCreate", true);
        F6.a.b(MapsKt.emptyMap(), "LinkActivity onCreate");
        C3702n7.a(this);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        setContentView(R.layout.plaid_activity_link);
        C3661j2 c3661j2 = (C3661j2) this.f40775c.getValue();
        b observer = new b(this);
        c3661j2.getClass();
        Intrinsics.checkNotNullParameter(this, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        G2 g22 = c3661j2.f40697b;
        if (g22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigator");
            g22 = null;
        }
        g22.f39257a.observe(this, new C3661j2.a(observer));
        C3661j2 c3661j22 = (C3661j2) this.f40775c.getValue();
        if (c3661j22.f40701f == null) {
            d10 = AbstractC1459k.d(S.a(c3661j22), C1452g0.a(), null, new C3670k2(c3661j22, null), 2, null);
            c3661j22.f40701f = d10;
        }
        super.onCreate(bundle);
    }

    @Override // m.AbstractActivityC5481c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public final void onDestroy() {
        F6.a.b(MapsKt.emptyMap(), "LinkActivity onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public final void onPause() {
        C3556a6.f39823a.getClass();
        C3556a6.a.a("OnPause", true);
        F6.a.b(MapsKt.emptyMap(), "LinkActivity onPause");
        super.onPause();
    }

    @Override // com.plaid.internal.AbstractActivityC3752t4, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public final void onResume() {
        C3556a6.f39823a.getClass();
        C3556a6.a.a("OnResume", true);
        F6.a.b(MapsKt.emptyMap(), "LinkActivity onResume");
        super.onResume();
    }

    public static final C3806z4 a(LinkActivity linkActivity) {
        return (C3806z4) linkActivity.f40776d.getValue();
    }

    @Override // com.plaid.internal.w8
    @NotNull
    public final E3 b() {
        return new E3(((C3661j2) this.f40775c.getValue()).f40696a);
    }

    public final void c() {
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + ((String) null))));
    }

    @Override // com.plaid.internal.AbstractActivityC3752t4
    public final void a(@Nullable Intent intent) {
        D6 a10 = intent != null ? C1.a(intent) : null;
        if (a10 != null) {
            C3556a6.a.a(C3556a6.f39823a, "onIntentReady with redirectState: " + a10);
            F6.a.b(MapsKt.emptyMap(), "LinkActivity onIntentReady with redirectState: " + a10);
        }
        ((C3661j2) this.f40775c.getValue()).a(a10);
    }

    public final void a(AbstractC3802z0 abstractC3802z0) {
        C3556a6.a.a(C3556a6.f39823a, "Navigating to " + abstractC3802z0);
        try {
            if (Intrinsics.areEqual(abstractC3802z0, AbstractC3802z0.e.f41221a)) {
                C3 fragment = new C3();
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                N s10 = supportFragmentManager.s();
                s10.o(R.id.fragment_container, fragment);
                s10.i();
                return;
            }
            if (abstractC3802z0 instanceof AbstractC3802z0.i) {
                Fragment fragment2 = (Fragment) ((AbstractC3802z0.i.a.C0589a) ((AbstractC3802z0.i) abstractC3802z0).a()).invoke(((AbstractC3802z0.i) abstractC3802z0).b());
                Intrinsics.checkNotNullParameter(fragment2, "fragment");
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                N s11 = supportFragmentManager2.s();
                s11.o(R.id.fragment_container, fragment2);
                s11.i();
                return;
            }
            if (abstractC3802z0 instanceof AbstractC3802z0.j) {
                Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 96171, ((AbstractC3802z0.j) abstractC3802z0).a());
                return;
            }
            if (abstractC3802z0 instanceof AbstractC3802z0.d) {
                Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 6148, ((AbstractC3802z0.d) abstractC3802z0).a());
                return;
            }
            if (abstractC3802z0 instanceof AbstractC3802z0.f) {
                String a10 = ((AbstractC3802z0.f) abstractC3802z0).a();
                Map metadata = MapsKt.mapOf(TuplesKt.to(EventKeys.URL, a10));
                Intrinsics.checkNotNullParameter("Opening url in default browser", "eventName");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                F6.a.a("Opening url in default browser", metadata, J6.INFO);
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(a10)));
                return;
            }
            if (abstractC3802z0 instanceof AbstractC3802z0.g) {
                a(((AbstractC3802z0.g) abstractC3802z0).a());
                return;
            }
            if (abstractC3802z0 instanceof AbstractC3802z0.a) {
                c();
                return;
            }
            if (abstractC3802z0 instanceof AbstractC3802z0.k) {
                EnumC3612d7 smsAutofillType = ((AbstractC3802z0.k) abstractC3802z0).a();
                int i10 = P7.f39528l;
                Intrinsics.checkNotNullParameter(smsAutofillType, "smsAutofillType");
                P7 fragment3 = new P7();
                Bundle bundle = new Bundle();
                bundle.putSerializable("smsAutofillType", smsAutofillType);
                fragment3.setArguments(bundle);
                Intrinsics.checkNotNullParameter(fragment3, "fragment");
                FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                N s12 = supportFragmentManager3.s();
                s12.o(R.id.fragment_container, fragment3);
                s12.i();
                return;
            }
            if (abstractC3802z0 instanceof AbstractC3802z0.h) {
                AbstractC1459k.d(AbstractC2194t.a(this), null, null, new G1(this, null), 3, null);
                return;
            }
            if (abstractC3802z0 instanceof AbstractC3802z0.b) {
                ((C3806z4) this.f40776d.getValue()).a(((AbstractC3802z0.b) abstractC3802z0).a());
                return;
            }
            if (abstractC3802z0 instanceof AbstractC3802z0.c) {
                int i11 = U0.f39651c;
                U0 fragment4 = U0.a.a(((AbstractC3802z0.c) abstractC3802z0).a());
                Intrinsics.checkNotNullParameter(fragment4, "fragment");
                FragmentManager supportFragmentManager4 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "getSupportFragmentManager(...)");
                N s13 = supportFragmentManager4.s();
                s13.o(R.id.fragment_container, fragment4);
                s13.i();
            }
        } catch (Exception e10) {
            C3556a6.a.b(C3556a6.f39823a, e10, "Error occurred while trying to render: " + abstractC3802z0);
            Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 6148, L2.b(e10, null));
        }
    }

    public final void a(AbstractC3743s4 abstractC3743s4) {
        int i10;
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        F6.a.b(MapsKt.emptyMap(), "Opening URL within webview session");
        if (abstractC3743s4 instanceof AbstractC3743s4.d) {
            String str = abstractC3743s4.f41051a;
            int i11 = ((AbstractC3743s4.d) abstractC3743s4).f41052b;
            PackageManager packageManager = getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            Intrinsics.checkNotNullParameter(packageManager, "packageManager");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "queryIntentServices(...)");
            if (queryIntentServices.isEmpty()) {
                Intrinsics.checkNotNullParameter("Can't open custom tab -- custom tabs are not supported on this device", "message");
                C3556a6.a.b(C3556a6.f39823a, "Can't open custom tab -- custom tabs are not supported on this device");
                J5 j52 = Y6.f39796a;
                if (j52 != null) {
                    j52.a("Can't open custom tab -- custom tabs are not supported on this device");
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
                Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "getMaximumWindowMetrics(...)");
                bounds = maximumWindowMetrics.getBounds();
                i10 = bounds.height();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                i10 = displayMetrics.heightPixels;
            }
            if (i11 != 0) {
                i10 = RangesKt.coerceAtMost(i10, i11);
            }
            Map metadata = MapsKt.mapOf(TuplesKt.to(EventKeys.URL, str));
            Intrinsics.checkNotNullParameter("Opening custom tab with url", "eventName");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            F6.a.a("Opening custom tab with url", metadata, J6.INFO);
            w.d a10 = new d.C0946d().h(i10, 2).a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            Intent intent = a10.f67200a;
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            intent.addFlags(1073741824);
            intent.setData(Uri.parse(str));
            startActivityForResult(intent, 0);
            return;
        }
        if (abstractC3743s4 instanceof AbstractC3743s4.c) {
            a(abstractC3743s4.f41051a);
            return;
        }
        if (abstractC3743s4 instanceof AbstractC3743s4.b) {
            String str2 = abstractC3743s4.f41051a;
            Map metadata2 = MapsKt.mapOf(TuplesKt.to(EventKeys.URL, str2));
            Intrinsics.checkNotNullParameter("Opening url in default browser", "eventName");
            Intrinsics.checkNotNullParameter(metadata2, "metadata");
            F6.a.a("Opening url in default browser", metadata2, J6.INFO);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        }
    }

    public final void a(String str) {
        PackageManager packageManager = getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "queryIntentServices(...)");
        if (queryIntentServices.isEmpty()) {
            Intrinsics.checkNotNullParameter("Can't open custom tab -- custom tabs are not supported on this device", "message");
            C3556a6.a.b(C3556a6.f39823a, "Can't open custom tab -- custom tabs are not supported on this device");
            J5 j52 = Y6.f39796a;
            if (j52 != null) {
                j52.a("Can't open custom tab -- custom tabs are not supported on this device");
                return;
            }
            return;
        }
        Map metadata = MapsKt.mapOf(TuplesKt.to(EventKeys.URL, str));
        Intrinsics.checkNotNullParameter("Opening custom tab with url", "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        F6.a.a("Opening custom tab with url", metadata, J6.INFO);
        w.d a10 = new d.C0946d().a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        a10.a(this, Uri.parse(str));
    }

    @Override // com.plaid.internal.w8
    @NotNull
    public final v8 a(@NotNull p8.a createWorkflowViewModel) {
        Intrinsics.checkNotNullParameter(createWorkflowViewModel, "createWorkflowViewModel");
        return new v8(createWorkflowViewModel, ((C3661j2) this.f40775c.getValue()).f40696a);
    }

    @Override // com.plaid.internal.w8
    @NotNull
    public final X7 a() {
        return new X7(((C3661j2) this.f40775c.getValue()).f40696a);
    }
}
