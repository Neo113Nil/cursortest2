package bh;

import ah.AbstractC2012d;
import ah.C2011c;
import ah.v;
import bh.AbstractC2423b;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import jh.AbstractC5135a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* renamed from: bh.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2424c extends AbstractC2423b.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f25190a;

    /* renamed from: b, reason: collision with root package name */
    public final C2011c f25191b;

    @NotNull
    private final byte[] bytes;

    /* renamed from: c, reason: collision with root package name */
    public final v f25192c;

    public /* synthetic */ C2424c(String str, C2011c c2011c, v vVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c2011c, (i10 & 4) != 0 ? null : vVar);
    }

    @Override // bh.AbstractC2423b
    public Long a() {
        return Long.valueOf(this.bytes.length);
    }

    @Override // bh.AbstractC2423b
    public C2011c b() {
        return this.f25191b;
    }

    @Override // bh.AbstractC2423b.a
    public byte[] d() {
        return this.bytes;
    }

    public String toString() {
        return "TextContent[" + b() + "] \"" + StringsKt.take(this.f25190a, 30) + Typography.quote;
    }

    public C2424c(String text, C2011c contentType, v vVar) {
        byte[] g10;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f25190a = text;
        this.f25191b = contentType;
        this.f25192c = vVar;
        Charset a10 = AbstractC2012d.a(b());
        a10 = a10 == null ? Charsets.UTF_8 : a10;
        if (Intrinsics.areEqual(a10, Charsets.UTF_8)) {
            g10 = StringsKt.encodeToByteArray(text);
        } else {
            CharsetEncoder newEncoder = a10.newEncoder();
            Intrinsics.checkNotNullExpressionValue(newEncoder, "charset.newEncoder()");
            g10 = AbstractC5135a.g(newEncoder, text, 0, text.length());
        }
        this.bytes = g10;
    }
}
