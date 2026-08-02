package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.j1;
import com.vungle.ads.internal.n1;
import defpackage.wem;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p {
    public static final p b = new p();
    public Executor a;

    public static void a(String str, n1 n1Var) {
        n1Var.getClass();
        if (str.length() == 0 || !kotlin.text.c.v(str, "file://", false)) {
            boolean z = u.a;
            t.c(TtmlNode.TAG_P, "the valid uri is required.");
            return;
        }
        String substring = str.substring(7);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(substring, options);
        n1Var.invoke(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public final void a(String str, j1 j1Var) {
        j1Var.getClass();
        if (this.a == null) {
            boolean z = u.a;
            t.c(TtmlNode.TAG_P, "ImageLoader not initialized.");
        } else if (str.length() == 0) {
            boolean z2 = u.a;
            t.c(TtmlNode.TAG_P, "the uri is required.");
        } else {
            Executor executor = this.a;
            if (executor != null) {
                executor.execute(new wem(12, str, j1Var));
            }
        }
    }

    public static final void a(String str, Function1 function1) {
        function1.getClass();
        if (kotlin.text.c.v(str, "file://", false)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str.substring(7));
            if (decodeFile != null) {
                function1.invoke(decodeFile);
            } else {
                boolean z = u.a;
                t.c(TtmlNode.TAG_P, "decode bitmap failed.");
            }
        }
    }

    public final void a(com.vungle.ads.internal.executor.j jVar) {
        jVar.getClass();
        this.a = jVar;
    }
}
