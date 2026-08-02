package com.vk.video.ui.discovery.minimizable.related_videos;

import com.vk.video.ui.discovery.minimizable.related_videos.data.VideoRelatedVideosPagingType;
import xsna.hus0;
import xsna.m5t0;
import xsna.xa9;

/* compiled from: VideoDiscoveryRelatedVideosPaginationDelegate.kt */
/* loaded from: classes7.dex */
public final class c {
    public final d a;
    public final m5t0 b;
    public final boolean c;
    public final xa9 d;
    public final hus0 e;
    public io.reactivex.rxjava3.disposables.c f;

    /* compiled from: VideoDiscoveryRelatedVideosPaginationDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoRelatedVideosPagingType.values().length];
            try {
                iArr[VideoRelatedVideosPagingType.VideoQueue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoRelatedVideosPagingType.Playlist.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(d dVar, m5t0 m5t0Var, boolean z, xa9 xa9Var, hus0 hus0Var) {
        this.a = dVar;
        this.b = m5t0Var;
        this.c = z;
        this.d = xa9Var;
        this.e = hus0Var;
    }
}
