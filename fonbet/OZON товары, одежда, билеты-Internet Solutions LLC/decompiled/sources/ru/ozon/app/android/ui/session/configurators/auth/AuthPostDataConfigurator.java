package ru.ozon.app.android.ui.session.configurators.auth;

import A00.a;
import L00.i;
import QZ.g;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import i10.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.domain.session.storage.AuthOriginStorage;
import ru.ozon.app.android.ui.session.routing.PostDataDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\n*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ui/session/configurators/auth/AuthPostDataConfigurator;", "LQZ/g;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/domain/session/storage/AuthOriginStorage;", "authOriginStorage", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/domain/session/storage/AuthOriginStorage;)V", "Landroid/net/Uri;", "", SearchIntents.EXTRA_QUERY, "removePostParamQuery", "(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;", "Li10/h;", "state", "LA00/a;", "trigger", "interceptState", "(Li10/h;LA00/a;)Li10/h;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/domain/session/storage/AuthOriginStorage;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthPostDataConfigurator implements g {

    @NotNull
    private final AuthOriginStorage authOriginStorage;

    @NotNull
    private final JsonParser jsonDeserializer;

    public AuthPostDataConfigurator(@NotNull JsonParser jsonDeserializer, @NotNull AuthOriginStorage authOriginStorage) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(authOriginStorage, "authOriginStorage");
        this.jsonDeserializer = jsonDeserializer;
        this.authOriginStorage = authOriginStorage;
    }

    private final String removePostParamQuery(Uri uri, String str) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        Intrinsics.f(queryParameterNames);
        for (String str2 : queryParameterNames) {
            if (!Intrinsics.d(str2, str)) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        String uri2 = clearQuery.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return uri2;
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h hVar, @NotNull L00.g gVar, @NotNull i iVar) {
        g.a.a(hVar, gVar, iVar);
        return gVar;
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h state, @NotNull a trigger) {
        String c11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        h.c d11 = state.d();
        h.c.a aVar = d11 instanceof h.c.a ? (h.c.a) d11 : null;
        if (aVar != null && (c11 = aVar.c()) != null) {
            Uri parse = Uri.parse(c11);
            String queryParameter = parse.getQueryParameter("_INTERNAL_POST_DATA_PARAM");
            this.authOriginStorage.push(parse.getQueryParameter("origin"));
            if (queryParameter != null && (!kotlin.text.h.K(queryParameter))) {
                state.e().putAll(((PostDataDTO) this.jsonDeserializer.fromJson(queryParameter, PostDataDTO.class)).getParams());
                return h.a(state, h.c.a.b(aVar, null, null, removePostParamQuery(parse, "_INTERNAL_POST_DATA_PARAM"), 11), i10.g.POST, null, null, null, 60);
            }
        }
        return state;
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }
}
