package com.sofascore.results.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import defpackage.nq8;
import defpackage.o8;
import defpackage.yhk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/view/CardCtaWithTitleView;", "Lo8;", "", "getLayoutId", "()I", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardCtaWithTitleView extends o8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardCtaWithTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        View root = getRoot();
        int i = R.id.card_title;
        if (((TextView) nq8.B(R.id.card_title, root)) != null) {
            i = R.id.content_container;
            if (((LinearLayout) nq8.B(R.id.content_container, root)) != null) {
                i = R.id.cta_bottom;
                if (((FrameLayout) nq8.B(R.id.cta_bottom, root)) != null) {
                    i = R.id.label_cta;
                    if (((TextView) nq8.B(R.id.label_cta, root)) != null) {
                        i = R.id.label_new;
                        if (((TextView) nq8.B(R.id.label_new, root)) != null) {
                            LayoutInflater.from(context);
                            setVisibility(8);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.card_cta_with_title_view;
    }
}
