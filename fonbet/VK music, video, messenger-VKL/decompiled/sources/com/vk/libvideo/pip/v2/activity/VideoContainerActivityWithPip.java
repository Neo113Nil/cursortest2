package com.vk.libvideo.pip.v2.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.api.pip2.VideoContainerFragmentEntry;
import com.vk.libvideo.api.pip2.VideoPipModeAction;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.pip.v2.PipTrigger;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.cp50;
import xsna.dso0;
import xsna.epx;
import xsna.h4t0;
import xsna.jds0;
import xsna.msy;
import xsna.ozl;
import xsna.scn0;
import xsna.u110;
import xsna.ysg0;

/* compiled from: VideoContainerActivityWithPip.kt */
/* loaded from: classes.dex */
public final class VideoContainerActivityWithPip extends VideoContainerActivity {
    public static final /* synthetic */ int G = 0;
    public final Object C = msy.a(LazyThreadSafetyMode.NONE, new u110(this, 28));
    public final bpn0 D = new bpn0(new jds0(this, 0));
    public Object E = EmptyList.b;
    public boolean F;

    /* compiled from: VideoContainerActivityWithPip.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPipModeAction.Minimize.Trigger.values().length];
            try {
                iArr[VideoPipModeAction.Minimize.Trigger.ByGesture.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPipModeAction.Minimize.Trigger.ByBackButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPipModeAction.Minimize.Trigger.Other.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.libvideo.pip.v2.activity.VideoContainerActivity
    public final void X1(Intent intent) {
        Object parcelableArrayListExtra = intent.getParcelableArrayListExtra("enabled_pip_triggers");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = EmptyList.b;
        }
        this.E = parcelableArrayListExtra;
        super.X1(intent);
    }

    @Override // com.vk.libvideo.pip.v2.activity.VideoContainerActivity
    public final void Y1() {
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.e()) {
            return;
        }
        finishAndRemoveTask();
    }

    @Override // com.vk.libvideo.pip.v2.activity.VideoContainerActivity
    public final void Z1(VideoPipModeAction videoPipModeAction) {
        PipTrigger pipTrigger;
        if (!(videoPipModeAction instanceof VideoPipModeAction.Minimize)) {
            if (!(videoPipModeAction instanceof VideoPipModeAction.a)) {
                throw new NoWhenBranchMatchedException();
            }
            finishAndRemoveTask();
            return;
        }
        VideoPipModeAction.Minimize minimize = (VideoPipModeAction.Minimize) videoPipModeAction;
        int i = a.$EnumSwitchMapping$0[minimize.b().ordinal()];
        if (i == 1) {
            pipTrigger = PipTrigger.Gesture;
        } else if (i == 2) {
            pipTrigger = PipTrigger.Back;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pipTrigger = PipTrigger.Other;
        }
        if (d2(pipTrigger, minimize.a())) {
            return;
        }
        finishAndRemoveTask();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final boolean d2(PipTrigger pipTrigger, boolean z) {
        Intent intent;
        if (this.E.contains(pipTrigger) && f2(z, false)) {
            return true;
        }
        Object systemService = getApplicationContext().getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                intent = appTask.getTaskInfo().baseIntent;
                Set<String> categories = intent.getCategories();
                if (categories != null && categories.contains("android.intent.category.LAUNCHER")) {
                    appTask.moveToFront();
                    finishAndRemoveTask();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void e2(Intent intent) {
        ComponentName component = intent.getComponent();
        boolean f = epx.f(component != null ? component.getClassName() : null, getComponentName().getClassName());
        boolean a2 = ((VideoPip2Component) this.x.getValue()).N5().a(intent);
        if (!f && !a2) {
            intent.addFlags(268435456);
        }
        this.F = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((xsna.fxc0.B().J().c() ? false : com.vk.core.preference.Preference.j().getBoolean("video_background", true)) == false) goto L14;
     */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f2(boolean z, boolean z2) {
        if (z2) {
        }
        h4t0 h4t0Var = (h4t0) this.C.getValue();
        if (h4t0Var != null) {
            return h4t0Var.g(z);
        }
        return false;
    }

    @Override // com.vk.libvideo.pip.v2.activity.VideoContainerActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        VideoContainerFragmentEntry videoContainerFragmentEntry = this.w;
        if ((videoContainerFragmentEntry == null || !videoContainerFragmentEntry.a0()) && !d2(PipTrigger.Back, false)) {
            super.onBackPressed();
            finishAndRemoveTask();
        }
    }

    @Override // com.vk.libvideo.pip.v2.activity.VideoContainerActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.y.b(ysg0.b.a.b0(VideoPipStateHolder.a.class).subscribe(new cp50(new dso0(this, 12), 21)));
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        scn0.b.getClass();
        scn0.F();
        super.onPause();
        this.F = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super.onPictureInPictureModeChanged(z, configuration);
        h4t0 h4t0Var = (h4t0) this.C.getValue();
        if (h4t0Var != null) {
            h4t0Var.d(z, configuration);
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        Y1();
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onUserLeaveHint() {
        if (this.E.contains(PipTrigger.LeaveHint)) {
            f2(false, !this.F);
        }
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr, Bundle bundle) {
        e2(getIntent());
        super.startActivities(intentArr, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @ozl
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        e2(intent);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @ozl
    public final void startActivityFromChild(Activity activity, Intent intent, int i, Bundle bundle) {
        if (intent != null) {
            e2(intent);
        }
        super.startActivityFromChild(activity, intent, i, bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        e2(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
    }

    @Override // android.app.Activity
    public final boolean startActivityIfNeeded(Intent intent, int i, Bundle bundle) {
        e2(intent);
        return super.startActivityIfNeeded(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final boolean startNextMatchingActivity(Intent intent, Bundle bundle) {
        e2(intent);
        return super.startNextMatchingActivity(intent, bundle);
    }

    @Override // com.vk.libvideo.pip.v2.activity.VideoContainerActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity
    public final void R1() {
    }
}
