package com.RNAppleAuthentication;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.FragmentManager;
import com.RNAppleAuthentication.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.twilio.voice.EventKeys;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import t3.InterfaceC6437d;

/* loaded from: classes.dex */
public class AppleAuthenticationAndroidModule extends ReactContextBaseJavaModule {
    private static final String E_NOT_CONFIGURED_ERROR = "E_NOT_CONFIGURED_ERROR";
    private static final String E_SIGNIN_CANCELLED_ERROR = "E_SIGNIN_CANCELLED_ERROR";
    private static final String E_SIGNIN_FAILED_ERROR = "E_SIGNIN_FAILED_ERROR";
    private com.RNAppleAuthentication.a configuration;
    private final ReactApplicationContext reactContext;

    public class a implements InterfaceC6437d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f28113a;

        public a(Promise promise) {
            this.f28113a = promise;
        }

        @Override // t3.InterfaceC6437d
        public void a(String str, String str2, String str3, String str4) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString(EventKeys.ERROR_CODE, str);
            createMap.putString("id_token", str2);
            createMap.putString("state", str3);
            String d10 = AppleAuthenticationAndroidModule.this.configuration.d();
            if (!d10.isEmpty()) {
                createMap.putString("nonce", d10);
            }
            try {
                JSONObject jSONObject = new JSONObject(str4);
                WritableMap createMap2 = Arguments.createMap();
                if (jSONObject.has("name")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("name");
                    WritableMap createMap3 = Arguments.createMap();
                    if (jSONObject2.has("firstName")) {
                        createMap3.putString("firstName", jSONObject2.getString("firstName"));
                    }
                    if (jSONObject2.has("lastName")) {
                        createMap3.putString("lastName", jSONObject2.getString("lastName"));
                    }
                    if (createMap3.hasKey("firstName") || createMap3.hasKey("lastName")) {
                        createMap2.putMap("name", createMap3);
                    }
                }
                if (jSONObject.has("email")) {
                    createMap2.putString("email", jSONObject.getString("email"));
                }
                if (createMap2.hasKey("name") || createMap2.hasKey("email")) {
                    createMap.putMap("user", createMap2);
                }
            } catch (Exception unused) {
            }
            this.f28113a.resolve(createMap);
        }

        @Override // t3.InterfaceC6437d
        public void b() {
            this.f28113a.reject(AppleAuthenticationAndroidModule.E_SIGNIN_CANCELLED_ERROR);
        }

        @Override // t3.InterfaceC6437d
        public void c(Throwable th2) {
            this.f28113a.reject(AppleAuthenticationAndroidModule.E_SIGNIN_FAILED_ERROR, th2);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SignInWithAppleService f28115a;

        public b(SignInWithAppleService signInWithAppleService) {
            this.f28115a = signInWithAppleService;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28115a.a();
        }
    }

    public AppleAuthenticationAndroidModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private static String bytesToHex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            stringBuffer.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            stringBuffer.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return stringBuffer.toString();
    }

    private FragmentManager getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof AbstractActivityC2168s)) {
            return null;
        }
        return ((AbstractActivityC2168s) currentActivity).getSupportFragmentManager();
    }

    @ReactMethod
    public void configure(ReadableMap readableMap) {
        String str;
        String string;
        String string2;
        a.c cVar = a.c.f28146c;
        a.b bVar = a.b.f28140a;
        String uuid = UUID.randomUUID().toString();
        boolean z10 = readableMap.hasKey("nonceEnabled") ? readableMap.getBoolean("nonceEnabled") : true;
        boolean z11 = readableMap.hasKey("fullScreen") ? readableMap.getBoolean("fullScreen") : true;
        String str2 = "";
        String string3 = readableMap.hasKey("clientId") ? readableMap.getString("clientId") : "";
        String string4 = readableMap.hasKey("redirectUri") ? readableMap.getString("redirectUri") : "";
        if (readableMap.hasKey("scope") && (string2 = readableMap.getString("scope")) != null) {
            cVar = a.c.valueOf(string2);
        }
        if (readableMap.hasKey("responseType") && (string = readableMap.getString("responseType")) != null) {
            a.b.valueOf(string);
        }
        if (readableMap.hasKey("state")) {
            uuid = readableMap.getString("state");
        }
        if (z10) {
            str2 = readableMap.hasKey("nonce") ? readableMap.getString("nonce") : UUID.randomUUID().toString();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str2.getBytes());
                str = bytesToHex(messageDigest.digest());
            } catch (Exception unused) {
            }
            this.configuration = new a.C0454a().b(string3).f(string4).g(a.b.f28142c).h(cVar).i(uuid).e(str2).d(str).c(z11).a();
        }
        str = str2;
        this.configuration = new a.C0454a().b(string3).f(string4).g(a.b.f28142c).h(cVar).i(uuid).e(str2).d(str).c(z11).a();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("ALL", a.b.f28142c.toString());
        hashMap.put("CODE", a.b.f28140a.toString());
        hashMap.put("ID_TOKEN", a.b.f28141b.toString());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ALL", a.c.f28146c.toString());
        hashMap2.put("EMAIL", a.c.f28145b.toString());
        hashMap2.put("NAME", a.c.f28144a.toString());
        HashMap hashMap3 = new HashMap();
        hashMap3.put(E_NOT_CONFIGURED_ERROR, E_NOT_CONFIGURED_ERROR);
        hashMap3.put(E_SIGNIN_FAILED_ERROR, E_SIGNIN_FAILED_ERROR);
        hashMap3.put(E_SIGNIN_CANCELLED_ERROR, E_SIGNIN_CANCELLED_ERROR);
        hashMap3.put("ResponseType", hashMap);
        hashMap3.put("Scope", hashMap2);
        hashMap3.put("isSupported", true);
        return hashMap3;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNAppleAuthModuleAndroid";
    }

    @ReactMethod
    public void signIn(Promise promise) {
        if (this.configuration == null) {
            promise.reject(E_NOT_CONFIGURED_ERROR);
            return;
        }
        FragmentManager fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            promise.reject(E_NOT_CONFIGURED_ERROR);
            return;
        }
        SignInWithAppleService signInWithAppleService = new SignInWithAppleService(fragmentManagerHelper, "SignInWithAppleButton-$id-SignInWebViewDialogFragment", this.configuration, new a(promise));
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(new RuntimeException("Activity is not found"));
        } else {
            currentActivity.runOnUiThread(new b(signInWithAppleService));
        }
    }
}
