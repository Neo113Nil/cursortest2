package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import Ak.C2436a;
import An.C2439a;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001#B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\u000b\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO$Characteristic;", "characteristics", "", "isExpanded", "<init>", "(JLjava/lang/String;Ljava/util/List;Z)V", "copy", "(JLjava/lang/String;Ljava/util/List;Z)Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getCharacteristics", "()Ljava/util/List;", "Z", "()Z", "Characteristic", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CharacteristicsGroupVO implements c {

    @NotNull
    private final List<Characteristic> characteristics;
    private final long id;
    private final boolean isExpanded;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO$Characteristic;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicType;", "columns", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getColumns", "()Ljava/util/List;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Characteristic {

        @NotNull
        private final List<CharacteristicType> columns;

        @NotNull
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public Characteristic(@NotNull String title, @NotNull List<? extends CharacteristicType> columns) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(columns, "columns");
            this.title = title;
            this.columns = columns;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Characteristic)) {
                return false;
            }
            Characteristic characteristic = (Characteristic) other;
            return Intrinsics.d(this.title, characteristic.title) && Intrinsics.d(this.columns, characteristic.columns);
        }

        @NotNull
        public final List<CharacteristicType> getColumns() {
            return this.columns;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.columns.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("Characteristic(title=", this.title, ", columns=", ")", this.columns);
        }
    }

    public CharacteristicsGroupVO(long j11, @NotNull String title, @NotNull List<Characteristic> characteristics, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.id = j11;
        this.title = title;
        this.characteristics = characteristics;
        this.isExpanded = z11;
    }

    public static /* synthetic */ CharacteristicsGroupVO copy$default(CharacteristicsGroupVO characteristicsGroupVO, long j11, String str, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = characteristicsGroupVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = characteristicsGroupVO.title;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            list = characteristicsGroupVO.characteristics;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            z11 = characteristicsGroupVO.isExpanded;
        }
        return characteristicsGroupVO.copy(j12, str2, list2, z11);
    }

    @NotNull
    public final CharacteristicsGroupVO copy(long id2, @NotNull String title, @NotNull List<Characteristic> characteristics, boolean isExpanded) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        return new CharacteristicsGroupVO(id2, title, characteristics, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharacteristicsGroupVO)) {
            return false;
        }
        CharacteristicsGroupVO characteristicsGroupVO = (CharacteristicsGroupVO) other;
        return this.id == characteristicsGroupVO.id && Intrinsics.d(this.title, characteristicsGroupVO.title) && Intrinsics.d(this.characteristics, characteristicsGroupVO.characteristics) && this.isExpanded == characteristicsGroupVO.isExpanded;
    }

    @NotNull
    public final List<Characteristic> getCharacteristics() {
        return this.characteristics;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExpanded) + g.b(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.characteristics);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        List<Characteristic> list = this.characteristics;
        boolean z11 = this.isExpanded;
        StringBuilder c11 = C2436a.c(j11, "CharacteristicsGroupVO(id=", ", title=", str);
        AZ.c.c(c11, ", characteristics=", list, ", isExpanded=", z11);
        c11.append(")");
        return c11.toString();
    }
}
