package com.google.firebase.messaging;

import java.io.IOException;

/* renamed from: com.google.firebase.messaging.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5921b implements r8.d<F8.b> {

    /* renamed from: a, reason: collision with root package name */
    static final C5921b f59695a = new C5921b();

    /* renamed from: b, reason: collision with root package name */
    private static final r8.c f59696b = HY.a.b(1, r8.c.a("messagingClientEvent"));

    @Override // r8.d
    public final void encode(Object obj, Object obj2) throws IOException {
        ((r8.e) obj2).add(f59696b, ((F8.b) obj).a());
    }
}
