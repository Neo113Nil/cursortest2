package ru.ozon.app.android.action.custom;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import Vg.d;
import Vg.f;
import android.content.Context;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\u00020\u000b2\"\u0010\n\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u0007\"\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\u00020\u000b2\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u000eH\u0016¢\u0006\u0004\b\f\u0010\u000fR1\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactoryImpl;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "LVg/f;", "supportedHandlers", "LVg/c;", "create", "([Ljava/lang/Class;)LVg/c;", "", "(Ljava/util/Set;)LVg/c;", "", "LPc/a;", "handlers$delegate", "LSc/j;", "getHandlers", "()Ljava/util/Map;", "handlers", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomActionHandlersStoreFactoryImpl implements d {

    /* renamed from: handlers$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handlers;

    public CustomActionHandlersStoreFactoryImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.handlers = k.b(new CustomActionHandlersStoreFactoryImpl$handlers$2(context));
    }

    private final Map<Class<?>, a<f>> getHandlers() {
        return (Map) this.handlers.getValue();
    }

    @Override // Vg.d
    @NotNull
    public c create(@NotNull Class<? extends f>... supportedHandlers) {
        Intrinsics.checkNotNullParameter(supportedHandlers, "supportedHandlers");
        return new CustomActionHandlersCachedStore(getHandlers(), C7705l.j0(supportedHandlers));
    }

    @Override // Vg.d
    @NotNull
    public c create(@NotNull Set<? extends Class<? extends f>> supportedHandlers) {
        Intrinsics.checkNotNullParameter(supportedHandlers, "supportedHandlers");
        return new CustomActionHandlersCachedStore(getHandlers(), supportedHandlers);
    }
}
