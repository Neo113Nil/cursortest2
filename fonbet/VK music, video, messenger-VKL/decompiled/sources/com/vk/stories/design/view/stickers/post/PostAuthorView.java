package com.vk.stories.design.view.stickers.post;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.baf0;
import xsna.cn70;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.ho8;
import xsna.ms9;
import xsna.u75;
import xsna.vu5;

/* compiled from: PostAuthorView.kt */
/* loaded from: classes6.dex */
public final class PostAuthorView extends ViewGroup {
    public final int b;
    public final int c;
    public final int d;
    public final ImageView e;
    public final TextView f;
    public List<u75> g;
    public b h;
    public a i;
    public final com.vk.typography.a j;
    public final int k;
    public final int l;

    /* compiled from: PostAuthorView.kt */
    public static abstract class a {

        /* compiled from: PostAuthorView.kt */
        /* renamed from: com.vk.stories.design.view.stickers.post.PostAuthorView$a$a, reason: collision with other inner class name */
        public static final class C1831a extends a {
            public final List<u75> a;

            public C1831a(List<u75> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1831a) && epx.f(this.a, ((C1831a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Full(authors="), this.a);
            }
        }

        /* compiled from: PostAuthorView.kt */
        public static final class b extends a {
            public final u75 a;
            public final int b;

            public b(u75 u75Var, int i) {
                this.a = u75Var;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Summary(author=");
                sb.append(this.a);
                sb.append(", count=");
                return vu5.b(sb, this.b, ')');
            }
        }
    }

    /* compiled from: PostAuthorView.kt */
    public static final class b {
        public final baf0 a;
        public final String b;

        public b(baf0 baf0Var, String str) {
            this.a = baf0Var;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RepostData(icon=");
            sb.append(this.a);
            sb.append(", type=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public PostAuthorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float f;
        int b2 = cn70.b(12);
        this.b = b2;
        int b3 = cn70.b(4);
        this.c = b3;
        this.d = b2 + b3;
        EmptyList emptyList = EmptyList.b;
        this.g = emptyList;
        this.i = new a.C1831a(emptyList);
        FontFamily fontFamily = FontFamily.REGULAR;
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
        if (i == 1) {
            f = 12.0f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(12.0f);
        }
        Font.Companion.getClass();
        Font a2 = Font.a.a(fontFamily, f);
        com.vk.typography.a aVar = new com.vk.typography.a(a2.k(context), 12.0f, textSizeUnit, a2.j());
        this.j = aVar;
        int f2 = e3m.f(R.attr.vk_ui_text_primary, context);
        this.k = f2;
        int color = context.getColor(R.color.vk_black_alpha35);
        this.l = color;
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(b2, b2));
        addView(imageView);
        this.e = imageView;
        TextView textView = new TextView(context);
        com.vk.typography.b.h(textView, aVar, 0);
        textView.setTextColor(f2);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f4m.l(b3, 0, textView);
        textView.setShadowLayer(4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, color);
        addView(textView);
        this.f = textView;
    }

    private final TextView getMeasureTextView() {
        TextView textView = new TextView(getContext());
        com.vk.typography.b.h(textView, this.j, 0);
        return textView;
    }

    public final void a(u75 u75Var) {
        String str = u75Var.a;
        Drawable drawable = u75Var.b;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(str);
        textView.setTextColor(this.k);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        com.vk.typography.b.h(textView, this.j, 0);
        textView.setShadowLayer(4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, this.l);
        linearLayout.addView(textView);
        if (drawable != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(this.d, this.b));
            f4m.l(this.c, 0, imageView);
            imageView.setImageDrawable(drawable);
            linearLayout.addView(imageView);
        }
        addView(linearLayout);
    }

    public final int b(u75 u75Var) {
        return ((int) getMeasureTextView().getPaint().measureText(u75Var.a)) + (u75Var.b != null ? this.d : 0);
    }

    public final int c(int i) {
        return (int) getMeasureTextView().getPaint().measureText(" " + getContext().getResources().getQuantityString(R.plurals.and_more_n_coauthors_plural, i, Integer.valueOf(i)));
    }

    public final void d(int i) {
        Drawable drawable = getContext().getDrawable(R.drawable.vk_icon_arrow_uturn_right_12);
        this.h = new b(new baf0(drawable, this.k), getContext().getString(i, ""));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
        b bVar = this.h;
        TextView textView = this.f;
        ImageView imageView = this.e;
        if (bVar != null) {
            imageView.layout(paddingLeft, paddingTop - (imageView.getMeasuredHeight() / 2), imageView.getMeasuredWidth() + paddingLeft, (imageView.getMeasuredHeight() / 2) + paddingTop);
            int measuredWidth = imageView.getMeasuredWidth() + paddingLeft;
            textView.layout(measuredWidth, paddingTop - (textView.getMeasuredHeight() / 2), textView.getMeasuredWidth() + measuredWidth, (textView.getMeasuredHeight() / 2) + paddingTop);
            paddingLeft = textView.getMeasuredWidth() + measuredWidth;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (!epx.f(childAt, imageView) && !epx.f(childAt, textView)) {
                childAt.layout(paddingLeft, paddingTop - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + paddingTop);
                paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        a c1831a;
        a c1831a2;
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        b bVar = this.h;
        TextView textView = this.f;
        ImageView imageView = this.e;
        if (bVar != null) {
            imageView.setImageDrawable(bVar.a);
            b bVar2 = this.h;
            textView.setText(bVar2 != null ? bVar2.b : null);
            measureChild(imageView, 0, 0);
            measureChild(textView, 0, 0);
            i3 = textView.getMeasuredWidth() + imageView.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        int i4 = size - i3;
        int size2 = this.g.size();
        int i5 = this.d;
        if (size2 == 1) {
            u75 u75Var = this.g.get(0);
            if (b(u75Var) <= i4) {
                c1831a2 = new a.C1831a(Collections.singletonList(u75Var));
            } else {
                String str = u75Var.a;
                TextPaint paint = getMeasureTextView().getPaint();
                if (u75Var.b == null) {
                    i5 = 0;
                }
                c1831a = new a.C1831a(Collections.singletonList(u75.a(u75Var, TextUtils.ellipsize(str, paint, i4 - i5, TextUtils.TruncateAt.END).toString())));
                c1831a2 = c1831a;
            }
        } else if (size2 != 2) {
            u75 u75Var2 = this.g.get(0);
            int c = i4 - c(this.g.size() - 1);
            if (b(u75Var2) <= c) {
                c1831a2 = new a.b(u75Var2, this.g.size() - 1);
            } else {
                float f = c;
                if (u75Var2.b == null) {
                    i5 = 0;
                }
                c1831a2 = new a.b(u75.a(u75Var2, TextUtils.ellipsize(u75Var2.a, getMeasureTextView().getPaint(), f - i5, TextUtils.TruncateAt.END).toString()), this.g.size() - 1);
            }
        } else {
            u75 u75Var3 = this.g.get(0);
            u75 a2 = u75.a(this.g.get(1), " " + getContext().getString(R.string.and_coauthor, this.g.get(1).a));
            int b2 = b(u75Var3);
            if (b(a2) + b2 <= i4) {
                c1831a2 = new a.C1831a(e43.l(u75Var3, a2));
            } else {
                int c2 = i4 - c(1);
                if (b2 <= c2) {
                    c1831a2 = new a.b(u75Var3, 1);
                } else {
                    float f2 = c2;
                    if (u75Var3.b == null) {
                        i5 = 0;
                    }
                    c1831a = new a.b(u75.a(u75Var3, TextUtils.ellipsize(u75Var3.a, getMeasureTextView().getPaint(), f2 - i5, TextUtils.TruncateAt.END).toString()), 1);
                    c1831a2 = c1831a;
                }
            }
        }
        this.i = c1831a2;
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = getChildAt(childCount);
            if (!epx.f(childAt, imageView) && !epx.f(childAt, textView)) {
                removeViewAt(childCount);
            }
        }
        a aVar = this.i;
        if (aVar instanceof a.C1831a) {
            Iterator<T> it = ((a.C1831a) aVar).a.iterator();
            while (it.hasNext()) {
                a((u75) it.next());
            }
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a.b bVar3 = (a.b) aVar;
            a(bVar3.a);
            int i6 = bVar3.b;
            TextView textView2 = new TextView(getContext());
            textView2.setText(" " + textView2.getContext().getResources().getQuantityString(R.plurals.and_more_n_coauthors_plural, i6, Integer.valueOf(i6)));
            textView2.setTextColor(this.k);
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            com.vk.typography.b.h(textView2, this.j, 0);
            textView2.setShadowLayer(4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, this.l);
            addView(textView2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int childCount2 = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            measureChild(childAt2, i, i2);
            paddingRight += childAt2.getMeasuredWidth();
            i7 = Math.max(i7, childAt2.getMeasuredHeight());
        }
        setMeasuredDimension(View.resolveSize(paddingRight, i), View.resolveSize(getPaddingBottom() + getPaddingTop() + i7, i2));
    }

    public final void setAuthors(List<u75> list) {
        this.g = list;
        requestLayout();
    }
}
