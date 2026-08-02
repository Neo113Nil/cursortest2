package com.facebook.react;

import ac.C1932c;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import b6.C2405g;
import c6.C2890a;
import com.appsflyer.reactnative.PCAppsFlyerPackage;
import com.appsflyer.reactnative.RNAppsFlyerPackage;
import com.appsonairreactnativeapplink.AppsonairReactNativeApplinkPackage;
import com.appsonairreactnativeappsync.AppsonairReactNativeAppsyncPackage;
import com.braze.reactbridge.BrazeReactBridgePackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.horcrux.svg.SvgPackage;
import com.plaid.PlaidPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.swmansion.rnscreens.C3827s;
import com.swmansion.worklets.WorkletsPackage;
import com.zohosalesiq.reactlibrary.E0;
import f6.C4262a;
import ig.C4547c;
import io.agora.rtc.ng.react.AgoraRtcNgPackage;
import io.invertase.firebase.auth.d0;
import java.util.ArrayList;
import java.util.Arrays;
import kc.C5249i;
import lc.C5455i;
import mc.C5580b;
import qc.C6148m;
import rc.C6217b;
import s3.C6312a;
import sc.C6360k;
import t3.C6434a;
import t8.C6448b;
import v3.C6632b;
import v4.C6637d;
import vc.C6684c;
import xi.C6831d;
import yc.C6875c;
import yi.C6899b;
import z3.C6921i;

/* loaded from: classes2.dex */
public class PackageList {
    private Application application;
    private MainPackageConfig mConfig;
    private ReactNativeHost reactNativeHost;

    public PackageList(ReactNativeHost reactNativeHost) {
        this(reactNativeHost, (MainPackageConfig) null);
    }

    private Application getApplication() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        return reactNativeHost == null ? this.application : reactNativeHost.getApplication();
    }

    private Context getApplicationContext() {
        return getApplication().getApplicationContext();
    }

    private ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    private Resources getResources() {
        return getApplication().getResources();
    }

    public ArrayList<ReactPackage> getPackages() {
        return new ArrayList<>(Arrays.asList(new MainReactPackage(this.mConfig), new com.reactnativeimageresizer.c(), new BrazeReactBridgePackage(), new C2405g(), new C4262a(), new X8.k(), new C6434a(), new C5455i(), new C5580b(), new com.reactnativecommunity.blurview.c(), new nc.h(), new Jg.l(), new Kg.b(), new d0(), new io.invertase.firebase.messaging.t(), new C6148m(), new C6899b(), new E0(), new C4547c(), new io.sentry.react.x(), new C6875c(), new com.shopify.reactnative.skia.h(), new Ec.a(), new Mh.e(), new AppsonairReactNativeApplinkPackage(), new AppsonairReactNativeAppsyncPackage(), new C6921i(), new AgoraRtcNgPackage(), new RNAppsFlyerPackage(), new PCAppsFlyerPackage(), new C6684c(), new com.henninghall.date_picker.c(), new Yb.b(), new com.dylanvann.fastimage.h(), new C6448b(), new com.rnfs.f(), new com.agontuk.RNFusedLocation.j(), new Hc.e(), new com.mkuczera.b(), new C5249i(), new com.imagepicker.f(), new Wb.c(), new com.oblador.keychain.c(), new com.reactnativekeysjsi.b(), new C6312a(), new C1932c(), new org.wonday.orientation.c(), new com.arttitude360.reactnative.rnpaystack.a(), new Eg.g(), new PlaidPackage(), new C2890a(), new bc.b(), new io.radar.react.a(), new ReanimatedPackage(), new C6217b(), new C6632b(), new ed.e(), new C3827s(), new cl.json.c(), new com.zmxv.RNSound.a(), new C6831d(), new SvgPackage(), new C6360k(), new C6637d(), new Ig.c(), new com.reactnativecommunity.webview.o(), new WorkletsPackage(), new jc.p()));
    }

    public PackageList(Application application) {
        this(application, (MainPackageConfig) null);
    }

    public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = reactNativeHost;
        this.mConfig = mainPackageConfig;
    }

    public PackageList(Application application, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = null;
        this.application = application;
        this.mConfig = mainPackageConfig;
    }
}
