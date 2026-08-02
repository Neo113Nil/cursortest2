package com.tiktok.appevents;

import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.TTUtil;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
class TTEdpAppEventsQueue {
    private static String TAG = "com.tiktok.appevents.TTEdpAppEventsQueue";
    private static List<TTAppEvent> memory = new ArrayList();

    private TTEdpAppEventsQueue() {
    }

    private static void notifyChange() {
        if (TikTokBusinessSdk.memoryListener != null) {
            TikTokBusinessSdk.memoryListener.onMemoryChange(memory.size());
        }
        if (TikTokBusinessSdk.nextTimeFlushListener != null) {
            TikTokBusinessSdk.nextTimeFlushListener.thresholdLeft(100, Math.max(100 - size(), 0));
        }
    }

    public static synchronized void addEvent(TTAppEvent event) {
        synchronized (TTEdpAppEventsQueue.class) {
            TTUtil.checkThread(TAG);
            memory.add(event);
            notifyChange();
        }
    }

    public static synchronized int size() {
        int size;
        synchronized (TTEdpAppEventsQueue.class) {
            size = memory.size();
        }
        return size;
    }

    public static synchronized void clearAll() {
        synchronized (TTEdpAppEventsQueue.class) {
            try {
                TTUtil.checkThread(TAG);
                memory = new ArrayList();
                notifyChange();
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized List<TTAppEvent> exportAllEvents() {
        List<TTAppEvent> list;
        synchronized (TTEdpAppEventsQueue.class) {
            list = memory;
            memory = new ArrayList();
            notifyChange();
        }
        return list;
    }
}
