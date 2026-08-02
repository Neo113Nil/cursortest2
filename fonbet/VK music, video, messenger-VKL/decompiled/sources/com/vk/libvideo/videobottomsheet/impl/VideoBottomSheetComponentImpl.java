package com.vk.libvideo.videobottomsheet.impl;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent;
import com.vk.libvideo.videobottomsheet.api.a;
import com.vk.video.ui.share.api.VideoShareComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7s0;
import xsna.bba;
import xsna.c5g;
import xsna.c8m;
import xsna.cba;
import xsna.g8m;
import xsna.gla0;
import xsna.k88;
import xsna.msy;
import xsna.pwj0;
import xsna.q6s0;
import xsna.t6s0;

/* compiled from: VideoBottomSheetComponentImpl.kt */
/* loaded from: classes.dex */
public final class VideoBottomSheetComponentImpl implements VideoBottomSheetComponent {
    public final Object a;
    public final Object b;

    /* compiled from: VideoBottomSheetComponentImpl.kt */
    public static final class a implements c8m<VideoBottomSheetComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            bba bbaVar = new bba(g8mVar, 3);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new VideoBottomSheetComponentImpl(msy.a(lazyThreadSafetyMode, bbaVar), msy.a(lazyThreadSafetyMode, new cba(g8mVar, 3)));
        }
    }

    public VideoBottomSheetComponentImpl(Lazy<? extends VideoShareComponent> lazy, Lazy<? extends VideoMinimizablePlayerComponent> lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent
    public final a.InterfaceC1255a Mc(List<? extends k88> list) {
        List<? extends k88> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (k88 k88Var : list2) {
            if (!(k88Var instanceof k88.a)) {
                throw new NoWhenBranchMatchedException();
            }
            k88.a aVar = (k88.a) k88Var;
            arrayList.add(new gla0(aVar.a(), aVar.b()));
        }
        return new t6s0(this.a, arrayList, msy.a(LazyThreadSafetyMode.NONE, new q6s0(this, 0)));
    }

    @Override // com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent
    public final a.b hd(List<? extends k88> list) {
        List<? extends k88> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (k88 k88Var : list2) {
            if (!(k88Var instanceof k88.a)) {
                throw new NoWhenBranchMatchedException();
            }
            k88.a aVar = (k88.a) k88Var;
            arrayList.add(new gla0(aVar.a(), aVar.b()));
        }
        return new a7s0(arrayList);
    }
}
