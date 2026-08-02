package defpackage;

import com.sofascore.model.database.DbAmericanFootballDownDistance;
import com.sofascore.model.database.DbEvent;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.EventChanges;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.GenderTypeConverter;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageEvent;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StageWinner;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.VarInProgress;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q76 extends ml4 {
    public final /* synthetic */ int w;
    public final /* synthetic */ v76 x;

    public /* synthetic */ q76(v76 v76Var, int i) {
        this.w = i;
        this.x = v76Var;
    }

    @Override // defpackage.ml4
    public final void J(nlg nlgVar, Object obj) {
        String str;
        int i = this.w;
        v76 v76Var = this.x;
        switch (i) {
            case 0:
                Tournament tournament = (Tournament) obj;
                sz8 sz8Var = v76Var.c;
                nlgVar.getClass();
                tournament.getClass();
                nlgVar.q(1, tournament.getId());
                nlgVar.L(2, tournament.getName());
                Category category = tournament.getCategory();
                nlgVar.q(3, category.getId());
                nlgVar.L(4, category.getName());
                nlgVar.L(5, category.getFlag());
                Sport sport = category.getSport();
                nlgVar.q(6, sport.getId());
                nlgVar.L(7, sport.getSlug());
                FieldTranslations fieldTranslations = category.getFieldTranslations();
                if (fieldTranslations != null) {
                    String v = sz8Var.v(fieldTranslations.getNameTranslation());
                    if (v == null) {
                        nlgVar.s(8);
                    } else {
                        nlgVar.L(8, v);
                    }
                    String v2 = sz8Var.v(fieldTranslations.getShortNameTranslation());
                    if (v2 == null) {
                        nlgVar.s(9);
                    } else {
                        nlgVar.L(9, v2);
                    }
                } else {
                    nlgVar.s(8);
                    nlgVar.s(9);
                }
                UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                if (uniqueTournament != null) {
                    nlgVar.q(10, uniqueTournament.getId());
                    String name = uniqueTournament.getName();
                    if (name == null) {
                        nlgVar.s(11);
                    } else {
                        nlgVar.L(11, name);
                    }
                    nlgVar.q(12, uniqueTournament.getUserCount());
                    nlgVar.q(13, uniqueTournament.getHasEventPlayerStatistics() ? 1L : 0L);
                    Boolean hasBoxScore = uniqueTournament.getHasBoxScore();
                    if ((hasBoxScore != null ? Integer.valueOf(hasBoxScore.booleanValue() ? 1 : 0) : null) == null) {
                        nlgVar.s(14);
                    } else {
                        nlgVar.q(14, r7.intValue());
                    }
                    nlgVar.q(15, uniqueTournament.getDisplayInverseHomeAwayTeams() ? 1L : 0L);
                    String groundType = uniqueTournament.getGroundType();
                    if (groundType == null) {
                        nlgVar.s(16);
                    } else {
                        nlgVar.L(16, groundType);
                    }
                    if (uniqueTournament.getTennisPoints() == null) {
                        nlgVar.s(17);
                    } else {
                        nlgVar.q(17, r7.intValue());
                    }
                    Gender gender = uniqueTournament.getGender();
                    if (gender == null) {
                        nlgVar.s(18);
                    } else {
                        int i2 = s76.a[gender.ordinal()];
                        if (i2 == 1) {
                            str = "Male";
                        } else if (i2 != 2) {
                            zzl.b();
                            break;
                        } else {
                            str = "Female";
                        }
                        nlgVar.L(18, str);
                    }
                    Category category2 = uniqueTournament.getCategory();
                    nlgVar.q(19, category2.getId());
                    nlgVar.L(20, category2.getName());
                    nlgVar.L(21, category2.getFlag());
                    Sport sport2 = category2.getSport();
                    nlgVar.q(22, sport2.getId());
                    nlgVar.L(23, sport2.getSlug());
                    FieldTranslations fieldTranslations2 = category2.getFieldTranslations();
                    if (fieldTranslations2 != null) {
                        String v3 = sz8Var.v(fieldTranslations2.getNameTranslation());
                        if (v3 == null) {
                            nlgVar.s(24);
                        } else {
                            nlgVar.L(24, v3);
                        }
                        String v4 = sz8Var.v(fieldTranslations2.getShortNameTranslation());
                        if (v4 == null) {
                            nlgVar.s(25);
                        } else {
                            nlgVar.L(25, v4);
                        }
                    } else {
                        nlgVar.s(24);
                        nlgVar.s(25);
                    }
                    FieldTranslations fieldTranslations3 = uniqueTournament.getFieldTranslations();
                    if (fieldTranslations3 != null) {
                        String v5 = sz8Var.v(fieldTranslations3.getNameTranslation());
                        if (v5 == null) {
                            nlgVar.s(26);
                        } else {
                            nlgVar.L(26, v5);
                        }
                        String v6 = sz8Var.v(fieldTranslations3.getShortNameTranslation());
                        if (v6 == null) {
                            nlgVar.s(27);
                        } else {
                            nlgVar.L(27, v6);
                        }
                    } else {
                        nlgVar.s(26);
                        nlgVar.s(27);
                    }
                } else {
                    me4.m(nlgVar, 10, 11, 12, 13);
                    me4.m(nlgVar, 14, 15, 16, 17);
                    me4.m(nlgVar, 18, 19, 20, 21);
                    me4.m(nlgVar, 22, 23, 24, 25);
                    nlgVar.s(26);
                    nlgVar.s(27);
                }
                FieldTranslations fieldTranslations4 = tournament.getFieldTranslations();
                if (fieldTranslations4 == null) {
                    nlgVar.s(28);
                    nlgVar.s(29);
                    break;
                } else {
                    String v7 = sz8Var.v(fieldTranslations4.getNameTranslation());
                    if (v7 == null) {
                        nlgVar.s(28);
                    } else {
                        nlgVar.L(28, v7);
                    }
                    String v8 = sz8Var.v(fieldTranslations4.getShortNameTranslation());
                    if (v8 != null) {
                        nlgVar.L(29, v8);
                        break;
                    } else {
                        nlgVar.s(29);
                        break;
                    }
                }
            case 1:
                Team team = (Team) obj;
                sz8 sz8Var2 = v76Var.c;
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
                Gender gender2 = team.getGender();
                String genderToString = gender2 == null ? null : GenderTypeConverter.genderToString(gender2);
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
                    String name2 = subTeam1.getName();
                    if (name2 == null) {
                        nlgVar.s(13);
                    } else {
                        nlgVar.L(13, name2);
                    }
                    FieldTranslations fieldTranslations5 = subTeam1.getFieldTranslations();
                    if (fieldTranslations5 != null) {
                        String v9 = sz8Var2.v(fieldTranslations5.getNameTranslation());
                        if (v9 == null) {
                            nlgVar.s(14);
                        } else {
                            nlgVar.L(14, v9);
                        }
                        String v10 = sz8Var2.v(fieldTranslations5.getShortNameTranslation());
                        if (v10 == null) {
                            nlgVar.s(15);
                        } else {
                            nlgVar.L(15, v10);
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
                    String name3 = subTeam2.getName();
                    if (name3 == null) {
                        nlgVar.s(17);
                    } else {
                        nlgVar.L(17, name3);
                    }
                    FieldTranslations fieldTranslations6 = subTeam2.getFieldTranslations();
                    if (fieldTranslations6 != null) {
                        String v11 = sz8Var2.v(fieldTranslations6.getNameTranslation());
                        if (v11 == null) {
                            nlgVar.s(18);
                        } else {
                            nlgVar.L(18, v11);
                        }
                        String v12 = sz8Var2.v(fieldTranslations6.getShortNameTranslation());
                        if (v12 == null) {
                            nlgVar.s(19);
                        } else {
                            nlgVar.L(19, v12);
                        }
                    } else {
                        nlgVar.s(18);
                        nlgVar.s(19);
                    }
                } else {
                    me4.m(nlgVar, 16, 17, 18, 19);
                }
                Sport sport3 = team.getSport();
                if (sport3 != null) {
                    nlgVar.q(20, sport3.getId());
                    nlgVar.L(21, sport3.getSlug());
                } else {
                    nlgVar.s(20);
                    nlgVar.s(21);
                }
                Country country = team.getCountry();
                if (country != null) {
                    String name4 = country.getName();
                    if (name4 == null) {
                        nlgVar.s(22);
                    } else {
                        nlgVar.L(22, name4);
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
                FieldTranslations fieldTranslations7 = team.getFieldTranslations();
                if (fieldTranslations7 == null) {
                    nlgVar.s(24);
                    nlgVar.s(25);
                    break;
                } else {
                    String v13 = sz8Var2.v(fieldTranslations7.getNameTranslation());
                    if (v13 == null) {
                        nlgVar.s(24);
                    } else {
                        nlgVar.L(24, v13);
                    }
                    String v14 = sz8Var2.v(fieldTranslations7.getShortNameTranslation());
                    if (v14 != null) {
                        nlgVar.L(25, v14);
                        break;
                    } else {
                        nlgVar.s(25);
                        break;
                    }
                }
            case 2:
                DbEvent dbEvent = (DbEvent) obj;
                nlgVar.getClass();
                dbEvent.getClass();
                if (dbEvent.getWinnerCode() == null) {
                    nlgVar.s(1);
                } else {
                    nlgVar.q(1, r10.intValue());
                }
                if (dbEvent.getAggregatedWinnerCode() == null) {
                    nlgVar.s(2);
                } else {
                    nlgVar.q(2, r4.intValue());
                }
                nlgVar.q(3, dbEvent.getHomeTeamId());
                if (dbEvent.getHomeSubTeam1Id() == null) {
                    nlgVar.s(4);
                } else {
                    nlgVar.q(4, r3.intValue());
                }
                if (dbEvent.getHomeSubTeam2Id() == null) {
                    nlgVar.s(5);
                } else {
                    nlgVar.q(5, r3.intValue());
                }
                nlgVar.q(6, dbEvent.getAwayTeamId());
                if (dbEvent.getAwaySubTeam1Id() == null) {
                    nlgVar.s(7);
                } else {
                    nlgVar.q(7, r3.intValue());
                }
                if (dbEvent.getAwaySubTeam2Id() == null) {
                    nlgVar.s(8);
                } else {
                    nlgVar.q(8, r3.intValue());
                }
                nlgVar.q(9, dbEvent.getHasEventPlayerHeatMap() ? 1L : 0L);
                nlgVar.q(10, dbEvent.getStartTimestamp());
                Long endTimestamp = dbEvent.getEndTimestamp();
                if (endTimestamp == null) {
                    nlgVar.s(11);
                } else {
                    nlgVar.q(11, endTimestamp.longValue());
                }
                nlgVar.q(12, dbEvent.getId());
                nlgVar.q(13, dbEvent.getTournamentId());
                if (dbEvent.getUniqueTournamentId() == null) {
                    nlgVar.s(14);
                } else {
                    nlgVar.q(14, r3.intValue());
                }
                if (dbEvent.getPreviousLegEventId() == null) {
                    nlgVar.s(15);
                } else {
                    nlgVar.q(15, r3.intValue());
                }
                String lastPeriod = dbEvent.getLastPeriod();
                if (lastPeriod == null) {
                    nlgVar.s(16);
                } else {
                    nlgVar.L(16, lastPeriod);
                }
                if (dbEvent.getHomeRedCards() == null) {
                    nlgVar.s(17);
                } else {
                    nlgVar.q(17, r3.intValue());
                }
                if (dbEvent.getAwayRedCards() == null) {
                    nlgVar.s(18);
                } else {
                    nlgVar.q(18, r3.intValue());
                }
                if (dbEvent.getCurrentBattingTeamId() == null) {
                    nlgVar.s(19);
                } else {
                    nlgVar.q(19, r3.intValue());
                }
                if (dbEvent.getFirstToServe() == null) {
                    nlgVar.s(20);
                } else {
                    nlgVar.q(20, r3.intValue());
                }
                if (dbEvent.getBestOfSets() == null) {
                    nlgVar.s(21);
                } else {
                    nlgVar.q(21, r3.intValue());
                }
                if (dbEvent.getBestOfLegs() == null) {
                    nlgVar.s(22);
                } else {
                    nlgVar.q(22, r3.intValue());
                }
                if (dbEvent.getFinalRound() == null) {
                    nlgVar.s(23);
                } else {
                    nlgVar.q(23, r3.intValue());
                }
                String winType = dbEvent.getWinType();
                if (winType == null) {
                    nlgVar.s(24);
                } else {
                    nlgVar.L(24, winType);
                }
                Boolean crowdsourcingDataDisplayEnabled = dbEvent.getCrowdsourcingDataDisplayEnabled();
                if ((crowdsourcingDataDisplayEnabled != null ? Integer.valueOf(crowdsourcingDataDisplayEnabled.booleanValue() ? 1 : 0) : null) == null) {
                    nlgVar.s(25);
                } else {
                    nlgVar.q(25, r3.intValue());
                }
                Boolean crowdsourcingEnabled = dbEvent.getCrowdsourcingEnabled();
                if ((crowdsourcingEnabled != null ? Integer.valueOf(crowdsourcingEnabled.booleanValue() ? 1 : 0) : null) == null) {
                    nlgVar.s(26);
                } else {
                    nlgVar.q(26, r3.intValue());
                }
                Boolean finalResultOnly = dbEvent.getFinalResultOnly();
                if ((finalResultOnly != null ? Integer.valueOf(finalResultOnly.booleanValue() ? 1 : 0) : null) == null) {
                    nlgVar.s(27);
                } else {
                    nlgVar.q(27, r3.intValue());
                }
                if (dbEvent.getStreamContentId() == null) {
                    nlgVar.s(28);
                } else {
                    nlgVar.q(28, r3.intValue());
                }
                List<String> streamContentGeoRestrictions = dbEvent.getStreamContentGeoRestrictions();
                sz8 sz8Var3 = v76Var.c;
                String o = sz8Var3.o(streamContentGeoRestrictions);
                if (o == null) {
                    nlgVar.s(29);
                } else {
                    nlgVar.L(29, o);
                }
                String r = sz8Var3.r(dbEvent.getEventFilters());
                if (r == null) {
                    nlgVar.s(30);
                } else {
                    nlgVar.L(30, r);
                }
                String homeTeamSeed = dbEvent.getHomeTeamSeed();
                if (homeTeamSeed == null) {
                    nlgVar.s(31);
                } else {
                    nlgVar.L(31, homeTeamSeed);
                }
                String awayTeamSeed = dbEvent.getAwayTeamSeed();
                if (awayTeamSeed == null) {
                    nlgVar.s(32);
                } else {
                    nlgVar.L(32, awayTeamSeed);
                }
                nlgVar.q(33, dbEvent.getHide() ? 1L : 0L);
                nlgVar.q(34, dbEvent.getMute());
                nlgVar.q(35, dbEvent.getLastUpdate());
                if (dbEvent.getSeason() != null) {
                    nlgVar.q(36, r3.getId());
                } else {
                    nlgVar.s(36);
                }
                Status status = dbEvent.getStatus();
                nlgVar.q(37, status.getCode());
                String description = status.getDescription();
                if (description == null) {
                    nlgVar.s(38);
                } else {
                    nlgVar.L(38, description);
                }
                nlgVar.L(39, status.getType());
                Time time = dbEvent.getTime();
                if (time != null) {
                    if (time.getPlayed() == null) {
                        nlgVar.s(40);
                    } else {
                        nlgVar.q(40, r13.intValue());
                    }
                    if (time.getPeriodLength() == null) {
                        nlgVar.s(41);
                    } else {
                        nlgVar.q(41, r12.intValue());
                    }
                    if (time.getOvertimeLength() == null) {
                        nlgVar.s(42);
                    } else {
                        nlgVar.q(42, r11.intValue());
                    }
                    if (time.getTotalPeriodCount() == null) {
                        nlgVar.s(43);
                    } else {
                        nlgVar.q(43, r10.intValue());
                    }
                    Long initial = time.getInitial();
                    if (initial == null) {
                        nlgVar.s(44);
                    } else {
                        nlgVar.q(44, initial.longValue());
                    }
                    Long max = time.getMax();
                    if (max == null) {
                        nlgVar.s(45);
                    } else {
                        nlgVar.q(45, max.longValue());
                    }
                    Long currentPeriodStartTimestamp = time.getCurrentPeriodStartTimestamp();
                    if (currentPeriodStartTimestamp == null) {
                        nlgVar.s(46);
                    } else {
                        nlgVar.q(46, currentPeriodStartTimestamp.longValue());
                    }
                    Long extra = time.getExtra();
                    if (extra == null) {
                        nlgVar.s(47);
                    } else {
                        nlgVar.q(47, extra.longValue());
                    }
                } else {
                    me4.m(nlgVar, 40, 41, 42, 43);
                    me4.m(nlgVar, 44, 45, 46, 47);
                }
                EventChanges changes = dbEvent.getChanges();
                if (changes != null) {
                    String o2 = sz8Var3.o(changes.getChanges());
                    if (o2 == null) {
                        nlgVar.s(48);
                    } else {
                        nlgVar.L(48, o2);
                    }
                    nlgVar.q(49, changes.getChangeTimestamp());
                } else {
                    nlgVar.s(48);
                    nlgVar.s(49);
                }
                DbAmericanFootballDownDistance yardDistance = dbEvent.getYardDistance();
                if (yardDistance != null) {
                    if (yardDistance.getCurrentYardsToFirstDown() == null) {
                        nlgVar.s(50);
                    } else {
                        nlgVar.q(50, r10.intValue());
                    }
                    if (yardDistance.getCurrentDown() == null) {
                        nlgVar.s(51);
                    } else {
                        nlgVar.q(51, r9.intValue());
                    }
                    if (yardDistance.getCurrentYardline() == null) {
                        nlgVar.s(52);
                    } else {
                        nlgVar.q(52, r8.intValue());
                    }
                    Boolean isGoalPossession = yardDistance.isGoalPossession();
                    if ((isGoalPossession != null ? Integer.valueOf(isGoalPossession.booleanValue() ? 1 : 0) : null) == null) {
                        nlgVar.s(53);
                    } else {
                        nlgVar.q(53, r7.intValue());
                    }
                    if (yardDistance.getCurrentPossession() == null) {
                        nlgVar.s(54);
                    } else {
                        nlgVar.q(54, r6.intValue());
                    }
                    if (yardDistance.getCurrentTeamHalf() == null) {
                        nlgVar.s(55);
                    } else {
                        nlgVar.q(55, r0.intValue());
                    }
                } else {
                    me4.m(nlgVar, 50, 51, 52, 53);
                    nlgVar.s(54);
                    nlgVar.s(55);
                }
                VarInProgress varInProgress = dbEvent.getVarInProgress();
                if (varInProgress == null) {
                    nlgVar.s(56);
                    nlgVar.s(57);
                    break;
                } else {
                    Boolean homeTeam = varInProgress.getHomeTeam();
                    if ((homeTeam != null ? Integer.valueOf(homeTeam.booleanValue() ? 1 : 0) : null) == null) {
                        nlgVar.s(56);
                    } else {
                        nlgVar.q(56, r5.intValue());
                    }
                    Boolean awayTeam = varInProgress.getAwayTeam();
                    if ((awayTeam != null ? Integer.valueOf(awayTeam.booleanValue() ? 1 : 0) : null) != null) {
                        nlgVar.q(57, r4.intValue());
                        break;
                    } else {
                        nlgVar.s(57);
                        break;
                    }
                }
            default:
                Stage stage = (Stage) obj;
                sz8 sz8Var4 = v76Var.c;
                nlgVar.getClass();
                stage.getClass();
                nlgVar.L(1, stage.getDescription());
                ServerType type = stage.getType();
                if (type == null) {
                    nlgVar.s(2);
                } else {
                    nlgVar.L(2, v76.a(type));
                }
                nlgVar.q(3, stage.getId());
                nlgVar.q(4, stage.getStartDateTimestamp());
                String flag = stage.getFlag();
                if (flag == null) {
                    nlgVar.s(5);
                } else {
                    nlgVar.L(5, flag);
                }
                nlgVar.q(6, stage.getLastUpdate());
                nlgVar.q(7, stage.getIsMuted() ? 1L : 0L);
                nlgVar.q(8, stage.getIsHidden() ? 1L : 0L);
                Status status2 = stage.getStatus();
                if (status2 != null) {
                    nlgVar.q(9, status2.getCode());
                    String description2 = status2.getDescription();
                    if (description2 == null) {
                        nlgVar.s(10);
                    } else {
                        nlgVar.L(10, description2);
                    }
                    nlgVar.L(11, status2.getType());
                } else {
                    nlgVar.s(9);
                    nlgVar.s(10);
                    nlgVar.s(11);
                }
                StageWinner winner = stage.getWinner();
                if (winner != null) {
                    nlgVar.q(12, winner.getId());
                    String name5 = winner.getName();
                    if (name5 == null) {
                        nlgVar.s(13);
                    } else {
                        nlgVar.L(13, name5);
                    }
                } else {
                    nlgVar.s(12);
                    nlgVar.s(13);
                }
                StageEvent parentEvent = stage.getParentEvent();
                if (parentEvent != null) {
                    nlgVar.q(14, parentEvent.getId());
                    String description3 = parentEvent.getDescription();
                    if (description3 == null) {
                        nlgVar.s(15);
                    } else {
                        nlgVar.L(15, description3);
                    }
                    Long startTimestamp = parentEvent.getStartTimestamp();
                    if (startTimestamp == null) {
                        nlgVar.s(16);
                    } else {
                        nlgVar.q(16, startTimestamp.longValue());
                    }
                    String flag2 = parentEvent.getFlag();
                    if (flag2 == null) {
                        nlgVar.s(17);
                    } else {
                        nlgVar.L(17, flag2);
                    }
                } else {
                    me4.m(nlgVar, 14, 15, 16, 17);
                }
                StageSeason stageSeason = stage.getStageSeason();
                if (stageSeason == null) {
                    me4.m(nlgVar, 18, 19, 20, 21);
                    me4.m(nlgVar, 22, 23, 24, 25);
                    me4.m(nlgVar, 26, 27, 28, 29);
                    nlgVar.s(30);
                    nlgVar.s(31);
                    break;
                } else {
                    nlgVar.L(18, stageSeason.getDescription());
                    String year = stageSeason.getYear();
                    if (year == null) {
                        nlgVar.s(19);
                    } else {
                        nlgVar.L(19, year);
                    }
                    nlgVar.q(20, stageSeason.getId());
                    UniqueStage uniqueStage = stageSeason.getUniqueStage();
                    if (uniqueStage == null) {
                        me4.m(nlgVar, 21, 22, 23, 24);
                        me4.m(nlgVar, 25, 26, 27, 28);
                        nlgVar.s(29);
                        nlgVar.s(30);
                        nlgVar.s(31);
                        break;
                    } else {
                        nlgVar.q(21, uniqueStage.getId());
                        nlgVar.L(22, uniqueStage.getName());
                        String primaryColorHex = uniqueStage.getPrimaryColorHex();
                        if (primaryColorHex == null) {
                            nlgVar.s(23);
                        } else {
                            nlgVar.L(23, primaryColorHex);
                        }
                        String secondaryColorHex = uniqueStage.getSecondaryColorHex();
                        if (secondaryColorHex == null) {
                            nlgVar.s(24);
                        } else {
                            nlgVar.L(24, secondaryColorHex);
                        }
                        Category category3 = uniqueStage.getCategory();
                        nlgVar.q(25, category3.getId());
                        nlgVar.L(26, category3.getName());
                        nlgVar.L(27, category3.getFlag());
                        Sport sport4 = category3.getSport();
                        nlgVar.q(28, sport4.getId());
                        nlgVar.L(29, sport4.getSlug());
                        FieldTranslations fieldTranslations8 = category3.getFieldTranslations();
                        if (fieldTranslations8 == null) {
                            nlgVar.s(30);
                            nlgVar.s(31);
                            break;
                        } else {
                            String v15 = sz8Var4.v(fieldTranslations8.getNameTranslation());
                            if (v15 == null) {
                                nlgVar.s(30);
                            } else {
                                nlgVar.L(30, v15);
                            }
                            String v16 = sz8Var4.v(fieldTranslations8.getShortNameTranslation());
                            if (v16 != null) {
                                nlgVar.L(31, v16);
                                break;
                            } else {
                                nlgVar.s(31);
                                break;
                            }
                        }
                    }
                }
        }
    }

    @Override // defpackage.ml4
    public final String O() {
        switch (this.w) {
            case 0:
                return "INSERT OR IGNORE INTO `tournament` (`id`,`name`,`category_id`,`category_name`,`category_flag`,`category_sport_id`,`category_sport_slug`,`category_nameTranslation`,`category_shortNameTranslation`,`unique_tournament_id`,`unique_tournament_name`,`unique_tournament_userCount`,`unique_tournament_hasEventPlayerStatistics`,`unique_tournament_hasBoxScore`,`unique_tournament_displayInverseHomeAwayTeams`,`unique_tournament_groundType`,`unique_tournament_tennisPoints`,`unique_tournament_gender`,`unique_tournament_category_id`,`unique_tournament_category_name`,`unique_tournament_category_flag`,`unique_tournament_category_sport_id`,`unique_tournament_category_sport_slug`,`unique_tournament_category_nameTranslation`,`unique_tournament_category_shortNameTranslation`,`unique_tournament_nameTranslation`,`unique_tournament_shortNameTranslation`,`nameTranslation`,`shortNameTranslation`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `teams` (`id`,`name`,`slug`,`userCount`,`type`,`nameCode`,`shortName`,`gender`,`ranking`,`disabled`,`national`,`sub_team_one_id`,`sub_team_one_name`,`sub_team_one_nameTranslation`,`sub_team_one_shortNameTranslation`,`sub_team_two_id`,`sub_team_two_name`,`sub_team_two_nameTranslation`,`sub_team_two_shortNameTranslation`,`sport_id`,`sport_slug`,`country_name`,`country_alpha2`,`nameTranslation`,`shortNameTranslation`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT INTO `events_table` (`winnerCode`,`aggregatedWinnerCode`,`homeTeamId`,`homeSubTeam1Id`,`homeSubTeam2Id`,`awayTeamId`,`awaySubTeam1Id`,`awaySubTeam2Id`,`hasEventPlayerHeatMap`,`startTimestamp`,`endTimestamp`,`id`,`tournamentId`,`uniqueTournamentId`,`previousLegEventId`,`lastPeriod`,`homeRedCards`,`awayRedCards`,`currentBattingTeamId`,`firstToServe`,`bestOfSets`,`bestOfLegs`,`finalRound`,`winType`,`crowdsourcingDataDisplayEnabled`,`crowdsourcingEnabled`,`finalResultOnly`,`streamContentId`,`streamContentGeoRestrictions`,`eventFilters`,`homeTeamSeed`,`awayTeamSeed`,`hide`,`mute`,`lastUpdate`,`season_id`,`status_code`,`status_description`,`status_type`,`time_played`,`time_periodLength`,`time_overtimeLength`,`time_totalPeriodCount`,`time_initial`,`time_max`,`time_currentPeriodStartTimestamp`,`time_extra`,`changes_changes`,`changes_changeTimestamp`,`am_football_currentYardsToFirstDown`,`am_football_currentDown`,`am_football_currentYardline`,`am_football_isGoalPossession`,`am_football_currentPossession`,`am_football_currentTeamHalf`,`var_homeTeam`,`var_awayTeam`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT INTO `my_stage_table` (`description`,`type`,`id`,`startDateTimestamp`,`flag`,`lastUpdate`,`isMuted`,`isHidden`,`status_code`,`status_description`,`status_type`,`winner_id`,`winner_name`,`parent_event_id`,`parent_event_description`,`parent_event_startTimestamp`,`parent_event_flag`,`stage_season_description`,`stage_season_year`,`stage_season_id`,`stage_season_unique_stage_id`,`stage_season_unique_stage_name`,`stage_season_unique_stage_primaryColorHex`,`stage_season_unique_stage_secondaryColorHex`,`stage_season_unique_stage_category_id`,`stage_season_unique_stage_category_name`,`stage_season_unique_stage_category_flag`,`stage_season_unique_stage_category_sport_id`,`stage_season_unique_stage_category_sport_slug`,`stage_season_unique_stage_category_nameTranslation`,`stage_season_unique_stage_category_shortNameTranslation`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
