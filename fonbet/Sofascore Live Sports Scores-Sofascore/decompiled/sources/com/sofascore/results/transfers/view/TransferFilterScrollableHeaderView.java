package com.sofascore.results.transfers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.aba;
import defpackage.kvg;
import defpackage.lvg;
import defpackage.mvg;
import defpackage.yhk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/transfers/view/TransferFilterScrollableHeaderView;", "Llvg;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransferFilterScrollableHeaderView extends lvg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFilterScrollableHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        kvg layoutProvider = getLayoutProvider();
        layoutProvider.a().setVisibility(8);
        LinearLayout linearLayout = ((mvg) layoutProvider.b.getValue()).c;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            throw null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 8388627;
        linearLayout.setLayoutParams(layoutParams2);
        getLayoutProvider().a.setBackground(null);
        aba.G(getLayoutProvider().a());
    }
}
