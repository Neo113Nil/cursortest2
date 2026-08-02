package expo.modules.taskManager;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.tracing.Trace;
import expo.modules.interfaces.taskManager.TaskManagerInterface;
import expo.modules.interfaces.taskManager.TaskServiceInterface;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.ConstantComponentBuilder;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: TaskManagerModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/taskManager/TaskManagerModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "_taskService", "Lexpo/modules/interfaces/taskManager/TaskServiceInterface;", "get_taskService", "()Lexpo/modules/interfaces/taskManager/TaskServiceInterface;", "_taskService$delegate", "Lkotlin/Lazy;", "taskService", "getTaskService", "taskManagerInternal", "Lexpo/modules/interfaces/taskManager/TaskManagerInterface;", "getTaskManagerInternal", "()Lexpo/modules/interfaces/taskManager/TaskManagerInterface;", "taskManagerInternal$delegate", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "appScopeKey", "", "getAppScopeKey", "()Ljava/lang/String;", "expo-task-manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TaskManagerModule extends Module {

    /* renamed from: _taskService$delegate, reason: from kotlin metadata */
    private final Lazy _taskService = LazyKt.lazy(new Function0() { // from class: expo.modules.taskManager.TaskManagerModule$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TaskServiceInterface _taskService_delegate$lambda$0;
            _taskService_delegate$lambda$0 = TaskManagerModule._taskService_delegate$lambda$0(TaskManagerModule.this);
            return _taskService_delegate$lambda$0;
        }
    });

    /* renamed from: taskManagerInternal$delegate, reason: from kotlin metadata */
    private final Lazy taskManagerInternal = LazyKt.lazy(new Function0() { // from class: expo.modules.taskManager.TaskManagerModule$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TaskManagerInterface taskManagerInternal_delegate$lambda$1;
            taskManagerInternal_delegate$lambda$1 = TaskManagerModule.taskManagerInternal_delegate$lambda$1(TaskManagerModule.this);
            return taskManagerInternal_delegate$lambda$1;
        }
    });

    private final TaskServiceInterface get_taskService() {
        return (TaskServiceInterface) this._taskService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaskServiceInterface _taskService_delegate$lambda$0(TaskManagerModule taskManagerModule) {
        return (TaskServiceInterface) taskManagerModule.getAppContext().getLegacyModuleRegistry().getSingletonModule("TaskService", TaskServiceInterface.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TaskServiceInterface getTaskService() {
        TaskServiceInterface taskServiceInterface = get_taskService();
        if (taskServiceInterface != null) {
            return taskServiceInterface;
        }
        throw new Exceptions.ModuleNotFound(Reflection.getOrCreateKotlinClass(TaskManagerInterface.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TaskManagerInterface getTaskManagerInternal() {
        return (TaskManagerInterface) this.taskManagerInternal.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaskManagerInterface taskManagerInternal_delegate$lambda$1(TaskManagerModule taskManagerModule) {
        Object obj;
        try {
            obj = taskManagerModule.getAppContext().getLegacyModuleRegistry().getModule(TaskManagerInterface.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (TaskManagerInterface) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02d0 A[Catch: all -> 0x069f, TRY_LEAVE, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0260 A[Catch: all -> 0x069f, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0258 A[Catch: all -> 0x069f, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01fa A[Catch: all -> 0x069f, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x021b A[Catch: all -> 0x069f, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02bd A[Catch: all -> 0x069f, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03d8 A[Catch: all -> 0x069f, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x04aa A[Catch: all -> 0x069f, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0510 A[Catch: all -> 0x069f, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0637 A[Catch: all -> 0x069f, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x063f A[Catch: all -> 0x069f, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0523 A[Catch: all -> 0x069f, TRY_LEAVE, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04b2 A[Catch: all -> 0x069f, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03eb A[Catch: all -> 0x069f, TRY_LEAVE, TryCatch #6 {all -> 0x069f, blocks: (B:3:0x002b, B:5:0x008c, B:6:0x00db, B:192:0x0140, B:194:0x0146, B:195:0x015b, B:198:0x0162, B:201:0x0171, B:202:0x0167, B:9:0x0177, B:13:0x0245, B:15:0x0258, B:16:0x02a7, B:18:0x02bd, B:19:0x03c2, B:21:0x03d8, B:22:0x048a, B:24:0x04aa, B:25:0x04f9, B:27:0x0510, B:28:0x0616, B:30:0x0637, B:31:0x0686, B:36:0x063f, B:38:0x0647, B:39:0x064f, B:41:0x0657, B:42:0x065f, B:44:0x0667, B:45:0x066f, B:47:0x0677, B:48:0x067f, B:49:0x0523, B:52:0x05b2, B:54:0x05c5, B:56:0x05ce, B:58:0x05d6, B:59:0x05de, B:61:0x05e6, B:62:0x05ee, B:64:0x05f6, B:65:0x05fe, B:67:0x0606, B:68:0x060e, B:71:0x0579, B:73:0x057f, B:74:0x0594, B:77:0x059d, B:80:0x05ac, B:81:0x05a2, B:85:0x056f, B:86:0x04b2, B:88:0x04ba, B:89:0x04c2, B:91:0x04ca, B:92:0x04d2, B:94:0x04da, B:95:0x04e2, B:97:0x04ea, B:98:0x04f2, B:99:0x03eb, B:102:0x0479, B:105:0x0441, B:107:0x0447, B:108:0x045c, B:111:0x0463, B:114:0x0472, B:115:0x0468, B:118:0x0437, B:119:0x02d0, B:122:0x035e, B:124:0x0371, B:126:0x037a, B:128:0x0382, B:129:0x038a, B:131:0x0392, B:132:0x039a, B:134:0x03a2, B:135:0x03aa, B:137:0x03b2, B:138:0x03ba, B:141:0x0326, B:143:0x032c, B:144:0x0341, B:147:0x0348, B:150:0x0357, B:151:0x034d, B:154:0x031c, B:155:0x0260, B:157:0x0268, B:158:0x0270, B:160:0x0278, B:161:0x0280, B:163:0x0288, B:164:0x0290, B:166:0x0298, B:167:0x02a0, B:173:0x01f4, B:175:0x01fa, B:176:0x020f, B:179:0x0216, B:182:0x023d, B:183:0x021b, B:186:0x01ea, B:205:0x0136, B:206:0x0094, B:208:0x009c, B:209:0x00a4, B:211:0x00ac, B:212:0x00b4, B:214:0x00bc, B:215:0x00c4, B:217:0x00cc, B:218:0x00d4, B:191:0x0116, B:104:0x0416, B:140:0x02fb, B:70:0x054e), top: B:2:0x002b, inners: #1, #2, #4, #5 }] */
    @Override // expo.modules.kotlin.modules.Module
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        Object m13470constructorimpl2;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        Object m13470constructorimpl3;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent;
        Object m13470constructorimpl4;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        Object m13470constructorimpl5;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent2;
        TaskManagerModule taskManagerModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (taskManagerModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(taskManagerModule);
            moduleDefinitionBuilder2.Name("ExpoTaskManager");
            moduleDefinitionBuilder2.Events(TaskManagerInterface.EVENT_NAME);
            ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder("EVENT_NAME");
            constantComponentBuilder.setGetter(new Function0<String>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$Constant$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return TaskManagerInterface.EVENT_NAME;
                }
            });
            moduleDefinitionBuilder2.getConstants().put("EVENT_NAME", constantComponentBuilder);
            moduleDefinitionBuilder2.getEventListeners().put(EventName.MODULE_CREATE, new BasicEventListener(EventName.MODULE_CREATE, new Function0<Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$OnCreate$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Object obj;
                    final WeakReference weakReference = new WeakReference(TaskManagerModule.this);
                    final Function2<String, Bundle, Unit> function2 = new Function2<String, Bundle, Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$1$2$emitEvent$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(String str, Bundle bundle) {
                            invoke2(str, bundle);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String name, Bundle body) {
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(body, "body");
                            try {
                                TaskManagerModule taskManagerModule2 = weakReference.get();
                                if (taskManagerModule2 != null) {
                                    taskManagerModule2.sendEvent(name, body);
                                }
                            } catch (Throwable th) {
                                Log.e("ExpoTaskManager", "Failed to emit event " + name + " using the module's event emitter: " + th.getMessage());
                            }
                        }
                    };
                    try {
                        obj = TaskManagerModule.this.getAppContext().getLegacyModuleRegistry().getModule(TaskManagerInterface.class);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    TaskManagerInternalModule taskManagerInternalModule = obj instanceof TaskManagerInternalModule ? (TaskManagerInternalModule) obj : null;
                    if (taskManagerInternalModule != null) {
                        taskManagerInternalModule.setEmitEventWrapper(new EmitEventWrapper(function2) { // from class: expo.modules.taskManager.TaskManagerModule$sam$expo_modules_taskManager_EmitEventWrapper$0
                            private final /* synthetic */ Function2 function;

                            {
                                Intrinsics.checkNotNullParameter(function2, "function");
                                this.function = function2;
                            }

                            @Override // expo.modules.taskManager.EmitEventWrapper
                            public final /* synthetic */ void emit(String str, Bundle bundle) {
                                this.function.invoke(str, bundle);
                            }
                        });
                    }
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder2;
            AnyType[] anyTypeArr = new AnyType[0];
            Function1<Object[], Boolean> function1 = new Function1<Object[], Boolean>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
            moduleDefinitionBuilder3.getAsyncFunctions().put("isAvailableAsync", Intrinsics.areEqual(Boolean.class, Integer.TYPE) ? new IntAsyncFunctionComponent("isAvailableAsync", anyTypeArr, function1) : Intrinsics.areEqual(Boolean.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("isAvailableAsync", anyTypeArr, function1) : Intrinsics.areEqual(Boolean.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("isAvailableAsync", anyTypeArr, function1) : Intrinsics.areEqual(Boolean.class, Float.TYPE) ? new FloatAsyncFunctionComponent("isAvailableAsync", anyTypeArr, function1) : Intrinsics.areEqual(Boolean.class, String.class) ? new StringAsyncFunctionComponent("isAvailableAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("isAvailableAsync", anyTypeArr, function1));
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder2;
            TypeConverterProvider converters = moduleDefinitionBuilder4.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[2];
            AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType == null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl2 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    m13470constructorimpl = null;
                }
                TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor2 == null) {
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType = new AnyType(typeDescriptor2, converters);
            }
            anyTypeArr2[0] = anyType;
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), false));
            if (anyType2 != null) {
                moduleDefinitionBuilder = moduleDefinitionBuilder4;
            } else {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Map.class);
                    TypeInfo[] typeInfoArr = new TypeInfo[2];
                    moduleDefinitionBuilder = moduleDefinitionBuilder4;
                    try {
                        typeInfoArr[0] = new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false);
                        typeInfoArr[1] = new TypeInfo.Simple("kotlin.Any", Reflection.getOrCreateKotlinClass(Object.class), true);
                        m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Parameterized("kotlin.collections.Map", orCreateKotlinClass, false, ArraysKt.asList(typeInfoArr))), new Function0<KType>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$3
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Object.class)));
                            }
                        }));
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion4 = Result.INSTANCE;
                        m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                        if (m13473exceptionOrNullimpl != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                        }
                        typeDescriptor = (TypeDescriptor) m13470constructorimpl2;
                        if (typeDescriptor != null) {
                        }
                        anyType2 = new AnyType(typeDescriptor, converters);
                        anyTypeArr2[1] = anyType2;
                        Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$4
                            @Override // kotlin.jvm.functions.Function1
                            public final Unit invoke(Object[] objArr) {
                                TaskServiceInterface taskService;
                                String appScopeKey;
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Object obj = objArr[0];
                                Map<String, Object> map = (Map) objArr[1];
                                taskService = TaskManagerModule.this.getTaskService();
                                appScopeKey = TaskManagerModule.this.getAppScopeKey();
                                taskService.notifyTaskFinished((String) obj, appScopeKey, map);
                                return Unit.INSTANCE;
                            }
                        };
                        moduleDefinitionBuilder.getAsyncFunctions().put("notifyTaskFinishedAsync", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function12) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function12) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function12) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function12) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function12));
                        ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder2;
                        if (Intrinsics.areEqual(String.class, Promise.class)) {
                        }
                        moduleDefinitionBuilder5.getAsyncFunctions().put("isTaskRegisteredAsync", intAsyncFunctionComponent);
                        ModuleDefinitionBuilder moduleDefinitionBuilder6 = moduleDefinitionBuilder2;
                        if (Intrinsics.areEqual(String.class, Promise.class)) {
                        }
                        moduleDefinitionBuilder6.getAsyncFunctions().put("getTaskOptionsAsync", untypedAsyncFunctionComponent);
                        ModuleDefinitionBuilder moduleDefinitionBuilder7 = moduleDefinitionBuilder2;
                        AnyType[] anyTypeArr3 = new AnyType[0];
                        Function1<Object[], List<? extends Bundle>> function13 = new Function1<Object[], List<? extends Bundle>>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$11
                            @Override // kotlin.jvm.functions.Function1
                            public final List<? extends Bundle> invoke(Object[] it) {
                                TaskServiceInterface taskService;
                                String appScopeKey;
                                Intrinsics.checkNotNullParameter(it, "it");
                                taskService = TaskManagerModule.this.getTaskService();
                                appScopeKey = TaskManagerModule.this.getAppScopeKey();
                                List<Bundle> tasksForAppScopeKey = taskService.getTasksForAppScopeKey(appScopeKey);
                                Intrinsics.checkNotNullExpressionValue(tasksForAppScopeKey, "getTasksForAppScopeKey(...)");
                                return tasksForAppScopeKey;
                            }
                        };
                        moduleDefinitionBuilder7.getAsyncFunctions().put("getRegisteredTasksAsync", !Intrinsics.areEqual(List.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr3, function13) : Intrinsics.areEqual(List.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr3, function13) : Intrinsics.areEqual(List.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr3, function13) : Intrinsics.areEqual(List.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr3, function13) : Intrinsics.areEqual(List.class, String.class) ? new StringAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr3, function13) : new UntypedAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr3, function13));
                        ModuleDefinitionBuilder moduleDefinitionBuilder8 = moduleDefinitionBuilder2;
                        if (Intrinsics.areEqual(String.class, Promise.class)) {
                        }
                        moduleDefinitionBuilder8.getAsyncFunctions().put("unregisterTaskAsync", intAsyncFunctionComponent2);
                        ModuleDefinitionBuilder moduleDefinitionBuilder9 = moduleDefinitionBuilder2;
                        AnyType[] anyTypeArr4 = new AnyType[0];
                        Function1<Object[], Unit> function14 = new Function1<Object[], Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$15
                            @Override // kotlin.jvm.functions.Function1
                            public final Unit invoke(Object[] it) {
                                TaskServiceInterface taskService;
                                String appScopeKey;
                                Intrinsics.checkNotNullParameter(it, "it");
                                taskService = TaskManagerModule.this.getTaskService();
                                appScopeKey = TaskManagerModule.this.getAppScopeKey();
                                taskService.unregisterAllTasksForAppScopeKey(appScopeKey);
                                return Unit.INSTANCE;
                            }
                        };
                        moduleDefinitionBuilder9.getAsyncFunctions().put("unregisterAllTasksAsync", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr4, function14) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr4, function14) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr4, function14) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr4, function14) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr4, function14) : new UntypedAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr4, function14));
                        moduleDefinitionBuilder2.OnStartObserving(new Function0<Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$1$10
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                Handler handler = new Handler(Looper.getMainLooper());
                                final TaskManagerModule taskManagerModule2 = TaskManagerModule.this;
                                handler.postDelayed(new Runnable() { // from class: expo.modules.taskManager.TaskManagerModule$definition$1$10.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        TaskManagerInterface taskManagerInternal;
                                        taskManagerInternal = TaskManagerModule.this.getTaskManagerInternal();
                                        if (taskManagerInternal != null) {
                                            taskManagerInternal.flushQueuedEvents();
                                        }
                                    }
                                }, 1000L);
                            }
                        });
                        return moduleDefinitionBuilder2.buildModule();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    moduleDefinitionBuilder = moduleDefinitionBuilder4;
                }
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                if (m13473exceptionOrNullimpl != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Map.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                    m13470constructorimpl2 = null;
                }
                typeDescriptor = (TypeDescriptor) m13470constructorimpl2;
                if (typeDescriptor != null) {
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Object.class))));
                }
                anyType2 = new AnyType(typeDescriptor, converters);
            }
            anyTypeArr2[1] = anyType2;
            Function1<Object[], Unit> function122 = new Function1<Object[], Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$4
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    TaskServiceInterface taskService;
                    String appScopeKey;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Map<String, Object> map = (Map) objArr[1];
                    taskService = TaskManagerModule.this.getTaskService();
                    appScopeKey = TaskManagerModule.this.getAppScopeKey();
                    taskService.notifyTaskFinished((String) obj, appScopeKey, map);
                    return Unit.INSTANCE;
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("notifyTaskFinishedAsync", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function122) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function122) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function122) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function122) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function122) : new UntypedAsyncFunctionComponent("notifyTaskFinishedAsync", anyTypeArr2, function122));
            ModuleDefinitionBuilder moduleDefinitionBuilder52 = moduleDefinitionBuilder2;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                TypeConverterProvider converters2 = moduleDefinitionBuilder52.getConverters();
                AnyType[] anyTypeArr5 = new AnyType[1];
                AnyType anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType3 == null) {
                    try {
                        Result.Companion companion5 = Result.INSTANCE;
                        m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$6
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th4) {
                        Result.Companion companion6 = Result.INSTANCE;
                        m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
                    }
                    Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                    if (m13473exceptionOrNullimpl3 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl3);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                        m13470constructorimpl3 = null;
                    }
                    TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
                    if (typeDescriptor3 == null) {
                        typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType3 = new AnyType(typeDescriptor3, converters2);
                }
                anyTypeArr5[0] = anyType3;
                Function1<Object[], Boolean> function15 = new Function1<Object[], Boolean>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$7
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object[] objArr) {
                        TaskServiceInterface taskService;
                        String appScopeKey;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        taskService = TaskManagerModule.this.getTaskService();
                        appScopeKey = TaskManagerModule.this.getAppScopeKey();
                        return Boolean.valueOf(taskService.hasRegisteredTask(str, appScopeKey));
                    }
                };
                intAsyncFunctionComponent = Intrinsics.areEqual(Boolean.class, Integer.TYPE) ? new IntAsyncFunctionComponent("isTaskRegisteredAsync", anyTypeArr5, function15) : Intrinsics.areEqual(Boolean.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("isTaskRegisteredAsync", anyTypeArr5, function15) : Intrinsics.areEqual(Boolean.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("isTaskRegisteredAsync", anyTypeArr5, function15) : Intrinsics.areEqual(Boolean.class, Float.TYPE) ? new FloatAsyncFunctionComponent("isTaskRegisteredAsync", anyTypeArr5, function15) : Intrinsics.areEqual(Boolean.class, String.class) ? new StringAsyncFunctionComponent("isTaskRegisteredAsync", anyTypeArr5, function15) : new UntypedAsyncFunctionComponent("isTaskRegisteredAsync", anyTypeArr5, function15);
            } else {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("isTaskRegisteredAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$5
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        TaskServiceInterface taskService;
                        String appScopeKey;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        taskService = TaskManagerModule.this.getTaskService();
                        appScopeKey = TaskManagerModule.this.getAppScopeKey();
                        taskService.hasRegisteredTask((String) promise, appScopeKey);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            }
            moduleDefinitionBuilder52.getAsyncFunctions().put("isTaskRegisteredAsync", intAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder62 = moduleDefinitionBuilder2;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                TypeConverterProvider converters3 = moduleDefinitionBuilder62.getConverters();
                AnyType[] anyTypeArr6 = new AnyType[1];
                AnyType anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType4 == null) {
                    try {
                        Result.Companion companion7 = Result.INSTANCE;
                        m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$9
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th5) {
                        Result.Companion companion8 = Result.INSTANCE;
                        m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
                    }
                    Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                    if (m13473exceptionOrNullimpl4 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl4);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                        m13470constructorimpl4 = null;
                    }
                    TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
                    if (typeDescriptor4 == null) {
                        typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType4 = new AnyType(typeDescriptor4, converters3);
                }
                anyTypeArr6[0] = anyType4;
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("getTaskOptionsAsync", anyTypeArr6, new Function1<Object[], Bundle>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$10
                    @Override // kotlin.jvm.functions.Function1
                    public final Bundle invoke(Object[] objArr) {
                        TaskServiceInterface taskService;
                        String appScopeKey;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        taskService = TaskManagerModule.this.getTaskService();
                        appScopeKey = TaskManagerModule.this.getAppScopeKey();
                        return taskService.getTaskOptions(str, appScopeKey);
                    }
                });
            } else {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getTaskOptionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$8
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        TaskServiceInterface taskService;
                        String appScopeKey;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        taskService = TaskManagerModule.this.getTaskService();
                        appScopeKey = TaskManagerModule.this.getAppScopeKey();
                        taskService.getTaskOptions((String) promise, appScopeKey);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            }
            moduleDefinitionBuilder62.getAsyncFunctions().put("getTaskOptionsAsync", untypedAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder72 = moduleDefinitionBuilder2;
            AnyType[] anyTypeArr32 = new AnyType[0];
            Function1<Object[], List<? extends Bundle>> function132 = new Function1<Object[], List<? extends Bundle>>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$11
                @Override // kotlin.jvm.functions.Function1
                public final List<? extends Bundle> invoke(Object[] it) {
                    TaskServiceInterface taskService;
                    String appScopeKey;
                    Intrinsics.checkNotNullParameter(it, "it");
                    taskService = TaskManagerModule.this.getTaskService();
                    appScopeKey = TaskManagerModule.this.getAppScopeKey();
                    List<Bundle> tasksForAppScopeKey = taskService.getTasksForAppScopeKey(appScopeKey);
                    Intrinsics.checkNotNullExpressionValue(tasksForAppScopeKey, "getTasksForAppScopeKey(...)");
                    return tasksForAppScopeKey;
                }
            };
            moduleDefinitionBuilder72.getAsyncFunctions().put("getRegisteredTasksAsync", !Intrinsics.areEqual(List.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr32, function132) : Intrinsics.areEqual(List.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr32, function132) : Intrinsics.areEqual(List.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr32, function132) : Intrinsics.areEqual(List.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr32, function132) : Intrinsics.areEqual(List.class, String.class) ? new StringAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr32, function132) : new UntypedAsyncFunctionComponent("getRegisteredTasksAsync", anyTypeArr32, function132));
            ModuleDefinitionBuilder moduleDefinitionBuilder82 = moduleDefinitionBuilder2;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                TypeConverterProvider converters4 = moduleDefinitionBuilder82.getConverters();
                AnyType[] anyTypeArr7 = new AnyType[1];
                AnyType anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType5 == null) {
                    try {
                        Result.Companion companion9 = Result.INSTANCE;
                        m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$13
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th6) {
                        Result.Companion companion10 = Result.INSTANCE;
                        m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
                    }
                    Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
                    if (m13473exceptionOrNullimpl5 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl5);
                    }
                    TypeDescriptor typeDescriptor5 = (TypeDescriptor) (Result.m13476isFailureimpl(m13470constructorimpl5) ? null : m13470constructorimpl5);
                    if (typeDescriptor5 == null) {
                        typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType5 = new AnyType(typeDescriptor5, converters4);
                }
                anyTypeArr7[0] = anyType5;
                Function1<Object[], Unit> function16 = new Function1<Object[], Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$14
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        TaskServiceInterface taskService;
                        String appScopeKey;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        taskService = TaskManagerModule.this.getTaskService();
                        appScopeKey = TaskManagerModule.this.getAppScopeKey();
                        taskService.unregisterTask(str, appScopeKey, null);
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent2 = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr7, function16) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr7, function16) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr7, function16) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr7, function16) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr7, function16) : new UntypedAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr7, function16);
            } else {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("unregisterTaskAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$12
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        TaskServiceInterface taskService;
                        String appScopeKey;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        taskService = TaskManagerModule.this.getTaskService();
                        appScopeKey = TaskManagerModule.this.getAppScopeKey();
                        taskService.unregisterTask((String) promise, appScopeKey, null);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            }
            moduleDefinitionBuilder82.getAsyncFunctions().put("unregisterTaskAsync", intAsyncFunctionComponent2);
            ModuleDefinitionBuilder moduleDefinitionBuilder92 = moduleDefinitionBuilder2;
            AnyType[] anyTypeArr42 = new AnyType[0];
            Function1<Object[], Unit> function142 = new Function1<Object[], Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$lambda$11$$inlined$AsyncFunction$15
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] it) {
                    TaskServiceInterface taskService;
                    String appScopeKey;
                    Intrinsics.checkNotNullParameter(it, "it");
                    taskService = TaskManagerModule.this.getTaskService();
                    appScopeKey = TaskManagerModule.this.getAppScopeKey();
                    taskService.unregisterAllTasksForAppScopeKey(appScopeKey);
                    return Unit.INSTANCE;
                }
            };
            moduleDefinitionBuilder92.getAsyncFunctions().put("unregisterAllTasksAsync", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr42, function142) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr42, function142) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr42, function142) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr42, function142) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr42, function142) : new UntypedAsyncFunctionComponent("unregisterAllTasksAsync", anyTypeArr42, function142));
            moduleDefinitionBuilder2.OnStartObserving(new Function0<Unit>() { // from class: expo.modules.taskManager.TaskManagerModule$definition$1$10
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Handler handler = new Handler(Looper.getMainLooper());
                    final TaskManagerModule taskManagerModule2 = TaskManagerModule.this;
                    handler.postDelayed(new Runnable() { // from class: expo.modules.taskManager.TaskManagerModule$definition$1$10.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            TaskManagerInterface taskManagerInternal;
                            taskManagerInternal = TaskManagerModule.this.getTaskManagerInternal();
                            if (taskManagerInternal != null) {
                                taskManagerInternal.flushQueuedEvents();
                            }
                        }
                    }, 1000L);
                }
            });
            return moduleDefinitionBuilder2.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAppScopeKey() {
        TaskManagerInterface taskManagerInternal = getTaskManagerInternal();
        if (taskManagerInternal == null) {
            throw new Exceptions.ModuleNotFound(Reflection.getOrCreateKotlinClass(TaskManagerInterface.class));
        }
        String appScopeKey = taskManagerInternal.getAppScopeKey();
        Intrinsics.checkNotNullExpressionValue(appScopeKey, "getAppScopeKey(...)");
        return appScopeKey;
    }
}
