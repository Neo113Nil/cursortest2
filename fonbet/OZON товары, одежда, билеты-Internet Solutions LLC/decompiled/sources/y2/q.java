package y2;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import c2.C5728b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.chip.Chip;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y2.s;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f105939a;

    /* renamed from: b, reason: collision with root package name */
    public int f105940b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f105941c = -1;

    public static class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f105942e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f105943f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f105944g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f105945h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f105946i;

        /* renamed from: j, reason: collision with root package name */
        public static final a f105947j;

        /* renamed from: k, reason: collision with root package name */
        public static final a f105948k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f105949l;

        /* renamed from: m, reason: collision with root package name */
        public static final a f105950m;

        /* renamed from: n, reason: collision with root package name */
        public static final a f105951n;

        /* renamed from: o, reason: collision with root package name */
        public static final a f105952o;

        /* renamed from: p, reason: collision with root package name */
        public static final a f105953p;

        /* renamed from: a, reason: collision with root package name */
        final Object f105954a;

        /* renamed from: b, reason: collision with root package name */
        private final int f105955b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<? extends s.a> f105956c;

        /* renamed from: d, reason: collision with root package name */
        protected final s f105957d;

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
            new a(1, (String) null);
            new a(2, (String) null);
            new a(4, (String) null);
            new a(8, (String) null);
            f105942e = new a(16, (String) null);
            new a(32, (String) null);
            f105943f = new a(64, (String) null);
            f105944g = new a(UserVerificationMethods.USER_VERIFY_PATTERN, (String) null);
            new a(256, s.b.class);
            new a(UserVerificationMethods.USER_VERIFY_NONE, s.b.class);
            new a(UserVerificationMethods.USER_VERIFY_ALL, s.c.class);
            new a(2048, s.c.class);
            f105945h = new a(4096, (String) null);
            f105946i = new a(8192, (String) null);
            new a(16384, (String) null);
            new a(32768, (String) null);
            new a(65536, (String) null);
            new a(131072, s.g.class);
            f105947j = new a(262144, (String) null);
            f105948k = new a(524288, (String) null);
            f105949l = new a(1048576, (String) null);
            new a(2097152, s.h.class);
            int i11 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, s.e.class);
            f105950m = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f105951n = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f105952o = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f105953p = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            if (i11 >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction18;
            } else {
                accessibilityAction = null;
            }
            new a(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            if (i11 >= 29) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction17;
            } else {
                accessibilityAction2 = null;
            }
            new a(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            new a(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            if (i11 >= 29) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction3 = accessibilityAction16;
            } else {
                accessibilityAction3 = null;
            }
            new a(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, s.f.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, s.d.class);
            if (i11 >= 28) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction4 = accessibilityAction15;
            } else {
                accessibilityAction4 = null;
            }
            new a(accessibilityAction4, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i11 >= 28) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction5 = accessibilityAction14;
            } else {
                accessibilityAction5 = null;
            }
            new a(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
            new a(i11 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i11 >= 30) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction6 = accessibilityAction13;
            } else {
                accessibilityAction6 = null;
            }
            new a(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
            new a(i11 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            if (i11 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction7 = accessibilityAction12;
            } else {
                accessibilityAction7 = null;
            }
            new a(accessibilityAction7, R.id.accessibilityActionDragDrop, null, null, null);
            if (i11 >= 32) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction8 = accessibilityAction11;
            } else {
                accessibilityAction8 = null;
            }
            new a(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
            if (i11 >= 33) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction9 = accessibilityAction10;
            } else {
                accessibilityAction9 = null;
            }
            new a(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            new a(i11 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i11, String str) {
            this(null, i11, str, null, null);
        }

        public final a a(s sVar) {
            return new a(null, this.f105955b, null, sVar, this.f105956c);
        }

        public final int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f105954a).getId();
        }

        public final CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f105954a).getLabel();
        }

        public final boolean d(View view) {
            s sVar = this.f105957d;
            if (sVar == null) {
                return false;
            }
            Class<? extends s.a> cls = this.f105956c;
            if (cls != null) {
                try {
                    cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                } catch (Exception e11) {
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e11);
                }
            }
            return sVar.a(view);
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).f105954a;
            Object obj3 = this.f105954a;
            return obj3 == null ? obj2 == null : obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.f105954a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
            String f7 = q.f(this.f105955b);
            if (f7.equals("ACTION_UNKNOWN") && c() != null) {
                f7 = c().toString();
            }
            sb2.append(f7);
            return sb2.toString();
        }

        public a(int i11, String str, s sVar) {
            this(null, i11, str, sVar, null);
        }

        private a(int i11, Class cls) {
            this(null, i11, null, null, cls);
        }

        a(Object obj, int i11, String str, s sVar, Class cls) {
            this.f105955b = i11;
            this.f105957d = sVar;
            if (obj == null) {
                this.f105954a = new AccessibilityNodeInfo.AccessibilityAction(i11, str);
            } else {
                this.f105954a = obj;
            }
            this.f105956c = cls;
        }
    }

    private static class b {
        public static Object a(int i11, float f7, float f11, float f12) {
            return new AccessibilityNodeInfo.RangeInfo(i11, f7, f11, f12);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes8.dex */
    private static class c {
        public static f a(boolean z11, int i11, int i12, int i13, int i14, boolean z12, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z11).setColumnIndex(i11).setRowIndex(i12).setColumnSpan(i13).setRowSpan(i14).setSelected(z12).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static q b(AccessibilityNodeInfo accessibilityNodeInfo, int i11, int i12) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i11, i12);
            if (child != null) {
                return new q(child, 0);
            }
            return null;
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static q f(AccessibilityNodeInfo accessibilityNodeInfo, int i11) {
            AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i11);
            if (parent != null) {
                return new q(parent, 0);
            }
            return null;
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z11) {
            accessibilityNodeInfo.setTextSelectable(z11);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* loaded from: classes8.dex */
    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z11) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z11);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j11) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j11));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z11) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z11);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z11) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z11);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        final AccessibilityNodeInfo.CollectionInfo f105958a;

        e(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f105958a = collectionInfo;
        }

        public static e a(int i11, int i12, int i13, boolean z11) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i11, i12, z11, i13));
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        final AccessibilityNodeInfo.CollectionItemInfo f105959a;

        f(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f105959a = collectionItemInfo;
        }

        public static f f(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, i12, i13, i14, z11, z12));
        }

        public final int a() {
            return this.f105959a.getColumnIndex();
        }

        public final int b() {
            return this.f105959a.getColumnSpan();
        }

        public final int c() {
            return this.f105959a.getRowIndex();
        }

        public final int d() {
            return this.f105959a.getRowSpan();
        }

        public final boolean e() {
            return this.f105959a.isSelected();
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        final AccessibilityNodeInfo.RangeInfo f105960a;

        g(AccessibilityNodeInfo.RangeInfo rangeInfo) {
            this.f105960a = rangeInfo;
        }

        public static g a(float f7, float f11, float f12) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(1, f7, f11, f12));
        }
    }

    @Deprecated
    public q(AccessibilityNodeInfo accessibilityNodeInfo, int i11) {
        this.f105939a = accessibilityNodeInfo;
    }

    public static q A(Chip chip) {
        return new q(AccessibilityNodeInfo.obtain(chip));
    }

    public static q A0(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        return new q(accessibilityNodeInfo);
    }

    public static q B(q qVar) {
        return new q(AccessibilityNodeInfo.obtain(qVar.f105939a));
    }

    private ArrayList e(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f105939a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String f(int i11) {
        if (i11 == 1) {
            return "ACTION_FOCUS";
        }
        if (i11 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i11) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case UserVerificationMethods.USER_VERIFY_NONE /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case UserVerificationMethods.USER_VERIFY_ALL /* 1024 */:
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
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i11) {
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
                        switch (i11) {
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
                                switch (i11) {
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

    private boolean h(int i11) {
        Bundle extras = this.f105939a.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i11) == i11;
    }

    public static q z() {
        return new q(AccessibilityNodeInfo.obtain());
    }

    public final void C(int i11, Bundle bundle) {
        this.f105939a.performAction(i11, bundle);
    }

    public final void D(a aVar) {
        this.f105939a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f105954a);
    }

    public final void E(boolean z11) {
        this.f105939a.setAccessibilityFocused(z11);
    }

    public final void F(@NonNull ArrayList arrayList) {
        this.f105939a.setAvailableExtraData(arrayList);
    }

    @Deprecated
    public final void G(Rect rect) {
        this.f105939a.setBoundsInParent(rect);
    }

    public final void H(Rect rect) {
        this.f105939a.setBoundsInScreen(rect);
    }

    public final void I(boolean z11) {
        this.f105939a.setCheckable(z11);
    }

    public final void J(boolean z11) {
        this.f105939a.setChecked(z11);
    }

    public final void K(CharSequence charSequence) {
        this.f105939a.setClassName(charSequence);
    }

    public final void L(boolean z11) {
        this.f105939a.setClickable(z11);
    }

    public final void M(e eVar) {
        this.f105939a.setCollectionInfo(eVar == null ? null : eVar.f105958a);
    }

    public final void N(f fVar) {
        this.f105939a.setCollectionItemInfo(fVar.f105959a);
    }

    public final void O(String str) {
        this.f105939a.setContentDescription(str);
    }

    public final void P() {
        this.f105939a.setContentInvalid(true);
    }

    public final void Q(boolean z11) {
        this.f105939a.setDismissable(z11);
    }

    public final void R(boolean z11) {
        this.f105939a.setEditable(z11);
    }

    public final void S(boolean z11) {
        this.f105939a.setEnabled(z11);
    }

    public final void T(CharSequence charSequence) {
        this.f105939a.setError(charSequence);
    }

    public final void U(boolean z11) {
        this.f105939a.setFocusable(z11);
    }

    public final void V(boolean z11) {
        this.f105939a.setFocused(z11);
    }

    public final void W(boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f105939a;
        if (i11 >= 28) {
            accessibilityNodeInfo.setHeading(z11);
            return;
        }
        Bundle extras = accessibilityNodeInfo.getExtras();
        if (extras != null) {
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | (z11 ? 2 : 0));
        }
    }

    public final void X(String str) {
        this.f105939a.setHintText(str);
    }

    public final void Y(boolean z11) {
        this.f105939a.setImportantForAccessibility(z11);
    }

    public final void Z(AppCompatTextView appCompatTextView) {
        this.f105939a.setLabelFor(appCompatTextView);
    }

    public final void a(int i11) {
        this.f105939a.addAction(i11);
    }

    public final void a0(int i11) {
        this.f105939a.setLiveRegion(i11);
    }

    public final void b(a aVar) {
        this.f105939a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f105954a);
    }

    public final void b0(boolean z11) {
        this.f105939a.setLongClickable(z11);
    }

    public final void c(int i11, View view) {
        this.f105939a.addChild(view, i11);
    }

    public final void c0(int i11) {
        this.f105939a.setMaxTextLength(i11);
    }

    public final void d(C5728b c5728b) {
        this.f105939a.addChild(c5728b);
    }

    public final void d0(int i11) {
        this.f105939a.setMovementGranularities(i11);
    }

    public final void e0(String str) {
        this.f105939a.setPackageName(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = qVar.f105939a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f105939a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f105941c == qVar.f105941c && this.f105940b == qVar.f105940b;
    }

    public final void f0(CharSequence charSequence) {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f105939a;
        if (i11 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    @Deprecated
    public final int g() {
        return this.f105939a.getActions();
    }

    public final void g0(int i11, View view) {
        this.f105940b = i11;
        this.f105939a.setParent(view, i11);
    }

    public final void h0(View view) {
        this.f105940b = -1;
        this.f105939a.setParent(view);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f105939a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public final void i(Rect rect) {
        this.f105939a.getBoundsInParent(rect);
    }

    public final void i0(boolean z11) {
        this.f105939a.setPassword(z11);
    }

    public final void j(Rect rect) {
        this.f105939a.getBoundsInScreen(rect);
    }

    public final void j0(g gVar) {
        this.f105939a.setRangeInfo(gVar.f105960a);
    }

    public final int k() {
        return this.f105939a.getChildCount();
    }

    public final void k0(String str) {
        this.f105939a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", str);
    }

    public final CharSequence l() {
        return this.f105939a.getClassName();
    }

    public final void l0(boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f105939a;
        if (i11 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z11);
            return;
        }
        Bundle extras = accessibilityNodeInfo.getExtras();
        if (extras != null) {
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z11 ? 1 : 0) | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
        }
    }

    public final f m() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f105939a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new f(collectionItemInfo);
        }
        return null;
    }

    public final void m0(boolean z11) {
        this.f105939a.setScrollable(z11);
    }

    public final CharSequence n() {
        return this.f105939a.getContentDescription();
    }

    public final void n0(boolean z11) {
        this.f105939a.setSelected(z11);
    }

    public final Bundle o() {
        return this.f105939a.getExtras();
    }

    public final void o0(boolean z11) {
        this.f105939a.setShowingHintText(z11);
    }

    public final int p() {
        return this.f105939a.getMovementGranularities();
    }

    public final void p0(int i11, View view) {
        this.f105941c = i11;
        this.f105939a.setSource(view, i11);
    }

    public final CharSequence q() {
        boolean isEmpty = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f105939a;
        if (isEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList e11 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList e12 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList e13 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList e14 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i11 = 0; i11 < e11.size(); i11++) {
            spannableString.setSpan(new C10825a(((Integer) e14.get(i11)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) e11.get(i11)).intValue(), ((Integer) e12.get(i11)).intValue(), ((Integer) e13.get(i11)).intValue());
        }
        return spannableString;
    }

    public final void q0(CharSequence charSequence) {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f105939a;
        if (i11 >= 30) {
            b.c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final boolean r() {
        return this.f105939a.isChecked();
    }

    public final void r0(CharSequence charSequence) {
        this.f105939a.setText(charSequence);
    }

    public final boolean s() {
        return this.f105939a.isClickable();
    }

    public final void s0(int i11, int i12) {
        this.f105939a.setTextSelection(i11, i12);
    }

    public final boolean t() {
        return this.f105939a.isEnabled();
    }

    public final void t0(int i11, View view) {
        this.f105939a.setTraversalAfter(view, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @NonNull
    public final String toString() {
        ?? r32;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        i(rect);
        sb2.append("; boundsInParent: " + rect);
        j(rect);
        sb2.append("; boundsInScreen: " + rect);
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f105939a;
        if (i11 >= 34) {
            d.b(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(q());
        sb2.append("; error: ");
        sb2.append(accessibilityNodeInfo.getError());
        sb2.append("; maxTextLength: ");
        sb2.append(accessibilityNodeInfo.getMaxTextLength());
        sb2.append("; stateDescription: ");
        sb2.append(i11 >= 30 ? b.b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; tooltipText: ");
        sb2.append(i11 >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb2.append("; viewIdResName: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        sb2.append(i11 >= 33 ? c.g(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        sb2.append(accessibilityNodeInfo.isChecked());
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; contextClickable: ");
        sb2.append(accessibilityNodeInfo.isContextClickable());
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; containerTitle: ");
        sb2.append(i11 >= 34 ? d.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb2.append("; granularScrollingSupported: ");
        sb2.append(h(67108864));
        sb2.append("; importantForAccessibility: ");
        sb2.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb2.append("; visible: ");
        sb2.append(accessibilityNodeInfo.isVisibleToUser());
        sb2.append("; isTextSelectable: ");
        sb2.append(i11 >= 33 ? c.h(accessibilityNodeInfo) : h(8388608));
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(i11 >= 34 ? d.f(accessibilityNodeInfo) : h(64));
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            r32 = new ArrayList();
            int size = actionList.size();
            for (int i12 = 0; i12 < size; i12++) {
                r32.add(new a(actionList.get(i12), 0, null, null, null));
            }
        } else {
            r32 = Collections.EMPTY_LIST;
        }
        for (int i13 = 0; i13 < r32.size(); i13++) {
            a aVar = (a) r32.get(i13);
            String f7 = f(aVar.b());
            if (f7.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                f7 = aVar.c().toString();
            }
            sb2.append(f7);
            if (i13 != r32.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final boolean u() {
        return this.f105939a.isFocusable();
    }

    public final void u0(View view) {
        this.f105939a.setTraversalAfter(view);
    }

    public final boolean v() {
        return this.f105939a.isFocused();
    }

    public final void v0(int i11, View view) {
        this.f105939a.setTraversalBefore(view, i11);
    }

    public final boolean w() {
        return this.f105939a.isPassword();
    }

    public final void w0(C5728b c5728b) {
        this.f105939a.setTraversalBefore(c5728b);
    }

    public final boolean x() {
        return this.f105939a.isScrollable();
    }

    public final void x0(String str) {
        this.f105939a.setViewIdResourceName(str);
    }

    public final boolean y() {
        return this.f105939a.isShowingHintText();
    }

    public final void y0(boolean z11) {
        this.f105939a.setVisibleToUser(z11);
    }

    public final AccessibilityNodeInfo z0() {
        return this.f105939a;
    }

    private q(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f105939a = accessibilityNodeInfo;
    }
}
