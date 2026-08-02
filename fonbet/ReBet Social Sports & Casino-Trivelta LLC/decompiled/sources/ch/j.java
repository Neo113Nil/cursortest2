package ch;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f27827a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27828b;

    public j(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f27827a = content;
        String lowerCase = content.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f27828b = lowerCase.hashCode();
    }

    public final String a() {
        return this.f27827a;
    }

    public boolean equals(Object obj) {
        String str;
        j jVar = obj instanceof j ? (j) obj : null;
        return (jVar == null || (str = jVar.f27827a) == null || !StringsKt.equals(str, this.f27827a, true)) ? false : true;
    }

    public int hashCode() {
        return this.f27828b;
    }

    public String toString() {
        return this.f27827a;
    }
}
