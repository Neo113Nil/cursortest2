package androidx.car.app.model;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class Metadata {
    public static final Metadata EMPTY_METADATA = new Metadata(new a());

    @Nullable
    private final Place mPlace;

    public static final class a {
    }

    public Metadata(a aVar) {
        aVar.getClass();
        this.mPlace = null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Metadata) {
            return Objects.equals(this.mPlace, ((Metadata) obj).mPlace);
        }
        return false;
    }

    @Nullable
    public Place getPlace() {
        return this.mPlace;
    }

    public int hashCode() {
        return Objects.hashCode(this.mPlace);
    }

    private Metadata() {
        this.mPlace = null;
    }
}
