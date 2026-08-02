package com.sofascore.results.tv;

import com.sofascore.results.base.BaseActivity;
import defpackage.cb9;
import defpackage.gc4;
import defpackage.p1f;
import defpackage.tri;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_TVChannelEditorActivity extends BaseActivity {
    public boolean I = false;

    public Hilt_TVChannelEditorActivity() {
        addOnContextAvailableListener(new cb9(this, 13));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.I) {
            return;
        }
        this.I = true;
        ((TVChannelEditorActivity) this).B = (p1f) ((gc4) ((tri) f())).a.M0.get();
    }
}
