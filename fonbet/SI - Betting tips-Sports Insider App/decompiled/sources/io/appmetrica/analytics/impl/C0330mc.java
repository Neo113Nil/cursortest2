package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330mc extends AbstractC0138f {
    public C0330mc(Context context, Bg bg2) {
        super(context, bg2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0138f
    public final void b(@NonNull P5 p52, @NonNull C0397p4 c0397p4) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(c0397p4.f14456b.f14382b, Boolean.FALSE)).booleanValue();
        Kb m6 = C0353na.I.m();
        m6.a(booleanValue);
        m6.a(c0397p4.f14456b.f14383c);
        Boolean bool = c0397p4.f14456b.f14393n;
        if (bool != null) {
            C0353na.I.c().b(bool.booleanValue());
        }
        this.f13711b.a(p52, c0397p4);
    }
}
