package com.vk.libvideo;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import xsna.fuj0;
import xsna.jfy;
import xsna.kyr0;
import xsna.o0q0;
import xsna.tb0;
import xsna.tk5;

/* compiled from: VideoWrapperActivity.kt */
/* loaded from: classes17.dex */
public final class VideoWrapperActivity extends NavigationDelegateActivity implements fuj0, o0q0, kyr0 {
    public LinkedList<WeakReference<tb0>> w;
    public jfy x;
    public Fragment y;

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void Li(tb0 tb0Var) {
        if (this.w == null) {
            this.w = new LinkedList<>();
        }
        LinkedList<WeakReference<tb0>> linkedList = this.w;
        if (linkedList != null) {
            linkedList.add(new WeakReference<>(tb0Var));
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, android.app.Activity
    public final void finish() {
        super.finish();
        if (getIntent().getBooleanExtra("fragment_use_slide_animation", false)) {
            overridePendingTransition(R.anim.clip_feed_in2, R.anim.clip_feed_out2);
        } else {
            overridePendingTransition(0, getIntent().getIntExtra("fragment_exit_anim", 0));
        }
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = super.getTheme();
        theme.applyStyle(R.style.VideoPlayerTranslucentStyle, true);
        return theme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        Fragment fragment = this.y;
        if (fragment == 0) {
            return null;
        }
        while (fragment instanceof o0q0) {
            fragment = ((o0q0) fragment).getUiTrackingFragment();
            if (fragment == 0) {
                return null;
            }
        }
        return fragment;
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LinkedList<WeakReference<tb0>> linkedList = this.w;
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        Iterator<WeakReference<tb0>> it = this.w.iterator();
        while (it.hasNext()) {
            tb0 tb0Var = it.next().get();
            if (tb0Var != null) {
                tb0Var.onActivityResult(i, i2, intent);
            } else {
                it.remove();
            }
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (getIntent().getBooleanExtra("fragment_use_slide_animation", false)) {
            overridePendingTransition(R.anim.clip_feed_in1, R.anim.clip_feed_out1);
        }
        super.onCreate(bundle);
        this.x = new jfy(this, getWindow());
        FrameLayout frameLayout = new FrameLayout(this.i);
        frameLayout.setId(R.id.fragment_wrapper);
        addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        String stringExtra = getIntent().getStringExtra("fragment_name");
        if (stringExtra == null) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
        Fragment instantiate = Fragment.instantiate(this, stringExtra);
        instantiate.setArguments(getIntent().getBundleExtra("fragment_args"));
        this.y = instantiate;
        b.f(0, instantiate, null, 1);
        b.k(false);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.x);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.x);
    }

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void yk(tb0 tb0Var) {
        LinkedList<WeakReference<tb0>> linkedList = this.w;
        if (linkedList != null) {
            Iterator<WeakReference<tb0>> it = linkedList.iterator();
            while (it.hasNext()) {
                if (it.next().get() == tb0Var) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
