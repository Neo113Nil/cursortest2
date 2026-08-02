package ru.ozon.android.messenger.framework.composer.viewmodel;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a extends z0.c {
    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
    public final <T extends w0> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new b();
    }
}
