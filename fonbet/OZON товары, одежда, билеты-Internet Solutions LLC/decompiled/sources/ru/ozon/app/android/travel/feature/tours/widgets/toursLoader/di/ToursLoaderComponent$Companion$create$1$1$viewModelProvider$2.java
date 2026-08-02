package ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.data.ToursLoaderApi;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation.ToursLoaderViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/presentation/ToursLoaderViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes5.dex */
final class ToursLoaderComponent$Companion$create$1$1$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<ToursLoaderViewModel>> {
    final /* synthetic */ ToursLoaderComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursLoaderComponent$Companion$create$1$1$viewModelProvider$2(ToursLoaderComponent$Companion$create$1$1 toursLoaderComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = toursLoaderComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToursLoaderViewModel invoke$lambda$0(ToursLoaderComponent$Companion$create$1$1 toursLoaderComponent$Companion$create$1$1) {
        ToursLoaderApi toursLoaderApi;
        toursLoaderApi = toursLoaderComponent$Companion$create$1$1.getToursLoaderApi();
        Intrinsics.checkNotNullExpressionValue(toursLoaderApi, "access$getToursLoaderApi(...)");
        return new ToursLoaderViewModel(toursLoaderApi);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<ToursLoaderViewModel> invoke() {
        final ToursLoaderComponent$Companion$create$1$1 toursLoaderComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.di.a
            @Override // Pc.a
            public final Object get() {
                ToursLoaderViewModel invoke$lambda$0;
                invoke$lambda$0 = ToursLoaderComponent$Companion$create$1$1$viewModelProvider$2.invoke$lambda$0(ToursLoaderComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
