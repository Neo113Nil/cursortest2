package ru.ozon.app.android.action.custom;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Vg.c;
import Vg.f;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001BA\u0012 \u0010\u0007\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0002`\u0006\u0012\u0016\u0010\t\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0003\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR.\u0010\u0007\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R$\u0010\t\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0003\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R#\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/action/custom/CustomActionHandlersCachedStore;", "LVg/c;", "", "Ljava/lang/Class;", "LPc/a;", "LVg/f;", "Lru/ozon/app/android/action/custom/CustomWidgetActionHandlersProviders;", "handlersProviders", "", "supportedHandlers", "<init>", "(Ljava/util/Map;Ljava/util/Set;)V", "", "actionId", "getHandler", "(Ljava/lang/String;)LVg/f;", "Ljava/util/Map;", "Ljava/util/Set;", "handlers$delegate", "LSc/j;", "getHandlers", "()Ljava/util/Set;", "handlers", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomActionHandlersCachedStore implements c {

    /* renamed from: handlers$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handlers;

    @NotNull
    private final Map<Class<?>, a<f>> handlersProviders;
    private final Set<Class<? extends f>> supportedHandlers;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomActionHandlersCachedStore(@NotNull Map<Class<?>, a<f>> handlersProviders, Set<? extends Class<? extends f>> set) {
        Intrinsics.checkNotNullParameter(handlersProviders, "handlersProviders");
        this.handlersProviders = handlersProviders;
        this.supportedHandlers = set;
        this.handlers = k.a(n.NONE, new CustomActionHandlersCachedStore$handlers$2(this));
    }

    private final Set<f> getHandlers() {
        return (Set) this.handlers.getValue();
    }

    @Override // Vg.c
    public f getHandler(@NotNull String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Set<f> handlers = getHandlers();
        Object obj = null;
        if (handlers == null) {
            return null;
        }
        Iterator<T> it = handlers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.d(((f) next).getActionId(), actionId)) {
                obj = next;
                break;
            }
        }
        return (f) obj;
    }
}
