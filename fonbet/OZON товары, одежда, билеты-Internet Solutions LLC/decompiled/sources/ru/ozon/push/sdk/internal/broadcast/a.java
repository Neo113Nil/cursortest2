package ru.ozon.push.sdk.internal.broadcast;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f97691b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(int i11) {
        super(0);
        this.f97691b = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return K00.b.e(this.f97691b, " notifications after the app has been updated.", new StringBuilder("There are "));
    }
}
