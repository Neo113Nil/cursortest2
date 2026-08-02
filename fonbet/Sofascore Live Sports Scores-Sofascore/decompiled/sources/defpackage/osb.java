package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.newNetwork.CareerHistory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Losb;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class osb extends q8 {
    public final zsb e;
    public final yzc f;
    public final yzc g;
    public List h;
    public final Team i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osb(Application application, zsb zsbVar) {
        super(application);
        zsbVar.getClass();
        this.e = zsbVar;
        yzc yzcVar = new yzc();
        this.f = yzcVar;
        this.g = yzcVar;
        this.i = new Team(241802, "No team", false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k(List list) {
        String str;
        String name;
        String str2;
        String name2;
        int intValue;
        Integer endTimestamp;
        String str3;
        String name3;
        FieldTranslations fieldTranslations;
        FieldTranslations fieldTranslations2;
        FieldTranslations fieldTranslations3;
        String name4;
        FieldTranslations fieldTranslations4;
        String r;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            List B0 = CollectionsKt.B0(list);
            if (B0.size() == 1) {
                CareerHistory careerHistory = (CareerHistory) CollectionsKt.Y(B0);
                Integer startTimestamp = careerHistory.getStartTimestamp();
                int intValue2 = startTimestamp != null ? startTimestamp.intValue() : 0;
                Team team = careerHistory.getTeam();
                Team team2 = careerHistory.getTeam();
                if (team2 == null || (fieldTranslations4 = team2.getFieldTranslations()) == null || (r = tba.r(fieldTranslations4)) == null) {
                    Team team3 = careerHistory.getTeam();
                    name4 = team3 != null ? team3.getName() : null;
                } else {
                    name4 = r;
                }
                Transfer transfer = new Transfer(0, intValue2, null, null, team, null, name4, null, null, null, null, null, 4012, null);
                transfer.setManager(true);
                arrayList.add(transfer);
            } else {
                int size = B0.size() - 1;
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    CareerHistory careerHistory2 = (CareerHistory) B0.get(i);
                    i++;
                    CareerHistory careerHistory3 = (CareerHistory) B0.get(i);
                    Team team4 = careerHistory2.getTeam();
                    Team team5 = careerHistory3.getTeam();
                    int i3 = i2 + 1;
                    Integer startTimestamp2 = careerHistory3.getStartTimestamp();
                    int intValue3 = startTimestamp2 != null ? startTimestamp2.intValue() : 0;
                    if (team4 == null || (fieldTranslations3 = team4.getFieldTranslations()) == null || (name = tba.r(fieldTranslations3)) == null) {
                        if (team4 != null) {
                            name = team4.getName();
                        } else {
                            str = null;
                            if (team5 != null || (fieldTranslations2 = team5.getFieldTranslations()) == null || (name2 = tba.r(fieldTranslations2)) == null) {
                                if (team5 == null) {
                                    name2 = team5.getName();
                                } else {
                                    str2 = null;
                                    Transfer transfer2 = new Transfer(i2, intValue3, null, team4, team5, str, str2, null, null, null, null, null, 3972, null);
                                    transfer2.setManager(true);
                                    Integer startTimestamp3 = careerHistory3.getStartTimestamp();
                                    intValue = startTimestamp3 == null ? startTimestamp3.intValue() : 0;
                                    endTimestamp = careerHistory2.getEndTimestamp();
                                    if (intValue - (endTimestamp == null ? endTimestamp.intValue() : 0) < 7776000) {
                                        int i4 = i2 + 2;
                                        Integer endTimestamp2 = careerHistory2.getEndTimestamp();
                                        int intValue4 = endTimestamp2 != null ? endTimestamp2.intValue() : 0;
                                        if (team4 == null || (fieldTranslations = team4.getFieldTranslations()) == null || (name3 = tba.r(fieldTranslations)) == null) {
                                            if (team4 != null) {
                                                name3 = team4.getName();
                                            } else {
                                                str3 = null;
                                                Team team6 = this.i;
                                                Transfer transfer3 = new Transfer(i3, intValue4, null, team4, this.i, str3, team6.getName(), null, null, null, null, null, 3972, null);
                                                transfer3.setManager(true);
                                                arrayList.add(transfer3);
                                                i2 += 3;
                                                transfer2.setId(i4);
                                                transfer2.setFromTeamName(team6.getName());
                                                transfer2.setTransferFrom(team6);
                                            }
                                        }
                                        str3 = name3;
                                        Team team62 = this.i;
                                        Transfer transfer32 = new Transfer(i3, intValue4, null, team4, this.i, str3, team62.getName(), null, null, null, null, null, 3972, null);
                                        transfer32.setManager(true);
                                        arrayList.add(transfer32);
                                        i2 += 3;
                                        transfer2.setId(i4);
                                        transfer2.setFromTeamName(team62.getName());
                                        transfer2.setTransferFrom(team62);
                                    } else {
                                        i2 = i3;
                                    }
                                    arrayList.add(transfer2);
                                }
                            }
                            str2 = name2;
                            Transfer transfer22 = new Transfer(i2, intValue3, null, team4, team5, str, str2, null, null, null, null, null, 3972, null);
                            transfer22.setManager(true);
                            Integer startTimestamp32 = careerHistory3.getStartTimestamp();
                            if (startTimestamp32 == null) {
                            }
                            endTimestamp = careerHistory2.getEndTimestamp();
                            if (intValue - (endTimestamp == null ? endTimestamp.intValue() : 0) < 7776000) {
                            }
                            arrayList.add(transfer22);
                        }
                    }
                    str = name;
                    if (team5 != null) {
                    }
                    if (team5 == null) {
                    }
                }
            }
        }
        return CollectionsKt.B0(arrayList);
    }
}
