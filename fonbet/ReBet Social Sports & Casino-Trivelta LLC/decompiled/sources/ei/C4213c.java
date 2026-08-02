package ei;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;

/* renamed from: ei.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4213c implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4213c f46083a = new C4213c();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f46084b = a.f46085b;

    /* renamed from: ei.c$a */
    public static final class a implements bi.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f46085b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f46086c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bi.f f46087a = AbstractC2028a.h(q.f46124a).getDescriptor();

        @Override // bi.f
        public boolean b() {
            return this.f46087a.b();
        }

        @Override // bi.f
        public int c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f46087a.c(name);
        }

        @Override // bi.f
        public int d() {
            return this.f46087a.d();
        }

        @Override // bi.f
        public String e(int i10) {
            return this.f46087a.e(i10);
        }

        @Override // bi.f
        public List f(int i10) {
            return this.f46087a.f(i10);
        }

        @Override // bi.f
        public bi.f g(int i10) {
            return this.f46087a.g(i10);
        }

        @Override // bi.f
        public List getAnnotations() {
            return this.f46087a.getAnnotations();
        }

        @Override // bi.f
        public bi.m getKind() {
            return this.f46087a.getKind();
        }

        @Override // bi.f
        public String h() {
            return f46086c;
        }

        @Override // bi.f
        public boolean i(int i10) {
            return this.f46087a.i(i10);
        }

        @Override // bi.f
        public boolean isInline() {
            return this.f46087a.isInline();
        }
    }

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonArray deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        r.g(decoder);
        return new JsonArray((List) AbstractC2028a.h(q.f46124a).deserialize(decoder));
    }

    @Override // Zh.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, JsonArray value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        AbstractC2028a.h(q.f46124a).serialize(encoder, value);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f46084b;
    }
}
