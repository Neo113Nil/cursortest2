package ru.ozon.app.android.pikazon;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pikazon.glide.transformations.factory.GlideImageTransformationsFactory;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pikazon/glide/transformations/factory/GlideImageTransformationsFactory;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class Pikazon$imageTransformationsFactory$2 extends AbstractC7737t implements Function0<GlideImageTransformationsFactory> {
    public static final Pikazon$imageTransformationsFactory$2 INSTANCE = new Pikazon$imageTransformationsFactory$2();

    Pikazon$imageTransformationsFactory$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final GlideImageTransformationsFactory invoke() {
        return new GlideImageTransformationsFactory();
    }
}
