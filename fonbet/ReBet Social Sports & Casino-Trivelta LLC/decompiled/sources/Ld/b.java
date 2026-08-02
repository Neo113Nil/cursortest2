package Ld;

import com.google.gson.Gson;
import com.google.gson.h;
import com.zoho.livechat.android.modules.brand.data.remote.entities.FormResponse;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC5895g;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Form.Message a(FormResponse.Message message, Gson gson) {
        Intrinsics.checkNotNullParameter(message, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Form.Message.Companion companion = Form.Message.INSTANCE;
        String displayName = message.getDisplayName();
        h meta = message.getMeta();
        return companion.c(new Form.Message(displayName, meta != null ? (Form.Message.Meta) AbstractC5895g.a(gson, meta, Form.Message.Meta.class) : null, message.getText(), message.getMessageTime()));
    }
}
