package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gyb extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ MaterialAutoCompleteTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyb(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = materialAutoCompleteTextView;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.c;
        ColorStateList colorStateList2 = materialAutoCompleteTextView.m;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (materialAutoCompleteTextView.l != 0 && materialAutoCompleteTextView.m != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{o23.h(materialAutoCompleteTextView.m.getColorForState(iArr3, 0), materialAutoCompleteTextView.l), o23.h(materialAutoCompleteTextView.m.getColorForState(iArr2, 0), materialAutoCompleteTextView.l), materialAutoCompleteTextView.l});
        }
        this.a = colorStateList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.c;
            ColorDrawable colorDrawable = null;
            if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.l != 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(materialAutoCompleteTextView.l);
                if (this.b != null) {
                    colorDrawable2.setTintList(this.a);
                    ?? rippleDrawable = new RippleDrawable(this.b, colorDrawable2, null);
                    FocusRingDrawable f = FocusRingDrawable.f(getContext(), rippleDrawable, null);
                    if (f != null) {
                        f.o.x = materialAutoCompleteTextView.g;
                    }
                    colorDrawable = rippleDrawable;
                } else {
                    colorDrawable = colorDrawable2;
                }
            }
            textView.setBackground(colorDrawable);
        }
        return view2;
    }
}
