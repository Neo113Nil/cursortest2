package com.sofascore.results.chat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.duf;
import defpackage.ed;
import defpackage.le6;
import defpackage.ms2;
import defpackage.nq8;
import defpackage.ns2;
import defpackage.otk;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/chat/fragment/ExcludeLanguageDialog;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExcludeLanguageDialog extends BaseModalBottomSheetDialog implements CompoundButton.OnCheckedChangeListener {
    public ed x;
    public final otk w = new otk(duf.a.getOrCreateKotlinClass(ms2.class), new le6(this, 0), new le6(this, 2), new le6(this, 1));
    public final ArrayList y = ns2.d;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_chat_add_language, (ViewGroup) v().l, false);
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.list, inflate);
        if (linearLayout == null) {
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.list)));
            return null;
        }
        this.x = new ed((NestedScrollView) inflate, 7, linearLayout);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            LayoutInflater layoutInflater2 = getLayoutInflater();
            ed edVar = this.x;
            if (edVar == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            LinearLayout linearLayout2 = (LinearLayout) edVar.c;
            View inflate2 = layoutInflater2.inflate(R.layout.item_translate_checkbox, (ViewGroup) linearLayout2, false);
            linearLayout2.addView(inflate2);
            if (inflate2 == null) {
                yhk.s("rootView");
                return null;
            }
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) inflate2;
            materialCheckBox.setId(View.generateViewId());
            materialCheckBox.setText(locale.getDisplayName());
            materialCheckBox.setOnCheckedChangeListener(this);
            ms2 ms2Var = (ms2) this.w.getValue();
            String language = locale.getLanguage();
            language.getClass();
            materialCheckBox.setChecked(ms2Var.f.contains(language));
        }
        ed edVar2 = this.x;
        if (edVar2 == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) edVar2.b;
        nestedScrollView.getClass();
        return nestedScrollView;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public final void j() {
        super.j();
        ((ms2) this.w.getValue()).k();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        ed edVar = this.x;
        if (edVar == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        int indexOfChild = ((LinearLayout) edVar.c).indexOfChild(compoundButton);
        ArrayList arrayList = this.y;
        otk otkVar = this.w;
        if (z) {
            ms2 ms2Var = (ms2) otkVar.getValue();
            String language = ((Locale) arrayList.get(indexOfChild)).getLanguage();
            language.getClass();
            Set set = ms2Var.f;
            set.add(language);
            ms2Var.g.j(set);
            return;
        }
        ms2 ms2Var2 = (ms2) otkVar.getValue();
        String language2 = ((Locale) arrayList.get(indexOfChild)).getLanguage();
        language2.getClass();
        Set set2 = ms2Var2.f;
        set2.remove(language2);
        ms2Var2.g.j(set2);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ed edVar = this.x;
        if (edVar == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) edVar.b;
        nestedScrollView.getClass();
        r(nestedScrollView);
        Object parent = view.getParent();
        parent.getClass();
        BottomSheetBehavior.C((View) parent).M(3);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ExcludeLanguageModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.add_language);
        string.getClass();
        return string;
    }
}
