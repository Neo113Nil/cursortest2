package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.a70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface V7<T> {
    void a(T t);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a<ListenerType> implements V7<ListenerType> {

        @Nullable
        private ListenerType a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.V7$a$a, reason: collision with other inner class name */
        public static final class C0193a extends com.ironsource.environment.thread.a {
            final /* synthetic */ Runnable b;

            public C0193a(Runnable runnable) {
                this.b = runnable;
            }

            @Override // com.ironsource.environment.thread.a
            public void a() {
                this.b.run();
            }
        }

        public final void a(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            IronLog.CALLBACK.info(str2 + " instanceId=" + str);
        }

        public final void b(@Nullable ListenerType listenertype) {
            this.a = listenertype;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z, int i, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
                return;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.a(runnable, z);
        }

        public final void a(@NotNull Runnable runnable, boolean z) {
            runnable.getClass();
            if (z) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0193a(runnable), 0L, 2, null);
            }
        }

        @Nullable
        public final ListenerType a() {
            return this.a;
        }

        @Override // com.ironsource.V7
        public void a(ListenerType listenertype) {
            this.a = listenertype;
        }
    }
}
