package ru.ozon.app.android.commonwidgets.widgets.curtain;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DeepLinkProcessor$processDeepLink$isStoryLink$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ Uri $deeplink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeepLinkProcessor$processDeepLink$isStoryLink$2(Uri uri) {
        super(0);
        this.$deeplink = uri;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if ((!kotlin.text.h.K(r0)) == true) goto L12;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke() {
        boolean z11 = (Intrinsics.d(this.$deeplink.getAuthority(), "story") || Intrinsics.d(this.$deeplink.getAuthority(), "story_redesign")) && (r0 = this.$deeplink.getQueryParameter("story")) != null;
        return Boolean.valueOf(z11);
    }
}
