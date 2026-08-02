package defpackage;

import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.UniqueTournament;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class erj extends ml4 {
    public final /* synthetic */ int w;
    public final /* synthetic */ irj x;

    public /* synthetic */ erj(irj irjVar, int i) {
        this.w = i;
        this.x = irjVar;
    }

    @Override // defpackage.ml4
    public final void J(nlg nlgVar, Object obj) {
        int i = this.w;
        irj irjVar = this.x;
        switch (i) {
            case 0:
                PinnedTournament pinnedTournament = (PinnedTournament) obj;
                sz8 sz8Var = irjVar.d;
                nlgVar.getClass();
                pinnedTournament.getClass();
                nlgVar.q(1, pinnedTournament.getId());
                String name = pinnedTournament.getName();
                if (name == null) {
                    nlgVar.s(2);
                } else {
                    nlgVar.L(2, name);
                }
                nlgVar.q(3, pinnedTournament.getOrderIndex());
                Category category = pinnedTournament.getCategory();
                nlgVar.q(4, category.getId());
                nlgVar.L(5, category.getName());
                nlgVar.L(6, category.getFlag());
                Sport sport = category.getSport();
                nlgVar.q(7, sport.getId());
                nlgVar.L(8, sport.getSlug());
                FieldTranslations fieldTranslations = category.getFieldTranslations();
                if (fieldTranslations != null) {
                    String v = sz8Var.v(fieldTranslations.getNameTranslation());
                    if (v == null) {
                        nlgVar.s(9);
                    } else {
                        nlgVar.L(9, v);
                    }
                    String v2 = sz8Var.v(fieldTranslations.getShortNameTranslation());
                    if (v2 == null) {
                        nlgVar.s(10);
                    } else {
                        nlgVar.L(10, v2);
                    }
                } else {
                    nlgVar.s(9);
                    nlgVar.s(10);
                }
                FieldTranslations fieldTranslations2 = pinnedTournament.getFieldTranslations();
                if (fieldTranslations2 == null) {
                    nlgVar.s(11);
                    nlgVar.s(12);
                    break;
                } else {
                    String v3 = sz8Var.v(fieldTranslations2.getNameTranslation());
                    if (v3 == null) {
                        nlgVar.s(11);
                    } else {
                        nlgVar.L(11, v3);
                    }
                    String v4 = sz8Var.v(fieldTranslations2.getShortNameTranslation());
                    if (v4 != null) {
                        nlgVar.L(12, v4);
                        break;
                    } else {
                        nlgVar.s(12);
                        break;
                    }
                }
            default:
                UniqueTournament uniqueTournament = (UniqueTournament) obj;
                sz8 sz8Var2 = irjVar.d;
                nlgVar.getClass();
                uniqueTournament.getClass();
                nlgVar.q(1, uniqueTournament.getId());
                String name2 = uniqueTournament.getName();
                if (name2 == null) {
                    nlgVar.s(2);
                } else {
                    nlgVar.L(2, name2);
                }
                nlgVar.q(3, uniqueTournament.getUserCount());
                nlgVar.q(4, uniqueTournament.getHasEventPlayerStatistics() ? 1L : 0L);
                Boolean hasBoxScore = uniqueTournament.getHasBoxScore();
                if ((hasBoxScore != null ? Integer.valueOf(hasBoxScore.booleanValue() ? 1 : 0) : null) == null) {
                    nlgVar.s(5);
                } else {
                    nlgVar.q(5, r3.intValue());
                }
                nlgVar.q(6, uniqueTournament.getDisplayInverseHomeAwayTeams() ? 1L : 0L);
                String groundType = uniqueTournament.getGroundType();
                if (groundType == null) {
                    nlgVar.s(7);
                } else {
                    nlgVar.L(7, groundType);
                }
                if (uniqueTournament.getTennisPoints() == null) {
                    nlgVar.s(8);
                } else {
                    nlgVar.q(8, r3.intValue());
                }
                Gender gender = uniqueTournament.getGender();
                if (gender == null) {
                    nlgVar.s(9);
                } else {
                    nlgVar.L(9, irj.a(gender));
                }
                Category category2 = uniqueTournament.getCategory();
                nlgVar.q(10, category2.getId());
                nlgVar.L(11, category2.getName());
                nlgVar.L(12, category2.getFlag());
                Sport sport2 = category2.getSport();
                nlgVar.q(13, sport2.getId());
                nlgVar.L(14, sport2.getSlug());
                FieldTranslations fieldTranslations3 = category2.getFieldTranslations();
                if (fieldTranslations3 != null) {
                    String v5 = sz8Var2.v(fieldTranslations3.getNameTranslation());
                    if (v5 == null) {
                        nlgVar.s(15);
                    } else {
                        nlgVar.L(15, v5);
                    }
                    String v6 = sz8Var2.v(fieldTranslations3.getShortNameTranslation());
                    if (v6 == null) {
                        nlgVar.s(16);
                    } else {
                        nlgVar.L(16, v6);
                    }
                } else {
                    nlgVar.s(15);
                    nlgVar.s(16);
                }
                FieldTranslations fieldTranslations4 = uniqueTournament.getFieldTranslations();
                if (fieldTranslations4 == null) {
                    nlgVar.s(17);
                    nlgVar.s(18);
                    break;
                } else {
                    String v7 = sz8Var2.v(fieldTranslations4.getNameTranslation());
                    if (v7 == null) {
                        nlgVar.s(17);
                    } else {
                        nlgVar.L(17, v7);
                    }
                    String v8 = sz8Var2.v(fieldTranslations4.getShortNameTranslation());
                    if (v8 != null) {
                        nlgVar.L(18, v8);
                        break;
                    } else {
                        nlgVar.s(18);
                        break;
                    }
                }
        }
    }

    @Override // defpackage.ml4
    public final String O() {
        switch (this.w) {
            case 0:
                return "INSERT OR REPLACE INTO `pinned_tournaments_table` (`id`,`name`,`orderIndex`,`category_id`,`category_name`,`category_flag`,`category_sport_id`,`category_sport_slug`,`category_nameTranslation`,`category_shortNameTranslation`,`nameTranslation`,`shortNameTranslation`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT INTO `leagues` (`id`,`name`,`userCount`,`hasEventPlayerStatistics`,`hasBoxScore`,`displayInverseHomeAwayTeams`,`groundType`,`tennisPoints`,`gender`,`category_id`,`category_name`,`category_flag`,`category_sport_id`,`category_sport_slug`,`category_nameTranslation`,`category_shortNameTranslation`,`nameTranslation`,`shortNameTranslation`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
