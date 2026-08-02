package com.vk.im.ui.formatters.spans.dialogitem;

import android.text.SpannableStringBuilder;
import com.vk.im.ui.formatters.spans.dialogitem.MsgBodySpan;

/* compiled from: SpannableMsgBodyExt.kt */
/* loaded from: classes2.dex */
public final class b {
    public static void a(SpannableStringBuilder spannableStringBuilder, MsgBodySpan.Type type, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = spannableStringBuilder.length();
        }
        spannableStringBuilder.setSpan(new MsgBodySpan(type), 0, i, 33);
    }
}
