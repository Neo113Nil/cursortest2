package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import l.AbstractC5335a;
import l0.AbstractC5338c;

/* loaded from: classes.dex */
public class U extends F0.c implements View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f17209l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f17210m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f17211n;

    /* renamed from: o, reason: collision with root package name */
    public final WeakHashMap f17212o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17213p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17214q;

    /* renamed from: r, reason: collision with root package name */
    public int f17215r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f17216s;

    /* renamed from: t, reason: collision with root package name */
    public int f17217t;

    /* renamed from: u, reason: collision with root package name */
    public int f17218u;

    /* renamed from: v, reason: collision with root package name */
    public int f17219v;

    /* renamed from: w, reason: collision with root package name */
    public int f17220w;

    /* renamed from: x, reason: collision with root package name */
    public int f17221x;

    /* renamed from: y, reason: collision with root package name */
    public int f17222y;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f17223a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f17224b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f17225c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f17226d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f17227e;

        public a(View view) {
            this.f17223a = (TextView) view.findViewById(R.id.text1);
            this.f17224b = (TextView) view.findViewById(R.id.text2);
            this.f17225c = (ImageView) view.findViewById(R.id.icon1);
            this.f17226d = (ImageView) view.findViewById(R.id.icon2);
            this.f17227e = (ImageView) view.findViewById(l.f.f55113r);
        }
    }

    public U(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f17214q = false;
        this.f17215r = 1;
        this.f17217t = -1;
        this.f17218u = -1;
        this.f17219v = -1;
        this.f17220w = -1;
        this.f17221x = -1;
        this.f17222y = -1;
        this.f17209l = searchView;
        this.f17210m = searchableInfo;
        this.f17213p = searchView.getSuggestionCommitIconResId();
        this.f17211n = context;
        this.f17212o = weakHashMap;
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    public static String v(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    public final void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // F0.a, F0.b.a
    public void a(Cursor cursor) {
        if (this.f17214q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f17217t = cursor.getColumnIndex("suggest_text_1");
                this.f17218u = cursor.getColumnIndex("suggest_text_2");
                this.f17219v = cursor.getColumnIndex("suggest_text_2_url");
                this.f17220w = cursor.getColumnIndex("suggest_icon_1");
                this.f17221x = cursor.getColumnIndex("suggest_icon_2");
                this.f17222y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // F0.b.a
    public Cursor b(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f17209l.getVisibility() == 0 && this.f17209l.getWindowVisibility() == 0) {
            try {
                Cursor u10 = u(this.f17210m, charSequence2, 50);
                if (u10 != null) {
                    u10.getCount();
                    return u10;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // F0.a, F0.b.a
    public CharSequence convertToString(Cursor cursor) {
        String n10;
        String n11;
        if (cursor == null) {
            return null;
        }
        String n12 = n(cursor, "suggest_intent_query");
        if (n12 != null) {
            return n12;
        }
        if (this.f17210m.shouldRewriteQueryFromData() && (n11 = n(cursor, "suggest_intent_data")) != null) {
            return n11;
        }
        if (!this.f17210m.shouldRewriteQueryFromText() || (n10 = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return n10;
    }

    @Override // F0.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f17222y;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f17223a != null) {
            y(aVar.f17223a, v(cursor, this.f17217t));
        }
        if (aVar.f17224b != null) {
            String v10 = v(cursor, this.f17219v);
            CharSequence k10 = v10 != null ? k(v10) : v(cursor, this.f17218u);
            if (TextUtils.isEmpty(k10)) {
                TextView textView = aVar.f17223a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f17223a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f17223a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f17223a.setMaxLines(1);
                }
            }
            y(aVar.f17224b, k10);
        }
        ImageView imageView = aVar.f17225c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f17226d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i12 = this.f17215r;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f17227e.setVisibility(8);
            return;
        }
        aVar.f17227e.setVisibility(0);
        aVar.f17227e.setTag(aVar.f17223a.getText());
        aVar.f17227e.setOnClickListener(this);
    }

    @Override // F0.c, F0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View g10 = super.g(context, cursor, viewGroup);
        g10.setTag(new a(g10));
        ((ImageView) g10.findViewById(l.f.f55113r)).setImageResource(this.f17213p);
        return g10;
    }

    @Override // F0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View f10 = f(this.f17211n, c(), viewGroup);
            if (f10 != null) {
                ((a) f10.getTag()).f17223a.setText(e10.toString());
            }
            return f10;
        }
    }

    @Override // F0.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View g10 = g(this.f17211n, c(), viewGroup);
            if (g10 != null) {
                ((a) g10.getTag()).f17223a.setText(e10.toString());
            }
            return g10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final Drawable j(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f17212o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence k(CharSequence charSequence) {
        if (this.f17216s == null) {
            TypedValue typedValue = new TypedValue();
            this.f17211n.getTheme().resolveAttribute(AbstractC5335a.f54982O, typedValue, true);
            this.f17216s = this.f17211n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f17216s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable l(ComponentName componentName) {
        PackageManager packageManager = this.f17211n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    public final Drawable m(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f17212o.containsKey(flattenToShortString)) {
            Drawable l10 = l(componentName);
            this.f17212o.put(flattenToShortString, l10 != null ? l10.getConstantState() : null);
            return l10;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f17212o.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f17211n.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(c());
    }

    public final Drawable o() {
        Drawable m10 = m(this.f17210m.getSearchActivity());
        return m10 != null ? m10 : this.f17211n.getPackageManager().getDefaultActivityIcon();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f17209l.S((CharSequence) tag);
        }
    }

    public final Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f17211n.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    return createFromStream;
                } catch (IOException e10) {
                    return createFromStream;
                }
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e102) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e102);
                }
            }
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    public Drawable q(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f17211n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f17211n.getPackageName() + "/" + parseInt;
            Drawable j10 = j(str2);
            if (j10 != null) {
                return j10;
            }
            Drawable drawable = AbstractC5338c.getDrawable(this.f17211n, parseInt);
            z(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable j11 = j(str);
            if (j11 != null) {
                return j11;
            }
            Drawable p10 = p(Uri.parse(str));
            z(str, p10);
            return p10;
        }
    }

    public final Drawable s(Cursor cursor) {
        int i10 = this.f17220w;
        if (i10 == -1) {
            return null;
        }
        Drawable r10 = r(cursor.getString(i10));
        return r10 != null ? r10 : o();
    }

    public final Drawable t(Cursor cursor) {
        int i10 = this.f17221x;
        if (i10 == -1) {
            return null;
        }
        return r(cursor.getString(i10));
    }

    public Cursor u(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f17211n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i10) {
        this.f17215r = i10;
    }

    public final void x(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f17212o.put(str, drawable.getConstantState());
        }
    }
}
