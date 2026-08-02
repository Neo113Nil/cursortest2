package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import defpackage.me4;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzek {
    public static void a(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(me4.g(i, "csd-", new StringBuilder(String.valueOf(i).length() + 4)), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void b(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
