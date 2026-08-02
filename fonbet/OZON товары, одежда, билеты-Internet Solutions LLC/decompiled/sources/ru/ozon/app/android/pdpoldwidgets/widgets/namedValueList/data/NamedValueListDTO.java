package ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.data;

import B90.C2618u;
import Co.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/data/NamedValueListDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitles", "", "namedValues", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/data/NamedValueListDTO$NamedValue;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitles", "()Ljava/util/List;", "getNamedValues", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "NamedValue", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NamedValueListDTO {

    @NotNull
    private final List<NamedValue> namedValues;
    private final List<TextAtom> subtitles;
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/data/NamedValueListDTO$NamedValue;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NamedValue {

        @NotNull
        private final TextAtom name;
        private final TextAtom value;

        public NamedValue(@NotNull TextAtom name, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.value = textAtom;
        }

        public static /* synthetic */ NamedValue copy$default(NamedValue namedValue, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = namedValue.name;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = namedValue.value;
            }
            return namedValue.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getValue() {
            return this.value;
        }

        @NotNull
        public final NamedValue copy(@NotNull TextAtom name, TextAtom value) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new NamedValue(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NamedValue)) {
                return false;
            }
            NamedValue namedValue = (NamedValue) other;
            return Intrinsics.d(this.name, namedValue.name) && Intrinsics.d(this.value, namedValue.value);
        }

        @NotNull
        public final TextAtom getName() {
            return this.name;
        }

        public final TextAtom getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            TextAtom textAtom = this.value;
            return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            return a.a("NamedValue(name=", this.name, ", value=", this.value, ")");
        }
    }

    public NamedValueListDTO(TextAtom textAtom, List<TextAtom> list, @NotNull List<NamedValue> namedValues) {
        Intrinsics.checkNotNullParameter(namedValues, "namedValues");
        this.title = textAtom;
        this.subtitles = list;
        this.namedValues = namedValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NamedValueListDTO copy$default(NamedValueListDTO namedValueListDTO, TextAtom textAtom, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = namedValueListDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = namedValueListDTO.subtitles;
        }
        if ((i11 & 4) != 0) {
            list2 = namedValueListDTO.namedValues;
        }
        return namedValueListDTO.copy(textAtom, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    public final List<TextAtom> component2() {
        return this.subtitles;
    }

    @NotNull
    public final List<NamedValue> component3() {
        return this.namedValues;
    }

    @NotNull
    public final NamedValueListDTO copy(TextAtom title, List<TextAtom> subtitles, @NotNull List<NamedValue> namedValues) {
        Intrinsics.checkNotNullParameter(namedValues, "namedValues");
        return new NamedValueListDTO(title, subtitles, namedValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NamedValueListDTO)) {
            return false;
        }
        NamedValueListDTO namedValueListDTO = (NamedValueListDTO) other;
        return Intrinsics.d(this.title, namedValueListDTO.title) && Intrinsics.d(this.subtitles, namedValueListDTO.subtitles) && Intrinsics.d(this.namedValues, namedValueListDTO.namedValues);
    }

    @NotNull
    public final List<NamedValue> getNamedValues() {
        return this.namedValues;
    }

    public final List<TextAtom> getSubtitles() {
        return this.subtitles;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        List<TextAtom> list = this.subtitles;
        return this.namedValues.hashCode() + ((hashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        List<TextAtom> list = this.subtitles;
        List<NamedValue> list2 = this.namedValues;
        StringBuilder sb2 = new StringBuilder("NamedValueListDTO(title=");
        sb2.append(textAtom);
        sb2.append(", subtitles=");
        sb2.append(list);
        sb2.append(", namedValues=");
        return C2618u.h(sb2, list2, ")");
    }
}
