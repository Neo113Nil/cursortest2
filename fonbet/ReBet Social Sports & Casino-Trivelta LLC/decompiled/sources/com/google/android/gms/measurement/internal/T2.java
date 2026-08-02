package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class T2 implements zzo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2 f33665b;

    public T2(Y2 y22, String str) {
        this.f33664a = str;
        Objects.requireNonNull(y22);
        this.f33665b = y22;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.f33665b.p().get(this.f33664a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
