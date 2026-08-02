package com.vk.core.store.entity.core.impl;

import android.content.Context;
import com.vk.core.store.entity.core.api.EntityCacheComponent;
import com.vk.core.store.entity.models.NotificationMentions;
import com.vk.core.store.entity.models.StoriesEventsStack;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gvg0;
import xsna.nwy;
import xsna.pwj0;
import xsna.q00;
import xsna.qbj;
import xsna.qcy;
import xsna.qug0;

/* compiled from: EntityCacheComponentImpl.kt */
/* loaded from: classes17.dex */
public final class EntityCacheComponentImpl implements EntityCacheComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(EntityCacheComponentImpl.class, "storiesPreviewEventsEntityCache", "getStoriesPreviewEventsEntityCache()Lcom/vk/core/store/entity/core/api/RxPersistentEntityCache;", 0), fp.c(0, EntityCacheComponentImpl.class, "mentionNotificationEntityCache", "getMentionNotificationEntityCache()Lcom/vk/core/store/entity/core/api/RxListPersistentEntityCache;", fpf0.a)};
    public final nwy a;
    public final nwy b;

    /* compiled from: EntityCacheComponentImpl.kt */
    public static final class a implements c8m<EntityCacheComponent, pwj0> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new EntityCacheComponentImpl(this.a);
        }
    }

    public EntityCacheComponentImpl(Context context) {
        this.a = new nwy(new qbj(context, 5));
        this.b = new nwy(new q00(context, 1));
    }

    @Override // com.vk.core.store.entity.core.api.EntityCacheComponent
    public final qug0<NotificationMentions> Gb() {
        qcy<Object> qcyVar = c[1];
        return (qug0) this.b.c();
    }

    @Override // com.vk.core.store.entity.core.api.EntityCacheComponent
    public final gvg0<StoriesEventsStack> nb() {
        qcy<Object> qcyVar = c[0];
        return (gvg0) this.a.c();
    }
}
