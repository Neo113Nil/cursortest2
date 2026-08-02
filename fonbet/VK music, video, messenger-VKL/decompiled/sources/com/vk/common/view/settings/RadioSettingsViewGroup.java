package com.vk.common.view.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import com.vk.common.view.settings.a;
import com.vk.im.ui.views.settings.CheckableLabelSettingsView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RadioSettingsViewGroup.kt */
/* loaded from: classes17.dex */
public final class RadioSettingsViewGroup extends LinearLayout {
    public final ArrayList<com.vk.common.view.settings.a> b;
    public int c;
    public a d;
    public final b e;

    /* compiled from: RadioSettingsViewGroup.kt */
    public interface a {
        void a(int i);
    }

    /* compiled from: RadioSettingsViewGroup.kt */
    public static final class b implements a.InterfaceC0721a {
        public b() {
        }

        @Override // com.vk.common.view.settings.a.InterfaceC0721a
        public final void a(CheckableLabelSettingsView checkableLabelSettingsView, boolean z, boolean z2) {
            if (z) {
                int id = checkableLabelSettingsView.getId();
                RadioSettingsViewGroup radioSettingsViewGroup = RadioSettingsViewGroup.this;
                radioSettingsViewGroup.c = id;
                Iterator<com.vk.common.view.settings.a> it = radioSettingsViewGroup.b.iterator();
                while (it.hasNext()) {
                    com.vk.common.view.settings.a next = it.next();
                    next.setChecked(checkableLabelSettingsView == next);
                }
                a aVar = radioSettingsViewGroup.d;
                if (aVar != null) {
                    aVar.a(radioSettingsViewGroup.c);
                }
            }
        }
    }

    public RadioSettingsViewGroup(Context context) {
        this(context, null, 0, 14, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view instanceof com.vk.common.view.settings.a) {
            ArrayList<com.vk.common.view.settings.a> arrayList = this.b;
            arrayList.add(view);
            ((com.vk.common.view.settings.a) view).setOnCheckedChangeListener(this.e);
            if (((Checkable) view).isChecked()) {
                this.c = view.getId();
                Iterator<com.vk.common.view.settings.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    com.vk.common.view.settings.a next = it.next();
                    next.setChecked(view == next);
                }
            }
        }
    }

    public final int getCheckedId() {
        return this.c;
    }

    public final void setOnCheckedChangeListener(a aVar) {
        this.d = aVar;
    }

    public RadioSettingsViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public RadioSettingsViewGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ RadioSettingsViewGroup(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public RadioSettingsViewGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new ArrayList<>();
        this.c = -1;
        this.e = new b();
    }
}
