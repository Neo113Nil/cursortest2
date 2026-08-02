package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.custom_views.BlazeDefaultTimeBar;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.style.players.BlazeSeekBarStyle;
import com.blaze.blazesdk.style.players.IPlayerItemButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerSeekBarStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.C3678pe;
import com.inmobi.media.Uc;
import com.sofascore.results.dialog.TopStatsCategoryBottomSheet;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.sofascore.results.media.news.TopNewsActivity;
import defpackage.n4m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ncj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ncj(TopNewsActivity topNewsActivity, Context context, cdi cdiVar) {
        this.a = 1;
        this.c = topNewsActivity;
        this.b = context;
        this.d = cdiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e0, code lost:
    
        if (r3.hasNext() == false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e2, code lost:
    
        r6 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02e6, code lost:
    
        if (r11 < 0) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ee, code lost:
    
        if (((defpackage.n4m) r6).o <= r14.o) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02f2, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02f0, code lost:
    
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02f9, code lost:
    
        if (r5 < 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02fb, code lost:
    
        r10 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ff, code lost:
    
        if (r10 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0301, code lost:
    
        r3 = r10.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x030c, code lost:
    
        r5 = kotlin.collections.CollectionsKt.U0(r4.b);
        r5.add(r3, r1);
        r4.b = r5;
        r0.g0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0306, code lost:
    
        r3 = r4.b.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02f5, code lost:
    
        kotlin.collections.b.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02f8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028c, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x033d, code lost:
    
        if (r5 < 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x033f, code lost:
    
        r3 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0345, code lost:
    
        if (r3 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0347, code lost:
    
        r3 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0352, code lost:
    
        if (r0.p0 < r3) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0354, code lost:
    
        r0 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0358, code lost:
    
        if ((r0 instanceof gim.a) == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x035a, code lost:
    
        r10 = ((gim.a) r0).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x035e, code lost:
    
        if (r10 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0361, code lost:
    
        r0 = defpackage.pwl.a;
        r0 = r15.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0365, code lost:
    
        if (r0 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0367, code lost:
    
        r0 = r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x036f, code lost:
    
        defpackage.pwl.b.put(java.lang.Integer.valueOf(r0), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x036c, code lost:
    
        r0 = 123456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0379, code lost:
    
        r2.add(r3, defpackage.xlm.copy$default(r15, null, kotlin.collections.a.c(r1), null, 0, false, null, null, null, 253, null));
        r0.g0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x034c, code lost:
    
        r3 = r2.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0344, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0285, code lost:
    
        if (r7 < 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0287, code lost:
    
        r6 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x028d, code lost:
    
        if (r6 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x028f, code lost:
    
        r5 = r6.intValue();
        r6 = r0.i0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0297, code lost:
    
        if (r6 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0299, code lost:
    
        r6 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x029b, code lost:
    
        if (r6 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x029d, code lost:
    
        r10 = java.lang.Integer.valueOf(r6.indexOf(r0.D()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a9, code lost:
    
        r6 = kotlin.collections.CollectionsKt.U0(r4.b);
        r6.set(r5, r1);
        r4.b = r6;
        r0.g0(r2);
        r2 = r0.j0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02bb, code lost:
    
        if (r2 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02c3, code lost:
    
        if (r2.intValue() != r3) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02c5, code lost:
    
        if (r10 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02cd, code lost:
    
        if (r10.intValue() != r5) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02cf, code lost:
    
        r0.c0(r1, com.blaze.blazesdk.analytics.enums.EventNavigationDirection.FORWARD);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02d6, code lost:
    
        r3 = r4.b.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x08a0  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        Object value;
        Integer d;
        String str;
        BlazeVideosPlayerSeekBarStyle seekBar;
        BlazeSeekBarStyle pausedState;
        BlazeVideosPlayerSeekBarStyle seekBar2;
        BlazeSeekBarStyle playingState;
        BlazeVideosPlayerSeekBarStyle seekBar3;
        ImageView imageView;
        int i = this.a;
        int i2 = 6;
        int i3 = 9;
        int i4 = -1;
        int i5 = 7;
        int i6 = 8;
        int i7 = 2;
        r10 = null;
        Integer num = null;
        Integer num2 = null;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel = null;
        int i8 = 0;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                lcj lcjVar = (lcj) obj4;
                ku3 ku3Var = (ku3) obj3;
                Context context = (Context) obj2;
                d8j d8jVar = (d8j) obj;
                d8jVar.a();
                l0d l0dVar = d8jVar.a;
                n8j n8jVar = n8j.Autofill;
                Object[] objArr = !pej.d(lcjVar.a.d().d) && lcjVar.m();
                rq3 rq3Var = null;
                xbj xbjVar = new xbj(ku3Var, new ocj(lcjVar, rq3Var, i8), r12);
                gfj gfjVar = gfj.a;
                Resources resources = context.getResources();
                lwc lwcVar = new lwc(xbjVar, rq3Var, lcjVar, gfjVar, 12);
                if (objArr != false) {
                    l0dVar.a(new m8j(l6g.e, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, lwcVar));
                }
                n8j n8jVar2 = n8j.Autofill;
                boolean d2 = pej.d(lcjVar.a.d().d);
                xbj xbjVar2 = new xbj(ku3Var, new ocj(lcjVar, rq3Var, r12), r12);
                Resources resources2 = context.getResources();
                lwc lwcVar2 = new lwc(xbjVar2, rq3Var, lcjVar, gfjVar, 12);
                if (!d2) {
                    l0dVar.a(new m8j(l6g.f, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, lwcVar2));
                }
                n8j n8jVar3 = n8j.Autofill;
                if (lcjVar.m()) {
                    if (lcjVar.y.a) {
                        z = true;
                        xbj xbjVar3 = new xbj(ku3Var, new ocj(lcjVar, rq3Var, i7), r12);
                        Resources resources3 = context.getResources();
                        lwc lwcVar3 = new lwc(xbjVar3, rq3Var, lcjVar, gfjVar, 12);
                        if (z) {
                            l0dVar.a(new m8j(l6g.g, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, lwcVar3));
                        }
                        n8j n8jVar4 = n8j.Autofill;
                        jwj jwjVar = lcjVar.a;
                        z2 = pej.e(jwjVar.d().d) == jwjVar.d().c.length();
                        gfj gfjVar2 = gfj.c;
                        mo1 mo1Var = new mo1(lcjVar, i5);
                        mo1 mo1Var2 = new mo1(lcjVar, i6);
                        Resources resources4 = context.getResources();
                        lwc lwcVar4 = new lwc(mo1Var2, mo1Var, lcjVar, gfjVar2, 12);
                        if (z2) {
                            l0dVar.a(new m8j(l6g.h, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, lwcVar4));
                        }
                        n8j n8jVar5 = n8j.Autofill;
                        z3 = !lcjVar.m() && pej.d(lcjVar.a.d().d);
                        mo1 mo1Var3 = new mo1(lcjVar, i3);
                        Resources resources5 = context.getResources();
                        lwc lwcVar5 = new lwc(mo1Var3, rq3Var, lcjVar, gfjVar, 12);
                        if (z3) {
                            l0dVar.a(new m8j(n8jVar5.a, resources5.getString(n8jVar5.b), n8jVar5.c, lwcVar5));
                        }
                        d8jVar.a();
                        return Unit.a;
                    }
                    w9j w9jVar = lcjVar.m;
                    if (w9jVar != null) {
                        w9jVar.invoke();
                    }
                }
                z = false;
                xbj xbjVar32 = new xbj(ku3Var, new ocj(lcjVar, rq3Var, i7), r12);
                Resources resources32 = context.getResources();
                lwc lwcVar32 = new lwc(xbjVar32, rq3Var, lcjVar, gfjVar, 12);
                if (z) {
                }
                n8j n8jVar42 = n8j.Autofill;
                jwj jwjVar2 = lcjVar.a;
                if (pej.e(jwjVar2.d().d) == jwjVar2.d().c.length()) {
                }
                gfj gfjVar22 = gfj.c;
                mo1 mo1Var4 = new mo1(lcjVar, i5);
                mo1 mo1Var22 = new mo1(lcjVar, i6);
                Resources resources42 = context.getResources();
                lwc lwcVar42 = new lwc(mo1Var22, mo1Var4, lcjVar, gfjVar22, 12);
                if (z2) {
                }
                n8j n8jVar52 = n8j.Autofill;
                if (lcjVar.m()) {
                }
                mo1 mo1Var32 = new mo1(lcjVar, i3);
                Resources resources52 = context.getResources();
                lwc lwcVar52 = new lwc(mo1Var32, rq3Var, lcjVar, gfjVar, 12);
                if (z3) {
                }
                d8jVar.a();
                return Unit.a;
            case 1:
                TopNewsActivity topNewsActivity = (TopNewsActivity) obj4;
                Context context2 = (Context) obj2;
                cdi cdiVar = (cdi) obj3;
                Integer num3 = (Integer) obj;
                int intValue = num3.intValue();
                if (topNewsActivity.L == 0) {
                    topNewsActivity.L = System.currentTimeMillis();
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - topNewsActivity.L;
                    topNewsActivity.L = System.currentTimeMillis();
                    ecd ecdVar = (ecd) CollectionsKt.a0(intValue, ((plj) cdiVar.getValue()).a);
                    nv.Z(context2, ecdVar != null ? ecdVar.a : 0, currentTimeMillis, num3, (String) topNewsActivity.N.getValue());
                }
                if (((plj) cdiVar.getValue()).d && intValue != ((plj) cdiVar.getValue()).b) {
                    fdi fdiVar = ((qlj) topNewsActivity.K.getValue()).j;
                    do {
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, plj.a((plj) value, null, 0, 7)));
                }
                return Unit.a;
            case 2:
                TopStatsCategory topStatsCategory = (TopStatsCategory) obj4;
                TopStatsCategoryBottomSheet topStatsCategoryBottomSheet = (TopStatsCategoryBottomSheet) obj3;
                ynj ynjVar = (ynj) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                if (topStatsCategory != null) {
                    TopStatsCategory topStatsCategory2 = topStatsCategoryBottomSheet.getD() ? topStatsCategory : null;
                    if (topStatsCategory2 != null && (d = topStatsCategory2.getD()) != null) {
                        esa.d(esaVar, "info_bubble", null, new tc3(737948931, new w54(d.intValue(), topStatsCategoryBottomSheet, topStatsCategory, i2), true), 2);
                    }
                }
                List b = topStatsCategory != null ? topStatsCategory.getB() : null;
                if (b == null) {
                    b = km5.a;
                }
                esaVar.a(b.size(), new wsd(14, new t6j(13), b), new dyg(b, 5), new tc3(2039820996, new aj(15, b, ynjVar), true));
                return Unit.a;
            case 3:
                a7b a7bVar = (a7b) obj;
                a7bVar.getClass();
                return new xnj(a7bVar, (Context) obj2, yaa.v(), (ynj) obj4, (dib) obj3);
            case 4:
                return ynj.a((ynj) obj, (gv9) obj3, null, ((dnj) ((fnj) obj4)).a, false, (uza) obj2, 10);
            case 5:
                gv9 gv9Var = (gv9) obj3;
                gv9 gv9Var2 = (gv9) obj2;
                ((tzj) obj).getClass();
                ArrayList arrayList = new ArrayList();
                vg0 vg0Var = new vg0();
                vg0 vg0Var2 = new vg0();
                dzj dzjVar = dzj.b;
                Iterator it = ((ArrayList) obj4).iterator();
                while (it.hasNext()) {
                    bzj bzjVar = (bzj) it.next();
                    if (bzjVar instanceof uyj) {
                        kda.x(vg0Var, arrayList);
                        arrayList.add(new s8g((uyj) bzjVar));
                    } else if ((bzjVar instanceof vyj) || (bzjVar instanceof wyj) || (bzjVar instanceof xyj)) {
                        vg0Var2.addLast(new ezj((yyj) bzjVar, dzjVar));
                        dzj dzjVar2 = dzj.a;
                        if (dzjVar == dzjVar2) {
                            dzjVar2 = dzj.b;
                        }
                        dzjVar = dzjVar2;
                    } else {
                        if (!(bzjVar instanceof azj)) {
                            zzl.b();
                            return null;
                        }
                        vg0Var.addLast(bzjVar);
                        if (vg0Var2.isEmpty()) {
                            kda.x(vg0Var, arrayList);
                        }
                    }
                    kda.V(vg0Var2, vg0Var, arrayList);
                }
                kda.V(vg0Var2, vg0Var, arrayList);
                kda.x(vg0Var, arrayList);
                gv9 W = l6g.W(arrayList);
                W.getClass();
                gv9Var.getClass();
                gv9Var2.getClass();
                return new tzj(W, gv9Var, gv9Var2);
            case 6:
                return Uc.a((Uc) obj4, (C3678pe) obj3, (AdMetaInfo) obj2, (InMobiNative) obj);
            case 7:
                ldk ldkVar = (ldk) obj4;
                de deVar = (de) obj3;
                Context context3 = (Context) obj2;
                qe0 qe0Var = (qe0) obj;
                int i9 = qe0Var.b;
                if (i9 == 2) {
                    if (qe0Var.a > 260720003) {
                        ldkVar.c(qe0Var, deVar);
                    }
                } else if (i9 != 3) {
                    context3.getClass();
                    bea.G(context3, "https://play.google.com/store/apps/details?id=com.sofascore.results");
                } else if (qe0Var.c == 11) {
                    ldkVar.b();
                } else {
                    ldkVar.c(qe0Var, deVar);
                }
                return Unit.a;
            case 8:
                d7e d7eVar = (d7e) obj4;
                d7e d7eVar2 = (d7e) obj3;
                d7e d7eVar3 = (d7e) obj2;
                rj0 rj0Var = (rj0) obj;
                if (rj0Var instanceof nj0) {
                    return d7eVar != null ? new nj0(d7eVar) : (nj0) rj0Var;
                }
                if (!(rj0Var instanceof lj0)) {
                    return rj0Var;
                }
                lj0 lj0Var = (lj0) rj0Var;
                fq5 fq5Var = lj0Var.b;
                return fq5Var.c instanceof pid ? d7eVar2 != null ? new lj0(d7eVar2, fq5Var) : lj0Var : d7eVar3 != null ? new lj0(d7eVar3, fq5Var) : lj0Var;
            case 9:
                Long l = (Long) obj;
                l.longValue();
                ((ct8) obj4).invoke((String) obj3, (String) obj2, l);
                return Unit.a;
            case 10:
                e1d e1dVar = (e1d) obj2;
                dma dmaVar = (dma) obj;
                dmaVar.getClass();
                ((e1d) obj3).setValue(Boolean.valueOf(dmaVar.f()));
                if (((View) obj4).isAttachedToWindow() && dmaVar.f()) {
                    e1dVar.setValue(o6a.m(dmaVar, true));
                }
                return Unit.a;
            case 11:
                y7l y7lVar = (y7l) obj3;
                Context context4 = (Context) obj2;
                zra zraVar = (zra) obj;
                zraVar.getClass();
                for (Map.Entry entry : ((tee) obj4).entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    zraVar.a(str2.hashCode(), new tc3(-1729631924, new d82(str2, i2), true));
                    int size = list.size();
                    xjd xjdVar = new xjd(list, 12);
                    tc3 tc3Var = new tc3(33490014, new d7l(list, y7lVar, context4), true);
                    for (int i10 = 0; i10 < size; i10++) {
                        zraVar.a(((Number) xjdVar.invoke(Integer.valueOf(i10))).longValue(), new tc3(19676320, new yra(tc3Var, i10), true));
                    }
                }
                return Unit.a;
            case 12:
                Context context5 = (Context) obj2;
                and andVar = (and) obj4;
                xel xelVar = (xel) obj3;
                String str3 = (String) obj;
                fgf fgfVar = andVar.b;
                old oldVar = andVar.a;
                r9k r9kVar = fgfVar.b;
                if (r9kVar == null || (str = r9kVar.b(context5)) == null) {
                    str = "Full time";
                }
                nv.b0(context5, str, oldVar.a.c, "featured", Integer.valueOf(xelVar.a.a), vmd.FEATURED_TOURNAMENT, "odds_value", oldVar.f);
                bea.G(context5, str3);
                return Unit.a;
            case 13:
                Function1 function1 = (Function1) obj2;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                gv9 gv9Var3 = (gv9) ((ofl) obj4).b.get((String) ((e1d) obj3).getValue());
                if (gv9Var3 == null) {
                    gv9Var3 = rlh.b;
                }
                esaVar2.a(gv9Var3.size(), new wsd(21, new pcl(i5), gv9Var3), new uk1(13, gv9Var3), new tc3(802480018, new jb7(gv9Var3, function1, r12), true));
                return Unit.a;
            case 14:
                gv9 gv9Var4 = ((gll) obj).a;
                gv9Var4.getClass();
                return new gll(gv9Var4, (uv3) obj4, (skl) obj3, (Bitmap) obj2);
            case 15:
                Activity activity = (Activity) obj4;
                Function0 function0 = (Function0) obj3;
                Function0 function02 = (Function0) obj2;
                mpl mplVar = (mpl) obj;
                mplVar.getClass();
                int ordinal = mplVar.ordinal();
                if (ordinal == 0) {
                    i3 = 1;
                } else if (ordinal == 1) {
                    i3 = 0;
                } else if (ordinal != 2) {
                    if (ordinal == 3) {
                        i3 = 8;
                    } else {
                        if (ordinal != 4) {
                            zzl.b();
                            return null;
                        }
                        i3 = -1;
                    }
                }
                activity.setRequestedOrientation(i3);
                int ordinal2 = mplVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    zzl.b();
                                    return null;
                                }
                                return Unit.a;
                            }
                        }
                    }
                    function0.invoke();
                    return Unit.a;
                }
                function02.invoke();
                return Unit.a;
            case 16:
                Activity activity2 = (Activity) obj4;
                ((o55) obj).getClass();
                Object systemService = activity2.getSystemService("sensor");
                systemService.getClass();
                SensorManager sensorManager = (SensorManager) systemService;
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                txl txlVar = new txl(activity2, (Function1) obj3, (e1d) obj2);
                if (defaultSensor != null) {
                    sensorManager.registerListener(txlVar, defaultSensor, 3);
                }
                return new t1m(sensorManager, txlVar);
            case 17:
                efm efmVar = (efm) obj4;
                n4m n4mVar = (n4m) obj3;
                boolean z4 = efm.j;
                ((MotionEvent) obj).getClass();
                efmVar.j(n4mVar, new bfm((BlazeTextWithIconButton) obj2, efmVar, n4mVar, i7));
                return Unit.a;
            case 18:
                ilm ilmVar = (ilm) obj4;
                n4m n4mVar2 = (n4m) obj3;
                xlm xlmVar = (xlm) obj2;
                n4m n4mVar3 = (n4m) obj;
                if (n4mVar3 != null) {
                    ilmVar.o(n4mVar3, null);
                    ArrayList U0 = CollectionsKt.U0(ilmVar.o0);
                    Iterator it2 = U0.iterator();
                    int i11 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (i11 < 0) {
                                b.q();
                                throw null;
                            }
                            if (!Intrinsics.c(((xlm) next).a, xlmVar.a)) {
                                i11++;
                            }
                        } else {
                            i11 = -1;
                        }
                    }
                    Integer valueOf = i11 >= 0 ? Integer.valueOf(i11) : null;
                    if (valueOf == null) {
                        Iterator it3 = U0.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            } else {
                                Object next2 = it3.next();
                                if (i8 < 0) {
                                    b.q();
                                    throw null;
                                }
                                if (((xlm) next2).d > xlmVar.d) {
                                    i4 = i8;
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                        }
                    } else {
                        int intValue2 = valueOf.intValue();
                        xlm xlmVar2 = (xlm) U0.get(intValue2);
                        Iterator it4 = xlmVar2.b.iterator();
                        int i12 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i12 = -1;
                                break;
                            } else {
                                Object next3 = it4.next();
                                if (i12 < 0) {
                                    b.q();
                                    throw null;
                                }
                                if (Intrinsics.c(((n4m) next3).a, n4mVar2.a)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                }
                return Unit.a;
            case 19:
                BlazeVideosPlayerSeekBarStyle blazeVideosPlayerSeekBarStyle = (BlazeVideosPlayerSeekBarStyle) obj4;
                e0n e0nVar = (e0n) obj3;
                n4m n4mVar4 = (n4m) obj2;
                boolean z5 = e0n.n;
                ((uxm) obj).getClass();
                if (blazeVideosPlayerSeekBarStyle != null) {
                    BlazeDefaultTimeBar blazeDefaultTimeBar = e0nVar.b.z;
                    if (blazeVideosPlayerSeekBarStyle.isVisible()) {
                        blazeDefaultTimeBar.setScrubberPlayingColor(blazeVideosPlayerSeekBarStyle.getPlayingState().getThumbColor());
                        CopyOnWriteArraySet copyOnWriteArraySet = blazeDefaultTimeBar.K;
                        blazeDefaultTimeBar.setScrubberPausedColor(blazeVideosPlayerSeekBarStyle.getPausedState().getThumbColor());
                        blazeDefaultTimeBar.setUnplayedPausedColor(blazeVideosPlayerSeekBarStyle.getPausedState().getBackgroundColor());
                        blazeDefaultTimeBar.setUnplayedPlayingColor(blazeVideosPlayerSeekBarStyle.getPlayingState().getBackgroundColor());
                        blazeDefaultTimeBar.setPlayedPaintPlayingColor(blazeVideosPlayerSeekBarStyle.getPlayingState().getProgressColor());
                        blazeDefaultTimeBar.setPlayedPaintPausedColor(blazeVideosPlayerSeekBarStyle.getPausedState().getProgressColor());
                        blazeDefaultTimeBar.setBarPlayingHeight(blazeVideosPlayerSeekBarStyle.getPlayingState().getHeight().getToPx$blazesdk_release());
                        blazeDefaultTimeBar.setBarPausedHeight(blazeVideosPlayerSeekBarStyle.getPausedState().getHeight().getToPx$blazesdk_release());
                        blazeDefaultTimeBar.setScrubberPausedSize(blazeVideosPlayerSeekBarStyle.getPausedState().getThumbSize().getToPx$blazesdk_release());
                        blazeDefaultTimeBar.setScrubberPlayingSize(blazeVideosPlayerSeekBarStyle.getPlayingState().getThumbSize().getToPx$blazesdk_release());
                        blazeDefaultTimeBar.setPlayingScrubberIsVisible(blazeVideosPlayerSeekBarStyle.getPlayingState().isThumbVisible());
                        blazeDefaultTimeBar.setPausedScrubberIsVisible(blazeVideosPlayerSeekBarStyle.getPausedState().isThumbVisible());
                        blazeDefaultTimeBar.setPlayingSeekbarIsVisible(blazeVideosPlayerSeekBarStyle.getPlayingState().isVisible());
                        blazeDefaultTimeBar.setPausedSeekbarIsVisible(blazeVideosPlayerSeekBarStyle.getPausedState().isVisible());
                        blazeDefaultTimeBar.setSeekbarPlayingCornerRadius(blazeVideosPlayerSeekBarStyle.getPlayingState().getCornerRadius().getToPx$blazesdk_release());
                        blazeDefaultTimeBar.setSeekbarPausedCornerRadius(blazeVideosPlayerSeekBarStyle.getPausedState().getCornerRadius().getToPx$blazesdk_release());
                        evl.t(blazeVideosPlayerSeekBarStyle.getBottomMargin().getToPx$blazesdk_release(), blazeDefaultTimeBar);
                        lz.z(blazeVideosPlayerSeekBarStyle.getHorizontalMargin().getToPx$blazesdk_release(), blazeDefaultTimeBar);
                        lz.v(blazeDefaultTimeBar, blazeVideosPlayerSeekBarStyle.getHorizontalMargin().getToPx$blazesdk_release());
                        Integer thumbImageResId = blazeVideosPlayerSeekBarStyle.getPlayingState().getThumbImageResId();
                        if (thumbImageResId != null) {
                            blazeDefaultTimeBar.setPlayingThumbImage(thumbImageResId.intValue());
                        }
                        Integer thumbImageResId2 = blazeVideosPlayerSeekBarStyle.getPausedState().getThumbImageResId();
                        if (thumbImageResId2 != null) {
                            blazeDefaultTimeBar.setPausedThumbImage(thumbImageResId2.intValue());
                        }
                        f1n f1nVar = e0nVar.e;
                        if (f1nVar != null) {
                            copyOnWriteArraySet.remove(f1nVar);
                        }
                        f1n f1nVar2 = new f1n(e0nVar);
                        e0nVar.e = f1nVar2;
                        copyOnWriteArraySet.add(f1nVar2);
                        BlazeVideosPlayerStyle a = e0nVar.a();
                        boolean z6 = n4mVar4.c instanceof n4m.a.b;
                        Object[] objArr2 = (a == null || (seekBar3 = a.getSeekBar()) == null || !seekBar3.isVisible()) ? false : true;
                        Object[] objArr3 = (a == null || (seekBar2 = a.getSeekBar()) == null || (playingState = seekBar2.getPlayingState()) == null || !playingState.isVisible()) ? false : true;
                        r12 = (a == null || (seekBar = a.getSeekBar()) == null || (pausedState = seekBar.getPausedState()) == null || !pausedState.isVisible()) ? 0 : 1;
                        if (z6 && objArr2 != false && (objArr3 != false || r12 != 0)) {
                            i6 = 0;
                        }
                        blazeDefaultTimeBar.setVisibility(i6);
                    }
                }
                return Unit.a;
            default:
                n4m n4mVar5 = (n4m) obj4;
                IPlayerItemButtonStyle iPlayerItemButtonStyle = (IPlayerItemButtonStyle) obj3;
                e0n e0nVar2 = (e0n) obj2;
                uxm uxmVar = (uxm) obj;
                boolean z7 = e0n.n;
                uxmVar.getClass();
                ImageView imageView2 = uxmVar.r;
                ytm e = fgm.e(n4mVar5);
                if (e != null) {
                    imageView2.setSelected(e.getV());
                    imageView2.setContentDescription(e.getV() ? imageView2.getContext().getString(com.sofascore.results.R.string.blaze_accessibility_unlike_video) : imageView2.getContext().getString(com.sofascore.results.R.string.blaze_accessibility_like_video));
                    imageView = imageView2;
                    imageView.setOnClickListener(new r2(e, imageView, iPlayerItemButtonStyle, e0nVar2, 7));
                } else {
                    imageView = imageView2;
                }
                imageView.getClass();
                ctl.setPlayerButtonUi$default(imageView, iPlayerItemButtonStyle, false, n4mVar5.b, null, 10, null);
                return Unit.a;
        }
    }

    public /* synthetic */ ncj(Context context, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = context;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ ncj(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
