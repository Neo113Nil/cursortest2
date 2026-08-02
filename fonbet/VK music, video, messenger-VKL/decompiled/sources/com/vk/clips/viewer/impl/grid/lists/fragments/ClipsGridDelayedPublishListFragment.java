package com.vk.clips.viewer.impl.grid.lists.fragments;

import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.dto.common.ClipVideoFile;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.gd;
import xsna.ie;
import xsna.ji0;
import xsna.md;
import xsna.msy;
import xsna.oz50;
import xsna.ry0;
import xsna.s3q0;
import xsna.wzs;
import xsna.zde;

/* compiled from: ClipsGridDelayedPublishListFragment.kt */
/* loaded from: classes17.dex */
public final class ClipsGridDelayedPublishListFragment extends AbstractClipsGridUploadListFragment {
    public static final /* synthetic */ int l0 = 0;
    public final Object j0;
    public final Object k0;

    /* compiled from: ClipsGridDelayedPublishListFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ClipsGridDelayedPublishListFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<ClipVideoFile, Integer, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(ClipVideoFile clipVideoFile, Integer num) {
            ((ClipsGridDelayedPublishListFragment) this.receiver).ro(clipVideoFile, num, null);
            return s3q0.a;
        }
    }

    /* compiled from: ClipsGridDelayedPublishListFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<ClipVideoFile, Integer, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(ClipVideoFile clipVideoFile, Integer num) {
            ((ClipsGridDelayedPublishListFragment) this.receiver).ro(clipVideoFile, num, new md(0));
            return s3q0.a;
        }
    }

    /* compiled from: ClipsGridDelayedPublishListFragment.kt */
    public static final /* synthetic */ class d extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((ClipsGridDelayedPublishListFragment) this.receiver).mo();
        }
    }

    public ClipsGridDelayedPublishListFragment() {
        super(ClipsGridTabData.DelayedPublications);
        ry0 ry0Var = new ry0(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j0 = msy.a(lazyThreadSafetyMode, ry0Var);
        this.k0 = msy.a(lazyThreadSafetyMode, new ji0(this, 17));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final gd jo() {
        return (zde) this.k0.getValue();
    }

    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final ie lo() {
        return null;
    }
}
