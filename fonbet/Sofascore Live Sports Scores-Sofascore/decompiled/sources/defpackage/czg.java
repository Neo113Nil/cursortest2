package defpackage;

import com.sofascore.model.network.response.SearchResponseKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public enum czg {
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER(SearchResponseKt.PLAYER_ENTITY),
    /* JADX INFO: Fake field, exist only in values array */
    TEAM("team");

    public final String a;

    czg(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
