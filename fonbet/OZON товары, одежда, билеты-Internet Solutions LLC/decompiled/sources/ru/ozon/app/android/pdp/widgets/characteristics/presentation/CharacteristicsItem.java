package ru.ozon.app.android.pdp.widgets.characteristics.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsItem;", "", "id", "", "viewType", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsType;", "<init>", "(JLru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsType;)V", "getId", "()J", "getViewType", "()Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsType;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsHeader;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsValues;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CharacteristicsItem {
    private final long id;

    @NotNull
    private final CharacteristicsType viewType;

    public /* synthetic */ CharacteristicsItem(long j11, CharacteristicsType characteristicsType, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, characteristicsType);
    }

    public long getId() {
        return this.id;
    }

    @NotNull
    public CharacteristicsType getViewType() {
        return this.viewType;
    }

    private CharacteristicsItem(long j11, CharacteristicsType characteristicsType) {
        this.id = j11;
        this.viewType = characteristicsType;
    }
}
