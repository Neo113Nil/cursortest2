package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.core;

import Lm0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.ErrorResponse;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.PostMessageDTO;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.PostMessageResponse;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.SuccessfulResponse;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.UndefinedResponse;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/core/PostMessageParser;", "", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "parseMessage", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/PostMessageResponse;", "postMessage", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PostMessageParser {

    @NotNull
    private final JsonParser jsonDeserializer;

    public PostMessageParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    @NotNull
    public final PostMessageResponse parseMessage(@NotNull String postMessage) {
        PostMessageDTO postMessageDTO;
        Intrinsics.checkNotNullParameter(postMessage, "postMessage");
        try {
            postMessageDTO = (PostMessageDTO) this.jsonDeserializer.fromJson(postMessage, PostMessageDTO.class);
        } catch (Exception e11) {
            a.f17149a.e(e11);
        }
        if (Intrinsics.d(postMessageDTO.isExpired(), Boolean.TRUE)) {
            return ErrorResponse.INSTANCE;
        }
        if (postMessageDTO.getToken() != null) {
            return new SuccessfulResponse(postMessageDTO.getToken());
        }
        return UndefinedResponse.INSTANCE;
    }
}
