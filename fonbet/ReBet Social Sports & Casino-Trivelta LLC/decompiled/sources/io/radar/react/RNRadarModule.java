package io.radar.react;

import Gh.B;
import Gh.C;
import Gh.C1164a;
import Gh.D;
import Gh.w;
import Gh.x;
import android.app.Activity;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.ViewProps;
import io.radar.sdk.C4589c;
import io.radar.sdk.I0;
import io.radar.sdk.N0;
import io.radar.sdk.O0;
import java.util.EnumSet;
import java.util.Map;
import l0.AbstractC5338c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class RNRadarModule extends ReactContextBaseJavaModule implements PermissionListener {
    private static final int PERMISSIONS_REQUEST_CODE = 20160525;
    private static final String TAG = "RNRadarModule";
    private boolean fraud;
    private int listenerCount;
    private Promise mPermissionsRequestPromise;
    private io.radar.react.b receiver;
    private io.radar.react.d verifiedReceiver;

    public class a implements C4589c.InterfaceC4592d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49554a;

        public a(Promise promise) {
            this.f49554a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4592d
        public void a(C4589c.EnumC4607s enumC4607s, Location location, Gh.f fVar) {
            if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                this.f49554a.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (location != null) {
                    createMap.putMap("location", io.radar.react.c.d(C4589c.U(location)));
                }
                if (fVar != null) {
                    createMap.putMap("context", io.radar.react.c.d(fVar.a()));
                }
                this.f49554a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise = this.f49554a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class b implements C4589c.InterfaceC4606r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49556a;

        public b(Promise promise) {
            this.f49556a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4606r
        public void a(C4589c.EnumC4607s enumC4607s, Location location, Gh.o[] oVarArr) {
            if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                this.f49556a.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (location != null) {
                    createMap.putMap("location", io.radar.react.c.d(C4589c.U(location)));
                }
                if (oVarArr != null) {
                    createMap.putArray("places", io.radar.react.c.a(Gh.o.b(oVarArr)));
                }
                this.f49556a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise = this.f49556a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class c implements C4589c.InterfaceC4605q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49558a;

        public c(Promise promise) {
            this.f49558a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4605q
        public void a(C4589c.EnumC4607s enumC4607s, Location location, Gh.j[] jVarArr) {
            if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                this.f49558a.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (location != null) {
                    createMap.putMap("location", io.radar.react.c.d(C4589c.U(location)));
                }
                if (jVarArr != null) {
                    createMap.putArray("geofences", io.radar.react.c.a(Gh.j.d(jVarArr)));
                }
                this.f49558a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise = this.f49558a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class d implements C4589c.InterfaceC4593e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49560a;

        public d(Promise promise) {
            this.f49560a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4593e
        public void a(C4589c.EnumC4607s enumC4607s, C1164a[] c1164aArr) {
            if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                this.f49560a.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (c1164aArr != null) {
                    createMap.putArray("addresses", io.radar.react.c.a(C1164a.j(c1164aArr)));
                }
                this.f49560a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise = this.f49560a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class e implements C4589c.InterfaceC4593e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49562a;

        public e(Promise promise) {
            this.f49562a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4593e
        public void a(C4589c.EnumC4607s enumC4607s, C1164a[] c1164aArr) {
            if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                this.f49562a.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (c1164aArr != null) {
                    createMap.putArray("addresses", io.radar.react.c.a(C1164a.j(c1164aArr)));
                }
                this.f49562a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise = this.f49562a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class f implements C4589c.InterfaceC4593e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49564a;

        public f(Promise promise) {
            this.f49564a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4593e
        public void a(C4589c.EnumC4607s enumC4607s, C1164a[] c1164aArr) {
            if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                this.f49564a.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (c1164aArr != null) {
                    createMap.putArray("addresses", io.radar.react.c.a(C1164a.j(c1164aArr)));
                }
                this.f49564a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise = this.f49564a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class g implements C4589c.InterfaceC4594f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49566a;

        public g(Promise promise) {
            this.f49566a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4594f
        public void a(C4589c.EnumC4607s enumC4607s, C1164a c1164a, boolean z10) {
            if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                this.f49566a.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (c1164a != null) {
                    createMap.putMap("address", io.radar.react.c.d(c1164a.k()));
                    createMap.putBoolean("proxy", z10);
                }
                this.f49566a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise = this.f49566a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class h implements C4589c.InterfaceC4611w {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49568a;

        public h(Promise promise) {
            this.f49568a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4611w
        public void a(C4589c.EnumC4607s enumC4607s, C1164a c1164a, C4589c.EnumC4591b enumC4591b) {
            if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                this.f49568a.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (c1164a != null) {
                    createMap.putMap("address", io.radar.react.c.d(c1164a.k()));
                }
                if (enumC4591b != null) {
                    createMap.putString("verificationStatus", enumC4591b.toString());
                }
                this.f49568a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise = this.f49568a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class i implements C4589c.InterfaceC4602n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49570a;

        public i(Promise promise) {
            this.f49570a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4602n
        public void a(C4589c.EnumC4607s enumC4607s, x xVar) {
            if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                this.f49570a.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (xVar != null) {
                    createMap.putMap("routes", io.radar.react.c.d(xVar.f()));
                }
                this.f49570a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise = this.f49570a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class j implements C4589c.InterfaceC4601m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49572a;

        public j(Promise promise) {
            this.f49572a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4601m
        public void a(C4589c.EnumC4607s enumC4607s, w wVar) {
            if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                this.f49572a.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (wVar != null) {
                    createMap.putArray("matrix", io.radar.react.c.a(wVar.a()));
                }
                this.f49572a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise = this.f49572a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class k implements C4589c.InterfaceC4595g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49574a;

        public k(Promise promise) {
            this.f49574a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4595g
        public void a(C4589c.EnumC4607s enumC4607s, Location location, boolean z10) {
            Promise promise = this.f49574a;
            if (promise == null) {
                return;
            }
            if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                promise.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (location != null) {
                    createMap.putMap("location", io.radar.react.c.d(C4589c.U(location)));
                }
                createMap.putBoolean("stopped", z10);
                this.f49574a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise2 = this.f49574a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise2.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class l implements C4589c.InterfaceC4598j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49576a;

        public l(Promise promise) {
            this.f49576a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4598j
        public void a(C4589c.EnumC4607s enumC4607s, Gh.h hVar) {
            try {
                if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                    this.f49576a.reject(enumC4607s.toString(), enumC4607s.toString());
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (hVar != null) {
                    createMap.putMap("event", io.radar.react.c.d(hVar.i()));
                }
                this.f49576a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise = this.f49576a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class m implements C4589c.InterfaceC4608t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49578a;

        public m(Promise promise) {
            this.f49578a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4608t
        public void a(C4589c.EnumC4607s enumC4607s, Location location, Gh.h[] hVarArr, C c10) {
            Promise promise = this.f49578a;
            if (promise == null) {
                return;
            }
            try {
                if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                    promise.reject(enumC4607s.toString(), enumC4607s.toString());
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (location != null) {
                    createMap.putMap("location", io.radar.react.c.d(C4589c.U(location)));
                }
                if (hVarArr != null) {
                    createMap.putArray("events", io.radar.react.c.a(Gh.h.h(hVarArr)));
                }
                if (c10 != null) {
                    createMap.putMap("user", io.radar.react.c.d(c10.k()));
                }
                this.f49578a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise2 = this.f49578a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise2.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class n implements C4589c.InterfaceC4609u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49580a;

        public n(Promise promise) {
            this.f49580a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4609u
        public void a(C4589c.EnumC4607s enumC4607s, D d10) {
            Promise promise = this.f49580a;
            if (promise == null) {
                return;
            }
            try {
                if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                    promise.reject(enumC4607s.toString(), enumC4607s.toString());
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (d10 != null) {
                    createMap.putMap("token", io.radar.react.c.d(d10.f()));
                }
                this.f49580a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise2 = this.f49580a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise2.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class o implements C4589c.InterfaceC4609u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49582a;

        public o(Promise promise) {
            this.f49582a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4609u
        public void a(C4589c.EnumC4607s enumC4607s, D d10) {
            Promise promise = this.f49582a;
            if (promise == null) {
                return;
            }
            try {
                if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                    promise.reject(enumC4607s.toString(), enumC4607s.toString());
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (d10 != null) {
                    createMap.putMap("token", io.radar.react.c.d(d10.f()));
                }
                this.f49582a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise2 = this.f49582a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise2.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class q implements C4589c.InterfaceC4610v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49585a;

        public q(Promise promise) {
            this.f49585a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4610v
        public void a(C4589c.EnumC4607s enumC4607s, B b10, Gh.h[] hVarArr) {
            Promise promise = this.f49585a;
            if (promise == null) {
                return;
            }
            try {
                if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                    promise.reject(enumC4607s.toString(), enumC4607s.toString());
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (b10 != null) {
                    createMap.putMap("trip", io.radar.react.c.d(b10.b()));
                }
                if (hVarArr != null) {
                    createMap.putArray("events", io.radar.react.c.a(Gh.h.h(hVarArr)));
                }
                this.f49585a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise2 = this.f49585a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise2.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class r implements C4589c.InterfaceC4610v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49587a;

        public r(Promise promise) {
            this.f49587a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4610v
        public void a(C4589c.EnumC4607s enumC4607s, B b10, Gh.h[] hVarArr) {
            Promise promise = this.f49587a;
            if (promise == null) {
                return;
            }
            try {
                if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                    promise.reject(enumC4607s.toString(), enumC4607s.toString());
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (b10 != null) {
                    createMap.putMap("trip", io.radar.react.c.d(b10.b()));
                }
                if (hVarArr != null) {
                    createMap.putArray("events", io.radar.react.c.a(Gh.h.h(hVarArr)));
                }
                this.f49587a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise2 = this.f49587a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise2.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class s implements C4589c.InterfaceC4610v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49589a;

        public s(Promise promise) {
            this.f49589a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4610v
        public void a(C4589c.EnumC4607s enumC4607s, B b10, Gh.h[] hVarArr) {
            Promise promise = this.f49589a;
            if (promise == null) {
                return;
            }
            try {
                if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                    promise.reject(enumC4607s.toString(), enumC4607s.toString());
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (b10 != null) {
                    createMap.putMap("trip", io.radar.react.c.d(b10.b()));
                }
                if (hVarArr != null) {
                    createMap.putArray("events", io.radar.react.c.a(Gh.h.h(hVarArr)));
                }
                this.f49589a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise2 = this.f49589a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise2.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public class t implements C4589c.InterfaceC4610v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49591a;

        public t(Promise promise) {
            this.f49591a = promise;
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4610v
        public void a(C4589c.EnumC4607s enumC4607s, B b10, Gh.h[] hVarArr) {
            Promise promise = this.f49591a;
            if (promise == null) {
                return;
            }
            try {
                if (enumC4607s != C4589c.EnumC4607s.SUCCESS) {
                    promise.reject(enumC4607s.toString(), enumC4607s.toString());
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", enumC4607s.toString());
                if (b10 != null) {
                    createMap.putMap("trip", io.radar.react.c.d(b10.b()));
                }
                if (hVarArr != null) {
                    createMap.putArray("events", io.radar.react.c.a(Gh.h.h(hVarArr)));
                }
                this.f49591a.resolve(createMap);
            } catch (JSONException e10) {
                Log.e(RNRadarModule.TAG, "JSONException", e10);
                Promise promise2 = this.f49591a;
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_SERVER;
                promise2.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
        }
    }

    public RNRadarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.listenerCount = 0;
        this.fraud = false;
        this.receiver = new io.radar.react.b();
        this.verifiedReceiver = new io.radar.react.d();
    }

    @ReactMethod
    public void acceptEvent(String str, String str2) {
        C4589c.a(str, str2);
    }

    @ReactMethod
    public void addListener(String str) {
        int i10 = this.listenerCount;
        if (i10 == 0) {
            if (this.fraud) {
                this.verifiedReceiver.f49596b = true;
            }
            this.receiver.f49594b = true;
        }
        this.listenerCount = i10 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    @ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void autocomplete(ReadableMap readableMap, Promise promise) {
        Location location;
        String str;
        ReadableMap map;
        if (promise == null) {
            return;
        }
        if (!readableMap.hasKey("query")) {
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
            promise.reject(enumC4607s.toString(), enumC4607s.toString());
            return;
        }
        String string = readableMap.getString("query");
        if (readableMap.hasKey("near") && (map = readableMap.getMap("near")) != null && map.hasKey("latitude") && map.hasKey("longitude")) {
            try {
                double d10 = map.getDouble("latitude");
                double d11 = map.getDouble("longitude");
                Location location2 = new Location(TAG);
                location2.setLatitude(d10);
                location2.setLongitude(d11);
                location = location2;
            } catch (Exception unused) {
                promise.reject(C4589c.EnumC4607s.ERROR_BAD_REQUEST.toString(), "Invalid near coordinates");
                return;
            }
        } else {
            location = null;
        }
        int i10 = readableMap.hasKey("limit") ? readableMap.getInt("limit") : 10;
        String str2 = "countryCode";
        if (!readableMap.hasKey("countryCode")) {
            str2 = AdRevenueScheme.COUNTRY;
            if (!readableMap.hasKey(AdRevenueScheme.COUNTRY)) {
                str = null;
                C4589c.d(string, location, readableMap.hasKey("layers") ? io.radar.react.c.e(readableMap.getArray("layers")) : null, Integer.valueOf(i10), str, Boolean.TRUE, Boolean.valueOf(!readableMap.hasKey("mailable") ? readableMap.getBoolean("mailable") : false), new d(promise));
            }
        }
        str = readableMap.getString(str2);
        C4589c.d(string, location, readableMap.hasKey("layers") ? io.radar.react.c.e(readableMap.getArray("layers")) : null, Integer.valueOf(i10), str, Boolean.TRUE, Boolean.valueOf(!readableMap.hasKey("mailable") ? readableMap.getBoolean("mailable") : false), new d(promise));
    }

    @ReactMethod
    public void cancelTrip(Promise promise) {
        C4589c.e(new s(promise));
    }

    @ReactMethod
    public void clearVerifiedLocationToken() {
        C4589c.f();
    }

    @ReactMethod
    public void completeTrip(Promise promise) {
        C4589c.g(new r(promise));
    }

    @ReactMethod
    public void geocode(ReadableMap readableMap, Promise promise) {
        if (promise == null) {
            return;
        }
        if (readableMap.hasKey("address")) {
            C4589c.k(readableMap.getString("address"), readableMap.hasKey("layers") ? io.radar.react.c.e(readableMap.getArray("layers")) : null, readableMap.hasKey("countries") ? io.radar.react.c.e(readableMap.getArray("countries")) : null, new e(promise));
        } else {
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
            promise.reject(enumC4607s.toString(), enumC4607s.toString());
        }
    }

    @ReactMethod
    public void getContext(ReadableMap readableMap, Promise promise) {
        if (promise == null) {
            return;
        }
        a aVar = new a(promise);
        if (readableMap == null) {
            C4589c.p(aVar);
            return;
        }
        double d10 = readableMap.getDouble("latitude");
        double d11 = readableMap.getDouble("longitude");
        Location location = new Location(TAG);
        location.setLatitude(d10);
        location.setLongitude(d11);
        C4589c.o(location, aVar);
    }

    @ReactMethod
    public void getDescription(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(C4589c.q());
    }

    @ReactMethod
    public void getDistance(ReadableMap readableMap, Promise promise) {
        Location location;
        if (promise == null) {
            return;
        }
        if (!readableMap.hasKey("destination")) {
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
            promise.reject(enumC4607s.toString(), enumC4607s.toString());
            return;
        }
        ReadableMap map = readableMap.getMap("origin");
        if (map != null) {
            double d10 = map.getDouble("latitude");
            double d11 = map.getDouble("longitude");
            location = new Location(TAG);
            location.setLatitude(d10);
            location.setLongitude(d11);
        } else {
            location = null;
        }
        ReadableMap map2 = readableMap.getMap("destination");
        double d12 = map2.getDouble("latitude");
        double d13 = map2.getDouble("longitude");
        Location location2 = new Location(TAG);
        location2.setLatitude(d12);
        location2.setLongitude(d13);
        String[] e10 = readableMap.hasKey("modes") ? io.radar.react.c.e(readableMap.getArray("modes")) : new String[0];
        EnumSet noneOf = EnumSet.noneOf(C4589c.EnumC4603o.class);
        for (String str : e10) {
            if (str.equals("FOOT") || str.equals("foot")) {
                noneOf.add(C4589c.EnumC4603o.FOOT);
            }
            if (str.equals("BIKE") || str.equals("bike")) {
                noneOf.add(C4589c.EnumC4603o.BIKE);
            }
            if (str.equals("CAR") || str.equals("car")) {
                noneOf.add(C4589c.EnumC4603o.CAR);
            }
        }
        String string = readableMap.hasKey("units") ? readableMap.getString("units") : null;
        C4589c.EnumC4604p enumC4604p = (string == null || !(string.equals("METRIC") || string.equals("metric"))) ? C4589c.EnumC4604p.IMPERIAL : C4589c.EnumC4604p.METRIC;
        i iVar = new i(promise);
        if (location != null) {
            C4589c.r(location, location2, noneOf, enumC4604p, iVar);
        } else {
            C4589c.s(location2, noneOf, enumC4604p, iVar);
        }
    }

    @ReactMethod
    public void getHost(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(C4589c.u());
    }

    @ReactMethod
    public void getLocation(String str, Promise promise) {
        N0.b bVar = N0.b.MEDIUM;
        String lowerCase = str != null ? str.toLowerCase() : "medium";
        if (lowerCase.equals("low")) {
            bVar = N0.b.LOW;
        } else if (!lowerCase.equals("medium")) {
            if (lowerCase.equals("high")) {
                bVar = N0.b.HIGH;
            } else {
                C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
                promise.reject(enumC4607s.toString(), enumC4607s.toString());
            }
        }
        C4589c.w(bVar, new k(promise));
    }

    @ReactMethod
    public void getMatrix(ReadableMap readableMap, Promise promise) {
        if (promise == null) {
            return;
        }
        ReadableArray array = readableMap.getArray("origins");
        Location[] locationArr = new Location[array.size()];
        for (int i10 = 0; i10 < array.size(); i10++) {
            ReadableMap map = array.getMap(i10);
            double d10 = map.getDouble("latitude");
            double d11 = map.getDouble("longitude");
            Location location = new Location(TAG);
            location.setLatitude(d10);
            location.setLongitude(d11);
            locationArr[i10] = location;
        }
        ReadableArray array2 = readableMap.getArray("destinations");
        Location[] locationArr2 = new Location[array2.size()];
        for (int i11 = 0; i11 < array2.size(); i11++) {
            ReadableMap map2 = array2.getMap(i11);
            double d12 = map2.getDouble("latitude");
            double d13 = map2.getDouble("longitude");
            Location location2 = new Location(TAG);
            location2.setLatitude(d12);
            location2.setLongitude(d13);
            locationArr2[i11] = location2;
        }
        String string = readableMap.getString("mode");
        C4589c.EnumC4603o enumC4603o = C4589c.EnumC4603o.CAR;
        if (string != null) {
            if (string.equals("FOOT") || string.equals("foot")) {
                enumC4603o = C4589c.EnumC4603o.FOOT;
            } else if (string.equals("BIKE") || string.equals("bike")) {
                enumC4603o = C4589c.EnumC4603o.BIKE;
            } else if (!string.equals("CAR") && !string.equals("car")) {
                if (string.equals("TRUCK") || string.equals("truck")) {
                    enumC4603o = C4589c.EnumC4603o.TRUCK;
                } else if (string.equals("MOTORBIKE") || string.equals("motorbike")) {
                    enumC4603o = C4589c.EnumC4603o.MOTORBIKE;
                }
            }
        }
        String string2 = readableMap.hasKey("units") ? readableMap.getString("units") : null;
        C4589c.z(locationArr, locationArr2, enumC4603o, (string2 == null || !(string2.equals("METRIC") || string2.equals("metric"))) ? C4589c.EnumC4604p.IMPERIAL : C4589c.EnumC4604p.METRIC, new j(promise));
    }

    @ReactMethod
    public void getMetadata(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(io.radar.react.c.d(C4589c.A()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNRadar";
    }

    @ReactMethod
    public void getPermissionsStatus(Promise promise) {
        if (promise == null) {
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve("UNKNOWN");
            return;
        }
        boolean z10 = true;
        boolean z11 = AbstractC5338c.checkSelfPermission(currentActivity, "android.permission.ACCESS_FINE_LOCATION") == 0 || AbstractC5338c.checkSelfPermission(currentActivity, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        boolean i10 = androidx.core.app.b.i(currentActivity, "android.permission.ACCESS_FINE_LOCATION");
        if (Build.VERSION.SDK_INT < 29) {
            z10 = z11;
        } else if (AbstractC5338c.checkSelfPermission(currentActivity, "android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            z10 = false;
        }
        if (z10) {
            promise.resolve("GRANTED_BACKGROUND");
            return;
        }
        if (z11) {
            promise.resolve("GRANTED_FOREGROUND");
        } else if (i10) {
            promise.resolve("DENIED");
        } else {
            promise.resolve("NOT_DETERMINED");
        }
    }

    @ReactMethod
    public void getPublishableKey(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(C4589c.B());
    }

    @ReactMethod
    public void getTrackingOptions(Promise promise) {
        if (promise == null) {
            return;
        }
        try {
            promise.resolve(io.radar.react.c.d(C4589c.C().z()));
        } catch (JSONException e10) {
            Log.e(TAG, "JSONException", e10);
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_SERVER;
            promise.reject(enumC4607s.toString(), enumC4607s.toString());
        }
    }

    @ReactMethod
    public void getTripOptions(Promise promise) {
        if (promise == null) {
            return;
        }
        try {
            O0 D10 = C4589c.D();
            promise.resolve(D10 != null ? io.radar.react.c.d(D10.j()) : null);
        } catch (JSONException e10) {
            Log.e(TAG, "JSONException", e10);
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_SERVER;
            promise.reject(enumC4607s.toString(), enumC4607s.toString());
        }
    }

    @ReactMethod
    public void getUserId(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(C4589c.E());
    }

    @ReactMethod
    public void getVerifiedLocationToken(Promise promise) {
        C4589c.F(new o(promise));
    }

    @ReactMethod
    public void initialize(String str, boolean z10) {
        this.fraud = z10;
        SharedPreferences.Editor edit = getReactApplicationContext().getSharedPreferences("RadarSDK", 0).edit();
        edit.putString("x_platform_sdk_type", ReactConstants.TAG);
        edit.putString("x_platform_sdk_version", "3.20.3");
        edit.apply();
        if (z10) {
            C4589c.M(getReactApplicationContext(), str, this.receiver, C4589c.EnumC4596h.GOOGLE, z10);
            C4589c.M0(this.verifiedReceiver);
        } else {
            C4589c.L(getReactApplicationContext(), str);
            C4589c.K0(this.receiver);
        }
    }

    @ReactMethod
    public void ipGeocode(Promise promise) {
        if (promise == null) {
            return;
        }
        C4589c.P(new g(promise));
    }

    @ReactMethod
    public void isTracking(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(Boolean.valueOf(C4589c.R()));
    }

    @ReactMethod
    public void isTrackingVerified(Promise promise) {
        promise.resolve(Boolean.valueOf(C4589c.S()));
    }

    @ReactMethod
    public void isUsingRemoteTrackingOptions(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(Boolean.valueOf(C4589c.T()));
    }

    @ReactMethod
    public void logConversion(ReadableMap readableMap, Promise promise) {
        if (promise == null) {
            return;
        }
        if (!readableMap.hasKey("name")) {
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
            promise.reject(enumC4607s.toString(), enumC4607s.toString());
            return;
        }
        String string = readableMap.getString("name");
        Double d10 = readableMap.hasKey("revenue") ? new Double(readableMap.getDouble("revenue")) : null;
        JSONObject c10 = io.radar.react.c.c(readableMap.hasKey("metadata") ? readableMap.getMap("metadata") : null);
        l lVar = new l(promise);
        if (d10 != null) {
            C4589c.X(string, d10.doubleValue(), c10, lVar);
        } else {
            C4589c.Y(string, c10, lVar);
        }
    }

    @ReactMethod
    public void mockTracking(ReadableMap readableMap) {
        ReadableMap map = readableMap.getMap("origin");
        double d10 = map.getDouble("latitude");
        double d11 = map.getDouble("longitude");
        Location location = new Location(TAG);
        location.setLatitude(d10);
        location.setLongitude(d11);
        ReadableMap map2 = readableMap.getMap("destination");
        double d12 = map2.getDouble("latitude");
        double d13 = map2.getDouble("longitude");
        Location location2 = new Location(TAG);
        location2.setLatitude(d12);
        location2.setLongitude(d13);
        String string = readableMap.getString("mode");
        C4589c.EnumC4603o enumC4603o = C4589c.EnumC4603o.CAR;
        if (string.equals("FOOT") || string.equals("foot")) {
            enumC4603o = C4589c.EnumC4603o.FOOT;
        } else if (string.equals("BIKE") || string.equals("bike")) {
            enumC4603o = C4589c.EnumC4603o.BIKE;
        } else if (!string.equals("CAR")) {
            string.equals("car");
        }
        C4589c.b0(location, location2, enumC4603o, readableMap.hasKey("steps") ? readableMap.getInt("steps") : 10, readableMap.hasKey("interval") ? readableMap.getInt("interval") : 1, new p());
    }

    @ReactMethod
    public void nativeSdkVersion(Promise promise) {
        if (promise == null) {
            return;
        }
        String f02 = C4589c.f0();
        if (f02 != null) {
            promise.resolve(f02);
        } else {
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
            promise.reject(enumC4607s.toString(), enumC4607s.toString());
        }
    }

    @Override // com.facebook.react.modules.core.PermissionListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        Promise promise;
        if (i10 != PERMISSIONS_REQUEST_CODE || (promise = this.mPermissionsRequestPromise) == null) {
            return true;
        }
        getPermissionsStatus(promise);
        this.mPermissionsRequestPromise = null;
        return true;
    }

    @ReactMethod
    public void rejectEvent(String str) {
        C4589c.c0(str);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        int intValue = this.listenerCount - num.intValue();
        this.listenerCount = intValue;
        if (intValue == 0) {
            if (this.fraud) {
                this.verifiedReceiver.f49596b = false;
            }
            this.receiver.f49594b = false;
        }
    }

    @ReactMethod
    public void requestPermissions(boolean z10, Promise promise) {
        PermissionAwareActivity permissionAwareActivity = (PermissionAwareActivity) getCurrentActivity();
        this.mPermissionsRequestPromise = promise;
        if (permissionAwareActivity != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (!z10 || i10 < 29) {
                permissionAwareActivity.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, PERMISSIONS_REQUEST_CODE, this);
            } else {
                permissionAwareActivity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, PERMISSIONS_REQUEST_CODE, this);
            }
        }
    }

    @ReactMethod
    public void reverseGeocode(ReadableMap readableMap, Promise promise) {
        String[] strArr;
        if (promise == null) {
            return;
        }
        ReadableMap readableMap2 = null;
        if (readableMap != null) {
            ReadableMap map = readableMap.getMap("location");
            strArr = readableMap.hasKey("layers") ? io.radar.react.c.e(readableMap.getArray("layers")) : null;
            readableMap2 = map;
        } else {
            strArr = null;
        }
        f fVar = new f(promise);
        if (readableMap2 == null) {
            C4589c.e0(strArr, fVar);
            return;
        }
        double d10 = readableMap2.getDouble("latitude");
        double d11 = readableMap2.getDouble("longitude");
        Location location = new Location(TAG);
        location.setLatitude(d10);
        location.setLongitude(d11);
        C4589c.d0(location, strArr, fVar);
    }

    @ReactMethod
    public void searchGeofences(ReadableMap readableMap, Promise promise) {
        Location location;
        if (promise == null) {
            return;
        }
        JSONObject jSONObject = null;
        if (readableMap.hasKey("near")) {
            ReadableMap map = readableMap.getMap("near");
            double d10 = map.getDouble("latitude");
            double d11 = map.getDouble("longitude");
            Location location2 = new Location(TAG);
            location2.setLatitude(d10);
            location2.setLongitude(d11);
            location = location2;
        } else {
            location = null;
        }
        Integer valueOf = readableMap.hasKey("radius") ? Integer.valueOf(readableMap.getInt("radius")) : null;
        String[] e10 = readableMap.hasKey("tags") ? io.radar.react.c.e(readableMap.getArray("tags")) : null;
        if (readableMap.hasKey("metadata")) {
            try {
                jSONObject = io.radar.react.c.c(readableMap.getMap("metadata"));
            } catch (JSONException e11) {
                Log.e(TAG, "JSONException", e11);
                C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
                promise.reject(enumC4607s.toString(), enumC4607s.toString());
                return;
            }
        }
        JSONObject jSONObject2 = jSONObject;
        int i10 = readableMap.hasKey("limit") ? readableMap.getInt("limit") : 100;
        boolean z10 = readableMap.hasKey("includeGeometry") ? readableMap.getBoolean("includeGeometry") : false;
        c cVar = new c(promise);
        if (location != null) {
            C4589c.g0(location, valueOf, e10, jSONObject2, Integer.valueOf(i10), Boolean.valueOf(z10), cVar);
        } else {
            C4589c.h0(valueOf, e10, jSONObject2, Integer.valueOf(i10), Boolean.valueOf(z10), cVar);
        }
    }

    @ReactMethod
    public void searchPlaces(ReadableMap readableMap, Promise promise) {
        Location location;
        if (promise == null) {
            return;
        }
        if (readableMap.hasKey("near")) {
            ReadableMap map = readableMap.getMap("near");
            double d10 = map.getDouble("latitude");
            double d11 = map.getDouble("longitude");
            Location location2 = new Location(TAG);
            location2.setLatitude(d10);
            location2.setLongitude(d11);
            location = location2;
        } else {
            location = null;
        }
        int i10 = readableMap.hasKey("radius") ? readableMap.getInt("radius") : 1000;
        String[] e10 = readableMap.hasKey("chains") ? io.radar.react.c.e(readableMap.getArray("chains")) : null;
        Map f10 = io.radar.react.c.f(readableMap.getMap("chainMetadata"));
        String[] e11 = readableMap.hasKey("categories") ? io.radar.react.c.e(readableMap.getArray("categories")) : null;
        String[] e12 = readableMap.hasKey("groups") ? io.radar.react.c.e(readableMap.getArray("groups")) : null;
        String[] e13 = readableMap.hasKey("countryCodes") ? io.radar.react.c.e(readableMap.getArray("countryCodes")) : null;
        int i11 = readableMap.hasKey("limit") ? readableMap.getInt("limit") : 10;
        b bVar = new b(promise);
        if (location != null) {
            C4589c.j0(location, i10, e10, f10, e11, e12, e13, Integer.valueOf(i11), bVar);
        } else {
            C4589c.i0(i10, e10, f10, e11, e12, e13, Integer.valueOf(i11), bVar);
        }
    }

    @ReactMethod
    public void setAnonymousTrackingEnabled(boolean z10) {
        C4589c.v0(z10);
    }

    @ReactMethod
    public void setDescription(String str) {
        C4589c.z0(str);
    }

    @ReactMethod
    public void setForegroundServiceOptions(ReadableMap readableMap) {
        try {
            C4589c.B0(N0.c.a(io.radar.react.c.c(readableMap)));
        } catch (JSONException e10) {
            Log.e(TAG, "JSONException", e10);
        }
    }

    @ReactMethod
    public void setLogLevel(String str) {
        C4589c.EnumC4599k enumC4599k = C4589c.EnumC4599k.NONE;
        if (str != null) {
            if (str.equals("error") || str.equals("ERROR")) {
                enumC4599k = C4589c.EnumC4599k.ERROR;
            } else if (str.equals("warning") || str.equals("WARNING")) {
                enumC4599k = C4589c.EnumC4599k.WARNING;
            } else if (str.equals("info") || str.equals("INFO")) {
                enumC4599k = C4589c.EnumC4599k.INFO;
            } else if (str.equals("debug") || str.equals("DEBUG")) {
                enumC4599k = C4589c.EnumC4599k.DEBUG;
            }
        }
        C4589c.E0(enumC4599k);
    }

    @ReactMethod
    public void setMetadata(ReadableMap readableMap) {
        C4589c.H0(io.radar.react.c.c(readableMap));
    }

    @ReactMethod
    public void setNotificationOptions(ReadableMap readableMap) {
        try {
            C4589c.I0(I0.a(io.radar.react.c.c(readableMap)));
        } catch (JSONException e10) {
            Log.e(TAG, "JSONException", e10);
        }
    }

    @ReactMethod
    public void setProduct(String str) {
        C4589c.J0(str);
    }

    @ReactMethod
    public void setUserId(String str) {
        C4589c.L0(str);
    }

    @ReactMethod
    public void startTrackingContinuous() {
        C4589c.N0(N0.f49716v);
    }

    @ReactMethod
    public void startTrackingCustom(ReadableMap readableMap) {
        try {
            C4589c.N0(N0.a(io.radar.react.c.c(readableMap)));
        } catch (JSONException e10) {
            Log.e(TAG, "JSONException", e10);
        }
    }

    @ReactMethod
    public void startTrackingEfficient() {
        C4589c.N0(N0.f49718x);
    }

    @ReactMethod
    public void startTrackingResponsive() {
        C4589c.N0(N0.f49717w);
    }

    @ReactMethod
    public void startTrackingVerified(ReadableMap readableMap) {
        int i10 = 1200;
        if (readableMap != null) {
            r0 = readableMap.hasKey("beacons") ? readableMap.getBoolean("beacons") : false;
            if (readableMap.hasKey("interval")) {
                i10 = readableMap.getInt("interval");
            }
        }
        C4589c.O0(i10, r0);
    }

    @ReactMethod
    public void startTrip(ReadableMap readableMap, Promise promise) {
        try {
            JSONObject c10 = io.radar.react.c.c(readableMap);
            JSONObject optJSONObject = c10.optJSONObject("tripOptions");
            if (optJSONObject == null) {
                optJSONObject = c10;
            }
            O0 a10 = O0.a(optJSONObject);
            JSONObject optJSONObject2 = c10.optJSONObject("trackingOptions");
            C4589c.P0(a10, optJSONObject2 != null ? N0.a(optJSONObject2) : null, new q(promise));
        } catch (JSONException e10) {
            Log.e(TAG, "JSONException", e10);
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
            promise.reject(enumC4607s.toString(), enumC4607s.toString());
        }
    }

    @ReactMethod
    public void stopTracking() {
        C4589c.Q0();
    }

    @ReactMethod
    public void stopTrackingVerified() {
        C4589c.R0();
    }

    @ReactMethod
    public void trackOnce(ReadableMap readableMap, Promise promise) {
        N0.b bVar = N0.b.MEDIUM;
        Location location = null;
        boolean z10 = false;
        if (readableMap != null) {
            if (readableMap.hasKey("location")) {
                ReadableMap map = readableMap.getMap("location");
                Location location2 = new Location(TAG);
                double d10 = map.getDouble("latitude");
                double d11 = map.getDouble("longitude");
                float f10 = (float) map.getDouble("accuracy");
                location2.setLatitude(d10);
                location2.setLongitude(d11);
                location2.setAccuracy(f10);
                location = location2;
            }
            if (readableMap.hasKey("desiredAccuracy")) {
                String lowerCase = readableMap.getString("desiredAccuracy").toLowerCase();
                if (lowerCase.equals(ViewProps.NONE)) {
                    bVar = N0.b.NONE;
                } else if (lowerCase.equals("low")) {
                    bVar = N0.b.LOW;
                } else if (!lowerCase.equals("medium") && lowerCase.equals("high")) {
                    bVar = N0.b.HIGH;
                }
            }
            if (readableMap.hasKey("beacons")) {
                z10 = readableMap.getBoolean("beacons");
            }
        }
        m mVar = new m(promise);
        if (location != null) {
            C4589c.V0(location, mVar);
        } else {
            C4589c.X0(bVar, z10, mVar);
        }
    }

    @ReactMethod
    public void trackVerified(ReadableMap readableMap, Promise promise) {
        N0.b bVar = N0.b.MEDIUM;
        if (readableMap != null) {
            r1 = readableMap.hasKey("beacons") ? readableMap.getBoolean("beacons") : false;
            if (readableMap.hasKey("desiredAccuracy")) {
                String lowerCase = readableMap.getString("desiredAccuracy").toLowerCase();
                if (lowerCase.equals(ViewProps.NONE)) {
                    bVar = N0.b.NONE;
                } else if (lowerCase.equals("low")) {
                    bVar = N0.b.LOW;
                } else if (!lowerCase.equals("medium") && lowerCase.equals("high")) {
                    bVar = N0.b.HIGH;
                }
            }
        }
        C4589c.Z0(r1, bVar, new n(promise));
    }

    @ReactMethod
    public void updateTrip(ReadableMap readableMap, Promise promise) {
        try {
            JSONObject c10 = io.radar.react.c.c(readableMap);
            O0 a10 = O0.a(c10.getJSONObject("options"));
            B.b bVar = B.b.UNKNOWN;
            if (c10.has("status")) {
                String string = c10.getString("status");
                if (string != null) {
                    if (string.equalsIgnoreCase("started")) {
                        bVar = B.b.STARTED;
                    } else if (string.equalsIgnoreCase("approaching")) {
                        bVar = B.b.APPROACHING;
                    } else if (string.equalsIgnoreCase("arrived")) {
                        bVar = B.b.ARRIVED;
                    } else if (string.equalsIgnoreCase("completed")) {
                        bVar = B.b.COMPLETED;
                    } else if (string.equalsIgnoreCase("canceled")) {
                        bVar = B.b.CANCELED;
                    } else if (!string.equalsIgnoreCase("unknown")) {
                        C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
                        promise.reject(enumC4607s.toString(), enumC4607s.toString());
                    }
                }
            } else {
                C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
                promise.reject(enumC4607s2.toString(), enumC4607s2.toString());
            }
            C4589c.b1(a10, bVar, new t(promise));
        } catch (JSONException e10) {
            Log.e(TAG, "JSONException", e10);
            C4589c.EnumC4607s enumC4607s3 = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
            promise.reject(enumC4607s3.toString(), enumC4607s3.toString());
        }
    }

    @ReactMethod
    public void validateAddress(ReadableMap readableMap, Promise promise) {
        if (promise == null) {
            return;
        }
        try {
            C4589c.c1(C1164a.a(io.radar.react.c.c(readableMap)), new h(promise));
        } catch (JSONException unused) {
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_BAD_REQUEST;
            promise.reject(enumC4607s.toString(), enumC4607s.toString());
        }
    }

    public class p implements C4589c.InterfaceC4608t {
        public p() {
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4608t
        public void a(C4589c.EnumC4607s enumC4607s, Location location, Gh.h[] hVarArr, C c10) {
        }
    }
}
