package qd0;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;
import ru.ozon.app.android.abtool.data.model.ValueType;
import ru.ozon.app.android.abtool.utils.FeatureDTOUtilsKt;

/* renamed from: qd0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9025a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f81934a = k.b(C1383a.f81935b);

    /* renamed from: qd0.a$a, reason: collision with other inner class name */
    static final class C1383a extends AbstractC7737t implements Function0<FeatureDTO> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1383a f81935b = new C1383a(0);

        @Override // kotlin.jvm.functions.Function0
        public final FeatureDTO invoke() {
            return new FeatureDTO(FeatureDTOUtilsKt.featureFlagDisplayedName$default("Включение логирования времени инициализации OzonId", null, "https://jit.o3.ru/browse/MP-4613", 2, null), "ozonid_lib", "sdk_init_ozon_id_enabled_android", ValueType.BOOLEAN, Boolean.FALSE, null, UpdateStrategy.PER_PROCESS);
        }
    }

    @NotNull
    public static FeatureDTO a() {
        return (FeatureDTO) f81934a.getValue();
    }
}
