package com.plaid.internal;

import android.util.LruCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.a4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3554a4<K, V> implements InterfaceC3792y<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final LruCache<K, V> f39819a = new LruCache<>(10);

    @Override // com.plaid.internal.InterfaceC3792y
    public final void a(String str, Object obj) {
        this.f39819a.put(str, obj);
    }

    @Override // com.plaid.internal.InterfaceC3792y
    public final void clear() {
        this.f39819a.evictAll();
    }

    @Override // com.plaid.internal.InterfaceC3792y
    @Nullable
    public final Object a(String str) {
        return this.f39819a.get(str);
    }
}
