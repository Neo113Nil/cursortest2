package ru.ozon.android.ozonLogger.android.debug;

import D40.c;
import android.os.Bundle;
import androidx.activity.C;
import androidx.activity.t;
import androidx.core.view.Y;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import tj.e;
import tj.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/ozonLogger/android/debug/OzonLoggerDebugActivity;", "Landroidx/fragment/app/r;", "<init>", "()V", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OzonLoggerDebugActivity extends r {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f92032h = 0;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            OzonLoggerDebugActivity ozonLoggerDebugActivity = OzonLoggerDebugActivity.this;
            G supportFragmentManager = ozonLoggerDebugActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            int i11 = OzonLoggerDebugActivity.f92032h;
            ozonLoggerDebugActivity.getClass();
            if (supportFragmentManager.l0() > 1) {
                supportFragmentManager.P0();
            } else {
                ozonLoggerDebugActivity.finish();
            }
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        t.a(this);
        super.onCreate(bundle);
        setRequestedOrientation(3);
        setContentView(R.layout.ozon_logger_android_debug_activity);
        Y.J(findViewById(R.id.container), new c());
        if (bundle == null) {
            G supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            f.a(supportFragmentManager, new e());
        }
        getOnBackPressedDispatcher().h(this, new a());
    }
}
