package com.vk.libvideo.live.impl.views.write;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: classes3.dex */
public class EditTextAnchor extends AppCompatEditText {
    public EditTextAnchor(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        return false;
    }
}
