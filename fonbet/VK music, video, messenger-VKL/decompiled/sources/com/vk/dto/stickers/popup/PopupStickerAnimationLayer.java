package com.vk.dto.stickers.popup;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.popup.PopupLayerFitType;
import com.vk.dto.stickers.popup.PopupLayerGradientPositionType;
import com.vk.dto.stickers.popup.PopupLayerPositionXType;
import com.vk.dto.stickers.popup.PopupLayerPositionYType;
import com.vk.dto.stickers.popup.PopupLayerRepeatType;
import xsna.asp;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PopupStickerAnimationLayer.kt */
/* loaded from: classes18.dex */
public abstract class PopupStickerAnimationLayer implements Serializer.StreamParcelable {

    /* compiled from: PopupStickerAnimationLayer.kt */
    public static final class PopupStickerFixedAnimationLayer extends PopupStickerAnimationLayer {
        public static final Serializer.c<PopupStickerFixedAnimationLayer> CREATOR = new a();
        public final PopupLayerPositionXType b;
        public final PopupLayerPositionYType c;
        public final String d;
        public final int e;
        public final float f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PopupStickerFixedAnimationLayer> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PopupStickerFixedAnimationLayer a(Serializer serializer) {
                PopupLayerPositionXType.a aVar = PopupLayerPositionXType.Companion;
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                aVar.getClass();
                PopupLayerPositionXType a = PopupLayerPositionXType.a.a(H);
                PopupLayerPositionYType.a aVar2 = PopupLayerPositionYType.Companion;
                String H2 = serializer.H();
                if (H2 == null) {
                    H2 = "";
                }
                aVar2.getClass();
                PopupLayerPositionYType a2 = PopupLayerPositionYType.a.a(H2);
                String H3 = serializer.H();
                return new PopupStickerFixedAnimationLayer(a, a2, H3 != null ? H3 : "", serializer.u(), serializer.s());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PopupStickerFixedAnimationLayer[i];
            }
        }

        public PopupStickerFixedAnimationLayer(PopupLayerPositionXType popupLayerPositionXType, PopupLayerPositionYType popupLayerPositionYType, String str, int i, float f) {
            super(null);
            this.b = popupLayerPositionXType;
            this.c = popupLayerPositionYType;
            this.d = str;
            this.e = i;
            this.f = f;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b.h());
            serializer.j0(this.c.h());
            serializer.j0(this.d);
            serializer.S(this.e);
            serializer.P(this.f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!PopupStickerFixedAnimationLayer.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            PopupStickerFixedAnimationLayer popupStickerFixedAnimationLayer = (PopupStickerFixedAnimationLayer) obj;
            return this.b == popupStickerFixedAnimationLayer.b && this.c == popupStickerFixedAnimationLayer.c && epx.f(this.d, popupStickerFixedAnimationLayer.d) && this.e == popupStickerFixedAnimationLayer.e && this.f == popupStickerFixedAnimationLayer.f;
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + ((urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d) + this.e) * 31);
        }
    }

    /* compiled from: PopupStickerAnimationLayer.kt */
    public static final class PopupStickerFullscreenAnimationLayer extends PopupStickerAnimationLayer {
        public static final Serializer.c<PopupStickerFullscreenAnimationLayer> CREATOR = new a();
        public final PopupLayerPositionXType b;
        public final PopupLayerPositionYType c;
        public final String d;
        public final int e;
        public final PopupLayerRepeatType f;
        public final PopupLayerFitType g;
        public final float h;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PopupStickerFullscreenAnimationLayer> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PopupStickerFullscreenAnimationLayer a(Serializer serializer) {
                PopupLayerPositionXType.a aVar = PopupLayerPositionXType.Companion;
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                aVar.getClass();
                PopupLayerPositionXType a = PopupLayerPositionXType.a.a(H);
                PopupLayerPositionYType.a aVar2 = PopupLayerPositionYType.Companion;
                String H2 = serializer.H();
                if (H2 == null) {
                    H2 = "";
                }
                aVar2.getClass();
                PopupLayerPositionYType a2 = PopupLayerPositionYType.a.a(H2);
                String H3 = serializer.H();
                if (H3 == null) {
                    H3 = "";
                }
                int u = serializer.u();
                PopupLayerRepeatType.a aVar3 = PopupLayerRepeatType.Companion;
                String H4 = serializer.H();
                if (H4 == null) {
                    H4 = "";
                }
                aVar3.getClass();
                PopupLayerRepeatType a3 = PopupLayerRepeatType.a.a(H4);
                PopupLayerFitType.a aVar4 = PopupLayerFitType.Companion;
                String H5 = serializer.H();
                String str = H5 != null ? H5 : "";
                aVar4.getClass();
                return new PopupStickerFullscreenAnimationLayer(a, a2, H3, u, a3, PopupLayerFitType.a.a(str), serializer.s());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PopupStickerFullscreenAnimationLayer[i];
            }
        }

        public PopupStickerFullscreenAnimationLayer(PopupLayerPositionXType popupLayerPositionXType, PopupLayerPositionYType popupLayerPositionYType, String str, int i, PopupLayerRepeatType popupLayerRepeatType, PopupLayerFitType popupLayerFitType, float f) {
            super(null);
            this.b = popupLayerPositionXType;
            this.c = popupLayerPositionYType;
            this.d = str;
            this.e = i;
            this.f = popupLayerRepeatType;
            this.g = popupLayerFitType;
            this.h = f;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b.h());
            serializer.j0(this.c.h());
            serializer.j0(this.d);
            serializer.S(this.e);
            serializer.j0(this.f.h());
            serializer.j0(this.g.h());
            serializer.P(this.h);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!PopupStickerFullscreenAnimationLayer.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            PopupStickerFullscreenAnimationLayer popupStickerFullscreenAnimationLayer = (PopupStickerFullscreenAnimationLayer) obj;
            return this.b == popupStickerFullscreenAnimationLayer.b && this.c == popupStickerFullscreenAnimationLayer.c && epx.f(this.d, popupStickerFullscreenAnimationLayer.d) && this.e == popupStickerFullscreenAnimationLayer.e && this.f == popupStickerFullscreenAnimationLayer.f && this.g == popupStickerFullscreenAnimationLayer.g && this.h == popupStickerFullscreenAnimationLayer.h;
        }

        public final int hashCode() {
            return Float.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d) + this.e) * 31)) * 31)) * 31);
        }
    }

    /* compiled from: PopupStickerAnimationLayer.kt */
    public static final class PopupStickerGradientLayer extends PopupStickerAnimationLayer {
        public static final Serializer.c<PopupStickerGradientLayer> CREATOR = new a();
        public final PopupLayerGradientPositionType b;
        public final float c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PopupStickerGradientLayer> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PopupStickerGradientLayer a(Serializer serializer) {
                PopupLayerGradientPositionType.a aVar = PopupLayerGradientPositionType.Companion;
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                aVar.getClass();
                return new PopupStickerGradientLayer(PopupLayerGradientPositionType.a.a(H), serializer.s());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PopupStickerGradientLayer[i];
            }
        }

        public PopupStickerGradientLayer(PopupLayerGradientPositionType popupLayerGradientPositionType, float f) {
            super(null);
            this.b = popupLayerGradientPositionType;
            this.c = f;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b.h());
            serializer.P(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!PopupStickerGradientLayer.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            PopupStickerGradientLayer popupStickerGradientLayer = (PopupStickerGradientLayer) obj;
            return this.b == popupStickerGradientLayer.b && this.c == popupStickerGradientLayer.c;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + (this.b.hashCode() * 31);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PopupStickerAnimationLayer.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ANIMATION_FIXED;
        public static final Type ANIMATION_FULLSCREEN;
        public static final Type GRADIENT;
        private final String typeName;

        static {
            Type type = new Type("GRADIENT", 0, "gradient");
            GRADIENT = type;
            Type type2 = new Type("ANIMATION_FIXED", 1, "animation_fixed");
            ANIMATION_FIXED = type2;
            Type type3 = new Type("ANIMATION_FULLSCREEN", 2, "animation_fullscreen");
            ANIMATION_FULLSCREEN = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type(String str, int i, String str2) {
            this.typeName = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String h() {
            return this.typeName;
        }
    }

    public /* synthetic */ PopupStickerAnimationLayer(zcl zclVar) {
        this();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public PopupStickerAnimationLayer() {
    }
}
