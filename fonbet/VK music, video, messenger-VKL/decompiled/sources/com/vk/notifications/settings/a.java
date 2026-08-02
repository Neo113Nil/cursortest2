package com.vk.notifications.settings;

import android.content.Context;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vkontakte.android.R;
import xsna.gzs;
import xsna.s3q0;
import xsna.wm1;

/* compiled from: CommunityNotificationSettingsFragment.kt */
/* loaded from: classes4.dex */
public final class a implements CommunityNotificationSettingsFragment.c {
    public final /* synthetic */ CommunityNotificationSettingsFragment b;

    public a(CommunityNotificationSettingsFragment communityNotificationSettingsFragment) {
        this.b = communityNotificationSettingsFragment;
    }

    @Override // xsna.whp
    public final String a() {
        String string;
        Context mo2getContext = this.b.mo2getContext();
        return (mo2getContext == null || (string = mo2getContext.getString(R.string.err_max_communities_connected)) == null) ? "" : string;
    }

    @Override // com.vk.notifications.settings.CommunityNotificationSettingsFragment.c
    public final boolean d() {
        return false;
    }

    @Override // com.vk.notifications.settings.CommunityNotificationSettingsFragment.c
    public final String getTitle() {
        Context mo2getContext = this.b.mo2getContext();
        if (mo2getContext != null) {
            return mo2getContext.getString(R.string.err_max_communities_connected_title);
        }
        return null;
    }

    @Override // com.vk.notifications.settings.CommunityNotificationSettingsFragment.c
    public final gzs<s3q0> j() {
        return new wm1(this.b, 26);
    }

    @Override // com.vk.notifications.settings.CommunityNotificationSettingsFragment.c
    public final String k() {
        Context mo2getContext = this.b.mo2getContext();
        if (mo2getContext != null) {
            return mo2getContext.getString(R.string.not_notifications_settings);
        }
        return null;
    }
}
