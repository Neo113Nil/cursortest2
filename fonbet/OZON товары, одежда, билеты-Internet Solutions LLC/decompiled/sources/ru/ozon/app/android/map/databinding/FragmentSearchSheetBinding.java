package ru.ozon.app.android.map.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.map.R$id;
import ru.ozon.app.android.map.R$layout;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class FragmentSearchSheetBinding implements a {

    @NonNull
    public final IconButtonV3View closeIv;

    @NonNull
    public final TextInputEditText fieldEt;

    @NonNull
    public final TextInputLayout fieldTil;

    @NonNull
    public final LoaderView progressBar;

    @NonNull
    public final FrameLayout progressFl;

    @NonNull
    public final ConstraintLayout root;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final VerticalAtomsLayout subtitleVAL;

    @NonNull
    public final RecyclerView suggestionsRv;

    @NonNull
    public final LinearLayout titleFl;

    @NonNull
    public final TextView titleTv;

    private FragmentSearchSheetBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull LoaderView loaderView, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.closeIv = iconButtonV3View;
        this.fieldEt = textInputEditText;
        this.fieldTil = textInputLayout;
        this.progressBar = loaderView;
        this.progressFl = frameLayout;
        this.root = constraintLayout2;
        this.subtitleVAL = verticalAtomsLayout;
        this.suggestionsRv = recyclerView;
        this.titleFl = linearLayout;
        this.titleTv = textView;
    }

    @NonNull
    public static FragmentSearchSheetBinding bind(@NonNull View view) {
        int i11 = R$id.closeIv;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
        if (iconButtonV3View != null) {
            i11 = R$id.fieldEt;
            TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
            if (textInputEditText != null) {
                i11 = R$id.fieldTil;
                TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
                if (textInputLayout != null) {
                    i11 = R$id.progressBar;
                    LoaderView loaderView = (LoaderView) C2548q.d(i11, view);
                    if (loaderView != null) {
                        i11 = R$id.progressFl;
                        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                        if (frameLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.subtitleVAL;
                            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                            if (verticalAtomsLayout != null) {
                                i11 = R$id.suggestionsRv;
                                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                if (recyclerView != null) {
                                    i11 = R$id.titleFl;
                                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                                    if (linearLayout != null) {
                                        i11 = R$id.titleTv;
                                        TextView textView = (TextView) C2548q.d(i11, view);
                                        if (textView != null) {
                                            return new FragmentSearchSheetBinding(constraintLayout, iconButtonV3View, textInputEditText, textInputLayout, loaderView, frameLayout, constraintLayout, verticalAtomsLayout, recyclerView, linearLayout, textView);
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
    public static FragmentSearchSheetBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_search_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
