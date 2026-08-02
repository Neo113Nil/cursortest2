package com.inmobi.media;

import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.b5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3307b5 extends C3312ba {
    public final StackTraceElement[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3307b5(Thread thread, Throwable th) {
        super("crashReporting", "CrashEvent", Hl.a(thread, th));
        thread.getClass();
        th.getClass();
        this.g = th.getStackTrace();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3307b5(String str) {
        super(r0, "crashReporting", "CatchEvent", str);
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        uuid.getClass();
    }
}
