package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c extends FutureTask<h> implements Comparable<c> {
    private final h a;

    public c(h hVar) {
        super(hVar, null);
        this.a = hVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        h hVar = this.a;
        int i = hVar.a;
        h hVar2 = cVar.a;
        int i2 = hVar2.a;
        return i == i2 ? hVar.b - hVar2.b : i2 - i;
    }
}
