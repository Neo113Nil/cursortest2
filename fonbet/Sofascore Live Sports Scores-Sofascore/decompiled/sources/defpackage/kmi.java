package defpackage;

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
import androidx.appcompat.widget.SearchView;
import com.sofascore.results.R;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kmi extends r84 implements View.OnClickListener {
    public static final /* synthetic */ int y = 0;
    public final int i;
    public final int j;
    public final LayoutInflater k;
    public final SearchView l;
    public final SearchableInfo m;
    public final Context n;
    public final WeakHashMap o;
    public final int p;
    public int q;
    public ColorStateList r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;

    public kmi(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.b = true;
        this.c = null;
        this.a = false;
        this.d = context;
        this.e = -1;
        this.f = new p84(this);
        this.g = new q84(this, 0);
        this.j = suggestionRowLayout;
        this.i = suggestionRowLayout;
        this.k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.q = 1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.l = searchView;
        this.m = searchableInfo;
        this.p = searchView.getSuggestionCommitIconResId();
        this.n = context;
        this.o = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    @Override // defpackage.r84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i;
        int i2;
        Drawable f;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        jmi jmiVar = (jmi) view.getTag();
        int i3 = this.x;
        int i4 = i3 != -1 ? cursor.getInt(i3) : 0;
        TextView textView = jmiVar.a;
        TextView textView2 = jmiVar.b;
        ImageView imageView = jmiVar.e;
        if (textView != null) {
            String h = h(cursor, this.s);
            textView.setText(h);
            if (TextUtils.isEmpty(h)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.n;
        if (textView2 != null) {
            String h2 = h(cursor, this.u);
            if (h2 != null) {
                if (this.r == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.r = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.r, null), 0, h2.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.t);
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
        ImageView imageView2 = jmiVar.c;
        if (imageView2 != null) {
            int i5 = this.v;
            if (i5 == -1) {
                f = null;
            } else {
                f = f(cursor.getString(i5));
                if (f == null) {
                    ComponentName searchActivity = this.m.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.o;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e) {
                            e.toString();
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                searchActivity.flattenToShortString();
                            } else {
                                f = drawable;
                                weakHashMap.put(flattenToShortString, f != null ? null : f.getConstantState());
                            }
                        }
                        f = null;
                        weakHashMap.put(flattenToShortString, f != null ? null : f.getConstantState());
                    }
                    if (f == null) {
                        f = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(f);
            if (f == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                f.setVisible(false, false);
                f.setVisible(true, false);
            }
        }
        ImageView imageView3 = jmiVar.d;
        if (imageView3 != null) {
            int i6 = this.w;
            Drawable f2 = i6 == -1 ? null : f(cursor.getString(i6));
            imageView3.setImageDrawable(f2);
            if (f2 != null) {
                imageView3.setVisibility(0);
                f2.setVisible(false, false);
                i = 1;
                f2.setVisible(true, false);
                i2 = this.q;
                if (i2 == 2 && (i2 != i || (i4 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
            imageView3.setVisibility(8);
        }
        i = 1;
        i2 = this.q;
        if (i2 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // defpackage.r84
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.s = cursor.getColumnIndex("suggest_text_1");
                this.t = cursor.getColumnIndex("suggest_text_2");
                this.u = cursor.getColumnIndex("suggest_text_2_url");
                this.v = cursor.getColumnIndex("suggest_icon_1");
                this.w = cursor.getColumnIndex("suggest_icon_2");
                this.x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.r84
    public final String c(Cursor cursor) {
        String h;
        String h2;
        if (cursor == null) {
            return null;
        }
        String h3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h3 != null) {
            return h3;
        }
        SearchableInfo searchableInfo = this.m;
        if (searchableInfo.shouldRewriteQueryFromData() && (h2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h;
    }

    @Override // defpackage.r84
    public final View d(ViewGroup viewGroup) {
        View inflate = this.k.inflate(this.i, viewGroup, false);
        inflate.setTag(new jmi(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.p);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(dmi.m(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(dmi.m(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(dmi.m(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(dmi.m(uri, "More than two path segments: "));
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException(dmi.m(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(dmi.m(uri, "No package found for authority: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.o;
        Context context = this.n;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
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
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e) {
                    Objects.toString(parse);
                    e.getMessage();
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = e(parse);
                        if (drawable != null) {
                            weakHashMap.put(str, drawable.getConstantState());
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
                        drawable = Drawable.createFromStream(openInputStream, null);
                        if (drawable != null) {
                        }
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException unused4) {
                            parse.toString();
                        }
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
        Uri.Builder fragment = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(suggestAuthority).query("").fragment("");
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
        return this.n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // defpackage.r84, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.k.inflate(this.j, viewGroup, false);
            if (inflate != null) {
                ((jmi) inflate.getTag()).a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // defpackage.r84, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View d = this.d(viewGroup);
            ((jmi) d.getTag()).a.setText(e.toString());
            return d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.l.onQueryRefine((CharSequence) tag);
        }
    }
}
