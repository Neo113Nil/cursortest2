package com.sofascore.results.venue.summary.venueinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.o8;
import defpackage.vy1;
import defpackage.yhk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/venue/summary/venueinfo/VenueInfoView;", "Lo8;", "", "getLayoutId", "()I", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VenueInfoView extends o8 {
    public static final /* synthetic */ int g = 0;
    public final vy1 d;
    public final LayoutInflater e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VenueInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        if (root == null) {
            yhk.s("rootView");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) root;
        this.d = new vy1(linearLayout, 5);
        this.e = LayoutInflater.from(context);
        this.f = ao2.s(8, context);
        ao2.s(20, context);
        setVisibility(8);
        linearLayout.setClipToOutline(true);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_card_linear;
    }
}
