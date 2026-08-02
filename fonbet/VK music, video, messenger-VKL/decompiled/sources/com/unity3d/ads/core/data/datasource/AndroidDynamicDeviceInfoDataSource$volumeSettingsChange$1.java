package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$DoubleRef;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.b6l;
import xsna.gzs;
import xsna.phd0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zfb;
import xsna.zhd0;

/* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", l = {654}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends SuspendLambda implements wzs<zhd0<? super VolumeSettingsChange>, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, spj<? super AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1> spjVar) {
        super(2, spjVar);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 invokeSuspend$lambda$0(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1) {
        androidDynamicDeviceInfoDataSource.getContext().getContentResolver().unregisterContentObserver(androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1);
        return s3q0.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, spjVar);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.database.ContentObserver, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        double streamVolume;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final zhd0 zhd0Var = (zhd0) this.L$0;
            final Ref$DoubleRef ref$DoubleRef = new Ref$DoubleRef();
            streamVolume = this.this$0.getStreamVolume(3);
            ref$DoubleRef.element = streamVolume;
            zfb.a(new VolumeSettingsChange.VolumeChange(streamVolume), zhd0Var);
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            int ringerMode = this.this$0.getRingerMode();
            ref$IntRef.element = ringerMode;
            zfb.a(new VolumeSettingsChange.MuteChange(ringerMode == 0), zhd0Var);
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            final ?? r4 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z) {
                    double streamVolume2;
                    super.onChange(z);
                    streamVolume2 = AndroidDynamicDeviceInfoDataSource.this.getStreamVolume(3);
                    Ref$DoubleRef ref$DoubleRef2 = ref$DoubleRef;
                    if (streamVolume2 != ref$DoubleRef2.element) {
                        ref$DoubleRef2.element = streamVolume2;
                        zfb.a(new VolumeSettingsChange.VolumeChange(streamVolume2), zhd0Var);
                    }
                    int ringerMode2 = AndroidDynamicDeviceInfoDataSource.this.getRingerMode();
                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                    if (ringerMode2 != ref$IntRef2.element) {
                        ref$IntRef2.element = ringerMode2;
                        zfb.a(new VolumeSettingsChange.MuteChange(ringerMode2 == 0), zhd0Var);
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r4);
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource2 = this.this$0;
            gzs gzsVar = new gzs() { // from class: com.unity3d.ads.core.data.datasource.a
                @Override // xsna.gzs
                public final Object invoke() {
                    s3q0 invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1.invokeSuspend$lambda$0(AndroidDynamicDeviceInfoDataSource.this, r4);
                    return invokeSuspend$lambda$0;
                }
            };
            this.label = 1;
            if (phd0.a(zhd0Var, gzsVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super VolumeSettingsChange> zhd0Var, spj<? super s3q0> spjVar) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }
}
