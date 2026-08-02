package com.vk.movika.impl.view.full.extend_seekbar;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import one.video.controls.view.seekpreview.SeekPreviewImageView;
import xsna.bh10;
import xsna.epx;
import xsna.owo0;
import xsna.zjw;

/* compiled from: InteractiveExtendSeekBarFramesAdapter.kt */
/* loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<b> {
    public final ArrayList c = new ArrayList();
    public zjw d;

    /* compiled from: InteractiveExtendSeekBarFramesAdapter.kt */
    /* renamed from: com.vk.movika.impl.view.full.extend_seekbar.a$a, reason: collision with other inner class name */
    public static final class C1287a {
        public final long a;
        public final long b;
        public final owo0 c;

        public C1287a(long j, long j2, owo0 owo0Var) {
            this.a = j;
            this.b = j2;
            this.c = owo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1287a)) {
                return false;
            }
            C1287a c1287a = (C1287a) obj;
            return this.a == c1287a.a && this.b == c1287a.b && epx.f(this.c, c1287a.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "Item(positionMs=" + this.a + ", durationMs=" + this.b + ", timelineImages=" + this.c + ')';
        }
    }

    /* compiled from: InteractiveExtendSeekBarFramesAdapter.kt */
    public static final class b extends RecyclerView.e0 {
        public final PreviewFrameLayout l;

        public b(PreviewFrameLayout previewFrameLayout) {
            super(previewFrameLayout);
            this.l = previewFrameLayout;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i) {
        C1287a c1287a = (C1287a) this.c.get(i);
        PreviewFrameLayout previewFrameLayout = bVar.l;
        int i2 = previewFrameLayout.c;
        SeekPreviewImageView seekPreviewImageView = previewFrameLayout.b;
        owo0 owo0Var = c1287a.c;
        float f = owo0Var.i;
        if (f > 1.0f) {
            seekPreviewImageView.setScaleX(f);
            seekPreviewImageView.setTranslationX(((f - 1.0f) * i2) / 2);
            seekPreviewImageView.setScaleY(1.0f);
            seekPreviewImageView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            seekPreviewImageView.setScaleX(1.0f);
            seekPreviewImageView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f2 = 1;
            float f3 = f2 / f;
            seekPreviewImageView.setScaleY(f3);
            seekPreviewImageView.setTranslationY(((f3 - f2) * i2) / 2);
        }
        seekPreviewImageView.setTimelineImages(owo0Var);
        seekPreviewImageView.setPosition(c1287a.a);
        seekPreviewImageView.setDuration(c1287a.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
        PreviewFrameLayout previewFrameLayout = new PreviewFrameLayout(viewGroup.getContext(), null, 0, 14, 0);
        previewFrameLayout.setImageLoader(this.d);
        return new b(previewFrameLayout);
    }
}
