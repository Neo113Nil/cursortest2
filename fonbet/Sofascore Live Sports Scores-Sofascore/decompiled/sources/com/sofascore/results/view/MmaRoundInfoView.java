package com.sofascore.results.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.results.R;
import defpackage.e92;
import defpackage.nq8;
import defpackage.yhk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/view/MmaRoundInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaRoundInfoView extends ConstraintLayout {
    public final e92 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MmaRoundInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.mma_round_info_layout, (ViewGroup) this, false);
        addView(inflate);
        int i = R.id.divider;
        View B = nq8.B(R.id.divider, inflate);
        if (B != null) {
            i = R.id.primary_text;
            TextView textView = (TextView) nq8.B(R.id.primary_text, inflate);
            if (textView != null) {
                i = R.id.secondary_text;
                TextView textView2 = (TextView) nq8.B(R.id.secondary_text, inflate);
                if (textView2 != null) {
                    i = R.id.secondary_text_group;
                    Group group = (Group) nq8.B(R.id.secondary_text_group, inflate);
                    if (group != null) {
                        this.a = new e92((MaterialCardView) inflate, B, textView, textView2, group, 14);
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(MmaEvent mmaEvent) {
        Integer num;
        Integer played;
        Integer periodLength;
        String description = mmaEvent.getStatus().getDescription(Sports.MMA);
        boolean c = Intrinsics.c(description, StatusKt.STATUS_DESCRIPTION_STARTED);
        e92 e92Var = this.a;
        if (c || Intrinsics.c(description, StatusKt.STATUS_AWAITING_ANNOUNCEMENT)) {
            int i = Intrinsics.c(description, StatusKt.STATUS_DESCRIPTION_STARTED) ? R.string.fight_starts_soon_mma : R.string.mma_awaiting_decision_status;
            ((TextView) e92Var.b).setMaxLines(2);
            ((TextView) e92Var.b).setText(getContext().getString(i));
            ((Group) e92Var.c).setVisibility(8);
            return;
        }
        TextView textView = (TextView) e92Var.b;
        TextView textView2 = (TextView) e92Var.f;
        Group group = (Group) e92Var.c;
        textView.setMaxLines(1);
        Context context = getContext();
        Integer finalRound = mmaEvent.getFinalRound();
        textView.setText(context.getString(R.string.mma_status_round_short, Integer.valueOf(finalRound != null ? finalRound.intValue() : 1)));
        if (Intrinsics.c(mmaEvent.getStatus().getType(), StatusKt.STATUS_WILL_CONTINUE)) {
            textView2.setText(getContext().getString(R.string.finished));
            group.setVisibility(0);
            return;
        }
        Time time = mmaEvent.getTime();
        int intValue = (time == null || (periodLength = time.getPeriodLength()) == null) ? 300 : periodLength.intValue();
        if (time == null || (played = time.getPlayed()) == null) {
            num = null;
        } else {
            int intValue2 = ((intValue - played.intValue()) / 60) + 1;
            int i2 = intValue / 60;
            if (intValue2 > i2) {
                intValue2 = i2;
            }
            num = Integer.valueOf(intValue2);
        }
        if (num != null) {
            textView2.setText(getContext().getString(R.string.mma_minutes_left_format, Integer.valueOf(num.intValue())));
            group.setVisibility(0);
        } else {
            Context context2 = getContext();
            Integer finalRound2 = mmaEvent.getFinalRound();
            textView.setText(context2.getString(R.string.mma_status_round, Integer.valueOf(finalRound2 != null ? finalRound2.intValue() : 1)));
            group.setVisibility(8);
        }
    }
}
