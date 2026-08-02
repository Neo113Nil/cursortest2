package ru.ozon.app.android.delivery.customActionsHandlers;

import A00.a;
import Ae.InterfaceC2397i;
import H3.c;
import androidx.lifecycle.K;
import com.squareup.moshi.j;
import i10.h;
import i10.l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u001d\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR<\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "", "", "paramsMapper", "Lkotlin/jvm/functions/Function1;", "getParamsMapper", "()Lkotlin/jvm/functions/Function1;", "setParamsMapper", "(Lkotlin/jvm/functions/Function1;)V", "LAe/i;", "LA00/a;", "onRefreshEvents", "LAe/i;", "getOnRefreshEvents", "()LAe/i;", "setOnRefreshEvents", "(LAe/i;)V", "Companion", "ResponseBody", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OneTimePostRefreshHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private InterfaceC2397i<? super a> onRefreshEvents;

    @NotNull
    private Function1<? super AtomAction, ? extends Map<String, ? extends Object>> paramsMapper;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler$Companion;", "", "<init>", "()V", "ACTION_POST_REFRESH", "", "ACTION_POST_REFRESH_BODY", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\nJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler$ResponseBody;", "", "items", "", "", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "toMap", "", "", "component1", "copy", "equals", "", "other", "hashCode", "toString", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResponseBody {

        @NotNull
        private final List<Integer> items;

        public ResponseBody(@NotNull List<Integer> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ResponseBody copy$default(ResponseBody responseBody, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = responseBody.items;
            }
            return responseBody.copy(list);
        }

        @NotNull
        public final List<Integer> component1() {
            return this.items;
        }

        @NotNull
        public final ResponseBody copy(@NotNull List<Integer> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new ResponseBody(items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResponseBody) && Intrinsics.d(this.items, ((ResponseBody) other).items);
        }

        @NotNull
        public final List<Integer> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        @NotNull
        public final Map<String, List<Integer>> toMap() {
            return U.i(new Pair("items", this.items));
        }

        @NotNull
        public String toString() {
            return c.a("ResponseBody(items=", ")", this.items);
        }
    }

    public OneTimePostRefreshHandler(@NotNull JsonParser jsonDeserializer, @NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.jsonDeserializer = jsonDeserializer;
        this.refs = refs;
        this.paramsMapper = new OneTimePostRefreshHandler$paramsMapper$1(this);
        this.onRefreshEvents = new InterfaceC2397i() { // from class: ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler$onRefreshEvents$1
            public final Object emit(a aVar, d<? super Unit> dVar) {
                return Unit.f71690a;
            }

            @Override // Ae.InterfaceC2397i
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
                return emit((a) obj, (d<? super Unit>) dVar);
            }
        };
    }

    @NotNull
    public final InterfaceC2397i<a> getOnRefreshEvents() {
        return this.onRefreshEvents;
    }

    public final boolean handle(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.Click)) {
            return false;
        }
        AtomAction.Click click = (AtomAction.Click) action;
        if (!Intrinsics.d(click.getId(), "postRefresh")) {
            return false;
        }
        InterfaceC7851b.a.a(this.refs.getController(), click.getLink(), this.paramsMapper.invoke(action), null, new h.b(null, new l.a.b(0L, null, 3), 1), 4);
        C10727i.c(K.a(this.refs.getContainer().g()), null, null, new OneTimePostRefreshHandler$handle$1(this, null), 3);
        return true;
    }

    public final void setOnRefreshEvents(@NotNull InterfaceC2397i<? super a> interfaceC2397i) {
        Intrinsics.checkNotNullParameter(interfaceC2397i, "<set-?>");
        this.onRefreshEvents = interfaceC2397i;
    }

    public final void setParamsMapper(@NotNull Function1<? super AtomAction, ? extends Map<String, ? extends Object>> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.paramsMapper = function1;
    }
}
