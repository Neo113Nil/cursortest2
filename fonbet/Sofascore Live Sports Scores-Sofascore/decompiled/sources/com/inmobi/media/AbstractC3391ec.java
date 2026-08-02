package com.inmobi.media;

import android.content.Context;
import defpackage.joa;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.xw3;
import java.io.File;
import java.util.concurrent.Semaphore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ec, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3391ec {
    public static String a(Context context, long j) {
        context.getClass();
        File file = new File(context.getFilesDir() + "/logging");
        if (!file.exists()) {
            file.mkdirs();
        }
        return context.getFilesDir() + "/logging/" + j + ".txt";
    }

    public static Object a(Function0 function0) {
        Semaphore semaphore;
        function0.getClass();
        try {
            p2g p2gVar = w2g.b;
            try {
                try {
                    semaphore = AbstractC3417fc.b;
                    semaphore.acquire();
                    function0.invoke();
                } catch (Exception e) {
                    joa joaVar = AbstractC3286aa.a;
                    AbstractC3286aa.a(new Q2(e));
                    semaphore = AbstractC3417fc.b;
                }
                semaphore.release();
                return Unit.a;
            } catch (Throwable th) {
                AbstractC3417fc.b.release();
                throw th;
            }
        } catch (Throwable th2) {
            p2g p2gVar2 = w2g.b;
            return new u2g(th2);
        }
    }

    public static void a(Function1 function1) {
        function1.getClass();
        xw3.L(L9.c, null, null, new C3288ac(function1, null), 3);
    }

    public static String a(Context context) {
        context.getClass();
        return context.getFilesDir() + "/logging";
    }
}
