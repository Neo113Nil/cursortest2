package ru.ozon.app.android.atoms.data.controls.button;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/ButtonsDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "type", "Lru/ozon/app/android/atoms/data/DsAtomsType;", "common", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "context", "", "<init>", "(Lru/ozon/app/android/atoms/data/DsAtomsType;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getCommon", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getContext", "()Ljava/lang/String;", "Lru/ozon/app/android/atoms/data/controls/button/ButtonDTO;", "Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/atoms/data/controls/button/DataButtonDTO;", "Lru/ozon/app/android/atoms/data/controls/button/IconButtonDTO;", "Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO;", "Lru/ozon/app/android/atoms/data/controls/button/IconLabelButtonDTO;", "Lru/ozon/app/android/atoms/data/controls/button/IndicatorLabelButtonDTO;", "Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO;", "Lru/ozon/app/android/atoms/data/controls/button/UncontainedButtonDTO;", "Lru/ozon/app/android/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ButtonsDTO extends AtomDTO {
    public static final int $stable = 0;
    private final CommonControlSettings common;
    private final String context;

    public /* synthetic */ ButtonsDTO(DsAtomsType dsAtomsType, CommonControlSettings commonControlSettings, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(dsAtomsType, commonControlSettings, str);
    }

    public CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public /* synthetic */ ButtonsDTO(DsAtomsType dsAtomsType, CommonControlSettings commonControlSettings, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dsAtomsType, (i11 & 2) != 0 ? null : commonControlSettings, (i11 & 4) != 0 ? null : str, null);
    }

    private ButtonsDTO(DsAtomsType dsAtomsType, CommonControlSettings commonControlSettings, String str) {
        super(dsAtomsType, str, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        this.common = commonControlSettings;
        this.context = str;
    }
}
