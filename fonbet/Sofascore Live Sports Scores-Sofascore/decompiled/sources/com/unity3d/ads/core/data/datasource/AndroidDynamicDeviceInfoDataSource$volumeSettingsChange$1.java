package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import defpackage.a70;
import defpackage.bsf;
import defpackage.dsf;
import defpackage.hoi;
import defpackage.il4;
import defpackage.k8f;
import defpackage.l98;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.v7a;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk8f;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "", "<anonymous>", "(Lk8f;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", l = {654}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends hoi implements Function2<k8f, rq3<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, rq3<? super AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1) {
        androidDynamicDeviceInfoDataSource.getContext().getContentResolver().unregisterContentObserver(androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1);
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, rq3Var);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k8f k8fVar, rq3<? super Unit> rq3Var) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(k8fVar, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.database.ContentObserver, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        double streamVolume;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            final k8f k8fVar = (k8f) this.L$0;
            final bsf bsfVar = new bsf();
            streamVolume = this.this$0.getStreamVolume(3);
            bsfVar.a = streamVolume;
            l98.m0(k8fVar, new VolumeSettingsChange.VolumeChange(streamVolume));
            final dsf dsfVar = new dsf();
            int ringerMode = this.this$0.getRingerMode();
            dsfVar.a = ringerMode;
            l98.m0(k8fVar, new VolumeSettingsChange.MuteChange(ringerMode == 0));
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            final ?? r4 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean selfChange) {
                    double streamVolume2;
                    super.onChange(selfChange);
                    streamVolume2 = AndroidDynamicDeviceInfoDataSource.this.getStreamVolume(3);
                    bsf bsfVar2 = bsfVar;
                    if (streamVolume2 != bsfVar2.a) {
                        bsfVar2.a = streamVolume2;
                        l98.m0(k8fVar, new VolumeSettingsChange.VolumeChange(streamVolume2));
                    }
                    int ringerMode2 = AndroidDynamicDeviceInfoDataSource.this.getRingerMode();
                    dsf dsfVar2 = dsfVar;
                    if (ringerMode2 != dsfVar2.a) {
                        dsfVar2.a = ringerMode2;
                        l98.m0(k8fVar, new VolumeSettingsChange.MuteChange(ringerMode2 == 0));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r4);
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource2 = this.this$0;
            Function0 function0 = new Function0() { // from class: com.unity3d.ads.core.data.datasource.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1.invokeSuspend$lambda$0(AndroidDynamicDeviceInfoDataSource.this, r4);
                    return invokeSuspend$lambda$0;
                }
            };
            this.label = 1;
            if (v7a.i(k8fVar, function0, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
