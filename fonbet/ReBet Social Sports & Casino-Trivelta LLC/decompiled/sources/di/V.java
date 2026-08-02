package di;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Instant;

/* loaded from: classes5.dex */
public final class V implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final V f45331a = new V();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45332b = new Q0("kotlin.time.Instant", e.i.f25213a);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Instant deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Instant.INSTANCE.parse(decoder.E());
    }

    @Override // Zh.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, Instant value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.H(value.toString());
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45332b;
    }
}
