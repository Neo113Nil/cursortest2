package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ib9 extends h6b {
    public final t22 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib9(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        LinearLayout linearLayout = (LinearLayout) root;
        int i = R.id.info_text;
        TextView textView = (TextView) nq8.B(R.id.info_text, root);
        if (textView != null) {
            i = R.id.title;
            TextView textView2 = (TextView) nq8.B(R.id.title, root);
            if (textView2 != null) {
                this.d = new t22(linearLayout, textView, textView2, 4);
                setVisibility(8);
                sea.v(getRoot(), true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.historical_data_card;
    }
}
