package ru.ozon.app.android.commonwidgets.actionHandlersFactory;

import Pc.a;
import Vg.c;
import Vg.f;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012 \u0010\b\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR.\u0010\b\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/commonwidgets/actionHandlersFactory/CommonActionHandlersStore;", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "", "Ljava/lang/Class;", "LPc/a;", "LVg/f;", "Lru/ozon/app/android/action/custom/CustomWidgetActionHandlersProviders;", "handlersProviders", "<init>", "(Ljava/util/Map;)V", "", "actionId", "getHandler", "(Ljava/lang/String;)LVg/f;", "Ljava/util/Map;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonActionHandlersStore implements c {

    @NotNull
    private final Map<Class<?>, a<f>> handlersProviders;

    public CommonActionHandlersStore(@NotNull Map<Class<?>, a<f>> handlersProviders) {
        Intrinsics.checkNotNullParameter(handlersProviders, "handlersProviders");
        this.handlersProviders = handlersProviders;
    }

    @Override // Vg.c
    public f getHandler(@NotNull String actionId) {
        Object obj;
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Iterator<T> it = this.handlersProviders.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((f) ((a) obj).get()).getActionId(), actionId)) {
                break;
            }
        }
        a aVar = (a) obj;
        if (aVar != null) {
            return (f) aVar.get();
        }
        return null;
    }
}
