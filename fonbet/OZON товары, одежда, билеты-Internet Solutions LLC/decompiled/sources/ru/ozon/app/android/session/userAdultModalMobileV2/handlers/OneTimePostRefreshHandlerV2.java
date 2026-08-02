package ru.ozon.app.android.session.userAdultModalMobileV2.handlers;

import Sc.InterfaceC4008j;
import Sc.k;
import i10.h;
import i10.l;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R.\u0010\u001c\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/handlers/OneTimePostRefreshHandlerV2;", "", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "jsonString", "", "parseToMap", "(Ljava/lang/String;)Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;Ll10/b;)Z", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Ljava/lang/reflect/ParameterizedType;", "type$delegate", "LSc/j;", "getType", "()Ljava/lang/reflect/ParameterizedType;", "type", "Lkotlin/Function1;", "paramsMapper", "Lkotlin/jvm/functions/Function1;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OneTimePostRefreshHandlerV2 {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final Function1<AtomAction, Map<String, Object>> paramsMapper;

    /* renamed from: type$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j type;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/handlers/OneTimePostRefreshHandlerV2$Companion;", "", "<init>", "()V", "ACTION_POST_REFRESH", "", "ACTION_POST_REFRESH_BODY", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OneTimePostRefreshHandlerV2(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.type = k.b(OneTimePostRefreshHandlerV2$type$2.INSTANCE);
        this.paramsMapper = new OneTimePostRefreshHandlerV2$paramsMapper$1(this);
    }

    private final ParameterizedType getType() {
        return (ParameterizedType) this.type.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> parseToMap(String jsonString) {
        if (jsonString != null && !h.K(jsonString)) {
            try {
                return (Map) this.jsonDeserializer.fromJson(jsonString, getType());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean handle(@NotNull AtomAction action, @NotNull InterfaceC7851b controller) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (!(action instanceof AtomAction.Click)) {
            return false;
        }
        AtomAction.Click click = (AtomAction.Click) action;
        if (!Intrinsics.d(click.getId(), "postRefresh")) {
            return false;
        }
        InterfaceC7851b.a.a(controller, click.getLink(), this.paramsMapper.invoke(action), null, new h.b(null, new l.a.b(0L, null, 3), 1), 4);
        return true;
    }
}
