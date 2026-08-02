package com.inmobi.media;

import defpackage.sq3;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Tl extends sq3 {
    public XmlPullParser a;
    public String b;
    public Function1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3401em e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tl(C3401em c3401em, sq3 sq3Var) {
        super(sq3Var);
        this.e = c3401em;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((XmlPullParser) null, (String) null, (Function1) null, this);
    }
}
