package com.zoho.livechat.android.modules.brand.data.repositories.mappers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zoho.livechat.android.modules.brand.data.local.entities.FormEntity;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import he.AbstractC4505a;
import ie.EnumC4544a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC5895g;

/* loaded from: classes4.dex */
public abstract class FormRoomToDomainKt {
    public static final Form a(FormEntity formEntity, Gson gson) {
        Intrinsics.checkNotNullParameter(formEntity, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        String displayName = formEntity.getDisplayName();
        String fieldsPrefillType = formEntity.getFieldsPrefillType();
        List list = null;
        Form.FieldsPrefillType fieldsPrefillType2 = fieldsPrefillType != null ? (Form.FieldsPrefillType) AbstractC5895g.b(gson, fieldsPrefillType, Form.FieldsPrefillType.class) : null;
        Form.Type type = (Intrinsics.areEqual(formEntity.getBrandStatusType(), AbstractC4505a.a(EnumC4544a.CallOnline)) || Intrinsics.areEqual(formEntity.getBrandStatusType(), AbstractC4505a.a(EnumC4544a.CallOffline))) ? Form.Type.Traditional : (Form.Type) AbstractC5895g.b(gson, formEntity.getFormType(), Form.Type.class);
        String messages = formEntity.getMessages();
        if (messages != null) {
            Type type2 = new TypeToken<List<? extends Form.Message>>() { // from class: com.zoho.livechat.android.modules.brand.data.repositories.mappers.FormRoomToDomainKt$toDomainEntity$2$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            list = (List) AbstractC5895g.c(gson, messages, type2);
        }
        return new Form(displayName, fieldsPrefillType2, type, list, formEntity.getTitle());
    }
}
