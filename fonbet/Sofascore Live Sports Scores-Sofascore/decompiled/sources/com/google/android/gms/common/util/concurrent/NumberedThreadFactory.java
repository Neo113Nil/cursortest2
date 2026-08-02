package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.ironsource.U3;
import defpackage.pc;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class NumberedThreadFactory implements ThreadFactory {
    public final String a;
    public final AtomicInteger b = new AtomicInteger();
    public final ThreadFactory c = Executors.defaultThreadFactory();

    public NumberedThreadFactory(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new pc(3, runnable));
        int andIncrement = this.b.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1);
        sb.append(str);
        sb.append(U3.j.d);
        sb.append(andIncrement);
        sb.append(U3.j.e);
        newThread.setName(sb.toString());
        return newThread;
    }
}
