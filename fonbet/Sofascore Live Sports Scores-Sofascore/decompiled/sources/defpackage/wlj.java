package defpackage;

import androidx.cardview.widget.CardView;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.profile.UserProfileActivity;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class wlj extends ot8 implements Function1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wlj(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gv9 gv9Var;
        Object obj2;
        uv3 uv3Var;
        String str;
        int i = 11;
        int i2 = 13;
        rq3 rq3Var = null;
        switch (this.b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                ((xlj) this.receiver).getClass();
                return xlj.b(list);
            case 1:
                mtj mtjVar = (mtj) obj;
                mtjVar.getClass();
                muj mujVar = (muj) this.receiver;
                LinkedHashMap linkedHashMap = mujVar.t;
                if (mtjVar instanceof jtj) {
                    mujVar.u(Integer.valueOf(((jtj) mtjVar).a));
                } else if (mtjVar instanceof ltj) {
                    ltj ltjVar = (ltj) mtjVar;
                    huj hujVar = ltjVar.a;
                    int i3 = ltjVar.b;
                    cuj cujVar = (cuj) mujVar.l().a();
                    if (cujVar != null) {
                        gv9 gv9Var2 = cujVar.j;
                        i5k.c(linkedHashMap).remove((Integer) CollectionsKt.a0(i3, gv9Var2));
                        ArrayList arrayList = new ArrayList(gv9Var2);
                        arrayList.set(i3, Integer.valueOf(hujVar.a));
                        mujVar.n(null, new s80(arrayList, 7));
                        g9i g9iVar = mujVar.u;
                        if (g9iVar != null) {
                            g9iVar.e(null);
                        }
                        mujVar.u = xw3.L(un0.z(mujVar), null, null, new luj(mujVar, rq3Var, r2), 3);
                    }
                } else if (mtjVar.equals(itj.a)) {
                    cuj cujVar2 = (cuj) mujVar.l().a();
                    if (cujVar2 != null) {
                        gv9 gv9Var3 = cujVar2.j;
                        if (gv9Var3.size() < 4) {
                            mujVar.n(null, new uo(12, l6g.W(CollectionsKt.x0(gv9Var3, 241802))));
                            muj.v(mujVar);
                        }
                    }
                } else {
                    if (!mtjVar.equals(ktj.a)) {
                        zzl.b();
                        return null;
                    }
                    cuj cujVar3 = (cuj) mujVar.l().a();
                    if (cujVar3 != null) {
                        gv9 gv9Var4 = cujVar3.j;
                        if (!gv9Var4.isEmpty()) {
                            i5k.c(linkedHashMap).remove((Integer) CollectionsKt.h0(gv9Var4));
                            mujVar.n(null, new uo(i, l6g.W(CollectionsKt.T(gv9Var4))));
                            muj.v(mujVar);
                        }
                    }
                }
                return Unit.a;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                TypeHeaderView typeHeaderView = (TypeHeaderView) this.receiver;
                int i4 = TypeHeaderView.q;
                typeHeaderView.s(str2);
                return Unit.a;
            case 3:
                return (Integer) ((gef) this.receiver).a(obj);
            case 4:
                ProfileData profileData = (ProfileData) obj;
                UserProfileActivity userProfileActivity = (UserProfileActivity) this.receiver;
                int i5 = UserProfileActivity.S;
                ((CardView) userProfileActivity.Q().g.b).setVisibility(profileData == null ? 8 : 0);
                if (profileData != null) {
                    userProfileActivity.Q().i.setOnBadgeRoleClickListener(new fej(i, userProfileActivity, profileData));
                }
                return Unit.a;
            case 5:
                Set set = (Set) obj;
                set.getClass();
                qkl qklVar = (qkl) this.receiver;
                qklVar.getClass();
                oil oilVar = (oil) qklVar.l().a();
                if (oilVar != null && (gv9Var = oilVar.q) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        Iterator<E> it2 = gv9Var.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                rxb rxbVar = (rxb) obj2;
                                if (rxbVar.a.getId() != intValue || !(rxbVar.g instanceof p2f)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        rxb rxbVar2 = (rxb) obj2;
                        if (rxbVar2 != null) {
                            arrayList2.add(rxbVar2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        g9i g9iVar2 = qklVar.R;
                        if (g9iVar2 != null) {
                            g9iVar2.e(null);
                        }
                        qklVar.R = xw3.L(un0.z(qklVar), null, null, new i3l(qklVar, arrayList2, rq3Var, i2), 3);
                    }
                }
                return Unit.a;
            case 6:
                wkl wklVar = (wkl) obj;
                wklVar.getClass();
                ill illVar = (ill) this.receiver;
                illVar.getClass();
                if (wklVar instanceof vkl) {
                    uv3 uv3Var2 = ((vkl) wklVar).a;
                    g9i g9iVar3 = illVar.o;
                    if (g9iVar3 != null) {
                        g9iVar3.e(null);
                    }
                    illVar.o = xw3.L(un0.z(illVar), null, null, new ajj(illVar, uv3Var2, rq3Var, i2), 3);
                } else if (wklVar instanceof ukl) {
                    gll gllVar = (gll) illVar.l().a();
                    if (gllVar != null && (uv3Var = gllVar.b) != null && (str = uv3Var.b) != null) {
                        xw3.L(un0.z(illVar), null, null, new ly7(illVar, str, null), 3);
                    }
                } else {
                    if (!(wklVar instanceof tkl)) {
                        zzl.b();
                        return null;
                    }
                    illVar.k(cll.a);
                }
                return Unit.a;
            default:
                throw null;
        }
    }
}
