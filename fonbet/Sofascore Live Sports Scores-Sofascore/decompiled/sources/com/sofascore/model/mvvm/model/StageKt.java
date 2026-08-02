package com.sofascore.model.mvvm.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toStage", "Lcom/sofascore/model/mvvm/model/Stage;", "Lcom/sofascore/model/mvvm/model/StageEvent;", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StageKt {
    @NotNull
    public static final Stage toStage(@NotNull StageEvent stageEvent) {
        stageEvent.getClass();
        String description = stageEvent.getDescription();
        if (description == null) {
            description = "";
        }
        Stage stage = new Stage(description, null, null, stageEvent.getId(), null, stageEvent.getFlag());
        Long startTimestamp = stageEvent.getStartTimestamp();
        stage.setStartDateTimestamp(startTimestamp != null ? startTimestamp.longValue() : 0L);
        return stage;
    }
}
