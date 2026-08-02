package com.vk.voip.ui.debug.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import xsna.asu0;
import xsna.f3m;
import xsna.t9e;
import xsna.ubq;

/* compiled from: HeadersViewBoundsDebugView.kt */
/* loaded from: classes7.dex */
public final class HeadersViewBoundsDebugView extends View {
    public static final /* synthetic */ int c = 0;
    public c b;

    public HeadersViewBoundsDebugView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBackgroundResource(R.drawable.voip_control_bounds_debug_view_background);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void setDesignControlBounds(f3m f3mVar) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.dispose();
        }
        this.b = f3mVar.a().a0(asu0.a.d()).subscribe(new ubq(new t9e(this, 25), 7));
    }
}
