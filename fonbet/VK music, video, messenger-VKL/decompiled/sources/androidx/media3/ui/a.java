package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.ahn;
import xsna.i1n0;
import xsna.k73;
import xsna.odj;
import xsna.op5;
import xsna.rkk;
import xsna.vlk0;
import xsna.vy6;
import xsna.yr9;
import xsna.z0n0;

/* compiled from: CanvasSubtitleOutput.java */
/* loaded from: classes12.dex */
public final class a extends View implements SubtitleView.a {
    public final ArrayList b;
    public List<rkk> c;
    public float d;
    public yr9 e;
    public float f;

    public a(Context context, int i) {
        super(context, null);
        this.b = new ArrayList();
        this.c = Collections.EMPTY_LIST;
        this.d = 0.0533f;
        this.e = yr9.g;
        this.f = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List list, yr9 yr9Var, float f, float f2) {
        this.c = list;
        this.e = yr9Var;
        this.d = f;
        this.f = f2;
        while (true) {
            ArrayList arrayList = this.b;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new z0n0(getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03aa  */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [xsna.vlk0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [xsna.vlk0] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        List<rkk> list;
        float f;
        int i;
        int i2;
        int i3;
        boolean z;
        Object[] objArr;
        int[] iArr;
        Spanned spanned;
        int[] iArr2;
        List<String> c;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        BidiFormatter bidiFormatter;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        float f2;
        int i13;
        float f3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        a aVar = this;
        Canvas canvas2 = canvas;
        List<rkk> list2 = aVar.c;
        if (list2.isEmpty()) {
            return;
        }
        int height = aVar.getHeight();
        int paddingLeft = aVar.getPaddingLeft();
        int paddingTop = aVar.getPaddingTop();
        int width = aVar.getWidth() - aVar.getPaddingRight();
        int paddingBottom = height - aVar.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i19 = paddingBottom - paddingTop;
        float b = i1n0.b(aVar.d, 0, height, i19);
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (b <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int size = list2.size();
        int i20 = 0;
        while (i20 < size) {
            rkk rkkVar = list2.get(i20);
            float f5 = f4;
            if (rkkVar.p != Integer.MIN_VALUE) {
                rkk.a a = rkkVar.a();
                float f6 = rkkVar.e;
                list = list2;
                a.h = -3.4028235E38f;
                a.i = Integer.MIN_VALUE;
                a.c = null;
                if (rkkVar.f == 0) {
                    a.e = 1.0f - f6;
                    i18 = 0;
                    a.f = 0;
                } else {
                    i18 = 0;
                    a.e = (-f6) - 1.0f;
                    a.f = 1;
                }
                int i21 = rkkVar.g;
                if (i21 == 0) {
                    a.g = 2;
                } else if (i21 == 2) {
                    a.g = i18;
                }
                rkkVar = a.a();
            } else {
                list = list2;
            }
            float b2 = i1n0.b(rkkVar.o, rkkVar.n, height, i19);
            z0n0 z0n0Var = (z0n0) aVar.b.get(i20);
            yr9 yr9Var = aVar.e;
            float f7 = aVar.f;
            TextPaint textPaint = z0n0Var.f;
            int i22 = height;
            Bitmap bitmap = rkkVar.d;
            int i23 = i19;
            float f8 = rkkVar.k;
            int i24 = size;
            float f9 = rkkVar.j;
            int i25 = i20;
            int i26 = rkkVar.i;
            float f10 = rkkVar.h;
            int i27 = rkkVar.g;
            float f11 = b;
            int i28 = rkkVar.f;
            float f12 = rkkVar.e;
            Layout.Alignment alignment = rkkVar.b;
            ?? r12 = rkkVar.a;
            boolean z3 = bitmap == null;
            if (z3) {
                if (!TextUtils.isEmpty(r12)) {
                    f = f10;
                    i = rkkVar.l ? rkkVar.m : yr9Var.c;
                }
                i12 = paddingLeft;
                i10 = paddingTop;
                i11 = paddingBottom;
                z2 = false;
                i20 = i25 + 1;
                aVar = this;
                paddingTop = i10;
                paddingBottom = i11;
                f4 = f5;
                list2 = list;
                height = i22;
                i19 = i23;
                size = i24;
                b = f11;
                paddingLeft = i12;
            } else {
                f = f10;
                i = -16777216;
            }
            ?? r14 = z0n0Var.i;
            if ((r14 == r12 || (r14 != 0 && r14.equals(r12))) && Objects.equals(z0n0Var.j, alignment) && z0n0Var.k == bitmap && z0n0Var.l == f12 && z0n0Var.m == i28) {
                i2 = i27;
                if (Integer.valueOf(z0n0Var.n).equals(Integer.valueOf(i2)) && z0n0Var.o == f && Integer.valueOf(z0n0Var.p).equals(Integer.valueOf(i26)) && z0n0Var.q == f9 && z0n0Var.r == f8 && z0n0Var.s == yr9Var.a && z0n0Var.t == yr9Var.b && z0n0Var.u == i && z0n0Var.w == yr9Var.d && z0n0Var.v == yr9Var.e && Objects.equals(textPaint.getTypeface(), yr9Var.f) && z0n0Var.x == f11 && z0n0Var.y == b2 && z0n0Var.z == f7 && z0n0Var.A == paddingLeft && z0n0Var.B == paddingTop && z0n0Var.C == width && z0n0Var.D == paddingBottom) {
                    z0n0Var.a(canvas2, z3);
                    i12 = paddingLeft;
                    i10 = paddingTop;
                    i11 = paddingBottom;
                    z2 = false;
                    i20 = i25 + 1;
                    aVar = this;
                    paddingTop = i10;
                    paddingBottom = i11;
                    f4 = f5;
                    list2 = list;
                    height = i22;
                    i19 = i23;
                    size = i24;
                    b = f11;
                    paddingLeft = i12;
                }
            } else {
                i2 = i27;
            }
            vlk0 vlk0Var = vy6.a;
            if (r12 != 0) {
                int length = r12.length();
                int i29 = 0;
                while (i29 < length) {
                    int codePointAt = Character.codePointAt((CharSequence) r12, i29);
                    int i30 = length;
                    byte directionality = Character.getDirectionality(codePointAt);
                    int i31 = i29;
                    if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                        BidiFormatter bidiFormatter2 = BidiFormatter.getInstance();
                        if (r12 instanceof Spanned) {
                            spanned = (Spanned) r12;
                            z = z3;
                            i3 = paddingBottom;
                            Object[] spans = spanned.getSpans(0, r12.length(), Object.class);
                            int[] iArr3 = new int[spans.length];
                            iArr = new int[spans.length];
                            Arrays.fill(iArr3, -1);
                            Arrays.fill(iArr, -1);
                            objArr = spans;
                            iArr2 = iArr3;
                        } else {
                            i3 = paddingBottom;
                            z = z3;
                            objArr = null;
                            iArr = null;
                            spanned = null;
                            iArr2 = null;
                        }
                        int[] iArr4 = iArr;
                        if (r12.toString().contains("\r\n")) {
                            c = vy6.b.c(r12);
                            i4 = 2;
                        } else {
                            c = vy6.a.c(r12);
                            i4 = 1;
                        }
                        List<String> list3 = c;
                        ArrayList arrayList = new ArrayList(list3.size());
                        int i32 = 0;
                        int i33 = 0;
                        for (String str : list3) {
                            int i34 = width;
                            int i35 = paddingTop;
                            String unicodeWrap = bidiFormatter2.unicodeWrap(str, TextDirectionHeuristics.LTR);
                            if (objArr != null) {
                                spanned.getClass();
                                iArr2.getClass();
                                iArr4.getClass();
                                int length2 = unicodeWrap.length() - str.length();
                                if (length2 > 0) {
                                    i33++;
                                }
                                i8 = paddingLeft;
                                bidiFormatter = bidiFormatter2;
                                for (int i36 = 0; i36 < objArr.length; i36 = i9 + 1) {
                                    if (iArr2[i36] >= 0 || spanned.getSpanStart(objArr[i36]) < i32) {
                                        i9 = i36;
                                    } else {
                                        i9 = i36;
                                        if (spanned.getSpanStart(objArr[i36]) < str.length() + i32) {
                                            iArr2[i9] = i33;
                                        }
                                    }
                                    if (iArr4[i9] < 0 && spanned.getSpanEnd(objArr[i9]) - 1 >= i32 && spanned.getSpanEnd(objArr[i9]) - 1 < str.length() + i32) {
                                        iArr4[i9] = i33;
                                    }
                                }
                                int a2 = k73.a(i4, i32, str);
                                if (length2 > 0) {
                                    i33++;
                                }
                                i32 = a2;
                            } else {
                                i8 = paddingLeft;
                                bidiFormatter = bidiFormatter2;
                            }
                            arrayList.add(unicodeWrap);
                            paddingTop = i35;
                            width = i34;
                            bidiFormatter2 = bidiFormatter;
                            paddingLeft = i8;
                        }
                        i5 = paddingLeft;
                        i6 = paddingTop;
                        i7 = width;
                        op5 op5Var = vy6.c;
                        op5Var.getClass();
                        Iterator it = arrayList.iterator();
                        StringBuilder sb = new StringBuilder();
                        op5Var.a(sb, it);
                        r12 = new SpannableStringBuilder(sb.toString());
                        if (objArr != null) {
                            spanned.getClass();
                            iArr2.getClass();
                            iArr4.getClass();
                            for (int i37 = 0; i37 < objArr.length; i37++) {
                                int spanStart = spanned.getSpanStart(objArr[i37]) + iArr2[i37];
                                int spanEnd = spanned.getSpanEnd(objArr[i37]) + iArr4[i37];
                                int spanFlags = spanned.getSpanFlags(objArr[i37]);
                                if (spanStart < 0 || spanStart >= r12.length() || spanEnd < 0 || spanEnd > r12.length()) {
                                    StringBuilder a3 = odj.a(spanStart, spanEnd, "Span out of bounds: start=", ",end=", ",len=");
                                    a3.append(r12.length());
                                    ahn.F(a3.toString());
                                } else {
                                    r12.setSpan(objArr[i37], spanStart, spanEnd, spanFlags);
                                }
                            }
                        }
                        z0n0Var.i = r12;
                        z0n0Var.j = alignment;
                        z0n0Var.k = bitmap;
                        z0n0Var.l = f12;
                        z0n0Var.m = i28;
                        z0n0Var.n = i2;
                        z0n0Var.o = f;
                        z0n0Var.p = i26;
                        z0n0Var.q = f9;
                        z0n0Var.r = f8;
                        z0n0Var.s = yr9Var.a;
                        z0n0Var.t = yr9Var.b;
                        z0n0Var.u = i;
                        z0n0Var.w = yr9Var.d;
                        z0n0Var.v = yr9Var.e;
                        textPaint.setTypeface(yr9Var.f);
                        float f13 = f11;
                        z0n0Var.x = f13;
                        z0n0Var.y = b2;
                        z0n0Var.z = f7;
                        int i38 = i5;
                        z0n0Var.A = i38;
                        i10 = i6;
                        z0n0Var.B = i10;
                        width = i7;
                        z0n0Var.C = width;
                        i11 = i3;
                        z0n0Var.D = i11;
                        if (z) {
                            f11 = f13;
                            i12 = i38;
                            z2 = false;
                            z0n0Var.k.getClass();
                            Bitmap bitmap2 = z0n0Var.k;
                            int i39 = z0n0Var.C;
                            int i40 = z0n0Var.A;
                            int i41 = z0n0Var.D;
                            int i42 = z0n0Var.B;
                            float f14 = i39 - i40;
                            float f15 = (z0n0Var.o * f14) + i40;
                            float f16 = i41 - i42;
                            float f17 = (z0n0Var.l * f16) + i42;
                            int round = Math.round(f14 * z0n0Var.q);
                            float f18 = z0n0Var.r;
                            int round2 = f18 != -3.4028235E38f ? Math.round(f16 * f18) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * round);
                            int i43 = z0n0Var.p;
                            if (i43 == 2) {
                                f2 = round;
                            } else {
                                if (i43 == 1) {
                                    f2 = round / 2;
                                }
                                int round3 = Math.round(f15);
                                i13 = z0n0Var.n;
                                if (i13 != 2) {
                                    f3 = round2;
                                } else {
                                    if (i13 == 1) {
                                        f3 = round2 / 2;
                                    }
                                    int round4 = Math.round(f17);
                                    z0n0Var.J = new Rect(round3, round4, round + round3, round2 + round4);
                                }
                                f17 -= f3;
                                int round42 = Math.round(f17);
                                z0n0Var.J = new Rect(round3, round42, round + round3, round2 + round42);
                            }
                            f15 -= f2;
                            int round32 = Math.round(f15);
                            i13 = z0n0Var.n;
                            if (i13 != 2) {
                            }
                            f17 -= f3;
                            int round422 = Math.round(f17);
                            z0n0Var.J = new Rect(round32, round422, round + round32, round2 + round422);
                        } else {
                            z0n0Var.i.getClass();
                            CharSequence charSequence = z0n0Var.i;
                            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(z0n0Var.i);
                            int i44 = z0n0Var.C - z0n0Var.A;
                            int i45 = z0n0Var.D - z0n0Var.B;
                            textPaint.setTextSize(z0n0Var.x);
                            int i46 = (int) ((z0n0Var.x * 0.125f) + 0.5f);
                            int i47 = i46 * 2;
                            int i48 = i44 - i47;
                            float f19 = z0n0Var.q;
                            if (f19 != -3.4028235E38f) {
                                i48 = (int) (i48 * f19);
                            }
                            int i49 = i48;
                            if (i49 <= 0) {
                                ahn.F("Skipped drawing subtitle cue (insufficient space)");
                                f11 = f13;
                                i12 = i38;
                            } else {
                                if (z0n0Var.y > f5) {
                                    i14 = 0;
                                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) z0n0Var.y), 0, spannableStringBuilder.length(), 16711680);
                                } else {
                                    i14 = 0;
                                }
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                                if (z0n0Var.w == 1) {
                                    ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i14, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                                    int length3 = foregroundColorSpanArr.length;
                                    int i50 = 0;
                                    while (i50 < length3) {
                                        spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i50]);
                                        i50++;
                                        f13 = f13;
                                    }
                                }
                                f11 = f13;
                                if (Color.alpha(z0n0Var.t) > 0) {
                                    int i51 = z0n0Var.w;
                                    if (i51 == 0 || i51 == 2) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(z0n0Var.t), 0, spannableStringBuilder.length(), 16711680);
                                    } else {
                                        spannableStringBuilder2.setSpan(new BackgroundColorSpan(z0n0Var.t), 0, spannableStringBuilder2.length(), 16711680);
                                    }
                                }
                                Layout.Alignment alignment2 = z0n0Var.j;
                                if (alignment2 == null) {
                                    alignment2 = Layout.Alignment.ALIGN_CENTER;
                                }
                                Layout.Alignment alignment3 = alignment2;
                                SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, textPaint, i49, alignment3, z0n0Var.d, z0n0Var.e, true);
                                z0n0Var.E = staticLayout;
                                int height2 = staticLayout.getHeight();
                                int lineCount = z0n0Var.E.getLineCount();
                                int i52 = 0;
                                int i53 = 0;
                                while (i52 < lineCount) {
                                    i53 = Math.max((int) Math.ceil(z0n0Var.E.getLineWidth(i52)), i53);
                                    i52++;
                                    height2 = height2;
                                    i38 = i38;
                                }
                                int i54 = height2;
                                i12 = i38;
                                int i55 = ((z0n0Var.q == -3.4028235E38f || i53 >= i49) ? i53 : i49) + i47;
                                float f20 = z0n0Var.o;
                                if (f20 != -3.4028235E38f) {
                                    int round5 = Math.round(i44 * f20);
                                    int i56 = z0n0Var.A;
                                    int i57 = round5 + i56;
                                    int i58 = z0n0Var.p;
                                    if (i58 == 1) {
                                        i57 = ((i57 * 2) - i55) / 2;
                                    } else if (i58 == 2) {
                                        i57 -= i55;
                                    }
                                    i15 = Math.max(i57, i56);
                                    i16 = Math.min(i15 + i55, z0n0Var.C);
                                } else {
                                    i15 = z0n0Var.A + ((i44 - i55) / 2);
                                    i16 = i15 + i55;
                                }
                                int i59 = i16 - i15;
                                if (i59 <= 0) {
                                    ahn.F("Skipped drawing subtitle cue (invalid horizontal positioning)");
                                } else {
                                    float f21 = z0n0Var.l;
                                    if (f21 != -3.4028235E38f) {
                                        if (z0n0Var.m == 0) {
                                            i17 = Math.round(i45 * f21) + z0n0Var.B;
                                            int i60 = z0n0Var.n;
                                            if (i60 == 2) {
                                                i17 -= i54;
                                            } else if (i60 == 1) {
                                                i17 = ((i17 * 2) - i54) / 2;
                                            }
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                            int lineBottom = z0n0Var.E.getLineBottom(0) - z0n0Var.E.getLineTop(0);
                                            float f22 = z0n0Var.l;
                                            i17 = f22 >= f5 ? Math.round(f22 * lineBottom) + z0n0Var.B : (Math.round((f22 + 1.0f) * lineBottom) + z0n0Var.D) - i54;
                                        }
                                        int i61 = i17 + i54;
                                        int i62 = z0n0Var.D;
                                        if (i61 > i62) {
                                            i17 = i62 - i54;
                                        } else {
                                            int i63 = z0n0Var.B;
                                            if (i17 < i63) {
                                                i17 = i63;
                                            }
                                        }
                                    } else {
                                        z2 = false;
                                        i17 = (z0n0Var.D - i54) - ((int) (i45 * z0n0Var.z));
                                    }
                                    z0n0Var.E = new StaticLayout(spannableStringBuilder3, textPaint, i59, alignment3, z0n0Var.d, z0n0Var.e, true);
                                    z0n0Var.F = new StaticLayout(spannableStringBuilder2, textPaint, i59, alignment3, z0n0Var.d, z0n0Var.e, true);
                                    z0n0Var.G = i15;
                                    z0n0Var.H = i17;
                                    z0n0Var.I = i46;
                                }
                            }
                            z2 = false;
                        }
                        canvas2 = canvas;
                        z0n0Var.a(canvas2, z);
                        i20 = i25 + 1;
                        aVar = this;
                        paddingTop = i10;
                        paddingBottom = i11;
                        f4 = f5;
                        list2 = list;
                        height = i22;
                        i19 = i23;
                        size = i24;
                        b = f11;
                        paddingLeft = i12;
                    } else {
                        i29 = Character.charCount(codePointAt) + i31;
                        length = i30;
                    }
                }
            }
            i5 = paddingLeft;
            i6 = paddingTop;
            i7 = width;
            i3 = paddingBottom;
            z = z3;
            z0n0Var.i = r12;
            z0n0Var.j = alignment;
            z0n0Var.k = bitmap;
            z0n0Var.l = f12;
            z0n0Var.m = i28;
            z0n0Var.n = i2;
            z0n0Var.o = f;
            z0n0Var.p = i26;
            z0n0Var.q = f9;
            z0n0Var.r = f8;
            z0n0Var.s = yr9Var.a;
            z0n0Var.t = yr9Var.b;
            z0n0Var.u = i;
            z0n0Var.w = yr9Var.d;
            z0n0Var.v = yr9Var.e;
            textPaint.setTypeface(yr9Var.f);
            float f132 = f11;
            z0n0Var.x = f132;
            z0n0Var.y = b2;
            z0n0Var.z = f7;
            int i382 = i5;
            z0n0Var.A = i382;
            i10 = i6;
            z0n0Var.B = i10;
            width = i7;
            z0n0Var.C = width;
            i11 = i3;
            z0n0Var.D = i11;
            if (z) {
            }
            canvas2 = canvas;
            z0n0Var.a(canvas2, z);
            i20 = i25 + 1;
            aVar = this;
            paddingTop = i10;
            paddingBottom = i11;
            f4 = f5;
            list2 = list;
            height = i22;
            i19 = i23;
            size = i24;
            b = f11;
            paddingLeft = i12;
        }
    }
}
