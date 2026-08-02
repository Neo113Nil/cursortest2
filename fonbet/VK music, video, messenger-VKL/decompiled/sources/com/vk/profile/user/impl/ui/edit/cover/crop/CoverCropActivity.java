package com.vk.profile.user.impl.ui.edit.cover.crop;

import android.content.Intent;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vkontakte.android.VKActivity;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fpf0;
import xsna.gzs;
import xsna.iut0;
import xsna.jai;
import xsna.k7m;
import xsna.kai;
import xsna.lyd0;
import xsna.m7m;
import xsna.oqx0;
import xsna.ppx0;
import xsna.r1k;
import xsna.rrv0;
import xsna.s3q0;
import xsna.v8i;
import xsna.w1k;
import xsna.x1k;

/* compiled from: CoverCropActivity.kt */
/* loaded from: classes5.dex */
public final class CoverCropActivity extends VKActivity {
    public static final /* synthetic */ int w = 0;
    public lyd0 v;

    /* compiled from: CoverCropActivity.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            CoverCropActivity coverCropActivity = (CoverCropActivity) this.receiver;
            int i = CoverCropActivity.w;
            coverCropActivity.setResult(0);
            coverCropActivity.finish();
            return s3q0.a;
        }
    }

    public final void T1(String str, String str2, RectF rectF, lyd0 lyd0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1934900621);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.y(rectF) ? 256 : 128) | (M.y(lyd0Var) ? 2048 : 1024) | (M.y(this) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (b.d()) {
                b.f(-1934900621, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity.Content (CoverCropActivity.kt:134)");
            }
            rrv0.e(true, null, null, null, null, null, kai.c(-261200016, new w1k(str2, str, rectF, lyd0Var, this), M), M, 1572870, 62);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new x1k(this, str, str2, rectF, lyd0Var, i, 0);
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("__cover_url_key__") : null;
        if (stringExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Intent intent2 = getIntent();
        String stringExtra2 = intent2 != null ? intent2.getStringExtra("__avatar_url_key__") : null;
        Intent intent3 = getIntent();
        RectF rectF = intent3 != null ? (RectF) intent3.getParcelableExtra("__avatar_rect_key__") : null;
        this.v = ((UserProfileComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(UserProfileComponent.class))).mc();
        v8i.a(this, new jai(1592716729, new r1k(this, stringExtra, stringExtra2, rectF, 0), true));
        ppx0.b(getWindow(), false);
        getWindow().addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
            getWindow().setStatusBarContrastEnforced(false);
        }
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        oqx0 i = iut0.i(getWindow().getDecorView());
        if (i != null) {
            i.b(false);
            i.a(false);
        }
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-8193));
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-17));
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        setRequestedOrientation(!this.q ? 1 : 14);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        setRequestedOrientation(-1);
        super.onStop();
    }
}
