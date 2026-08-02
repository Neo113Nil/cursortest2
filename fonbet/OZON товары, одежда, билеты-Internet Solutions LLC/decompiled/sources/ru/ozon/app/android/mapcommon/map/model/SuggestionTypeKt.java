package ru.ozon.app.android.mapcommon.map.model;

import He0.c;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/mapcommon/map/model/SuggestionType;", "LHe0/c;", "toSdkSuggestionType", "(Lru/ozon/app/android/mapcommon/map/model/SuggestionType;)LHe0/c;", "map-common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuggestionTypeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SuggestionType.values().length];
            try {
                iArr[SuggestionType.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuggestionType.GEOGRAPHICAL_OBJECTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final c toSdkSuggestionType(@NotNull SuggestionType suggestionType) {
        Intrinsics.checkNotNullParameter(suggestionType, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[suggestionType.ordinal()];
        if (i11 == 1) {
            return c.ANY;
        }
        if (i11 == 2) {
            return c.GEOGRAPHICAL_OBJECTS;
        }
        throw new o();
    }
}
