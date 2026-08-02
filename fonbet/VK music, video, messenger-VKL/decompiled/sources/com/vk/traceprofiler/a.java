package com.vk.traceprofiler;

import android.content.Context;
import java.io.File;
import xsna.v6v0;
import xsna.vtc0;

/* compiled from: TraceProfilerService.kt */
/* loaded from: classes6.dex */
public final class a {
    public static final a a = new a();
    public static boolean b;
    public static boolean c;
    public static Context d;
    public static File e;
    public static v6v0 f;
    public static vtc0 g;

    public final synchronized void a() {
        if (!b) {
            throw new IllegalStateException("Not inited");
        }
    }
}
