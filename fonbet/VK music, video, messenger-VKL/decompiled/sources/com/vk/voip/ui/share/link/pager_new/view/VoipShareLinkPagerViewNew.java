package com.vk.voip.ui.share.link.pager_new.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.voip.ui.share.link.pager.view.c;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import xsna.gko;
import xsna.mz80;
import xsna.x7g;

/* compiled from: VoipShareLinkPagerViewNew.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes7.dex */
public final class VoipShareLinkPagerViewNew extends ConstraintLayout {
    public final VkTextArea t;
    public final View u;
    public String v;
    public c w;
    public final b x;

    public VoipShareLinkPagerViewNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.x = new b();
        View.inflate(context, R.layout.voip_share_link_pager_view_new, this);
        VkTextArea vkTextArea = (VkTextArea) findViewById(R.id.input_select);
        vkTextArea.setGravity(16);
        gko.b bVar = gko.Companion;
        vkTextArea.setAfter(new VkTextArea.a.C0838a(new gko(R.drawable.vk_icon_copy_24), new mz80(24, context, this), new x7g(R.attr.vk_ui_icon_secondary), context.getString(R.string.copy_link)));
        EditText editText = vkTextArea.getEditText();
        editText.setFocusable(false);
        editText.setCursorVisible(false);
        this.t = vkTextArea;
        this.u = findViewById(R.id.share_link_pager_progress_bar);
    }

    public final String getCurrentLinkText() {
        return this.v;
    }

    public final c getCurrentLinkType() {
        return this.w;
    }

    public final void setCurrentLinkText(String str) {
        this.v = str;
    }
}
