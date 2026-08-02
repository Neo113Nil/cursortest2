package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class N2 implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O2 f12620a;

    public N2(O2 o22) {
        this.f12620a = o22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.f12620a) {
            try {
                O2 o22 = this.f12620a;
                o22.f12677b = intent;
                Iterator it = o22.f12676a.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).consume(intent);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
