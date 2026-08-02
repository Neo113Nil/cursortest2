package com.vk.music.bottomsheets.promo.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.music.bottomsheets.di.MusicBottomSheetComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b010;
import xsna.b6e0;
import xsna.b7m;
import xsna.cu1;
import xsna.d6e0;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.g5e0;
import xsna.jh6;
import xsna.lc40;
import xsna.nwy;
import xsna.qcy;

/* compiled from: MusicBottomSheetComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MusicBottomSheetComponentImpl implements MusicBottomSheetComponent {
    public static final /* synthetic */ qcy<Object>[] e = {new PropertyReference1Impl(MusicBottomSheetComponentImpl.class, "promoInteractor", "getPromoInteractor()Lcom/vk/music/bottomsheets/domain/PromoInteractor;", 0), fp.c(0, MusicBottomSheetComponentImpl.class, "promoController", "getPromoController()Lcom/vk/music/bottomsheets/promo/PromoTrackController;", fpf0.a)};
    public final b6e0 a;
    public final lc40 b;
    public final nwy c = new nwy(new b010(this, 7));
    public final nwy d = new nwy(new cu1(23));

    /* compiled from: MusicBottomSheetComponentImpl.kt */
    public static final class a implements b7m<MusicBottomSheetComponent> {
        public final jh6 a = new jh6();

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MusicBottomSheetComponentImpl(new b6e0(), this.a);
        }
    }

    public MusicBottomSheetComponentImpl(b6e0 b6e0Var, jh6 jh6Var) {
        this.a = b6e0Var;
        this.b = jh6Var;
    }

    @Override // com.vk.music.bottomsheets.di.MusicBottomSheetComponent
    public final d6e0 C2() {
        qcy<Object> qcyVar = e[1];
        return (d6e0) this.d.c();
    }

    @Override // com.vk.music.bottomsheets.di.MusicBottomSheetComponent
    public final g5e0 O3() {
        qcy<Object> qcyVar = e[0];
        return (g5e0) this.c.c();
    }

    @Override // com.vk.music.bottomsheets.di.MusicBottomSheetComponent
    public final lc40 getConfig() {
        return this.b;
    }
}
