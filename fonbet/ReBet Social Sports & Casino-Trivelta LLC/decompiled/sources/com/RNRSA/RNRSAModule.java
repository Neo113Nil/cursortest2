package com.RNRSA;

import android.os.AsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.twilio.voice.EventKeys;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import v3.C6633c;

/* loaded from: classes.dex */
public class RNRSAModule extends ReactContextBaseJavaModule {
    private static final String SHA256withRSA = "SHA256withRSA";
    private static final String SHA512withRSA = "SHA512withRSA";
    private final ReactApplicationContext reactContext;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28227a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28228b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28229c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Promise f28230d;

        public a(String str, String str2, String str3, Promise promise) {
            this.f28227a = str;
            this.f28228b = str2;
            this.f28229c = str3;
            this.f28230d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.w(this.f28227a);
                this.f28230d.resolve(Boolean.valueOf(c6633c.B(this.f28228b, this.f28229c, RNRSAModule.SHA512withRSA)));
            } catch (Exception e10) {
                this.f28230d.reject("Error", e10.getMessage());
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28232a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28233b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28234c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28235d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Promise f28236e;

        public b(String str, String str2, String str3, String str4, Promise promise) {
            this.f28232a = str;
            this.f28233b = str2;
            this.f28234c = str3;
            this.f28235d = str4;
            this.f28236e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.w(this.f28232a);
                this.f28236e.resolve(Boolean.valueOf(c6633c.B(this.f28233b, this.f28234c, this.f28235d)));
            } catch (Exception e10) {
                this.f28236e.reject("Error", e10.getMessage());
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28238a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28239b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28240c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Promise f28241d;

        public c(String str, String str2, String str3, Promise promise) {
            this.f28238a = str;
            this.f28239b = str2;
            this.f28240c = str3;
            this.f28241d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.w(this.f28238a);
                this.f28241d.resolve(Boolean.valueOf(c6633c.D(this.f28239b, this.f28240c, RNRSAModule.SHA512withRSA)));
            } catch (Exception e10) {
                this.f28241d.reject("Error", e10.getMessage());
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28243a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28244b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28245c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28246d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Promise f28247e;

        public d(String str, String str2, String str3, String str4, Promise promise) {
            this.f28243a = str;
            this.f28244b = str2;
            this.f28245c = str3;
            this.f28246d = str4;
            this.f28247e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.w(this.f28243a);
                this.f28247e.resolve(Boolean.valueOf(c6633c.D(this.f28244b, this.f28245c, this.f28246d)));
            } catch (Exception e10) {
                this.f28247e.reject("Error", e10.getMessage());
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f28249a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Promise f28250b;

        public e(int i10, Promise promise) {
            this.f28249a = i10;
            this.f28250b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                C6633c c6633c = new C6633c();
                c6633c.i(this.f28249a);
                writableNativeMap.putString("public", c6633c.o());
                writableNativeMap.putString(EventKeys.PRIVATE, c6633c.n());
                this.f28250b.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e10) {
                this.f28250b.reject("Error", e10.getMessage());
            } catch (Exception e11) {
                this.f28250b.reject("Error", e11.getMessage());
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28252a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28253b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28254c;

        public f(String str, String str2, Promise promise) {
            this.f28252a = str;
            this.f28253b = str2;
            this.f28254c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.w(this.f28252a);
                this.f28254c.resolve(c6633c.f(this.f28253b));
            } catch (Exception e10) {
                this.f28254c.reject("Error", e10.getMessage());
            }
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28256a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28257b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28258c;

        public g(String str, String str2, Promise promise) {
            this.f28256a = str;
            this.f28257b = str2;
            this.f28258c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.w(this.f28256a);
                this.f28258c.resolve(c6633c.h(this.f28257b));
            } catch (Exception e10) {
                this.f28258c.reject("Error", e10.getMessage());
            }
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28260a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28261b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28262c;

        public h(String str, String str2, Promise promise) {
            this.f28260a = str;
            this.f28261b = str2;
            this.f28262c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.v(this.f28260a);
                this.f28262c.resolve(c6633c.b(this.f28261b));
            } catch (Exception e10) {
                this.f28262c.reject("Error", e10.getMessage());
            }
        }
    }

    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28264a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28265b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28266c;

        public i(String str, String str2, Promise promise) {
            this.f28264a = str;
            this.f28265b = str2;
            this.f28266c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.v(this.f28264a);
                this.f28266c.resolve(c6633c.d(this.f28265b));
            } catch (Exception e10) {
                this.f28266c.reject("Error", e10.getMessage());
            }
        }
    }

    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28268a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28269b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28270c;

        public j(String str, String str2, Promise promise) {
            this.f28268a = str;
            this.f28269b = str2;
            this.f28270c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.v(this.f28268a);
                this.f28270c.resolve(c6633c.y(this.f28269b, RNRSAModule.SHA512withRSA));
            } catch (Exception e10) {
                this.f28270c.reject("Error", e10.getMessage());
            }
        }
    }

    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28272a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28273b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28274c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Promise f28275d;

        public k(String str, String str2, String str3, Promise promise) {
            this.f28272a = str;
            this.f28273b = str2;
            this.f28274c = str3;
            this.f28275d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.v(this.f28272a);
                this.f28275d.resolve(c6633c.y(this.f28273b, this.f28274c));
            } catch (Exception e10) {
                this.f28275d.reject("Error", e10.getMessage());
            }
        }
    }

    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28277a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28278b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f28279c;

        public l(String str, String str2, Promise promise) {
            this.f28277a = str;
            this.f28278b = str2;
            this.f28279c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.v(this.f28277a);
                this.f28279c.resolve(c6633c.A(this.f28278b, RNRSAModule.SHA512withRSA));
            } catch (Exception e10) {
                this.f28279c.reject("Error", e10.getMessage());
            }
        }
    }

    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28281a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28282b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28283c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Promise f28284d;

        public m(String str, String str2, String str3, Promise promise) {
            this.f28281a = str;
            this.f28282b = str2;
            this.f28283c = str3;
            this.f28284d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6633c c6633c = new C6633c();
                c6633c.v(this.f28281a);
                this.f28284d.resolve(c6633c.A(this.f28282b, this.f28283c));
            } catch (Exception e10) {
                this.f28284d.reject("Error", e10.getMessage());
            }
        }
    }

    public RNRSAModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void decrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new h(str2, str, promise));
    }

    @ReactMethod
    public void decrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new i(str2, str, promise));
    }

    @ReactMethod
    public void encrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new f(str2, str, promise));
    }

    @ReactMethod
    public void encrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new g(str2, str, promise));
    }

    @ReactMethod
    public void generate(Promise promise) {
        generateKeys(2048, promise);
    }

    @ReactMethod
    public void generateKeys(int i10, Promise promise) {
        AsyncTask.execute(new e(i10, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(SHA256withRSA, SHA256withRSA);
        hashMap.put(SHA512withRSA, SHA512withRSA);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNRSA";
    }

    @ReactMethod
    public void sign(String str, String str2, Promise promise) {
        AsyncTask.execute(new j(str2, str, promise));
    }

    @ReactMethod
    public void sign64(String str, String str2, Promise promise) {
        AsyncTask.execute(new l(str2, str, promise));
    }

    @ReactMethod
    public void sign64WithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new m(str2, str, str3, promise));
    }

    @ReactMethod
    public void signWithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new k(str2, str, str3, promise));
    }

    @ReactMethod
    public void verify(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new a(str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new c(str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64WithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new d(str3, str, str2, str4, promise));
    }

    @ReactMethod
    public void verifyWithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new b(str3, str, str2, str4, promise));
    }
}
