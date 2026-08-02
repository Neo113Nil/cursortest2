package com.inmobi.media;

import defpackage.sq3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Fo extends sq3 {
    public String a;
    public InterfaceC3880x9 b;
    public Map c;
    public String d;
    public InterfaceC3317bf e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Io h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fo(Io io2, sq3 sq3Var) {
        super(sq3Var);
        this.h = io2;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
