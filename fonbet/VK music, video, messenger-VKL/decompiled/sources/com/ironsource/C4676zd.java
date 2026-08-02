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
import xsna.ful0;
import xsna.zcl;

/* renamed from: com.ironsource.zd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4676zd {
    public static final a a = new a(null);

    /* renamed from: com.ironsource.zd$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private static final GradientDrawable a() {
            GradientDrawable a = ful0.a(1);
            a.setColor(Color.parseColor("#000000"));
            return a;
        }

        private a() {
        }

        public final View a(Context context, String str, U8 u8) {
            if (str == null) {
                return a(context);
            }
            Object a = u8.a(str);
            if (a instanceof Result.Failure) {
                a = null;
            }
            Drawable drawable = (Drawable) a;
            if (drawable != null) {
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(drawable);
                return imageView;
            }
            return a(context);
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
