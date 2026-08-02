package com.google.firebase.messaging;

import java.io.IOException;

/* renamed from: com.google.firebase.messaging.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5922c implements r8.d<B> {

    /* renamed from: a, reason: collision with root package name */
    static final C5922c f59698a = new C5922c();

    /* renamed from: b, reason: collision with root package name */
    private static final r8.c f59699b = r8.c.d("messagingClientEventExtension");

    @Override // r8.d
    public final void encode(Object obj, Object obj2) throws IOException {
        ((r8.e) obj2).add(f59699b, ((B) obj).b());
    }
}
