package com.ironsource;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.zd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2780zd {
    public static final a a = new a(null);

    /* renamed from: com.ironsource.zd$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final View a(Context context, String str, T8 imageLoader) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            if (str == null) {
                return a(context);
            }
            Object a = imageLoader.a(str);
            if (Result.m11186isFailureimpl(a)) {
                a = null;
            }
            Drawable drawable = (Drawable) a;
            if (drawable == null) {
                return a(context);
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(drawable);
            return imageView;
        }

        private a() {
        }

        private static final GradientDrawable a() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor("#000000"));
            return gradientDrawable;
        }

        private final View a(Context context) {
            TextView textView = new TextView(context);
            textView.setText("i");
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            return textView;
        }
    }
}
