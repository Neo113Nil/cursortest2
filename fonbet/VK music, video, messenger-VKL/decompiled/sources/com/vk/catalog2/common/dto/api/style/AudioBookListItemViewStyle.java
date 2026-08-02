package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.j5g;
import xsna.zrp;

/* compiled from: AudioBookListItemViewStyle.kt */
/* loaded from: classes16.dex */
public final class AudioBookListItemViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<AudioBookListItemViewStyle> CREATOR = new a();
    public final EntityStyle b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioBookListItemViewStyle.kt */
    public static final class EntityStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntityStyle[] $VALUES;
        public static final a Companion;
        public static final EntityStyle DEFAULT;
        public static final EntityStyle SYNTHETIC_OFFLINE;
        private final String apiValue;

        /* compiled from: AudioBookListItemViewStyle.kt */
        public static final class a {
        }

        static {
            EntityStyle entityStyle = new EntityStyle("DEFAULT", 0, "");
            DEFAULT = entityStyle;
            EntityStyle entityStyle2 = new EntityStyle("SYNTHETIC_OFFLINE", 1, "synthetic_offline");
            SYNTHETIC_OFFLINE = entityStyle2;
            EntityStyle[] entityStyleArr = {entityStyle, entityStyle2};
            $VALUES = entityStyleArr;
            $ENTRIES = new asp(entityStyleArr);
            Companion = new a();
        }

        public EntityStyle(String str, int i, String str2) {
            this.apiValue = str2;
        }

        public static zrp<EntityStyle> i() {
            return $ENTRIES;
        }

        public static EntityStyle valueOf(String str) {
            return (EntityStyle) Enum.valueOf(EntityStyle.class, str);
        }

        public static EntityStyle[] values() {
            return (EntityStyle[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiValue;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AudioBookListItemViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioBookListItemViewStyle a(Serializer serializer) {
            return new AudioBookListItemViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioBookListItemViewStyle[i];
        }
    }

    public AudioBookListItemViewStyle(EntityStyle entityStyle) {
        this.b = entityStyle;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new AudioBookListItemViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioBookListItemViewStyle) && this.b == ((AudioBookListItemViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AudioBookListItemViewStyle(entityStyle=" + this.b + ')';
    }

    public final boolean zb() {
        return this.b == EntityStyle.SYNTHETIC_OFFLINE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioBookListItemViewStyle(String str) {
        this(r1 == null ? EntityStyle.DEFAULT : r1);
        Object obj;
        EntityStyle.Companion.getClass();
        Iterator<E> it = EntityStyle.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((EntityStyle) obj).h(), str)) {
                    break;
                }
            }
        }
        EntityStyle entityStyle = (EntityStyle) obj;
    }

    public AudioBookListItemViewStyle(Serializer serializer) {
        this(serializer.u());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioBookListItemViewStyle(int i) {
        this(r2 == null ? EntityStyle.DEFAULT : r2);
        EntityStyle.Companion.getClass();
        EntityStyle entityStyle = (EntityStyle) j5g.b0(i, EntityStyle.i());
    }
}
