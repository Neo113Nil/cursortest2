package io.ktor.utils.io.jvm.javaio;

import Ph.C0;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import zi.AbstractC7016b;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f49501a = LazyKt.lazy(a.f49504d);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f49502b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f49503c = new Object();

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f49504d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7015a invoke() {
            return AbstractC7016b.i(io.ktor.utils.io.jvm.javaio.a.class);
        }
    }

    public static final InterfaceC7015a b() {
        return (InterfaceC7015a) f49501a.getValue();
    }

    public static final InputStream c(io.ktor.utils.io.f fVar, C0 c02) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new d(c02, fVar);
    }

    public static /* synthetic */ InputStream d(io.ktor.utils.io.f fVar, C0 c02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c02 = null;
        }
        return c(fVar, c02);
    }
}
