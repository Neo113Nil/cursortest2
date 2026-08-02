package ru.ozon.app.android.debugmenu.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.switchmaterial.SwitchMaterial;
import ru.ozon.app.android.debugmenu.R$id;
import ru.ozon.app.android.debugmenu.R$layout;

/* loaded from: classes11.dex */
public final class ActivityDebugWidgetsBinding implements a {

    @NonNull
    public final EditText alphaEt;

    @NonNull
    public final TextView alphaLabel;

    @NonNull
    public final EditText borderColorEt;

    @NonNull
    public final TextView borderColorLabel;

    @NonNull
    public final SwitchMaterial borderSw;

    @NonNull
    public final EditText bubbleColorEt;

    @NonNull
    public final TextView bubbleColorLabel;

    @NonNull
    public final EditText fontColorEt;

    @NonNull
    public final TextView fontColorLabel;

    @NonNull
    public final EditText fontSizeEt;

    @NonNull
    public final TextView fontSizeLabel;

    @NonNull
    public final SwitchMaterial globalSw;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private ActivityDebugWidgetsBinding(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull TextView textView, @NonNull EditText editText2, @NonNull TextView textView2, @NonNull SwitchMaterial switchMaterial, @NonNull EditText editText3, @NonNull TextView textView3, @NonNull EditText editText4, @NonNull TextView textView4, @NonNull EditText editText5, @NonNull TextView textView5, @NonNull SwitchMaterial switchMaterial2, @NonNull TextView textView6) {
        this.rootView = linearLayout;
        this.alphaEt = editText;
        this.alphaLabel = textView;
        this.borderColorEt = editText2;
        this.borderColorLabel = textView2;
        this.borderSw = switchMaterial;
        this.bubbleColorEt = editText3;
        this.bubbleColorLabel = textView3;
        this.fontColorEt = editText4;
        this.fontColorLabel = textView4;
        this.fontSizeEt = editText5;
        this.fontSizeLabel = textView5;
        this.globalSw = switchMaterial2;
        this.titleTv = textView6;
    }

    @NonNull
    public static ActivityDebugWidgetsBinding bind(@NonNull View view) {
        int i11 = R$id.alphaEt;
        EditText editText = (EditText) C2548q.d(i11, view);
        if (editText != null) {
            i11 = R$id.alphaLabel;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.borderColorEt;
                EditText editText2 = (EditText) C2548q.d(i11, view);
                if (editText2 != null) {
                    i11 = R$id.borderColorLabel;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        i11 = R$id.borderSw;
                        SwitchMaterial switchMaterial = (SwitchMaterial) C2548q.d(i11, view);
                        if (switchMaterial != null) {
                            i11 = R$id.bubbleColorEt;
                            EditText editText3 = (EditText) C2548q.d(i11, view);
                            if (editText3 != null) {
                                i11 = R$id.bubbleColorLabel;
                                TextView textView3 = (TextView) C2548q.d(i11, view);
                                if (textView3 != null) {
                                    i11 = R$id.fontColorEt;
                                    EditText editText4 = (EditText) C2548q.d(i11, view);
                                    if (editText4 != null) {
                                        i11 = R$id.fontColorLabel;
                                        TextView textView4 = (TextView) C2548q.d(i11, view);
                                        if (textView4 != null) {
                                            i11 = R$id.fontSizeEt;
                                            EditText editText5 = (EditText) C2548q.d(i11, view);
                                            if (editText5 != null) {
                                                i11 = R$id.fontSizeLabel;
                                                TextView textView5 = (TextView) C2548q.d(i11, view);
                                                if (textView5 != null) {
                                                    i11 = R$id.globalSw;
                                                    SwitchMaterial switchMaterial2 = (SwitchMaterial) C2548q.d(i11, view);
                                                    if (switchMaterial2 != null) {
                                                        i11 = R$id.titleTv;
                                                        TextView textView6 = (TextView) C2548q.d(i11, view);
                                                        if (textView6 != null) {
                                                            return new ActivityDebugWidgetsBinding((LinearLayout) view, editText, textView, editText2, textView2, switchMaterial, editText3, textView3, editText4, textView4, editText5, textView5, switchMaterial2, textView6);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    @NonNull
    public static ActivityDebugWidgetsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityDebugWidgetsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.activity_debug_widgets, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
