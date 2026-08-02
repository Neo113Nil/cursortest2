package com.plaid.internal;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3550a0 extends Lambda implements Function0<SimpleDateFormat> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3560b0 f39816a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3550a0(C3560b0 c3560b0) {
        super(0);
        this.f39816a = c3560b0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SimpleDateFormat invoke() {
        this.f39816a.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSZ", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("gmt"));
        return simpleDateFormat;
    }
}
