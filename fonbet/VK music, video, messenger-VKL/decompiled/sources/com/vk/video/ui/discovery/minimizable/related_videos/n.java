package com.vk.video.ui.discovery.minimizable.related_videos;

import com.vk.dto.common.VideoFile;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import java.util.Collections;
import xsna.dz5;
import xsna.k9x;
import xsna.mct0;
import xsna.rbt0;

/* compiled from: VideoRelatedVideosPagingState.kt */
/* loaded from: classes7.dex */
public final class n {
    public static final m.a a(m mVar, int i, rbt0 rbt0Var, boolean z, VideoFile videoFile, VideoFile videoFile2) {
        if (mVar instanceof m.a) {
            m.a aVar = (m.a) mVar;
            mct0 mct0Var = aVar.a;
            return mct0Var.a != i ? aVar : new m.a(dz5.s(mct0Var, rbt0Var, videoFile, videoFile2));
        }
        int i2 = rbt0Var.c;
        int i3 = rbt0Var.a;
        return new m.a(new mct0(i, new k9x(i3, rbt0Var.b + i3, 1), z, i2, Collections.singletonList(rbt0Var), videoFile, videoFile2));
    }

    public static final m.a b(m mVar, int i, rbt0 rbt0Var, boolean z) {
        if (mVar instanceof m.a) {
            m.a aVar = (m.a) mVar;
            mct0 mct0Var = aVar.a;
            return mct0Var.a != i ? aVar : new m.a(dz5.w(mct0Var, rbt0Var));
        }
        int i2 = rbt0Var.c;
        int i3 = rbt0Var.a;
        return new m.a(new mct0(i, new k9x(i3, rbt0Var.b + i3, 1), z, i2, Collections.singletonList(rbt0Var), null, null));
    }
}
