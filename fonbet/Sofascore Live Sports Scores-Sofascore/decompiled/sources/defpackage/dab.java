package defpackage;

import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.LineupsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class dab {
    public static final void a(LineupsResponse lineupsResponse, List list) {
        lineupsResponse.getClass();
        list.getClass();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Incident incident = (Incident) it.next();
            if (incident instanceof Incident.GoalIncident) {
                Incident.GoalIncident goalIncident = (Incident.GoalIncident) incident;
                Player player = goalIncident.getPlayer();
                if (player != null) {
                    Integer valueOf = Integer.valueOf(player.getId());
                    Object obj = hashMap.get(Integer.valueOf(player.getId()));
                    if (obj == null) {
                        obj = new ArrayList();
                    }
                    ((List) obj).add(incident);
                    hashMap.put(valueOf, obj);
                }
                Player assist1 = goalIncident.getAssist1();
                if (assist1 != null) {
                    Integer valueOf2 = Integer.valueOf(assist1.getId());
                    Object obj2 = hashMap.get(Integer.valueOf(assist1.getId()));
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                    }
                    ((List) obj2).add(incident);
                    hashMap.put(valueOf2, obj2);
                }
            } else if (incident instanceof Incident.CardIncident) {
                Player player2 = ((Incident.CardIncident) incident).getPlayer();
                if (player2 != null) {
                    Integer valueOf3 = Integer.valueOf(player2.getId());
                    Object obj3 = hashMap.get(Integer.valueOf(player2.getId()));
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                    }
                    ((List) obj3).add(incident);
                    hashMap.put(valueOf3, obj3);
                }
            } else if (incident instanceof Incident.SubstitutionIncident) {
                Incident.SubstitutionIncident substitutionIncident = (Incident.SubstitutionIncident) incident;
                Player playerIn = substitutionIncident.getPlayerIn();
                if (playerIn != null) {
                    Integer valueOf4 = Integer.valueOf(playerIn.getId());
                    Object obj4 = hashMap.get(Integer.valueOf(playerIn.getId()));
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                    }
                    ((List) obj4).add(incident);
                    hashMap.put(valueOf4, obj4);
                }
                Player playerOut = substitutionIncident.getPlayerOut();
                if (playerOut != null) {
                    Integer valueOf5 = Integer.valueOf(playerOut.getId());
                    Object obj5 = hashMap.get(Integer.valueOf(playerOut.getId()));
                    if (obj5 == null) {
                        obj5 = new ArrayList();
                    }
                    ((List) obj5).add(incident);
                    hashMap.put(valueOf5, obj5);
                }
            }
        }
        b(hashMap, LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers());
        b(hashMap, LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers());
    }

    public static final void b(HashMap hashMap, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlayerData playerData = (PlayerData) it.next();
            List<Incident> list2 = (List) hashMap.get(Integer.valueOf(playerData.getPlayer().getId()));
            if (list2 != null) {
                for (Incident incident : list2) {
                    if (incident instanceof Incident.GoalIncident) {
                        Incident.GoalIncident goalIncident = (Incident.GoalIncident) incident;
                        Player player = goalIncident.getPlayer();
                        if (player == null || player.getId() != playerData.getPlayer().getId()) {
                            Player assist1 = goalIncident.getAssist1();
                            if (assist1 != null && assist1.getId() == playerData.getPlayer().getId()) {
                                playerData.addAssistIncident(goalIncident);
                            }
                        } else {
                            playerData.addGoalIncident(goalIncident);
                        }
                    } else if (incident instanceof Incident.CardIncident) {
                        playerData.addCardIncident((Incident.CardIncident) incident);
                    } else if (incident instanceof Incident.SubstitutionIncident) {
                        playerData.addSubstitutionIncident((Incident.SubstitutionIncident) incident);
                    }
                }
            }
        }
    }

    public static final void c(int i, LineupsResponse lineupsResponse) {
        lineupsResponse.getClass();
        Object obj = null;
        Iterator it = CollectionsKt.w0(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers(), LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((PlayerData) next).getPlayer().getId() == i) {
                obj = next;
                break;
            }
        }
        PlayerData playerData = (PlayerData) obj;
        if (playerData != null) {
            playerData.getPlayer().setTopRated(true);
        }
    }
}
