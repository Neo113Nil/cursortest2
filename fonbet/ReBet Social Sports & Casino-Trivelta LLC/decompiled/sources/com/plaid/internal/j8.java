package com.plaid.internal;

import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class j8 extends Lambda implements Function0<Locale> {

    /* renamed from: a, reason: collision with root package name */
    public static final j8 f40711a = new j8();

    public j8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Locale invoke() {
        return Locale.getDefault();
    }
}
