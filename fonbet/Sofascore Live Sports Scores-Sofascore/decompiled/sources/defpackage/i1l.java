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
import java.nio.charset.StandardCharsets;
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
public final class i1l extends FrameLayout implements cmi {
    public final zj2 a;
    public final e1l b;
    public List c;
    public bk2 d;
    public float e;
    public float f;

    public i1l(Context context) {
        super(context, null);
        this.c = Collections.EMPTY_LIST;
        this.d = bk2.g;
        this.e = 0.0533f;
        this.f = 0.08f;
        zj2 zj2Var = new zj2(context, 0);
        this.a = zj2Var;
        e1l e1lVar = new e1l(context, null, 1);
        this.b = e1lVar;
        e1lVar.setBackgroundColor(0);
        e1lVar.getSettings().setAllowContentAccess(false);
        addView(zj2Var);
        addView(e1lVar);
    }

    @Override // defpackage.cmi
    public final void a(List list, bk2 bk2Var, float f, float f2) {
        this.d = bk2Var;
        this.e = f;
        this.f = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            m74 m74Var = (m74) list.get(i);
            if (m74Var.d != null) {
                arrayList.add(m74Var);
            } else {
                arrayList2.add(m74Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, bk2Var, f, f2);
        invalidate();
    }

    public final String b(float f, int i) {
        float P = sha.P(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (P == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(P / getContext().getResources().getDisplayMetrics().density)};
        String str = nik.a;
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
    /* JADX WARN: Removed duplicated region for block: B:100:0x0628  */
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
    /* JADX WARN: Removed duplicated region for block: B:66:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0605  */
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
        k02 k02Var;
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
        String I = j72.I(this.d.a);
        int i8 = 0;
        String b = b(this.e, 0);
        float f3 = 1.2f;
        Float valueOf = Float.valueOf(1.2f);
        bk2 bk2Var = this.d;
        int i9 = bk2Var.d;
        int i10 = bk2Var.e;
        int i11 = 2;
        int i12 = 1;
        if (i9 == 1) {
            Object[] objArr2 = {j72.I(i10)};
            String str15 = nik.a;
            format = String.format(locale2, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i9 == 2) {
            String I2 = j72.I(i10);
            String str16 = nik.a;
            format = "0.1em 0.12em 0.15em ".concat(I2);
        } else if (i9 == 3) {
            String I3 = j72.I(i10);
            String str17 = nik.a;
            format = "0.06em 0.08em 0.15em ".concat(I3);
        } else if (i9 != 4) {
            format = "unset";
        } else {
            String I4 = j72.I(i10);
            String str18 = nik.a;
            format = "-0.05em -0.05em 0.15em ".concat(I4);
        }
        Object[] objArr3 = {I, b, valueOf, format};
        String str19 = nik.a;
        sb.append(String.format(locale2, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap hashMap = new HashMap();
        String I5 = j72.I(this.d.b);
        String str20 = "background-color:";
        StringBuilder sb2 = new StringBuilder("background-color:");
        sb2.append(I5);
        String str21 = ";";
        sb2.append(";");
        hashMap.put(".default_bg,.default_bg *", sb2.toString());
        int i13 = 0;
        while (i13 < this.c.size()) {
            m74 m74Var = (m74) this.c.get(i13);
            float f4 = m74Var.h;
            int i14 = m74Var.p;
            float f5 = f4 != -3.4028235E38f ? f4 * 100.0f : 50.0f;
            float f6 = f3;
            int i15 = m74Var.i;
            int i16 = -100;
            int i17 = i15 != i12 ? i15 != i11 ? i8 : -100 : -50;
            float f7 = m74Var.e;
            if (f7 == -3.4028235E38f) {
                i = i17;
                format2 = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.f) * 100.0f));
            } else if (m74Var.f != i12) {
                format2 = String.format(Locale.US, "%.2f%%", Float.valueOf(f7 * 100.0f));
                int i18 = m74Var.g;
                if (i14 == i12) {
                    i = i17;
                    i16 = -(i18 != i12 ? i18 != 2 ? 0 : -100 : -50);
                } else {
                    i = i17;
                    i16 = i18 != i12 ? i18 != 2 ? 0 : -100 : -50;
                }
            } else {
                i = i17;
                if (f7 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(f7 * f6));
                    z = false;
                } else {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(((-f7) - 1.0f) * f6));
                    z = true;
                }
                i16 = 0;
                float f8 = m74Var.j;
                String format4 = f8 == -3.4028235E38f ? String.format(locale2, "%.2f%%", Float.valueOf(f8 * 100.0f)) : "fit-content";
                alignment = m74Var.b;
                if (alignment != null) {
                    locale = locale2;
                    obj = TtmlNode.CENTER;
                    i2 = 2;
                } else {
                    int i19 = g1l.a[alignment.ordinal()];
                    locale = locale2;
                    if (i19 != 1) {
                        i2 = 2;
                        obj = i19 != 2 ? TtmlNode.CENTER : TtmlNode.END;
                    } else {
                        i2 = 2;
                        obj = "start";
                    }
                }
                String str22 = i14 == 1 ? i14 != i2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
                String b2 = b(m74Var.o, m74Var.n);
                String I6 = j72.I(!m74Var.l ? m74Var.m : this.d.c);
                String str23 = PlayerKt.E_SPORTS_TOP;
                if (i14 == 1) {
                    if (i14 != 2) {
                        if (z) {
                            str23 = "bottom";
                        }
                        obj2 = "left";
                        str3 = str23;
                        if (i14 != 2 || i14 == 1) {
                            str4 = "height";
                            i3 = i16;
                            i16 = i;
                        } else {
                            str4 = "width";
                            i3 = i;
                        }
                        String str24 = str4;
                        charSequence = m74Var.a;
                        float f9 = getContext().getResources().getDisplayMetrics().density;
                        Pattern pattern = ywh.a;
                        int i20 = i3;
                        int i21 = i13;
                        if (charSequence == null) {
                            k02Var = new k02("");
                            str9 = str21;
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
                                int i22 = 0;
                                while (i22 < length2) {
                                    hashSet.add(Integer.valueOf(backgroundColorSpanArr[i22].getBackgroundColor()));
                                    i22++;
                                    backgroundColorSpanArr = backgroundColorSpanArr;
                                }
                                HashMap hashMap2 = new HashMap();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    int intValue = ((Integer) it.next()).intValue();
                                    String j = ljg.j(intValue, "bg_");
                                    Iterator it2 = it;
                                    String k = bf3.k(".", j, ",.", j, " *");
                                    String I7 = j72.I(intValue);
                                    String str25 = nik.a;
                                    Locale locale3 = Locale.US;
                                    hashMap2.put(k, str20 + I7 + str21);
                                    it = it2;
                                    f5 = f5;
                                }
                                f = f5;
                                SparseArray sparseArray = new SparseArray();
                                Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                                int length3 = spans.length;
                                int i23 = 0;
                                while (i23 < length3) {
                                    Object obj3 = spans[i23];
                                    String str26 = str21;
                                    boolean z3 = obj3 instanceof StrikethroughSpan;
                                    String str27 = null;
                                    if (z3) {
                                        z2 = z3;
                                        format3 = "<span style='text-decoration:line-through;'>";
                                        str11 = str20;
                                    } else {
                                        z2 = z3;
                                        if (obj3 instanceof ForegroundColorSpan) {
                                            String I8 = j72.I(((ForegroundColorSpan) obj3).getForegroundColor());
                                            String str28 = nik.a;
                                            Locale locale4 = Locale.US;
                                            str11 = str20;
                                            format3 = lnb.o("<span style='color:", I8, ";'>");
                                        } else {
                                            str11 = str20;
                                            if (obj3 instanceof BackgroundColorSpan) {
                                                int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                                String str29 = nik.a;
                                                Locale locale5 = Locale.US;
                                                objArr = spans;
                                                format3 = lnb.k(backgroundColor, "<span class='bg_", "'>");
                                            } else {
                                                objArr = spans;
                                                if (obj3 instanceof lf9) {
                                                    format3 = "<span style='text-combine-upright:all;'>";
                                                } else if (obj3 instanceof AbsoluteSizeSpan) {
                                                    Object[] objArr4 = {Float.valueOf(((AbsoluteSizeSpan) obj3).getDip() ? r4.getSize() : r4.getSize() / f9)};
                                                    String str30 = nik.a;
                                                    format3 = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                                } else if (obj3 instanceof RelativeSizeSpan) {
                                                    Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                                    String str31 = nik.a;
                                                    format3 = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                                } else {
                                                    if (obj3 instanceof TypefaceSpan) {
                                                        String family = ((TypefaceSpan) obj3).getFamily();
                                                        if (family != null) {
                                                            String str32 = nik.a;
                                                            Locale locale6 = Locale.US;
                                                            format3 = lnb.o("<span style='font-family:\"", family, "\";'>");
                                                        }
                                                        i4 = length3;
                                                        i5 = i23;
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
                                                            i5 = i23;
                                                            format3 = null;
                                                        } else {
                                                            format3 = "<i>";
                                                        }
                                                    } else if (obj3 instanceof i9g) {
                                                        int i24 = ((i9g) obj3).b;
                                                        if (i24 == -1) {
                                                            format3 = "<ruby style='ruby-position:unset;'>";
                                                        } else if (i24 != 1) {
                                                            if (i24 == 2) {
                                                                format3 = "<ruby style='ruby-position:under;'>";
                                                            }
                                                            i4 = length3;
                                                            i5 = i23;
                                                            format3 = null;
                                                        } else {
                                                            format3 = "<ruby style='ruby-position:over;'>";
                                                        }
                                                    } else if (obj3 instanceof UnderlineSpan) {
                                                        format3 = "<u>";
                                                    } else {
                                                        if (obj3 instanceof j9j) {
                                                            j9j j9jVar = (j9j) obj3;
                                                            int i25 = j9jVar.a;
                                                            int i26 = j9jVar.b;
                                                            i4 = length3;
                                                            StringBuilder sb3 = new StringBuilder();
                                                            i5 = i23;
                                                            if (i26 != 1) {
                                                                i6 = 2;
                                                                if (i26 == 2) {
                                                                    sb3.append("open ");
                                                                }
                                                            } else {
                                                                i6 = 2;
                                                                sb3.append("filled ");
                                                            }
                                                            if (i25 == 0) {
                                                                sb3.append("none");
                                                            } else if (i25 == 1) {
                                                                sb3.append("circle");
                                                            } else if (i25 == i6) {
                                                                sb3.append("dot");
                                                            } else if (i25 != 3) {
                                                                sb3.append("unset");
                                                            } else {
                                                                sb3.append("sesame");
                                                            }
                                                            Object[] objArr6 = {sb3.toString(), j9jVar.c != 2 ? "over right" : "under left"};
                                                            String str33 = nik.a;
                                                            format3 = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                                        }
                                                        i4 = length3;
                                                        i5 = i23;
                                                        format3 = null;
                                                    }
                                                    if (!z2 || (obj3 instanceof ForegroundColorSpan) || (obj3 instanceof BackgroundColorSpan) || (obj3 instanceof lf9) || (obj3 instanceof AbsoluteSizeSpan) || (obj3 instanceof RelativeSizeSpan) || (obj3 instanceof j9j)) {
                                                        str12 = "</span>";
                                                    } else if (obj3 instanceof TypefaceSpan) {
                                                        str12 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                                    } else {
                                                        if (obj3 instanceof StyleSpan) {
                                                            int style2 = ((StyleSpan) obj3).getStyle();
                                                            if (style2 == 1) {
                                                                str27 = "</b>";
                                                            } else if (style2 == 2) {
                                                                str27 = "</i>";
                                                            } else if (style2 == 3) {
                                                                str27 = "</i></b>";
                                                            }
                                                        } else if (obj3 instanceof i9g) {
                                                            str27 = "<rt>" + ywh.a(((i9g) obj3).a) + "</rt></ruby>";
                                                        } else if (obj3 instanceof UnderlineSpan) {
                                                            str27 = "</u>";
                                                        }
                                                        str12 = str27;
                                                    }
                                                    int spanStart = spanned.getSpanStart(obj3);
                                                    int spanEnd = spanned.getSpanEnd(obj3);
                                                    if (format3 != null) {
                                                        str12.getClass();
                                                        uwh uwhVar = new uwh(spanStart, spanEnd, format3, str12);
                                                        wwh wwhVar = (wwh) sparseArray.get(spanStart);
                                                        if (wwhVar == null) {
                                                            wwhVar = new wwh();
                                                            sparseArray.put(spanStart, wwhVar);
                                                        }
                                                        wwhVar.a.add(uwhVar);
                                                        wwh wwhVar2 = (wwh) sparseArray.get(spanEnd);
                                                        if (wwhVar2 == null) {
                                                            wwhVar2 = new wwh();
                                                            sparseArray.put(spanEnd, wwhVar2);
                                                        }
                                                        wwhVar2.b.add(uwhVar);
                                                    }
                                                    i23 = i5 + 1;
                                                    spans = objArr;
                                                    str21 = str26;
                                                    str20 = str11;
                                                    length3 = i4;
                                                }
                                            }
                                            i4 = length3;
                                            i5 = i23;
                                            if (z2) {
                                            }
                                            str12 = "</span>";
                                            int spanStart2 = spanned.getSpanStart(obj3);
                                            int spanEnd2 = spanned.getSpanEnd(obj3);
                                            if (format3 != null) {
                                            }
                                            i23 = i5 + 1;
                                            spans = objArr;
                                            str21 = str26;
                                            str20 = str11;
                                            length3 = i4;
                                        }
                                    }
                                    objArr = spans;
                                    i4 = length3;
                                    i5 = i23;
                                    if (z2) {
                                    }
                                    str12 = "</span>";
                                    int spanStart22 = spanned.getSpanStart(obj3);
                                    int spanEnd22 = spanned.getSpanEnd(obj3);
                                    if (format3 != null) {
                                    }
                                    i23 = i5 + 1;
                                    spans = objArr;
                                    str21 = str26;
                                    str20 = str11;
                                    length3 = i4;
                                }
                                str9 = str21;
                                str10 = str20;
                                StringBuilder sb4 = new StringBuilder(spanned.length());
                                int i27 = 0;
                                int i28 = 0;
                                while (i28 < sparseArray.size()) {
                                    int keyAt = sparseArray.keyAt(i28);
                                    sb4.append(ywh.a(spanned.subSequence(i27, keyAt)));
                                    wwh wwhVar3 = (wwh) sparseArray.get(keyAt);
                                    ArrayList arrayList = wwhVar3.b;
                                    ArrayList arrayList2 = wwhVar3.a;
                                    SparseArray sparseArray2 = sparseArray;
                                    Collections.sort(arrayList, uwh.f);
                                    Iterator it3 = wwhVar3.b.iterator();
                                    while (it3.hasNext()) {
                                        sb4.append(((uwh) it3.next()).d);
                                    }
                                    Collections.sort(arrayList2, uwh.e);
                                    Iterator it4 = arrayList2.iterator();
                                    while (it4.hasNext()) {
                                        sb4.append(((uwh) it4.next()).c);
                                    }
                                    i28++;
                                    i27 = keyAt;
                                    sparseArray = sparseArray2;
                                }
                                sb4.append(ywh.a(spanned.subSequence(i27, spanned.length())));
                                k02Var = new k02(sb4.toString());
                                for (String str34 : hashMap.keySet()) {
                                    String str35 = (String) hashMap.put(str34, (String) hashMap.get(str34));
                                    z1a.E(str35 == null || str35.equals(hashMap.get(str34)));
                                }
                                Integer valueOf2 = Integer.valueOf(i21);
                                Float valueOf3 = Float.valueOf(f);
                                Integer valueOf4 = Integer.valueOf(i20);
                                Integer valueOf5 = Integer.valueOf(i16);
                                f2 = m74Var.q;
                                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    Object[] objArr7 = {(i14 == 2 || i14 == 1) ? "skewY" : "skewX", Float.valueOf(f2)};
                                    String str36 = nik.a;
                                    str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                                } else {
                                    str13 = str5;
                                }
                                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf2, obj2, valueOf3, str3, str, str24, format4, obj, str22, b2, I6, valueOf4, valueOf5, str13));
                                sb.append("<span class='default_bg'>");
                                alignment2 = m74Var.c;
                                String str37 = k02Var.a;
                                if (alignment2 == null) {
                                    int i29 = g1l.a[alignment2.ordinal()];
                                    if (i29 != 1) {
                                        i7 = 2;
                                        str14 = i29 != 2 ? str8 : str7;
                                    } else {
                                        i7 = 2;
                                        str14 = str6;
                                    }
                                    sb.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                                    sb.append(str37);
                                    sb.append("</span>");
                                } else {
                                    i7 = 2;
                                    sb.append(str37);
                                }
                                sb.append("</span></div>");
                                i13 = i21 + 1;
                                i11 = i7;
                                locale2 = locale;
                                f3 = f6;
                                str21 = str9;
                                str20 = str10;
                                i8 = 0;
                                i12 = 1;
                            } else {
                                str9 = str21;
                                k02Var = new k02(ywh.a(charSequence));
                            }
                        }
                        str10 = str20;
                        str6 = "start";
                        str7 = TtmlNode.END;
                        str8 = TtmlNode.CENTER;
                        f = f5;
                        while (r4.hasNext()) {
                        }
                        Integer valueOf22 = Integer.valueOf(i21);
                        Float valueOf32 = Float.valueOf(f);
                        Integer valueOf42 = Integer.valueOf(i20);
                        Integer valueOf52 = Integer.valueOf(i16);
                        f2 = m74Var.q;
                        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        }
                        sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf22, obj2, valueOf32, str3, str, str24, format4, obj, str22, b2, I6, valueOf42, valueOf52, str13));
                        sb.append("<span class='default_bg'>");
                        alignment2 = m74Var.c;
                        String str372 = k02Var.a;
                        if (alignment2 == null) {
                        }
                        sb.append("</span></div>");
                        i13 = i21 + 1;
                        i11 = i7;
                        locale2 = locale;
                        f3 = f6;
                        str21 = str9;
                        str20 = str10;
                        i8 = 0;
                        i12 = 1;
                    }
                }
                str3 = str2;
                obj2 = PlayerKt.E_SPORTS_TOP;
                if (i14 != 2) {
                }
                str4 = "height";
                i3 = i16;
                i16 = i;
                String str242 = str4;
                charSequence = m74Var.a;
                float f92 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern2 = ywh.a;
                int i202 = i3;
                int i212 = i13;
                if (charSequence == null) {
                }
                str10 = str20;
                str6 = "start";
                str7 = TtmlNode.END;
                str8 = TtmlNode.CENTER;
                f = f5;
                while (r4.hasNext()) {
                }
                Integer valueOf222 = Integer.valueOf(i212);
                Float valueOf322 = Float.valueOf(f);
                Integer valueOf422 = Integer.valueOf(i202);
                Integer valueOf522 = Integer.valueOf(i16);
                f2 = m74Var.q;
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf222, obj2, valueOf322, str3, str, str242, format4, obj, str22, b2, I6, valueOf422, valueOf522, str13));
                sb.append("<span class='default_bg'>");
                alignment2 = m74Var.c;
                String str3722 = k02Var.a;
                if (alignment2 == null) {
                }
                sb.append("</span></div>");
                i13 = i212 + 1;
                i11 = i7;
                locale2 = locale;
                f3 = f6;
                str21 = str9;
                str20 = str10;
                i8 = 0;
                i12 = 1;
            }
            str = format2;
            z = false;
            float f82 = m74Var.j;
            String format42 = f82 == -3.4028235E38f ? String.format(locale2, "%.2f%%", Float.valueOf(f82 * 100.0f)) : "fit-content";
            alignment = m74Var.b;
            if (alignment != null) {
            }
            String str222 = i14 == 1 ? i14 != i2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
            String b22 = b(m74Var.o, m74Var.n);
            String I62 = j72.I(!m74Var.l ? m74Var.m : this.d.c);
            String str232 = PlayerKt.E_SPORTS_TOP;
            if (i14 == 1) {
            }
            str3 = str2;
            obj2 = PlayerKt.E_SPORTS_TOP;
            if (i14 != 2) {
            }
            str4 = "height";
            i3 = i16;
            i16 = i;
            String str2422 = str4;
            charSequence = m74Var.a;
            float f922 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern22 = ywh.a;
            int i2022 = i3;
            int i2122 = i13;
            if (charSequence == null) {
            }
            str10 = str20;
            str6 = "start";
            str7 = TtmlNode.END;
            str8 = TtmlNode.CENTER;
            f = f5;
            while (r4.hasNext()) {
            }
            Integer valueOf2222 = Integer.valueOf(i2122);
            Float valueOf3222 = Float.valueOf(f);
            Integer valueOf4222 = Integer.valueOf(i2022);
            Integer valueOf5222 = Integer.valueOf(i16);
            f2 = m74Var.q;
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf2222, obj2, valueOf3222, str3, str, str2422, format42, obj, str222, b22, I62, valueOf4222, valueOf5222, str13));
            sb.append("<span class='default_bg'>");
            alignment2 = m74Var.c;
            String str37222 = k02Var.a;
            if (alignment2 == null) {
            }
            sb.append("</span></div>");
            i13 = i2122 + 1;
            i11 = i7;
            locale2 = locale;
            f3 = f6;
            str21 = str9;
            str20 = str10;
            i8 = 0;
            i12 = 1;
        }
        sb.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (String str38 : hashMap.keySet()) {
            sb5.append(str38);
            sb5.append("{");
            sb5.append((String) hashMap.get(str38));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb.insert(0, (CharSequence) sb5);
        this.b.loadData(Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
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
