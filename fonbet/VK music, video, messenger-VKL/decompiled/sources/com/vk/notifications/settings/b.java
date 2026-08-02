package com.vk.notifications.settings;

import android.content.Context;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vkontakte.android.R;
import xsna.gzs;
import xsna.l9h;
import xsna.s3q0;

/* compiled from: CommunityNotificationSettingsFragment.kt */
/* loaded from: classes4.dex */
public final class b implements CommunityNotificationSettingsFragment.c {
    public final /* synthetic */ CommunityNotificationSettingsFragment b;

    public b(CommunityNotificationSettingsFragment communityNotificationSettingsFragment) {
        this.b = communityNotificationSettingsFragment;
    }

    @Override // xsna.whp
    public final String a() {
        String string;
        Context mo2getContext = this.b.mo2getContext();
        return (mo2getContext == null || (string = mo2getContext.getString(R.string.communty_notifications_settings_description)) == null) ? "" : string;
    }

    @Override // com.vk.notifications.settings.CommunityNotificationSettingsFragment.c
    public final boolean d() {
        return true;
    }

    @Override // com.vk.notifications.settings.CommunityNotificationSettingsFragment.c
    public final String getTitle() {
        Context mo2getContext = this.b.mo2getContext();
        if (mo2getContext != null) {
            return mo2getContext.getString(R.string.community_notifications);
        }
        return null;
    }

    @Override // com.vk.notifications.settings.CommunityNotificationSettingsFragment.c
    public final gzs<s3q0> j() {
        return new l9h(this.b, 1);
    }

    @Override // com.vk.notifications.settings.CommunityNotificationSettingsFragment.c
    public final String k() {
        Context mo2getContext = this.b.mo2getContext();
        if (mo2getContext != null) {
            return mo2getContext.getString(R.string.communty_notifications_settings_enable);
        }
        return null;
    }
}
