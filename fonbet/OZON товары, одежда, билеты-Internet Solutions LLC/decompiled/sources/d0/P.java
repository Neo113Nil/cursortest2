package d0;

import android.media.metrics.PlaybackErrorEvent;
import org.maplibre.android.snapshotter.MapSnapshotter;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarStickyWidgetViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarVO;

/* loaded from: classes8.dex */
public final /* synthetic */ class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60858c;

    public /* synthetic */ P(int i11, Object obj, Object obj2) {
        this.f60856a = i11;
        this.f60857b = obj;
        this.f60858c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60856a) {
            case 0:
                ((InterfaceC6000k) this.f60857b).d((C5998i) this.f60858c);
                break;
            case 1:
                RailwayScrollPriceCalendarStickyWidgetViewHolder.bind$lambda$3$lambda$2((RailwayScrollPriceCalendarVO) this.f60857b, (RailwayScrollPriceCalendarStickyWidgetViewHolder) this.f60858c);
                break;
            case 2:
                ((MapSnapshotter) this.f60857b).getClass();
                break;
            default:
                ((u3.N) this.f60857b).f99771d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f60858c);
                break;
        }
    }
}
