package io.appmetrica.analytics.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175ga extends A4 {
    public C0175ga(@NotNull C0596x4 c0596x4) {
        super(c0596x4);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(@NotNull P5 p52, @NotNull C0521u4 c0521u4) {
        Bundle bundle = p52.f12738m;
        Xa xa2 = bundle != null ? (Xa) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (xa2 != null) {
            if (xa2.f13183d) {
                C0372o4 c0372o4 = c0521u4.f14699b.f14897d.f14999a;
                Boolean bool = c0372o4.f14393n;
                Boolean bool2 = c0372o4.f14389i;
                C0353na.I.c().c(bool != null ? bool.booleanValue() : true);
                C0353na.I.h().b(bool2);
            }
        }
        this.f11971a.a(xa2);
        return false;
    }
}
