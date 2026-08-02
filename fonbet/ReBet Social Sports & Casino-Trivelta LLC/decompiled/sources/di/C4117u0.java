package di;

import Zh.InterfaceC1901b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.u0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4117u0 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4117u0 f45425a = new C4117u0();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f45426b = C4115t0.f45418a;

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new Zh.o("'kotlin.Nothing' does not have instances");
    }

    @Override // Zh.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, Void value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new Zh.o("'kotlin.Nothing' cannot be serialized");
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f45426b;
    }
}
