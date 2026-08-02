package com.vk.core.view.text;

import android.content.Context;
import android.util.AttributeSet;
import android.view.textclassifier.TextClassifier;
import com.vk.core.view.components.text.links.a;
import xsna.fd6;
import xsna.s3q0;
import xsna.sjc;

/* compiled from: SquareExcerptTextView.kt */
/* loaded from: classes17.dex */
public final class SquareExcerptTextView extends fd6 {
    public a Q;
    public final sjc R;
    public boolean S;

    public SquareExcerptTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.Q = new sjc(this);
        this.R = new sjc(new fd6.b(this));
    }

    @Override // com.vk.core.view.components.text.links.VkLinkedText
    public a getDelegate() {
        return this.Q;
    }

    public final void n() {
        if (this.S || !this.m) {
            return;
        }
        try {
            setTextClassifier(TextClassifier.NO_OP);
            this.S = true;
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
        if (this.S) {
            return;
        }
        this.S = true;
    }

    @Override // com.vk.core.view.components.text.links.VkLinkedText
    public void setDelegate(a aVar) {
        this.Q = aVar;
    }

    @Override // xsna.fd6
    public sjc getShowMoreLinkDelegate() {
        return this.R;
    }
}
