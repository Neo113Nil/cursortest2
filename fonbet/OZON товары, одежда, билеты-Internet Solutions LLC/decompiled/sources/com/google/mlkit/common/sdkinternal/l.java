package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

@KeepForSdk
/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature[] f60042a = new Feature[0];

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f60043b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f60044c;

    /* renamed from: d, reason: collision with root package name */
    private static final zzai f60045d;

    /* renamed from: e, reason: collision with root package name */
    private static final zzai f60046e;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f60043b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        Feature feature3 = new Feature("vision.face", 1L);
        Feature feature4 = new Feature("vision.ica", 1L);
        Feature feature5 = new Feature("vision.ocr", 1L);
        f60044c = feature5;
        new Feature("mlkit.ocr.chinese", 1L);
        new Feature("mlkit.ocr.common", 1L);
        new Feature("mlkit.ocr.devanagari", 1L);
        new Feature("mlkit.ocr.japanese", 1L);
        new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        new Feature("mlkit.image.caption", 1L);
        new Feature("mlkit.docscan.detect", 1L);
        new Feature("mlkit.docscan.crop", 1L);
        new Feature("mlkit.docscan.enhance", 1L);
        new Feature("mlkit.docscan.ui", 1L);
        new Feature("mlkit.docscan.stain", 1L);
        new Feature("mlkit.docscan.shadow", 1L);
        new Feature("mlkit.quality.aesthetic", 1L);
        new Feature("mlkit.quality.technical", 1L);
        new Feature("mlkit.segmentation.subject", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza("barcode", feature);
        zzahVar.zza("custom_ica", feature2);
        zzahVar.zza("face", feature3);
        zzahVar.zza("ica", feature4);
        zzahVar.zza("ocr", feature5);
        zzahVar.zza("langid", feature6);
        zzahVar.zza("nlclassifier", feature7);
        zzahVar.zza("tflite_dynamite", feature8);
        zzahVar.zza("barcode_ui", feature9);
        zzahVar.zza("smart_reply", feature10);
        f60045d = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza("com.google.android.gms.vision.barcode", feature);
        zzahVar2.zza("com.google.android.gms.vision.custom.ica", feature2);
        zzahVar2.zza("com.google.android.gms.vision.face", feature3);
        zzahVar2.zza("com.google.android.gms.vision.ica", feature4);
        zzahVar2.zza("com.google.android.gms.vision.ocr", feature5);
        zzahVar2.zza("com.google.android.gms.mlkit.langid", feature6);
        zzahVar2.zza("com.google.android.gms.mlkit.nlclassifier", feature7);
        zzahVar2.zza("com.google.android.gms.tflite_dynamite", feature8);
        zzahVar2.zza("com.google.android.gms.mlkit_smartreply", feature10);
        f60046e = zzahVar2.zzb();
    }

    @KeepForSdk
    @Deprecated
    public static boolean a(@NonNull Context context, @NonNull zzcs zzcsVar) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            final Feature[] d11 = d(f60046e, zzcsVar);
            try {
                return ((ModuleAvailabilityResponse) Tasks.await(ModuleInstall.getClient(context).areModulesAvailable(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.B
                    @Override // com.google.android.gms.common.api.OptionalModuleApi
                    public final Feature[] getOptionalFeatures() {
                        Feature[] featureArr = l.f60042a;
                        return d11;
                    }
                }).addOnFailureListener(new C()))).areModulesAvailable();
            } catch (InterruptedException | ExecutionException e11) {
                Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e11);
            }
        } else {
            try {
                Iterator it = zzcsVar.iterator();
                while (it.hasNext()) {
                    DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, (String) it.next());
                }
                return true;
            } catch (DynamiteModule.LoadingException unused) {
            }
        }
        return false;
    }

    @KeepForSdk
    @Deprecated
    public static void b(@NonNull Context context, @NonNull List<String> list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            c(context, d(f60045d, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    @KeepForSdk
    public static void c(@NonNull Context context, @NonNull final Feature[] featureArr) {
        ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.z
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final Feature[] getOptionalFeatures() {
                Feature[] featureArr2 = l.f60042a;
                return featureArr;
            }
        }).build()).addOnFailureListener(new A());
    }

    private static Feature[] d(zzai zzaiVar, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            featureArr[i11] = (Feature) Preconditions.checkNotNull((Feature) zzaiVar.get(list.get(i11)));
        }
        return featureArr;
    }
}
