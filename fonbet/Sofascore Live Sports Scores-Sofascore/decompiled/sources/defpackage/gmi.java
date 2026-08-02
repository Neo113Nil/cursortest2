package defpackage;

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
import kotlin.collections.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gmi {
    public static final gmi a = new gmi();
    public static final List b = b.j(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r5.isClickable() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r5 = defpackage.xsk.b(r5).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r5.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r0.addAll(a((android.view.View) r5.next()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList a(View view) {
        if (cw3.a.contains(gmi.class)) {
            return null;
        }
        try {
            view.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Class) it.next()).isInstance(view)) {
                    break;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            cw3.a(gmi.class, th);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        if (cw3.a.contains(gmi.class)) {
            return null;
        }
        try {
            view.getClass();
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = xsk.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            cw3.a(gmi.class, th);
            return null;
        }
    }

    public static final String d(View view) {
        if (cw3.a.contains(gmi.class)) {
            return null;
        }
        try {
            view.getClass();
            String j = xsk.j(view);
            if (j.length() > 0) {
                return j;
            }
            String join = TextUtils.join(" ", a.c(view));
            join.getClass();
            return join;
        } catch (Throwable th) {
            cw3.a(gmi.class, th);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        if (cw3.a.contains(gmi.class)) {
            return;
        }
        try {
            view.getClass();
            try {
                String j = xsk.j(view);
                String h = xsk.h(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", xsk.c(view));
                if (j.length() > 0) {
                    jSONObject.put("text", j);
                }
                if (h.length() > 0) {
                    jSONObject.put("hint", h);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            cw3.a(gmi.class, th);
        }
    }

    public final ArrayList c(View view) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = xsk.b(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String j = xsk.j(view2);
                if (j.length() > 0) {
                    arrayList.add(j);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }
}
