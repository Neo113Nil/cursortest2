package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Cg implements O7 {

    /* renamed from: a, reason: collision with root package name */
    public final Y4 f12109a;

    public Cg(@NonNull Y4 y42) {
        this.f12109a = y42;
    }

    @Override // io.appmetrica.analytics.impl.O7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bg a(@NonNull Context context, @NonNull Q4 q42, @NonNull C0397p4 c0397p4) {
        return new Bg(context, q42, c0397p4, this.f12109a, new R4(), Hl.a());
    }

    @NonNull
    public final Y4 a() {
        return this.f12109a;
    }
}
