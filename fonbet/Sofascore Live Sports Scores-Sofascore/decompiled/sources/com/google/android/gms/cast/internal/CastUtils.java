package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.a70;
import defpackage.lnb;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public final class CastUtils {
    public static final Pattern a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
    public static final Random b = new Random(SystemClock.elapsedRealtime());

    private CastUtils() {
    }

    public static String a(String str, JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            a70.p("Namespace cannot be null or empty");
            return;
        }
        if (str.length() > 128) {
            a70.p("Invalid namespace length");
        } else if (!str.startsWith("urn:x-cast:")) {
            a70.p("Namespace must begin with the prefix \"urn:x-cast:\"");
        } else {
            if (str.length() != 11) {
                return;
            }
            a70.p("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
    }

    public static int[] d(AbstractCollection abstractCollection) {
        int[] iArr = new int[abstractCollection.size()];
        Iterator it = abstractCollection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static ArrayList e(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            i = lnb.f(iArr[i], arrayList, i, 1);
        }
        return arrayList;
    }
}
