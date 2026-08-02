package com.vk.followersmode.api.di;

import androidx.fragment.app.FragmentActivity;
import com.vk.followersmode.api.domain.FollowersModeState;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.completable.i;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import xsna.b4s;
import xsna.d4s;
import xsna.xa4;

/* compiled from: FollowersModeComponentStub.kt */
/* loaded from: classes18.dex */
public final class FollowersModeComponentStub implements FollowersModeComponent {
    public final a a = new a();

    @Override // com.vk.followersmode.api.di.FollowersModeComponent
    public final d4s Ld(FragmentActivity fragmentActivity) {
        return new xa4(11);
    }

    @Override // com.vk.followersmode.api.di.FollowersModeComponent
    public final b4s b() {
        return this.a;
    }

    /* compiled from: FollowersModeComponentStub.kt */
    public static final class a implements b4s {
        @Override // xsna.b4s
        public final io.reactivex.rxjava3.core.a c(boolean z) {
            return i.b;
        }

        @Override // xsna.b4s
        public final q<FollowersModeState> d() {
            return g0.b;
        }

        @Override // xsna.b4s
        public final void a() {
        }

        @Override // xsna.b4s
        public final void b(FollowersModeState followersModeState) {
        }
    }
}
