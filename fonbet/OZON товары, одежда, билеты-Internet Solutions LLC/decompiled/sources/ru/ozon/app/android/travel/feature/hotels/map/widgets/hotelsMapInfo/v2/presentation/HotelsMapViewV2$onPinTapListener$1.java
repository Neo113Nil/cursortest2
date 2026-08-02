package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import WZ.l;
import WZ.t;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "pinId", "", "isIndivisibleCluster", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "invoke", "(Ljava/lang/String;Ljava/lang/Boolean;LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsMapViewV2$onPinTapListener$1 extends AbstractC7737t implements InterfaceC6511n<String, Boolean, t, Unit> {
    final /* synthetic */ HotelsMapViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapViewV2$onPinTapListener$1(HotelsMapViewV2 hotelsMapViewV2) {
        super(3);
        this.this$0 = hotelsMapViewV2;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool, t tVar) {
        invoke2(str, bool, tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, Boolean bool, t tVar) {
        l lVar;
        String str2;
        boolean z11;
        boolean z12 = true;
        if (str != null) {
            HotelsMapViewV2 hotelsMapViewV2 = this.this$0;
            if (!Intrinsics.d(bool, Boolean.FALSE)) {
                str2 = hotelsMapViewV2.previousClickedPinId;
                if (Intrinsics.d(str2, str)) {
                    z11 = hotelsMapViewV2.previousClickedPinSelection;
                    z12 = true ^ z11;
                }
            } else if (h.t(str, "cluster", false)) {
                hotelsMapViewV2.getBottomCardController().slideDown();
            }
        }
        this.this$0.updateMap(z12, str);
        if (tVar != null) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tVar, null, 2, null);
        }
        this.this$0.previousClickedPinId = str;
    }
}
