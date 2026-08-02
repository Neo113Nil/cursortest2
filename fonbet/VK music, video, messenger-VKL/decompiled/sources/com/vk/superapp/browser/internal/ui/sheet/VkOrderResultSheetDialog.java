package com.vk.superapp.browser.internal.ui.sheet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.dw20;
import xsna.e1s0;
import xsna.e3m;
import xsna.nt9;
import xsna.utp;
import xsna.zrp;

/* compiled from: VkOrderResultSheetDialog.kt */
/* loaded from: classes6.dex */
public final class VkOrderResultSheetDialog {
    public final Context a;
    public dw20 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkOrderResultSheetDialog.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode NEGATIVE;
        public static final Mode POSITIVE;
        private final int description;
        private final int icon;
        private final int iconColor;
        private final int title;

        static {
            Mode mode = new Mode("POSITIVE", 0, R.drawable.vk_icon_check_circle_outline_56, R.attr.vk_ui_accent_green, R.string.vk_auto_order_title_success, R.string.vk_auto_order_description_success);
            POSITIVE = mode;
            Mode mode2 = new Mode("NEGATIVE", 1, R.drawable.vk_icon_error_triangle_outline_56, R.attr.vk_ui_accent_orange, R.string.vk_auto_order_title_error, R.string.vk_auto_order_description_error);
            NEGATIVE = mode2;
            Mode[] modeArr = {mode, mode2};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode(String str, int i, int i2, int i3, int i4, int i5) {
            this.icon = i2;
            this.iconColor = i3;
            this.title = i4;
            this.description = i5;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }

        public final int h() {
            return this.description;
        }

        public final int i() {
            return this.icon;
        }

        public final int j() {
            return this.iconColor;
        }

        public final int k() {
            return this.title;
        }
    }

    public VkOrderResultSheetDialog(Context context) {
        this.a = context;
    }

    public final void a(boolean z, Mode mode, e1s0 e1s0Var) {
        Context context = this.a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.vk_order_result_dialog, (ViewGroup) null, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.result_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.result_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.result_description);
        Button button = (Button) inflate.findViewById(R.id.result_button);
        imageView.setImageResource(mode.i());
        imageView.setColorFilter(e3m.f(mode.j(), context));
        textView.setText(mode.k());
        textView2.setText(context.getString(mode.h(), context.getString(z ? R.string.vk_in_the_game : R.string.vk_in_the_app)));
        button.setText(z ? R.string.vk_order_auto_buy_continue_play : R.string.vk_order_auto_buy_return_to_app);
        button.setOnClickListener(new nt9(3, this, e1s0Var));
        this.b = new dw20.b(context, null).D0(inflate, false).X(new utp(2, e1s0Var)).I0("");
    }
}
