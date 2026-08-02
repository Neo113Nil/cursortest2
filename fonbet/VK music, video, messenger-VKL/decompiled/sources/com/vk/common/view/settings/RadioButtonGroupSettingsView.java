package com.vk.common.view.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import com.vk.common.view.settings.RadioButtonSettingsView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RadioButtonGroupSettingsView.kt */
/* loaded from: classes17.dex */
public final class RadioButtonGroupSettingsView extends LinearLayout {
    public final ArrayList<RadioButtonSettingsView> b;
    public int c;
    public a d;
    public final b e;

    /* compiled from: RadioButtonGroupSettingsView.kt */
    public interface a {
        void a(int i);
    }

    /* compiled from: RadioButtonGroupSettingsView.kt */
    public static final class b implements RadioButtonSettingsView.b {
        public b() {
        }

        @Override // com.vk.common.view.settings.RadioButtonSettingsView.b
        public final void a(RadioButtonSettingsView radioButtonSettingsView, boolean z, boolean z2) {
            if (z) {
                int id = radioButtonSettingsView.getId();
                RadioButtonGroupSettingsView radioButtonGroupSettingsView = RadioButtonGroupSettingsView.this;
                radioButtonGroupSettingsView.c = id;
                Iterator<RadioButtonSettingsView> it = radioButtonGroupSettingsView.b.iterator();
                while (it.hasNext()) {
                    RadioButtonSettingsView next = it.next();
                    if (!radioButtonSettingsView.equals(next)) {
                        next.setChecked(false);
                    }
                }
                a aVar = radioButtonGroupSettingsView.d;
                if (aVar != null) {
                    aVar.a(radioButtonSettingsView.getId());
                }
            }
        }
    }

    public RadioButtonGroupSettingsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view instanceof RadioButtonSettingsView) {
            ArrayList<RadioButtonSettingsView> arrayList = this.b;
            arrayList.add(view);
            RadioButtonSettingsView radioButtonSettingsView = (RadioButtonSettingsView) view;
            radioButtonSettingsView.setOnCheckedChangeListener(this.e);
            if (((Checkable) view).isChecked()) {
                this.c = radioButtonSettingsView.getId();
                Iterator<RadioButtonSettingsView> it = arrayList.iterator();
                while (it.hasNext()) {
                    radioButtonSettingsView.setChecked(radioButtonSettingsView == it.next());
                }
            }
        }
    }

    public final int getCheckedId() {
        return this.c;
    }

    public final RadioButtonSettingsView getCheckedView() {
        Object obj;
        Iterator<T> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((RadioButtonSettingsView) obj).b.isChecked()) {
                break;
            }
        }
        return (RadioButtonSettingsView) obj;
    }

    public final void setOnCheckedChangeListener(a aVar) {
        this.d = aVar;
    }

    public RadioButtonGroupSettingsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public RadioButtonGroupSettingsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ RadioButtonGroupSettingsView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public RadioButtonGroupSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new ArrayList<>();
        this.c = -1;
        this.e = new b();
    }
}
