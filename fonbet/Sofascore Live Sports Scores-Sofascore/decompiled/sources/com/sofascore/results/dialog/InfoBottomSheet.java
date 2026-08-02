package com.sofascore.results.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.results.dialog.InfoBottomSheet;
import defpackage.joa;
import defpackage.o2a;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.yrh;
import defpackage.ysa;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/dialog/InfoBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "f7a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InfoBottomSheet extends Hilt_InfoBottomSheet {
    public final joa B;
    public final joa C;
    public final joa D;
    public final joa E;
    public final boolean F;

    public InfoBottomSheet() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: p2a
            public final /* synthetic */ InfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InfoBottomSheet infoBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = infoBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TITLE_EXTRA", String.class);
                        if (M != null) {
                            return (String) M;
                        }
                        a70.p("Serializable TITLE_EXTRA not found");
                        return null;
                    case 1:
                        return infoBottomSheet.requireArguments().getCharSequence("TEXT_EXTRA");
                    case 2:
                        return infoBottomSheet.requireArguments().getCharSequence("LOWER_TEXT_EXTRA");
                    default:
                        Bundle requireArguments2 = infoBottomSheet.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "ANALYTICS_STRING_EXTRA", String.class);
                        if (M2 != null) {
                            return (String) M2;
                        }
                        a70.p("Serializable ANALYTICS_STRING_EXTRA not found");
                        return null;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.B = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.C = ypa.a(ysaVar, new Function0(this) { // from class: p2a
            public final /* synthetic */ InfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InfoBottomSheet infoBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = infoBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TITLE_EXTRA", String.class);
                        if (M != null) {
                            return (String) M;
                        }
                        a70.p("Serializable TITLE_EXTRA not found");
                        return null;
                    case 1:
                        return infoBottomSheet.requireArguments().getCharSequence("TEXT_EXTRA");
                    case 2:
                        return infoBottomSheet.requireArguments().getCharSequence("LOWER_TEXT_EXTRA");
                    default:
                        Bundle requireArguments2 = infoBottomSheet.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "ANALYTICS_STRING_EXTRA", String.class);
                        if (M2 != null) {
                            return (String) M2;
                        }
                        a70.p("Serializable ANALYTICS_STRING_EXTRA not found");
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.D = ypa.a(ysaVar, new Function0(this) { // from class: p2a
            public final /* synthetic */ InfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InfoBottomSheet infoBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = infoBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TITLE_EXTRA", String.class);
                        if (M != null) {
                            return (String) M;
                        }
                        a70.p("Serializable TITLE_EXTRA not found");
                        return null;
                    case 1:
                        return infoBottomSheet.requireArguments().getCharSequence("TEXT_EXTRA");
                    case 2:
                        return infoBottomSheet.requireArguments().getCharSequence("LOWER_TEXT_EXTRA");
                    default:
                        Bundle requireArguments2 = infoBottomSheet.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "ANALYTICS_STRING_EXTRA", String.class);
                        if (M2 != null) {
                            return (String) M2;
                        }
                        a70.p("Serializable ANALYTICS_STRING_EXTRA not found");
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.E = ypa.a(ysaVar, new Function0(this) { // from class: p2a
            public final /* synthetic */ InfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                InfoBottomSheet infoBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = infoBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TITLE_EXTRA", String.class);
                        if (M != null) {
                            return (String) M;
                        }
                        a70.p("Serializable TITLE_EXTRA not found");
                        return null;
                    case 1:
                        return infoBottomSheet.requireArguments().getCharSequence("TEXT_EXTRA");
                    case 2:
                        return infoBottomSheet.requireArguments().getCharSequence("LOWER_TEXT_EXTRA");
                    default:
                        Bundle requireArguments2 = infoBottomSheet.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "ANALYTICS_STRING_EXTRA", String.class);
                        if (M2 != null) {
                            return (String) M2;
                        }
                        a70.p("Serializable ANALYTICS_STRING_EXTRA not found");
                        return null;
                }
            }
        });
        this.F = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        yrh a = yrh.a(layoutInflater, (FrameLayout) v().l);
        a.b.setContent(new tc3(1899841572, new o2a(w(), this, 0), true));
        CoordinatorLayout coordinatorLayout = a.a;
        coordinatorLayout.getClass();
        return coordinatorLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return (String) this.E.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.F;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return (String) this.B.getValue();
    }
}
