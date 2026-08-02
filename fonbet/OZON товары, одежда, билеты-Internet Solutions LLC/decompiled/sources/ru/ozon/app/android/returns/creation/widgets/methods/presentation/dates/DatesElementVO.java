package ru.ozon.app.android.returns.creation.widgets.methods.presentation.dates;

import G.g;
import Nh.a;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.Paddings;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001:\u0001(B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014¨\u0006)"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;", "paddings", "", "backgroundColor", "", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO$DateVO;", "dates", "<init>", "(JLru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;Ljava/lang/String;Ljava/util/List;)V", "component1", "()J", "component2", "()Lru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(JLru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;Ljava/lang/String;Ljava/util/List;)Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;", "getPaddings", "Ljava/lang/String;", "getBackgroundColor", "Ljava/util/List;", "getDates", "DateVO", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DatesElementVO implements c {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<DateVO> dates;
    private final long id;

    @NotNull
    private final Paddings paddings;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO$DateVO;", "", "wrapper", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getWrapper", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateVO {
        public static final int $stable = AspectDTO.$stable;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final AspectDTO wrapper;

        public DateVO(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.wrapper = wrapper;
            this.title = title;
            this.subtitle = subtitle;
        }

        public static /* synthetic */ DateVO copy$default(DateVO dateVO, AspectDTO aspectDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aspectDTO = dateVO.wrapper;
            }
            if ((i11 & 2) != 0) {
                textDTO = dateVO.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = dateVO.subtitle;
            }
            return dateVO.copy(aspectDTO, textDTO, textDTO2);
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
        public final DateVO copy(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new DateVO(wrapper, title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateVO)) {
                return false;
            }
            DateVO dateVO = (DateVO) other;
            return Intrinsics.d(this.wrapper, dateVO.wrapper) && Intrinsics.d(this.title, dateVO.title) && Intrinsics.d(this.subtitle, dateVO.subtitle);
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
            StringBuilder sb2 = new StringBuilder("DateVO(wrapper=");
            sb2.append(aspectDTO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", subtitle=");
            return Tl.b.e(sb2, textDTO2, ")");
        }
    }

    public DatesElementVO(long j11, @NotNull Paddings paddings, @NotNull String backgroundColor, @NotNull List<DateVO> dates) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(dates, "dates");
        this.id = j11;
        this.paddings = paddings;
        this.backgroundColor = backgroundColor;
        this.dates = dates;
    }

    public static /* synthetic */ DatesElementVO copy$default(DatesElementVO datesElementVO, long j11, Paddings paddings, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = datesElementVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            paddings = datesElementVO.paddings;
        }
        Paddings paddings2 = paddings;
        if ((i11 & 4) != 0) {
            str = datesElementVO.backgroundColor;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            list = datesElementVO.dates;
        }
        return datesElementVO.copy(j12, paddings2, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Paddings getPaddings() {
        return this.paddings;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<DateVO> component4() {
        return this.dates;
    }

    @NotNull
    public final DatesElementVO copy(long id2, @NotNull Paddings paddings, @NotNull String backgroundColor, @NotNull List<DateVO> dates) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(dates, "dates");
        return new DatesElementVO(id2, paddings, backgroundColor, dates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatesElementVO)) {
            return false;
        }
        DatesElementVO datesElementVO = (DatesElementVO) other;
        return this.id == datesElementVO.id && Intrinsics.d(this.paddings, datesElementVO.paddings) && Intrinsics.d(this.backgroundColor, datesElementVO.backgroundColor) && Intrinsics.d(this.dates, datesElementVO.dates);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<DateVO> getDates() {
        return this.dates;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Paddings getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.dates.hashCode() + g.a((this.paddings.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.backgroundColor);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Paddings paddings = this.paddings;
        String str = this.backgroundColor;
        List<DateVO> list = this.dates;
        StringBuilder sb2 = new StringBuilder("DatesElementVO(id=");
        sb2.append(j11);
        sb2.append(", paddings=");
        sb2.append(paddings);
        a.g(", backgroundColor=", str, ", dates=", sb2, list);
        sb2.append(")");
        return sb2.toString();
    }
}
