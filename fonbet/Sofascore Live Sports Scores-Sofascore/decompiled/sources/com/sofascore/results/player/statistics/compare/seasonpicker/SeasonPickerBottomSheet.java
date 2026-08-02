package com.sofascore.results.player.statistics.compare.seasonpicker;

import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.compare.seasonpicker.SeasonPickerBottomSheet;
import defpackage.duf;
import defpackage.fvg;
import defpackage.joa;
import defpackage.otk;
import defpackage.pyg;
import defpackage.tc3;
import defpackage.uyg;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/player/statistics/compare/seasonpicker/SeasonPickerBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SeasonPickerBottomSheet extends Hilt_SeasonPickerBottomSheet {
    public final otk C;
    public final joa D;
    public final joa E;
    public final tc3 F;

    public SeasonPickerBottomSheet() {
        final int i = 0;
        final int i2 = 1;
        this.C = new otk(duf.a.getOrCreateKotlinClass(pyg.class), new uyg(this, i), new uyg(this, 2), new uyg(this, i2));
        Function0 function0 = new Function0(this) { // from class: tyg
            public final /* synthetic */ SeasonPickerBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                SeasonPickerBottomSheet seasonPickerBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        String string = seasonPickerBottomSheet.requireArguments().getString("SLOT_INDEX", "First");
                        string.getClass();
                        return e93.valueOf(string);
                    default:
                        return seasonPickerBottomSheet.requireArguments().getString("SPORT", "");
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.D = ypa.a(ysaVar, function0);
        this.E = ypa.a(ysaVar, new Function0(this) { // from class: tyg
            public final /* synthetic */ SeasonPickerBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                SeasonPickerBottomSheet seasonPickerBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        String string = seasonPickerBottomSheet.requireArguments().getString("SLOT_INDEX", "First");
                        string.getClass();
                        return e93.valueOf(string);
                    default:
                        return seasonPickerBottomSheet.requireArguments().getString("SPORT", "");
                }
            }
        });
        this.F = new tc3(-2085561337, new fvg(this, 4), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H, reason: from getter */
    public final tc3 getI() {
        return this.F;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "SeasonSelectionModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getX() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(Intrinsics.c((String) this.E.getValue(), Sports.TENNIS) ? R.string.select_button : R.string.select_season);
        string.getClass();
        return string;
    }
}
