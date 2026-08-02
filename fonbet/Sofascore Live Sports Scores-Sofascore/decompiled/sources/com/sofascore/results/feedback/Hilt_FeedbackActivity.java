package com.sofascore.results.feedback;

import com.sofascore.results.base.BaseActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.p1f;
import defpackage.py7;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_FeedbackActivity extends BaseActivity {
    public boolean I = false;

    public Hilt_FeedbackActivity() {
        addOnContextAvailableListener(new ab0(this, 17));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.I) {
            return;
        }
        this.I = true;
        ((FeedbackActivity) this).B = (p1f) ((gc4) ((py7) f())).a.M0.get();
    }
}
