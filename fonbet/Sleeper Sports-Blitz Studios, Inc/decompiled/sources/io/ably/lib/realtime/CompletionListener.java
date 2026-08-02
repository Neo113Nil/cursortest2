package io.ably.lib.realtime;

import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import java.util.Iterator;

/* loaded from: classes9.dex */
public interface CompletionListener {
    void onError(ErrorInfo errorInfo);

    void onSuccess();

    public static class Multicaster extends io.ably.lib.util.Multicaster<CompletionListener> implements CompletionListener {
        public Multicaster(CompletionListener... completionListenerArr) {
            super(completionListenerArr);
        }

        @Override // io.ably.lib.realtime.CompletionListener
        public void onSuccess() {
            Iterator<CompletionListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onSuccess();
                } catch (Throwable unused) {
                }
            }
        }

        @Override // io.ably.lib.realtime.CompletionListener
        public void onError(ErrorInfo errorInfo) {
            Iterator<CompletionListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onError(errorInfo);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static class ToCallback implements Callback<Void> {
        private CompletionListener listener;

        public ToCallback(CompletionListener completionListener) {
            this.listener = completionListener;
        }

        @Override // io.ably.lib.types.Callback
        public void onSuccess(Void r1) {
            this.listener.onSuccess();
        }

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            this.listener.onError(errorInfo);
        }
    }

    public static class FromCallback implements CompletionListener {
        private final Callback<Void> callback;

        public FromCallback(Callback<Void> callback) {
            this.callback = callback;
        }

        @Override // io.ably.lib.realtime.CompletionListener
        public void onSuccess() {
            this.callback.onSuccess(null);
        }

        @Override // io.ably.lib.realtime.CompletionListener
        public void onError(ErrorInfo errorInfo) {
            this.callback.onError(errorInfo);
        }
    }
}
