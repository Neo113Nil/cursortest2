package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ValidationException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class En implements so {

    /* renamed from: a, reason: collision with root package name */
    public final so f12208a;

    public En(@NonNull so soVar) {
        this.f12208a = soVar;
    }

    @Override // io.appmetrica.analytics.impl.so
    public final qo a(Object obj) {
        qo a7 = this.f12208a.a(obj);
        if (a7.f14527a) {
            return a7;
        }
        throw new ValidationException(a7.f14528b);
    }

    @NonNull
    public final so a() {
        return this.f12208a;
    }
}
