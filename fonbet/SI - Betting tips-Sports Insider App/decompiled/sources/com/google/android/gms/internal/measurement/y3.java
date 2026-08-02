package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.sports.insider.R;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class y3 {

    /* renamed from: a, reason: collision with root package name */
    public static androidx.appcompat.widget.q4 f5368a;

    public static Bitmap A(Drawable drawable, int i5, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i5 = drawable.getIntrinsicWidth();
        }
        if ((i11 & 2) != 0) {
            i10 = drawable.getIntrinsicHeight();
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (i5 == bitmapDrawable.getBitmap().getWidth() && i10 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i5, i10, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(i5, i10, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i5, i10);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i12, i13, i14, i15);
        return createBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0097, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1.getString("type"), "subs") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00b9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1.getString("priceType"), "subs") != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ic.a B(String stringJson) {
        String str;
        String string;
        int i5;
        String str2;
        String string2;
        String str3;
        String string3;
        Intrinsics.checkNotNullParameter(stringJson, "stringJson");
        JSONObject jSONObject = new JSONObject(stringJson);
        String string4 = jSONObject.getString("productId");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String str4 = "unknown";
        if (jSONObject.has("productName")) {
            string = jSONObject.getString("productName");
        } else if (jSONObject.has("name")) {
            string = jSONObject.getString("name");
        } else {
            if (!jSONObject.has("title")) {
                str = "unknown";
                Intrinsics.checkNotNull(str);
                String str5 = "";
                if (!jSONObject.has("description")) {
                    str5 = jSONObject.optString("description", "");
                } else if (jSONObject.has("productDesc")) {
                    str5 = jSONObject.optString("productDesc", "");
                }
                String str6 = str5;
                Intrinsics.checkNotNull(str6);
                String string5 = !jSONObject.has("iconUrl") ? jSONObject.getString("iconUrl") : null;
                int i10 = 2;
                int i11 = 0;
                if (jSONObject.has("type")) {
                    if (jSONObject.has("priceType")) {
                        if (jSONObject.get("priceType") instanceof Integer) {
                            i10 = jSONObject.getInt("priceType");
                        }
                        i5 = i10;
                    }
                    i5 = 0;
                } else {
                    if (jSONObject.get("type") instanceof Integer) {
                        i10 = jSONObject.getInt("type");
                    }
                    i5 = i10;
                }
                if (!jSONObject.has("subscriptionPeriod")) {
                    string2 = jSONObject.getString("subscriptionPeriod");
                } else {
                    if (!jSONObject.has("subPeriod")) {
                        str2 = null;
                        if (jSONObject.has("priceCurrencyCode")) {
                            string3 = jSONObject.getString("priceCurrencyCode");
                        } else if (jSONObject.has("price_currency_code")) {
                            string3 = jSONObject.getString("price_currency_code");
                        } else {
                            if (!jSONObject.has("currency")) {
                                str3 = "unknown";
                                Intrinsics.checkNotNull(str3);
                                String string6 = jSONObject.getString("price");
                                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                                if (!jSONObject.has("originalPrice")) {
                                    str4 = jSONObject.getString("originalPrice");
                                } else if (jSONObject.has("original_price")) {
                                    str4 = jSONObject.getString("original_price");
                                }
                                String str7 = str4;
                                Intrinsics.checkNotNull(str7);
                                String string7 = !jSONObject.has("introductoryPricePeriod") ? jSONObject.getString("introductoryPricePeriod") : null;
                                String string8 = !jSONObject.has("introductoryPrice") ? jSONObject.getString("introductoryPrice") : null;
                                String string9 = jSONObject.has("freeTrialPeriod") ? jSONObject.getString("freeTrialPeriod") : null;
                                long optLong = !jSONObject.has("priceAmountMicros") ? jSONObject.optLong("priceAmountMicros", 0L) : jSONObject.has("price_amount_micros") ? jSONObject.optLong("price_amount_micros", 0L) : jSONObject.has("microsPrice") ? jSONObject.optLong("microsPrice", 0L) : 0L;
                                long optLong2 = !jSONObject.has("originalPriceAmountMicros") ? jSONObject.optLong("originalPriceAmountMicros", 0L) : jSONObject.has("original_price_micros") ? jSONObject.optLong("original_price_micros", 0L) : 0L;
                                long optLong3 = jSONObject.has("introductoryPriceAmountMicros") ? jSONObject.optLong("introductoryPriceAmountMicros", 0L) : 0L;
                                if (!jSONObject.has("introductoryPriceCycles")) {
                                    i11 = jSONObject.optInt("introductoryPriceCycles", 0);
                                } else if (jSONObject.has("subSpecialPeriodCycles")) {
                                    i11 = jSONObject.optInt("subSpecialPeriodCycles", 0);
                                }
                                return new ic.a(i5, i11, optLong, optLong2, optLong3, str, str6, string5, string4, str2, str3, string6, str7, string7, string8, string9, jSONObject.optInt("offerUsedStatus", -1));
                            }
                            string3 = jSONObject.getString("currency");
                        }
                        str3 = string3;
                        Intrinsics.checkNotNull(str3);
                        String string62 = jSONObject.getString("price");
                        Intrinsics.checkNotNullExpressionValue(string62, "getString(...)");
                        if (!jSONObject.has("originalPrice")) {
                        }
                        String str72 = str4;
                        Intrinsics.checkNotNull(str72);
                        if (!jSONObject.has("introductoryPricePeriod")) {
                        }
                        if (!jSONObject.has("introductoryPrice")) {
                        }
                        String string92 = jSONObject.has("freeTrialPeriod") ? jSONObject.getString("freeTrialPeriod") : null;
                        if (!jSONObject.has("priceAmountMicros")) {
                        }
                        if (!jSONObject.has("originalPriceAmountMicros")) {
                        }
                        if (jSONObject.has("introductoryPriceAmountMicros")) {
                        }
                        if (!jSONObject.has("introductoryPriceCycles")) {
                        }
                        return new ic.a(i5, i11, optLong, optLong2, optLong3, str, str6, string5, string4, str2, str3, string62, str72, string7, string8, string92, jSONObject.optInt("offerUsedStatus", -1));
                    }
                    string2 = jSONObject.getString("subPeriod");
                }
                str2 = string2;
                if (jSONObject.has("priceCurrencyCode")) {
                }
                str3 = string3;
                Intrinsics.checkNotNull(str3);
                String string622 = jSONObject.getString("price");
                Intrinsics.checkNotNullExpressionValue(string622, "getString(...)");
                if (!jSONObject.has("originalPrice")) {
                }
                String str722 = str4;
                Intrinsics.checkNotNull(str722);
                if (!jSONObject.has("introductoryPricePeriod")) {
                }
                if (!jSONObject.has("introductoryPrice")) {
                }
                String string922 = jSONObject.has("freeTrialPeriod") ? jSONObject.getString("freeTrialPeriod") : null;
                if (!jSONObject.has("priceAmountMicros")) {
                }
                if (!jSONObject.has("originalPriceAmountMicros")) {
                }
                if (jSONObject.has("introductoryPriceAmountMicros")) {
                }
                if (!jSONObject.has("introductoryPriceCycles")) {
                }
                return new ic.a(i5, i11, optLong, optLong2, optLong3, str, str6, string5, string4, str2, str3, string622, str722, string7, string8, string922, jSONObject.optInt("offerUsedStatus", -1));
            }
            string = jSONObject.getString("title");
        }
        str = string;
        Intrinsics.checkNotNull(str);
        String str52 = "";
        if (!jSONObject.has("description")) {
        }
        String str62 = str52;
        Intrinsics.checkNotNull(str62);
        if (!jSONObject.has("iconUrl")) {
        }
        int i102 = 2;
        int i112 = 0;
        if (jSONObject.has("type")) {
        }
        if (!jSONObject.has("subscriptionPeriod")) {
        }
        str2 = string2;
        if (jSONObject.has("priceCurrencyCode")) {
        }
        str3 = string3;
        Intrinsics.checkNotNull(str3);
        String string6222 = jSONObject.getString("price");
        Intrinsics.checkNotNullExpressionValue(string6222, "getString(...)");
        if (!jSONObject.has("originalPrice")) {
        }
        String str7222 = str4;
        Intrinsics.checkNotNull(str7222);
        if (!jSONObject.has("introductoryPricePeriod")) {
        }
        if (!jSONObject.has("introductoryPrice")) {
        }
        String string9222 = jSONObject.has("freeTrialPeriod") ? jSONObject.getString("freeTrialPeriod") : null;
        if (!jSONObject.has("priceAmountMicros")) {
        }
        if (!jSONObject.has("originalPriceAmountMicros")) {
        }
        if (jSONObject.has("introductoryPriceAmountMicros")) {
        }
        if (!jSONObject.has("introductoryPriceCycles")) {
        }
        return new ic.a(i5, i112, optLong, optLong2, optLong3, str, str62, string5, string4, str2, str3, string6222, str7222, string7, string8, string9222, jSONObject.optInt("offerUsedStatus", -1));
    }

    public static androidx.appcompat.app.v0 C(io.sentry.b1 b1Var, String str, List list, io.sentry.i1 i1Var) {
        io.sentry.b6 m6 = b1Var.m();
        if (m6.isTraceSampling() && a.a.g(str, m6.getTracePropagationTargets())) {
            io.sentry.b6 m10 = b1Var.m();
            if (i1Var != null && !i1Var.j()) {
                io.sentry.g6 c2 = i1Var.c();
                com.android.billingclient.api.a i5 = i1Var.i(list);
                if (m10.isPropagateTraceparent()) {
                    io.sentry.n6 v5 = i1Var.v();
                    r2 = new androidx.appcompat.app.v0(v5.f16667a, v5.f16668b, c2.f16442c, 18);
                }
                return new androidx.appcompat.app.v0(c2, i5, r2, 21);
            }
            i2.d dVar = new i2.d((char) 0, 10);
            dVar.f10882b = null;
            b1Var.y(new com.google.firebase.messaging.g(16, dVar, m10));
            androidx.appcompat.app.v0 v0Var = (androidx.appcompat.app.v0) dVar.f10882b;
            if (v0Var != null) {
                io.sentry.c cVar = (io.sentry.c) v0Var.f366d;
                io.sentry.p6 p6Var = (io.sentry.p6) v0Var.f365c;
                io.sentry.protocol.v vVar = (io.sentry.protocol.v) v0Var.f364b;
                return new androidx.appcompat.app.v0(new io.sentry.g6(vVar, p6Var, null), com.android.billingclient.api.a.d(cVar, list), m10.isPropagateTraceparent() ? new androidx.appcompat.app.v0(vVar, p6Var, r2, 18) : null, 21);
            }
        }
        return null;
    }

    public static n D(Object obj) {
        if (obj == null) {
            return n.T;
        }
        if (obj instanceof String) {
            return new q((String) obj);
        }
        if (obj instanceof Double) {
            return new g((Double) obj);
        }
        if (obj instanceof Long) {
            return new g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            d dVar = new d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                dVar.p(dVar.m(), D(it.next()));
            }
            return dVar;
        }
        k kVar = new k();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            n D = D(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                kVar.b((String) obj2, D);
            }
        }
        return kVar;
    }

    public static synchronized void E(androidx.appcompat.widget.q4 q4Var) {
        synchronized (y3.class) {
            if (f5368a != null) {
                throw new IllegalStateException("init() already called");
            }
            f5368a = q4Var;
        }
    }

    public static n F(v3 v3Var) {
        if (v3Var == null) {
            return n.S;
        }
        int x10 = v3Var.x() - 1;
        if (x10 == 1) {
            return v3Var.r() ? new q(v3Var.s()) : n.f5146c0;
        }
        if (x10 == 2) {
            return v3Var.v() ? new g(Double.valueOf(v3Var.w())) : new g(null);
        }
        if (x10 == 3) {
            return v3Var.t() ? new e(Boolean.valueOf(v3Var.u())) : new e(null);
        }
        if (x10 != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List p10 = v3Var.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = p10.iterator();
        while (it.hasNext()) {
            arrayList.add(F((v3) it.next()));
        }
        return new o(v3Var.q(), arrayList);
    }

    public static final p1.o a(int i5, float f6, p1.b rounding, List list) {
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        float[] fArr = new float[i5 * 2];
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            long V = ci.c.V(p1.p.e(f6, (p1.p.f21444b / i5) * 2 * i11), s.g.a(0.0f, 0.0f));
            int i12 = i10 + 1;
            fArr[i10] = ci.c.y(V);
            i10 += 2;
            fArr[i12] = ci.c.z(V);
        }
        return b(fArr, rounding, list, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p1.o b(float[] vertices, p1.b rounding, List list, float f6, float f10) {
        float f11;
        long a7;
        int i5;
        ArrayList arrayList;
        List c2;
        p1.c a10;
        p1.b bVar;
        Float valueOf = Float.valueOf(1.0f);
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (vertices.length < 6) {
            throw new IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        int i10 = 2;
        int i11 = 1;
        if (vertices.length % 2 == 1) {
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        if (list != null && list.size() * 2 != vertices.length) {
            throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
        }
        ArrayList arrayList2 = new ArrayList();
        int length = vertices.length / 2;
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (i13 < length) {
            p1.b bVar2 = (list == null || (bVar = (p1.b) list.get(i13)) == null) ? rounding : bVar;
            int i14 = (((i13 + length) - 1) % length) * 2;
            int i15 = i13 + 1;
            int i16 = (i15 % length) * 2;
            int i17 = i13 * 2;
            arrayList3.add(new p1.n(s.g.a(vertices[i14], vertices[i14 + 1]), s.g.a(vertices[i17], vertices[i17 + 1]), s.g.a(vertices[i16], vertices[i16 + 1]), bVar2));
            i13 = i15;
        }
        IntRange d10 = zf.j.d(0, length);
        ArrayList arrayList4 = new ArrayList(kotlin.collections.v.k(d10, 10));
        Iterator it = d10.iterator();
        while (true) {
            f11 = 0.0f;
            if (!((zf.b) it).f25972c) {
                break;
            }
            int nextInt = ((kotlin.collections.i0) it).nextInt();
            int i18 = (nextInt + 1) % length;
            float f12 = ((p1.n) arrayList3.get(nextInt)).f21436h + ((p1.n) arrayList3.get(i18)).f21436h;
            float c8 = ((p1.n) arrayList3.get(i18)).c() + ((p1.n) arrayList3.get(nextInt)).c();
            int i19 = nextInt * 2;
            float f13 = vertices[i19];
            float f14 = vertices[i19 + 1];
            int i20 = i18 * 2;
            float f15 = f13 - vertices[i20];
            float f16 = f14 - vertices[i20 + 1];
            float f17 = p1.p.f21444b;
            float sqrt = (float) Math.sqrt((f16 * f16) + (f15 * f15));
            arrayList4.add(f12 > sqrt ? new Pair(Float.valueOf(sqrt / f12), Float.valueOf(0.0f)) : c8 > sqrt ? new Pair(valueOf, Float.valueOf((sqrt - f12) / (c8 - f12))) : new Pair(valueOf, valueOf));
        }
        int i21 = 0;
        while (i21 < length) {
            s.m mVar = new s.m(i10);
            int i22 = i12;
            while (i22 < i10) {
                Pair pair = (Pair) arrayList4.get((((i21 + length) - i11) + i22) % length);
                mVar.c(((((p1.n) arrayList3.get(i21)).c() - ((p1.n) arrayList3.get(i21)).f21436h) * ((Number) pair.f19193b).floatValue()) + (((p1.n) arrayList3.get(i21)).f21436h * ((Number) pair.f19192a).floatValue()));
                i22++;
                f11 = f11;
                i10 = i10;
            }
            int i23 = i10;
            float f18 = f11;
            p1.n nVar = (p1.n) arrayList3.get(i21);
            float a11 = mVar.a(i12);
            float a12 = mVar.a(i11);
            long j = nVar.f21433e;
            int i24 = i11;
            int i25 = length;
            long j6 = nVar.f21432d;
            int i26 = i12;
            float f19 = nVar.f21434f;
            ArrayList arrayList5 = arrayList2;
            long j10 = nVar.f21430b;
            float min = Math.min(a11, a12);
            float f20 = nVar.f21436h;
            if (f20 < 1.0E-4f || min < 1.0E-4f || f19 < 1.0E-4f) {
                i5 = i21;
                arrayList = arrayList4;
                nVar.f21437i = j10;
                float y5 = ci.c.y(j10);
                float z5 = ci.c.z(j10);
                float y10 = ci.c.y(j10);
                float z7 = ci.c.z(j10);
                c2 = kotlin.collections.t.c(u6.h.a(y5, z5, p1.p.c(y5, y10, 0.33333334f), p1.p.c(z5, z7, 0.33333334f), p1.p.c(y5, y10, 0.6666667f), p1.p.c(z5, z7, 0.6666667f), y10, z7));
            } else {
                float min2 = Math.min(min, f20);
                float a13 = nVar.a(a11);
                float a14 = nVar.a(a12);
                float f21 = (f19 * min2) / f20;
                float f22 = p1.p.f21444b;
                i5 = i21;
                ArrayList arrayList6 = arrayList4;
                nVar.f21437i = ci.c.V(j10, ci.c.Z(ci.c.r(ci.c.n(ci.c.V(j6, j), 2.0f)), (float) Math.sqrt((min2 * min2) + (f21 * f21))));
                long V = ci.c.V(j10, ci.c.Z(j6, min2));
                long V2 = ci.c.V(j10, ci.c.Z(j, min2));
                p1.c b10 = p1.n.b(min2, a13, nVar.f21430b, nVar.f21429a, V, V2, nVar.f21437i, f21);
                p1.c b11 = p1.n.b(min2, a14, nVar.f21430b, nVar.f21431c, V2, V, nVar.f21437i, f21);
                float a15 = b11.a();
                float b12 = b11.b();
                float[] fArr = b11.f21410a;
                p1.c a16 = u6.h.a(a15, b12, fArr[4], fArr[5], fArr[i23], fArr[3], fArr[i26], fArr[i24]);
                float y11 = ci.c.y(nVar.f21437i);
                float z10 = ci.c.z(nVar.f21437i);
                float a17 = b10.a();
                float b13 = b10.b();
                float[] fArr2 = a16.f21410a;
                float f23 = fArr2[i26];
                float f24 = fArr2[i24];
                long b14 = p1.p.b(a17 - y11, b13 - z10);
                float f25 = f23 - y11;
                float f26 = f24 - z10;
                long b15 = p1.p.b(f25, f26);
                arrayList = arrayList6;
                long a18 = s.g.a(-ci.c.z(b14), ci.c.y(b14));
                long a19 = s.g.a(-ci.c.z(b15), ci.c.y(b15));
                int i27 = (ci.c.z(a18) * f26) + (ci.c.y(a18) * f25) >= f18 ? i24 : i26;
                float o3 = ci.c.o(b14, b15);
                if (o3 > 0.999f) {
                    a10 = u6.h.a(a17, b13, p1.p.c(a17, f23, 0.33333334f), p1.p.c(b13, f24, 0.33333334f), p1.p.c(a17, f23, 0.6666667f), p1.p.c(b13, f24, 0.6666667f), f23, f24);
                } else {
                    float sqrt2 = (((((float) Math.sqrt(i23 * r11)) - ((float) Math.sqrt(r8 - (o3 * o3)))) * ((((float) Math.sqrt((r14 * r14) + (r13 * r13))) * 4.0f) / 3.0f)) / (i24 - o3)) * (i27 != 0 ? 1.0f : -1.0f);
                    a10 = u6.h.a(a17, b13, (ci.c.y(a18) * sqrt2) + a17, (ci.c.z(a18) * sqrt2) + b13, f23 - (ci.c.y(a19) * sqrt2), f24 - (ci.c.z(a19) * sqrt2), f23, f24);
                }
                p1.c[] cVarArr = new p1.c[3];
                cVarArr[i26] = b10;
                cVarArr[1] = a10;
                cVarArr[2] = a16;
                c2 = kotlin.collections.u.f(cVarArr);
            }
            arrayList5.add(c2);
            i21 = i5 + 1;
            f11 = f18;
            arrayList2 = arrayList5;
            length = i25;
            i12 = i26;
            arrayList4 = arrayList;
            i10 = 2;
            i11 = 1;
        }
        ArrayList arrayList7 = arrayList2;
        int i28 = i12;
        float f27 = f11;
        ArrayList arrayList8 = new ArrayList();
        int i29 = i28;
        while (i29 < length) {
            int i30 = i29 + 1;
            int i31 = i30 % length;
            int i32 = i29 * 2;
            long a20 = s.g.a(vertices[i32], vertices[i32 + 1]);
            int i33 = (((i29 + length) - 1) % length) * 2;
            long a21 = s.g.a(vertices[i33], vertices[i33 + 1]);
            int i34 = i31 * 2;
            long a22 = s.g.a(vertices[i34], vertices[i34 + 1]);
            long K = ci.c.K(a20, a21);
            long K2 = ci.c.K(a22, a20);
            arrayList8.add(new p1.e((List) arrayList7.get(i29), a20, ((p1.n) arrayList3.get(i29)).f21437i, (ci.c.z(K2) * ci.c.y(K)) - (ci.c.y(K2) * ci.c.z(K)) > f27 ? 1 : i28));
            float a23 = ((p1.c) CollectionsKt.K((List) arrayList7.get(i29))).a();
            float b16 = ((p1.c) CollectionsKt.K((List) arrayList7.get(i29))).b();
            float f28 = ((p1.c) CollectionsKt.F((List) arrayList7.get(i31))).f21410a[i28];
            float f29 = ((p1.c) CollectionsKt.F((List) arrayList7.get(i31))).f21410a[1];
            arrayList8.add(new p1.f(kotlin.collections.t.c(u6.h.a(a23, b16, p1.p.c(a23, f28, 0.33333334f), p1.p.c(b16, f29, 0.33333334f), p1.p.c(a23, f28, 0.6666667f), p1.p.c(b16, f29, 0.6666667f), f28, f29))));
            i29 = i30;
        }
        if (f6 == Float.MIN_VALUE || f10 == Float.MIN_VALUE) {
            float f30 = f27;
            float f31 = f30;
            int i35 = i28;
            while (i35 < vertices.length) {
                int i36 = i35 + 1;
                f31 += vertices[i35];
                i35 += 2;
                f30 += vertices[i36];
            }
            float f32 = 2;
            a7 = s.g.a((f31 / vertices.length) / f32, (f30 / vertices.length) / f32);
        } else {
            a7 = s.g.a(f6, f10);
        }
        return new p1.o(arrayList8, Float.intBitsToFloat((int) (a7 >> 32)), Float.intBitsToFloat((int) (a7 & 4294967295L)));
    }

    public static final void c(Logger logger, jh.a aVar, jh.c cVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f18545b);
        sb2.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        androidx.appcompat.widget.c1.u(new Object[]{str}, 1, "%-22s", "format(...)", sb2);
        sb2.append(": ");
        sb2.append(aVar.f18538a);
        logger.fine(sb2.toString());
    }

    public static final Object d(g8.b bVar, mf.i frame) {
        try {
            if (bVar.isDone()) {
                return u.g.h(bVar);
            }
            eg.l lVar = new eg.l(1, lf.d.b(frame));
            bVar.a(new f3.l(bVar, lVar, 1), u.l.f24005a);
            lVar.u(new androidx.fragment.app.r(9, bVar));
            Object r5 = lVar.r();
            if (r5 == lf.a.f20034a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return r5;
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause == null) {
                Intrinsics.throwNpe();
            }
            throw cause;
        }
    }

    public static int g(Object... objArr) {
        int i5 = 0;
        for (Object obj : objArr) {
            if (obj != null) {
                int hashCode = obj.hashCode();
                if (obj instanceof Integer) {
                    hashCode = ((Integer) obj).intValue();
                }
                i5 ^= ((hashCode - 1640531527) + (i5 << 6)) + (i5 >> 2);
            }
        }
        return i5;
    }

    public static h9.c h(h9.c cVar, List migrations, jg.d scope, a2.l produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        c1.m0 storage = new c1.m0(new a2.q(14, produceFile));
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        c1.c cVar2 = cVar;
        if (cVar == null) {
            cVar2 = new y8.d();
        }
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new h9.c(new h9.c(new c1.i0(storage, kotlin.collections.t.c(new androidx.lifecycle.c(migrations, (Continuation) null, 5)), cVar2, scope)));
    }

    public static io.sentry.c i(io.sentry.c cVar, Boolean bool, Double d10, Double d11) {
        if (cVar == null) {
            cVar = new io.sentry.c(io.sentry.n2.f16660a);
        }
        if (cVar.f16221d == null) {
            Double d12 = cVar.f16220c;
            if (d12 != null) {
                d10 = d12;
            }
            Double f6 = ci.c.f(bool, d11, d10);
            if (cVar.f16223f) {
                cVar.f16221d = f6;
            }
        }
        if (cVar.f16223f && cVar.f16224g) {
            cVar.f16223f = false;
        }
        return cVar;
    }

    public static View j(int i5, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View findViewById = viewGroup.getChildAt(i10).findViewById(i5);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final y1.r k(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        y1.r rVar = (y1.r) bg.q.d(bg.q.g(bg.n.b(new ub.b(14), view), new ub.b(15)));
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static final String l(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static Object m(Class clazz, gi.a aVar, int i5) {
        if ((i5 & 2) != 0) {
            aVar = null;
        }
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(clazz, "<this>");
        ag.c clazz2 = Reflection.getOrCreateKotlinClass(clazz);
        com.google.firebase.messaging.x xVar = zh.a.f25988b;
        if (xVar == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        Intrinsics.checkNotNullParameter(clazz2, "clazz");
        return ((hi.a) xVar.f6184c).f10829b.a(clazz2, aVar);
    }

    public static Bundle n(int i5, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Bundle bundle = new Bundle();
        bundle.putInt("errorCode", i5);
        String string = resources.getString(R.string.attention);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        bundle.putString("Title", string);
        if (i5 == -1 || (200 <= i5 && i5 < 300)) {
            bundle.putString("Text", "OK");
            return bundle;
        }
        if (i5 == 69) {
            bundle.putString("Title", "Client Error");
            bundle.putString("Text", resources.getString(R.string.Lack_of_internet_connection));
            return bundle;
        }
        if (i5 == 401 || i5 == 403) {
            bundle.putString("Title", "Access error");
            bundle.putString("Text", "Invalid access token");
            return bundle;
        }
        if (400 <= i5 && i5 < 500) {
            bundle.putString("Title", "Error " + i5);
            bundle.putString("Text", resources.getString(R.string.An_error_occurred_while_executing_a_server_request));
            return bundle;
        }
        if (500 > i5 || i5 >= 600) {
            bundle.putString("Text", resources.getString(R.string.error_7));
            return bundle;
        }
        bundle.putString("Title", "Warning server error " + i5);
        bundle.putString("Text", resources.getString(R.string.error_500));
        return bundle;
    }

    public static final Drawable o(Context context, int i5) {
        Drawable n9 = h8.b.n(context, i5);
        if (n9 != null) {
            return n9;
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.i(i5, "Invalid resource ID: ").toString());
    }

    public static w7.m q(Intent intent) {
        w5.b bVar;
        GoogleSignInAccount googleSignInAccount;
        androidx.transition.n0 n0Var = x5.g.f25407a;
        Status status = Status.f4463g;
        if (intent == null) {
            bVar = new w5.b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bVar = new w5.b(null, status);
            } else {
                bVar = new w5.b(googleSignInAccount2, Status.f4461e);
            }
        }
        Status status3 = bVar.f24977a;
        return (!status3.c() || (googleSignInAccount = bVar.f24978b) == null) ? d5.p(g6.v.l(status3)) : d5.q(googleSignInAccount);
    }

    public static boolean u(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return h4.k(context);
        }
        return true;
    }

    public static final int v(int i5, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char charAt = str.charAt(i5);
        return (charAt << 7) + str.charAt(i5 + 1);
    }

    public static void y(Status status, Object obj, w7.g gVar) {
        if (status.c()) {
            gVar.b(obj);
        } else {
            gVar.a(g6.v.l(status));
        }
    }

    public d6.c e(Context context, Looper looper, androidx.appcompat.widget.a0 a0Var, Object obj, d6.h hVar, d6.i iVar) {
        return f(context, looper, a0Var, obj, (e6.p) hVar, (e6.p) iVar);
    }

    public d6.c f(Context context, Looper looper, androidx.appcompat.widget.a0 a0Var, Object obj, e6.p pVar, e6.p pVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract int p();

    public abstract void r();

    public abstract boolean s();

    public abstract boolean t();

    public abstract void x(boolean z5);

    public abstract void z();

    public void w(boolean z5) {
    }
}
