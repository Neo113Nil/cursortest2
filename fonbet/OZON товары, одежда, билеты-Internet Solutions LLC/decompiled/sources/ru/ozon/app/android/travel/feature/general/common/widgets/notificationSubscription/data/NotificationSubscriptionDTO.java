package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003!\"#BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO;", "", "isSticky", "", "cell", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$Cell;", "asyncParams", "", "", "behaviorType", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$AsyncBehaviorType;", "shouldSkipPermissionCheck", "<init>", "(ZLru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$Cell;Ljava/util/Map;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$AsyncBehaviorType;Z)V", "()Z", "getCell", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$Cell;", "getAsyncParams", "()Ljava/util/Map;", "getBehaviorType", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$AsyncBehaviorType;", "getShouldSkipPermissionCheck", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Cell", "TextWrapper", "AsyncBehaviorType", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationSubscriptionDTO {
    public static final int $stable = 8;
    private final Map<String, String> asyncParams;

    @EnumNullFallback
    @NotNull
    private final AsyncBehaviorType behaviorType;
    private final Cell cell;
    private final boolean isSticky;
    private final boolean shouldSkipPermissionCheck;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$AsyncBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACTION", "FETCH", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AsyncBehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AsyncBehaviorType[] $VALUES;

        @i(name = "NO_ACTION")
        public static final AsyncBehaviorType NO_ACTION = new AsyncBehaviorType("NO_ACTION", 0);

        @i(name = "FETCH")
        public static final AsyncBehaviorType FETCH = new AsyncBehaviorType("FETCH", 1);

        private static final /* synthetic */ AsyncBehaviorType[] $values() {
            return new AsyncBehaviorType[]{NO_ACTION, FETCH};
        }

        static {
            AsyncBehaviorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AsyncBehaviorType(String str, int i11) {
        }

        public static AsyncBehaviorType valueOf(String str) {
            return (AsyncBehaviorType) Enum.valueOf(AsyncBehaviorType.class, str);
        }

        public static AsyncBehaviorType[] values() {
            return (AsyncBehaviorType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$Cell;", "", "checkbox", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "textWrapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$TextWrapper;", "settings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$TextWrapper;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "getTextWrapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$TextWrapper;", "getSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Cell {
        public static final int $stable = CheckBoxDTO.$stable;

        @NotNull
        private final CheckBoxDTO checkbox;

        @NotNull
        private final CommonControlSettings settings;

        @NotNull
        private final TextWrapper textWrapper;

        public Cell(@NotNull CheckBoxDTO checkbox, @NotNull TextWrapper textWrapper, @NotNull CommonControlSettings settings) {
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Intrinsics.checkNotNullParameter(textWrapper, "textWrapper");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.checkbox = checkbox;
            this.textWrapper = textWrapper;
            this.settings = settings;
        }

        public static /* synthetic */ Cell copy$default(Cell cell, CheckBoxDTO checkBoxDTO, TextWrapper textWrapper, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                checkBoxDTO = cell.checkbox;
            }
            if ((i11 & 2) != 0) {
                textWrapper = cell.textWrapper;
            }
            if ((i11 & 4) != 0) {
                commonControlSettings = cell.settings;
            }
            return cell.copy(checkBoxDTO, textWrapper, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CheckBoxDTO getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextWrapper getTextWrapper() {
            return this.textWrapper;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CommonControlSettings getSettings() {
            return this.settings;
        }

        @NotNull
        public final Cell copy(@NotNull CheckBoxDTO checkbox, @NotNull TextWrapper textWrapper, @NotNull CommonControlSettings settings) {
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Intrinsics.checkNotNullParameter(textWrapper, "textWrapper");
            Intrinsics.checkNotNullParameter(settings, "settings");
            return new Cell(checkbox, textWrapper, settings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cell)) {
                return false;
            }
            Cell cell = (Cell) other;
            return Intrinsics.d(this.checkbox, cell.checkbox) && Intrinsics.d(this.textWrapper, cell.textWrapper) && Intrinsics.d(this.settings, cell.settings);
        }

        @NotNull
        public final CheckBoxDTO getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        public final CommonControlSettings getSettings() {
            return this.settings;
        }

        @NotNull
        public final TextWrapper getTextWrapper() {
            return this.textWrapper;
        }

        public int hashCode() {
            return this.settings.hashCode() + ((this.textWrapper.hashCode() + (this.checkbox.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            CheckBoxDTO checkBoxDTO = this.checkbox;
            TextWrapper textWrapper = this.textWrapper;
            CommonControlSettings commonControlSettings = this.settings;
            StringBuilder sb2 = new StringBuilder("Cell(checkbox=");
            sb2.append(checkBoxDTO);
            sb2.append(", textWrapper=");
            sb2.append(textWrapper);
            sb2.append(", settings=");
            return Ak.b.g(sb2, commonControlSettings, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$TextWrapper;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "settings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextWrapper {
        public static final int $stable = 0;
        private final CommonControlSettings settings;

        @NotNull
        private final TextDTO text;

        public TextWrapper(@NotNull TextDTO text, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.settings = commonControlSettings;
        }

        public static /* synthetic */ TextWrapper copy$default(TextWrapper textWrapper, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = textWrapper.text;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = textWrapper.settings;
            }
            return textWrapper.copy(textDTO, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getSettings() {
            return this.settings;
        }

        @NotNull
        public final TextWrapper copy(@NotNull TextDTO text, CommonControlSettings settings) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TextWrapper(text, settings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextWrapper)) {
                return false;
            }
            TextWrapper textWrapper = (TextWrapper) other;
            return Intrinsics.d(this.text, textWrapper.text) && Intrinsics.d(this.settings, textWrapper.settings);
        }

        public final CommonControlSettings getSettings() {
            return this.settings;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            CommonControlSettings commonControlSettings = this.settings;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            return "TextWrapper(text=" + this.text + ", settings=" + this.settings + ")";
        }
    }

    public NotificationSubscriptionDTO(boolean z11, Cell cell, Map<String, String> map, @NotNull AsyncBehaviorType behaviorType, boolean z12) {
        Intrinsics.checkNotNullParameter(behaviorType, "behaviorType");
        this.isSticky = z11;
        this.cell = cell;
        this.asyncParams = map;
        this.behaviorType = behaviorType;
        this.shouldSkipPermissionCheck = z12;
    }

    public static /* synthetic */ NotificationSubscriptionDTO copy$default(NotificationSubscriptionDTO notificationSubscriptionDTO, boolean z11, Cell cell, Map map, AsyncBehaviorType asyncBehaviorType, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = notificationSubscriptionDTO.isSticky;
        }
        if ((i11 & 2) != 0) {
            cell = notificationSubscriptionDTO.cell;
        }
        if ((i11 & 4) != 0) {
            map = notificationSubscriptionDTO.asyncParams;
        }
        if ((i11 & 8) != 0) {
            asyncBehaviorType = notificationSubscriptionDTO.behaviorType;
        }
        if ((i11 & 16) != 0) {
            z12 = notificationSubscriptionDTO.shouldSkipPermissionCheck;
        }
        boolean z13 = z12;
        Map map2 = map;
        return notificationSubscriptionDTO.copy(z11, cell, map2, asyncBehaviorType, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component2, reason: from getter */
    public final Cell getCell() {
        return this.cell;
    }

    public final Map<String, String> component3() {
        return this.asyncParams;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AsyncBehaviorType getBehaviorType() {
        return this.behaviorType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldSkipPermissionCheck() {
        return this.shouldSkipPermissionCheck;
    }

    @NotNull
    public final NotificationSubscriptionDTO copy(boolean isSticky, Cell cell, Map<String, String> asyncParams, @NotNull AsyncBehaviorType behaviorType, boolean shouldSkipPermissionCheck) {
        Intrinsics.checkNotNullParameter(behaviorType, "behaviorType");
        return new NotificationSubscriptionDTO(isSticky, cell, asyncParams, behaviorType, shouldSkipPermissionCheck);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSubscriptionDTO)) {
            return false;
        }
        NotificationSubscriptionDTO notificationSubscriptionDTO = (NotificationSubscriptionDTO) other;
        return this.isSticky == notificationSubscriptionDTO.isSticky && Intrinsics.d(this.cell, notificationSubscriptionDTO.cell) && Intrinsics.d(this.asyncParams, notificationSubscriptionDTO.asyncParams) && this.behaviorType == notificationSubscriptionDTO.behaviorType && this.shouldSkipPermissionCheck == notificationSubscriptionDTO.shouldSkipPermissionCheck;
    }

    public final Map<String, String> getAsyncParams() {
        return this.asyncParams;
    }

    @NotNull
    public final AsyncBehaviorType getBehaviorType() {
        return this.behaviorType;
    }

    public final Cell getCell() {
        return this.cell;
    }

    public final boolean getShouldSkipPermissionCheck() {
        return this.shouldSkipPermissionCheck;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isSticky) * 31;
        Cell cell = this.cell;
        int hashCode2 = (hashCode + (cell == null ? 0 : cell.hashCode())) * 31;
        Map<String, String> map = this.asyncParams;
        return Boolean.hashCode(this.shouldSkipPermissionCheck) + ((this.behaviorType.hashCode() + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31)) * 31);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isSticky;
        Cell cell = this.cell;
        Map<String, String> map = this.asyncParams;
        AsyncBehaviorType asyncBehaviorType = this.behaviorType;
        boolean z12 = this.shouldSkipPermissionCheck;
        StringBuilder sb2 = new StringBuilder("NotificationSubscriptionDTO(isSticky=");
        sb2.append(z11);
        sb2.append(", cell=");
        sb2.append(cell);
        sb2.append(", asyncParams=");
        sb2.append(map);
        sb2.append(", behaviorType=");
        sb2.append(asyncBehaviorType);
        sb2.append(", shouldSkipPermissionCheck=");
        return Pk0.a.a(")", sb2, z12);
    }

    public /* synthetic */ NotificationSubscriptionDTO(boolean z11, Cell cell, Map map, AsyncBehaviorType asyncBehaviorType, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, cell, map, (i11 & 8) != 0 ? AsyncBehaviorType.NO_ACTION : asyncBehaviorType, (i11 & 16) != 0 ? false : z12);
    }
}
