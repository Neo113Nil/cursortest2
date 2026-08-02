package ru.ozon.app.android.mapcommon.map.model;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.EnumC10550f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwe0/f;", "Lru/ozon/app/android/mapcommon/map/model/CameraUpdateReasonModel;", "toCameraUpdateReasonModel", "(Lwe0/f;)Lru/ozon/app/android/mapcommon/map/model/CameraUpdateReasonModel;", "map-common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CameraUpdateReasonModelKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC10550f.values().length];
            try {
                iArr[EnumC10550f.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10550f.USER_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final CameraUpdateReasonModel toCameraUpdateReasonModel(@NotNull EnumC10550f enumC10550f) {
        Intrinsics.checkNotNullParameter(enumC10550f, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[enumC10550f.ordinal()];
        if (i11 == 1) {
            return CameraUpdateReasonModel.APPLICATION;
        }
        if (i11 == 2) {
            return CameraUpdateReasonModel.GESTURES;
        }
        throw new o();
    }
}
