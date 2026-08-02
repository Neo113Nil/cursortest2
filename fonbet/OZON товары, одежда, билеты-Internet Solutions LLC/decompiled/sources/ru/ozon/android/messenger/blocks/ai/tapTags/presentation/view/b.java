package ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view;

import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.TapTagsView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

/* loaded from: classes10.dex */
public final class b extends FlexboxLayout {

    /* renamed from: p, reason: collision with root package name */
    private static final int f84356p = ResourceExtKt.toPx(80);

    /* renamed from: a, reason: collision with root package name */
    private Function1<? super AtomAction, Unit> f84357a;

    /* renamed from: b, reason: collision with root package name */
    private Function1<? super ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b, Unit> f84358b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private List<? extends ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b> f84359c;

    /* renamed from: d, reason: collision with root package name */
    private b.a f84360d;

    /* renamed from: e, reason: collision with root package name */
    private int f84361e;

    /* renamed from: f, reason: collision with root package name */
    private int f84362f;

    /* renamed from: g, reason: collision with root package name */
    private int f84363g;

    /* renamed from: h, reason: collision with root package name */
    private int f84364h;

    /* renamed from: i, reason: collision with root package name */
    private int f84365i;

    /* renamed from: j, reason: collision with root package name */
    private int f84366j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f84367k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f84368l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f84369m;

    /* renamed from: n, reason: collision with root package name */
    private int f84370n;

    /* renamed from: o, reason: collision with root package name */
    private float f84371o;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f84372a;

        public a(int i11) {
            this.f84372a = i11;
        }

        public final int a() {
            return this.f84372a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f84372a == ((a) obj).f84372a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f84372a);
        }

        @NotNull
        public final String toString() {
            return K00.b.e(this.f84372a, ")", new StringBuilder("ChildInfo(fullWidth="));
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.b$b, reason: collision with other inner class name */
    private static final class C1469b {

        /* renamed from: a, reason: collision with root package name */
        private final int f84373a;

        /* renamed from: b, reason: collision with root package name */
        private final int f84374b;

        public C1469b(int i11, int i12) {
            this.f84373a = i11;
            this.f84374b = i12;
        }

        public final int a() {
            return this.f84373a;
        }

        public final int b() {
            return this.f84374b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1469b)) {
                return false;
            }
            C1469b c1469b = (C1469b) obj;
            return this.f84373a == c1469b.f84373a && this.f84374b == c1469b.f84374b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f84374b) + (Integer.hashCode(this.f84373a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TagPosition(index=");
            sb2.append(this.f84373a);
            sb2.append(", numberLine=");
            return K00.b.e(this.f84374b, ")", sb2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84359c = K.f71697a;
        this.f84361e = 2;
        this.f84362f = f84356p;
        this.f84369m = new LinkedHashMap();
        this.f84370n = -1;
        this.f84371o = 0.7f;
        setFlexDirection(0);
        setFlexWrap(1);
        setAlignItems(4);
    }

    private final int a() {
        int intValue;
        Integer valueOf = Integer.valueOf(this.f84366j);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            intValue = valueOf.intValue();
        } else {
            Integer valueOf2 = Integer.valueOf(getMeasuredWidth());
            Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
            intValue = num != null ? num.intValue() : getContext().getResources().getDisplayMetrics().widthPixels;
        }
        return (int) (intValue * this.f84371o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    private final View b(ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b bVar) {
        ConstraintLayout tagButtonView;
        LinkedHashMap linkedHashMap = this.f84369m;
        View view = (View) linkedHashMap.get(bVar);
        ButtonV3View buttonV3View = view;
        if (view == null) {
            if (bVar instanceof b.a) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                tagButtonView = new ButtonV3View(context, null, 0, 0, 14, null);
                tagButtonView.setLayoutParams(new FlexboxLayout.a(-2, -2));
            } else {
                if (!(bVar instanceof b.C1465b)) {
                    throw new o();
                }
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                tagButtonView = new TagButtonView(context2, null, 0, 0, 14, null);
                tagButtonView.setLayoutParams(new FlexboxLayout.a(-2, -2));
            }
            ConstraintLayout constraintLayout = tagButtonView;
            Function1<? super ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b, Unit> function1 = this.f84358b;
            buttonV3View = constraintLayout;
            if (function1 != null) {
                ((TapTagsView.a) function1).invoke(bVar);
                buttonV3View = constraintLayout;
            }
        }
        if ((bVar instanceof b.a) && (buttonV3View instanceof ButtonV3View)) {
            ButtonV3View buttonV3View2 = buttonV3View;
            ButtonV3HolderKt.bindOrGone(buttonV3View2, ((b.a) bVar).b(), this.f84357a);
            buttonV3View2.setMaxWidth(a());
            Iterator<View> it = C5316f0.b(buttonV3View).iterator();
            while (true) {
                C5314e0 c5314e0 = (C5314e0) it;
                if (!c5314e0.hasNext()) {
                    break;
                }
                ((View) c5314e0.next()).setContentDescription("ButtonV3.titleLabel");
            }
        } else if ((bVar instanceof b.C1465b) && (buttonV3View instanceof TagButtonView)) {
            TagButtonView tagButtonView2 = buttonV3View;
            TagButtonHolderKt.bindOrGone(tagButtonView2, ((b.C1465b) bVar).b(), this.f84357a);
            tagButtonView2.setMaxWidth(a());
            Iterator<View> it2 = C5316f0.b(buttonV3View).iterator();
            while (true) {
                C5314e0 c5314e02 = (C5314e0) it2;
                if (!c5314e02.hasNext()) {
                    break;
                }
                ((View) c5314e02.next()).setContentDescription("ButtonV3.titleLabel");
            }
        }
        ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = this.f84363g;
        marginLayoutParams.rightMargin = i11;
        marginLayoutParams.leftMargin = i11;
        int i12 = this.f84364h;
        marginLayoutParams.bottomMargin = i12;
        marginLayoutParams.topMargin = i12;
        buttonV3View.setLayoutParams(marginLayoutParams);
        linkedHashMap.put(bVar, buttonV3View);
        return buttonV3View;
    }

    public final void c() {
        this.f84357a = null;
        this.f84358b = null;
        this.f84359c = K.f71697a;
        this.f84360d = null;
        this.f84361e = 2;
        this.f84362f = f84356p;
        this.f84363g = 0;
        this.f84364h = 0;
        this.f84365i = 0;
        this.f84366j = 0;
        this.f84367k = false;
        this.f84368l = false;
        this.f84370n = -1;
        this.f84371o = 0.7f;
        removeAllViews();
        this.f84369m.clear();
    }

    public final void d(Float f7) {
        this.f84371o = f7 != null ? f7.floatValue() : 0.7f;
    }

    public final void e(@NotNull ru.ozon.android.messenger.blocks.ai.tapTags.presentation.a settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f84361e = settings.a();
        this.f84362f = settings.d();
        this.f84360d = settings.f();
        this.f84363g = settings.g().f();
        this.f84364h = settings.g().a();
        this.f84368l = settings.b();
    }

    public final void invalidateAllTags() {
        removeAllViews();
        this.f84369m.clear();
        this.f84370n = -1;
        if (this.f84367k || this.f84361e >= Integer.MAX_VALUE) {
            Iterator<T> it = this.f84359c.iterator();
            while (it.hasNext()) {
                View b11 = b((ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b) it.next());
                b11.setVisibility(0);
                addView(b11);
            }
            return;
        }
        Iterator<T> it2 = this.f84359c.iterator();
        while (it2.hasNext()) {
            addView(b((ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b) it2.next()));
        }
        b.a aVar = this.f84360d;
        if (aVar != null) {
            addView(b(aVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x00b7, code lost:
    
        r2.add(new ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.b.C1469b(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00b5, code lost:
    
        if (r12 <= (r1 - r17.f84365i)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (r12 <= r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        if (r10 >= r15) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r10 = r10 + 1;
        r4 = r14.a();
        r2.add(new ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.b.C1469b(r9, r10));
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        r9 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ac  */
    @Override // com.google.android.flexbox.FlexboxLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        int i15;
        C1469b c1469b;
        View childAt;
        b.a aVar = this.f84360d;
        if (this.f84367k) {
            super.onMeasure(i11, i12);
            return;
        }
        View b11 = aVar != null ? b(aVar) : null;
        this.f84366j = View.MeasureSpec.getSize(i11);
        this.f84370n = -1;
        ArrayList arrayList = new ArrayList();
        b.a aVar2 = this.f84360d;
        View view = aVar2 != null ? (View) this.f84369m.get(aVar2) : null;
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                break;
            }
            View view2 = (View) c5314e0.next();
            measureChildWithMargins(view2, i11, 0, i12, 0);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int measuredWidth = view2.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            if (view2 == view) {
                this.f84365i = measuredWidth;
            } else {
                arrayList.add(new a(measuredWidth));
            }
        }
        int paddingLeft = (this.f84366j - getPaddingLeft()) - getPaddingRight();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        while (it2.hasNext()) {
            int i21 = i17 + 1;
            a aVar3 = (a) it2.next();
            if (i19 > this.f84361e) {
                break;
            }
            i18 += aVar3.a();
            int i22 = this.f84361e;
            z11 = i19 < i22 ? true : true;
        }
        z11 = true;
        Iterator<View> it3 = C5316f0.b(this).iterator();
        int i23 = 0;
        while (true) {
            C5314e0 c5314e02 = (C5314e0) it3;
            int i24 = 8;
            if (!c5314e02.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSet) {
                    if (((C1469b) obj).b() == this.f84361e) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                int i25 = 0;
                while (it4.hasNext()) {
                    i25 += ((a) arrayList.get(((C1469b) it4.next()).a())).a();
                }
                int i26 = (this.f84366j - i25) - this.f84365i;
                if (b11 != null) {
                    ViewGroup.LayoutParams layoutParams2 = b11.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        i13 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                        int i27 = i26 - i13;
                        if (b11 != null) {
                            ViewGroup.LayoutParams layoutParams3 = b11.getLayoutParams();
                            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                i14 = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart();
                                i15 = i27 - i14;
                                if (i15 > this.f84362f && getChildCount() > linkedHashSet.size()) {
                                    childAt = getChildAt(linkedHashSet.size());
                                    ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                                    Intrinsics.g(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                                    if (!(childAt instanceof ButtonV3View)) {
                                        if (i15 < 0) {
                                            i15 = 0;
                                        }
                                        int measuredWidth2 = childAt.getMeasuredWidth();
                                        if (i15 > measuredWidth2) {
                                            i15 = measuredWidth2;
                                        }
                                        if (i15 < this.f84362f) {
                                            childAt.setVisibility(8);
                                        } else {
                                            marginLayoutParams2.width = i15;
                                            childAt.setLayoutParams(marginLayoutParams2);
                                            childAt.setVisibility(0);
                                            this.f84370n = linkedHashSet.size();
                                        }
                                    }
                                }
                                int d11 = l.d(C5316f0.b(this)) - 1;
                                boolean z12 = (linkedHashSet.size() == d11 || (c1469b = (C1469b) C7714v.Y(linkedHashSet)) == null || this.f84370n != c1469b.a()) ? false : z11;
                                if (b11 != null) {
                                    if (linkedHashSet.size() >= d11 && !this.f84368l && !z12) {
                                        i16 = 8;
                                    }
                                    b11.setVisibility(i16);
                                }
                                super.onMeasure(i11, i12);
                                return;
                            }
                        }
                        i14 = 0;
                        i15 = i27 - i14;
                        if (i15 > this.f84362f) {
                            childAt = getChildAt(linkedHashSet.size());
                            ViewGroup.LayoutParams layoutParams42 = childAt.getLayoutParams();
                            Intrinsics.g(layoutParams42, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams22 = (ViewGroup.MarginLayoutParams) layoutParams42;
                            if (!(childAt instanceof ButtonV3View)) {
                            }
                        }
                        int d112 = l.d(C5316f0.b(this)) - 1;
                        if (linkedHashSet.size() == d112) {
                        }
                        if (b11 != null) {
                        }
                        super.onMeasure(i11, i12);
                        return;
                    }
                }
                i13 = 0;
                int i272 = i26 - i13;
                if (b11 != null) {
                }
                i14 = 0;
                i15 = i272 - i14;
                if (i15 > this.f84362f) {
                }
                int d1122 = l.d(C5316f0.b(this)) - 1;
                if (linkedHashSet.size() == d1122) {
                }
                if (b11 != null) {
                }
                super.onMeasure(i11, i12);
                return;
            }
            Object next = c5314e02.next();
            int i28 = i23 + 1;
            if (i23 < 0) {
                C7714v.O0();
                throw null;
            }
            View view3 = (View) next;
            if (!linkedHashSet.isEmpty()) {
                Iterator it5 = linkedHashSet.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        if (((C1469b) it5.next()).a() == i23) {
                            i24 = 0;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            view3.setVisibility(i24);
            i23 = i28;
        }
    }

    public final void setItemActionHandlers(@NotNull Function1<? super AtomAction, Unit> itemActionHandler, @NotNull Function1<? super ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b, Unit> callBack) {
        Intrinsics.checkNotNullParameter(itemActionHandler, "itemActionHandler");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f84357a = itemActionHandler;
        this.f84358b = callBack;
    }

    public final void setMode(boolean z11) {
        this.f84367k = z11;
    }

    public final void setTags(@NotNull List<? extends ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        LinkedHashMap linkedHashMap = this.f84369m;
        Iterator it = e0.d(linkedHashMap.keySet(), C7714v.Y0(tags)).iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b) it.next());
        }
        this.f84359c = tags;
    }
}
