package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import java.util.Optional;
import xsna.hfs0;
import xsna.pwj0;
import xsna.vvs0;
import xsna.xts0;
import xsna.xxs0;

/* compiled from: VideoMinimizablePlayerComponent.kt */
/* loaded from: classes.dex */
public interface VideoMinimizablePlayerComponent extends DiScopedComponent<pwj0> {
    public static final a Companion = a.a;

    /* compiled from: VideoMinimizablePlayerComponent.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    xts0 E8();

    hfs0 P7();

    io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> Ua();

    vvs0 Y3();

    io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3();

    xxs0 zb();
}
