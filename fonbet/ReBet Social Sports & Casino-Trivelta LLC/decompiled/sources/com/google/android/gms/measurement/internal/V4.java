package com.google.android.gms.measurement.internal;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class V4 {
    public static /* synthetic */ Map.Entry a(Object obj, Object obj2) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
