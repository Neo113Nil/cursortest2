package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.zi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660zi extends A4 {
    public C0660zi(C0596x4 c0596x4) {
        super(c0596x4);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(@NonNull P5 p52, @NonNull C0521u4 c0521u4) {
        Bundle bundle = p52.f12738m;
        this.f11971a.f14903k.a(new C0571w4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
