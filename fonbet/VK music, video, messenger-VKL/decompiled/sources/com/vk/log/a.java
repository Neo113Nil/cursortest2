package com.vk.log;

import com.vk.log.L;
import com.vk.log.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import xsna.bpn0;
import xsna.mnh0;
import xsna.y84;

/* compiled from: CrashExtraFileLogger.kt */
/* loaded from: classes3.dex */
public final class a {
    public static final bpn0 b = new bpn0(new y84(3));
    public final b a;

    /* compiled from: CrashExtraFileLogger.kt */
    /* renamed from: com.vk.log.a$a, reason: collision with other inner class name */
    public static final class C1259a {
        public static String a() {
            return "vk-crashlog_" + ((SimpleDateFormat) a.b.getValue()).format(new Date()) + ".log";
        }
    }

    public a(b bVar) {
        this.a = bVar;
    }

    public final void a(Thread thread, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("THREAD_NAME: " + thread.getName());
        sb.append("\n\n================ CRASH INFO =================\n");
        sb.append(mnh0.A(th));
        sb.append("\n=============================================\n");
        L.LogType logType = L.LogType.e;
        String sb2 = sb.toString();
        b bVar = this.a;
        b.a.a(bVar, logType, sb2, null, null, 20);
        bVar.release();
    }
}
