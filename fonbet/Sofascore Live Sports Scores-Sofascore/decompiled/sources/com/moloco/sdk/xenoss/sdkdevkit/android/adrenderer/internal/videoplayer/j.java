package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o;
import defpackage.ddi;
import defpackage.rq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface j extends o {
    Object a(rq3 rq3Var);

    void a(String str);

    void b(boolean z);

    View c();

    ddi f();

    ddi isPlaying();

    ddi p();

    void pause();

    void play();

    void seekTo(long j);
}
