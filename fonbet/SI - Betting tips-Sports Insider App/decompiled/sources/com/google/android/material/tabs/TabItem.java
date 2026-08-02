package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.c4;
import com.google.android.material.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c4 e7 = c4.e(context, attributeSet, R.styleable.TabItem);
        int i5 = R.styleable.TabItem_android_text;
        TypedArray typedArray = e7.f722b;
        this.text = typedArray.getText(i5);
        this.icon = e7.b(R.styleable.TabItem_android_icon);
        this.customLayout = typedArray.getResourceId(R.styleable.TabItem_android_layout, 0);
        e7.g();
    }
}
