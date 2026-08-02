package com.inmobi.media;

import defpackage.asf;
import defpackage.sq3;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Zl extends sq3 {
    public asf a;
    public asf b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3401em d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zl(C3401em c3401em, sq3 sq3Var) {
        super(sq3Var);
        this.d = c3401em;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return C3401em.b(this.d, (XmlPullParser) null, this);
    }
}
