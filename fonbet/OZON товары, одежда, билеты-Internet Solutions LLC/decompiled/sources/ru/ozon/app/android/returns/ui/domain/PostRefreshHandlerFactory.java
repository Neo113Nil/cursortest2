package ru.ozon.app.android.returns.ui.domain;

import A00.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R.\u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00120\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function1;", "LA00/a;", "", "refreshEvents", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "create", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "", "refreshParamsMapper", "Lkotlin/jvm/functions/Function1;", "Companion", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostRefreshHandlerFactory {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final Function1<AtomAction, Map<String, Object>> refreshParamsMapper;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory$Companion;", "", "<init>", "()V", "ACTION_POST_REFRESH_BODY", "", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PostRefreshHandlerFactory(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.refreshParamsMapper = new PostRefreshHandlerFactory$refreshParamsMapper$1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneTimePostRefreshHandler create$default(PostRefreshHandlerFactory postRefreshHandlerFactory, ComposerReferences composerReferences, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = PostRefreshHandlerFactory$create$1.INSTANCE;
        }
        return postRefreshHandlerFactory.create(composerReferences, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object create$lambda$0$suspendConversion0(Function1 function1, a aVar, d dVar) {
        function1.invoke(aVar);
        return Unit.f71690a;
    }

    @NotNull
    public final OneTimePostRefreshHandler create(@NotNull ComposerReferences refs, @NotNull Function1<? super a, Unit> refreshEvents) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(refreshEvents, "refreshEvents");
        OneTimePostRefreshHandler oneTimePostRefreshHandler = new OneTimePostRefreshHandler(this.jsonDeserializer, refs);
        oneTimePostRefreshHandler.setParamsMapper(this.refreshParamsMapper);
        oneTimePostRefreshHandler.setOnRefreshEvents(new PostRefreshHandlerFactory$sam$kotlinx_coroutines_flow_FlowCollector$0(new PostRefreshHandlerFactory$create$2$1(refreshEvents)));
        return oneTimePostRefreshHandler;
    }
}
