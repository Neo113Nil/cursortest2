package com.plaid.link;

import Gg.d;
import Ph.AbstractC1455i;
import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.C1483w0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import com.plaid.internal.A1;
import com.plaid.internal.A2;
import com.plaid.internal.C3556a6;
import com.plaid.internal.C3565b5;
import com.plaid.internal.C3575c5;
import com.plaid.internal.C3608d3;
import com.plaid.internal.C3618e4;
import com.plaid.internal.C3704o0;
import com.plaid.internal.C3713p0;
import com.plaid.internal.C3727q5;
import com.plaid.internal.C3787x3;
import com.plaid.internal.C3794y1;
import com.plaid.internal.E2;
import com.plaid.internal.EnumC3664j5;
import com.plaid.internal.F6;
import com.plaid.internal.G6;
import com.plaid.internal.H6;
import com.plaid.internal.I2;
import com.plaid.internal.InterfaceC3553a3;
import com.plaid.internal.J5;
import com.plaid.internal.J6;
import com.plaid.internal.N2;
import com.plaid.internal.P;
import com.plaid.internal.Q0;
import com.plaid.internal.S4;
import com.plaid.internal.V3;
import com.plaid.internal.V4;
import com.plaid.internal.W4;
import com.plaid.internal.X4;
import com.plaid.internal.X6;
import com.plaid.internal.Y6;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.configuration.LinkLogLevel;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkConfigurationMalformedLinkTokenException;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkExit;
import com.twilio.voice.EventKeys;
import io.agora.rtc2.internal.AudioRoutingController;
import j.AbstractC5086b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003JA\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b\u001d\u0010!J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u0003J\u0017\u0010(\u001a\u00020'2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0003J\u001f\u00101\u001a\u00020'2\u0006\u0010.\u001a\u00020*2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020'2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010)J\u000f\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020;H\u0002¢\u0006\u0004\b>\u0010=J\u001f\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0000¢\u0006\u0004\b?\u0010@J)\u0010G\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u0006\u0018\u00010Bj\u0004\u0018\u0001`DH\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010J\u001a\u00020;2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\bH\u0010IJ\u0017\u0010O\u001a\u00020'2\u0006\u0010L\u001a\u00020KH\u0000¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020'2\u0006\u0010Q\u001a\u00020PH\u0000¢\u0006\u0004\bM\u0010RJ\u0017\u0010W\u001a\u00020\u00062\u0006\u0010T\u001a\u00020SH\u0000¢\u0006\u0004\bU\u0010VJ\u0019\u0010Z\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\bX\u0010YJ\u0010\u0010]\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b[\u0010\\J\r\u0010^\u001a\u00020\u0006¢\u0006\u0004\b^\u0010\u0003J\u001f\u0010`\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b_\u0010#J\u000f\u0010b\u001a\u00020\u0006H\u0000¢\u0006\u0004\ba\u0010\u0003J'\u0010i\u001a\u00020\u00062\u0006\u0010L\u001a\u00020K2\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020eH\u0000¢\u0006\u0004\bg\u0010hR\"\u0010k\u001a\u00020j8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR \u0010q\u001a\u00020/8\u0006X\u0087D¢\u0006\u0012\n\u0004\bq\u0010r\u0012\u0004\bu\u0010\u0003\u001a\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R&\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010~R-\u0010\u007f\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00060Bj\u0002`D8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0081\u0001"}, d2 = {"Lcom/plaid/link/Plaid;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/plaid/link/event/LinkEvent;", "", "Lcom/plaid/link/event/LinkEventListener;", "linkEventListener", "setLinkEventListener", "(Lkotlin/jvm/functions/Function1;)V", "clearLinkEventListener", "Landroid/content/Context;", "context", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "config", "Lj/b;", "activityResultLauncher", "Lcom/plaid/link/result/LinkExit;", "failureCallback", "Landroid/view/View;", "createLinkEmbeddedView", "(Landroid/content/Context;Lcom/plaid/link/configuration/LinkTokenConfiguration;Lj/b;Lkotlin/jvm/functions/Function1;)Landroid/view/View;", "successCallback", "(Landroid/content/Context;Lcom/plaid/link/configuration/LinkTokenConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/view/View;", "Landroid/app/Application;", "application", "linkTokenConfiguration", "Lcom/plaid/link/PlaidHandler;", "create", "(Landroid/app/Application;Lcom/plaid/link/configuration/LinkTokenConfiguration;)Lcom/plaid/link/PlaidHandler;", "Lcom/plaid/link/OnLoadCallback;", "onLoad", "(Landroid/app/Application;Lcom/plaid/link/configuration/LinkTokenConfiguration;Lcom/plaid/link/OnLoadCallback;)Lcom/plaid/link/PlaidHandler;", "initializeAndCheckPrerequisites", "(Landroid/app/Application;Lcom/plaid/link/configuration/LinkTokenConfiguration;)V", "initialize", "(Landroid/app/Application;)V", "drainLinkEventQueue", "", "enforceDeviceHasPortrait", "(Landroid/content/Context;)Z", "Lcom/plaid/internal/j5;", "initializeEnvironmentFromTokenOrCrash", "(Lcom/plaid/link/configuration/LinkTokenConfiguration;)Lcom/plaid/internal/j5;", "maybeSendTestCrash", "plaidEnvironment", "", "packageName", "shouldSendTestCrash", "(Lcom/plaid/internal/j5;Ljava/lang/String;)Z", "Lcom/plaid/internal/V3;", "logLevel", "setPlogLevel", "(Lcom/plaid/internal/V3;)V", "configuration", "setLinkConfiguration", "(Lcom/plaid/link/configuration/LinkTokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasPortrait", "Lcom/plaid/internal/a3;", "getOrCreateTokenComponent", "()Lcom/plaid/internal/a3;", "initializeTokenComponentAndRegisterRemoteLogController", "getCustomerFacingLinkEventListenerInternal$link_sdk_release", "()Lkotlin/jvm/functions/Function1;", "getCustomerFacingLinkEventListenerInternal", "Lkotlin/Function2;", "Lcom/plaid/internal/I2;", "Lcom/plaid/internal/event/QueueableLinkEventListener;", "getLinkEventListenerInternal$link_sdk_release", "()Lkotlin/jvm/functions/Function2;", "getLinkEventListenerInternal", "provideLinkTokenComponent$link_sdk_release", "(Landroid/app/Application;)Lcom/plaid/internal/a3;", "provideLinkTokenComponent", "Landroid/app/Activity;", "activity", "openLinkInternal$link_sdk_release", "(Landroid/app/Activity;)Z", "openLinkInternal", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)Z", "Lcom/plaid/link/SubmissionData;", "submissionData", "submitInternal$link_sdk_release", "(Lcom/plaid/link/SubmissionData;)V", "submitInternal", "preloadLink$link_sdk_release", "(Lcom/plaid/link/OnLoadCallback;)V", "preloadLink", "awaitPreload$link_sdk_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPreload", "destroy", "createWithoutPreload$link_sdk_release", "createWithoutPreload", "trackSdkOpen$link_sdk_release", "trackSdkOpen", "", "resultCode", "Landroid/os/Parcelable;", EventKeys.DATA, "setLinkResultAndFinish$link_sdk_release", "(Landroid/app/Activity;ILandroid/os/Parcelable;)V", "setLinkResultAndFinish", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCreated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCreated$link_sdk_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setCreated$link_sdk_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "VERSION_NAME", "Ljava/lang/String;", "getVERSION_NAME", "()Ljava/lang/String;", "getVERSION_NAME$annotations", "Lcom/plaid/internal/X4;", "component", "Lcom/plaid/internal/X4;", "tokenComponent", "Lcom/plaid/internal/a3;", "LPh/C0;", "preloadLinkJob", "LPh/C0;", "Lkotlin/jvm/functions/Function1;", "queueableEventListener", "Lkotlin/jvm/functions/Function2;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Plaid {
    private static X4 component;

    @Nullable
    private static C0 preloadLinkJob;

    @Nullable
    private static volatile InterfaceC3553a3 tokenComponent;

    @NotNull
    public static final Plaid INSTANCE = new Plaid();

    @NotNull
    private static AtomicBoolean isCreated = new AtomicBoolean(false);

    @NotNull
    private static final String VERSION_NAME = BuildConfig.LINK_VERSION_NAME;

    @NotNull
    private static Function1<? super LinkEvent, Unit> linkEventListener = new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid$linkEventListener$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LinkEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent) {
            invoke2(linkEvent);
            return Unit.INSTANCE;
        }
    };

    @NotNull
    private static Function2<? super LinkEvent, ? super I2, Unit> queueableEventListener = new Function2<LinkEvent, I2, Unit>() { // from class: com.plaid.link.Plaid$queueableEventListener$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LinkEvent linkEvent, @Nullable I2 i22) {
            Intrinsics.checkNotNullParameter(linkEvent, "<anonymous parameter 0>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent, I2 i22) {
            invoke2(linkEvent, i22);
            return Unit.INSTANCE;
        }
    };

    private Plaid() {
    }

    @JvmStatic
    public static final void clearLinkEventListener() {
        linkEventListener = new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid$clearLinkEventListener$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LinkEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent) {
                invoke2(linkEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @JvmStatic
    @NotNull
    public static final PlaidHandler create(@NotNull Application application, @NotNull LinkTokenConfiguration linkTokenConfiguration) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(linkTokenConfiguration, "linkTokenConfiguration");
        return create(application, linkTokenConfiguration, null);
    }

    public static /* synthetic */ PlaidHandler create$default(Application application, LinkTokenConfiguration linkTokenConfiguration, OnLoadCallback onLoadCallback, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            onLoadCallback = null;
        }
        return create(application, linkTokenConfiguration, onLoadCallback);
    }

    @JvmStatic
    @NotNull
    public static final View createLinkEmbeddedView(@NotNull Context context, @NotNull LinkTokenConfiguration config, @NotNull AbstractC5086b activityResultLauncher, @NotNull Function1<? super LinkExit, Unit> failureCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        Plaid plaid = INSTANCE;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        plaid.initializeAndCheckPrerequisites((Application) applicationContext, config);
        Q0 q02 = new Q0(context, config, activityResultLauncher, null, failureCallback);
        q02.a();
        return q02.f39556f;
    }

    private final void drainLinkEventQueue() {
        C3556a6.f39823a.getClass();
        C3556a6.a.a("draining link event queue", true);
        X4 x42 = component;
        if (x42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            x42 = null;
        }
        ((C3713p0) x42).f40941j.get().a(new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid$drainLinkEventQueue$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent) {
                invoke2(linkEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LinkEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C3556a6.a.a(C3556a6.f39823a, "draining " + it);
                Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(it);
            }
        });
    }

    private final boolean enforceDeviceHasPortrait(Context context) {
        if (hasPortrait(context)) {
            return true;
        }
        throw new LinkException("Device does not support portrait mode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3553a3 getOrCreateTokenComponent() {
        InterfaceC3553a3 interfaceC3553a3 = tokenComponent;
        return interfaceC3553a3 == null ? initializeTokenComponentAndRegisterRemoteLogController() : interfaceC3553a3;
    }

    @NotNull
    public static final String getVERSION_NAME() {
        return VERSION_NAME;
    }

    @JvmStatic
    public static /* synthetic */ void getVERSION_NAME$annotations() {
    }

    private final boolean hasPortrait(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.screen.portrait");
    }

    private final synchronized void initialize(Application application) {
        if (isCreated.get()) {
            return;
        }
        Application application2 = (Application) d.b(application);
        C3727q5 c3727q5 = (C3727q5) d.b(new C3727q5());
        d.a(application2, Application.class);
        d.a(c3727q5, C3727q5.class);
        C3713p0 c3713p0 = new C3713p0(new C3727q5(), application2);
        component = c3713p0;
        J5 reporter = new J5(c3713p0.f40945n.get());
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Y6.f39796a = reporter;
        isCreated.getAndSet(true);
    }

    private final void initializeAndCheckPrerequisites(Application application, LinkTokenConfiguration linkTokenConfiguration) {
        V3 v32;
        initialize(application);
        enforceDeviceHasPortrait(application);
        initializeEnvironmentFromTokenOrCrash(linkTokenConfiguration);
        LinkLogLevel logLevel = linkTokenConfiguration.getLogLevel();
        Intrinsics.checkNotNullParameter(logLevel, "<this>");
        switch (E2.f39227a[logLevel.ordinal()]) {
            case 1:
                v32 = V3.ASSERT;
                break;
            case 2:
                v32 = V3.DEBUG;
                break;
            case 3:
                v32 = V3.ERROR;
                break;
            case 4:
                v32 = V3.INFO;
                break;
            case 5:
                v32 = V3.VERBOSE;
                break;
            case 6:
                v32 = V3.WARN;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        setPlogLevel(v32);
    }

    private final EnumC3664j5 initializeEnvironmentFromTokenOrCrash(LinkTokenConfiguration linkTokenConfiguration) {
        EnumC3664j5.a aVar = EnumC3664j5.Companion;
        String token = linkTokenConfiguration.getToken();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(token, "token");
        X4 x42 = null;
        EnumC3664j5 enumC3664j5 = null;
        for (EnumC3664j5 enumC3664j52 : EnumC3664j5.values()) {
            if (StringsKt.contains$default((CharSequence) token, (CharSequence) enumC3664j52.getJson(), false, 2, (Object) null)) {
                enumC3664j5 = enumC3664j52;
            }
        }
        if (enumC3664j5 == null) {
            throw LinkConfigurationMalformedLinkTokenException.INSTANCE;
        }
        X4 x43 = component;
        if (x43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
        } else {
            x42 = x43;
        }
        ((C3713p0) x42).f40944m.get().a(enumC3664j5);
        return enumC3664j5;
    }

    private final synchronized InterfaceC3553a3 initializeTokenComponentAndRegisterRemoteLogController() {
        C3704o0 c3704o0;
        G6 g62;
        try {
            X4 x42 = component;
            if (x42 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("component");
                x42 = null;
            }
            c3704o0 = new C3704o0(((C3713p0) x42).f40933b, new C3608d3());
            H6 controller = c3704o0.f40894m.get();
            Intrinsics.checkNotNullParameter(controller, "controller");
            WeakReference<G6> weakReference = F6.f39250a;
            if (weakReference != null && (g62 = weakReference.get()) != null) {
                g62.clear();
            }
            F6.f39250a = null;
            C3556a6.f39823a.getClass();
            C3556a6.a.a("RemoteLog: Controller unregistered", true);
            F6.f39250a = new WeakReference<>(controller);
            C3556a6.a.a("RemoteLog: Controller registered", true);
            tokenComponent = c3704o0;
        } catch (Throwable th2) {
            throw th2;
        }
        return c3704o0;
    }

    private final void maybeSendTestCrash() {
        X4 x42 = component;
        if (x42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            x42 = null;
        }
        EnumC3664j5 b10 = ((C3713p0) x42).f40944m.get().b();
        X4 x43 = component;
        if (x43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            x43 = null;
        }
        String packageName = ((C3713p0) x43).f40932a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        if (shouldSendTestCrash(b10, packageName)) {
            X4 x44 = component;
            if (x44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("component");
                x44 = null;
            }
            C3575c5 c3575c5 = ((C3713p0) x44).f40945n.get();
            c3575c5.getClass();
            try {
                X6 crashApi = c3575c5.f39849a;
                Intrinsics.checkNotNullParameter(crashApi, "crashApi");
                crashApi.getClass();
                Intrinsics.checkNotNullParameter("Proguard crash test", "message");
                throw new RuntimeException("Proguard crash test");
            } catch (RuntimeException e10) {
                AbstractC1459k.d(C1483w0.f9135a, null, null, new C3565b5(c3575c5, e10, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r8 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r2.a(r9, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setLinkConfiguration(LinkTokenConfiguration linkTokenConfiguration, Continuation<? super Unit> continuation) {
        Plaid$setLinkConfiguration$1 plaid$setLinkConfiguration$1;
        int i10;
        N2 bVar;
        X4 x42;
        W4 w42;
        Object g10;
        if (continuation instanceof Plaid$setLinkConfiguration$1) {
            plaid$setLinkConfiguration$1 = (Plaid$setLinkConfiguration$1) continuation;
            int i11 = plaid$setLinkConfiguration$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                plaid$setLinkConfiguration$1.label = i11 - Integer.MIN_VALUE;
                Object obj = plaid$setLinkConfiguration$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = plaid$setLinkConfiguration$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (linkTokenConfiguration.getEmbeddedSessionInfo() != null) {
                        bVar = new N2.a(linkTokenConfiguration.getEmbeddedSessionInfo());
                    } else {
                        String uuid = UUID.randomUUID().toString();
                        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                        bVar = new N2.b(uuid, linkTokenConfiguration);
                    }
                    X4 x43 = component;
                    if (x43 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("component");
                        x43 = null;
                    }
                    C3794y1 c3794y1 = ((C3713p0) x43).f40937f.get();
                    plaid$setLinkConfiguration$1.L$0 = linkTokenConfiguration;
                    plaid$setLinkConfiguration$1.label = 1;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    linkTokenConfiguration = (LinkTokenConfiguration) plaid$setLinkConfiguration$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                x42 = component;
                if (x42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    x42 = null;
                }
                w42 = ((C3713p0) x42).f40939h.get();
                boolean noLoadingState = linkTokenConfiguration.getNoLoadingState();
                plaid$setLinkConfiguration$1.L$0 = null;
                plaid$setLinkConfiguration$1.label = 2;
                if (w42.f39741b != null) {
                    w42.f39741b = new S4(noLoadingState);
                }
                g10 = AbstractC1455i.g(C1452g0.b(), new V4(w42, noLoadingState, null), plaid$setLinkConfiguration$1);
                if (g10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    g10 = Unit.INSTANCE;
                }
            }
        }
        plaid$setLinkConfiguration$1 = new Plaid$setLinkConfiguration$1(this, continuation);
        Object obj2 = plaid$setLinkConfiguration$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = plaid$setLinkConfiguration$1.label;
        if (i10 != 0) {
        }
        x42 = component;
        if (x42 == null) {
        }
        w42 = ((C3713p0) x42).f40939h.get();
        boolean noLoadingState2 = linkTokenConfiguration.getNoLoadingState();
        plaid$setLinkConfiguration$1.L$0 = null;
        plaid$setLinkConfiguration$1.label = 2;
        if (w42.f39741b != null) {
        }
        g10 = AbstractC1455i.g(C1452g0.b(), new V4(w42, noLoadingState2, null), plaid$setLinkConfiguration$1);
        if (g10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
    }

    @JvmStatic
    public static final void setLinkEventListener(@NotNull final Function1<? super LinkEvent, Unit> linkEventListener2) {
        Intrinsics.checkNotNullParameter(linkEventListener2, "linkEventListener");
        queueableEventListener = new Function2<LinkEvent, I2, Unit>() { // from class: com.plaid.link.Plaid$setLinkEventListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent, I2 i22) {
                invoke2(linkEvent, i22);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LinkEvent event, @NotNull I2 options) {
                X4 x42;
                Intrinsics.checkNotNullParameter(event, "linkEvent");
                Intrinsics.checkNotNullParameter(options, "options");
                x42 = Plaid.component;
                if (x42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    x42 = null;
                }
                A2 a22 = ((C3713p0) x42).f40941j.get();
                if (options instanceof I2.a) {
                    a22.a(event, ((I2.a) options).f39291a);
                    return;
                }
                if (Intrinsics.areEqual(options, I2.b.f39292a)) {
                    a22.a(event);
                    return;
                }
                if (!Intrinsics.areEqual(options, I2.c.f39293a)) {
                    a22.a(event, 0);
                    return;
                }
                a22.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                a22.a(event);
                a22.b(null);
            }
        };
        linkEventListener = new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid$setLinkEventListener$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent) {
                invoke2(linkEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LinkEvent event) {
                X4 x42;
                Intrinsics.checkNotNullParameter(event, "event");
                x42 = Plaid.component;
                if (x42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    x42 = null;
                }
                ((C3713p0) x42).f40945n.get().a(new C3618e4(event.getMetadata().toMap(), event.getEventName().getJson()));
                linkEventListener2.invoke(event);
            }
        };
    }

    private final void setPlogLevel(V3 logLevel) {
        C3556a6.a aVar = C3556a6.f39823a;
        Plaid$setPlogLevel$1 plaid$setPlogLevel$1 = new Function3<Integer, String, String, Unit>() { // from class: com.plaid.link.Plaid$setPlogLevel$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, String str2) {
                invoke(num.intValue(), str, str2);
                return Unit.INSTANCE;
            }

            public final void invoke(int i10, @Nullable String str, @NotNull String message) {
                X4 x42;
                Intrinsics.checkNotNullParameter(message, "message");
                x42 = Plaid.component;
                if (x42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    x42 = null;
                }
                C3575c5 c3575c5 = ((C3713p0) x42).f40945n.get();
                if (str == null) {
                    str = "";
                }
                c3575c5.a(new A1(message, MapsKt.mapOf(TuplesKt.to("tag", str)), i10));
            }
        };
        aVar.getClass();
        Intrinsics.checkNotNullParameter(logLevel, "priority");
        C3556a6.f39824b = new P(logLevel, plaid$setPlogLevel$1);
    }

    private final boolean shouldSendTestCrash(EnumC3664j5 plaidEnvironment, String packageName) {
        return plaidEnvironment == EnumC3664j5.SANDBOX && StringsKt.startsWith$default(packageName, "com.plaid.", false, 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitPreload$link_sdk_release(@NotNull Continuation<? super Unit> continuation) {
        Plaid$awaitPreload$1 plaid$awaitPreload$1;
        int i10;
        if (continuation instanceof Plaid$awaitPreload$1) {
            plaid$awaitPreload$1 = (Plaid$awaitPreload$1) continuation;
            int i11 = plaid$awaitPreload$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                plaid$awaitPreload$1.label = i11 - Integer.MIN_VALUE;
                Object obj = plaid$awaitPreload$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = plaid$awaitPreload$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C0 c02 = preloadLinkJob;
                    if (c02 != null && !c02.isCompleted()) {
                        plaid$awaitPreload$1.L$0 = this;
                        plaid$awaitPreload$1.label = 1;
                        if (c02.join(plaid$awaitPreload$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                preloadLinkJob = null;
                return Unit.INSTANCE;
            }
        }
        plaid$awaitPreload$1 = new Plaid$awaitPreload$1(this, continuation);
        Object obj2 = plaid$awaitPreload$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = plaid$awaitPreload$1.label;
        if (i10 != 0) {
        }
        preloadLinkJob = null;
        return Unit.INSTANCE;
    }

    public final void createWithoutPreload$link_sdk_release(@NotNull Application application, @NotNull LinkTokenConfiguration linkTokenConfiguration) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(linkTokenConfiguration, "linkTokenConfiguration");
        initializeAndCheckPrerequisites(application, linkTokenConfiguration);
        initializeTokenComponentAndRegisterRemoteLogController();
        Map metadata = MapsKt.mapOf(TuplesKt.to("linkToken", linkTokenConfiguration.getToken()), TuplesKt.to("logLevel", linkTokenConfiguration.getLogLevel().name()), TuplesKt.to("noLoadingState", String.valueOf(linkTokenConfiguration.getNoLoadingState())));
        Intrinsics.checkNotNullParameter("SDK Create", "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        F6.a.a("SDK Create", metadata, J6.INFO);
        AbstractC1457j.b(null, new Plaid$createWithoutPreload$1(linkTokenConfiguration, null), 1, null);
        maybeSendTestCrash();
    }

    public final synchronized void destroy() {
        G6 g62;
        try {
            if (isCreated.get()) {
                X4 x42 = component;
                if (x42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    x42 = null;
                }
                ((C3713p0) x42).f40946o.get().a();
                WeakReference<G6> weakReference = F6.f39250a;
                if (weakReference != null && (g62 = weakReference.get()) != null) {
                    g62.clear();
                }
                F6.f39250a = null;
                C3556a6.f39823a.getClass();
                C3556a6.a.a("RemoteLog: Controller unregistered", true);
                tokenComponent = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final Function1<LinkEvent, Unit> getCustomerFacingLinkEventListenerInternal$link_sdk_release() {
        return new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid$getCustomerFacingLinkEventListenerInternal$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent) {
                invoke2(linkEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LinkEvent event) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(event, "event");
                F6.a.b(MapsKt.emptyMap(), "SDK delivering event to listener: " + event.getEventName());
                function1 = Plaid.linkEventListener;
                function1.invoke(event);
            }
        };
    }

    @Nullable
    public final Function2<LinkEvent, I2, Unit> getLinkEventListenerInternal$link_sdk_release() {
        return queueableEventListener;
    }

    @NotNull
    public final AtomicBoolean isCreated$link_sdk_release() {
        return isCreated;
    }

    public final boolean openLinkInternal$link_sdk_release(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = LinkActivity.f40774e;
        Intrinsics.checkNotNullParameter(activity, "context");
        INSTANCE.trackSdkOpen$link_sdk_release();
        Intent intent = new Intent(activity, (Class<?>) LinkActivity.class);
        intent.setFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        activity.startActivityForResult(intent, 3364);
        return true;
    }

    public final void preloadLink$link_sdk_release(@Nullable OnLoadCallback onLoad) {
        C0 d10;
        C3556a6.f39823a.getClass();
        C3556a6.a.a("Preload is called", true);
        C0 c02 = preloadLinkJob;
        if (c02 != null && c02.isActive()) {
            C3556a6.a.a("Requesting cancel on previous preload job", true);
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(C1483w0.f9135a, C1452g0.b(), null, new Plaid$preloadLink$2(onLoad, null), 2, null);
        preloadLinkJob = d10;
    }

    @NotNull
    public final InterfaceC3553a3 provideLinkTokenComponent$link_sdk_release(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        initialize(application);
        return getOrCreateTokenComponent();
    }

    public final void setCreated$link_sdk_release(@NotNull AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        isCreated = atomicBoolean;
    }

    public final void setLinkResultAndFinish$link_sdk_release(@NotNull Activity activity, int resultCode, @NotNull Parcelable data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(data, "data");
        String str = resultCode != 6148 ? resultCode != 96171 ? "UNKNOWN" : "SUCCESS" : "EXIT";
        C3556a6.a.a(C3556a6.f39823a, "link result delivered: " + str);
        F6.a.b(MapsKt.mapOf(TuplesKt.to("linkResult", str)), "Link result delivered: " + str);
        drainLinkEventQueue();
        Intent intent = new Intent();
        intent.putExtra("link_result", data);
        activity.setResult(resultCode, intent);
        activity.finish();
        destroy();
    }

    public final void submitInternal$link_sdk_release(@NotNull SubmissionData submissionData) {
        Intrinsics.checkNotNullParameter(submissionData, "submissionData");
        AbstractC1459k.d(C1483w0.f9135a, C1452g0.c(), null, new Plaid$submitInternal$1(submissionData, null), 2, null);
    }

    public final void trackSdkOpen$link_sdk_release() {
        InterfaceC3553a3 interfaceC3553a3 = tokenComponent;
        C3787x3 c3787x3 = interfaceC3553a3 != null ? ((C3704o0) interfaceC3553a3).f40885d.get() : null;
        if (c3787x3 == null) {
            C3556a6.a.b(C3556a6.f39823a, "Cannot log open event LinkWorkflowAnalytics is null");
        } else {
            AbstractC1459k.d(C1483w0.f9135a, C1452g0.b(), null, new Plaid$trackSdkOpen$1(c3787x3, null), 2, null);
        }
    }

    @JvmStatic
    @NotNull
    public static final PlaidHandler create(@NotNull Application application, @NotNull LinkTokenConfiguration linkTokenConfiguration, @Nullable OnLoadCallback onLoad) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(linkTokenConfiguration, "linkTokenConfiguration");
        Plaid plaid = INSTANCE;
        plaid.createWithoutPreload$link_sdk_release(application, linkTokenConfiguration);
        plaid.preloadLink$link_sdk_release(onLoad);
        return new PlaidHandler();
    }

    public final boolean openLinkInternal$link_sdk_release(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        int i10 = LinkActivity.f40774e;
        Context context = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.trackSdkOpen$link_sdk_release();
        Intent intent = new Intent(context, (Class<?>) LinkActivity.class);
        intent.setFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        fragment.startActivityForResult(intent, 3364);
        return true;
    }

    @JvmStatic
    @NotNull
    public static final View createLinkEmbeddedView(@NotNull Context context, @NotNull LinkTokenConfiguration config, @NotNull Function1<? super LinkTokenConfiguration, Unit> successCallback, @NotNull Function1<? super LinkExit, Unit> failureCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        Plaid plaid = INSTANCE;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        plaid.initializeAndCheckPrerequisites((Application) applicationContext, config);
        Q0 q02 = new Q0(context, config, null, successCallback, failureCallback);
        q02.a();
        return q02.f39556f;
    }
}
