package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import b1.T;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f22249a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f22250b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckedTextView f22251c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckedTextView f22252d;

    /* renamed from: e, reason: collision with root package name */
    public final b f22253e;

    /* renamed from: f, reason: collision with root package name */
    public final List f22254f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f22255g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22256h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22257i;

    /* renamed from: j, reason: collision with root package name */
    public m0 f22258j;

    /* renamed from: k, reason: collision with root package name */
    public CheckedTextView[][] f22259k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22260l;

    /* renamed from: m, reason: collision with root package name */
    public Comparator f22261m;

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final T.a f22263a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22264b;

        public c(T.a aVar, int i10) {
            this.f22263a = aVar;
            this.f22264b = i10;
        }

        public androidx.media3.common.a a() {
            return this.f22263a.b(this.f22264b);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map b(Map map, List list, boolean z10) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b1.Q q10 = (b1.Q) map.get(((T.a) list.get(i10)).a());
            if (q10 != null && (z10 || hashMap.isEmpty())) {
                hashMap.put(q10.f24401a, q10);
            }
        }
        return hashMap;
    }

    public final void c(View view) {
        if (view == this.f22251c) {
            e();
        } else if (view == this.f22252d) {
            d();
        } else {
            f(view);
        }
        i();
    }

    public final void d() {
        this.f22260l = false;
        this.f22255g.clear();
    }

    public final void e() {
        this.f22260l = true;
        this.f22255g.clear();
    }

    public final void f(View view) {
        this.f22260l = false;
        c cVar = (c) AbstractC4134a.e(view.getTag());
        b1.P a10 = cVar.f22263a.a();
        int i10 = cVar.f22264b;
        b1.Q q10 = (b1.Q) this.f22255g.get(a10);
        if (q10 == null) {
            if (!this.f22257i && !this.f22255g.isEmpty()) {
                this.f22255g.clear();
            }
            this.f22255g.put(a10, new b1.Q(a10, AbstractC3445z.u(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(q10.f24402b);
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean g10 = g(cVar.f22263a);
        boolean z10 = g10 || h();
        if (isChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f22255g.remove(a10);
                return;
            } else {
                this.f22255g.put(a10, new b1.Q(a10, arrayList));
                return;
            }
        }
        if (isChecked) {
            return;
        }
        if (!g10) {
            this.f22255g.put(a10, new b1.Q(a10, AbstractC3445z.u(Integer.valueOf(i10))));
        } else {
            arrayList.add(Integer.valueOf(i10));
            this.f22255g.put(a10, new b1.Q(a10, arrayList));
        }
    }

    public final boolean g(T.a aVar) {
        return this.f22256h && aVar.e();
    }

    public boolean getIsDisabled() {
        return this.f22260l;
    }

    public Map<b1.P, b1.Q> getOverrides() {
        return this.f22255g;
    }

    public final boolean h() {
        return this.f22257i && this.f22254f.size() > 1;
    }

    public final void i() {
        this.f22251c.setChecked(this.f22260l);
        this.f22252d.setChecked(!this.f22260l && this.f22255g.isEmpty());
        for (int i10 = 0; i10 < this.f22259k.length; i10++) {
            b1.Q q10 = (b1.Q) this.f22255g.get(((T.a) this.f22254f.get(i10)).a());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f22259k[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (q10 != null) {
                        this.f22259k[i10][i11].setChecked(q10.f24402b.contains(Integer.valueOf(((c) AbstractC4134a.e(checkedTextViewArr[i11].getTag())).f22264b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    public final void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f22254f.isEmpty()) {
            this.f22251c.setEnabled(false);
            this.f22252d.setEnabled(false);
            return;
        }
        this.f22251c.setEnabled(true);
        this.f22252d.setEnabled(true);
        this.f22259k = new CheckedTextView[this.f22254f.size()][];
        boolean h10 = h();
        for (int i10 = 0; i10 < this.f22254f.size(); i10++) {
            T.a aVar = (T.a) this.f22254f.get(i10);
            boolean g10 = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f22259k;
            int i11 = aVar.f24518a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < aVar.f24518a; i12++) {
                cVarArr[i12] = new c(aVar, i12);
            }
            Comparator comparator = this.f22261m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f22250b.inflate(Z.f22339a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f22250b.inflate((g10 || h10) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f22249a);
                checkedTextView.setText(this.f22258j.a(cVarArr[i13].a()));
                checkedTextView.setTag(cVarArr[i13]);
                if (aVar.i(i13)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f22253e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f22259k[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f22256h != z10) {
            this.f22256h = z10;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f22257i != z10) {
            this.f22257i = z10;
            if (!z10 && this.f22255g.size() > 1) {
                Map b10 = b(this.f22255g, this.f22254f, false);
                this.f22255g.clear();
                this.f22255g.putAll(b10);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f22251c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(m0 m0Var) {
        this.f22258j = (m0) AbstractC4134a.e(m0Var);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f22249a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f22250b = from;
        b bVar = new b();
        this.f22253e = bVar;
        this.f22258j = new C2237f(getResources());
        this.f22254f = new ArrayList();
        this.f22255g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f22251c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(b0.f22388x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(Z.f22339a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f22252d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(b0.f22387w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
