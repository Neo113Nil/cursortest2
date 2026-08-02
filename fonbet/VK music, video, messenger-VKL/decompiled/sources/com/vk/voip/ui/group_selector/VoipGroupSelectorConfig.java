package com.vk.voip.ui.group_selector;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: VoipGroupSelectorConfig.kt */
/* loaded from: classes7.dex */
public final class VoipGroupSelectorConfig extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VoipGroupSelectorConfig> CREATOR = new a();
    public final String b;
    public final UserId c;
    public final TitleConfig d;
    public final ButtonConfig e;
    public final boolean f;
    public final boolean g;

    /* compiled from: VoipGroupSelectorConfig.kt */
    public static abstract class ButtonConfig extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<ButtonConfig> CREATOR = new a();

        /* compiled from: VoipGroupSelectorConfig.kt */
        public static final class ResId extends ButtonConfig {
            public final int b;

            public ResId(int i) {
                super(null);
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ResId) && this.b == ((ResId) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ResId(id="), this.b, ')');
            }
        }

        /* compiled from: VoipGroupSelectorConfig.kt */
        public static final class Text extends ButtonConfig {
            public final String b;

            public Text(String str) {
                super(null);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Text) && epx.f(this.b, ((Text) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Text(text="), this.b, ')');
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ButtonConfig> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ButtonConfig a(Serializer serializer) {
                int u = serializer.u();
                if (u != 0) {
                    if (u == 1) {
                        return new ResId(serializer.u());
                    }
                    throw new IllegalArgumentException("Malformed serializer");
                }
                String H = serializer.H();
                if (H != null) {
                    return new Text(H);
                }
                throw new IllegalArgumentException("Malformed serializer");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ButtonConfig[i];
            }
        }

        public /* synthetic */ ButtonConfig(zcl zclVar) {
            this();
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            if (this instanceof Text) {
                serializer.S(0);
                serializer.j0(((Text) this).b);
            } else {
                if (!(this instanceof ResId)) {
                    throw new NoWhenBranchMatchedException();
                }
                serializer.S(1);
                serializer.S(((ResId) this).b);
            }
        }

        public ButtonConfig() {
        }
    }

    /* compiled from: VoipGroupSelectorConfig.kt */
    public static abstract class TitleConfig extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<TitleConfig> CREATOR = new a();

        /* compiled from: VoipGroupSelectorConfig.kt */
        public static final class ResId extends TitleConfig {
            public final int b;

            public ResId(int i) {
                super(null);
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ResId) && this.b == ((ResId) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ResId(id="), this.b, ')');
            }
        }

        /* compiled from: VoipGroupSelectorConfig.kt */
        public static final class Text extends TitleConfig {
            public final String b;

            public Text(String str) {
                super(null);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Text) && epx.f(this.b, ((Text) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Text(text="), this.b, ')');
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<TitleConfig> {
            @Override // com.vk.core.serialize.Serializer.c
            public final TitleConfig a(Serializer serializer) {
                int u = serializer.u();
                if (u != 0) {
                    if (u == 1) {
                        return new ResId(serializer.u());
                    }
                    throw new IllegalArgumentException("Malformed serializer");
                }
                String H = serializer.H();
                if (H != null) {
                    return new Text(H);
                }
                throw new IllegalArgumentException("Malformed serializer");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TitleConfig[i];
            }
        }

        public /* synthetic */ TitleConfig(zcl zclVar) {
            this();
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            if (this instanceof Text) {
                serializer.S(0);
                serializer.j0(((Text) this).b);
            } else {
                if (!(this instanceof ResId)) {
                    throw new NoWhenBranchMatchedException();
                }
                serializer.S(1);
                serializer.S(((ResId) this).b);
            }
        }

        public TitleConfig() {
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VoipGroupSelectorConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VoipGroupSelectorConfig a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                throw new IllegalArgumentException("Malformed serializer");
            }
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            Serializer.StreamParcelable G = serializer.G(TitleConfig.class.getClassLoader());
            if (G == null) {
                throw new IllegalArgumentException("Can't get value!");
            }
            TitleConfig titleConfig = (TitleConfig) G;
            Serializer.StreamParcelable G2 = serializer.G(ButtonConfig.class.getClassLoader());
            if (G2 != null) {
                return new VoipGroupSelectorConfig(H, userId, titleConfig, (ButtonConfig) G2, serializer.m(), serializer.m());
            }
            throw new IllegalArgumentException("Can't get value!");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VoipGroupSelectorConfig[i];
        }
    }

    public /* synthetic */ VoipGroupSelectorConfig(String str, UserId userId, TitleConfig titleConfig, ButtonConfig buttonConfig, boolean z, boolean z2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : userId, titleConfig, buttonConfig, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.e0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoipGroupSelectorConfig)) {
            return false;
        }
        VoipGroupSelectorConfig voipGroupSelectorConfig = (VoipGroupSelectorConfig) obj;
        return epx.f(this.b, voipGroupSelectorConfig.b) && epx.f(this.c, voipGroupSelectorConfig.c) && epx.f(this.d, voipGroupSelectorConfig.d) && epx.f(this.e, voipGroupSelectorConfig.e) && this.f == voipGroupSelectorConfig.f && this.g == voipGroupSelectorConfig.g;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        UserId userId = this.c;
        return Boolean.hashCode(this.g) + qoy.b((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipGroupSelectorConfig(requestKey=");
        sb.append(this.b);
        sb.append(", preselectedUser=");
        sb.append(this.c);
        sb.append(", titleConfig=");
        sb.append(this.d);
        sb.append(", buttonConfig=");
        sb.append(this.e);
        sb.append(", isCurrentUserVisible=");
        sb.append(this.f);
        sb.append(", isAllUsersVisible=");
        return q0.a(sb, this.g, ')');
    }

    public VoipGroupSelectorConfig(String str, UserId userId, TitleConfig titleConfig, ButtonConfig buttonConfig, boolean z, boolean z2) {
        this.b = str;
        this.c = userId;
        this.d = titleConfig;
        this.e = buttonConfig;
        this.f = z;
        this.g = z2;
    }
}
