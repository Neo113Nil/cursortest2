package com.vk.clips.design.view.component.video.preview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.clips.design.view.component.video.preview.ClipRectanglePreview;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cut0;
import xsna.dko;
import xsna.gko;
import xsna.gzs;
import xsna.iah0;
import xsna.jjc;
import xsna.pbd;
import xsna.s3q0;
import xsna.tlo0;

/* compiled from: ClipRectanglePreview.kt */
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: ClipRectanglePreview.kt */
    /* renamed from: com.vk.clips.design.view.component.video.preview.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0575a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipRectanglePreview.PreviewItem.Icon.Mode.values().length];
            try {
                iArr[ClipRectanglePreview.PreviewItem.Icon.Mode.ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipRectanglePreview.PreviewItem.Icon.Mode.ICON_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipRectanglePreview.PreviewItem.Icon.Mode.ICON_BIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(ClipRectanglePreview.PreviewItem.Icon icon, ImageView imageView) {
        Pair pair;
        Context context = imageView.getContext();
        imageView.setImageDrawable(gko.b(icon.a.a, context));
        gzs<s3q0> gzsVar = icon.f;
        jjc.f(gzsVar != null ? new pbd(0, gzsVar) : null, imageView);
        imageView.setClickable(gzsVar != null);
        imageView.setFocusable(gzsVar != null);
        imageView.setImportantForAccessibility(gzsVar != null ? 1 : 2);
        cut0 cut0Var = icon.c;
        if (cut0Var != null) {
            imageView.setColorFilter(cut0Var.b(context));
        }
        ImageView.ScaleType scaleType = icon.b;
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        imageView.setScaleType(scaleType);
        tlo0 tlo0Var = icon.d;
        imageView.setContentDescription(tlo0Var != null ? tlo0Var.a(context) : null);
        int i = C0575a.$EnumSwitchMapping$0[icon.e.ordinal()];
        if (i == 1) {
            pair = new Pair(Integer.valueOf(iah0.a(16)), Integer.valueOf(iah0.a(4)));
        } else if (i == 2) {
            pair = new Pair(Integer.valueOf(iah0.a(36)), Integer.valueOf(iah0.a(0)));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(Integer.valueOf(iah0.a(24)), Integer.valueOf(iah0.a(4)));
        }
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(0, 0);
        }
        marginLayoutParams.width = intValue;
        marginLayoutParams.height = intValue;
        marginLayoutParams.setMargins(intValue2, intValue2, intValue2, intValue2);
        marginLayoutParams.setMarginEnd(intValue2);
        marginLayoutParams.setMarginStart(intValue2);
        imageView.setLayoutParams(marginLayoutParams);
    }

    public static final void b(ClipRectanglePreview.PreviewItem.b bVar, TextView textView) {
        Context context = textView.getContext();
        textView.setMaxLines(bVar.b);
        tlo0.h hVar = bVar.a;
        hVar.getClass();
        textView.setText(tlo0.b.a(hVar, context));
        jjc.f(null, textView);
        textView.setClickable(false);
        cut0 cut0Var = bVar.c;
        if (cut0Var != null) {
            textView.setTextColor(cut0Var.b(context));
        }
        dko dkoVar = bVar.d;
        Drawable a = dkoVar != null ? dkoVar.a(context) : null;
        cut0 cut0Var2 = bVar.e;
        ColorStateList c = cut0Var2 != null ? cut0Var2.c(context) : null;
        if (c != null) {
            if (a != null) {
                a = a.mutate();
                a.setTintList(c);
            } else {
                a = null;
            }
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setBackground(null);
        textView.setContentDescription(null);
    }
}
