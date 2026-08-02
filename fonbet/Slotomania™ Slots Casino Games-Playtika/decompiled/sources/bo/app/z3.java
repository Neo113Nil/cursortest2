package bo.app;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class z3 implements c2 {
    private static final String f = BrazeLogger.getBrazeLogTag((Class<?>) z3.class);
    private final a4 b;
    private final String c;
    private final int d;
    private Object e;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a4.values().length];
            a = iArr;
            try {
                iArr[a4.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a4.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a4.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a4.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    z3(a4 a4Var, String str, int i) {
        this.b = a4Var;
        this.c = str;
        this.d = i;
    }

    private boolean b(Object obj) {
        if (!(obj instanceof Integer) && !(obj instanceof Double)) {
            return this.d == 2;
        }
        double doubleValue = ((Number) obj).doubleValue();
        double doubleValue2 = ((Number) this.e).doubleValue();
        int i = this.d;
        return i != 1 ? i != 2 ? i != 3 ? i == 5 && doubleValue < doubleValue2 : doubleValue > doubleValue2 : doubleValue != doubleValue2 : doubleValue == doubleValue2;
    }

    private boolean c(Object obj) {
        if (!(obj instanceof String)) {
            int i = this.d;
            return i == 2 || i == 17;
        }
        int i2 = this.d;
        if (i2 == 1) {
            return obj.equals(this.e);
        }
        if (i2 == 2) {
            return !obj.equals(this.e);
        }
        if (i2 == 10) {
            return a((String) this.e, (String) obj);
        }
        if (i2 != 17) {
            return false;
        }
        return !a((String) this.e, (String) obj);
    }

    @Override // bo.app.c2
    public boolean a(t2 t2Var) {
        Object opt;
        if (!(t2Var instanceof v2)) {
            return false;
        }
        BrazeProperties c = ((v2) t2Var).c();
        if (c != null) {
            try {
                opt = c.getJsonKey().opt(this.c);
            } catch (Exception e) {
                BrazeLogger.e(f, "Caught exception checking property filter condition.", e);
                return false;
            }
        } else {
            opt = null;
        }
        if (opt == null) {
            int i = this.d;
            return i == 12 || i == 17 || i == 2;
        }
        int i2 = this.d;
        if (i2 == 11) {
            return true;
        }
        if (i2 == 12) {
            return false;
        }
        int i3 = a.a[this.b.ordinal()];
        if (i3 == 1) {
            return c(opt);
        }
        if (i3 == 2) {
            return a(opt);
        }
        if (i3 == 3) {
            return a(opt, t2Var.b());
        }
        if (i3 != 4) {
            return false;
        }
        return b(opt);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.b.equals(a4.UNKNOWN)) {
                jSONObject.put("property_type", this.b.toString());
            }
            jSONObject.put("property_key", this.c);
            jSONObject.put("comparator", this.d);
            jSONObject.put("property_value", this.e);
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.e(f, "Caught exception creating property filter Json.", e);
            return jSONObject;
        }
    }

    protected z3(JSONObject jSONObject) {
        this((a4) JsonUtils.optEnum(jSONObject, "property_type", a4.class, a4.UNKNOWN), jSONObject.getString("property_key"), jSONObject.getInt("comparator"));
        if (jSONObject.has("property_value")) {
            if (this.b.equals(a4.STRING)) {
                this.e = jSONObject.getString("property_value");
                return;
            }
            if (this.b.equals(a4.BOOLEAN)) {
                this.e = Boolean.valueOf(jSONObject.getBoolean("property_value"));
            } else if (this.b.equals(a4.NUMBER)) {
                this.e = Double.valueOf(jSONObject.getDouble("property_value"));
            } else if (this.b.equals(a4.DATE)) {
                this.e = Long.valueOf(jSONObject.getLong("property_value"));
            }
        }
    }

    private boolean a(Object obj, long j) {
        Date date = null;
        if (obj instanceof String) {
            try {
                date = DateTimeUtils.parseDate((String) obj, BrazeDateFormat.LONG);
            } catch (Exception e) {
                BrazeLogger.e(f, "Caught exception trying to parse date in compareTimestamps", e);
            }
        }
        if (date == null) {
            return this.d == 2;
        }
        long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(date);
        long longValue = ((Number) this.e).longValue();
        int i = this.d;
        if (i == 15) {
            return timeFromEpochInSeconds < j + longValue;
        }
        if (i == 16) {
            return timeFromEpochInSeconds > j + longValue;
        }
        switch (i) {
            case 1:
                if (timeFromEpochInSeconds != longValue) {
                    break;
                }
                break;
            case 2:
                if (timeFromEpochInSeconds == longValue) {
                    break;
                }
                break;
            case 3:
                if (timeFromEpochInSeconds <= longValue) {
                    break;
                }
                break;
            case 4:
                if (timeFromEpochInSeconds < j - longValue) {
                    break;
                }
                break;
            case 5:
                if (timeFromEpochInSeconds >= longValue) {
                    break;
                }
                break;
            case 6:
                if (timeFromEpochInSeconds > j - longValue) {
                    break;
                }
                break;
        }
    }

    private boolean a(Object obj) {
        if (!(obj instanceof Boolean)) {
            return this.d == 2;
        }
        int i = this.d;
        if (i == 1) {
            return obj.equals(this.e);
        }
        if (i != 2) {
            return false;
        }
        return !obj.equals(this.e);
    }

    static boolean a(String str, String str2) {
        return Pattern.compile(str, 2).matcher(str2).find();
    }
}
