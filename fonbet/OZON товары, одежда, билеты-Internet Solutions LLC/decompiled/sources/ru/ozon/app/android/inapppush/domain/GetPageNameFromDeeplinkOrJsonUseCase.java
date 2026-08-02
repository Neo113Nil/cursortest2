package ru.ozon.app.android.inapppush.domain;

import Ej.b;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¨\u0006\b"}, d2 = {"Lru/ozon/app/android/inapppush/domain/GetPageNameFromDeeplinkOrJsonUseCase;", "", "<init>", "()V", "invoke", "", ImagesContract.URL, "Companion", "in-app-push-host_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetPageNameFromDeeplinkOrJsonUseCase {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/inapppush/domain/GetPageNameFromDeeplinkOrJsonUseCase$Companion;", "", "<init>", "()V", "NESTED_PAGE", "", "PATH_DIVIDER", "in-app-push-host_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final String invoke(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri parse = Uri.parse(url);
            String authority = parse.getAuthority();
            if (authority == null) {
                return "nestedPage";
            }
            StringBuilder sb2 = new StringBuilder(authority);
            List<String> pathSegments = parse.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            for (String str : pathSegments) {
                sb2.append("/");
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        } catch (RuntimeException unused) {
            return b.a(url.hashCode(), "nestedPage");
        }
    }
}
