package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class y4f extends l {
    public final PreferenceGroup a;
    public ArrayList b;
    public ArrayList c;
    public final ArrayList d;
    public final kac f = new kac(this, 10);
    public final Handler e = new Handler(Looper.getMainLooper());

    public y4f(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
        preferenceGroup.F = this;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).U);
        } else {
            setHasStableIds(true);
        }
        s();
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.l
    public final long getItemId(int i) {
        if (hasStableIds()) {
            return q(i).c();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemViewType(int i) {
        x4f x4fVar = new x4f(q(i));
        ArrayList arrayList = this.d;
        int indexOf = arrayList.indexOf(x4fVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(x4fVar);
        return size;
    }

    public final ArrayList o(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.O.size();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            CharSequence charSequence = null;
            if (i >= size) {
                int i3 = preferenceGroup.S;
                if (i3 != Integer.MAX_VALUE && i2 > i3) {
                    Context context = preferenceGroup.a;
                    long j = preferenceGroup.c;
                    th6 th6Var = new th6(context, null);
                    th6Var.D = R.layout.expand_button;
                    Context context2 = th6Var.a;
                    Drawable d0 = td4.d0(R.drawable.ic_arrow_down_24dp, context2);
                    if (th6Var.j != d0) {
                        th6Var.j = d0;
                        th6Var.i = 0;
                        th6Var.g();
                    }
                    th6Var.i = R.drawable.ic_arrow_down_24dp;
                    String string = context2.getString(R.string.expand_button_title);
                    if (!TextUtils.equals(string, th6Var.g)) {
                        th6Var.g = string;
                        th6Var.g();
                    }
                    if (999 != th6Var.f) {
                        th6Var.f = 999;
                        y4f y4fVar = th6Var.F;
                        if (y4fVar != null) {
                            Handler handler = y4fVar.e;
                            kac kacVar = y4fVar.f;
                            handler.removeCallbacks(kacVar);
                            handler.post(kacVar);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Preference preference = (Preference) it.next();
                        CharSequence charSequence2 = preference.g;
                        boolean z2 = preference instanceof PreferenceGroup;
                        if (z2 && !TextUtils.isEmpty(charSequence2)) {
                            arrayList3.add((PreferenceGroup) preference);
                        }
                        if (arrayList3.contains(preference.H)) {
                            if (z2) {
                                arrayList3.add((PreferenceGroup) preference);
                            }
                        } else if (!TextUtils.isEmpty(charSequence2)) {
                            charSequence = charSequence == null ? charSequence2 : context2.getString(R.string.summary_collapsed_preference_list, charSequence, charSequence2);
                        }
                    }
                    th6Var.u(charSequence);
                    th6Var.M = j + 1000000;
                    th6Var.e = new k1d(this, preferenceGroup, z, 15);
                    arrayList.add(th6Var);
                }
                return arrayList;
            }
            Preference A = preferenceGroup.A(i);
            if (A.v) {
                int i4 = preferenceGroup.S;
                if (i4 == Integer.MAX_VALUE || i2 < i4) {
                    arrayList.add(A);
                } else {
                    arrayList2.add(A);
                }
                if (A instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) A;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.S != Integer.MAX_VALUE && preferenceGroup2.S != Integer.MAX_VALUE) {
                            a70.r("Nesting an expandable group inside of another expandable group is not supported!");
                            return null;
                        }
                        Iterator it2 = o(preferenceGroup2).iterator();
                        while (it2.hasNext()) {
                            Preference preference2 = (Preference) it2.next();
                            int i5 = preferenceGroup.S;
                            if (i5 == Integer.MAX_VALUE || i2 < i5) {
                                arrayList.add(preference2);
                            } else {
                                arrayList2.add(preference2);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        x4f x4fVar = (x4f) this.d.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, jjf.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = td4.d0(android.R.drawable.list_selector_background, viewGroup.getContext());
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(x4fVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap weakHashMap = bsk.a;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = x4fVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new c5f(inflate);
    }

    public final void p(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.O);
        }
        int size = preferenceGroup.O.size();
        for (int i = 0; i < size; i++) {
            Preference A = preferenceGroup.A(i);
            arrayList.add(A);
            x4f x4fVar = new x4f(A);
            if (!this.d.contains(x4fVar)) {
                this.d.add(x4fVar);
            }
            if (A instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) A;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    p(arrayList, preferenceGroup2);
                }
            }
            A.F = this;
        }
    }

    public final Preference q(int i) {
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        return (Preference) this.c.get(i);
    }

    @Override // androidx.recyclerview.widget.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c5f c5fVar, int i) {
        Preference q = q(i);
        ColorStateList colorStateList = c5fVar.c;
        Drawable background = c5fVar.itemView.getBackground();
        Drawable drawable = c5fVar.b;
        if (background != drawable) {
            View view = c5fVar.itemView;
            WeakHashMap weakHashMap = bsk.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) c5fVar.a(android.R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        q.k(c5fVar);
    }

    public final void s() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).F = null;
        }
        ArrayList arrayList = new ArrayList(this.b.size());
        this.b = arrayList;
        PreferenceGroup preferenceGroup = this.a;
        p(arrayList, preferenceGroup);
        this.c = o(preferenceGroup);
        notifyDataSetChanged();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }
}
