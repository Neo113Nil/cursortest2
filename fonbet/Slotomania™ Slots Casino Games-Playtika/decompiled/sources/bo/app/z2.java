package bo.app;

import com.braze.Constants;
import com.braze.managers.BrazeGeofenceManager;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010Nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006PÀ\u0006\u0001"}, d2 = {"Lbo/app/z2;", "", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/k5;", "e", "()Lbo/app/k5;", "serverConfigStorageProvider", "Lbo/app/w6;", "b", "()Lbo/app/w6;", "setUserCache", "(Lbo/app/w6;)V", "userCache", "Lbo/app/l0;", "c", "()Lbo/app/l0;", "setDeviceCache", "(Lbo/app/l0;)V", "deviceCache", "Lbo/app/b1;", "m", "()Lbo/app/b1;", "internalEventPublisher", "Lbo/app/f;", "o", "()Lbo/app/f;", "automaticDispatchManager", "Lbo/app/a1;", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "()Lbo/app/a1;", "eventListenerFactory", "Lbo/app/i0;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Lbo/app/i0;", "dataRefreshPolicyProvider", "Lbo/app/d1;", "f", "()Lbo/app/d1;", "eventStorageManager", "Lbo/app/d2;", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "()Lbo/app/d2;", "deviceDataProvider", "Lbo/app/e5;", "p", "()Lbo/app/e5;", "sdkAuthenticationCache", "Lbo/app/z1;", "n", "()Lbo/app/z1;", "brazeManager", "Lbo/app/n6;", "l", "()Lbo/app/n6;", "triggerManager", "Lcom/braze/managers/BrazeGeofenceManager;", "j", "()Lcom/braze/managers/BrazeGeofenceManager;", "geofenceManager", "Lbo/app/o;", "i", "()Lbo/app/o;", "brazeLocationManager", "Lbo/app/g1;", "q", "()Lbo/app/g1;", "featureFlagsManager", "Lbo/app/m1;", "h", "()Lbo/app/m1;", "feedStorageProvider", "Lbo/app/b0;", "k", "()Lbo/app/b0;", "contentCardsStorageProvider", "Lbo/app/l4;", "g", "()Lbo/app/l4;", "pushMaxManager", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface z2 {
    void a();

    w6 b();

    l0 c();

    /* renamed from: d */
    i0 getM();

    /* renamed from: e */
    k5 getE();

    /* renamed from: f */
    d1 getQ();

    /* renamed from: g */
    l4 getR();

    /* renamed from: h */
    m1 getB();

    /* renamed from: i */
    o getZ();

    /* renamed from: j */
    BrazeGeofenceManager getY();

    /* renamed from: k */
    b0 getC();

    /* renamed from: l */
    n6 getX();

    /* renamed from: m */
    b1 getH();

    /* renamed from: n */
    z1 getW();

    /* renamed from: o */
    f getI();

    /* renamed from: p */
    e5 getT();

    /* renamed from: q */
    g1 getA();

    /* renamed from: r */
    a1 getL();

    /* renamed from: s */
    d2 getS();
}
