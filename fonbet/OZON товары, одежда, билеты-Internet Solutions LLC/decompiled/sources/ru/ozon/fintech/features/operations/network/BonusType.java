package ru.ozon.fintech.features.operations.network;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.C;
import com.squareup.moshi.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class BonusType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BonusType[] $VALUES;
    public static final BonusType CASHBACK;
    public static final BonusType FAVORITE_CATEGORY_CASHBACK;
    public static final BonusType HOLD_CASHBACK;
    public static final BonusType OZON_DISCOUNT;
    public static final BonusType PREMIUM;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lru/ozon/fintech/features/operations/network/BonusType$BonusTypeAdapter;", "", "<init>", "()V", "toJson", "", "type", "Lru/ozon/fintech/features/operations/network/BonusType;", "fromJson", AppMeasurementSdk.ConditionalUserProperty.VALUE, "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BonusTypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final BonusTypeAdapter f95964a = new BonusTypeAdapter();

        private BonusTypeAdapter() {
        }

        @h
        @NotNull
        public final BonusType fromJson(int value) {
            return BonusType.values()[value];
        }

        @C
        public final int toJson(@NotNull BonusType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return type.ordinal();
        }
    }

    static {
        BonusType bonusType = new BonusType("PREMIUM", 0);
        PREMIUM = bonusType;
        BonusType bonusType2 = new BonusType("CASHBACK", 1);
        CASHBACK = bonusType2;
        BonusType bonusType3 = new BonusType("FAVORITE_CATEGORY_CASHBACK", 2);
        FAVORITE_CATEGORY_CASHBACK = bonusType3;
        BonusType bonusType4 = new BonusType("HOLD_CASHBACK", 3);
        HOLD_CASHBACK = bonusType4;
        BonusType bonusType5 = new BonusType("OZON_DISCOUNT", 4);
        OZON_DISCOUNT = bonusType5;
        BonusType[] bonusTypeArr = {bonusType, bonusType2, bonusType3, bonusType4, bonusType5};
        $VALUES = bonusTypeArr;
        $ENTRIES = b.a(bonusTypeArr);
    }

    private BonusType() {
        throw null;
    }

    public static BonusType valueOf(String str) {
        return (BonusType) Enum.valueOf(BonusType.class, str);
    }

    public static BonusType[] values() {
        return (BonusType[]) $VALUES.clone();
    }
}
