package com.vk.menu.data.network.response;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.configurations.ShowcaseConfiguration;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.superapp.api.dto.menu.UpdateOptions;
import com.vk.superapp.api.dto.widgets.InvalidWidgetInfo;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.api.StubTiles;
import xsna.j5g;
import xsna.q9n0;

/* compiled from: StreamParcelableSuperAppMenu.kt */
/* loaded from: classes3.dex */
public final class StreamParcelableSuperAppMenu implements Serializer.StreamParcelable {
    public static final Serializer.c<StreamParcelableSuperAppMenu> CREATOR = new a();
    public final q9n0 b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StreamParcelableSuperAppMenu> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StreamParcelableSuperAppMenu a(Serializer serializer) {
            return new StreamParcelableSuperAppMenu(new q9n0(serializer.B(SuperAppWidget.class.getClassLoader()), serializer.B(InvalidWidgetInfo.class.getClassLoader()), j5g.S0(com.vk.core.serialize.a.a(serializer)), (WidgetObjects) serializer.A(WidgetObjects.class.getClassLoader()), (UpdateOptions) serializer.A(UpdateOptions.class.getClassLoader()), (QueueParams) serializer.A(QueueParams.class.getClassLoader()), (StubTiles) serializer.A(StubTiles.class.getClassLoader()), serializer.v(), serializer.v(), serializer.I(), serializer.I(), serializer.B(ShowcaseConfiguration.class.getClassLoader())));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StreamParcelableSuperAppMenu[i];
        }
    }

    public StreamParcelableSuperAppMenu(q9n0 q9n0Var) {
        this.b = q9n0Var;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        q9n0 q9n0Var = this.b;
        serializer.f0(q9n0Var.a);
        serializer.f0(q9n0Var.b);
        serializer.l0(j5g.O0(q9n0Var.c));
        serializer.e0(q9n0Var.d);
        serializer.e0(q9n0Var.e);
        serializer.e0(q9n0Var.f);
        serializer.e0(q9n0Var.g);
        serializer.V(q9n0Var.h);
        serializer.V(q9n0Var.i);
        serializer.m0(q9n0Var.j);
        serializer.m0(q9n0Var.k);
        serializer.f0(q9n0Var.l);
    }

    public final q9n0 d() {
        return this.b;
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
