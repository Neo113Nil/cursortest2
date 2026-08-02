package com.vk.avatarchange;

import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import xsna.br5;
import xsna.dhr0;
import xsna.gq5;
import xsna.iq5;
import xsna.j5g;
import xsna.wxl0;

/* compiled from: AvatarChangeActivity.kt */
/* loaded from: classes15.dex */
public final class AvatarChangeActivity extends VKActivity implements gq5 {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public final UiTracker.a v;
    public final RectF w;
    public UserId x;
    public String y;
    public String z;

    public AvatarChangeActivity() {
        UiTracker uiTracker = UiTracker.a;
        this.v = UiTracker.f(this);
        this.w = new RectF();
        this.x = UserId.d;
        this.y = "";
        this.z = "";
    }

    @Override // xsna.gq5
    public final void E0(float f, float f2, float f3, float f4, int i, int i2) {
        Fragment H = getSupportFragmentManager().H(iq5.class.getName());
        if (H == null) {
            H = new iq5();
        }
        Bundle bundle = new Bundle();
        bundle.putString(X3.i.b, this.z);
        bundle.putFloat(TtmlNode.LEFT, f);
        bundle.putFloat("top", f2);
        bundle.putFloat(TtmlNode.RIGHT, f3);
        bundle.putFloat("bottom", f4);
        bundle.putInt("width", i);
        bundle.putInt("height", i2);
        bundle.putParcelable("uid", this.x);
        bundle.putBoolean("skip_avatar_publish", this.C);
        H.setArguments(bundle);
        U1(H, true);
    }

    public final void T1() {
        Intent putExtra = new Intent().putExtra("post", this.A).putExtra("story", this.B);
        RectF rectF = this.w;
        setResult(-1, putExtra.putExtra(TtmlNode.LEFT, rectF.left).putExtra("top", rectF.top).putExtra(TtmlNode.RIGHT, rectF.right).putExtra("bottom", rectF.bottom).putExtra("width", this.E).putExtra("height", this.F).putExtra(X3.i.b, this.z));
        finish();
    }

    public final void U1(Fragment fragment, boolean z) {
        Fragment fragment2 = (Fragment) j5g.a0(getSupportFragmentManager().c.f());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.g(R.id.avatar_change_fragment_container, fragment, null);
        if (z) {
            aVar.d(null);
        }
        aVar.k(false);
        this.v.a(fragment2, fragment, true);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 2) {
            if (intent != null) {
                int intExtra = intent.getIntExtra("task_id", 0);
                wxl0 wxl0Var = wxl0.b;
                wxl0.j = intExtra;
            }
            T1();
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(dhr0.C().c);
        super.onCreate(bundle);
        getWindow().setStatusBarColor(-16777216);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.avatar_change_fragment_container);
        setContentView(frameLayout);
        String stringExtra = getIntent().getStringExtra(X3.i.b);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.z = stringExtra;
        UserId userId = (UserId) getIntent().getParcelableExtra("thumb_uid");
        if (userId == null) {
            userId = UserId.d;
        }
        this.x = userId;
        this.C = getIntent().getBooleanExtra("skip_avatar_publish", false);
        this.D = getIntent().getIntExtra("subtitle_res", 0);
        String stringExtra2 = getIntent().getStringExtra("username");
        this.y = stringExtra2 != null ? stringExtra2 : "";
        Fragment H = getSupportFragmentManager().H(AvatarChangeCropFragment.class.getName());
        if (H == null) {
            H = new AvatarChangeCropFragment();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(X3.i.b, this.z);
        bundle2.putString("username", this.y);
        bundle2.putBoolean("skip_avatar_publish", this.C);
        bundle2.putInt("subtitle_res", this.D);
        H.setArguments(bundle2);
        U1(H, false);
    }

    @Override // xsna.gq5
    public final void r0(boolean z, boolean z2, br5 br5Var) {
        this.w.set(br5Var.c, br5Var.d, br5Var.e, br5Var.f);
        this.A = z;
        this.B = z2;
        this.E = br5Var.a;
        this.F = br5Var.b;
        T1();
    }
}
