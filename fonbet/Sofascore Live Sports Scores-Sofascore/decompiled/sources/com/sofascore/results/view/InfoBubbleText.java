package com.sofascore.results.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import defpackage.t2a;
import defpackage.ujf;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/view/InfoBubbleText;", "Lt2a;", "", "text", "", "setInfoText", "(Ljava/lang/String;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoBubbleText extends t2a {
    public final TextView e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InfoBubbleText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ujf.k, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(4);
            string = string == null ? "" : string;
            obtainStyledAttributes.recycle();
            TextView textView = new TextView(context);
            textView.setTextAppearance(R.style.BodyMedium);
            textView.setText(string);
            textView.setTextAlignment(4);
            textView.setTextColor(textView.getContext().getColor(R.color.surface_1));
            this.e = textView;
            getBinding().b.addView(textView);
            Unit unit = Unit.a;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            textView.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setInfoText(@NotNull String text) {
        text.getClass();
        this.e.setText(text);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoBubbleText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
