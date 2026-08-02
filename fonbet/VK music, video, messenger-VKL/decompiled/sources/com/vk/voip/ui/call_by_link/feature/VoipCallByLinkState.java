package com.vk.voip.ui.call_by_link.feature;

import defpackage.q0;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.cgw0;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.qoy;
import xsna.zrp;

/* compiled from: VoipCallByLinkState.kt */
/* loaded from: classes7.dex */
public abstract class VoipCallByLinkState implements km50 {

    /* compiled from: VoipCallByLinkState.kt */
    public static final class Content extends VoipCallByLinkState {
        public final c b;
        public final List<cgw0> c;
        public final b d;
        public final g e;
        public final a f;
        public final d g;
        public final e h;
        public final f i;
        public final MediaSettingDialogState j;
        public final h k;

        /* compiled from: VoipCallByLinkState.kt */
        public static abstract class MediaSettingDialogState {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VoipCallByLinkState.kt */
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
            /* compiled from: VoipCallByLinkState.kt */
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

            /* compiled from: VoipCallByLinkState.kt */
            public static final class a extends MediaSettingDialogState {
                public static final a a = new a();
            }

            /* compiled from: VoipCallByLinkState.kt */
            public static final class b extends MediaSettingDialogState {
                public final Setting a;
                public final SelectedOption b;

                public b(Setting setting, SelectedOption selectedOption) {
                    this.a = setting;
                    this.b = selectedOption;
                }

                public static b a(b bVar, SelectedOption selectedOption) {
                    Setting setting = bVar.a;
                    bVar.getClass();
                    return new b(setting, selectedOption);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.a == bVar.a && this.b == bVar.b;
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "Visible(setting=" + this.a + ", selectedOption=" + this.b + ')';
                }
            }
        }

        /* compiled from: VoipCallByLinkState.kt */
        public static final class a {
            public final boolean a;

            public a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("AnonymousJoinSettings(isEnabled="), this.a, ')');
            }
        }

        /* compiled from: VoipCallByLinkState.kt */
        public static abstract class b {

            /* compiled from: VoipCallByLinkState.kt */
            public static final class a extends b {
                public static final a a = new a();
            }

            /* compiled from: VoipCallByLinkState.kt */
            /* renamed from: com.vk.voip.ui.call_by_link.feature.VoipCallByLinkState$Content$b$b, reason: collision with other inner class name */
            public static final class C2013b extends b {
                public final cgw0 a;

                public C2013b(cgw0 cgw0Var) {
                    this.a = cgw0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2013b) && epx.f(this.a, ((C2013b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Group(group=" + this.a + ')';
                }
            }
        }

        /* compiled from: VoipCallByLinkState.kt */
        public static abstract class c {

            /* compiled from: VoipCallByLinkState.kt */
            public static final class a extends c {
                public static final a a = new a();
            }

            /* compiled from: VoipCallByLinkState.kt */
            public static final class b extends c {
                public static final b a = new b();
            }
        }

        /* compiled from: VoipCallByLinkState.kt */
        public static final class d {
            public final boolean a;

            public d(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("FeedbackSettings(isEnabled="), this.a, ')');
            }
        }

        /* compiled from: VoipCallByLinkState.kt */
        public static abstract class e {

            /* compiled from: VoipCallByLinkState.kt */
            public static final class a extends e {
                public static final a a = new a();
            }

            /* compiled from: VoipCallByLinkState.kt */
            public static final class b extends e {
                public static final b a = new b();
            }

            /* compiled from: VoipCallByLinkState.kt */
            public static final class c extends e {
                public static final c a = new c();
            }
        }

        /* compiled from: VoipCallByLinkState.kt */
        public static abstract class f {

            /* compiled from: VoipCallByLinkState.kt */
            public static final class a extends f {
                public static final a a = new a();
            }

            /* compiled from: VoipCallByLinkState.kt */
            public static final class b extends f {
                public static final b a = new b();
            }

            /* compiled from: VoipCallByLinkState.kt */
            public static final class c extends f {
                public static final c a = new c();
            }
        }

        /* compiled from: VoipCallByLinkState.kt */
        public static final class g {
            public final boolean a;

            public g(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.a == ((g) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("WaitingHallSettings(isEnabled="), this.a, ')');
            }
        }

        /* compiled from: VoipCallByLinkState.kt */
        public static final class h {
            public final boolean a;
            public final boolean b;

            public h(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.a == hVar.a && this.b == hVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("WatchTogetherSetting(isFeatureActive=");
                sb.append(this.a);
                sb.append(", isEnabled=");
                return q0.a(sb, this.b, ')');
            }
        }

        public Content(c cVar, List<cgw0> list, b bVar, g gVar, a aVar, d dVar, e eVar, f fVar, MediaSettingDialogState mediaSettingDialogState, h hVar) {
            this.b = cVar;
            this.c = list;
            this.d = bVar;
            this.e = gVar;
            this.f = aVar;
            this.g = dVar;
            this.h = eVar;
            this.i = fVar;
            this.j = mediaSettingDialogState;
            this.k = hVar;
        }

        public static Content a(Content content, c cVar, b bVar, g gVar, a aVar, d dVar, e eVar, f fVar, MediaSettingDialogState mediaSettingDialogState, h hVar, int i) {
            if ((i & 1) != 0) {
                cVar = content.b;
            }
            c cVar2 = cVar;
            List<cgw0> list = content.c;
            if ((i & 4) != 0) {
                bVar = content.d;
            }
            b bVar2 = bVar;
            if ((i & 8) != 0) {
                gVar = content.e;
            }
            g gVar2 = gVar;
            if ((i & 16) != 0) {
                aVar = content.f;
            }
            a aVar2 = aVar;
            d dVar2 = (i & 32) != 0 ? content.g : dVar;
            e eVar2 = (i & 64) != 0 ? content.h : eVar;
            f fVar2 = (i & 128) != 0 ? content.i : fVar;
            MediaSettingDialogState mediaSettingDialogState2 = (i & 256) != 0 ? content.j : mediaSettingDialogState;
            h hVar2 = (i & 512) != 0 ? content.k : hVar;
            content.getClass();
            return new Content(cVar2, list, bVar2, gVar2, aVar2, dVar2, eVar2, fVar2, mediaSettingDialogState2, hVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return epx.f(this.b, content.b) && epx.f(this.c, content.c) && epx.f(this.d, content.d) && epx.f(this.e, content.e) && epx.f(this.f, content.f) && epx.f(this.g, content.g) && epx.f(this.h, content.h) && epx.f(this.i, content.i) && epx.f(this.j, content.j) && epx.f(this.k, content.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + qoy.b(qoy.b(qoy.b((this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e.a), 31, this.f.a), 31, this.g.a)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Content(dialogState=" + this.b + ", groups=" + this.c + ", callAs=" + this.d + ", waitingHallSettings=" + this.e + ", anonymousJoinSettings=" + this.f + ", feedbackSettings=" + this.g + ", mediaMicrophonesSettings=" + this.h + ", mediaVideoSettings=" + this.i + ", mediaSettingDialogState=" + this.j + ", watchTogetherSetting=" + this.k + ')';
        }
    }

    /* compiled from: VoipCallByLinkState.kt */
    public static final class a extends VoipCallByLinkState {
        public static final a b = new a();
    }

    /* compiled from: VoipCallByLinkState.kt */
    public static final class b extends VoipCallByLinkState {
        public static final b b = new b();
    }
}
