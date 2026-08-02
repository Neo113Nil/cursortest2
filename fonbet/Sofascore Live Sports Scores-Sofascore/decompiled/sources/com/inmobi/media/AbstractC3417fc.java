package com.inmobi.media;

import defpackage.ku3;
import defpackage.s9a;
import defpackage.te6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.fc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3417fc {
    public static final ku3 a;
    public static final Semaphore b;
    public static final AtomicBoolean c;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new M9("LogSingle", true));
        newSingleThreadExecutor.getClass();
        a = s9a.c(new te6(newSingleThreadExecutor));
        b = new Semaphore(1);
        c = new AtomicBoolean(false);
    }
}
