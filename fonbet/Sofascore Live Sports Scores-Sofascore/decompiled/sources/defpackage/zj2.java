package defpackage;

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
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zj2 extends View implements cmi {
    public final ArrayList a;
    public List b;
    public float c;
    public bk2 d;
    public float e;

    public zj2(Context context, int i) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0.0533f;
        this.d = bk2.g;
        this.e = 0.08f;
    }

    @Override // defpackage.cmi
    public final void a(List list, bk2 bk2Var, float f, float f2) {
        this.b = list;
        this.d = bk2Var;
        this.c = f;
        this.e = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new wli(getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0397  */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [a02] */
    /* JADX WARN: Type inference failed for: r7v6, types: [a02] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        boolean z;
        Object[] objArr;
        int[] iArr;
        Spanned spanned;
        int[] iArr2;
        List e;
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
        zj2 zj2Var = this;
        Canvas canvas2 = canvas;
        List list = zj2Var.b;
        if (list.isEmpty()) {
            return;
        }
        int height = zj2Var.getHeight();
        int paddingLeft = zj2Var.getPaddingLeft();
        int paddingTop = zj2Var.getPaddingTop();
        int width = zj2Var.getWidth() - zj2Var.getPaddingRight();
        int paddingBottom = height - zj2Var.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i19 = paddingBottom - paddingTop;
        float P = sha.P(0, zj2Var.c, height, i19);
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (P <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int size = list.size();
        int i20 = 0;
        while (i20 < size) {
            m74 m74Var = (m74) list.get(i20);
            float f5 = f4;
            if (m74Var.p != Integer.MIN_VALUE) {
                k74 a = m74Var.a();
                a.h = -3.4028235E38f;
                a.i = Integer.MIN_VALUE;
                a.c = null;
                int i21 = m74Var.f;
                float f6 = m74Var.e;
                if (i21 == 0) {
                    a.e = 1.0f - f6;
                    i18 = 0;
                    a.f = 0;
                } else {
                    i18 = 0;
                    a.e = (-f6) - 1.0f;
                    a.f = 1;
                }
                int i22 = m74Var.g;
                if (i22 == 0) {
                    a.g = 2;
                } else if (i22 == 2) {
                    a.g = i18;
                }
                m74Var = a.a();
            }
            float P2 = sha.P(m74Var.n, m74Var.o, height, i19);
            wli wliVar = (wli) zj2Var.a.get(i20);
            bk2 bk2Var = zj2Var.d;
            List list2 = list;
            float f7 = zj2Var.e;
            TextPaint textPaint = wliVar.f;
            int i23 = height;
            Bitmap bitmap = m74Var.d;
            int i24 = i19;
            float f8 = m74Var.k;
            int i25 = size;
            float f9 = m74Var.j;
            int i26 = i20;
            int i27 = m74Var.i;
            float f10 = m74Var.h;
            int i28 = m74Var.g;
            float f11 = P;
            int i29 = m74Var.f;
            float f12 = m74Var.e;
            Layout.Alignment alignment = m74Var.b;
            ?? r12 = m74Var.a;
            boolean z3 = bitmap == null;
            if (z3) {
                if (!TextUtils.isEmpty(r12)) {
                    f = f10;
                    i = m74Var.l ? m74Var.m : bk2Var.c;
                }
                i12 = paddingLeft;
                i10 = paddingTop;
                i11 = paddingBottom;
                z2 = false;
                i20 = i26 + 1;
                zj2Var = this;
                paddingTop = i10;
                paddingBottom = i11;
                f4 = f5;
                list = list2;
                height = i23;
                i19 = i24;
                size = i25;
                P = f11;
                paddingLeft = i12;
            } else {
                f = f10;
                i = -16777216;
            }
            ?? r14 = wliVar.i;
            if ((r14 == r12 || (r14 != 0 && r14.equals(r12))) && Objects.equals(wliVar.j, alignment) && wliVar.k == bitmap && wliVar.l == f12 && wliVar.m == i29) {
                i2 = i28;
                if (Integer.valueOf(wliVar.n).equals(Integer.valueOf(i2)) && wliVar.o == f && Integer.valueOf(wliVar.p).equals(Integer.valueOf(i27)) && wliVar.q == f9 && wliVar.r == f8 && wliVar.s == bk2Var.a && wliVar.t == bk2Var.b && wliVar.u == i && wliVar.w == bk2Var.d && wliVar.v == bk2Var.e && Objects.equals(textPaint.getTypeface(), bk2Var.f) && wliVar.x == f11 && wliVar.y == P2 && wliVar.z == f7 && wliVar.A == paddingLeft && wliVar.B == paddingTop && wliVar.C == width && wliVar.D == paddingBottom) {
                    wliVar.a(canvas2, z3);
                    i12 = paddingLeft;
                    i10 = paddingTop;
                    i11 = paddingBottom;
                    z2 = false;
                    i20 = i26 + 1;
                    zj2Var = this;
                    paddingTop = i10;
                    paddingBottom = i11;
                    f4 = f5;
                    list = list2;
                    height = i23;
                    i19 = i24;
                    size = i25;
                    P = f11;
                    paddingLeft = i12;
                }
            } else {
                i2 = i28;
            }
            a02 a02Var = vv1.a;
            if (r12 != 0) {
                int length = r12.length();
                int i30 = 0;
                while (i30 < length) {
                    int codePointAt = Character.codePointAt((CharSequence) r12, i30);
                    int i31 = length;
                    byte directionality = Character.getDirectionality(codePointAt);
                    int i32 = i30;
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
                            e = vv1.b.e(r12);
                            i4 = 2;
                        } else {
                            e = vv1.a.e(r12);
                            i4 = 1;
                        }
                        List<String> list3 = e;
                        ArrayList arrayList = new ArrayList(list3.size());
                        int i33 = 0;
                        int i34 = 0;
                        for (String str : list3) {
                            int i35 = width;
                            int i36 = paddingTop;
                            String unicodeWrap = bidiFormatter2.unicodeWrap(str, TextDirectionHeuristics.LTR);
                            if (objArr != null) {
                                spanned.getClass();
                                iArr2.getClass();
                                iArr4.getClass();
                                int length2 = unicodeWrap.length() - str.length();
                                if (length2 > 0) {
                                    i34++;
                                }
                                i8 = paddingLeft;
                                bidiFormatter = bidiFormatter2;
                                for (int i37 = 0; i37 < objArr.length; i37 = i9 + 1) {
                                    if (iArr2[i37] >= 0 || spanned.getSpanStart(objArr[i37]) < i33) {
                                        i9 = i37;
                                    } else {
                                        i9 = i37;
                                        if (spanned.getSpanStart(objArr[i37]) < str.length() + i33) {
                                            iArr2[i9] = i34;
                                        }
                                    }
                                    if (iArr4[i9] < 0 && spanned.getSpanEnd(objArr[i9]) - 1 >= i33 && spanned.getSpanEnd(objArr[i9]) - 1 < str.length() + i33) {
                                        iArr4[i9] = i34;
                                    }
                                }
                                int d = mz1.d(i4, i33, str);
                                if (length2 > 0) {
                                    i34++;
                                }
                                i33 = d;
                            } else {
                                i8 = paddingLeft;
                                bidiFormatter = bidiFormatter2;
                            }
                            arrayList.add(unicodeWrap);
                            paddingTop = i36;
                            width = i35;
                            bidiFormatter2 = bidiFormatter;
                            paddingLeft = i8;
                        }
                        i5 = paddingLeft;
                        i6 = paddingTop;
                        i7 = width;
                        r12 = new SpannableStringBuilder(vv1.c.e(arrayList));
                        if (objArr != null) {
                            spanned.getClass();
                            iArr2.getClass();
                            iArr4.getClass();
                            for (int i38 = 0; i38 < objArr.length; i38++) {
                                int spanStart = spanned.getSpanStart(objArr[i38]) + iArr2[i38];
                                int spanEnd = spanned.getSpanEnd(objArr[i38]) + iArr4[i38];
                                int spanFlags = spanned.getSpanFlags(objArr[i38]);
                                if (spanStart < 0 || spanStart >= r12.length() || spanEnd < 0 || spanEnd > r12.length()) {
                                    StringBuilder s = lnb.s(spanStart, spanEnd, "Span out of bounds: start=", ",end=", ",len=");
                                    s.append(r12.length());
                                    tgj.d0(s.toString());
                                } else {
                                    r12.setSpan(objArr[i38], spanStart, spanEnd, spanFlags);
                                }
                            }
                        }
                        wliVar.i = r12;
                        wliVar.j = alignment;
                        wliVar.k = bitmap;
                        wliVar.l = f12;
                        wliVar.m = i29;
                        wliVar.n = i2;
                        wliVar.o = f;
                        wliVar.p = i27;
                        wliVar.q = f9;
                        wliVar.r = f8;
                        wliVar.s = bk2Var.a;
                        wliVar.t = bk2Var.b;
                        wliVar.u = i;
                        wliVar.w = bk2Var.d;
                        wliVar.v = bk2Var.e;
                        textPaint.setTypeface(bk2Var.f);
                        float f13 = f11;
                        wliVar.x = f13;
                        wliVar.y = P2;
                        wliVar.z = f7;
                        int i39 = i5;
                        wliVar.A = i39;
                        i10 = i6;
                        wliVar.B = i10;
                        width = i7;
                        wliVar.C = width;
                        i11 = i3;
                        wliVar.D = i11;
                        if (z) {
                            f11 = f13;
                            i12 = i39;
                            z2 = false;
                            wliVar.k.getClass();
                            Bitmap bitmap2 = wliVar.k;
                            int i40 = wliVar.C;
                            int i41 = wliVar.A;
                            int i42 = wliVar.D;
                            int i43 = wliVar.B;
                            float f14 = i40 - i41;
                            float f15 = (wliVar.o * f14) + i41;
                            float f16 = i42 - i43;
                            float f17 = (wliVar.l * f16) + i43;
                            int round = Math.round(f14 * wliVar.q);
                            float f18 = wliVar.r;
                            int round2 = f18 != -3.4028235E38f ? Math.round(f16 * f18) : vxd.b(bitmap2.getHeight(), bitmap2.getWidth(), round);
                            int i44 = wliVar.p;
                            if (i44 == 2) {
                                f2 = round;
                            } else {
                                if (i44 == 1) {
                                    f2 = round / 2;
                                }
                                int round3 = Math.round(f15);
                                i13 = wliVar.n;
                                if (i13 != 2) {
                                    f3 = round2;
                                } else {
                                    if (i13 == 1) {
                                        f3 = round2 / 2;
                                    }
                                    int round4 = Math.round(f17);
                                    wliVar.J = new Rect(round3, round4, round + round3, round2 + round4);
                                }
                                f17 -= f3;
                                int round42 = Math.round(f17);
                                wliVar.J = new Rect(round3, round42, round + round3, round2 + round42);
                            }
                            f15 -= f2;
                            int round32 = Math.round(f15);
                            i13 = wliVar.n;
                            if (i13 != 2) {
                            }
                            f17 -= f3;
                            int round422 = Math.round(f17);
                            wliVar.J = new Rect(round32, round422, round + round32, round2 + round422);
                        } else {
                            wliVar.i.getClass();
                            CharSequence charSequence = wliVar.i;
                            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(wliVar.i);
                            int i45 = wliVar.C - wliVar.A;
                            int i46 = wliVar.D - wliVar.B;
                            textPaint.setTextSize(wliVar.x);
                            int i47 = (int) ((wliVar.x * 0.125f) + 0.5f);
                            int i48 = i47 * 2;
                            int i49 = i45 - i48;
                            float f19 = wliVar.q;
                            if (f19 != -3.4028235E38f) {
                                i49 = (int) (i49 * f19);
                            }
                            int i50 = i49;
                            if (i50 <= 0) {
                                tgj.d0("Skipped drawing subtitle cue (insufficient space)");
                                f11 = f13;
                                i12 = i39;
                            } else {
                                if (wliVar.y > f5) {
                                    i14 = 0;
                                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) wliVar.y), 0, spannableStringBuilder.length(), 16711680);
                                } else {
                                    i14 = 0;
                                }
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                                if (wliVar.w == 1) {
                                    ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i14, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                                    int length3 = foregroundColorSpanArr.length;
                                    int i51 = 0;
                                    while (i51 < length3) {
                                        spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i51]);
                                        i51++;
                                        f13 = f13;
                                    }
                                }
                                f11 = f13;
                                if (Color.alpha(wliVar.t) > 0) {
                                    int i52 = wliVar.w;
                                    if (i52 == 0 || i52 == 2) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(wliVar.t), 0, spannableStringBuilder.length(), 16711680);
                                    } else {
                                        spannableStringBuilder2.setSpan(new BackgroundColorSpan(wliVar.t), 0, spannableStringBuilder2.length(), 16711680);
                                    }
                                }
                                Layout.Alignment alignment2 = wliVar.j;
                                if (alignment2 == null) {
                                    alignment2 = Layout.Alignment.ALIGN_CENTER;
                                }
                                Layout.Alignment alignment3 = alignment2;
                                SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, textPaint, i50, alignment3, wliVar.d, wliVar.e, true);
                                wliVar.E = staticLayout;
                                int height2 = staticLayout.getHeight();
                                int lineCount = wliVar.E.getLineCount();
                                int i53 = 0;
                                int i54 = 0;
                                while (i53 < lineCount) {
                                    i54 = Math.max((int) Math.ceil(wliVar.E.getLineWidth(i53)), i54);
                                    i53++;
                                    height2 = height2;
                                    i39 = i39;
                                }
                                int i55 = height2;
                                i12 = i39;
                                int i56 = ((wliVar.q == -3.4028235E38f || i54 >= i50) ? i54 : i50) + i48;
                                float f20 = wliVar.o;
                                if (f20 != -3.4028235E38f) {
                                    int round5 = Math.round(i45 * f20);
                                    int i57 = wliVar.A;
                                    int i58 = round5 + i57;
                                    int i59 = wliVar.p;
                                    if (i59 == 1) {
                                        i58 = ((i58 * 2) - i56) / 2;
                                    } else if (i59 == 2) {
                                        i58 -= i56;
                                    }
                                    i15 = Math.max(i58, i57);
                                    i16 = Math.min(i15 + i56, wliVar.C);
                                } else {
                                    i15 = wliVar.A + ((i45 - i56) / 2);
                                    i16 = i15 + i56;
                                }
                                int i60 = i16 - i15;
                                if (i60 <= 0) {
                                    tgj.d0("Skipped drawing subtitle cue (invalid horizontal positioning)");
                                } else {
                                    float f21 = wliVar.l;
                                    if (f21 != -3.4028235E38f) {
                                        if (wliVar.m == 0) {
                                            i17 = Math.round(i46 * f21) + wliVar.B;
                                            int i61 = wliVar.n;
                                            if (i61 == 2) {
                                                i17 -= i55;
                                            } else if (i61 == 1) {
                                                i17 = ((i17 * 2) - i55) / 2;
                                            }
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                            int lineBottom = wliVar.E.getLineBottom(0) - wliVar.E.getLineTop(0);
                                            float f22 = wliVar.l;
                                            i17 = f22 >= f5 ? Math.round(f22 * lineBottom) + wliVar.B : (Math.round((f22 + 1.0f) * lineBottom) + wliVar.D) - i55;
                                        }
                                        int i62 = i17 + i55;
                                        int i63 = wliVar.D;
                                        if (i62 > i63) {
                                            i17 = i63 - i55;
                                        } else {
                                            int i64 = wliVar.B;
                                            if (i17 < i64) {
                                                i17 = i64;
                                            }
                                        }
                                    } else {
                                        z2 = false;
                                        i17 = (wliVar.D - i55) - ((int) (i46 * wliVar.z));
                                    }
                                    wliVar.E = new StaticLayout(spannableStringBuilder3, textPaint, i60, alignment3, wliVar.d, wliVar.e, true);
                                    wliVar.F = new StaticLayout(spannableStringBuilder2, textPaint, i60, alignment3, wliVar.d, wliVar.e, true);
                                    wliVar.G = i15;
                                    wliVar.H = i17;
                                    wliVar.I = i47;
                                }
                            }
                            z2 = false;
                        }
                        canvas2 = canvas;
                        wliVar.a(canvas2, z);
                        i20 = i26 + 1;
                        zj2Var = this;
                        paddingTop = i10;
                        paddingBottom = i11;
                        f4 = f5;
                        list = list2;
                        height = i23;
                        i19 = i24;
                        size = i25;
                        P = f11;
                        paddingLeft = i12;
                    } else {
                        i30 = Character.charCount(codePointAt) + i32;
                        length = i31;
                    }
                }
            }
            i5 = paddingLeft;
            i6 = paddingTop;
            i7 = width;
            i3 = paddingBottom;
            z = z3;
            wliVar.i = r12;
            wliVar.j = alignment;
            wliVar.k = bitmap;
            wliVar.l = f12;
            wliVar.m = i29;
            wliVar.n = i2;
            wliVar.o = f;
            wliVar.p = i27;
            wliVar.q = f9;
            wliVar.r = f8;
            wliVar.s = bk2Var.a;
            wliVar.t = bk2Var.b;
            wliVar.u = i;
            wliVar.w = bk2Var.d;
            wliVar.v = bk2Var.e;
            textPaint.setTypeface(bk2Var.f);
            float f132 = f11;
            wliVar.x = f132;
            wliVar.y = P2;
            wliVar.z = f7;
            int i392 = i5;
            wliVar.A = i392;
            i10 = i6;
            wliVar.B = i10;
            width = i7;
            wliVar.C = width;
            i11 = i3;
            wliVar.D = i11;
            if (z) {
            }
            canvas2 = canvas;
            wliVar.a(canvas2, z);
            i20 = i26 + 1;
            zj2Var = this;
            paddingTop = i10;
            paddingBottom = i11;
            f4 = f5;
            list = list2;
            height = i23;
            i19 = i24;
            size = i25;
            P = f11;
            paddingLeft = i12;
        }
    }
}
