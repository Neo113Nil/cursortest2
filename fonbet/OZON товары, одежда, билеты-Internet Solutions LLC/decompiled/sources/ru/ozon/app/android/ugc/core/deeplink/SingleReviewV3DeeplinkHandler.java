package ru.ozon.app.android.ugc.core.deeplink;

import D40.d;
import GZ.j;
import HY.b;
import IZ.a;
import Kk.c;
import android.content.Context;
import android.os.Bundle;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.commentsList.CommentsListConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.ReviewSuccessConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode.StaticTeenModeConfigurator;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.StringExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/deeplink/SingleReviewV3DeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "lastSegment", "", "validateLastSegment", "(Ljava/lang/String;)Z", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleReviewV3DeeplinkHandler implements a {
    private final boolean validateLastSegment(String lastSegment) {
        return (Intrinsics.d(lastSegment, "list") || Intrinsics.d(lastSegment, "edit") || Intrinsics.d(lastSegment, "new") || Intrinsics.d(lastSegment, "photos")) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r0.equals(ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a3, code lost:
    
        if (D40.d.a(r14) != 3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00af, code lost:
    
        if (ru.ozon.app.android.utils.StringExtKt.isDigital((java.lang.String) HY.b.a(r14, 0, "get(...)")) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b5, code lost:
    
        if (Co.a.e(r14, 1, "review") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bd, code lost:
    
        if (Co.a.e(r14, 2, "new-test") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
    
        if (r14.b().getQueryParameterNames().contains("media_uuid") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        r14 = r14.b().getPathSegments();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, "getPathSegments(...)");
        r14 = kotlin.collections.C7714v.X(r14);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, "last(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e5, code lost:
    
        if (validateLastSegment((java.lang.String) r14) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        if (r0.equals("products") != false) goto L35;
     */
    @Override // IZ.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        String authority = route.b().getAuthority();
        if (authority != null) {
            int hashCode = authority.hashCode();
            if (hashCode != -1003761308) {
                if (hashCode == -865698022) {
                    if (authority.equals("travel") && d.a(route) == 5 && Co.a.e(route, 0, "hotels") && Co.a.e(route, 1, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) && StringExtKt.isDigital((String) b.a(route, 2, "get(...)")) && Kk.d.c(route, "getPathSegments(...)", 3, "review") && !route.b().getQueryParameterNames().contains("media_uuid")) {
                        List<String> pathSegments = route.b().getPathSegments();
                        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                        Object X9 = C7714v.X(pathSegments);
                        Intrinsics.checkNotNullExpressionValue(X9, "last(...)");
                        if (validateLastSegment((String) X9)) {
                            return true;
                        }
                    }
                    return false;
                }
                if (hashCode == -309474065) {
                }
            }
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        Object obj = route.e().get("activateCommentField");
        String str = null;
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        boolean z11 = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Object obj2 = route.e().get("withScrollToComment");
        Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        String c11 = c.c(route, "toString(...)");
        h.c.a aVar = new h.c.a(c11, str, str, 14);
        Class[] elements = {CommentsListConfigurator.class, ReviewConfigurator.class, ReviewSuccessConfigurator.class, StaticTeenModeConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ComposerScreenConfig composerScreenConfig = new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, C7705l.j0(elements), null, null, null, false, null, null, 16, false, false, null, null, 16246750, null);
        Pair pair = new Pair("activateCommentField", Boolean.valueOf(booleanValue));
        if (booleanValue2 && !booleanValue) {
            z11 = true;
        }
        Bundle b11 = androidx.core.os.d.b(pair, new Pair("withScrollToComment", Boolean.valueOf(z11)));
        if (!MiniAppExtKt.isExpress(context)) {
            return new sZ.c(c11, ComposerFragment.Companion.newInstance$default(ComposerFragment.INSTANCE, composerScreenConfig, null, b11, 2, null), 9001, false, false, null, false, false, false, 504, null);
        }
        ComposerFlowDestination composerFlowDestination = new ComposerFlowDestination(composerScreenConfig, c11, null, null, false, 28, null);
        Bundle arguments = composerFlowDestination.getRedirect().getFragment().getArguments();
        if (arguments != null) {
            arguments.putAll(b11);
        }
        return composerFlowDestination;
    }
}
