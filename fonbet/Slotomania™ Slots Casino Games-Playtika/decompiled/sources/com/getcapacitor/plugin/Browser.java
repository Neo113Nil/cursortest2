package com.getcapacitor.plugin;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.getcapacitor.plugin.EventGroup;
import com.safedk.android.utils.Logger;

/* compiled from: BrowserPlugin.java */
/* loaded from: classes.dex */
class Browser {
    public static final int BROWSER_FINISHED = 2;
    public static final int BROWSER_LOADED = 1;
    private static final String CUSTOM_TAB_PACKAGE_NAME = "com.android.chrome";
    private BrowserEventListener browserEventListener;
    private CustomTabsSession browserSession;
    private Context context;
    private CustomTabsClient customTabsClient;
    private boolean isInitialLoad = false;
    private CustomTabsServiceConnection connection = new CustomTabsServiceConnection() { // from class: com.getcapacitor.plugin.Browser.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            Browser.this.customTabsClient = customTabsClient;
            customTabsClient.warmup(0L);
        }
    };
    private EventGroup group = new EventGroup(new EventGroup.EventGroupCompletion() { // from class: com.getcapacitor.plugin.Browser$$ExternalSyntheticLambda0
        @Override // com.getcapacitor.plugin.EventGroup.EventGroupCompletion
        public final void onGroupCompletion() {
            Browser.this.handleGroupCompletion();
        }
    });

    /* compiled from: BrowserPlugin.java */
    interface BrowserEventListener {
        void onBrowserEvent(int i);
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        p0.launchUrl(p1, p2);
    }

    public Browser(Context context) {
        this.context = context;
    }

    public void setBrowserEventListener(BrowserEventListener browserEventListener) {
        this.browserEventListener = browserEventListener;
    }

    public BrowserEventListener getBrowserEventListenerListener() {
        return this.browserEventListener;
    }

    public void open(Uri uri) {
        open(uri, null);
    }

    public void open(Uri uri, Integer num) {
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(getCustomTabsSession());
        builder.addDefaultShareMenuItem();
        if (num != null) {
            builder.setToolbarColor(num.intValue());
        }
        CustomTabsIntent build = builder.build();
        build.intent.putExtra("android.intent.extra.REFERRER", Uri.parse("2//" + this.context.getPackageName()));
        this.isInitialLoad = true;
        this.group.reset();
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(build, this.context, uri);
    }

    public boolean bindService() {
        boolean bindCustomTabsService = CustomTabsClient.bindCustomTabsService(this.context, CUSTOM_TAB_PACKAGE_NAME, this.connection);
        this.group.leave();
        return bindCustomTabsService;
    }

    public void unbindService() {
        this.context.unbindService(this.connection);
        this.group.enter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handledNavigationEvent(int i) {
        if (i != 2) {
            if (i == 5) {
                this.group.enter();
                return;
            } else {
                if (i != 6) {
                    return;
                }
                this.group.leave();
                return;
            }
        }
        if (this.isInitialLoad) {
            BrowserEventListener browserEventListener = this.browserEventListener;
            if (browserEventListener != null) {
                browserEventListener.onBrowserEvent(1);
            }
            this.isInitialLoad = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleGroupCompletion() {
        BrowserEventListener browserEventListener = this.browserEventListener;
        if (browserEventListener != null) {
            browserEventListener.onBrowserEvent(2);
        }
    }

    private CustomTabsSession getCustomTabsSession() {
        CustomTabsClient customTabsClient = this.customTabsClient;
        if (customTabsClient == null) {
            return null;
        }
        if (this.browserSession == null) {
            this.browserSession = customTabsClient.newSession(new CustomTabsCallback() { // from class: com.getcapacitor.plugin.Browser.2
                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onNavigationEvent(int i, Bundle bundle) {
                    Browser.this.handledNavigationEvent(i);
                }
            });
        }
        return this.browserSession;
    }
}
