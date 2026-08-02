package com.vk.profile.user.impl.ui.scheduled_clips;

import com.vk.dto.common.id.UserId;
import com.vk.profile.core.scheduled_clips.BaseCommunityScheduledClipsGridFragment;
import kotlin.LazyThreadSafetyMode;
import xsna.dck0;
import xsna.kzq0;
import xsna.l0i;
import xsna.m7m;
import xsna.mqe0;
import xsna.msy;
import xsna.oz50;

/* compiled from: UserScheduledClipsGridFragment.kt */
/* loaded from: classes5.dex */
public final class UserScheduledClipsGridFragment extends BaseCommunityScheduledClipsGridFragment {
    public static final /* synthetic */ int W = 0;
    public final Object T;
    public final Object U;
    public final kzq0 V;

    /* compiled from: UserScheduledClipsGridFragment.kt */
    public static final class a extends oz50 {
    }

    public UserScheduledClipsGridFragment() {
        dck0 dck0Var = new dck0(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, dck0Var);
        this.U = msy.a(lazyThreadSafetyMode, new mqe0(this, 22));
        this.V = new kzq0(m7m.d(this));
    }

    @Override // com.vk.profile.core.scheduled_clips.BaseCommunityScheduledClipsGridFragment
    public final l0i fo() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.profile.core.scheduled_clips.BaseCommunityScheduledClipsGridFragment
    public final UserId go() {
        return (UserId) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.profile.core.scheduled_clips.BaseCommunityScheduledClipsGridFragment
    public final boolean ho() {
        return ((Boolean) this.U.getValue()).booleanValue();
    }
}
