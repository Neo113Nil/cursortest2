package com.inmobi.media;

import android.os.HandlerThread;
import defpackage.yda;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class P6 {
    public static final boolean a(String str) {
        if (str == null || StringsKt.l0(str).toString().length() == 0) {
            return true;
        }
        return (kotlin.text.c.v(str, "http://", false) || kotlin.text.c.v(str, "https://", false)) ? false : true;
    }

    public static final void a(HandlerThread handlerThread, String str) {
        handlerThread.getClass();
        str.getClass();
        try {
            handlerThread.start();
        } catch (InternalError e) {
            e.toString();
        }
    }

    public static final void a(yda ydaVar) {
        if (ydaVar == null || !ydaVar.isActive()) {
            return;
        }
        ydaVar.e(null);
    }
}
