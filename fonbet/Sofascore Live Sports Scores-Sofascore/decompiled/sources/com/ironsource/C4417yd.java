package com.ironsource;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w1l;
import defpackage.w2g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.yd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4417yd {

    @NotNull
    public static final a a = new a(null);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.yd$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final View a(Context context) {
            TextView textView = new TextView(context);
            textView.setText(com.mbridge.msdk.setting.i.a);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            return textView;
        }

        private a() {
        }

        @NotNull
        public final View a(@NotNull Context context, @Nullable String str, @NotNull T8 t8) {
            context.getClass();
            t8.getClass();
            if (str == null) {
                return a(context);
            }
            Object a = t8.a(str);
            p2g p2gVar = w2g.b;
            if (a instanceof u2g) {
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

        private static final GradientDrawable a() {
            GradientDrawable b = w1l.b(1);
            b.setColor(Color.parseColor("#000000"));
            return b;
        }
    }
}
