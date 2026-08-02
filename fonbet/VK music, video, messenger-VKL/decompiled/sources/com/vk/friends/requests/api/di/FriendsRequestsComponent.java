package com.vk.friends.requests.api.di;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.disposables.b;
import xsna.kss;
import xsna.nss;
import xsna.oss;
import xsna.qa;
import xsna.qss;
import xsna.rfz;
import xsna.ris;

/* compiled from: FriendsRequestsComponent.kt */
/* loaded from: classes16.dex */
public interface FriendsRequestsComponent extends DiUnscopedComponent {
    static /* synthetic */ ris K5(FriendsRequestsComponent friendsRequestsComponent, nss nssVar, rfz rfzVar, qa qaVar, Context context, b bVar, UserId userId, ScreenType screenType, int i) {
        if ((i & 4) != 0) {
            qaVar = null;
        }
        if ((i & 32) != 0) {
            userId = null;
        }
        if ((i & 64) != 0) {
            screenType = ScreenType.ANY;
        }
        return friendsRequestsComponent.j9(nssVar, rfzVar, qaVar, context, bVar, userId, screenType);
    }

    qss a();

    oss j9(nss nssVar, rfz rfzVar, kss kssVar, Context context, b bVar, UserId userId, ScreenType screenType);
}
