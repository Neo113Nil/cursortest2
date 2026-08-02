package com.vk.feed.design.view.newsfeed.header.subtitle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
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
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.common.ThemedColor;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.header.HeaderTooltip;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.an10;
import xsna.ap80;
import xsna.bvu0;
import xsna.ccr0;
import xsna.cn70;
import xsna.dhr0;
import xsna.dqa;
import xsna.dvu0;
import xsna.e3m;
import xsna.epx;
import xsna.evu0;
import xsna.g2u0;
import xsna.j9g;
import xsna.krv0;
import xsna.m33;
import xsna.msy;
import xsna.nik0;
import xsna.ro;
import xsna.s3q0;
import xsna.tfm0;
import xsna.tv4;
import xsna.uhs0;
import xsna.waz;
import xsna.xxk0;

/* compiled from: VkFeedPostHeaderSubtitleTextView.kt */
/* loaded from: classes18.dex */
public final class VkFeedPostHeaderSubtitleTextView extends VkLinkedText {
    public static final /* synthetic */ int K = 0;
    public final ArrayList<Integer> A;
    public final ArrayList<Integer> B;
    public int C;
    public int D;
    public final Rect E;
    public final String F;
    public final Object G;
    public final Object H;
    public final Object I;
    public a J;
    public boolean k;
    public bvu0 l;
    public final boolean m;
    public boolean n;
    public Float o;
    public int p;
    public int q;
    public final Paint r;
    public LinearGradient s;
    public final RectF t;
    public Integer u;
    public boolean v;
    public final SpannableStringBuilder w;
    public SpannableString x;
    public final SpannableStringBuilder y;
    public final ArrayList<SpannableStringBuilder> z;

    /* compiled from: VkFeedPostHeaderSubtitleTextView.kt */
    public interface a {
        waz a(String str, evu0 evu0Var);

        Integer b(String str);

        int c(String str);

        j9g d(String str, int i, dvu0 dvu0Var);
    }

    public VkFeedPostHeaderSubtitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = true;
        this.p = Integer.MAX_VALUE;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.r = paint;
        this.t = new RectF();
        this.w = new SpannableStringBuilder();
        this.y = new SpannableStringBuilder();
        this.z = new ArrayList<>();
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        this.E = new Rect();
        this.F = " · ";
        uhs0 uhs0Var = new uhs0(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = msy.a(lazyThreadSafetyMode, uhs0Var);
        this.H = msy.a(lazyThreadSafetyMode, new tfm0(this, 23));
        this.I = msy.a(lazyThreadSafetyMode, new ap80(17));
    }

    public static int b(VkFeedPostHeaderSubtitleTextView vkFeedPostHeaderSubtitleTextView) {
        return (int) Math.ceil(vkFeedPostHeaderSubtitleTextView.getDelimiterLayout().getLineWidth(0));
    }

    public static Spannable e(VkFeedPostHeaderSubtitleTextView vkFeedPostHeaderSubtitleTextView, Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable("F");
        newSpannable.setSpan(new dqa(drawable), 0, 1, 0);
        return newSpannable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final StaticLayout getDelimiterLayout() {
        return (StaticLayout) this.G.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getDelimiterWidth() {
        return ((Number) this.H.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Spannable getEmptySpaceBetweenIconAndText() {
        return (Spannable) this.I.getValue();
    }

    public static boolean i(Layout layout, int i) {
        if (i < 0 || i >= layout.getLineCount()) {
            return true;
        }
        int lineStart = layout.getLineStart(i);
        int lineVisibleEnd = layout.getLineVisibleEnd(i);
        if (lineVisibleEnd < lineStart) {
            lineVisibleEnd = lineStart;
        }
        while (lineStart < lineVisibleEnd) {
            char charAt = layout.getText().charAt(lineStart);
            if (charAt != 10240 && !ro.j(charAt) && charAt != 8230 && charAt != 8229) {
                return false;
            }
            lineStart++;
        }
        return true;
    }

    public final int f() {
        Layout layout = getLayout();
        if (layout != null && layout.getLineCount() != 0) {
            int i = this.q;
            int lineCount = layout.getLineCount() - 1;
            if (i > lineCount) {
                i = lineCount;
            }
            while (-1 < i) {
                if (!i(layout, i)) {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    @Override // android.view.View, com.vk.core.view.components.text.links.a.InterfaceC0867a
    public final void invalidate() {
        if (this.k) {
            return;
        }
        super.invalidate();
    }

    public final void l(Description description, int i, int i2) {
        Layout layout = getLayout();
        if (layout == null) {
            bvu0 bvu0Var = this.l;
            if (bvu0Var != null) {
                bvu0Var.b(description, this);
                return;
            }
            return;
        }
        int b = an10.b(layout.getPrimaryHorizontal(i));
        int b2 = an10.b(layout.getPrimaryHorizontal(i2));
        if (b2 < b) {
            b2 = b;
        }
        int paddingTop = getPaddingTop();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        Rect rect = this.E;
        rect.set(b, paddingTop, b2, measuredHeight);
        bvu0 bvu0Var2 = this.l;
        if (bvu0Var2 != null) {
            bvu0Var2.a(description, this, rect);
        }
    }

    @Override // com.vk.core.view.components.text.links.VkLinkedText, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        LinearGradient linearGradient = this.s;
        if (linearGradient == null) {
            super.onDraw(canvas);
            return;
        }
        boolean z = this.n;
        RectF rectF = this.t;
        Paint paint = this.r;
        if (!z) {
            int saveLayer = canvas.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            paint.setShader(linearGradient);
            canvas.drawRect(rectF, paint);
            paint.setShader(null);
            canvas.restoreToCount(saveLayer);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int save = canvas.save();
        canvas.clipRect(0, 0, width, height);
        try {
            canvas2 = canvas;
            try {
                int saveLayer2 = canvas2.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight(), null);
                super.onDraw(canvas2);
                paint.setShader(linearGradient);
                canvas2.drawRect(rectF, paint);
                paint.setShader(null);
                canvas2.restoreToCount(saveLayer2);
                canvas2.restoreToCount(save);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                canvas2.restoreToCount(save);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            canvas2 = canvas;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Layout layout;
        int f;
        int f2;
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.t;
        rectF.setEmpty();
        if (this.m && (layout = getLayout()) != null && layout.getLineCount() != 0 && (f = f()) >= 0) {
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int lineCount = layout.getLineCount();
            int i5 = this.p;
            if (lineCount > i5 || (i5 != 1 ? layout.getLineMax(f) > width + 0.5f : layout.getPrimaryHorizontal(layout.getLineVisibleEnd(f)) > width + 0.5f)) {
                Layout layout2 = getLayout();
                if (layout2 != null && (f2 = f()) >= 0) {
                    float lineTop = layout2.getLineTop(f2);
                    float lineBottom = layout2.getLineBottom(f2) - lineTop;
                    if (lineBottom <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return;
                    }
                    Float f3 = this.o;
                    float floatValue = f3 != null ? f3.floatValue() : 1.5f * lineBottom;
                    float paddingTop = getPaddingTop() + lineTop;
                    boolean z2 = getLayoutDirection() == 0;
                    float lineLeft = layout2.getLineLeft(f2) + getPaddingLeft();
                    float lineRight = layout2.getLineRight(f2) + getPaddingLeft();
                    float width2 = getWidth() - getPaddingRight();
                    if (lineRight > width2) {
                        lineRight = width2;
                    }
                    if (z2) {
                        float f4 = lineRight - floatValue;
                        if (f4 >= lineLeft) {
                            lineLeft = f4;
                        }
                        rectF.set(lineLeft, paddingTop, lineRight, lineBottom + paddingTop);
                        this.s = new LinearGradient(rectF.left, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.right, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -16777216, 0, Shader.TileMode.CLAMP);
                        return;
                    }
                    float f5 = floatValue + lineLeft;
                    if (f5 <= lineRight) {
                        lineRight = f5;
                    }
                    rectF.set(lineLeft, paddingTop, lineRight, lineBottom + paddingTop);
                    this.s = new LinearGradient(rectF.right, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.left, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -16777216, 0, Shader.TileMode.CLAMP);
                    return;
                }
                return;
            }
        }
        this.s = null;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intValue;
        this.k = true;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int size = View.MeasureSpec.getSize(i);
        ArrayList<SpannableStringBuilder> arrayList = this.z;
        int size2 = size - (((arrayList.size() - 1) * getDelimiterWidth()) + paddingRight);
        int i3 = 0;
        if (arrayList.size() <= 1 || size2 - this.C >= 0) {
            setText(this.x);
        } else {
            ArrayList<Integer> arrayList2 = this.B;
            arrayList2.clear();
            this.D = 0;
            int size3 = size2 / arrayList.size();
            ArrayList<Integer> arrayList3 = this.A;
            int size4 = arrayList3.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size4; i5++) {
                int intValue2 = arrayList3.get(i5).intValue();
                if (intValue2 <= size3) {
                    this.D += intValue2;
                    i4 = tv4.a(arrayList2, intValue2, i4, 1);
                } else {
                    arrayList2.add(-1);
                }
            }
            if (i4 > 0 && i4 < arrayList.size()) {
                int size5 = arrayList.size();
                int i6 = i4;
                while (i4 < size5) {
                    int size6 = (size2 - this.D) / (arrayList.size() - i6);
                    int size7 = arrayList3.size();
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < size7) {
                        if (arrayList2.get(i7).intValue() == -1 && (intValue = arrayList3.get(i7).intValue()) <= size6) {
                            this.D += intValue;
                            arrayList2.set(i7, Integer.valueOf(intValue));
                            i8++;
                        }
                        i7++;
                    }
                    i6 += i8;
                    if (i8 == 0 || i6 == arrayList.size()) {
                        break;
                    }
                    i4++;
                    i3 = 0;
                }
                i4 = i6;
            }
            if (i4 < arrayList.size()) {
                int size8 = (size2 - this.D) / (arrayList.size() - i4);
                int size9 = arrayList3.size();
                for (int i9 = 0; i9 < size9; i9++) {
                    if (arrayList2.get(i9).intValue() == -1) {
                        arrayList2.set(i9, Integer.valueOf(size8));
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = this.y;
            spannableStringBuilder.clear();
            spannableStringBuilder.clearSpans();
            int size10 = arrayList.size();
            for (int i10 = 0; i10 < size10; i10++) {
                if (i10 != 0) {
                    spannableStringBuilder.append((CharSequence) this.F);
                }
                SpannableStringBuilder spannableStringBuilder2 = arrayList.get(i10);
                int intValue3 = arrayList3.get(i10).intValue();
                Integer num = arrayList2.get(i10);
                if (num != null && intValue3 == num.intValue()) {
                    spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                } else {
                    spannableStringBuilder.append(TextUtils.ellipsize(spannableStringBuilder2, getPaint(), arrayList2.get(i10).intValue(), TextUtils.TruncateAt.END));
                }
            }
            SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
            setText(new SpannableString(spannableStringBuilder));
        }
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null && layout.getLineCount() > 0) {
            int max = Math.max(1, Math.min(this.p, layout.getLineCount())) - 1;
            this.q = max;
            setMeasuredDimension(getMeasuredWidth(), getPaddingBottom() + layout.getLineBottom(max));
            Layout layout2 = getLayout();
            if (layout2 != null) {
                int measuredHeight = getMeasuredHeight();
                int i11 = this.q + 1;
                if (i11 < 1) {
                    i11 = 1;
                }
                loop5: for (int i12 = i11 - 1; -1 < i12; i12--) {
                    if (i12 >= 0 && i12 < layout2.getLineCount()) {
                        if (!i(layout2, i12)) {
                            break;
                        }
                        int lineStart = layout2.getLineStart(i12);
                        int lineVisibleEnd = layout2.getLineVisibleEnd(i12);
                        if (lineVisibleEnd < lineStart) {
                            lineVisibleEnd = lineStart;
                        }
                        while (lineStart < lineVisibleEnd) {
                            char charAt = layout2.getText().charAt(lineStart);
                            if (charAt == 8230 || charAt == 8229) {
                                break loop5;
                            } else {
                                lineStart++;
                            }
                        }
                        measuredHeight -= layout2.getLineBottom(i12) - layout2.getLineTop(i12);
                    }
                }
                int lineBottom = layout2.getLineCount() > 0 ? layout2.getLineBottom(0) - layout2.getLineTop(0) : 0;
                int measuredWidth = getMeasuredWidth();
                if (measuredHeight < lineBottom) {
                    measuredHeight = lineBottom;
                }
                setMeasuredDimension(measuredWidth, measuredHeight);
            }
        }
        this.k = false;
    }

    @Override // android.view.View
    public final void requestLayout() {
        if (this.k) {
            return;
        }
        super.requestLayout();
    }

    public final void setClipToEdge(boolean z) {
        if (this.n != z) {
            this.n = z;
            setEllipsize(null);
            requestLayout();
            invalidate();
        }
    }

    public final void setDescriptionClickListener(bvu0 bvu0Var) {
        this.l = bvu0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r9 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDescriptions(List<Description> list) {
        Integer a2;
        Integer num;
        Drawable f;
        Integer num2 = this.u;
        Integer valueOf = num2 != null ? Integer.valueOf(g2u0.a(num2.intValue(), this)) : null;
        SpannableStringBuilder spannableStringBuilder = this.w;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        ArrayList<SpannableStringBuilder> arrayList = this.z;
        arrayList.clear();
        ArrayList<Integer> arrayList2 = this.A;
        arrayList2.clear();
        this.C = 0;
        ThemedColor themedColor = valueOf != null ? new ThemedColor(valueOf, valueOf) : null;
        boolean z = false;
        for (Description description : list) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (z) {
                spannableStringBuilder.append(this.F);
            }
            ImagePhoto imagePhoto = description.c;
            Text text = description.b;
            if (imagePhoto != null) {
                String str = imagePhoto.d;
                String a3 = imagePhoto.a(cn70.b(12));
                if (a3 != null && a3.length() != 0) {
                    ccr0 ccr0Var = new ccr0(getContext());
                    ccr0Var.r(a3);
                    s3q0 s3q0Var = s3q0.a;
                    spannableStringBuilder2.append((CharSequence) e(this, ccr0Var));
                } else if (str != null && str.length() != 0) {
                    a aVar = this.J;
                    Integer b = aVar != null ? aVar.b(str) : null;
                    if (b != null) {
                        int intValue = b.intValue();
                        if (!this.v) {
                            getContext();
                            ThemedColor themedColor2 = imagePhoto.f;
                            num = themedColor2 != null ? themedColor2.a(dhr0.M()) : null;
                        }
                        num = valueOf;
                        if (num != null) {
                            Context context = getContext();
                            e3m.a aVar2 = e3m.a;
                            f = m33.a(intValue, context);
                            if (f != null) {
                                f.setTint(num.intValue());
                                if (f != null) {
                                    spannableStringBuilder2.append((CharSequence) e(this, f));
                                }
                            }
                            f = null;
                            if (f != null) {
                            }
                        } else {
                            a aVar3 = this.J;
                            if (aVar3 != null) {
                                f = krv0.f(intValue, aVar3.c(str), getContext());
                                if (f != null) {
                                }
                            }
                            f = null;
                            if (f != null) {
                            }
                        }
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
                int length = spannableStringBuilder2.length();
                spannableStringBuilder2.append((CharSequence) str3);
                int length2 = spannableStringBuilder2.length();
                ThemedColor themedColor3 = themedColor == null ? text != null ? text.c : null : themedColor;
                HeaderAction headerAction = description.d;
                HeaderTooltip headerTooltip = description.e;
                if (headerAction == null && headerTooltip == null) {
                    if (themedColor3 != null && (a2 = themedColor3.a(dhr0.M())) != null) {
                        nik0.d(spannableStringBuilder2, a2.intValue(), length, 4);
                    }
                } else if (themedColor3 != null) {
                    Integer a4 = themedColor3.a(dhr0.M());
                    if (a4 != null) {
                        int intValue2 = a4.intValue();
                        a aVar4 = this.J;
                        spannableStringBuilder2.setSpan(aVar4 != null ? aVar4.d(str3, intValue2, new dvu0(this, description, length, length2)) : null, length, length2, 33);
                    }
                } else {
                    a aVar5 = this.J;
                    spannableStringBuilder2.setSpan(aVar5 != null ? aVar5.a(str3, new evu0(this, description, length, length2)) : null, length, length2, 33);
                }
            }
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            arrayList.add(spannableStringBuilder2);
            int ceil = (int) Math.ceil(new xxk0(spannableStringBuilder2, getPaint(), Integer.MAX_VALUE, null, getLineSpacingMultiplier(), getLineSpacingExtra(), null, 1, 5944).a().getLineWidth(0));
            arrayList2.add(Integer.valueOf(ceil));
            this.C += ceil;
            z = true;
        }
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        this.x = new SpannableString(spannableStringBuilder);
        requestLayout();
        invalidate();
    }

    public final void setExternalSourcesProvider(a aVar) {
        this.J = aVar;
    }

    public final void setFadeLength(float f) {
        if (epx.d(this.o, f)) {
            return;
        }
        this.o = Float.valueOf(f);
        requestLayout();
        invalidate();
    }

    public final void setMaxTextLines(int i) {
        if (i < 1) {
            i = 1;
        }
        if (this.p != i) {
            this.p = i;
            setMaxLines(i);
            this.s = null;
            requestLayout();
            invalidate();
        }
    }

    public final void setOverlayMode(boolean z) {
        this.v = z;
    }

    public final void setSubtitleTextColorResId(Integer num) {
        this.u = num;
    }
}
