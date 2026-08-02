package defpackage;

import android.content.Context;
import android.net.Uri;
import com.blaze.blazesdk.ads.ima.models.BlazeIMAAdRequestData;
import com.blaze.blazesdk.ads.models.ui.BlazeAdProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class odm {
    public static String b(String str, Map map, boolean z) {
        str.getClass();
        map.getClass();
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (Intrinsics.c(str2, "cust_params")) {
                String queryParameter = parse.getQueryParameter(str2);
                if (queryParameter != null) {
                    str3 = queryParameter + '&' + str3;
                }
                buildUpon.getClass();
                qha.k(buildUpon, str2, str3, true);
            } else {
                buildUpon.getClass();
                qha.k(buildUpon, str2, str3, z);
            }
        }
        String uri = buildUpon.build().toString();
        uri.getClass();
        return uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable a(BlazeIMAAdRequestData blazeIMAAdRequestData, Map map, boolean z, Context context, sq3 sq3Var) {
        dbm dbmVar;
        int i;
        String adTag;
        odm odmVar;
        String str;
        if (sq3Var instanceof dbm) {
            dbmVar = (dbm) sq3Var;
            int i2 = dbmVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dbmVar.w = i2 - Integer.MIN_VALUE;
                dbm dbmVar2 = dbmVar;
                Object obj = dbmVar2.u;
                lu3 lu3Var = lu3.a;
                i = dbmVar2.w;
                if (i != 0) {
                    y6a.M(obj);
                    if (blazeIMAAdRequestData == null || (adTag = blazeIMAAdRequestData.getAdTag()) == null) {
                        Uri uri = Uri.EMPTY;
                        uri.getClass();
                        return uri;
                    }
                    tnf tnfVar = tnf.h;
                    Map<String, String> context2 = blazeIMAAdRequestData.getContext();
                    BlazeAdProvider adProvider = blazeIMAAdRequestData.getAdProvider();
                    dbmVar2.r = this;
                    dbmVar2.s = map;
                    dbmVar2.t = adTag;
                    dbmVar2.w = 1;
                    Object b = tnfVar.b(context2, z, adProvider, context, dbmVar2);
                    if (b == lu3Var) {
                        return lu3Var;
                    }
                    odmVar = this;
                    str = adTag;
                    obj = b;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = dbmVar2.t;
                    map = dbmVar2.s;
                    odmVar = dbmVar2.r;
                    y6a.M(obj);
                }
                odmVar.getClass();
                String b2 = b(str, (Map) obj, false);
                if (map != null) {
                    b2 = b(b2, map, true);
                }
                return Uri.parse(b2);
            }
        }
        dbmVar = new dbm(this, sq3Var);
        dbm dbmVar22 = dbmVar;
        Object obj2 = dbmVar22.u;
        lu3 lu3Var2 = lu3.a;
        i = dbmVar22.w;
        if (i != 0) {
        }
        odmVar.getClass();
        String b22 = b(str, (Map) obj2, false);
        if (map != null) {
        }
        return Uri.parse(b22);
    }
}
