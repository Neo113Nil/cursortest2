package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.results.R;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kwa extends jzk {
    public boolean A;
    public final KClass B;
    public final String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwa(FragmentActivity fragmentActivity, String str, Fragment fragment, Map map) {
        super(fragmentActivity, null, fragment, map);
        fragmentActivity.getClass();
        str.getClass();
        this.z = str;
        this.A = true;
        this.B = duf.a.getOrCreateKotlinClass(Round.class);
    }

    public static void Z(xbb xbbVar, Round round, int i) {
        Object a0 = CollectionsKt.a0(i - 1, xbbVar);
        y21 y21Var = a0 instanceof y21 ? (y21) a0 : null;
        if (y21Var != null) {
            y21Var.n = true;
        }
        xbbVar.add(i, round);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fd  */
    /* JADX WARN: Type inference failed for: r4v44, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.jzk, defpackage.w0, defpackage.g7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(List list) {
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String h;
        String str;
        String concat;
        lrj lrjVar;
        boolean z6;
        Integer round;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof lrj) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof krj) {
                arrayList2.add(obj2);
            }
        }
        int size2 = arrayList2.size();
        char c2 = 2;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = size < 2 && size2 < 1;
        boolean z10 = size < 1 && size2 < 2;
        xbb b = a.b();
        ?? r8 = -1;
        String str2 = "";
        for (Object obj3 : list) {
            if (obj3 instanceof y21) {
                y21 y21Var = (y21) obj3;
                y21Var.n = z8;
                y21 y21Var2 = obj3 instanceof y21 ? (y21) obj3 : null;
                if (y21Var2 != null) {
                    y21Var2.M = z8;
                }
                Event d = y21Var.d();
                Round roundInfo = d.getRoundInfo();
                char c3 = c2;
                z2 = z7;
                long startTimestamp = d.getStartTimestamp();
                bi4 bi4Var = bi4.PATTERN_DMM;
                String h2 = rik.h(startTimestamp, bi4Var);
                String str3 = this.z;
                boolean c4 = Intrinsics.c(str3, Sports.CRICKET);
                c = c3;
                boolean c5 = Intrinsics.c(str3, Sports.TENNIS);
                if (this.A && roundInfo != null && ((round = roundInfo.getRound()) == null || round.intValue() != r8)) {
                    if ((!z9 && (CollectionsKt.j0(b) instanceof lrj)) || (CollectionsKt.j0(b) instanceof krj)) {
                        Z(b, roundInfo, b.size() - 1);
                    } else if ((CollectionsKt.j0(b) instanceof lrj) || (CollectionsKt.j0(b) instanceof krj)) {
                        Z(b, roundInfo, b.size() - 1);
                    } else {
                        Z(b, roundInfo, b.size());
                    }
                    Integer round2 = roundInfo.getRound();
                    z = z10;
                    str = h2;
                    z3 = z9;
                    z6 = round2 != null ? round2.intValue() : z8;
                } else if (this.A || h2.equals(str2) || c4) {
                    z = z10;
                    z3 = z9;
                    z5 = false;
                    r8 = r8;
                    str2 = str2;
                    if ((CollectionsKt.j0(b) instanceof lrj) && !z5) {
                        boolean z11 = CollectionsKt.a0(b.size() - 2, b) instanceof y21;
                        Object j0 = CollectionsKt.j0(b);
                        lrjVar = !(j0 instanceof lrj) ? (lrj) j0 : null;
                        if (lrjVar != null) {
                            lrjVar.k = (!z11 || c4) ? z2 : false;
                        }
                    }
                    b.add(obj3);
                    z4 = false;
                } else {
                    if (c5) {
                        boolean w = ug5.w(d.getStartTimestamp());
                        Context context = this.b;
                        if (w) {
                            concat = dmi.y(context.getString(R.string.yesterday), " • ");
                        } else if (ug5.u(d.getStartTimestamp())) {
                            concat = dmi.y(context.getString(R.string.today), " • ");
                        } else if (ug5.v(d.getStartTimestamp())) {
                            concat = dmi.y(context.getString(R.string.tomorrow), " • ");
                        } else {
                            z3 = z9;
                            long startTimestamp2 = d.getStartTimestamp();
                            bi4 bi4Var2 = bi4.PATTERN_DAY_SHORT;
                            Locale locale = Locale.getDefault();
                            locale.getClass();
                            z = z10;
                            ZoneId systemDefault = ZoneId.systemDefault();
                            systemDefault.getClass();
                            concat = rik.i(startTimestamp2, bi4Var2, locale, systemDefault).concat(" • ");
                            long startTimestamp3 = d.getStartTimestamp();
                            Locale locale2 = Locale.getDefault();
                            locale2.getClass();
                            ZoneId systemDefault2 = ZoneId.systemDefault();
                            systemDefault2.getClass();
                            h = concat.concat(rik.i(startTimestamp3, bi4Var, locale2, systemDefault2));
                        }
                        z = z10;
                        z3 = z9;
                        long startTimestamp32 = d.getStartTimestamp();
                        Locale locale22 = Locale.getDefault();
                        locale22.getClass();
                        ZoneId systemDefault22 = ZoneId.systemDefault();
                        systemDefault22.getClass();
                        h = concat.concat(rik.i(startTimestamp32, bi4Var, locale22, systemDefault22));
                    } else {
                        z = z10;
                        z3 = z9;
                        h = rik.h(d.getStartTimestamp(), bi4.PATTERN_DAY_SHORT);
                    }
                    if ((CollectionsKt.j0(b) instanceof lrj) || (CollectionsKt.j0(b) instanceof krj)) {
                        Z(b, new Round(h), b.size() - 1);
                    } else {
                        Z(b, new Round(h), b.size());
                    }
                    str = h2;
                    z6 = r8;
                }
                z5 = z2;
                r8 = z6;
                str2 = str;
                if (CollectionsKt.j0(b) instanceof lrj) {
                    boolean z112 = CollectionsKt.a0(b.size() - 2, b) instanceof y21;
                    Object j02 = CollectionsKt.j0(b);
                    if (!(j02 instanceof lrj)) {
                    }
                    if (lrjVar != null) {
                    }
                }
                b.add(obj3);
                z4 = false;
            } else {
                z = z10;
                c = c2;
                z2 = z7;
                z3 = z9;
                if (!(obj3 instanceof lrj) || z3) {
                    z4 = false;
                    if ((obj3 instanceof krj) && !z) {
                        b.add(obj3);
                    }
                } else {
                    lrj lrjVar2 = (lrj) obj3;
                    z4 = false;
                    lrjVar2.k = false;
                    lrjVar2.l = false;
                    lrjVar2.b = false;
                    b.add(obj3);
                    Object a0 = CollectionsKt.a0(b.size() - 2, b);
                    y21 y21Var3 = a0 instanceof y21 ? (y21) a0 : null;
                    if (y21Var3 != null) {
                        y21Var3.n = Intrinsics.c(lrjVar2.a.getCategory().getSport().getSlug(), Sports.CRICKET);
                    }
                }
            }
            z8 = z4;
            z9 = z3;
            z7 = z2;
            c2 = c;
            z10 = z;
            r8 = r8;
        }
        super.F(a.a(b));
    }

    @Override // defpackage.jzk
    public final KClass Y() {
        return this.B;
    }

    @Override // defpackage.b7e, defpackage.g7
    public final void s() {
        this.x = 0;
        super.s();
    }

    @Override // defpackage.b7e, defpackage.qzh, defpackage.w0, defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (!(obj instanceof Round)) {
            return super.v(obj);
        }
        haf hafVar = pzh.b;
        return 23;
    }

    @Override // defpackage.jzk, defpackage.b7e, defpackage.qzh, defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        haf hafVar = pzh.b;
        return i == 23 ? new vh(o16.a(this.r, viewGroup), this.z) : super.z(viewGroup, i);
    }
}
