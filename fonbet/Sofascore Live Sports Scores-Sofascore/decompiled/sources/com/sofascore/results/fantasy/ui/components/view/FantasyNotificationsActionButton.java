package com.sofascore.results.fantasy.ui.components.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import defpackage.d17;
import defpackage.g9i;
import defpackage.hkg;
import defpackage.ia0;
import defpackage.ndl;
import defpackage.ok3;
import defpackage.p4h;
import defpackage.qha;
import defpackage.qo6;
import defpackage.td4;
import defpackage.u6b;
import defpackage.udl;
import defpackage.wca;
import defpackage.xw3;
import defpackage.z8e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/fantasy/ui/components/view/FantasyNotificationsActionButton;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "favorite", "", "setFavorite", "(Z)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyNotificationsActionButton extends AppCompatImageView {
    public Integer a;
    public boolean b;
    public g9i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FantasyNotificationsActionButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        setScaleType(ImageView.ScaleType.CENTER);
        setImageTintList(ColorStateList.valueOf(context.getColor(R.color.on_color_primary)));
        z8e.a0(this, 200L, new qo6(this, 12));
    }

    public static final Unit b(FantasyNotificationsActionButton fantasyNotificationsActionButton) {
        Integer num = fantasyNotificationsActionButton.a;
        if (num != null) {
            int intValue = num.intValue();
            boolean z = fantasyNotificationsActionButton.b;
            fantasyNotificationsActionButton.setFavorite(!z);
            if (z) {
                Context context = fantasyNotificationsActionButton.getContext();
                context.getClass();
                hkg.p0(intValue, context);
            } else {
                Context context2 = fantasyNotificationsActionButton.getContext();
                context2.getClass();
                hkg.r(intValue, context2);
                Context context3 = fantasyNotificationsActionButton.getContext();
                context3.getClass();
                FragmentActivity K = hkg.K(context3);
                BaseActivity baseActivity = K instanceof BaseActivity ? (BaseActivity) K : null;
                if (baseActivity != null) {
                    p4h.t(baseActivity, false, null, null, 60);
                }
            }
        }
        return Unit.a;
    }

    private final void setFavorite(boolean favorite) {
        this.b = favorite;
        setImageResource(favorite ? R.drawable.ic_notification_active : R.drawable.ic_notification_deselected);
    }

    public final void d(int i) {
        ia0 ia0Var = ia0.q;
        udl h = ok3.p().h();
        Set set = h.l;
        if (set == null) {
            set = (Set) td4.t0(g.a, new ndl(h, null, 0));
        }
        setFavorite(set.contains(Integer.valueOf(i)));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Integer num = this.a;
        if (num != null) {
            d(num.intValue());
        }
        u6b w = qha.w(this);
        this.c = w != null ? xw3.L(wca.x(w.getLifecycle()), null, null, new d17(this, null, 6), 3) : null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        g9i g9iVar = this.c;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.c = null;
        super.onDetachedFromWindow();
    }
}
