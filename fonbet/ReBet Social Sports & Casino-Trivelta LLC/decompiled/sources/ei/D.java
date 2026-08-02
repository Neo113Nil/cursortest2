package ei;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes5.dex */
public final class D implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final D f46068a = new D();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f46069b = a.f46070b;

    public static final class a implements bi.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f46070b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f46071c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bi.f f46072a = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), q.f46124a).getDescriptor();

        @Override // bi.f
        public boolean b() {
            return this.f46072a.b();
        }

        @Override // bi.f
        public int c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f46072a.c(name);
        }

        @Override // bi.f
        public int d() {
            return this.f46072a.d();
        }

        @Override // bi.f
        public String e(int i10) {
            return this.f46072a.e(i10);
        }

        @Override // bi.f
        public List f(int i10) {
            return this.f46072a.f(i10);
        }

        @Override // bi.f
        public bi.f g(int i10) {
            return this.f46072a.g(i10);
        }

        @Override // bi.f
        public List getAnnotations() {
            return this.f46072a.getAnnotations();
        }

        @Override // bi.f
        public bi.m getKind() {
            return this.f46072a.getKind();
        }

        @Override // bi.f
        public String h() {
            return f46071c;
        }

        @Override // bi.f
        public boolean i(int i10) {
            return this.f46072a.i(i10);
        }

        @Override // bi.f
        public boolean isInline() {
            return this.f46072a.isInline();
        }
    }

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonObject deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        r.g(decoder);
        return new JsonObject((Map) AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), q.f46124a).deserialize(decoder));
    }

    @Override // Zh.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, JsonObject value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), q.f46124a).serialize(encoder, value);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f46069b;
    }
}
