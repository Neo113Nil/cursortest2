package rl0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: rl0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9297h extends AbstractC7737t implements Function1<Byte, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final C9297h f83683b = new C9297h(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Byte b11) {
        return V.e.b(new Object[]{Byte.valueOf(b11.byteValue())}, 1, "%02x", "format(this, *args)");
    }
}
