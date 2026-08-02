package t6;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f65696a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final List f65697b = CollectionsKt.listOf((Object[]) new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r5.isClickable() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r1.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r5 = l6.f.b(r5).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r5.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r1.addAll(a((android.view.View) r5.next()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List a(View view) {
        if (Y7.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator it = f65697b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Class) it.next()).isInstance(view)) {
                    break;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            Y7.a.b(th2, c.class);
            return null;
        }
    }

    public static final JSONObject b(View view, View clickedView) {
        if (Y7.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = l6.f.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            Y7.a.b(th2, c.class);
            return null;
        }
    }

    public static final String d(View hostView) {
        if (Y7.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String k10 = l6.f.k(hostView);
            if (k10.length() > 0) {
                return k10;
            }
            String join = TextUtils.join(" ", f65696a.c(hostView));
            Intrinsics.checkNotNullExpressionValue(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th2) {
            Y7.a.b(th2, c.class);
            return null;
        }
    }

    public static final void e(View view, JSONObject json) {
        if (Y7.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String k10 = l6.f.k(view);
                String i10 = l6.f.i(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", l6.f.c(view));
                if (k10.length() > 0) {
                    json.put("text", k10);
                }
                if (i10.length() > 0) {
                    json.put("hint", i10);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, c.class);
        }
    }

    public final List c(View view) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : l6.f.b(view)) {
                String k10 = l6.f.k(view2);
                if (k10.length() > 0) {
                    arrayList.add(k10);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }
}
