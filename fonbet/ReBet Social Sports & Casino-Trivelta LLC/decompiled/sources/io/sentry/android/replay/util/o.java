package io.sentry.android.replay.util;

import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f51788a = new o();

    public final boolean a() {
        return StringsKt.equals("true", System.getProperty("io.sentry.replay.compose.fail-fast"), true);
    }
}
