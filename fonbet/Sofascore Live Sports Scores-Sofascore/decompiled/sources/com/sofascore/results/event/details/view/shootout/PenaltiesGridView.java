package com.sofascore.results.event.details.view.shootout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.hcb;
import defpackage.km5;
import defpackage.o8;
import defpackage.pn0;
import defpackage.tce;
import defpackage.yhk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/event/details/view/shootout/PenaltiesGridView;", "Lo8;", "", "getLayoutId", "()I", "", "Ltce;", "outcomes", "", "setOutcomes", "(Ljava/util/List;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PenaltiesGridView extends o8 {
    public final hcb d;
    public final int e;
    public boolean f;
    public List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PenaltiesGridView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        if (root == null) {
            yhk.s("rootView");
            throw null;
        }
        this.d = new hcb(2, (GridLayout) root);
        this.e = ao2.s(8, context);
        this.g = km5.a;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.penalties_dots_view;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ((GridLayout) this.d.b).post(new pn0(this, i, 11));
    }

    public final void setOutcomes(@NotNull List<? extends tce> outcomes) {
        outcomes.getClass();
        this.g = outcomes;
        hcb hcbVar = this.d;
        GridLayout gridLayout = (GridLayout) hcbVar.b;
        GridLayout gridLayout2 = (GridLayout) hcbVar.b;
        gridLayout.removeAllViews();
        int i = 0;
        for (Object obj : outcomes) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            tce tceVar = (tce) obj;
            ImageView imageView = new ImageView(getContext());
            gridLayout2.addView(imageView);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i3 = this.e;
            layoutParams.width = i3;
            layoutParams.height = i3;
            GridLayout.LayoutParams layoutParams2 = (GridLayout.LayoutParams) layoutParams;
            imageView.setImageResource(R.drawable.circle);
            if (i % gridLayout2.getColumnCount() == 0) {
                layoutParams2.setMarginStart(0);
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i3;
                layoutParams2.setMarginEnd(0);
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            } else {
                layoutParams2.setMarginStart(i3);
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i3;
                layoutParams2.setMarginEnd(0);
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            }
            imageView.setLayoutParams(layoutParams2);
            int ordinal = tceVar.ordinal();
            imageView.setImageTintList(ColorStateList.valueOf(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 0 : getContext().getColor(R.color.error) : getContext().getColor(R.color.success) : getContext().getColor(R.color.n_lv_4)));
            i = i2;
        }
    }
}
