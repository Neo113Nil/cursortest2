package org.chromium.base.task;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.chromium.base.TraceEvent;

/* loaded from: classes10.dex */
public class ChainedTasks {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private volatile boolean mCanceled;
    private boolean mFinalized;
    private final ArrayDeque<Pair<Integer, Runnable>> mTasks = new ArrayDeque<>();
    private final int mIterationIdForTesting = PostTask.sTestIterationForTesting;
    private final Runnable mRunAndPost = new Runnable() { // from class: org.chromium.base.task.ChainedTasks.1
        @Override // java.lang.Runnable
        public void run() {
            if (ChainedTasks.this.mIterationIdForTesting != PostTask.sTestIterationForTesting) {
                ChainedTasks.this.cancel();
            }
            if (ChainedTasks.this.mCanceled) {
                return;
            }
            Pair pair = (Pair) ChainedTasks.this.mTasks.pop();
            TraceEvent scoped = TraceEvent.scoped("ChainedTask.run: " + ((Runnable) pair.second).getClass().getName());
            try {
                ((Runnable) pair.second).run();
                if (scoped != null) {
                    scoped.close();
                }
                if (ChainedTasks.this.mTasks.isEmpty()) {
                    return;
                }
                PostTask.postTask(((Integer) ((Pair) ChainedTasks.this.mTasks.peek()).first).intValue(), this);
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    };

    public void add(int traits, Runnable task) {
        if (PostTask.ENABLE_TASK_ORIGINS) {
            task = PostTask.populateTaskOrigin(new TaskOriginException(), task);
        }
        synchronized (this.mTasks) {
            this.mTasks.add(new Pair<>(Integer.valueOf(traits), task));
        }
    }

    public void cancel() {
        synchronized (this.mTasks) {
            this.mFinalized = true;
            this.mCanceled = true;
        }
    }

    public void start(final boolean coalesceTasks) {
        synchronized (this.mTasks) {
            this.mFinalized = true;
        }
        if (this.mTasks.isEmpty()) {
            return;
        }
        if (coalesceTasks) {
            PostTask.runOrPostTask(((Integer) this.mTasks.peek().first).intValue(), new Runnable() { // from class: org.chromium.base.task.ChainedTasks$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ChainedTasks.this.lambda$start$0();
                }
            });
        } else {
            PostTask.postTask(((Integer) this.mTasks.peek().first).intValue(), this.mRunAndPost);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        Iterator<Pair<Integer, Runnable>> it = this.mTasks.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next().second).run();
            if (this.mCanceled) {
                return;
            }
        }
    }
}
