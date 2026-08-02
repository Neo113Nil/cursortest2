package com.vk.superapp.qr.web2app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.Pair;
import xsna.dhr0;
import xsna.e370;
import xsna.fnj;
import xsna.fpf0;
import xsna.gfx0;
import xsna.iah0;
import xsna.krv0;
import xsna.krz;
import xsna.m7m;
import xsna.yfb;

/* compiled from: QrWebToAppActivity.kt */
/* loaded from: classes6.dex */
public final class QrWebToAppActivity extends FragmentActivity {
    public static final /* synthetic */ int f = 0;

    public final void O1(Intent intent) {
        if (intent == null) {
            finish();
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("uri");
        if (uri == null) {
            finish();
            return;
        }
        intent.removeExtra("uri");
        krz krzVar = new krz();
        krzVar.setArguments(yfb.b(new Pair("uri_key", uri)));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f(0, krzVar, "LoaderFragment", 1);
        aVar.k(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        TypedValue typedValue = krv0.a;
        dhr0 dhr0Var = krv0.b;
        if (dhr0Var != null) {
            dhr0Var.k(this);
        }
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        setTheme(dhr0.M() ? R.style.VkSuperappkit_Dark_Transparent : R.style.VkSuperappkit_Light_Transparent);
        HashSet hashSet = iah0.a;
        if (!fnj.d(this)) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        O1(getIntent());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ((QrWebToAppComponent) m7m.a(this).a(fpf0.a(QrWebToAppComponent.class))).getHandler().b();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        O1(intent);
    }
}
