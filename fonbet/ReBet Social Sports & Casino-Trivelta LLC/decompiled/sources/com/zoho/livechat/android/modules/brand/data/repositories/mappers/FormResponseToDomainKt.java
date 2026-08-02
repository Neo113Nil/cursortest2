package com.zoho.livechat.android.modules.brand.data.repositories.mappers;

import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.reflect.TypeToken;
import com.zoho.livechat.android.modules.brand.data.remote.entities.FormResponse;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC5895g;

/* loaded from: classes4.dex */
public abstract class FormResponseToDomainKt {
    public static final Form a(FormResponse formResponse, Gson gson, boolean z10) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        List list = null;
        if (formResponse == null || (formResponse.getFormType() == null && formResponse.getMessages() == null)) {
            return null;
        }
        String displayName = formResponse.getDisplayName();
        h fieldsPrefillType = formResponse.getFieldsPrefillType();
        Form.FieldsPrefillType fieldsPrefillType2 = fieldsPrefillType != null ? (Form.FieldsPrefillType) AbstractC5895g.a(gson, fieldsPrefillType, Form.FieldsPrefillType.class) : null;
        Form.Type type = z10 ? Form.Type.Traditional : (Form.Type) AbstractC5895g.b(gson, formResponse.getFormType(), Form.Type.class);
        List<FormResponse.Message> messages = formResponse.getMessages();
        if (messages != null) {
            String v10 = gson.v(messages);
            Type type2 = new TypeToken<List<? extends Form.Message>>() { // from class: com.zoho.livechat.android.modules.brand.data.repositories.mappers.FormResponseToDomainKt$toDomainEntity$2$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            list = (List) AbstractC5895g.c(gson, v10, type2);
        }
        return new Form(displayName, fieldsPrefillType2, type, list, formResponse.getTitle());
    }
}
