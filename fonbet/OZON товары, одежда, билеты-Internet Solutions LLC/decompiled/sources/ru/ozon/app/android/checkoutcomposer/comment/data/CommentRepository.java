package ru.ozon.app.android.checkoutcomposer.comment.data;

import Bc.w;
import Mc.a;
import android.net.Uri;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/comment/data/CommentRepository;", "", "Lru/ozon/app/android/checkoutcomposer/comment/data/CommentApi;", "api", "<init>", "(Lru/ozon/app/android/checkoutcomposer/comment/data/CommentApi;)V", "", "action", "appendUrl", "(Ljava/lang/String;)Ljava/lang/String;", "actionName", "Lru/ozon/app/android/checkoutcomposer/comment/data/NewCommentBody;", "body", "Lio/reactivex/y;", "Lru/ozon/app/android/checkoutcomposer/comment/data/NewCommentResponse;", "sendComment", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/comment/data/NewCommentBody;)Lio/reactivex/y;", "Lru/ozon/app/android/checkoutcomposer/comment/data/CommentApi;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommentRepository {

    @NotNull
    private final CommentApi api;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/comment/data/CommentRepository$Companion;", "", "<init>", "()V", "COMPOSER_ACTION_API", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CommentRepository(@NotNull CommentApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    private final String appendUrl(String action) {
        String uri = Uri.parse("composer-api.bx/_action/").buildUpon().appendEncodedPath(action).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @NotNull
    public final y<NewCommentResponse> sendComment(@NotNull String actionName, @NotNull NewCommentBody body) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(body, "body");
        w j11 = this.api.sendComment(appendUrl(actionName), body).j(a.b());
        Intrinsics.checkNotNullExpressionValue(j11, "subscribeOn(...)");
        return j11;
    }
}
