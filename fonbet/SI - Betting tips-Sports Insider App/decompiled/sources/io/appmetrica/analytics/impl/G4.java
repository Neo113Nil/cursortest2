package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class G4 extends AbstractC0373o5 {
    public G4(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, L5> componentLoader, @NonNull C0161fm c0161fm, @NonNull BaseRequestConfig.BaseRequestArguments<C0372o4, Object> baseRequestArguments) {
        super(componentLoader, c0161fm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0373o5
    public final void a(@NonNull Object obj) {
        C0372o4 c0372o4 = (C0372o4) obj;
        synchronized (this) {
            super.a((Object) c0372o4);
        }
    }

    public final synchronized void a(@NonNull C0372o4 c0372o4) {
        super.a((Object) c0372o4);
    }
}
