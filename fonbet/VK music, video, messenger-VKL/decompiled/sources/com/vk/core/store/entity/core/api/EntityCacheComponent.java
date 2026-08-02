package com.vk.core.store.entity.core.api;

import com.vk.core.store.entity.models.NotificationMentions;
import com.vk.core.store.entity.models.StoriesEventsStack;
import com.vk.di.component.DiScopedComponent;
import io.reactivex.rxjava3.core.k;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.operators.maybe.i;
import xsna.gvg0;
import xsna.pwj0;
import xsna.qug0;

/* compiled from: EntityCacheComponent.kt */
/* loaded from: classes17.dex */
public interface EntityCacheComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: EntityCacheComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final EntityCacheComponent STUB = new EntityCacheComponent() { // from class: com.vk.core.store.entity.core.api.EntityCacheComponent$Companion$STUB$1
            public final b a = new b();
            public final a b = new a();

            /* compiled from: EntityCacheComponent.kt */
            public static final class a implements qug0<NotificationMentions> {
                @Override // xsna.qug0
                public final k<NotificationMentions> a(String str, w wVar) {
                    return i.b;
                }

                @Override // xsna.qug0
                public final io.reactivex.rxjava3.core.a b(String str, NotificationMentions notificationMentions, w wVar) {
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
            }

            /* compiled from: EntityCacheComponent.kt */
            public static final class b implements gvg0<StoriesEventsStack> {
                @Override // xsna.gvg0
                public final io.reactivex.rxjava3.core.a a(StoriesEventsStack storiesEventsStack, w wVar) {
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }

                @Override // xsna.gvg0
                public final k<StoriesEventsStack> b(w wVar) {
                    return i.b;
                }
            }

            @Override // com.vk.core.store.entity.core.api.EntityCacheComponent
            public final qug0<NotificationMentions> Gb() {
                return this.b;
            }

            @Override // com.vk.core.store.entity.core.api.EntityCacheComponent
            public final gvg0<StoriesEventsStack> nb() {
                return this.a;
            }
        };

        public final EntityCacheComponent getSTUB() {
            return STUB;
        }
    }

    qug0<NotificationMentions> Gb();

    gvg0<StoriesEventsStack> nb();
}
