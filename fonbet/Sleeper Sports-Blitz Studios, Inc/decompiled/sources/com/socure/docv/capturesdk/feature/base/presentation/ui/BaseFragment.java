package com.socure.docv.capturesdk.feature.base.presentation.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.analytics.DocSelection;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.PermissionState;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.feature.OrchestratorUtilsKt;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel;
import com.turboimage.events.StartEvent;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFragment.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030(H\u0004J\b\u0010)\u001a\u00020*H\u0004J\b\u0010+\u001a\u00020*H\u0004J\u0010\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020.H\u0016J\u0012\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020\rH\u0016J\b\u00103\u001a\u00020\rH\u0016J\b\u00104\u001a\u00020\rH\u0016J\b\u00105\u001a\u00020\rH\u0016J\u0012\u00106\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00107\u001a\u00020\rH\u0002J*\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00032\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000bJA\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\u00032*\u0010?\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030(0\u001a\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030(H\u0004¢\u0006\u0002\u0010@J\u0010\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020CH\u0004J\u001c\u0010D\u001a\u00020\r2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000bH\u0002J\u0010\u0010E\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u0003X\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u001b*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006F"}, d2 = {"Lcom/socure/docv/capturesdk/feature/base/presentation/ui/BaseFragment;", "Landroidx/fragment/app/Fragment;", "tagPrefix", "", "(Ljava/lang/String;)V", "TAG", "docSelection", "Lcom/socure/docv/capturesdk/common/analytics/DocSelection;", "getDocSelection", "()Lcom/socure/docv/capturesdk/common/analytics/DocSelection;", "mPermissionGranted", "Lkotlin/Function1;", "Lcom/socure/docv/capturesdk/common/utils/PermissionState;", "", "msgActivityFinishing", "getMsgActivityFinishing", "()Ljava/lang/String;", "orchestratorViewModel", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel;", "getOrchestratorViewModel", "()Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel;", "orchestratorViewModel$delegate", "Lkotlin/Lazy;", "permissionListener", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "requiredPermissionsArray", "[Ljava/lang/String;", "screenCreatedTs", "", "getScreenCreatedTs", "()J", "setScreenCreatedTs", "(J)V", "backToCaller", "responseCode", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "getScrTimeArg", "Lkotlin/Pair;", "isFinishing", "", "noAnalysisMode", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDetach", StartEvent.EVENT_NAME, "onStop", "onViewStateRestored", "requestCameraPermission", "requestCameraPermissionWithCallback", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", AnalyticsConstantsKt.KEY_SCREEN, "eventTrigger", "sendEvent", "event", StepData.ARGS, "(Ljava/lang/String;[Lkotlin/Pair;)V", "setGuidelineViewTopMargin", "glView", "Landroidx/constraintlayout/widget/Guideline;", "triggerCameraPermission", "triggerPermissionDeniedError", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseFragment extends Fragment {
    private final String TAG;
    private Function1<? super PermissionState, Unit> mPermissionGranted;
    private final String msgActivityFinishing;

    /* renamed from: orchestratorViewModel$delegate, reason: from kotlin metadata */
    private final Lazy orchestratorViewModel;
    private Function1<? super PermissionState, Unit> permissionListener;
    private final ActivityResultLauncher<String[]> requestPermissionLauncher;
    private final String[] requiredPermissionsArray;
    private long screenCreatedTs;

    public BaseFragment(String tagPrefix) {
        Intrinsics.checkNotNullParameter(tagPrefix, "tagPrefix");
        this.TAG = tagPrefix + "_BF";
        this.msgActivityFinishing = "Activity is finishing, won't attempt to modify ui";
        this.requiredPermissionsArray = new String[]{"android.permission.CAMERA"};
        this.orchestratorViewModel = OrchestratorUtilsKt.activityOrchestratorViewModel(this);
        this.screenCreatedTs = System.currentTimeMillis();
        this.permissionListener = new Function1<PermissionState, Unit>() { // from class: com.socure.docv.capturesdk.feature.base.presentation.ui.BaseFragment$permissionListener$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PermissionState permissionState) {
                invoke2(permissionState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PermissionState it) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(it, "it");
                function1 = BaseFragment.this.mPermissionGranted;
                if (function1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPermissionGranted");
                    function1 = null;
                }
                function1.invoke(it);
            }
        };
        ActivityResultLauncher<String[]> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback<Map<String, Boolean>>() { // from class: com.socure.docv.capturesdk.feature.base.presentation.ui.BaseFragment$requestPermissionLauncher$1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Map<String, Boolean> result) {
                String str;
                String str2;
                Function1 function1;
                Function1 function12;
                Function1 function13;
                Intrinsics.checkNotNullParameter(result, "result");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Boolean> entry : result.entrySet()) {
                    if (!entry.getValue().booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                ArrayList arrayList2 = arrayList;
                str = BaseFragment.this.TAG;
                LoggerKt.logD(str, "registerForActivityResult deniedList - " + arrayList2);
                if (arrayList2.isEmpty()) {
                    str2 = BaseFragment.this.TAG;
                    LoggerKt.logD(str2, "Permission was granted");
                    function1 = BaseFragment.this.permissionListener;
                    function1.invoke(PermissionState.PERMISSION_GRANTED);
                    return;
                }
                BaseFragment baseFragment = BaseFragment.this;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    String str3 = ConstantsKt.EXPLAINED;
                    if (!hasNext) {
                        break;
                    }
                    Object next = it2.next();
                    if (baseFragment.shouldShowRequestPermissionRationale((String) next)) {
                        str3 = ConstantsKt.DENIED;
                    }
                    Object obj = linkedHashMap2.get(str3);
                    if (obj == null) {
                        obj = (List) new ArrayList();
                        linkedHashMap2.put(str3, obj);
                    }
                    ((List) obj).add(next);
                }
                if (((List) linkedHashMap2.get(ConstantsKt.DENIED)) != null) {
                    function13 = BaseFragment.this.permissionListener;
                    function13.invoke(PermissionState.PERMISSION_DENIED);
                }
                if (((List) linkedHashMap2.get(ConstantsKt.EXPLAINED)) != null) {
                    function12 = BaseFragment.this.permissionListener;
                    function12.invoke(PermissionState.PERMISSION_DO_NOT_ASK_DENIED);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…}\n            }\n        }");
        this.requestPermissionLauncher = registerForActivityResult;
    }

    protected final String getMsgActivityFinishing() {
        return this.msgActivityFinishing;
    }

    protected final DocSelection getDocSelection() {
        return SessionManager.INSTANCE.getSelectedDocument();
    }

    protected final IOrchestratorViewModel getOrchestratorViewModel() {
        return (IOrchestratorViewModel) this.orchestratorViewModel.getValue();
    }

    protected final long getScreenCreatedTs() {
        return this.screenCreatedTs;
    }

    protected final void setScreenCreatedTs(long j) {
        this.screenCreatedTs = j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LoggerKt.logD(this.TAG, "onAttach");
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        LoggerKt.logD(this.TAG, "onDetach");
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoggerKt.logD(this.TAG, "onCreate");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LoggerKt.logD(this.TAG, "onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        LoggerKt.logD(this.TAG, "onViewStateRestored");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LoggerKt.logD(this.TAG, StartEvent.EVENT_NAME);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        LoggerKt.logD(this.TAG, "onStop");
        super.onStop();
    }

    public final void requestCameraPermissionWithCallback(FragmentActivity activity, final String screen, final Function1<? super String, Unit> eventTrigger) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(eventTrigger, "eventTrigger");
        LoggerKt.logD(this.TAG, "requestCameraPermissionWithCallback");
        Utils utils = Utils.INSTANCE;
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
        if (utils.hasCameraPermission(applicationContext)) {
            LoggerKt.logD(this.TAG, "camera permission already have present");
        } else {
            this.mPermissionGranted = new Function1<PermissionState, Unit>() { // from class: com.socure.docv.capturesdk.feature.base.presentation.ui.BaseFragment$requestCameraPermissionWithCallback$1

                /* compiled from: BaseFragment.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[PermissionState.values().length];
                        try {
                            iArr[PermissionState.PERMISSION_GRANTED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[PermissionState.PERMISSION_DO_NOT_ASK_DENIED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[PermissionState.PERMISSION_DENIED.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PermissionState permissionState) {
                    invoke2(permissionState);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PermissionState permissionState) {
                    String str;
                    String str2;
                    String str3;
                    Intrinsics.checkNotNullParameter(permissionState, "permissionState");
                    int i = WhenMappings.$EnumSwitchMapping$0[permissionState.ordinal()];
                    if (i == 1) {
                        str = BaseFragment.this.TAG;
                        LoggerKt.logD(str, "requestCameraPermissionWithCallback PERMISSION_GRANTED");
                        eventTrigger.invoke(AnalyticsConstantsKt.CAMERA_POPUP_ACCEPTED);
                    } else {
                        if (i == 2) {
                            str2 = BaseFragment.this.TAG;
                            LoggerKt.logD(str2, "requestCameraPermissionWithCallback PERMISSION_DO_NOT_ASK_DENIED");
                            eventTrigger.invoke(AnalyticsConstantsKt.CAMERA_POPUP_DO_NOT_ASK_DENIED);
                            BaseFragment.this.triggerPermissionDeniedError(screen);
                            return;
                        }
                        if (i != 3) {
                            return;
                        }
                        str3 = BaseFragment.this.TAG;
                        LoggerKt.logD(str3, "requestCameraPermissionWithCallback PERMISSION_DENIED");
                        BaseFragment.this.sendEvent(AnalyticsConstantsKt.CAMERA_PERMISSION_DENIED, new Pair<>("message", "CAMERA_PERMISSION_DECLINED"), new Pair<>(AnalyticsConstantsKt.KEY_FACET_TYPE, Utils.INSTANCE.getDocSelFacet$capturesdk_productionRelease()), new Pair<>(AnalyticsConstantsKt.KEY_SCREEN, screen), BaseFragment.this.getScrTimeArg());
                        eventTrigger.invoke(AnalyticsConstantsKt.CAMERA_POPUP_DECLINED);
                        BaseFragment.this.backToCaller(SocureDocVError.CAMERA_PERMISSION_DECLINED);
                    }
                }
            };
            triggerCameraPermission(eventTrigger);
        }
    }

    private final void triggerCameraPermission(Function1<? super String, Unit> eventTrigger) {
        LoggerKt.logD(this.TAG, "triggerCameraPermission");
        eventTrigger.invoke(AnalyticsConstantsKt.CAMERA_POP_UP_SHOWN);
        requestCameraPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void backToCaller(SocureDocVError responseCode) {
        getOrchestratorViewModel().backToCaller(responseCode);
    }

    private final void requestCameraPermission() {
        LoggerKt.logD(this.TAG, "requestCameraPermission");
        this.requestPermissionLauncher.launch(this.requiredPermissionsArray);
    }

    protected final void sendEvent(String event, Pair<String, String>... args) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(args, "args");
        getOrchestratorViewModel().sendEvent(event, (Pair[]) Arrays.copyOf(args, args.length));
    }

    protected final Pair<String, String> getScrTimeArg() {
        return TuplesKt.to(AnalyticsConstantsKt.KEY_SCREEN_DURATION, String.valueOf(System.currentTimeMillis() - this.screenCreatedTs));
    }

    protected final boolean isFinishing() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.isFinishing();
        }
        return true;
    }

    protected final void setGuidelineViewTopMargin(Guideline glView) {
        Intrinsics.checkNotNullParameter(glView, "glView");
        Integer statusBarHeight = getOrchestratorViewModel().getStatusBarHeight();
        if (statusBarHeight != null) {
            glView.setGuidelineBegin(statusBarHeight.intValue());
        }
    }

    protected final boolean noAnalysisMode() {
        return UtilsKt.isOldOs() || UtilsKt.lowRamDevice() || !ConstantsKt.getOPEN_CV_SUPPORTED();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerPermissionDeniedError(String screen) {
        LoggerKt.logD(this.TAG, "triggerPermissionDeniedError called");
        sendEvent("error", new Pair<>("type", "camera_permission"), new Pair<>("message", "CAMERA_PERMISSION_DECLINED"), new Pair<>(AnalyticsConstantsKt.KEY_FACET_TYPE, Utils.INSTANCE.getDocSelFacet$capturesdk_productionRelease()), new Pair<>(AnalyticsConstantsKt.KEY_SCREEN, screen), getScrTimeArg());
        backToCaller(SocureDocVError.CAMERA_PERMISSION_DECLINED);
    }
}
