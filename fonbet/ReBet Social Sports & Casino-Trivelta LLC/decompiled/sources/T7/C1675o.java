package T7;

import com.facebook.FacebookRequestError;
import com.facebook.react.modules.dialog.AlertFragment;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.EventKeys;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: T7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1675o {

    /* renamed from: g, reason: collision with root package name */
    public static final a f11150g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static C1675o f11151h;

    /* renamed from: a, reason: collision with root package name */
    public final Map f11152a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f11153b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f11154c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11155d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11156e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11157f;

    /* renamed from: T7.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1675o a(JSONArray jSONArray) {
            Map map;
            Map map2;
            Map map3;
            String str;
            String str2;
            String str3;
            String optString;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                Map map4 = null;
                Map map5 = null;
                Map map6 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                        if (StringsKt.equals(optString, "other", true)) {
                            str4 = optJSONObject.optString("recovery_message", null);
                            map4 = d(optJSONObject);
                        } else if (StringsKt.equals(optString, "transient", true)) {
                            str5 = optJSONObject.optString("recovery_message", null);
                            map5 = d(optJSONObject);
                        } else if (StringsKt.equals(optString, "login_recoverable", true)) {
                            str6 = optJSONObject.optString("recovery_message", null);
                            map6 = d(optJSONObject);
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
                map = map4;
                map2 = map5;
                map3 = map6;
                str = str4;
                str2 = str5;
                str3 = str6;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new C1675o(map, map2, map3, str, str2, str3);
        }

        public final synchronized C1675o b() {
            C1675o c1675o;
            try {
                if (C1675o.f11151h == null) {
                    C1675o.f11151h = c();
                }
                c1675o = C1675o.f11151h;
                if (c1675o == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return c1675o;
        }

        public final C1675o c() {
            return new C1675o(null, MapsKt.hashMapOf(TuplesKt.to(2, null), TuplesKt.to(4, null), TuplesKt.to(9, null), TuplesKt.to(17, null), TuplesKt.to(341, null)), MapsKt.hashMapOf(TuplesKt.to(102, null), TuplesKt.to(Integer.valueOf(EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE), null), TuplesKt.to(412, null)), null, null, null);
        }

        public final Map d(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray(AlertFragment.ARG_ITEMS);
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null && (optInt = optJSONObject.optInt(EventKeys.ERROR_CODE)) != 0) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i12 = 0;
                                while (true) {
                                    int i13 = i12 + 1;
                                    int optInt2 = optJSONArray2.optInt(i12);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i13 >= length2) {
                                        break;
                                    }
                                    i12 = i13;
                                }
                            }
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return hashMap;
        }

        public a() {
        }
    }

    /* renamed from: T7.o$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FacebookRequestError.a.valuesCustom().length];
            iArr[FacebookRequestError.a.OTHER.ordinal()] = 1;
            iArr[FacebookRequestError.a.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[FacebookRequestError.a.TRANSIENT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C1675o(Map map, Map map2, Map map3, String str, String str2, String str3) {
        this.f11152a = map;
        this.f11153b = map2;
        this.f11154c = map3;
        this.f11155d = str;
        this.f11156e = str2;
        this.f11157f = str3;
    }

    public final FacebookRequestError.a c(int i10, int i11, boolean z10) {
        Set set;
        Set set2;
        Set set3;
        if (z10) {
            return FacebookRequestError.a.TRANSIENT;
        }
        Map map = this.f11152a;
        if (map != null && map.containsKey(Integer.valueOf(i10)) && ((set3 = (Set) this.f11152a.get(Integer.valueOf(i10))) == null || set3.contains(Integer.valueOf(i11)))) {
            return FacebookRequestError.a.OTHER;
        }
        Map map2 = this.f11154c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i10)) && ((set2 = (Set) this.f11154c.get(Integer.valueOf(i10))) == null || set2.contains(Integer.valueOf(i11)))) {
            return FacebookRequestError.a.LOGIN_RECOVERABLE;
        }
        Map map3 = this.f11153b;
        return (map3 != null && map3.containsKey(Integer.valueOf(i10)) && ((set = (Set) this.f11153b.get(Integer.valueOf(i10))) == null || set.contains(Integer.valueOf(i11)))) ? FacebookRequestError.a.TRANSIENT : FacebookRequestError.a.OTHER;
    }

    public final String d(FacebookRequestError.a aVar) {
        int i10 = aVar == null ? -1 : b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i10 == 1) {
            return this.f11155d;
        }
        if (i10 == 2) {
            return this.f11157f;
        }
        if (i10 != 3) {
            return null;
        }
        return this.f11156e;
    }
}
