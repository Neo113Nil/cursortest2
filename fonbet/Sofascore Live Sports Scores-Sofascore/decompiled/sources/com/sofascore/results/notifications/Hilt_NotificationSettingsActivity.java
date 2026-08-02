package com.sofascore.results.notifications;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.p1f;
import defpackage.zgd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_NotificationSettingsActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_NotificationSettingsActivity() {
        addOnContextAvailableListener(new ab0(this, 26));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        ((NotificationSettingsActivity) this).B = (p1f) ((gc4) ((zgd) f())).a.M0.get();
    }
}
