package e5;

import Q5.l;
import com.twilio.voice.EventKeys;
import ei.C;
import ei.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class d {
    public static final Pair a(String key, String units, double d10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(units, "units");
        C c10 = new C();
        String lowerCase = units.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        c10.b("units", j.c(lowerCase));
        c10.b(EventKeys.VALUE_KEY, j.b(Double.valueOf(P5.a.a(d10))));
        return TuplesKt.to(key, c10.a());
    }

    public static final Pair b(String type, List metrics) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        C c10 = new C();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = metrics.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (!StringsKt.isBlank(lVar.a()) && !StringsKt.isBlank(lVar.b())) {
                linkedHashMap.put(lVar.a(), lVar);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            l lVar2 = (l) entry.getValue();
            C c11 = new C();
            String lowerCase = lVar2.b().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            c11.b("units", j.c(lowerCase));
            c11.b(EventKeys.VALUE_KEY, j.b(Double.valueOf(P5.a.a(lVar2.c()))));
            Unit unit = Unit.INSTANCE;
            c10.b(str, c11.a());
        }
        return TuplesKt.to(type, c10.a());
    }
}
