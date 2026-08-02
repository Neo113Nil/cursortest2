package com.vk.im.design.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.Collection;
import kotlin.collections.EmptyList;
import xsna.dbg0;
import xsna.epx;
import xsna.hno0;
import xsna.j5g;
import xsna.lhg;

/* compiled from: CoauthorsNamesView.kt */
/* loaded from: classes2.dex */
public final class CoauthorsNamesView extends ConstraintLayout {
    public final int t;
    public int u;
    public Collection<a> v;
    public int w;
    public final TextView x;
    public final TextView y;

    /* compiled from: CoauthorsNamesView.kt */
    public static final class a {
        public final CharSequence a;
        public final boolean b;

        public a(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Author(name=");
            sb.append((Object) this.a);
            sb.append(", isVerified=");
            return q0.a(sb, this.b, ')');
        }
    }

    public CoauthorsNamesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = (int) getResources().getDimension(R.dimen.coauthors_verified_start_padding);
        this.v = EmptyList.b;
        LayoutInflater.from(context).inflate(R.layout.im_design_coauthors_names_view, (ViewGroup) this, true);
        this.x = (TextView) findViewById(R.id.first_text);
        this.y = (TextView) findViewById(R.id.second_text);
    }

    public static void T4(TextView textView, boolean z) {
        boolean z2;
        Drawable drawable;
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        int length = compoundDrawables.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z2 = false;
                break;
            } else {
                if (compoundDrawables[i] != null) {
                    z2 = true;
                    break;
                }
                i++;
            }
        }
        if (z && z2) {
            return;
        }
        if (z || z2) {
            if (z) {
                textView.setCompoundDrawablePadding((int) textView.getResources().getDimension(R.dimen.coauthors_verified_start_padding));
                Resources resources = textView.getResources();
                ThreadLocal<TypedValue> threadLocal = dbg0.a;
                drawable = resources.getDrawable(R.drawable.vk_icon_verified_16, null);
            } else {
                textView.setCompoundDrawablePadding(0);
                drawable = null;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    private final int getVerifiedIconWidth() {
        if (this.u == 0) {
            Drawable drawable = getContext().getDrawable(R.drawable.vk_icon_verified_16);
            int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
            this.u = intrinsicWidth != 0 ? this.t + intrinsicWidth : 0;
        }
        return this.u;
    }

    private final void setOneAuthor(a aVar) {
        TextView textView = this.x;
        textView.setVisibility(0);
        this.y.setVisibility(8);
        textView.setText(aVar.a);
        T4(textView, aVar.b);
    }

    public final void P4() {
        int size = this.v.size();
        TextView textView = this.y;
        TextView textView2 = this.x;
        if (size == 0) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        if (size == 1) {
            setOneAuthor((a) j5g.X(this.v));
            return;
        }
        if (size != 2) {
            Q4((a) j5g.X(this.v), size - 1);
            return;
        }
        a aVar = (a) j5g.X(this.v);
        a aVar2 = (a) j5g.h0(this.v);
        Resources resources = getResources();
        CharSequence charSequence = aVar2.a;
        boolean z = aVar2.b;
        String string = resources.getString(R.string.coauthors_second_authors_names, charSequence);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.a);
        sb.append(string);
        boolean z2 = aVar.b;
        if (((int) textView2.getPaint().measureText(sb.toString())) + ((z2 && z) ? getVerifiedIconWidth() * 2 : (z2 || z) ? getVerifiedIconWidth() : 0) > this.w) {
            Q4(aVar, 1);
            return;
        }
        textView2.setText(aVar.a);
        T4(textView2, z2);
        textView2.setVisibility(0);
        textView.setText(string);
        T4(textView, z);
        textView.setVisibility(0);
    }

    public final void Q4(a aVar, int i) {
        String quantityString = getResources().getQuantityString(R.plurals.coauthors_first_author_name_and_other_authors_count, i, Integer.valueOf(i));
        CharSequence charSequence = aVar.a;
        TextView textView = this.x;
        textView.setText(charSequence);
        T4(textView, aVar.b);
        textView.setVisibility(0);
        TextView textView2 = this.y;
        textView2.setText(quantityString);
        T4(textView2, false);
        textView2.setVisibility(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int mode = View.MeasureSpec.getMode(i);
        int i3 = 0;
        int max = Math.max(0, Math.min(View.MeasureSpec.getSize(i), 1073741823));
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = Math.max(0, Integer.MAX_VALUE - paddingRight);
            } else if (mode != 1073741824) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "))});
                }
            }
            this.w = i3;
            P4();
            super.onMeasure(i, i2);
        }
        i3 = max < suggestedMinimumWidth ? Math.max(0, suggestedMinimumWidth - paddingRight) : Math.max(0, max - paddingRight);
        this.w = i3;
        P4();
        super.onMeasure(i, i2);
    }

    public final void setAuthorList(Collection<a> collection) {
        if (epx.f(this.v, collection)) {
            return;
        }
        this.v = collection;
        P4();
    }

    public final void setIconColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        hno0.a(this.x, valueOf);
        hno0.a(this.y, valueOf);
    }

    public final void setTextColor(int i) {
        this.x.setTextColor(i);
        this.y.setTextColor(i);
    }
}
