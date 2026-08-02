package ru.ozon.app.android.returns.creation.widgets.methods.data;

import H3.c;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/data/DatesDTO;", "", "dates", "", "Lru/ozon/app/android/returns/creation/widgets/methods/data/DatesDTO$DateDTO;", "<init>", "(Ljava/util/List;)V", "getDates", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DateDTO", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DatesDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<DateDTO> dates;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/data/DatesDTO$DateDTO;", "", "wrapper", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getWrapper", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateDTO {
        public static final int $stable = AspectDTO.$stable;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final AspectDTO wrapper;

        public DateDTO(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.wrapper = wrapper;
            this.title = title;
            this.subtitle = subtitle;
        }

        public static /* synthetic */ DateDTO copy$default(DateDTO dateDTO, AspectDTO aspectDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aspectDTO = dateDTO.wrapper;
            }
            if ((i11 & 2) != 0) {
                textDTO = dateDTO.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = dateDTO.subtitle;
            }
            return dateDTO.copy(aspectDTO, textDTO, textDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final DateDTO copy(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new DateDTO(wrapper, title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateDTO)) {
                return false;
            }
            DateDTO dateDTO = (DateDTO) other;
            return Intrinsics.d(this.wrapper, dateDTO.wrapper) && Intrinsics.d(this.title, dateDTO.title) && Intrinsics.d(this.subtitle, dateDTO.subtitle);
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + b.a(this.title, this.wrapper.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            AspectDTO aspectDTO = this.wrapper;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            StringBuilder sb2 = new StringBuilder("DateDTO(wrapper=");
            sb2.append(aspectDTO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", subtitle=");
            return Tl.b.e(sb2, textDTO2, ")");
        }
    }

    public DatesDTO(@NotNull List<DateDTO> dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        this.dates = dates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DatesDTO copy$default(DatesDTO datesDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = datesDTO.dates;
        }
        return datesDTO.copy(list);
    }

    @NotNull
    public final List<DateDTO> component1() {
        return this.dates;
    }

    @NotNull
    public final DatesDTO copy(@NotNull List<DateDTO> dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        return new DatesDTO(dates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DatesDTO) && Intrinsics.d(this.dates, ((DatesDTO) other).dates);
    }

    @NotNull
    public final List<DateDTO> getDates() {
        return this.dates;
    }

    public int hashCode() {
        return this.dates.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("DatesDTO(dates=", ")", this.dates);
    }
}
