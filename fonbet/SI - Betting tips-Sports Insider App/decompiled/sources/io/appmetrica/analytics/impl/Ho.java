package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ho {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12331a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public PublicLogger f12332b;

    public final synchronized void a(Consumer consumer) {
        try {
            PublicLogger publicLogger = this.f12332b;
            if (publicLogger == null) {
                this.f12331a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
