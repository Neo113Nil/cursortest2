package com.vk.libvideo.api.minimizable;

import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import xsna.izs;

/* compiled from: VideoMinimizableState.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final boolean a(VideoMinimizableState.Animating animating, Class<? extends VideoMinimizableState> cls) {
        return cls.isAssignableFrom(animating.b.getClass()) || cls.isAssignableFrom(animating.c.getClass());
    }

    public static final boolean b(VideoMinimizableState.Animating animating, Class<? extends VideoMinimizableState> cls, Class<? extends VideoMinimizableState> cls2) {
        VideoMinimizableState videoMinimizableState = animating.c;
        VideoMinimizableState videoMinimizableState2 = animating.b;
        if (cls.isAssignableFrom(videoMinimizableState2.getClass()) && cls2.isAssignableFrom(videoMinimizableState.getClass())) {
            return true;
        }
        return cls2.isAssignableFrom(videoMinimizableState2.getClass()) && cls.isAssignableFrom(videoMinimizableState.getClass());
    }

    public static final boolean c(VideoMinimizableState.Animating animating, Class<? extends VideoMinimizableState>[] clsArr, Class<? extends VideoMinimizableState>[] clsArr2) {
        VideoMinimizableState videoMinimizableState = animating.c;
        VideoMinimizableState videoMinimizableState2 = animating.b;
        int length = clsArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (clsArr[i].isAssignableFrom(videoMinimizableState2.getClass())) {
                for (Class<? extends VideoMinimizableState> cls : clsArr2) {
                    if (cls.isAssignableFrom(videoMinimizableState.getClass())) {
                        return true;
                    }
                }
            } else {
                i++;
            }
        }
        int length2 = clsArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            if (clsArr2[i2].isAssignableFrom(videoMinimizableState2.getClass())) {
                for (Class<? extends VideoMinimizableState> cls2 : clsArr) {
                    if (cls2.isAssignableFrom(videoMinimizableState.getClass())) {
                        return true;
                    }
                }
            } else {
                i2++;
            }
        }
        return false;
    }

    public static final boolean d(VideoMinimizableState videoMinimizableState) {
        return (videoMinimizableState instanceof VideoMinimizableState.Expanded) || g(videoMinimizableState);
    }

    public static final boolean e(VideoMinimizableState videoMinimizableState) {
        return (videoMinimizableState instanceof VideoMinimizableState.Expanded) || h(videoMinimizableState);
    }

    public static final boolean f(VideoMinimizableState.Animating animating) {
        VideoMinimizableState videoMinimizableState = animating.b;
        return ((videoMinimizableState instanceof VideoMinimizableState.Collapsed) || (videoMinimizableState instanceof VideoMinimizableState.Hidden)) && d(animating.c);
    }

    public static final boolean g(VideoMinimizableState videoMinimizableState) {
        return (videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal) || (videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical);
    }

    public static final boolean h(VideoMinimizableState videoMinimizableState) {
        return (videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical) && ((VideoMinimizableState.FullscreenVertical) videoMinimizableState).b;
    }

    public static final boolean i(VideoMinimizableState.Animating animating, izs<? super VideoMinimizableState, Boolean> izsVar, izs<? super VideoMinimizableState, Boolean> izsVar2) {
        VideoMinimizableState videoMinimizableState = animating.c;
        VideoMinimizableState videoMinimizableState2 = animating.b;
        if (izsVar.invoke(videoMinimizableState2).booleanValue() && izsVar2.invoke(videoMinimizableState).booleanValue()) {
            return true;
        }
        return izsVar.invoke(videoMinimizableState).booleanValue() && izsVar2.invoke(videoMinimizableState2).booleanValue();
    }

    public static final boolean j(VideoMinimizableState videoMinimizableState) {
        return (videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal) || k(videoMinimizableState);
    }

    public static final boolean k(VideoMinimizableState videoMinimizableState) {
        return (videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical) && !((VideoMinimizableState.FullscreenVertical) videoMinimizableState).b;
    }
}
