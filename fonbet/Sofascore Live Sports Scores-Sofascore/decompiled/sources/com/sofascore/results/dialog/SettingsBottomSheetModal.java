package com.sofascore.results.dialog;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.widget.NestedScrollView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.SettingsBottomSheetModal;
import com.sofascore.results.dialog.SettingsItem;
import defpackage.aba;
import defpackage.ed;
import defpackage.eyd;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.yhk;
import defpackage.ypa;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/dialog/SettingsBottomSheetModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SettingsBottomSheetModal extends BaseModalBottomSheetDialog {
    public final mqi A;
    public final mqi B;
    public Function1 C;
    public final boolean D = true;
    public ed w;
    public final mqi x;
    public final mqi y;
    public final mqi z;

    public SettingsBottomSheetModal() {
        final int i = 0;
        this.x = ypa.b(new Function0(this) { // from class: dah
            public final /* synthetic */ SettingsBottomSheetModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i2 = i;
                SettingsBottomSheetModal settingsBottomSheetModal = this.b;
                switch (i2) {
                    case 0:
                        return settingsBottomSheetModal.requireArguments().getString("MODAL_PREFERENCE_KEY");
                    case 1:
                        return settingsBottomSheetModal.requireArguments().getString("MODAL_DEFAULT_VALUE");
                    case 2:
                        return gz8.L(settingsBottomSheetModal.requireArguments(), "MODAL_ITEM_LIST", SettingsItem.class);
                    case 3:
                        String string = settingsBottomSheetModal.requireArguments().getString("MODAL_SELECTED_ITEM");
                        if (string == null) {
                            Context requireContext = settingsBottomSheetModal.requireContext();
                            requireContext.getClass();
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = requireContext.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences = d;
                            }
                            string = sharedPreferences.getString((String) settingsBottomSheetModal.x.getValue(), (String) settingsBottomSheetModal.y.getValue());
                        }
                        List list = (List) settingsBottomSheetModal.z.getValue();
                        Object obj = null;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (Intrinsics.c(((SettingsItem) next).a, string)) {
                                        obj = next;
                                    }
                                }
                            }
                            obj = (SettingsItem) obj;
                        }
                        return obj == null ? (String) settingsBottomSheetModal.y.getValue() : string;
                    default:
                        return LayoutInflater.from(settingsBottomSheetModal.requireContext());
                }
            }
        });
        final int i2 = 1;
        this.y = ypa.b(new Function0(this) { // from class: dah
            public final /* synthetic */ SettingsBottomSheetModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i22 = i2;
                SettingsBottomSheetModal settingsBottomSheetModal = this.b;
                switch (i22) {
                    case 0:
                        return settingsBottomSheetModal.requireArguments().getString("MODAL_PREFERENCE_KEY");
                    case 1:
                        return settingsBottomSheetModal.requireArguments().getString("MODAL_DEFAULT_VALUE");
                    case 2:
                        return gz8.L(settingsBottomSheetModal.requireArguments(), "MODAL_ITEM_LIST", SettingsItem.class);
                    case 3:
                        String string = settingsBottomSheetModal.requireArguments().getString("MODAL_SELECTED_ITEM");
                        if (string == null) {
                            Context requireContext = settingsBottomSheetModal.requireContext();
                            requireContext.getClass();
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = requireContext.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences = d;
                            }
                            string = sharedPreferences.getString((String) settingsBottomSheetModal.x.getValue(), (String) settingsBottomSheetModal.y.getValue());
                        }
                        List list = (List) settingsBottomSheetModal.z.getValue();
                        Object obj = null;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (Intrinsics.c(((SettingsItem) next).a, string)) {
                                        obj = next;
                                    }
                                }
                            }
                            obj = (SettingsItem) obj;
                        }
                        return obj == null ? (String) settingsBottomSheetModal.y.getValue() : string;
                    default:
                        return LayoutInflater.from(settingsBottomSheetModal.requireContext());
                }
            }
        });
        final int i3 = 2;
        this.z = ypa.b(new Function0(this) { // from class: dah
            public final /* synthetic */ SettingsBottomSheetModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i22 = i3;
                SettingsBottomSheetModal settingsBottomSheetModal = this.b;
                switch (i22) {
                    case 0:
                        return settingsBottomSheetModal.requireArguments().getString("MODAL_PREFERENCE_KEY");
                    case 1:
                        return settingsBottomSheetModal.requireArguments().getString("MODAL_DEFAULT_VALUE");
                    case 2:
                        return gz8.L(settingsBottomSheetModal.requireArguments(), "MODAL_ITEM_LIST", SettingsItem.class);
                    case 3:
                        String string = settingsBottomSheetModal.requireArguments().getString("MODAL_SELECTED_ITEM");
                        if (string == null) {
                            Context requireContext = settingsBottomSheetModal.requireContext();
                            requireContext.getClass();
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = requireContext.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences = d;
                            }
                            string = sharedPreferences.getString((String) settingsBottomSheetModal.x.getValue(), (String) settingsBottomSheetModal.y.getValue());
                        }
                        List list = (List) settingsBottomSheetModal.z.getValue();
                        Object obj = null;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (Intrinsics.c(((SettingsItem) next).a, string)) {
                                        obj = next;
                                    }
                                }
                            }
                            obj = (SettingsItem) obj;
                        }
                        return obj == null ? (String) settingsBottomSheetModal.y.getValue() : string;
                    default:
                        return LayoutInflater.from(settingsBottomSheetModal.requireContext());
                }
            }
        });
        final int i4 = 3;
        this.A = ypa.b(new Function0(this) { // from class: dah
            public final /* synthetic */ SettingsBottomSheetModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i22 = i4;
                SettingsBottomSheetModal settingsBottomSheetModal = this.b;
                switch (i22) {
                    case 0:
                        return settingsBottomSheetModal.requireArguments().getString("MODAL_PREFERENCE_KEY");
                    case 1:
                        return settingsBottomSheetModal.requireArguments().getString("MODAL_DEFAULT_VALUE");
                    case 2:
                        return gz8.L(settingsBottomSheetModal.requireArguments(), "MODAL_ITEM_LIST", SettingsItem.class);
                    case 3:
                        String string = settingsBottomSheetModal.requireArguments().getString("MODAL_SELECTED_ITEM");
                        if (string == null) {
                            Context requireContext = settingsBottomSheetModal.requireContext();
                            requireContext.getClass();
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = requireContext.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences = d;
                            }
                            string = sharedPreferences.getString((String) settingsBottomSheetModal.x.getValue(), (String) settingsBottomSheetModal.y.getValue());
                        }
                        List list = (List) settingsBottomSheetModal.z.getValue();
                        Object obj = null;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (Intrinsics.c(((SettingsItem) next).a, string)) {
                                        obj = next;
                                    }
                                }
                            }
                            obj = (SettingsItem) obj;
                        }
                        return obj == null ? (String) settingsBottomSheetModal.y.getValue() : string;
                    default:
                        return LayoutInflater.from(settingsBottomSheetModal.requireContext());
                }
            }
        });
        final int i5 = 4;
        this.B = ypa.b(new Function0(this) { // from class: dah
            public final /* synthetic */ SettingsBottomSheetModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i22 = i5;
                SettingsBottomSheetModal settingsBottomSheetModal = this.b;
                switch (i22) {
                    case 0:
                        return settingsBottomSheetModal.requireArguments().getString("MODAL_PREFERENCE_KEY");
                    case 1:
                        return settingsBottomSheetModal.requireArguments().getString("MODAL_DEFAULT_VALUE");
                    case 2:
                        return gz8.L(settingsBottomSheetModal.requireArguments(), "MODAL_ITEM_LIST", SettingsItem.class);
                    case 3:
                        String string = settingsBottomSheetModal.requireArguments().getString("MODAL_SELECTED_ITEM");
                        if (string == null) {
                            Context requireContext = settingsBottomSheetModal.requireContext();
                            requireContext.getClass();
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = requireContext.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences = d;
                            }
                            string = sharedPreferences.getString((String) settingsBottomSheetModal.x.getValue(), (String) settingsBottomSheetModal.y.getValue());
                        }
                        List list = (List) settingsBottomSheetModal.z.getValue();
                        Object obj = null;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (Intrinsics.c(((SettingsItem) next).a, string)) {
                                        obj = next;
                                    }
                                }
                            }
                            obj = (SettingsItem) obj;
                        }
                        return obj == null ? (String) settingsBottomSheetModal.y.getValue() : string;
                    default:
                        return LayoutInflater.from(settingsBottomSheetModal.requireContext());
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.settings_modal_layout, (ViewGroup) v().l, false);
        RadioGroup radioGroup = (RadioGroup) nq8.B(R.id.radio_group, inflate);
        if (radioGroup == null) {
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.radio_group)));
            return null;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
        this.w = new ed(nestedScrollView, 21, radioGroup);
        nestedScrollView.getClass();
        r(nestedScrollView);
        List<SettingsItem> list = (List) this.z.getValue();
        if (list != null) {
            for (SettingsItem settingsItem : list) {
                View inflate2 = ((LayoutInflater) this.B.getValue()).inflate(R.layout.settings_modal_row, (ViewGroup) null, false);
                if (inflate2 == null) {
                    yhk.s("rootView");
                    return null;
                }
                RadioButton radioButton = (RadioButton) inflate2;
                radioButton.setText(settingsItem.b);
                mqi mqiVar = this.A;
                radioButton.setChecked(((String) mqiVar.getValue()) != null && Intrinsics.c((String) mqiVar.getValue(), settingsItem.a));
                radioButton.setOnClickListener(new eyd(16, this, settingsItem));
                View rootView = radioButton.getRootView();
                rootView.getClass();
                aba.y(rootView, 0, 3);
                ed edVar = this.w;
                if (edVar == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((RadioGroup) edVar.c).addView(radioButton);
            }
        }
        ed edVar2 = this.w;
        if (edVar2 == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        NestedScrollView nestedScrollView2 = (NestedScrollView) edVar2.b;
        nestedScrollView2.getClass();
        return nestedScrollView2;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.C == null) {
            j();
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "SettingsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getD() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return requireArguments().getString("MODAL_TITLE");
    }
}
