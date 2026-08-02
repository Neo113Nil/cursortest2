package ru.ozon.app.android.abtool.utils;

import Sc.o;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.ValueType;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"getValueType", "Lru/ozon/app/android/abtool/data/model/ValueType;", "", "toFeatureValueType", "Lru/ozon/app/android/abtool/domain/ValueType;", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValueTypeUtilsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValueType.values().length];
            try {
                iArr[ValueType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueType.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValueType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValueType.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ValueType.EXCEPTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ValueType getValueType(@NotNull String str) {
        Object obj;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Iterator<E> it = ValueType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((ValueType) obj).getValue(), str)) {
                break;
            }
        }
        ValueType valueType = (ValueType) obj;
        return valueType == null ? ValueType.EXCEPTION : valueType;
    }

    @NotNull
    public static final ru.ozon.app.android.abtool.domain.ValueType toFeatureValueType(@NotNull ValueType valueType) {
        Intrinsics.checkNotNullParameter(valueType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[valueType.ordinal()]) {
            case 1:
                return ru.ozon.app.android.abtool.domain.ValueType.STRING;
            case 2:
                return ru.ozon.app.android.abtool.domain.ValueType.INT;
            case 3:
                return ru.ozon.app.android.abtool.domain.ValueType.BOOLEAN;
            case 4:
                return ru.ozon.app.android.abtool.domain.ValueType.FLOAT;
            case 5:
                return ru.ozon.app.android.abtool.domain.ValueType.LONG;
            case 6:
                return ru.ozon.app.android.abtool.domain.ValueType.EXCEPTION;
            default:
                throw new o();
        }
    }
}
