package androidx.car.app.serialization;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Objects;
import xsna.go8;

/* loaded from: classes11.dex */
public final class Bundleable implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<Bundleable> CREATOR = new a();
    public final Bundle b;

    public class a implements Parcelable.Creator<Bundleable> {
        @Override // android.os.Parcelable.Creator
        public final Bundleable createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(a.class.getClassLoader());
            Objects.requireNonNull(readBundle);
            return new Bundleable(readBundle);
        }

        @Override // android.os.Parcelable.Creator
        public final Bundleable[] newArray(int i) {
            return new Bundleable[i];
        }
    }

    public Bundleable(Object obj) throws BundlerException {
        ArrayMap arrayMap = go8.a;
        this.b = go8.o(obj, go8.i(obj.getClass()), new go8.c(null, "", new ArrayDeque()));
    }

    @NonNull
    public final Object d() throws BundlerException {
        ArrayMap arrayMap = go8.a;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.b;
        if (isLoggable) {
        }
        return go8.f(bundle, new go8.c(null, "", new ArrayDeque()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }

    public Bundleable(Bundle bundle) {
        this.b = bundle;
    }
}
