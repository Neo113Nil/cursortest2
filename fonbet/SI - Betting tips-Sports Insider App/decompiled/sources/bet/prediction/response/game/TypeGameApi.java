package bet.prediction.response.game;

import d9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o9.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w3.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lbet/prediction/response/game/TypeGameApi;", "Lw3/h;", "", "id", "", "name", "<init>", "(ILjava/lang/String;)V", "mapper", "()Lw3/h;", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lbet/prediction/response/game/TypeGameApi;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TypeGameApi implements h {

    @b("id")
    private final int id;

    @b("name")
    @NotNull
    private final String name;

    public TypeGameApi(int i5, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i5;
        this.name = name;
    }

    public static /* synthetic */ TypeGameApi copy$default(TypeGameApi typeGameApi, int i5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i5 = typeGameApi.id;
        }
        if ((i10 & 2) != 0) {
            str = typeGameApi.name;
        }
        return typeGameApi.copy(i5, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final TypeGameApi copy(int id2, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new TypeGameApi(id2, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypeGameApi)) {
            return false;
        }
        TypeGameApi typeGameApi = (TypeGameApi) other;
        return this.id == typeGameApi.id && Intrinsics.areEqual(this.name, typeGameApi.name);
    }

    public int getId() {
        return this.id;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.id * 31);
    }

    @NotNull
    public final h mapper() {
        return new h(this) { // from class: bet.prediction.response.game.TypeGameApi$mapper$1
            private final int id;
            private final String name;

            {
                this.id = this.getId();
                this.name = this.getName();
            }

            public int getId() {
                return this.id;
            }

            public String getName() {
                return this.name;
            }
        };
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TypeGameApi(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        return e.k(sb2, this.name, ')');
    }
}
