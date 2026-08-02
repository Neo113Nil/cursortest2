package di;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Z0 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final Z0 f45341a = new Z0();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45342b = new Q0("kotlin.String", e.i.f25213a);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.E();
    }

    @Override // Zh.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, String value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.H(value);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45342b;
    }
}
