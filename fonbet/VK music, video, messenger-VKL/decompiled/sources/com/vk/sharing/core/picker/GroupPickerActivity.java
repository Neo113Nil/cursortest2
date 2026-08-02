package com.vk.sharing.core.picker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.pushes.PushAwareActivity;
import com.vk.sharing.api.dto.GroupPickerInfo;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.picker.a;
import com.vk.sharing.core.target.Targets;
import com.vkontakte.android.activities.LogoutReceiver;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.akh;
import xsna.dcj0;
import xsna.dhr0;
import xsna.hdm;
import xsna.k6k;
import xsna.l4o0;
import xsna.m0q0;
import xsna.mnh0;
import xsna.msy;
import xsna.odm;
import xsna.p4g;
import xsna.xlu;

/* compiled from: GroupPickerActivity.kt */
/* loaded from: classes5.dex */
public class GroupPickerActivity extends PushAwareActivity implements a.InterfaceC1780a, l4o0.b, m0q0 {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public Intent B;
    public GroupPickerInfo C = new GroupPickerInfo();
    public final Object D;
    public final Object E;
    public final Object F;
    public LogoutReceiver v;
    public com.vk.sharing.core.picker.a w;
    public xlu x;
    public Targets y;
    public l4o0 z;

    /* compiled from: GroupPickerActivity.kt */
    public static final class a {
        public l4o0 a;
    }

    public GroupPickerActivity() {
        k6k k6kVar = new k6k(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.D = msy.a(lazyThreadSafetyMode, k6kVar);
        this.E = msy.a(lazyThreadSafetyMode, new odm(this, 12));
        this.F = msy.a(lazyThreadSafetyMode, new akh(this, 22));
    }

    public final void T1(List<Target> list) {
        if (this.B == null) {
            this.B = new Intent();
        }
        this.B.putParcelableArrayListExtra("result_multiple_targets", p4g.q(list));
        this.A = true;
    }

    public final void U1(Target target) {
        if (this.B == null) {
            this.B = new Intent();
        }
        this.B.putExtra("result_target", target);
        this.A = true;
    }

    @Override // xsna.l4o0.b
    public final void Z(ArrayList<Target> arrayList) {
        this.w.Z(arrayList);
    }

    @Override // xsna.l4o0.b
    public final void c0() {
        this.w.c0();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.fade_out);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        this.x.getPresenter().h2();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        Window window = getWindow();
        if (getIntent().getBooleanExtra("fullscreen", false)) {
            window.getDecorView().setSystemUiVisibility(4);
        }
        GroupPickerInfo groupPickerInfo = (GroupPickerInfo) getIntent().getParcelableExtra("picker_info");
        this.C = groupPickerInfo;
        setTheme((!dhr0.C().b || groupPickerInfo.n) ? com.vkontakte.android.R.style.Theme_App_TransparentMilkDark : com.vkontakte.android.R.style.Theme_App_TransparentMilk);
        if (this.C.m) {
            mnh0.w(window.getDecorView(), dhr0.C().b);
        }
        if (this.C.r != 0) {
            window.setDimAmount(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.C.n) {
            dhr0.u0(getWindow(), NavigationBarStyle.DARK);
        } else {
            dhr0.r0(this);
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setId(com.vkontakte.android.R.id.fragment_wrapper);
        xlu xluVar = new xlu(this);
        this.x = xluVar;
        frameLayout.addView(xluVar);
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        a aVar = (a) getLastCustomNonConfigurationInstance();
        this.z = aVar == null ? new l4o0(false, (dcj0) this.E.getValue(), (hdm) this.F.getValue()) : aVar.a;
        if (bundle == null) {
            int intExtra = getIntent().getIntExtra(X3.a.t, 3);
            this.y = new Targets();
            this.w = intExtra != 1 ? intExtra != 2 ? intExtra != 3 ? new b(this) : new b(this) : new d(this) : new c(this);
        } else {
            this.y = (Targets) bundle.getParcelable("STATE_TARGETS");
            int i = bundle.getInt("STATE_DELEGATE");
            this.w = i != 1 ? i != 2 ? i != 3 ? new b(this) : new b(this) : new d(this) : new c(this);
        }
        this.x.setPresenter(this.w);
        this.z.h = this;
        this.r = false;
        new IntentFilter().addAction("com.vkontakte.android.ACTION_SHARING_ERROR_STATUS");
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.z.h = null;
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity
    public final Object onRetainCustomNonConfigurationInstance() {
        a aVar = new a();
        aVar.a = this.z;
        return aVar;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("STATE_TARGETS", this.y);
        Class<?> cls = this.w.getClass();
        bundle.putInt("STATE_DELEGATE", c.class.equals(cls) ? 1 : d.class.equals(cls) ? 2 : 3);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.vk.pushes.PushAwareActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.v = LogoutReceiver.a(this);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        this.v.b();
        this.v = null;
        super.onStop();
    }

    @Override // xsna.m0q0
    @SuppressLint({"MissingSuperCall"})
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.w.getClass();
    }

    @Override // xsna.l4o0.b
    public final void b1() {
    }

    @Override // xsna.l4o0.b
    public final void o0() {
    }

    @Override // xsna.l4o0.b
    public final void P(ArrayList<Target> arrayList) {
    }

    @Override // xsna.l4o0.b
    public final void n1(ArrayList<Target> arrayList) {
    }

    @Override // xsna.l4o0.b
    public final void v(ArrayList<Target> arrayList, boolean z) {
    }
}
