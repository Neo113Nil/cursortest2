package ru.ozon.app.android.action.custom;

import Pc.a;
import Vg.f;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentDependencies;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ljava/lang/Class;", "LPc/a;", "LVg/f;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CustomActionHandlersStoreFactoryImpl$handlers$2 extends AbstractC7737t implements Function0<Map<Class<?>, a<f>>> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomActionHandlersStoreFactoryImpl$handlers$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Class<?>, a<f>> invoke() {
        Context context = this.$context;
        if (CustomActionHandlersComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, CustomActionHandlersComponentDependencies.class).getDependencyStorage();
        if (CustomActionHandlersComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentDependencies is not DiComponent");
        }
        return ((CustomActionHandlersComponentDependencies) dependencyStorage.b(CustomActionHandlersComponentDependencies.class)).getCustomWidgetActionHandler();
    }
}
