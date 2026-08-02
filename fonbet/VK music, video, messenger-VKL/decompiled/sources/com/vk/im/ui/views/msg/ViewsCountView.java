package com.vk.im.ui.views.msg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.b6f0;
import xsna.bwt0;
import xsna.ipq0;
import xsna.msy;
import xsna.qcy;

/* compiled from: ViewsCountView.kt */
/* loaded from: classes2.dex */
public final class ViewsCountView extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final Object b;
    public final Object c;

    public ViewsCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.im_views_count, (ViewGroup) this, true);
        ipq0 ipq0Var = new ipq0(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, ipq0Var);
        this.c = msy.a(lazyThreadSafetyMode, new b6f0(this, 19));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AppCompatImageView getIconView() {
        return (AppCompatImageView) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.c.getValue();
    }

    public final void setColor(int i) {
        getTextView().setTextColor(i);
        bwt0.o0(getIconView(), i);
    }

    public final void setCount(String str) {
        getTextView().setText(str);
    }

    public final void setTextAppearance(int i) {
        AppCompatTextView textView = getTextView();
        qcy<Object>[] qcyVarArr = bwt0.a;
        textView.setTextAppearance(i);
        bwt0.o0(getIconView(), getTextView().getCurrentTextColor());
    }
}
