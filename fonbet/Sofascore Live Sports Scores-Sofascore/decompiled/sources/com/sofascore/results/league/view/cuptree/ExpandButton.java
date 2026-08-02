package com.sofascore.results.league.view.cuptree;

import android.content.Context;
import android.util.AttributeSet;
import com.sofascore.results.R;
import defpackage.bc0;
import defpackage.cd5;
import defpackage.eq3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/sofascore/results/league/view/cuptree/ExpandButton;", "Lbc0;", "", "selected", "", "setSelected", "(Z)V", "Lkotlin/Function1;", "d", "Lkotlin/jvm/functions/Function1;", "getOnExpand", "()Lkotlin/jvm/functions/Function1;", "setOnExpand", "(Lkotlin/jvm/functions/Function1;)V", "onExpand", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExpandButton extends bc0 {
    public static final /* synthetic */ int e = 0;

    /* renamed from: d, reason: from kotlin metadata */
    public Function1 onExpand;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        setImageResource(R.drawable.ic_open_in_full);
        setImageTintList(eq3.q(R.color.color_selector_n_lv_1_to_primary, context));
        setBackground(context.getDrawable(R.drawable.tab_secondary_background_selector));
        setOnClickListener(new cd5(this, 6));
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnExpand() {
        return this.onExpand;
    }

    public final void setOnExpand(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onExpand = function1;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        setImageResource(selected ? R.drawable.ic_close_in_full : R.drawable.ic_open_in_full);
    }
}
