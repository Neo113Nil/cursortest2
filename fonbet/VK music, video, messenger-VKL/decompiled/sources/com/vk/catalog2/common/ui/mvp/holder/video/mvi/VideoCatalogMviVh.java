package com.vk.catalog2.common.ui.mvp.holder.video.mvi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.b9s0;
import xsna.cnt0;
import xsna.dnt0;
import xsna.e8a;
import xsna.ent0;
import xsna.fmr;
import xsna.h6m0;
import xsna.iht0;
import xsna.izs;
import xsna.j0z;
import xsna.jht0;
import xsna.l0z;
import xsna.m5u0;
import xsna.mnt0;
import xsna.msy;
import xsna.t0a;
import xsna.u4a;

/* compiled from: VideoCatalogMviVh.kt */
/* loaded from: classes16.dex */
public final class VideoCatalogMviVh extends CatalogMviVh implements ent0 {
    public final com.vk.video.focus.api.a i;
    public final boolean j;
    public final Object k;
    public final a l;
    public ComposeView m;

    /* compiled from: VideoCatalogMviVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn.State.values().length];
            try {
                iArr[VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn.State.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn.State.Success.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn.State.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn.State.Cancel.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoCatalogMviVh(u4a u4aVar, CatalogBlockVariant catalogBlockVariant, com.vk.catalog.mvi.legacy.api.a aVar, b9s0.b bVar, com.vk.video.focus.api.a aVar2) {
        super(r7.f, r7.e, catalogBlockVariant, aVar, bVar);
        u4a.a aVar3 = u4aVar.b;
        this.i = aVar2;
        this.j = true;
        this.k = msy.a(LazyThreadSafetyMode.NONE, new h6m0(this, 12));
        this.l = new a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.CatalogMviVh
    public final boolean a(t0a t0aVar) {
        if (!this.j || !(t0aVar instanceof VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn)) {
            return false;
        }
        VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn videoCardImageStateDrawn = (VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn) t0aVar;
        String str = videoCardImageStateDrawn.a;
        int i = b.$EnumSwitchMapping$0[videoCardImageStateDrawn.b.ordinal()];
        ?? r1 = this.k;
        if (i == 1) {
            m5u0 m5u0Var = (m5u0) r1.getValue();
            if (((Boolean) m5u0Var.a.invoke()).booleanValue() && !fmr.e) {
                m5u0Var.c = str;
            }
        } else if (i == 2) {
            m5u0 m5u0Var2 = (m5u0) r1.getValue();
            if (((Boolean) m5u0Var2.a.invoke()).booleanValue() && !fmr.e && str.equals(m5u0Var2.c)) {
                m5u0Var2.b.invoke();
                return true;
            }
        } else if (i == 3) {
            m5u0 m5u0Var3 = (m5u0) r1.getValue();
            if (((Boolean) m5u0Var3.a.invoke()).booleanValue() && !fmr.e) {
                str.equals(m5u0Var3.c);
                return true;
            }
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            m5u0 m5u0Var4 = (m5u0) r1.getValue();
            if (((Boolean) m5u0Var4.a.invoke()).booleanValue() && !fmr.e) {
                str.equals(m5u0Var4.c);
                return true;
            }
        }
        return true;
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogMviVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        this.m = (ComposeView) k5;
        return k5;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.l;
    }

    /* compiled from: VideoCatalogMviVh.kt */
    public final class a implements mnt0 {
        public boolean b;

        /* compiled from: VideoFocusInteractor.kt */
        /* renamed from: com.vk.catalog2.common.ui.mvp.holder.video.mvi.VideoCatalogMviVh$a$a, reason: collision with other inner class name */
        public static final class C0513a implements izs<jht0, jht0> {
            public final /* synthetic */ boolean b;

            public C0513a(boolean z) {
                this.b = z;
            }

            @Override // xsna.izs
            public final jht0 invoke(jht0 jht0Var) {
                jht0 jht0Var2 = jht0Var;
                l0z l0zVar = (l0z) (!(jht0Var2 instanceof l0z) ? null : jht0Var2);
                return l0zVar != null ? new l0z(l0zVar.a, l0zVar.b, l0zVar.c, this.b) : jht0Var2;
            }
        }

        public a() {
        }

        public final j0z a() {
            e8a e8aVar = VideoCatalogMviVh.this.f;
            CatalogBlockState currentState = e8aVar != null ? e8aVar.getCurrentState() : null;
            if (currentState instanceof j0z) {
                return (j0z) currentState;
            }
            return null;
        }

        @Override // xsna.dnt0
        public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
            return null;
        }

        @Override // xsna.mnt0
        public final com.vk.libvideo.autoplay.a getVideoConfig() {
            com.vk.libvideo.autoplay.a j;
            j0z a = a();
            return (a == null || (j = a.j()) == null) ? com.vk.libvideo.autoplay.a.t : j;
        }

        @Override // xsna.dnt0
        public final boolean getVideoFocused() {
            return this.b;
        }

        @Override // xsna.mnt0
        /* renamed from: getVideoView */
        public final VideoTextureView mo407getVideoView() {
            j0z a = a();
            if (a != null) {
                return a.getVideoTextureView();
            }
            return null;
        }

        @Override // xsna.dnt0
        public final void setVideoFocused(boolean z) {
            this.b = z;
            j0z a = a();
            iht0.c o = a != null ? a.o() : null;
            if (o != null) {
                VideoCatalogMviVh.this.i.e(o, new C0513a(z));
            }
        }

        @Override // xsna.mnt0
        public final void G2(View view) {
        }

        @Override // xsna.mnt0
        public final void setFocusController(cnt0 cnt0Var) {
        }

        @Override // xsna.mnt0
        public final void w0(View view) {
        }
    }
}
