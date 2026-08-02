package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation;

import Ak.C2436a;
import G.g;
import Ih.a;
import Ns.b;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b#\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b'\u0010\"¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SearchIntents.EXTRA_QUERY, "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "error", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getQuery", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPlaceholder", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getError", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddLegalAddressMobileVO implements c {

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final TextDTO error;
    private final long id;

    @NotNull
    private final String placeholder;

    @NotNull
    private final String query;

    @NotNull
    private final TextDTO title;

    public AddLegalAddressMobileVO(long j11, @NotNull String query, @NotNull TextDTO title, @NotNull String placeholder, @NotNull AtomActionDTO action, @NotNull TextDTO error) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(error, "error");
        this.id = j11;
        this.query = query;
        this.title = title;
        this.placeholder = placeholder;
        this.action = action;
        this.error = error;
    }

    public static /* synthetic */ AddLegalAddressMobileVO copy$default(AddLegalAddressMobileVO addLegalAddressMobileVO, long j11, String str, TextDTO textDTO, String str2, AtomActionDTO atomActionDTO, TextDTO textDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = addLegalAddressMobileVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = addLegalAddressMobileVO.query;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            textDTO = addLegalAddressMobileVO.title;
        }
        TextDTO textDTO3 = textDTO;
        if ((i11 & 8) != 0) {
            str2 = addLegalAddressMobileVO.placeholder;
        }
        String str4 = str2;
        if ((i11 & 16) != 0) {
            atomActionDTO = addLegalAddressMobileVO.action;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        if ((i11 & 32) != 0) {
            textDTO2 = addLegalAddressMobileVO.error;
        }
        return addLegalAddressMobileVO.copy(j12, str3, textDTO3, str4, atomActionDTO2, textDTO2);
    }

    @NotNull
    public final AddLegalAddressMobileVO copy(long id2, @NotNull String query, @NotNull TextDTO title, @NotNull String placeholder, @NotNull AtomActionDTO action, @NotNull TextDTO error) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(error, "error");
        return new AddLegalAddressMobileVO(id2, query, title, placeholder, action, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddLegalAddressMobileVO)) {
            return false;
        }
        AddLegalAddressMobileVO addLegalAddressMobileVO = (AddLegalAddressMobileVO) other;
        return this.id == addLegalAddressMobileVO.id && Intrinsics.d(this.query, addLegalAddressMobileVO.query) && Intrinsics.d(this.title, addLegalAddressMobileVO.title) && Intrinsics.d(this.placeholder, addLegalAddressMobileVO.placeholder) && Intrinsics.d(this.action, addLegalAddressMobileVO.action) && Intrinsics.d(this.error, addLegalAddressMobileVO.error);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final TextDTO getError() {
        return this.error;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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
        return this.error.hashCode() + a.b(this.action, g.a(b.a(this.title, g.a(Long.hashCode(this.id) * 31, 31, this.query), 31), 31, this.placeholder), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.query;
        TextDTO textDTO = this.title;
        String str2 = this.placeholder;
        AtomActionDTO atomActionDTO = this.action;
        TextDTO textDTO2 = this.error;
        StringBuilder c11 = C2436a.c(j11, "AddLegalAddressMobileVO(id=", ", query=", str);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", placeholder=");
        c11.append(str2);
        c11.append(", action=");
        c11.append(atomActionDTO);
        c11.append(", error=");
        c11.append(textDTO2);
        c11.append(")");
        return c11.toString();
    }
}
