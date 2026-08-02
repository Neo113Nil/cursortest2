package Re;

import com.zoho.livechat.android.modules.common.domain.entities.Form;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10212a;

    public d(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10212a = conversationsRepository;
    }

    public final C5582a a(Form.Message.Meta.InputCard.a fieldType) {
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        return this.f10212a.j(fieldType);
    }
}
