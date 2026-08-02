package hz;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.marketing.widgets.badgeTimer.di.BadgeTimerComponent;
import ru.ozon.app.android.marketing.widgets.badgeTimer.presentation.BadgeTimerViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.di.TravelTrainRouteComponent;

/* renamed from: hz.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C6976a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65644a;

    public /* synthetic */ C6976a(int i11) {
        this.f65644a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        BadgeTimerComponent widgetComponent$lambda$0;
        TravelTrainRouteComponent create$lambda$0;
        switch (this.f65644a) {
            case 0:
                widgetComponent$lambda$0 = BadgeTimerViewMapper.widgetComponent$lambda$0();
                return widgetComponent$lambda$0;
            default:
                create$lambda$0 = TravelTrainRouteComponent.Companion.create$lambda$0();
                return create$lambda$0;
        }
    }
}
