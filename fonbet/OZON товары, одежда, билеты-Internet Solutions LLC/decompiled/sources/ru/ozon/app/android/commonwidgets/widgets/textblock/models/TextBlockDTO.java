package ru.ozon.app.android.commonwidgets.widgets.textblock.models;

import D3.h;
import Ep.a;
import G.g;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015JN\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0007\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\t\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "body", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "isSticky", "", "isRounded", "atomSpacing", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getBody", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAtomSpacing", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockDTO;", "equals", "other", "hashCode", "toString", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TextBlockDTO {
    private final Integer atomSpacing;

    @NotNull
    private final List<AtomDTO> body;
    private final Boolean isRounded;
    private final Boolean isSticky;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public TextBlockDTO(String str, @NotNull List<? extends AtomDTO> body, Boolean bool, Boolean bool2, Integer num) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.title = str;
        this.body = body;
        this.isSticky = bool;
        this.isRounded = bool2;
        this.atomSpacing = num;
    }

    public static /* synthetic */ TextBlockDTO copy$default(TextBlockDTO textBlockDTO, String str, List list, Boolean bool, Boolean bool2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textBlockDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = textBlockDTO.body;
        }
        if ((i11 & 4) != 0) {
            bool = textBlockDTO.isSticky;
        }
        if ((i11 & 8) != 0) {
            bool2 = textBlockDTO.isRounded;
        }
        if ((i11 & 16) != 0) {
            num = textBlockDTO.atomSpacing;
        }
        Integer num2 = num;
        Boolean bool3 = bool;
        return textBlockDTO.copy(str, list, bool3, bool2, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<AtomDTO> component2() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsRounded() {
        return this.isRounded;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getAtomSpacing() {
        return this.atomSpacing;
    }

    @NotNull
    public final TextBlockDTO copy(String title, @NotNull List<? extends AtomDTO> body, Boolean isSticky, Boolean isRounded, Integer atomSpacing) {
        Intrinsics.checkNotNullParameter(body, "body");
        return new TextBlockDTO(title, body, isSticky, isRounded, atomSpacing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextBlockDTO)) {
            return false;
        }
        TextBlockDTO textBlockDTO = (TextBlockDTO) other;
        return Intrinsics.d(this.title, textBlockDTO.title) && Intrinsics.d(this.body, textBlockDTO.body) && Intrinsics.d(this.isSticky, textBlockDTO.isSticky) && Intrinsics.d(this.isRounded, textBlockDTO.isRounded) && Intrinsics.d(this.atomSpacing, textBlockDTO.atomSpacing);
    }

    public final Integer getAtomSpacing() {
        return this.atomSpacing;
    }

    @NotNull
    public final List<AtomDTO> getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int b11 = g.b((str == null ? 0 : str.hashCode()) * 31, 31, this.body);
        Boolean bool = this.isSticky;
        int hashCode = (b11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRounded;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.atomSpacing;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final Boolean isRounded() {
        return this.isRounded;
    }

    public final Boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<AtomDTO> list = this.body;
        Boolean bool = this.isSticky;
        Boolean bool2 = this.isRounded;
        Integer num = this.atomSpacing;
        StringBuilder f7 = b.f("TextBlockDTO(title=", str, ", body=", ", isSticky=", list);
        h.h(f7, bool, ", isRounded=", bool2, ", atomSpacing=");
        return a.c(f7, num, ")");
    }
}
