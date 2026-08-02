package com.sofascore.results.event.overs.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.event.overs.view.CricketOverDialog;
import defpackage.ayd;
import defpackage.byd;
import defpackage.duf;
import defpackage.kz3;
import defpackage.mqi;
import defpackage.o04;
import defpackage.otk;
import defpackage.w74;
import defpackage.y46;
import defpackage.y7;
import defpackage.ypa;
import defpackage.z8e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/overs/view/CricketOverDialog;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CricketOverDialog extends Hilt_CricketOverDialog {
    public w74 B;
    public final otk C = new otk(duf.a.getOrCreateKotlinClass(y46.class), new o04(this, 0), new o04(this, 2), new o04(this, 1));
    public final mqi D;
    public final mqi E;
    public final mqi F;
    public final mqi G;

    public CricketOverDialog() {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.D = ypa.b(new Function0(this) { // from class: n04
            public final /* synthetic */ CricketOverDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4;
                int i5 = i;
                CricketOverDialog cricketOverDialog = this.b;
                switch (i5) {
                    case 0:
                        Bundle requireArguments = cricketOverDialog.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_EVENT", Event.class);
                        if (M != null) {
                            return (Event) M;
                        }
                        a70.p("Serializable ARG_EVENT not found");
                        return null;
                    case 1:
                        i4 = cricketOverDialog.requireArguments().getInt("ARG_INNING");
                        break;
                    case 2:
                        i4 = cricketOverDialog.requireArguments().getInt("ARG_OVER");
                        break;
                    default:
                        Event event = (Event) cricketOverDialog.D.getValue();
                        Context requireContext = cricketOverDialog.requireContext();
                        requireContext.getClass();
                        ayd aydVar = new ayd(requireContext, event);
                        aydVar.a.d = new kr1(cricketOverDialog, 24);
                        return aydVar;
                }
                return Integer.valueOf(i4);
            }
        });
        this.E = ypa.b(new Function0(this) { // from class: n04
            public final /* synthetic */ CricketOverDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4;
                int i5 = i2;
                CricketOverDialog cricketOverDialog = this.b;
                switch (i5) {
                    case 0:
                        Bundle requireArguments = cricketOverDialog.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_EVENT", Event.class);
                        if (M != null) {
                            return (Event) M;
                        }
                        a70.p("Serializable ARG_EVENT not found");
                        return null;
                    case 1:
                        i4 = cricketOverDialog.requireArguments().getInt("ARG_INNING");
                        break;
                    case 2:
                        i4 = cricketOverDialog.requireArguments().getInt("ARG_OVER");
                        break;
                    default:
                        Event event = (Event) cricketOverDialog.D.getValue();
                        Context requireContext = cricketOverDialog.requireContext();
                        requireContext.getClass();
                        ayd aydVar = new ayd(requireContext, event);
                        aydVar.a.d = new kr1(cricketOverDialog, 24);
                        return aydVar;
                }
                return Integer.valueOf(i4);
            }
        });
        this.F = ypa.b(new Function0(this) { // from class: n04
            public final /* synthetic */ CricketOverDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4;
                int i5 = i3;
                CricketOverDialog cricketOverDialog = this.b;
                switch (i5) {
                    case 0:
                        Bundle requireArguments = cricketOverDialog.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_EVENT", Event.class);
                        if (M != null) {
                            return (Event) M;
                        }
                        a70.p("Serializable ARG_EVENT not found");
                        return null;
                    case 1:
                        i4 = cricketOverDialog.requireArguments().getInt("ARG_INNING");
                        break;
                    case 2:
                        i4 = cricketOverDialog.requireArguments().getInt("ARG_OVER");
                        break;
                    default:
                        Event event = (Event) cricketOverDialog.D.getValue();
                        Context requireContext = cricketOverDialog.requireContext();
                        requireContext.getClass();
                        ayd aydVar = new ayd(requireContext, event);
                        aydVar.a.d = new kr1(cricketOverDialog, 24);
                        return aydVar;
                }
                return Integer.valueOf(i4);
            }
        });
        final int i4 = 3;
        this.G = ypa.b(new Function0(this) { // from class: n04
            public final /* synthetic */ CricketOverDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42;
                int i5 = i4;
                CricketOverDialog cricketOverDialog = this.b;
                switch (i5) {
                    case 0:
                        Bundle requireArguments = cricketOverDialog.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_EVENT", Event.class);
                        if (M != null) {
                            return (Event) M;
                        }
                        a70.p("Serializable ARG_EVENT not found");
                        return null;
                    case 1:
                        i42 = cricketOverDialog.requireArguments().getInt("ARG_INNING");
                        break;
                    case 2:
                        i42 = cricketOverDialog.requireArguments().getInt("ARG_OVER");
                        break;
                    default:
                        Event event = (Event) cricketOverDialog.D.getValue();
                        Context requireContext = cricketOverDialog.requireContext();
                        requireContext.getClass();
                        ayd aydVar = new ayd(requireContext, event);
                        aydVar.a.d = new kr1(cricketOverDialog, 24);
                        return aydVar;
                }
                return Integer.valueOf(i42);
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        w74 b = w74.b(layoutInflater, (FrameLayout) v().l);
        this.B = b;
        b.c.setAdapter((ayd) this.G.getValue());
        w74 w74Var = this.B;
        if (w74Var == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        RecyclerView recyclerView = w74Var.c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 22);
        s(recyclerView);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView.addItemDecoration(new byd(requireContext2));
        w74 w74Var2 = this.B;
        if (w74Var2 != null) {
            return w74Var2.b;
        }
        Intrinsics.i("dialogBinding");
        throw null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((y46) this.C.getValue()).g.e(getViewLifecycleOwner(), new y7(11, new kz3(this, 1)));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "CricketOversModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.over_details);
        string.getClass();
        return string;
    }
}
