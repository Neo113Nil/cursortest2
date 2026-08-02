package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.g51;
import defpackage.vg6;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.jn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3531jn implements Function1 {
    public final /* synthetic */ ExoPlayer a;
    public final /* synthetic */ C3557kn b;

    public C3531jn(ExoPlayer exoPlayer, C3557kn c3557kn) {
        this.a = exoPlayer;
        this.b = c3557kn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((vg6) this.a).z(this.b);
        ((vg6) this.a).stop();
        ((g51) this.a).t();
        return Unit.a;
    }
}
