package ru.ozon.android.messenger.framework.analytics;

import android.content.res.Resources;
import android.text.TextUtils;
import j3.C7272n;
import j3.u;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m3.N;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Object f86575a;

    public c(Resources resources) {
        resources.getClass();
        this.f86575a = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(C7272n c7272n) {
        String str;
        String e11;
        String str2 = c7272n.f69116d;
        if (!TextUtils.isEmpty(str2) && !"und".equals(str2)) {
            Locale forLanguageTag = Locale.forLanguageTag(str2);
            int i11 = N.f74289a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            str = forLanguageTag.getDisplayName(locale);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int offsetByCodePoints = str.offsetByCodePoints(0, 1);
                    str = str.substring(0, offsetByCodePoints).toUpperCase(locale) + str.substring(offsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
                e11 = e(str, b(c7272n));
                if (TextUtils.isEmpty(e11)) {
                    return e11;
                }
                String str3 = c7272n.f69114b;
                return TextUtils.isEmpty(str3) ? "" : str3;
            }
        }
        str = "";
        e11 = e(str, b(c7272n));
        if (TextUtils.isEmpty(e11)) {
        }
    }

    private String b(C7272n c7272n) {
        int i11 = c7272n.f69118f;
        int i12 = i11 & 2;
        Resources resources = (Resources) this.f86575a;
        String string = i12 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i11 & 4) != 0) {
            string = e(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i11 & 8) != 0) {
            string = e(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i11 & 1088) != 0 ? e(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    private String e(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (!str2.isEmpty()) {
                str = TextUtils.isEmpty(str) ? str2 : ((Resources) this.f86575a).getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public Function1 c() {
        return (AbstractC7737t) this.f86575a;
    }

    public String d(C7272n c7272n) {
        String a11;
        String d11;
        int h11 = u.h(c7272n.f69127o);
        int i11 = c7272n.f69102G;
        int i12 = c7272n.f69135w;
        int i13 = c7272n.f69134v;
        if (h11 == -1) {
            int i14 = 0;
            String str = null;
            String str2 = c7272n.f69123k;
            if (str2 != null) {
                for (String str3 : N.d0(str2)) {
                    d11 = u.d(str3);
                    if (d11 != null && u.l(d11)) {
                        break;
                    }
                }
            }
            d11 = null;
            if (d11 == null) {
                if (str2 != null) {
                    String[] d02 = N.d0(str2);
                    int length = d02.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        String d12 = u.d(d02[i14]);
                        if (d12 != null && u.i(d12)) {
                            str = d12;
                            break;
                        }
                        i14++;
                    }
                }
                if (str == null) {
                    if (i13 == -1 && i12 == -1) {
                        if (i11 == -1 && c7272n.f69103H == -1) {
                            h11 = -1;
                        }
                    }
                }
                h11 = 1;
            }
            h11 = 2;
        }
        Resources resources = (Resources) this.f86575a;
        int i15 = c7272n.f69122j;
        if (h11 == 2) {
            a11 = e(b(c7272n), (i13 == -1 || i12 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i13), Integer.valueOf(i12)), i15 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i15 / 1000000.0f)) : "");
        } else if (h11 == 1) {
            a11 = e(a(c7272n), (i11 == -1 || i11 < 1) ? "" : i11 != 1 ? i11 != 2 ? (i11 == 6 || i11 == 7) ? resources.getString(R.string.exo_track_surround_5_point_1) : i11 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1) : resources.getString(R.string.exo_track_stereo) : resources.getString(R.string.exo_track_mono), i15 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i15 / 1000000.0f)) : "");
        } else {
            a11 = a(c7272n);
        }
        if (!a11.isEmpty()) {
            return a11;
        }
        String str4 = c7272n.f69116d;
        return (str4 == null || str4.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(Function1 function1) {
        this.f86575a = (AbstractC7737t) function1;
    }
}
