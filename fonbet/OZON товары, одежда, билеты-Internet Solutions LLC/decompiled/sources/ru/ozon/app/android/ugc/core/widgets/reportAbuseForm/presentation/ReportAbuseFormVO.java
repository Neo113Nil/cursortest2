package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation;

import G.g;
import Kk.C3532b;
import Ns.b;
import TY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.RadioTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b\u000e\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b+\u0010\u0015R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/uni/atoms/data/cell/RadioTitleSubtitleCellDTO;", "abuseReasons", "", "inputTextPlaceholder", "", "isHideInput", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getAbuseReasons", "()Ljava/util/List;", "Ljava/lang/String;", "getInputTextPlaceholder", "Z", "()Z", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReportAbuseFormVO implements c {

    @NotNull
    private final List<RadioTitleSubtitleCellDTO> abuseReasons;
    private final String backgroundColor;

    @NotNull
    private final CornerRadius cornerRadius;
    private final long id;

    @NotNull
    private final String inputTextPlaceholder;
    private final boolean isHideInput;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public ReportAbuseFormVO(long j11, @NotNull TextDTO title, TextDTO textDTO, @NotNull List<RadioTitleSubtitleCellDTO> abuseReasons, @NotNull String inputTextPlaceholder, boolean z11, String str, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(abuseReasons, "abuseReasons");
        Intrinsics.checkNotNullParameter(inputTextPlaceholder, "inputTextPlaceholder");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.abuseReasons = abuseReasons;
        this.inputTextPlaceholder = inputTextPlaceholder;
        this.isHideInput = z11;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportAbuseFormVO)) {
            return false;
        }
        ReportAbuseFormVO reportAbuseFormVO = (ReportAbuseFormVO) other;
        return this.id == reportAbuseFormVO.id && Intrinsics.d(this.title, reportAbuseFormVO.title) && Intrinsics.d(this.subtitle, reportAbuseFormVO.subtitle) && Intrinsics.d(this.abuseReasons, reportAbuseFormVO.abuseReasons) && Intrinsics.d(this.inputTextPlaceholder, reportAbuseFormVO.inputTextPlaceholder) && this.isHideInput == reportAbuseFormVO.isHideInput && Intrinsics.d(this.backgroundColor, reportAbuseFormVO.backgroundColor) && this.cornerRadius == reportAbuseFormVO.cornerRadius;
    }

    @NotNull
    public final List<RadioTitleSubtitleCellDTO> getAbuseReasons() {
        return this.abuseReasons;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getInputTextPlaceholder() {
        return this.inputTextPlaceholder;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int a12 = C3532b.a(g.a(g.b((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.abuseReasons), 31, this.inputTextPlaceholder), 31, this.isHideInput);
        String str = this.backgroundColor;
        return this.cornerRadius.hashCode() + ((a12 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* renamed from: isHideInput, reason: from getter */
    public final boolean getIsHideInput() {
        return this.isHideInput;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<RadioTitleSubtitleCellDTO> list = this.abuseReasons;
        String str = this.inputTextPlaceholder;
        boolean z11 = this.isHideInput;
        String str2 = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder b11 = a.b("ReportAbuseFormVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", abuseReasons=");
        b11.append(list);
        D40.a.g(", inputTextPlaceholder=", str, ", isHideInput=", b11, z11);
        b11.append(", backgroundColor=");
        b11.append(str2);
        b11.append(", cornerRadius=");
        b11.append(cornerRadius);
        b11.append(")");
        return b11.toString();
    }
}
