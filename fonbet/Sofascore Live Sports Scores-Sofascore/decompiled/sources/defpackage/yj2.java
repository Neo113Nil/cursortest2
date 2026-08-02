package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yj2 extends View implements bmi {
    public final ArrayList a;
    public List b;
    public float c;
    public ak2 d;
    public float e;

    public yj2(Context context, int i) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0.0533f;
        this.d = ak2.g;
        this.e = 0.08f;
    }

    @Override // defpackage.bmi
    public final void a(List list, ak2 ak2Var, float f, float f2) {
        this.b = list;
        this.d = ak2Var;
        this.c = f;
        this.e = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new vli(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0454  */
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
        float f2;
        int i4;
        float f3;
        TextPaint textPaint;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        yj2 yj2Var = this;
        List list = yj2Var.b;
        if (list.isEmpty()) {
            return;
        }
        int height = yj2Var.getHeight();
        int paddingLeft = yj2Var.getPaddingLeft();
        int paddingTop = yj2Var.getPaddingTop();
        int width = yj2Var.getWidth() - yj2Var.getPaddingRight();
        int paddingBottom = height - yj2Var.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float y = rha.y(0, yj2Var.c, height, i10);
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (y <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            l74 l74Var = (l74) list.get(i11);
            float f5 = f4;
            if (l74Var.p != Integer.MIN_VALUE) {
                j74 a = l74Var.a();
                a.h = -3.4028235E38f;
                a.i = Integer.MIN_VALUE;
                a.c = null;
                int i12 = l74Var.f;
                float f6 = l74Var.e;
                if (i12 == 0) {
                    a.e = 1.0f - f6;
                    i9 = 0;
                    a.f = 0;
                } else {
                    i9 = 0;
                    a.e = (-f6) - 1.0f;
                    a.f = 1;
                }
                int i13 = l74Var.g;
                if (i13 == 0) {
                    a.g = 2;
                } else if (i13 == 2) {
                    a.g = i9;
                }
                l74Var = a.a();
            }
            float y2 = rha.y(l74Var.n, l74Var.o, height, i10);
            vli vliVar = (vli) yj2Var.a.get(i11);
            ak2 ak2Var = yj2Var.d;
            List list2 = list;
            float f7 = yj2Var.e;
            TextPaint textPaint2 = vliVar.f;
            int i14 = height;
            Bitmap bitmap = l74Var.d;
            int i15 = i10;
            float f8 = l74Var.k;
            int i16 = size;
            float f9 = l74Var.j;
            int i17 = i11;
            int i18 = l74Var.i;
            float f10 = l74Var.h;
            int i19 = l74Var.g;
            float f11 = y;
            int i20 = l74Var.f;
            float f12 = l74Var.e;
            Layout.Alignment alignment = l74Var.b;
            CharSequence charSequence = l74Var.a;
            boolean z2 = bitmap == null;
            if (z2) {
                if (!TextUtils.isEmpty(charSequence)) {
                    f = f10;
                    i = l74Var.l ? l74Var.m : ak2Var.c;
                }
                i3 = paddingLeft;
                z = false;
                i11 = i17 + 1;
                yj2Var = this;
                f4 = f5;
                list = list2;
                height = i14;
                i10 = i15;
                size = i16;
                y = f11;
                paddingLeft = i3;
            } else {
                f = f10;
                i = -16777216;
            }
            CharSequence charSequence2 = vliVar.i;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && lik.a(vliVar.j, alignment) && vliVar.k == bitmap && vliVar.l == f12 && vliVar.m == i20) {
                i2 = i19;
                if (Integer.valueOf(vliVar.n).equals(Integer.valueOf(i2)) && vliVar.o == f && Integer.valueOf(vliVar.p).equals(Integer.valueOf(i18)) && vliVar.q == f9 && vliVar.r == f8 && vliVar.s == ak2Var.a && vliVar.t == ak2Var.b && vliVar.u == i && vliVar.w == ak2Var.d && vliVar.v == ak2Var.e && lik.a(textPaint2.getTypeface(), ak2Var.f) && vliVar.x == f11 && vliVar.y == y2 && vliVar.z == f7 && vliVar.A == paddingLeft && vliVar.B == paddingTop && vliVar.C == width && vliVar.D == paddingBottom) {
                    vliVar.a(canvas, z2);
                    i3 = paddingLeft;
                    z = false;
                    i11 = i17 + 1;
                    yj2Var = this;
                    f4 = f5;
                    list = list2;
                    height = i14;
                    i10 = i15;
                    size = i16;
                    y = f11;
                    paddingLeft = i3;
                }
            } else {
                i2 = i19;
            }
            vliVar.i = charSequence;
            vliVar.j = alignment;
            vliVar.k = bitmap;
            vliVar.l = f12;
            vliVar.m = i20;
            vliVar.n = i2;
            vliVar.o = f;
            vliVar.p = i18;
            vliVar.q = f9;
            vliVar.r = f8;
            vliVar.s = ak2Var.a;
            vliVar.t = ak2Var.b;
            vliVar.u = i;
            vliVar.w = ak2Var.d;
            vliVar.v = ak2Var.e;
            textPaint2.setTypeface(ak2Var.f);
            vliVar.x = f11;
            vliVar.y = y2;
            vliVar.z = f7;
            vliVar.A = paddingLeft;
            vliVar.B = paddingTop;
            vliVar.C = width;
            vliVar.D = paddingBottom;
            if (z2) {
                vliVar.i.getClass();
                CharSequence charSequence3 = vliVar.i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(vliVar.i);
                int i21 = vliVar.C - vliVar.A;
                int i22 = vliVar.D - vliVar.B;
                textPaint2.setTextSize(vliVar.x);
                int i23 = (int) ((vliVar.x * 0.125f) + 0.5f);
                int i24 = i23 * 2;
                int i25 = i21 - i24;
                float f13 = vliVar.q;
                if (f13 != -3.4028235E38f) {
                    i25 = (int) (i25 * f13);
                }
                int i26 = i25;
                if (i26 <= 0) {
                    m6k.f0();
                    f11 = f11;
                    i3 = paddingLeft;
                } else {
                    if (vliVar.y > f5) {
                        f11 = f11;
                        textPaint = textPaint2;
                        i5 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) vliVar.y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        f11 = f11;
                        textPaint = textPaint2;
                        i5 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (vliVar.w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i5, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i27 = 0;
                        for (int length = foregroundColorSpanArr.length; i27 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i27]);
                            i27++;
                        }
                    }
                    if (Color.alpha(vliVar.t) > 0) {
                        int i28 = vliVar.w;
                        if (i28 == 0 || i28 == 2) {
                            i3 = paddingLeft;
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(vliVar.t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            i3 = paddingLeft;
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(vliVar.t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    } else {
                        i3 = paddingLeft;
                    }
                    Layout.Alignment alignment2 = vliVar.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, textPaint, i26, alignment3, vliVar.d, vliVar.e, true);
                    vliVar.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = vliVar.E.getLineCount();
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < lineCount) {
                        i30 = Math.max((int) Math.ceil(vliVar.E.getLineWidth(i29)), i30);
                        i29++;
                        height2 = height2;
                        lineCount = lineCount;
                        spannableStringBuilder2 = spannableStringBuilder2;
                    }
                    int i31 = height2;
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    int i32 = ((vliVar.q == -3.4028235E38f || i30 >= i26) ? i30 : i26) + i24;
                    float f14 = vliVar.o;
                    if (f14 != -3.4028235E38f) {
                        int round = Math.round(i21 * f14);
                        int i33 = vliVar.A;
                        int i34 = round + i33;
                        int i35 = vliVar.p;
                        if (i35 == 1) {
                            i34 = ((i34 * 2) - i32) / 2;
                        } else if (i35 == 2) {
                            i34 -= i32;
                        }
                        i6 = Math.max(i34, i33);
                        i7 = Math.min(i6 + i32, vliVar.C);
                    } else {
                        i6 = vliVar.A + ((i21 - i32) / 2);
                        i7 = i6 + i32;
                    }
                    int i36 = i7 - i6;
                    if (i36 <= 0) {
                        m6k.f0();
                    } else {
                        float f15 = vliVar.l;
                        if (f15 != -3.4028235E38f) {
                            if (vliVar.m == 0) {
                                i8 = Math.round(i22 * f15) + vliVar.B;
                                int i37 = vliVar.n;
                                if (i37 == 2) {
                                    i8 -= i31;
                                } else if (i37 == 1) {
                                    i8 = ((i8 * 2) - i31) / 2;
                                }
                                z = false;
                            } else {
                                z = false;
                                int lineBottom = vliVar.E.getLineBottom(0) - vliVar.E.getLineTop(0);
                                float f16 = vliVar.l;
                                i8 = f16 >= f5 ? Math.round(f16 * lineBottom) + vliVar.B : (Math.round((f16 + 1.0f) * lineBottom) + vliVar.D) - i31;
                            }
                            int i38 = i8 + i31;
                            int i39 = vliVar.D;
                            if (i38 > i39) {
                                i8 = i39 - i31;
                            } else {
                                int i40 = vliVar.B;
                                if (i8 < i40) {
                                    i8 = i40;
                                }
                            }
                        } else {
                            z = false;
                            i8 = (vliVar.D - i31) - ((int) (i22 * vliVar.z));
                        }
                        vliVar.E = new StaticLayout(spannableStringBuilder3, textPaint, i36, alignment3, vliVar.d, vliVar.e, true);
                        vliVar.F = new StaticLayout(spannableStringBuilder4, textPaint, i36, alignment3, vliVar.d, vliVar.e, true);
                        vliVar.G = i6;
                        vliVar.H = i8;
                        vliVar.I = i23;
                    }
                }
                z = false;
            } else {
                f11 = f11;
                i3 = paddingLeft;
                z = false;
                vliVar.k.getClass();
                Bitmap bitmap2 = vliVar.k;
                int i41 = vliVar.C;
                int i42 = vliVar.A;
                int i43 = vliVar.D;
                int i44 = vliVar.B;
                float f17 = i41 - i42;
                float f18 = (vliVar.o * f17) + i42;
                float f19 = i43 - i44;
                float f20 = (vliVar.l * f19) + i44;
                int round2 = Math.round(f17 * vliVar.q);
                float f21 = vliVar.r;
                int round3 = f21 != -3.4028235E38f ? Math.round(f19 * f21) : vxd.b(bitmap2.getHeight(), bitmap2.getWidth(), round2);
                int i45 = vliVar.p;
                if (i45 == 2) {
                    f2 = round2;
                } else {
                    if (i45 == 1) {
                        f2 = round2 / 2;
                    }
                    int round4 = Math.round(f18);
                    i4 = vliVar.n;
                    if (i4 != 2) {
                        f3 = round3;
                    } else {
                        if (i4 == 1) {
                            f3 = round3 / 2;
                        }
                        int round5 = Math.round(f20);
                        vliVar.J = new Rect(round4, round5, round2 + round4, round3 + round5);
                    }
                    f20 -= f3;
                    int round52 = Math.round(f20);
                    vliVar.J = new Rect(round4, round52, round2 + round4, round3 + round52);
                }
                f18 -= f2;
                int round42 = Math.round(f18);
                i4 = vliVar.n;
                if (i4 != 2) {
                }
                f20 -= f3;
                int round522 = Math.round(f20);
                vliVar.J = new Rect(round42, round522, round2 + round42, round3 + round522);
            }
            vliVar.a(canvas, z2);
            i11 = i17 + 1;
            yj2Var = this;
            f4 = f5;
            list = list2;
            height = i14;
            i10 = i15;
            size = i16;
            y = f11;
            paddingLeft = i3;
        }
    }
}
