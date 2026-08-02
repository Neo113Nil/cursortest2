package androidx.preference;

import android.R;
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;
import xsna.m33;
import xsna.r7q;
import xsna.tyc0;

/* compiled from: PreferenceGroupAdapter.java */
/* loaded from: classes12.dex */
public final class c extends RecyclerView.Adapter<tyc0> implements PreferenceGroup.b {
    public final PreferenceGroup c;
    public ArrayList d;
    public ArrayList e;
    public final ArrayList f;
    public final a h = new a();
    public final Handler g = new Handler(Looper.getMainLooper());

    /* compiled from: PreferenceGroupAdapter.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.A0();
        }
    }

    /* compiled from: PreferenceGroupAdapter.java */
    public static class b {
        public final int a;
        public final int b;
        public final String c;

        public b(@NonNull Preference preference) {
            this.c = preference.getClass().getName();
            this.a = preference.H;
            this.b = preference.I;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && TextUtils.equals(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31) + this.b) * 31);
        }
    }

    public c(@NonNull PreferenceScreen preferenceScreen) {
        this.c = preferenceScreen;
        preferenceScreen.J = this;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        setHasStableIds(preferenceScreen.Y);
        A0();
    }

    public final void A0() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).J = null;
        }
        ArrayList arrayList = new ArrayList(this.d.size());
        this.d = arrayList;
        PreferenceGroup preferenceGroup = this.c;
        y0(arrayList, preferenceGroup);
        this.e = x0(preferenceGroup);
        notifyDataSetChanged();
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    @Override // androidx.preference.PreferenceGroup.b
    public final int O(@NonNull Preference preference) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = (Preference) this.e.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.preference.PreferenceGroup.b
    public final int f0(@NonNull String str) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((Preference) this.e.get(i)).n)) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (hasStableIds()) {
            return z0(i).getId();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        b bVar = new b(z0(i));
        ArrayList arrayList = this.f;
        int indexOf = arrayList.indexOf(bVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(bVar);
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull tyc0 tyc0Var, int i) {
        tyc0 tyc0Var2 = tyc0Var;
        Preference z0 = z0(i);
        ColorStateList colorStateList = tyc0Var2.m;
        Drawable background = tyc0Var2.itemView.getBackground();
        Drawable drawable = tyc0Var2.l;
        if (background != drawable) {
            View view = tyc0Var2.itemView;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) tyc0Var2.V5(R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        z0.s(tyc0Var2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final tyc0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        b bVar = (b) this.f.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, R$styleable.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = m33.a(R.drawable.list_selector_background, viewGroup.getContext());
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(bVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = bVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new tyc0(inflate);
    }

    public final ArrayList x0(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.S.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Preference Q = preferenceGroup.Q(i2);
            if (Q.z) {
                int i3 = preferenceGroup.W;
                if (i3 == Integer.MAX_VALUE || i < i3) {
                    arrayList.add(Q);
                } else {
                    arrayList2.add(Q);
                }
                if (Q instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) Q;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.W != Integer.MAX_VALUE && preferenceGroup2.W != Integer.MAX_VALUE) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        Iterator it = x0(preferenceGroup2).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            int i4 = preferenceGroup.W;
                            if (i4 == Integer.MAX_VALUE || i < i4) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        int i5 = preferenceGroup.W;
        if (i5 != Integer.MAX_VALUE && i > i5) {
            Context context = preferenceGroup.b;
            long j = preferenceGroup.d;
            r7q r7qVar = new r7q(context);
            r7qVar.H = com.vkontakte.android.R.layout.expand_button;
            Context context2 = r7qVar.b;
            Drawable a2 = m33.a(com.vkontakte.android.R.drawable.ic_arrow_down_24dp, context2);
            if (r7qVar.m != a2) {
                r7qVar.m = a2;
                r7qVar.l = 0;
                r7qVar.o();
            }
            r7qVar.l = com.vkontakte.android.R.drawable.ic_arrow_down_24dp;
            r7qVar.J(context2.getString(com.vkontakte.android.R.string.expand_button_title));
            if (999 != r7qVar.h) {
                r7qVar.h = 999;
                c cVar = r7qVar.J;
                if (cVar != null) {
                    Handler handler = cVar.g;
                    a aVar = cVar.h;
                    handler.removeCallbacks(aVar);
                    handler.post(aVar);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            CharSequence charSequence = null;
            while (it2.hasNext()) {
                Preference preference2 = (Preference) it2.next();
                CharSequence charSequence2 = preference2.j;
                boolean z = preference2 instanceof PreferenceGroup;
                if (z && !TextUtils.isEmpty(charSequence2)) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
                if (arrayList3.contains(preference2.L)) {
                    if (z) {
                        arrayList3.add((PreferenceGroup) preference2);
                    }
                } else if (!TextUtils.isEmpty(charSequence2)) {
                    charSequence = charSequence == null ? charSequence2 : context2.getString(com.vkontakte.android.R.string.summary_collapsed_preference_list, charSequence, charSequence2);
                }
            }
            r7qVar.I(charSequence);
            r7qVar.Q = j + 1000000;
            r7qVar.g = new d(this, preferenceGroup);
            arrayList.add(r7qVar);
        }
        return arrayList;
    }

    public final void y0(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.S);
        }
        int size = preferenceGroup.S.size();
        for (int i = 0; i < size; i++) {
            Preference Q = preferenceGroup.Q(i);
            arrayList.add(Q);
            b bVar = new b(Q);
            if (!this.f.contains(bVar)) {
                this.f.add(bVar);
            }
            if (Q instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) Q;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    y0(arrayList, preferenceGroup2);
                }
            }
            Q.J = this;
        }
    }

    @Nullable
    public final Preference z0(int i) {
        if (i < 0 || i >= this.e.size()) {
            return null;
        }
        return (Preference) this.e.get(i);
    }
}
