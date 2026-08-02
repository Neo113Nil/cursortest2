package com.facebook.reactnative.androidsdk;

import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import g6.C4338J;
import g6.C4339K;
import g6.EnumC4340L;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = FBGraphRequestModule.NAME)
/* loaded from: classes2.dex */
public class FBGraphRequestModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FBGraphRequest";
    private SparseArray<WritableMap> mResponses;

    public class a implements C4338J.a {

        /* renamed from: a, reason: collision with root package name */
        public int f31440a;

        /* renamed from: b, reason: collision with root package name */
        public Callback f31441b;

        public a(int i10, Callback callback) {
            this.f31440a = i10;
            this.f31441b = callback;
        }

        @Override // g6.C4338J.a
        public void a(C4338J c4338j) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("result", "batch finished executing or timed out");
            this.f31441b.invoke(null, createMap, FBGraphRequestModule.this.mResponses.get(this.f31440a));
            FBGraphRequestModule.this.mResponses.remove(this.f31440a);
        }
    }

    public class b implements GraphRequest.b {

        /* renamed from: a, reason: collision with root package name */
        public String f31443a;

        /* renamed from: b, reason: collision with root package name */
        public int f31444b;

        public b(int i10, int i11) {
            this.f31443a = String.valueOf(i10);
            this.f31444b = i11;
        }

        @Override // com.facebook.GraphRequest.b
        public void a(C4339K c4339k) {
            WritableArray createArray = Arguments.createArray();
            createArray.pushMap(FBGraphRequestModule.this.buildFacebookRequestError(c4339k.b()));
            createArray.pushMap(FBGraphRequestModule.this.buildGraphResponse(c4339k));
            ((WritableMap) FBGraphRequestModule.this.mResponses.get(this.f31444b)).putArray(this.f31443a, createArray);
        }
    }

    public FBGraphRequestModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mResponses = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap buildFacebookRequestError(FacebookRequestError facebookRequestError) {
        if (facebookRequestError == null) {
            return null;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("requestStatusCode", facebookRequestError.getRequestStatusCode());
        createMap.putInt("errorCode", facebookRequestError.getErrorCode());
        createMap.putInt("subErrorCode", facebookRequestError.getSubErrorCode());
        if (facebookRequestError.getErrorType() != null) {
            createMap.putString("errorType", facebookRequestError.getErrorType());
        }
        if (facebookRequestError.d() != null) {
            createMap.putString("errorMessage", facebookRequestError.d());
        }
        if (facebookRequestError.getErrorUserTitle() != null) {
            createMap.putString("errorUserTitle", facebookRequestError.getErrorUserTitle());
        }
        if (facebookRequestError.getErrorUserMessage() != null) {
            createMap.putString("errorUserMessage", facebookRequestError.getErrorUserMessage());
        }
        if (facebookRequestError.getRequestResultBody() != null) {
            createMap.putString("requestResultBody", facebookRequestError.getRequestResultBody().toString());
        }
        if (facebookRequestError.getRequestResult() != null) {
            createMap.putString("requestResult", facebookRequestError.getRequestResult().toString());
        }
        if (facebookRequestError.getBatchRequestResult() != null) {
            createMap.putString("batchRequestResult", facebookRequestError.getBatchRequestResult().toString());
        }
        if (facebookRequestError.getException() != null) {
            createMap.putString("exception", facebookRequestError.getException().toString());
        }
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap buildGraphResponse(C4339K c4339k) {
        return c4339k.c() != null ? convertJSONObject(c4339k.c()) : Arguments.createMap();
    }

    private Bundle buildParameters(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            ReadableMap map = readableMap.getMap(nextKey);
            if (map.hasKey("string")) {
                bundle.putString(nextKey, map.getString("string"));
            }
        }
        return bundle;
    }

    private GraphRequest buildRequest(ReadableMap readableMap) {
        GraphRequest graphRequest = new GraphRequest();
        graphRequest.H(readableMap.getString("graphPath"));
        setConfig(graphRequest, readableMap.getMap("config"));
        return graphRequest;
    }

    private WritableArray convertJSONArray(JSONArray jSONArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Object obj = jSONArray.get(i10);
                if (obj instanceof JSONObject) {
                    createArray.pushMap(convertJSONObject((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    createArray.pushArray(convertJSONArray((JSONArray) obj));
                } else if (obj instanceof String) {
                    createArray.pushString((String) obj);
                } else if (obj instanceof Integer) {
                    createArray.pushInt(((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    createArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    createArray.pushDouble(((Double) obj).doubleValue());
                }
            } catch (JSONException unused) {
            }
        }
        return createArray;
    }

    private WritableMap convertJSONObject(JSONObject jSONObject) {
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    createMap.putMap(next, convertJSONObject((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    createMap.putArray(next, convertJSONArray((JSONArray) obj));
                } else if (obj instanceof String) {
                    createMap.putString(next, (String) obj);
                } else if (obj instanceof Integer) {
                    createMap.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    createMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    createMap.putDouble(next, ((Double) obj).doubleValue());
                }
            } catch (JSONException unused) {
            }
        }
        return createMap;
    }

    private void setConfig(GraphRequest graphRequest, ReadableMap readableMap) {
        if (readableMap == null) {
            graphRequest.D(AccessToken.d());
            return;
        }
        if (readableMap.hasKey("parameters")) {
            graphRequest.J(buildParameters(readableMap.getMap("parameters")));
        }
        if (readableMap.hasKey("httpMethod")) {
            graphRequest.I(EnumC4340L.valueOf(readableMap.getString("httpMethod")));
        }
        if (readableMap.hasKey("version")) {
            graphRequest.L(readableMap.getString("version"));
        }
        if (readableMap.hasKey("accessToken")) {
            graphRequest.D(new AccessToken(readableMap.getString("accessToken"), AccessToken.d().getApplicationId(), AccessToken.d().getUserId(), null, null, null, null, null, null, null));
        } else {
            graphRequest.D(AccessToken.d());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void start(ReadableArray readableArray, int i10, Callback callback) {
        int i11;
        int i12;
        C4338J c4338j = new C4338J();
        synchronized (this) {
            i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (this.mResponses.get(i12) == null) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            this.mResponses.put(i12, Arguments.createMap());
        }
        for (i11 = 0; i11 < readableArray.size(); i11++) {
            GraphRequest buildRequest = buildRequest(readableArray.getMap(i11));
            buildRequest.E(new b(i11, i12));
            c4338j.add(buildRequest);
        }
        c4338j.y(i10);
        c4338j.c(new a(i12, callback));
        c4338j.h();
    }
}
