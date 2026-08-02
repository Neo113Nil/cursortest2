package com.intercom.reactnative;

import android.app.Activity;
import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.google.firebase.messaging.RemoteMessage;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.IntercomContent;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomSpace;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.api.ReactNativeHeaderInterceptor;
import io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback;
import io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback;
import io.intercom.android.sdk.helpcenter.api.HelpCenterArticleSearchResult;
import io.intercom.android.sdk.helpcenter.api.SearchRequestCallback;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.push.IntercomPushClient;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import java.util.List;
import java.util.Map;

@ReactModule(name = "IntercomModule")
/* loaded from: classes8.dex */
public class IntercomModule extends NativeIntercomSpecSpec {
    public static final String NAME = "IntercomModule";
    private static final IntercomPushClient intercomPushClient = new IntercomPushClient();

    public IntercomModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IntercomModule";
    }

    public static boolean isIntercomPush(RemoteMessage remoteMessage) {
        try {
            return intercomPushClient.isIntercomPush(remoteMessage.getData());
        } catch (Exception e) {
            Log.e("IntercomModule", "isIntercomPush error:");
            Log.e("IntercomModule", e.toString());
            return false;
        }
    }

    public static void handleRemotePushWithCustomStack(Application application, RemoteMessage remoteMessage, TaskStackBuilder taskStackBuilder) {
        try {
            if (remoteMessage == null) {
                Log.w("IntercomModule", "handleRemotePushWithCustomStack: remoteMessage is null");
                return;
            }
            Map<String, String> data = remoteMessage.getData();
            if (data == null) {
                Log.w("IntercomModule", "handleRemotePushWithCustomStack: message is null");
            } else {
                intercomPushClient.handlePushWithCustomStack(application, data, taskStackBuilder);
            }
        } catch (Exception e) {
            Log.e("IntercomModule", "handlePushWithCustomStack error:");
            Log.e("IntercomModule", e.toString());
        }
    }

    public static void handleRemotePushMessage(Application application, RemoteMessage remoteMessage) {
        try {
            TaskStackBuilder create = TaskStackBuilder.create(application);
            Intent launchIntentForPackage = application.getPackageManager().getLaunchIntentForPackage(application.getPackageName());
            if (launchIntentForPackage != null) {
                create.addNextIntent(launchIntentForPackage);
            }
            handleRemotePushWithCustomStack(application, remoteMessage, create);
        } catch (Exception e) {
            Log.e("IntercomModule", "handleRemotePushMessage error:");
            Log.e("IntercomModule", e.toString());
        }
    }

    public static void sendTokenToIntercom(Application application, String str) {
        if (application == null || str == null || str.isEmpty()) {
            Log.w("IntercomModule", "sendTokenToIntercom: application or token is null or empty");
            return;
        }
        try {
            intercomPushClient.sendTokenToIntercom(application, str);
            Log.d("IntercomModule", "sendTokenToIntercom");
        } catch (Exception e) {
            Log.e("IntercomModule", "sendTokenToIntercom error:");
            Log.e("IntercomModule", e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void handlePushMessage(Promise promise) {
        try {
            Intercom.client().handlePushMessage();
            promise.resolve(true);
            Log.d("IntercomModule", "handlePushMessage");
        } catch (Exception e) {
            Log.e("IntercomModule", "handlePushMessage error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.HANDLE_PUSH_MESSAGE, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void sendTokenToIntercom(String str, Promise promise) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    Activity currentActivity = getCurrentActivity();
                    if (currentActivity != null && currentActivity.getApplication() != null) {
                        intercomPushClient.sendTokenToIntercom(currentActivity.getApplication(), str);
                        Log.d("IntercomModule", "sendTokenToIntercom");
                        promise.resolve(true);
                        return;
                    } else {
                        Log.e("IntercomModule", "sendTokenToIntercom");
                        Log.e("IntercomModule", "no current activity");
                        promise.reject(IntercomErrorCodes.SEND_TOKEN_TO_INTERCOM, "no current activity");
                        return;
                    }
                }
            } catch (Exception e) {
                Log.e("IntercomModule", "sendTokenToIntercom error:");
                Log.e("IntercomModule", e.toString());
                promise.reject(IntercomErrorCodes.SEND_TOKEN_TO_INTERCOM, e.toString());
                return;
            }
        }
        Log.w("IntercomModule", "sendTokenToIntercom: token is null or empty");
        promise.reject(IntercomErrorCodes.SEND_TOKEN_TO_INTERCOM, "token is null or empty");
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void loginUnidentifiedUser(final Promise promise) {
        Intercom.client().loginUnidentifiedUser(new IntercomStatusCallback() { // from class: com.intercom.reactnative.IntercomModule.1
            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onSuccess() {
                promise.resolve(true);
            }

            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onFailure(IntercomError intercomError) {
                Log.e("ERROR", intercomError.getErrorMessage());
                promise.reject(String.valueOf(intercomError.getErrorCode()), intercomError.getErrorMessage());
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loginUserWithUserAttributes(ReadableMap readableMap, final Promise promise) {
        Registration registration;
        boolean z = readableMap.hasKey("email") && IntercomHelpers.getValueAsStringForKey(readableMap, "email").length() > 0;
        Boolean valueOf = Boolean.valueOf(z);
        boolean z2 = readableMap.hasKey("userId") && IntercomHelpers.getValueAsStringForKey(readableMap, "userId").length() > 0;
        Boolean valueOf2 = Boolean.valueOf(z2);
        valueOf.getClass();
        if (z) {
            valueOf2.getClass();
            if (z2) {
                registration = new Registration().withEmail(IntercomHelpers.getValueAsStringForKey(readableMap, "email")).withUserId(IntercomHelpers.getValueAsStringForKey(readableMap, "userId"));
                if (registration == null) {
                    Intercom.client().loginIdentifiedUser(registration, new IntercomStatusCallback() { // from class: com.intercom.reactnative.IntercomModule.2
                        @Override // io.intercom.android.sdk.IntercomStatusCallback
                        public void onSuccess() {
                            promise.resolve(true);
                        }

                        @Override // io.intercom.android.sdk.IntercomStatusCallback
                        public void onFailure(IntercomError intercomError) {
                            Log.e("ERROR", intercomError.getErrorMessage());
                            promise.reject(String.valueOf(intercomError.getErrorCode()), intercomError.getErrorMessage());
                        }
                    });
                    return;
                }
                return;
            }
        }
        valueOf.getClass();
        if (z) {
            registration = new Registration().withEmail(IntercomHelpers.getValueAsStringForKey(readableMap, "email"));
        } else {
            valueOf2.getClass();
            if (z2) {
                registration = new Registration().withUserId(IntercomHelpers.getValueAsStringForKey(readableMap, "userId"));
            } else {
                Log.e("IntercomModule", "loginUserWithUserAttributes called with invalid userId or email");
                Log.e("IntercomModule", "You must provide userId or email");
                promise.reject(IntercomErrorCodes.IDENTIFIED_REGISTRATION, "Invalid userId or email");
                registration = null;
            }
        }
        if (registration == null) {
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void setUserHash(String str, Promise promise) {
        try {
            Intercom.client().setUserHash(str);
            promise.resolve(true);
        } catch (Exception e) {
            Log.e("IntercomModule", "setUserHash error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.SET_USER_HASH, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void updateUser(ReadableMap readableMap, final Promise promise) {
        Intercom.client().updateUser(IntercomHelpers.buildUserAttributes(readableMap), new IntercomStatusCallback() { // from class: com.intercom.reactnative.IntercomModule.3
            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onSuccess() {
                promise.resolve(true);
            }

            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onFailure(IntercomError intercomError) {
                Log.e("ERROR", intercomError.getErrorMessage());
                promise.reject(String.valueOf(intercomError.getErrorCode()), intercomError.getErrorMessage());
            }
        });
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void isUserLoggedIn(Promise promise) {
        promise.resolve(Boolean.valueOf(Intercom.client().isUserLoggedIn()));
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void fetchLoggedInUserAttributes(Promise promise) {
        promise.resolve(IntercomHelpers.deconstructRegistration(Intercom.client().fetchLoggedInUserAttributes()));
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void logout(Promise promise) {
        try {
            Intercom.client().logout();
            Log.d("IntercomModule", MetricTracker.Object.LOGOUT);
            promise.resolve(true);
        } catch (Exception e) {
            Log.e("IntercomModule", "logout error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.LOGOUT, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void getUnreadConversationCount(Promise promise) {
        try {
            promise.resolve(Integer.valueOf(Intercom.client().getUnreadConversationCount()));
            Log.d("IntercomModule", "getUnreadConversationCount");
        } catch (Exception e) {
            Log.e("IntercomModule", "getUnreadConversationCount error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.GET_UNREAD_CONVERSATION, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void setLogLevel(String str, Promise promise) {
        try {
            Intercom.setLogLevel(IntercomHelpers.stringToLogLevel(str));
            Log.d("IntercomModule", "setLogLevel");
            promise.resolve(true);
        } catch (Exception e) {
            Log.e("IntercomModule", "setLogLevel error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.SET_LOG_LEVEL, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, Promise promise) {
        try {
            if (readableMap != null) {
                Intercom.client().logEvent(str, IntercomHelpers.deconstructReadableMap(readableMap, false));
            } else {
                Intercom.client().logEvent(str);
            }
            Log.d("IntercomModule", "logEvent");
            promise.resolve(true);
        } catch (Exception e) {
            Log.e("IntercomModule", "logEvent error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.LOG_EVENT_HASH, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void presentIntercom(Promise promise) {
        try {
            Intercom.client().present();
            promise.resolve(true);
        } catch (Exception e) {
            Log.e("IntercomModule", "presentMessenger error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.DISPLAY_MESSENGER, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void presentIntercomSpace(String str, Promise promise) {
        IntercomSpace intercomSpace;
        try {
            IntercomSpace intercomSpace2 = IntercomSpace.Home;
            int hashCode = str.hashCode();
            if (hashCode == -604994873) {
                if (str.equals("TICKETS")) {
                    intercomSpace = IntercomSpace.Tickets;
                    Intercom.client().present(intercomSpace);
                    promise.resolve(true);
                    return;
                }
                intercomSpace = IntercomSpace.Home;
                Intercom.client().present(intercomSpace);
                promise.resolve(true);
                return;
            }
            if (hashCode == 320532812) {
                if (str.equals("MESSAGES")) {
                    intercomSpace = IntercomSpace.Messages;
                    Intercom.client().present(intercomSpace);
                    promise.resolve(true);
                    return;
                }
                intercomSpace = IntercomSpace.Home;
                Intercom.client().present(intercomSpace);
                promise.resolve(true);
                return;
            }
            if (hashCode == 1250065171 && str.equals("HELP_CENTER")) {
                intercomSpace = IntercomSpace.HelpCenter;
                Intercom.client().present(intercomSpace);
                promise.resolve(true);
                return;
            }
            intercomSpace = IntercomSpace.Home;
            Intercom.client().present(intercomSpace);
            promise.resolve(true);
            return;
        } catch (Exception e) {
            Log.e("IntercomModule", "presentIntercomSpace error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.DISPLAY_MESSENGER, e.toString());
        }
        Log.e("IntercomModule", "presentIntercomSpace error:");
        Log.e("IntercomModule", e.toString());
        promise.reject(IntercomErrorCodes.DISPLAY_MESSENGER, e.toString());
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void presentMessageComposer(String str, Promise promise) {
        try {
            if (str != null) {
                Intercom.client().displayMessageComposer(str);
            } else {
                Intercom.client().displayMessageComposer();
            }
            Log.d("IntercomModule", "presentMessageComposer");
            promise.resolve(true);
        } catch (Exception e) {
            Log.e("IntercomModule", "presentMessageComposer error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.DISPLAY_MESSENGER_COMPOSER, e.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void presentContent(ReadableMap readableMap, Promise promise) {
        IntercomContent intercomContent;
        try {
            boolean z = readableMap.hasKey("type") && readableMap.getString("type").length() > 0;
            Boolean.valueOf(z).getClass();
            if (!z) {
                promise.reject(IntercomErrorCodes.DISPLAY_CONTENT, "Intercom content must have a type");
                return;
            }
            String string = readableMap.getString("type");
            switch (string.hashCode()) {
                case -1837720742:
                    if (string.equals("SURVEY")) {
                        intercomContent = new IntercomContent.Survey(readableMap.getString("id"));
                        break;
                    }
                    intercomContent = null;
                    break;
                case -1237531517:
                    if (string.equals("CONVERSATION")) {
                        intercomContent = new IntercomContent.Conversation(readableMap.getString("id"));
                        break;
                    }
                    intercomContent = null;
                    break;
                case -14395178:
                    if (string.equals("ARTICLE")) {
                        intercomContent = new IntercomContent.Article(readableMap.getString("id"));
                        break;
                    }
                    intercomContent = null;
                    break;
                case 152800841:
                    if (string.equals("HELP_CENTER_COLLECTIONS")) {
                        intercomContent = new IntercomContent.HelpCenterCollections(IntercomHelpers.readableArrayToStringList(readableMap.getArray("ids")));
                        break;
                    }
                    intercomContent = null;
                    break;
                case 785535328:
                    if (string.equals("CAROUSEL")) {
                        intercomContent = new IntercomContent.Carousel(readableMap.getString("id"));
                        break;
                    }
                    intercomContent = null;
                    break;
                default:
                    intercomContent = null;
                    break;
            }
            if (intercomContent == null) {
                promise.reject(IntercomErrorCodes.DISPLAY_CONTENT, "Invalid content type");
            } else {
                Intercom.client().presentContent(intercomContent);
                promise.resolve(true);
            }
        } catch (Exception e) {
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.DISPLAY_CONTENT, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void fetchHelpCenterCollections(final Promise promise) {
        try {
            CollectionRequestCallback collectionRequestCallback = new CollectionRequestCallback() { // from class: com.intercom.reactnative.IntercomModule.4
                @Override // io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback
                public void onComplete(List<HelpCenterCollection> list) {
                    promise.resolve(IntercomHelpCenterHelpers.parseHelpCenterCollectionsToReadableArray(list));
                }

                @Override // io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback
                public void onError(int i) {
                    Log.e("IntercomModule", "fetchHelpCenterCollections error");
                    promise.reject(String.valueOf(i), "fetchHelpCenterCollections error");
                }

                @Override // io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback
                public void onFailure() {
                    Log.e("IntercomModule", "fetchHelpCenterCollections failure");
                    promise.reject(IntercomErrorCodes.FETCH_HELP_CENTER_COLLECTIONS, "fetchHelpCenterCollections failure");
                }
            };
            Log.d("IntercomModule", "fetchHelpCenterCollections");
            Intercom.client().fetchHelpCenterCollections(collectionRequestCallback);
        } catch (Exception e) {
            Log.e("IntercomModule", "fetchHelpCenterCollections error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.FETCH_HELP_CENTER_COLLECTIONS, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void fetchHelpCenterCollection(String str, final Promise promise) {
        try {
            if (str.equals("")) {
                promise.reject(IntercomErrorCodes.FETCH_HELP_CENTER_COLLECTION, "collectionID can't be empty");
                return;
            }
            CollectionContentRequestCallback collectionContentRequestCallback = new CollectionContentRequestCallback() { // from class: com.intercom.reactnative.IntercomModule.5
                @Override // io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback
                public void onComplete(HelpCenterCollectionContent helpCenterCollectionContent) {
                    promise.resolve(IntercomHelpCenterHelpers.parseHelpCenterCollectionsContentToReadableMap(helpCenterCollectionContent));
                }

                @Override // io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback
                public void onError(int i) {
                    Log.e("IntercomModule", "fetchHelpCenterCollection error");
                    promise.reject(String.valueOf(i), "fetchHelpCenterCollection error");
                }

                @Override // io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback
                public void onFailure() {
                    Log.e("IntercomModule", "fetchHelpCenterCollection failure");
                    promise.reject(IntercomErrorCodes.FETCH_HELP_CENTER_COLLECTION, "fetchHelpCenterCollection failure");
                }
            };
            Log.d("IntercomModule", "fetchHelpCenterCollection");
            Intercom.client().fetchHelpCenterCollection(str, collectionContentRequestCallback);
        } catch (Exception e) {
            Log.e("IntercomModule", "fetchHelpCenterCollection error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.FETCH_HELP_CENTER_COLLECTION, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void searchHelpCenter(String str, final Promise promise) {
        if (str.equals("")) {
            promise.reject(IntercomErrorCodes.SEARCH_HELP_CENTER, "searchTerm can't be empty");
            return;
        }
        try {
            SearchRequestCallback searchRequestCallback = new SearchRequestCallback() { // from class: com.intercom.reactnative.IntercomModule.6
                @Override // io.intercom.android.sdk.helpcenter.api.SearchRequestCallback
                public void onComplete(List<HelpCenterArticleSearchResult> list) {
                    promise.resolve(IntercomHelpCenterHelpers.parseHelpCenterArticleSearchToReadableArray(list));
                }

                @Override // io.intercom.android.sdk.helpcenter.api.SearchRequestCallback
                public void onError(int i) {
                    Log.e("IntercomModule", "searchHelpCenter error");
                    promise.reject(String.valueOf(i), "searchHelpCenter error");
                }

                @Override // io.intercom.android.sdk.helpcenter.api.SearchRequestCallback
                public void onFailure() {
                    Log.e("IntercomModule", "searchHelpCenter failure");
                    promise.reject(IntercomErrorCodes.SEARCH_HELP_CENTER, "searchHelpCenter failure");
                }
            };
            Log.d("IntercomModule", "searchHelpCenter");
            Intercom.client().searchHelpCenter(str, searchRequestCallback);
        } catch (Exception e) {
            Log.e("IntercomModule", "searchHelpCenter error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.SEARCH_HELP_CENTER, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void setInAppMessageVisibility(String str, Promise promise) {
        try {
            Intercom.client().setInAppMessageVisibility(IntercomHelpers.stringToVisibility(str));
            Log.d("IntercomModule", "setInAppMessageVisibility");
            promise.resolve(true);
        } catch (Exception e) {
            Log.e("IntercomModule", "setInAppMessageVisibility error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.SET_IN_APP_MESSAGE_VISIBILITY, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void hideIntercom(Promise promise) {
        try {
            Intercom.client().hideIntercom();
            Log.d("IntercomModule", "hideIntercom");
            promise.resolve(true);
        } catch (Exception e) {
            Log.e("IntercomModule", "hideIntercom error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.HIDE_INTERCOM, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void setLauncherVisibility(String str, Promise promise) {
        try {
            Intercom.client().setLauncherVisibility(IntercomHelpers.stringToVisibility(str));
            Log.d("IntercomModule", "setInAppMessageVisibility");
            promise.resolve(true);
        } catch (Exception e) {
            Log.e("IntercomModule", "setInAppMessageVisibility error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.SET_LAUNCHER_VISIBILITY, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void setBottomPadding(double d, Promise promise) {
        try {
            Intercom.client().setBottomPadding((int) d);
            Log.d("IntercomModule", "setBottomPadding");
            promise.resolve(true);
        } catch (Exception e) {
            Log.e("IntercomModule", "setBottomPadding error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.SET_BOTTOM_PADDING, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void setThemeMode(String str, Promise promise) {
        ThemeMode themeMode;
        if (str != null) {
            try {
                if (!str.trim().isEmpty()) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1833998801) {
                        if (str.equals("SYSTEM")) {
                            themeMode = ThemeMode.SYSTEM;
                            Intercom.client().setThemeMode(themeMode);
                            promise.resolve(true);
                            return;
                        }
                        promise.reject(IntercomErrorCodes.SET_THEME_MODE, "Invalid theme mode: '" + str + "'. Use 'LIGHT', 'DARK', or 'SYSTEM'.");
                        return;
                    }
                    if (hashCode == 2090870) {
                        if (str.equals("DARK")) {
                            themeMode = ThemeMode.DARK;
                            Intercom.client().setThemeMode(themeMode);
                            promise.resolve(true);
                            return;
                        }
                        promise.reject(IntercomErrorCodes.SET_THEME_MODE, "Invalid theme mode: '" + str + "'. Use 'LIGHT', 'DARK', or 'SYSTEM'.");
                        return;
                    }
                    if (hashCode == 72432886 && str.equals("LIGHT")) {
                        themeMode = ThemeMode.LIGHT;
                        Intercom.client().setThemeMode(themeMode);
                        promise.resolve(true);
                        return;
                    }
                    promise.reject(IntercomErrorCodes.SET_THEME_MODE, "Invalid theme mode: '" + str + "'. Use 'LIGHT', 'DARK', or 'SYSTEM'.");
                    return;
                }
            } catch (Exception e) {
                Log.e("IntercomModule", "setThemeMode error:");
                Log.e("IntercomModule", e.toString());
                promise.reject(IntercomErrorCodes.SET_THEME_MODE, "Error in setThemeMode: " + e.toString());
                return;
            }
        }
        promise.reject(IntercomErrorCodes.SET_THEME_MODE, "Theme mode cannot be null or empty. Use 'LIGHT', 'DARK', or 'SYSTEM'.");
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void setUserJwt(String str, Promise promise) {
        try {
            Intercom.client().setUserJwt(str);
            Log.d("IntercomModule", "Setting JWT");
            promise.resolve(true);
        } catch (Exception e) {
            Log.e("IntercomModule", "Error Setting JWT:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.SET_USER_JWT, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void setAuthTokens(ReadableMap readableMap, final Promise promise) {
        try {
            Intercom.client().setAuthTokens(IntercomHelpers.buildAuthTokensList(readableMap), new IntercomStatusCallback() { // from class: com.intercom.reactnative.IntercomModule.7
                @Override // io.intercom.android.sdk.IntercomStatusCallback
                public void onSuccess() {
                    promise.resolve(true);
                }

                @Override // io.intercom.android.sdk.IntercomStatusCallback
                public void onFailure(IntercomError intercomError) {
                    Log.e("ERROR", intercomError.getErrorMessage());
                    promise.reject(String.valueOf(intercomError.getErrorCode()), intercomError.getErrorMessage());
                }
            });
        } catch (Exception e) {
            Log.e("IntercomModule", "setAuthTokens error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.SET_AUTH_TOKENS, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void initialize(String str, String str2, Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null || currentActivity.getApplication() == null) {
                promise.reject(IntercomErrorCodes.INITIALIZE_ERROR, "Activity is null");
            } else {
                initialize(currentActivity.getApplication(), str, str2);
                promise.resolve(true);
            }
        } catch (Exception e) {
            Log.e("IntercomModule", "initialize error:");
            Log.e("IntercomModule", e.toString());
            promise.reject(IntercomErrorCodes.INITIALIZE_ERROR, e.toString());
        }
    }

    @Override // com.intercom.reactnative.NativeIntercomSpecSpec
    @ReactMethod
    public void setNeedsStatusBarAppearanceUpdate(Promise promise) {
        promise.resolve(true);
    }

    public static synchronized void initialize(Application application, String str, String str2) {
        synchronized (IntercomModule.class) {
            ReactNativeHeaderInterceptor.setReactNativeVersion(application.getApplicationContext(), BuildConfig.INTERCOM_VERSION_NAME);
            Intercom.initialize(application, str, str2);
        }
    }
}
