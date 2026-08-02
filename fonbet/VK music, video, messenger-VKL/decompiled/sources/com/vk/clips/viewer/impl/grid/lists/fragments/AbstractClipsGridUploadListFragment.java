package com.vk.clips.viewer.impl.grid.lists.fragments;

import android.app.Activity;
import android.content.Context;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.dto.common.ClipVideoFile;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.e3m;
import xsna.g8d;
import xsna.h6;
import xsna.hkd;
import xsna.ikd;
import xsna.kd;
import xsna.ld;
import xsna.md;
import xsna.msy;
import xsna.nd;
import xsna.o25;
import xsna.od;
import xsna.rdi;
import xsna.sih0;

/* compiled from: AbstractClipsGridUploadListFragment.kt */
/* loaded from: classes17.dex */
public abstract class AbstractClipsGridUploadListFragment extends AbstractClipsGridListFragment {
    public static final /* synthetic */ int i0 = 0;
    public final Object f0;
    public final Object g0;
    public final Object h0;

    public AbstractClipsGridUploadListFragment(ClipsGridTabData clipsGridTabData) {
        super(clipsGridTabData);
        kd kdVar = new kd(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f0 = msy.a(lazyThreadSafetyMode, kdVar);
        this.g0 = msy.a(lazyThreadSafetyMode, new ld(this, 0));
        this.h0 = msy.a(lazyThreadSafetyMode, new h6(this, 1));
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, xsna.bkd] */
    public final void ro(ClipVideoFile clipVideoFile, Integer num, md mdVar) {
        Activity h;
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null || (h = e3m.h(mo2getContext)) == null) {
            return;
        }
        od odVar = new od(num, this);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new hkd(new ikd(new ClipVideoFileAdapter(clipVideoFile), this.T, clipVideoFile.b, rdi.p(h, new nd(ref$ObjectRef, 0)), (g8d.a) null, !o25.a().b(), (sih0) null, requireArguments().getBoolean("ClipsGridListFragment.force_dark_theme", true), 32), odVar, mdVar, null, 8).a(h, null, true);
    }
}
