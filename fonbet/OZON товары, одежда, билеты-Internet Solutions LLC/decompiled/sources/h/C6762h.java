package h;

import android.content.Context;
import android.content.Intent;
import h.AbstractC6755a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6762h extends AbstractC6755a<String[], Map<String, Boolean>> {
    @Override // h.AbstractC6755a
    public final Intent a(Context context, String[] strArr) {
        String[] input = strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // h.AbstractC6755a
    public final AbstractC6755a.C1046a<Map<String, Boolean>> b(Context context, String[] strArr) {
        String[] input = strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new AbstractC6755a.C1046a<>((Serializable) U.c());
        }
        for (String str : input) {
            if (androidx.core.content.a.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        int h11 = U.h(input.length);
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (String str2 : input) {
            Pair pair = new Pair(str2, Boolean.TRUE);
            linkedHashMap.put(pair.e(), pair.f());
        }
        return new AbstractC6755a.C1046a<>(linkedHashMap);
    }

    @Override // h.AbstractC6755a
    public final Map<String, Boolean> c(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return U.c();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i12 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i12 == 0));
            }
            return U.s(C7714v.b1(C7705l.B(stringArrayExtra), arrayList));
        }
        return U.c();
    }
}
