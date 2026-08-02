package com.vk.followersmode.impl.di;

import androidx.fragment.app.FragmentActivity;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.followersmode.api.di.FollowersModeComponent;
import xsna.b4s;
import xsna.b7m;
import xsna.bpn0;
import xsna.d4s;
import xsna.e7m;
import xsna.ek;
import xsna.etj;

/* compiled from: FollowersModeComponentImpl.kt */
/* loaded from: classes18.dex */
public final class FollowersModeComponentImpl implements FollowersModeComponent {
    public final bpn0 a = new bpn0(new ek(12));

    /* compiled from: FollowersModeComponentImpl.kt */
    public static final class a implements b7m<FollowersModeComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new FollowersModeComponentImpl();
        }
    }

    @Override // com.vk.followersmode.api.di.FollowersModeComponent
    public final d4s Ld(FragmentActivity fragmentActivity) {
        return new etj(fragmentActivity);
    }

    @Override // com.vk.followersmode.api.di.FollowersModeComponent
    public final b4s b() {
        return (b4s) this.a.getValue();
    }
}
