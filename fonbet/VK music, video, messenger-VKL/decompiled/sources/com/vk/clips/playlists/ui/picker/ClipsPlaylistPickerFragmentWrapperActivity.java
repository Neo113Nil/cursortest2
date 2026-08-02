package com.vk.clips.playlists.ui.picker;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vkontakte.android.FragmentWrapperActivity;
import xsna.dhr0;
import xsna.fuj0;
import xsna.oz50;

/* compiled from: ClipsPlaylistPickerFragmentWrapperActivity.kt */
/* loaded from: classes16.dex */
public final class ClipsPlaylistPickerFragmentWrapperActivity extends FragmentWrapperActivity implements fuj0 {
    public static final /* synthetic */ int z = 0;

    /* compiled from: ClipsPlaylistPickerFragmentWrapperActivity.kt */
    public static final class a extends oz50 {
        @Override // xsna.oz50
        public final Intent n(Context context) {
            Intent n = super.n(context);
            n.setComponent(new ComponentName(context, (Class<?>) ClipsPlaylistPickerFragmentWrapperActivity.class));
            return n;
        }
    }

    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        dhr0.a.getClass();
        setTheme(dhr0.u().c);
        super.onCreate(bundle);
    }
}
