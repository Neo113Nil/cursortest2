package ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation;

import B0.C2454a;
import Ns.b;
import TY.a;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/presentation/TitleSubtitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "alignment", "Le1/b$b;", "composeAlignment", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ILe1/b$b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "I", "getAlignment", "Le1/b$b;", "getComposeAlignment", "()Le1/b$b;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TitleSubtitleVO implements c {
    private final int alignment;

    @NotNull
    private final InterfaceC6250b.InterfaceC0966b composeAlignment;
    private final long id;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public TitleSubtitleVO(long j11, @NotNull TextDTO title, TextDTO textDTO, int i11, @NotNull InterfaceC6250b.InterfaceC0966b composeAlignment) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(composeAlignment, "composeAlignment");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.alignment = i11;
        this.composeAlignment = composeAlignment;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleSubtitleVO)) {
            return false;
        }
        TitleSubtitleVO titleSubtitleVO = (TitleSubtitleVO) other;
        return this.id == titleSubtitleVO.id && Intrinsics.d(this.title, titleSubtitleVO.title) && Intrinsics.d(this.subtitle, titleSubtitleVO.subtitle) && this.alignment == titleSubtitleVO.alignment && Intrinsics.d(this.composeAlignment, titleSubtitleVO.composeAlignment);
    }

    public final int getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final InterfaceC6250b.InterfaceC0966b getComposeAlignment() {
        return this.composeAlignment;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        return this.composeAlignment.hashCode() + C2454a.a(this.alignment, (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        int i11 = this.alignment;
        InterfaceC6250b.InterfaceC0966b interfaceC0966b = this.composeAlignment;
        StringBuilder b11 = a.b("TitleSubtitleVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", alignment=");
        b11.append(i11);
        b11.append(", composeAlignment=");
        b11.append(interfaceC0966b);
        b11.append(")");
        return b11.toString();
    }
}
