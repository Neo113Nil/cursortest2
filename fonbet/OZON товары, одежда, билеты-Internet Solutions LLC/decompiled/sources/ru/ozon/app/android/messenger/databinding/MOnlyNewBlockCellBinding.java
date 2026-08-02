package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.controls.chip.ChipView;

/* loaded from: classes12.dex */
public final class MOnlyNewBlockCellBinding implements a {

    @NonNull
    public final ChipView allChats;

    @NonNull
    public final ChipView onlyNewChats;

    @NonNull
    private final LinearLayout rootView;

    private MOnlyNewBlockCellBinding(@NonNull LinearLayout linearLayout, @NonNull ChipView chipView, @NonNull ChipView chipView2) {
        this.rootView = linearLayout;
        this.allChats = chipView;
        this.onlyNewChats = chipView2;
    }

    @NonNull
    public static MOnlyNewBlockCellBinding bind(@NonNull View view) {
        int i11 = R$id.allChats;
        ChipView chipView = (ChipView) C2548q.d(i11, view);
        if (chipView != null) {
            i11 = R$id.onlyNewChats;
            ChipView chipView2 = (ChipView) C2548q.d(i11, view);
            if (chipView2 != null) {
                return new MOnlyNewBlockCellBinding((LinearLayout) view, chipView, chipView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MOnlyNewBlockCellBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_only_new_block_cell, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
