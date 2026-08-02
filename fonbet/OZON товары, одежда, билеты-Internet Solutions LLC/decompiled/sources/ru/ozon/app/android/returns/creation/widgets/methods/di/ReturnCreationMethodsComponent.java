package ru.ozon.app.android.returns.creation.widgets.methods.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.returns.creation.widgets.methods.core.atom.AtomElementMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.dates.DatesElementMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.images.ImagesElementMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.textwithiconbutton.TextWithIconButtonElementMapper;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/di/ReturnCreationMethodsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/returns/creation/widgets/methods/core/atom/AtomElementMapper;", "getAtomElementMapper", "()Lru/ozon/app/android/returns/creation/widgets/methods/core/atom/AtomElementMapper;", "atomElementMapper", "Lru/ozon/app/android/returns/creation/widgets/methods/core/images/ImagesElementMapper;", "getImagesElementMapper", "()Lru/ozon/app/android/returns/creation/widgets/methods/core/images/ImagesElementMapper;", "imagesElementMapper", "Lru/ozon/app/android/returns/creation/widgets/methods/core/textwithiconbutton/TextWithIconButtonElementMapper;", "getTextWithIconButtElementMapper", "()Lru/ozon/app/android/returns/creation/widgets/methods/core/textwithiconbutton/TextWithIconButtonElementMapper;", "textWithIconButtElementMapper", "Lru/ozon/app/android/returns/creation/widgets/methods/core/dates/DatesElementMapper;", "getDatesElementMapper", "()Lru/ozon/app/android/returns/creation/widgets/methods/core/dates/DatesElementMapper;", "datesElementMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReturnCreationMethodsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/di/ReturnCreationMethodsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/returns/creation/widgets/methods/di/ReturnCreationMethodsComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/returns/creation/widgets/methods/di/ReturnCreationMethodsComponent;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final ReturnCreationMethodsComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new ReturnCreationMethodsComponent(storage) { // from class: ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsComponent$Companion$create$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                /* renamed from: atomElementMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j atomElementMapper = k.b(ReturnCreationMethodsComponent$Companion$create$1$atomElementMapper$2.INSTANCE);

                /* renamed from: imagesElementMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j imagesElementMapper = k.b(ReturnCreationMethodsComponent$Companion$create$1$imagesElementMapper$2.INSTANCE);

                /* renamed from: textWithIconButtElementMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j textWithIconButtElementMapper = k.b(ReturnCreationMethodsComponent$Companion$create$1$textWithIconButtElementMapper$2.INSTANCE);

                /* renamed from: datesElementMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j datesElementMapper = k.b(ReturnCreationMethodsComponent$Companion$create$1$datesElementMapper$2.INSTANCE);

                {
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsComponent
                public AtomElementMapper getAtomElementMapper() {
                    return (AtomElementMapper) this.atomElementMapper.getValue();
                }

                @Override // ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsComponent
                public DatesElementMapper getDatesElementMapper() {
                    return (DatesElementMapper) this.datesElementMapper.getValue();
                }

                @Override // ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsComponent
                public ImagesElementMapper getImagesElementMapper() {
                    return (ImagesElementMapper) this.imagesElementMapper.getValue();
                }

                @Override // ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsComponent
                public TextWithIconButtonElementMapper getTextWithIconButtElementMapper() {
                    return (TextWithIconButtonElementMapper) this.textWithIconButtElementMapper.getValue();
                }
            };
        }
    }

    @NotNull
    AtomElementMapper getAtomElementMapper();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    DatesElementMapper getDatesElementMapper();

    @NotNull
    ImagesElementMapper getImagesElementMapper();

    @NotNull
    TextWithIconButtonElementMapper getTextWithIconButtElementMapper();
}
