package com.vk.auth.internal.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.auth.internal.R$styleable;
import com.vkontakte.android.R;

/* compiled from: VkConnectMigrationItemView.kt */
/* loaded from: classes15.dex */
public final class VkConnectMigrationItemView extends LinearLayout {
    public VkConnectMigrationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.vk_connect_migration_item_layout, this);
        ImageView imageView = (ImageView) findViewById(R.id.vk_connect_migration_item_icon);
        TextView textView = (TextView) findViewById(R.id.vk_connect_migration_item_title);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            imageView.setImageDrawable(drawable);
            textView.setText(string);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
