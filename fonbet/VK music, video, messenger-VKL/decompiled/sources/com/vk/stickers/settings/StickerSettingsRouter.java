package com.vk.stickers.settings;

import android.content.Context;
import xsna.asp;
import xsna.dw20;
import xsna.zrp;

/* compiled from: StickerSettingsRouter.kt */
/* loaded from: classes6.dex */
public final class StickerSettingsRouter {
    public final Context a;
    public dw20 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickerSettingsRouter.kt */
    public static final class VmojiMenuButton {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VmojiMenuButton[] $VALUES;
        public static final VmojiMenuButton EDIT;
        public static final VmojiMenuButton HIDE;
        public static final VmojiMenuButton SHOW;

        static {
            VmojiMenuButton vmojiMenuButton = new VmojiMenuButton("EDIT", 0);
            EDIT = vmojiMenuButton;
            VmojiMenuButton vmojiMenuButton2 = new VmojiMenuButton("SHOW", 1);
            SHOW = vmojiMenuButton2;
            VmojiMenuButton vmojiMenuButton3 = new VmojiMenuButton("HIDE", 2);
            HIDE = vmojiMenuButton3;
            VmojiMenuButton[] vmojiMenuButtonArr = {vmojiMenuButton, vmojiMenuButton2, vmojiMenuButton3};
            $VALUES = vmojiMenuButtonArr;
            $ENTRIES = new asp(vmojiMenuButtonArr);
        }

        public VmojiMenuButton() {
            throw null;
        }

        public static VmojiMenuButton valueOf(String str) {
            return (VmojiMenuButton) Enum.valueOf(VmojiMenuButton.class, str);
        }

        public static VmojiMenuButton[] values() {
            return (VmojiMenuButton[]) $VALUES.clone();
        }
    }

    public StickerSettingsRouter(Context context) {
        this.a = context;
    }
}
