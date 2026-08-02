package com.sofascore.results.profile.editor;

import android.os.Bundle;
import android.view.View;
import defpackage.duf;
import defpackage.i9f;
import defpackage.otk;
import defpackage.q9f;
import defpackage.t1d;
import defpackage.tc3;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/profile/editor/ProfileEditorFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileEditorFragment extends Hilt_ProfileEditorFragment {
    public final otk r = new otk(duf.a.getOrCreateKotlinClass(q9f.class), new i9f(this, 0), new i9f(this, 2), new i9f(this, 1));

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(526322487, new t1d(this, 15), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "EditorTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        l();
        this.i.b = ((q9f) this.r.getValue()).p ? "own_profile" : "other_profile";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
