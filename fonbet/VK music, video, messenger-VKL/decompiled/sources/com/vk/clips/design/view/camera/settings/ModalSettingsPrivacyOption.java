package com.vk.clips.design.view.camera.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.camera.drawing.R$styleable;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.oq;
import xsna.tlo0;
import xsna.tq;

/* compiled from: ModalSettingsPrivacyOption.kt */
/* loaded from: classes16.dex */
public final class ModalSettingsPrivacyOption extends FrameLayout {
    public final VkCell b;
    public tlo0 c;
    public boolean d;

    public ModalSettingsPrivacyOption(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a() {
        VkCell.Middle.b a = VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(this.c, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14);
        VkCell vkCell = this.b;
        vkCell.setMiddle(a);
        vkCell.setRight(this.d ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.a(6, null, true), null, 27) : null);
    }

    public final void setCheckVisible(boolean z) {
        this.d = z;
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
    }

    public final void setTitle(int i) {
        this.c = tq.h(tlo0.Companion, i);
        a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModalSettingsPrivacyOption(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        AttributeSet attributeSet2 = null;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        VkCell vkCell = new VkCell(context, attributeSet2, 6, 0);
        vkCell.setId(R.id.privacy_option_cell_id);
        this.b = vkCell;
        this.c = oq.d(tlo0.Companion, "");
        addView(vkCell);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        String string = obtainStyledAttributes.getString(0);
        if (string != null) {
            setTitle(string);
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public final void setTitle(String str) {
        this.c = oq.d(tlo0.Companion, str);
        a();
    }
}
