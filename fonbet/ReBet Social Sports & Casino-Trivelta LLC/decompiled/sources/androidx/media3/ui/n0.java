package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.ui.SubtitleView;
import androidx.media3.ui.e0;
import com.facebook.react.uimanager.ViewProps;
import d1.C3985a;
import e1.AbstractC4134a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class n0 extends FrameLayout implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    public final C2232a f22602a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f22603b;

    /* renamed from: c, reason: collision with root package name */
    public List f22604c;

    /* renamed from: d, reason: collision with root package name */
    public C2233b f22605d;

    /* renamed from: e, reason: collision with root package name */
    public float f22606e;

    /* renamed from: f, reason: collision with root package name */
    public int f22607f;

    /* renamed from: g, reason: collision with root package name */
    public float f22608g;

    public class a extends WebView {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    public static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n0(Context context) {
        this(context, null);
    }

    public static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    public static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : ViewProps.END : ViewProps.START;
    }

    public static String d(C2233b c2233b) {
        int i10 = c2233b.f22357d;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "unset" : e1.Z.G("-0.05em -0.05em 0.15em %s", AbstractC2238g.b(c2233b.f22358e)) : e1.Z.G("0.06em 0.08em 0.15em %s", AbstractC2238g.b(c2233b.f22358e)) : e1.Z.G("0.1em 0.12em 0.15em %s", AbstractC2238g.b(c2233b.f22358e)) : e1.Z.G("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", AbstractC2238g.b(c2233b.f22358e));
    }

    public static String f(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    public static String h(C3985a c3985a) {
        float f10 = c3985a.f44873q;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = c3985a.f44872p;
        return e1.Z.G("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List list, C2233b c2233b, float f10, int i10, float f11) {
        this.f22605d = c2233b;
        this.f22606e = f10;
        this.f22607f = i10;
        this.f22608g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C3985a c3985a = (C3985a) list.get(i11);
            if (c3985a.f44860d != null) {
                arrayList.add(c3985a);
            } else {
                arrayList2.add(c3985a);
            }
        }
        if (!this.f22604c.isEmpty() || !arrayList2.isEmpty()) {
            this.f22604c = arrayList2;
            i();
        }
        this.f22602a.a(arrayList, c2233b, f10, i10, f11);
        invalidate();
    }

    public final String e(int i10, float f10) {
        float f11 = k0.f(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return f11 == -3.4028235E38f ? "unset" : e1.Z.G("%.2fpx", Float.valueOf(f11 / getContext().getResources().getDisplayMetrics().density));
    }

    public void g() {
        this.f22603b.destroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0145, code lost:
    
        if (r10 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0148, code lost:
    
        r12 = com.facebook.react.uimanager.ViewProps.LEFT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        r21 = r12;
        r19 = com.facebook.react.uimanager.ViewProps.TOP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014f, code lost:
    
        if (r10 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        float f10;
        String G10;
        int i10;
        boolean z10;
        String str;
        int i11;
        String str2;
        Object obj;
        String str3;
        Layout.Alignment alignment;
        StringBuilder sb2 = new StringBuilder();
        float f11 = 1.2f;
        sb2.append(e1.Z.G("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", AbstractC2238g.b(this.f22605d.f22354a), e(this.f22607f, this.f22606e), Float.valueOf(1.2f), d(this.f22605d)));
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC2238g.a("default_bg"), e1.Z.G("background-color:%s;", AbstractC2238g.b(this.f22605d.f22355b)));
        int i12 = 0;
        while (i12 < this.f22604c.size()) {
            C3985a c3985a = (C3985a) this.f22604c.get(i12);
            float f12 = c3985a.f44864h;
            float f13 = f12 != -3.4028235E38f ? f12 * 100.0f : 50.0f;
            int b10 = b(c3985a.f44865i);
            float f14 = c3985a.f44861e;
            float f15 = f11;
            if (f14 == -3.4028235E38f) {
                f10 = -3.4028235E38f;
                G10 = e1.Z.G("%.2f%%", Float.valueOf((1.0f - this.f22608g) * 100.0f));
                i10 = -100;
                z10 = false;
            } else if (c3985a.f44862f != 1) {
                String G11 = e1.Z.G("%.2f%%", Float.valueOf(f14 * 100.0f));
                i10 = c3985a.f44872p == 1 ? -b(c3985a.f44863g) : b(c3985a.f44863g);
                f10 = -3.4028235E38f;
                str = G11;
                z10 = false;
                float f16 = c3985a.f44866j;
                String G12 = f16 == f10 ? e1.Z.G("%.2f%%", Float.valueOf(f16 * 100.0f)) : "fit-content";
                String c10 = c(c3985a.f44858b);
                String f17 = f(c3985a.f44872p);
                String e10 = e(c3985a.f44870n, c3985a.f44871o);
                String b11 = AbstractC2238g.b(!c3985a.f44868l ? c3985a.f44869m : this.f22605d.f22356c);
                i11 = c3985a.f44872p;
                String str4 = ViewProps.RIGHT;
                String str5 = ViewProps.TOP;
                if (i11 == 1) {
                    if (i11 != 2) {
                        if (z10) {
                            str5 = ViewProps.BOTTOM;
                        }
                        str2 = str5;
                        obj = ViewProps.LEFT;
                    }
                }
                if (i11 != 2 || i11 == 1) {
                    str3 = "height";
                    int i13 = i10;
                    i10 = b10;
                    b10 = i13;
                } else {
                    str3 = "width";
                }
                String str6 = str3;
                e0.b a10 = e0.a(c3985a.f44857a, getContext().getResources().getDisplayMetrics().density);
                for (String str7 : hashMap.keySet()) {
                    String str8 = (String) hashMap.put(str7, (String) hashMap.get(str7));
                    AbstractC4134a.g(str8 == null || str8.equals(hashMap.get(str7)));
                }
                sb2.append(e1.Z.G("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i12), obj, Float.valueOf(f13), str2, str, str6, G12, c10, f17, e10, b11, Integer.valueOf(b10), Integer.valueOf(i10), h(c3985a)));
                sb2.append(e1.Z.G("<span class='%s'>", "default_bg"));
                alignment = c3985a.f44859c;
                if (alignment == null) {
                    sb2.append(e1.Z.G("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                    sb2.append(a10.f22454a);
                    sb2.append("</span>");
                } else {
                    sb2.append(a10.f22454a);
                }
                sb2.append("</span>");
                sb2.append("</div>");
                i12++;
                f11 = f15;
            } else {
                f10 = -3.4028235E38f;
                if (f14 >= 0.0f) {
                    G10 = e1.Z.G("%.2fem", Float.valueOf(f14 * f15));
                    z10 = false;
                    i10 = 0;
                } else {
                    G10 = e1.Z.G("%.2fem", Float.valueOf(((-f14) - 1.0f) * f15));
                    i10 = 0;
                    z10 = true;
                }
            }
            str = G10;
            float f162 = c3985a.f44866j;
            String G122 = f162 == f10 ? e1.Z.G("%.2f%%", Float.valueOf(f162 * 100.0f)) : "fit-content";
            String c102 = c(c3985a.f44858b);
            String f172 = f(c3985a.f44872p);
            String e102 = e(c3985a.f44870n, c3985a.f44871o);
            String b112 = AbstractC2238g.b(!c3985a.f44868l ? c3985a.f44869m : this.f22605d.f22356c);
            i11 = c3985a.f44872p;
            String str42 = ViewProps.RIGHT;
            String str52 = ViewProps.TOP;
            if (i11 == 1) {
            }
            if (i11 != 2) {
            }
            str3 = "height";
            int i132 = i10;
            i10 = b10;
            b10 = i132;
            String str62 = str3;
            e0.b a102 = e0.a(c3985a.f44857a, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
            }
            sb2.append(e1.Z.G("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i12), obj, Float.valueOf(f13), str2, str, str62, G122, c102, f172, e102, b112, Integer.valueOf(b10), Integer.valueOf(i10), h(c3985a)));
            sb2.append(e1.Z.G("<span class='%s'>", "default_bg"));
            alignment = c3985a.f44859c;
            if (alignment == null) {
            }
            sb2.append("</span>");
            sb2.append("</div>");
            i12++;
            f11 = f15;
        }
        sb2.append("</div></body></html>");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<html><head><style>");
        for (String str9 : hashMap.keySet()) {
            sb3.append(str9);
            sb3.append("{");
            sb3.append((String) hashMap.get(str9));
            sb3.append("}");
        }
        sb3.append("</style></head>");
        sb2.insert(0, (CharSequence) sb3);
        this.f22603b.loadData(Base64.encodeToString(sb2.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f22604c.isEmpty()) {
            return;
        }
        i();
    }

    public n0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22604c = Collections.EMPTY_LIST;
        this.f22605d = C2233b.f22353g;
        this.f22606e = 0.0533f;
        this.f22607f = 0;
        this.f22608g = 0.08f;
        C2232a c2232a = new C2232a(context, attributeSet);
        this.f22602a = c2232a;
        a aVar = new a(context, attributeSet);
        this.f22603b = aVar;
        aVar.setBackgroundColor(0);
        addView(c2232a);
        addView(aVar);
    }
}
