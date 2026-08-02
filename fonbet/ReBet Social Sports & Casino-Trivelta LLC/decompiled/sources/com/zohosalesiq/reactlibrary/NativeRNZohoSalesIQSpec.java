package com.zohosalesiq.reactlibrary;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class NativeRNZohoSalesIQSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNZohoSalesIQMobilisten";

    public NativeRNZohoSalesIQSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void categorizeKnowledgeBase(String str, boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void clearLogsForiOS();

    @ReactMethod
    @InterfaceC4488a
    public abstract void combineKnowledgeBaseDepartments(String str, boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void completeChatAction(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void completeChatActionWithMessage(String str, boolean z10, String str2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void disableInAppNotification();

    @ReactMethod
    @InterfaceC4488a
    public abstract void disablePreChatForms();

    @ReactMethod
    @InterfaceC4488a
    public abstract void disableScreenshotOption();

    @ReactMethod
    @InterfaceC4488a
    public abstract void dismissUI();

    @ReactMethod
    @InterfaceC4488a
    public abstract void enableDragToDismiss(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void enableInAppNotification();

    @ReactMethod
    @InterfaceC4488a
    public abstract void enablePreChatForms();

    @ReactMethod
    @InterfaceC4488a
    public abstract void enableScreenshotOption();

    @ReactMethod
    @InterfaceC4488a
    public abstract void endChat(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void fetchAttenderImage(String str, boolean z10, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void fetchDepartments(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getArticles(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getArticlesWithCategoryID(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getCategories(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getChat(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getChatUnreadCount(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getChats(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getChatsWithFilter(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getCommunicationMode(Promise promise);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @InterfaceC4488a
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
            HashSet hashSet = new HashSet(Arrays.asList("ACTION_SOURCE_APP", "ACTION_SOURCE_SDK", "ARTICLE_CLOSED", "ARTICLE_DISLIKED", "ARTICLE_LIKED", "ARTICLE_OPENED", "BOT_TRIGGER", "CHATVIEW_CLOSED", "CHATVIEW_OPENED", "CHAT_ATTENDED", "CHAT_CLOSED", "CHAT_EVENT_LISTENER", "CHAT_EXPIRED", "CHAT_MISSED", "CHAT_OPENED", "CHAT_QUEUE_POSITION_CHANGED", "CHAT_REOPENED", "CHAT_UNREAD_COUNT_CHANGED", "CUSTOMTRIGGER", "EVENT_COMPLETE_CHAT_ACTION", "EVENT_HANDLE_CUSTOM_LAUNCHER_VISIBILITY", "EVENT_HANDLE_URL", "EVENT_NOTIFICATION_CLICKED", "EVENT_OPEN_URL", "EVENT_RESOURCE_CLOSED", "EVENT_RESOURCE_DISLIKED", "EVENT_RESOURCE_LIKED", "EVENT_RESOURCE_OPENED", "EVENT_VISITOR_REGISTRATION_FAILURE", "FEEDBACK_RECEIVED", "KNOWLEDGEBASE_EVENT_LISTENER", "LAUNCHER_EVENT_LISTENER", "LAUNCHER_HORIZONTAL_LEFT", "LAUNCHER_HORIZONTAL_RIGHT", "LAUNCHER_MODE_FLOATING", "LAUNCHER_MODE_STATIC", "LAUNCHER_VERTICAL_BOTTOM", "LAUNCHER_VERTICAL_TOP", "LAUNCHER_VISIBILITY_MODE_ALWAYS", "LAUNCHER_VISIBILITY_MODE_NEVER", "LAUNCHER_VISIBILITY_MODE_WHEN_ACTIVE_CHAT", "NOTIFICATION_EVENT_LISTENER", "OPERATORS_OFFLINE", "OPERATORS_ONLINE", "PERFORM_CHATACTION", "RATING_RECEIVED", "RESOURCE_ARTICLES", "RE_REGISTER_PUSH", "SUPPORT_CLOSED", "SUPPORT_OPENED", "TAB_CONVERSATIONS", "TAB_FAQ", "TAB_KNOWLEDGE_BASE", "TYPE_CLOSED", "TYPE_CONNECTED", "TYPE_ENDED", "TYPE_MISSED", "TYPE_OPEN", "TYPE_WAITING", "VISITOR_IPBLOCKED", "ZSIQ_EVENT_LISTENER"));
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            hashSet3.removeAll(hashSet);
            hashSet3.removeAll(hashSet2);
            if (!hashSet3.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", hashSet3));
            }
            hashSet.removeAll(typedExportedConstants.keySet());
            if (!hashSet.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", hashSet));
            }
        }
        return typedExportedConstants;
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void getDepartments(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getKnowledgeBaseCategories(String str, String str2, String str3, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getKnowledgeBaseResourceDepartments(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getKnowledgeBaseResources(String str, String str2, String str3, double d10, double d11, String str4, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getKnowledgeBaseSingleResource(String str, String str2, Callback callback);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNZohoSalesIQMobilisten";
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void getNotificationPayload(ReadableMap readableMap, Callback callback);

    public abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @InterfaceC4488a
    public abstract void hideQueueTime(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void init(String str, String str2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void initWithCallback(String str, String str2, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void initialize(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void isChatEnabled(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void isKnowledgeBaseEnabled(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void isLoggerEnabled(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void isMultipleOpenChatRestricted(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void isSDKMessage(ReadableMap readableMap, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void openArticle(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void openChat();

    @ReactMethod
    @InterfaceC4488a
    public abstract void openChatWithID(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void openKnowledgeBase(String str, String str2, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void performCustomAction(String str, boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void present(String str, String str2, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void printDebugLogsForAndroid(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void processNotificationMessage(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void reRegisterPush();

    @ReactMethod
    @InterfaceC4488a
    public abstract void refreshLauncher();

    @ReactMethod
    @InterfaceC4488a
    public abstract void refreshLauncherPropertiesForAndroid();

    @ReactMethod
    @InterfaceC4488a
    public abstract void registerChatAction(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void registerLocalizationFile(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void registerPush(String str, boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void registerVisitor(String str, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void sendEvent(String str, ReadableArray readableArray);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setAttributes(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setChatActionTimeout(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setChatComponentVisibility(String str, boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setChatConversationTitle(String str, String str2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setChatTitle(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setChatWaitingTime(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setConversationListTitle(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setConversationVisibility(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setCustomAction(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setCustomFont(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setDepartment(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setDepartments(ReadableArray readableArray);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setFAQVisibility(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setFeedbackVisibility(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setKnowledgeBaseRecentlyViewedCount(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setKnowledgeBaseVisibility(String str, boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setLanguage(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setLauncherPropertiesForAndroid(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setLauncherVisibility(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setLoggerEnabled(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setLoggerPathForiOS(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setMinimumPressDuration(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setNotificationActionSource(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setNotificationIconForAndroid(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setOperatorEmail(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setPageTitle(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setQuestion(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setRatingVisibility(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setTabOrder(ReadableArray readableArray);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setThemeColor(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setThemeColorforiOS(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setThemeForAndroid(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setVisibilityModeToCustomLauncher(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setVisitorAddInfo(String str, String str2);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setVisitorContactNumber(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setVisitorEmail(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setVisitorLocation(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setVisitorName(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setVisitorNameVisibility(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void shouldOpenUrl(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void showFeedbackAfterSkip(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void showFeedbackUpToDuration(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void showLauncher(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void showOfflineMessage(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void showOperatorImageInChat(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void showOperatorImageInLauncher(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void showPayloadChat(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void startChat(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void startNewChat(String str, String str2, String str3, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void startNewChatWithTrigger(String str, String str2, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void syncThemeWithOsForAndroid(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void unregisterAllChatActions();

    @ReactMethod
    @InterfaceC4488a
    public abstract void unregisterChatAction(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void unregisterVisitor(Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void updateConfiguration(String str, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void updateListener(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void writeLogForiOS(String str, String str2, Callback callback);
}
