package com.vk.lifecycle;

import android.app.ActivityManager;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vkontakte.android.VKApplication;
import java.util.List;
import kotlin.Result;
import xsna.asp;
import xsna.bpn0;
import xsna.fr6;
import xsna.gb3;
import xsna.rgd0;
import xsna.zrp;

/* compiled from: ProcessStateProvider.kt */
/* loaded from: classes.dex */
public final class ProcessStateProvider {
    public final bpn0 a;
    public final bpn0 b = new bpn0(new fr6(12));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProcessStateProvider.kt */
    public static final class ProcessImportance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ProcessImportance[] $VALUES;
        public static final ProcessImportance Background;
        public static final ProcessImportance Interactable;
        public static final ProcessImportance Unknown;

        static {
            ProcessImportance processImportance = new ProcessImportance("Interactable", 0);
            Interactable = processImportance;
            ProcessImportance processImportance2 = new ProcessImportance("Background", 1);
            Background = processImportance2;
            ProcessImportance processImportance3 = new ProcessImportance(DeviceInfo.STR_TYPE_UNKNOWN, 2);
            Unknown = processImportance3;
            ProcessImportance[] processImportanceArr = {processImportance, processImportance2, processImportance3};
            $VALUES = processImportanceArr;
            $ENTRIES = new asp(processImportanceArr);
        }

        public ProcessImportance() {
            throw null;
        }

        public static ProcessImportance valueOf(String str) {
            return (ProcessImportance) Enum.valueOf(ProcessImportance.class, str);
        }

        public static ProcessImportance[] values() {
            return (ProcessImportance[]) $VALUES.clone();
        }
    }

    public ProcessStateProvider(VKApplication vKApplication) {
        this.a = new bpn0(new gb3(vKApplication, 12));
    }

    public final ProcessState a() {
        Object failure;
        Object runningAppProcesses;
        rgd0 rgd0Var = rgd0.a;
        ActivityManager activityManager = (ActivityManager) this.a.getValue();
        if (activityManager != null) {
            try {
                runningAppProcesses = activityManager.getRunningAppProcesses();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
        } else {
            runningAppProcesses = null;
        }
        failure = runningAppProcesses;
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        List<ActivityManager.RunningAppProcessInfo> list = (List) failure;
        if (list != null) {
            int intValue = ((Number) this.b.getValue()).intValue();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                if (runningAppProcessInfo.pid == intValue) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        Integer valueOf = runningAppProcessInfo != null ? Integer.valueOf(runningAppProcessInfo.importance) : null;
        return (valueOf != null && valueOf.intValue() == 100) ? ProcessState.Foreground : (valueOf != null && valueOf.intValue() == 125) ? ProcessState.ForegroundService : (valueOf != null && valueOf.intValue() == 200) ? ProcessState.Visible : ((valueOf != null && valueOf.intValue() == 325) || (valueOf != null && valueOf.intValue() == 150)) ? ProcessState.Sleeping : ((valueOf != null && valueOf.intValue() == 230) || (valueOf != null && valueOf.intValue() == 130)) ? ProcessState.Perceptible : (valueOf != null && valueOf.intValue() == 350) ? ProcessState.CantSaveState : ((valueOf != null && valueOf.intValue() == 400) || (valueOf != null && valueOf.intValue() == 500)) ? ProcessState.Background : (valueOf != null && valueOf.intValue() == 300) ? ProcessState.Service : ProcessState.Gone;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProcessStateProvider.kt */
    public static final class ProcessState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ProcessState[] $VALUES;
        public static final ProcessState Background;
        public static final ProcessState CantSaveState;
        public static final ProcessState Foreground;
        public static final ProcessState ForegroundService;
        public static final ProcessState Gone;
        public static final ProcessState Perceptible;
        public static final ProcessState Service;
        public static final ProcessState Sleeping;
        public static final ProcessState Visible;
        private final ProcessImportance importance;

        static {
            ProcessState processState = new ProcessState("Foreground", 0);
            Foreground = processState;
            ProcessState processState2 = new ProcessState("ForegroundService", 1);
            ForegroundService = processState2;
            ProcessState processState3 = new ProcessState("Visible", 2);
            Visible = processState3;
            ProcessState processState4 = new ProcessState("Sleeping", 3);
            Sleeping = processState4;
            ProcessState processState5 = new ProcessState("Perceptible", 4);
            Perceptible = processState5;
            ProcessState processState6 = new ProcessState("CantSaveState", 5);
            CantSaveState = processState6;
            ProcessImportance processImportance = ProcessImportance.Background;
            ProcessState processState7 = new ProcessState("Background", 6, processImportance);
            Background = processState7;
            ProcessState processState8 = new ProcessState("Service", 7, processImportance);
            Service = processState8;
            ProcessState processState9 = new ProcessState("Gone", 8, ProcessImportance.Unknown);
            Gone = processState9;
            ProcessState[] processStateArr = {processState, processState2, processState3, processState4, processState5, processState6, processState7, processState8, processState9};
            $VALUES = processStateArr;
            $ENTRIES = new asp(processStateArr);
        }

        public ProcessState(String str, int i, ProcessImportance processImportance) {
            this.importance = processImportance;
        }

        public static ProcessState valueOf(String str) {
            return (ProcessState) Enum.valueOf(ProcessState.class, str);
        }

        public static ProcessState[] values() {
            return (ProcessState[]) $VALUES.clone();
        }

        public /* synthetic */ ProcessState(String str, int i) {
            this(str, i, ProcessImportance.Interactable);
        }
    }
}
