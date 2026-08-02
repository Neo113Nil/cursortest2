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
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.bpn0;
import xsna.c5g;
import xsna.g620;
import xsna.gd;
import xsna.gzs;
import xsna.h6;
import xsna.ide;
import xsna.ie;
import xsna.io2;
import xsna.kwc;
import xsna.md;
import xsna.msy;
import xsna.mzc;
import xsna.oz50;
import xsna.s1;
import xsna.s3q0;
import xsna.u40;
import xsna.v40;
import xsna.we0;
import xsna.wzs;
import xsna.yzs;
import xsna.zde;
import xsna.zof;

/* compiled from: ClipsGridOwnerClipsListFragment.kt */
/* loaded from: classes17.dex */
public final class ClipsGridOwnerClipsListFragment extends AbstractClipsGridUploadListFragment {
    public static final /* synthetic */ int o0 = 0;
    public final bpn0 j0;
    public final Object k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;

    /* compiled from: ClipsGridOwnerClipsListFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ClipsGridOwnerClipsListFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements yzs<Integer, List<? extends ClipVideoFile>, io2, s3q0> {
        @Override // xsna.yzs
        public final s3q0 invoke(Integer num, List<? extends ClipVideoFile> list, io2 io2Var) {
            int intValue = num.intValue();
            io2 io2Var2 = io2Var;
            ClipsGridOwnerClipsListFragment clipsGridOwnerClipsListFragment = (ClipsGridOwnerClipsListFragment) this.receiver;
            int i = ClipsGridOwnerClipsListFragment.o0;
            List singletonList = Collections.singletonList(new ClipFeedTab.Profile(null, clipsGridOwnerClipsListFragment.mo()));
            List<? extends ClipVideoFile> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new ClipVideoFileAdapter((ClipVideoFile) it.next()));
            }
            ClipsRouter.c(g620.f().a(), clipsGridOwnerClipsListFragment.kn(), singletonList, io2Var2, new kwc(arrayList, clipsGridOwnerClipsListFragment.ko().h(), intValue), null, null, null, ((zof) clipsGridOwnerClipsListFragment.j0.getValue()).H().isEnabled(), null, 1904);
            return s3q0.a;
        }
    }

    /* compiled from: ClipsGridOwnerClipsListFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<ClipVideoFile, Integer, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(ClipVideoFile clipVideoFile, Integer num) {
            ((ClipsGridOwnerClipsListFragment) this.receiver).ro(clipVideoFile, num, null);
            return s3q0.a;
        }
    }

    /* compiled from: ClipsGridOwnerClipsListFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<ClipVideoFile, Integer, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(ClipVideoFile clipVideoFile, Integer num) {
            ((ClipsGridOwnerClipsListFragment) this.receiver).ro(clipVideoFile, num, new md(0));
            return s3q0.a;
        }
    }

    /* compiled from: ClipsGridOwnerClipsListFragment.kt */
    public static final /* synthetic */ class e extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((ClipsGridOwnerClipsListFragment) this.receiver).mo();
        }
    }

    /* compiled from: ClipsGridOwnerClipsListFragment.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<Integer> {
        @Override // xsna.gzs
        public final Integer invoke() {
            return Integer.valueOf(((ide) this.receiver).Ba());
        }
    }

    public ClipsGridOwnerClipsListFragment() {
        super(ClipsGridTabData.OwnerClips);
        this.j0 = new bpn0(new h6(this, 21));
        we0 we0Var = new we0(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k0 = msy.a(lazyThreadSafetyMode, we0Var);
        this.l0 = msy.a(lazyThreadSafetyMode, new s1(this, 26));
        this.m0 = msy.a(lazyThreadSafetyMode, new u40(this, 18));
        this.n0 = msy.a(lazyThreadSafetyMode, new v40(this, 20));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final gd jo() {
        return (zde) this.n0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final ie lo() {
        return (mzc) this.m0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final boolean no() {
        return ((Boolean) this.l0.getValue()).booleanValue();
    }
}
