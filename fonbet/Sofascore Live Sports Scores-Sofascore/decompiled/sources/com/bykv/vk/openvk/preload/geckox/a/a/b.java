package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class b {
    public static final b a = new d();
    public static final b b;
    protected a c;
    protected File d;
    protected List<String> e;

    static {
        new f();
        b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.c = aVar;
        this.d = file;
        this.e = list;
    }
}
