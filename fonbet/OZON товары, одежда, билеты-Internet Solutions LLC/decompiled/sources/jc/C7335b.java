package jc;

import B0.A0;
import Cf.C2759a;
import Zb.C4898a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ic.AbstractC7042a;
import java.util.ArrayList;
import java.util.HashMap;
import lc.C7917b;

/* renamed from: jc.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7335b extends AbstractC7042a.b<C2759a, d> {

    /* renamed from: a, reason: collision with root package name */
    private final int f69657a;

    /* renamed from: b, reason: collision with root package name */
    private final int f69658b;

    /* renamed from: c, reason: collision with root package name */
    private final int f69659c;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f69661e;

    /* renamed from: f, reason: collision with root package name */
    private LayoutInflater f69662f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f69663g = new HashMap(3);

    /* renamed from: d, reason: collision with root package name */
    private final boolean f69660d = true;

    /* renamed from: jc.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69664a;

        static {
            int[] iArr = new int[C4898a.EnumC0674a.values().length];
            f69664a = iArr;
            try {
                iArr[C4898a.EnumC0674a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69664a[C4898a.EnumC0674a.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69664a[C4898a.EnumC0674a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: jc.b$b, reason: collision with other inner class name */
    public interface InterfaceC1136b {
        @NonNull
        InterfaceC1136b a();

        @NonNull
        InterfaceC1136b b(int i11, int i12);

        @NonNull
        InterfaceC1136b c(int i11);
    }

    /* renamed from: jc.b$c */
    static class c implements InterfaceC1136b {

        /* renamed from: a, reason: collision with root package name */
        private int f69665a;

        /* renamed from: b, reason: collision with root package name */
        private int f69666b;

        /* renamed from: c, reason: collision with root package name */
        private int f69667c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f69668d = true;

        c() {
        }

        @Override // jc.C7335b.InterfaceC1136b
        @NonNull
        public final InterfaceC1136b a() {
            this.f69668d = false;
            return this;
        }

        @Override // jc.C7335b.InterfaceC1136b
        @NonNull
        public final InterfaceC1136b b(int i11, int i12) {
            this.f69665a = i11;
            this.f69666b = i12;
            return this;
        }

        @Override // jc.C7335b.InterfaceC1136b
        @NonNull
        public final InterfaceC1136b c(int i11) {
            this.f69667c = i11;
            return this;
        }

        @NonNull
        public final C7335b d() {
            int i11 = this.f69665a;
            if (i11 == 0) {
                throw new IllegalStateException("`tableLayoutResId` argument is required");
            }
            int i12 = this.f69667c;
            if (i12 != 0) {
                return new C7335b(i11, this.f69666b, i12, this.f69668d);
            }
            throw new IllegalStateException("`textLayoutResId` argument is required");
        }
    }

    /* renamed from: jc.b$d */
    public static class d extends AbstractC7042a.c {

        /* renamed from: a, reason: collision with root package name */
        final TableLayout f69669a;

        public d(@NonNull View view, int i11, boolean z11) {
            super(view);
            TableLayout tableLayout;
            String valueOf;
            setIsRecyclable(z11);
            if (i11 != 0) {
                View findViewById = this.itemView.findViewById(i11);
                if (findViewById == null) {
                    if (i11 == 0 || i11 == -1) {
                        valueOf = String.valueOf(i11);
                    } else {
                        valueOf = "R.id." + this.itemView.getResources().getResourceName(i11);
                    }
                    throw new NullPointerException(String.format("No view with id(R.id.%s) is found in layout: %s", valueOf, this.itemView));
                }
                tableLayout = (TableLayout) findViewById;
            } else {
                if (!(view instanceof TableLayout)) {
                    throw new IllegalStateException("Root view is not TableLayout. Please provide TableLayout ID explicitly");
                }
                tableLayout = (TableLayout) view;
            }
            this.f69669a = tableLayout;
        }
    }

    C7335b(int i11, int i12, int i13, boolean z11) {
        this.f69657a = i11;
        this.f69658b = i12;
        this.f69659c = i13;
        this.f69661e = z11;
    }

    @NonNull
    public static C7335b d(@NonNull ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation.a aVar) {
        c cVar = new c();
        aVar.a(cVar);
        return cVar.d();
    }

    @NonNull
    private static TableRow e(@NonNull TableLayout tableLayout, int i11) {
        int childCount = tableLayout.getChildCount();
        if (i11 >= childCount) {
            Context context = tableLayout.getContext();
            for (int i12 = (i11 - childCount) + 1; i12 > 0; i12--) {
                tableLayout.addView(new TableRow(context));
            }
        }
        return (TableRow) tableLayout.getChildAt(i11);
    }

    private static void f(@NonNull View view, int i11, int i12) {
        if (i11 == 0) {
            view.setBackground(null);
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof C7334a) {
            ((C7334a) background).a(i11, i12);
            return;
        }
        C7334a c7334a = new C7334a();
        c7334a.a(i11, i12);
        view.setBackground(c7334a);
    }

    @NonNull
    private TextView g(@NonNull TableLayout tableLayout, int i11, int i12) {
        TextView textView;
        TableRow e11 = e(tableLayout, i11);
        int childCount = e11.getChildCount();
        if (i12 >= childCount) {
            Context context = tableLayout.getContext();
            if (this.f69662f == null) {
                this.f69662f = LayoutInflater.from(context);
            }
            LayoutInflater layoutInflater = this.f69662f;
            boolean z11 = false;
            for (int i13 = (i12 - childCount) + 1; i13 > 0; i13--) {
                int i14 = this.f69659c;
                View inflate = layoutInflater.inflate(i14, (ViewGroup) e11, false);
                ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
                if (layoutParams.height != -1) {
                    layoutParams.height = -1;
                }
                if (z11) {
                    textView = (TextView) inflate;
                } else {
                    if (!(inflate instanceof TextView)) {
                        throw new IllegalStateException(A0.b("textLayoutResId(R.layout.", tableLayout.getContext().getResources().getResourceName(i14), ") has other than TextView root view. Specify TextView ID explicitly"));
                    }
                    textView = (TextView) inflate;
                    z11 = true;
                }
                textView.setSpannableFactory(C7917b.a());
                e11.addView(textView);
            }
        }
        return (TextView) e11.getChildAt(i12);
    }

    @Override // ic.AbstractC7042a.b
    public final void a(@NonNull Ub.d dVar, @NonNull d dVar2, @NonNull C2759a c2759a) {
        int i11;
        d dVar3 = dVar2;
        C2759a c2759a2 = c2759a;
        HashMap hashMap = this.f69663g;
        C4898a c4898a = (C4898a) hashMap.get(c2759a2);
        if (c4898a == null) {
            c4898a = C4898a.a(dVar, c2759a2);
            hashMap.put(c2759a2, c4898a);
        }
        TableLayout tableLayout = dVar3.f69669a;
        if (c4898a != null) {
            int i12 = this.f69657a;
            if (c4898a == tableLayout.getTag(i12)) {
                return;
            }
            tableLayout.setTag(i12, c4898a);
            C7336c c7336c = (C7336c) dVar.b();
            if (c7336c == null) {
                throw new IllegalStateException("No TableEntryPlugin is found. Make sure that it is _used_ whilst configuring Markwon instance");
            }
            C7337d b11 = c7336c.b();
            int i13 = 0;
            TextView g10 = g(tableLayout, 0, 0);
            int b12 = b11.b(g10.getPaint());
            int a11 = b11.a(g10.getPaint());
            f(tableLayout, b12, a11);
            ArrayList arrayList = (ArrayList) c4898a.b();
            int size = arrayList.size();
            int size2 = size > 0 ? ((ArrayList) ((C4898a.d) arrayList.get(0)).a()).size() : 0;
            int i14 = 0;
            while (i14 < size) {
                C4898a.d dVar4 = (C4898a.d) arrayList.get(i14);
                TableRow e11 = e(tableLayout, i14);
                int i15 = i13;
                while (i15 < size2) {
                    C4898a.b bVar = (C4898a.b) ((ArrayList) dVar4.a()).get(i15);
                    TextView g11 = g(tableLayout, i14, i15);
                    C4898a.EnumC0674a a12 = bVar.a();
                    ArrayList arrayList2 = arrayList;
                    int i16 = a.f69664a[a12.ordinal()];
                    C4898a.d dVar5 = dVar4;
                    if (i16 == 1) {
                        i11 = 3;
                    } else if (i16 == 2) {
                        i11 = 1;
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException("Unknown table alignment: " + a12);
                        }
                        i11 = 5;
                    }
                    if (this.f69661e) {
                        i11 |= 16;
                    }
                    g11.setGravity(i11);
                    g11.getPaint().setFakeBoldText(dVar5.b());
                    f(g11, b12, a11);
                    dVar.e(g11, bVar.b());
                    i15++;
                    dVar4 = dVar5;
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = arrayList;
                if (dVar4.b()) {
                    e11.setBackgroundColor(b11.d());
                } else if (i14 % 2 == 1) {
                    e11.setBackgroundColor(b11.c());
                } else {
                    i13 = 0;
                    e11.setBackgroundColor(b11.e(g(tableLayout, i14, 0).getPaint()));
                    i14++;
                    arrayList = arrayList3;
                }
                i13 = 0;
                i14++;
                arrayList = arrayList3;
            }
            int childCount = tableLayout.getChildCount();
            if (childCount > size) {
                tableLayout.removeViews(size, childCount - size);
            }
            while (i13 < size) {
                TableRow tableRow = (TableRow) tableLayout.getChildAt(i13);
                int childCount2 = tableRow.getChildCount();
                if (childCount2 > size2) {
                    tableRow.removeViews(size2, childCount2 - size2);
                }
                i13++;
            }
        }
    }

    @Override // ic.AbstractC7042a.b
    public final void b() {
        this.f69663g.clear();
    }

    @Override // ic.AbstractC7042a.b
    @NonNull
    public final d c(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        return new d(layoutInflater.inflate(this.f69657a, viewGroup, false), this.f69658b, this.f69660d);
    }
}
