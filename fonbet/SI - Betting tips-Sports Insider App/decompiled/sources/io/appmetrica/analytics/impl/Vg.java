package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Vg extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f13066b;

    public Vg(X4 x42) {
        this(x42, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.Rg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(@NonNull P5 p52) {
        HashSet hashSet;
        ArrayList b10;
        X4 x42 = this.f12818a;
        if (x42.f13159t.c() && x42.y()) {
            We we2 = x42.f13144c;
            String e7 = this.f12818a.f13144c.e();
            try {
                if (!TextUtils.isEmpty(e7)) {
                    try {
                        hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(e7);
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            hashSet.add(new R9(jSONArray.getJSONObject(i5)));
                        }
                    } catch (Throwable unused) {
                    }
                    b10 = b();
                    if (CollectionUtils.areCollectionsEqual(hashSet, b10)) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = b10.iterator();
                        while (it.hasNext()) {
                            R9 r92 = (R9) it.next();
                            r92.getClass();
                            JSONObject put = new JSONObject().put("name", r92.f12811a).put("required", r92.f12813c);
                            int i10 = r92.f12812b;
                            if (i10 != -1) {
                                put.put("version", i10);
                            }
                            jSONArray2.put(put);
                        }
                        P5 a7 = P5.a(p52, new JSONObject().put("features", jSONArray2).toString());
                        C0277k9 c0277k9 = x42.f13154n;
                        c0277k9.a(a7, Rk.a(c0277k9.f14108c.b(a7), a7.f12735i));
                        int i11 = c0277k9.j;
                        c0277k9.f14116l = i11;
                        c0277k9.f14106a.a(i11).b();
                        we2.i(jSONArray2.toString());
                    } else {
                        C0277k9 c0277k92 = x42.f13154n;
                        int i12 = c0277k92.j;
                        c0277k92.f14116l = i12;
                        c0277k92.f14106a.a(i12).b();
                    }
                }
                b10 = b();
                if (CollectionUtils.areCollectionsEqual(hashSet, b10)) {
                }
            } catch (Throwable unused2) {
            }
            hashSet = null;
        }
        return false;
    }

    public final ArrayList b() {
        FeatureInfo[] featureInfoArr;
        try {
            X4 x42 = this.f12818a;
            SafePackageManager safePackageManager = this.f13066b;
            Context context = x42.f13142a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            Q9 o92 = AndroidUtils.isApiAchieved(24) ? new O9() : new P9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(o92.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Vg(X4 x42, @NonNull SafePackageManager safePackageManager) {
        super(x42);
        this.f13066b = safePackageManager;
    }
}
