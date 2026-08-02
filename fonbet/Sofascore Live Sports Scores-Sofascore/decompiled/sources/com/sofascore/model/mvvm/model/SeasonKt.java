package com.sofascore.model.mvvm.model;

import com.sofascore.model.mvvm.model.Season;
import defpackage.me4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"mapToSubSeasonType", "", "Lcom/sofascore/model/mvvm/model/Season$SubSeasonType;", "subSeasonTypeList", "", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SeasonKt {
    @NotNull
    public static final List<Season.SubSeasonType> mapToSubSeasonType(@NotNull List<String> list) {
        ArrayList k = me4.k(list);
        for (String str : list) {
            Season.SubSeasonType subSeasonType = Season.SubSeasonType.REGULAR_SEASON;
            if (Intrinsics.c(str, subSeasonType.getLabel())) {
                k.add(subSeasonType);
            }
            Season.SubSeasonType subSeasonType2 = Season.SubSeasonType.PLAYOFFS;
            if (Intrinsics.c(str, subSeasonType2.getLabel())) {
                k.add(subSeasonType2);
            }
            Season.SubSeasonType subSeasonType3 = Season.SubSeasonType.OVERALL;
            if (Intrinsics.c(str, subSeasonType3.getLabel())) {
                k.add(subSeasonType3);
            }
            Season.SubSeasonType subSeasonType4 = Season.SubSeasonType.TOP16;
            if (Intrinsics.c(str, subSeasonType4.getLabel())) {
                k.add(subSeasonType4);
            }
        }
        return k;
    }
}
