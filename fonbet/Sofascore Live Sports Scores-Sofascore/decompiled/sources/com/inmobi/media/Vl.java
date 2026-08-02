package com.inmobi.media;

import defpackage.asf;
import defpackage.sq3;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vl extends sq3 {
    public asf a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3401em c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vl(C3401em c3401em, sq3 sq3Var) {
        super(sq3Var);
        this.c = c3401em;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return C3401em.a(this.c, (XmlPullParser) null, this);
    }
}
