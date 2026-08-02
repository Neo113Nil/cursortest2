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
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import xsna.dip0;
import xsna.jgp0;
import xsna.pfp0;
import xsna.vfe;
import xsna.zgp0;

/* loaded from: classes12.dex */
public class TrackSelectionView extends LinearLayout {
    public final int b;
    public final LayoutInflater c;
    public final CheckedTextView d;
    public final CheckedTextView e;
    public final a f;
    public final ArrayList g;
    public final HashMap h;
    public boolean i;
    public boolean j;
    public jgp0 k;
    public CheckedTextView[][] l;
    public boolean m;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            HashMap hashMap = trackSelectionView.h;
            boolean z = true;
            if (view == trackSelectionView.d) {
                trackSelectionView.m = true;
                hashMap.clear();
            } else if (view == trackSelectionView.e) {
                trackSelectionView.m = false;
                hashMap.clear();
            } else {
                trackSelectionView.m = false;
                Object tag = view.getTag();
                tag.getClass();
                b bVar = (b) tag;
                dip0.a aVar = bVar.a;
                pfp0 pfp0Var = aVar.b;
                int i = bVar.b;
                zgp0 zgp0Var = (zgp0) hashMap.get(pfp0Var);
                if (zgp0Var == null) {
                    if (!trackSelectionView.j && !hashMap.isEmpty()) {
                        hashMap.clear();
                    }
                    hashMap.put(pfp0Var, new zgp0(pfp0Var, ImmutableList.p(Integer.valueOf(i))));
                } else {
                    ArrayList arrayList = new ArrayList(zgp0Var.b);
                    boolean isChecked = ((CheckedTextView) view).isChecked();
                    boolean z2 = trackSelectionView.i && aVar.c;
                    if (!z2 && (!trackSelectionView.j || trackSelectionView.g.size() <= 1)) {
                        z = false;
                    }
                    if (isChecked && z) {
                        arrayList.remove(Integer.valueOf(i));
                        if (arrayList.isEmpty()) {
                            hashMap.remove(pfp0Var);
                        } else {
                            hashMap.put(pfp0Var, new zgp0(pfp0Var, arrayList));
                        }
                    } else if (!isChecked) {
                        if (z2) {
                            arrayList.add(Integer.valueOf(i));
                            hashMap.put(pfp0Var, new zgp0(pfp0Var, arrayList));
                        } else {
                            hashMap.put(pfp0Var, new zgp0(pfp0Var, ImmutableList.p(Integer.valueOf(i))));
                        }
                    }
                }
            }
            trackSelectionView.a();
        }
    }

    public static final class b {
        public final dip0.a a;
        public final int b;

        public b(dip0.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.b = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.c = from;
        a aVar = new a();
        this.f = aVar;
        this.k = new vfe(getResources());
        this.g = new ArrayList();
        this.h = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.vkontakte.android.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(com.vkontakte.android.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.vkontakte.android.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.d.setChecked(this.m);
        boolean z = this.m;
        HashMap hashMap = this.h;
        this.e.setChecked(!z && hashMap.isEmpty());
        for (int i = 0; i < this.l.length; i++) {
            zgp0 zgp0Var = (zgp0) hashMap.get(((dip0.a) this.g.get(i)).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.l[i];
                if (i2 < checkedTextViewArr.length) {
                    if (zgp0Var != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.l[i][i2].setChecked(zgp0Var.b.contains(Integer.valueOf(((b) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.g;
        boolean isEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.e;
        CheckedTextView checkedTextView2 = this.d;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.l = new CheckedTextView[arrayList.size()][];
        boolean z = this.j && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            dip0.a aVar = (dip0.a) arrayList.get(i);
            boolean z2 = this.i && aVar.c;
            CheckedTextView[][] checkedTextViewArr = this.l;
            int i2 = aVar.a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            b[] bVarArr = new b[i2];
            for (int i3 = 0; i3 < aVar.a; i3++) {
                bVarArr[i3] = new b(aVar, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.c;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(com.vkontakte.android.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.b);
                jgp0 jgp0Var = this.k;
                b bVar = bVarArr[i4];
                checkedTextView3.setText(jgp0Var.i(bVar.a.b.d[bVar.b]));
                checkedTextView3.setTag(bVarArr[i4]);
                if (aVar.b(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.l[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.m;
    }

    public Map<pfp0, zgp0> getOverrides() {
        return this.h;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.i != z) {
            this.i = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (!z) {
                HashMap hashMap = this.h;
                if (hashMap.size() > 1) {
                    HashMap hashMap2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.g;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        zgp0 zgp0Var = (zgp0) hashMap.get(((dip0.a) arrayList.get(i)).b);
                        if (zgp0Var != null && hashMap2.isEmpty()) {
                            hashMap2.put(zgp0Var.a, zgp0Var);
                        }
                        i++;
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(jgp0 jgp0Var) {
        jgp0Var.getClass();
        this.k = jgp0Var;
        b();
    }
}
