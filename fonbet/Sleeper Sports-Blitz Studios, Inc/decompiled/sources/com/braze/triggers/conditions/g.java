package com.braze.triggers.conditions;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class g implements c {
    public static final String e = BrazeLogger.getBrazeLogTag((Class<?>) g.class);

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.enums.a f804a;
    public final String b;
    public final int c;
    public final Object d;

    public g(JSONObject jSONObject) {
        com.braze.triggers.enums.a aVar = (com.braze.triggers.enums.a) JsonUtils.optEnum(jSONObject, "property_type", com.braze.triggers.enums.a.class, com.braze.triggers.enums.a.UNKNOWN);
        String string = jSONObject.getString("property_key");
        int i = jSONObject.getInt("comparator");
        this.f804a = aVar;
        this.b = string;
        this.c = i;
        if (jSONObject.has("property_value")) {
            if (aVar.equals(com.braze.triggers.enums.a.STRING)) {
                this.d = jSONObject.getString("property_value");
                return;
            }
            if (aVar.equals(com.braze.triggers.enums.a.BOOLEAN)) {
                this.d = Boolean.valueOf(jSONObject.getBoolean("property_value"));
            } else if (aVar.equals(com.braze.triggers.enums.a.NUMBER)) {
                this.d = Double.valueOf(jSONObject.getDouble("property_value"));
            } else if (aVar.equals(com.braze.triggers.enums.a.DATE)) {
                this.d = Long.valueOf(jSONObject.getLong("property_value"));
            }
        }
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        Object opt;
        if (!(bVar instanceof com.braze.triggers.events.c)) {
            return false;
        }
        BrazeProperties brazeProperties = ((com.braze.triggers.events.j) ((com.braze.triggers.events.c) bVar)).e;
        Date date = null;
        if (brazeProperties != null) {
            try {
                opt = brazeProperties.getKey().opt(this.b);
            } catch (Exception e2) {
                BrazeLogger.e(e, "Caught exception checking property filter condition.", e2);
                return false;
            }
        } else {
            opt = null;
        }
        if (opt == null) {
            int i = this.c;
            return i == 12 || i == 17 || i == 2;
        }
        int i2 = this.c;
        if (i2 == 11) {
            return true;
        }
        if (i2 == 12) {
            return false;
        }
        int ordinal = this.f804a.ordinal();
        if (ordinal == 0) {
            return a(opt);
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return false;
                }
                if (opt instanceof Boolean) {
                    int i3 = this.c;
                    if (i3 == 1) {
                        return opt.equals(this.d);
                    }
                    if (i3 == 2) {
                        return !opt.equals(this.d);
                    }
                } else if (this.c == 2) {
                    return true;
                }
                return false;
            }
            if (!(opt instanceof Integer) && !(opt instanceof Double)) {
                if (this.c == 2) {
                }
            }
            double doubleValue = ((Number) opt).doubleValue();
            double doubleValue2 = ((Number) this.d).doubleValue();
            int i4 = this.c;
            if (i4 == 1) {
                return doubleValue == doubleValue2;
            }
            if (i4 == 2) {
                if (doubleValue != doubleValue2) {
                }
            }
            if (i4 == 3) {
                if (doubleValue > doubleValue2) {
                }
            }
            if (i4 == 5 && doubleValue < doubleValue2) {
            }
        }
        long j = ((com.braze.triggers.events.i) bVar).f813a;
        if (opt instanceof String) {
            try {
                date = DateTimeUtils.parseDate((String) opt, BrazeDateFormat.LONG);
            } catch (Exception e3) {
                BrazeLogger.e(e, "Caught exception trying to parse date in compareTimestamps", e3);
            }
        }
        if (date != null) {
            long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(date);
            long longValue = ((Number) this.d).longValue();
            int i5 = this.c;
            if (i5 != 15) {
                if (i5 != 16) {
                    switch (i5) {
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
                            if (timeFromEpochInSeconds < j - longValue) {
                                return false;
                            }
                            break;
                        case 5:
                            if (timeFromEpochInSeconds >= longValue) {
                                return false;
                            }
                            break;
                        case 6:
                            if (timeFromEpochInSeconds > j - longValue) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                } else if (timeFromEpochInSeconds <= j + longValue) {
                    return false;
                }
            } else if (timeFromEpochInSeconds >= j + longValue) {
                return false;
            }
        } else if (this.c != 2) {
            return false;
        }
        return true;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f804a.equals(com.braze.triggers.enums.a.UNKNOWN)) {
                jSONObject.put("property_type", this.f804a.toString());
            }
            jSONObject.put("property_key", this.b);
            jSONObject.put("comparator", this.c);
            jSONObject.put("property_value", this.d);
            return jSONObject;
        } catch (JSONException e2) {
            BrazeLogger.e(e, "Caught exception creating property filter Json.", e2);
            return jSONObject;
        }
    }

    public final boolean a(Object obj) {
        if (!(obj instanceof String)) {
            int i = this.c;
            return i == 2 || i == 17;
        }
        int i2 = this.c;
        if (i2 == 1) {
            return obj.equals(this.d);
        }
        if (i2 == 2) {
            return !obj.equals(this.d);
        }
        if (i2 == 10) {
            return Pattern.compile((String) this.d, 2).matcher((String) obj).find();
        }
        if (i2 != 17) {
            return false;
        }
        return !Pattern.compile((String) this.d, 2).matcher((String) obj).find();
    }
}
