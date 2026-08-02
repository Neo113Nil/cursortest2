package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import cl.json.RNSharePackage;
import com.actionsheet.ActionSheetPackage;
import com.airbnb.android.react.lottie.LottiePackage;
import com.amazonaws.RNAWSCognitoPackage;
import com.amplitude.reactnative.AmplitudeReactNativePackage;
import com.appsflyer.reactnative.RNAppsFlyerPackage;
import com.asterinet.react.tcpsocket.TcpSocketPackage;
import com.braze.reactbridge.BrazeReactBridgePackage;
import com.brentvatne.react.ReactVideoPackage;
import com.corbt.keepawake.KCKeepAwakePackage;
import com.exitapp.ExitAppPackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.github.doomsower.RNStartupTimePackage;
import com.henninghall.date_picker.DatePickerPackage;
import com.horcrux.svg.SvgPackage;
import com.ibits.react_native_in_app_review.AppReviewPackage;
import com.imagepicker.ImagePickerPackage;
import com.intercom.reactnative.IntercomPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.margelo.nitro.NitroModulesPackage;
import com.margelo.nitro.mmkv.NitroMmkvPackage;
import com.margelo.nitro.nitrofetch.NitroFetchPackage;
import com.margelo.nitro.playagerangedeclaration.PlayAgeRangeDeclarationPackage;
import com.masteratul.exceptionhandler.ReactNativeExceptionHandlerPackage;
import com.mattermost.pasteinputtext.PasteTextInputPackage;
import com.microsoft.codepush.react.CodePush;
import com.mkuczera.RNReactNativeHapticFeedbackPackage;
import com.oblador.performance.PerformancePackage;
import com.poppop.RNReactNativeSharedGroupPreferences.RNReactNativeSharedGroupPreferencesPackage;
import com.punarinta.RNSoundLevel.RNSoundLevel;
import com.radar.RadarPackage;
import com.react.rnspinkit.RNSpinkitPackage;
import com.reactcommunity.rndatetimepicker.RNDateTimePickerPackage;
import com.reactcommunity.rnlocalize.RNLocalizePackage;
import com.reactlibrary.createthumbnail.CreateThumbnailPackage;
import com.reactnative.ivpusic.imagepicker.PickerPackage;
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
import com.reactnativecommunity.cameraroll.CameraRollPackage;
import com.reactnativecommunity.netinfo.NetInfoPackage;
import com.reactnativecommunity.picker.RNCPickerPackage;
import com.reactnativecommunity.rctaudiotoolkit.AudioPackage;
import com.reactnativecommunity.slider.ReactSliderPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.reactnativecompressor.CompressorPackage;
import com.reactnativedetector.DetectorPackage;
import com.reactnativekeyboardcontroller.KeyboardControllerPackage;
import com.reactnativepagerview.PagerViewPackage;
import com.reactnativepasskey.PasskeyPackage;
import com.reactnativevectoricons.common.VectorIconsPackage;
import com.releaseprofiler.ReleaseProfilerPackage;
import com.rnbiometrics.ReactNativeBiometricsPackage;
import com.rnfs.RNFSPackage;
import com.rnlineargradient.LinearGradientPackage;
import com.rt2zz.reactnativecontacts.ReactNativeContacts;
import com.shake.ShakePackage;
import com.shopify.reactnative.skia.RNSkiaPackage;
import com.socure.docv.reactnative.SocureDocVReactNativePackage;
import com.sparkfabrikreactnativeidfaaaid.ReactNativeIdfaAaidPackage;
import com.swmansion.enriched.markdown.EnrichedMarkdownTextPackage;
import com.swmansion.gesturehandler.RNGestureHandlerPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.swmansion.rnscreens.RNScreensPackage;
import com.swmansion.worklets.WorkletsPackage;
import com.th3rdwave.safeareacontext.SafeAreaContextPackage;
import com.tiktokbusiness.TikTokBusinessPackage;
import com.tkporter.sendsms.SendSMSPackage;
import com.turboimage.TurboImagePackage;
import com.zmxv.RNSound.RNSoundPackage;
import com.zoontek.rnbootsplash.RNBootSplashPackage;
import com.zoontek.rnpermissions.RNPermissionsPackage;
import expo.modules.ExpoModulesPackage;
import fr.bamlab.rnimageresizer.ImageResizerPackage;
import fr.greweb.reactnativeviewshot.RNViewShotPackage;
import io.invertase.firebase.analytics.ReactNativeFirebaseAnalyticsPackage;
import io.invertase.firebase.app.ReactNativeFirebaseAppPackage;
import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingPackage;
import io.invertase.firebase.perf.ReactNativeFirebasePerfPackage;
import io.sentry.react.RNSentryPackage;
import io.sua.RNDeviceTimeFormatPackage;
import iyegoroff.RNColorMatrixImageFilters.ColorMatrixImageFiltersPackage;
import java.util.ArrayList;
import java.util.Arrays;
import org.reactnative.maskedview.RNCMaskedViewPackage;

/* loaded from: classes6.dex */
public class PackageList {
    private Application application;
    private MainPackageConfig mConfig;
    private ReactNativeHost reactNativeHost;

    public PackageList(ReactNativeHost reactNativeHost) {
        this(reactNativeHost, (MainPackageConfig) null);
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

    private ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    private Resources getResources() {
        return getApplication().getResources();
    }

    private Application getApplication() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        return reactNativeHost == null ? this.application : reactNativeHost.getApplication();
    }

    private Context getApplicationContext() {
        return getApplication().getApplicationContext();
    }

    public ArrayList<ReactPackage> getPackages() {
        return new ArrayList<>(Arrays.asList(new MainReactPackage(this.mConfig), new RNSentryPackage(), new FBSDKPackage(), new NitroMmkvPackage(), new AmplitudeReactNativePackage(), new BrazeReactBridgePackage(), new IntercomPackage(), new ExitAppPackage(), new PasteTextInputPackage(), new AsyncStoragePackage(), new CameraRollPackage(), new AudioPackage(), new RNDateTimePickerPackage(), new NetInfoPackage(), new ReactNativeFirebaseAnalyticsPackage(), new ReactNativeFirebaseAppPackage(), new ReactNativeFirebaseMessagingPackage(), new ReactNativeFirebasePerfPackage(), new RNCMaskedViewPackage(), new RNCPickerPackage(), new VectorIconsPackage(), new RNSkiaPackage(), new SocureDocVReactNativePackage(), new ReactNativeIdfaAaidPackage(), new RNAWSCognitoPackage(), new ExpoModulesPackage(), new LottiePackage(), new ActionSheetPackage(), new RNAppsFlyerPackage(), new ReactNativeBiometricsPackage(), new RNBootSplashPackage(), new CodePush(getApplicationContext(), false), new ColorMatrixImageFiltersPackage(), new CompressorPackage(), new ReactNativeContacts(), new CreateThumbnailPackage(), new DatePickerPackage(), new DetectorPackage(), new RNDeviceInfo(), new RNDeviceTimeFormatPackage(), new EnrichedMarkdownTextPackage(), new ReactNativeExceptionHandlerPackage(), new RNFSPackage(), new RNGestureHandlerPackage(), new RNReactNativeHapticFeedbackPackage(), new PickerPackage(), new ImagePickerPackage(), new ImageResizerPackage(), new AppReviewPackage(), new KCKeepAwakePackage(), new KeyboardControllerPackage(), new LinearGradientPackage(), new RNLocalizePackage(), new NitroFetchPackage(), new NitroModulesPackage(), new PagerViewPackage(), new PasskeyPackage(), new PerformancePackage(), new RNPermissionsPackage(), new PlayAgeRangeDeclarationPackage(), new RadarPackage(), new ReanimatedPackage(), new ReleaseProfilerPackage(), new SafeAreaContextPackage(), new RNScreensPackage(), new ShakePackage(), new RNSharePackage(), new RNReactNativeSharedGroupPreferencesPackage(), new SendSMSPackage(), new RNSoundPackage(), new RNSoundLevel(), new RNSpinkitPackage(), new RNStartupTimePackage(), new SvgPackage(), new TcpSocketPackage(), new TikTokBusinessPackage(), new TurboImagePackage(), new ReactVideoPackage(), new RNViewShotPackage(), new RNCWebViewPackage(), new WorkletsPackage(), new ReactSliderPackage()));
    }
}
