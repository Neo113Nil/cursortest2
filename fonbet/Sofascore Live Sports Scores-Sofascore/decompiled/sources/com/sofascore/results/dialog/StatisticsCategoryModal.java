package com.sofascore.results.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.dialog.StatisticsCategoryModal;
import defpackage.iei;
import defpackage.mqi;
import defpackage.vwe;
import defpackage.w74;
import defpackage.ypa;
import defpackage.z8e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/dialog/StatisticsCategoryModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatisticsCategoryModal extends BaseModalBottomSheetDialog {
    public final boolean A = true;
    public w74 w;
    public final mqi x;
    public final mqi y;
    public final mqi z;

    public StatisticsCategoryModal() {
        final int i = 0;
        this.x = ypa.b(new Function0(this) { // from class: pei
            public final /* synthetic */ StatisticsCategoryModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StatisticsCategoryModal statisticsCategoryModal = this.b;
                switch (i2) {
                    case 0:
                        Context requireContext = statisticsCategoryModal.requireContext();
                        requireContext.getClass();
                        return new vwe(requireContext, true, (Gender) statisticsCategoryModal.z.getValue());
                    case 1:
                        Bundle requireArguments = statisticsCategoryModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "STATISTICS_CATEGORY", iei.class);
                        if (M != null) {
                            return (iei) M;
                        }
                        a70.p("Serializable STATISTICS_CATEGORY not found");
                        return null;
                    default:
                        Bundle requireArguments2 = statisticsCategoryModal.requireArguments();
                        requireArguments2.getClass();
                        return (Gender) gz8.M(requireArguments2, "GENDER", Gender.class);
                }
            }
        });
        final int i2 = 1;
        this.y = ypa.b(new Function0(this) { // from class: pei
            public final /* synthetic */ StatisticsCategoryModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StatisticsCategoryModal statisticsCategoryModal = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = statisticsCategoryModal.requireContext();
                        requireContext.getClass();
                        return new vwe(requireContext, true, (Gender) statisticsCategoryModal.z.getValue());
                    case 1:
                        Bundle requireArguments = statisticsCategoryModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "STATISTICS_CATEGORY", iei.class);
                        if (M != null) {
                            return (iei) M;
                        }
                        a70.p("Serializable STATISTICS_CATEGORY not found");
                        return null;
                    default:
                        Bundle requireArguments2 = statisticsCategoryModal.requireArguments();
                        requireArguments2.getClass();
                        return (Gender) gz8.M(requireArguments2, "GENDER", Gender.class);
                }
            }
        });
        final int i3 = 2;
        this.z = ypa.b(new Function0(this) { // from class: pei
            public final /* synthetic */ StatisticsCategoryModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StatisticsCategoryModal statisticsCategoryModal = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = statisticsCategoryModal.requireContext();
                        requireContext.getClass();
                        return new vwe(requireContext, true, (Gender) statisticsCategoryModal.z.getValue());
                    case 1:
                        Bundle requireArguments = statisticsCategoryModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "STATISTICS_CATEGORY", iei.class);
                        if (M != null) {
                            return (iei) M;
                        }
                        a70.p("Serializable STATISTICS_CATEGORY not found");
                        return null;
                    default:
                        Bundle requireArguments2 = statisticsCategoryModal.requireArguments();
                        requireArguments2.getClass();
                        return (Gender) gz8.M(requireArguments2, "GENDER", Gender.class);
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        w74 a = w74.a(layoutInflater, (FrameLayout) v().l);
        this.w = a;
        RecyclerView recyclerView = a.c;
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        z8e.b0(recyclerView, requireActivity, false, false, null, 22);
        s(recyclerView);
        recyclerView.setAdapter((vwe) this.x.getValue());
        w74 w74Var = this.w;
        if (w74Var != null) {
            return w74Var.b;
        }
        Intrinsics.i("dialogBinding");
        throw null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((vwe) this.x.getValue()).F(((iei) this.y.getValue()).b);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "StatisticsCategoryModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getA() {
        return this.A;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return ((iei) this.y.getValue()).a;
    }
}
