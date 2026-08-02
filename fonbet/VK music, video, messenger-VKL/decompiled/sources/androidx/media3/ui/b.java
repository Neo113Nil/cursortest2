package androidx.media3.ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import xsna.phq;
import xsna.vik0;

/* compiled from: SpannedToHtmlConverter.java */
/* loaded from: classes12.dex */
public final class b {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    /* compiled from: SpannedToHtmlConverter.java */
    public static class a {
        public final String a;
        public final Map<String, String> b;

        public a(String str, Map map) {
            this.a = str;
            this.b = map;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    /* renamed from: androidx.media3.ui.b$b, reason: collision with other inner class name */
    public static final class C0073b {
        public static final phq e = new phq(1);
        public static final vik0 f = new vik0();
        public final int a;
        public final int b;
        public final String c;
        public final String d;

        public C0073b(int i, int i2, String str, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    public static final class c {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
