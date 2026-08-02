package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Transfer;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e4b extends a7e {
    public final int b;
    public final Integer c;
    public final Context d;
    public final y3b e;
    public final String f;
    public final w3b g;

    public e4b(int i, Integer num, Context context, y3b y3bVar, String str, w3b w3bVar) {
        w3bVar.getClass();
        this.b = i;
        this.c = num;
        this.d = context;
        this.e = y3bVar;
        this.f = str;
        this.g = w3bVar;
    }

    @Override // defpackage.a7e
    public final Object a(c7e c7eVar) {
        c7eVar.getClass();
        Integer num = c7eVar.b;
        if (num != null) {
            c7eVar.a(num.intValue());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // defpackage.a7e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(y6e y6eVar, sq3 sq3Var) {
        d4b d4bVar;
        int i;
        int i2;
        Iterator it;
        Object obj;
        Integer num;
        Player player;
        Player player2;
        Player player3;
        Iterator it2;
        String u;
        Object lyaVar;
        Team transferFrom;
        if (sq3Var instanceof d4b) {
            d4bVar = (d4b) sq3Var;
            int i3 = d4bVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d4bVar.u = i3 - Integer.MIN_VALUE;
                d4b d4bVar2 = d4bVar;
                Object obj2 = d4bVar2.s;
                lu3 lu3Var = lu3.a;
                i = d4bVar2.u;
                String str = null;
                if (i != 0) {
                    y6a.M(obj2);
                    Integer num2 = (Integer) y6eVar.a();
                    int intValue = num2 != null ? num2.intValue() : 0;
                    String str2 = this.e.c;
                    d4bVar2.r = intValue;
                    d4bVar2.u = 1;
                    obj2 = this.g.n(this.b, intValue, d4bVar2, this.c, str2);
                    if (obj2 == lu3Var) {
                        return lu3Var;
                    }
                    i2 = intValue;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = d4bVar2.r;
                    y6a.M(obj2);
                }
                ArrayList arrayList = new ArrayList();
                it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    Transfer transfer = (Transfer) it.next();
                    Iterator<E> it3 = y3b.k.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            Integer type = transfer.getType();
                            int i4 = ((y3b) obj).b;
                            if (type != null && type.intValue() == i4) {
                            }
                        } else {
                            obj = str;
                        }
                    }
                    y3b y3bVar = (y3b) obj;
                    if (y3bVar == null) {
                        it2 = it;
                        lyaVar = str;
                    } else {
                        switch (y3bVar.ordinal()) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 8:
                                Team transferTo = transfer.getTransferTo();
                                if (transferTo != null) {
                                    num = Integer.valueOf(transferTo.getId());
                                    String nameCode = (y3bVar == y3b.g || (transferFrom = transfer.getTransferFrom()) == null) ? str : transferFrom.getNameCode();
                                    long transferDateTimestamp = transfer.getTransferDateTimestamp();
                                    bi4 bi4Var = Instant.ofEpochMilli(1000 * transferDateTimestamp).atZone(ZoneId.systemDefault()).toLocalDate().getYear() != LocalDate.now().getYear() ? bi4.PATTERN_DM : bi4.PATTERN_DMY;
                                    Player player4 = transfer.getPlayer();
                                    int id = player4 == null ? player4.getId() : -1;
                                    player = transfer.getPlayer();
                                    if (player != null || (r16 = tba.t(player)) == null) {
                                        String str3 = "";
                                    }
                                    player2 = transfer.getPlayer();
                                    if (player2 != null || (u = player2.getPrimaryPosition()) == null) {
                                        player3 = transfer.getPlayer();
                                        if (player3 != null) {
                                            str = player3.getPosition();
                                        }
                                        Player player5 = transfer.getPlayer();
                                        it2 = it;
                                        u = dti.u(this.d, player5 == null ? player5.getGender() : null, this.f, str, true);
                                    } else {
                                        it2 = it;
                                    }
                                    String str4 = u.length() <= 0 ? u : null;
                                    int intValue2 = num == 0 ? num.intValue() : -1;
                                    String str5 = nameCode != null ? nameCode : "";
                                    ConcurrentHashMap concurrentHashMap = hk4.a;
                                    lyaVar = new lya(id, str3, str4, intValue2, str5, y3bVar, fc6.i(transferDateTimestamp, hk4.a(bi4Var.d())), transfer.getId());
                                    break;
                                }
                                num = str;
                                if (y3bVar == y3b.g) {
                                }
                                long transferDateTimestamp2 = transfer.getTransferDateTimestamp();
                                if (Instant.ofEpochMilli(1000 * transferDateTimestamp2).atZone(ZoneId.systemDefault()).toLocalDate().getYear() != LocalDate.now().getYear()) {
                                }
                                Player player42 = transfer.getPlayer();
                                if (player42 == null) {
                                }
                                player = transfer.getPlayer();
                                if (player != null) {
                                }
                                String str32 = "";
                                player2 = transfer.getPlayer();
                                if (player2 != null) {
                                }
                                player3 = transfer.getPlayer();
                                if (player3 != null) {
                                }
                                Player player52 = transfer.getPlayer();
                                it2 = it;
                                u = dti.u(this.d, player52 == null ? player52.getGender() : null, this.f, str, true);
                                if (u.length() <= 0) {
                                }
                                if (num == 0) {
                                }
                                if (nameCode != null) {
                                }
                                ConcurrentHashMap concurrentHashMap2 = hk4.a;
                                lyaVar = new lya(id, str32, str4, intValue2, str5, y3bVar, fc6.i(transferDateTimestamp2, hk4.a(bi4Var.d())), transfer.getId());
                            case 3:
                            case 5:
                            case 6:
                            case 9:
                                Team transferFrom2 = transfer.getTransferFrom();
                                if (transferFrom2 != null) {
                                    num = Integer.valueOf(transferFrom2.getId());
                                    if (y3bVar == y3b.g) {
                                    }
                                    long transferDateTimestamp22 = transfer.getTransferDateTimestamp();
                                    if (Instant.ofEpochMilli(1000 * transferDateTimestamp22).atZone(ZoneId.systemDefault()).toLocalDate().getYear() != LocalDate.now().getYear()) {
                                    }
                                    Player player422 = transfer.getPlayer();
                                    if (player422 == null) {
                                    }
                                    player = transfer.getPlayer();
                                    if (player != null) {
                                    }
                                    String str322 = "";
                                    player2 = transfer.getPlayer();
                                    if (player2 != null) {
                                    }
                                    player3 = transfer.getPlayer();
                                    if (player3 != null) {
                                    }
                                    Player player522 = transfer.getPlayer();
                                    it2 = it;
                                    u = dti.u(this.d, player522 == null ? player522.getGender() : null, this.f, str, true);
                                    if (u.length() <= 0) {
                                    }
                                    if (num == 0) {
                                    }
                                    if (nameCode != null) {
                                    }
                                    ConcurrentHashMap concurrentHashMap22 = hk4.a;
                                    lyaVar = new lya(id, str322, str4, intValue2, str5, y3bVar, fc6.i(transferDateTimestamp22, hk4.a(bi4Var.d())), transfer.getId());
                                    break;
                                }
                                num = str;
                                if (y3bVar == y3b.g) {
                                }
                                long transferDateTimestamp222 = transfer.getTransferDateTimestamp();
                                if (Instant.ofEpochMilli(1000 * transferDateTimestamp222).atZone(ZoneId.systemDefault()).toLocalDate().getYear() != LocalDate.now().getYear()) {
                                }
                                Player player4222 = transfer.getPlayer();
                                if (player4222 == null) {
                                }
                                player = transfer.getPlayer();
                                if (player != null) {
                                }
                                String str3222 = "";
                                player2 = transfer.getPlayer();
                                if (player2 != null) {
                                }
                                player3 = transfer.getPlayer();
                                if (player3 != null) {
                                }
                                Player player5222 = transfer.getPlayer();
                                it2 = it;
                                u = dti.u(this.d, player5222 == null ? player5222.getGender() : null, this.f, str, true);
                                if (u.length() <= 0) {
                                }
                                if (num == 0) {
                                }
                                if (nameCode != null) {
                                }
                                ConcurrentHashMap concurrentHashMap222 = hk4.a;
                                lyaVar = new lya(id, str3222, str4, intValue2, str5, y3bVar, fc6.i(transferDateTimestamp222, hk4.a(bi4Var.d())), transfer.getId());
                                break;
                            default:
                                zzl.b();
                                return str;
                        }
                    }
                    if (lyaVar != null) {
                        arrayList.add(lyaVar);
                    }
                    it = it2;
                    str = null;
                }
                gv9 W = l6g.W(arrayList);
                return new z6e(W, !W.isEmpty() ? null : new Integer(i2 + 1), Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
        }
        d4bVar = new d4b(this, sq3Var);
        d4b d4bVar22 = d4bVar;
        Object obj22 = d4bVar22.s;
        lu3 lu3Var2 = lu3.a;
        i = d4bVar22.u;
        String str6 = null;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        it = ((List) obj22).iterator();
        while (it.hasNext()) {
        }
        gv9 W2 = l6g.W(arrayList2);
        return new z6e(W2, !W2.isEmpty() ? null : new Integer(i2 + 1), Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
