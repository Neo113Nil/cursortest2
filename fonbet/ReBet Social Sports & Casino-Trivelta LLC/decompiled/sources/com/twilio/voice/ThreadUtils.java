package com.twilio.voice;

/* loaded from: classes4.dex */
class ThreadUtils {

    public static class ThreadChecker {
        private final long threadId;

        public ThreadChecker(Thread thread) {
            this.threadId = thread.getId();
        }

        public void checkIsOnValidThread() {
        }
    }
}
