package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Jd {
    private final Map<String, C2743xc> a;

    static final class a extends Lambda implements Function1<String, Pair<? extends String, ? extends C2743xc>> {
        final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(1);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, C2743xc> invoke(String networkName) {
            Intrinsics.checkNotNullExpressionValue(networkName, "networkName");
            JSONObject jSONObject = this.a.getJSONObject(networkName);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return TuplesKt.to(networkName, new C2743xc(networkName, jSONObject));
        }
    }

    public Jd(JSONObject providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Iterator<String> keys = providerSettings.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "providerSettings\n          .keys()");
        Map<String, C2743xc> map = MapsKt.toMap(SequencesKt.map(SequencesKt.asSequence(keys), new a(providerSettings)));
        this.a = map;
        for (Map.Entry<String, C2743xc> entry : map.entrySet()) {
            entry.getKey();
            C2743xc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final boolean b(C2743xc c2743xc) {
        return c2743xc.o() && c2743xc.l().length() > 0;
    }

    public final Map<String, C2743xc> a() {
        return this.a;
    }

    private final C2743xc a(C2743xc c2743xc) {
        return this.a.get(c2743xc.h());
    }
}
