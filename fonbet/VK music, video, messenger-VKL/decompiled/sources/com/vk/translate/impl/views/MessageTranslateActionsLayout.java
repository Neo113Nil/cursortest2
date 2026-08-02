package com.vk.translate.impl.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import xsna.ob20;

/* compiled from: MessageTranslateActionsLayout.kt */
/* loaded from: classes6.dex */
public final class MessageTranslateActionsLayout extends LinearLayout {
    public a b;
    public ob20 c;

    /* compiled from: MessageTranslateActionsLayout.kt */
    public interface a {
    }

    public MessageTranslateActionsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
    }

    public final a getListener() {
        return this.b;
    }

    public final void setListener(a aVar) {
        this.b = aVar;
    }
}
