package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.C5305a;
import androidx.core.view.Y;
import com.google.android.material.button.MaterialButton;
import i7.C7017a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import ru.ozon.app.android.R;
import s7.C9619n;
import s7.C9621p;
import y2.q;
import y7.C10850a;
import y7.InterfaceC10852c;
import y7.k;

/* loaded from: classes9.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f58060a;

    /* renamed from: b, reason: collision with root package name */
    private final e f58061b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<d> f58062c;

    /* renamed from: d, reason: collision with root package name */
    private final Comparator<MaterialButton> f58063d;

    /* renamed from: e, reason: collision with root package name */
    private Integer[] f58064e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f58065f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f58066g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f58067h;

    /* renamed from: i, reason: collision with root package name */
    private final int f58068i;

    /* renamed from: j, reason: collision with root package name */
    private HashSet f58069j;

    final class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    final class b extends C5305a {
        b() {
        }

        @Override // androidx.core.view.C5305a
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull q qVar) {
            super.onInitializeAccessibilityNodeInfo(view, qVar);
            qVar.N(q.f.f(0, 1, MaterialButtonToggleGroup.a(MaterialButtonToggleGroup.this, view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* renamed from: e, reason: collision with root package name */
        private static final C10850a f58072e = new C10850a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        InterfaceC10852c f58073a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC10852c f58074b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC10852c f58075c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC10852c f58076d;

        c(InterfaceC10852c interfaceC10852c, InterfaceC10852c interfaceC10852c2, InterfaceC10852c interfaceC10852c3, InterfaceC10852c interfaceC10852c4) {
            this.f58073a = interfaceC10852c;
            this.f58074b = interfaceC10852c3;
            this.f58075c = interfaceC10852c4;
            this.f58076d = interfaceC10852c2;
        }

        public static c a(c cVar) {
            C10850a c10850a = f58072e;
            return new c(c10850a, cVar.f58076d, c10850a, cVar.f58075c);
        }

        public static c b(c cVar) {
            InterfaceC10852c interfaceC10852c = cVar.f58073a;
            C10850a c10850a = f58072e;
            return new c(interfaceC10852c, cVar.f58076d, c10850a, c10850a);
        }

        public static c c(c cVar) {
            C10850a c10850a = f58072e;
            return new c(c10850a, c10850a, cVar.f58074b, cVar.f58075c);
        }

        public static c d(c cVar) {
            InterfaceC10852c interfaceC10852c = cVar.f58073a;
            C10850a c10850a = f58072e;
            return new c(interfaceC10852c, c10850a, cVar.f58074b, c10850a);
        }
    }

    public interface d {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements MaterialButton.b {
        e() {
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f58060a = new ArrayList();
        this.f58061b = new e();
        this.f58062c = new LinkedHashSet<>();
        this.f58063d = new a();
        this.f58065f = false;
        this.f58069j = new HashSet();
        TypedArray e11 = C9619n.e(getContext(), attributeSet, C7017a.f65955u, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        boolean z11 = e11.getBoolean(2, false);
        if (this.f58066g != z11) {
            this.f58066g = z11;
            g(new HashSet());
        }
        this.f58068i = e11.getResourceId(0, -1);
        this.f58067h = e11.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        e11.recycle();
        int i11 = Y.f42258g;
        setImportantForAccessibility(1);
    }

    static int a(MaterialButtonToggleGroup materialButtonToggleGroup, View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < materialButtonToggleGroup.getChildCount(); i12++) {
            if (materialButtonToggleGroup.getChildAt(i12) == view) {
                return i11;
            }
            if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.e(i12)) {
                i11++;
            }
        }
        return -1;
    }

    private void c() {
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                i11 = -1;
                break;
            } else if (e(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        for (int i12 = i11 + 1; i12 < getChildCount(); i12++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i12);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i12 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || i11 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(i11)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    private void d(int i11, boolean z11) {
        if (i11 == -1) {
            Log.e("MaterialButtonToggleGroup", "Button ID is not valid: " + i11);
            return;
        }
        HashSet hashSet = new HashSet(this.f58069j);
        if (z11 && !hashSet.contains(Integer.valueOf(i11))) {
            if (this.f58066g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i11));
        } else {
            if (z11 || !hashSet.contains(Integer.valueOf(i11))) {
                return;
            }
            if (!this.f58067h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i11));
            }
        }
        g(hashSet);
    }

    private boolean e(int i11) {
        return getChildAt(i11).getVisibility() != 8;
    }

    private void g(Set<Integer> set) {
        HashSet hashSet = this.f58069j;
        this.f58069j = new HashSet(set);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int id2 = ((MaterialButton) getChildAt(i11)).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f58065f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f58065f = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator<d> it = this.f58062c.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i11, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        if (materialButton.getId() == -1) {
            int i12 = Y.f42258g;
            materialButton.setId(View.generateViewId());
        }
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f58061b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
        d(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f58060a.add(new c(shapeAppearanceModel.k(), shapeAppearanceModel.f(), shapeAppearanceModel.m(), shapeAppearanceModel.h()));
        Y.C(materialButton, new b());
    }

    public final void b(@NonNull d dVar) {
        this.f58062c.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(@NonNull Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f58063d);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            treeMap.put((MaterialButton) getChildAt(i11), Integer.valueOf(i11));
        }
        this.f58064e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    final void f(@NonNull MaterialButton materialButton, boolean z11) {
        if (this.f58065f) {
            return;
        }
        d(materialButton.getId(), z11);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i11, int i12) {
        Integer[] numArr = this.f58064e;
        if (numArr != null && i12 < numArr.length) {
            return numArr[i12].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i12;
    }

    final void h() {
        int i11;
        int childCount = getChildCount();
        int childCount2 = getChildCount();
        int i12 = 0;
        while (true) {
            i11 = -1;
            if (i12 >= childCount2) {
                i12 = -1;
                break;
            } else if (e(i12)) {
                break;
            } else {
                i12++;
            }
        }
        int childCount3 = getChildCount() - 1;
        while (true) {
            if (childCount3 < 0) {
                break;
            }
            if (e(childCount3)) {
                i11 = childCount3;
                break;
            }
            childCount3--;
        }
        int i13 = 0;
        while (i13 < childCount) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i13);
            if (materialButton.getVisibility() != 8) {
                k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                k.a aVar = new k.a(shapeAppearanceModel);
                c cVar = (c) this.f58060a.get(i13);
                if (i12 != i11) {
                    boolean z11 = getOrientation() == 0;
                    cVar = i13 == i12 ? z11 ? C9621p.d(this) ? c.c(cVar) : c.b(cVar) : c.d(cVar) : i13 == i11 ? z11 ? C9621p.d(this) ? c.b(cVar) : c.c(cVar) : c.a(cVar) : null;
                }
                if (cVar == null) {
                    aVar.c(0.0f);
                } else {
                    aVar.q(cVar.f58073a);
                    aVar.i(cVar.f58076d);
                    aVar.u(cVar.f58074b);
                    aVar.m(cVar.f58075c);
                }
                materialButton.setShapeAppearanceModel(aVar.a());
            }
            i13++;
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f58068i;
        if (i11 != -1) {
            g(Collections.singleton(Integer.valueOf(i11)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q A02 = q.A0(accessibilityNodeInfo);
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof MaterialButton) && e(i12)) {
                i11++;
            }
        }
        A02.M(q.e.a(1, i11, this.f58066g ? 1 : 2, false));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        h();
        c();
        super.onMeasure(i11, i12);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f58060a.remove(indexOfChild);
        }
        h();
        c();
    }
}
