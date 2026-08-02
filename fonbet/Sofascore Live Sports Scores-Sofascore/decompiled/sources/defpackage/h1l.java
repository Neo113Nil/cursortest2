package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h1l extends FrameLayout implements bmi {
    public final yj2 a;
    public final e1l b;
    public List c;
    public ak2 d;
    public float e;
    public float f;

    public h1l(Context context) {
        super(context, null);
        this.c = Collections.EMPTY_LIST;
        this.d = ak2.g;
        this.e = 0.0533f;
        this.f = 0.08f;
        yj2 yj2Var = new yj2(context, 0);
        this.a = yj2Var;
        e1l e1lVar = new e1l(context, null, 0);
        this.b = e1lVar;
        e1lVar.setBackgroundColor(0);
        addView(yj2Var);
        addView(e1lVar);
    }

    @Override // defpackage.bmi
    public final void a(List list, ak2 ak2Var, float f, float f2) {
        this.d = ak2Var;
        this.e = f;
        this.f = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            l74 l74Var = (l74) list.get(i);
            if (l74Var.d != null) {
                arrayList.add(l74Var);
            } else {
                arrayList2.add(l74Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, ak2Var, f, f2);
        invalidate();
    }

    public final String b(float f, int i) {
        float y = rha.y(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (y == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(y / getContext().getResources().getDisplayMetrics().density)};
        int i2 = lik.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x01f0, code lost:
    
        if (r6 != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x01f2, code lost:
    
        r1 = "right";
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x01f5, code lost:
    
        r1 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x01fb, code lost:
    
        if (r6 != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0677  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        String format;
        int i;
        String format2;
        String str;
        boolean z;
        Layout.Alignment alignment;
        Locale locale;
        int i2;
        Object obj;
        String str2;
        String str3;
        Object obj2;
        String str4;
        int i3;
        CharSequence charSequence;
        String str5;
        String str6;
        String str7;
        String str8;
        float f;
        String str9;
        String str10;
        kn3 kn3Var;
        boolean z2;
        String str11;
        Object[] objArr;
        int i4;
        int i5;
        int i6;
        String format3;
        String str12;
        float f2;
        String str13;
        Layout.Alignment alignment2;
        int i7;
        String str14;
        Locale locale2 = Locale.US;
        StringBuilder sb = new StringBuilder();
        String N = t62.N(this.d.a);
        int i8 = 0;
        String b = b(this.e, 0);
        float f3 = 1.2f;
        Float valueOf = Float.valueOf(1.2f);
        ak2 ak2Var = this.d;
        int i9 = ak2Var.d;
        int i10 = ak2Var.e;
        int i11 = 2;
        int i12 = 1;
        if (i9 == 1) {
            Object[] objArr2 = {t62.N(i10)};
            int i13 = lik.a;
            format = String.format(locale2, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i9 == 2) {
            String N2 = t62.N(i10);
            int i14 = lik.a;
            format = "0.1em 0.12em 0.15em ".concat(N2);
        } else if (i9 == 3) {
            String N3 = t62.N(i10);
            int i15 = lik.a;
            format = "0.06em 0.08em 0.15em ".concat(N3);
        } else if (i9 != 4) {
            format = "unset";
        } else {
            String N4 = t62.N(i10);
            int i16 = lik.a;
            format = "-0.05em -0.05em 0.15em ".concat(N4);
        }
        Object[] objArr3 = {N, b, valueOf, format};
        int i17 = lik.a;
        sb.append(String.format(locale2, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap hashMap = new HashMap();
        String N5 = t62.N(this.d.b);
        String str15 = "background-color:";
        StringBuilder sb2 = new StringBuilder("background-color:");
        sb2.append(N5);
        String str16 = ";";
        sb2.append(";");
        hashMap.put(".default_bg,.default_bg *", sb2.toString());
        int i18 = 0;
        while (i18 < this.c.size()) {
            l74 l74Var = (l74) this.c.get(i18);
            float f4 = l74Var.h;
            int i19 = l74Var.p;
            float f5 = f4 != -3.4028235E38f ? f4 * 100.0f : 50.0f;
            float f6 = f3;
            int i20 = l74Var.i;
            int i21 = -100;
            int i22 = i20 != i12 ? i20 != i11 ? i8 : -100 : -50;
            float f7 = l74Var.e;
            if (f7 == -3.4028235E38f) {
                i = i22;
                format2 = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.f) * 100.0f));
            } else if (l74Var.f != i12) {
                format2 = String.format(Locale.US, "%.2f%%", Float.valueOf(f7 * 100.0f));
                int i23 = l74Var.g;
                if (i19 == i12) {
                    i = i22;
                    i21 = -(i23 != i12 ? i23 != 2 ? 0 : -100 : -50);
                } else {
                    i = i22;
                    i21 = i23 != i12 ? i23 != 2 ? 0 : -100 : -50;
                }
            } else {
                i = i22;
                if (f7 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(f7 * f6));
                    z = false;
                } else {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(((-f7) - 1.0f) * f6));
                    z = true;
                }
                i21 = 0;
                float f8 = l74Var.j;
                String format4 = f8 == -3.4028235E38f ? String.format(locale2, "%.2f%%", Float.valueOf(f8 * 100.0f)) : "fit-content";
                alignment = l74Var.b;
                if (alignment != null) {
                    locale = locale2;
                    obj = TtmlNode.CENTER;
                    i2 = 2;
                } else {
                    int i24 = f1l.a[alignment.ordinal()];
                    locale = locale2;
                    if (i24 != 1) {
                        i2 = 2;
                        obj = i24 != 2 ? TtmlNode.CENTER : TtmlNode.END;
                    } else {
                        i2 = 2;
                        obj = "start";
                    }
                }
                String str17 = i19 == 1 ? i19 != i2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
                String b2 = b(l74Var.o, l74Var.n);
                String N6 = t62.N(!l74Var.l ? l74Var.m : this.d.c);
                String str18 = PlayerKt.E_SPORTS_TOP;
                if (i19 == 1) {
                    if (i19 != 2) {
                        if (z) {
                            str18 = "bottom";
                        }
                        obj2 = "left";
                        str3 = str18;
                        if (i19 != 2 || i19 == 1) {
                            str4 = "height";
                            i3 = i21;
                            i21 = i;
                        } else {
                            str4 = "width";
                            i3 = i;
                        }
                        String str19 = str4;
                        charSequence = l74Var.a;
                        float f9 = getContext().getResources().getDisplayMetrics().density;
                        Pattern pattern = xwh.a;
                        int i25 = i3;
                        int i26 = i18;
                        if (charSequence == null) {
                            kn3Var = new kn3("");
                            str9 = str16;
                            str5 = "";
                        } else {
                            str5 = "";
                            if (charSequence instanceof Spanned) {
                                Spanned spanned = (Spanned) charSequence;
                                HashSet hashSet = new HashSet();
                                str6 = "start";
                                int length = spanned.length();
                                str7 = TtmlNode.END;
                                str8 = TtmlNode.CENTER;
                                BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, length, BackgroundColorSpan.class);
                                int length2 = backgroundColorSpanArr.length;
                                int i27 = 0;
                                while (i27 < length2) {
                                    hashSet.add(Integer.valueOf(backgroundColorSpanArr[i27].getBackgroundColor()));
                                    i27++;
                                    backgroundColorSpanArr = backgroundColorSpanArr;
                                }
                                HashMap hashMap2 = new HashMap();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    int intValue = ((Integer) it.next()).intValue();
                                    String j = ljg.j(intValue, "bg_");
                                    Iterator it2 = it;
                                    String k = bf3.k(".", j, ",.", j, " *");
                                    String N7 = t62.N(intValue);
                                    int i28 = lik.a;
                                    Locale locale3 = Locale.US;
                                    hashMap2.put(k, str15 + N7 + str16);
                                    it = it2;
                                    f5 = f5;
                                }
                                f = f5;
                                SparseArray sparseArray = new SparseArray();
                                Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                                int length3 = spans.length;
                                int i29 = 0;
                                while (i29 < length3) {
                                    Object obj3 = spans[i29];
                                    String str20 = str16;
                                    boolean z3 = obj3 instanceof StrikethroughSpan;
                                    String str21 = null;
                                    if (z3) {
                                        z2 = z3;
                                        format3 = "<span style='text-decoration:line-through;'>";
                                        str11 = str15;
                                    } else {
                                        z2 = z3;
                                        if (obj3 instanceof ForegroundColorSpan) {
                                            String N8 = t62.N(((ForegroundColorSpan) obj3).getForegroundColor());
                                            int i30 = lik.a;
                                            Locale locale4 = Locale.US;
                                            str11 = str15;
                                            format3 = lnb.o("<span style='color:", N8, ";'>");
                                        } else {
                                            str11 = str15;
                                            if (obj3 instanceof BackgroundColorSpan) {
                                                int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                                int i31 = lik.a;
                                                Locale locale5 = Locale.US;
                                                objArr = spans;
                                                format3 = lnb.k(backgroundColor, "<span class='bg_", "'>");
                                            } else {
                                                objArr = spans;
                                                if (obj3 instanceof kf9) {
                                                    format3 = "<span style='text-combine-upright:all;'>";
                                                } else if (obj3 instanceof AbsoluteSizeSpan) {
                                                    Object[] objArr4 = {Float.valueOf(((AbsoluteSizeSpan) obj3).getDip() ? r4.getSize() : r4.getSize() / f9)};
                                                    int i32 = lik.a;
                                                    format3 = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                                } else if (obj3 instanceof RelativeSizeSpan) {
                                                    Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                                    int i33 = lik.a;
                                                    format3 = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                                } else {
                                                    if (obj3 instanceof TypefaceSpan) {
                                                        String family = ((TypefaceSpan) obj3).getFamily();
                                                        if (family != null) {
                                                            int i34 = lik.a;
                                                            Locale locale6 = Locale.US;
                                                            format3 = lnb.o("<span style='font-family:\"", family, "\";'>");
                                                        }
                                                        i4 = length3;
                                                        i5 = i29;
                                                        format3 = null;
                                                    } else if (obj3 instanceof StyleSpan) {
                                                        int style = ((StyleSpan) obj3).getStyle();
                                                        if (style == 1) {
                                                            format3 = "<b>";
                                                        } else if (style != 2) {
                                                            if (style == 3) {
                                                                format3 = "<b><i>";
                                                            }
                                                            i4 = length3;
                                                            i5 = i29;
                                                            format3 = null;
                                                        } else {
                                                            format3 = "<i>";
                                                        }
                                                    } else if (obj3 instanceof h9g) {
                                                        int i35 = ((h9g) obj3).b;
                                                        if (i35 == -1) {
                                                            format3 = "<ruby style='ruby-position:unset;'>";
                                                        } else if (i35 != 1) {
                                                            if (i35 == 2) {
                                                                format3 = "<ruby style='ruby-position:under;'>";
                                                            }
                                                            i4 = length3;
                                                            i5 = i29;
                                                            format3 = null;
                                                        } else {
                                                            format3 = "<ruby style='ruby-position:over;'>";
                                                        }
                                                    } else if (obj3 instanceof UnderlineSpan) {
                                                        format3 = "<u>";
                                                    } else {
                                                        if (obj3 instanceof i9j) {
                                                            i9j i9jVar = (i9j) obj3;
                                                            int i36 = i9jVar.a;
                                                            int i37 = i9jVar.b;
                                                            i4 = length3;
                                                            StringBuilder sb3 = new StringBuilder();
                                                            i5 = i29;
                                                            if (i37 != 1) {
                                                                i6 = 2;
                                                                if (i37 == 2) {
                                                                    sb3.append("open ");
                                                                }
                                                            } else {
                                                                i6 = 2;
                                                                sb3.append("filled ");
                                                            }
                                                            if (i36 == 0) {
                                                                sb3.append("none");
                                                            } else if (i36 == 1) {
                                                                sb3.append("circle");
                                                            } else if (i36 == i6) {
                                                                sb3.append("dot");
                                                            } else if (i36 != 3) {
                                                                sb3.append("unset");
                                                            } else {
                                                                sb3.append("sesame");
                                                            }
                                                            Object[] objArr6 = {sb3.toString(), i9jVar.c != 2 ? "over right" : "under left"};
                                                            int i38 = lik.a;
                                                            format3 = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                                        }
                                                        i4 = length3;
                                                        i5 = i29;
                                                        format3 = null;
                                                    }
                                                    if (!z2 || (obj3 instanceof ForegroundColorSpan) || (obj3 instanceof BackgroundColorSpan) || (obj3 instanceof kf9) || (obj3 instanceof AbsoluteSizeSpan) || (obj3 instanceof RelativeSizeSpan) || (obj3 instanceof i9j)) {
                                                        str12 = "</span>";
                                                    } else if (obj3 instanceof TypefaceSpan) {
                                                        str12 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                                    } else {
                                                        if (obj3 instanceof StyleSpan) {
                                                            int style2 = ((StyleSpan) obj3).getStyle();
                                                            if (style2 == 1) {
                                                                str21 = "</b>";
                                                            } else if (style2 == 2) {
                                                                str21 = "</i>";
                                                            } else if (style2 == 3) {
                                                                str21 = "</i></b>";
                                                            }
                                                        } else if (obj3 instanceof h9g) {
                                                            str21 = "<rt>" + xwh.a(((h9g) obj3).a) + "</rt></ruby>";
                                                        } else if (obj3 instanceof UnderlineSpan) {
                                                            str21 = "</u>";
                                                        }
                                                        str12 = str21;
                                                    }
                                                    int spanStart = spanned.getSpanStart(obj3);
                                                    int spanEnd = spanned.getSpanEnd(obj3);
                                                    if (format3 != null) {
                                                        str12.getClass();
                                                        twh twhVar = new twh(spanStart, spanEnd, format3, str12);
                                                        vwh vwhVar = (vwh) sparseArray.get(spanStart);
                                                        if (vwhVar == null) {
                                                            vwhVar = new vwh();
                                                            sparseArray.put(spanStart, vwhVar);
                                                        }
                                                        vwhVar.a.add(twhVar);
                                                        vwh vwhVar2 = (vwh) sparseArray.get(spanEnd);
                                                        if (vwhVar2 == null) {
                                                            vwhVar2 = new vwh();
                                                            sparseArray.put(spanEnd, vwhVar2);
                                                        }
                                                        vwhVar2.b.add(twhVar);
                                                    }
                                                    i29 = i5 + 1;
                                                    spans = objArr;
                                                    str16 = str20;
                                                    str15 = str11;
                                                    length3 = i4;
                                                }
                                            }
                                            i4 = length3;
                                            i5 = i29;
                                            if (z2) {
                                            }
                                            str12 = "</span>";
                                            int spanStart2 = spanned.getSpanStart(obj3);
                                            int spanEnd2 = spanned.getSpanEnd(obj3);
                                            if (format3 != null) {
                                            }
                                            i29 = i5 + 1;
                                            spans = objArr;
                                            str16 = str20;
                                            str15 = str11;
                                            length3 = i4;
                                        }
                                    }
                                    objArr = spans;
                                    i4 = length3;
                                    i5 = i29;
                                    if (z2) {
                                    }
                                    str12 = "</span>";
                                    int spanStart22 = spanned.getSpanStart(obj3);
                                    int spanEnd22 = spanned.getSpanEnd(obj3);
                                    if (format3 != null) {
                                    }
                                    i29 = i5 + 1;
                                    spans = objArr;
                                    str16 = str20;
                                    str15 = str11;
                                    length3 = i4;
                                }
                                str9 = str16;
                                str10 = str15;
                                StringBuilder sb4 = new StringBuilder(spanned.length());
                                int i39 = 0;
                                int i40 = 0;
                                while (i40 < sparseArray.size()) {
                                    int keyAt = sparseArray.keyAt(i40);
                                    sb4.append(xwh.a(spanned.subSequence(i39, keyAt)));
                                    vwh vwhVar3 = (vwh) sparseArray.get(keyAt);
                                    ArrayList arrayList = vwhVar3.b;
                                    ArrayList arrayList2 = vwhVar3.a;
                                    SparseArray sparseArray2 = sparseArray;
                                    Collections.sort(arrayList, twh.f);
                                    Iterator it3 = vwhVar3.b.iterator();
                                    while (it3.hasNext()) {
                                        sb4.append(((twh) it3.next()).d);
                                    }
                                    Collections.sort(arrayList2, twh.e);
                                    Iterator it4 = arrayList2.iterator();
                                    while (it4.hasNext()) {
                                        sb4.append(((twh) it4.next()).c);
                                    }
                                    i40++;
                                    i39 = keyAt;
                                    sparseArray = sparseArray2;
                                }
                                sb4.append(xwh.a(spanned.subSequence(i39, spanned.length())));
                                kn3Var = new kn3(sb4.toString());
                                String str22 = kn3Var.a;
                                for (String str23 : hashMap.keySet()) {
                                    String str24 = (String) hashMap.put(str23, (String) hashMap.get(str23));
                                    qx9.t(str24 == null || str24.equals(hashMap.get(str23)));
                                }
                                Integer valueOf2 = Integer.valueOf(i26);
                                Float valueOf3 = Float.valueOf(f);
                                Integer valueOf4 = Integer.valueOf(i25);
                                Integer valueOf5 = Integer.valueOf(i21);
                                f2 = l74Var.q;
                                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    Object[] objArr7 = {(i19 == 2 || i19 == 1) ? "skewY" : "skewX", Float.valueOf(f2)};
                                    int i41 = lik.a;
                                    str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                                } else {
                                    str13 = str5;
                                }
                                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf2, obj2, valueOf3, str3, str, str19, format4, obj, str17, b2, N6, valueOf4, valueOf5, str13));
                                sb.append("<span class='default_bg'>");
                                alignment2 = l74Var.c;
                                if (alignment2 == null) {
                                    int i42 = f1l.a[alignment2.ordinal()];
                                    if (i42 != 1) {
                                        i7 = 2;
                                        str14 = i42 != 2 ? str8 : str7;
                                    } else {
                                        i7 = 2;
                                        str14 = str6;
                                    }
                                    sb.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                                    sb.append(str22);
                                    sb.append("</span>");
                                } else {
                                    i7 = 2;
                                    sb.append(str22);
                                }
                                sb.append("</span></div>");
                                i18 = i26 + 1;
                                i11 = i7;
                                locale2 = locale;
                                f3 = f6;
                                str16 = str9;
                                str15 = str10;
                                i8 = 0;
                                i12 = 1;
                            } else {
                                str9 = str16;
                                kn3Var = new kn3(xwh.a(charSequence));
                            }
                        }
                        str10 = str15;
                        str6 = "start";
                        str7 = TtmlNode.END;
                        str8 = TtmlNode.CENTER;
                        f = f5;
                        String str222 = kn3Var.a;
                        while (r4.hasNext()) {
                        }
                        Integer valueOf22 = Integer.valueOf(i26);
                        Float valueOf32 = Float.valueOf(f);
                        Integer valueOf42 = Integer.valueOf(i25);
                        Integer valueOf52 = Integer.valueOf(i21);
                        f2 = l74Var.q;
                        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        }
                        sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf22, obj2, valueOf32, str3, str, str19, format4, obj, str17, b2, N6, valueOf42, valueOf52, str13));
                        sb.append("<span class='default_bg'>");
                        alignment2 = l74Var.c;
                        if (alignment2 == null) {
                        }
                        sb.append("</span></div>");
                        i18 = i26 + 1;
                        i11 = i7;
                        locale2 = locale;
                        f3 = f6;
                        str16 = str9;
                        str15 = str10;
                        i8 = 0;
                        i12 = 1;
                    }
                }
                str3 = str2;
                obj2 = PlayerKt.E_SPORTS_TOP;
                if (i19 != 2) {
                }
                str4 = "height";
                i3 = i21;
                i21 = i;
                String str192 = str4;
                charSequence = l74Var.a;
                float f92 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern2 = xwh.a;
                int i252 = i3;
                int i262 = i18;
                if (charSequence == null) {
                }
                str10 = str15;
                str6 = "start";
                str7 = TtmlNode.END;
                str8 = TtmlNode.CENTER;
                f = f5;
                String str2222 = kn3Var.a;
                while (r4.hasNext()) {
                }
                Integer valueOf222 = Integer.valueOf(i262);
                Float valueOf322 = Float.valueOf(f);
                Integer valueOf422 = Integer.valueOf(i252);
                Integer valueOf522 = Integer.valueOf(i21);
                f2 = l74Var.q;
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf222, obj2, valueOf322, str3, str, str192, format4, obj, str17, b2, N6, valueOf422, valueOf522, str13));
                sb.append("<span class='default_bg'>");
                alignment2 = l74Var.c;
                if (alignment2 == null) {
                }
                sb.append("</span></div>");
                i18 = i262 + 1;
                i11 = i7;
                locale2 = locale;
                f3 = f6;
                str16 = str9;
                str15 = str10;
                i8 = 0;
                i12 = 1;
            }
            str = format2;
            z = false;
            float f82 = l74Var.j;
            String format42 = f82 == -3.4028235E38f ? String.format(locale2, "%.2f%%", Float.valueOf(f82 * 100.0f)) : "fit-content";
            alignment = l74Var.b;
            if (alignment != null) {
            }
            String str172 = i19 == 1 ? i19 != i2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
            String b22 = b(l74Var.o, l74Var.n);
            String N62 = t62.N(!l74Var.l ? l74Var.m : this.d.c);
            String str182 = PlayerKt.E_SPORTS_TOP;
            if (i19 == 1) {
            }
            str3 = str2;
            obj2 = PlayerKt.E_SPORTS_TOP;
            if (i19 != 2) {
            }
            str4 = "height";
            i3 = i21;
            i21 = i;
            String str1922 = str4;
            charSequence = l74Var.a;
            float f922 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern22 = xwh.a;
            int i2522 = i3;
            int i2622 = i18;
            if (charSequence == null) {
            }
            str10 = str15;
            str6 = "start";
            str7 = TtmlNode.END;
            str8 = TtmlNode.CENTER;
            f = f5;
            String str22222 = kn3Var.a;
            while (r4.hasNext()) {
            }
            Integer valueOf2222 = Integer.valueOf(i2622);
            Float valueOf3222 = Float.valueOf(f);
            Integer valueOf4222 = Integer.valueOf(i2522);
            Integer valueOf5222 = Integer.valueOf(i21);
            f2 = l74Var.q;
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf2222, obj2, valueOf3222, str3, str, str1922, format42, obj, str172, b22, N62, valueOf4222, valueOf5222, str13));
            sb.append("<span class='default_bg'>");
            alignment2 = l74Var.c;
            if (alignment2 == null) {
            }
            sb.append("</span></div>");
            i18 = i2622 + 1;
            i11 = i7;
            locale2 = locale;
            f3 = f6;
            str16 = str9;
            str15 = str10;
            i8 = 0;
            i12 = 1;
        }
        sb.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder("<html><head><style>");
        for (String str25 : hashMap.keySet()) {
            sb5.append(str25);
            sb5.append("{");
            sb5.append((String) hashMap.get(str25));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb.insert(0, sb5.toString());
        this.b.loadData(Base64.encodeToString(sb.toString().getBytes(xp2.c), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        c();
    }
}
