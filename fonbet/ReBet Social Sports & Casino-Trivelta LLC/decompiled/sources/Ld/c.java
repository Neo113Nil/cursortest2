package Ld;

import com.google.gson.Gson;
import com.zoho.livechat.android.modules.brand.data.local.entities.FormEntity;
import com.zoho.livechat.android.modules.brand.data.remote.entities.FormResponse;
import he.AbstractC4505a;
import ie.EnumC4544a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c {
    public static final FormEntity a(FormResponse formResponse, Gson gson, EnumC4544a appStatus) {
        Intrinsics.checkNotNullParameter(formResponse, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        String a10 = AbstractC4505a.a(appStatus);
        String displayName = formResponse.getDisplayName();
        String u10 = gson.u(formResponse.getFieldsPrefillType());
        String formType = formResponse.getFormType();
        List<FormResponse.Message> messages = formResponse.getMessages();
        return new FormEntity(a10, displayName, u10, formType, messages != null ? gson.v(messages) : null, formResponse.getTitle());
    }
}
