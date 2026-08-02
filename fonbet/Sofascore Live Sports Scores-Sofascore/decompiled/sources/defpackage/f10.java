package defpackage;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import com.sofascore.model.chat.Message;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.fantasy.highlights.gameweek.FantasyGameweekHighlightsActivity;
import com.sofascore.results.fantasy.ui.components.view.FantasyNotificationsActionButton;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.sofascore.results.tv.TVScheduleActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f10 implements b98 {
    public final /* synthetic */ int a;
    public final Object b;

    public f10(l4h l4hVar) {
        this.a = 4;
        l4hVar.getClass();
        this.b = l4hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, x4e] */
    /* JADX WARN: Type inference failed for: r0v15, types: [h2d] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h2d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h2d] */
    /* JADX WARN: Type inference failed for: r0v35, types: [h2d] */
    /* JADX WARN: Type inference failed for: r0v4, types: [h2d] */
    /* JADX WARN: Type inference failed for: r0v55, types: [h2d] */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(rq3 rq3Var) {
        v4e v4eVar;
        y4e y4eVar;
        h2d h2dVar;
        x4e x4eVar;
        rfb F;
        ku3 ku3Var;
        x4e x4eVar2;
        sfb sfbVar;
        rfb rfbVar;
        y4e y4eVar2;
        h2d h2dVar2;
        x4e x4eVar3;
        x4e x4eVar4;
        sfb sfbVar2;
        sfb sfbVar3;
        vvk vvkVar;
        x4e x4eVar5;
        x4e x4eVar6;
        ku3 ku3Var2;
        rfb rfbVar2;
        y4e y4eVar3;
        h2d h2dVar3;
        ku3 ku3Var3;
        x4e x4eVar7;
        sfb sfbVar4;
        rfb rfbVar3;
        y4e y4eVar4;
        h2d h2dVar4;
        x4e x4eVar8;
        x4e x4eVar9;
        sfb sfbVar5;
        sfb sfbVar6;
        vvk vvkVar2;
        x4e x4eVar10;
        x4e x4eVar11;
        ku3 ku3Var4;
        y4e y4eVar5;
        h2d h2dVar5;
        rfb rfbVar4;
        ku3 ku3Var5;
        x4e x4eVar12;
        sfb sfbVar7;
        y4e y4eVar6;
        h2d h2dVar6;
        x4e x4eVar13;
        x4e x4eVar14;
        sfb sfbVar8;
        sfb sfbVar9;
        vvk vvkVar3;
        x4e x4eVar15;
        x4e x4eVar16;
        ku3 ku3Var6;
        y4e y4eVar7;
        h2d h2dVar7;
        x4e x4eVar17;
        ?? r0 = (x4e) this.b;
        try {
            try {
                try {
                    if (rq3Var instanceof v4e) {
                        v4eVar = (v4e) rq3Var;
                        int i = v4eVar.B;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            v4eVar.B = i - Integer.MIN_VALUE;
                            Object obj = v4eVar.z;
                            lu3 lu3Var = lu3.a;
                            switch (v4eVar.B) {
                                case 0:
                                    y6a.M(obj);
                                    y4e y4eVar8 = r0.i;
                                    j2d j2dVar = y4eVar8.a;
                                    v4eVar.r = y4eVar8;
                                    v4eVar.s = r0;
                                    v4eVar.t = j2dVar;
                                    v4eVar.B = 1;
                                    if (j2dVar.e(v4eVar) != lu3Var) {
                                        y4eVar = y4eVar8;
                                        h2dVar = j2dVar;
                                        x4eVar = r0;
                                        try {
                                            a5e a5eVar = y4eVar.b;
                                            F = a5eVar.i.F();
                                            a5eVar.a((tvk) ((g7h) x4eVar.f.b).d);
                                            h2dVar.f(null);
                                            sfb sfbVar10 = sfb.a;
                                            rfbVar2 = F;
                                            qfb qfbVar = rfbVar2.b;
                                            qfb qfbVar2 = rfbVar2.c;
                                            return Unit.a;
                                        } finally {
                                        }
                                    }
                                    return lu3Var;
                                case 1:
                                    h2dVar = (h2d) v4eVar.t;
                                    x4e x4eVar18 = (x4e) v4eVar.s;
                                    y4eVar = (y4e) v4eVar.r;
                                    y6a.M(obj);
                                    x4eVar = x4eVar18;
                                    a5e a5eVar2 = y4eVar.b;
                                    F = a5eVar2.i.F();
                                    a5eVar2.a((tvk) ((g7h) x4eVar.f.b).d);
                                    h2dVar.f(null);
                                    sfb sfbVar102 = sfb.a;
                                    rfbVar2 = F;
                                    qfb qfbVar3 = rfbVar2.b;
                                    qfb qfbVar22 = rfbVar2.c;
                                    return Unit.a;
                                case 2:
                                    h2d h2dVar8 = (h2d) v4eVar.w;
                                    y4e y4eVar9 = (y4e) v4eVar.v;
                                    sfb sfbVar11 = (sfb) v4eVar.u;
                                    ku3 ku3Var7 = (ku3) v4eVar.t;
                                    x4e x4eVar19 = (x4e) v4eVar.s;
                                    rfb rfbVar5 = (rfb) v4eVar.r;
                                    y6a.M(obj);
                                    a5e a5eVar3 = y4eVar9.b;
                                    v4eVar.r = rfbVar5;
                                    v4eVar.s = x4eVar19;
                                    v4eVar.t = ku3Var7;
                                    v4eVar.u = sfbVar11;
                                    v4eVar.v = h2dVar8;
                                    v4eVar.w = null;
                                    v4eVar.B = 3;
                                    if (x4eVar19.k(a5eVar3, sfbVar11, v4eVar) == lu3Var) {
                                        return lu3Var;
                                    }
                                    ku3Var = ku3Var7;
                                    x4eVar2 = x4eVar19;
                                    sfbVar = sfbVar11;
                                    rfbVar = rfbVar5;
                                    r0 = h2dVar8;
                                    Unit unit = Unit.a;
                                    r0.f(null);
                                    if (u4e.a[sfbVar.ordinal()] == 1) {
                                        y4eVar2 = x4eVar2.i;
                                        h2dVar2 = y4eVar2.a;
                                        v4eVar.r = rfbVar;
                                        v4eVar.s = x4eVar2;
                                        v4eVar.t = ku3Var;
                                        v4eVar.u = sfbVar;
                                        v4eVar.v = y4eVar2;
                                        v4eVar.w = h2dVar2;
                                        v4eVar.x = sfbVar;
                                        v4eVar.y = x4eVar2;
                                        v4eVar.B = 4;
                                        if (h2dVar2.e(v4eVar) != lu3Var) {
                                            x4eVar3 = x4eVar2;
                                            x4eVar4 = x4eVar3;
                                            sfbVar2 = sfbVar;
                                            try {
                                                vvkVar = (vvk) y4eVar2.b.h.get(sfbVar2);
                                                h2dVar2.f(null);
                                                x4eVar5 = x4eVar3;
                                                sfbVar3 = sfbVar2;
                                                x4eVar2 = x4eVar4;
                                                v4eVar.r = rfbVar;
                                                v4eVar.s = x4eVar2;
                                                v4eVar.t = ku3Var;
                                                v4eVar.u = sfbVar3;
                                                v4eVar.v = null;
                                                v4eVar.w = null;
                                                v4eVar.x = null;
                                                v4eVar.y = null;
                                                v4eVar.B = 5;
                                                if (x4eVar5.j(sfbVar, vvkVar, v4eVar) != lu3Var) {
                                                }
                                            } finally {
                                            }
                                        }
                                        return lu3Var;
                                    }
                                    sfbVar3 = sfbVar;
                                    vvkVar = null;
                                    x4eVar5 = x4eVar2;
                                    v4eVar.r = rfbVar;
                                    v4eVar.s = x4eVar2;
                                    v4eVar.t = ku3Var;
                                    v4eVar.u = sfbVar3;
                                    v4eVar.v = null;
                                    v4eVar.w = null;
                                    v4eVar.x = null;
                                    v4eVar.y = null;
                                    v4eVar.B = 5;
                                    if (x4eVar5.j(sfbVar, vvkVar, v4eVar) != lu3Var) {
                                        x4eVar6 = x4eVar2;
                                        ku3Var2 = ku3Var;
                                        rfbVar2 = rfbVar;
                                        if (sfbVar3 == sfb.a) {
                                            y4eVar3 = x4eVar6.i;
                                            j2d j2dVar2 = y4eVar3.a;
                                            v4eVar.r = rfbVar2;
                                            v4eVar.s = x4eVar6;
                                            v4eVar.t = ku3Var2;
                                            v4eVar.u = y4eVar3;
                                            v4eVar.v = j2dVar2;
                                            v4eVar.B = 6;
                                            if (j2dVar2.e(v4eVar) != lu3Var) {
                                                h2dVar3 = j2dVar2;
                                                F = rfbVar2;
                                                try {
                                                    y4eVar3.b.i.h(sfb.a);
                                                    h2dVar3.f(null);
                                                    x4eVar6.l(ku3Var2);
                                                    rfbVar2 = F;
                                                } finally {
                                                }
                                            }
                                        }
                                        qfb qfbVar32 = rfbVar2.b;
                                        qfb qfbVar222 = rfbVar2.c;
                                        return Unit.a;
                                    }
                                    return lu3Var;
                                case 3:
                                    h2d h2dVar9 = (h2d) v4eVar.v;
                                    sfbVar = (sfb) v4eVar.u;
                                    ku3 ku3Var8 = (ku3) v4eVar.t;
                                    x4eVar2 = (x4e) v4eVar.s;
                                    rfb rfbVar6 = (rfb) v4eVar.r;
                                    y6a.M(obj);
                                    rfbVar = rfbVar6;
                                    ku3Var = ku3Var8;
                                    r0 = h2dVar9;
                                    Unit unit2 = Unit.a;
                                    r0.f(null);
                                    if (u4e.a[sfbVar.ordinal()] == 1) {
                                    }
                                    break;
                                case 4:
                                    x4eVar3 = v4eVar.y;
                                    sfbVar = (sfb) v4eVar.x;
                                    h2dVar2 = (h2d) v4eVar.w;
                                    y4eVar2 = (y4e) v4eVar.v;
                                    sfbVar2 = (sfb) v4eVar.u;
                                    ku3Var = (ku3) v4eVar.t;
                                    x4eVar4 = (x4e) v4eVar.s;
                                    rfbVar = (rfb) v4eVar.r;
                                    y6a.M(obj);
                                    vvkVar = (vvk) y4eVar2.b.h.get(sfbVar2);
                                    h2dVar2.f(null);
                                    x4eVar5 = x4eVar3;
                                    sfbVar3 = sfbVar2;
                                    x4eVar2 = x4eVar4;
                                    v4eVar.r = rfbVar;
                                    v4eVar.s = x4eVar2;
                                    v4eVar.t = ku3Var;
                                    v4eVar.u = sfbVar3;
                                    v4eVar.v = null;
                                    v4eVar.w = null;
                                    v4eVar.x = null;
                                    v4eVar.y = null;
                                    v4eVar.B = 5;
                                    if (x4eVar5.j(sfbVar, vvkVar, v4eVar) != lu3Var) {
                                    }
                                    return lu3Var;
                                case 5:
                                    sfbVar3 = (sfb) v4eVar.u;
                                    ku3Var2 = (ku3) v4eVar.t;
                                    x4eVar6 = (x4e) v4eVar.s;
                                    rfbVar2 = (rfb) v4eVar.r;
                                    y6a.M(obj);
                                    if (sfbVar3 == sfb.a) {
                                    }
                                    qfb qfbVar322 = rfbVar2.b;
                                    qfb qfbVar2222 = rfbVar2.c;
                                    return Unit.a;
                                case 6:
                                    h2dVar3 = (h2d) v4eVar.v;
                                    y4eVar3 = (y4e) v4eVar.u;
                                    ku3Var2 = (ku3) v4eVar.t;
                                    x4eVar6 = (x4e) v4eVar.s;
                                    F = (rfb) v4eVar.r;
                                    y6a.M(obj);
                                    y4eVar3.b.i.h(sfb.a);
                                    h2dVar3.f(null);
                                    x4eVar6.l(ku3Var2);
                                    rfbVar2 = F;
                                    qfb qfbVar3222 = rfbVar2.b;
                                    qfb qfbVar22222 = rfbVar2.c;
                                    return Unit.a;
                                case 7:
                                    h2d h2dVar10 = (h2d) v4eVar.w;
                                    y4e y4eVar10 = (y4e) v4eVar.v;
                                    sfb sfbVar12 = (sfb) v4eVar.u;
                                    ku3 ku3Var9 = (ku3) v4eVar.t;
                                    x4e x4eVar20 = (x4e) v4eVar.s;
                                    rfb rfbVar7 = (rfb) v4eVar.r;
                                    y6a.M(obj);
                                    a5e a5eVar4 = y4eVar10.b;
                                    v4eVar.r = rfbVar7;
                                    v4eVar.s = x4eVar20;
                                    v4eVar.t = ku3Var9;
                                    v4eVar.u = sfbVar12;
                                    v4eVar.v = h2dVar10;
                                    v4eVar.w = null;
                                    v4eVar.B = 8;
                                    if (x4eVar20.k(a5eVar4, sfbVar12, v4eVar) == lu3Var) {
                                        return lu3Var;
                                    }
                                    ku3Var3 = ku3Var9;
                                    x4eVar7 = x4eVar20;
                                    sfbVar4 = sfbVar12;
                                    rfbVar3 = rfbVar7;
                                    r0 = h2dVar10;
                                    Unit unit3 = Unit.a;
                                    r0.f(null);
                                    if (u4e.a[sfbVar4.ordinal()] == 1) {
                                        y4eVar4 = x4eVar7.i;
                                        h2dVar4 = y4eVar4.a;
                                        v4eVar.r = rfbVar3;
                                        v4eVar.s = x4eVar7;
                                        v4eVar.t = ku3Var3;
                                        v4eVar.u = sfbVar4;
                                        v4eVar.v = y4eVar4;
                                        v4eVar.w = h2dVar4;
                                        v4eVar.x = sfbVar4;
                                        v4eVar.y = x4eVar7;
                                        v4eVar.B = 9;
                                        if (h2dVar4.e(v4eVar) != lu3Var) {
                                            x4eVar8 = x4eVar7;
                                            x4eVar9 = x4eVar8;
                                            sfbVar5 = sfbVar4;
                                            try {
                                                vvkVar2 = (vvk) y4eVar4.b.h.get(sfbVar5);
                                                h2dVar4.f(null);
                                                x4eVar10 = x4eVar8;
                                                sfbVar6 = sfbVar5;
                                                x4eVar7 = x4eVar9;
                                                v4eVar.r = rfbVar3;
                                                v4eVar.s = x4eVar7;
                                                v4eVar.t = ku3Var3;
                                                v4eVar.u = sfbVar6;
                                                v4eVar.v = null;
                                                v4eVar.w = null;
                                                v4eVar.x = null;
                                                v4eVar.y = null;
                                                v4eVar.B = 10;
                                                if (x4eVar10.j(sfbVar4, vvkVar2, v4eVar) != lu3Var) {
                                                }
                                            } finally {
                                            }
                                        }
                                        return lu3Var;
                                    }
                                    sfbVar6 = sfbVar4;
                                    vvkVar2 = null;
                                    x4eVar10 = x4eVar7;
                                    v4eVar.r = rfbVar3;
                                    v4eVar.s = x4eVar7;
                                    v4eVar.t = ku3Var3;
                                    v4eVar.u = sfbVar6;
                                    v4eVar.v = null;
                                    v4eVar.w = null;
                                    v4eVar.x = null;
                                    v4eVar.y = null;
                                    v4eVar.B = 10;
                                    if (x4eVar10.j(sfbVar4, vvkVar2, v4eVar) != lu3Var) {
                                        x4eVar11 = x4eVar7;
                                        ku3Var4 = ku3Var3;
                                        rfbVar2 = rfbVar3;
                                        if (sfbVar6 == sfb.a) {
                                            y4eVar5 = x4eVar11.i;
                                            j2d j2dVar3 = y4eVar5.a;
                                            v4eVar.r = rfbVar2;
                                            v4eVar.s = x4eVar11;
                                            v4eVar.t = ku3Var4;
                                            v4eVar.u = y4eVar5;
                                            v4eVar.v = j2dVar3;
                                            v4eVar.B = 11;
                                            if (j2dVar3.e(v4eVar) != lu3Var) {
                                                h2dVar5 = j2dVar3;
                                                rfbVar4 = rfbVar2;
                                                try {
                                                    y4eVar5.b.i.h(sfb.a);
                                                    h2dVar5.f(null);
                                                    x4eVar11.l(ku3Var4);
                                                    rfbVar2 = rfbVar4;
                                                } finally {
                                                }
                                            }
                                        }
                                        qfb qfbVar222222 = rfbVar2.c;
                                        return Unit.a;
                                    }
                                    return lu3Var;
                                case 8:
                                    h2d h2dVar11 = (h2d) v4eVar.v;
                                    sfbVar4 = (sfb) v4eVar.u;
                                    ku3 ku3Var10 = (ku3) v4eVar.t;
                                    x4eVar7 = (x4e) v4eVar.s;
                                    rfb rfbVar8 = (rfb) v4eVar.r;
                                    y6a.M(obj);
                                    rfbVar3 = rfbVar8;
                                    ku3Var3 = ku3Var10;
                                    r0 = h2dVar11;
                                    Unit unit32 = Unit.a;
                                    r0.f(null);
                                    if (u4e.a[sfbVar4.ordinal()] == 1) {
                                    }
                                    break;
                                case 9:
                                    x4eVar8 = v4eVar.y;
                                    sfbVar4 = (sfb) v4eVar.x;
                                    h2dVar4 = (h2d) v4eVar.w;
                                    y4eVar4 = (y4e) v4eVar.v;
                                    sfbVar5 = (sfb) v4eVar.u;
                                    ku3Var3 = (ku3) v4eVar.t;
                                    x4eVar9 = (x4e) v4eVar.s;
                                    rfbVar3 = (rfb) v4eVar.r;
                                    y6a.M(obj);
                                    vvkVar2 = (vvk) y4eVar4.b.h.get(sfbVar5);
                                    h2dVar4.f(null);
                                    x4eVar10 = x4eVar8;
                                    sfbVar6 = sfbVar5;
                                    x4eVar7 = x4eVar9;
                                    v4eVar.r = rfbVar3;
                                    v4eVar.s = x4eVar7;
                                    v4eVar.t = ku3Var3;
                                    v4eVar.u = sfbVar6;
                                    v4eVar.v = null;
                                    v4eVar.w = null;
                                    v4eVar.x = null;
                                    v4eVar.y = null;
                                    v4eVar.B = 10;
                                    if (x4eVar10.j(sfbVar4, vvkVar2, v4eVar) != lu3Var) {
                                    }
                                    return lu3Var;
                                case 10:
                                    sfbVar6 = (sfb) v4eVar.u;
                                    ku3Var4 = (ku3) v4eVar.t;
                                    x4eVar11 = (x4e) v4eVar.s;
                                    rfbVar2 = (rfb) v4eVar.r;
                                    y6a.M(obj);
                                    if (sfbVar6 == sfb.a) {
                                    }
                                    qfb qfbVar2222222 = rfbVar2.c;
                                    return Unit.a;
                                case 11:
                                    h2dVar5 = (h2d) v4eVar.v;
                                    y4eVar5 = (y4e) v4eVar.u;
                                    ku3Var4 = (ku3) v4eVar.t;
                                    x4eVar11 = (x4e) v4eVar.s;
                                    rfbVar4 = (rfb) v4eVar.r;
                                    y6a.M(obj);
                                    y4eVar5.b.i.h(sfb.a);
                                    h2dVar5.f(null);
                                    x4eVar11.l(ku3Var4);
                                    rfbVar2 = rfbVar4;
                                    qfb qfbVar22222222 = rfbVar2.c;
                                    return Unit.a;
                                case 12:
                                    h2d h2dVar12 = (h2d) v4eVar.v;
                                    y4e y4eVar11 = (y4e) v4eVar.u;
                                    sfb sfbVar13 = (sfb) v4eVar.t;
                                    ku3 ku3Var11 = (ku3) v4eVar.s;
                                    x4e x4eVar21 = (x4e) v4eVar.r;
                                    y6a.M(obj);
                                    a5e a5eVar5 = y4eVar11.b;
                                    v4eVar.r = x4eVar21;
                                    v4eVar.s = ku3Var11;
                                    v4eVar.t = sfbVar13;
                                    v4eVar.u = h2dVar12;
                                    v4eVar.v = null;
                                    v4eVar.B = 13;
                                    if (x4eVar21.k(a5eVar5, sfbVar13, v4eVar) == lu3Var) {
                                        return lu3Var;
                                    }
                                    ku3Var5 = ku3Var11;
                                    x4eVar12 = x4eVar21;
                                    sfbVar7 = sfbVar13;
                                    r0 = h2dVar12;
                                    Unit unit4 = Unit.a;
                                    r0.f(null);
                                    if (u4e.a[sfbVar7.ordinal()] == 1) {
                                        y4eVar6 = x4eVar12.i;
                                        h2dVar6 = y4eVar6.a;
                                        v4eVar.r = x4eVar12;
                                        v4eVar.s = ku3Var5;
                                        v4eVar.t = sfbVar7;
                                        v4eVar.u = y4eVar6;
                                        v4eVar.v = h2dVar6;
                                        v4eVar.w = sfbVar7;
                                        v4eVar.x = x4eVar12;
                                        v4eVar.B = 14;
                                        if (h2dVar6.e(v4eVar) != lu3Var) {
                                            x4eVar13 = x4eVar12;
                                            x4eVar14 = x4eVar13;
                                            sfbVar8 = sfbVar7;
                                            try {
                                                vvkVar3 = (vvk) y4eVar6.b.h.get(sfbVar8);
                                                h2dVar6.f(null);
                                                x4eVar15 = x4eVar13;
                                                sfbVar9 = sfbVar8;
                                                x4eVar12 = x4eVar14;
                                                v4eVar.r = x4eVar12;
                                                v4eVar.s = ku3Var5;
                                                v4eVar.t = sfbVar9;
                                                v4eVar.u = null;
                                                v4eVar.v = null;
                                                v4eVar.w = null;
                                                v4eVar.x = null;
                                                v4eVar.B = 15;
                                                if (x4eVar15.j(sfbVar7, vvkVar3, v4eVar) != lu3Var) {
                                                }
                                            } finally {
                                            }
                                        }
                                        return lu3Var;
                                    }
                                    sfbVar9 = sfbVar7;
                                    vvkVar3 = null;
                                    x4eVar15 = x4eVar12;
                                    v4eVar.r = x4eVar12;
                                    v4eVar.s = ku3Var5;
                                    v4eVar.t = sfbVar9;
                                    v4eVar.u = null;
                                    v4eVar.v = null;
                                    v4eVar.w = null;
                                    v4eVar.x = null;
                                    v4eVar.B = 15;
                                    if (x4eVar15.j(sfbVar7, vvkVar3, v4eVar) != lu3Var) {
                                        x4eVar16 = x4eVar12;
                                        ku3Var6 = ku3Var5;
                                        if (sfbVar9 == sfb.a) {
                                            y4eVar7 = x4eVar16.i;
                                            j2d j2dVar4 = y4eVar7.a;
                                            v4eVar.r = x4eVar16;
                                            v4eVar.s = ku3Var6;
                                            v4eVar.t = y4eVar7;
                                            v4eVar.u = j2dVar4;
                                            v4eVar.B = 16;
                                            if (j2dVar4.e(v4eVar) != lu3Var) {
                                                h2dVar7 = j2dVar4;
                                                x4eVar17 = x4eVar16;
                                                try {
                                                    y4eVar7.b.i.h(sfb.a);
                                                    h2dVar7.f(null);
                                                    x4eVar17.l(ku3Var6);
                                                } finally {
                                                }
                                            }
                                        }
                                        return Unit.a;
                                    }
                                    return lu3Var;
                                case 13:
                                    h2d h2dVar13 = (h2d) v4eVar.u;
                                    sfbVar7 = (sfb) v4eVar.t;
                                    ku3 ku3Var12 = (ku3) v4eVar.s;
                                    x4eVar12 = (x4e) v4eVar.r;
                                    y6a.M(obj);
                                    ku3Var5 = ku3Var12;
                                    r0 = h2dVar13;
                                    Unit unit42 = Unit.a;
                                    r0.f(null);
                                    if (u4e.a[sfbVar7.ordinal()] == 1) {
                                    }
                                    break;
                                case 14:
                                    x4eVar13 = (x4e) v4eVar.x;
                                    sfbVar7 = (sfb) v4eVar.w;
                                    h2dVar6 = (h2d) v4eVar.v;
                                    y4eVar6 = (y4e) v4eVar.u;
                                    sfbVar8 = (sfb) v4eVar.t;
                                    ku3Var5 = (ku3) v4eVar.s;
                                    x4eVar14 = (x4e) v4eVar.r;
                                    y6a.M(obj);
                                    vvkVar3 = (vvk) y4eVar6.b.h.get(sfbVar8);
                                    h2dVar6.f(null);
                                    x4eVar15 = x4eVar13;
                                    sfbVar9 = sfbVar8;
                                    x4eVar12 = x4eVar14;
                                    v4eVar.r = x4eVar12;
                                    v4eVar.s = ku3Var5;
                                    v4eVar.t = sfbVar9;
                                    v4eVar.u = null;
                                    v4eVar.v = null;
                                    v4eVar.w = null;
                                    v4eVar.x = null;
                                    v4eVar.B = 15;
                                    if (x4eVar15.j(sfbVar7, vvkVar3, v4eVar) != lu3Var) {
                                    }
                                    return lu3Var;
                                case 15:
                                    sfbVar9 = (sfb) v4eVar.t;
                                    ku3Var6 = (ku3) v4eVar.s;
                                    x4eVar16 = (x4e) v4eVar.r;
                                    y6a.M(obj);
                                    if (sfbVar9 == sfb.a) {
                                    }
                                    return Unit.a;
                                case 16:
                                    h2dVar7 = (h2d) v4eVar.u;
                                    y4eVar7 = (y4e) v4eVar.t;
                                    ku3Var6 = (ku3) v4eVar.s;
                                    x4eVar17 = (x4e) v4eVar.r;
                                    y6a.M(obj);
                                    y4eVar7.b.i.h(sfb.a);
                                    h2dVar7.f(null);
                                    x4eVar17.l(ku3Var6);
                                    return Unit.a;
                                default:
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                            }
                        }
                    }
                    switch (v4eVar.B) {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
        v4eVar = new v4e(this, rq3Var);
        Object obj2 = v4eVar.z;
        lu3 lu3Var2 = lu3.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(e4e e4eVar, rq3 rq3Var) {
        t4e t4eVar;
        int i;
        if (rq3Var instanceof t4e) {
            t4eVar = (t4e) rq3Var;
            int i2 = t4eVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t4eVar.t = i2 - Integer.MIN_VALUE;
                Object obj = t4eVar.r;
                lu3 lu3Var = lu3.a;
                i = t4eVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    nhh nhhVar = (nhh) this.b;
                    t4eVar.t = 1;
                    if (nhhVar.b.q(t4eVar, e4eVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        t4eVar = new t4e(this, rq3Var);
        Object obj2 = t4eVar.r;
        lu3 lu3Var2 = lu3.a;
        i = t4eVar.t;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r6.C(r7, r1) != r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r6.emit(r7, r1) == r8) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(IndexedValue indexedValue, rq3 rq3Var) {
        uf2 uf2Var;
        int i;
        p03 p03Var = (p03) this.b;
        if (rq3Var instanceof uf2) {
            uf2Var = (uf2) rq3Var;
            int i2 = uf2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uf2Var.u = i2 - Integer.MIN_VALUE;
                Object obj = uf2Var.s;
                lu3 lu3Var = lu3.a;
                i = uf2Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    aeh aehVar = (aeh) p03Var.c;
                    uf2Var.r = indexedValue;
                    uf2Var.u = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    indexedValue = uf2Var.r;
                    y6a.M(obj);
                }
                b10 b10Var = (b10) p03Var.b;
                uf2Var.r = null;
                uf2Var.u = 2;
            }
        }
        uf2Var = new uf2(this, rq3Var);
        Object obj2 = uf2Var.s;
        lu3 lu3Var2 = lu3.a;
        i = uf2Var.u;
        if (i != 0) {
        }
        b10 b10Var2 = (b10) p03Var.b;
        uf2Var.r = null;
        uf2Var.u = 2;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        rq3 rq3Var2 = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                f4a f4aVar = (f4a) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    z9.C(f4aVar.j(), (View) f4aVar.b);
                }
                break;
            case 1:
                ((z41) obj2).A();
                break;
            case 2:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    ((k92) obj2).f.j(list);
                }
                break;
            case 3:
                break;
            case 4:
                Object q = ((l4h) obj2).q(rq3Var, obj);
                if (q != lu3.a) {
                    break;
                }
                break;
            case 5:
                z41 z41Var = (z41) ((u84) obj2).g;
                z41Var.x().updateCursorAnchorInfo((View) z41Var.b, (CursorAnchorInfo) obj);
                break;
            case 6:
                qf4 qf4Var = (qf4) obj2;
                if (!(qf4Var.h.t() instanceof e38)) {
                    Object g = qf4Var.g(true, rq3Var);
                    if (g != lu3.a) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 7:
                r17 r17Var = (r17) obj;
                FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity = (FantasyGameweekHighlightsActivity) obj2;
                if (!Intrinsics.c(r17Var, n17.a)) {
                    if (!Intrinsics.c(r17Var, o17.a)) {
                        if (!(r17Var instanceof q17)) {
                            zzl.b();
                            break;
                        } else {
                            int i2 = FantasyGameweekHighlightsActivity.Z;
                            fantasyGameweekHighlightsActivity.Y();
                        }
                    } else {
                        int i3 = FantasyGameweekHighlightsActivity.Z;
                        View V = fantasyGameweekHighlightsActivity.V(fantasyGameweekHighlightsActivity.R().f.getCurrentItem());
                        if (V != null) {
                            fantasyGameweekHighlightsActivity.resumeProgress(V);
                        }
                    }
                } else {
                    int i4 = FantasyGameweekHighlightsActivity.Z;
                    View V2 = fantasyGameweekHighlightsActivity.V(fantasyGameweekHighlightsActivity.R().f.getCurrentItem());
                    if (V2 != null) {
                        fantasyGameweekHighlightsActivity.pauseProgress(V2);
                    }
                }
                break;
            case 8:
                FantasyNotificationsActionButton fantasyNotificationsActionButton = (FantasyNotificationsActionButton) obj2;
                if (!(((j52) obj) instanceof z42)) {
                    break;
                } else {
                    Integer num = fantasyNotificationsActionButton.a;
                    if (num != null) {
                        fantasyNotificationsActionButton.d(num.intValue());
                    }
                    break;
                }
            case 9:
                j52 j52Var = (j52) obj;
                FeaturedTournamentFragment featuredTournamentFragment = (FeaturedTournamentFragment) obj2;
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshAds");
                    break;
                } else {
                    ((AdBannerView) featuredTournamentFragment.w.getValue()).c(AdType.Banner.FeaturedTournamentSmall);
                    ((AdBannerView) featuredTournamentFragment.x.getValue()).c(AdType.Banner.FeaturedTournamentBig);
                    break;
                }
            case 10:
                meb mebVar = (meb) obj2;
                Object R = xw3.R(mebVar.b, new yp7(mebVar, obj, rq3Var2, 29), rq3Var);
                lu3 lu3Var = lu3.a;
                if (R != lu3Var) {
                    R = Unit.a;
                }
                if (R != lu3Var) {
                    break;
                }
                break;
            case 11:
                ((eoh) ((osa) obj2).e).setValue((p33) obj);
                break;
            case 12:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(k13.r(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new fg2(((Number) it.next()).longValue() * 1000));
                }
                ((zqb) obj2).T.j(arrayList);
                break;
            case 13:
                ((qvc) obj2).c.i(((Number) obj).floatValue());
                break;
            case 14:
                ((h1) obj2).invoke((Message) obj);
                break;
            case 15:
                ((Boolean) obj).booleanValue();
                mvh mvhVar = (mvh) obj2;
                if (mvhVar != null) {
                    ((lw4) mvhVar).a();
                }
                break;
            case 16:
                break;
            case 17:
                ((g62) obj2).d((Unit) obj);
                break;
            case 18:
                break;
            case 19:
                ((Function0) obj2).invoke();
                break;
            case 20:
                s7h s7hVar = (s7h) obj;
                seh sehVar = (seh) obj2;
                s7hVar.getClass();
                sehVar.h = s7hVar;
                if (sehVar.j) {
                    sehVar.j = false;
                    sehVar.b();
                }
                Object e = sehVar.e(s7hVar.a.a, peh.a, rq3Var);
                if (e != lu3.a) {
                    break;
                }
                break;
            case 21:
                ((SofaSeasonActivity) obj2).finish();
                break;
            case 22:
                j52 j52Var2 = (j52) obj;
                TVScheduleActivity tVScheduleActivity = (TVScheduleActivity) obj2;
                if (j52Var2 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshTvChannels");
                    break;
                } else {
                    int i5 = TVScheduleActivity.O;
                    tVScheduleActivity.R();
                    break;
                }
            case 23:
                ((eoh) ((caj) obj2).L).setValue(Boolean.FALSE);
                break;
            default:
                if (!(((j52) obj) instanceof e52)) {
                    break;
                } else {
                    Object l = ksa.l(0, rq3Var, (ksa) obj2);
                    if (l != lu3.a) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ f10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public f10(x4e x4eVar, ku3 ku3Var) {
        this.a = 18;
        this.b = x4eVar;
    }
}
