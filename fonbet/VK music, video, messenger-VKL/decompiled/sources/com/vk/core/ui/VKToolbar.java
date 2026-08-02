package com.vk.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.mup0;
import xsna.xvc0;

/* compiled from: VKToolbar.kt */
/* loaded from: classes17.dex */
public final class VKToolbar extends Toolbar {
    public static final /* synthetic */ int W = 0;
    public final bpn0 V;

    public VKToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final mup0 getTypefacesHacks() {
        return (mup0) this.V.getValue();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void s(int i, Context context) {
        try {
            super.s(i, context);
        } catch (Throwable th) {
            getTypefacesHacks().getClass();
            if (!mup0.a(th)) {
                throw th;
            }
            getTypefacesHacks().getClass();
            mup0.b();
            super.s(i, context);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        try {
            super.setSubtitle(charSequence);
        } catch (Throwable th) {
            getTypefacesHacks().getClass();
            if (!mup0.a(th)) {
                throw th;
            }
            getTypefacesHacks().getClass();
            mup0.b();
            super.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        try {
            super.setTitle(charSequence);
        } catch (Throwable th) {
            getTypefacesHacks().getClass();
            if (!mup0.a(th)) {
                throw th;
            }
            getTypefacesHacks().getClass();
            mup0.b();
            super.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void t(int i, Context context) {
        try {
            super.t(i, context);
        } catch (Throwable th) {
            getTypefacesHacks().getClass();
            if (!mup0.a(th)) {
                throw th;
            }
            getTypefacesHacks().getClass();
            mup0.b();
            super.t(i, context);
        }
    }

    public VKToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.V = new bpn0(new xvc0(6));
    }
}
