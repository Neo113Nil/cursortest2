package com.vk.superapp.multiaccount.api;

import com.huawei.hms.hihealth.data.DeviceInfo;
import org.json.JSONObject;
import xsna.axx;
import xsna.bxx;
import xsna.cq;
import xsna.epx;

/* compiled from: MultiAccountSwitcherInfo.kt */
/* loaded from: classes6.dex */
public interface j extends bxx {

    /* compiled from: MultiAccountSwitcherInfo.kt */
    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static j a(JSONObject jSONObject) {
            String optString = jSONObject.optString("type");
            if (optString != null) {
                switch (optString.hashCode()) {
                    case 78518:
                        if (optString.equals("Now")) {
                            return d.b;
                        }
                        break;
                    case 2122702:
                        if (optString.equals("Date")) {
                            return new b(new SimpleDate(jSONObject.getJSONObject("date")));
                        }
                        break;
                    case 75160172:
                        if (optString.equals("Never")) {
                            return c.b;
                        }
                        break;
                    case 1379812394:
                        if (optString.equals(DeviceInfo.STR_TYPE_UNKNOWN)) {
                            return e.b;
                        }
                        break;
                }
            }
            throw new IllegalArgumentException(cq.c("Cannot deserialize RestoreAvailableTime from json ", jSONObject));
        }
    }

    /* compiled from: MultiAccountSwitcherInfo.kt */
    public static final class b implements j {
        public final SimpleDate b;

        public b(SimpleDate simpleDate) {
            this.b = simpleDate;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            return new axx("Date").put("date", this.b.e5());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Date(date=" + this.b + ')';
        }
    }

    /* compiled from: MultiAccountSwitcherInfo.kt */
    public static final class c implements j {
        public static final c b = new c();

        @Override // xsna.bxx
        public final JSONObject e5() {
            return new axx("Never");
        }
    }

    /* compiled from: MultiAccountSwitcherInfo.kt */
    public static final class d implements j {
        public static final d b = new d();

        @Override // xsna.bxx
        public final JSONObject e5() {
            return new axx("Now");
        }
    }

    /* compiled from: MultiAccountSwitcherInfo.kt */
    public static final class e implements j {
        public static final e b = new e();

        @Override // xsna.bxx
        public final JSONObject e5() {
            return new axx(DeviceInfo.STR_TYPE_UNKNOWN);
        }
    }
}
