package com.vk.clips.viewer.impl.grid.lists.fragments;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.dto.common.ClipVideoFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c5g;
import xsna.g620;
import xsna.gd;
import xsna.hh1;
import xsna.i5g;
import xsna.ie;
import xsna.io2;
import xsna.k15;
import xsna.kwc;
import xsna.msy;
import xsna.nce;
import xsna.ob;
import xsna.ode;
import xsna.oz50;
import xsna.rli0;
import xsna.ry0;
import xsna.s3q0;
import xsna.s4;
import xsna.wzs;
import xsna.zof;

/* compiled from: ClipsGridLikedClipsListFragment.kt */
/* loaded from: classes17.dex */
public final class ClipsGridLikedClipsListFragment extends AbstractClipsGridListFragment {
    public static final /* synthetic */ int i0 = 0;
    public final Object f0;
    public final Object g0;
    public final Object h0;

    /* compiled from: ClipsGridLikedClipsListFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ClipsGridLikedClipsListFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<Integer, io2, s3q0> {
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.wzs
        public final s3q0 invoke(Integer num, io2 io2Var) {
            int intValue = num.intValue();
            io2 io2Var2 = io2Var;
            ClipsGridLikedClipsListFragment clipsGridLikedClipsListFragment = (ClipsGridLikedClipsListFragment) this.receiver;
            int i = ClipsGridLikedClipsListFragment.i0;
            List A = rli0.A(rli0.t(rli0.j(new i5g(((nce) clipsGridLikedClipsListFragment.h0.getValue()).y0()), ode.c), new ob(12)));
            ArrayList arrayList = new ArrayList(c5g.u(A, 10));
            Iterator it = A.iterator();
            while (it.hasNext()) {
                arrayList.add(new ClipVideoFileAdapter((ClipVideoFile) it.next()));
            }
            ClipsRouter.c(g620.f().a(), clipsGridLikedClipsListFragment.kn(), Collections.singletonList(ClipFeedTab.LikedClips.b), io2Var2, new kwc(arrayList, clipsGridLikedClipsListFragment.ko().h(), intValue), null, null, null, ((zof) clipsGridLikedClipsListFragment.f0.getValue()).H().isEnabled() && k15.r(clipsGridLikedClipsListFragment), null, 1904);
            return s3q0.a;
        }
    }

    public ClipsGridLikedClipsListFragment() {
        super(ClipsGridTabData.LikedClips);
        hh1 hh1Var = new hh1(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f0 = msy.a(lazyThreadSafetyMode, hh1Var);
        this.g0 = msy.a(lazyThreadSafetyMode, new s4(this, 24));
        this.h0 = msy.a(lazyThreadSafetyMode, new ry0(this, 21));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final gd jo() {
        return (nce) this.h0.getValue();
    }

    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final ie lo() {
        return null;
    }
}
