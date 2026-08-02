package ru.ozon.android.messenger.framework.analytics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ActionType f86576a;

    /* renamed from: b, reason: collision with root package name */
    private final EventEntity.Obj f86577b;

    /* renamed from: c, reason: collision with root package name */
    private final EventEntity.Properties f86578c;

    /* renamed from: d, reason: collision with root package name */
    private final Cell.CustomCell f86579d;

    public d(ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f86576a = actionType;
        this.f86577b = obj;
        this.f86578c = properties;
        this.f86579d = customCell;
    }

    @NotNull
    public final ActionType a() {
        return this.f86576a;
    }

    public final Cell.CustomCell b() {
        return this.f86579d;
    }

    public final EventEntity.Obj c() {
        return this.f86577b;
    }

    public final EventEntity.Properties d() {
        return this.f86578c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f86576a, dVar.f86576a) && this.f86577b.equals(dVar.f86577b) && this.f86578c.equals(dVar.f86578c) && this.f86579d.equals(dVar.f86579d);
    }

    public final int hashCode() {
        return (this.f86579d.hashCode() + ((this.f86578c.hashCode() + ((this.f86577b.hashCode() + (this.f86576a.hashCode() * 31)) * 31)) * 31)) * (-293403007);
    }

    @NotNull
    public final String toString() {
        return "MessengerCustomEvent(actionType=" + this.f86576a + ", obj=" + this.f86577b + ", properties=" + this.f86578c + ", custom=" + this.f86579d + ", widget=null, page=null, uuid=null, form=null, eventError=null, posting=null, filter=null, sale=null, review=null, discountRequestId=null, advertisementCampaignId=null, courier=null)";
    }
}
