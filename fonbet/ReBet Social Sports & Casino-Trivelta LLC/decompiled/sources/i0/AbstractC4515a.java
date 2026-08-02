package i0;

import android.view.View;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4515a {
    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
