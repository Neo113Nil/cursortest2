package defpackage;

import com.sofascore.model.database.DbAmericanFootballDownDistance;
import com.sofascore.model.database.DbEvent;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.EventChanges;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageEvent;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StageWinner;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.VarInProgress;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r76 extends td4 {
    public final /* synthetic */ int m;
    public final /* synthetic */ v76 n;

    public /* synthetic */ r76(v76 v76Var, int i) {
        this.m = i;
        this.n = v76Var;
    }

    @Override // defpackage.td4
    public final void R(nlg nlgVar, Object obj) {
        int i = this.m;
        v76 v76Var = this.n;
        switch (i) {
            case 0:
                Stage stage = (Stage) obj;
                sz8 sz8Var = v76Var.c;
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
                Status status = stage.getStatus();
                if (status != null) {
                    nlgVar.q(9, status.getCode());
                    String description = status.getDescription();
                    if (description == null) {
                        nlgVar.s(10);
                    } else {
                        nlgVar.L(10, description);
                    }
                    nlgVar.L(11, status.getType());
                } else {
                    nlgVar.s(9);
                    nlgVar.s(10);
                    nlgVar.s(11);
                }
                StageWinner winner = stage.getWinner();
                if (winner != null) {
                    nlgVar.q(12, winner.getId());
                    String name = winner.getName();
                    if (name == null) {
                        nlgVar.s(13);
                    } else {
                        nlgVar.L(13, name);
                    }
                } else {
                    nlgVar.s(12);
                    nlgVar.s(13);
                }
                StageEvent parentEvent = stage.getParentEvent();
                if (parentEvent != null) {
                    nlgVar.q(14, parentEvent.getId());
                    String description2 = parentEvent.getDescription();
                    if (description2 == null) {
                        nlgVar.s(15);
                    } else {
                        nlgVar.L(15, description2);
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
                if (stageSeason != null) {
                    nlgVar.L(18, stageSeason.getDescription());
                    String year = stageSeason.getYear();
                    if (year == null) {
                        nlgVar.s(19);
                    } else {
                        nlgVar.L(19, year);
                    }
                    nlgVar.q(20, stageSeason.getId());
                    UniqueStage uniqueStage = stageSeason.getUniqueStage();
                    if (uniqueStage != null) {
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
                        Category category = uniqueStage.getCategory();
                        nlgVar.q(25, category.getId());
                        nlgVar.L(26, category.getName());
                        nlgVar.L(27, category.getFlag());
                        Sport sport = category.getSport();
                        nlgVar.q(28, sport.getId());
                        nlgVar.L(29, sport.getSlug());
                        FieldTranslations fieldTranslations = category.getFieldTranslations();
                        if (fieldTranslations != null) {
                            String v = sz8Var.v(fieldTranslations.getNameTranslation());
                            if (v == null) {
                                nlgVar.s(30);
                            } else {
                                nlgVar.L(30, v);
                            }
                            String v2 = sz8Var.v(fieldTranslations.getShortNameTranslation());
                            if (v2 == null) {
                                nlgVar.s(31);
                            } else {
                                nlgVar.L(31, v2);
                            }
                        } else {
                            nlgVar.s(30);
                            nlgVar.s(31);
                        }
                    } else {
                        me4.m(nlgVar, 21, 22, 23, 24);
                        me4.m(nlgVar, 25, 26, 27, 28);
                        nlgVar.s(29);
                        nlgVar.s(30);
                        nlgVar.s(31);
                    }
                } else {
                    me4.m(nlgVar, 18, 19, 20, 21);
                    me4.m(nlgVar, 22, 23, 24, 25);
                    me4.m(nlgVar, 26, 27, 28, 29);
                    nlgVar.s(30);
                    nlgVar.s(31);
                }
                nlgVar.q(32, stage.getId());
                break;
            case 1:
                DbEvent dbEvent = (DbEvent) obj;
                nlgVar.getClass();
                dbEvent.getClass();
                if (dbEvent.getWinnerCode() == null) {
                    nlgVar.s(1);
                } else {
                    nlgVar.q(1, r6.intValue());
                }
                if (dbEvent.getAggregatedWinnerCode() == null) {
                    nlgVar.s(2);
                } else {
                    nlgVar.q(2, r5.intValue());
                }
                nlgVar.q(3, dbEvent.getHomeTeamId());
                if (dbEvent.getHomeSubTeam1Id() == null) {
                    nlgVar.s(4);
                } else {
                    nlgVar.q(4, r5.intValue());
                }
                if (dbEvent.getHomeSubTeam2Id() == null) {
                    nlgVar.s(5);
                } else {
                    nlgVar.q(5, r5.intValue());
                }
                nlgVar.q(6, dbEvent.getAwayTeamId());
                if (dbEvent.getAwaySubTeam1Id() == null) {
                    nlgVar.s(7);
                } else {
                    nlgVar.q(7, r5.intValue());
                }
                if (dbEvent.getAwaySubTeam2Id() == null) {
                    nlgVar.s(8);
                } else {
                    nlgVar.q(8, r5.intValue());
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
                sz8 sz8Var2 = v76Var.c;
                String o = sz8Var2.o(streamContentGeoRestrictions);
                if (o == null) {
                    nlgVar.s(29);
                } else {
                    nlgVar.L(29, o);
                }
                String r = sz8Var2.r(dbEvent.getEventFilters());
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
                Status status2 = dbEvent.getStatus();
                nlgVar.q(37, status2.getCode());
                String description3 = status2.getDescription();
                if (description3 == null) {
                    nlgVar.s(38);
                } else {
                    nlgVar.L(38, description3);
                }
                nlgVar.L(39, status2.getType());
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
                    String o2 = sz8Var2.o(changes.getChanges());
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
                if (varInProgress != null) {
                    Boolean homeTeam = varInProgress.getHomeTeam();
                    if ((homeTeam != null ? Integer.valueOf(homeTeam.booleanValue() ? 1 : 0) : null) == null) {
                        nlgVar.s(56);
                    } else {
                        nlgVar.q(56, r6.intValue());
                    }
                    Boolean awayTeam = varInProgress.getAwayTeam();
                    if ((awayTeam != null ? Integer.valueOf(awayTeam.booleanValue() ? 1 : 0) : null) == null) {
                        nlgVar.s(57);
                    } else {
                        nlgVar.q(57, r4.intValue());
                    }
                } else {
                    nlgVar.s(56);
                    nlgVar.s(57);
                }
                nlgVar.q(58, dbEvent.getId());
                break;
            default:
                Stage stage2 = (Stage) obj;
                sz8 sz8Var3 = v76Var.c;
                nlgVar.getClass();
                stage2.getClass();
                nlgVar.L(1, stage2.getDescription());
                ServerType type2 = stage2.getType();
                if (type2 == null) {
                    nlgVar.s(2);
                } else {
                    nlgVar.L(2, v76.a(type2));
                }
                nlgVar.q(3, stage2.getId());
                nlgVar.q(4, stage2.getStartDateTimestamp());
                String flag3 = stage2.getFlag();
                if (flag3 == null) {
                    nlgVar.s(5);
                } else {
                    nlgVar.L(5, flag3);
                }
                nlgVar.q(6, stage2.getLastUpdate());
                nlgVar.q(7, stage2.getIsMuted() ? 1L : 0L);
                nlgVar.q(8, stage2.getIsHidden() ? 1L : 0L);
                Status status3 = stage2.getStatus();
                if (status3 != null) {
                    nlgVar.q(9, status3.getCode());
                    String description4 = status3.getDescription();
                    if (description4 == null) {
                        nlgVar.s(10);
                    } else {
                        nlgVar.L(10, description4);
                    }
                    nlgVar.L(11, status3.getType());
                } else {
                    nlgVar.s(9);
                    nlgVar.s(10);
                    nlgVar.s(11);
                }
                StageWinner winner2 = stage2.getWinner();
                if (winner2 != null) {
                    nlgVar.q(12, winner2.getId());
                    String name2 = winner2.getName();
                    if (name2 == null) {
                        nlgVar.s(13);
                    } else {
                        nlgVar.L(13, name2);
                    }
                } else {
                    nlgVar.s(12);
                    nlgVar.s(13);
                }
                StageEvent parentEvent2 = stage2.getParentEvent();
                if (parentEvent2 != null) {
                    nlgVar.q(14, parentEvent2.getId());
                    String description5 = parentEvent2.getDescription();
                    if (description5 == null) {
                        nlgVar.s(15);
                    } else {
                        nlgVar.L(15, description5);
                    }
                    Long startTimestamp2 = parentEvent2.getStartTimestamp();
                    if (startTimestamp2 == null) {
                        nlgVar.s(16);
                    } else {
                        nlgVar.q(16, startTimestamp2.longValue());
                    }
                    String flag4 = parentEvent2.getFlag();
                    if (flag4 == null) {
                        nlgVar.s(17);
                    } else {
                        nlgVar.L(17, flag4);
                    }
                } else {
                    me4.m(nlgVar, 14, 15, 16, 17);
                }
                StageSeason stageSeason2 = stage2.getStageSeason();
                if (stageSeason2 != null) {
                    nlgVar.L(18, stageSeason2.getDescription());
                    String year2 = stageSeason2.getYear();
                    if (year2 == null) {
                        nlgVar.s(19);
                    } else {
                        nlgVar.L(19, year2);
                    }
                    nlgVar.q(20, stageSeason2.getId());
                    UniqueStage uniqueStage2 = stageSeason2.getUniqueStage();
                    if (uniqueStage2 != null) {
                        nlgVar.q(21, uniqueStage2.getId());
                        nlgVar.L(22, uniqueStage2.getName());
                        String primaryColorHex2 = uniqueStage2.getPrimaryColorHex();
                        if (primaryColorHex2 == null) {
                            nlgVar.s(23);
                        } else {
                            nlgVar.L(23, primaryColorHex2);
                        }
                        String secondaryColorHex2 = uniqueStage2.getSecondaryColorHex();
                        if (secondaryColorHex2 == null) {
                            nlgVar.s(24);
                        } else {
                            nlgVar.L(24, secondaryColorHex2);
                        }
                        Category category2 = uniqueStage2.getCategory();
                        nlgVar.q(25, category2.getId());
                        nlgVar.L(26, category2.getName());
                        nlgVar.L(27, category2.getFlag());
                        Sport sport2 = category2.getSport();
                        nlgVar.q(28, sport2.getId());
                        nlgVar.L(29, sport2.getSlug());
                        FieldTranslations fieldTranslations2 = category2.getFieldTranslations();
                        if (fieldTranslations2 != null) {
                            String v3 = sz8Var3.v(fieldTranslations2.getNameTranslation());
                            if (v3 == null) {
                                nlgVar.s(30);
                            } else {
                                nlgVar.L(30, v3);
                            }
                            String v4 = sz8Var3.v(fieldTranslations2.getShortNameTranslation());
                            if (v4 == null) {
                                nlgVar.s(31);
                            } else {
                                nlgVar.L(31, v4);
                            }
                        } else {
                            nlgVar.s(30);
                            nlgVar.s(31);
                        }
                    } else {
                        me4.m(nlgVar, 21, 22, 23, 24);
                        me4.m(nlgVar, 25, 26, 27, 28);
                        nlgVar.s(29);
                        nlgVar.s(30);
                        nlgVar.s(31);
                    }
                } else {
                    me4.m(nlgVar, 18, 19, 20, 21);
                    me4.m(nlgVar, 22, 23, 24, 25);
                    me4.m(nlgVar, 26, 27, 28, 29);
                    nlgVar.s(30);
                    nlgVar.s(31);
                }
                nlgVar.q(32, stage2.getId());
                break;
        }
    }

    @Override // defpackage.td4
    public final String W() {
        switch (this.m) {
            case 0:
                return "UPDATE OR REPLACE `my_stage_table` SET `description` = ?,`type` = ?,`id` = ?,`startDateTimestamp` = ?,`flag` = ?,`lastUpdate` = ?,`isMuted` = ?,`isHidden` = ?,`status_code` = ?,`status_description` = ?,`status_type` = ?,`winner_id` = ?,`winner_name` = ?,`parent_event_id` = ?,`parent_event_description` = ?,`parent_event_startTimestamp` = ?,`parent_event_flag` = ?,`stage_season_description` = ?,`stage_season_year` = ?,`stage_season_id` = ?,`stage_season_unique_stage_id` = ?,`stage_season_unique_stage_name` = ?,`stage_season_unique_stage_primaryColorHex` = ?,`stage_season_unique_stage_secondaryColorHex` = ?,`stage_season_unique_stage_category_id` = ?,`stage_season_unique_stage_category_name` = ?,`stage_season_unique_stage_category_flag` = ?,`stage_season_unique_stage_category_sport_id` = ?,`stage_season_unique_stage_category_sport_slug` = ?,`stage_season_unique_stage_category_nameTranslation` = ?,`stage_season_unique_stage_category_shortNameTranslation` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE `events_table` SET `winnerCode` = ?,`aggregatedWinnerCode` = ?,`homeTeamId` = ?,`homeSubTeam1Id` = ?,`homeSubTeam2Id` = ?,`awayTeamId` = ?,`awaySubTeam1Id` = ?,`awaySubTeam2Id` = ?,`hasEventPlayerHeatMap` = ?,`startTimestamp` = ?,`endTimestamp` = ?,`id` = ?,`tournamentId` = ?,`uniqueTournamentId` = ?,`previousLegEventId` = ?,`lastPeriod` = ?,`homeRedCards` = ?,`awayRedCards` = ?,`currentBattingTeamId` = ?,`firstToServe` = ?,`bestOfSets` = ?,`bestOfLegs` = ?,`finalRound` = ?,`winType` = ?,`crowdsourcingDataDisplayEnabled` = ?,`crowdsourcingEnabled` = ?,`finalResultOnly` = ?,`streamContentId` = ?,`streamContentGeoRestrictions` = ?,`eventFilters` = ?,`homeTeamSeed` = ?,`awayTeamSeed` = ?,`hide` = ?,`mute` = ?,`lastUpdate` = ?,`season_id` = ?,`status_code` = ?,`status_description` = ?,`status_type` = ?,`time_played` = ?,`time_periodLength` = ?,`time_overtimeLength` = ?,`time_totalPeriodCount` = ?,`time_initial` = ?,`time_max` = ?,`time_currentPeriodStartTimestamp` = ?,`time_extra` = ?,`changes_changes` = ?,`changes_changeTimestamp` = ?,`am_football_currentYardsToFirstDown` = ?,`am_football_currentDown` = ?,`am_football_currentYardline` = ?,`am_football_isGoalPossession` = ?,`am_football_currentPossession` = ?,`am_football_currentTeamHalf` = ?,`var_homeTeam` = ?,`var_awayTeam` = ? WHERE `id` = ?";
            default:
                return "UPDATE `my_stage_table` SET `description` = ?,`type` = ?,`id` = ?,`startDateTimestamp` = ?,`flag` = ?,`lastUpdate` = ?,`isMuted` = ?,`isHidden` = ?,`status_code` = ?,`status_description` = ?,`status_type` = ?,`winner_id` = ?,`winner_name` = ?,`parent_event_id` = ?,`parent_event_description` = ?,`parent_event_startTimestamp` = ?,`parent_event_flag` = ?,`stage_season_description` = ?,`stage_season_year` = ?,`stage_season_id` = ?,`stage_season_unique_stage_id` = ?,`stage_season_unique_stage_name` = ?,`stage_season_unique_stage_primaryColorHex` = ?,`stage_season_unique_stage_secondaryColorHex` = ?,`stage_season_unique_stage_category_id` = ?,`stage_season_unique_stage_category_name` = ?,`stage_season_unique_stage_category_flag` = ?,`stage_season_unique_stage_category_sport_id` = ?,`stage_season_unique_stage_category_sport_slug` = ?,`stage_season_unique_stage_category_nameTranslation` = ?,`stage_season_unique_stage_category_shortNameTranslation` = ? WHERE `id` = ?";
        }
    }
}
