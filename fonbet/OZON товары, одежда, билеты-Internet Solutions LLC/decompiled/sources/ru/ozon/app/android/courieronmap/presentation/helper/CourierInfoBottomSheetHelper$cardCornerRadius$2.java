package ru.ozon.app.android.courieronmap.presentation.helper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CourierInfoBottomSheetHelper$cardCornerRadius$2 extends AbstractC7737t implements Function0<Float> {
    public static final CourierInfoBottomSheetHelper$cardCornerRadius$2 INSTANCE = new CourierInfoBottomSheetHelper$cardCornerRadius$2();

    CourierInfoBottomSheetHelper$cardCornerRadius$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(ResourceExtKt.toPx(24));
    }
}
