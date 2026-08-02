package com.inmobi.media;

import defpackage.h2d;
import defpackage.sq3;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.kl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3555kl extends sq3 {
    public JSONObject a;
    public h2d b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3581ll d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3555kl(C3581ll c3581ll, sq3 sq3Var) {
        super(sq3Var);
        this.d = c3581ll;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
