package ru.ozon.app.android.abtool.data.repository;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.data.local.entity.ExperimentEntity;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/abtool/data/local/entity/ExperimentEntity;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AbVariantsRepository$getAbVariantsIds$2 extends AbstractC7737t implements Function1<ExperimentEntity, CharSequence> {
    public static final AbVariantsRepository$getAbVariantsIds$2 INSTANCE = new AbVariantsRepository$getAbVariantsIds$2();

    AbVariantsRepository$getAbVariantsIds$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(ExperimentEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return String.valueOf(it.getVariantId());
    }
}
