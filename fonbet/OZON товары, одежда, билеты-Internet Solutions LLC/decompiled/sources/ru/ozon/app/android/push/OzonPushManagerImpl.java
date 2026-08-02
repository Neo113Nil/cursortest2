package ru.ozon.app.android.push;

import Yg0.a;
import Yg0.g;
import bh0.InterfaceC5665a;
import eh0.b;
import eh0.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jh0.C7429a;
import jh0.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0014\b\u0001\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J!\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/push/OzonPushManagerImpl;", "Lru/ozon/app/android/push/OzonPushManager;", "LYg0/a;", "ozonPush", "LIb/a;", "", "Leh0/b;", "postShowingPushNotificationHandlers", "Leh0/d;", "preShowingPushNotificationHandlers", "LYg0/g;", "teensModeProvider", "<init>", "(LYg0/a;LIb/a;LIb/a;LIb/a;)V", "", "init", "()V", "onLogin", "onNotificationStateChanged", "onLogout", "", "Lkotlin/Pair;", "", "getPushTokens", "()Ljava/util/List;", "Lbh0/a;", "getLiveActivityInteractor", "()Lbh0/a;", "LYg0/a;", "LIb/a;", "push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonPushManagerImpl implements OzonPushManager {

    @NotNull
    private final a ozonPush;

    @NotNull
    private final Ib.a<Set<b>> postShowingPushNotificationHandlers;

    @NotNull
    private final Ib.a<Set<d>> preShowingPushNotificationHandlers;

    @NotNull
    private final Ib.a<g> teensModeProvider;

    public OzonPushManagerImpl(@NotNull a ozonPush, @NotNull Ib.a<Set<b>> postShowingPushNotificationHandlers, @NotNull Ib.a<Set<d>> preShowingPushNotificationHandlers, @NotNull Ib.a<g> teensModeProvider) {
        Intrinsics.checkNotNullParameter(ozonPush, "ozonPush");
        Intrinsics.checkNotNullParameter(postShowingPushNotificationHandlers, "postShowingPushNotificationHandlers");
        Intrinsics.checkNotNullParameter(preShowingPushNotificationHandlers, "preShowingPushNotificationHandlers");
        Intrinsics.checkNotNullParameter(teensModeProvider, "teensModeProvider");
        this.ozonPush = ozonPush;
        this.postShowingPushNotificationHandlers = postShowingPushNotificationHandlers;
        this.preShowingPushNotificationHandlers = preShowingPushNotificationHandlers;
        this.teensModeProvider = teensModeProvider;
    }

    @Override // ru.ozon.app.android.push.OzonPushManager
    @NotNull
    public InterfaceC5665a getLiveActivityInteractor() {
        return this.ozonPush;
    }

    @Override // ru.ozon.app.android.push.OzonPushManager
    @NotNull
    public List<Pair<String, String>> getPushTokens() {
        List<C7429a> x11 = this.ozonPush.x();
        ArrayList arrayList = new ArrayList(C7714v.z(x11, 10));
        for (C7429a c7429a : x11) {
            arrayList.add(new Pair(c7429a.b().getValue(), c7429a.a()));
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.push.OzonPushManager
    public void init() {
        a aVar = this.ozonPush;
        Set<d> set = this.preShowingPushNotificationHandlers.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        Set<b> set2 = this.postShowingPushNotificationHandlers.get();
        Intrinsics.checkNotNullExpressionValue(set2, "get(...)");
        a.z(aVar, set, set2);
        a aVar2 = this.ozonPush;
        g gVar = this.teensModeProvider.get();
        Intrinsics.checkNotNullExpressionValue(gVar, "get(...)");
        aVar2.A(gVar);
    }

    @Override // ru.ozon.app.android.push.OzonPushManager
    public void onLogin() {
        a aVar = this.ozonPush;
        aVar.getClass();
        aVar.B(c.LOGIN, true);
    }

    @Override // ru.ozon.app.android.push.OzonPushManager
    public void onLogout() {
        a aVar = this.ozonPush;
        aVar.getClass();
        aVar.B(c.LOGOUT, true);
    }

    @Override // ru.ozon.app.android.push.OzonPushManager
    public void onNotificationStateChanged() {
        a aVar = this.ozonPush;
        aVar.getClass();
        aVar.B(c.NOTIFICATIONS_STATE_CHANGED, true);
    }
}
