package ei;

import Zh.InterfaceC1900a;
import fi.C4305v;
import fi.J;
import fi.K;
import fi.U;
import fi.X;
import fi.Y;
import fi.b0;
import fi.d0;
import fi.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* renamed from: ei.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4212b implements Zh.A {

    /* renamed from: d, reason: collision with root package name */
    public static final a f46079d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final C4216f f46080a;

    /* renamed from: b, reason: collision with root package name */
    public final gi.e f46081b;

    /* renamed from: c, reason: collision with root package name */
    public final C4305v f46082c;

    /* renamed from: ei.b$a */
    public static final class a extends AbstractC4212b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
            super(new C4216f(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), gi.g.a(), null);
        }
    }

    public /* synthetic */ AbstractC4212b(C4216f c4216f, gi.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4216f, eVar);
    }

    @Override // Zh.m
    public gi.e a() {
        return this.f46081b;
    }

    @Override // Zh.A
    public final String b(Zh.p serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        K k10 = new K();
        try {
            J.a(this, k10, serializer, obj);
            return k10.toString();
        } finally {
            k10.g();
        }
    }

    public final Object c(InterfaceC1900a deserializer, JsonElement element) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        return b0.a(this, element, deserializer);
    }

    public final Object d(InterfaceC1900a deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        X a10 = Y.a(this, string);
        Object H10 = new U(this, e0.f46766c, a10, deserializer.getDescriptor(), null).H(deserializer);
        a10.x();
        return H10;
    }

    public final JsonElement e(Zh.p serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return d0.d(this, obj, serializer);
    }

    public final C4216f f() {
        return this.f46080a;
    }

    public final C4305v g() {
        return this.f46082c;
    }

    public final JsonElement h(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return (JsonElement) d(q.f46124a, string);
    }

    public AbstractC4212b(C4216f c4216f, gi.e eVar) {
        this.f46080a = c4216f;
        this.f46081b = eVar;
        this.f46082c = new C4305v();
    }
}
