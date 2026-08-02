package ru.ozon.app.android.session.userAdultModalMobile.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.SetBirthdayResponse;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/SetBirthdayResponse;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/String;)Lru/ozon/app/android/session/userAdultModalMobile/data/models/SetBirthdayResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AdultConfirmationRepository$setBirthday$1 extends AbstractC7737t implements Function1<String, SetBirthdayResponse> {
    final /* synthetic */ AdultConfirmationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdultConfirmationRepository$setBirthday$1(AdultConfirmationRepository adultConfirmationRepository) {
        super(1);
        this.this$0 = adultConfirmationRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SetBirthdayResponse invoke(String it) {
        JsonParser jsonParser;
        Intrinsics.checkNotNullParameter(it, "it");
        jsonParser = this.this$0.deserializer;
        return (SetBirthdayResponse) jsonParser.fromJson(it, SetBirthdayResponse.class);
    }
}
