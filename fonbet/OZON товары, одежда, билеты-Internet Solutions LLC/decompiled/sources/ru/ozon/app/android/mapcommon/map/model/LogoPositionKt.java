package ru.ozon.app.android.mapcommon.map.model;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/mapcommon/map/model/LogoPosition;", "Lwe0/r;", "toMapSdkLogoPosition", "(Lru/ozon/app/android/mapcommon/map/model/LogoPosition;)Lwe0/r;", "map-common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LogoPositionKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogoPosition.values().length];
            try {
                iArr[LogoPosition.LEFT_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogoPosition.LEFT_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogoPosition.RIGHT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogoPosition.RIGHT_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final r toMapSdkLogoPosition(@NotNull LogoPosition logoPosition) {
        Intrinsics.checkNotNullParameter(logoPosition, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[logoPosition.ordinal()];
        if (i11 == 1) {
            return r.LEFT_BOTTOM;
        }
        if (i11 == 2) {
            return r.LEFT_TOP;
        }
        if (i11 == 3) {
            return r.RIGHT_BOTTOM;
        }
        if (i11 == 4) {
            return r.RIGHT_TOP;
        }
        throw new o();
    }
}
