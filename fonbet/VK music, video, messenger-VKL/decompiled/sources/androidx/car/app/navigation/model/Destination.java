package androidx.car.app.navigation.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class Destination {

    @Nullable
    private final CarText mAddress;

    @Nullable
    private final CarIcon mImage;

    @Nullable
    private final CarText mName;

    public static final class a {
    }

    public Destination(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination destination = (Destination) obj;
        return Objects.equals(this.mName, destination.mName) && Objects.equals(this.mAddress, destination.mAddress) && Objects.equals(this.mImage, destination.mImage);
    }

    @Nullable
    public CarText getAddress() {
        return this.mAddress;
    }

    @Nullable
    public CarIcon getImage() {
        return this.mImage;
    }

    @Nullable
    public CarText getName() {
        return this.mName;
    }

    public int hashCode() {
        return Objects.hash(this.mName, this.mAddress, this.mImage);
    }

    @NonNull
    public String toString() {
        return "[name: " + CarText.toShortString(this.mName) + ", address: " + CarText.toShortString(this.mAddress) + ", image: " + this.mImage + X3.j.e;
    }

    private Destination() {
        this.mName = null;
        this.mAddress = null;
        this.mImage = null;
    }
}
