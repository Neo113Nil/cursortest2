package ru.ozon.app.android.regulardraw.miniapp;

import EZ.e;
import EZ.g;
import PZ.a;
import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.miniapp.deeplinkhandler.RegularDrawDeeplinkScreenType;
import sZ.c;
import tZ.C9786a;
import tZ.C9788c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/regulardraw/miniapp/RegularDrawFragmentNavigator;", "LEZ/g;", "Landroidx/fragment/app/m;", "fragment", "<init>", "(Landroidx/fragment/app/m;)V", "", "", "extractQueryParams", "(Ljava/lang/String;)Ljava/util/Map;", "params", "appendQueryParams", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "LEZ/e;", "response", "", "requestCode", "", "navigate", "(LEZ/e;I)V", "regularDrawUriString", "Ljava/lang/String;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RegularDrawFragmentNavigator extends g {

    @NotNull
    private final String regularDrawUriString;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RegularDrawFragmentNavigator(@NotNull ComponentCallbacksC5392m fragment) {
        super(r0, r1, r2, fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        r requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Integer valueOf = Integer.valueOf(R$id.rootContainer);
        G childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        String uri = RegularDrawDeeplinkScreenType.INSTANCE.regularDrawUri().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.regularDrawUriString = uri;
    }

    private final String appendQueryParams(String str, Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    private final Map<String, String> extractQueryParams(String str) {
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        Set<String> set = queryParameterNames;
        int h11 = U.h(C7714v.z(set, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Object obj : set) {
            String queryParameter = parse.getQueryParameter((String) obj);
            if (queryParameter == null) {
                queryParameter = "";
            }
            linkedHashMap.put(obj, queryParameter);
        }
        return linkedHashMap;
    }

    @Override // EZ.g
    public void navigate(@NotNull e<?> response, int requestCode) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object b11 = response.b();
        if (b11 instanceof C9788c) {
            G.k k02 = getFragmentManager().k0(0);
            Intrinsics.checkNotNullExpressionValue(k02, "getBackStackEntryAt(...)");
            if (Intrinsics.d(k02.getName(), this.regularDrawUriString)) {
                getFragmentManager().R0(k02.getId(), 0);
                return;
            } else {
                next(response, requestCode);
                return;
            }
        }
        if (b11 instanceof OZ.e) {
            f a11 = ((OZ.e) b11).a();
            if (a11 != null) {
                g.redirect$default(this, response.e(a11), 0, 2, null);
                return;
            }
            return;
        }
        if (b11 instanceof C9786a) {
            if (getFragmentManager().l0() >= 1) {
                safeTransaction(new RegularDrawFragmentNavigator$navigate$2(this, response, requestCode));
                return;
            } else {
                next(response, requestCode);
                return;
            }
        }
        if (!(b11 instanceof c)) {
            super.navigate(response, requestCode);
            return;
        }
        c cVar = (c) b11;
        boolean z11 = !Intrinsics.d(cVar.getPath(), this.regularDrawUriString) && getFragmentManager().l0() < 1;
        Map<String, String> extractQueryParams = extractQueryParams(a.b(cVar.getTag(), false));
        if (z11) {
            super.navigate(EZ.f.a(new pZ.e(appendQueryParams(this.regularDrawUriString, extractQueryParams))), requestCode);
        }
        super.navigate(response, requestCode);
    }
}
