package com.mbridge.msdk.config.component.animation;

import android.animation.Animator;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class f {
    private String a = "";
    private g b;
    private Animator c;
    private View d;
    private i e;

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.a = str;
    }

    public i b() {
        return this.e;
    }

    public View c() {
        return this.d;
    }

    public void a(g gVar) {
        this.b = gVar;
    }

    public Animator a() {
        return this.c;
    }

    public void a(Animator animator) {
        this.c = animator;
    }

    public void a(View view) {
        this.d = view;
    }

    public void a(i iVar) {
        this.e = iVar;
    }
}
