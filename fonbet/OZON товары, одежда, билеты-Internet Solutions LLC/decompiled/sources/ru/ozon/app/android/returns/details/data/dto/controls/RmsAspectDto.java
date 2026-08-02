package ru.ozon.app.android.returns.details.data.dto.controls;

import G.g;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB3\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J:\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto;", "", "type", "Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto$Type;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "selected", "", "<init>", "(Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getType", "()Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto$Type;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSelected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto;", "equals", "other", "hashCode", "", "toString", "Type", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RmsAspectDto {
    public static final int $stable = 0;
    private final Boolean selected;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto$Type;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "ICON_WITH_TITLES", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @i(name = "textAspect")
        public static final Type TEXT = new Type("TEXT", 0);

        @i(name = "iconWithTitlesAspect")
        public static final Type ICON_WITH_TITLES = new Type("ICON_WITH_TITLES", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TEXT, ICON_WITH_TITLES};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public RmsAspectDto(@i(name = "type") Type type, @i(name = "title") @NotNull String title, @i(name = "subtitle") @NotNull String subtitle, @i(name = "selected") Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.type = type;
        this.title = title;
        this.subtitle = subtitle;
        this.selected = bool;
    }

    public static /* synthetic */ RmsAspectDto copy$default(RmsAspectDto rmsAspectDto, Type type, String str, String str2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            type = rmsAspectDto.type;
        }
        if ((i11 & 2) != 0) {
            str = rmsAspectDto.title;
        }
        if ((i11 & 4) != 0) {
            str2 = rmsAspectDto.subtitle;
        }
        if ((i11 & 8) != 0) {
            bool = rmsAspectDto.selected;
        }
        return rmsAspectDto.copy(type, str, str2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final RmsAspectDto copy(@i(name = "type") Type type, @i(name = "title") @NotNull String title, @i(name = "subtitle") @NotNull String subtitle, @i(name = "selected") Boolean selected) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new RmsAspectDto(type, title, subtitle, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RmsAspectDto)) {
            return false;
        }
        RmsAspectDto rmsAspectDto = (RmsAspectDto) other;
        return this.type == rmsAspectDto.type && Intrinsics.d(this.title, rmsAspectDto.title) && Intrinsics.d(this.subtitle, rmsAspectDto.subtitle) && Intrinsics.d(this.selected, rmsAspectDto.selected);
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        Type type = this.type;
        int a11 = g.a(g.a((type == null ? 0 : type.hashCode()) * 31, 31, this.title), 31, this.subtitle);
        Boolean bool = this.selected;
        return a11 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RmsAspectDto(type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", selected=" + this.selected + ")";
    }
}
