package com.vk.im.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.bwt0;
import xsna.f4m;
import xsna.iwv;
import xsna.myc0;
import xsna.wze0;
import xsna.zrp;

/* compiled from: WriteBarDisabledMoveToMaxBanner.kt */
/* loaded from: classes2.dex */
public final class WriteBarDisabledMoveToMaxBanner extends FrameLayout {
    public Screen b;
    public iwv c;
    public String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WriteBarDisabledMoveToMaxBanner.kt */
    public static final class Screen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;
        public static final Screen CHAT;
        public static final Screen CHAT_PROFILE;

        static {
            Screen screen = new Screen("CHAT", 0);
            CHAT = screen;
            Screen screen2 = new Screen("CHAT_PROFILE", 1);
            CHAT_PROFILE = screen2;
            Screen[] screenArr = {screen, screen2};
            $VALUES = screenArr;
            $ENTRIES = new asp(screenArr);
        }

        public Screen() {
            throw null;
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }

    /* compiled from: WriteBarDisabledMoveToMaxBanner.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Screen.values().length];
            try {
                iArr[Screen.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Screen.CHAT_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WriteBarDisabledMoveToMaxBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        bwt0.i0(LayoutInflater.from(context).inflate(R.layout.vkim_write_bar_disabled_moved_to_max, (ViewGroup) this, true), new wze0(9, this, context));
    }

    public final iwv getActionBridge() {
        return this.c;
    }

    public final String getLink() {
        return this.d;
    }

    public final Screen getScreen() {
        return this.b;
    }

    public final void setActionBridge(iwv iwvVar) {
        this.c = iwvVar;
    }

    public final void setLink(String str) {
        this.d = str;
        f4m.D(findViewById(R.id.chevron), myc0.f(str));
    }

    public final void setScreen(Screen screen) {
        this.b = screen;
    }
}
