package com.sofascore.results.chat.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.ironsource.Ua;
import com.sofascore.results.R;
import defpackage.d17;
import defpackage.gh5;
import defpackage.o8;
import defpackage.qha;
import defpackage.u6b;
import defpackage.wca;
import defpackage.xw3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/chat/view/FloatingIndicationLabelView;", "Lo8;", "", "getLayoutId", "()I", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FloatingIndicationLabelView extends o8 {
    public static final /* synthetic */ int f = 0;
    public final gh5 d;
    public final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingIndicationLabelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        this.d = gh5.b(getRoot());
        this.e = Ua.C;
        setVisibility(4);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.floating_indication_label;
    }

    public final void j(Integer num, String str) {
        str.getClass();
        gh5 gh5Var = this.d;
        gh5Var.d.setText(str);
        ImageView imageView = gh5Var.c;
        imageView.setVisibility(num != null ? 0 : 8);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.surface_1)));
        if (getVisibility() != 0) {
            setVisibility(0);
            gh5Var.b.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.float_action_show));
        }
        u6b w = qha.w(this);
        if (w != null) {
            xw3.L(wca.x(w.getLifecycle()), null, null, new d17(this, null, 19), 3);
        }
    }
}
