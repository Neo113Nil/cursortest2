package ru.ozon.android.messenger.framework.data.remote.action;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f87657a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.m f87658b;

    public B(@NotNull String apiUrl, @NotNull ru.ozon.android.messenger.framework.data.m errorLogger) {
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
        this.f87657a = apiUrl;
        this.f87658b = errorLogger;
    }

    public static final String a(B b11, String endPoint) {
        b11.getClass();
        Intrinsics.checkNotNullParameter(endPoint, "endpoint");
        Uri.Builder buildUpon = Uri.parse(b11.f87657a).buildUpon();
        Intrinsics.checkNotNullExpressionValue(buildUpon, "buildUpon(...)");
        Intrinsics.checkNotNullParameter(buildUpon, "<this>");
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Uri parse = Uri.parse(endPoint);
        List<String> pathSegments = parse.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        Iterator<T> it = pathSegments.iterator();
        while (it.hasNext()) {
            buildUpon.appendPath((String) it.next());
        }
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            List<String> queryParameters = parse.getQueryParameters(str);
            Intrinsics.checkNotNullExpressionValue(queryParameters, "getQueryParameters(...)");
            Iterator<T> it2 = queryParameters.iterator();
            while (it2.hasNext()) {
                buildUpon.appendQueryParameter(str, (String) it2.next());
            }
        }
        String fragment = parse.getFragment();
        if (fragment != null) {
            buildUpon.fragment(fragment);
        }
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return builder;
    }
}
