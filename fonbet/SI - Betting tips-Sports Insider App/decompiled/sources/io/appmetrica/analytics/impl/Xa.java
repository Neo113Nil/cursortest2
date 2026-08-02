package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Xa implements Parcelable {
    public static final Parcelable.Creator<Xa> CREATOR = new Wa();

    /* renamed from: a, reason: collision with root package name */
    public final ResultReceiver f13180a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13181b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f13182c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13183d;

    public Xa(B6 b62, List list, Map map, boolean z5) {
        this.f13181b = list;
        this.f13180a = b62;
        this.f13182c = map == null ? new HashMap() : new HashMap(map);
        this.f13183d = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f13180a);
        if (this.f13181b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f13181b));
        }
        HashMap hashMap = this.f13182c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Fm.a((Map) hashMap));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f13183d);
        parcel.writeBundle(bundle);
    }

    public Xa(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(B6.class.getClassLoader());
        if (readBundle != null) {
            this.f13180a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f13181b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f13182c = Fm.a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f13183d = readBundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f13182c = new HashMap();
    }
}
