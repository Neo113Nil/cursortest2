package com.vk.followersmode.api.di;

import androidx.fragment.app.FragmentActivity;
import com.vk.di.component.DiUnscopedComponent;
import xsna.b4s;
import xsna.d4s;

/* compiled from: FollowersModeComponent.kt */
/* loaded from: classes18.dex */
public interface FollowersModeComponent extends DiUnscopedComponent {
    public static final a Companion = a.a;

    /* compiled from: FollowersModeComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final FollowersModeComponent STUB = new FollowersModeComponentStub();

        public final FollowersModeComponent getSTUB() {
            return STUB;
        }
    }

    d4s Ld(FragmentActivity fragmentActivity);

    b4s b();
}
