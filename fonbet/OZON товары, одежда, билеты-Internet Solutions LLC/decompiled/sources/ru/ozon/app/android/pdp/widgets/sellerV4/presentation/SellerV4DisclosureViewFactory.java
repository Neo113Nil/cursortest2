package ru.ozon.app.android.pdp.widgets.sellerV4.presentation;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.DisclosureIconTitleSubtitleCellView;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4DisclosureViewFactory;", "Lru/ozon/app/android/pdp/utils/DPS;", "<init>", "()V", "createSellerDisclosureView", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "context", "Landroid/content/Context;", "configure", "view", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerV4DisclosureViewFactory implements DPS {

    @NotNull
    public static final SellerV4DisclosureViewFactory INSTANCE = new SellerV4DisclosureViewFactory();

    private SellerV4DisclosureViewFactory() {
    }

    private final DisclosureIconTitleSubtitleCellView configure(DisclosureIconTitleSubtitleCellView view) {
        view.setId(R$id.sellerDisclosure);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        SellerV4DisclosureViewFactory sellerV4DisclosureViewFactory = INSTANCE;
        layoutParams.setMargins(sellerV4DisclosureViewFactory.getDp16(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, sellerV4DisclosureViewFactory.getDp16(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        view.setLayoutParams(layoutParams);
        return view;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleCellView createSellerDisclosureView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView = (DisclosureIconTitleSubtitleCellView) q.f64554a.i(N.b(DisclosureIconTitleSubtitleCellView.class), context);
        if (disclosureIconTitleSubtitleCellView == null) {
            disclosureIconTitleSubtitleCellView = new DisclosureIconTitleSubtitleCellView(context, null, 0, 0, null, false, 62, null);
        }
        return configure(disclosureIconTitleSubtitleCellView);
    }

    public int getDp10() {
        return DPS.DefaultImpls.getDp10(this);
    }

    public int getDp12() {
        return DPS.DefaultImpls.getDp12(this);
    }

    public int getDp14() {
        return DPS.DefaultImpls.getDp14(this);
    }

    public int getDp16() {
        return DPS.DefaultImpls.getDp16(this);
    }

    public int getDp2() {
        return DPS.DefaultImpls.getDp2(this);
    }

    public int getDp20() {
        return DPS.DefaultImpls.getDp20(this);
    }

    public int getDp24() {
        return DPS.DefaultImpls.getDp24(this);
    }

    public int getDp26() {
        return DPS.DefaultImpls.getDp26(this);
    }

    public int getDp36() {
        return DPS.DefaultImpls.getDp36(this);
    }

    public int getDp4() {
        return DPS.DefaultImpls.getDp4(this);
    }

    public int getDp50() {
        return DPS.DefaultImpls.getDp50(this);
    }

    public int getDp52() {
        return DPS.DefaultImpls.getDp52(this);
    }

    public int getDp8() {
        return DPS.DefaultImpls.getDp8(this);
    }
}
