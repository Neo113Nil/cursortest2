package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f17292a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f Q();

    public abstract void U(DataOutput dataOutput);

    public abstract String getId();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.P("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.P("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.P("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.P("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.P("AST", "America/Anchorage"), j$.com.android.tools.r8.a.P("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.P("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.P("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.P("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.P("CST", "America/Chicago"), j$.com.android.tools.r8.a.P("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.P("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.P("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.P("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.P("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.P("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.P("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.P("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.P("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.P("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.P("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.P("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.P("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.P("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.P("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.P("EST", "-05:00"), j$.com.android.tools.r8.a.P("MST", "-07:00"), j$.com.android.tools.r8.a.P("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i5 = 0; i5 < 28; i5++) {
            Map.Entry entry = entryArr[i5];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        f17292a = Collections.unmodifiableMap(hashMap);
    }

    public static ZoneId systemDefault() {
        String id2 = TimeZone.getDefault().getID();
        Map map = f17292a;
        Objects.requireNonNull(id2, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        Object obj = (String) map.get(id2);
        if (obj == null) {
            obj = Objects.requireNonNull(id2, "defaultObj");
        }
        return R((String) obj, true);
    }

    public static ZoneId S(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.f17297b != 0) {
            str = str.concat(zoneOffset.f17298c);
        }
        return new w(str, zoneOffset.Q());
    }

    public static ZoneId R(String str, boolean z5) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.V(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return T(str, 3, z5);
        }
        if (str.startsWith("UT")) {
            return T(str, 2, z5);
        }
        return w.V(str, z5);
    }

    public static ZoneId T(String str, int i5, boolean z5) {
        String substring = str.substring(0, i5);
        if (str.length() == i5) {
            return S(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i5) != '+' && str.charAt(i5) != '-') {
            return w.V(str, z5);
        }
        try {
            ZoneOffset V = ZoneOffset.V(str.substring(i5));
            if (V == ZoneOffset.UTC) {
                return S(substring, V);
            }
            return S(substring, V);
        } catch (b e7) {
            throw new b("Invalid ID for offset-based ZoneId: ".concat(str), e7);
        }
    }

    public static ZoneId P(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.z(j$.time.temporal.q.f17534e);
        if (zoneId != null) {
            return zoneId;
        }
        throw new b("Unable to obtain ZoneId from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != w.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return getId();
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }
}
