package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311li implements so {

    /* renamed from: a, reason: collision with root package name */
    public final Map f14212a;

    public C0311li(@NonNull Map<String, ?> map) {
        this.f14212a = map;
    }

    @Override // io.appmetrica.analytics.impl.so
    public final qo a(String str) {
        return this.f14212a.containsKey(str) ? new qo(this, false, androidx.appcompat.widget.c1.n("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new qo(this, true, "");
    }
}
