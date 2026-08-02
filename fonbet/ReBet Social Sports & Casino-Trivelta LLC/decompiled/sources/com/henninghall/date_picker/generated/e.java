package com.henninghall.date_picker.generated;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class e extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public final Scroller f38489A;

    /* renamed from: B, reason: collision with root package name */
    public int f38490B;

    /* renamed from: C, reason: collision with root package name */
    public l f38491C;

    /* renamed from: D, reason: collision with root package name */
    public f f38492D;

    /* renamed from: E, reason: collision with root package name */
    public RunnableC0536e f38493E;

    /* renamed from: F, reason: collision with root package name */
    public float f38494F;

    /* renamed from: G, reason: collision with root package name */
    public long f38495G;

    /* renamed from: H, reason: collision with root package name */
    public float f38496H;

    /* renamed from: I, reason: collision with root package name */
    public VelocityTracker f38497I;

    /* renamed from: J, reason: collision with root package name */
    public int f38498J;

    /* renamed from: K, reason: collision with root package name */
    public int f38499K;

    /* renamed from: L, reason: collision with root package name */
    public int f38500L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f38501O;

    /* renamed from: P, reason: collision with root package name */
    public final int f38502P;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f38503R;

    /* renamed from: T, reason: collision with root package name */
    public final Drawable f38504T;

    /* renamed from: T1, reason: collision with root package name */
    public boolean f38505T1;

    /* renamed from: V, reason: collision with root package name */
    public int f38506V;

    /* renamed from: V1, reason: collision with root package name */
    public boolean f38507V1;

    /* renamed from: W, reason: collision with root package name */
    public int f38508W;

    /* renamed from: a, reason: collision with root package name */
    public boolean f38509a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageButton f38510b;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f38511b1;

    /* renamed from: b2, reason: collision with root package name */
    public d f38512b2;

    /* renamed from: c, reason: collision with root package name */
    public final ImageButton f38513c;

    /* renamed from: d, reason: collision with root package name */
    public final EditText f38514d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38515e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38516f;

    /* renamed from: g, reason: collision with root package name */
    public final int f38517g;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f38518g1;

    /* renamed from: g2, reason: collision with root package name */
    public final k f38519g2;

    /* renamed from: h, reason: collision with root package name */
    public final int f38520h;

    /* renamed from: i, reason: collision with root package name */
    public int f38521i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f38522j;

    /* renamed from: k, reason: collision with root package name */
    public final int f38523k;

    /* renamed from: l, reason: collision with root package name */
    public int f38524l;

    /* renamed from: m, reason: collision with root package name */
    public int f38525m;
    private String[] mDisplayedValues;
    private final int[] mSelectorIndices;

    /* renamed from: n, reason: collision with root package name */
    public int f38526n;

    /* renamed from: o, reason: collision with root package name */
    public int f38527o;

    /* renamed from: p, reason: collision with root package name */
    public j f38528p;

    /* renamed from: p1, reason: collision with root package name */
    public int f38529p1;

    /* renamed from: p2, reason: collision with root package name */
    public int f38530p2;

    /* renamed from: q, reason: collision with root package name */
    public i f38531q;

    /* renamed from: r, reason: collision with root package name */
    public g f38532r;

    /* renamed from: s, reason: collision with root package name */
    public long f38533s;

    /* renamed from: t, reason: collision with root package name */
    public final SparseArray f38534t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f38535u;

    /* renamed from: v, reason: collision with root package name */
    public final Drawable f38536v;

    /* renamed from: w, reason: collision with root package name */
    public int f38537w;

    /* renamed from: x, reason: collision with root package name */
    public int f38538x;

    /* renamed from: x1, reason: collision with root package name */
    public int f38539x1;

    /* renamed from: x2, reason: collision with root package name */
    public boolean f38540x2;

    /* renamed from: y, reason: collision with root package name */
    public int f38541y;

    /* renamed from: y1, reason: collision with root package name */
    public int f38542y1;

    /* renamed from: z, reason: collision with root package name */
    public final Scroller f38543z;

    /* renamed from: y2, reason: collision with root package name */
    public static final m f38488y2 = new m();
    private static final char[] DIGIT_CHARACTERS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641, 1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785, 2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415, 2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543, 3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311};

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.J();
            e.this.f38514d.clearFocus();
        }
    }

    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            e.this.J();
            e.this.f38514d.clearFocus();
            return true;
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                e.this.f38514d.selectAll();
            } else {
                e.this.f38514d.setSelection(0, 0);
                e.this.f0(view);
            }
        }
    }

    public class d extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f38547a = new Rect();
        private final int[] mTempArray = new int[2];

        /* renamed from: b, reason: collision with root package name */
        public int f38548b = Integer.MIN_VALUE;

        public d() {
        }

        public final AccessibilityNodeInfo a(int i10, int i11, int i12, int i13) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setClassName(e.class.getName());
            obtain.setPackageName(e.this.getContext().getPackageName());
            obtain.setSource(e.this);
            if (g()) {
                obtain.addChild(e.this, 3);
            }
            obtain.addChild(e.this, 2);
            if (h()) {
                obtain.addChild(e.this, 1);
            }
            obtain.setParent((View) e.this.getParentForAccessibility());
            obtain.setEnabled(e.this.isEnabled());
            obtain.setScrollable(true);
            obtain.setAccessibilityFocused(this.f38548b == -1);
            Rect rect = this.f38547a;
            rect.set(i10, i11, i12, i13);
            obtain.setBoundsInParent(rect);
            int[] iArr = this.mTempArray;
            e.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            obtain.setBoundsInScreen(rect);
            if (this.f38548b != -1) {
                obtain.addAction(64);
            }
            if (this.f38548b == -1) {
                obtain.addAction(128);
            }
            if (e.this.isEnabled()) {
                if (e.this.getWrapSelectorWheel() || e.this.getValue() < e.this.getMaxValue()) {
                    obtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                    obtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN);
                }
                if (e.this.getWrapSelectorWheel() || e.this.getValue() > e.this.getMinValue()) {
                    obtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                    obtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP);
                }
            }
            return obtain;
        }

        public final AccessibilityNodeInfo b(int i10, String str, int i11, int i12, int i13, int i14) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setClassName(Button.class.getName());
            obtain.setPackageName(e.this.getContext().getPackageName());
            obtain.setSource(e.this, i10);
            obtain.setParent(e.this);
            obtain.setText(str);
            obtain.setClickable(true);
            obtain.setLongClickable(true);
            obtain.setEnabled(e.this.isEnabled());
            obtain.setAccessibilityFocused(this.f38548b == i10);
            Rect rect = this.f38547a;
            rect.set(i11, i12, i13, i14);
            obtain.setBoundsInParent(rect);
            int[] iArr = this.mTempArray;
            e.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            obtain.setBoundsInScreen(rect);
            if (this.f38548b != i10) {
                obtain.addAction(64);
            }
            if (this.f38548b == i10) {
                obtain.addAction(128);
            }
            if (e.this.isEnabled()) {
                obtain.addAction(16);
            }
            return obtain;
        }

        public final AccessibilityNodeInfo c(int i10, int i11, int i12, int i13) {
            AccessibilityNodeInfo createAccessibilityNodeInfo = e.this.f38514d.createAccessibilityNodeInfo();
            createAccessibilityNodeInfo.setSource(e.this, 2);
            createAccessibilityNodeInfo.setAccessibilityFocused(this.f38548b == 2);
            if (this.f38548b != 2) {
                createAccessibilityNodeInfo.addAction(64);
            }
            if (this.f38548b == 2) {
                createAccessibilityNodeInfo.addAction(128);
            }
            Rect rect = this.f38547a;
            rect.set(i10, i11, i12, i13);
            createAccessibilityNodeInfo.setBoundsInParent(rect);
            int[] iArr = this.mTempArray;
            e.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            createAccessibilityNodeInfo.setBoundsInScreen(rect);
            return createAccessibilityNodeInfo;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            return i10 != -1 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? super.createAccessibilityNodeInfo(i10) : b(3, e(), e.this.getScrollX(), e.this.getScrollY(), e.this.getScrollX() + (e.this.getRight() - e.this.getLeft()), e.this.f38529p1 + e.this.f38506V) : c(e.this.getScrollX(), e.this.f38529p1 + e.this.f38506V, e.this.getScrollX() + (e.this.getRight() - e.this.getLeft()), e.this.f38539x1 - e.this.f38506V) : b(1, f(), e.this.getScrollX(), e.this.f38539x1 - e.this.f38506V, e.this.getScrollX() + (e.this.getRight() - e.this.getLeft()), e.this.getScrollY() + (e.this.getBottom() - e.this.getTop())) : a(e.this.getScrollX(), e.this.getScrollY(), e.this.getScrollX() + (e.this.getRight() - e.this.getLeft()), e.this.getScrollY() + (e.this.getBottom() - e.this.getTop()));
        }

        public final void d(String str, int i10, List list) {
            if (i10 == 1) {
                String f10 = f();
                if (TextUtils.isEmpty(f10) || !f10.toString().toLowerCase().contains(str)) {
                    return;
                }
                list.add(createAccessibilityNodeInfo(1));
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                String e10 = e();
                if (TextUtils.isEmpty(e10) || !e10.toString().toLowerCase().contains(str)) {
                    return;
                }
                list.add(createAccessibilityNodeInfo(3));
                return;
            }
            Editable text = e.this.f38514d.getText();
            if (!TextUtils.isEmpty(text) && text.toString().toLowerCase().contains(str)) {
                list.add(createAccessibilityNodeInfo(2));
                return;
            }
            Editable text2 = e.this.f38514d.getText();
            if (TextUtils.isEmpty(text2) || !text2.toString().toLowerCase().contains(str)) {
                return;
            }
            list.add(createAccessibilityNodeInfo(2));
        }

        public final String e() {
            int i10 = e.this.f38527o - 1;
            if (e.this.f38501O) {
                i10 = e.this.I(i10);
            }
            if (i10 >= e.this.f38525m) {
                return e.this.mDisplayedValues == null ? e.this.F(i10) : e.this.mDisplayedValues[i10 - e.this.f38525m];
            }
            return null;
        }

        public final String f() {
            int i10 = e.this.f38527o + 1;
            if (e.this.f38501O) {
                i10 = e.this.I(i10);
            }
            if (i10 <= e.this.f38526n) {
                return e.this.mDisplayedValues == null ? e.this.F(i10) : e.this.mDisplayedValues[i10 - e.this.f38525m];
            }
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            if (TextUtils.isEmpty(str)) {
                return Collections.EMPTY_LIST;
            }
            String lowerCase = str.toLowerCase();
            ArrayList arrayList = new ArrayList();
            if (i10 == -1) {
                d(lowerCase, 3, arrayList);
                d(lowerCase, 2, arrayList);
                d(lowerCase, 1, arrayList);
                return arrayList;
            }
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                return super.findAccessibilityNodeInfosByText(str, i10);
            }
            d(lowerCase, i10, arrayList);
            return arrayList;
        }

        public final boolean g() {
            return e.this.getWrapSelectorWheel() || e.this.getValue() > e.this.getMinValue();
        }

        public final boolean h() {
            return e.this.getWrapSelectorWheel() || e.this.getValue() < e.this.getMaxValue();
        }

        public final void i(int i10, int i11, String str) {
            if (com.henninghall.date_picker.generated.a.a(e.this.getContext()).isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
                obtain.setClassName(Button.class.getName());
                obtain.setPackageName(e.this.getContext().getPackageName());
                obtain.getText().add(str);
                obtain.setEnabled(e.this.isEnabled());
                obtain.setSource(e.this, i10);
                e eVar = e.this;
                eVar.requestSendAccessibilityEvent(eVar, obtain);
            }
        }

        public final void j(int i10) {
            if (com.henninghall.date_picker.generated.a.a(e.this.getContext()).isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
                e.this.f38514d.onInitializeAccessibilityEvent(obtain);
                e.this.f38514d.onPopulateAccessibilityEvent(obtain);
                obtain.setSource(e.this, 2);
                e eVar = e.this;
                eVar.requestSendAccessibilityEvent(eVar, obtain);
            }
        }

        public void k(int i10, int i11) {
            if (i10 == 1) {
                if (h()) {
                    i(i10, i11, f());
                }
            } else if (i10 == 2) {
                j(i11);
            } else if (i10 == 3 && g()) {
                i(i10, i11, e());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:104:0x0177, code lost:
        
            if (r11 != 16908346) goto L104;
         */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean performAction(int i10, int i11, Bundle bundle) {
            if (i10 == -1) {
                if (i11 == 64) {
                    if (this.f38548b == i10) {
                        return false;
                    }
                    this.f38548b = i10;
                    return true;
                }
                if (i11 == 128) {
                    if (this.f38548b != i10) {
                        return false;
                    }
                    this.f38548b = Integer.MIN_VALUE;
                    return true;
                }
                if (i11 != 4096) {
                    if (i11 == 8192 || i11 == 16908344) {
                        if (!e.this.isEnabled() || (!e.this.getWrapSelectorWheel() && e.this.getValue() <= e.this.getMinValue())) {
                            return false;
                        }
                        e.this.A(false);
                        return true;
                    }
                }
                if (!e.this.isEnabled() || (!e.this.getWrapSelectorWheel() && e.this.getValue() >= e.this.getMaxValue())) {
                    return false;
                }
                e.this.A(true);
                return true;
            }
            if (i10 == 1) {
                if (i11 == 16) {
                    if (!e.this.isEnabled()) {
                        return false;
                    }
                    e.this.A(true);
                    k(i10, 1);
                    return true;
                }
                if (i11 == 64) {
                    if (this.f38548b == i10) {
                        return false;
                    }
                    this.f38548b = i10;
                    k(i10, 32768);
                    e eVar = e.this;
                    eVar.invalidate(0, eVar.f38539x1, e.this.getRight(), e.this.getBottom());
                    return true;
                }
                if (i11 != 128 || this.f38548b != i10) {
                    return false;
                }
                this.f38548b = Integer.MIN_VALUE;
                k(i10, PKIFailureInfo.notAuthorized);
                e eVar2 = e.this;
                eVar2.invalidate(0, eVar2.f38539x1, e.this.getRight(), e.this.getBottom());
                return true;
            }
            if (i10 == 2) {
                if (i11 == 1) {
                    if (!e.this.isEnabled() || e.this.f38514d.isFocused()) {
                        return false;
                    }
                    return e.this.f38514d.requestFocus();
                }
                if (i11 == 2) {
                    if (!e.this.isEnabled() || !e.this.f38514d.isFocused()) {
                        return false;
                    }
                    e.this.f38514d.clearFocus();
                    return true;
                }
                if (i11 == 16) {
                    if (!e.this.isEnabled()) {
                        return false;
                    }
                    e.this.performClick();
                    return true;
                }
                if (i11 == 32) {
                    if (!e.this.isEnabled()) {
                        return false;
                    }
                    e.this.performLongClick();
                    return true;
                }
                if (i11 == 64) {
                    if (this.f38548b == i10) {
                        return false;
                    }
                    this.f38548b = i10;
                    k(i10, 32768);
                    e.this.f38514d.invalidate();
                    return true;
                }
                if (i11 != 128) {
                    return e.this.f38514d.performAccessibilityAction(i11, bundle);
                }
                if (this.f38548b != i10) {
                    return false;
                }
                this.f38548b = Integer.MIN_VALUE;
                k(i10, PKIFailureInfo.notAuthorized);
                e.this.f38514d.invalidate();
                return true;
            }
            if (i10 == 3) {
                if (i11 == 16) {
                    if (!e.this.isEnabled()) {
                        return false;
                    }
                    e.this.A(i10 == 1);
                    k(i10, 1);
                    return true;
                }
                if (i11 == 64) {
                    if (this.f38548b == i10) {
                        return false;
                    }
                    this.f38548b = i10;
                    k(i10, 32768);
                    e eVar3 = e.this;
                    eVar3.invalidate(0, 0, eVar3.getRight(), e.this.f38529p1);
                    return true;
                }
                if (i11 != 128 || this.f38548b != i10) {
                    return false;
                }
                this.f38548b = Integer.MIN_VALUE;
                k(i10, PKIFailureInfo.notAuthorized);
                e eVar4 = e.this;
                eVar4.invalidate(0, 0, eVar4.getRight(), e.this.f38529p1);
                return true;
            }
            return super.performAction(i10, i11, bundle);
        }
    }

    /* renamed from: com.henninghall.date_picker.generated.e$e, reason: collision with other inner class name */
    public class RunnableC0536e implements Runnable {
        public RunnableC0536e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.performLongClick();
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public boolean f38551a;

        public f() {
        }

        public final void b(boolean z10) {
            this.f38551a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.A(this.f38551a);
            e eVar = e.this;
            eVar.postDelayed(this, eVar.f38533s);
        }
    }

    public interface g {
        String format(int i10);
    }

    public class h extends NumberKeyListener {
        public h() {
        }

        @Override // android.text.method.NumberKeyListener, android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            if (e.this.f38491C != null) {
                e.this.f38491C.a();
            }
            if (e.this.mDisplayedValues == null) {
                CharSequence filter = super.filter(charSequence, i10, i11, spanned, i12, i13);
                if (filter == null) {
                    filter = charSequence.subSequence(i10, i11);
                }
                String str = String.valueOf(spanned.subSequence(0, i12)) + ((Object) filter) + ((Object) spanned.subSequence(i13, spanned.length()));
                return "".equals(str) ? str : (e.this.H(str) > e.this.f38526n || str.length() > String.valueOf(e.this.f38526n).length()) ? "" : filter;
            }
            String valueOf = String.valueOf(charSequence.subSequence(i10, i11));
            if (TextUtils.isEmpty(valueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i12)) + ((Object) valueOf) + ((Object) spanned.subSequence(i13, spanned.length()));
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : e.this.mDisplayedValues) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    e.this.V(str2.length(), str3.length());
                    return str3.subSequence(i12, str3.length());
                }
            }
            return "";
        }

        @Override // android.text.method.NumberKeyListener
        public char[] getAcceptedChars() {
            return e.DIGIT_CHARACTERS;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 1;
        }
    }

    public interface i {
        void a(e eVar, int i10);
    }

    public interface j {
        void a(e eVar, int i10, int i11);
    }

    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f38554a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final int f38555b = 2;

        /* renamed from: c, reason: collision with root package name */
        public int f38556c;

        /* renamed from: d, reason: collision with root package name */
        public int f38557d;

        public k() {
        }

        public void a(int i10) {
            c();
            this.f38557d = 1;
            this.f38556c = i10;
            e.this.postDelayed(this, ViewConfiguration.getTapTimeout());
        }

        public void b(int i10) {
            c();
            this.f38557d = 2;
            this.f38556c = i10;
            e.this.post(this);
        }

        public void c() {
            this.f38557d = 0;
            this.f38556c = 0;
            e.this.removeCallbacks(this);
            if (e.this.f38505T1) {
                e.this.f38505T1 = false;
                e eVar = e.this;
                eVar.invalidate(0, eVar.f38539x1, e.this.getRight(), e.this.getBottom());
            }
            e.this.f38507V1 = false;
            if (e.this.f38507V1) {
                e eVar2 = e.this;
                eVar2.invalidate(0, 0, eVar2.getRight(), e.this.f38529p1);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = this.f38557d;
            if (i10 == 1) {
                int i11 = this.f38556c;
                if (i11 == 1) {
                    e.this.f38505T1 = true;
                    e eVar = e.this;
                    eVar.invalidate(0, eVar.f38539x1, e.this.getRight(), e.this.getBottom());
                    return;
                } else {
                    if (i11 != 2) {
                        return;
                    }
                    e.this.f38507V1 = true;
                    e eVar2 = e.this;
                    eVar2.invalidate(0, 0, eVar2.getRight(), e.this.f38529p1);
                    return;
                }
            }
            if (i10 != 2) {
                return;
            }
            int i12 = this.f38556c;
            if (i12 == 1) {
                if (!e.this.f38505T1) {
                    e.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                e.this.f38505T1 = !r0.f38505T1;
                e eVar3 = e.this;
                eVar3.invalidate(0, eVar3.f38539x1, e.this.getRight(), e.this.getBottom());
                return;
            }
            if (i12 != 2) {
                return;
            }
            if (!e.this.f38507V1) {
                e.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            e.this.f38507V1 = !r0.f38507V1;
            e eVar4 = e.this;
            eVar4.invalidate(0, 0, eVar4.getRight(), e.this.f38529p1);
        }
    }

    public static class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f38559a;

        /* renamed from: b, reason: collision with root package name */
        public int f38560b;

        /* renamed from: c, reason: collision with root package name */
        public int f38561c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f38562d;

        public l(EditText editText) {
            this.f38559a = editText;
        }

        public void a() {
            if (this.f38562d) {
                this.f38559a.removeCallbacks(this);
                this.f38562d = false;
            }
        }

        public void b(int i10, int i11) {
            this.f38560b = i10;
            this.f38561c = i11;
            if (this.f38562d) {
                return;
            }
            this.f38559a.post(this);
            this.f38562d = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38562d = false;
            this.f38559a.setSelection(this.f38560b, this.f38561c);
        }
    }

    public static class m implements g {

        /* renamed from: b, reason: collision with root package name */
        public char f38564b;

        /* renamed from: c, reason: collision with root package name */
        public Formatter f38565c;

        /* renamed from: a, reason: collision with root package name */
        public final StringBuilder f38563a = new StringBuilder();
        final Object[] mArgs = new Object[1];

        public m() {
            c(Locale.getDefault());
        }

        public static char b(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale).getZeroDigit();
        }

        public final Formatter a(Locale locale) {
            return new Formatter(this.f38563a, locale);
        }

        public final void c(Locale locale) {
            this.f38565c = a(locale);
            this.f38564b = b(locale);
        }

        @Override // com.henninghall.date_picker.generated.e.g
        public String format(int i10) {
            Locale locale = Locale.getDefault();
            if (this.f38564b != b(locale)) {
                c(locale);
            }
            this.mArgs[0] = Integer.valueOf(i10);
            StringBuilder sb2 = this.f38563a;
            sb2.delete(0, sb2.length());
            this.f38565c.format("%02d", this.mArgs);
            return this.f38565c.toString();
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.numberPickerStyle);
    }

    public static String G(int i10) {
        return String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
    }

    public static final g getTwoDigitFormatter() {
        return f38488y2;
    }

    public final void A(boolean z10) {
        if (!this.f38503R) {
            if (z10) {
                a0(this.f38527o + 1, true);
                return;
            } else {
                a0(this.f38527o - 1, true);
                return;
            }
        }
        J();
        if (!P(this.f38543z)) {
            P(this.f38489A);
        }
        this.f38490B = 0;
        if (z10) {
            this.f38543z.startScroll(0, 0, 0, -this.f38537w, 300);
        } else {
            this.f38543z.startScroll(0, 0, 0, this.f38537w, 300);
        }
        invalidate();
    }

    public final void B(int[] iArr) {
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        int i10 = iArr[1] - 1;
        if (this.f38501O && i10 < this.f38525m) {
            i10 = this.f38526n;
        }
        iArr[0] = i10;
        C(i10);
    }

    public final void C(int i10) {
        String str;
        SparseArray sparseArray = this.f38534t;
        if (((String) sparseArray.get(i10)) != null) {
            return;
        }
        int i11 = this.f38525m;
        if (i10 < i11 || i10 > this.f38526n) {
            str = "";
        } else {
            String[] strArr = this.mDisplayedValues;
            str = strArr != null ? strArr[i10 - i11] : F(i10);
        }
        sparseArray.put(i10, str);
    }

    public final boolean D() {
        int i10 = this.f38538x - this.f38541y;
        if (i10 == 0) {
            return false;
        }
        this.f38490B = 0;
        int abs = Math.abs(i10);
        int i11 = this.f38537w;
        if (abs > i11 / 2) {
            if (i10 > 0) {
                i11 = -i11;
            }
            i10 += i11;
        }
        this.f38489A.startScroll(0, 0, 0, i10, 800);
        invalidate();
        return true;
    }

    public final void E(int i10) {
        this.f38490B = 0;
        if (i10 > 0) {
            this.f38543z.fling(0, 0, 0, i10, 0, 0, 0, Integer.MAX_VALUE);
        } else {
            this.f38543z.fling(0, Integer.MAX_VALUE, 0, i10, 0, 0, 0, Integer.MAX_VALUE);
        }
        invalidate();
    }

    public final String F(int i10) {
        g gVar = this.f38532r;
        return gVar != null ? gVar.format(i10) : G(i10);
    }

    public final int H(String str) {
        try {
            if (this.mDisplayedValues == null) {
                return Integer.parseInt(str);
            }
            for (int i10 = 0; i10 < this.mDisplayedValues.length; i10++) {
                str = str.toLowerCase();
                if (this.mDisplayedValues[i10].toLowerCase().startsWith(str)) {
                    return this.f38525m + i10;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.f38525m;
        }
    }

    public final int I(int i10) {
        int i11 = this.f38526n;
        if (i10 > i11) {
            int i12 = this.f38525m;
            return (i12 + ((i10 - i11) % (i11 - i12))) - 1;
        }
        int i13 = this.f38525m;
        return i10 < i13 ? (i11 - ((i13 - i10) % (i11 - i13))) + 1 : i10;
    }

    public final void J() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null && inputMethodManager.isActive(this.f38514d)) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        if (this.f38503R) {
            this.f38514d.setVisibility(4);
        }
    }

    public final void K(int[] iArr) {
        int i10 = 0;
        while (i10 < iArr.length - 1) {
            int i11 = i10 + 1;
            iArr[i10] = iArr[i11];
            i10 = i11;
        }
        int i12 = iArr[iArr.length - 2] + 1;
        if (this.f38501O && i12 > this.f38526n) {
            i12 = this.f38525m;
        }
        iArr[iArr.length - 1] = i12;
        C(i12);
    }

    public final void L() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.f38523k) / 2);
    }

    public final void M() {
        N();
        int[] iArr = this.mSelectorIndices;
        int bottom = (int) ((((getBottom() - getTop()) - (iArr.length * this.f38523k)) / iArr.length) + 0.5f);
        this.f38524l = bottom;
        this.f38537w = this.f38523k + bottom;
        int baseline = (this.f38514d.getBaseline() + this.f38514d.getTop()) - this.f38537w;
        this.f38538x = baseline;
        this.f38541y = baseline;
        d0();
    }

    public final void N() {
        this.f38534t.clear();
        int[] iArr = this.mSelectorIndices;
        int value = getValue();
        for (int i10 = 0; i10 < this.mSelectorIndices.length; i10++) {
            int i11 = (i10 - 1) + value;
            if (this.f38501O) {
                i11 = I(i11);
            }
            iArr[i10] = i11;
            C(i11);
        }
    }

    public final int O(int i10, int i11) {
        if (i11 != -1) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
            }
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException("Unknown measure mode: " + mode);
            }
        }
        return i10;
    }

    public final boolean P(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i10 = this.f38538x - ((this.f38541y + finalY) % this.f38537w);
        if (i10 == 0) {
            return false;
        }
        int abs = Math.abs(i10);
        int i11 = this.f38537w;
        if (abs > i11 / 2) {
            i10 = i10 > 0 ? i10 - i11 : i10 + i11;
        }
        scrollBy(0, finalY + i10);
        return true;
    }

    public final void Q(int i10, int i11) {
        j jVar = this.f38528p;
        if (jVar != null) {
            jVar.a(this, i10, this.f38527o);
        }
    }

    public final void R(int i10) {
        if (this.f38508W == i10) {
            return;
        }
        this.f38508W = i10;
        i iVar = this.f38531q;
        if (iVar != null) {
            iVar.a(this, i10);
        }
    }

    public final void S(Scroller scroller) {
        if (scroller == this.f38543z) {
            D();
            d0();
            R(0);
        } else if (this.f38508W != 1) {
            d0();
        }
    }

    public final void T() {
        RunnableC0536e runnableC0536e = this.f38493E;
        if (runnableC0536e == null) {
            this.f38493E = new RunnableC0536e();
        } else {
            removeCallbacks(runnableC0536e);
        }
        postDelayed(this.f38493E, ViewConfiguration.getLongPressTimeout());
    }

    public final void U(boolean z10, long j10) {
        f fVar = this.f38492D;
        if (fVar == null) {
            this.f38492D = new f();
        } else {
            removeCallbacks(fVar);
        }
        this.f38492D.b(z10);
        postDelayed(this.f38492D, j10);
    }

    public final void V(int i10, int i11) {
        if (this.f38491C == null) {
            this.f38491C = new l(this.f38514d);
        }
        this.f38491C.b(i10, i11);
    }

    public final void W() {
        f fVar = this.f38492D;
        if (fVar != null) {
            removeCallbacks(fVar);
        }
        l lVar = this.f38491C;
        if (lVar != null) {
            lVar.a();
        }
        RunnableC0536e runnableC0536e = this.f38493E;
        if (runnableC0536e != null) {
            removeCallbacks(runnableC0536e);
        }
        this.f38519g2.c();
    }

    public final void X() {
        RunnableC0536e runnableC0536e = this.f38493E;
        if (runnableC0536e != null) {
            removeCallbacks(runnableC0536e);
        }
    }

    public final void Y() {
        f fVar = this.f38492D;
        if (fVar != null) {
            removeCallbacks(fVar);
        }
    }

    public final int Z(int i10, int i11, int i12) {
        return i10 != -1 ? View.resolveSizeAndState(Math.max(i10, i11), i12, 0) : i11;
    }

    public final void a0(int i10, boolean z10) {
        if (this.f38527o == i10) {
            return;
        }
        int I10 = this.f38501O ? I(i10) : Math.min(Math.max(i10, this.f38525m), this.f38526n);
        int i11 = this.f38527o;
        this.f38527o = I10;
        if (this.f38508W != 2) {
            d0();
        }
        if (z10) {
            Q(i11, I10);
        }
        N();
        invalidate();
    }

    public final void b0() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            if (this.f38503R) {
                this.f38514d.setVisibility(0);
            }
            this.f38514d.requestFocus();
            inputMethodManager.showSoftInput(this.f38514d, 0);
        }
    }

    public final void c0() {
        int i10;
        if (this.f38522j) {
            String[] strArr = this.mDisplayedValues;
            int i11 = 0;
            if (strArr == null) {
                float f10 = 0.0f;
                for (int i12 = 0; i12 <= 9; i12++) {
                    float measureText = this.f38535u.measureText(G(i12));
                    if (measureText > f10) {
                        f10 = measureText;
                    }
                }
                for (int i13 = this.f38526n; i13 > 0; i13 /= 10) {
                    i11++;
                }
                i10 = (int) (i11 * f10);
            } else {
                int length = strArr.length;
                int i14 = 0;
                while (i11 < length) {
                    float measureText2 = this.f38535u.measureText(this.mDisplayedValues[i11]);
                    if (measureText2 > i14) {
                        i14 = (int) measureText2;
                    }
                    i11++;
                }
                i10 = i14;
            }
            int paddingLeft = i10 + this.f38514d.getPaddingLeft() + this.f38514d.getPaddingRight();
            if (this.f38521i != paddingLeft) {
                int i15 = this.f38520h;
                if (paddingLeft > i15) {
                    this.f38521i = paddingLeft;
                } else {
                    this.f38521i = i15;
                }
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.f38543z;
        if (scroller.isFinished()) {
            scroller = this.f38489A;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.f38490B == 0) {
            this.f38490B = scroller.getStartY();
        }
        scrollBy(0, currY - this.f38490B);
        this.f38490B = currY;
        if (scroller.isFinished()) {
            S(scroller);
        } else {
            invalidate();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return this.f38541y;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        return ((this.f38526n - this.f38525m) + 1) * this.f38537w;
    }

    public final boolean d0() {
        String[] strArr = this.mDisplayedValues;
        String F10 = strArr == null ? F(this.f38527o) : strArr[this.f38527o - this.f38525m];
        if (!TextUtils.isEmpty(F10)) {
            Editable text = this.f38514d.getText();
            if (!F10.equals(text.toString())) {
                this.f38514d.setText(F10);
                if (!com.henninghall.date_picker.generated.a.a(getContext()).isEnabled()) {
                    return true;
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain(16);
                this.f38514d.onInitializeAccessibilityEvent(obtain);
                this.f38514d.onPopulateAccessibilityEvent(obtain);
                obtain.setFromIndex(0);
                obtain.setRemovedCount(text.length());
                obtain.setAddedCount(F10.length());
                obtain.setBeforeText(text);
                obtain.setSource(this, 2);
                requestSendAccessibilityEvent(this, obtain);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f38503R) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!com.henninghall.date_picker.generated.a.a(getContext()).isEnabled()) {
            return false;
        }
        int y10 = (int) motionEvent.getY();
        int i10 = y10 < this.f38529p1 ? 3 : y10 > this.f38539x1 ? 1 : 2;
        int actionMasked = motionEvent.getActionMasked();
        d dVar = (d) getAccessibilityNodeProvider();
        if (actionMasked == 7) {
            int i11 = this.f38542y1;
            if (i11 == i10 || i11 == -1) {
                return false;
            }
            dVar.k(i11, 256);
            dVar.k(i10, 128);
            this.f38542y1 = i10;
            dVar.performAction(i10, 64, null);
            return false;
        }
        if (actionMasked == 9) {
            dVar.k(i10, 128);
            this.f38542y1 = i10;
            dVar.performAction(i10, 64, null);
            return false;
        }
        if (actionMasked != 10) {
            return false;
        }
        dVar.k(i10, 256);
        this.f38542y1 = -1;
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 20) {
            if (this.f38503R) {
                int action = keyEvent.getAction();
                if (action == 0) {
                    if (!this.f38501O) {
                        if (keyCode == 20) {
                        }
                    }
                    requestFocus();
                    this.f38530p2 = keyCode;
                    W();
                    if (this.f38543z.isFinished()) {
                        A(keyCode == 20);
                    }
                    return true;
                }
                if (action == 1 && this.f38530p2 == keyCode) {
                    this.f38530p2 = -1;
                    return true;
                }
            }
        } else if (keyCode == 23 || keyCode == 66 || keyCode == 160) {
            W();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            W();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            W();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f38504T;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidateDrawable(drawable);
        }
    }

    public final void e0() {
        this.f38501O = this.f38526n - this.f38525m >= this.mSelectorIndices.length && this.f38509a;
    }

    public final void f0(View view) {
        String valueOf = String.valueOf(((TextView) view).getText());
        if (TextUtils.isEmpty(valueOf)) {
            d0();
        } else {
            a0(H(valueOf.toString()), true);
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (!this.f38503R) {
            return super.getAccessibilityNodeProvider();
        }
        if (this.f38512b2 == null) {
            this.f38512b2 = new d();
        }
        return this.f38512b2;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public CharSequence getDisplayedValueForCurrentSelection() {
        return (CharSequence) this.f38534t.get(getValue());
    }

    public String[] getDisplayedValues() {
        return this.mDisplayedValues;
    }

    public int getMaxValue() {
        return this.f38526n;
    }

    public int getMinValue() {
        return this.f38525m;
    }

    public int getSelectionDividerHeight() {
        return this.f38506V;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return this.f38502P;
    }

    public int getTextColor() {
        return this.f38535u.getColor();
    }

    public float getTextSize() {
        return this.f38535u.getTextSize();
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.f38527o;
    }

    public boolean getWrapSelectorWheel() {
        return this.f38501O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f38504T;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        W();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        if (!this.f38503R) {
            super.onDraw(canvas);
            return;
        }
        boolean hasFocus = this.f38540x2 ? hasFocus() : true;
        float right = (getRight() - getLeft()) / 2;
        float f10 = this.f38541y;
        if (hasFocus && (drawable2 = this.f38536v) != null && this.f38508W == 0) {
            boolean z10 = this.f38507V1;
            int[] iArr = LinearLayout.PRESSED_STATE_SET;
            if (z10) {
                drawable2.setState(iArr);
                this.f38536v.setBounds(0, 0, getRight(), this.f38529p1);
                this.f38536v.draw(canvas);
            }
            if (this.f38505T1) {
                this.f38536v.setState(iArr);
                this.f38536v.setBounds(0, this.f38539x1, getRight(), getBottom());
                this.f38536v.draw(canvas);
            }
        }
        int[] iArr2 = this.mSelectorIndices;
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            String str = (String) this.f38534t.get(iArr2[i10]);
            if ((hasFocus && i10 != 1) || (i10 == 1 && this.f38514d.getVisibility() != 0)) {
                canvas.drawText(str, right, f10, this.f38535u);
            }
            f10 += this.f38537w;
        }
        if (!hasFocus || (drawable = this.f38504T) == null) {
            return;
        }
        int i11 = this.f38529p1;
        drawable.setBounds(0, i11, getRight(), this.f38506V + i11);
        this.f38504T.draw(canvas);
        int i12 = this.f38539x1;
        this.f38504T.setBounds(0, i12 - this.f38506V, getRight(), i12);
        this.f38504T.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f38503R || !isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        W();
        J();
        float y10 = motionEvent.getY();
        this.f38494F = y10;
        this.f38496H = y10;
        this.f38495G = motionEvent.getEventTime();
        this.f38511b1 = false;
        this.f38518g1 = false;
        float f10 = this.f38494F;
        if (f10 < this.f38529p1) {
            if (this.f38508W == 0) {
                this.f38519g2.a(2);
            }
        } else if (f10 > this.f38539x1 && this.f38508W == 0) {
            this.f38519g2.a(1);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.f38543z.isFinished()) {
            this.f38543z.forceFinished(true);
            this.f38489A.forceFinished(true);
            S(this.f38543z);
            R(0);
        } else if (this.f38489A.isFinished()) {
            float f11 = this.f38494F;
            if (f11 < this.f38529p1) {
                U(false, ViewConfiguration.getLongPressTimeout());
            } else if (f11 > this.f38539x1) {
                U(true, ViewConfiguration.getLongPressTimeout());
            } else {
                this.f38518g1 = true;
                T();
            }
        } else {
            this.f38543z.forceFinished(true);
            this.f38489A.forceFinished(true);
            S(this.f38489A);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (!this.f38503R) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f38514d.getMeasuredWidth();
        int measuredHeight2 = this.f38514d.getMeasuredHeight();
        int i14 = (measuredWidth - measuredWidth2) / 2;
        int i15 = (measuredHeight - measuredHeight2) / 2;
        this.f38514d.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
        if (z10) {
            M();
            L();
            int height = getHeight();
            int i16 = this.f38515e;
            int i17 = this.f38506V;
            int i18 = ((height - i16) / 2) - i17;
            this.f38529p1 = i18;
            this.f38539x1 = i18 + (i17 * 2) + i16;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f38503R) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(O(i10, this.f38521i), O(i11, this.f38517g));
            setMeasuredDimension(Z(this.f38520h, getMeasuredWidth(), i10), Z(this.f38516f, getMeasuredHeight(), i11));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.f38503R) {
            return false;
        }
        if (this.f38497I == null) {
            this.f38497I = VelocityTracker.obtain();
        }
        this.f38497I.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            X();
            Y();
            this.f38519g2.c();
            VelocityTracker velocityTracker = this.f38497I;
            velocityTracker.computeCurrentVelocity(1000, this.f38500L);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.f38499K) {
                E(yVelocity);
                R(2);
            } else {
                int y10 = (int) motionEvent.getY();
                int abs = (int) Math.abs(y10 - this.f38494F);
                long eventTime = motionEvent.getEventTime() - this.f38495G;
                if (abs > this.f38498J || eventTime >= ViewConfiguration.getTapTimeout()) {
                    D();
                } else if (this.f38518g1) {
                    this.f38518g1 = false;
                    performClick();
                } else {
                    int i10 = (y10 / this.f38537w) - 1;
                    if (i10 > 0) {
                        A(true);
                        this.f38519g2.b(1);
                    } else if (i10 < 0) {
                        A(false);
                        this.f38519g2.b(2);
                    }
                }
                R(0);
            }
            this.f38497I.recycle();
            this.f38497I = null;
        } else if (actionMasked == 2 && !this.f38511b1) {
            float y11 = motionEvent.getY();
            if (this.f38508W == 1) {
                scrollBy(0, (int) (y11 - this.f38496H));
                invalidate();
            } else if (((int) Math.abs(y11 - this.f38494F)) > this.f38498J) {
                W();
                R(1);
            }
            this.f38496H = y11;
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (!this.f38503R) {
            return super.performClick();
        }
        if (super.performClick()) {
            return true;
        }
        b0();
        return true;
    }

    @Override // android.view.View
    public boolean performLongClick() {
        if (!this.f38503R) {
            return super.performLongClick();
        }
        if (!super.performLongClick()) {
            b0();
            this.f38511b1 = true;
        }
        return true;
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        int i12;
        int[] iArr = this.mSelectorIndices;
        int i13 = this.f38541y;
        boolean z10 = this.f38501O;
        if (!z10 && i11 > 0 && iArr[1] <= this.f38525m) {
            this.f38541y = this.f38538x;
            return;
        }
        if (!z10 && i11 < 0 && iArr[1] >= this.f38526n) {
            this.f38541y = this.f38538x;
            return;
        }
        this.f38541y = i11 + i13;
        while (true) {
            int i14 = this.f38541y;
            if (i14 - this.f38538x <= this.f38524l) {
                break;
            }
            this.f38541y = i14 - this.f38537w;
            B(iArr);
            a0(iArr[1], true);
            if (!this.f38501O && iArr[1] <= this.f38525m) {
                this.f38541y = this.f38538x;
            }
        }
        while (true) {
            i12 = this.f38541y;
            if (i12 - this.f38538x >= (-this.f38524l)) {
                break;
            }
            this.f38541y = i12 + this.f38537w;
            K(iArr);
            a0(iArr[1], true);
            if (!this.f38501O && iArr[1] >= this.f38526n) {
                this.f38541y = this.f38538x;
            }
        }
        if (i13 != i12) {
            onScrollChanged(0, i12, 0, i13);
        }
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.mDisplayedValues == strArr) {
            return;
        }
        this.mDisplayedValues = strArr;
        if (strArr != null) {
            this.f38514d.setRawInputType(524289);
        } else {
            this.f38514d.setRawInputType(2);
        }
        d0();
        N();
        c0();
    }

    public void setDividerTint(int i10) {
        this.f38504T.setTint(i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.f38503R) {
            this.f38510b.setEnabled(z10);
        }
        if (!this.f38503R) {
            this.f38513c.setEnabled(z10);
        }
        this.f38514d.setEnabled(z10);
    }

    public void setFormatter(g gVar) {
        if (gVar == this.f38532r) {
            return;
        }
        this.f38532r = gVar;
        N();
        d0();
    }

    public void setMaxValue(int i10) {
        if (this.f38526n == i10) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.f38526n = i10;
        if (i10 < this.f38527o) {
            this.f38527o = i10;
        }
        e0();
        N();
        d0();
        c0();
        invalidate();
    }

    public void setMinValue(int i10) {
        if (this.f38525m == i10) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.f38525m = i10;
        if (i10 > this.f38527o) {
            this.f38527o = i10;
        }
        e0();
        N();
        d0();
        c0();
        invalidate();
    }

    public void setOnLongPressUpdateInterval(long j10) {
        this.f38533s = j10;
    }

    public void setOnScrollListener(i iVar) {
        this.f38531q = iVar;
    }

    public void setOnValueChangedListener(j jVar) {
        this.f38528p = jVar;
    }

    public void setSelectionDividerHeight(int i10) {
        this.f38506V = i10;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f38535u.setColor(i10);
        this.f38514d.setTextColor(i10);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f38535u.setTextSize(f10);
        this.f38514d.setTextSize(0, f10);
        invalidate();
    }

    public void setValue(int i10) {
        a0(i10, false);
    }

    public void setWrapSelectorWheel(boolean z10) {
        this.f38509a = z10;
        e0();
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public e(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        e eVar;
        Context context2;
        int focusable;
        this.f38509a = true;
        this.f38533s = 300L;
        this.f38534t = new SparseArray();
        this.mSelectorIndices = new int[3];
        this.f38538x = Integer.MIN_VALUE;
        this.f38508W = 0;
        this.f38530p2 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.henninghall.date_picker.m.NumberPicker, i10, i11);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            eVar = this;
            context2 = context;
            eVar.saveAttributeDataForStyleable(context2, com.henninghall.date_picker.m.NumberPicker, attributeSet, obtainStyledAttributes, i10, i11);
        } else {
            eVar = this;
            context2 = context;
        }
        int i13 = com.henninghall.date_picker.l.f38582b;
        eVar.f38503R = true;
        eVar.f38540x2 = obtainStyledAttributes.getBoolean(com.henninghall.date_picker.m.f38583a, false);
        eVar.f38502P = obtainStyledAttributes.getColor(com.henninghall.date_picker.m.f38590h, 0);
        Drawable drawable = getResources().getDrawable(com.henninghall.date_picker.j.f38571a);
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
        eVar.f38504T = drawable;
        eVar.f38506V = obtainStyledAttributes.getDimensionPixelSize(com.henninghall.date_picker.m.f38588f, (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        eVar.f38515e = obtainStyledAttributes.getDimensionPixelSize(com.henninghall.date_picker.m.f38589g, (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(com.henninghall.date_picker.m.f38586d, -1);
        eVar.f38516f = dimensionPixelSize;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(com.henninghall.date_picker.m.f38584b, -1);
        eVar.f38517g = dimensionPixelSize2;
        if (dimensionPixelSize != -1 && dimensionPixelSize2 != -1 && dimensionPixelSize > dimensionPixelSize2) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(com.henninghall.date_picker.m.f38587e, -1);
        eVar.f38520h = dimensionPixelSize3;
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(com.henninghall.date_picker.m.f38585c, -1);
        eVar.f38521i = dimensionPixelSize4;
        if (dimensionPixelSize3 != -1 && dimensionPixelSize4 != -1 && dimensionPixelSize3 > dimensionPixelSize4) {
            throw new IllegalArgumentException("minWidth > maxWidth");
        }
        eVar.f38522j = dimensionPixelSize4 == -1;
        eVar.f38536v = obtainStyledAttributes.getDrawable(com.henninghall.date_picker.m.f38591i);
        obtainStyledAttributes.recycle();
        eVar.f38519g2 = new k();
        setWillNotDraw(!true);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i13, (ViewGroup) this, true);
        new a();
        new b();
        eVar.f38510b = null;
        eVar.f38513c = null;
        EditText editText = (EditText) findViewById(com.henninghall.date_picker.k.f38578g);
        eVar.f38514d = editText;
        editText.setOnFocusChangeListener(new c());
        editText.setFilters(new InputFilter[]{new h()});
        editText.setRawInputType(2);
        editText.setImeOptions(6);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        eVar.f38498J = viewConfiguration.getScaledTouchSlop();
        eVar.f38499K = viewConfiguration.getScaledMinimumFlingVelocity();
        eVar.f38500L = viewConfiguration.getScaledMaximumFlingVelocity();
        int textSize = (int) editText.getTextSize();
        eVar.f38523k = textSize;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(textSize);
        paint.setTypeface(editText.getTypeface());
        paint.setColor(editText.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        eVar.f38535u = paint;
        eVar.f38543z = new Scroller(getContext(), null, true);
        eVar.f38489A = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        d0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        if (i12 >= 26) {
            focusable = getFocusable();
            if (focusable == 16) {
                setFocusable(1);
                setFocusableInTouchMode(true);
            }
        }
    }
}
