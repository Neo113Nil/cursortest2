package X8;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.giphy.sdk.core.models.enums.RatingType;
import com.giphy.sdk.ui.GPHContentType;
import com.giphy.sdk.ui.GPHSettings;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public abstract class b {
    public static final GPHSettings b(ReadableMap readableMap, Context context, GPHSettings gPHSettings) {
        GPHSettings gPHSettings2;
        GPHContentType[] gPHContentTypeArr;
        ArrayList<Object> arrayList;
        if (gPHSettings == null || (gPHSettings2 = GPHSettings.b(gPHSettings, null, null, false, false, null, null, null, null, false, 0, null, false, false, false, false, null, false, 0.0f, false, false, 1048575, null)) == null) {
            gPHSettings2 = new GPHSettings(null, null, false, false, null, null, null, null, false, 0, null, false, false, false, false, null, false, 0.0f, false, false, 1048575, null);
        }
        new l(context, readableMap.getMap("theme")).a();
        gPHSettings2.r0(S8.c.Custom);
        a aVar = a.f13627h;
        if (readableMap.hasKey(aVar.b())) {
            gPHSettings2.l0(Y8.d.f14089a.a(readableMap.getString(aVar.b())));
        }
        a aVar2 = a.f13622c;
        if (readableMap.hasKey(aVar2.b())) {
            gPHSettings2.f0(Y8.d.f14089a.a(readableMap.getString(aVar2.b())));
        }
        a aVar3 = a.f13624e;
        if (readableMap.hasKey(aVar3.b())) {
            gPHSettings2.s0((float) readableMap.getDouble(aVar3.b()));
        }
        a aVar4 = a.f13626g;
        if (readableMap.hasKey(aVar4.b())) {
            RatingType a10 = Y8.c.f14088a.a(readableMap.getString(aVar4.b()));
            if (a10 == null) {
                a10 = RatingType.pg13;
            }
            gPHSettings2.k0(a10);
        }
        a aVar5 = a.f13630k;
        if (readableMap.hasKey(aVar5.b())) {
            gPHSettings2.o0(readableMap.getBoolean(aVar5.b()));
        }
        a aVar6 = a.f13631l;
        if (readableMap.hasKey(aVar6.b())) {
            gPHSettings2.p0(readableMap.getBoolean(aVar6.b()));
        }
        a aVar7 = a.f13628i;
        if (readableMap.hasKey(aVar7.b())) {
            gPHSettings2.m0(Y8.a.f14086a.a(readableMap.getString(aVar7.b())));
        }
        a aVar8 = a.f13625f;
        if (readableMap.hasKey(aVar8.b())) {
            ReadableArray array = readableMap.getArray(aVar8.b());
            if (array == null || (arrayList = array.toArrayList()) == null) {
                gPHContentTypeArr = null;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Y8.a.f14086a.a(String.valueOf(it.next())));
                }
                gPHContentTypeArr = (GPHContentType[]) arrayList2.toArray(new GPHContentType[0]);
            }
            if (gPHContentTypeArr != null) {
                gPHSettings2.j0(gPHContentTypeArr);
            }
        }
        a aVar9 = a.f13623d;
        if (readableMap.hasKey(aVar9.b())) {
            gPHSettings2.g0(readableMap.getBoolean(aVar9.b()));
        }
        a aVar10 = a.f13629j;
        if (readableMap.hasKey(aVar10.b())) {
            gPHSettings2.n0(readableMap.getBoolean(aVar10.b()));
        }
        a aVar11 = a.f13632m;
        if (readableMap.hasKey(aVar11.b())) {
            gPHSettings2.q0(readableMap.getInt(aVar11.b()));
        }
        a aVar12 = a.f13621b;
        if (readableMap.hasKey(aVar12.b())) {
            gPHSettings2.e0(Y8.d.f14089a.a(readableMap.getString(aVar12.b())));
        }
        a aVar13 = a.f13633n;
        if (readableMap.hasKey(aVar13.b())) {
            gPHSettings2.h0(readableMap.getBoolean(aVar13.b()));
        }
        return gPHSettings2;
    }
}
