package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.di;

import BR.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.multi.EntryBannerWidgetMultiMapper;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.single.EntryBannerWidgetSingleMapper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/di/EntryBannerWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/multi/EntryBannerWidgetMultiMapper;", "getEntryBannerWidgetMultiMapper", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/multi/EntryBannerWidgetMultiMapper;", "entryBannerWidgetMultiMapper", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/single/EntryBannerWidgetSingleMapper;", "getEntryBannerWidgetSingleMapper", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/single/EntryBannerWidgetSingleMapper;", "entryBannerWidgetSingleMapper", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface EntryBannerWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/di/EntryBannerWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/di/EntryBannerWidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EntryBannerWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new EntryBannerWidgetComponent(c7475g) { // from class: ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.di.EntryBannerWidgetComponent$Companion$create$1$1

                /* renamed from: entryBannerWidgetMultiMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j entryBannerWidgetMultiMapper = k.b(EntryBannerWidgetComponent$Companion$create$1$1$entryBannerWidgetMultiMapper$2.INSTANCE);

                /* renamed from: entryBannerWidgetSingleMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j entryBannerWidgetSingleMapper = k.b(EntryBannerWidgetComponent$Companion$create$1$1$entryBannerWidgetSingleMapper$2.INSTANCE);
                private final RetainComposerComponentApi retainComponentApi;

                {
                    this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.di.EntryBannerWidgetComponent
                public EntryBannerWidgetMultiMapper getEntryBannerWidgetMultiMapper() {
                    return (EntryBannerWidgetMultiMapper) this.entryBannerWidgetMultiMapper.getValue();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.di.EntryBannerWidgetComponent
                public EntryBannerWidgetSingleMapper getEntryBannerWidgetSingleMapper() {
                    return (EntryBannerWidgetSingleMapper) this.entryBannerWidgetSingleMapper.getValue();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.di.EntryBannerWidgetComponent
                public l getTokenizedAnalytics() {
                    return this.retainComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<EntryBannerWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(EntryBannerWidgetComponent.class), new a(storage, 4));
        }
    }

    @NotNull
    EntryBannerWidgetMultiMapper getEntryBannerWidgetMultiMapper();

    @NotNull
    EntryBannerWidgetSingleMapper getEntryBannerWidgetSingleMapper();

    @NotNull
    l getTokenizedAnalytics();
}
