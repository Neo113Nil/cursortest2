package com.vk.video.ui.discovery.minimizable.player.controllers;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import defpackage.q0;
import java.util.ArrayList;
import xsna.zcl;

/* compiled from: PlayerRemoteController.kt */
/* loaded from: classes7.dex */
public interface PlayerRemoteController {

    /* compiled from: PlayerRemoteController.kt */
    public static final class Properties implements Parcelable {
        public static final Parcelable.Creator<Properties> CREATOR = new a();
        public final boolean b;
        public final boolean c;

        /* compiled from: PlayerRemoteController.kt */
        public static final class a implements Parcelable.Creator<Properties> {
            @Override // android.os.Parcelable.Creator
            public final Properties createFromParcel(Parcel parcel) {
                return new Properties(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Properties[] newArray(int i) {
                return new Properties[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Properties() {
            this(r2, r2, 3, null);
            boolean z = false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Properties)) {
                return false;
            }
            Properties properties = (Properties) obj;
            return this.b == properties.b && this.c == properties.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Properties(isInPlaylist=");
            sb.append(this.b);
            sb.append(", isFeedbackPollsAvailable=");
            return q0.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public Properties(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public /* synthetic */ Properties(boolean z, boolean z2, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }

    void a1();

    void b1(MiniPlayerControllersWrapper.VideoInfo videoInfo);

    void c();

    void c1();

    void d1(MiniPlayerControllersWrapper.VideoInfo videoInfo);

    boolean e1();

    void f();

    void f1();

    void g1(ArrayList arrayList);

    void seekTo(long j);

    default void Z0(Properties properties) {
    }
}
