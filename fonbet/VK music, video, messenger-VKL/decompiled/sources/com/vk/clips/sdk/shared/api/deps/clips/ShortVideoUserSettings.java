package com.vk.clips.sdk.shared.api.deps.clips;

import com.vk.core.serialize.Serializer;
import xsna.vu5;

/* compiled from: ShortVideoUserSettings.kt */
/* loaded from: classes17.dex */
public final class ShortVideoUserSettings extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ShortVideoUserSettings> CREATOR = new a();
    public static final ShortVideoUserSettings c = new ShortVideoUserSettings(3);
    public final int b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ShortVideoUserSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ShortVideoUserSettings a(Serializer serializer) {
            return new ShortVideoUserSettings(serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShortVideoUserSettings[i];
        }
    }

    public ShortVideoUserSettings(int i) {
        this.b = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoUserSettings) && this.b == ((ShortVideoUserSettings) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ShortVideoUserSettings(postAdBannerInterval="), this.b, ')');
    }
}
