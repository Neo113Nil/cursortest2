package com.vk.voip.ui.call_by_link.ui;

import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.a;
import com.vk.voip.ui.call_by_link.feature.VoipCallByLinkState;
import defpackage.q0;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao50;
import xsna.asp;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.fw3;
import xsna.h0u0;
import xsna.hfz;
import xsna.j8;
import xsna.ms9;
import xsna.shy;
import xsna.urd0;
import xsna.yzt0;
import xsna.zrp;

/* compiled from: VoipCallByLinkViewState.kt */
/* loaded from: classes7.dex */
public final class VoipCallByLinkViewState implements ao50 {
    public final fi50 a;

    /* compiled from: VoipCallByLinkViewState.kt */
    public static abstract class ContentDialog {

        /* compiled from: VoipCallByLinkViewState.kt */
        public static abstract class Item implements hfz {

            /* compiled from: VoipCallByLinkViewState.kt */
            public static final class Setting extends Item {
                public final Type b;
                public final int c;
                public final int d;
                public final int e;
                public final a f;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: VoipCallByLinkViewState.kt */
                public static final class Type {
                    private static final /* synthetic */ zrp $ENTRIES;
                    private static final /* synthetic */ Type[] $VALUES;
                    public static final Type ANONYMOUS_JOIN;
                    public static final Type FEEDBACK;
                    public static final Type MEDIA_MICROPHONES;
                    public static final Type MEDIA_VIDEO;
                    public static final Type WAITING_HALL;
                    public static final Type WATCH_TOGETHER;

                    static {
                        Type type = new Type("WAITING_HALL", 0);
                        WAITING_HALL = type;
                        Type type2 = new Type("ANONYMOUS_JOIN", 1);
                        ANONYMOUS_JOIN = type2;
                        Type type3 = new Type("FEEDBACK", 2);
                        FEEDBACK = type3;
                        Type type4 = new Type("MEDIA_MICROPHONES", 3);
                        MEDIA_MICROPHONES = type4;
                        Type type5 = new Type("MEDIA_VIDEO", 4);
                        MEDIA_VIDEO = type5;
                        Type type6 = new Type("WATCH_TOGETHER", 5);
                        WATCH_TOGETHER = type6;
                        Type[] typeArr = {type, type2, type3, type4, type5, type6};
                        $VALUES = typeArr;
                        $ENTRIES = new asp(typeArr);
                    }

                    public Type() {
                        throw null;
                    }

                    public static Type valueOf(String str) {
                        return (Type) Enum.valueOf(Type.class, str);
                    }

                    public static Type[] values() {
                        return (Type[]) $VALUES.clone();
                    }
                }

                /* compiled from: VoipCallByLinkViewState.kt */
                public static abstract class a {

                    /* compiled from: VoipCallByLinkViewState.kt */
                    /* renamed from: com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState$ContentDialog$Item$Setting$a$a, reason: collision with other inner class name */
                    public static final class C2030a extends a {
                        public static final C2030a a = new C2030a();
                    }

                    /* compiled from: VoipCallByLinkViewState.kt */
                    public static final class b extends a {
                        public static final b a = new b();
                    }

                    /* compiled from: VoipCallByLinkViewState.kt */
                    public static final class c extends a {
                        public static final c a = new c();
                    }
                }

                public Setting(Type type, int i, int i2, int i3, a aVar) {
                    this.b = type;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = aVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Setting)) {
                        return false;
                    }
                    Setting setting = (Setting) obj;
                    return this.b == setting.b && this.c == setting.c && this.d == setting.d && this.e == setting.e && epx.f(this.f, setting.f);
                }

                @Override // com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState.ContentDialog.Item, xsna.hfz
                public final Number getItemId() {
                    return Integer.valueOf(this.b.ordinal());
                }

                public final int hashCode() {
                    return this.f.hashCode() + shy.a(this.e, shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31);
                }

                public final String toString() {
                    return "Setting(type=" + this.b + ", iconId=" + this.c + ", titleId=" + this.d + ", subtitleId=" + this.e + ", switchState=" + this.f + ')';
                }
            }

            /* compiled from: VoipCallByLinkViewState.kt */
            public static abstract class a extends Item {

                /* compiled from: VoipCallByLinkViewState.kt */
                /* renamed from: com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState$ContentDialog$Item$a$a, reason: collision with other inner class name */
                public static final class C2031a extends a {
                    public final a.b.C1179b b;
                    public final ImageList c;
                    public final String d;
                    public final boolean e;

                    public C2031a(a.b.C1179b c1179b, ImageList imageList, String str, boolean z) {
                        this.b = c1179b;
                        this.c = imageList;
                        this.d = str;
                        this.e = z;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C2031a)) {
                            return false;
                        }
                        C2031a c2031a = (C2031a) obj;
                        return epx.f(this.b, c2031a.b) && epx.f(this.c, c2031a.c) && epx.f(this.d, c2031a.d) && this.e == c2031a.e;
                    }

                    public final int hashCode() {
                        a.b.C1179b c1179b = this.b;
                        return Boolean.hashCode(this.e) + urd0.a(fw3.a((c1179b == null ? 0 : c1179b.a.hashCode()) * 31, 31, this.c.b), 31, this.d);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("CurrentUser(placeholderSource=");
                        sb.append(this.b);
                        sb.append(", image=");
                        sb.append(this.c);
                        sb.append(", name=");
                        sb.append(this.d);
                        sb.append(", imageIsNft=");
                        return q0.a(sb, this.e, ')');
                    }
                }

                /* compiled from: VoipCallByLinkViewState.kt */
                public static final class b extends a {
                    public final ImageList b;
                    public final String c;
                    public final boolean d;

                    public b(ImageList imageList, String str, boolean z) {
                        this.b = imageList;
                        this.c = str;
                        this.d = z;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.d) + urd0.a(this.b.b.hashCode() * 31, 31, this.c);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Group(image=");
                        sb.append(this.b);
                        sb.append(", title=");
                        sb.append(this.c);
                        sb.append(", imageIsNft=");
                        return q0.a(sb, this.d, ')');
                    }
                }
            }

            /* compiled from: VoipCallByLinkViewState.kt */
            public static final class b extends Item {
                public static final b b = new b();
            }

            @Override // xsna.hfz
            public Number getItemId() {
                return 0;
            }
        }

        /* compiled from: VoipCallByLinkViewState.kt */
        public static final class a extends ContentDialog {
            public static final a a = new a();
        }

        /* compiled from: VoipCallByLinkViewState.kt */
        public static final class b extends ContentDialog {
            public static final b a = new b();
        }

        /* compiled from: VoipCallByLinkViewState.kt */
        public static final class c extends ContentDialog {
            public static final c a = new c();
        }

        /* compiled from: VoipCallByLinkViewState.kt */
        public static final class d extends ContentDialog {
            public final List<Item> a;

            /* JADX WARN: Multi-variable type inference failed */
            public d(List<? extends Item> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Visible(items="), this.a);
            }
        }
    }

    /* compiled from: VoipCallByLinkViewState.kt */
    public static abstract class MediaSettingDialog {

        /* compiled from: VoipCallByLinkViewState.kt */
        public static final class Visible extends MediaSettingDialog {
            public final Setting a;
            public final SelectedOption b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VoipCallByLinkViewState.kt */
            public static final class SelectedOption {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ SelectedOption[] $VALUES;
                public static final SelectedOption DISABLED_ON_JOIN;
                public static final SelectedOption DISABLED_PERMANENT;
                public static final SelectedOption ENABLED;

                static {
                    SelectedOption selectedOption = new SelectedOption("ENABLED", 0);
                    ENABLED = selectedOption;
                    SelectedOption selectedOption2 = new SelectedOption("DISABLED_ON_JOIN", 1);
                    DISABLED_ON_JOIN = selectedOption2;
                    SelectedOption selectedOption3 = new SelectedOption("DISABLED_PERMANENT", 2);
                    DISABLED_PERMANENT = selectedOption3;
                    SelectedOption[] selectedOptionArr = {selectedOption, selectedOption2, selectedOption3};
                    $VALUES = selectedOptionArr;
                    $ENTRIES = new asp(selectedOptionArr);
                }

                public SelectedOption() {
                    throw null;
                }

                public static SelectedOption valueOf(String str) {
                    return (SelectedOption) Enum.valueOf(SelectedOption.class, str);
                }

                public static SelectedOption[] values() {
                    return (SelectedOption[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VoipCallByLinkViewState.kt */
            public static final class Setting {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Setting[] $VALUES;
                public static final Setting MICROPHONES;
                public static final Setting VIDEO;

                static {
                    Setting setting = new Setting("MICROPHONES", 0);
                    MICROPHONES = setting;
                    Setting setting2 = new Setting(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
                    VIDEO = setting2;
                    Setting[] settingArr = {setting, setting2};
                    $VALUES = settingArr;
                    $ENTRIES = new asp(settingArr);
                }

                public Setting() {
                    throw null;
                }

                public static Setting valueOf(String str) {
                    return (Setting) Enum.valueOf(Setting.class, str);
                }

                public static Setting[] values() {
                    return (Setting[]) $VALUES.clone();
                }
            }

            public Visible(Setting setting, SelectedOption selectedOption) {
                this.a = setting;
                this.b = selectedOption;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Visible)) {
                    return false;
                }
                Visible visible = (Visible) obj;
                return this.a == visible.a && this.b == visible.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Visible(setting=" + this.a + ", selectedOption=" + this.b + ')';
            }
        }

        /* compiled from: VoipCallByLinkViewState.kt */
        public static final class a extends MediaSettingDialog {
            public static final a a = new a();
        }
    }

    /* compiled from: VoipCallByLinkViewState.kt */
    public static final class a implements fm50<VoipCallByLinkState> {
        public final yzt0<ContentDialog> a;
        public final yzt0<MediaSettingDialog> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }
    }

    public VoipCallByLinkViewState(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VoipCallByLinkViewState) && this.a.equals(((VoipCallByLinkViewState) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("VoipCallByLinkViewState(scene="), this.a, ')');
    }
}
