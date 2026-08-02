package Zh;

import di.AbstractC4079b;
import di.AbstractC4081c;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes5.dex */
public abstract class h {
    public static final InterfaceC1900a a(AbstractC4079b abstractC4079b, ci.c decoder, String str) {
        Intrinsics.checkNotNullParameter(abstractC4079b, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC1900a d10 = abstractC4079b.d(decoder, str);
        if (d10 != null) {
            return d10;
        }
        AbstractC4081c.a(str, abstractC4079b.f());
        throw new KotlinNothingValueException();
    }

    public static final p b(AbstractC4079b abstractC4079b, ci.f encoder, Object value) {
        Intrinsics.checkNotNullParameter(abstractC4079b, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        p e10 = abstractC4079b.e(encoder, value);
        if (e10 != null) {
            return e10;
        }
        AbstractC4081c.b(Reflection.getOrCreateKotlinClass(value.getClass()), abstractC4079b.f());
        throw new KotlinNothingValueException();
    }
}
