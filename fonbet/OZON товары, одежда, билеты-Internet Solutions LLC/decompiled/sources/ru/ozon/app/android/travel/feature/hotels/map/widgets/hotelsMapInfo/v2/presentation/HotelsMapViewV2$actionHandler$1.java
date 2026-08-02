package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.utils.PermissionExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "clickAction", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapViewV2$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ HotelsMapViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapViewV2$actionHandler$1(HotelsMapViewV2 hotelsMapViewV2) {
        super(1);
        this.this$0 = hotelsMapViewV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        r2 = r1.this$0.activity;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(AtomAction.Click clickAction) {
        r rVar;
        Function0<Unit> onCurrentLocationAction;
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        String id2 = clickAction.getId();
        if (id2 != null) {
            switch (id2.hashCode()) {
                case -1869784889:
                    if (id2.equals("travelOpenSettings") && rVar != null) {
                        PermissionExtKt.openAppSettings(rVar);
                        break;
                    }
                    break;
                case -696286120:
                    if (id2.equals("zoomIn")) {
                        this.this$0.onZoomInControlClicked();
                        break;
                    }
                    break;
                case -110027141:
                    if (id2.equals("zoomOut")) {
                        this.this$0.onZoomOutControlClicked();
                        break;
                    }
                    break;
                case 66670086:
                    if (id2.equals("geolocation") && (onCurrentLocationAction = this.this$0.getOnCurrentLocationAction()) != null) {
                        onCurrentLocationAction.invoke();
                        break;
                    }
                    break;
            }
        }
    }
}
