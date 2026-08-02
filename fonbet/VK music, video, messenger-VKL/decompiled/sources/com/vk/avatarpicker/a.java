package com.vk.avatarpicker;

import android.net.Uri;
import xsna.asu0;
import xsna.is1;
import xsna.js1;
import xsna.mcr0;
import xsna.nj;
import xsna.rmg;
import xsna.z4f;

/* compiled from: CropDelegate.kt */
/* loaded from: classes15.dex */
public final class a {
    public final InterfaceC0422a a;
    public final z4f b;
    public io.reactivex.rxjava3.disposables.c c;

    /* compiled from: CropDelegate.kt */
    /* renamed from: com.vk.avatarpicker.a$a, reason: collision with other inner class name */
    public interface InterfaceC0422a {
        void J();

        void t0(Uri uri);
    }

    public a(Uri uri, InterfaceC0422a interfaceC0422a, z4f z4fVar) {
        this.a = interfaceC0422a;
        this.b = z4fVar;
        mcr0.h(uri).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new is1(new rmg(this, 7), 19), new js1(new nj(15), 22));
    }
}
