package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class tjj implements ujj {
    public static final pjj a;
    public static final qjj b;
    public static final /* synthetic */ tjj[] c;

    static {
        pjj pjjVar = new pjj();
        a = pjjVar;
        qjj qjjVar = new qjj();
        b = qjjVar;
        c = new tjj[]{pjjVar, qjjVar, new tjj() { // from class: rjj
            @Override // defpackage.ujj
            public final Number a(JsonReader jsonReader) {
                String nextString = jsonReader.nextString();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(nextString));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(nextString);
                        if (!valueOf.isInfinite()) {
                            if (valueOf.isNaN()) {
                            }
                            return valueOf;
                        }
                        if (!jsonReader.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPreviousPath());
                        }
                        return valueOf;
                    }
                } catch (NumberFormatException e) {
                    StringBuilder q = wt3.q("Cannot parse ", nextString, "; at path ");
                    q.append(jsonReader.getPreviousPath());
                    throw new nga(q.toString(), e);
                }
            }
        }, new tjj() { // from class: sjj
            @Override // defpackage.ujj
            public final Number a(JsonReader jsonReader) {
                String nextString = jsonReader.nextString();
                try {
                    return new BigDecimal(nextString);
                } catch (NumberFormatException e) {
                    StringBuilder q = wt3.q("Cannot parse ", nextString, "; at path ");
                    q.append(jsonReader.getPreviousPath());
                    throw new nga(q.toString(), e);
                }
            }
        }};
    }

    public static tjj valueOf(String str) {
        return (tjj) Enum.valueOf(tjj.class, str);
    }

    public static tjj[] values() {
        return (tjj[]) c.clone();
    }
}
