package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class C extends ReactViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public a f41631a;

    public interface a {
        void a(boolean z10, int i10, int i11, int i12, int i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Nullable
    public final a getDelegate$react_native_screens_release() {
        return this.f41631a;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a aVar = this.f41631a;
        if (aVar != null) {
            aVar.a(z10, i10, i11, i12, i13);
        }
    }

    public final void setDelegate$react_native_screens_release(@Nullable a aVar) {
        this.f41631a = aVar;
    }
}
