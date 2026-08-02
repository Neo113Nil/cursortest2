package com.sofascore.results.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import com.sofascore.results.dialog.PlayerPositionsModal;
import defpackage.bve;
import defpackage.km5;
import defpackage.mqi;
import defpackage.pte;
import defpackage.w74;
import defpackage.ypa;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/dialog/PlayerPositionsModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlayerPositionsModal extends BaseModalBottomSheetDialog {
    public w74 w;
    public final mqi x;
    public final mqi y;
    public final boolean z = true;

    public PlayerPositionsModal() {
        final int i = 0;
        this.x = ypa.b(new Function0(this) { // from class: ave
            public final /* synthetic */ PlayerPositionsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlayerPositionsModal playerPositionsModal = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = playerPositionsModal.requireArguments();
                        requireArguments.getClass();
                        return (Gender) gz8.M(requireArguments, "GENDER", Gender.class);
                    default:
                        FragmentActivity requireActivity = playerPositionsModal.requireActivity();
                        requireActivity.getClass();
                        return new bve(requireActivity, (Gender) playerPositionsModal.x.getValue());
                }
            }
        });
        final int i2 = 1;
        this.y = ypa.b(new Function0(this) { // from class: ave
            public final /* synthetic */ PlayerPositionsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlayerPositionsModal playerPositionsModal = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = playerPositionsModal.requireArguments();
                        requireArguments.getClass();
                        return (Gender) gz8.M(requireArguments, "GENDER", Gender.class);
                    default:
                        FragmentActivity requireActivity = playerPositionsModal.requireActivity();
                        requireActivity.getClass();
                        return new bve(requireActivity, (Gender) playerPositionsModal.x.getValue());
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        this.w = w74.a(layoutInflater, (FrameLayout) v().l);
        mqi mqiVar = this.y;
        bve bveVar = (bve) mqiVar.getValue();
        pte pteVar = new pte(this, 1);
        bveVar.getClass();
        bveVar.a.d = pteVar;
        w74 w74Var = this.w;
        if (w74Var == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        RecyclerView recyclerView = w74Var.c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 22);
        s(recyclerView);
        recyclerView.setAdapter((bve) mqiVar.getValue());
        w74 w74Var2 = this.w;
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
        ((bve) this.y.getValue()).F(km5.a);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "PlayerPositionModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.z;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.player_positions);
        string.getClass();
        return string;
    }
}
