package com.vk.libvideo.miniplayer.dialog;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ai0;
import xsna.asp;
import xsna.awt0;
import xsna.gzs;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: VideoMinimizableDialogHeaderViewHolder.kt */
/* loaded from: classes3.dex */
public final class VideoMinimizableDialogHeaderViewHolder {
    public final ViewGroup a;
    public final ImageButton b;
    public final TextView c;
    public final View d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoMinimizableDialogHeaderViewHolder.kt */
    public static final class IconMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconMode[] $VALUES;
        public static final IconMode Back;
        public static final IconMode Close;

        static {
            IconMode iconMode = new IconMode("Back", 0);
            Back = iconMode;
            IconMode iconMode2 = new IconMode("Close", 1);
            Close = iconMode2;
            IconMode[] iconModeArr = {iconMode, iconMode2};
            $VALUES = iconModeArr;
            $ENTRIES = new asp(iconModeArr);
        }

        public IconMode() {
            throw null;
        }

        public static IconMode valueOf(String str) {
            return (IconMode) Enum.valueOf(IconMode.class, str);
        }

        public static IconMode[] values() {
            return (IconMode[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoMinimizableDialogHeaderViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconMode.values().length];
            try {
                iArr[IconMode.Back.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconMode.Close.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoMinimizableDialogHeaderViewHolder(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = (ImageButton) viewGroup.findViewById(R.id.videoDialogNavigationIcon);
        this.c = (TextView) viewGroup.findViewById(R.id.videoDialogTitle);
        this.d = viewGroup.findViewById(R.id.grabber);
    }

    public final void a(IconMode iconMode, String str, boolean z, gzs<s3q0> gzsVar) {
        int i;
        String string;
        this.c.setText(str);
        View view = this.d;
        if (view != null) {
            awt0.v(view, z);
        }
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[iconMode.ordinal()];
        if (i2 == 1) {
            i = R.drawable.vk_icon_arrow_left_outline_28;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_cancel_outline_28;
        }
        ImageButton imageButton = this.b;
        imageButton.setImageResource(i);
        int i3 = iArr[iconMode.ordinal()];
        if (i3 == 1) {
            string = imageButton.getContext().getString(R.string.video_accessibility_back);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string = imageButton.getContext().getString(R.string.video_accessibility_close);
        }
        imageButton.setContentDescription(string);
        imageButton.setOnClickListener(new ai0(gzsVar, 10));
    }
}
