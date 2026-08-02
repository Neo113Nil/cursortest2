package com.sofascore.results.team.lastnext.calendar.monthpicker;

import com.sofascore.results.R;
import defpackage.duf;
import defpackage.ewi;
import defpackage.fuf;
import defpackage.fwi;
import defpackage.joa;
import defpackage.jwi;
import defpackage.o1i;
import defpackage.otk;
import defpackage.q8i;
import defpackage.tc3;
import defpackage.w1i;
import defpackage.wsf;
import defpackage.xwi;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/team/lastnext/calendar/monthpicker/TeamEventsCalendarMonthPickerBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamEventsCalendarMonthPickerBottomSheet extends Hilt_TeamEventsCalendarMonthPickerBottomSheet {
    public final otk C;
    public final otk D;
    public final tc3 E;

    public TeamEventsCalendarMonthPickerBottomSheet() {
        o1i o1iVar = new o1i(this, 15);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(o1iVar, 16));
        fuf fufVar = duf.a;
        this.C = new otk(fufVar.getOrCreateKotlinClass(jwi.class), new wsf(a, 27), new ewi(this, a, 0), new wsf(a, 28));
        joa a2 = ypa.a(ysaVar, new o1i(new w1i(this, 8), 17));
        this.D = new otk(fufVar.getOrCreateKotlinClass(xwi.class), new wsf(a2, 29), new ewi(this, a2, 1), new fwi(a2, 0));
        this.E = new tc3(20159535, new q8i(this, 6), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H, reason: from getter */
    public final tc3 getE() {
        return this.E;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "MonthSelectModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.select_month_and_year);
        string.getClass();
        return string;
    }
}
