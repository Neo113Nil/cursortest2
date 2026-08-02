package ru.ozon.fintech.features.camera.domain.tips;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toTipsType", "Lru/ozon/fintech/features/camera/domain/tips/TipsType;", "", "camera_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TipsKt {
    public static final TipsType toTipsType(String str) {
        if (str == null) {
            return null;
        }
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return TipsType.valueOf(upperCase);
        } catch (Exception unused) {
            return null;
        }
    }
}
