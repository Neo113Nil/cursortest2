package com.inmobi.media;

import defpackage.gc2;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.cf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3343cf implements InterfaceC3317bf {
    public final int a;
    public final gc2 b;
    public final We c;

    public C3343cf(String str, int i, gc2 gc2Var, We we) {
        str.getClass();
        gc2Var.getClass();
        we.getClass();
        this.a = i;
        this.b = gc2Var;
        this.c = we;
    }

    @Override // com.inmobi.media.InterfaceC3317bf
    public final Object a() {
        return C3823v4.class.cast(AbstractC3907ya.a(new JSONObject(this.b.r(Charsets.UTF_8)), C3823v4.class, null, null));
    }

    @Override // com.inmobi.media.InterfaceC3317bf
    public final We b() {
        return this.c;
    }

    @Override // com.inmobi.media.InterfaceC3317bf
    public final int c() {
        return this.a;
    }

    @Override // com.inmobi.media.InterfaceC3317bf
    public final gc2 d() {
        return this.b;
    }

    @Override // com.inmobi.media.InterfaceC3317bf
    public final String e() {
        return null;
    }
}
