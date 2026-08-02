package Z;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f14384a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final Z.h f14385b = new Z.h("ContentDescription", a.f14410d);

    /* renamed from: c, reason: collision with root package name */
    public static final Z.h f14386c = new Z.h("StateDescription", null, 2, null);

    /* renamed from: d, reason: collision with root package name */
    public static final Z.h f14387d = new Z.h("ProgressBarRangeInfo", null, 2, null);

    /* renamed from: e, reason: collision with root package name */
    public static final Z.h f14388e = new Z.h("PaneTitle", e.f14414d);

    /* renamed from: f, reason: collision with root package name */
    public static final Z.h f14389f = new Z.h("SelectableGroup", null, 2, null);

    /* renamed from: g, reason: collision with root package name */
    public static final Z.h f14390g = new Z.h("CollectionInfo", null, 2, null);

    /* renamed from: h, reason: collision with root package name */
    public static final Z.h f14391h = new Z.h("CollectionItemInfo", null, 2, null);

    /* renamed from: i, reason: collision with root package name */
    public static final Z.h f14392i = new Z.h("Heading", null, 2, null);

    /* renamed from: j, reason: collision with root package name */
    public static final Z.h f14393j = new Z.h("Disabled", null, 2, null);

    /* renamed from: k, reason: collision with root package name */
    public static final Z.h f14394k = new Z.h("LiveRegion", null, 2, null);

    /* renamed from: l, reason: collision with root package name */
    public static final Z.h f14395l = new Z.h("Focused", null, 2, null);

    /* renamed from: m, reason: collision with root package name */
    public static final Z.h f14396m = new Z.h("IsTraversalGroup", null, 2, null);

    /* renamed from: n, reason: collision with root package name */
    public static final Z.h f14397n = new Z.h("InvisibleToUser", b.f14411d);

    /* renamed from: o, reason: collision with root package name */
    public static final Z.h f14398o = new Z.h("TraversalIndex", i.f14418d);

    /* renamed from: p, reason: collision with root package name */
    public static final Z.h f14399p = new Z.h("HorizontalScrollAxisRange", null, 2, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Z.h f14400q = new Z.h("VerticalScrollAxisRange", null, 2, null);

    /* renamed from: r, reason: collision with root package name */
    public static final Z.h f14401r = new Z.h("IsPopup", d.f14413d);

    /* renamed from: s, reason: collision with root package name */
    public static final Z.h f14402s = new Z.h("IsDialog", c.f14412d);

    /* renamed from: t, reason: collision with root package name */
    public static final Z.h f14403t = new Z.h("Role", C0301f.f14415d);

    /* renamed from: u, reason: collision with root package name */
    public static final Z.h f14404u = new Z.h("TestTag", g.f14416d);

    /* renamed from: v, reason: collision with root package name */
    public static final Z.h f14405v = new Z.h("Text", h.f14417d);

    /* renamed from: w, reason: collision with root package name */
    public static final Z.h f14406w = new Z.h("EditableText", null, 2, null);

    /* renamed from: x, reason: collision with root package name */
    public static final Z.h f14407x = new Z.h("TextSelectionRange", null, 2, null);

    /* renamed from: y, reason: collision with root package name */
    public static final Z.h f14408y = new Z.h("ImeAction", null, 2, null);

    /* renamed from: z, reason: collision with root package name */
    public static final Z.h f14409z = new Z.h("Selected", null, 2, null);

    /* renamed from: A, reason: collision with root package name */
    public static final Z.h f14380A = new Z.h("ToggleableState", null, 2, null);

    /* renamed from: B, reason: collision with root package name */
    public static final Z.h f14381B = new Z.h("Password", null, 2, null);

    /* renamed from: C, reason: collision with root package name */
    public static final Z.h f14382C = new Z.h("Error", null, 2, null);

    /* renamed from: D, reason: collision with root package name */
    public static final Z.h f14383D = new Z.h("IndexForKey", null, 2, null);

    public static final class a extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f14410d = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List childValue) {
            List mutableList;
            Intrinsics.checkNotNullParameter(childValue, "childValue");
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                return childValue;
            }
            mutableList.addAll(childValue);
            return mutableList;
        }
    }

    public static final class b extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f14411d = new b();

        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            Intrinsics.checkNotNullParameter(unit2, "<anonymous parameter 1>");
            return unit;
        }
    }

    public static final class c extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f14412d = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            Intrinsics.checkNotNullParameter(unit2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    public static final class d extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f14413d = new d();

        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            Intrinsics.checkNotNullParameter(unit2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    public static final class e extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f14414d = new e();

        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* renamed from: Z.f$f, reason: collision with other inner class name */
    public static final class C0301f extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0301f f14415d = new C0301f();

        public C0301f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            android.support.v4.media.session.b.a(obj2);
            throw null;
        }
    }

    public static final class g extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f14416d = new g();

        public g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            return str;
        }
    }

    public static final class h extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f14417d = new h();

        public h() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List childValue) {
            List mutableList;
            Intrinsics.checkNotNullParameter(childValue, "childValue");
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                return childValue;
            }
            mutableList.addAll(childValue);
            return mutableList;
        }
    }

    public final Z.h a() {
        return f14406w;
    }

    public final Z.h b() {
        return f14397n;
    }

    public final Z.h c() {
        return f14405v;
    }

    public static final class i extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final i f14418d = new i();

        public i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Float) obj, ((Number) obj2).floatValue());
        }

        public final Float a(Float f10, float f11) {
            return f10;
        }
    }
}
