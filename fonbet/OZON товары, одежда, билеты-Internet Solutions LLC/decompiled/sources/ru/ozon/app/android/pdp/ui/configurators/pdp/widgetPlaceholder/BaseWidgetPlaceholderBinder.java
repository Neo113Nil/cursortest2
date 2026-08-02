package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00028\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetPlaceholderViewObject;", "T", "", "<init>", "()V", "item", "Ll20/d;", "info", "payload", "Lkotlin/Function0;", "", "onFinish", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetPlaceholderViewObject;Ll20/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "", "stateId", "Ljava/lang/String;", "getStateId", "()Ljava/lang/String;", "setStateId", "(Ljava/lang/String;)V", "json", "getJson", "setJson", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseWidgetPlaceholderBinder<T extends WidgetPlaceholderViewObject> {
    private String json;
    private String stateId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(BaseWidgetPlaceholderBinder baseWidgetPlaceholderBinder, WidgetPlaceholderViewObject widgetPlaceholderViewObject, d dVar, Object obj, Function0 function0, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i11 & 2) != 0) {
            dVar = null;
        }
        if ((i11 & 4) != 0) {
            obj = null;
        }
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        baseWidgetPlaceholderBinder.bind(widgetPlaceholderViewObject, dVar, obj, function0);
    }

    public void bind(@NotNull T item, d info, Object payload, Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.stateId = info != null ? info.d() : null;
        this.json = item.getJson();
    }

    protected final String getJson() {
        return this.json;
    }

    protected final String getStateId() {
        return this.stateId;
    }
}
