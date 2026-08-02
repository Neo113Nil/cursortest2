package ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ShareLinkBloggerActionHandler$handlersInhibitor$2 extends C7735q implements Function0<HandlersInhibitor> {
    public static final ShareLinkBloggerActionHandler$handlersInhibitor$2 INSTANCE = new ShareLinkBloggerActionHandler$handlersInhibitor$2();

    ShareLinkBloggerActionHandler$handlersInhibitor$2() {
        super(0, HandlersInhibitor.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HandlersInhibitor invoke() {
        return new HandlersInhibitor();
    }
}
