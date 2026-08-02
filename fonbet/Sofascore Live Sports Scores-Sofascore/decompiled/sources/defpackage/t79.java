package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t79 extends o8 {
    public final z3f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t79(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.team_selector;
        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.team_selector, root);
        if (segmentedButtonsView != null) {
            i = R.id.title;
            TextView textView = (TextView) nq8.B(R.id.title, root);
            if (textView != null) {
                this.d = new z3f(14, textView, (LinearLayout) root, segmentedButtonsView);
                if (isAttachedToWindow()) {
                    sea.v(this, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    return;
                } else {
                    addOnAttachStateChangeListener(new a16(this, 1, this));
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_h2h_header;
    }
}
