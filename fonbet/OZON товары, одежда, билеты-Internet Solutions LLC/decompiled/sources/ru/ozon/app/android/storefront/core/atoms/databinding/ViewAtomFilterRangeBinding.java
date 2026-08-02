package ru.ozon.app.android.storefront.core.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import ru.ozon.app.android.storefront.core.atoms.R$id;

/* loaded from: classes2.dex */
public final class ViewAtomFilterRangeBinding implements a {

    @NonNull
    public final EditText rangeFromEt;

    @NonNull
    public final LinearLayout rangeFromLl;

    @NonNull
    public final TextView rangeFromUnit;

    @NonNull
    public final CrystalRangeSeekbar rangeSeekbar;

    @NonNull
    public final EditText rangeToEt;

    @NonNull
    public final LinearLayout rangeToLl;

    @NonNull
    public final TextView rangeToUnit;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView titleTv;

    private ViewAtomFilterRangeBinding(@NonNull View view, @NonNull EditText editText, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull CrystalRangeSeekbar crystalRangeSeekbar, @NonNull EditText editText2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = view;
        this.rangeFromEt = editText;
        this.rangeFromLl = linearLayout;
        this.rangeFromUnit = textView;
        this.rangeSeekbar = crystalRangeSeekbar;
        this.rangeToEt = editText2;
        this.rangeToLl = linearLayout2;
        this.rangeToUnit = textView2;
        this.titleTv = textView3;
    }

    @NonNull
    public static ViewAtomFilterRangeBinding bind(@NonNull View view) {
        int i11 = R$id.rangeFromEt;
        EditText editText = (EditText) C2548q.d(i11, view);
        if (editText != null) {
            i11 = R$id.rangeFromLl;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                i11 = R$id.rangeFromUnit;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.rangeSeekbar;
                    CrystalRangeSeekbar crystalRangeSeekbar = (CrystalRangeSeekbar) C2548q.d(i11, view);
                    if (crystalRangeSeekbar != null) {
                        i11 = R$id.rangeToEt;
                        EditText editText2 = (EditText) C2548q.d(i11, view);
                        if (editText2 != null) {
                            i11 = R$id.rangeToLl;
                            LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
                            if (linearLayout2 != null) {
                                i11 = R$id.rangeToUnit;
                                TextView textView2 = (TextView) C2548q.d(i11, view);
                                if (textView2 != null) {
                                    i11 = R$id.titleTv;
                                    TextView textView3 = (TextView) C2548q.d(i11, view);
                                    if (textView3 != null) {
                                        return new ViewAtomFilterRangeBinding(view, editText, linearLayout, textView, crystalRangeSeekbar, editText2, linearLayout2, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
