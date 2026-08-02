package ru.ozon.app.android.session.deleteAccount.data;

import Nk.a;
import Tc.d;
import android.os.Build;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\t\u001a\u00020\u00062\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountRepository;", "", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApi;", "api", "<init>", "(Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApi;)V", "", "toComposerAction", "(Ljava/lang/String;)Ljava/lang/String;", "actionName", "Lio/reactivex/y;", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountStartResponse;", "deleteAccountStartRequest", "(Ljava/lang/String;)Lio/reactivex/y;", "Lkotlin/Pair;", "data", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse;", "deleteAccountRequest", "(Ljava/lang/String;Lkotlin/Pair;)Lio/reactivex/y;", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApi;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteAccountRepository {

    @NotNull
    private final DeleteAccountApi api;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountRepository$Companion;", "", "<init>", "()V", "BASE_ACTION_URL", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DeleteAccountRepository(@NotNull DeleteAccountApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ y deleteAccountRequest$default(DeleteAccountRepository deleteAccountRepository, String str, Pair pair, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pair = null;
        }
        return deleteAccountRepository.deleteAccountRequest(str, pair);
    }

    private final String toComposerAction(String str) {
        return a.b("composer-api.bx/_action/", str);
    }

    @NotNull
    public final y<DeleteAccountApiResponse> deleteAccountRequest(@NotNull String actionName, Pair<String, String> data) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        DeleteAccountApi deleteAccountApi = this.api;
        String composerAction = toComposerAction(actionName);
        d builder = new d();
        if (data != null) {
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        builder.put("model", MODEL);
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        return deleteAccountApi.deleteAccountRequest(composerAction, builder.u());
    }

    @NotNull
    public final y<DeleteAccountStartResponse> deleteAccountStartRequest(@NotNull String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        return this.api.deleteAccountStartRequest(toComposerAction(actionName));
    }
}
