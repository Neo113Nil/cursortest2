package ru.ozon.composer.debug.menu.api.ui;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AbstractC5051a;
import androidx.appcompat.app.g;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.A0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import o00.C8624a;
import o00.InterfaceC8626c;
import org.jetbrains.annotations.NotNull;
import p00.C8829e;
import ru.ozon.app.android.R;
import u00.l;
import v00.f;
import w00.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/composer/debug/menu/api/ui/ComposerDebugMenuActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "composer-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposerDebugMenuActivity extends g {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final y0 f94784h = new y0(N.b(v00.g.class), new a(), new c(), new b());

    public static final class a extends AbstractC7737t implements Function0<A0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ComposerDebugMenuActivity.this.getViewModelStore();
        }
    }

    public static final class b extends AbstractC7737t implements Function0<AbstractC6409a> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return ComposerDebugMenuActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    static final class c extends AbstractC7737t implements Function0<z0.b> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            int i11 = C8624a.f77454b;
            Application application = ComposerDebugMenuActivity.this.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            InterfaceC8626c a11 = C8624a.a(application);
            Intrinsics.f(a11);
            return e.a(a11.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        setContentView(R.layout.composer_ozon_debug_menu_activity);
        AbstractC5051a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s("Composer debug menu");
        }
        Intent intent = getIntent();
        String queryParameter = (intent == null || (data = intent.getData()) == null) ? null : data.getQueryParameter("token");
        if (queryParameter == null) {
            G supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            Q p11 = supportFragmentManager.p();
            Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction()");
            Bundle bundle2 = new Bundle();
            l lVar = new l();
            lVar.setArguments(bundle2);
            p11.r(R.id.container, lVar, null);
            p11.i();
            return;
        }
        ((v00.g) this.f94784h.getValue()).g0(C8829e.f80013b, queryParameter);
        G supportFragmentManager2 = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
        Q p12 = supportFragmentManager2.p();
        Intrinsics.checkNotNullExpressionValue(p12, "beginTransaction()");
        Bundle bundle3 = new Bundle();
        f fVar = new f();
        fVar.setArguments(bundle3);
        p12.r(R.id.container, fVar, null);
        p12.i();
    }
}
