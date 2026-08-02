package com.unity3d.services.ads.offerwall;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4259pg;
import com.unity3d.services.core.log.DeviceLog;
import defpackage.aeh;
import defpackage.b1d;
import defpackage.beh;
import defpackage.bnd;
import defpackage.ku3;
import defpackage.un0;
import defpackage.xdh;
import defpackage.xw3;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R4\u0010'\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "", "Lku3;", "scope", "<init>", "(Lku3;)V", "Ljava/lang/reflect/InvocationHandler;", "tapjoyPlacementListener", "()Ljava/lang/reflect/InvocationHandler;", "placementObj", "", "getPlacementName", "(Ljava/lang/Object;)Ljava/lang/String;", "placementName", "getPlacement", "(Ljava/lang/String;)Ljava/lang/Object;", C4259pg.b, "()Ljava/lang/String;", "", "isConnected", "()Z", "isAdReady", "(Ljava/lang/String;)Z", "", "loadAd", "(Ljava/lang/String;)V", "showAd", "Lku3;", "Lb1d;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "_offerwallEventFlow", "Lb1d;", "Lxdh;", "offerwallEventFlow", "Lxdh;", "getOfferwallEventFlow", "()Lxdh;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "placementsMap", "Ljava/util/HashMap;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OfferwallAdapterBridge {

    @NotNull
    private final b1d _offerwallEventFlow;

    @NotNull
    private final xdh offerwallEventFlow;

    @NotNull
    private final HashMap<String, Object> placementsMap;

    @NotNull
    private final ku3 scope;

    public OfferwallAdapterBridge(@NotNull ku3 ku3Var) {
        ku3Var.getClass();
        this.scope = ku3Var;
        aeh b = beh.b(0, 0, null, 7);
        this._offerwallEventFlow = b;
        this.offerwallEventFlow = un0.t(b);
        this.placementsMap = new HashMap<>();
    }

    private final Object getPlacement(String placementName) {
        return Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getPlacement", String.class, Class.forName("com.tapjoy.TJPlacementListener")).invoke(null, placementName, Proxy.newProxyInstance(Class.forName("com.tapjoy.TJPlacementListener").getClassLoader(), new Class[]{Class.forName("com.tapjoy.TJPlacementListener")}, tapjoyPlacementListener()));
    }

    private final String getPlacementName(Object placementObj) {
        return (String) placementObj.getClass().getDeclaredMethod("getName", null).invoke(placementObj, null);
    }

    private final InvocationHandler tapjoyPlacementListener() {
        return new bnd(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Object tapjoyPlacementListener$lambda$0(OfferwallAdapterBridge offerwallAdapterBridge, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1508301783:
                    if (name.equals("onContentReady")) {
                        Object obj2 = objArr[0];
                        obj2.getClass();
                        String placementName = offerwallAdapterBridge.getPlacementName(obj2);
                        DeviceLog.debug("Placement content ready: " + placementName);
                        xw3.L(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$3(offerwallAdapterBridge, placementName, null), 3);
                        break;
                    }
                    break;
                case -1482787952:
                    if (name.equals("onContentDismiss")) {
                        Object obj3 = objArr[0];
                        obj3.getClass();
                        String placementName2 = offerwallAdapterBridge.getPlacementName(obj3);
                        DeviceLog.debug("Placement content dismissed: " + placementName2);
                        xw3.L(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(offerwallAdapterBridge, placementName2, null), 3);
                        return null;
                    }
                    break;
                case 89925559:
                    if (name.equals("onContentShow")) {
                        Object obj4 = objArr[0];
                        obj4.getClass();
                        String placementName3 = offerwallAdapterBridge.getPlacementName(obj4);
                        DeviceLog.debug("Placement content shown: " + placementName3);
                        xw3.L(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$4(offerwallAdapterBridge, placementName3, null), 3);
                        return null;
                    }
                    break;
                case 1356881459:
                    if (name.equals("onRequestSuccess")) {
                        Object obj5 = objArr[0];
                        obj5.getClass();
                        String placementName4 = offerwallAdapterBridge.getPlacementName(obj5);
                        Boolean bool = (Boolean) obj5.getClass().getDeclaredMethod("isContentAvailable", null).invoke(obj5, null);
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        DeviceLog.debug("Placement request succeeded: " + placementName4 + " - isContentAvailable: " + booleanValue);
                        xw3.L(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(booleanValue, offerwallAdapterBridge, placementName4, null), 3);
                        return null;
                    }
                    break;
                case 2137477050:
                    if (name.equals("onRequestFailure")) {
                        Object obj6 = objArr[0];
                        obj6.getClass();
                        String placementName5 = offerwallAdapterBridge.getPlacementName(obj6);
                        offerwallAdapterBridge.placementsMap.remove(placementName5 == null ? "" : placementName5);
                        Object obj7 = objArr[1];
                        DeviceLog.error("Placement request failed: " + placementName5 + " - errorCode: " + ((Integer) obj7.getClass().getField("code").get(obj7)) + ", errorMessage: " + ((String) obj7.getClass().getField(PglCryptUtils.KEY_MESSAGE).get(obj7)));
                        xw3.L(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$2(offerwallAdapterBridge, placementName5, null), 3);
                        return null;
                    }
                    break;
            }
        }
        return null;
    }

    @NotNull
    public final xdh getOfferwallEventFlow() {
        return this.offerwallEventFlow;
    }

    @NotNull
    public final String getVersion() {
        try {
            String str = (String) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod(C4259pg.b, null).invoke(null, null);
            return str == null ? "0.0.0" : str;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }

    public final boolean isAdReady(@NotNull String placementName) {
        placementName.getClass();
        Object placement = getPlacement(placementName);
        Method declaredMethod = placement != null ? placement.getClass().getDeclaredMethod("isContentReady", null) : null;
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(placement, null) : null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isConnected() {
        try {
            Boolean bool = (Boolean) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("isConnected", null).invoke(null, null);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void loadAd(@NotNull String placementName) {
        placementName.getClass();
        Object placement = getPlacement(placementName);
        this.placementsMap.put(placementName, placement);
        Method declaredMethod = placement != null ? placement.getClass().getDeclaredMethod("requestContent", null) : null;
        if (declaredMethod != null) {
            declaredMethod.invoke(placement, null);
        }
    }

    public final void showAd(@NotNull String placementName) {
        placementName.getClass();
        Object obj = this.placementsMap.get(placementName);
        Method declaredMethod = obj != null ? obj.getClass().getDeclaredMethod("isContentAvailable", null) : null;
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(obj, null) : null);
        if (bool != null ? bool.booleanValue() : false) {
            Method declaredMethod2 = obj != null ? obj.getClass().getDeclaredMethod("showContent", null) : null;
            if (declaredMethod2 != null) {
                declaredMethod2.invoke(obj, null);
            }
        } else {
            xw3.L(this.scope, null, null, new OfferwallAdapterBridge$showAd$1(this, placementName, null), 3);
        }
        this.placementsMap.remove(placementName);
    }
}
