package w0;

import android.text.Html;
import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class b {

    public static class a {
        public static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }
    }

    public static Spanned a(String str, int i10) {
        return a.a(str, i10);
    }
}
