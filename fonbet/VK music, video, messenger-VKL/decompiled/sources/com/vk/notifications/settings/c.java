package com.vk.notifications.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vkontakte.android.R;
import xsna.f4m;
import xsna.la;
import xsna.whp;

/* compiled from: CommunityNotificationSettingsFragment.kt */
/* loaded from: classes4.dex */
public final class c extends RecyclerPaginatedView {
    @Override // com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        return LayoutInflater.from(context).inflate(R.layout.community_notification_settings_empty_view, (ViewGroup) null);
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void qg(whp whpVar) {
        if (whpVar instanceof CommunityNotificationSettingsFragment.c) {
            TextView textView = (TextView) this.d.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(((CommunityNotificationSettingsFragment.c) whpVar).getTitle());
            }
            TextView textView2 = (TextView) this.d.findViewById(R.id.subtitle);
            if (textView2 != null) {
                textView2.setText(((CommunityNotificationSettingsFragment.c) whpVar).a());
            }
            TextView textView3 = (TextView) this.d.findViewById(R.id.btn_primary);
            TextView textView4 = (TextView) this.d.findViewById(R.id.btn_secondary);
            CommunityNotificationSettingsFragment.c cVar = (CommunityNotificationSettingsFragment.c) whpVar;
            TextView textView5 = cVar.d() ? textView3 : textView4;
            if (cVar.d()) {
                textView3 = textView4;
            }
            if (textView5 != null) {
                textView5.setText(cVar.k());
                textView5.setOnClickListener(new la(whpVar, 5));
                textView5.setVisibility(0);
            }
            f4m.j(textView3);
        }
        super.qg(whpVar);
    }
}
