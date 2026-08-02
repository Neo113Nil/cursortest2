package com.zoho.livechat.android.modules.messages.domain.entities;

import Vf.b;
import android.text.SpannableStringBuilder;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.L;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpannableStringBuilder a(Message message, float f10) {
        String z10;
        Message.Meta.DisplayCard displayCard;
        Intrinsics.checkNotNullParameter(message, "<this>");
        String content = message.getContent();
        String str = null;
        if (content == null || content.length() == 0) {
            content = null;
        }
        if (content == null && (content = message.getComment()) == null) {
            Message.Attachment attachment = message.getAttachment();
            content = attachment != null ? attachment.getFileName() : null;
            if (content == null) {
                Message.Meta meta = message.getMeta();
                if (meta != null && (displayCard = meta.getDisplayCard()) != null) {
                    str = displayCard.getDescription();
                }
                z10 = L.z(str);
                if (z10 != null) {
                    return new SpannableStringBuilder("");
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z10);
                List<Message.c> markdowns = message.getMarkdowns();
                if (markdowns != null && markdowns.contains(Message.c.Emojis)) {
                    b.i().e(spannableStringBuilder, Float.valueOf(f10));
                }
                return spannableStringBuilder;
            }
        }
        str = content;
        z10 = L.z(str);
        if (z10 != null) {
        }
    }
}
