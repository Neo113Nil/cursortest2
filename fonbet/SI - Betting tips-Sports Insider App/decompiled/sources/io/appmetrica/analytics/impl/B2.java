package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class B2 implements ExternalAttribution {

    /* renamed from: a, reason: collision with root package name */
    public final A9 f12029a;

    public B2(@NotNull A9 a92) {
        this.f12029a = a92;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    @NotNull
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f12029a);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExternalAttribution(type=`");
        sb2.append(K9.a(this.f12029a.f11982a));
        sb2.append("`value=`");
        return d9.e.l(sb2, new String(this.f12029a.f11983b, Charsets.UTF_8), "`)");
    }
}
