package com.vk.newsfeed.impl.fragments;

import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.presenters.b;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.b2c0;
import xsna.c9c0;
import xsna.fae;
import xsna.g3f0;
import xsna.h6;
import xsna.ics0;
import xsna.msy;
import xsna.snd;
import xsna.vdg;
import xsna.we0;
import xsna.z2f0;

/* compiled from: ClipsBottomSheetCommentsFragment.kt */
/* loaded from: classes4.dex */
public final class ClipsBottomSheetCommentsFragment extends BottomSheetCommentsFragment {
    public static final /* synthetic */ int i1 = 0;
    public final b h1;

    public ClipsBottomSheetCommentsFragment() {
        b bVar = new b(this, this.J);
        b2c0 b2c0Var = new b2c0(bVar.G, this.y0);
        PostViewFragment.b bVar2 = new PostViewFragment.b();
        this.B0.b(bVar2);
        b2c0Var.n = bVar2;
        b2c0Var.m = this.z0;
        this.s0 = b2c0Var;
        h6 h6Var = new h6(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a = msy.a(lazyThreadSafetyMode, h6Var);
        Lazy a2 = msy.a(lazyThreadSafetyMode, new we0(this, 17));
        snd sndVar = new snd(new ics0(a2), new fae(a2), a, this, bVar, null);
        bVar.H = sndVar;
        this.t0 = new vdg(sndVar, sndVar.K, new g3f0((z2f0) null, 3), this.A0);
        this.C0 = sndVar;
        this.S = sndVar;
        this.h1 = bVar;
    }

    @Override // com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment, com.vk.newsfeed.impl.fragments.PostViewFragment
    public final c9c0 Co() {
        return this.h1;
    }
}
