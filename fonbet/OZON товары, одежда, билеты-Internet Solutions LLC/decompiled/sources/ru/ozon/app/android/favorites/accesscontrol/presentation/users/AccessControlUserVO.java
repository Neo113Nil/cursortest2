package ru.ozon.app.android.favorites.accesscontrol.presentation.users;

import Ak.C2436a;
import G.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.accesscontrol.presentation.author.AuthorImageVO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/presentation/users/AccessControlUserVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "listName", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/favorites/accesscontrol/presentation/author/AuthorImageVO;", "user", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/favorites/accesscontrol/presentation/author/AuthorImageVO;Lru/ozon/uni/atoms/data/AtomDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getListName", "getName", "Lru/ozon/app/android/favorites/accesscontrol/presentation/author/AuthorImageVO;", "getUser", "()Lru/ozon/app/android/favorites/accesscontrol/presentation/author/AuthorImageVO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccessControlUserVO implements c {
    private final AtomDTO atom;
    private final long id;
    private final String listName;

    @NotNull
    private final String name;

    @NotNull
    private final AuthorImageVO user;

    public AccessControlUserVO(long j11, String str, @NotNull String name, @NotNull AuthorImageVO user, AtomDTO atomDTO) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(user, "user");
        this.id = j11;
        this.listName = str;
        this.name = name;
        this.user = user;
        this.atom = atomDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessControlUserVO)) {
            return false;
        }
        AccessControlUserVO accessControlUserVO = (AccessControlUserVO) other;
        return this.id == accessControlUserVO.id && Intrinsics.d(this.listName, accessControlUserVO.listName) && Intrinsics.d(this.name, accessControlUserVO.name) && Intrinsics.d(this.user, accessControlUserVO.user) && Intrinsics.d(this.atom, accessControlUserVO.atom);
    }

    public final AtomDTO getAtom() {
        return this.atom;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getListName() {
        return this.listName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final AuthorImageVO getUser() {
        return this.user;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.listName;
        int hashCode2 = (this.user.hashCode() + g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.name)) * 31;
        AtomDTO atomDTO = this.atom;
        return hashCode2 + (atomDTO != null ? atomDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.listName;
        String str2 = this.name;
        AuthorImageVO authorImageVO = this.user;
        AtomDTO atomDTO = this.atom;
        StringBuilder c11 = C2436a.c(j11, "AccessControlUserVO(id=", ", listName=", str);
        c11.append(", name=");
        c11.append(str2);
        c11.append(", user=");
        c11.append(authorImageVO);
        c11.append(", atom=");
        c11.append(atomDTO);
        c11.append(")");
        return c11.toString();
    }
}
