package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.Thread;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﬥ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1011 implements Thread.UncaughtExceptionHandler {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0926 f3255;

    public C1011(C0926 c0926) {
        this.f3255 = c0926;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            AbstractC0356.m203(StringFog.decrypt("QkmyAxOYlb5w\n", "AyfTb2rs/N0=\n"), StringFog.decrypt("cIourxIMmGEFgTWtAhuEfEqK\n", "JeRNzmdr8BU=\n"), StringFog.decrypt("X6Kb2pNihyxg\n", "C9D6ufYA5k8=\n"), th, null, null, false, false, false);
        } catch (Throwable unused) {
        }
        this.f3255.m549();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3255.f3093;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (SecurityException unused2) {
        }
    }
}
