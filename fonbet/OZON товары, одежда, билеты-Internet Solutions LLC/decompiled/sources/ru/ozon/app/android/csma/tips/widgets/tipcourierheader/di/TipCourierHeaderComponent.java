package ru.ozon.app.android.csma.tips.widgets.tipcourierheader.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.TipCourierHeaderMapper;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/di/TipCourierHeaderComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/TipCourierHeaderMapper;", "getMapper", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/TipCourierHeaderMapper;", "mapper", "Companion", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TipCourierHeaderComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/di/TipCourierHeaderComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/di/TipCourierHeaderComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/di/TipCourierHeaderComponent;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final TipCourierHeaderComponent create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new TipCourierHeaderComponent() { // from class: ru.ozon.app.android.csma.tips.widgets.tipcourierheader.di.TipCourierHeaderComponent$Companion$create$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(TipCourierHeaderComponent$Companion$create$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierheader.di.TipCourierHeaderComponent
                public TipCourierHeaderMapper getMapper() {
                    return (TipCourierHeaderMapper) this.mapper.getValue();
                }
            };
        }
    }

    @NotNull
    TipCourierHeaderMapper getMapper();
}
