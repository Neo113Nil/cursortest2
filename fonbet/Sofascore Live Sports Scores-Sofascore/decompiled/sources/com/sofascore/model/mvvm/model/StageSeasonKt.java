package com.sofascore.model.mvvm.model;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sportName", "", "Lcom/sofascore/model/mvvm/model/StageSeason;", "getSportName", "(Lcom/sofascore/model/mvvm/model/StageSeason;)Ljava/lang/String;", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StageSeasonKt {
    @Nullable
    public static final String getSportName(@Nullable StageSeason stageSeason) {
        UniqueStage uniqueStage;
        if (stageSeason == null || (uniqueStage = stageSeason.getUniqueStage()) == null) {
            return null;
        }
        return uniqueStage.getSportSlug();
    }
}
