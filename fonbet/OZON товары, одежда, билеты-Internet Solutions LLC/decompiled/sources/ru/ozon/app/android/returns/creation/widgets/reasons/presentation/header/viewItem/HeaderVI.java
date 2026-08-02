package ru.ozon.app.android.returns.creation.widgets.reasons.presentation.header.viewItem;

import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/header/viewItem/HeaderVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HeaderVI implements c {
    private final long id;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public HeaderVI(long j11, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderVI)) {
            return false;
        }
        HeaderVI headerVI = (HeaderVI) other;
        return this.id == headerVI.id && Intrinsics.d(this.title, headerVI.title) && Intrinsics.d(this.subtitle, headerVI.subtitle);
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
        return this.subtitle.hashCode() + b.a(this.title, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        StringBuilder b11 = a.b("HeaderVI(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(")");
        return b11.toString();
    }
}
