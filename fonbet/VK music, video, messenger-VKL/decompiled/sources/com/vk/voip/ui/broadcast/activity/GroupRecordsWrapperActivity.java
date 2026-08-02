package com.vk.voip.ui.broadcast.activity;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vkontakte.android.FragmentWrapperActivity;
import com.vkontakte.android.R;
import xsna.fxc0;
import xsna.ydt0;

/* compiled from: GroupRecordsWrapperActivity.kt */
/* loaded from: classes7.dex */
public final class GroupRecordsWrapperActivity extends FragmentWrapperActivity {
    public static final /* synthetic */ int A = 0;
    public final ydt0 z = fxc0.B().Y();

    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        if (bundle != null || (extras = getIntent().getExtras()) == null) {
            return;
        }
        ydt0.e(this.z, this, new VideoAlbum(-8, new UserId(extras.getLong("OWNER_ID")), this.i.getString(R.string.voip_broadcast_group_album_title, extras.getString("GROUP_NAME")), null, 0, 0, null, false, null, false, false, 0, null, null, false, null, null, null, 262136, null), null, null, 28);
    }
}
