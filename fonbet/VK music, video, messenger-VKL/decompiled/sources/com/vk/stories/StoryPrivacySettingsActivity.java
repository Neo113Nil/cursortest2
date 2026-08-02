package com.vk.stories;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.pushes.PushAwareActivity;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import xsna.dhr0;
import xsna.fpf0;
import xsna.io;
import xsna.jx2;
import xsna.m7m;
import xsna.mnh0;
import xsna.nf9;
import xsna.tlo0;
import xsna.tq;
import xsna.z260;

/* compiled from: StoryPrivacySettingsActivity.kt */
/* loaded from: classes6.dex */
public final class StoryPrivacySettingsActivity extends PushAwareActivity {
    public FrameLayout v;
    public io.reactivex.rxjava3.disposables.c w = EmptyDisposable.INSTANCE;
    public String x;
    public FragmentImpl y;

    /* compiled from: StoryPrivacySettingsActivity.kt */
    public static final class StoryPrivacySettingsFragment extends PrivacyEditFragment {
        public static final /* synthetic */ int X0 = 0;

        @Override // com.vk.privacyui.PrivacyEditFragment
        public final View[] Ko() {
            return new View[0];
        }

        @Override // com.vk.privacyui.PrivacyEditFragment
        public final void Oo() {
            nf9.f();
        }

        @Override // com.vk.privacyui.PrivacyEditFragment, me.grishka.appkit.fragments.AppKitFragment
        public final void go() {
            FragmentActivity activity;
            super.go();
            if (getActivity() == null || (activity = getActivity()) == null) {
                return;
            }
            activity.finish();
        }

        @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            to(R.layout.appkit_loader_fragment_no_shadow);
        }

        @Override // com.vk.privacyui.PrivacyEditFragment, com.vkontakte.android.fragments.CardRecyclerFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
        public final void onViewCreated(View view, Bundle bundle) {
            super.onViewCreated(view, bundle);
            VkTopBar vkTopBar = new VkTopBar(requireContext(), null, 6, 0);
            vkTopBar.setBack(new VkTopBar.b(new z260(this, 27), tq.h(tlo0.Companion, R.string.accessibility_back), null, null, null, 28));
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.h(this.J0.c), null, null, null, null, 30), null, null, null, 14));
            jo(vkTopBar);
        }
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, xsna.too0
    public final void Ng() {
        super.Ng();
        recreate();
    }

    @Override // com.vk.core.ui.themes.ThemableActivity
    public final boolean Q1() {
        return true;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        FragmentImpl fragmentImpl = this.y;
        if (fragmentImpl != null) {
            fragmentImpl.a0();
        }
        super.onBackPressed();
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(dhr0.C().c);
        super.onCreate(bundle);
        this.x = getIntent().getStringExtra("settings_key");
        setContentView(R.layout.activity_story_privacy_settings);
        this.v = (FrameLayout) findViewById(R.id.fragment_wrapper);
        this.w = new jx2(new io(((StoriesSettingsComponent) m7m.a(this).a(fpf0.a(StoriesSettingsComponent.class))).B7().f()), new e(this)).a();
        mnh0.x(this);
        dhr0.r0(this);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.w.dispose();
    }
}
