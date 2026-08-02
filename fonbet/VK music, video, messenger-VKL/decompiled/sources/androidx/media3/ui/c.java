package androidx.media3.ui;

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
import androidx.media3.ui.SubtitleView;
import androidx.media3.ui.b;
import com.google.common.collect.h;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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
import xsna.fxc0;
import xsna.i1n0;
import xsna.jfo0;
import xsna.jvi;
import xsna.lhg;
import xsna.ljx0;
import xsna.mrg0;
import xsna.rkk;
import xsna.ss9;
import xsna.tgw;
import xsna.xfv;
import xsna.y2r0;
import xsna.yr9;
import xsna.zr;

/* compiled from: WebViewSubtitleOutput.java */
/* loaded from: classes12.dex */
public final class c extends FrameLayout implements SubtitleView.a {
    public final androidx.media3.ui.a b;
    public final ljx0 c;
    public List<rkk> d;
    public yr9 e;
    public float f;
    public float g;

    /* compiled from: WebViewSubtitleOutput.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(Context context) {
        super(context, null);
        this.d = Collections.EMPTY_LIST;
        this.e = yr9.g;
        this.f = 0.0533f;
        this.g = 0.08f;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context, 0);
        this.b = aVar;
        ljx0 ljx0Var = new ljx0(context, null);
        this.c = ljx0Var;
        ljx0Var.setBackgroundColor(0);
        ljx0Var.getSettings().setAllowContentAccess(false);
        addView(aVar);
        addView(ljx0Var);
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List list, yr9 yr9Var, float f, float f2) {
        this.e = yr9Var;
        this.f = f;
        this.g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            rkk rkkVar = (rkk) list.get(i);
            if (rkkVar.d != null) {
                arrayList.add(rkkVar);
            } else {
                arrayList2.add(rkkVar);
            }
        }
        if (!this.d.isEmpty() || !arrayList2.isEmpty()) {
            this.d = arrayList2;
            c();
        }
        this.b.a(arrayList, yr9Var, f, f2);
        invalidate();
    }

    public final String b(float f, int i) {
        float b = i1n0.b(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (b == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(b / getContext().getResources().getDisplayMetrics().density)};
        String str = y2r0.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x01ed, code lost:
    
        if (r10 != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x01ef, code lost:
    
        r4 = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x01f2, code lost:
    
        r4 = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x01f9, code lost:
    
        if (r10 != 0) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0625  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        String format;
        String format2;
        String str;
        int i;
        Layout.Alignment alignment;
        int i2;
        Object obj;
        int i3;
        String str2;
        String str3;
        Object obj2;
        String str4;
        CharSequence charSequence;
        String str5;
        String str6;
        float f;
        String str7;
        String str8;
        String str9;
        b.a aVar;
        boolean z;
        Object[] objArr;
        int i4;
        int i5;
        int i6;
        String format3;
        String str10;
        float f2;
        String str11;
        Layout.Alignment alignment2;
        String str12;
        c cVar = this;
        StringBuilder sb = new StringBuilder();
        String h = jvi.h(cVar.e.a);
        int i7 = 0;
        String b = cVar.b(cVar.f, 0);
        float f3 = 1.2f;
        Float valueOf = Float.valueOf(1.2f);
        yr9 yr9Var = cVar.e;
        int i8 = yr9Var.d;
        int i9 = yr9Var.e;
        int i10 = 2;
        int i11 = 1;
        if (i8 == 1) {
            Object[] objArr2 = {jvi.h(i9)};
            String str13 = y2r0.a;
            format = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i8 == 2) {
            String h2 = jvi.h(i9);
            String str14 = y2r0.a;
            Locale locale = Locale.US;
            format = "0.1em 0.12em 0.15em ".concat(h2);
        } else if (i8 == 3) {
            String h3 = jvi.h(i9);
            String str15 = y2r0.a;
            Locale locale2 = Locale.US;
            format = "0.06em 0.08em 0.15em ".concat(h3);
        } else if (i8 != 4) {
            format = "unset";
        } else {
            String h4 = jvi.h(i9);
            String str16 = y2r0.a;
            Locale locale3 = Locale.US;
            format = "-0.05em -0.05em 0.15em ".concat(h4);
        }
        Object[] objArr3 = {h, b, valueOf, format};
        String str17 = y2r0.a;
        sb.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap hashMap = new HashMap();
        String h5 = jvi.h(cVar.e.b);
        String str18 = "background-color:";
        StringBuilder sb2 = new StringBuilder("background-color:");
        sb2.append(h5);
        String str19 = ";";
        sb2.append(";");
        hashMap.put(".default_bg,.default_bg *", sb2.toString());
        int i12 = 0;
        while (i12 < cVar.d.size()) {
            rkk rkkVar = cVar.d.get(i12);
            float f4 = rkkVar.h;
            int i13 = rkkVar.g;
            int i14 = rkkVar.p;
            float f5 = f4 != -3.4028235E38f ? f4 * 100.0f : 50.0f;
            float f6 = f3;
            int i15 = rkkVar.i;
            int i16 = -100;
            int i17 = i15 != i11 ? i15 != i10 ? i7 : -100 : -50;
            float f7 = rkkVar.e;
            if (f7 == -3.4028235E38f) {
                format2 = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - cVar.g) * 100.0f));
            } else if (rkkVar.f != i11) {
                format2 = String.format(Locale.US, "%.2f%%", Float.valueOf(f7 * 100.0f));
                i16 = i14 == i11 ? -(i13 != i11 ? i13 != 2 ? 0 : -100 : -50) : i13 != i11 ? i13 != 2 ? 0 : -100 : -50;
            } else {
                if (f7 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(f7 * f6));
                    i = 0;
                } else {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(((-f7) - 1.0f) * f6));
                    i = i11;
                }
                i16 = 0;
                float f8 = rkkVar.j;
                String format4 = f8 == -3.4028235E38f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f8 * 100.0f)) : "fit-content";
                alignment = rkkVar.b;
                String str20 = TtmlNode.END;
                if (alignment != null) {
                    i3 = i11;
                    obj = TtmlNode.CENTER;
                    i2 = 2;
                } else {
                    int i18 = a.a[alignment.ordinal()];
                    if (i18 != i11) {
                        i2 = 2;
                        obj = i18 != 2 ? TtmlNode.CENTER : TtmlNode.END;
                    } else {
                        i2 = 2;
                        obj = "start";
                    }
                    i3 = 1;
                }
                String str21 = i14 == i3 ? i14 != i2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
                String b2 = cVar.b(rkkVar.o, rkkVar.n);
                String h6 = jvi.h(!rkkVar.l ? rkkVar.m : cVar.e.c);
                if (i14 == 1) {
                    if (i14 != 2) {
                        str3 = i != 0 ? "bottom" : "top";
                        obj2 = TtmlNode.LEFT;
                        if (i14 != 2 || i14 == 1) {
                            str4 = "height";
                            int i19 = i16;
                            i16 = i17;
                            i17 = i19;
                        } else {
                            str4 = "width";
                        }
                        String str22 = str4;
                        charSequence = rkkVar.a;
                        float f9 = cVar.getContext().getResources().getDisplayMetrics().density;
                        Pattern pattern = b.a;
                        int i20 = i17;
                        int i21 = i12;
                        if (charSequence == null) {
                            aVar = new b.a("", h.h);
                            str8 = str19;
                            str5 = "";
                        } else {
                            str5 = "";
                            if (charSequence instanceof Spanned) {
                                Spanned spanned = (Spanned) charSequence;
                                HashSet hashSet = new HashSet();
                                str6 = "start";
                                f = f5;
                                BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                                int length = backgroundColorSpanArr.length;
                                int i22 = 0;
                                while (i22 < length) {
                                    hashSet.add(Integer.valueOf(backgroundColorSpanArr[i22].getBackgroundColor()));
                                    i22++;
                                    backgroundColorSpanArr = backgroundColorSpanArr;
                                }
                                HashMap hashMap2 = new HashMap();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    int intValue = ((Integer) it.next()).intValue();
                                    String a2 = lhg.a(intValue, "bg_");
                                    Iterator it2 = it;
                                    String a3 = ss9.a(".", a2, ",.", a2, " *");
                                    String h7 = jvi.h(intValue);
                                    String str23 = y2r0.a;
                                    Locale locale4 = Locale.US;
                                    hashMap2.put(a3, str18 + h7 + str19);
                                    it = it2;
                                    str20 = str20;
                                }
                                str7 = str20;
                                SparseArray sparseArray = new SparseArray();
                                Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                                int length2 = spans.length;
                                int i23 = 0;
                                while (i23 < length2) {
                                    String str24 = str19;
                                    Object obj3 = spans[i23];
                                    String str25 = str18;
                                    boolean z2 = obj3 instanceof StrikethroughSpan;
                                    String str26 = null;
                                    if (z2) {
                                        z = z2;
                                        format3 = "<span style='text-decoration:line-through;'>";
                                        objArr = spans;
                                    } else {
                                        z = z2;
                                        if (obj3 instanceof ForegroundColorSpan) {
                                            String h8 = jvi.h(((ForegroundColorSpan) obj3).getForegroundColor());
                                            String str27 = y2r0.a;
                                            Locale locale5 = Locale.US;
                                            objArr = spans;
                                            format3 = zr.a("<span style='color:", h8, ";'>");
                                        } else {
                                            objArr = spans;
                                            if (obj3 instanceof BackgroundColorSpan) {
                                                int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                                String str28 = y2r0.a;
                                                Locale locale6 = Locale.US;
                                                i4 = length2;
                                                format3 = tgw.b(backgroundColor, "<span class='bg_", "'>");
                                            } else {
                                                i4 = length2;
                                                if (obj3 instanceof xfv) {
                                                    format3 = "<span style='text-combine-upright:all;'>";
                                                } else if (obj3 instanceof AbsoluteSizeSpan) {
                                                    Object[] objArr4 = {Float.valueOf(((AbsoluteSizeSpan) obj3).getDip() ? r7.getSize() : r7.getSize() / f9)};
                                                    String str29 = y2r0.a;
                                                    format3 = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                                } else if (obj3 instanceof RelativeSizeSpan) {
                                                    Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                                    String str30 = y2r0.a;
                                                    format3 = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                                } else {
                                                    if (obj3 instanceof TypefaceSpan) {
                                                        String family = ((TypefaceSpan) obj3).getFamily();
                                                        if (family != null) {
                                                            String str31 = y2r0.a;
                                                            Locale locale7 = Locale.US;
                                                            format3 = zr.a("<span style='font-family:\"", family, "\";'>");
                                                        }
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
                                                            i5 = i23;
                                                            format3 = null;
                                                        } else {
                                                            format3 = "<i>";
                                                        }
                                                    } else if (obj3 instanceof mrg0) {
                                                        int i24 = ((mrg0) obj3).b;
                                                        if (i24 == -1) {
                                                            format3 = "<ruby style='ruby-position:unset;'>";
                                                        } else if (i24 != 1) {
                                                            if (i24 == 2) {
                                                                format3 = "<ruby style='ruby-position:under;'>";
                                                            }
                                                            i5 = i23;
                                                            format3 = null;
                                                        } else {
                                                            format3 = "<ruby style='ruby-position:over;'>";
                                                        }
                                                    } else if (obj3 instanceof UnderlineSpan) {
                                                        format3 = "<u>";
                                                    } else {
                                                        if (obj3 instanceof jfo0) {
                                                            jfo0 jfo0Var = (jfo0) obj3;
                                                            int i25 = jfo0Var.a;
                                                            int i26 = jfo0Var.b;
                                                            i5 = i23;
                                                            StringBuilder sb3 = new StringBuilder();
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
                                                            Object[] objArr6 = {sb3.toString(), jfo0Var.c != 2 ? "over right" : "under left"};
                                                            String str32 = y2r0.a;
                                                            format3 = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                                        }
                                                        i5 = i23;
                                                        format3 = null;
                                                    }
                                                    if (!z || (obj3 instanceof ForegroundColorSpan) || (obj3 instanceof BackgroundColorSpan) || (obj3 instanceof xfv) || (obj3 instanceof AbsoluteSizeSpan) || (obj3 instanceof RelativeSizeSpan) || (obj3 instanceof jfo0)) {
                                                        str10 = "</span>";
                                                    } else if (obj3 instanceof TypefaceSpan) {
                                                        str10 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                                    } else {
                                                        if (obj3 instanceof StyleSpan) {
                                                            int style2 = ((StyleSpan) obj3).getStyle();
                                                            if (style2 == 1) {
                                                                str26 = "</b>";
                                                            } else if (style2 == 2) {
                                                                str26 = "</i>";
                                                            } else if (style2 == 3) {
                                                                str26 = "</i></b>";
                                                            }
                                                        } else if (obj3 instanceof mrg0) {
                                                            str26 = "<rt>" + b.a(((mrg0) obj3).a) + "</rt></ruby>";
                                                        } else if (obj3 instanceof UnderlineSpan) {
                                                            str26 = "</u>";
                                                        }
                                                        str10 = str26;
                                                    }
                                                    int spanStart = spanned.getSpanStart(obj3);
                                                    int spanEnd = spanned.getSpanEnd(obj3);
                                                    if (format3 != null) {
                                                        str10.getClass();
                                                        b.C0073b c0073b = new b.C0073b(spanStart, spanEnd, format3, str10);
                                                        b.c cVar2 = (b.c) sparseArray.get(spanStart);
                                                        if (cVar2 == null) {
                                                            cVar2 = new b.c();
                                                            sparseArray.put(spanStart, cVar2);
                                                        }
                                                        cVar2.a.add(c0073b);
                                                        b.c cVar3 = (b.c) sparseArray.get(spanEnd);
                                                        if (cVar3 == null) {
                                                            cVar3 = new b.c();
                                                            sparseArray.put(spanEnd, cVar3);
                                                        }
                                                        cVar3.b.add(c0073b);
                                                    }
                                                    i23 = i5 + 1;
                                                    str19 = str24;
                                                    str18 = str25;
                                                    spans = objArr;
                                                    length2 = i4;
                                                }
                                            }
                                            i5 = i23;
                                            if (z) {
                                            }
                                            str10 = "</span>";
                                            int spanStart2 = spanned.getSpanStart(obj3);
                                            int spanEnd2 = spanned.getSpanEnd(obj3);
                                            if (format3 != null) {
                                            }
                                            i23 = i5 + 1;
                                            str19 = str24;
                                            str18 = str25;
                                            spans = objArr;
                                            length2 = i4;
                                        }
                                    }
                                    i4 = length2;
                                    i5 = i23;
                                    if (z) {
                                    }
                                    str10 = "</span>";
                                    int spanStart22 = spanned.getSpanStart(obj3);
                                    int spanEnd22 = spanned.getSpanEnd(obj3);
                                    if (format3 != null) {
                                    }
                                    i23 = i5 + 1;
                                    str19 = str24;
                                    str18 = str25;
                                    spans = objArr;
                                    length2 = i4;
                                }
                                str8 = str19;
                                str9 = str18;
                                StringBuilder sb4 = new StringBuilder(spanned.length());
                                int i27 = 0;
                                int i28 = 0;
                                while (i28 < sparseArray.size()) {
                                    int keyAt = sparseArray.keyAt(i28);
                                    sb4.append(b.a(spanned.subSequence(i27, keyAt)));
                                    b.c cVar4 = (b.c) sparseArray.get(keyAt);
                                    ArrayList arrayList = cVar4.b;
                                    ArrayList arrayList2 = cVar4.a;
                                    SparseArray sparseArray2 = sparseArray;
                                    Collections.sort(arrayList, b.C0073b.f);
                                    Iterator it3 = cVar4.b.iterator();
                                    while (it3.hasNext()) {
                                        sb4.append(((b.C0073b) it3.next()).d);
                                    }
                                    Collections.sort(arrayList2, b.C0073b.e);
                                    Iterator it4 = arrayList2.iterator();
                                    while (it4.hasNext()) {
                                        sb4.append(((b.C0073b) it4.next()).c);
                                    }
                                    i28++;
                                    i27 = keyAt;
                                    sparseArray = sparseArray2;
                                }
                                sb4.append(b.a(spanned.subSequence(i27, spanned.length())));
                                aVar = new b.a(sb4.toString(), hashMap2);
                                for (String str33 : hashMap.keySet()) {
                                    String str34 = (String) hashMap.put(str33, (String) hashMap.get(str33));
                                    fxc0.z(str34 == null || str34.equals(hashMap.get(str33)));
                                }
                                Integer valueOf2 = Integer.valueOf(i21);
                                Float valueOf3 = Float.valueOf(f);
                                Integer valueOf4 = Integer.valueOf(i20);
                                Integer valueOf5 = Integer.valueOf(i16);
                                f2 = rkkVar.q;
                                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    Object[] objArr7 = {(i14 == 2 || i14 == 1) ? "skewY" : "skewX", Float.valueOf(f2)};
                                    String str35 = y2r0.a;
                                    str11 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                                } else {
                                    str11 = str5;
                                }
                                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf2, obj2, valueOf3, str3, str, str22, format4, obj, str21, b2, h6, valueOf4, valueOf5, str11));
                                sb.append("<span class='default_bg'>");
                                alignment2 = rkkVar.c;
                                String str36 = aVar.a;
                                if (alignment2 == null) {
                                    int i29 = a.a[alignment2.ordinal()];
                                    if (i29 != 1) {
                                        i10 = 2;
                                        str12 = i29 != 2 ? TtmlNode.CENTER : str7;
                                    } else {
                                        i10 = 2;
                                        str12 = str6;
                                    }
                                    sb.append("<span style='display:inline-block; text-align:" + str12 + ";'>");
                                    sb.append(str36);
                                    sb.append("</span>");
                                } else {
                                    i10 = 2;
                                    sb.append(str36);
                                }
                                sb.append("</span></div>");
                                i12 = i21 + 1;
                                f3 = f6;
                                str19 = str8;
                                str18 = str9;
                                i7 = 0;
                                i11 = 1;
                                cVar = this;
                            } else {
                                str8 = str19;
                                aVar = new b.a(b.a(charSequence), h.h);
                            }
                        }
                        str9 = str18;
                        str6 = "start";
                        f = f5;
                        str7 = TtmlNode.END;
                        while (r0.hasNext()) {
                        }
                        Integer valueOf22 = Integer.valueOf(i21);
                        Float valueOf32 = Float.valueOf(f);
                        Integer valueOf42 = Integer.valueOf(i20);
                        Integer valueOf52 = Integer.valueOf(i16);
                        f2 = rkkVar.q;
                        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        }
                        sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf22, obj2, valueOf32, str3, str, str22, format4, obj, str21, b2, h6, valueOf42, valueOf52, str11));
                        sb.append("<span class='default_bg'>");
                        alignment2 = rkkVar.c;
                        String str362 = aVar.a;
                        if (alignment2 == null) {
                        }
                        sb.append("</span></div>");
                        i12 = i21 + 1;
                        f3 = f6;
                        str19 = str8;
                        str18 = str9;
                        i7 = 0;
                        i11 = 1;
                        cVar = this;
                    }
                }
                str3 = str2;
                obj2 = "top";
                if (i14 != 2) {
                }
                str4 = "height";
                int i192 = i16;
                i16 = i17;
                i17 = i192;
                String str222 = str4;
                charSequence = rkkVar.a;
                float f92 = cVar.getContext().getResources().getDisplayMetrics().density;
                Pattern pattern2 = b.a;
                int i202 = i17;
                int i212 = i12;
                if (charSequence == null) {
                }
                str9 = str18;
                str6 = "start";
                f = f5;
                str7 = TtmlNode.END;
                while (r0.hasNext()) {
                }
                Integer valueOf222 = Integer.valueOf(i212);
                Float valueOf322 = Float.valueOf(f);
                Integer valueOf422 = Integer.valueOf(i202);
                Integer valueOf522 = Integer.valueOf(i16);
                f2 = rkkVar.q;
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf222, obj2, valueOf322, str3, str, str222, format4, obj, str21, b2, h6, valueOf422, valueOf522, str11));
                sb.append("<span class='default_bg'>");
                alignment2 = rkkVar.c;
                String str3622 = aVar.a;
                if (alignment2 == null) {
                }
                sb.append("</span></div>");
                i12 = i212 + 1;
                f3 = f6;
                str19 = str8;
                str18 = str9;
                i7 = 0;
                i11 = 1;
                cVar = this;
            }
            str = format2;
            i = 0;
            float f82 = rkkVar.j;
            String format42 = f82 == -3.4028235E38f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f82 * 100.0f)) : "fit-content";
            alignment = rkkVar.b;
            String str202 = TtmlNode.END;
            if (alignment != null) {
            }
            String str212 = i14 == i3 ? i14 != i2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
            String b22 = cVar.b(rkkVar.o, rkkVar.n);
            String h62 = jvi.h(!rkkVar.l ? rkkVar.m : cVar.e.c);
            if (i14 == 1) {
            }
            str3 = str2;
            obj2 = "top";
            if (i14 != 2) {
            }
            str4 = "height";
            int i1922 = i16;
            i16 = i17;
            i17 = i1922;
            String str2222 = str4;
            charSequence = rkkVar.a;
            float f922 = cVar.getContext().getResources().getDisplayMetrics().density;
            Pattern pattern22 = b.a;
            int i2022 = i17;
            int i2122 = i12;
            if (charSequence == null) {
            }
            str9 = str18;
            str6 = "start";
            f = f5;
            str7 = TtmlNode.END;
            while (r0.hasNext()) {
            }
            Integer valueOf2222 = Integer.valueOf(i2122);
            Float valueOf3222 = Float.valueOf(f);
            Integer valueOf4222 = Integer.valueOf(i2022);
            Integer valueOf5222 = Integer.valueOf(i16);
            f2 = rkkVar.q;
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf2222, obj2, valueOf3222, str3, str, str2222, format42, obj, str212, b22, h62, valueOf4222, valueOf5222, str11));
            sb.append("<span class='default_bg'>");
            alignment2 = rkkVar.c;
            String str36222 = aVar.a;
            if (alignment2 == null) {
            }
            sb.append("</span></div>");
            i12 = i2122 + 1;
            f3 = f6;
            str19 = str8;
            str18 = str9;
            i7 = 0;
            i11 = 1;
            cVar = this;
        }
        sb.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (String str37 : hashMap.keySet()) {
            sb5.append(str37);
            sb5.append("{");
            sb5.append((String) hashMap.get(str37));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb.insert(0, (CharSequence) sb5);
        this.c.loadData(Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.d.isEmpty()) {
            return;
        }
        c();
    }
}
