package com.vk.video.ui.discovery.minimizable.dialog.related_videos.items;

import android.view.ViewGroup;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.VideoRelatedErrorItem;
import java.util.List;
import xsna.cqr0;
import xsna.hfz;
import xsna.j7n;
import xsna.n6s;
import xsna.p1u0;
import xsna.uho0;
import xsna.vfz;
import xsna.xjf0;

/* compiled from: VideoRelatedErrorTypeDelegate.kt */
/* loaded from: classes7.dex */
public final class a extends p1u0<VideoRelatedErrorItem> {
    public final n6s a;
    public final uho0 b;
    public final cqr0 c;
    public VideoRelatedErrorItem d;

    /* compiled from: VideoRelatedErrorTypeDelegate.kt */
    /* renamed from: com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1986a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoRelatedErrorItem.ChunkType.values().length];
            try {
                iArr[VideoRelatedErrorItem.ChunkType.Previous.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoRelatedErrorItem.ChunkType.Next.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(n6s.a aVar, uho0 uho0Var, cqr0 cqr0Var) {
        this.a = aVar;
        this.b = uho0Var;
        this.c = cqr0Var;
    }

    @Override // xsna.p1u0
    public final void a(vfz<VideoRelatedErrorItem> vfzVar, VideoRelatedErrorItem videoRelatedErrorItem, List list) {
        VideoRelatedErrorItem videoRelatedErrorItem2 = videoRelatedErrorItem;
        this.d = videoRelatedErrorItem2;
        vfzVar.W5(videoRelatedErrorItem2);
    }

    @Override // xsna.p1u0
    public final vfz<? extends VideoRelatedErrorItem> b(ViewGroup viewGroup) {
        return new xjf0(this.a.b(viewGroup.getContext(), viewGroup, new j7n(this, 1)));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof VideoRelatedErrorItem;
    }
}
