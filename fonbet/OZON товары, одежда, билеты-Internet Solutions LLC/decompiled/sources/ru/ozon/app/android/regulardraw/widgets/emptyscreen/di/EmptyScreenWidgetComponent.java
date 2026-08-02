package ru.ozon.app.android.regulardraw.widgets.emptyscreen.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.regulardraw.di.RegularDrawDefaultComponent;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.button.EmptyScreenButtonMapper;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.main.EmptyScreenMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/di/EmptyScreenWidgetComponent;", "Lru/ozon/app/android/regulardraw/di/RegularDrawDefaultComponent;", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/core/main/EmptyScreenMapper;", "getMapper", "()Lru/ozon/app/android/regulardraw/widgets/emptyscreen/core/main/EmptyScreenMapper;", "mapper", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/core/button/EmptyScreenButtonMapper;", "getButtonMapper", "()Lru/ozon/app/android/regulardraw/widgets/emptyscreen/core/button/EmptyScreenButtonMapper;", "buttonMapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface EmptyScreenWidgetComponent extends RegularDrawDefaultComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/di/EmptyScreenWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/di/EmptyScreenWidgetComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/regulardraw/widgets/emptyscreen/di/EmptyScreenWidgetComponent;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final EmptyScreenWidgetComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new EmptyScreenWidgetComponent() { // from class: ru.ozon.app.android.regulardraw.widgets.emptyscreen.di.EmptyScreenWidgetComponent$Companion$create$1
                private final RetainComposerComponentApi retainComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(EmptyScreenWidgetComponent$Companion$create$1$mapper$2.INSTANCE);

                /* renamed from: buttonMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j buttonMapper = k.b(EmptyScreenWidgetComponent$Companion$create$1$buttonMapper$2.INSTANCE);

                {
                    this.retainComponentApi = (RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.emptyscreen.di.EmptyScreenWidgetComponent
                public EmptyScreenButtonMapper getButtonMapper() {
                    return (EmptyScreenButtonMapper) this.buttonMapper.getValue();
                }

                @Override // ru.ozon.app.android.regulardraw.di.RegularDrawDefaultComponent
                public c getDefaultActionHandlers() {
                    return UtilKt.getDefaultActionHandlers$default(C7475g.this, null, 2, null);
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.emptyscreen.di.EmptyScreenWidgetComponent
                public EmptyScreenMapper getMapper() {
                    return (EmptyScreenMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.emptyscreen.di.EmptyScreenWidgetComponent
                public l getTokenizedAnalytics() {
                    return this.retainComponentApi.getTokenizedAnalytics();
                }
            };
        }
    }

    @NotNull
    EmptyScreenButtonMapper getButtonMapper();

    @NotNull
    EmptyScreenMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
