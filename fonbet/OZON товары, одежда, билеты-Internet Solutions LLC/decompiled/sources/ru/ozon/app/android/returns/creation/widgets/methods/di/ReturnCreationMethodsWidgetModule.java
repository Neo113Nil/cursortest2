package ru.ozon.app.android.returns.creation.widgets.methods.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.creation.widgets.methods.core.ReturnCreationMethodsConfig;
import ru.ozon.app.android.returns.creation.widgets.methods.core.atom.AtomElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.dates.DatesElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.images.ImagesElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.textwithiconbutton.TextWithIconButtonElementViewMapper;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/di/ReturnCreationMethodsWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/returns/creation/widgets/methods/core/ReturnCreationMethodsConfig;", "atomElementViewMapper", "Lru/ozon/app/android/returns/creation/widgets/methods/core/atom/AtomElementViewMapper;", "imagesElementViewMapper", "Lru/ozon/app/android/returns/creation/widgets/methods/core/images/ImagesElementViewMapper;", "textWithIconButtonElementViewMapper", "Lru/ozon/app/android/returns/creation/widgets/methods/core/textwithiconbutton/TextWithIconButtonElementViewMapper;", "datesElementViewMapper", "Lru/ozon/app/android/returns/creation/widgets/methods/core/dates/DatesElementViewMapper;", "islandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationMethodsWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull ReturnCreationMethodsConfig config, @NotNull AtomElementViewMapper atomElementViewMapper, @NotNull ImagesElementViewMapper imagesElementViewMapper, @NotNull TextWithIconButtonElementViewMapper textWithIconButtonElementViewMapper, @NotNull DatesElementViewMapper datesElementViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(atomElementViewMapper, "atomElementViewMapper");
        Intrinsics.checkNotNullParameter(imagesElementViewMapper, "imagesElementViewMapper");
        Intrinsics.checkNotNullParameter(textWithIconButtonElementViewMapper, "textWithIconButtonElementViewMapper");
        Intrinsics.checkNotNullParameter(datesElementViewMapper, "datesElementViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        return new Widget2("rms", "returnCreationMethods", config, new ViewMapper2[]{atomElementViewMapper, textWithIconButtonElementViewMapper, imagesElementViewMapper, islandSeparatorViewMapper, datesElementViewMapper});
    }
}
