package com.unity3d.services.ads.offerwall;

import com.ironsource.C4553sg;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import xsna.baj0;
import xsna.caj0;
import xsna.jq;
import xsna.lyd;
import xsna.myc0;
import xsna.rsr;
import xsna.sh50;
import xsna.yvj;

/* compiled from: OfferwallAdapterBridge.kt */
/* loaded from: classes14.dex */
public final class OfferwallAdapterBridge {
    private final sh50<OfferwallEventData> _offerwallEventFlow;
    private final baj0<OfferwallEventData> offerwallEventFlow;
    private final HashMap<String, Object> placementsMap;
    private final yvj scope;

    public OfferwallAdapterBridge(yvj yvjVar) {
        this.scope = yvjVar;
        caj0 b = lyd.b(0, 0, null, 7);
        this._offerwallEventFlow = b;
        this.offerwallEventFlow = rsr.e(b);
        this.placementsMap = new HashMap<>();
    }

    private final Object getPlacement(String str) {
        return Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getPlacement", String.class, Class.forName("com.tapjoy.TJPlacementListener")).invoke(null, str, Proxy.newProxyInstance(Class.forName("com.tapjoy.TJPlacementListener").getClassLoader(), new Class[]{Class.forName("com.tapjoy.TJPlacementListener")}, tapjoyPlacementListener()));
    }

    private final String getPlacementName(Object obj) {
        return (String) obj.getClass().getDeclaredMethod("getName", null).invoke(obj, null);
    }

    private final InvocationHandler tapjoyPlacementListener() {
        return new InvocationHandler() { // from class: xsna.ss70
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Object tapjoyPlacementListener$lambda$0;
                tapjoyPlacementListener$lambda$0 = OfferwallAdapterBridge.tapjoyPlacementListener$lambda$0(OfferwallAdapterBridge.this, obj, method, objArr);
                return tapjoyPlacementListener$lambda$0;
            }
        };
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
                        String placementName = offerwallAdapterBridge.getPlacementName(objArr[0]);
                        DeviceLog.debug("Placement content ready: " + placementName);
                        myc0.h(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$3(offerwallAdapterBridge, placementName, null), 3);
                        break;
                    }
                    break;
                case -1482787952:
                    if (name.equals("onContentDismiss")) {
                        String placementName2 = offerwallAdapterBridge.getPlacementName(objArr[0]);
                        DeviceLog.debug("Placement content dismissed: " + placementName2);
                        myc0.h(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(offerwallAdapterBridge, placementName2, null), 3);
                        return null;
                    }
                    break;
                case 89925559:
                    if (name.equals("onContentShow")) {
                        String placementName3 = offerwallAdapterBridge.getPlacementName(objArr[0]);
                        DeviceLog.debug("Placement content shown: " + placementName3);
                        myc0.h(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$4(offerwallAdapterBridge, placementName3, null), 3);
                        return null;
                    }
                    break;
                case 1356881459:
                    if (name.equals("onRequestSuccess")) {
                        Object obj2 = objArr[0];
                        String placementName4 = offerwallAdapterBridge.getPlacementName(obj2);
                        Boolean bool = (Boolean) obj2.getClass().getDeclaredMethod("isContentAvailable", null).invoke(obj2, null);
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        DeviceLog.debug("Placement request succeeded: " + placementName4 + " - isContentAvailable: " + booleanValue);
                        myc0.h(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(booleanValue, offerwallAdapterBridge, placementName4, null), 3);
                        return null;
                    }
                    break;
                case 2137477050:
                    if (name.equals("onRequestFailure")) {
                        String placementName5 = offerwallAdapterBridge.getPlacementName(objArr[0]);
                        offerwallAdapterBridge.placementsMap.remove(placementName5 == null ? "" : placementName5);
                        Object obj3 = objArr[1];
                        Integer num = (Integer) obj3.getClass().getField("code").get(obj3);
                        String str = (String) obj3.getClass().getField("message").get(obj3);
                        StringBuilder d = jq.d(num, "Placement request failed: ", placementName5, " - errorCode: ", ", errorMessage: ");
                        d.append(str);
                        DeviceLog.error(d.toString());
                        myc0.h(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$2(offerwallAdapterBridge, placementName5, null), 3);
                        return null;
                    }
                    break;
            }
        }
        return null;
    }

    public final baj0<OfferwallEventData> getOfferwallEventFlow() {
        return this.offerwallEventFlow;
    }

    public final String getVersion() {
        try {
            String str = (String) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod(C4553sg.b, null).invoke(null, null);
            return str == null ? "0.0.0" : str;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }

    public final boolean isAdReady(String str) {
        Object placement = getPlacement(str);
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

    public final void loadAd(String str) {
        Object placement = getPlacement(str);
        this.placementsMap.put(str, placement);
        Method declaredMethod = placement != null ? placement.getClass().getDeclaredMethod("requestContent", null) : null;
        if (declaredMethod != null) {
            declaredMethod.invoke(placement, null);
        }
    }

    public final void showAd(String str) {
        Object obj = this.placementsMap.get(str);
        Method declaredMethod = obj != null ? obj.getClass().getDeclaredMethod("isContentAvailable", null) : null;
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(obj, null) : null);
        if (bool != null ? bool.booleanValue() : false) {
            Method declaredMethod2 = obj != null ? obj.getClass().getDeclaredMethod("showContent", null) : null;
            if (declaredMethod2 != null) {
                declaredMethod2.invoke(obj, null);
            }
        } else {
            myc0.h(this.scope, null, null, new OfferwallAdapterBridge$showAd$1(this, str, null), 3);
        }
        this.placementsMap.remove(str);
    }
}
