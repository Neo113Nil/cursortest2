package com.vk.music.offline.api.model.moosic;

import xsna.asp;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: VkMusicOldAudioBookPersonEntity.kt */
/* loaded from: classes3.dex */
public final class VkMusicOldAudioBookPersonEntity {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkMusicOldAudioBookPersonEntity.kt */
    public static final class Role {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Role[] $VALUES;
        public static final Role AUTHOR;
        public static final Role NARRATOR;

        static {
            Role role = new Role("AUTHOR", 0);
            AUTHOR = role;
            Role role2 = new Role("NARRATOR", 1);
            NARRATOR = role2;
            Role[] roleArr = {role, role2};
            $VALUES = roleArr;
            $ENTRIES = new asp(roleArr);
        }

        public Role() {
            throw null;
        }

        public static zrp<Role> h() {
            return $ENTRIES;
        }

        public static Role valueOf(String str) {
            return (Role) Enum.valueOf(Role.class, str);
        }

        public static Role[] values() {
            return (Role[]) $VALUES.clone();
        }
    }

    /* compiled from: VkMusicOldAudioBookPersonEntity.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Role.values().length];
            try {
                iArr[Role.AUTHOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Role.NARRATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkMusicOldAudioBookPersonEntity(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkMusicOldAudioBookPersonEntity)) {
            return false;
        }
        VkMusicOldAudioBookPersonEntity vkMusicOldAudioBookPersonEntity = (VkMusicOldAudioBookPersonEntity) obj;
        return this.a == vkMusicOldAudioBookPersonEntity.a && epx.f(this.b, vkMusicOldAudioBookPersonEntity.b) && epx.f(this.c, vkMusicOldAudioBookPersonEntity.c) && epx.f(this.d, vkMusicOldAudioBookPersonEntity.d) && this.e == vkMusicOldAudioBookPersonEntity.e;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Integer.hashCode(this.e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMusicOldAudioBookPersonEntity(serverId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", coverId=");
        sb.append(this.d);
        sb.append(", role=");
        return vu5.b(sb, this.e, ')');
    }
}
