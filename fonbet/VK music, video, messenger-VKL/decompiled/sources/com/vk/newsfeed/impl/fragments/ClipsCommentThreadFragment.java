package com.vk.newsfeed.impl.fragments;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.movika.sdk.base.ui.g;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import xsna.afg;
import xsna.fae;
import xsna.g3f0;
import xsna.ics0;
import xsna.jd;
import xsna.m1;
import xsna.m3a;
import xsna.msy;
import xsna.ond;
import xsna.oz50;
import xsna.vdg;
import xsna.z2f0;

/* compiled from: ClipsCommentThreadFragment.kt */
/* loaded from: classes4.dex */
public final class ClipsCommentThreadFragment extends CommentThreadFragment {
    public static final /* synthetic */ int A0 = 0;
    public final ond z0;

    /* compiled from: ClipsCommentThreadFragment.kt */
    public static final class a extends oz50 {
    }

    public ClipsCommentThreadFragment() {
        g gVar = new g(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        ond ondVar = new ond(new ics0(msy.a(lazyThreadSafetyMode, gVar)), new fae(msy.a(lazyThreadSafetyMode, new m1(this, 21))), msy.a(lazyThreadSafetyMode, new jd(this, 23)), this, null);
        this.q0 = new vdg(ondVar, ondVar.K, new g3f0((z2f0) null, 3), new m3a(3));
        this.S = ondVar;
        this.z0 = ondVar;
    }

    @Override // com.vk.newsfeed.impl.fragments.CommentThreadFragment
    public final afg Co() {
        return this.z0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.FEED_COMMENT;
    }
}
