package defpackage;

import com.sofascore.model.network.response.SearchResponseKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public enum vv {
    EVENT("event"),
    STAGE("stage"),
    TEAM("team"),
    PLAYER(SearchResponseKt.PLAYER_ENTITY),
    CONSTRUCTOR("constructor"),
    UNIQUE_TOURNAMENT("unique_tournament"),
    MANAGER(SearchResponseKt.MANAGER_ENTITY),
    REFEREE(SearchResponseKt.REFEREE_ENTITY),
    UNIQUE_STAGE("unique_stage");

    public final String a;

    vv(String str) {
        this.a = str;
    }
}
