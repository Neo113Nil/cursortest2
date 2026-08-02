package org.apache.cordova.facebook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.CallbackManager;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.applinks.AppLinkData;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.share.Sharer;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.GameRequestDialog;
import com.facebook.share.widget.MessageDialog;
import com.facebook.share.widget.ShareDialog;
import com.google.android.exoplayer2.C;
import com.ironsource.X3;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ConnectPlugin extends CordovaPlugin {
    private static final Date DEFAULT_EXPIRATION_TIME;
    private static final String FACEBOOK_GRAPH_API_VERSION = "v24.0";
    private static final int INVALID_ERROR_CODE = -2;
    private static final String MANAGE_PERMISSION_PREFIX = "manage";
    private static final Date MAX_DATE;
    private static final Set<String> OTHER_PUBLISH_PERMISSIONS;
    private static final String PUBLISH_PERMISSION_PREFIX = "publish";
    private CallbackManager callbackManager;
    private GameRequestDialog gameRequestDialog;
    private String graphPath;
    private MessageDialog messageDialog;
    private ShareDialog shareDialog;
    private final String TAG = "ConnectPlugin";
    private CallbackContext loginContext = null;
    private CallbackContext showDialogContext = null;
    private CallbackContext lastGraphContext = null;

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        OTHER_PUBLISH_PERMISSIONS = new HashSet<String>() { // from class: org.apache.cordova.facebook.ConnectPlugin.1
            {
                add("ads_management");
                add("create_event");
                add("rsvp_event");
            }
        };
    }

    @Override // org.apache.cordova.CordovaPlugin
    protected void pluginInitialize() {
        FacebookSdk.sdkInitialize(this.f3354cordova.getActivity().getApplicationContext());
        FacebookSdk.setGraphApiVersion(FACEBOOK_GRAPH_API_VERSION);
        Log.v("Facebook SDK", String.format("FB SDK Version: %s", FacebookSdk.getSdkVersion()));
        this.callbackManager = CallbackManager.Factory.create();
        this.f3354cordova.setActivityResultCallback(this);
        LoginManager.getInstance().registerCallback(this.callbackManager, new FacebookCallback<LoginResult>() { // from class: org.apache.cordova.facebook.ConnectPlugin.2
            @Override // com.facebook.FacebookCallback
            public void onSuccess(LoginResult loginResult) {
                GraphRequest.newMeRequest(loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback() { // from class: org.apache.cordova.facebook.ConnectPlugin.2.1
                    @Override // com.facebook.GraphRequest.GraphJSONObjectCallback
                    public void onCompleted(JSONObject jSONObject, GraphResponse graphResponse) {
                        if (graphResponse.getError() != null) {
                            if (ConnectPlugin.this.lastGraphContext != null) {
                                ConnectPlugin.this.lastGraphContext.error(ConnectPlugin.this.getFacebookRequestErrorResponse(graphResponse.getError()));
                                return;
                            } else {
                                if (ConnectPlugin.this.loginContext != null) {
                                    ConnectPlugin.this.loginContext.error(ConnectPlugin.this.getFacebookRequestErrorResponse(graphResponse.getError()));
                                    return;
                                }
                                return;
                            }
                        }
                        if (ConnectPlugin.this.lastGraphContext != null) {
                            ConnectPlugin.this.makeGraphCall(ConnectPlugin.this.lastGraphContext);
                        } else if (ConnectPlugin.this.loginContext != null) {
                            Log.d("ConnectPlugin", "returning login object " + jSONObject.toString());
                            ConnectPlugin.this.loginContext.success(ConnectPlugin.this.getResponse());
                            ConnectPlugin.this.loginContext = null;
                        }
                    }
                }).executeAsync();
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                FacebookOperationCanceledException facebookOperationCanceledException = new FacebookOperationCanceledException();
                ConnectPlugin connectPlugin = ConnectPlugin.this;
                connectPlugin.handleError(facebookOperationCanceledException, connectPlugin.lastGraphContext != null ? ConnectPlugin.this.lastGraphContext : ConnectPlugin.this.loginContext);
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                Log.e("Activity", String.format("Error: %s", facebookException.toString()));
                ConnectPlugin connectPlugin = ConnectPlugin.this;
                connectPlugin.handleError(facebookException, connectPlugin.lastGraphContext != null ? ConnectPlugin.this.lastGraphContext : ConnectPlugin.this.loginContext);
                if (!(facebookException instanceof FacebookAuthorizationException) || AccessToken.getCurrentAccessToken() == null) {
                    return;
                }
                LoginManager.getInstance().logOut();
            }
        });
        ShareDialog shareDialog = new ShareDialog(this.f3354cordova.getActivity());
        this.shareDialog = shareDialog;
        shareDialog.registerCallback(this.callbackManager, new FacebookCallback<Sharer.Result>() { // from class: org.apache.cordova.facebook.ConnectPlugin.3
            @Override // com.facebook.FacebookCallback
            public void onSuccess(Sharer.Result result) {
                if (ConnectPlugin.this.showDialogContext != null) {
                    ConnectPlugin.this.showDialogContext.success();
                    ConnectPlugin.this.showDialogContext = null;
                }
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                FacebookOperationCanceledException facebookOperationCanceledException = new FacebookOperationCanceledException();
                ConnectPlugin connectPlugin = ConnectPlugin.this;
                connectPlugin.handleError(facebookOperationCanceledException, connectPlugin.showDialogContext);
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                Log.e("Activity", String.format("Error: %s", facebookException.toString()));
                ConnectPlugin connectPlugin = ConnectPlugin.this;
                connectPlugin.handleError(facebookException, connectPlugin.showDialogContext);
            }
        });
        MessageDialog messageDialog = new MessageDialog(this.f3354cordova.getActivity());
        this.messageDialog = messageDialog;
        messageDialog.registerCallback(this.callbackManager, new FacebookCallback<Sharer.Result>() { // from class: org.apache.cordova.facebook.ConnectPlugin.4
            @Override // com.facebook.FacebookCallback
            public void onSuccess(Sharer.Result result) {
                if (ConnectPlugin.this.showDialogContext != null) {
                    ConnectPlugin.this.showDialogContext.success();
                    ConnectPlugin.this.showDialogContext = null;
                }
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                FacebookOperationCanceledException facebookOperationCanceledException = new FacebookOperationCanceledException();
                ConnectPlugin connectPlugin = ConnectPlugin.this;
                connectPlugin.handleError(facebookOperationCanceledException, connectPlugin.showDialogContext);
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                Log.e("Activity", String.format("Error: %s", facebookException.toString()));
                ConnectPlugin connectPlugin = ConnectPlugin.this;
                connectPlugin.handleError(facebookException, connectPlugin.showDialogContext);
            }
        });
        GameRequestDialog gameRequestDialog = new GameRequestDialog(this.f3354cordova.getActivity());
        this.gameRequestDialog = gameRequestDialog;
        gameRequestDialog.registerCallback(this.callbackManager, new FacebookCallback<GameRequestDialog.Result>() { // from class: org.apache.cordova.facebook.ConnectPlugin.5
            @Override // com.facebook.FacebookCallback
            public void onSuccess(GameRequestDialog.Result result) {
                if (ConnectPlugin.this.showDialogContext != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("requestId", result.getRequestId());
                        jSONObject.put("recipientsIds", new JSONArray((Collection) result.getRequestRecipients()));
                        ConnectPlugin.this.showDialogContext.success(jSONObject);
                        ConnectPlugin.this.showDialogContext = null;
                    } catch (JSONException unused) {
                        ConnectPlugin.this.showDialogContext.success();
                        ConnectPlugin.this.showDialogContext = null;
                    }
                }
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                FacebookOperationCanceledException facebookOperationCanceledException = new FacebookOperationCanceledException();
                ConnectPlugin connectPlugin = ConnectPlugin.this;
                connectPlugin.handleError(facebookOperationCanceledException, connectPlugin.showDialogContext);
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                Log.e("Activity", String.format("Error: %s", facebookException.toString()));
                ConnectPlugin connectPlugin = ConnectPlugin.this;
                connectPlugin.handleError(facebookException, connectPlugin.showDialogContext);
            }
        });
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onResume(boolean z) {
        super.onResume(z);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.d("ConnectPlugin", "activity result in plugin: requestCode(" + i + "), resultCode(" + i2 + ")");
        this.callbackManager.onActivityResult(i, i2, intent);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        if (str.equals("login")) {
            executeLogin(jSONArray, callbackContext);
            return true;
        }
        if (str.equals("logout")) {
            if (hasAccessToken()) {
                LoginManager.getInstance().logOut();
                callbackContext.success();
            } else {
                callbackContext.error("Session not open");
            }
            return true;
        }
        if (str.equals("getLoginStatus")) {
            callbackContext.success(getResponse());
            return true;
        }
        if (str.equals("getAccessToken")) {
            if (hasAccessToken()) {
                callbackContext.success(AccessToken.getCurrentAccessToken().getToken());
            } else {
                callbackContext.error("Session not open");
            }
            return true;
        }
        if (str.equals("updateAccessTokenString")) {
            updateAccessTokenString(jSONArray, callbackContext);
            return true;
        }
        if (str.equals("logEvent")) {
            executeLogEvent(jSONArray, callbackContext);
            return true;
        }
        if (str.equals("logPurchase")) {
            if (jSONArray.length() != 2) {
                callbackContext.error("Invalid arguments");
                return true;
            }
            new BigDecimal(jSONArray.getString(0));
            jSONArray.getString(1);
            callbackContext.success();
            return true;
        }
        if (str.equals("showDialog")) {
            if (hasAccessToken()) {
                executeDialog(jSONArray, callbackContext);
            } else {
                callbackContext.error("Session not open");
            }
            return true;
        }
        if (str.equals("graphApi")) {
            if (hasAccessToken()) {
                executeGraph(jSONArray, callbackContext);
            } else {
                callbackContext.error("Session not open");
            }
            return true;
        }
        if (str.equals("getDeferredApplink")) {
            executeGetDeferredApplink(jSONArray, callbackContext);
            return true;
        }
        if (str.equals("activateApp")) {
            this.f3354cordova.getThreadPool().execute(new Runnable() { // from class: org.apache.cordova.facebook.ConnectPlugin.6
                @Override // java.lang.Runnable
                public void run() {
                }
            });
            return true;
        }
        if (str.equals("getApplicationId")) {
            getApplicationId(jSONArray, callbackContext);
            return true;
        }
        if (str.equals("setApplicationId")) {
            setApplicationId(jSONArray, callbackContext);
            return true;
        }
        if (str.equals("getApplicationName")) {
            getApplicationName(jSONArray, callbackContext);
            return true;
        }
        if (str.equals("setApplicationName")) {
            setApplicationName(jSONArray, callbackContext);
            return true;
        }
        if (str.equals("getClientToken")) {
            getClientToken(jSONArray, callbackContext);
            return true;
        }
        if (str.equals("setClientToken")) {
            setClientToken(jSONArray, callbackContext);
            return true;
        }
        if (!str.equals("setDataProcessingOptions")) {
            return false;
        }
        setDataProcessingOptions(jSONArray, callbackContext);
        return true;
    }

    private void getApplicationId(JSONArray jSONArray, CallbackContext callbackContext) {
        callbackContext.success(FacebookSdk.getApplicationId());
    }

    private void setApplicationId(JSONArray jSONArray, CallbackContext callbackContext) {
        String str;
        try {
            str = jSONArray.getString(0);
        } catch (JSONException unused) {
            Log.w("ConnectPlugin", "Application Id not found");
            str = null;
        }
        if (str != null && !str.isEmpty()) {
            FacebookSdk.setApplicationId(str);
            callbackContext.success();
        } else {
            callbackContext.error("Application Id not found");
        }
    }

    private void getApplicationName(JSONArray jSONArray, CallbackContext callbackContext) {
        callbackContext.success(FacebookSdk.getApplicationName());
    }

    private void setApplicationName(JSONArray jSONArray, CallbackContext callbackContext) {
        String str;
        try {
            str = jSONArray.getString(0);
        } catch (JSONException unused) {
            Log.w("ConnectPlugin", "Application Name not found");
            str = null;
        }
        if (str != null && !str.isEmpty()) {
            FacebookSdk.setApplicationName(str);
            callbackContext.success();
        } else {
            callbackContext.error("Application Name not found");
        }
    }

    private void getClientToken(JSONArray jSONArray, CallbackContext callbackContext) {
        callbackContext.success(FacebookSdk.getClientToken());
    }

    private void setClientToken(JSONArray jSONArray, CallbackContext callbackContext) {
        String str;
        try {
            str = jSONArray.getString(0);
        } catch (JSONException unused) {
            Log.w("ConnectPlugin", "Client Token not found");
            str = null;
        }
        if (str != null && !str.isEmpty()) {
            FacebookSdk.setClientToken(str);
            callbackContext.success();
        } else {
            callbackContext.error("Client Token not found");
        }
    }

    private void setDataProcessingOptions(JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        if (jSONArray.length() == 0) {
            callbackContext.error("Invalid arguments");
            return;
        }
        JSONArray jSONArray2 = jSONArray.getJSONArray(0);
        String[] strArr = new String[jSONArray2.length()];
        for (int i = 0; i < jSONArray2.length(); i++) {
            strArr[i] = jSONArray2.getString(i);
        }
        if (jSONArray.length() == 1) {
            FacebookSdk.setDataProcessingOptions(strArr);
        } else {
            FacebookSdk.setDataProcessingOptions(strArr, Integer.valueOf(jSONArray.getInt(1)).intValue(), Integer.valueOf(jSONArray.getInt(2)).intValue());
        }
        callbackContext.success();
    }

    private void executeGetDeferredApplink(JSONArray jSONArray, final CallbackContext callbackContext) {
        AppLinkData.fetchDeferredAppLinkData(this.f3354cordova.getActivity().getApplicationContext(), new AppLinkData.CompletionHandler() { // from class: org.apache.cordova.facebook.ConnectPlugin.7
            @Override // com.facebook.applinks.AppLinkData.CompletionHandler
            public void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {
                PluginResult pluginResult;
                if (appLinkData == null) {
                    pluginResult = new PluginResult(PluginResult.Status.OK, "");
                } else {
                    pluginResult = new PluginResult(PluginResult.Status.OK, appLinkData.getTargetUri().toString());
                }
                callbackContext.sendPluginResult(pluginResult);
            }
        });
    }

    private void executeDialog(JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        JSONObject jSONObject;
        HashMap hashMap = new HashMap();
        try {
            jSONObject = jSONArray.getJSONObject(0);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        Iterator<String> keys = jSONObject.keys();
        String str = null;
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.equals("method")) {
                try {
                    str = jSONObject.getString(next);
                } catch (JSONException unused2) {
                    Log.w("ConnectPlugin", "Nonstring method parameter provided to dialog");
                }
            } else {
                try {
                    hashMap.put(next, jSONObject.getString(next));
                } catch (JSONException unused3) {
                    Log.w("ConnectPlugin", "Non-string parameter provided to dialog discarded");
                }
            }
        }
        if (str == null) {
            callbackContext.error("No method provided");
            return;
        }
        if (str.equalsIgnoreCase("apprequests")) {
            if (!GameRequestDialog.canShow()) {
                callbackContext.error("Cannot show dialog");
                return;
            }
            this.showDialogContext = callbackContext;
            PluginResult pluginResult = new PluginResult(PluginResult.Status.NO_RESULT);
            pluginResult.setKeepCallback(true);
            this.showDialogContext.sendPluginResult(pluginResult);
            GameRequestContent.Builder builder = new GameRequestContent.Builder();
            if (hashMap.containsKey("message")) {
                builder.setMessage(hashMap.get("message"));
            }
            if (hashMap.containsKey("to")) {
                builder.setTo(hashMap.get("to"));
            }
            if (hashMap.containsKey("data")) {
                builder.setData(hashMap.get("data"));
            }
            if (hashMap.containsKey("title")) {
                builder.setTitle(hashMap.get("title"));
            }
            if (hashMap.containsKey("objectId")) {
                builder.setObjectId(hashMap.get("objectId"));
            }
            if (hashMap.containsKey(SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE)) {
                try {
                    builder.setActionType(GameRequestContent.ActionType.valueOf(hashMap.get(SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE)));
                } catch (IllegalArgumentException unused4) {
                    Log.w("ConnectPlugin", "Discarding invalid argument actionType");
                }
            }
            if (hashMap.containsKey("filters")) {
                try {
                    builder.setFilters(GameRequestContent.Filters.valueOf(hashMap.get("filters")));
                } catch (IllegalArgumentException unused5) {
                    Log.w("ConnectPlugin", "Discarding invalid argument filters");
                }
            }
            this.f3354cordova.setActivityResultCallback(this);
            this.gameRequestDialog.show(builder.build());
            return;
        }
        if (str.equalsIgnoreCase("share") || str.equalsIgnoreCase("feed")) {
            if (!ShareDialog.canShow((Class<? extends ShareContent<?, ?>>) ShareLinkContent.class)) {
                callbackContext.error("Cannot show dialog");
                return;
            }
            this.showDialogContext = callbackContext;
            PluginResult pluginResult2 = new PluginResult(PluginResult.Status.NO_RESULT);
            pluginResult2.setKeepCallback(true);
            this.showDialogContext.sendPluginResult(pluginResult2);
            ShareLinkContent buildContent = buildContent(hashMap);
            this.f3354cordova.setActivityResultCallback(this);
            this.shareDialog.show(buildContent);
            return;
        }
        if (str.equalsIgnoreCase("share_open_graph")) {
            Log.e("ConnectPlugin.executeDialog", String.format("share_open_graph not implemented %s\n%s", "share_open_graph not implemented removed deprecated 14.0.0 fb sdk", "https://github.com/facebook/facebook-android-sdk/blob/main/CHANGELOG.md#1400"));
            return;
        }
        if (str.equalsIgnoreCase("send")) {
            if (!MessageDialog.canShow((Class<? extends ShareContent<?, ?>>) ShareLinkContent.class)) {
                callbackContext.error("Cannot show dialog");
                return;
            }
            this.showDialogContext = callbackContext;
            PluginResult pluginResult3 = new PluginResult(PluginResult.Status.NO_RESULT);
            pluginResult3.setKeepCallback(true);
            this.showDialogContext.sendPluginResult(pluginResult3);
            ShareLinkContent.Builder builder2 = new ShareLinkContent.Builder();
            if (hashMap.containsKey("link")) {
                builder2.setContentUrl(Uri.parse(hashMap.get("link")));
            }
            this.messageDialog.show(builder2.build());
            return;
        }
        callbackContext.error("Unsupported dialog method.");
    }

    private void executeGraph(JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        String str;
        this.lastGraphContext = callbackContext;
        PluginResult pluginResult = new PluginResult(PluginResult.Status.NO_RESULT);
        pluginResult.setKeepCallback(true);
        callbackContext.sendPluginResult(pluginResult);
        boolean z = false;
        this.graphPath = jSONArray.getString(0);
        JSONArray jSONArray2 = jSONArray.getJSONArray(1);
        HashSet hashSet = new HashSet(jSONArray2.length());
        for (int i = 0; i < jSONArray2.length(); i++) {
            hashSet.add(jSONArray2.getString(i));
        }
        if (hashSet.size() == 0) {
            makeGraphCall(callbackContext);
            return;
        }
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (currentAccessToken.getPermissions().containsAll(hashSet)) {
            makeGraphCall(callbackContext);
            return;
        }
        Set<String> declinedPermissions = currentAccessToken.getDeclinedPermissions();
        Iterator it = hashSet.iterator();
        boolean z2 = false;
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (declinedPermissions.contains(str2)) {
                str = str2;
                break;
            }
            if (isPublishPermission(str2)) {
                z = true;
            } else {
                z2 = true;
            }
            if (z && z2) {
                break;
            }
        }
        if (str != null) {
            callbackContext.error("This request needs declined permission: " + str);
            return;
        }
        if (z && z2) {
            callbackContext.error("Cannot ask for both read and publish permissions.");
            return;
        }
        this.f3354cordova.setActivityResultCallback(this);
        LoginManager loginManager = LoginManager.getInstance();
        if (z) {
            loginManager.logInWithPublishPermissions(this.f3354cordova.getActivity(), hashSet);
        } else {
            loginManager.logInWithReadPermissions(this.f3354cordova.getActivity(), hashSet);
        }
    }

    private void executeLogEvent(JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        if (jSONArray.length() == 0) {
            callbackContext.error("Invalid arguments");
            return;
        }
        jSONArray.getString(0);
        if (jSONArray.length() == 1) {
            callbackContext.success();
            return;
        }
        JSONObject jSONObject = jSONArray.getJSONObject(1);
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
                Log.w("ConnectPlugin", "Type in AppEvent parameters was not String for key: " + next);
                try {
                    bundle.putInt(next, jSONObject.getInt(next));
                } catch (JSONException unused2) {
                    Log.e("ConnectPlugin", "Unsupported type in AppEvent parameters for key: " + next);
                }
            }
        }
        if (jSONArray.length() == 2) {
            callbackContext.success();
        }
        if (jSONArray.length() == 3) {
            jSONArray.getDouble(2);
            callbackContext.success();
        }
    }

    private void executeLogin(JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        Log.d("ConnectPlugin", "login FB");
        this.lastGraphContext = null;
        HashSet hashSet = new HashSet(jSONArray.length());
        boolean z = false;
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        this.loginContext = callbackContext;
        PluginResult pluginResult = new PluginResult(PluginResult.Status.NO_RESULT);
        pluginResult.setKeepCallback(true);
        this.loginContext.sendPluginResult(pluginResult);
        if (!hasAccessToken()) {
            this.f3354cordova.setActivityResultCallback(this);
            LoginManager.getInstance().logInWithReadPermissions(this.f3354cordova.getActivity(), hashSet);
            return;
        }
        boolean z2 = hashSet.size() == 0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (isPublishPermission((String) it.next())) {
                z = true;
            } else {
                z2 = true;
            }
            if (z && z2) {
                break;
            }
        }
        if (z && z2) {
            this.loginContext.error("Cannot ask for both read and publish permissions.");
            this.loginContext = null;
            return;
        }
        this.f3354cordova.setActivityResultCallback(this);
        if (z) {
            LoginManager.getInstance().logInWithPublishPermissions(this.f3354cordova.getActivity(), hashSet);
        } else {
            LoginManager.getInstance().logInWithReadPermissions(this.f3354cordova.getActivity(), hashSet);
        }
    }

    private void updateAccessTokenString(JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        String str;
        String str2;
        String str3;
        try {
            str = jSONArray.getString(0);
        } catch (JSONException unused) {
            str = null;
        }
        try {
            str2 = jSONArray.getString(1);
        } catch (JSONException unused2) {
            Log.w("ConnectPlugin", "Access Token String not found");
            str2 = "0";
            str3 = str;
            if (str3 == null) {
            }
            callbackContext.error("Access Token String not found");
        }
        str3 = str;
        if (str3 == null && !str3.isEmpty()) {
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            AccessToken.setCurrentAccessToken(new AccessToken(str3, currentAccessToken.getApplicationId(), currentAccessToken.getUserId(), currentAccessToken.getPermissions(), currentAccessToken.getDeclinedPermissions(), currentAccessToken.getExpiredPermissions(), AccessTokenSource.FACEBOOK_APPLICATION_NATIVE, new Date(System.currentTimeMillis() + (Long.parseLong(str2, 10) * 1000)), new Date(System.currentTimeMillis()), null));
            callbackContext.success();
            return;
        }
        callbackContext.error("Access Token String not found");
    }

    private ShareLinkContent buildContent(Map<String, String> map) {
        ShareLinkContent.Builder builder = new ShareLinkContent.Builder();
        if (map.containsKey("href")) {
            builder.setContentUrl(Uri.parse(map.get("href")));
        }
        if (map.containsKey("link")) {
            builder.setContentUrl(Uri.parse(map.get("link")));
        }
        if (map.containsKey(ShareConstants.WEB_DIALOG_PARAM_QUOTE)) {
            builder.setQuote(map.get(ShareConstants.WEB_DIALOG_PARAM_QUOTE));
        }
        if (map.containsKey(ShareConstants.WEB_DIALOG_PARAM_HASHTAG)) {
            builder.setShareHashtag(new ShareHashtag.Builder().setHashtag(map.get(ShareConstants.WEB_DIALOG_PARAM_HASHTAG)).build());
        }
        return builder.build();
    }

    private boolean hasAccessToken() {
        if (AccessToken.getCurrentAccessToken() == null) {
            return false;
        }
        return !r0.isExpired();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleError(FacebookException facebookException, CallbackContext callbackContext) {
        int i;
        if (facebookException.getMessage() != null) {
            Log.e("ConnectPlugin", facebookException.toString());
        }
        String str = "Facebook error: " + facebookException.getMessage();
        if (facebookException instanceof FacebookOperationCanceledException) {
            str = "User cancelled dialog";
            i = 4201;
        } else {
            if (facebookException instanceof FacebookDialogException) {
                str = "Dialog error: " + facebookException.getMessage();
            }
            i = -2;
        }
        if (callbackContext != null) {
            callbackContext.error(getErrorResponse(facebookException, str, i));
        } else {
            Log.e("ConnectPlugin", "Error already sent so no context, msg: " + str + ", code: " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeGraphCall(final CallbackContext callbackContext) {
        try {
            this.graphPath = URLDecoder.decode(this.graphPath, C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String[] split = this.graphPath.split("\\?");
        GraphRequest newGraphPathRequest = GraphRequest.newGraphPathRequest(AccessToken.getCurrentAccessToken(), split[0], new GraphRequest.Callback() { // from class: org.apache.cordova.facebook.ConnectPlugin.8
            @Override // com.facebook.GraphRequest.Callback
            public void onCompleted(GraphResponse graphResponse) {
                if (callbackContext != null) {
                    if (graphResponse.getError() != null) {
                        callbackContext.error(ConnectPlugin.this.getFacebookRequestErrorResponse(graphResponse.getError()));
                    } else {
                        callbackContext.success(graphResponse.getGraphObject());
                    }
                    ConnectPlugin.this.graphPath = null;
                }
            }
        });
        Bundle parameters = newGraphPathRequest.getParameters();
        if (split.length > 1) {
            for (String str : split[1].split(X3.j.c)) {
                int indexOf = str.indexOf("=");
                if (indexOf > 0) {
                    parameters.putString(str.substring(0, indexOf), str.substring(indexOf + 1, str.length()));
                }
            }
        }
        newGraphPathRequest.setParameters(parameters);
        newGraphPathRequest.executeAsync();
    }

    private boolean isPublishPermission(String str) {
        if (str != null) {
            return str.startsWith(PUBLISH_PERMISSION_PREFIX) || str.startsWith(MANAGE_PERMISSION_PREFIX) || OTHER_PUBLISH_PERMISSIONS.contains(str);
        }
        return false;
    }

    public JSONObject getResponse() {
        String str;
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (hasAccessToken()) {
            Date date = new Date();
            long j = 0;
            if (!currentAccessToken.getExpires().equals(DEFAULT_EXPIRATION_TIME)) {
                long time = (currentAccessToken.getExpires().getTime() - date.getTime()) / 1000;
                if (time >= 0) {
                    j = time;
                }
            }
            str = "{\"status\": \"connected\",\"authResponse\": {\"accessToken\": \"" + currentAccessToken.getToken() + "\",\"expiresIn\": \"" + j + "\",\"session_key\": true,\"sig\": \"...\",\"userID\": \"" + currentAccessToken.getUserId() + "\"}}";
        } else {
            str = "{\"status\": \"unknown\"}";
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public JSONObject getFacebookRequestErrorResponse(FacebookRequestError facebookRequestError) {
        String str = "{\"errorCode\": \"" + facebookRequestError.getErrorCode() + "\",\"errorType\": \"" + facebookRequestError.getErrorType() + "\",\"errorMessage\": \"" + facebookRequestError.getErrorMessage() + "\"";
        if (facebookRequestError.getErrorUserMessage() != null) {
            str = str + ",\"errorUserMessage\": \"" + facebookRequestError.getErrorUserMessage() + "\"";
        }
        if (facebookRequestError.getErrorUserTitle() != null) {
            str = str + ",\"errorUserTitle\": \"" + facebookRequestError.getErrorUserTitle() + "\"";
        }
        try {
            return new JSONObject(str + "}");
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public JSONObject getErrorResponse(Exception exc, String str, int i) {
        String str2;
        if (exc instanceof FacebookServiceException) {
            return getFacebookRequestErrorResponse(((FacebookServiceException) exc).getRequestError());
        }
        if (exc instanceof FacebookDialogException) {
            i = ((FacebookDialogException) exc).getErrorCode();
        }
        if (i == -2) {
            str2 = "{";
        } else {
            str2 = "{\"errorCode\": \"" + i + "\",";
        }
        if (str == null) {
            str = exc.getMessage();
        }
        try {
            return new JSONObject(str2 + "\"errorMessage\": \"" + str + "\"}");
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    private static Object wrapObject(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            return new JSONArray(obj);
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj);
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }
}
