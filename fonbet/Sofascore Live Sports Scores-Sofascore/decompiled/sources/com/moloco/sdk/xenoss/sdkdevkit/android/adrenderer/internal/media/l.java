package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class l {
    public static final k a = new k(1.0d, 512000, false);

    public static final f a(Exception exc) {
        return exc instanceof UnknownHostException ? f.q : exc instanceof SocketException ? f.i : exc instanceof SSLHandshakeException ? f.j : exc instanceof IOException ? f.f : exc instanceof SecurityException ? f.g : exc instanceof m ? f.m : exc instanceof NumberFormatException ? f.l : f.r;
    }
}
