package com.vk.superapp.catalog.impl.v2.catalog.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.jgp;
import xsna.ke3;

/* compiled from: StreamParcelableCatalogData.kt */
/* loaded from: classes6.dex */
public final class StreamParcelableCatalogData implements Serializer.StreamParcelable {
    public static final Serializer.c<StreamParcelableCatalogData> CREATOR = new a();
    public final ke3 b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StreamParcelableCatalogData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StreamParcelableCatalogData a(Serializer serializer) {
            Map map;
            ArrayList B = serializer.B(AppsCatalogSection.class.getClassLoader());
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        Long valueOf = Long.valueOf(serializer.w());
                        Parcelable A = serializer.A(WebApiApplication.class.getClassLoader());
                        if (A != null) {
                            map.put(valueOf, A);
                        }
                    }
                } else {
                    map = jgp.b;
                }
                return new StreamParcelableCatalogData(new ke3(B, map, serializer.u(), serializer.H(), serializer.H()));
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StreamParcelableCatalogData[i];
        }
    }

    public StreamParcelableCatalogData(ke3 ke3Var) {
        this.b = ke3Var;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        ke3 ke3Var = this.b;
        serializer.f0(ke3Var.a);
        serializer.c0(ke3Var.b);
        serializer.S(ke3Var.c);
        serializer.j0(ke3Var.d);
        serializer.j0(ke3Var.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
