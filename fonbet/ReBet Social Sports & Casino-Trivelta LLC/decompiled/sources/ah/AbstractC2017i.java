package ah;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: ah.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2017i {

    /* renamed from: c, reason: collision with root package name */
    public static final a f16056c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f16057a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16058b;

    /* renamed from: ah.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public AbstractC2017i(String content, List parameters) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f16057a = content;
        this.f16058b = parameters;
    }

    public final String a() {
        return this.f16057a;
    }

    public final List b() {
        return this.f16058b;
    }

    public final String c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int lastIndex = CollectionsKt.getLastIndex(this.f16058b);
        if (lastIndex < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            C2016h c2016h = (C2016h) this.f16058b.get(i10);
            if (StringsKt.equals(c2016h.a(), name, true)) {
                return c2016h.b();
            }
            if (i10 == lastIndex) {
                return null;
            }
            i10++;
        }
    }

    public String toString() {
        boolean c10;
        if (this.f16058b.isEmpty()) {
            return this.f16057a;
        }
        int length = this.f16057a.length();
        int i10 = 0;
        int i11 = 0;
        for (C2016h c2016h : this.f16058b) {
            i11 += c2016h.a().length() + c2016h.b().length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + i11);
        sb2.append(this.f16057a);
        int lastIndex = CollectionsKt.getLastIndex(this.f16058b);
        if (lastIndex >= 0) {
            while (true) {
                C2016h c2016h2 = (C2016h) this.f16058b.get(i10);
                sb2.append("; ");
                sb2.append(c2016h2.a());
                sb2.append("=");
                String b10 = c2016h2.b();
                c10 = AbstractC2018j.c(b10);
                if (c10) {
                    sb2.append(AbstractC2018j.d(b10));
                } else {
                    sb2.append(b10);
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "{\n            val size =…   }.toString()\n        }");
        return sb3;
    }
}
