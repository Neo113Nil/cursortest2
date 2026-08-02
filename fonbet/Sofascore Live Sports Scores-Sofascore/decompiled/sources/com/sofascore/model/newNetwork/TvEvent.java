package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.TvChannel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/newNetwork/TvEvent;", "Lcom/sofascore/model/newNetwork/BaseTvEvent;", "tvChannel", "Lcom/sofascore/model/mvvm/model/TvChannel;", "event", "Lcom/sofascore/model/mvvm/model/Event;", "<init>", "(Lcom/sofascore/model/mvvm/model/TvChannel;Lcom/sofascore/model/mvvm/model/Event;)V", "getEvent", "()Lcom/sofascore/model/mvvm/model/Event;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TvEvent extends BaseTvEvent {

    @NotNull
    private final Event event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TvEvent(@NotNull TvChannel tvChannel, @NotNull Event event) {
        super(tvChannel);
        tvChannel.getClass();
        event.getClass();
        this.event = event;
    }

    @NotNull
    public final Event getEvent() {
        return this.event;
    }
}
