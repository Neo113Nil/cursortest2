package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.gn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3454gn implements Function1 {
    public final /* synthetic */ MediaPlayer a;

    public C3454gn(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.release();
        return Unit.a;
    }
}
