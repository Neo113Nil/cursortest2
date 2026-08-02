package com.google.common.collect;

import java.io.Serializable;

/* renamed from: com.google.common.collect.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3444y extends AbstractC3425e implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f36863a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36864b;

    public C3444y(Object obj, Object obj2) {
        this.f36863a = obj;
        this.f36864b = obj2;
    }

    @Override // com.google.common.collect.AbstractC3425e, java.util.Map.Entry
    public final Object getKey() {
        return this.f36863a;
    }

    @Override // com.google.common.collect.AbstractC3425e, java.util.Map.Entry
    public final Object getValue() {
        return this.f36864b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
