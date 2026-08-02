package com.google.firebase.datastorage;

import L0.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d {
    public static final Object a(f fVar, f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object c10 = fVar.c(key);
        return c10 == null ? obj : c10;
    }
}
