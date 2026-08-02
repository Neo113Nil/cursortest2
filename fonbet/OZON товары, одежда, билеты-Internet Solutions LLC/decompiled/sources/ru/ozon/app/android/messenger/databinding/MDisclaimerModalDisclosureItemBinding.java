package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.DisclosureIconTitleSubtitleCellView;

/* loaded from: classes12.dex */
public final class MDisclaimerModalDisclosureItemBinding implements a {

    @NonNull
    public final DisclosureIconTitleSubtitleCellView disclaimerModalItemDisclosure;

    @NonNull
    private final DisclosureIconTitleSubtitleCellView rootView;

    private MDisclaimerModalDisclosureItemBinding(@NonNull DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView, @NonNull DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView2) {
        this.rootView = disclosureIconTitleSubtitleCellView;
        this.disclaimerModalItemDisclosure = disclosureIconTitleSubtitleCellView2;
    }

    @NonNull
    public static MDisclaimerModalDisclosureItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView = (DisclosureIconTitleSubtitleCellView) view;
        return new MDisclaimerModalDisclosureItemBinding(disclosureIconTitleSubtitleCellView, disclosureIconTitleSubtitleCellView);
    }

    @NonNull
    public static MDisclaimerModalDisclosureItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_disclaimer_modal_disclosure_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public DisclosureIconTitleSubtitleCellView getRoot() {
        return this.rootView;
    }
}
