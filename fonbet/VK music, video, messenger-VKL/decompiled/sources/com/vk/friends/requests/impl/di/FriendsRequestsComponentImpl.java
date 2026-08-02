package com.vk.friends.requests.impl.di;

import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.dto.common.id.UserId;
import com.vk.friends.requests.api.di.FriendsRequestsComponent;
import com.vk.friends.requests.api.di.ScreenType;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.notifications.di.NotificationsComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.di.StoriesComponent;
import io.reactivex.rxjava3.disposables.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ams;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.kss;
import xsna.mss;
import xsna.nss;
import xsna.nwy;
import xsna.oss;
import xsna.qcy;
import xsna.qss;
import xsna.rfz;
import xsna.t61;

/* compiled from: FriendsRequestsComponentImpl.kt */
/* loaded from: classes16.dex */
public final class FriendsRequestsComponentImpl implements FriendsRequestsComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final StoriesComponent a;
    public final NotificationsComponent b;
    public final BridgeComponent c;
    public final ImBridgeComponent d;
    public final NewsFeedBridgeComponent e;
    public final nwy f = new nwy(new t61(24));

    /* compiled from: FriendsRequestsComponentImpl.kt */
    public static final class a implements b7m<FriendsRequestsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new FriendsRequestsComponentImpl((StoriesComponent) e7mVar.a(fpf0.a(StoriesComponent.class)), (NotificationsComponent) e7mVar.a(fpf0.a(NotificationsComponent.class)), (BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)), (ImBridgeComponent) e7mVar.a(fpf0.a(ImBridgeComponent.class)), (NewsFeedBridgeComponent) e7mVar.a(fpf0.a(NewsFeedBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FriendsRequestsComponentImpl.class, "router", "getRouter()Lcom/vk/friends/requests/api/domain/FriendsRequestsRouter;", 0);
        fpf0.a.getClass();
        g = new qcy[]{propertyReference1Impl};
    }

    public FriendsRequestsComponentImpl(StoriesComponent storiesComponent, NotificationsComponent notificationsComponent, BridgeComponent bridgeComponent, ImBridgeComponent imBridgeComponent, NewsFeedBridgeComponent newsFeedBridgeComponent) {
        this.a = storiesComponent;
        this.b = notificationsComponent;
        this.c = bridgeComponent;
        this.d = imBridgeComponent;
        this.e = newsFeedBridgeComponent;
    }

    @Override // com.vk.friends.requests.api.di.FriendsRequestsComponent
    public final qss a() {
        qcy<Object> qcyVar = g[0];
        return (qss) this.f.c();
    }

    @Override // com.vk.friends.requests.api.di.FriendsRequestsComponent
    public final oss j9(nss nssVar, rfz rfzVar, kss kssVar, Context context, b bVar, UserId userId, ScreenType screenType) {
        String str = nssVar.a;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = nssVar.b;
        mss.b bVar2 = new mss.b(this.b.b(), this.a.r2());
        BridgeComponent bridgeComponent = this.c;
        return new oss(str, new mss(str, mobileOfficialAppsCoreNavStat$EventScreen, nssVar.d, rfzVar, kssVar, new mss.a(bridgeComponent.F(), bridgeComponent.id(), this.d.g5(), this.e.Ad(), ams.a()), bVar2, context, bVar), nssVar.c, userId == null ? bridgeComponent.s().c() : userId, screenType);
    }
}
