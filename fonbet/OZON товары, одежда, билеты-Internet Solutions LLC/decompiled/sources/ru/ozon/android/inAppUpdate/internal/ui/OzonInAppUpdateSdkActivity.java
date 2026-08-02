package ru.ozon.android.inAppUpdate.internal.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.t;
import androidx.lifecycle.A0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import hj.C6960a;
import ij.C7084a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import mj.C8343b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.inAppUpdate.internal.network.CheckUpdateResponseDTO;
import ru.ozon.android.inAppUpdate.internal.ui.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/android/inAppUpdate/internal/ui/OzonInAppUpdateSdkActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "a", "in-app-update-sdk_googlePlayStoreRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OzonInAppUpdateSdkActivity extends androidx.appcompat.app.g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f83815i = 0;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final y0 f83816h = new y0(N.b(C8343b.class), new d(), new c(), new e());

    public static final class a {
        @NotNull
        public static Intent a(@NotNull Context context, @NotNull g config) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Intent intent = new Intent(context, (Class<?>) OzonInAppUpdateSdkActivity.class);
            intent.putExtra("ru.ozon.android.inAppUpdate.internal.ui.CONFIG_KEY", config);
            return intent;
        }
    }

    static final class b extends AbstractC7737t implements Function1<Boolean, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f83818c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(1);
            this.f83818c = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                int i11 = OzonInAppUpdateSdkActivity.f83815i;
                OzonInAppUpdateSdkActivity ozonInAppUpdateSdkActivity = OzonInAppUpdateSdkActivity.this;
                Context applicationContext = ozonInAppUpdateSdkActivity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                Context context = ozonInAppUpdateSdkActivity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
                g gVar = this.f83818c;
                CheckUpdateResponseDTO response = gVar.c().a();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(response, "response");
                Intent a11 = a.a(applicationContext, g.a(gVar, new e.c(response)));
                a11.setFlags(268435456);
                ozonInAppUpdateSdkActivity.startActivity(a11);
            }
            return Unit.f71690a;
        }
    }

    public static final class c extends AbstractC7737t implements Function0<z0.b> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return OzonInAppUpdateSdkActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<A0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return OzonInAppUpdateSdkActivity.this.getViewModelStore();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<AbstractC6409a> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return OzonInAppUpdateSdkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final void J(@NotNull g config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (C6960a.a().d(this, config)) {
            C7084a a11 = C6960a.a();
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            a11.h(applicationContext, new b(config));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        t.a(this);
        super.onCreate(bundle);
        g config = ((C8343b) this.f83816h.getValue()).getF76003a();
        if (config == null) {
            finish();
            return;
        }
        ru.ozon.android.inAppUpdate.internal.ui.e c11 = config.c();
        if ((c11 instanceof e.d) || (c11 instanceof e.C1451e)) {
            C6960a.b().c(this, new f(this, config));
        }
        Intrinsics.checkNotNullParameter(config, "config");
        ru.ozon.android.inAppUpdate.internal.ui.a aVar = new ru.ozon.android.inAppUpdate.internal.ui.a();
        aVar.setArguments(androidx.core.os.d.b(new Pair("ru.ozon.android.inAppUpdate.internal.ui.CONFIG_KEY", config)));
        aVar.show(getSupportFragmentManager(), "ru.ozon.apkInstaller.internal.ui.download.InAppUpdateDownloadBottomSheetFragment");
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    protected final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
