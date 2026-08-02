package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes13.dex */
public interface Y7<T> {

    public static class a<ListenerType> implements Y7<ListenerType> {
        private ListenerType a;

        /* renamed from: com.ironsource.Y7$a$a, reason: collision with other inner class name */
        public static final class C0211a extends AbstractRunnableC4408ke {
            final /* synthetic */ Runnable b;

            public C0211a(Runnable runnable) {
                this.b = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC4408ke
            public void a() {
                this.b.run();
            }
        }

        public final ListenerType a() {
            return this.a;
        }

        public final void b(ListenerType listenertype) {
            this.a = listenertype;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.a(runnable, z);
        }

        public final void a(Runnable runnable, boolean z) {
            if (z) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0211a(runnable), 0L, 2, null);
            }
        }

        public final void a(String str, String str2) {
            IronLog.CALLBACK.info(str2 + " instanceId=" + str);
        }

        @Override // com.ironsource.Y7
        public void a(ListenerType listenertype) {
            this.a = listenertype;
        }
    }

    void a(T t);
}
