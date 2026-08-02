package ei;

import Zh.InterfaceC1901b;
import bi.m;
import fi.C4308y;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonNull;

/* renamed from: ei.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4210A implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4210A f46065a = new C4210A();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f46066b = bi.l.h("kotlinx.serialization.json.JsonNull", m.b.f25229a, new bi.f[0], null, 8, null);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonNull deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        r.g(decoder);
        if (decoder.G()) {
            throw new C4308y("Expected 'null' literal");
        }
        decoder.n();
        return JsonNull.INSTANCE;
    }

    @Override // Zh.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, JsonNull value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        encoder.u();
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f46066b;
    }
}
