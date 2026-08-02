package androidx.media3.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import b1.AbstractC2335D;
import e1.AbstractC4134a;
import java.util.Locale;

/* renamed from: androidx.media3.ui.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2237f implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f22464a;

    public C2237f(Resources resources) {
        this.f22464a = (Resources) AbstractC4134a.e(resources);
    }

    public static int i(androidx.media3.common.a aVar) {
        int k10 = AbstractC2335D.k(aVar.f20543o);
        if (k10 != -1) {
            return k10;
        }
        if (AbstractC2335D.n(aVar.f20539k) != null) {
            return 2;
        }
        if (AbstractC2335D.c(aVar.f20539k) != null) {
            return 1;
        }
        if (aVar.f20550v == -1 && aVar.f20551w == -1) {
            return (aVar.f20518F == -1 && aVar.f20519G == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // androidx.media3.ui.m0
    public String a(androidx.media3.common.a aVar) {
        int i10 = i(aVar);
        String j10 = i10 == 2 ? j(h(aVar), g(aVar), c(aVar)) : i10 == 1 ? j(e(aVar), b(aVar), c(aVar)) : e(aVar);
        if (!j10.isEmpty()) {
            return j10;
        }
        String str = aVar.f20532d;
        return (str == null || str.trim().isEmpty()) ? this.f22464a.getString(b0.f22363D) : this.f22464a.getString(b0.f22364E, str);
    }

    public final String b(androidx.media3.common.a aVar) {
        int i10 = aVar.f20518F;
        return (i10 == -1 || i10 < 1) ? "" : i10 != 1 ? i10 != 2 ? (i10 == 6 || i10 == 7) ? this.f22464a.getString(b0.f22361B) : i10 != 8 ? this.f22464a.getString(b0.f22360A) : this.f22464a.getString(b0.f22362C) : this.f22464a.getString(b0.f22390z) : this.f22464a.getString(b0.f22381q);
    }

    public final String c(androidx.media3.common.a aVar) {
        int i10 = aVar.f20538j;
        return i10 == -1 ? "" : this.f22464a.getString(b0.f22380p, Float.valueOf(i10 / 1000000.0f));
    }

    public final String d(androidx.media3.common.a aVar) {
        return TextUtils.isEmpty(aVar.f20530b) ? "" : aVar.f20530b;
    }

    public final String e(androidx.media3.common.a aVar) {
        String j10 = j(f(aVar), h(aVar));
        return TextUtils.isEmpty(j10) ? d(aVar) : j10;
    }

    public final String f(androidx.media3.common.a aVar) {
        String str = aVar.f20532d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale forLanguageTag = Locale.forLanguageTag(str);
        Locale b02 = e1.Z.b0();
        String displayName = forLanguageTag.getDisplayName(b02);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(b02) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    public final String g(androidx.media3.common.a aVar) {
        int i10 = aVar.f20550v;
        int i11 = aVar.f20551w;
        return (i10 == -1 || i11 == -1) ? "" : this.f22464a.getString(b0.f22382r, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public final String h(androidx.media3.common.a aVar) {
        String string = (aVar.f20534f & 2) != 0 ? this.f22464a.getString(b0.f22383s) : "";
        if ((aVar.f20534f & 4) != 0) {
            string = j(string, this.f22464a.getString(b0.f22386v));
        }
        if ((aVar.f20534f & 8) != 0) {
            string = j(string, this.f22464a.getString(b0.f22385u));
        }
        return (aVar.f20534f & 1088) != 0 ? j(string, this.f22464a.getString(b0.f22384t)) : string;
    }

    public final String j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (!str2.isEmpty()) {
                str = TextUtils.isEmpty(str) ? str2 : this.f22464a.getString(b0.f22379o, str, str2);
            }
        }
        return str;
    }
}
