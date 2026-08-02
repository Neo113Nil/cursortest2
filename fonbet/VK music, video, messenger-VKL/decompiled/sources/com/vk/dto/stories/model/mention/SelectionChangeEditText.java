package com.vk.dto.stories.model.mention;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;

/* compiled from: SelectionChangeEditText.kt */
/* loaded from: classes18.dex */
public class SelectionChangeEditText extends AppCompatEditText {
    public a b;

    /* compiled from: SelectionChangeEditText.kt */
    public interface a {
        void b(int i, int i2);
    }

    public SelectionChangeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        a aVar = this.b;
        if (aVar != null) {
            aVar.b(i, i2);
        }
    }

    public final void setSelectionChangeListener(a aVar) {
        this.b = aVar;
    }
}
