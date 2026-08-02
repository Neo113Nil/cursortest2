package com.vk.vmoji.character.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;
import xsna.epx;
import xsna.fw3;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VmojiProductModel.kt */
/* loaded from: classes7.dex */
public final class VmojiProductModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiProductModel> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final ImageListModel e;
    public final State f;
    public final VmojiBadge g;
    public final VmojiPrice h;
    public final VmojiProductUnlockInfoModel i;
    public final VmojiProductPreviewModel j;
    public final VmojiConstructorOpenParamsModel k;

    /* compiled from: VmojiProductModel.kt */
    public static abstract class State extends Serializer.StreamParcelableAdapter {

        /* compiled from: VmojiProductModel.kt */
        public static final class Crown extends State {
            public static final Crown b = new Crown(null);
            public static final Serializer.c<Crown> CREATOR = new a();

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Crown> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Crown a(Serializer serializer) {
                    return Crown.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Crown[i];
                }
            }
        }

        /* compiled from: VmojiProductModel.kt */
        public static final class CrownWithCheck extends State {
            public static final CrownWithCheck b = new CrownWithCheck(null);
            public static final Serializer.c<CrownWithCheck> CREATOR = new a();

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<CrownWithCheck> {
                @Override // com.vk.core.serialize.Serializer.c
                public final CrownWithCheck a(Serializer serializer) {
                    return CrownWithCheck.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CrownWithCheck[i];
                }
            }
        }

        /* compiled from: VmojiProductModel.kt */
        public static final class Locked extends State {
            public static final Locked b = new Locked(null);
            public static final Serializer.c<Locked> CREATOR = new a();

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Locked> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Locked a(Serializer serializer) {
                    return Locked.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Locked[i];
                }
            }
        }

        /* compiled from: VmojiProductModel.kt */
        public static final class None extends State {
            public static final None b = new None(null);
            public static final Serializer.c<None> CREATOR = new a();

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<None> {
                @Override // com.vk.core.serialize.Serializer.c
                public final None a(Serializer serializer) {
                    return None.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new None[i];
                }
            }
        }

        /* compiled from: VmojiProductModel.kt */
        public static final class Unlocked extends State {
            public static final Unlocked b = new Unlocked(null);
            public static final Serializer.c<Unlocked> CREATOR = new a();

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Unlocked> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Unlocked a(Serializer serializer) {
                    return Unlocked.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Unlocked[i];
                }
            }
        }

        public /* synthetic */ State(zcl zclVar) {
            this();
        }

        public State() {
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VmojiProductModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiProductModel a(Serializer serializer) {
            return new VmojiProductModel(serializer.u(), serializer.H(), serializer.H(), (ImageListModel) serializer.G(ImageListModel.class.getClassLoader()), (State) serializer.G(State.class.getClassLoader()), (VmojiBadge) serializer.G(VmojiBadge.class.getClassLoader()), (VmojiPrice) serializer.G(VmojiPrice.class.getClassLoader()), (VmojiProductUnlockInfoModel) serializer.G(VmojiProductUnlockInfoModel.class.getClassLoader()), (VmojiProductPreviewModel) serializer.G(VmojiProductPreviewModel.class.getClassLoader()), (VmojiConstructorOpenParamsModel) serializer.G(VmojiConstructorOpenParamsModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiProductModel[i];
        }
    }

    public VmojiProductModel(int i, String str, String str2, ImageListModel imageListModel, State state, VmojiBadge vmojiBadge, VmojiPrice vmojiPrice, VmojiProductUnlockInfoModel vmojiProductUnlockInfoModel, VmojiProductPreviewModel vmojiProductPreviewModel, VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = imageListModel;
        this.f = state;
        this.g = vmojiBadge;
        this.h = vmojiPrice;
        this.i = vmojiProductUnlockInfoModel;
        this.j = vmojiProductPreviewModel;
        this.k = vmojiConstructorOpenParamsModel;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
        serializer.e0(this.f);
        serializer.e0(this.g);
        serializer.e0(this.h);
        serializer.e0(this.i);
        serializer.e0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiProductModel)) {
            return false;
        }
        VmojiProductModel vmojiProductModel = (VmojiProductModel) obj;
        return this.b == vmojiProductModel.b && epx.f(this.c, vmojiProductModel.c) && epx.f(this.d, vmojiProductModel.d) && epx.f(this.e, vmojiProductModel.e) && epx.f(this.f, vmojiProductModel.f) && epx.f(this.g, vmojiProductModel.g) && epx.f(this.h, vmojiProductModel.h) && epx.f(this.i, vmojiProductModel.i) && epx.f(this.j, vmojiProductModel.j) && epx.f(this.k, vmojiProductModel.k);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + fw3.a(urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e.b)) * 31;
        VmojiBadge vmojiBadge = this.g;
        int hashCode2 = (this.h.hashCode() + ((hashCode + (vmojiBadge == null ? 0 : vmojiBadge.hashCode())) * 31)) * 31;
        VmojiProductUnlockInfoModel vmojiProductUnlockInfoModel = this.i;
        int hashCode3 = (hashCode2 + (vmojiProductUnlockInfoModel == null ? 0 : vmojiProductUnlockInfoModel.hashCode())) * 31;
        VmojiProductPreviewModel vmojiProductPreviewModel = this.j;
        int hashCode4 = (hashCode3 + (vmojiProductPreviewModel == null ? 0 : vmojiProductPreviewModel.hashCode())) * 31;
        VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel = this.k;
        return hashCode4 + (vmojiConstructorOpenParamsModel != null ? vmojiConstructorOpenParamsModel.hashCode() : 0);
    }

    public final String toString() {
        return "VmojiProductModel(id=" + this.b + ", title=" + this.c + ", description=" + this.d + ", icon=" + this.e + ", state=" + this.f + ", badge=" + this.g + ", price=" + this.h + ", unlockInfo=" + this.i + ", preview=" + this.j + ", openParamsModel=" + this.k + ')';
    }
}
