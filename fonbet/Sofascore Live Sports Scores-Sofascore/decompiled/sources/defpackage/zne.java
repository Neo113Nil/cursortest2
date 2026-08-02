package defpackage;

import com.sofascore.model.database.DbHomescreenFilter;
import com.sofascore.model.database.DisplayTypeConverter;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.GenderTypeConverter;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zne extends td4 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ zne(Object obj, int i) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.td4
    public final void R(nlg nlgVar, Object obj) {
        int i = this.m;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                Player player = (Player) obj;
                sz8 sz8Var = ((aoe) obj2).d;
                nlgVar.getClass();
                player.getClass();
                nlgVar.q(1, player.getId());
                nlgVar.L(2, player.getName());
                nlgVar.q(3, player.getUserCount());
                Team team = player.getTeam();
                if (team != null) {
                    nlgVar.q(4, team.getId());
                    nlgVar.L(5, team.getName());
                    nlgVar.L(6, team.getSlug());
                    nlgVar.q(7, team.getUserCount());
                    nlgVar.q(8, team.getType());
                    String nameCode = team.getNameCode();
                    if (nameCode == null) {
                        nlgVar.s(9);
                    } else {
                        nlgVar.L(9, nameCode);
                    }
                    String shortName = team.getShortName();
                    if (shortName == null) {
                        nlgVar.s(10);
                    } else {
                        nlgVar.L(10, shortName);
                    }
                    Gender gender = team.getGender();
                    String genderToString = gender == null ? null : GenderTypeConverter.genderToString(gender);
                    if (genderToString == null) {
                        nlgVar.s(11);
                    } else {
                        nlgVar.L(11, genderToString);
                    }
                    if (team.getRanking() == null) {
                        nlgVar.s(12);
                    } else {
                        nlgVar.q(12, r4.intValue());
                    }
                    nlgVar.q(13, team.getDisabled() ? 1L : 0L);
                    nlgVar.q(14, team.getNational() ? 1L : 0L);
                    SubTeam subTeam1 = team.getSubTeam1();
                    if (subTeam1 != null) {
                        nlgVar.q(15, subTeam1.getId());
                        String name = subTeam1.getName();
                        if (name == null) {
                            nlgVar.s(16);
                        } else {
                            nlgVar.L(16, name);
                        }
                        FieldTranslations fieldTranslations = subTeam1.getFieldTranslations();
                        if (fieldTranslations != null) {
                            String v = sz8Var.v(fieldTranslations.getNameTranslation());
                            if (v == null) {
                                nlgVar.s(17);
                            } else {
                                nlgVar.L(17, v);
                            }
                            String v2 = sz8Var.v(fieldTranslations.getShortNameTranslation());
                            if (v2 == null) {
                                nlgVar.s(18);
                            } else {
                                nlgVar.L(18, v2);
                            }
                        } else {
                            nlgVar.s(17);
                            nlgVar.s(18);
                        }
                    } else {
                        me4.m(nlgVar, 15, 16, 17, 18);
                    }
                    SubTeam subTeam2 = team.getSubTeam2();
                    if (subTeam2 != null) {
                        nlgVar.q(19, subTeam2.getId());
                        String name2 = subTeam2.getName();
                        if (name2 == null) {
                            nlgVar.s(20);
                        } else {
                            nlgVar.L(20, name2);
                        }
                        FieldTranslations fieldTranslations2 = subTeam2.getFieldTranslations();
                        if (fieldTranslations2 != null) {
                            String v3 = sz8Var.v(fieldTranslations2.getNameTranslation());
                            if (v3 == null) {
                                nlgVar.s(21);
                            } else {
                                nlgVar.L(21, v3);
                            }
                            String v4 = sz8Var.v(fieldTranslations2.getShortNameTranslation());
                            if (v4 == null) {
                                nlgVar.s(22);
                            } else {
                                nlgVar.L(22, v4);
                            }
                        } else {
                            nlgVar.s(21);
                            nlgVar.s(22);
                        }
                    } else {
                        me4.m(nlgVar, 19, 20, 21, 22);
                    }
                    Sport sport = team.getSport();
                    if (sport != null) {
                        nlgVar.q(23, sport.getId());
                        nlgVar.L(24, sport.getSlug());
                    } else {
                        nlgVar.s(23);
                        nlgVar.s(24);
                    }
                    Country country = team.getCountry();
                    if (country != null) {
                        String name3 = country.getName();
                        if (name3 == null) {
                            nlgVar.s(25);
                        } else {
                            nlgVar.L(25, name3);
                        }
                        String alpha2 = country.getAlpha2();
                        if (alpha2 == null) {
                            nlgVar.s(26);
                        } else {
                            nlgVar.L(26, alpha2);
                        }
                    } else {
                        nlgVar.s(25);
                        nlgVar.s(26);
                    }
                    FieldTranslations fieldTranslations3 = team.getFieldTranslations();
                    if (fieldTranslations3 != null) {
                        String v5 = sz8Var.v(fieldTranslations3.getNameTranslation());
                        if (v5 == null) {
                            nlgVar.s(27);
                        } else {
                            nlgVar.L(27, v5);
                        }
                        String v6 = sz8Var.v(fieldTranslations3.getShortNameTranslation());
                        if (v6 == null) {
                            nlgVar.s(28);
                        } else {
                            nlgVar.L(28, v6);
                        }
                    } else {
                        nlgVar.s(27);
                        nlgVar.s(28);
                    }
                } else {
                    me4.m(nlgVar, 4, 5, 6, 7);
                    me4.m(nlgVar, 8, 9, 10, 11);
                    me4.m(nlgVar, 12, 13, 14, 15);
                    me4.m(nlgVar, 16, 17, 18, 19);
                    me4.m(nlgVar, 20, 21, 22, 23);
                    me4.m(nlgVar, 24, 25, 26, 27);
                    nlgVar.s(28);
                }
                FieldTranslations fieldTranslations4 = player.getFieldTranslations();
                if (fieldTranslations4 != null) {
                    String v7 = sz8Var.v(fieldTranslations4.getNameTranslation());
                    if (v7 == null) {
                        nlgVar.s(29);
                    } else {
                        nlgVar.L(29, v7);
                    }
                    String v8 = sz8Var.v(fieldTranslations4.getShortNameTranslation());
                    if (v8 == null) {
                        nlgVar.s(30);
                    } else {
                        nlgVar.L(30, v8);
                    }
                } else {
                    nlgVar.s(29);
                    nlgVar.s(30);
                }
                nlgVar.q(31, player.getId());
                break;
            case 1:
                Player player2 = (Player) obj;
                sz8 sz8Var2 = ((aoe) obj2).d;
                nlgVar.getClass();
                player2.getClass();
                nlgVar.q(1, player2.getId());
                nlgVar.L(2, player2.getName());
                nlgVar.q(3, player2.getUserCount());
                Team team2 = player2.getTeam();
                if (team2 != null) {
                    nlgVar.q(4, team2.getId());
                    nlgVar.L(5, team2.getName());
                    nlgVar.L(6, team2.getSlug());
                    nlgVar.q(7, team2.getUserCount());
                    nlgVar.q(8, team2.getType());
                    String nameCode2 = team2.getNameCode();
                    if (nameCode2 == null) {
                        nlgVar.s(9);
                    } else {
                        nlgVar.L(9, nameCode2);
                    }
                    String shortName2 = team2.getShortName();
                    if (shortName2 == null) {
                        nlgVar.s(10);
                    } else {
                        nlgVar.L(10, shortName2);
                    }
                    Gender gender2 = team2.getGender();
                    String genderToString2 = gender2 == null ? null : GenderTypeConverter.genderToString(gender2);
                    if (genderToString2 == null) {
                        nlgVar.s(11);
                    } else {
                        nlgVar.L(11, genderToString2);
                    }
                    if (team2.getRanking() == null) {
                        nlgVar.s(12);
                    } else {
                        nlgVar.q(12, r4.intValue());
                    }
                    nlgVar.q(13, team2.getDisabled() ? 1L : 0L);
                    nlgVar.q(14, team2.getNational() ? 1L : 0L);
                    SubTeam subTeam12 = team2.getSubTeam1();
                    if (subTeam12 != null) {
                        nlgVar.q(15, subTeam12.getId());
                        String name4 = subTeam12.getName();
                        if (name4 == null) {
                            nlgVar.s(16);
                        } else {
                            nlgVar.L(16, name4);
                        }
                        FieldTranslations fieldTranslations5 = subTeam12.getFieldTranslations();
                        if (fieldTranslations5 != null) {
                            String v9 = sz8Var2.v(fieldTranslations5.getNameTranslation());
                            if (v9 == null) {
                                nlgVar.s(17);
                            } else {
                                nlgVar.L(17, v9);
                            }
                            String v10 = sz8Var2.v(fieldTranslations5.getShortNameTranslation());
                            if (v10 == null) {
                                nlgVar.s(18);
                            } else {
                                nlgVar.L(18, v10);
                            }
                        } else {
                            nlgVar.s(17);
                            nlgVar.s(18);
                        }
                    } else {
                        me4.m(nlgVar, 15, 16, 17, 18);
                    }
                    SubTeam subTeam22 = team2.getSubTeam2();
                    if (subTeam22 != null) {
                        nlgVar.q(19, subTeam22.getId());
                        String name5 = subTeam22.getName();
                        if (name5 == null) {
                            nlgVar.s(20);
                        } else {
                            nlgVar.L(20, name5);
                        }
                        FieldTranslations fieldTranslations6 = subTeam22.getFieldTranslations();
                        if (fieldTranslations6 != null) {
                            String v11 = sz8Var2.v(fieldTranslations6.getNameTranslation());
                            if (v11 == null) {
                                nlgVar.s(21);
                            } else {
                                nlgVar.L(21, v11);
                            }
                            String v12 = sz8Var2.v(fieldTranslations6.getShortNameTranslation());
                            if (v12 == null) {
                                nlgVar.s(22);
                            } else {
                                nlgVar.L(22, v12);
                            }
                        } else {
                            nlgVar.s(21);
                            nlgVar.s(22);
                        }
                    } else {
                        me4.m(nlgVar, 19, 20, 21, 22);
                    }
                    Sport sport2 = team2.getSport();
                    if (sport2 != null) {
                        nlgVar.q(23, sport2.getId());
                        nlgVar.L(24, sport2.getSlug());
                    } else {
                        nlgVar.s(23);
                        nlgVar.s(24);
                    }
                    Country country2 = team2.getCountry();
                    if (country2 != null) {
                        String name6 = country2.getName();
                        if (name6 == null) {
                            nlgVar.s(25);
                        } else {
                            nlgVar.L(25, name6);
                        }
                        String alpha22 = country2.getAlpha2();
                        if (alpha22 == null) {
                            nlgVar.s(26);
                        } else {
                            nlgVar.L(26, alpha22);
                        }
                    } else {
                        nlgVar.s(25);
                        nlgVar.s(26);
                    }
                    FieldTranslations fieldTranslations7 = team2.getFieldTranslations();
                    if (fieldTranslations7 != null) {
                        String v13 = sz8Var2.v(fieldTranslations7.getNameTranslation());
                        if (v13 == null) {
                            nlgVar.s(27);
                        } else {
                            nlgVar.L(27, v13);
                        }
                        String v14 = sz8Var2.v(fieldTranslations7.getShortNameTranslation());
                        if (v14 == null) {
                            nlgVar.s(28);
                        } else {
                            nlgVar.L(28, v14);
                        }
                    } else {
                        nlgVar.s(27);
                        nlgVar.s(28);
                    }
                } else {
                    me4.m(nlgVar, 4, 5, 6, 7);
                    me4.m(nlgVar, 8, 9, 10, 11);
                    me4.m(nlgVar, 12, 13, 14, 15);
                    me4.m(nlgVar, 16, 17, 18, 19);
                    me4.m(nlgVar, 20, 21, 22, 23);
                    me4.m(nlgVar, 24, 25, 26, 27);
                    nlgVar.s(28);
                }
                FieldTranslations fieldTranslations8 = player2.getFieldTranslations();
                if (fieldTranslations8 != null) {
                    String v15 = sz8Var2.v(fieldTranslations8.getNameTranslation());
                    if (v15 == null) {
                        nlgVar.s(29);
                    } else {
                        nlgVar.L(29, v15);
                    }
                    String v16 = sz8Var2.v(fieldTranslations8.getShortNameTranslation());
                    if (v16 == null) {
                        nlgVar.s(30);
                    } else {
                        nlgVar.L(30, v16);
                    }
                } else {
                    nlgVar.s(29);
                    nlgVar.s(30);
                }
                nlgVar.q(31, player2.getId());
                break;
            default:
                DbHomescreenFilter dbHomescreenFilter = (DbHomescreenFilter) obj;
                nlgVar.getClass();
                dbHomescreenFilter.getClass();
                nlgVar.L(1, dbHomescreenFilter.getSportName());
                String v17 = ((se9) obj2).c.v(dbHomescreenFilter.getSelectedFilters());
                if (v17 == null) {
                    nlgVar.s(2);
                } else {
                    nlgVar.L(2, v17);
                }
                nlgVar.L(3, DisplayTypeConverter.displayTypeToString(dbHomescreenFilter.getDisplayType()));
                nlgVar.L(4, dbHomescreenFilter.getSportName());
                break;
        }
    }

    @Override // defpackage.td4
    public final String W() {
        switch (this.m) {
            case 0:
                return "UPDATE OR REPLACE `players` SET `id` = ?,`name` = ?,`userCount` = ?,`team_id` = ?,`team_name` = ?,`team_slug` = ?,`team_userCount` = ?,`team_type` = ?,`team_nameCode` = ?,`team_shortName` = ?,`team_gender` = ?,`team_ranking` = ?,`team_disabled` = ?,`team_national` = ?,`team_sub_team_one_id` = ?,`team_sub_team_one_name` = ?,`team_sub_team_one_nameTranslation` = ?,`team_sub_team_one_shortNameTranslation` = ?,`team_sub_team_two_id` = ?,`team_sub_team_two_name` = ?,`team_sub_team_two_nameTranslation` = ?,`team_sub_team_two_shortNameTranslation` = ?,`team_sport_id` = ?,`team_sport_slug` = ?,`team_country_name` = ?,`team_country_alpha2` = ?,`team_nameTranslation` = ?,`team_shortNameTranslation` = ?,`nameTranslation` = ?,`shortNameTranslation` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE `players` SET `id` = ?,`name` = ?,`userCount` = ?,`team_id` = ?,`team_name` = ?,`team_slug` = ?,`team_userCount` = ?,`team_type` = ?,`team_nameCode` = ?,`team_shortName` = ?,`team_gender` = ?,`team_ranking` = ?,`team_disabled` = ?,`team_national` = ?,`team_sub_team_one_id` = ?,`team_sub_team_one_name` = ?,`team_sub_team_one_nameTranslation` = ?,`team_sub_team_one_shortNameTranslation` = ?,`team_sub_team_two_id` = ?,`team_sub_team_two_name` = ?,`team_sub_team_two_nameTranslation` = ?,`team_sub_team_two_shortNameTranslation` = ?,`team_sport_id` = ?,`team_sport_slug` = ?,`team_country_name` = ?,`team_country_alpha2` = ?,`team_nameTranslation` = ?,`team_shortNameTranslation` = ?,`nameTranslation` = ?,`shortNameTranslation` = ? WHERE `id` = ?";
            default:
                return "UPDATE `homescreen_filter` SET `sportName` = ?,`selectedFilters` = ?,`displayType` = ? WHERE `sportName` = ?";
        }
    }
}
