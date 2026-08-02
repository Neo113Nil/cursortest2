package com.appsonair.applink.services;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import android.util.Log;
import com.appsonair.applink.services.AppLinkHandler;
import com.appsonair.applink.utils.StringConst;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.core.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/appsonair/applink/services/AppLinkHandler;", "", "()V", "Companion", "applink_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AppLinkHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static String appsOnAirAppId;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0095\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ6\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u0012H\u0007J\f\u0010%\u001a\u00020\u0012*\u00020\u0004H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/appsonair/applink/services/AppLinkHandler$Companion;", "", "()V", "appsOnAirAppId", "", "getAppsOnAirAppId$applink_release", "()Ljava/lang/String;", "setAppsOnAirAppId$applink_release", "(Ljava/lang/String;)V", "createAppLink", "Lorg/json/JSONObject;", EventKeys.URL, "name", "urlPrefix", "shortId", "socialMeta", "", "isOpenInBrowserAndroid", "", "isOpenInAndroidApp", "androidFallbackUrl", "isOpenInBrowserApple", "isOpenInIosApp", "iosFallbackUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAppLink", "linkId", "domain", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReferralLinkByIP", "publicUserAgent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleLinkCount", "", "isClicked", "isFirstOpen", "isInstall", "isValidUrl", "applink_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static final void createAppLink$checkValidUrlKey(JSONObject jSONObject, List<String> list, String str) {
            String value = jSONObject.optString(str);
            Intrinsics.checkNotNullExpressionValue(value, "value");
            if (StringsKt.isBlank(value) || AppLinkHandler.INSTANCE.isValidUrl(value)) {
                return;
            }
            list.add(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object createAppLink$default(Companion companion, String str, String str2, String str3, String str4, Map map, Boolean bool, Boolean bool2, String str5, Boolean bool3, Boolean bool4, String str6, Continuation continuation, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                str4 = null;
            }
            if ((i10 & 16) != 0) {
                map = null;
            }
            if ((i10 & 32) != 0) {
                bool = null;
            }
            if ((i10 & 64) != 0) {
                bool2 = null;
            }
            if ((i10 & 128) != 0) {
                str5 = null;
            }
            if ((i10 & 256) != 0) {
                bool3 = null;
            }
            if ((i10 & 512) != 0) {
                bool4 = null;
            }
            if ((i10 & 1024) != 0) {
                str6 = null;
            }
            return companion.createAppLink(str, str2, str3, str4, map, bool, bool2, str5, bool3, bool4, str6, continuation);
        }

        public static /* synthetic */ Object getReferralLinkByIP$default(Companion companion, String str, Continuation continuation, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "";
            }
            return companion.getReferralLinkByIP(str, continuation);
        }

        public static /* synthetic */ void handleLinkCount$default(Companion companion, String str, String str2, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            companion.handleLinkCount(str, str2, z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? false : z12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: handleLinkCount$lambda-14, reason: not valid java name */
        public static final void m57handleLinkCount$lambda14(String domain, String linkId, boolean z10, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(domain, "$domain");
            Intrinsics.checkNotNullParameter(linkId, "$linkId");
            try {
                MediaType mediaType = MediaType.INSTANCE.get("application/json; charset=utf-8");
                OkHttpClient okHttpClient = new OkHttpClient();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("domain", domain);
                jSONObject.put("shortId", linkId);
                jSONObject.put("isClicked", z10);
                jSONObject.put("isFirstOpen", z11);
                jSONObject.put("isInstalled", z12);
                jSONObject.put("isReOpen", !z12);
                RequestBody.Companion companion = RequestBody.INSTANCE;
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                Response execute = okHttpClient.newCall(new Request.Builder().url("https://server.appsonair.link/api/dynamic-link-analytics/").addHeader(StringConst.ApplicatonKey, AppLinkHandler.INSTANCE.getAppsOnAirAppId$applink_release()).post(companion.create(jSONObject2, mediaType)).build()).execute();
                if (execute.isSuccessful()) {
                    return;
                }
                Log.e("AppLink", "Analytics failed: " + execute.code());
            } catch (Exception e10) {
                Log.e("AppLink", "API call exception: " + e10.getLocalizedMessage());
            }
        }

        private final boolean isValidUrl(String str) {
            return StringsKt.startsWith$default(str, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(str, "https://", false, 2, (Object) null);
        }

        @JvmStatic
        @Nullable
        public final Object createAppLink(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable Map<String, ? extends Object> map, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str5, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str6, @NotNull Continuation<? super JSONObject> continuation) {
            String str7;
            if (!NetworkWatcherService.INSTANCE.isNetworkConnected()) {
                return new JSONObject(MapsKt.mapOf(TuplesKt.to("error", StringConst.NetworkError)));
            }
            if (getAppsOnAirAppId$applink_release().length() == 0) {
                return new JSONObject(MapsKt.mapOf(TuplesKt.to("error", StringConst.AppIdMissing)));
            }
            MediaType mediaType = MediaType.INSTANCE.get("application/json; charset=utf-8");
            OkHttpClient okHttpClient = new OkHttpClient();
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("name", str2);
                jSONObject2.put("link", str);
                if (str4 != null) {
                    jSONObject2.put("shortId", str4);
                }
                if (map != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    Object obj = map.get("title");
                    if (obj == null) {
                        obj = JSONObject.NULL;
                    }
                    jSONObject3.put("title", obj);
                    Object obj2 = map.get("description");
                    if (obj2 == null) {
                        obj2 = JSONObject.NULL;
                    }
                    jSONObject3.put("description", obj2);
                    Object obj3 = map.get("imageUrl");
                    if (obj3 == null) {
                        obj3 = JSONObject.NULL;
                    }
                    jSONObject3.put("imageUrl", obj3);
                    Unit unit = Unit.INSTANCE;
                    jSONObject2.put("socialMetaTags", jSONObject3);
                }
                if (str5 != null) {
                    jSONObject2.put("customUrlForAndroid", str5);
                }
                if (str6 != null) {
                    jSONObject2.put("customUrlForIos", str6);
                }
                if (bool3 != null) {
                    jSONObject2.put("isOpenInBrowserApple", bool3.booleanValue());
                }
                if (bool2 != null) {
                    jSONObject2.put("isOpenInAndroidApp", bool2.booleanValue());
                }
                if (bool4 != null) {
                    jSONObject2.put("isOpenInIosApp", bool4.booleanValue());
                }
                if (bool != null) {
                    jSONObject2.put("isOpenInBrowserAndroid", bool.booleanValue());
                }
                Unit unit2 = Unit.INSTANCE;
                jSONObject.put(EventKeys.DATA, jSONObject2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("urlPrefix", str3);
                jSONObject.put("where", jSONObject4);
                JSONObject jSONObject5 = jSONObject.getJSONObject(EventKeys.DATA);
                ArrayList arrayList = new ArrayList();
                createAppLink$checkValidUrlKey(jSONObject5, arrayList, "link");
                createAppLink$checkValidUrlKey(jSONObject5, arrayList, "customUrlForIos");
                createAppLink$checkValidUrlKey(jSONObject5, arrayList, "customUrlForAndroid");
                JSONObject optJSONObject = jSONObject5.optJSONObject("socialMetaTags");
                if (optJSONObject != null && optJSONObject.has("imageUrl") && !optJSONObject.isNull("imageUrl")) {
                    String imageUrl = optJSONObject.optString("imageUrl");
                    Intrinsics.checkNotNullExpressionValue(imageUrl, "imageUrl");
                    if (!StringsKt.isBlank(imageUrl) && !AppLinkHandler.INSTANCE.isValidUrl(imageUrl)) {
                        arrayList.add("imageUrl");
                    }
                }
                if (arrayList.isEmpty()) {
                    try {
                        RequestBody.Companion companion = RequestBody.INSTANCE;
                        String jSONObject6 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject6, "jsonObject.toString()");
                        return AbstractC1455i.g(C1452g0.b(), new AppLinkHandler$Companion$createAppLink$3(okHttpClient, new Request.Builder().url("https://server.appsonair.link/api/dynamic-link/").addHeader(StringConst.ApplicatonKey, getAppsOnAirAppId$applink_release()).post(companion.create(jSONObject6, mediaType)).build(), null), continuation);
                    } catch (Exception e10) {
                        Log.e("RequestError", "Failed to create request body: " + e10.getMessage());
                        return new JSONObject(MapsKt.mapOf(TuplesKt.to("error", "Failed to create request body")));
                    }
                }
                String str8 = (String) CollectionsKt.first((List) arrayList);
                int hashCode = str8.hashCode();
                if (hashCode == -360094652) {
                    if (str8.equals("customUrlForAndroid")) {
                        str7 = "Enter a valid URL in androidFallbackUrl field!";
                    }
                    str7 = "Enter a valid URL in " + str8 + " field!";
                } else if (hashCode != 3321850) {
                    if (hashCode == 2045048930 && str8.equals("customUrlForIos")) {
                        str7 = "Enter a valid URL in iosFallbackUrl field!";
                    }
                    str7 = "Enter a valid URL in " + str8 + " field!";
                } else {
                    if (str8.equals("link")) {
                        str7 = "Enter a valid URL in url field!";
                    }
                    str7 = "Enter a valid URL in " + str8 + " field!";
                }
                return new JSONObject(MapsKt.mapOf(TuplesKt.to("error", str7)));
            } catch (JSONException e11) {
                Log.e("JSONError", "Failed to construct JSON object: " + e11.getMessage());
                return new JSONObject(MapsKt.mapOf(TuplesKt.to("error", StringConst.SomethingWentWrong)));
            }
        }

        @JvmStatic
        @Nullable
        public final Object fetchAppLink(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super JSONObject> continuation) {
            if (!NetworkWatcherService.INSTANCE.isNetworkConnected()) {
                return new JSONObject(MapsKt.mapOf(TuplesKt.to("error", StringConst.NetworkError)));
            }
            return AbstractC1455i.g(C1452g0.b(), new AppLinkHandler$Companion$fetchAppLink$2(new OkHttpClient(), new Request.Builder().url("https://server.appsonair.link/api/dynamic-link/" + str + "?domain=" + str2).addHeader(StringConst.ApplicatonKey, getAppsOnAirAppId$applink_release()).get().build(), null), continuation);
        }

        @NotNull
        public final String getAppsOnAirAppId$applink_release() {
            String str = AppLinkHandler.appsOnAirAppId;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("appsOnAirAppId");
            return null;
        }

        @JvmStatic
        @Nullable
        public final Object getReferralLinkByIP(@Nullable String str, @NotNull Continuation<? super JSONObject> continuation) {
            if (!NetworkWatcherService.INSTANCE.isNetworkConnected()) {
                return new JSONObject(MapsKt.mapOf(TuplesKt.to("error", StringConst.NetworkError)));
            }
            OkHttpClient okHttpClient = new OkHttpClient();
            Request.Builder addHeader = new Request.Builder().url("https://server.appsonair.link/api/dynamic-link/referral/details").addHeader(StringConst.ApplicatonKey, getAppsOnAirAppId$applink_release());
            if (str == null) {
                str = "";
            }
            return AbstractC1455i.g(C1452g0.b(), new AppLinkHandler$Companion$getReferralLinkByIP$2(okHttpClient, addHeader.addHeader(Constants.USER_AGENT_HEADER_KEY, str).get().build(), null), continuation);
        }

        @JvmStatic
        public final void handleLinkCount(@NotNull final String linkId, @NotNull final String domain, final boolean isClicked, final boolean isFirstOpen, final boolean isInstall) {
            Intrinsics.checkNotNullParameter(linkId, "linkId");
            Intrinsics.checkNotNullParameter(domain, "domain");
            boolean isNetworkConnected = NetworkWatcherService.INSTANCE.isNetworkConnected();
            if (getAppsOnAirAppId$applink_release().length() == 0) {
                Log.e("AppLink", StringConst.AppIdMissing);
            } else if (isNetworkConnected) {
                new Thread(new Runnable() { // from class: com.appsonair.applink.services.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLinkHandler.Companion.m57handleLinkCount$lambda14(domain, linkId, isClicked, isFirstOpen, isInstall);
                    }
                }).start();
            } else {
                Log.e("error", StringConst.NetworkError);
            }
        }

        public final void setAppsOnAirAppId$applink_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            AppLinkHandler.appsOnAirAppId = str;
        }

        private Companion() {
        }
    }

    @JvmStatic
    @Nullable
    public static final Object createAppLink(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable Map<String, ? extends Object> map, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str5, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str6, @NotNull Continuation<? super JSONObject> continuation) {
        return INSTANCE.createAppLink(str, str2, str3, str4, map, bool, bool2, str5, bool3, bool4, str6, continuation);
    }

    @JvmStatic
    @Nullable
    public static final Object fetchAppLink(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super JSONObject> continuation) {
        return INSTANCE.fetchAppLink(str, str2, continuation);
    }

    @JvmStatic
    @Nullable
    public static final Object getReferralLinkByIP(@Nullable String str, @NotNull Continuation<? super JSONObject> continuation) {
        return INSTANCE.getReferralLinkByIP(str, continuation);
    }

    @JvmStatic
    public static final void handleLinkCount(@NotNull String str, @NotNull String str2, boolean z10, boolean z11, boolean z12) {
        INSTANCE.handleLinkCount(str, str2, z10, z11, z12);
    }
}
