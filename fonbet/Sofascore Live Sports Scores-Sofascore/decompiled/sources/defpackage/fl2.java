package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fl2 extends gl2 {
    public final gh5 b;
    public final Drawable c;
    public final /* synthetic */ il2 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fl2(il2 il2Var, gh5 gh5Var) {
        super(r2);
        this.d = il2Var;
        LinearLayout linearLayout = gh5Var.b;
        linearLayout.getClass();
        this.b = gh5Var;
        Drawable foreground = linearLayout.getForeground();
        LayerDrawable layerDrawable = foreground instanceof LayerDrawable ? (LayerDrawable) foreground : null;
        this.c = layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.id.layer_divider) : null;
    }

    @Override // defpackage.gl2
    public final void a(PickerItem pickerItem) {
        pickerItem.getClass();
        PickerItem.Category category = (PickerItem.Category) pickerItem;
        gh5 gh5Var = this.b;
        TextView textView = gh5Var.d;
        textView.setCompoundDrawables(null, null, null, null);
        LinearLayout linearLayout = gh5Var.b;
        textView.setText(linearLayout.getContext().getString(category.a.b));
        Drawable drawable = this.c;
        if (drawable != null) {
            v9g.L(drawable, !category.c);
        }
        linearLayout.setOnClickListener(new qh(10, pickerItem, this, this.d));
        gh5Var.c.setRotation(category.c ? -180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
