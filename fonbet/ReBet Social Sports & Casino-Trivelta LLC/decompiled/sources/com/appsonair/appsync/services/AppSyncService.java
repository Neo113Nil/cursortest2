package com.appsonair.appsync.services;

import android.content.Context;
import android.content.Intent;
import com.appsonair.appsync.BuildConfig;
import com.appsonair.appsync.activities.AppUpdateActivity;
import com.appsonair.appsync.activities.MaintenanceActivity;
import com.appsonair.appsync.interfaces.UpdateCallBack;
import com.facebook.react.bridge.BaseJavaModule;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/appsonair/appsync/services/AppSyncService;", "", "()V", "Companion", "appSync_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AppSyncService {

    @NotNull
    private static final String TAG = "AppSyncService";
    private static boolean isNetworkConnected;
    private static boolean isResponseReceived;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String appId = "";
    private static boolean showNativeUI = true;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001c\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J,\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J2\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00172\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/appsonair/appsync/services/AppSyncService$Companion;", "", "()V", "TAG", "", "appId", "isNetworkConnected", "", "isResponseReceived", "showNativeUI", "callCDNServiceApi", "", "context", "Landroid/content/Context;", "callBack", "Lcom/appsonair/appsync/interfaces/UpdateCallBack;", "callServiceApi", "getResponse", "response", "Lokhttp3/Response;", "isFromCDN", BaseJavaModule.METHOD_TYPE_SYNC, "options", "", "appSync_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void callCDNServiceApi(final Context context, final UpdateCallBack callBack) {
            String str = AppSyncService.appId + ".json";
            Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
            HttpUrl parse = HttpUrl.INSTANCE.parse(BuildConfig.CDN_BASE_URL);
            Intrinsics.checkNotNull(parse);
            HttpUrl.Builder newBuilder = parse.newBuilder();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            newBuilder.addPathSegment(str);
            newBuilder.addQueryParameter("now", String.valueOf(currentTimeMillis));
            new OkHttpClient().newBuilder().build().newCall(new Request.Builder().url(newBuilder.build().getUrl()).method("GET", null).build()).enqueue(new Callback() { // from class: com.appsonair.appsync.services.AppSyncService$Companion$callCDNServiceApi$1
                @Override // okhttp3.Callback
                public void onFailure(@NotNull Call call, @NotNull IOException e10) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e10, "e");
                    e10.getMessage();
                }

                @Override // okhttp3.Callback
                public void onResponse(@NotNull Call call, @NotNull Response response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    AppSyncService.INSTANCE.getResponse(response, context, callBack, true);
                }
            });
        }

        public static /* synthetic */ void callCDNServiceApi$default(Companion companion, Context context, UpdateCallBack updateCallBack, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                updateCallBack = null;
            }
            companion.callCDNServiceApi(context, updateCallBack);
        }

        private final void callServiceApi(final Context context, final UpdateCallBack callBack) {
            String str = BuildConfig.BASE_URL + AppSyncService.appId;
            Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
            new OkHttpClient().newBuilder().build().newCall(new Request.Builder().url(str).method("GET", null).build()).enqueue(new Callback() { // from class: com.appsonair.appsync.services.AppSyncService$Companion$callServiceApi$1
                @Override // okhttp3.Callback
                public void onFailure(@NotNull Call call, @NotNull IOException e10) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e10, "e");
                    e10.getMessage();
                }

                @Override // okhttp3.Callback
                public void onResponse(@NotNull Call call, @NotNull Response response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    AppSyncService.INSTANCE.getResponse(response, context, callBack, false);
                }
            });
        }

        public static /* synthetic */ void callServiceApi$default(Companion companion, Context context, UpdateCallBack updateCallBack, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                updateCallBack = null;
            }
            companion.callServiceApi(context, updateCallBack);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00da A[Catch: Exception -> 0x0052, TryCatch #1 {Exception -> 0x0052, blocks: (B:3:0x0009, B:5:0x0011, B:8:0x0039, B:10:0x003f, B:12:0x009d, B:14:0x00da, B:15:0x00e1, B:20:0x0059, B:22:0x0073, B:25:0x007f, B:30:0x008b), top: B:2:0x0009 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void getResponse(Response response, Context context, UpdateCallBack callBack, boolean isFromCDN) {
            boolean z10;
            try {
                if (response.code() != 200) {
                    if (isFromCDN) {
                        try {
                            callServiceApi(context, callBack);
                            return;
                        } catch (Exception e10) {
                            e = e10;
                            if (callBack != null) {
                                callBack.onFailure(e.getMessage());
                            }
                            AppSyncService.isResponseReceived = false;
                            e.getMessage();
                            return;
                        }
                    }
                    return;
                }
                ResponseBody body = response.body();
                Intrinsics.checkNotNull(body);
                String string = body.string();
                JSONObject jSONObject = new JSONObject(string);
                JSONObject jSONObject2 = jSONObject.getJSONObject("updateData");
                boolean z11 = jSONObject2.getBoolean("isAndroidUpdate");
                if (jSONObject.getBoolean("isMaintenance") && AppSyncService.showNativeUI) {
                    Intent intent = new Intent(context, (Class<?>) MaintenanceActivity.class);
                    intent.putExtra("res", string);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                } else if (z11) {
                    boolean z12 = jSONObject2.getBoolean("isAndroidForcedUpdate");
                    String string2 = jSONObject2.getString("androidBuildNumber");
                    z10 = true;
                    boolean z13 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode < (string2 != null ? Integer.parseInt(string2) : 0);
                    if (AppSyncService.showNativeUI && z13 && (z12 || z11)) {
                        Intent intent2 = new Intent(context, (Class<?>) AppUpdateActivity.class);
                        intent2.putExtra("res", string);
                        intent2.addFlags(268435456);
                        context.startActivity(intent2);
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("isUpdateEnabled", jSONObject2.getBoolean("isAndroidUpdate"));
                    jSONObject3.put("buildNumber", jSONObject2.getString("androidBuildNumber"));
                    jSONObject3.put("minBuildVersion", jSONObject2.optString("androidMinBuildVersion", ""));
                    jSONObject3.put("updateLink", jSONObject2.getString("androidUpdateLink"));
                    jSONObject3.put("isForcedUpdate", jSONObject2.getBoolean("isAndroidForcedUpdate"));
                    jSONObject.put("updateData", jSONObject3);
                    if (callBack != null) {
                        callBack.onSuccess(jSONObject.toString());
                    }
                    AppSyncService.isResponseReceived = z10;
                }
                z10 = true;
                JSONObject jSONObject32 = new JSONObject();
                jSONObject32.put("isUpdateEnabled", jSONObject2.getBoolean("isAndroidUpdate"));
                jSONObject32.put("buildNumber", jSONObject2.getString("androidBuildNumber"));
                jSONObject32.put("minBuildVersion", jSONObject2.optString("androidMinBuildVersion", ""));
                jSONObject32.put("updateLink", jSONObject2.getString("androidUpdateLink"));
                jSONObject32.put("isForcedUpdate", jSONObject2.getBoolean("isAndroidForcedUpdate"));
                jSONObject.put("updateData", jSONObject32);
                if (callBack != null) {
                }
                AppSyncService.isResponseReceived = z10;
            } catch (Exception e11) {
                e = e11;
            }
        }

        public static /* synthetic */ void getResponse$default(Companion companion, Response response, Context context, UpdateCallBack updateCallBack, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                updateCallBack = null;
            }
            companion.getResponse(response, context, updateCallBack, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sync$default(Companion companion, Context context, Map map, UpdateCallBack updateCallBack, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                map = MapsKt.emptyMap();
            }
            if ((i10 & 4) != 0) {
                updateCallBack = null;
            }
            companion.sync(context, map, updateCallBack);
        }

        @JvmStatic
        @JvmOverloads
        public final void sync(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            sync$default(this, context, null, null, 6, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        public final void sync(@NotNull Context context, @NotNull Map<String, ? extends Object> options) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(options, "options");
            sync$default(this, context, options, null, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void sync(@NotNull Context context, @NotNull Map<String, ? extends Object> options, @Nullable UpdateCallBack callBack) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(options, "options");
            Debounce.INSTANCE.debounce(new AppSyncService$Companion$sync$1(context, options, callBack));
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final void sync(@NotNull Context context) {
        INSTANCE.sync(context);
    }

    @JvmStatic
    @JvmOverloads
    public static final void sync(@NotNull Context context, @NotNull Map<String, ? extends Object> map) {
        INSTANCE.sync(context, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final void sync(@NotNull Context context, @NotNull Map<String, ? extends Object> map, @Nullable UpdateCallBack updateCallBack) {
        INSTANCE.sync(context, map, updateCallBack);
    }
}
