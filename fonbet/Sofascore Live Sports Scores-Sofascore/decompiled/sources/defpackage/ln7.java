package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ln7 implements v6d {
    public final HashMap a;

    public ln7(int i, int i2) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        ljg.s(i, i2, "roundId", "competitionId", hashMap);
    }

    @Override // defpackage.v6d
    public final int a() {
        return R.id.action_squad_to_select_replacement;
    }

    public final int b() {
        return ((Integer) this.a.get("competitionId")).intValue();
    }

    public final FantasyRoundPlayerUiModel c() {
        return (FantasyRoundPlayerUiModel) this.a.get(SearchResponseKt.PLAYER_ENTITY);
    }

    public final int d() {
        return ((Integer) this.a.get("roundId")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ln7.class != obj.getClass()) {
            return false;
        }
        ln7 ln7Var = (ln7) obj;
        HashMap hashMap = ln7Var.a;
        HashMap hashMap2 = this.a;
        if (hashMap2.containsKey("roundId") == hashMap.containsKey("roundId") && d() == ln7Var.d() && hashMap2.containsKey("competitionId") == hashMap.containsKey("competitionId") && b() == ln7Var.b() && hashMap2.containsKey(SearchResponseKt.PLAYER_ENTITY) == hashMap.containsKey(SearchResponseKt.PLAYER_ENTITY)) {
            return c() != null ? c().equals(ln7Var.c()) : ln7Var.c() == null;
        }
        return false;
    }

    @Override // defpackage.v6d
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.a;
        if (hashMap.containsKey("roundId")) {
            bundle.putInt("roundId", ((Integer) hashMap.get("roundId")).intValue());
        }
        if (hashMap.containsKey("competitionId")) {
            bundle.putInt("competitionId", ((Integer) hashMap.get("competitionId")).intValue());
        }
        if (!hashMap.containsKey(SearchResponseKt.PLAYER_ENTITY)) {
            bundle.putSerializable(SearchResponseKt.PLAYER_ENTITY, null);
            return bundle;
        }
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) hashMap.get(SearchResponseKt.PLAYER_ENTITY);
        if (Parcelable.class.isAssignableFrom(FantasyRoundPlayerUiModel.class) || fantasyRoundPlayerUiModel == null) {
            bundle.putParcelable(SearchResponseKt.PLAYER_ENTITY, (Parcelable) Parcelable.class.cast(fantasyRoundPlayerUiModel));
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(FantasyRoundPlayerUiModel.class)) {
            bundle.putSerializable(SearchResponseKt.PLAYER_ENTITY, (Serializable) Serializable.class.cast(fantasyRoundPlayerUiModel));
            return bundle;
        }
        a70.m(FantasyRoundPlayerUiModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        return null;
    }

    public final int hashCode() {
        return ((((b() + ((d() + 31) * 31)) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + R.id.action_squad_to_select_replacement;
    }

    public final String toString() {
        return "ActionSquadToSelectReplacement(actionId=2131361880){roundId=" + d() + ", competitionId=" + b() + ", player=" + c() + "}";
    }
}
