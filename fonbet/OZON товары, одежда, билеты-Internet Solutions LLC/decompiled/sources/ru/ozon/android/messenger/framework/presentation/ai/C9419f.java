package ru.ozon.android.messenger.framework.presentation.ai;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9419f extends AbstractC7737t implements Function1<Map<String, ? extends MessengerTrackingInfo>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9413c f89600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9419f(C9413c c9413c) {
        super(1);
        this.f89600b = c9413c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends MessengerTrackingInfo> map) {
        Map<String, ? extends MessengerTrackingInfo> map2 = map;
        if (map2 != null) {
            ru.ozon.android.messenger.framework.navigation.controller.a aVar = this.f89600b.f89420d;
            if (aVar == 0) {
                Intrinsics.n("controller");
                throw null;
            }
            aVar.m(map2);
        }
        return Unit.f71690a;
    }
}
