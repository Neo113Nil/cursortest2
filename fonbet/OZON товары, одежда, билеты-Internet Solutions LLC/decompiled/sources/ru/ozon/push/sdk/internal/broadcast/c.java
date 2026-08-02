package ru.ozon.push.sdk.internal.broadcast;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    public static final c f97693b = new c(0);

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ String invoke() {
        return "OzonPush isn’t initialized when trying to clear notifications.";
    }
}
