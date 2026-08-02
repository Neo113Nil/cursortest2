package io.seon.androidsdk.service;

import java.security.KeyPairGenerator;
import java.util.concurrent.Callable;

/* renamed from: io.seon.androidsdk.service.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC4974m implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeyPairGenerator f53420a;

    public CallableC4974m(KeyPairGenerator keyPairGenerator) {
        this.f53420a = keyPairGenerator;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f53420a.generateKeyPair();
    }
}
