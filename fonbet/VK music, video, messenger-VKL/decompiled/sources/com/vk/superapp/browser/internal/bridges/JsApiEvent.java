package com.vk.superapp.browser.internal.bridges;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: JsApiEvent.kt */
/* loaded from: classes6.dex */
public final class JsApiEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ JsApiEvent[] $VALUES;
    public static final JsApiEvent ARTICLE_CLOSED;
    public static final JsApiEvent BANNER_AD_CLOSED_BY_USER;
    public static final JsApiEvent BANNER_AD_UPDATED;
    public static final JsApiEvent CALL_FINISHED;
    public static final JsApiEvent CALL_LEFT;
    public static final JsApiEvent CLIP_BOX_LOAD_PROCESSING;
    public static final JsApiEvent CLIP_BOX_UPLOAD_FINISH;
    public static final JsApiEvent CONTACTS_CLOSED;
    public static final JsApiEvent CONTACTS_DONE;
    public static final JsApiEvent FAVORITE_RESULT;
    public static final JsApiEvent LIBVERIFY_CHANGE_STATE;
    public static final JsApiEvent PERMISSION_GRANTED;
    public static final JsApiEvent QR_CLOSED;
    public static final JsApiEvent QR_DONE;
    public static final JsApiEvent STEPS_SYNC_COMPLETED;
    public static final JsApiEvent STORY_BOX_LOAD_FINISHED;
    public static final JsApiEvent UPDATE_INFO;
    public static final JsApiEvent WORKOUTS_SYNC_COMPLETED;
    private final String fullName;

    static {
        JsApiEvent jsApiEvent = new JsApiEvent("ARTICLE_CLOSED", 0, "VKWebAppArticleClosed");
        ARTICLE_CLOSED = jsApiEvent;
        JsApiEvent jsApiEvent2 = new JsApiEvent("UPDATE_INFO", 1, "VKWebAppUpdateInfo");
        UPDATE_INFO = jsApiEvent2;
        JsApiEvent jsApiEvent3 = new JsApiEvent("CONTACTS_CLOSED", 2, "VKWebAppContactsClosed");
        CONTACTS_CLOSED = jsApiEvent3;
        JsApiEvent jsApiEvent4 = new JsApiEvent("CONTACTS_DONE", 3, "VKWebAppContactsDone");
        CONTACTS_DONE = jsApiEvent4;
        JsApiEvent jsApiEvent5 = new JsApiEvent("QR_DONE", 4, "VKWebAppQRDone");
        QR_DONE = jsApiEvent5;
        JsApiEvent jsApiEvent6 = new JsApiEvent("QR_CLOSED", 5, "VKWebAppQRClosed");
        QR_CLOSED = jsApiEvent6;
        JsApiEvent jsApiEvent7 = new JsApiEvent("STORY_BOX_LOAD_FINISHED", 6, "VKWebAppShowStoryBoxLoadFinish");
        STORY_BOX_LOAD_FINISHED = jsApiEvent7;
        JsApiEvent jsApiEvent8 = new JsApiEvent("CLIP_BOX_LOAD_PROCESSING", 7, "VKWebAppShowClipBoxProcessing");
        CLIP_BOX_LOAD_PROCESSING = jsApiEvent8;
        JsApiEvent jsApiEvent9 = new JsApiEvent("CLIP_BOX_UPLOAD_FINISH", 8, "VKWebAppShowClipBoxUploadFinish");
        CLIP_BOX_UPLOAD_FINISH = jsApiEvent9;
        JsApiEvent jsApiEvent10 = new JsApiEvent("PERMISSION_GRANTED", 9, "VKWebAppPermissionGranted");
        PERMISSION_GRANTED = jsApiEvent10;
        JsApiEvent jsApiEvent11 = new JsApiEvent("STEPS_SYNC_COMPLETED", 10, "VKWebAppStepsSyncCompleted");
        STEPS_SYNC_COMPLETED = jsApiEvent11;
        JsApiEvent jsApiEvent12 = new JsApiEvent("WORKOUTS_SYNC_COMPLETED", 11, "VKWebAppWorkoutsSyncCompleted");
        WORKOUTS_SYNC_COMPLETED = jsApiEvent12;
        JsApiEvent jsApiEvent13 = new JsApiEvent("FAVORITE_RESULT", 12, "VKWebAppAddToFavoritesResult");
        FAVORITE_RESULT = jsApiEvent13;
        JsApiEvent jsApiEvent14 = new JsApiEvent("BANNER_AD_UPDATED", 13, "VKWebAppBannerAdUpdated");
        BANNER_AD_UPDATED = jsApiEvent14;
        JsApiEvent jsApiEvent15 = new JsApiEvent("BANNER_AD_CLOSED_BY_USER", 14, "VKWebAppBannerAdClosedByUser");
        BANNER_AD_CLOSED_BY_USER = jsApiEvent15;
        JsApiEvent jsApiEvent16 = new JsApiEvent("CALL_LEFT", 15, "VKWebAppCallLeft");
        CALL_LEFT = jsApiEvent16;
        JsApiEvent jsApiEvent17 = new JsApiEvent("CALL_FINISHED", 16, "VKWebAppCallFinished");
        CALL_FINISHED = jsApiEvent17;
        JsApiEvent jsApiEvent18 = new JsApiEvent("LIBVERIFY_CHANGE_STATE", 17, "VKWebAppLibverifyChangeState");
        LIBVERIFY_CHANGE_STATE = jsApiEvent18;
        JsApiEvent[] jsApiEventArr = {jsApiEvent, jsApiEvent2, jsApiEvent3, jsApiEvent4, jsApiEvent5, jsApiEvent6, jsApiEvent7, jsApiEvent8, jsApiEvent9, jsApiEvent10, jsApiEvent11, jsApiEvent12, jsApiEvent13, jsApiEvent14, jsApiEvent15, jsApiEvent16, jsApiEvent17, jsApiEvent18};
        $VALUES = jsApiEventArr;
        $ENTRIES = new asp(jsApiEventArr);
    }

    public JsApiEvent(String str, int i, String str2) {
        this.fullName = str2;
    }

    public static JsApiEvent valueOf(String str) {
        return (JsApiEvent) Enum.valueOf(JsApiEvent.class, str);
    }

    public static JsApiEvent[] values() {
        return (JsApiEvent[]) $VALUES.clone();
    }

    public final String h() {
        return this.fullName;
    }
}
