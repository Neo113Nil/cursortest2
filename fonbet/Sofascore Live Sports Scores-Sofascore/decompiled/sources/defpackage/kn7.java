package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kn7 implements v6d {
    public final HashMap a;

    public kn7(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, int i, int i2, FantasyCompetitionType fantasyCompetitionType, boolean z) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel);
        hashMap.put("roundId", Integer.valueOf(i));
        hashMap.put("competitionId", Integer.valueOf(i2));
        if (fantasyCompetitionType == null) {
            a70.p("Argument \"competitionType\" is marked as non-null but was passed a null value.");
            throw null;
        }
        hashMap.put("competitionType", fantasyCompetitionType);
        hashMap.put("tripleCaptain", Boolean.valueOf(z));
    }

    @Override // defpackage.v6d
    public final int a() {
        return R.id.action_squad_to_player_dialog;
    }

    public final boolean b() {
        return ((Boolean) this.a.get("assetsRestricted")).booleanValue();
    }

    public final int c() {
        return ((Integer) this.a.get("competitionId")).intValue();
    }

    public final FantasyCompetitionType d() {
        return (FantasyCompetitionType) this.a.get("competitionType");
    }

    public final FantasyRoundPlayerUiModel e() {
        return (FantasyRoundPlayerUiModel) this.a.get(SearchResponseKt.PLAYER_ENTITY);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kn7.class != obj.getClass()) {
            return false;
        }
        kn7 kn7Var = (kn7) obj;
        HashMap hashMap = kn7Var.a;
        HashMap hashMap2 = this.a;
        if (hashMap2.containsKey(SearchResponseKt.PLAYER_ENTITY) != hashMap.containsKey(SearchResponseKt.PLAYER_ENTITY)) {
            return false;
        }
        if (e() != null) {
            if (!e().equals(kn7Var.e())) {
                return false;
            }
        } else if (kn7Var.e() != null) {
            return false;
        }
        if (hashMap2.containsKey("roundId") != hashMap.containsKey("roundId") || f() != kn7Var.f() || hashMap2.containsKey("competitionId") != hashMap.containsKey("competitionId") || c() != kn7Var.c() || hashMap2.containsKey("competitionType") != hashMap.containsKey("competitionType")) {
            return false;
        }
        if (d() != null) {
            if (!d().equals(kn7Var.d())) {
                return false;
            }
        } else if (kn7Var.d() != null) {
            return false;
        }
        return hashMap2.containsKey("tripleCaptain") == hashMap.containsKey("tripleCaptain") && g() == kn7Var.g() && hashMap2.containsKey("assetsRestricted") == hashMap.containsKey("assetsRestricted") && b() == kn7Var.b();
    }

    public final int f() {
        return ((Integer) this.a.get("roundId")).intValue();
    }

    public final boolean g() {
        return ((Boolean) this.a.get("tripleCaptain")).booleanValue();
    }

    @Override // defpackage.v6d
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.a;
        if (hashMap.containsKey(SearchResponseKt.PLAYER_ENTITY)) {
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) hashMap.get(SearchResponseKt.PLAYER_ENTITY);
            if (Parcelable.class.isAssignableFrom(FantasyRoundPlayerUiModel.class) || fantasyRoundPlayerUiModel == null) {
                bundle.putParcelable(SearchResponseKt.PLAYER_ENTITY, (Parcelable) Parcelable.class.cast(fantasyRoundPlayerUiModel));
            } else {
                if (!Serializable.class.isAssignableFrom(FantasyRoundPlayerUiModel.class)) {
                    a70.m(FantasyRoundPlayerUiModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    return null;
                }
                bundle.putSerializable(SearchResponseKt.PLAYER_ENTITY, (Serializable) Serializable.class.cast(fantasyRoundPlayerUiModel));
            }
        }
        if (hashMap.containsKey("roundId")) {
            bundle.putInt("roundId", ((Integer) hashMap.get("roundId")).intValue());
        }
        if (hashMap.containsKey("competitionId")) {
            bundle.putInt("competitionId", ((Integer) hashMap.get("competitionId")).intValue());
        }
        if (hashMap.containsKey("competitionType")) {
            FantasyCompetitionType fantasyCompetitionType = (FantasyCompetitionType) hashMap.get("competitionType");
            if (Parcelable.class.isAssignableFrom(FantasyCompetitionType.class) || fantasyCompetitionType == null) {
                bundle.putParcelable("competitionType", (Parcelable) Parcelable.class.cast(fantasyCompetitionType));
            } else {
                if (!Serializable.class.isAssignableFrom(FantasyCompetitionType.class)) {
                    a70.m(FantasyCompetitionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    return null;
                }
                bundle.putSerializable("competitionType", (Serializable) Serializable.class.cast(fantasyCompetitionType));
            }
        }
        if (hashMap.containsKey("tripleCaptain")) {
            bundle.putBoolean("tripleCaptain", ((Boolean) hashMap.get("tripleCaptain")).booleanValue());
        }
        if (hashMap.containsKey("assetsRestricted")) {
            bundle.putBoolean("assetsRestricted", ((Boolean) hashMap.get("assetsRestricted")).booleanValue());
            return bundle;
        }
        bundle.putBoolean("assetsRestricted", false);
        return bundle;
    }

    public final int hashCode() {
        return (((b() ? 1 : 0) + (((g() ? 1 : 0) + ((((c() + ((f() + (((e() != null ? e().hashCode() : 0) + 31) * 31)) * 31)) * 31) + (d() != null ? d().hashCode() : 0)) * 31)) * 31)) * 31) + R.id.action_squad_to_player_dialog;
    }

    public final String toString() {
        return "ActionSquadToPlayerDialog(actionId=2131361878){player=" + e() + ", roundId=" + f() + ", competitionId=" + c() + ", competitionType=" + d() + ", tripleCaptain=" + g() + ", assetsRestricted=" + b() + "}";
    }
}
