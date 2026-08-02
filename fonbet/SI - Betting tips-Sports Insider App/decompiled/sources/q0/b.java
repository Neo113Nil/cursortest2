package q0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.h0;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f21898e = new b(1, (String) null);

    /* renamed from: f, reason: collision with root package name */
    public static final b f21899f = new b(2, (String) null);

    /* renamed from: g, reason: collision with root package name */
    public static final b f21900g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f21901h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f21902i;
    public static final b j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f21903k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f21904l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f21905m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f21906n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f21907o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f21908p;
    public static final b q;

    /* renamed from: a, reason: collision with root package name */
    public final Object f21909a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21910b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f21911c;

    /* renamed from: d, reason: collision with root package name */
    public final o f21912d;

    static {
        new b(4, (String) null);
        new b(8, (String) null);
        f21900g = new b(16, (String) null);
        new b(32, (String) null);
        new b(64, (String) null);
        new b(128, (String) null);
        new b(256, h.class);
        new b(512, h.class);
        new b(Segment.SHARE_MINIMUM, i.class);
        new b(2048, i.class);
        f21901h = new b(4096, (String) null);
        f21902i = new b(Segment.SIZE, (String) null);
        new b(16384, (String) null);
        new b(32768, (String) null);
        new b(65536, (String) null);
        new b(131072, m.class);
        j = new b(262144, (String) null);
        f21903k = new b(524288, (String) null);
        f21904l = new b(1048576, (String) null);
        new b(2097152, n.class);
        int i5 = Build.VERSION.SDK_INT;
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        f21905m = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, k.class);
        f21906n = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f21907o = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new b(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new b(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new b(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new b(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        f21908p = new b(i5 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, l.class);
        new b(i5 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, j.class);
        new b(i5 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new b(i5 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new b(i5 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new b(i5 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new b(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new b(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new b(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new b(i5 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        q = new b(i5 >= 34 ? h0.d() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public b(int i5, String str) {
        this(null, i5, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f21909a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        Object obj2 = ((b) obj).f21909a;
        Object obj3 = this.f21909a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f21909a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String d10 = c.d(this.f21910b);
        if (d10.equals("ACTION_UNKNOWN")) {
            Object obj = this.f21909a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(d10);
        return sb2.toString();
    }

    public b(int i5, Class cls) {
        this(null, i5, null, null, cls);
    }

    public b(Object obj, int i5, CharSequence charSequence, o oVar, Class cls) {
        this.f21910b = i5;
        this.f21912d = oVar;
        if (obj == null) {
            this.f21909a = new AccessibilityNodeInfo.AccessibilityAction(i5, charSequence);
        } else {
            this.f21909a = obj;
        }
        this.f21911c = cls;
    }
}
