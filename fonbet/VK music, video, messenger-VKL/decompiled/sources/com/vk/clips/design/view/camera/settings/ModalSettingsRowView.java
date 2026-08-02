package com.vk.clips.design.view.camera.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.camera.drawing.R$styleable;
import com.vk.core.view.components.cell.VkCell;
import xsna.gzs;
import xsna.oq;
import xsna.tlo0;

/* compiled from: ModalSettingsRowView.kt */
/* loaded from: classes16.dex */
public final class ModalSettingsRowView extends FrameLayout {
    public final VkCell b;
    public String c;
    public String d;

    public ModalSettingsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        VkCell vkCell = new VkCell(context, null, 6, 0);
        this.b = vkCell;
        this.c = "";
        this.d = "";
        addView(vkCell);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        String string = obtainStyledAttributes.getString(1);
        if (string != null) {
            setTitle(string);
        }
        String string2 = obtainStyledAttributes.getString(0);
        if (string2 != null) {
            setHint(string2);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Object[] objArr = 0 == true ? 1 : 0;
        this.b.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, this.c), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.h(this.d), (gzs) null, 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
    }

    public final String getHint() {
        return this.d;
    }

    public final String getTitle() {
        return this.c;
    }

    public final void setHint(String str) {
        this.d = str;
        a();
    }

    public final void setTitle(String str) {
        this.c = str;
        a();
    }
}
