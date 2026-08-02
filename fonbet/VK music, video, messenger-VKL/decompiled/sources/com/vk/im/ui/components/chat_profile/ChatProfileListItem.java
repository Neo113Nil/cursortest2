package com.vk.im.ui.components.chat_profile;

import android.content.Context;
import com.vk.dto.user.SocialButtonType;
import com.vk.im.engine.models.education.EduAchievement;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.qxb;
import xsna.vp;
import xsna.zrp;

/* compiled from: ChatProfileListItem.kt */
/* loaded from: classes2.dex */
public abstract class ChatProfileListItem implements qxb {
    public final int a;
    public final CharSequence b;
    public final int c;
    public final Integer d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    /* compiled from: ChatProfileListItem.kt */
    public static final class InviteLink extends ChatProfileListItem {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ChatProfileListItem.kt */
        public static final class EntityType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ EntityType[] $VALUES;
            public static final EntityType CHANNEL;
            public static final EntityType CHAT;

            static {
                EntityType entityType = new EntityType("CHAT", 0);
                CHAT = entityType;
                EntityType entityType2 = new EntityType("CHANNEL", 1);
                CHANNEL = entityType2;
                EntityType[] entityTypeArr = {entityType, entityType2};
                $VALUES = entityTypeArr;
                $ENTRIES = new asp(entityTypeArr);
            }

            public EntityType() {
                throw null;
            }

            public static EntityType valueOf(String str) {
                return (EntityType) Enum.valueOf(EntityType.class, str);
            }

            public static EntityType[] values() {
                return (EntityType[]) $VALUES.clone();
            }
        }

        /* compiled from: ChatProfileListItem.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntityType.values().length];
                try {
                    iArr[EntityType.CHAT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntityType.CHANNEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class a extends ChatProfileListItem {
        public final List<EduAchievement> h;

        public a() {
            throw null;
        }

        public a(List list) {
            super(16, "", R.drawable.vk_icon_info_circle_outline_24, null, false, false, false, 96);
            this.h = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.h, ((a) obj).h);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (this.h.hashCode() * 31);
        }

        public final String toString() {
            return vp.b(", canShowHint=false)", new StringBuilder("AchievementsItem(achievements="), this.h);
        }
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class b extends ChatProfileListItem {
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class c extends ChatProfileListItem {
        public final CharSequence h;
        public final boolean i;
        public final Integer j;
        public final boolean k;

        public c(boolean z, String str, Integer num, boolean z2) {
            super(14, str, R.drawable.vk_icon_ugc_chat_sticker_outline_28, num, z, false, false, 96);
            this.h = str;
            this.i = z;
            this.j = num;
            this.k = z2;
        }

        @Override // com.vk.im.ui.components.chat_profile.ChatProfileListItem, xsna.qxb
        public final boolean d() {
            return this.k;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.h, cVar.h) && this.i == cVar.i && epx.f(this.j, cVar.j) && this.k == cVar.k;
        }

        public final int hashCode() {
            int b = qoy.b(this.h.hashCode() * 31, 31, this.i);
            Integer num = this.j;
            return Boolean.hashCode(this.k) + ((b + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChatUgc(title=");
            sb.append((Object) this.h);
            sb.append(", canShowHint=");
            sb.append(this.i);
            sb.append(", iconRightRes=");
            sb.append(this.j);
            sb.append(", showAsAction=");
            return q0.a(sb, this.k, ')');
        }
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class d extends ChatProfileListItem {
        public final CharSequence h;

        public d(CharSequence charSequence) {
            super(15, charSequence, R.drawable.vk_icon_info_circle_outline_24, null, false, false, false, 96);
            this.h = charSequence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.h, ((d) obj).h);
        }

        public final int hashCode() {
            return qoy.b(this.h.hashCode() * 31, 31, false);
        }

        public final String toString() {
            return "DescriptionItem(title=" + ((Object) this.h) + ", canShowHint=false, iconRightRes=null)";
        }
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class e extends ChatProfileListItem {

        /* compiled from: ChatProfileListItem.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SocialButtonType.values().length];
                try {
                    iArr[SocialButtonType.ADD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SocialButtonType.FOLLOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class f extends ChatProfileListItem {
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class g extends ChatProfileListItem {
        public g(String str, boolean z) {
            super(19, str, R.drawable.vk_icon_money_circle_outline_28, null, false, z, false, 80);
        }
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class h extends ChatProfileListItem {
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class i extends ChatProfileListItem {
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class j extends ChatProfileListItem {
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class k extends ChatProfileListItem {
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class l extends ChatProfileListItem {
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class m extends ChatProfileListItem {
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class n extends ChatProfileListItem {
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class o extends ChatProfileListItem {
        public final boolean h;

        public o(Context context, boolean z) {
            super(17, context.getString(R.string.vkim_gift_send_btn), R.drawable.vk_icon_gift_outline_24, null, false, false, false, 120);
            this.h = z;
        }

        @Override // com.vk.im.ui.components.chat_profile.ChatProfileListItem, xsna.qxb
        public final boolean d() {
            return this.h;
        }
    }

    /* compiled from: ChatProfileListItem.kt */
    public static final class p extends ChatProfileListItem {
    }

    public ChatProfileListItem(int i2, CharSequence charSequence, int i3, Integer num, boolean z, boolean z2, boolean z3, int i4) {
        num = (i4 & 8) != 0 ? null : num;
        z = (i4 & 16) != 0 ? false : z;
        z2 = (i4 & 32) != 0 ? false : z2;
        z3 = (i4 & 64) != 0 ? false : z3;
        this.a = i2;
        this.b = charSequence;
        this.c = i3;
        this.d = num;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    @Override // xsna.qxb
    public final Integer a() {
        return this.d;
    }

    @Override // xsna.qxb
    public final int b() {
        return this.c;
    }

    @Override // xsna.qxb
    public final boolean c() {
        return this.e;
    }

    @Override // xsna.qxb
    public boolean d() {
        return this.g;
    }

    @Override // xsna.qxb
    public final boolean e() {
        return this.f;
    }

    @Override // xsna.qxb
    public final CharSequence f() {
        return this.b;
    }

    @Override // xsna.qxb
    public final int getId() {
        return this.a;
    }
}
