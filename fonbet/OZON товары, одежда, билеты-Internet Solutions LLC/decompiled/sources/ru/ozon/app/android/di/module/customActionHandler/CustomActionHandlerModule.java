package ru.ozon.app.android.di.module.customActionHandler;

import Pc.a;
import Tc.d;
import Vg.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.di.module.customActionHandler.CustomActionHandlerModule;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/di/module/customActionHandler/CustomActionHandlerModule;", "", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CustomActionHandlerModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u000e\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u0004j\u0002`\r2 \u0010\t\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0002`\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/di/module/customActionHandler/CustomActionHandlerModule$Companion;", "", "<init>", "()V", "", "Ljava/lang/Class;", "LPc/a;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandlersProviders;", "customActionHandlerProviders", "", "LVg/f;", "widgetCustomActionHandler", "Lru/ozon/app/android/action/custom/CustomWidgetActionHandlersProviders;", "providesCustomWidgetActionHandler", "(Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f providesCustomWidgetActionHandler$lambda$5$lambda$2$lambda$1(f fVar) {
            return fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f providesCustomWidgetActionHandler$lambda$5$lambda$4$lambda$3(a aVar) {
            return (f) aVar.get();
        }

        @NotNull
        public final Map<Class<?>, a<f>> providesCustomWidgetActionHandler(@NotNull Map<Class<?>, a<CustomActionHandler>> customActionHandlerProviders, @NotNull Set<f> widgetCustomActionHandler) {
            Intrinsics.checkNotNullParameter(customActionHandlerProviders, "customActionHandlerProviders");
            Intrinsics.checkNotNullParameter(widgetCustomActionHandler, "widgetCustomActionHandler");
            d builder = new d();
            for (final f fVar : widgetCustomActionHandler) {
                builder.put(fVar.getClass(), new a() { // from class: Es.a
                    @Override // Pc.a
                    public final Object get() {
                        f providesCustomWidgetActionHandler$lambda$5$lambda$2$lambda$1;
                        providesCustomWidgetActionHandler$lambda$5$lambda$2$lambda$1 = CustomActionHandlerModule.Companion.providesCustomWidgetActionHandler$lambda$5$lambda$2$lambda$1(f.this);
                        return providesCustomWidgetActionHandler$lambda$5$lambda$2$lambda$1;
                    }
                });
            }
            builder.putAll(builder);
            LinkedHashMap linkedHashMap = new LinkedHashMap(U.h(customActionHandlerProviders.size()));
            Iterator<T> it = customActionHandlerProviders.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                final a aVar = (a) entry.getValue();
                linkedHashMap.put(key, new a() { // from class: Es.b
                    @Override // Pc.a
                    public final Object get() {
                        f providesCustomWidgetActionHandler$lambda$5$lambda$4$lambda$3;
                        providesCustomWidgetActionHandler$lambda$5$lambda$4$lambda$3 = CustomActionHandlerModule.Companion.providesCustomWidgetActionHandler$lambda$5$lambda$4$lambda$3(Pc.a.this);
                        return providesCustomWidgetActionHandler$lambda$5$lambda$4$lambda$3;
                    }
                });
            }
            builder.putAll(linkedHashMap);
            Intrinsics.checkNotNullParameter(builder, "builder");
            return builder.u();
        }

        private Companion() {
        }
    }
}
