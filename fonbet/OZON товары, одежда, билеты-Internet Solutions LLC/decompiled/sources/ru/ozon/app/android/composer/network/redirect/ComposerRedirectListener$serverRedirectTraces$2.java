package ru.ozon.app.android.composer.network.redirect;

import Qj0.U;
import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/util/LruCache;", "", "LQj0/U;", "invoke", "()Landroid/util/LruCache;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ComposerRedirectListener$serverRedirectTraces$2 extends AbstractC7737t implements Function0<LruCache<String, U>> {
    public static final ComposerRedirectListener$serverRedirectTraces$2 INSTANCE = new ComposerRedirectListener$serverRedirectTraces$2();

    ComposerRedirectListener$serverRedirectTraces$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LruCache<String, U> invoke() {
        return new LruCache<>(5);
    }
}
