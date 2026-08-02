package ru.ozon.android.messenger.framework.presentation.ai;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a;

/* loaded from: classes10.dex */
final class y0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89708b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.d f89709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.navigation.controller.d dVar) {
        super(0);
        this.f89708b = c9414c0;
        this.f89709c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar = this.f89708b.f89506i;
        Map<String, String> a11 = ((d.a) this.f89709c).a();
        if (a11 == null) {
            a11 = kotlin.collections.U.c();
        }
        a.C1665a.a(aVar, a11);
        return Unit.f71690a;
    }
}
