package Lc;

import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;

/* loaded from: classes4.dex */
public final class i implements ReactPointerEventsView {

    /* renamed from: a, reason: collision with root package name */
    public h f7158a;

    public i(h hVar) {
        this.f7158a = hVar;
    }

    public final void a(h hVar) {
        this.f7158a = hVar;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        PointerEvents pointerEvents;
        h hVar = this.f7158a;
        return (hVar == null || (pointerEvents = hVar.getPointerEvents()) == null) ? PointerEvents.NONE : pointerEvents;
    }
}
