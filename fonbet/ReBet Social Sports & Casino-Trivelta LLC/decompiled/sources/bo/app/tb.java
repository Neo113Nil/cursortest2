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

/* loaded from: classes.dex */
public final class tb implements f9 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f26077e = BrazeLogger.getBrazeLogTag((Class<?>) tb.class);

    /* renamed from: a, reason: collision with root package name */
    public final ub f26078a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26080c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26081d;

    public tb(JSONObject jSONObject) {
        ub ubVar = (ub) JsonUtils.optEnum(jSONObject, "property_type", ub.class, ub.UNKNOWN);
        String string = jSONObject.getString("property_key");
        int i10 = jSONObject.getInt("comparator");
        this.f26078a = ubVar;
        this.f26079b = string;
        this.f26080c = i10;
        if (jSONObject.has("property_value")) {
            if (ubVar.equals(ub.STRING)) {
                this.f26081d = jSONObject.getString("property_value");
                return;
            }
            if (ubVar.equals(ub.BOOLEAN)) {
                this.f26081d = Boolean.valueOf(jSONObject.getBoolean("property_value"));
            } else if (ubVar.equals(ub.NUMBER)) {
                this.f26081d = Double.valueOf(jSONObject.getDouble("property_value"));
            } else if (ubVar.equals(ub.DATE)) {
                this.f26081d = Long.valueOf(jSONObject.getLong("property_value"));
            }
        }
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        Object opt;
        if (!(v9Var instanceof w9)) {
            return false;
        }
        BrazeProperties brazeProperties = ((ig) ((w9) v9Var)).f25580e;
        Date date = null;
        if (brazeProperties != null) {
            try {
                opt = brazeProperties.getKey().opt(this.f26079b);
            } catch (Exception e10) {
                BrazeLogger.e(f26077e, "Caught exception checking property filter condition.", e10);
                return false;
            }
        } else {
            opt = null;
        }
        if (opt == null) {
            int i10 = this.f26080c;
            return i10 == 12 || i10 == 17 || i10 == 2;
        }
        int i11 = this.f26080c;
        if (i11 == 11) {
            return true;
        }
        if (i11 == 12) {
            return false;
        }
        int ordinal = this.f26078a.ordinal();
        if (ordinal == 0) {
            return a(opt);
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (!(opt instanceof Integer) && !(opt instanceof Double)) {
                    return this.f26080c == 2;
                }
                double doubleValue = ((Number) opt).doubleValue();
                double doubleValue2 = ((Number) this.f26081d).doubleValue();
                int i12 = this.f26080c;
                return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 == 5 && doubleValue < doubleValue2 : doubleValue > doubleValue2 : doubleValue != doubleValue2 : doubleValue == doubleValue2;
            }
            if (ordinal != 3) {
                return false;
            }
            if (!(opt instanceof Boolean)) {
                return this.f26080c == 2;
            }
            int i13 = this.f26080c;
            if (i13 == 1) {
                return opt.equals(this.f26081d);
            }
            if (i13 != 2) {
                return false;
            }
            return !opt.equals(this.f26081d);
        }
        long j10 = ((gg) v9Var).f25491a;
        if (opt instanceof String) {
            try {
                date = DateTimeUtils.parseDate((String) opt, BrazeDateFormat.LONG);
            } catch (Exception e11) {
                BrazeLogger.e(f26077e, "Caught exception trying to parse date in compareTimestamps", e11);
            }
        }
        if (date != null) {
            long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(date);
            long longValue = ((Number) this.f26081d).longValue();
            int i14 = this.f26080c;
            if (i14 != 15) {
                if (i14 != 16) {
                    switch (i14) {
                        case 1:
                            if (timeFromEpochInSeconds != longValue) {
                                return false;
                            }
                            break;
                        case 2:
                            if (timeFromEpochInSeconds == longValue) {
                                return false;
                            }
                            break;
                        case 3:
                            if (timeFromEpochInSeconds <= longValue) {
                                return false;
                            }
                            break;
                        case 4:
                            if (timeFromEpochInSeconds < j10 - longValue) {
                                return false;
                            }
                            break;
                        case 5:
                            if (timeFromEpochInSeconds >= longValue) {
                                return false;
                            }
                            break;
                        case 6:
                            if (timeFromEpochInSeconds > j10 - longValue) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                } else if (timeFromEpochInSeconds <= j10 + longValue) {
                    return false;
                }
            } else if (timeFromEpochInSeconds >= j10 + longValue) {
                return false;
            }
        } else if (this.f26080c != 2) {
            return false;
        }
        return true;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f26078a.equals(ub.UNKNOWN)) {
                jSONObject.put("property_type", this.f26078a.toString());
            }
            jSONObject.put("property_key", this.f26079b);
            jSONObject.put("comparator", this.f26080c);
            jSONObject.put("property_value", this.f26081d);
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.e(f26077e, "Caught exception creating property filter Json.", e10);
            return jSONObject;
        }
    }

    public final boolean a(Object obj) {
        if (!(obj instanceof String)) {
            int i10 = this.f26080c;
            return i10 == 2 || i10 == 17;
        }
        int i11 = this.f26080c;
        if (i11 == 1) {
            return obj.equals(this.f26081d);
        }
        if (i11 == 2) {
            return !obj.equals(this.f26081d);
        }
        if (i11 == 10) {
            return Pattern.compile((String) this.f26081d, 2).matcher((String) obj).find();
        }
        if (i11 != 17) {
            return false;
        }
        return !Pattern.compile((String) this.f26081d, 2).matcher((String) obj).find();
    }
}
