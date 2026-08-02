package io.sentry.android.replay;

import I1.C;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C<String> f67659a = new C<>("SentryPrivacy", a.f67660b);

    static final class a extends AbstractC7737t implements Function2<String, String, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f67660b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            String str3 = str;
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            return str3;
        }
    }

    @NotNull
    public static C a() {
        return f67659a;
    }
}
