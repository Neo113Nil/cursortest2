package io.sentry.android.replay;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f51751a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final Z.h f51752b = new Z.h("SentryPrivacy", a.f51754d);

    /* renamed from: c, reason: collision with root package name */
    public static final int f51753c = Z.h.f14420c;

    public static final class a extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f51754d = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            return str;
        }
    }

    public final Z.h a() {
        return f51752b;
    }
}
