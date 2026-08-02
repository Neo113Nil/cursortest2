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
public final class re9 extends ml4 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ re9(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // defpackage.ml4
    public final void J(nlg nlgVar, Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                DbHomescreenFilter dbHomescreenFilter = (DbHomescreenFilter) obj;
                nlgVar.getClass();
                dbHomescreenFilter.getClass();
                nlgVar.L(1, dbHomescreenFilter.getSportName());
                String v = ((se9) obj2).c.v(dbHomescreenFilter.getSelectedFilters());
                if (v == null) {
                    nlgVar.s(2);
                } else {
                    nlgVar.L(2, v);
                }
                nlgVar.L(3, DisplayTypeConverter.displayTypeToString(dbHomescreenFilter.getDisplayType()));
                break;
            case 1:
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
                            String v2 = sz8Var.v(fieldTranslations.getNameTranslation());
                            if (v2 == null) {
                                nlgVar.s(17);
                            } else {
                                nlgVar.L(17, v2);
                            }
                            String v3 = sz8Var.v(fieldTranslations.getShortNameTranslation());
                            if (v3 == null) {
                                nlgVar.s(18);
                            } else {
                                nlgVar.L(18, v3);
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
                            String v4 = sz8Var.v(fieldTranslations2.getNameTranslation());
                            if (v4 == null) {
                                nlgVar.s(21);
                            } else {
                                nlgVar.L(21, v4);
                            }
                            String v5 = sz8Var.v(fieldTranslations2.getShortNameTranslation());
                            if (v5 == null) {
                                nlgVar.s(22);
                            } else {
                                nlgVar.L(22, v5);
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
                        String v6 = sz8Var.v(fieldTranslations3.getNameTranslation());
                        if (v6 == null) {
                            nlgVar.s(27);
                        } else {
                            nlgVar.L(27, v6);
                        }
                        String v7 = sz8Var.v(fieldTranslations3.getShortNameTranslation());
                        if (v7 == null) {
                            nlgVar.s(28);
                        } else {
                            nlgVar.L(28, v7);
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
                if (fieldTranslations4 == null) {
                    nlgVar.s(29);
                    nlgVar.s(30);
                    break;
                } else {
                    String v8 = sz8Var.v(fieldTranslations4.getNameTranslation());
                    if (v8 == null) {
                        nlgVar.s(29);
                    } else {
                        nlgVar.L(29, v8);
                    }
                    String v9 = sz8Var.v(fieldTranslations4.getShortNameTranslation());
                    if (v9 != null) {
                        nlgVar.L(30, v9);
                        break;
                    } else {
                        nlgVar.s(30);
                        break;
                    }
                }
            default:
                Team team2 = (Team) obj;
                sz8 sz8Var2 = ((fvi) obj2).d;
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
                    FieldTranslations fieldTranslations5 = subTeam12.getFieldTranslations();
                    if (fieldTranslations5 != null) {
                        String v10 = sz8Var2.v(fieldTranslations5.getNameTranslation());
                        if (v10 == null) {
                            nlgVar.s(14);
                        } else {
                            nlgVar.L(14, v10);
                        }
                        String v11 = sz8Var2.v(fieldTranslations5.getShortNameTranslation());
                        if (v11 == null) {
                            nlgVar.s(15);
                        } else {
                            nlgVar.L(15, v11);
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
                    FieldTranslations fieldTranslations6 = subTeam22.getFieldTranslations();
                    if (fieldTranslations6 != null) {
                        String v12 = sz8Var2.v(fieldTranslations6.getNameTranslation());
                        if (v12 == null) {
                            nlgVar.s(18);
                        } else {
                            nlgVar.L(18, v12);
                        }
                        String v13 = sz8Var2.v(fieldTranslations6.getShortNameTranslation());
                        if (v13 == null) {
                            nlgVar.s(19);
                        } else {
                            nlgVar.L(19, v13);
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
                FieldTranslations fieldTranslations7 = team2.getFieldTranslations();
                if (fieldTranslations7 == null) {
                    nlgVar.s(24);
                    nlgVar.s(25);
                    break;
                } else {
                    String v14 = sz8Var2.v(fieldTranslations7.getNameTranslation());
                    if (v14 == null) {
                        nlgVar.s(24);
                    } else {
                        nlgVar.L(24, v14);
                    }
                    String v15 = sz8Var2.v(fieldTranslations7.getShortNameTranslation());
                    if (v15 != null) {
                        nlgVar.L(25, v15);
                        break;
                    } else {
                        nlgVar.s(25);
                        break;
                    }
                }
        }
    }

    @Override // defpackage.ml4
    public final String O() {
        switch (this.w) {
            case 0:
                return "INSERT INTO `homescreen_filter` (`sportName`,`selectedFilters`,`displayType`) VALUES (?,?,?)";
            case 1:
                return "INSERT INTO `players` (`id`,`name`,`userCount`,`team_id`,`team_name`,`team_slug`,`team_userCount`,`team_type`,`team_nameCode`,`team_shortName`,`team_gender`,`team_ranking`,`team_disabled`,`team_national`,`team_sub_team_one_id`,`team_sub_team_one_name`,`team_sub_team_one_nameTranslation`,`team_sub_team_one_shortNameTranslation`,`team_sub_team_two_id`,`team_sub_team_two_name`,`team_sub_team_two_nameTranslation`,`team_sub_team_two_shortNameTranslation`,`team_sport_id`,`team_sport_slug`,`team_country_name`,`team_country_alpha2`,`team_nameTranslation`,`team_shortNameTranslation`,`nameTranslation`,`shortNameTranslation`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT INTO `teams` (`id`,`name`,`slug`,`userCount`,`type`,`nameCode`,`shortName`,`gender`,`ranking`,`disabled`,`national`,`sub_team_one_id`,`sub_team_one_name`,`sub_team_one_nameTranslation`,`sub_team_one_shortNameTranslation`,`sub_team_two_id`,`sub_team_two_name`,`sub_team_two_nameTranslation`,`sub_team_two_shortNameTranslation`,`sport_id`,`sport_slug`,`country_name`,`country_alpha2`,`nameTranslation`,`shortNameTranslation`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
