package wZ;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wZ.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10462d extends z0.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC5392m f103716a;

    public C10462d(ComponentCallbacksC5392m componentCallbacksC5392m) {
        this.f103716a = componentCallbacksC5392m;
    }

    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
    public final <T extends w0> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        M4.c savedStateRegistry = this.f103716a.getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "<get-savedStateRegistry>(...)");
        return new C10460b(savedStateRegistry);
    }
}
