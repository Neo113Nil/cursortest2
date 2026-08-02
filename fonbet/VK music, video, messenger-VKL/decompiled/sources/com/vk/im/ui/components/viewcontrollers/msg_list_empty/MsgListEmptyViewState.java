package com.vk.im.ui.components.viewcontrollers.msg_list_empty;

import android.graphics.drawable.Drawable;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.ers;
import xsna.qoy;
import xsna.zrp;

/* compiled from: MsgListEmptyViewState.kt */
/* loaded from: classes2.dex */
public abstract class MsgListEmptyViewState {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MsgListEmptyViewState.kt */
    public static final class DrawStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DrawStyle[] $VALUES;
        public static final DrawStyle CONTRAST;
        public static final DrawStyle NORMAL;

        static {
            DrawStyle drawStyle = new DrawStyle("NORMAL", 0);
            NORMAL = drawStyle;
            DrawStyle drawStyle2 = new DrawStyle("CONTRAST", 1);
            CONTRAST = drawStyle2;
            DrawStyle[] drawStyleArr = {drawStyle, drawStyle2};
            $VALUES = drawStyleArr;
            $ENTRIES = new asp(drawStyleArr);
        }

        public DrawStyle() {
            throw null;
        }

        public static DrawStyle valueOf(String str) {
            return (DrawStyle) Enum.valueOf(DrawStyle.class, str);
        }

        public static DrawStyle[] values() {
            return (DrawStyle[]) $VALUES.clone();
        }
    }

    /* compiled from: MsgListEmptyViewState.kt */
    public static final class ForDialog extends MsgListEmptyViewState {
        public final Dialog a;
        public final ProfilesSimpleInfo b;
        public final ers c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final Motivation g;
        public final DrawStyle h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MsgListEmptyViewState.kt */
        public static final class Motivation {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Motivation[] $VALUES;
            public static final Motivation TEXT_OR_SEND_STICKER;
            public static final Motivation TEXT_TO_VIEW_PROFILE;

            static {
                Motivation motivation = new Motivation("TEXT_TO_VIEW_PROFILE", 0);
                TEXT_TO_VIEW_PROFILE = motivation;
                Motivation motivation2 = new Motivation("TEXT_OR_SEND_STICKER", 1);
                TEXT_OR_SEND_STICKER = motivation2;
                Motivation[] motivationArr = {motivation, motivation2};
                $VALUES = motivationArr;
                $ENTRIES = new asp(motivationArr);
            }

            public Motivation() {
                throw null;
            }

            public static Motivation valueOf(String str) {
                return (Motivation) Enum.valueOf(Motivation.class, str);
            }

            public static Motivation[] values() {
                return (Motivation[]) $VALUES.clone();
            }
        }

        public ForDialog(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, ers ersVar, boolean z, boolean z2, boolean z3, Motivation motivation, DrawStyle drawStyle) {
            this.a = dialog;
            this.b = profilesSimpleInfo;
            this.c = ersVar;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = motivation;
            this.h = drawStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForDialog)) {
                return false;
            }
            ForDialog forDialog = (ForDialog) obj;
            return epx.f(this.a, forDialog.a) && epx.f(this.b, forDialog.b) && epx.f(this.c, forDialog.c) && this.d == forDialog.d && this.e == forDialog.e && this.f == forDialog.f && this.g == forDialog.g && this.h == forDialog.h;
        }

        public final int hashCode() {
            return this.h.hashCode() + ((this.g.hashCode() + qoy.b(qoy.b(qoy.b((this.c.hashCode() + io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31);
        }

        public final String toString() {
            return "ForDialog(dialog=" + this.a + ", profiles=" + this.b + ", friendsMutual=" + this.c + ", showFriendsStatusAndOpenProfileButton=" + this.d + ", isCurrentUserFollowersModeOn=" + this.e + ", isNewEmptyViewEnabledForCommunity=" + this.f + ", motivation=" + this.g + ", drawStyle=" + this.h + ')';
        }
    }

    /* compiled from: MsgListEmptyViewState.kt */
    public static final class a extends MsgListEmptyViewState {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -521941566;
        }

        public final String toString() {
            return "ChannelOnboarding";
        }
    }

    /* compiled from: MsgListEmptyViewState.kt */
    public static final class b extends MsgListEmptyViewState {
        public final Drawable a;
        public final CharSequence b;
        public final CharSequence c;
        public final DrawStyle d;

        public b() {
            this(null, null, null, null, 31);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            Drawable drawable = this.a;
            int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
            CharSequence charSequence = this.b;
            int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.c;
            return this.d.hashCode() + ((hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 961);
        }

        public final String toString() {
            return "Custom(icon=" + this.a + ", title=" + ((Object) this.b) + ", subtitle=" + ((Object) this.c) + ", button=null, drawStyle=" + this.d + ')';
        }

        public b(Drawable drawable, String str, String str2, DrawStyle drawStyle, int i) {
            drawable = (i & 1) != 0 ? null : drawable;
            str = (i & 2) != 0 ? null : str;
            str2 = (i & 4) != 0 ? null : str2;
            drawStyle = (i & 16) != 0 ? DrawStyle.NORMAL : drawStyle;
            this.a = drawable;
            this.b = str;
            this.c = str2;
            this.d = drawStyle;
        }
    }

    /* compiled from: MsgListEmptyViewState.kt */
    public static final class c extends MsgListEmptyViewState {
        public final DrawStyle a = DrawStyle.NORMAL;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Onboarding(drawStyle=" + this.a + ')';
        }
    }

    /* compiled from: MsgListEmptyViewState.kt */
    public static final class d extends MsgListEmptyViewState {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public d(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkAppChannelOnboarding(isShowFirstPost=");
            sb.append(this.a);
            sb.append(", isTgMigration=");
            sb.append(this.b);
            sb.append(", isShowMonetization=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MsgListEmptyViewState.kt */
    public static final class e extends MsgListEmptyViewState {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1699680042;
        }

        public final String toString() {
            return "VkAppChannelPostponedOnboarding";
        }
    }
}
