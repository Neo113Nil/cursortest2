package com.sofascore.results.main.matches.redesign.filter;

import android.os.Bundle;
import android.view.View;
import com.sofascore.model.database.DisplayType;
import com.sofascore.model.newNetwork.FilterCategory;
import com.sofascore.results.R;
import defpackage.byb;
import defpackage.duf;
import defpackage.dyb;
import defpackage.faa;
import defpackage.fdi;
import defpackage.fuf;
import defpackage.gv9;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.joa;
import defpackage.k13;
import defpackage.l6g;
import defpackage.otk;
import defpackage.sub;
import defpackage.tc3;
import defpackage.u28;
import defpackage.wya;
import defpackage.xxb;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yxb;
import defpackage.zqb;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/filter/MatchesFilterBottomSheetDialog;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MatchesFilterBottomSheetDialog extends Hilt_MatchesFilterBottomSheetDialog {
    public final otk C;
    public final otk D;
    public final joa E;
    public final tc3 F;

    public MatchesFilterBottomSheetDialog() {
        yxb yxbVar = new yxb(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new hv7(yxbVar, 26));
        fuf fufVar = duf.a;
        this.C = new otk(fufVar.getOrCreateKotlinClass(dyb.class), new ix7(a, 25), new wya(6, this, a), new ix7(a, 26));
        int i = 0;
        this.D = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new yxb(this, i), new yxb(this, 2), new yxb(this, 1));
        this.E = ypa.a(ysaVar, new xxb(this, i));
        this.F = new tc3(1931355036, new faa(this, 21), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H, reason: from getter */
    public final tc3 getE() {
        return this.F;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        byb bybVar = ((zqb) this.D.getValue()).c0;
        if (bybVar != null) {
            DisplayType displayType = bybVar.a;
            dyb dybVar = (dyb) this.C.getValue();
            boolean booleanValue = ((Boolean) this.E.getValue()).booleanValue();
            fdi fdiVar = dybVar.e;
            gv9<u28> gv9Var = bybVar.b;
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            for (u28 u28Var : gv9Var) {
                if (Intrinsics.c(u28Var.a, FilterCategory.STATUS.getFilterCategoryId())) {
                    u28Var = u28.a(u28Var, null, booleanValue, booleanValue, 47);
                }
                arrayList.add(u28Var);
            }
            byb bybVar2 = new byb(displayType, l6g.W(arrayList), bybVar.c);
            fdiVar.getClass();
            fdiVar.m(null, bybVar2);
            int c = sub.c(k13.r(gv9Var, 10));
            if (c < 16) {
                c = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(c);
            for (u28 u28Var2 : gv9Var) {
                linkedHashMap.put(u28Var2.a, u28Var2.d);
            }
            dybVar.i = new TreeMap(linkedHashMap);
            dybVar.j = displayType;
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "FilterModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getC() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.filter);
        string.getClass();
        return string;
    }
}
