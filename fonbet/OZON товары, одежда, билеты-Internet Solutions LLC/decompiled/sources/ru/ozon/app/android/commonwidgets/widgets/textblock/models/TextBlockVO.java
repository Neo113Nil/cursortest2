package ru.ozon.app.android.commonwidgets.widgets.textblock.models;

import Ak.C2436a;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b\u000b\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/AtomDTO;", "body", "", "isRounded", "", "atomSpacing", "<init>", "(JLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getBody", "()Ljava/util/List;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getAtomSpacing", "()Ljava/lang/Integer;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TextBlockVO implements c {
    private final Integer atomSpacing;

    @NotNull
    private final List<AtomDTO> body;
    private final long id;
    private final Boolean isRounded;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public TextBlockVO(long j11, String str, @NotNull List<? extends AtomDTO> body, Boolean bool, Integer num) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.id = j11;
        this.title = str;
        this.body = body;
        this.isRounded = bool;
        this.atomSpacing = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextBlockVO)) {
            return false;
        }
        TextBlockVO textBlockVO = (TextBlockVO) other;
        return this.id == textBlockVO.id && Intrinsics.d(this.title, textBlockVO.title) && Intrinsics.d(this.body, textBlockVO.body) && Intrinsics.d(this.isRounded, textBlockVO.isRounded) && Intrinsics.d(this.atomSpacing, textBlockVO.atomSpacing);
    }

    public final Integer getAtomSpacing() {
        return this.atomSpacing;
    }

    @NotNull
    public final List<AtomDTO> getBody() {
        return this.body;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.title;
        int b11 = g.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.body);
        Boolean bool = this.isRounded;
        int hashCode2 = (b11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.atomSpacing;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: isRounded, reason: from getter */
    public final Boolean getIsRounded() {
        return this.isRounded;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        List<AtomDTO> list = this.body;
        Boolean bool = this.isRounded;
        Integer num = this.atomSpacing;
        StringBuilder c11 = C2436a.c(j11, "TextBlockVO(id=", ", title=", str);
        c11.append(", body=");
        c11.append(list);
        c11.append(", isRounded=");
        c11.append(bool);
        c11.append(", atomSpacing=");
        c11.append(num);
        c11.append(")");
        return c11.toString();
    }
}
