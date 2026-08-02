package com.vk.voip.ui.scheduled.creation.ui;

import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.a;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallDuration;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.Date;
import java.util.List;
import xsna.ao50;
import xsna.asp;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.fw3;
import xsna.fxw0;
import xsna.h0u0;
import xsna.hfz;
import xsna.ho8;
import xsna.j8;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.yzt0;
import xsna.zrp;

/* compiled from: VoipScheduleCallViewState.kt */
/* loaded from: classes7.dex */
public final class VoipScheduleCallViewState implements ao50 {
    public final fi50 a;

    /* compiled from: VoipScheduleCallViewState.kt */
    public static abstract class ScreenState {

        /* compiled from: VoipScheduleCallViewState.kt */
        public static abstract class Item implements hfz {

            /* compiled from: VoipScheduleCallViewState.kt */
            public static final class EditText extends Item {
                public final String b;
                public final String c;
                public final String d;
                public final int e = 128;
                public final String f;
                public final Type g;
                public final boolean h;
                public final String i;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: VoipScheduleCallViewState.kt */
                public static final class Type {
                    private static final /* synthetic */ zrp $ENTRIES;
                    private static final /* synthetic */ Type[] $VALUES;
                    public static final Type NAME;

                    static {
                        Type type = new Type("NAME", 0);
                        NAME = type;
                        Type[] typeArr = {type};
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

                public EditText(String str, String str2, String str3, String str4, Type type, boolean z, String str5) {
                    this.b = str;
                    this.c = str2;
                    this.d = str3;
                    this.f = str4;
                    this.g = type;
                    this.h = z;
                    this.i = str5;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof EditText)) {
                        return false;
                    }
                    EditText editText = (EditText) obj;
                    return epx.f(this.b, editText.b) && epx.f(this.c, editText.c) && epx.f(this.d, editText.d) && this.e == editText.e && epx.f(this.f, editText.f) && this.g == editText.g && this.h == editText.h && epx.f(this.i, editText.i);
                }

                @Override // com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState.ScreenState.Item, xsna.hfz
                public final Number getItemId() {
                    return Integer.valueOf(this.g.ordinal());
                }

                public final int hashCode() {
                    int b = qoy.b((this.g.hashCode() + urd0.a(shy.a(this.e, urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31), 31, this.f)) * 31, 31, this.h);
                    String str = this.i;
                    return b + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("EditText(title=");
                    sb.append(this.b);
                    sb.append(", hint=");
                    sb.append(this.c);
                    sb.append(", value=");
                    sb.append(this.d);
                    sb.append(", maxSymbolsCount=");
                    sb.append(this.e);
                    sb.append(", symbolsCountText=");
                    sb.append(this.f);
                    sb.append(", type=");
                    sb.append(this.g);
                    sb.append(", hasFocus=");
                    sb.append(this.h);
                    sb.append(", nameInputError=");
                    return ho8.a(sb, this.i, ')');
                }
            }

            /* compiled from: VoipScheduleCallViewState.kt */
            public static final class Setting extends Item {
                public final Type b;
                public final int c;
                public final int d;
                public final String e;
                public final a f;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: VoipScheduleCallViewState.kt */
                public static final class Type {
                    private static final /* synthetic */ zrp $ENTRIES;
                    private static final /* synthetic */ Type[] $VALUES;
                    public static final Type ANONYMOUS_JOIN;
                    public static final Type AUDIO_MUTE;
                    public static final Type FEEDBACK;
                    public static final Type REMINDER;
                    public static final Type REPEAT;
                    public static final Type REPEAT_END;
                    public static final Type TIME_ZONE;
                    public static final Type VIDEO_MUTE;
                    public static final Type WAITING_HALL;
                    public static final Type WATCH_TOGETHER_ITEM;

                    static {
                        Type type = new Type("REMINDER", 0);
                        REMINDER = type;
                        Type type2 = new Type("WAITING_HALL", 1);
                        WAITING_HALL = type2;
                        Type type3 = new Type("ANONYMOUS_JOIN", 2);
                        ANONYMOUS_JOIN = type3;
                        Type type4 = new Type("FEEDBACK", 3);
                        FEEDBACK = type4;
                        Type type5 = new Type("TIME_ZONE", 4);
                        TIME_ZONE = type5;
                        Type type6 = new Type("REPEAT", 5);
                        REPEAT = type6;
                        Type type7 = new Type("REPEAT_END", 6);
                        REPEAT_END = type7;
                        Type type8 = new Type("AUDIO_MUTE", 7);
                        AUDIO_MUTE = type8;
                        Type type9 = new Type("VIDEO_MUTE", 8);
                        VIDEO_MUTE = type9;
                        Type type10 = new Type("WATCH_TOGETHER_ITEM", 9);
                        WATCH_TOGETHER_ITEM = type10;
                        Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10};
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

                /* compiled from: VoipScheduleCallViewState.kt */
                public static abstract class a {

                    /* compiled from: VoipScheduleCallViewState.kt */
                    /* renamed from: com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState$ScreenState$Item$Setting$a$a, reason: collision with other inner class name */
                    public static final class C2072a extends a {
                        public static final C2072a a = new C2072a();
                    }

                    /* compiled from: VoipScheduleCallViewState.kt */
                    public static final class b extends a {
                        public static final b a = new b();
                    }

                    /* compiled from: VoipScheduleCallViewState.kt */
                    public static final class c extends a {
                        public static final c a = new c();
                    }
                }

                public Setting(Type type, int i, int i2, String str, a aVar) {
                    this.b = type;
                    this.c = i;
                    this.d = i2;
                    this.e = str;
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
                    return this.b == setting.b && this.c == setting.c && this.d == setting.d && epx.f(this.e, setting.e) && epx.f(this.f, setting.f);
                }

                @Override // com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState.ScreenState.Item, xsna.hfz
                public final Number getItemId() {
                    return Integer.valueOf(this.b.ordinal());
                }

                public final int hashCode() {
                    return this.f.hashCode() + urd0.a(shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e);
                }

                public final String toString() {
                    return "Setting(type=" + this.b + ", iconId=" + this.c + ", titleId=" + this.d + ", subtitleText=" + this.e + ", switchState=" + this.f + ')';
                }
            }

            /* compiled from: VoipScheduleCallViewState.kt */
            public static abstract class a extends Item {

                /* compiled from: VoipScheduleCallViewState.kt */
                /* renamed from: com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState$ScreenState$Item$a$a, reason: collision with other inner class name */
                public static final class C2073a extends a {
                    public final a.b.C1179b b;
                    public final ImageList c;
                    public final String d;
                    public final boolean e;

                    public C2073a(a.b.C1179b c1179b, ImageList imageList, String str, boolean z) {
                        this.b = c1179b;
                        this.c = imageList;
                        this.d = str;
                        this.e = z;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C2073a)) {
                            return false;
                        }
                        C2073a c2073a = (C2073a) obj;
                        return epx.f(this.b, c2073a.b) && epx.f(this.c, c2073a.c) && epx.f(this.d, c2073a.d) && this.e == c2073a.e;
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

                /* compiled from: VoipScheduleCallViewState.kt */
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

            /* compiled from: VoipScheduleCallViewState.kt */
            public static final class b extends Item {
                public final c b;
                public final c c;
                public final int d;
                public final List<VoipScheduledCallDuration> e;

                /* JADX WARN: Multi-variable type inference failed */
                public b(c cVar, c cVar2, int i, List<? extends VoipScheduledCallDuration> list) {
                    this.b = cVar;
                    this.c = cVar2;
                    this.d = i;
                    this.e = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e);
                }

                public final int hashCode() {
                    return this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("DateTime(startDateTime=");
                    sb.append(this.b);
                    sb.append(", endDateTime=");
                    sb.append(this.c);
                    sb.append(", selectedDurationOptionIndex=");
                    sb.append(this.d);
                    sb.append(", durationSlots=");
                    return ms9.a(')', sb, this.e);
                }
            }

            /* compiled from: VoipScheduleCallViewState.kt */
            public static final class c {
                public final Date a;
                public final boolean b;
                public final boolean c;

                public c(Date date, boolean z, boolean z2) {
                    this.a = date;
                    this.b = z;
                    this.c = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("DateTimePickerInfo(date=");
                    sb.append(this.a);
                    sb.append(", isDatePickerEnabled=");
                    sb.append(this.b);
                    sb.append(", isTimePickerEnabled=");
                    return q0.a(sb, this.c, ')');
                }
            }

            /* compiled from: VoipScheduleCallViewState.kt */
            public static final class d extends Item {
                public static final d b = new d();
            }

            /* compiled from: VoipScheduleCallViewState.kt */
            public static final class e extends Item {
                public final int b = R.drawable.vk_icon_settings_outline_28;
                public final int c = R.string.voip_scheduled_call_settings_item_title;
                public final int d = R.string.voip_scheduled_call_settings_item_subtitle;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return this.b == eVar.b && this.c == eVar.c && this.d == eVar.d;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Settings(iconId=");
                    sb.append(this.b);
                    sb.append(", titleId=");
                    sb.append(this.c);
                    sb.append(", subtitleId=");
                    return vu5.b(sb, this.d, ')');
                }
            }

            /* compiled from: VoipScheduleCallViewState.kt */
            public static final class f extends Item {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    ((f) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return "Title(title=null)";
                }
            }

            @Override // xsna.hfz
            public Number getItemId() {
                return 0;
            }
        }

        /* compiled from: VoipScheduleCallViewState.kt */
        public static final class a extends ScreenState {
            public final List<Item> a;
            public final Integer b;
            public final boolean c;

            public a(Integer num, List list, boolean z) {
                this.a = list;
                this.b = num;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Integer num = this.b;
                return Boolean.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(items=");
                sb.append(this.a);
                sb.append(", highlightItemIndex=");
                sb.append(this.b);
                sb.append(", isLoading=");
                return q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: VoipScheduleCallViewState.kt */
        public static final class b extends ScreenState {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: VoipScheduleCallViewState.kt */
        public static final class c extends ScreenState {
            public static final c a = new c();
        }
    }

    /* compiled from: VoipScheduleCallViewState.kt */
    public static final class a implements fm50<fxw0> {
        public final yzt0<ScreenState> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public VoipScheduleCallViewState(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VoipScheduleCallViewState) && this.a.equals(((VoipScheduleCallViewState) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("VoipScheduleCallViewState(scene="), this.a, ')');
    }
}
