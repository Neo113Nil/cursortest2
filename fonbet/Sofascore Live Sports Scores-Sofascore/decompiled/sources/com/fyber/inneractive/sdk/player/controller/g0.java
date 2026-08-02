package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.util.g1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface g0 extends com.fyber.inneractive.sdk.ui.controller.c {
    com.fyber.inneractive.sdk.util.d0 a(g1 g1Var, com.fyber.inneractive.sdk.util.g gVar);

    com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var, boolean z);

    void a(int i, boolean z);

    void a(View view);

    void a(View view, String str);

    void a(String str, String str2);

    void a(boolean z);

    void a(boolean z, Orientation orientation);

    void c();

    void e();

    void f();

    void g();

    void h();

    void i();

    void j();

    com.fyber.inneractive.sdk.ignite.m o();

    void onPlayerError();

    void onProgress(int i, int i2);
}
