package y0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import io.agora.rtc2.internal.AudioRoutingController;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractC5144c;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y0.InterfaceC6837C;

/* loaded from: classes.dex */
public class z {

    /* renamed from: d, reason: collision with root package name */
    public static int f68193d;

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f68194a;

    /* renamed from: b, reason: collision with root package name */
    public int f68195b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f68196c = -1;

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f68197A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f68198B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f68199C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f68200D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f68201E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f68202F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f68203G;

        /* renamed from: H, reason: collision with root package name */
        public static final a f68204H;

        /* renamed from: I, reason: collision with root package name */
        public static final a f68205I;

        /* renamed from: J, reason: collision with root package name */
        public static final a f68206J;

        /* renamed from: K, reason: collision with root package name */
        public static final a f68207K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f68208L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f68209M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f68210N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f68211O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f68212P;

        /* renamed from: Q, reason: collision with root package name */
        public static final a f68213Q;

        /* renamed from: R, reason: collision with root package name */
        public static final a f68214R;

        /* renamed from: S, reason: collision with root package name */
        public static final a f68215S;

        /* renamed from: T, reason: collision with root package name */
        public static final a f68216T;

        /* renamed from: U, reason: collision with root package name */
        public static final a f68217U;

        /* renamed from: V, reason: collision with root package name */
        public static final a f68218V;

        /* renamed from: e, reason: collision with root package name */
        public static final a f68219e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f68220f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f68221g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f68222h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f68223i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f68224j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f68225k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f68226l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f68227m = new a(256, (CharSequence) null, InterfaceC6837C.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f68228n = new a(512, (CharSequence) null, InterfaceC6837C.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f68229o = new a(1024, (CharSequence) null, InterfaceC6837C.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f68230p = new a(2048, (CharSequence) null, InterfaceC6837C.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f68231q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f68232r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f68233s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f68234t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f68235u = new a(PKIFailureInfo.notAuthorized, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f68236v = new a(PKIFailureInfo.unsupportedVersion, (CharSequence) null, InterfaceC6837C.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f68237w = new a(PKIFailureInfo.transactionIdInUse, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f68238x = new a(PKIFailureInfo.signerNotTrusted, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f68239y = new a(PKIFailureInfo.badCertTemplate, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f68240z = new a(PKIFailureInfo.badSenderNonce, (CharSequence) null, InterfaceC6837C.h.class);

        /* renamed from: a, reason: collision with root package name */
        public final Object f68241a;

        /* renamed from: b, reason: collision with root package name */
        public final int f68242b;

        /* renamed from: c, reason: collision with root package name */
        public final Class f68243c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC6837C f68244d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            int i10 = Build.VERSION.SDK_INT;
            f68197A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f68198B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC6837C.e.class);
            f68199C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f68200D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f68201E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f68202F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f68203G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            if (i10 >= 29) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction = accessibilityAction20;
            } else {
                accessibilityAction = null;
            }
            f68204H = new a(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
            if (i10 >= 29) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction2 = accessibilityAction19;
            } else {
                accessibilityAction2 = null;
            }
            f68205I = new a(accessibilityAction2, R.id.accessibilityActionPageLeft, null, null, null);
            if (i10 >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction3 = accessibilityAction18;
            } else {
                accessibilityAction3 = null;
            }
            f68206J = new a(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
            f68207K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f68208L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC6837C.f.class);
            f68209M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, InterfaceC6837C.d.class);
            f68210N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i10 >= 28) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction4 = accessibilityAction17;
            } else {
                accessibilityAction4 = null;
            }
            f68211O = new a(accessibilityAction4, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i10 >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction5 = accessibilityAction16;
            } else {
                accessibilityAction5 = null;
            }
            f68212P = new a(accessibilityAction5, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i10 >= 30) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction6 = accessibilityAction15;
            } else {
                accessibilityAction6 = null;
            }
            f68213Q = new a(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
            if (i10 >= 32) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction7 = accessibilityAction14;
            } else {
                accessibilityAction7 = null;
            }
            f68214R = new a(accessibilityAction7, R.id.accessibilityActionDragStart, null, null, null);
            if (i10 >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction8 = accessibilityAction13;
            } else {
                accessibilityAction8 = null;
            }
            f68215S = new a(accessibilityAction8, R.id.accessibilityActionDragDrop, null, null, null);
            if (i10 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction9 = accessibilityAction12;
            } else {
                accessibilityAction9 = null;
            }
            f68216T = new a(accessibilityAction9, R.id.accessibilityActionDragCancel, null, null, null);
            if (i10 >= 33) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction10 = accessibilityAction11;
            } else {
                accessibilityAction10 = null;
            }
            f68217U = new a(accessibilityAction10, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f68218V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, InterfaceC6837C interfaceC6837C) {
            return new a(null, this.f68242b, charSequence, interfaceC6837C, this.f68243c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f68241a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f68241a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f68244d == null) {
                return false;
            }
            Class cls = this.f68243c;
            if (cls != null) {
                try {
                    android.support.v4.media.session.b.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f68243c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                }
            }
            return this.f68244d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f68241a;
            return obj2 == null ? aVar.f68241a == null : obj2.equals(aVar.f68241a);
        }

        public int hashCode() {
            Object obj = this.f68241a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String j10 = z.j(this.f68242b);
            if (j10.equals("ACTION_UNKNOWN") && c() != null) {
                j10 = c().toString();
            }
            sb2.append(j10);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, InterfaceC6837C interfaceC6837C) {
            this(null, i10, charSequence, interfaceC6837C, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, InterfaceC6837C interfaceC6837C, Class cls) {
            this.f68242b = i10;
            this.f68244d = interfaceC6837C;
            if (obj == null) {
                this.f68241a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f68241a = obj;
            }
            this.f68243c = cls;
        }
    }

    public static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    public static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class e {
        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Object f68245a;

        public f(Object obj) {
            this.f68245a = obj;
        }

        public static f a(int i10, int i11, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static f b(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final Object f68246a;

        public g(Object obj) {
            this.f68246a = obj;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static g b(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final Object f68247a;

        public h(Object obj) {
            this.f68247a = obj;
        }

        public static h d(int i10, float f10, float f11, float f12) {
            return new h(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f68247a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f68247a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f68247a).getMin();
        }
    }

    public z(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f68194a = accessibilityNodeInfo;
    }

    public static z f1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new z(accessibilityNodeInfo);
    }

    public static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case PKIFailureInfo.notAuthorized /* 65536 */:
                return "ACTION_CUT";
            case PKIFailureInfo.unsupportedVersion /* 131072 */:
                return "ACTION_SET_SELECTION";
            case PKIFailureInfo.transactionIdInUse /* 262144 */:
                return "ACTION_EXPAND";
            case PKIFailureInfo.signerNotTrusted /* 524288 */:
                return "ACTION_COLLAPSE";
            case PKIFailureInfo.badSenderNonce /* 2097152 */:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static z j0() {
        return f1(AccessibilityNodeInfo.obtain());
    }

    public static z k0(View view) {
        return f1(AccessibilityNodeInfo.obtain(view));
    }

    public static z l0(z zVar) {
        return f1(AccessibilityNodeInfo.obtain(zVar.f68194a));
    }

    public static ClickableSpan[] t(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static String z(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "FULL" : "PARTIAL" : "COLLAPSED" : "UNDEFINED";
    }

    public Bundle A() {
        return this.f68194a.getExtras();
    }

    public void A0(CharSequence charSequence) {
        this.f68194a.setContentDescription(charSequence);
    }

    public CharSequence B() {
        CharSequence hintText;
        if (Build.VERSION.SDK_INT < 26) {
            return this.f68194a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
        }
        hintText = this.f68194a.getHintText();
        return hintText;
    }

    public void B0(boolean z10) {
        this.f68194a.setDismissable(z10);
    }

    public int C() {
        return this.f68194a.getMaxTextLength();
    }

    public void C0(boolean z10) {
        this.f68194a.setEnabled(z10);
    }

    public final SparseArray D(View view) {
        SparseArray G10 = G(view);
        if (G10 != null) {
            return G10;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(AbstractC5144c.f54019I, sparseArray);
        return sparseArray;
    }

    public void D0(CharSequence charSequence) {
        this.f68194a.setError(charSequence);
    }

    public CharSequence E() {
        return this.f68194a.getPackageName();
    }

    public void E0(boolean z10) {
        this.f68194a.setFocusable(z10);
    }

    public h F() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f68194a.getRangeInfo();
        if (rangeInfo != null) {
            return new h(rangeInfo);
        }
        return null;
    }

    public void F0(boolean z10) {
        this.f68194a.setFocused(z10);
    }

    public final SparseArray G(View view) {
        return (SparseArray) view.getTag(AbstractC5144c.f54019I);
    }

    public void G0(boolean z10) {
        r0(AudioRoutingController.DEVICE_OUT_USB_HEADSET, z10);
    }

    public CharSequence H() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f68194a) : this.f68194a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void H0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f68194a.setHeading(z10);
        } else {
            r0(2, z10);
        }
    }

    public CharSequence I() {
        return Build.VERSION.SDK_INT >= 36 ? e.d(this.f68194a) : this.f68194a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void I0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f68194a.setHintText(charSequence);
        } else {
            this.f68194a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence J() {
        if (!N()) {
            return this.f68194a.getText();
        }
        List h10 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List h11 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List h12 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List h13 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f68194a.getText(), 0, this.f68194a.getText().length()));
        for (int i10 = 0; i10 < h10.size(); i10++) {
            spannableString.setSpan(new C6838a(((Integer) h13.get(i10)).intValue(), this, A().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) h10.get(i10)).intValue(), ((Integer) h11.get(i10)).intValue(), ((Integer) h12.get(i10)).intValue());
        }
        return spannableString;
    }

    public void J0(View view) {
        this.f68194a.setLabelFor(view);
    }

    public CharSequence K() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT < 28) {
            return this.f68194a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        tooltipText = this.f68194a.getTooltipText();
        return tooltipText;
    }

    public void K0(View view) {
        this.f68194a.setLabeledBy(view);
    }

    public String L() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f68194a) : this.f68194a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void L0(int i10) {
        this.f68194a.setMaxTextLength(i10);
    }

    public String M() {
        return this.f68194a.getViewIdResourceName();
    }

    public void M0(CharSequence charSequence) {
        this.f68194a.setPackageName(charSequence);
    }

    public final boolean N() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void N0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f68194a.setPaneTitle(charSequence);
        } else {
            this.f68194a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public final int O(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f68193d;
        f68193d = i11 + 1;
        return i11;
    }

    public void O0(View view) {
        this.f68195b = -1;
        this.f68194a.setParent(view);
    }

    public boolean P() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f68194a) : l(64);
    }

    public void P0(View view, int i10) {
        this.f68195b = i10;
        this.f68194a.setParent(view, i10);
    }

    public boolean Q() {
        return this.f68194a.isAccessibilityFocused();
    }

    public void Q0(h hVar) {
        this.f68194a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) hVar.f68247a);
    }

    public boolean R() {
        return this.f68194a.isCheckable();
    }

    public void R0(CharSequence charSequence) {
        this.f68194a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean S() {
        return this.f68194a.isChecked();
    }

    public void S0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f68194a.setScreenReaderFocusable(z10);
        } else {
            r0(1, z10);
        }
    }

    public boolean T() {
        return this.f68194a.isClickable();
    }

    public void T0(boolean z10) {
        this.f68194a.setScrollable(z10);
    }

    public boolean U() {
        return this.f68194a.isContextClickable();
    }

    public void U0(boolean z10) {
        this.f68194a.setSelected(z10);
    }

    public boolean V() {
        return this.f68194a.isEnabled();
    }

    public void V0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f68194a.setShowingHintText(z10);
        } else {
            r0(4, z10);
        }
    }

    public boolean W() {
        return Build.VERSION.SDK_INT >= 36 ? e.e(this.f68194a) : this.f68194a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void W0(View view) {
        this.f68196c = -1;
        this.f68194a.setSource(view);
    }

    public boolean X() {
        return this.f68194a.isFocusable();
    }

    public void X0(View view, int i10) {
        this.f68196c = i10;
        this.f68194a.setSource(view, i10);
    }

    public boolean Y() {
        return this.f68194a.isFocused();
    }

    public void Y0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f68194a, charSequence);
        } else {
            this.f68194a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean Z() {
        return l(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    public void Z0(CharSequence charSequence) {
        this.f68194a.setText(charSequence);
    }

    public void a(int i10) {
        this.f68194a.addAction(i10);
    }

    public boolean a0() {
        return this.f68194a.isImportantForAccessibility();
    }

    public void a1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f68194a.setTooltipText(charSequence);
        } else {
            this.f68194a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void b(a aVar) {
        this.f68194a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f68241a);
    }

    public boolean b0() {
        return this.f68194a.isLongClickable();
    }

    public void b1(View view) {
        this.f68194a.setTraversalAfter(view);
    }

    public void c(View view) {
        this.f68194a.addChild(view);
    }

    public boolean c0() {
        return this.f68194a.isPassword();
    }

    public void c1(String str) {
        this.f68194a.setViewIdResourceName(str);
    }

    public void d(View view, int i10) {
        this.f68194a.addChild(view, i10);
    }

    public boolean d0() {
        boolean isScreenReaderFocusable;
        if (Build.VERSION.SDK_INT < 28) {
            return l(1);
        }
        isScreenReaderFocusable = this.f68194a.isScreenReaderFocusable();
        return isScreenReaderFocusable;
    }

    public void d1(boolean z10) {
        this.f68194a.setVisibleToUser(z10);
    }

    public final void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    public boolean e0() {
        return this.f68194a.isScrollable();
    }

    public AccessibilityNodeInfo e1() {
        return this.f68194a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f68194a;
        if (accessibilityNodeInfo == null) {
            if (zVar.f68194a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(zVar.f68194a)) {
            return false;
        }
        return this.f68196c == zVar.f68196c && this.f68195b == zVar.f68195b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            p0(view);
            ClickableSpan[] t10 = t(charSequence);
            if (t10 == null || t10.length <= 0) {
                return;
            }
            A().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC5144c.f54031a);
            SparseArray D10 = D(view);
            for (int i10 = 0; i10 < t10.length; i10++) {
                int O10 = O(t10[i10], D10);
                D10.put(O10, new WeakReference(t10[i10]));
                e(t10[i10], (Spanned) charSequence, O10);
            }
        }
    }

    public boolean f0() {
        return this.f68194a.isSelected();
    }

    public final void g() {
        this.f68194a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f68194a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f68194a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f68194a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public boolean g0() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT < 26) {
            return l(4);
        }
        isShowingHintText = this.f68194a.isShowingHintText();
        return isShowingHintText;
    }

    public final List h(String str) {
        ArrayList<Integer> integerArrayList = this.f68194a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f68194a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public boolean h0() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f68194a) : l(8388608);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f68194a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f68194a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public boolean i0() {
        return this.f68194a.isVisibleToUser();
    }

    public int k() {
        return this.f68194a.getActions();
    }

    public final boolean l(int i10) {
        Bundle A10 = A();
        return A10 != null && (A10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public void m(Rect rect) {
        this.f68194a.getBoundsInParent(rect);
    }

    public boolean m0(int i10, Bundle bundle) {
        return this.f68194a.performAction(i10, bundle);
    }

    public void n(Rect rect) {
        this.f68194a.getBoundsInScreen(rect);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f68194a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f68194a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public boolean o0(a aVar) {
        return this.f68194a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f68241a);
    }

    public int p() {
        return Build.VERSION.SDK_INT >= 36 ? e.b(this.f68194a) : this.f68194a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f68194a.isChecked() ? 1 : 0);
    }

    public final void p0(View view) {
        SparseArray G10 = G(view);
        if (G10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < G10.size(); i10++) {
                if (((WeakReference) G10.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                G10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    public final String q() {
        int p10 = p();
        return p10 == 1 ? "TRUE" : p10 == 2 ? "PARTIAL" : "FALSE";
    }

    public void q0(boolean z10) {
        this.f68194a.setAccessibilityFocused(z10);
    }

    public int r() {
        return this.f68194a.getChildCount();
    }

    public final void r0(int i10, boolean z10) {
        Bundle A10 = A();
        if (A10 != null) {
            int i11 = A10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            A10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public CharSequence s() {
        return this.f68194a.getClassName();
    }

    public void s0(Rect rect) {
        this.f68194a.setBoundsInParent(rect);
    }

    public void t0(Rect rect) {
        this.f68194a.setBoundsInScreen(rect);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        o(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(E());
        sb2.append("; className: ");
        sb2.append(s());
        sb2.append("; text: ");
        sb2.append(J());
        sb2.append("; error: ");
        sb2.append(x());
        sb2.append("; maxTextLength: ");
        sb2.append(C());
        sb2.append("; stateDescription: ");
        sb2.append(H());
        sb2.append("; contentDescription: ");
        sb2.append(w());
        sb2.append("; supplementalDescription: ");
        sb2.append(I());
        sb2.append("; tooltipText: ");
        sb2.append(K());
        sb2.append("; viewIdResName: ");
        sb2.append(M());
        sb2.append("; uniqueId: ");
        sb2.append(L());
        sb2.append("; checkable: ");
        sb2.append(R());
        sb2.append("; checked: ");
        sb2.append(q());
        sb2.append("; fieldRequired: ");
        sb2.append(W());
        sb2.append("; focusable: ");
        sb2.append(X());
        sb2.append("; focused: ");
        sb2.append(Y());
        sb2.append("; selected: ");
        sb2.append(f0());
        sb2.append("; clickable: ");
        sb2.append(T());
        sb2.append("; longClickable: ");
        sb2.append(b0());
        sb2.append("; contextClickable: ");
        sb2.append(U());
        sb2.append("; expandedState: ");
        sb2.append(z(y()));
        sb2.append("; enabled: ");
        sb2.append(V());
        sb2.append("; password: ");
        sb2.append(c0());
        sb2.append("; scrollable: " + e0());
        sb2.append("; containerTitle: ");
        sb2.append(v());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(Z());
        sb2.append("; importantForAccessibility: ");
        sb2.append(a0());
        sb2.append("; visible: ");
        sb2.append(i0());
        sb2.append("; isTextSelectable: ");
        sb2.append(h0());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(P());
        sb2.append("; [");
        List i10 = i();
        for (int i11 = 0; i11 < i10.size(); i11++) {
            a aVar = (a) i10.get(i11);
            String j10 = j(aVar.b());
            if (j10.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                j10 = aVar.c().toString();
            }
            sb2.append(j10);
            if (i11 != i10.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public f u() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f68194a.getCollectionInfo();
        if (collectionInfo != null) {
            return new f(collectionInfo);
        }
        return null;
    }

    public void u0(boolean z10) {
        this.f68194a.setCheckable(z10);
    }

    public CharSequence v() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f68194a) : this.f68194a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void v0(boolean z10) {
        this.f68194a.setChecked(z10);
    }

    public CharSequence w() {
        return this.f68194a.getContentDescription();
    }

    public void w0(CharSequence charSequence) {
        this.f68194a.setClassName(charSequence);
    }

    public CharSequence x() {
        return this.f68194a.getError();
    }

    public void x0(boolean z10) {
        this.f68194a.setClickable(z10);
    }

    public int y() {
        return Build.VERSION.SDK_INT >= 36 ? e.c(this.f68194a) : this.f68194a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void y0(Object obj) {
        this.f68194a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f68245a);
    }

    public void z0(Object obj) {
        this.f68194a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f68246a);
    }

    public void n0() {
    }
}
