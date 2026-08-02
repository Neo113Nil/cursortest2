package com.facebook.applinks;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.bolts.AppLink;
import com.facebook.bolts.AppLinkResolver;
import com.facebook.bolts.Continuation;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class FacebookAppLinkResolver implements AppLinkResolver {
    private static final String APP_LINK_ANDROID_TARGET_KEY = "android";
    private static final String APP_LINK_KEY = "app_links";
    private static final String APP_LINK_TARGET_APP_NAME_KEY = "app_name";
    private static final String APP_LINK_TARGET_CLASS_KEY = "class";
    private static final String APP_LINK_TARGET_PACKAGE_KEY = "package";
    private static final String APP_LINK_TARGET_SHOULD_FALLBACK_KEY = "should_fallback";
    private static final String APP_LINK_TARGET_URL_KEY = "url";
    private static final String APP_LINK_WEB_TARGET_KEY = "web";
    private final HashMap<Uri, AppLink> cachedAppLinks = new HashMap<>();

    static /* synthetic */ AppLink.Target access$000(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return getAndroidTargetFromJson(jSONObject);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
    }

    static /* synthetic */ Uri access$100(Uri uri, JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return getWebFallbackUriFromJson(uri, jSONObject);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
    }

    static /* synthetic */ HashMap access$200(FacebookAppLinkResolver facebookAppLinkResolver) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return facebookAppLinkResolver.cachedAppLinks;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
    }

    @Override // com.facebook.bolts.AppLinkResolver
    public Task<AppLink> getAppLinkFromUrlInBackground(final Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(uri);
            return getAppLinkFromUrlsInBackground(arrayList).onSuccess(new Continuation<Map<Uri, AppLink>, AppLink>() { // from class: com.facebook.applinks.FacebookAppLinkResolver.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.facebook.bolts.Continuation
                public AppLink then(Task<Map<Uri, AppLink>> resolveUrisTask) throws Exception {
                    return resolveUrisTask.getResult().get(uri);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public Task<Map<Uri, AppLink>> getAppLinkFromUrlsInBackground(List<Uri> uris) {
        AppLink appLink;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            final HashMap hashMap = new HashMap();
            final HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            for (Uri uri : uris) {
                synchronized (this.cachedAppLinks) {
                    appLink = this.cachedAppLinks.get(uri);
                }
                if (appLink != null) {
                    hashMap.put(uri, appLink);
                } else {
                    if (!hashSet.isEmpty()) {
                        sb.append(AbstractJsonLexerKt.COMMA);
                    }
                    sb.append(uri.toString());
                    hashSet.add(uri);
                }
            }
            if (hashSet.isEmpty()) {
                return Task.forResult(hashMap);
            }
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            Bundle bundle = new Bundle();
            bundle.putString("ids", sb.toString());
            bundle.putString(GraphRequest.FIELDS_PARAM, String.format("%s.fields(%s,%s)", APP_LINK_KEY, "android", "web"));
            new GraphRequest(AccessToken.getCurrentAccessToken(), "", bundle, null, new GraphRequest.Callback() { // from class: com.facebook.applinks.FacebookAppLinkResolver.2
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(GraphResponse response) {
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        FacebookRequestError error = response.getError();
                        if (error != null) {
                            taskCompletionSource.setError(error.getException());
                            return;
                        }
                        JSONObject graphObject = response.getGraphObject();
                        if (graphObject == null) {
                            taskCompletionSource.setResult(hashMap);
                            return;
                        }
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            Uri uri2 = (Uri) it.next();
                            if (graphObject.has(uri2.toString())) {
                                try {
                                    JSONObject jSONObject = graphObject.getJSONObject(uri2.toString()).getJSONObject(FacebookAppLinkResolver.APP_LINK_KEY);
                                    JSONArray jSONArray = jSONObject.getJSONArray("android");
                                    int length = jSONArray.length();
                                    ArrayList arrayList = new ArrayList(length);
                                    for (int i = 0; i < length; i++) {
                                        AppLink.Target access$000 = FacebookAppLinkResolver.access$000(jSONArray.getJSONObject(i));
                                        if (access$000 != null) {
                                            arrayList.add(access$000);
                                        }
                                    }
                                    AppLink appLink2 = new AppLink(uri2, arrayList, FacebookAppLinkResolver.access$100(uri2, jSONObject));
                                    hashMap.put(uri2, appLink2);
                                    synchronized (FacebookAppLinkResolver.access$200(FacebookAppLinkResolver.this)) {
                                        FacebookAppLinkResolver.access$200(FacebookAppLinkResolver.this).put(uri2, appLink2);
                                    }
                                } catch (JSONException unused) {
                                    continue;
                                }
                            }
                        }
                        taskCompletionSource.setResult(hashMap);
                    } catch (Throwable th) {
                        CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            }).executeAsync();
            return taskCompletionSource.getTask();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private static AppLink.Target getAndroidTargetFromJson(JSONObject targetJson) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            String tryGetStringFromJson = tryGetStringFromJson(targetJson, "package", null);
            if (tryGetStringFromJson == null) {
                return null;
            }
            String tryGetStringFromJson2 = tryGetStringFromJson(targetJson, "class", null);
            String tryGetStringFromJson3 = tryGetStringFromJson(targetJson, "app_name", null);
            String tryGetStringFromJson4 = tryGetStringFromJson(targetJson, "url", null);
            return new AppLink.Target(tryGetStringFromJson, tryGetStringFromJson2, tryGetStringFromJson4 != null ? Uri.parse(tryGetStringFromJson4) : null, tryGetStringFromJson3);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
    }

    private static Uri getWebFallbackUriFromJson(Uri sourceUrl, JSONObject urlData) {
        JSONObject jSONObject;
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            jSONObject = urlData.getJSONObject("web");
        } catch (JSONException unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
        if (!tryGetBooleanFromJson(jSONObject, APP_LINK_TARGET_SHOULD_FALLBACK_KEY, true)) {
            return null;
        }
        String tryGetStringFromJson = tryGetStringFromJson(jSONObject, "url", null);
        Uri parse = tryGetStringFromJson != null ? Uri.parse(tryGetStringFromJson) : null;
        return parse != null ? parse : sourceUrl;
    }

    private static String tryGetStringFromJson(JSONObject json, String propertyName, String defaultValue) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return json.getString(propertyName);
        } catch (JSONException unused) {
            return defaultValue;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
    }

    private static boolean tryGetBooleanFromJson(JSONObject json, String propertyName, boolean defaultValue) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return false;
        }
        try {
            return json.getBoolean(propertyName);
        } catch (JSONException unused) {
            return defaultValue;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return false;
        }
    }
}
