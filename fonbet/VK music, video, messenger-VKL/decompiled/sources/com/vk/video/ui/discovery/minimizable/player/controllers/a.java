package com.vk.video.ui.discovery.minimizable.player.controllers;

import android.content.res.Configuration;
import android.view.View;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import xsna.ebs0;
import xsna.fys;
import xsna.i2b0;
import xsna.kz20;
import xsna.l6s0;
import xsna.lat0;
import xsna.yks0;

/* compiled from: MiniPlayerController.kt */
/* loaded from: classes7.dex */
public interface a extends PlayerRemoteController, ebs0, l6s0, i2b0 {
    void J2();

    kz20 Lc();

    void Q(VideoMinimizableState videoMinimizableState);

    void Q5(boolean z);

    yks0 W();

    void Wf(boolean z);

    void Y2();

    void a2(VideoAnnounceState videoAnnounceState);

    void ba(com.vk.video.ui.discovery.minimizable.b bVar);

    void d();

    View getPlayerView();

    void onConfigurationChanged(Configuration configuration);

    void onPause();

    void onResume();

    void t();

    void vm();

    default void L2(lat0 lat0Var) {
    }

    default void L3(fys fysVar) {
    }
}
