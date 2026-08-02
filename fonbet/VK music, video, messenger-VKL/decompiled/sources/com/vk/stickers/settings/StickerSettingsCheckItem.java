package com.vk.stickers.settings;

import xsna.asp;
import xsna.bk7;
import xsna.epx;
import xsna.qoy;
import xsna.zrp;

/* compiled from: StickerSettingsItem.kt */
/* loaded from: classes6.dex */
public final class StickerSettingsCheckItem extends bk7 {
    public final int c;
    public final Integer d;
    public final boolean e;
    public final boolean f;
    public final Setting g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickerSettingsItem.kt */
    public static final class Setting {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Setting[] $VALUES;
        public static final Setting ANIMATIONS;
        public static final Setting POPUP_ANIMATIONS_ON_GET;
        public static final Setting POPUP_ANIMATIONS_ON_SEND;
        public static final Setting SUGGESTS;

        static {
            Setting setting = new Setting("SUGGESTS", 0);
            SUGGESTS = setting;
            Setting setting2 = new Setting("ANIMATIONS", 1);
            ANIMATIONS = setting2;
            Setting setting3 = new Setting("POPUP_ANIMATIONS_ON_SEND", 2);
            POPUP_ANIMATIONS_ON_SEND = setting3;
            Setting setting4 = new Setting("POPUP_ANIMATIONS_ON_GET", 3);
            POPUP_ANIMATIONS_ON_GET = setting4;
            Setting[] settingArr = {setting, setting2, setting3, setting4};
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

    public StickerSettingsCheckItem(int i, Integer num, boolean z, boolean z2, Setting setting) {
        super(1);
        this.c = i;
        this.d = num;
        this.e = z;
        this.f = z2;
        this.g = setting;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerSettingsCheckItem)) {
            return false;
        }
        StickerSettingsCheckItem stickerSettingsCheckItem = (StickerSettingsCheckItem) obj;
        return this.c == stickerSettingsCheckItem.c && epx.f(this.d, stickerSettingsCheckItem.d) && this.e == stickerSettingsCheckItem.e && this.f == stickerSettingsCheckItem.f && this.g == stickerSettingsCheckItem.g;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.c) * 31;
        Integer num = this.d;
        return this.g.hashCode() + qoy.b(qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "StickerSettingsCheckItem(titleRes=" + this.c + ", subtitleRes=" + this.d + ", isChecked=" + this.e + ", isEnabled=" + this.f + ", setting=" + this.g + ')';
    }

    public /* synthetic */ StickerSettingsCheckItem(int i, Integer num, boolean z, boolean z2, Setting setting, int i2) {
        this(i, (i2 & 2) != 0 ? null : num, z, (i2 & 8) != 0 ? true : z2, setting);
    }
}
