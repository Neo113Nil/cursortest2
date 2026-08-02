package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import defpackage.jyo;
import defpackage.t9p;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzvp {
    default boolean A(t9p t9pVar) {
        return false;
    }

    void B(int i, int i2, int i3, long j);

    void a(ArrayList arrayList);

    void b(int i, zziv zzivVar, long j, int i2);

    ByteBuffer g(int i);

    void j(Bundle bundle);

    void k(int i);

    ByteBuffer p(int i);

    void r(Surface surface);

    int u(MediaCodec.BufferInfo bufferInfo);

    default void v(jyo jyoVar) {
        jyoVar.run();
    }

    void w(int i, long j);

    void y(int i);

    int zze();

    MediaFormat zzg();

    void zzk();

    void zzl();

    void zzo();
}
