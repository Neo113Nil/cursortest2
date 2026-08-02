package com.RNRSA;

import android.os.AsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import v3.C6633c;

/* loaded from: classes.dex */
public class RNRSAKeychainModule extends ReactContextBaseJavaModule {
    private static final String SHA1withRSA = "SHA1withRSA";
    private static final String SHA256withRSA = "SHA256withRSA";
    private static final String SHA512withRSA = "SHA512withRSA";
    private final ReactApplicationContext reactContext;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28148a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28149b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28150c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Promise f28151d;

        public a(String str, String str2, String str3, Promise promise) {
            this.f28148a = str;
            this.f28149b = str2;
            this.f28150c = str3;
            this.f28151d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28151d.resolve(new C6633c(this.f28148a).y(this.f28149b, this.f28150c));
            } catch (Exception e10) {
                this.f28151d.reject("Error", e10.getMessage());
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28153a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28154b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28155c;

        public b(String str, String str2, Promise promise) {
            this.f28153a = str;
            this.f28154b = str2;
            this.f28155c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28155c.resolve(new C6633c(this.f28153a).A(this.f28154b, RNRSAKeychainModule.SHA512withRSA));
            } catch (Exception e10) {
                this.f28155c.reject("Error", e10.getMessage());
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28157a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28158b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28159c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Promise f28160d;

        public c(String str, String str2, String str3, Promise promise) {
            this.f28157a = str;
            this.f28158b = str2;
            this.f28159c = str3;
            this.f28160d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28160d.resolve(new C6633c(this.f28157a).A(this.f28158b, this.f28159c));
            } catch (Exception e10) {
                this.f28160d.reject("Error", e10.getMessage());
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28162a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28163b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28164c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Promise f28165d;

        public d(String str, String str2, String str3, Promise promise) {
            this.f28162a = str;
            this.f28163b = str2;
            this.f28164c = str3;
            this.f28165d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28165d.resolve(Boolean.valueOf(new C6633c(this.f28162a).B(this.f28163b, this.f28164c, RNRSAKeychainModule.SHA512withRSA)));
            } catch (Exception e10) {
                this.f28165d.reject("Error", e10.getMessage());
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28167a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28168b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28169c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28170d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Promise f28171e;

        public e(String str, String str2, String str3, String str4, Promise promise) {
            this.f28167a = str;
            this.f28168b = str2;
            this.f28169c = str3;
            this.f28170d = str4;
            this.f28171e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28171e.resolve(Boolean.valueOf(new C6633c(this.f28167a).B(this.f28168b, this.f28169c, this.f28170d)));
            } catch (Exception e10) {
                this.f28171e.reject("Error", e10.getMessage());
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28173a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28174b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28175c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Promise f28176d;

        public f(String str, String str2, String str3, Promise promise) {
            this.f28173a = str;
            this.f28174b = str2;
            this.f28175c = str3;
            this.f28176d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28176d.resolve(Boolean.valueOf(new C6633c(this.f28173a).D(this.f28174b, this.f28175c, RNRSAKeychainModule.SHA512withRSA)));
            } catch (Exception e10) {
                this.f28176d.reject("Error", e10.getMessage());
            }
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28178a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28179b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28180c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28181d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Promise f28182e;

        public g(String str, String str2, String str3, String str4, Promise promise) {
            this.f28178a = str;
            this.f28179b = str2;
            this.f28180c = str3;
            this.f28181d = str4;
            this.f28182e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28182e.resolve(Boolean.valueOf(new C6633c(this.f28178a).D(this.f28179b, this.f28180c, this.f28181d)));
            } catch (Exception e10) {
                this.f28182e.reject("Error", e10.getMessage());
            }
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28184a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Promise f28185b;

        public h(String str, Promise promise) {
            this.f28184a = str;
            this.f28185b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            new WritableNativeMap();
            try {
                String o10 = new C6633c(this.f28184a).o();
                if (o10 != null) {
                    this.f28185b.resolve(o10);
                } else {
                    this.f28185b.reject("Error", "Missing public key for that keyTag");
                }
            } catch (Exception e10) {
                this.f28185b.reject("Error", e10.getMessage());
            }
        }
    }

    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28187a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28188b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ReactApplicationContext f28189c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Promise f28190d;

        public i(String str, int i10, ReactApplicationContext reactApplicationContext, Promise promise) {
            this.f28187a = str;
            this.f28188b = i10;
            this.f28189c = reactApplicationContext;
            this.f28190d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                C6633c c6633c = new C6633c();
                c6633c.j(this.f28187a, this.f28188b, this.f28189c);
                writableNativeMap.putString("public", c6633c.o());
                this.f28190d.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e10) {
                this.f28190d.reject("Error", e10.getMessage());
            } catch (Exception e11) {
                this.f28190d.reject("Error", e11.getMessage());
            }
        }
    }

    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28192a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28193b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28194c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ReactApplicationContext f28195d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Promise f28196e;

        public j(String str, String str2, String str3, ReactApplicationContext reactApplicationContext, Promise promise) {
            this.f28192a = str;
            this.f28193b = str2;
            this.f28194c = str3;
            this.f28195d = reactApplicationContext;
            this.f28196e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                C6633c c6633c = new C6633c(this.f28192a);
                c6633c.k(this.f28193b, this.f28194c, this.f28195d);
                writableNativeMap.putString("csr", c6633c.m());
                this.f28196e.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e10) {
                this.f28196e.reject("Error", e10.getMessage());
            } catch (Exception e11) {
                this.f28196e.reject("Error", e11.getMessage());
            }
        }
    }

    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28198a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28199b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28200c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ReactApplicationContext f28201d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Promise f28202e;

        public k(String str, String str2, int i10, ReactApplicationContext reactApplicationContext, Promise promise) {
            this.f28198a = str;
            this.f28199b = str2;
            this.f28200c = i10;
            this.f28201d = reactApplicationContext;
            this.f28202e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                C6633c c6633c = new C6633c();
                c6633c.l(this.f28198a, this.f28199b, this.f28200c, this.f28201d);
                writableNativeMap.putString("csr", c6633c.m());
                this.f28202e.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e10) {
                this.f28202e.reject("Error", e10.getMessage());
            } catch (Exception e11) {
                this.f28202e.reject("Error", e11.getMessage());
            }
        }
    }

    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28204a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Promise f28205b;

        public l(String str, Promise promise) {
            this.f28204a = str;
            this.f28205b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new C6633c(this.f28204a).e();
                this.f28205b.resolve(1);
            } catch (NoSuchAlgorithmException e10) {
                this.f28205b.reject("Error", e10.getMessage());
            } catch (Exception e11) {
                this.f28205b.reject("Error", e11.getMessage());
            }
        }
    }

    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28207a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28208b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28209c;

        public m(String str, String str2, Promise promise) {
            this.f28207a = str;
            this.f28208b = str2;
            this.f28209c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28209c.resolve(new C6633c(this.f28207a).f(this.f28208b));
            } catch (Exception e10) {
                this.f28209c.reject("Error", e10.getMessage());
            }
        }
    }

    public class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28211a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28212b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28213c;

        public n(String str, String str2, Promise promise) {
            this.f28211a = str;
            this.f28212b = str2;
            this.f28213c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28213c.resolve(new C6633c(this.f28211a).h(this.f28212b));
            } catch (Exception e10) {
                this.f28213c.reject("Error", e10.getMessage());
            }
        }
    }

    public class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28215a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28216b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28217c;

        public o(String str, String str2, Promise promise) {
            this.f28215a = str;
            this.f28216b = str2;
            this.f28217c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28217c.resolve(new C6633c(this.f28215a).b(this.f28216b));
            } catch (Exception e10) {
                this.f28217c.reject("Error", e10.getMessage());
            }
        }
    }

    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28219a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28220b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28221c;

        public p(String str, String str2, Promise promise) {
            this.f28219a = str;
            this.f28220b = str2;
            this.f28221c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28221c.resolve(new C6633c(this.f28219a).d(this.f28220b));
            } catch (Exception e10) {
                this.f28221c.reject("Error", e10.getMessage());
            }
        }
    }

    public class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28223a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28224b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28225c;

        public q(String str, String str2, Promise promise) {
            this.f28223a = str;
            this.f28224b = str2;
            this.f28225c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28225c.resolve(new C6633c(this.f28223a).y(this.f28224b, RNRSAKeychainModule.SHA512withRSA));
            } catch (Exception e10) {
                this.f28225c.reject("Error", e10.getMessage());
            }
        }
    }

    public RNRSAKeychainModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void decrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new o(str2, str, promise));
    }

    @ReactMethod
    public void decrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new p(str2, str, promise));
    }

    @ReactMethod
    public void deletePrivateKey(String str, Promise promise) {
        AsyncTask.execute(new l(str, promise));
    }

    @ReactMethod
    public void encrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new m(str2, str, promise));
    }

    @ReactMethod
    public void encrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new n(str2, str, promise));
    }

    @ReactMethod
    public void generate(String str, Promise promise) {
        generateKeys(str, 2048, promise);
    }

    @ReactMethod
    public void generateCSR(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new j(str, str2, str3, this.reactContext, promise));
    }

    @ReactMethod
    public void generateCSRWithEC(String str, String str2, int i10, Promise promise) {
        AsyncTask.execute(new k(str, str2, i10, this.reactContext, promise));
    }

    @ReactMethod
    public void generateKeys(String str, int i10, Promise promise) {
        AsyncTask.execute(new i(str, i10, this.reactContext, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(SHA256withRSA, SHA256withRSA);
        hashMap.put(SHA512withRSA, SHA512withRSA);
        hashMap.put(SHA1withRSA, SHA1withRSA);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNRSAKeychain";
    }

    @ReactMethod
    public void getPublicKey(String str, Promise promise) {
        AsyncTask.execute(new h(str, promise));
    }

    @ReactMethod
    public void sign(String str, String str2, Promise promise) {
        AsyncTask.execute(new q(str2, str, promise));
    }

    @ReactMethod
    public void sign64(String str, String str2, Promise promise) {
        AsyncTask.execute(new b(str2, str, promise));
    }

    @ReactMethod
    public void sign64WithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new c(str2, str, str3, promise));
    }

    @ReactMethod
    public void signWithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new a(str2, str, str3, promise));
    }

    @ReactMethod
    public void verify(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new d(str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new f(str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64WithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new g(str3, str, str2, str4, promise));
    }

    @ReactMethod
    public void verifyWithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new e(str3, str, str2, str4, promise));
    }
}
