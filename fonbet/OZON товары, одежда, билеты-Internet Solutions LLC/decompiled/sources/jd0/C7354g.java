package jd0;

import Sc.r;
import android.net.Uri;

/* renamed from: jd0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7354g {
    public static final boolean a(String str) {
        Object a11;
        Uri parse;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            a11 = Boolean.valueOf((str == null || (parse = Uri.parse(str)) == null) ? false : parse.isOpaque());
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        Object obj = Boolean.FALSE;
        if (a11 instanceof r.b) {
            a11 = obj;
        }
        return ((Boolean) a11).booleanValue();
    }
}
