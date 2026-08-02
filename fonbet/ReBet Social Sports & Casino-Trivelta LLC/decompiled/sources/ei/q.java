package ei;

import Zh.InterfaceC1901b;
import bi.C2425a;
import bi.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class q implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final q f46124a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f46125b = bi.l.g("kotlinx.serialization.json.JsonElement", d.b.f25204a, new bi.f[0], new Function1() { // from class: ei.k
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit h10;
            h10 = q.h((C2425a) obj);
            return h10;
        }
    });

    public static final Unit h(C2425a buildSerialDescriptor) {
        bi.f f10;
        bi.f f11;
        bi.f f12;
        bi.f f13;
        bi.f f14;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        f10 = r.f(new Function0() { // from class: ei.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bi.f i10;
                i10 = q.i();
                return i10;
            }
        });
        C2425a.b(buildSerialDescriptor, "JsonPrimitive", f10, null, false, 12, null);
        f11 = r.f(new Function0() { // from class: ei.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bi.f j10;
                j10 = q.j();
                return j10;
            }
        });
        C2425a.b(buildSerialDescriptor, "JsonNull", f11, null, false, 12, null);
        f12 = r.f(new Function0() { // from class: ei.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bi.f k10;
                k10 = q.k();
                return k10;
            }
        });
        C2425a.b(buildSerialDescriptor, "JsonLiteral", f12, null, false, 12, null);
        f13 = r.f(new Function0() { // from class: ei.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bi.f l10;
                l10 = q.l();
                return l10;
            }
        });
        C2425a.b(buildSerialDescriptor, "JsonObject", f13, null, false, 12, null);
        f14 = r.f(new Function0() { // from class: ei.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bi.f m10;
                m10 = q.m();
                return m10;
            }
        });
        C2425a.b(buildSerialDescriptor, "JsonArray", f14, null, false, 12, null);
        return Unit.INSTANCE;
    }

    public static final bi.f i() {
        return E.f46073a.getDescriptor();
    }

    public static final bi.f j() {
        return C4210A.f46065a.getDescriptor();
    }

    public static final bi.f k() {
        return x.f46130a.getDescriptor();
    }

    public static final bi.f l() {
        return D.f46068a.getDescriptor();
    }

    public static final bi.f m() {
        return C4213c.f46083a.getDescriptor();
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f46125b;
    }

    @Override // Zh.InterfaceC1900a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public JsonElement deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return r.d(decoder).j();
    }

    @Override // Zh.p
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, JsonElement value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.i(E.f46073a, value);
        } else if (value instanceof JsonObject) {
            encoder.i(D.f46068a, value);
        } else {
            if (!(value instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.i(C4213c.f46083a, value);
        }
    }
}
