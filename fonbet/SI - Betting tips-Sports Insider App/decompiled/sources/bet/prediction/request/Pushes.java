package bet.prediction.request;

import d9.e;
import kotlin.Metadata;
import o9.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y3.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t¨\u0006\u001b"}, d2 = {"Lbet/prediction/request/Pushes;", "Ly3/a;", "", "id", "type", "createdAt", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lbet/prediction/request/Pushes;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getType", "getCreatedAt", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Pushes implements a {

    @b("created_at")
    private final int createdAt;

    @b("id")
    private final int id;

    @b("type")
    private final int type;

    public Pushes(int i5, int i10, int i11) {
        this.id = i5;
        this.type = i10;
        this.createdAt = i11;
    }

    public static /* synthetic */ Pushes copy$default(Pushes pushes, int i5, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i5 = pushes.id;
        }
        if ((i12 & 2) != 0) {
            i10 = pushes.type;
        }
        if ((i12 & 4) != 0) {
            i11 = pushes.createdAt;
        }
        return pushes.copy(i5, i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final Pushes copy(int id2, int type, int createdAt) {
        return new Pushes(id2, type, createdAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pushes)) {
            return false;
        }
        Pushes pushes = (Pushes) other;
        return this.id == pushes.id && this.type == pushes.type && this.createdAt == pushes.createdAt;
    }

    @Override // y3.a
    public int getCreatedAt() {
        return this.createdAt;
    }

    @Override // y3.a
    public int getId() {
        return this.id;
    }

    @Override // y3.a
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.id * 31) + this.type) * 31) + this.createdAt;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Pushes(id=");
        sb2.append(this.id);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", createdAt=");
        return e.i(sb2, this.createdAt, ')');
    }
}
