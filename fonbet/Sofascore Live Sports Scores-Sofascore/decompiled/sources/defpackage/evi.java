package defpackage;

import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.GenderTypeConverter;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class evi extends td4 {
    public final /* synthetic */ int m;
    public final /* synthetic */ fvi n;

    public /* synthetic */ evi(fvi fviVar, int i) {
        this.m = i;
        this.n = fviVar;
    }

    @Override // defpackage.td4
    public final void R(nlg nlgVar, Object obj) {
        int i = this.m;
        fvi fviVar = this.n;
        switch (i) {
            case 0:
                Team team = (Team) obj;
                sz8 sz8Var = fviVar.d;
                nlgVar.getClass();
                team.getClass();
                nlgVar.q(1, team.getId());
                nlgVar.L(2, team.getName());
                nlgVar.L(3, team.getSlug());
                nlgVar.q(4, team.getUserCount());
                nlgVar.q(5, team.getType());
                String nameCode = team.getNameCode();
                if (nameCode == null) {
                    nlgVar.s(6);
                } else {
                    nlgVar.L(6, nameCode);
                }
                String shortName = team.getShortName();
                if (shortName == null) {
                    nlgVar.s(7);
                } else {
                    nlgVar.L(7, shortName);
                }
                Gender gender = team.getGender();
                String genderToString = gender == null ? null : GenderTypeConverter.genderToString(gender);
                if (genderToString == null) {
                    nlgVar.s(8);
                } else {
                    nlgVar.L(8, genderToString);
                }
                if (team.getRanking() == null) {
                    nlgVar.s(9);
                } else {
                    nlgVar.q(9, r3.intValue());
                }
                nlgVar.q(10, team.getDisabled() ? 1L : 0L);
                nlgVar.q(11, team.getNational() ? 1L : 0L);
                SubTeam subTeam1 = team.getSubTeam1();
                if (subTeam1 != null) {
                    nlgVar.q(12, subTeam1.getId());
                    String name = subTeam1.getName();
                    if (name == null) {
                        nlgVar.s(13);
                    } else {
                        nlgVar.L(13, name);
                    }
                    FieldTranslations fieldTranslations = subTeam1.getFieldTranslations();
                    if (fieldTranslations != null) {
                        String v = sz8Var.v(fieldTranslations.getNameTranslation());
                        if (v == null) {
                            nlgVar.s(14);
                        } else {
                            nlgVar.L(14, v);
                        }
                        String v2 = sz8Var.v(fieldTranslations.getShortNameTranslation());
                        if (v2 == null) {
                            nlgVar.s(15);
                        } else {
                            nlgVar.L(15, v2);
                        }
                    } else {
                        nlgVar.s(14);
                        nlgVar.s(15);
                    }
                } else {
                    me4.m(nlgVar, 12, 13, 14, 15);
                }
                SubTeam subTeam2 = team.getSubTeam2();
                if (subTeam2 != null) {
                    nlgVar.q(16, subTeam2.getId());
                    String name2 = subTeam2.getName();
                    if (name2 == null) {
                        nlgVar.s(17);
                    } else {
                        nlgVar.L(17, name2);
                    }
                    FieldTranslations fieldTranslations2 = subTeam2.getFieldTranslations();
                    if (fieldTranslations2 != null) {
                        String v3 = sz8Var.v(fieldTranslations2.getNameTranslation());
                        if (v3 == null) {
                            nlgVar.s(18);
                        } else {
                            nlgVar.L(18, v3);
                        }
                        String v4 = sz8Var.v(fieldTranslations2.getShortNameTranslation());
                        if (v4 == null) {
                            nlgVar.s(19);
                        } else {
                            nlgVar.L(19, v4);
                        }
                    } else {
                        nlgVar.s(18);
                        nlgVar.s(19);
                    }
                } else {
                    me4.m(nlgVar, 16, 17, 18, 19);
                }
                Sport sport = team.getSport();
                if (sport != null) {
                    nlgVar.q(20, sport.getId());
                    nlgVar.L(21, sport.getSlug());
                } else {
                    nlgVar.s(20);
                    nlgVar.s(21);
                }
                Country country = team.getCountry();
                if (country != null) {
                    String name3 = country.getName();
                    if (name3 == null) {
                        nlgVar.s(22);
                    } else {
                        nlgVar.L(22, name3);
                    }
                    String alpha2 = country.getAlpha2();
                    if (alpha2 == null) {
                        nlgVar.s(23);
                    } else {
                        nlgVar.L(23, alpha2);
                    }
                } else {
                    nlgVar.s(22);
                    nlgVar.s(23);
                }
                FieldTranslations fieldTranslations3 = team.getFieldTranslations();
                if (fieldTranslations3 != null) {
                    String v5 = sz8Var.v(fieldTranslations3.getNameTranslation());
                    if (v5 == null) {
                        nlgVar.s(24);
                    } else {
                        nlgVar.L(24, v5);
                    }
                    String v6 = sz8Var.v(fieldTranslations3.getShortNameTranslation());
                    if (v6 == null) {
                        nlgVar.s(25);
                    } else {
                        nlgVar.L(25, v6);
                    }
                } else {
                    nlgVar.s(24);
                    nlgVar.s(25);
                }
                nlgVar.q(26, team.getId());
                break;
            default:
                Team team2 = (Team) obj;
                sz8 sz8Var2 = fviVar.d;
                nlgVar.getClass();
                team2.getClass();
                nlgVar.q(1, team2.getId());
                nlgVar.L(2, team2.getName());
                nlgVar.L(3, team2.getSlug());
                nlgVar.q(4, team2.getUserCount());
                nlgVar.q(5, team2.getType());
                String nameCode2 = team2.getNameCode();
                if (nameCode2 == null) {
                    nlgVar.s(6);
                } else {
                    nlgVar.L(6, nameCode2);
                }
                String shortName2 = team2.getShortName();
                if (shortName2 == null) {
                    nlgVar.s(7);
                } else {
                    nlgVar.L(7, shortName2);
                }
                Gender gender2 = team2.getGender();
                String genderToString2 = gender2 == null ? null : GenderTypeConverter.genderToString(gender2);
                if (genderToString2 == null) {
                    nlgVar.s(8);
                } else {
                    nlgVar.L(8, genderToString2);
                }
                if (team2.getRanking() == null) {
                    nlgVar.s(9);
                } else {
                    nlgVar.q(9, r3.intValue());
                }
                nlgVar.q(10, team2.getDisabled() ? 1L : 0L);
                nlgVar.q(11, team2.getNational() ? 1L : 0L);
                SubTeam subTeam12 = team2.getSubTeam1();
                if (subTeam12 != null) {
                    nlgVar.q(12, subTeam12.getId());
                    String name4 = subTeam12.getName();
                    if (name4 == null) {
                        nlgVar.s(13);
                    } else {
                        nlgVar.L(13, name4);
                    }
                    FieldTranslations fieldTranslations4 = subTeam12.getFieldTranslations();
                    if (fieldTranslations4 != null) {
                        String v7 = sz8Var2.v(fieldTranslations4.getNameTranslation());
                        if (v7 == null) {
                            nlgVar.s(14);
                        } else {
                            nlgVar.L(14, v7);
                        }
                        String v8 = sz8Var2.v(fieldTranslations4.getShortNameTranslation());
                        if (v8 == null) {
                            nlgVar.s(15);
                        } else {
                            nlgVar.L(15, v8);
                        }
                    } else {
                        nlgVar.s(14);
                        nlgVar.s(15);
                    }
                } else {
                    me4.m(nlgVar, 12, 13, 14, 15);
                }
                SubTeam subTeam22 = team2.getSubTeam2();
                if (subTeam22 != null) {
                    nlgVar.q(16, subTeam22.getId());
                    String name5 = subTeam22.getName();
                    if (name5 == null) {
                        nlgVar.s(17);
                    } else {
                        nlgVar.L(17, name5);
                    }
                    FieldTranslations fieldTranslations5 = subTeam22.getFieldTranslations();
                    if (fieldTranslations5 != null) {
                        String v9 = sz8Var2.v(fieldTranslations5.getNameTranslation());
                        if (v9 == null) {
                            nlgVar.s(18);
                        } else {
                            nlgVar.L(18, v9);
                        }
                        String v10 = sz8Var2.v(fieldTranslations5.getShortNameTranslation());
                        if (v10 == null) {
                            nlgVar.s(19);
                        } else {
                            nlgVar.L(19, v10);
                        }
                    } else {
                        nlgVar.s(18);
                        nlgVar.s(19);
                    }
                } else {
                    me4.m(nlgVar, 16, 17, 18, 19);
                }
                Sport sport2 = team2.getSport();
                if (sport2 != null) {
                    nlgVar.q(20, sport2.getId());
                    nlgVar.L(21, sport2.getSlug());
                } else {
                    nlgVar.s(20);
                    nlgVar.s(21);
                }
                Country country2 = team2.getCountry();
                if (country2 != null) {
                    String name6 = country2.getName();
                    if (name6 == null) {
                        nlgVar.s(22);
                    } else {
                        nlgVar.L(22, name6);
                    }
                    String alpha22 = country2.getAlpha2();
                    if (alpha22 == null) {
                        nlgVar.s(23);
                    } else {
                        nlgVar.L(23, alpha22);
                    }
                } else {
                    nlgVar.s(22);
                    nlgVar.s(23);
                }
                FieldTranslations fieldTranslations6 = team2.getFieldTranslations();
                if (fieldTranslations6 != null) {
                    String v11 = sz8Var2.v(fieldTranslations6.getNameTranslation());
                    if (v11 == null) {
                        nlgVar.s(24);
                    } else {
                        nlgVar.L(24, v11);
                    }
                    String v12 = sz8Var2.v(fieldTranslations6.getShortNameTranslation());
                    if (v12 == null) {
                        nlgVar.s(25);
                    } else {
                        nlgVar.L(25, v12);
                    }
                } else {
                    nlgVar.s(24);
                    nlgVar.s(25);
                }
                nlgVar.q(26, team2.getId());
                break;
        }
    }

    @Override // defpackage.td4
    public final String W() {
        switch (this.m) {
            case 0:
                return "UPDATE OR REPLACE `teams` SET `id` = ?,`name` = ?,`slug` = ?,`userCount` = ?,`type` = ?,`nameCode` = ?,`shortName` = ?,`gender` = ?,`ranking` = ?,`disabled` = ?,`national` = ?,`sub_team_one_id` = ?,`sub_team_one_name` = ?,`sub_team_one_nameTranslation` = ?,`sub_team_one_shortNameTranslation` = ?,`sub_team_two_id` = ?,`sub_team_two_name` = ?,`sub_team_two_nameTranslation` = ?,`sub_team_two_shortNameTranslation` = ?,`sport_id` = ?,`sport_slug` = ?,`country_name` = ?,`country_alpha2` = ?,`nameTranslation` = ?,`shortNameTranslation` = ? WHERE `id` = ?";
            default:
                return "UPDATE `teams` SET `id` = ?,`name` = ?,`slug` = ?,`userCount` = ?,`type` = ?,`nameCode` = ?,`shortName` = ?,`gender` = ?,`ranking` = ?,`disabled` = ?,`national` = ?,`sub_team_one_id` = ?,`sub_team_one_name` = ?,`sub_team_one_nameTranslation` = ?,`sub_team_one_shortNameTranslation` = ?,`sub_team_two_id` = ?,`sub_team_two_name` = ?,`sub_team_two_nameTranslation` = ?,`sub_team_two_shortNameTranslation` = ?,`sport_id` = ?,`sport_slug` = ?,`country_name` = ?,`country_alpha2` = ?,`nameTranslation` = ?,`shortNameTranslation` = ? WHERE `id` = ?";
        }
    }
}
