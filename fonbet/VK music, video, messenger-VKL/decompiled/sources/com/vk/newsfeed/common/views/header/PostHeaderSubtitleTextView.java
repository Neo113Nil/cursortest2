package com.vk.newsfeed.common.views.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.vk.common.links.AwayLink;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.ThemedColor;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.header.HeaderTooltip;
import com.vk.newsfeed.common.views.header.PostHeaderSubtitleTextView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.a4c0;
import xsna.an10;
import xsna.ccr0;
import xsna.cn70;
import xsna.d2c0;
import xsna.dhr0;
import xsna.dqa;
import xsna.e3m;
import xsna.g2u0;
import xsna.j9g;
import xsna.l1i;
import xsna.m33;
import xsna.msy;
import xsna.nik0;
import xsna.qjc;
import xsna.s3c0;
import xsna.s3q0;
import xsna.tv4;
import xsna.waz;
import xsna.wf40;
import xsna.x1z;
import xsna.xxk0;
import xsna.znk0;

/* compiled from: PostHeaderSubtitleTextView.kt */
/* loaded from: classes4.dex */
public final class PostHeaderSubtitleTextView extends LinkedTextView {
    public static final int D = cn70.b(36);
    public final Object A;
    public final Object B;
    public final Object C;
    public boolean k;
    public s3c0 l;
    public final GradientDrawable m;
    public boolean n;
    public Integer o;
    public Integer p;
    public final SpannableStringBuilder q;
    public SpannableString r;
    public final SpannableStringBuilder s;
    public final ArrayList<SpannableStringBuilder> t;
    public final ArrayList<Integer> u;
    public final ArrayList<Integer> v;
    public int w;
    public int x;
    public final Rect y;
    public final String z;

    public PostHeaderSubtitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.m = gradientDrawable;
        this.q = new SpannableStringBuilder();
        this.s = new SpannableStringBuilder();
        this.t = new ArrayList<>();
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        this.y = new Rect();
        this.z = " · ";
        l1i l1iVar = new l1i(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.A = msy.a(lazyThreadSafetyMode, l1iVar);
        this.B = msy.a(lazyThreadSafetyMode, new wf40(this, 12));
        this.C = msy.a(lazyThreadSafetyMode, new d2c0(1));
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(new int[]{0, dhr0.t.c(R.attr.vk_ui_background_content)});
    }

    public static int b(PostHeaderSubtitleTextView postHeaderSubtitleTextView) {
        return (int) Math.ceil(postHeaderSubtitleTextView.getDelimiterLayout().getLineWidth(0));
    }

    public static Spannable e(PostHeaderSubtitleTextView postHeaderSubtitleTextView, Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable("F");
        newSpannable.setSpan(new dqa(drawable), 0, 1, 0);
        return newSpannable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final StaticLayout getDelimiterLayout() {
        return (StaticLayout) this.A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getDelimiterWidth() {
        return ((Number) this.B.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Spannable getEmptySpaceBetweenIconAndText() {
        return (Spannable) this.C.getValue();
    }

    public final void f(Description description, int i, int i2) {
        Layout layout = getLayout();
        if (layout == null) {
            s3c0 s3c0Var = this.l;
            if (s3c0Var != null) {
                s3c0Var.W2(description, this);
                return;
            }
            return;
        }
        int b = an10.b(layout.getPrimaryHorizontal(i));
        int b2 = an10.b(layout.getPrimaryHorizontal(i2));
        if (b2 < b) {
            b2 = b;
        }
        this.y.set(b, getPaddingTop(), b2, getMeasuredHeight() - getPaddingBottom());
        s3c0 s3c0Var2 = this.l;
        if (s3c0Var2 != null) {
            s3c0Var2.Q3(description, this);
        }
    }

    @Override // android.view.View, com.vk.core.view.components.text.links.a.InterfaceC0867a
    public final void invalidate() {
        if (this.k) {
            return;
        }
        super.invalidate();
    }

    @Override // com.vk.core.view.components.text.links.VkLinkedText, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout;
        super.onDraw(canvas);
        if (!this.n || (layout = getLayout()) == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        if (layout.getLineWidth(0) > measuredWidth - paddingLeft) {
            int i = measuredWidth - D;
            int paddingTop = getPaddingTop();
            int measuredHeight = getMeasuredHeight() - getPaddingBottom();
            GradientDrawable gradientDrawable = this.m;
            gradientDrawable.setBounds(i, paddingTop, measuredWidth, measuredHeight);
            gradientDrawable.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intValue;
        this.k = true;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int size = View.MeasureSpec.getSize(i);
        ArrayList<SpannableStringBuilder> arrayList = this.t;
        int size2 = size - (((arrayList.size() - 1) * getDelimiterWidth()) + paddingRight);
        if (arrayList.size() <= 1 || size2 - this.w >= 0) {
            setText(this.r);
        } else {
            ArrayList<Integer> arrayList2 = this.v;
            arrayList2.clear();
            this.x = 0;
            int size3 = size2 / arrayList.size();
            ArrayList<Integer> arrayList3 = this.u;
            int size4 = arrayList3.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size4; i4++) {
                int intValue2 = arrayList3.get(i4).intValue();
                if (intValue2 <= size3) {
                    this.x += intValue2;
                    i3 = tv4.a(arrayList2, intValue2, i3, 1);
                } else {
                    arrayList2.add(-1);
                }
            }
            if (i3 > 0 && i3 < arrayList.size()) {
                int size5 = arrayList.size();
                int i5 = i3;
                while (i3 < size5) {
                    int size6 = (size2 - this.x) / (arrayList.size() - i5);
                    int size7 = arrayList3.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size7; i7++) {
                        if (arrayList2.get(i7).intValue() == -1 && (intValue = arrayList3.get(i7).intValue()) <= size6) {
                            this.x += intValue;
                            arrayList2.set(i7, Integer.valueOf(intValue));
                            i6++;
                        }
                    }
                    i5 += i6;
                    if (i6 == 0 || i5 == arrayList.size()) {
                        break;
                    } else {
                        i3++;
                    }
                }
                i3 = i5;
            }
            if (i3 < arrayList.size()) {
                int size8 = (size2 - this.x) / (arrayList.size() - i3);
                int size9 = arrayList3.size();
                for (int i8 = 0; i8 < size9; i8++) {
                    if (arrayList2.get(i8).intValue() == -1) {
                        arrayList2.set(i8, Integer.valueOf(size8));
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = this.s;
            spannableStringBuilder.clear();
            spannableStringBuilder.clearSpans();
            int size10 = arrayList.size();
            for (int i9 = 0; i9 < size10; i9++) {
                if (i9 != 0) {
                    spannableStringBuilder.append((CharSequence) this.z);
                }
                SpannableStringBuilder spannableStringBuilder2 = arrayList.get(i9);
                int intValue3 = arrayList3.get(i9).intValue();
                Integer num = arrayList2.get(i9);
                if (num != null && intValue3 == num.intValue()) {
                    spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                } else {
                    spannableStringBuilder.append(TextUtils.ellipsize(spannableStringBuilder2, getPaint(), arrayList2.get(i9).intValue(), TextUtils.TruncateAt.END));
                }
            }
            SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
            setText(new SpannableString(spannableStringBuilder));
        }
        super.onMeasure(i, i2);
        this.k = false;
    }

    @Override // android.view.View
    public final void requestLayout() {
        if (this.k) {
            return;
        }
        super.requestLayout();
    }

    public final void setDescriptionClickListener(s3c0 s3c0Var) {
        this.l = s3c0Var;
    }

    public final void setDescriptions(List<Description> list) {
        Integer a;
        Drawable b;
        Integer num = this.o;
        Integer num2 = this.p;
        if (num2 == null) {
            num2 = num != null ? Integer.valueOf(g2u0.a(num.intValue(), this)) : null;
        }
        SpannableStringBuilder spannableStringBuilder = this.q;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        ArrayList<SpannableStringBuilder> arrayList = this.t;
        arrayList.clear();
        ArrayList<Integer> arrayList2 = this.u;
        arrayList2.clear();
        this.w = 0;
        ThemedColor themedColor = num2 != null ? new ThemedColor(num2, num2) : null;
        boolean z = false;
        for (final Description description : list) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (z) {
                spannableStringBuilder.append(this.z);
            }
            ImagePhoto imagePhoto = description.c;
            Text text = description.b;
            if (imagePhoto != null) {
                String str = imagePhoto.d;
                String a2 = imagePhoto.a(cn70.b(12));
                if (a2 != null && a2.length() != 0) {
                    ccr0 ccr0Var = new ccr0(getContext());
                    ccr0Var.r(a2);
                    s3q0 s3q0Var = s3q0.a;
                    spannableStringBuilder2.append((CharSequence) e(this, ccr0Var));
                } else if (str != null && str.length() != 0) {
                    getContext();
                    Integer o = znk0.o(getContext(), str);
                    if (o != null) {
                        int intValue = o.intValue();
                        getContext();
                        ThemedColor themedColor2 = imagePhoto.f;
                        Integer a3 = themedColor2 != null ? themedColor2.a(dhr0.M()) : null;
                        if (a3 == null) {
                            a3 = num2;
                        }
                        getContext();
                        LinkedHashMap linkedHashMap = x1z.a;
                        if (a3 != null) {
                            Context context = getContext();
                            e3m.a aVar = e3m.a;
                            b = m33.a(intValue, context);
                            b.setTint(a3.intValue());
                        } else {
                            b = dhr0.t.b(intValue, str.equals("fire") ? R.attr.vk_ui_accent_orange_fire : R.attr.vk_ui_icon_secondary);
                        }
                        spannableStringBuilder2.append((CharSequence) e(this, b));
                    }
                }
            }
            if (spannableStringBuilder2.length() > 0) {
                String str2 = text != null ? text.b : null;
                if (str2 != null && str2.length() != 0) {
                    spannableStringBuilder2.append((CharSequence) getEmptySpaceBetweenIconAndText());
                }
            }
            String str3 = text != null ? text.b : null;
            if (str3 != null && str3.length() != 0) {
                final int length = spannableStringBuilder2.length();
                spannableStringBuilder2.append((CharSequence) str3);
                final int length2 = spannableStringBuilder2.length();
                ThemedColor themedColor3 = themedColor == null ? text != null ? text.c : null : themedColor;
                HeaderAction headerAction = description.d;
                HeaderTooltip headerTooltip = description.e;
                if (headerAction == null && headerTooltip == null) {
                    if (themedColor3 != null && (a = themedColor3.a(dhr0.M())) != null) {
                        nik0.d(spannableStringBuilder2, a.intValue(), length, 4);
                    }
                } else if (themedColor3 != null) {
                    Integer a4 = themedColor3.a(dhr0.M());
                    if (a4 != null) {
                        j9g j9gVar = new j9g(str3, a4.intValue(), new qjc.a() { // from class: xsna.z3c0
                            @Override // xsna.qjc.a
                            public final void I(AwayLink awayLink) {
                                int i = PostHeaderSubtitleTextView.D;
                                PostHeaderSubtitleTextView.this.f(description, length, length2);
                            }
                        });
                        j9gVar.b = true;
                        spannableStringBuilder2.setSpan(j9gVar, length, length2, 33);
                    }
                } else {
                    waz wazVar = new waz(str3, new a4c0(this, description, length, length2));
                    wazVar.b(R.attr.vk_ui_text_secondary);
                    wazVar.b = true;
                    spannableStringBuilder2.setSpan(wazVar, length, length2, 33);
                }
            }
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            arrayList.add(spannableStringBuilder2);
            int ceil = (int) Math.ceil(new xxk0(spannableStringBuilder2, getPaint(), Integer.MAX_VALUE, null, getLineSpacingMultiplier(), getLineSpacingExtra(), null, 1, 5944).a().getLineWidth(0));
            arrayList2.add(Integer.valueOf(ceil));
            this.w += ceil;
            z = true;
        }
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        this.r = new SpannableString(spannableStringBuilder);
        requestLayout();
        invalidate();
    }

    public final void setShouldDrawFadingEdges(boolean z) {
        if (this.n != z) {
            this.n = z;
            invalidate();
        }
    }

    public final void setSubtitleTextColor(int i) {
        this.p = Integer.valueOf(i);
        this.o = null;
    }

    public final void setSubtitleTextColorResId(Integer num) {
        this.o = num;
        this.p = null;
    }
}
