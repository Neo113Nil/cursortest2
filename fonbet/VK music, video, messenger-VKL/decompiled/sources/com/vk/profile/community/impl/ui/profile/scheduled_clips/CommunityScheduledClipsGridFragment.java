package com.vk.profile.community.impl.ui.profile.scheduled_clips;

import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.logic.processor.h;
import com.vk.profile.core.scheduled_clips.BaseCommunityScheduledClipsGridFragment;
import kotlin.LazyThreadSafetyMode;
import xsna.bu1;
import xsna.l0i;
import xsna.m7m;
import xsna.msy;
import xsna.n0i;
import xsna.oz50;

/* compiled from: CommunityScheduledClipsGridFragment.kt */
/* loaded from: classes5.dex */
public final class CommunityScheduledClipsGridFragment extends BaseCommunityScheduledClipsGridFragment {
    public static final /* synthetic */ int W = 0;
    public final Object T;
    public final Object U;
    public final n0i V;

    /* compiled from: CommunityScheduledClipsGridFragment.kt */
    public static final class a extends oz50 {
    }

    public CommunityScheduledClipsGridFragment() {
        bu1 bu1Var = new bu1(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, bu1Var);
        this.U = msy.a(lazyThreadSafetyMode, new h(this, 25));
        this.V = new n0i(m7m.d(this));
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
