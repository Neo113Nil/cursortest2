package androidx.appcompat.widget;

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
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.sports.insider.R;
import com.sports.insider.data.repository.room.metric.EventsTable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u3 extends a1.c implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f967x = 0;

    /* renamed from: h, reason: collision with root package name */
    public final int f968h;

    /* renamed from: i, reason: collision with root package name */
    public final int f969i;
    public final LayoutInflater j;

    /* renamed from: k, reason: collision with root package name */
    public final SearchView f970k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchableInfo f971l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f972m;

    /* renamed from: n, reason: collision with root package name */
    public final WeakHashMap f973n;

    /* renamed from: o, reason: collision with root package name */
    public final int f974o;

    /* renamed from: p, reason: collision with root package name */
    public int f975p;
    public ColorStateList q;

    /* renamed from: r, reason: collision with root package name */
    public int f976r;

    /* renamed from: s, reason: collision with root package name */
    public int f977s;

    /* renamed from: t, reason: collision with root package name */
    public int f978t;

    /* renamed from: u, reason: collision with root package name */
    public int f979u;

    /* renamed from: v, reason: collision with root package name */
    public int f980v;

    /* renamed from: w, reason: collision with root package name */
    public int f981w;

    public u3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f14b = true;
        this.f15c = null;
        this.f13a = false;
        this.f16d = -1;
        this.f17e = new a1.a(this);
        this.f18f = new a1.b(0, this);
        this.f969i = suggestionRowLayout;
        this.f968h = suggestionRowLayout;
        this.j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f975p = 1;
        this.f976r = -1;
        this.f977s = -1;
        this.f978t = -1;
        this.f979u = -1;
        this.f980v = -1;
        this.f981w = -1;
        this.f970k = searchView;
        this.f971l = searchableInfo;
        this.f974o = searchView.getSuggestionCommitIconResId();
        this.f972m = context;
        this.f973n = weakHashMap;
    }

    public static String h(Cursor cursor, int i5) {
        if (i5 == -1) {
            return null;
        }
        try {
            return cursor.getString(i5);
        } catch (Exception e7) {
            io.sentry.android.core.w0.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    @Override // a1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i5;
        int i10;
        Drawable f6;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        t3 t3Var = (t3) view.getTag();
        int i11 = this.f981w;
        int i12 = i11 != -1 ? cursor.getInt(i11) : 0;
        TextView textView = t3Var.f954a;
        TextView textView2 = t3Var.f955b;
        ImageView imageView = t3Var.f958e;
        if (textView != null) {
            String h10 = h(cursor, this.f976r);
            textView.setText(h10);
            if (TextUtils.isEmpty(h10)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f972m;
        if (textView2 != null) {
            String h11 = h(cursor, this.f978t);
            if (h11 != null) {
                if (this.q == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.q = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h11);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.q, null), 0, h11.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f977s);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = t3Var.f956c;
        if (imageView2 != null) {
            int i13 = this.f979u;
            if (i13 == -1) {
                f6 = null;
            } else {
                f6 = f(cursor.getString(i13));
                if (f6 == null) {
                    ComponentName searchActivity = this.f971l.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f973n;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f6 = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e7) {
                            io.sentry.android.core.w0.m("SuggestionsAdapter", e7.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder r5 = c1.r(iconResource, "Invalid icon resource ", " for ");
                                r5.append(searchActivity.flattenToShortString());
                                io.sentry.android.core.w0.m("SuggestionsAdapter", r5.toString());
                            } else {
                                f6 = drawable;
                                weakHashMap.put(flattenToShortString, f6 != null ? null : f6.getConstantState());
                            }
                        }
                        f6 = null;
                        weakHashMap.put(flattenToShortString, f6 != null ? null : f6.getConstantState());
                    }
                    if (f6 == null) {
                        f6 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(f6);
            if (f6 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                f6.setVisible(false, false);
                f6.setVisible(true, false);
            }
        }
        ImageView imageView3 = t3Var.f957d;
        if (imageView3 != null) {
            int i14 = this.f980v;
            Drawable f10 = i14 == -1 ? null : f(cursor.getString(i14));
            imageView3.setImageDrawable(f10);
            if (f10 != null) {
                imageView3.setVisibility(0);
                f10.setVisible(false, false);
                i5 = 1;
                f10.setVisible(true, false);
                i10 = this.f975p;
                if (i10 == 2 && (i10 != i5 || (i12 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
            imageView3.setVisibility(8);
        }
        i5 = 1;
        i10 = this.f975p;
        if (i10 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // a1.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f976r = cursor.getColumnIndex("suggest_text_1");
                this.f977s = cursor.getColumnIndex("suggest_text_2");
                this.f978t = cursor.getColumnIndex("suggest_text_2_url");
                this.f979u = cursor.getColumnIndex("suggest_icon_1");
                this.f980v = cursor.getColumnIndex("suggest_icon_2");
                this.f981w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            io.sentry.android.core.w0.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override // a1.c
    public final String c(Cursor cursor) {
        String h10;
        String h11;
        if (cursor == null) {
            return null;
        }
        String h12 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h12 != null) {
            return h12;
        }
        SearchableInfo searchableInfo = this.f971l;
        if (searchableInfo.shouldRewriteQueryFromData() && (h11 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h11;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h10 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h10;
    }

    @Override // a1.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.j.inflate(this.f968h, viewGroup, false);
        inflate.setTag(new t3(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f974o);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f972m.getPackageManager().getResourcesForApplication(authority);
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

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.f973n;
        Context context = this.f972m;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !CommonUrlParts.Values.FALSE_INTEGER.equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable drawable2 = context.getDrawable(parseInt);
                if (drawable2 != null) {
                    weakHashMap.put(str2, drawable2.getConstantState());
                }
                return drawable2;
            } catch (Resources.NotFoundException unused) {
                io.sentry.android.core.w0.m("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e7) {
                    io.sentry.android.core.w0.m("SuggestionsAdapter", "Icon not found: " + parse + ", " + e7.getMessage());
                    if (drawable != null) {
                        weakHashMap.put(str, drawable.getConstantState());
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = e(parse);
                        if (drawable != null) {
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream == null) {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                    try {
                        Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                        try {
                            openInputStream.close();
                        } catch (IOException e9) {
                            io.sentry.android.core.w0.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e9);
                        }
                        drawable = createFromStream;
                        if (drawable != null) {
                        }
                    } finally {
                    }
                }
            }
        }
        return drawable;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(EventsTable.contentColumn).authority(suggestAuthority).query("").fragment("");
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
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f972m.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // a1.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i5, view, viewGroup);
        } catch (RuntimeException e7) {
            io.sentry.android.core.w0.n("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View inflate = this.j.inflate(this.f969i, viewGroup, false);
            if (inflate != null) {
                ((t3) inflate.getTag()).f954a.setText(e7.toString());
            }
            return inflate;
        }
    }

    @Override // a1.c, android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i5, view, viewGroup);
        } catch (RuntimeException e7) {
            io.sentry.android.core.w0.n("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View d10 = d(viewGroup);
            ((t3) d10.getTag()).f954a.setText(e7.toString());
            return d10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f15c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f15c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f970k.h((CharSequence) tag);
        }
    }
}
