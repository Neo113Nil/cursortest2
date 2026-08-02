package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertDialog;
import com.google.gson.Gson;
import io.intercom.android.sdk.activities.IntercomSheetActivity;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
class MessengerCardWebViewInterface {
    private static final String HEIGHT_CHANGE_EVENT = "HEIGHT_CHANGE_EVENT";
    private static final String INPUT_TEXT = "INPUT_TEXT";
    private static final Double MESSENGER_APP_ID_ARTICLE_SEARCH = Double.valueOf(27.0d);
    private static final String METRIC_EVENT = "METRIC_EVENT";
    private static final String OPEN_SHEET = "OPEN_SHEET";
    private static final String OPEN_URL = "OPEN_URL";
    private final Context context;
    private final String conversationId;
    private final Gson gson;
    private final Boolean isHomescreen;
    private final View loadingView;
    private final MetricTracker metricTracker;
    private final int primaryColor;
    private final WebView webView;

    MessengerCardWebViewInterface(WebView webView, View view, Gson gson, int i, MetricTracker metricTracker, String str, boolean z, Context context) {
        this.webView = webView;
        this.loadingView = view;
        this.gson = gson;
        this.primaryColor = i;
        this.metricTracker = metricTracker;
        this.conversationId = str;
        this.isHomescreen = Boolean.valueOf(z);
        this.context = context;
    }

    @JavascriptInterface
    public void handleAction(String str) {
        final MessengerCardWebViewAction messengerCardWebViewAction = (MessengerCardWebViewAction) this.gson.fromJson(str, MessengerCardWebViewAction.class);
        final Map<String, Object> payload = messengerCardWebViewAction.getPayload();
        String type = messengerCardWebViewAction.getType();
        if (type == null || payload == null) {
            return;
        }
        type.hashCode();
        switch (type) {
            case "OPEN_URL":
                this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MessengerCardWebViewInterface messengerCardWebViewInterface = MessengerCardWebViewInterface.this;
                        messengerCardWebViewInterface.openUrl(payload, messengerCardWebViewInterface.context);
                    }
                });
                break;
            case "HEIGHT_CHANGE_EVENT":
                if (this.loadingView.getVisibility() == 0) {
                    this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.4
                        @Override // java.lang.Runnable
                        public void run() {
                            MessengerCardWebViewInterface.this.loadingView.setVisibility(8);
                            MessengerCardWebViewInterface.this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        }
                    });
                    break;
                }
                break;
            case "METRIC_EVENT":
                this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.5
                    @Override // java.lang.Runnable
                    public void run() {
                        Map<String, Object> payload2 = messengerCardWebViewAction.getPayload();
                        MessengerCardWebViewInterface.this.metricTracker.messengerCardWebViewEvent((String) payload2.get("action"), (String) payload2.get("object"), (String) payload2.get("place"), payload2.get("metadata") instanceof Map ? (Map) payload2.get("metadata") : null, MessengerCardWebViewInterface.this.isHomescreen.booleanValue());
                    }
                });
                break;
            case "INPUT_TEXT":
                this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MessengerCardWebViewInterface.MESSENGER_APP_ID_ARTICLE_SEARCH.equals((Double) payload.get("messengerAppId"))) {
                            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(MessengerCardWebViewInterface.this.webView.getContext(), Collections.EMPTY_LIST, MetricTracker.Place.LEGACY_ARTICLE_SEARCH_APP);
                        } else {
                            MessengerCardWebViewInterface messengerCardWebViewInterface = MessengerCardWebViewInterface.this;
                            messengerCardWebViewInterface.showTextInputDialog(payload, messengerCardWebViewInterface.context);
                        }
                    }
                });
                break;
            case "OPEN_SHEET":
                this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MessengerCardWebViewInterface messengerCardWebViewInterface = MessengerCardWebViewInterface.this;
                        messengerCardWebViewInterface.openSheet(payload, messengerCardWebViewInterface.context);
                    }
                });
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openUrl(Map<String, Object> map, Context context) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) map.get("url"))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openSheet(Map<String, Object> map, Context context) {
        Map<String, Object> hashMap;
        String str = (String) map.get("url");
        if (map.containsKey("params")) {
            hashMap = (Map) map.get("params");
        } else {
            hashMap = new HashMap<>();
        }
        String stringFromMap = getStringFromMap(hashMap, "uri");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(stringFromMap)) {
            return;
        }
        if ("article-link".equals(getStringFromMap(hashMap, "action_id")) && hashMap.containsKey("values")) {
            String stringFromMap2 = getStringFromMap((Map) hashMap.get("values"), "article_id");
            if (!TextUtils.isEmpty(stringFromMap2)) {
                displayArticle(stringFromMap2, context);
                return;
            }
        }
        context.startActivity(IntercomSheetActivity.buildIntent(context, str, hashMap, stringFromMap, this.conversationId));
    }

    private String getStringFromMap(Map<String, Object> map, String str) {
        return map.containsKey(str) ? String.valueOf(map.get(str)) : "";
    }

    private void displayArticle(String str, Context context) {
        String str2;
        if (this.isHomescreen.booleanValue()) {
            str2 = MetricTracker.Place.MESSENGER_HOME_APP;
        } else {
            str2 = "conversation";
        }
        context.startActivity(IntercomArticleActivity.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(str, str2, false, !this.isHomescreen.booleanValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTextInputDialog(Map<String, Object> map, Context context) {
        AlertDialog create = new MessengerCardAlertDialogBuilder(context, map, this.primaryColor, this.webView).create();
        create.show();
        create.getWindow().setSoftInputMode(5);
        create.getButton(-2).setTextColor(this.primaryColor);
        create.getButton(-1).setTextColor(this.primaryColor);
    }
}
