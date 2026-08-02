package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;
import y8.InterfaceC10861a;

@KeepForSdk
/* renamed from: com.google.mlkit.common.sdkinternal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5948d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10861a f60030a;

    public C5948d(@NonNull InterfaceC10861a interfaceC10861a) {
        this.f60030a = interfaceC10861a;
    }

    @NonNull
    @KeepForSdk
    public final Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f60030a.get();
    }
}
