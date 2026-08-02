package com.unity3d.ads.adplayer;

import android.content.Intent;
import android.webkit.WebView;
import java.util.Map;
import xsna.zcl;

/* compiled from: DisplayMessage.kt */
/* loaded from: classes14.dex */
public abstract class DisplayMessage {
    private final String opportunityId;

    /* compiled from: DisplayMessage.kt */
    public static final class DisplayDestroyed extends DisplayMessage {
        public DisplayDestroyed(String str) {
            super(str, null);
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class DisplayError extends DisplayMessage {
        private final String reason;

        public DisplayError(String str, String str2) {
            super(str, null);
            this.reason = str2;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class DisplayFinishRequest extends DisplayMessage {
        public DisplayFinishRequest(String str) {
            super(str, null);
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class DisplayReady extends DisplayMessage {
        private final Map<String, Object> showOptions;

        public DisplayReady(String str, Map<String, ? extends Object> map) {
            super(str, null);
            this.showOptions = map;
        }

        public final Map<String, Object> getShowOptions() {
            return this.showOptions;
        }

        public /* synthetic */ DisplayReady(String str, Map map, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : map);
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class DisplayStarted extends DisplayMessage {
        public DisplayStarted(String str) {
            super(str, null);
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        public FocusChanged(String str, boolean z) {
            super(str, null);
            this.isFocused = z;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class OpenUrl extends DisplayMessage {
        private final Intent intent;
        private final boolean useActivityForResult;

        public OpenUrl(String str, Intent intent, boolean z) {
            super(str, null);
            this.intent = intent;
            this.useActivityForResult = z;
        }

        public final Intent getIntent() {
            return this.intent;
        }

        public final boolean getUseActivityForResult() {
            return this.useActivityForResult;
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class OpenUrlResult extends DisplayMessage {
        private final boolean success;

        public OpenUrlResult(String str, boolean z) {
            super(str, null);
            this.success = z;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class SetOrientation extends DisplayMessage {
        private final int orientation;

        public SetOrientation(String str, int i) {
            super(str, null);
            this.orientation = i;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        public VisibilityChanged(String str, boolean z) {
            super(str, null);
            this.isVisible = z;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class WebViewInstanceRequest extends DisplayMessage {
        public WebViewInstanceRequest(String str) {
            super(str, null);
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class WebViewInstanceResponse extends DisplayMessage {
        private final WebView webView;

        public WebViewInstanceResponse(String str, WebView webView) {
            super(str, null);
            this.webView = webView;
        }

        public final WebView getWebView() {
            return this.webView;
        }
    }

    public /* synthetic */ DisplayMessage(String str, zcl zclVar) {
        this(str);
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }
}
