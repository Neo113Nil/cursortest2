package defpackage;

import com.sofascore.model.network.response.SearchResponseKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public enum xu {
    EVENT("event"),
    STAGE("stage"),
    TEAM("team"),
    PLAYER(SearchResponseKt.PLAYER_ENTITY),
    UNIQUE_TOURNAMENT("unique_tournament"),
    UNIQUE_STAGE("unique_stage"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBSTAGE("substage"),
    CONSTRUCTOR("constructor");

    public final String a;

    xu(String str) {
        this.a = str;
    }
}
