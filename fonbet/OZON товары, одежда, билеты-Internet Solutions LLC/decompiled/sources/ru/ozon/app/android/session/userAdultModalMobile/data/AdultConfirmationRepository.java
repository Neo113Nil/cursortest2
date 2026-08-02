package ru.ozon.app.android.session.userAdultModalMobile.data;

import Bc.r;
import Fn.C3055d;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.BirthdayActionRequest;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.SetAdultConfirmationRequest;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.SetBirthdayResponse;
import ru.ozon.app.android.session.userAdultModalMobile.domain.ComposerActionsExecutor;
import vc.j;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/data/AdultConfirmationRepository;", "", "Lru/ozon/app/android/session/userAdultModalMobile/domain/ComposerActionsExecutor;", "api", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "serializer", "<init>", "(Lru/ozon/app/android/session/userAdultModalMobile/domain/ComposerActionsExecutor;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/network/serialize/JsonSerializer;)V", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/BirthdayActionRequest;", "request", "", "extractBody", "(Lru/ozon/app/android/session/userAdultModalMobile/data/models/BirthdayActionRequest;)Ljava/lang/String;", "actionRequest", "Lio/reactivex/y;", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/SetBirthdayResponse;", "setBirthday", "(Lru/ozon/app/android/session/userAdultModalMobile/data/models/BirthdayActionRequest;)Lio/reactivex/y;", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/SetAdultConfirmationRequest;", "Lio/reactivex/b;", "setAdultConfirmation", "(Lru/ozon/app/android/session/userAdultModalMobile/data/models/SetAdultConfirmationRequest;)Lio/reactivex/b;", "Lru/ozon/app/android/session/userAdultModalMobile/domain/ComposerActionsExecutor;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdultConfirmationRepository {

    @NotNull
    private final ComposerActionsExecutor api;

    @NotNull
    private final JsonParser deserializer;

    @NotNull
    private final JsonSerializer serializer;

    public AdultConfirmationRepository(@NotNull ComposerActionsExecutor api, @NotNull JsonParser deserializer, @NotNull JsonSerializer serializer) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.api = api;
        this.deserializer = deserializer;
        this.serializer = serializer;
    }

    private final String extractBody(BirthdayActionRequest request) {
        LinkedHashMap u11 = U.u(request.getAdditionalParams());
        u11.put("birthdate", request.getBirthday());
        return this.serializer.toJson((JsonSerializer) u11, (Class<JsonSerializer>) Map.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetBirthdayResponse setBirthday$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (SetBirthdayResponse) function1.invoke(p02);
    }

    @NotNull
    public final AbstractC7094b setAdultConfirmation(@NotNull SetAdultConfirmationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        y<String> callPost = this.api.callPost(request.getActionName(), "");
        callPost.getClass();
        j jVar = new j(callPost);
        Intrinsics.checkNotNullExpressionValue(jVar, "ignoreElement(...)");
        return jVar;
    }

    @NotNull
    public final y<SetBirthdayResponse> setBirthday(@NotNull BirthdayActionRequest actionRequest) {
        Intrinsics.checkNotNullParameter(actionRequest, "actionRequest");
        y<String> callPost = this.api.callPost(actionRequest.getActionName(), extractBody(actionRequest));
        C3055d c3055d = new C3055d(new AdultConfirmationRepository$setBirthday$1(this), 3);
        callPost.getClass();
        r rVar = new r(callPost, c3055d);
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
