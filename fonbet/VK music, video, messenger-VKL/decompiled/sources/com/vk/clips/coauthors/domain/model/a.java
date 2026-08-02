package com.vk.clips.coauthors.domain.model;

import com.vk.clips.coauthors.domain.model.Restriction;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.drm0;
import xsna.fkq0;
import xsna.j5g;

/* compiled from: ClipsCoauthorsModelMappers.kt */
/* loaded from: classes16.dex */
public final class a {
    public static final ClipsCoauthorSelectorUserItem a(ClipsCoauthorsSelectInputModel clipsCoauthorsSelectInputModel) {
        String str;
        List c0 = drm0.c0(clipsCoauthorsSelectInputModel.c, new String[]{" "}, 0, 6);
        UserId userId = clipsCoauthorsSelectInputModel.b;
        String str2 = fkq0.b(userId) ? clipsCoauthorsSelectInputModel.c : (String) j5g.Y(c0);
        if (fkq0.b(userId)) {
            str = "";
        } else {
            str = (String) (1 < c0.size() ? c0.get(1) : "");
        }
        return new ClipsCoauthorSelectorUserItem(userId, str2, str, clipsCoauthorsSelectInputModel.d, new Restriction.None(""), clipsCoauthorsSelectInputModel.e, clipsCoauthorsSelectInputModel.f);
    }
}
