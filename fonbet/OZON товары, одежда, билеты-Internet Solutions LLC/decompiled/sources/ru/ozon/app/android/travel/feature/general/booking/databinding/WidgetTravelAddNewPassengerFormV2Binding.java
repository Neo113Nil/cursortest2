package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class WidgetTravelAddNewPassengerFormV2Binding implements a {

    @NonNull
    public final LargeButtonView addBonusCardLbv;

    @NonNull
    public final TextAtomView addNewPassengerFormV2AgreementTextView;

    @NonNull
    public final TextAtomView addNewPassengerFormV2SubtitleTextView;

    @NonNull
    public final TextAtomView addNewPassengerFormV2TitleTextView;

    @NonNull
    public final LinearLayout bonusCardsContainerLl;

    @NonNull
    public final ImageView bonusCardsIv;

    @NonNull
    public final RecyclerView bonusCardsRv;

    @NonNull
    public final RecyclerView inputsRv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LargeButtonView saveLbv;

    @NonNull
    public final CellView useBankDetailsCV;

    private WidgetTravelAddNewPassengerFormV2Binding(@NonNull LinearLayout linearLayout, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull LargeButtonView largeButtonView2, @NonNull CellView cellView) {
        this.rootView = linearLayout;
        this.addBonusCardLbv = largeButtonView;
        this.addNewPassengerFormV2AgreementTextView = textAtomView;
        this.addNewPassengerFormV2SubtitleTextView = textAtomView2;
        this.addNewPassengerFormV2TitleTextView = textAtomView3;
        this.bonusCardsContainerLl = linearLayout2;
        this.bonusCardsIv = imageView;
        this.bonusCardsRv = recyclerView;
        this.inputsRv = recyclerView2;
        this.saveLbv = largeButtonView2;
        this.useBankDetailsCV = cellView;
    }

    @NonNull
    public static WidgetTravelAddNewPassengerFormV2Binding bind(@NonNull View view) {
        int i11 = R$id.addBonusCardLbv;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.addNewPassengerFormV2AgreementTextView;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.addNewPassengerFormV2SubtitleTextView;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    i11 = R$id.addNewPassengerFormV2TitleTextView;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView3 != null) {
                        i11 = R$id.bonusCardsContainerLl;
                        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                        if (linearLayout != null) {
                            i11 = R$id.bonusCardsIv;
                            ImageView imageView = (ImageView) C2548q.d(i11, view);
                            if (imageView != null) {
                                i11 = R$id.bonusCardsRv;
                                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                if (recyclerView != null) {
                                    i11 = R$id.inputsRv;
                                    RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                                    if (recyclerView2 != null) {
                                        i11 = R$id.saveLbv;
                                        LargeButtonView largeButtonView2 = (LargeButtonView) C2548q.d(i11, view);
                                        if (largeButtonView2 != null) {
                                            i11 = R$id.useBankDetailsCV;
                                            CellView cellView = (CellView) C2548q.d(i11, view);
                                            if (cellView != null) {
                                                return new WidgetTravelAddNewPassengerFormV2Binding((LinearLayout) view, largeButtonView, textAtomView, textAtomView2, textAtomView3, linearLayout, imageView, recyclerView, recyclerView2, largeButtonView2, cellView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
