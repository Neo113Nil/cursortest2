package ru.ozon.android.inAppUpdate.internal.ui.blocking;

import Sc.k;
import Sc.n;
import Sc.o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ActivityC5043j;
import androidx.activity.C;
import androidx.activity.J;
import androidx.activity.L;
import androidx.activity.t;
import androidx.core.view.Y;
import androidx.lifecycle.A0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import hj.C6960a;
import ij.C7084a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import oj.C8744a;
import org.jetbrains.annotations.NotNull;
import pj.C8938a;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.c;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.i;
import ru.ozon.android.inAppUpdate.internal.ui.g;
import ru.ozon.app.android.R;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/android/inAppUpdate/internal/ui/blocking/OzonInAppUpdateSdkBlockingActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "a", "in-app-update-sdk_googlePlayStoreRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OzonInAppUpdateSdkBlockingActivity extends androidx.appcompat.app.g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f83828j = 0;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final y0 f83829h = new y0(N.b(j.class), new e(), new d(), new f());

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f83830i;

    public static final class a {
        @NotNull
        public static Intent a(@NotNull ActivityC5043j context, @NotNull ru.ozon.android.inAppUpdate.internal.ui.g config) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Intent intent = new Intent(context, (Class<?>) OzonInAppUpdateSdkBlockingActivity.class);
            intent.putExtra("ru.ozon.android.inAppUpdate.internal.ui.blocking.CONFIG_KEY", config);
            return intent;
        }
    }

    static final class b extends AbstractC7737t implements Function1<C, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C c11) {
            C addCallback = c11;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            OzonInAppUpdateSdkBlockingActivity.this.finishAffinity();
            return Unit.f71690a;
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<ru.ozon.android.inAppUpdate.internal.ui.blocking.c, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.android.inAppUpdate.internal.ui.blocking.c cVar) {
            ru.ozon.android.inAppUpdate.internal.ui.blocking.c p02 = cVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((j) this.receiver).i0(p02);
            return Unit.f71690a;
        }
    }

    public static final class d extends AbstractC7737t implements Function0<z0.b> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return OzonInAppUpdateSdkBlockingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<A0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return OzonInAppUpdateSdkBlockingActivity.this.getViewModelStore();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<AbstractC6409a> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return OzonInAppUpdateSdkBlockingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    static final class g extends AbstractC7737t implements Function0<ru.ozon.android.inAppUpdate.internal.ui.blocking.b> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.inAppUpdate.internal.ui.blocking.b invoke() {
            return new ru.ozon.android.inAppUpdate.internal.ui.blocking.b(OzonInAppUpdateSdkBlockingActivity.this);
        }
    }

    public OzonInAppUpdateSdkBlockingActivity() {
        g initializer = new g();
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f83830i = k.a(n.NONE, initializer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final ru.ozon.android.inAppUpdate.internal.ui.blocking.b J(OzonInAppUpdateSdkBlockingActivity ozonInAppUpdateSdkBlockingActivity) {
        return (ru.ozon.android.inAppUpdate.internal.ui.blocking.b) ozonInAppUpdateSdkBlockingActivity.f83830i.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r5.canRequestPackageInstalls() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void L(OzonInAppUpdateSdkBlockingActivity ozonInAppUpdateSdkBlockingActivity, i iVar) {
        ozonInAppUpdateSdkBlockingActivity.getClass();
        int i11 = C8938a.f81237c;
        C8938a.b("OzonInAppUpdateSdkBlockingActivity.handleCommand: " + iVar);
        if (!(iVar instanceof i.b)) {
            if (Intrinsics.d(iVar, i.e.f83879a)) {
                if (!C6960a.a().d(ozonInAppUpdateSdkBlockingActivity, ozonInAppUpdateSdkBlockingActivity.M().getF83885f())) {
                    ozonInAppUpdateSdkBlockingActivity.M().i0(new c.C1448c(false));
                    return;
                }
                C7084a a11 = C6960a.a();
                Context applicationContext = ozonInAppUpdateSdkBlockingActivity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                a11.h(applicationContext, new ru.ozon.android.inAppUpdate.internal.ui.blocking.d(ozonInAppUpdateSdkBlockingActivity));
                return;
            }
            if (Intrinsics.d(iVar, i.a.f83875a)) {
                C6960a.a().a(ozonInAppUpdateSdkBlockingActivity);
                return;
            }
            if (Intrinsics.d(iVar, i.c.f83877a)) {
                jj.c.d(ozonInAppUpdateSdkBlockingActivity, ozonInAppUpdateSdkBlockingActivity.M().getF83885f(), ozonInAppUpdateSdkBlockingActivity.M().getF83885f().c().a());
                return;
            } else {
                if (!Intrinsics.d(iVar, i.d.f83878a)) {
                    throw new o();
                }
                C7084a a12 = C6960a.a();
                Context applicationContext2 = ozonInAppUpdateSdkBlockingActivity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                a12.h(applicationContext2, new ru.ozon.android.inAppUpdate.internal.ui.blocking.e(ozonInAppUpdateSdkBlockingActivity));
                return;
            }
        }
        g.c d11 = ozonInAppUpdateSdkBlockingActivity.M().getF83885f().d();
        Set set = lj.c.f73375c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (androidx.core.content.a.checkSelfPermission(ozonInAppUpdateSdkBlockingActivity, (String) obj) != 0) {
                arrayList.add(obj);
            }
        }
        List list = arrayList;
        if (Build.VERSION.SDK_INT >= 30) {
            list = null;
        }
        if (list == null) {
            list = K.f71697a;
        }
        if (!list.isEmpty() || d11 != g.c.GOOGLE_PLAY_STORE) {
            if (list.isEmpty() && d11 == g.c.OTHER_STORE) {
                int i12 = lj.c.f73376d;
                PackageManager packageManager = ozonInAppUpdateSdkBlockingActivity.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
                Intrinsics.checkNotNullParameter(packageManager, "packageManager");
                try {
                } catch (Exception e11) {
                    int i13 = C8938a.f81237c;
                    C8938a.c(null, e11);
                }
            }
            new C8744a().show(ozonInAppUpdateSdkBlockingActivity.getSupportFragmentManager(), "ru.ozon.android.inAppUpdate.internal.ui.blocking.permission.OzonInAppUpdateBlockingPermissionBottomSheetFragment");
            return;
        }
        ozonInAppUpdateSdkBlockingActivity.M().i0(new c.e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j M() {
        return (j) this.f83829h.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        t.a(this);
        super.onCreate(bundle);
        J onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        L.a(onBackPressedDispatcher, this, new b(), 2);
        setContentView(R.layout.in_app_update_blocking_activity);
        Y.J(findViewById(R.id.in_app_update_blocking_activity_root), new D3.g());
        ((ru.ozon.android.inAppUpdate.internal.ui.blocking.b) this.f83830i.getValue()).d(new c(1, M(), j.class, "onAction", "onAction$in_app_update_sdk_googlePlayStoreRelease(Lru/ozon/android/inAppUpdate/internal/ui/blocking/OzonInAppUpdateSdkBlockingAction;)V", 0));
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new ru.ozon.android.inAppUpdate.internal.ui.blocking.g(this, null), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new h(this, null), 3);
        int e11 = C6960a.a().e(this);
        if (e11 == 1 || e11 == 2 || e11 == 4) {
            M().i0(c.b.f83861a);
            int i11 = C8938a.f81237c;
            C8938a.b("OzonInAppUpdateSdkBlockingActivity: download in progress");
        } else if (e11 == 8) {
            M().i0(new c.C1448c(true));
            int i12 = C8938a.f81237c;
            C8938a.b("OzonInAppUpdateSdkBlockingActivity: download completed");
        } else if (e11 == 16) {
            M().i0(new c.C1448c(false));
            int i13 = C8938a.f81237c;
            C8938a.b("OzonInAppUpdateSdkBlockingActivity: download failed");
        }
        C6960a.b().c(this, new ru.ozon.android.inAppUpdate.internal.ui.blocking.f(this));
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    protected final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
