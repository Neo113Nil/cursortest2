package q10;

import D00.g;
import android.view.View;
import java.util.Map;
import q10.C8976d;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* renamed from: q10.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8974b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81381a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81383c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f81384d;

    public /* synthetic */ ViewOnClickListenerC8974b(g.b bVar, C8976d.a aVar, C8976d c8976d) {
        this.f81382b = aVar;
        this.f81383c = bVar;
        this.f81384d = c8976d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f81381a) {
            case 0:
                C8976d c8976d = (C8976d) this.f81384d;
                C8976d.a.f((g.b) this.f81383c, (C8976d.a) this.f81382b, c8976d);
                break;
            default:
                Map<String, MessengerTrackingInfo> f7 = ((ru.ozon.android.messenger.blocks.order.b) this.f81382b).f();
                ru.ozon.android.messenger.framework.core.d dVar = (ru.ozon.android.messenger.framework.core.d) this.f81383c;
                if (f7 != null) {
                    dVar.c().m(f7);
                }
                dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c((AtomActionDTO) this.f81384d));
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC8974b(ru.ozon.android.messenger.blocks.order.c cVar, ru.ozon.android.messenger.blocks.order.b bVar, ru.ozon.android.messenger.framework.core.d dVar, AtomActionDTO atomActionDTO) {
        this.f81382b = bVar;
        this.f81383c = dVar;
        this.f81384d = atomActionDTO;
    }
}
