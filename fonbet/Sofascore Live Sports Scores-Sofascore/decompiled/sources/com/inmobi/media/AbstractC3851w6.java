package com.inmobi.media;

import defpackage.joa;
import defpackage.xqm;
import defpackage.ypa;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.w6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3851w6 {
    public static final joa a = ypa.b(new xqm(8));
    public static final joa b = ypa.b(new xqm(9));
    public static final joa c = ypa.b(new xqm(10));
    public static final joa d = ypa.b(new xqm(11));
    public static final joa e = ypa.b(new xqm(12));
    public static final joa f = ypa.b(new xqm(13));

    public static final ExecutorService a() {
        return Executors.newCachedThreadPool(new M9("ExecutorProvider.IO", false));
    }

    public static final ExecutorService b() {
        return Executors.newCachedThreadPool(new M9("ExecutorProvider.high", false));
    }

    public static final ExecutorService c() {
        return Executors.newCachedThreadPool(new M9("ExecutorProvider.highIO", false));
    }

    public static final ExecutorC3520jc d() {
        return new ExecutorC3520jc();
    }

    public static final ExecutorService e() {
        return Executors.newCachedThreadPool(new M9("ExecutorProvider.normal", false));
    }

    public static final ExecutorService f() {
        return Executors.newSingleThreadExecutor(new M9("ExecutorProvider.single", false));
    }
}
