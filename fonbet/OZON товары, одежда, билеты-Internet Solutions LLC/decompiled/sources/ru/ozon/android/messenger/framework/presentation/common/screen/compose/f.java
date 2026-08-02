package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.models.C9514a;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9514a f91072b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f91073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(C9514a c9514a, d dVar) {
        super(0);
        this.f91072b = c9514a;
        this.f91073c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Iterator<T> it = this.f91072b.c().iterator();
        while (it.hasNext()) {
            CommonControlSettings common = ((CellDTO) it.next()).getCommon();
            if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
                this.f91073c.w().s(ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo));
            }
        }
        return Unit.f71690a;
    }
}
