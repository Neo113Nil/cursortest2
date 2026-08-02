package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.sofascore.local_persistance.BrandingConfig;
import com.sofascore.model.newNetwork.MmaStatisticArea;
import com.sofascore.model.newNetwork.MmaStatisticClass;
import com.sofascore.model.newNetwork.MmaStatisticValues;
import com.sofascore.model.newNetwork.TeamCareerStatisticsResponse;
import com.sofascore.results.R;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.chat.fragment.CommentsChatFragment;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.sofascore.results.chat.view.FloatingIndicationLabelView;
import com.sofascore.results.crowdsourcing.CrowdsourcingDeleteIncidentModal;
import com.sofascore.results.crowdsourcing.CrowdsourcingIncidentDetailsFullScreenDialog;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import com.sofascore.results.main.MainActivity;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ip1 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip1(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                return new ip1((ykj) obj2, rq3Var, 0);
            case 1:
                return new ip1((BrandingConfig) obj2, rq3Var, 1);
            case 2:
                return new ip1((ChatActivity) obj2, rq3Var, 2);
            case 3:
                return new ip1((ku2) obj2, rq3Var, 3);
            case 4:
                return new ip1((CommentsChatFragment) obj2, rq3Var, 4);
            case 5:
                return new ip1((ks3) obj2, rq3Var, 5);
            case 6:
                return new ip1((Callable) obj2, rq3Var, 6);
            case 7:
                return new ip1((ce8) obj2, rq3Var, 7);
            case 8:
                return new ip1((CrowdsourcingDeleteIncidentModal) obj2, rq3Var, 8);
            case 9:
                return new ip1((CrowdsourcingIncidentDetailsFullScreenDialog) obj2, rq3Var, 9);
            case 10:
                return new ip1((j45) obj2, rq3Var, 10);
            case 11:
                return new ip1((m45) obj2, rq3Var, 11);
            case 12:
                return new ip1((EventBoxScoreFragment) obj2, rq3Var, 12);
            case 13:
                return new ip1((lcd) obj2, rq3Var, 13);
            case 14:
                return new ip1((nr6) obj2, rq3Var, 14);
            case 15:
                return new ip1((n87) obj2, rq3Var, 15);
            case 16:
                return new ip1((ta7) obj2, rq3Var, 16);
            case 17:
                return new ip1((gk7) obj2, rq3Var, 17);
            case 18:
                return new ip1((ob7) obj2, rq3Var, 18);
            case 19:
                return new ip1((wb7) obj2, rq3Var, 19);
            case 20:
                return new ip1((if7) obj2, rq3Var, 20);
            case 21:
                return new ip1((yf2) obj2, rq3Var, 21);
            case 22:
                return new ip1((is7) obj2, rq3Var, 22);
            case 23:
                return new ip1((Bitmap) obj2, rq3Var, 23);
            case 24:
                return new ip1((ImageView) obj2, rq3Var, 24);
            case 25:
                return new ip1((xeb) obj2, rq3Var, 25);
            case 26:
                return new ip1((MainActivity) obj2, rq3Var, 26);
            case 27:
                return new ip1((TeamCareerStatisticsResponse) obj2, rq3Var, 27);
            case 28:
                return new ip1((yyc) obj2, rq3Var, 28);
            default:
                return new ip1((Iterator) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ip1) create((BrandingConfig) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ip1) create((Unit) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((ip1) create((Unit) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((ip1) create((Unit) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((ip1) create((Unit) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((ip1) create((Unit) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((ip1) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((ip1) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((ip1) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((ip1) create((String) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((ip1) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((ip1) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((ip1) create((Unit) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 28:
                return ((ip1) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ip1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x056e, code lost:
    
        if (r1 != false) goto L242;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.sofascore.results.event.boxscore.EventBoxScoreFragment] */
    /* JADX WARN: Type inference failed for: r6v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [km5] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object obj2;
        MmaStatisticClass ground;
        MmaStatisticClass ground2;
        MmaStatisticClass distance;
        MmaStatisticClass total;
        MmaStatisticClass total2;
        MmaStatisticClass total3;
        MmaStatisticClass total4;
        MmaStatisticClass total5;
        MmaStatisticClass legs;
        MmaStatisticClass body;
        MmaStatisticClass head;
        MmaStatisticClass total6;
        MmaStatisticClass total7;
        boolean z = true;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                ((ykj) this.s).a();
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                return (BrandingConfig) this.s;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                ChatActivity chatActivity = (ChatActivity) this.s;
                boolean z2 = chatActivity.A().getBoolean("SHOW_REDESIGNED_CHAT_LAYOUT", false);
                SharedPreferences.Editor edit = chatActivity.A().edit();
                edit.getClass();
                boolean z3 = !z2;
                edit.putBoolean("SHOW_REDESIGNED_CHAT_LAYOUT", z3);
                edit.apply();
                ArrayList B = chatActivity.T().B();
                ArrayList arrayList = new ArrayList();
                Iterator it = B.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof AbstractChatFragment) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractChatFragment abstractChatFragment = (AbstractChatFragment) it2.next();
                    krk krkVar = abstractChatFragment.l;
                    krkVar.getClass();
                    ChatMessageInputView chatMessageInputView = ((yn8) krkVar).f;
                    ((ImageView) chatMessageInputView.d.e).setImageDrawable(chatMessageInputView.getContext().getDrawable(!z2 ? R.drawable.ic_content_expand : R.drawable.ic_content_collapse));
                    joa joaVar = abstractChatFragment.z;
                    if (z2) {
                        eca ecaVar = (eca) joaVar.getValue();
                        krk krkVar2 = abstractChatFragment.l;
                        krkVar2.getClass();
                        ecaVar.f(((yn8) krkVar2).l);
                    } else {
                        ((eca) joaVar.getValue()).f(null);
                    }
                    krk krkVar3 = abstractChatFragment.l;
                    krkVar3.getClass();
                    tgj.q(((yn8) krkVar3).l, new m1(abstractChatFragment, z3, r5 ? 1 : 0), 7);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                ku2 ku2Var = (ku2) this.s;
                LocalDate o = vxd.o(Instant.ofEpochMilli(ku2Var.h * 1000));
                ZoneId systemDefault = ZoneId.systemDefault();
                long epochSecond = o.atStartOfDay(systemDefault).toInstant().getEpochSecond();
                long epochSecond2 = o.plusDays(1L).atStartOfDay(systemDefault).minusNanos(1L).toInstant().getEpochSecond();
                Long valueOf = Long.valueOf(epochSecond);
                Long valueOf2 = Long.valueOf(epochSecond2);
                long longValue = valueOf.longValue();
                long longValue2 = valueOf2.longValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                Locale locale = Locale.US;
                locale.getClass();
                ZoneId of = ZoneId.of("UTC");
                of.getClass();
                linkedHashSet.add(rik.i(longValue, bi4Var, locale, of));
                ZoneId of2 = ZoneId.of("UTC");
                of2.getClass();
                linkedHashSet.add(rik.i(longValue2, bi4Var, locale, of2));
                g9i g9iVar = ku2Var.t;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                ku2Var.t = xw3.L(un0.z(ku2Var), null, null, new hu2(ku2Var, linkedHashSet, longValue2, longValue, null), 3);
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                CommentsChatFragment commentsChatFragment = (CommentsChatFragment) this.s;
                krk krkVar4 = commentsChatFragment.l;
                krkVar4.getClass();
                FloatingIndicationLabelView floatingIndicationLabelView = ((yn8) krkVar4).i;
                String string = commentsChatFragment.getString(R.string.choose_your_flag_toast);
                string.getClass();
                floatingIndicationLabelView.j(null, string);
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                ks3 ks3Var = (ks3) this.s;
                xw3.L(un0.z(ks3Var), null, null, new jk(ks3Var, (rq3) r6, 4), 3);
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                return ((Callable) this.s).call();
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                ce8.a((ce8) this.s);
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                CrowdsourcingDeleteIncidentModal crowdsourcingDeleteIncidentModal = (CrowdsourcingDeleteIncidentModal) this.s;
                tr3 tr3Var = (tr3) crowdsourcingDeleteIncidentModal.B.getValue();
                xw3.L(un0.z(tr3Var), null, null, new xq3(tr3Var, r6, 2), 3);
                crowdsourcingDeleteIncidentModal.j();
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                CrowdsourcingIncidentDetailsFullScreenDialog crowdsourcingIncidentDetailsFullScreenDialog = (CrowdsourcingIncidentDetailsFullScreenDialog) this.s;
                wrh wrhVar = (wrh) crowdsourcingIncidentDetailsFullScreenDialog.s;
                if (wrhVar != null) {
                    FrameLayout frameLayout = wrhVar.c;
                    int i = ze3.C;
                    Context requireContext = crowdsourcingIncidentDetailsFullScreenDialog.requireContext();
                    requireContext.getClass();
                    ze3 I = fkf.I(requireContext, frameLayout, mmh.e);
                    if (I != null) {
                        I.i();
                    }
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                j45 j45Var = (j45) this.s;
                synchronized (j45Var.h) {
                    if (!j45Var.m || j45Var.n) {
                        return Unit.a;
                    }
                    try {
                        j45Var.C();
                    } catch (IOException unused) {
                        j45Var.o = true;
                    }
                    try {
                        if (j45Var.j >= 2000) {
                            j45Var.M();
                        }
                    } catch (IOException unused2) {
                        j45Var.p = true;
                        j45Var.k = new kof(new fx1());
                    }
                    return Unit.a;
                }
            case 11:
                lu3 lu3Var12 = lu3.a;
                y6a.M(obj);
                m45 m45Var = (m45) this.s;
                synchronized (m45Var) {
                    if (!m45Var.l || m45Var.m) {
                        return Unit.a;
                    }
                    try {
                        m45Var.C();
                    } catch (IOException unused3) {
                        m45Var.n = true;
                    }
                    try {
                        if (m45Var.i >= 2000) {
                            m45Var.M();
                        }
                    } catch (IOException unused4) {
                        m45Var.o = true;
                        m45Var.j = new kof(new fx1());
                    }
                    return Unit.a;
                }
            case 12:
                lu3 lu3Var13 = lu3.a;
                y6a.M(obj);
                ?? r0 = (EventBoxScoreFragment) this.s;
                r0.F().notifyDataSetChanged();
                q22 q22Var = (q22) r0.G().u.d();
                r6 = q22Var != null ? q22Var.d : 0;
                if (r6 == 0) {
                    r6 = km5.a;
                }
                r0.I(r6);
                return Unit.a;
            case 13:
                lu3 lu3Var14 = lu3.a;
                y6a.M(obj);
                lcd lcdVar = (lcd) this.s;
                if (lcdVar.getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    boolean globalVisibleRect = lcdVar.getGlobalVisibleRect(lcdVar.getExposureRect$render_release(), lcdVar.getOffset$render_release());
                    if (!globalVisibleRect) {
                        lcdVar.getExposureRect$render_release().setEmpty();
                        break;
                    } else {
                        lcdVar.getExposureRect$render_release().offset(-lcdVar.getOffset$render_release().x, -lcdVar.getOffset$render_release().y);
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 14:
                lu3 lu3Var15 = lu3.a;
                y6a.M(obj);
                ((nr6) this.s).m();
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                y6a.M(obj);
                n87 n87Var = (n87) this.s;
                xw3.L(un0.z(n87Var), null, null, new t3(n87Var, r5, (rq3) r6, 10), 3);
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                y6a.M(obj);
                ((ta7) this.s).k();
                return Unit.a;
            case 17:
                lu3 lu3Var18 = lu3.a;
                y6a.M(obj);
                ((gk7) this.s).o();
                return Unit.a;
            case 18:
                lu3 lu3Var19 = lu3.a;
                y6a.M(obj);
                ob7 ob7Var = (ob7) this.s;
                xw3.L(un0.z(ob7Var), null, null, new jk(ob7Var, (rq3) r6, 12), 3);
                return Unit.a;
            case 19:
                lu3 lu3Var20 = lu3.a;
                y6a.M(obj);
                wb7 wb7Var = (wb7) this.s;
                fdi fdiVar = wb7Var.j;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, pb7.a((pb7) value, null, null, 0, 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, null, wb7Var.m(), 4194303)));
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                y6a.M(obj);
                if7 if7Var = (if7) this.s;
                xw3.L(un0.z(if7Var), null, null, new d17(if7Var, r6, 9), 3);
                return Unit.a;
            case 21:
                yf2 yf2Var = (yf2) this.s;
                lu3 lu3Var22 = lu3.a;
                y6a.M(obj);
                try {
                    File file = new File(yf2Var.a, "favorites_list.json");
                    if (file.exists()) {
                        String a = b28.a(file);
                        bga bgaVar = vga.a;
                        bgaVar.getClass();
                        obj2 = (List) bgaVar.b(new xg0(a7a.a, 0), a);
                    } else {
                        obj2 = km5.a;
                    }
                    return obj2;
                } catch (Exception unused5) {
                    km5 km5Var = km5.a;
                    yf2Var.a(km5Var);
                    return km5Var;
                }
            case 22:
                lu3 lu3Var23 = lu3.a;
                y6a.M(obj);
                ((is7) this.s).m(false);
                return Unit.a;
            case 23:
                lu3 lu3Var24 = lu3.a;
                y6a.M(obj);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ((Bitmap) this.s).compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        n4o.x(byteArrayOutputStream, th);
                        throw th2;
                    }
                }
            case 24:
                lu3 lu3Var25 = lu3.a;
                y6a.M(obj);
                if (((Boolean) ((eoh) as9.b).getValue()).booleanValue()) {
                    as9.l((ImageView) this.s, 12994, null);
                }
                return Unit.a;
            case 25:
                lu3 lu3Var26 = lu3.a;
                y6a.M(obj);
                xeb xebVar = (xeb) this.s;
                ArrayList l = xebVar.l(xebVar.h.a);
                veb vebVar = xebVar.h;
                List list = vebVar.b;
                List list2 = vebVar.c;
                boolean z4 = vebVar.d;
                list.getClass();
                list2.getClass();
                xebVar.h = new veb(l, list, list2, z4);
                xebVar.l.j(new veb(l, list, list2, false));
                return Unit.a;
            case 26:
                lu3 lu3Var27 = lu3.a;
                y6a.M(obj);
                MainActivity mainActivity = (MainActivity) this.s;
                boolean z5 = MainActivity.n0;
                int D = mainActivity.W().D(jqb.n);
                if (D >= 0 && mainActivity.Q().j.getCurrentItem() != D) {
                    mainActivity.Q().j.c(D, false);
                }
                return Unit.a;
            case 27:
                lu3 lu3Var28 = lu3.a;
                y6a.M(obj);
                TeamCareerStatisticsResponse teamCareerStatisticsResponse = (TeamCareerStatisticsResponse) this.s;
                zqc zqcVar = zqc.CAREER;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                MmaStatisticArea significantStrikes = teamCareerStatisticsResponse.getIssued().getSignificantStrikes();
                MmaStatisticValues landed = (significantStrikes == null || (total7 = significantStrikes.getTotal()) == null) ? null : total7.getLanded();
                MmaStatisticArea strikes = teamCareerStatisticsResponse.getIssued().getStrikes();
                MmaStatisticValues landed2 = (strikes == null || (total6 = strikes.getTotal()) == null) ? null : total6.getLanded();
                brc brcVar = brc.a;
                arrayList4.add(q1f.b("landed_all_strikes", brcVar, landed != null ? landed.getRoundPct() : null, landed != null ? landed.getRoundAvg() : null, landed2 != null ? landed2.getRoundAvg() : null, 992));
                arrayList3.add(new vrc("significant_strikes_average", arrayList4));
                ArrayList arrayList5 = new ArrayList();
                MmaStatisticArea significantStrikes2 = teamCareerStatisticsResponse.getIssued().getSignificantStrikes();
                MmaStatisticValues landed3 = (significantStrikes2 == null || (head = significantStrikes2.getHead()) == null) ? null : head.getLanded();
                arrayList5.add(q1f.b("head", brc.e, landed3 != null ? landed3.getRoundPct() : null, landed3 != null ? landed3.getRoundAvg() : null, landed != null ? landed.getRoundAvg() : null, 992));
                MmaStatisticArea significantStrikes3 = teamCareerStatisticsResponse.getIssued().getSignificantStrikes();
                MmaStatisticValues landed4 = (significantStrikes3 == null || (body = significantStrikes3.getBody()) == null) ? null : body.getLanded();
                arrayList5.add(q1f.b("body", brc.f, landed4 != null ? landed4.getRoundPct() : null, landed4 != null ? landed4.getRoundAvg() : null, landed != null ? landed.getRoundAvg() : null, 992));
                MmaStatisticArea significantStrikes4 = teamCareerStatisticsResponse.getIssued().getSignificantStrikes();
                MmaStatisticValues landed5 = (significantStrikes4 == null || (legs = significantStrikes4.getLegs()) == null) ? null : legs.getLanded();
                arrayList5.add(q1f.b("legs", brc.g, landed5 != null ? landed5.getRoundPct() : null, landed5 != null ? landed5.getRoundAvg() : null, landed != null ? landed.getRoundAvg() : null, 992));
                arrayList3.add(new vrc("significant_strikes_landed_by_zones", arrayList5));
                arrayList2.add(new fsc("striking_per_round", arrayList3));
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                MmaStatisticArea takedowns = teamCareerStatisticsResponse.getIssued().getTakedowns();
                MmaStatisticValues succeeded = (takedowns == null || (total5 = takedowns.getTotal()) == null) ? null : total5.getSucceeded();
                MmaStatisticArea takedowns2 = teamCareerStatisticsResponse.getIssued().getTakedowns();
                MmaStatisticValues attempted = (takedowns2 == null || (total4 = takedowns2.getTotal()) == null) ? null : total4.getAttempted();
                arrayList7.add(q1f.b("success_attempted", brcVar, succeeded != null ? succeeded.getPct15min() : null, succeeded != null ? succeeded.getAvg15min() : null, attempted != null ? attempted.getAvg15min() : null, 992));
                arrayList6.add(new vrc("takedowns_average", arrayList7));
                ArrayList arrayList8 = new ArrayList();
                MmaStatisticArea submissions = teamCareerStatisticsResponse.getIssued().getSubmissions();
                MmaStatisticValues succeeded2 = (submissions == null || (total3 = submissions.getTotal()) == null) ? null : total3.getSucceeded();
                MmaStatisticArea submissions2 = teamCareerStatisticsResponse.getIssued().getSubmissions();
                MmaStatisticValues attempted2 = (submissions2 == null || (total2 = submissions2.getTotal()) == null) ? null : total2.getAttempted();
                arrayList8.add(q1f.b("success_attempted", brcVar, succeeded2 != null ? succeeded2.getOverallPct() : null, succeeded2 != null ? succeeded2.getAvg15min() : null, attempted2 != null ? attempted2.getAvg15min() : null, 992));
                arrayList6.add(new vrc("submissions_average", arrayList8));
                ArrayList arrayList9 = new ArrayList();
                MmaStatisticArea transitions = teamCareerStatisticsResponse.getIssued().getTransitions();
                MmaStatisticValues succeeded3 = (transitions == null || (total = transitions.getTotal()) == null) ? null : total.getSucceeded();
                arrayList9.add(q1f.b("transitions_succeeded", brc.c, succeeded3 != null ? succeeded3.getAvg15min() : null, succeeded3 != null ? succeeded3.getAvg15min() : null, null, 992));
                arrayList6.add(new vrc("transitions_succeeded", arrayList9));
                arrayList2.add(new fsc("grappling_per_15_min", arrayList6));
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                MmaStatisticArea time = teamCareerStatisticsResponse.getIssued().getTime();
                MmaStatisticValues general = (time == null || (distance = time.getDistance()) == null) ? null : distance.getGeneral();
                brc brcVar2 = brc.b;
                arrayList11.add(q1f.b("distance", brcVar2, general != null ? general.getRoundPct() : null, general != null ? general.getRoundAvg() : null, null, 480));
                MmaStatisticArea time2 = teamCareerStatisticsResponse.getIssued().getTime();
                MmaStatisticValues general2 = (time2 == null || (ground2 = time2.getGround()) == null) ? null : ground2.getGeneral();
                arrayList11.add(q1f.b("ground", brcVar2, general2 != null ? general2.getRoundPct() : null, general2 != null ? general2.getRoundAvg() : null, null, 480));
                arrayList10.add(new vrc("average_time_in_position_per_round", arrayList11));
                ArrayList arrayList12 = new ArrayList();
                MmaStatisticArea time3 = teamCareerStatisticsResponse.getIssued().getTime();
                MmaStatisticValues control = (time3 == null || (ground = time3.getGround()) == null) ? null : ground.getControl();
                arrayList12.add(q1f.b("ground", brcVar2, control != null ? control.getOverallPct() : null, control != null ? control.getOverall() : null, general2 != null ? general2.getOverall() : null, 480));
                arrayList10.add(new vrc("control_in_position_overall", arrayList12));
                arrayList2.add(new fsc("position_statistics", arrayList10));
                return sub.d(new Pair(zqcVar, arrayList2));
            case 28:
                lu3 lu3Var29 = lu3.a;
                y6a.M(obj);
                return Unit.a;
            default:
                lu3 lu3Var30 = lu3.a;
                y6a.M(obj);
                Iterator it3 = (Iterator) this.s;
                while (it3.hasNext()) {
                    ((lb3) it3.next()).b();
                }
                return Unit.a;
        }
    }
}
