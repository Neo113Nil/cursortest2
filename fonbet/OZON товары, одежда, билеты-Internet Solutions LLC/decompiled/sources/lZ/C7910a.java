package lZ;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;
import ru.ozon.app.android.abtool.data.model.ValueType;
import ru.ozon.app.android.abtool.utils.FeatureDTOUtilsKt;

/* renamed from: lZ.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7910a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f73155a = k.b(C1228a.f73156b);

    /* renamed from: lZ.a$a, reason: collision with other inner class name */
    static final class C1228a extends AbstractC7737t implements Function0<FeatureDTO> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1228a f73156b = new C1228a(0);

        @Override // kotlin.jvm.functions.Function0
        public final FeatureDTO invoke() {
            return new FeatureDTO(FeatureDTOUtilsKt.featureFlagDisplayedName("Интервал между получением нового CdnChooser конфига", "https://jit.o3.ru/browse/LIBMOB-10168", "https://jit.o3.ru/browse/MP-2915"), "cdnchooser", "android_config_fetch_interval", ValueType.LONG, 3600L, null, UpdateStrategy.AS_FETCHED);
        }
    }

    @NotNull
    public static FeatureDTO a() {
        return (FeatureDTO) f73155a.getValue();
    }
}
