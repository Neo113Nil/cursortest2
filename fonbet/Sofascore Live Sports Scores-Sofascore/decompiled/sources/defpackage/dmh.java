package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dmh extends n71 {
    public static final int[] E = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager C;
    public boolean D;

    public dmh(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.C = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @Override // defpackage.n71
    public final void a() {
        b(3);
    }

    @Override // defpackage.n71
    public final int d() {
        int i = this.k;
        if (i != -2) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = this.D;
            AccessibilityManager accessibilityManager = this.C;
            if (i2 >= 29) {
                return accessibilityManager.getRecommendedTimeoutMillis(i, (z ? 4 : 0) | 3);
            }
            if (!z || !accessibilityManager.isTouchExplorationEnabled()) {
                return i;
            }
        }
        return -2;
    }

    public final void l(String str, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(str) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.D = false;
        } else {
            this.D = true;
            actionView.setVisibility(0);
            actionView.setText(str);
            actionView.setOnClickListener(new eyd(18, this, onClickListener));
        }
    }
}
