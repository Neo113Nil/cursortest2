package g6;

import T7.J;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class M {

    /* renamed from: c, reason: collision with root package name */
    public static final a f46977c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f46978d = M.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    public final String f46979a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f46980b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        public final Date b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j10 = bundle.getLong(str, Long.MIN_VALUE);
            if (j10 == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j10);
        }

        public final Date c(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        public final Date d(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        public final EnumC4347g e(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource") ? (EnumC4347g) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource") : bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? EnumC4347g.FACEBOOK_APPLICATION_WEB : EnumC4347g.WEB_VIEW;
        }

        public final String f(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        public final boolean g(Bundle bundle) {
            String string;
            return (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) ? false : true;
        }

        public a() {
        }
    }

    public M(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        str = (str == null || str.length() == 0) ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        this.f46979a = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)");
        this.f46980b = sharedPreferences;
    }

    public final void a() {
        this.f46980b.edit().clear().apply();
    }

    public final void b(String str, Bundle bundle) {
        String str2;
        String string;
        String string2 = this.f46980b.getString(str, "{}");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString("valueType");
        if (string3 != null) {
            int i10 = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals("stringList")) {
                        JSONArray jSONArray = jSONObject.getJSONArray(EventKeys.VALUE_KEY);
                        int length = jSONArray.length();
                        ArrayList<String> arrayList = new ArrayList<>(length);
                        if (length > 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                Object obj = jSONArray.get(i10);
                                if (obj == JSONObject.NULL) {
                                    str2 = null;
                                } else {
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    str2 = (String) obj;
                                }
                                arrayList.add(i10, str2);
                                if (i11 < length) {
                                    i10 = i11;
                                }
                            }
                        }
                        bundle.putStringArrayList(str, arrayList);
                        return;
                    }
                    return;
                case -1383386164:
                    if (string3.equals("bool[]")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray(EventKeys.VALUE_KEY);
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        int i12 = length2 - 1;
                        if (i12 >= 0) {
                            while (true) {
                                int i13 = i10 + 1;
                                zArr[i10] = jSONArray2.getBoolean(i10);
                                if (i13 <= i12) {
                                    i10 = i13;
                                }
                            }
                        }
                        bundle.putBooleanArray(str, zArr);
                        return;
                    }
                    return;
                case -1374008726:
                    if (string3.equals("byte[]")) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray(EventKeys.VALUE_KEY);
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        int i14 = length3 - 1;
                        if (i14 >= 0) {
                            while (true) {
                                int i15 = i10 + 1;
                                bArr[i10] = (byte) jSONArray3.getInt(i10);
                                if (i15 <= i14) {
                                    i10 = i15;
                                }
                            }
                        }
                        bundle.putByteArray(str, bArr);
                        return;
                    }
                    return;
                case -1361632968:
                    if (string3.equals("char[]")) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray(EventKeys.VALUE_KEY);
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        int i16 = length4 - 1;
                        if (i16 >= 0) {
                            int i17 = 0;
                            while (true) {
                                int i18 = i17 + 1;
                                String string4 = jSONArray4.getString(i17);
                                if (string4 != null && string4.length() == 1) {
                                    cArr[i17] = string4.charAt(0);
                                }
                                if (i18 <= i16) {
                                    i17 = i18;
                                }
                            }
                        }
                        bundle.putCharArray(str, cArr);
                        return;
                    }
                    return;
                case -1325958191:
                    if (string3.equals("double")) {
                        bundle.putDouble(str, jSONObject.getDouble(EventKeys.VALUE_KEY));
                        return;
                    }
                    return;
                case -1097129250:
                    if (string3.equals("long[]")) {
                        JSONArray jSONArray5 = jSONObject.getJSONArray(EventKeys.VALUE_KEY);
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        int i19 = length5 - 1;
                        if (i19 >= 0) {
                            while (true) {
                                int i20 = i10 + 1;
                                jArr[i10] = jSONArray5.getLong(i10);
                                if (i20 <= i19) {
                                    i10 = i20;
                                }
                            }
                        }
                        bundle.putLongArray(str, jArr);
                        return;
                    }
                    return;
                case -891985903:
                    if (string3.equals("string")) {
                        bundle.putString(str, jSONObject.getString(EventKeys.VALUE_KEY));
                        return;
                    }
                    return;
                case -766441794:
                    if (string3.equals("float[]")) {
                        JSONArray jSONArray6 = jSONObject.getJSONArray(EventKeys.VALUE_KEY);
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        int i21 = length6 - 1;
                        if (i21 >= 0) {
                            while (true) {
                                int i22 = i10 + 1;
                                fArr[i10] = (float) jSONArray6.getDouble(i10);
                                if (i22 <= i21) {
                                    i10 = i22;
                                }
                            }
                        }
                        bundle.putFloatArray(str, fArr);
                        return;
                    }
                    return;
                case 104431:
                    if (string3.equals("int")) {
                        bundle.putInt(str, jSONObject.getInt(EventKeys.VALUE_KEY));
                        return;
                    }
                    return;
                case 3029738:
                    if (string3.equals("bool")) {
                        bundle.putBoolean(str, jSONObject.getBoolean(EventKeys.VALUE_KEY));
                        return;
                    }
                    return;
                case 3039496:
                    if (string3.equals("byte")) {
                        bundle.putByte(str, (byte) jSONObject.getInt(EventKeys.VALUE_KEY));
                        return;
                    }
                    return;
                case 3052374:
                    if (string3.equals("char") && (string = jSONObject.getString(EventKeys.VALUE_KEY)) != null && string.length() == 1) {
                        bundle.putChar(str, string.charAt(0));
                        return;
                    }
                    return;
                case 3118337:
                    if (string3.equals("enum")) {
                        try {
                            bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString(EventKeys.VALUE_KEY)));
                            return;
                        } catch (ClassNotFoundException | IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                case 3327612:
                    if (string3.equals("long")) {
                        bundle.putLong(str, jSONObject.getLong(EventKeys.VALUE_KEY));
                        return;
                    }
                    return;
                case 97526364:
                    if (string3.equals("float")) {
                        bundle.putFloat(str, (float) jSONObject.getDouble(EventKeys.VALUE_KEY));
                        return;
                    }
                    return;
                case 100361105:
                    if (string3.equals("int[]")) {
                        JSONArray jSONArray7 = jSONObject.getJSONArray(EventKeys.VALUE_KEY);
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        int i23 = length7 - 1;
                        if (i23 >= 0) {
                            while (true) {
                                int i24 = i10 + 1;
                                iArr[i10] = jSONArray7.getInt(i10);
                                if (i24 <= i23) {
                                    i10 = i24;
                                }
                            }
                        }
                        bundle.putIntArray(str, iArr);
                        return;
                    }
                    return;
                case 109413500:
                    if (string3.equals("short")) {
                        bundle.putShort(str, (short) jSONObject.getInt(EventKeys.VALUE_KEY));
                        return;
                    }
                    return;
                case 1359468275:
                    if (string3.equals("double[]")) {
                        JSONArray jSONArray8 = jSONObject.getJSONArray(EventKeys.VALUE_KEY);
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        int i25 = length8 - 1;
                        if (i25 >= 0) {
                            while (true) {
                                int i26 = i10 + 1;
                                dArr[i10] = jSONArray8.getDouble(i10);
                                if (i26 <= i25) {
                                    i10 = i26;
                                }
                            }
                        }
                        bundle.putDoubleArray(str, dArr);
                        return;
                    }
                    return;
                case 2067161310:
                    if (string3.equals("short[]")) {
                        JSONArray jSONArray9 = jSONObject.getJSONArray(EventKeys.VALUE_KEY);
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        int i27 = length9 - 1;
                        if (i27 >= 0) {
                            while (true) {
                                int i28 = i10 + 1;
                                sArr[i10] = (short) jSONArray9.getInt(i10);
                                if (i28 <= i27) {
                                    i10 = i28;
                                }
                            }
                        }
                        bundle.putShortArray(str, sArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        for (String key : this.f46980b.getAll().keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                b(key, bundle);
            } catch (JSONException e10) {
                J.a aVar = T7.J.f10993e;
                N n10 = N.CACHE;
                String TAG = f46978d;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar.a(n10, 5, TAG, "Error reading cached value for key: '" + ((Object) key) + "' -- " + e10);
                return null;
            }
        }
        return bundle;
    }

    public /* synthetic */ M(Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : str);
    }
}
