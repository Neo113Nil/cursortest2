package com.zoho.messenger.api;

/* loaded from: classes4.dex */
public enum a {
    CHAT(1),
    COLLABORATION(2),
    SERVICECHAT(4),
    CUSTOMCHAT(5),
    PRESENCE_CHAT(6),
    CHANNEL(8),
    BOT(9),
    ENTITYCHAT(10),
    THREADCHAT(11);


    /* renamed from: a, reason: collision with root package name */
    public int f44590a;

    a(int i10) {
        this.f44590a = i10;
    }

    public int b() {
        return this.f44590a;
    }
}
