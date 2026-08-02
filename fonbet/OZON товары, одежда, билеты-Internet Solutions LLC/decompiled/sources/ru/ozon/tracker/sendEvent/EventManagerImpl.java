package ru.ozon.tracker.sendEvent;

import Ae.C2399j;
import Ae.C2408n0;
import Am.C2438a;
import Ib.a;
import Sc.InterfaceC3999a;
import Sc.r;
import Sc.s;
import android.annotation.SuppressLint;
import androidx.recyclerview.widget.LinearLayoutManager;
import bk0.g;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dk0.C6214a;
import fd.InterfaceC6511n;
import fi0.i;
import fi0.v;
import fi0.x;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import mi0.InterfaceC8336f;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.EventManager;
import ru.ozon.tracker.sendEvent.EventUpdateHandler;
import ru.ozon.tracker.sendEvent.SendEventThrowableHandler;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import ru.ozon.tracker.sendEvent.runner.EventDelayedTaskLauncher;
import xe.C10727i;
import xe.H0;
import xe.I;
import xe.J;
import xe.M;
import xe.N0;

@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u008f\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012¢\u0006\u0004\b\u001f\u0010 J\u008f\u0001\u0010;\u001a\u00020:2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/2\b\u00102\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u000107H\u0017¢\u0006\u0004\b;\u0010<J£\u0001\u0010;\u001a\u00020:2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010@\u001a\u0004\u0018\u00010?2\b\u00100\u001a\u0004\u0018\u00010/2\b\u00102\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u000107H\u0017¢\u0006\u0004\b;\u0010AJ\u00ad\u0001\u0010;\u001a\u00020:2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010@\u001a\u0004\u0018\u00010?2\b\u00100\u001a\u0004\u0018\u00010/2\b\u00102\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u0001072\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\b;\u0010DJ/\u0010G\u001a\u00020:2\b\u0010,\u001a\u0004\u0018\u00010+2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020F\u0018\u00010EH\u0016¢\u0006\u0004\bG\u0010HJy\u0010R\u001a\u00020:2\u0006\u0010\"\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010I\u001a\u0004\u0018\u00010+2\b\u0010J\u001a\u0004\u0018\u00010+2\b\u0010K\u001a\u0004\u0018\u00010+2\b\u0010L\u001a\u0004\u0018\u00010+2\b\u0010M\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJg\u0010R\u001a\u00020:2\u0006\u0010\"\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010I\u001a\u0004\u0018\u00010+2\b\u0010J\u001a\u0004\u0018\u00010+2\b\u0010K\u001a\u0004\u0018\u00010+2\b\u0010L\u001a\u0004\u0018\u00010+2\b\u0010M\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010O\u001a\u0004\u0018\u00010NH\u0017¢\u0006\u0004\bR\u0010TJq\u0010R\u001a\u00020:2\u0006\u0010\"\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010I\u001a\u0004\u0018\u00010+2\b\u0010J\u001a\u0004\u0018\u00010+2\b\u0010K\u001a\u0004\u0018\u00010+2\b\u0010L\u001a\u0004\u0018\u00010+2\b\u0010M\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010O\u001a\u0004\u0018\u00010NH\u0017¢\u0006\u0004\bR\u0010UJ\u0017\u0010V\u001a\u00020:2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020:2\u0006\u0010>\u001a\u00020=H\u0017¢\u0006\u0004\bX\u0010WJ\u000f\u0010Y\u001a\u00020:H\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020:H\u0016¢\u0006\u0004\b[\u0010ZJ{\u0010\\\u001a\u00020:2\u0006\u0010\"\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010I\u001a\u0004\u0018\u00010+2\b\u0010J\u001a\u0004\u0018\u00010+2\b\u0010K\u001a\u0004\u0018\u00010+2\b\u0010L\u001a\u0004\u0018\u00010+2\b\u0010M\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020:H\u0082@¢\u0006\u0004\b^\u0010_J\u0018\u0010b\u001a\u00020:2\u0006\u0010a\u001a\u00020`H\u0083@¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020:H\u0083@¢\u0006\u0004\bd\u0010_J\u0018\u0010f\u001a\u00020e2\u0006\u0010>\u001a\u00020=H\u0083@¢\u0006\u0004\bf\u0010gJ\u0019\u0010h\u001a\u0004\u0018\u00010+2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bh\u0010iJ!\u0010j\u001a\u00020:2\u0006\u0010\"\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\bj\u0010kJ6\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000m\"\u0004\b\u0000\u0010l*\b\u0012\u0004\u0012\u00028\u00000m2\u000e\b\u0002\u0010o\u001a\b\u0012\u0004\u0012\u00020e0nH\u0082@¢\u0006\u0004\bp\u0010qR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010sR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010tR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010uR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010vR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010wR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010xR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010yR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010zR$\u0010\u0080\u0001\u001a\n {*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR'\u0010\u0084\u0001\u001a\n {*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010}\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R'\u0010\u0088\u0001\u001a\n {*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010}\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R-\u0010\u008b\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010+0\u0089\u0001j\u000b\u0012\u0006\u0012\u0004\u0018\u00010+`\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008d\u0001"}, d2 = {"Lru/ozon/tracker/sendEvent/EventManagerImpl;", "Lru/ozon/tracker/sendEvent/EventManager;", "Lru/ozon/tracker/sendEvent/EventMapper;", "eventMapper", "Lfi0/x;", "settings", "Lbk0/g;", "pageContainer", "Lmi0/f;", "eventsLogger", "Lru/ozon/tracker/sendEvent/CurrentPageInternalProvider;", "currentPageProvider", "Lru/ozon/tracker/process/lifecycle/a;", "lifecycleActionExecutor", "Lxe/M;", "trackerScope", "Lxe/I;", "dispatcher", "LIb/a;", "Lru/ozon/tracker/sendEvent/runner/EventDelayedTaskLauncher;", "eventDelayedTaskLauncherLazy", "Lru/ozon/tracker/sendEvent/repository/EventRepository;", "eventRepositoryLazy", "Lru/ozon/tracker/sendEvent/EventUpdateHandler;", "eventUpdateHandler", "Lfi0/v;", "backgroundModeConfig", "Lxe/J;", "globalExceptionHandler", "Lru/ozon/tracker/sendEvent/SendEventThrowableHandler;", "sendEventThrowableHandlerLazy", "<init>", "(Lru/ozon/tracker/sendEvent/EventMapper;Lfi0/x;Lbk0/g;Lmi0/f;Lru/ozon/tracker/sendEvent/CurrentPageInternalProvider;Lru/ozon/tracker/process/lifecycle/a;Lxe/M;Lxe/I;LIb/a;LIb/a;Lru/ozon/tracker/sendEvent/EventUpdateHandler;Lfi0/v;Lxe/J;LIb/a;)V", "Lru/ozon/tracker/sendEvent/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Lru/ozon/tracker/model/EventEntity$Obj;", "obj", "Lru/ozon/tracker/model/EventEntity$Properties;", "properties", "Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "custom", "Lru/ozon/tracker/model/EventEntity$Widget;", "widget", "", "uuid", "Lru/ozon/tracker/model/EventEntity$Form;", DynamicElementDTO.FORM, "Lru/ozon/tracker/model/EventEntity$Posting;", "posting", "Lru/ozon/tracker/model/EventEntity$Filter;", "filter", "Lru/ozon/tracker/model/EventEntity$Sale;", "sale", "Lru/ozon/tracker/model/EventEntity$Review;", "review", "", "discountRequestId", "advertisementCampaignId", "", "sendEvent", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Widget;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lru/ozon/tracker/sendEvent/Page;", "page", "Lru/ozon/tracker/model/EventEntity$EventError;", "eventError", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lru/ozon/tracker/model/EventEntity$Courier;", "courier", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/tracker/model/EventEntity$Courier;)V", "", "", "sendCustomEvent", "(Ljava/lang/String;Ljava/util/Map;)V", "pageToken", "widgetToken", "sliceToken", "cellToken", "userToken", "", "pageTimestamp", "", "isFastEvent", "sendTrinityEvent", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Z)V", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "sendPageView", "(Lru/ozon/tracker/sendEvent/Page;)V", "setPageView", "forceSendEvents", "()V", "clearAllEvents", "sendTrinityEventInternal", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "syncForceSendEvents", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/tracker/sendEvent/EventUpdateHandler$UpdateState;", "updateState", "sendBatches", "(Lru/ozon/tracker/sendEvent/EventUpdateHandler$UpdateState;Lkotlin/coroutines/d;)Ljava/lang/Object;", "clearObsoleteEvents", "Lru/ozon/tracker/db/entities/DbEvent;", "createPageView", "(Lru/ozon/tracker/sendEvent/Page;Lkotlin/coroutines/d;)Ljava/lang/Object;", "takeTrackCampaignUuid", "(Lru/ozon/tracker/sendEvent/ActionType;)Ljava/lang/String;", "updateTrackCampaignUuid", "(Lru/ozon/tracker/sendEvent/ActionType;Ljava/lang/String;)V", "T", "LSc/r;", "", "batch", "mapToHandled-1vKEnOE", "(Ljava/lang/Object;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mapToHandled", "Lru/ozon/tracker/sendEvent/EventMapper;", "Lfi0/x;", "Lbk0/g;", "Lmi0/f;", "Lru/ozon/tracker/sendEvent/CurrentPageInternalProvider;", "Lru/ozon/tracker/process/lifecycle/a;", "Lxe/M;", "Lxe/I;", "kotlin.jvm.PlatformType", "eventRepository$delegate", "LIb/a;", "getEventRepository", "()Lru/ozon/tracker/sendEvent/repository/EventRepository;", "eventRepository", "sendEventExceptionHandler$delegate", "getSendEventExceptionHandler", "()Lru/ozon/tracker/sendEvent/SendEventThrowableHandler;", "sendEventExceptionHandler", "eventDelayedTaskLauncher$delegate", "getEventDelayedTaskLauncher", "()Lru/ozon/tracker/sendEvent/runner/EventDelayedTaskLauncher;", "eventDelayedTaskLauncher", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/lifecycle/AtomicReference;", "trackCampaignUuidReference", "Ljava/util/concurrent/atomic/AtomicReference;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes7.dex */
public final class EventManagerImpl implements EventManager {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(EventManagerImpl.class, "eventRepository", "getEventRepository()Lru/ozon/tracker/sendEvent/repository/EventRepository;", 0), C2438a.c(EventManagerImpl.class, "sendEventExceptionHandler", "getSendEventExceptionHandler()Lru/ozon/tracker/sendEvent/SendEventThrowableHandler;", 0), C2438a.c(EventManagerImpl.class, "eventDelayedTaskLauncher", "getEventDelayedTaskLauncher()Lru/ozon/tracker/sendEvent/runner/EventDelayedTaskLauncher;", 0)};

    @NotNull
    private final CurrentPageInternalProvider currentPageProvider;

    @NotNull
    private final I dispatcher;

    /* renamed from: eventDelayedTaskLauncher$delegate, reason: from kotlin metadata */
    @NotNull
    private final a eventDelayedTaskLauncher;

    @NotNull
    private final EventMapper eventMapper;

    /* renamed from: eventRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final a eventRepository;

    @NotNull
    private final InterfaceC8336f eventsLogger;

    @NotNull
    private final ru.ozon.tracker.process.lifecycle.a lifecycleActionExecutor;

    @NotNull
    private final g pageContainer;

    /* renamed from: sendEventExceptionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final a sendEventExceptionHandler;

    @NotNull
    private final x settings;

    @NotNull
    private final AtomicReference<String> trackCampaignUuidReference;

    @NotNull
    private final M trackerScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$1", f = "EventManager.kt", l = {199, 201}, m = "invokeSuspend")
    /* renamed from: ru.ozon.tracker.sendEvent.EventManagerImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return EventManagerImpl.this.new AnonymousClass1(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (r9.clear(r8) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        
            if (r9.resetPendingStatus(r8) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                if (EventManagerImpl.this.settings.A().b() == 0) {
                    EventRepository eventRepository = EventManagerImpl.this.getEventRepository();
                    this.label = 1;
                } else {
                    EventRepository eventRepository2 = EventManagerImpl.this.getEventRepository();
                    this.label = 2;
                }
            } else {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$2", f = "EventManager.kt", l = {207}, m = "invokeSuspend")
    /* renamed from: ru.ozon.tracker.sendEvent.EventManagerImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$2$1", f = "EventManager.kt", l = {209}, m = "invokeSuspend")
        /* renamed from: ru.ozon.tracker.sendEvent.EventManagerImpl$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventManagerImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventManagerImpl eventManagerImpl, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = eventManagerImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                try {
                    if (i11 == 0) {
                        s.b(obj);
                        EventManagerImpl eventManagerImpl = this.this$0;
                        this.label = 1;
                        if (eventManagerImpl.syncForceSendEvents(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    Unit unit = Unit.f71690a;
                    r.Companion companion = r.INSTANCE;
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th2) {
                    r.Companion companion2 = r.INSTANCE;
                    s.a(th2);
                }
                return Unit.f71690a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return EventManagerImpl.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                ru.ozon.tracker.process.lifecycle.a aVar2 = EventManagerImpl.this.lifecycleActionExecutor;
                ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.BACKGROUND;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EventManagerImpl.this, null);
                this.label = 1;
                if (aVar2.c(applicationLifecycleState, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$3", f = "EventManager.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    /* renamed from: ru.ozon.tracker.sendEvent.EventManagerImpl$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$3$1", f = "EventManager.kt", l = {217}, m = "invokeSuspend")
        /* renamed from: ru.ozon.tracker.sendEvent.EventManagerImpl$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventManagerImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventManagerImpl eventManagerImpl, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = eventManagerImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                try {
                    if (i11 == 0) {
                        s.b(obj);
                        EventManagerImpl eventManagerImpl = this.this$0;
                        this.label = 1;
                        if (eventManagerImpl.syncForceSendEvents(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    Unit unit = Unit.f71690a;
                    r.Companion companion = r.INSTANCE;
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th2) {
                    r.Companion companion2 = r.INSTANCE;
                    s.a(th2);
                }
                return Unit.f71690a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return EventManagerImpl.this.new AnonymousClass3(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                ru.ozon.tracker.process.lifecycle.a aVar2 = EventManagerImpl.this.lifecycleActionExecutor;
                ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.FOREGROUND;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EventManagerImpl.this, null);
                this.label = 1;
                if (aVar2.c(applicationLifecycleState, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$4", f = "EventManager.kt", l = {225}, m = "invokeSuspend")
    /* renamed from: ru.ozon.tracker.sendEvent.EventManagerImpl$4, reason: invalid class name */
    static final class AnonymousClass4 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ EventUpdateHandler $eventUpdateHandler;
        final /* synthetic */ J $globalExceptionHandler;
        final /* synthetic */ kotlin.jvm.internal.M<Throwable> $previewCause;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$4$1", f = "EventManager.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.tracker.sendEvent.EventManagerImpl$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
            final /* synthetic */ EventUpdateHandler $eventUpdateHandler;
            final /* synthetic */ J $globalExceptionHandler;
            final /* synthetic */ kotlin.jvm.internal.M<Throwable> $previewCause;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EventManagerImpl this$0;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "throwable", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
            @e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$4$1$1", f = "EventManager.kt", l = {229}, m = "invokeSuspend")
            /* renamed from: ru.ozon.tracker.sendEvent.EventManagerImpl$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C21541 extends j implements Function2<Throwable, d<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventManagerImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C21541(EventManagerImpl eventManagerImpl, d<? super C21541> dVar) {
                    super(2, dVar);
                    this.this$0 = eventManagerImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d<Unit> create(Object obj, d<?> dVar) {
                    C21541 c21541 = new C21541(this.this$0, dVar);
                    c21541.L$0 = obj;
                    return c21541;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        s.b(obj);
                        Throwable th2 = (Throwable) this.L$0;
                        SendEventThrowableHandler sendEventExceptionHandler = this.this$0.getSendEventExceptionHandler();
                        this.label = 1;
                        if (SendEventThrowableHandler.DefaultImpls.handleThrowable$default(sendEventExceptionHandler, th2, null, this, 2, null) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return Unit.f71690a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Throwable th2, d<? super Unit> dVar) {
                    return ((C21541) create(th2, dVar)).invokeSuspend(Unit.f71690a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/tracker/sendEvent/EventUpdateHandler$UpdateState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$4$1$2", f = "EventManager.kt", l = {234}, m = "invokeSuspend")
            /* renamed from: ru.ozon.tracker.sendEvent.EventManagerImpl$4$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends j implements Function2<EventUpdateHandler.UpdateState, d<? super Unit>, Object> {
                final /* synthetic */ J $globalExceptionHandler;
                final /* synthetic */ kotlin.jvm.internal.M<Throwable> $previewCause;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventManagerImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventManagerImpl eventManagerImpl, kotlin.jvm.internal.M<Throwable> m11, J j11, d<? super AnonymousClass2> dVar) {
                    super(2, dVar);
                    this.this$0 = eventManagerImpl;
                    this.$previewCause = m11;
                    this.$globalExceptionHandler = j11;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d<Unit> create(Object obj, d<?> dVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$previewCause, this.$globalExceptionHandler, dVar);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Throwable] */
                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    boolean isEquals;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    try {
                        if (i11 == 0) {
                            s.b(obj);
                            EventUpdateHandler.UpdateState updateState = (EventUpdateHandler.UpdateState) this.L$0;
                            EventManagerImpl eventManagerImpl = this.this$0;
                            this.label = 1;
                            if (eventManagerImpl.sendBatches(updateState, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                        }
                    } catch (IOException unused) {
                    } catch (CancellationException e11) {
                        throw e11;
                    } catch (Throwable th2) {
                        isEquals = EventManagerKt.isEquals(th2, this.$previewCause.f71787a);
                        if (!isEquals) {
                            this.$globalExceptionHandler.handleException(getContext(), th2);
                            this.$previewCause.f71787a = th2;
                        }
                    }
                    return Unit.f71690a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EventUpdateHandler.UpdateState updateState, d<? super Unit> dVar) {
                    return ((AnonymousClass2) create(updateState, dVar)).invokeSuspend(Unit.f71690a);
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "cause", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
            @e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$4$1$3", f = "EventManager.kt", l = {}, m = "invokeSuspend")
            /* renamed from: ru.ozon.tracker.sendEvent.EventManagerImpl$4$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends j implements InterfaceC6511n<CoroutineContext, Throwable, d<? super Unit>, Object> {
                final /* synthetic */ J $globalExceptionHandler;
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(J j11, d<? super AnonymousClass3> dVar) {
                    super(3, dVar);
                    this.$globalExceptionHandler = j11;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    this.$globalExceptionHandler.handleException((CoroutineContext) this.L$0, (Throwable) this.L$1);
                    return Unit.f71690a;
                }

                @Override // fd.InterfaceC6511n
                public final Object invoke(CoroutineContext coroutineContext, Throwable th2, d<? super Unit> dVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$globalExceptionHandler, dVar);
                    anonymousClass3.L$0 = coroutineContext;
                    anonymousClass3.L$1 = th2;
                    return anonymousClass3.invokeSuspend(Unit.f71690a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventUpdateHandler eventUpdateHandler, EventManagerImpl eventManagerImpl, kotlin.jvm.internal.M<Throwable> m11, J j11, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$eventUpdateHandler = eventUpdateHandler;
                this.this$0 = eventManagerImpl;
                this.$previewCause = m11;
                this.$globalExceptionHandler = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$eventUpdateHandler, this.this$0, this.$previewCause, this.$globalExceptionHandler, dVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                C2399j.C(ExtensionKt.m1669asSafeFlowdWUq8MI$default(new C2408n0(this.$eventUpdateHandler.getUpdateObservable(new C21541(this.this$0, null)), new AnonymousClass2(this.this$0, this.$previewCause, this.$globalExceptionHandler, null)), 0L, 0, new AnonymousClass3(this.$globalExceptionHandler, null), 3, null), (M) this.L$0);
                return Unit.f71690a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(EventUpdateHandler eventUpdateHandler, kotlin.jvm.internal.M<Throwable> m11, J j11, d<? super AnonymousClass4> dVar) {
            super(2, dVar);
            this.$eventUpdateHandler = eventUpdateHandler;
            this.$previewCause = m11;
            this.$globalExceptionHandler = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return EventManagerImpl.this.new AnonymousClass4(this.$eventUpdateHandler, this.$previewCause, this.$globalExceptionHandler, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                ru.ozon.tracker.process.lifecycle.a aVar2 = EventManagerImpl.this.lifecycleActionExecutor;
                ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.FOREGROUND;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$eventUpdateHandler, EventManagerImpl.this, this.$previewCause, this.$globalExceptionHandler, null);
                this.label = 1;
                if (aVar2.c(applicationLifecycleState, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass4) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public EventManagerImpl(@NotNull EventMapper eventMapper, @NotNull x settings, @NotNull g pageContainer, @NotNull InterfaceC8336f eventsLogger, @NotNull CurrentPageInternalProvider currentPageProvider, @NotNull ru.ozon.tracker.process.lifecycle.a lifecycleActionExecutor, @NotNull M trackerScope, @NotNull I dispatcher, @NotNull a<EventDelayedTaskLauncher> eventDelayedTaskLauncherLazy, @NotNull a<EventRepository> eventRepositoryLazy, @NotNull EventUpdateHandler eventUpdateHandler, @NotNull v backgroundModeConfig, @NotNull J globalExceptionHandler, @NotNull a<SendEventThrowableHandler> sendEventThrowableHandlerLazy) {
        Intrinsics.checkNotNullParameter(eventMapper, "eventMapper");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(pageContainer, "pageContainer");
        Intrinsics.checkNotNullParameter(eventsLogger, "eventsLogger");
        Intrinsics.checkNotNullParameter(currentPageProvider, "currentPageProvider");
        Intrinsics.checkNotNullParameter(lifecycleActionExecutor, "lifecycleActionExecutor");
        Intrinsics.checkNotNullParameter(trackerScope, "trackerScope");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(eventDelayedTaskLauncherLazy, "eventDelayedTaskLauncherLazy");
        Intrinsics.checkNotNullParameter(eventRepositoryLazy, "eventRepositoryLazy");
        Intrinsics.checkNotNullParameter(eventUpdateHandler, "eventUpdateHandler");
        Intrinsics.checkNotNullParameter(backgroundModeConfig, "backgroundModeConfig");
        Intrinsics.checkNotNullParameter(globalExceptionHandler, "globalExceptionHandler");
        Intrinsics.checkNotNullParameter(sendEventThrowableHandlerLazy, "sendEventThrowableHandlerLazy");
        this.eventMapper = eventMapper;
        this.settings = settings;
        this.pageContainer = pageContainer;
        this.eventsLogger = eventsLogger;
        this.currentPageProvider = currentPageProvider;
        this.lifecycleActionExecutor = lifecycleActionExecutor;
        this.trackerScope = trackerScope;
        this.dispatcher = dispatcher;
        this.eventRepository = eventRepositoryLazy;
        this.sendEventExceptionHandler = sendEventThrowableHandlerLazy;
        this.eventDelayedTaskLauncher = eventDelayedTaskLauncherLazy;
        this.trackCampaignUuidReference = new AtomicReference<>(null);
        C10727i.c(trackerScope, null, null, new AnonymousClass1(null), 3);
        if (backgroundModeConfig.c()) {
            C10727i.c(trackerScope, null, null, new AnonymousClass2(null), 3);
            C10727i.c(trackerScope, null, null, new AnonymousClass3(null), 3);
        }
        C10727i.c(trackerScope, null, null, new AnonymousClass4(eventUpdateHandler, new kotlin.jvm.internal.M(), globalExceptionHandler, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(2:20|(1:22))|12|13)|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0027, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r0 = Sc.r.INSTANCE;
        Sc.s.a(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearObsoleteEvents(d<? super Unit> dVar) {
        EventManagerImpl$clearObsoleteEvents$1 eventManagerImpl$clearObsoleteEvents$1;
        int i11;
        if (dVar instanceof EventManagerImpl$clearObsoleteEvents$1) {
            eventManagerImpl$clearObsoleteEvents$1 = (EventManagerImpl$clearObsoleteEvents$1) dVar;
            int i12 = eventManagerImpl$clearObsoleteEvents$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventManagerImpl$clearObsoleteEvents$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eventManagerImpl$clearObsoleteEvents$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eventManagerImpl$clearObsoleteEvents$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    i A11 = this.settings.A();
                    if (A11.b() != 0) {
                        r.Companion companion = r.INSTANCE;
                        DateTime a11 = A11.a();
                        EventRepository eventRepository = getEventRepository();
                        eventManagerImpl$clearObsoleteEvents$1.label = 1;
                        if (eventRepository.clearUnderDate(a11, eventManagerImpl$clearObsoleteEvents$1) == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                Unit unit = Unit.f71690a;
                r.Companion companion2 = r.INSTANCE;
                return Unit.f71690a;
            }
        }
        eventManagerImpl$clearObsoleteEvents$1 = new EventManagerImpl$clearObsoleteEvents$1(this, dVar);
        Object obj2 = eventManagerImpl$clearObsoleteEvents$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eventManagerImpl$clearObsoleteEvents$1.label;
        if (i11 != 0) {
        }
        Unit unit2 = Unit.f71690a;
        r.Companion companion22 = r.INSTANCE;
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createPageView(Page page, d<? super DbEvent> dVar) {
        Object createEventEntity;
        EventMapper eventMapper = this.eventMapper;
        EventEntity.Obj obj = new EventEntity.Obj("page", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483646, null);
        ActionType.PAGE_VIEW page_view = ActionType.PAGE_VIEW.INSTANCE;
        createEventEntity = eventMapper.createEventEntity((r41 & 1) != 0 ? null : null, page_view, takeTrackCampaignUuid(page_view), (r41 & 8) != 0 ? null : obj, (r41 & 16) != 0 ? null : null, (r41 & 32) != 0 ? null : null, (r41 & 64) != 0 ? null : null, (r41 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : page, (r41 & 256) != 0 ? null : null, (r41 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : null, (r41 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : null, (r41 & 2048) != 0 ? null : null, (r41 & 4096) != 0 ? null : null, (r41 & 8192) != 0 ? null : null, (r41 & 16384) != 0 ? null : null, (32768 & r41) != 0 ? null : null, (r41 & 65536) != 0 ? null : null, dVar);
        return createEventEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventDelayedTaskLauncher getEventDelayedTaskLauncher() {
        return (EventDelayedTaskLauncher) C6214a.a(this.eventDelayedTaskLauncher, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventRepository getEventRepository() {
        return (EventRepository) C6214a.a(this.eventRepository, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SendEventThrowableHandler getSendEventExceptionHandler() {
        return (SendEventThrowableHandler) C6214a.a(this.sendEventExceptionHandler, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: mapToHandled-1vKEnOE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object m1666mapToHandled1vKEnOE(Object obj, List<DbEvent> list, d<? super r<? extends T>> dVar) {
        EventManagerImpl$mapToHandled$1 eventManagerImpl$mapToHandled$1;
        int i11;
        if (dVar instanceof EventManagerImpl$mapToHandled$1) {
            eventManagerImpl$mapToHandled$1 = (EventManagerImpl$mapToHandled$1) dVar;
            int i12 = eventManagerImpl$mapToHandled$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventManagerImpl$mapToHandled$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = eventManagerImpl$mapToHandled$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eventManagerImpl$mapToHandled$1.label;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = eventManagerImpl$mapToHandled$1.L$0;
                    s.b(obj2);
                    return obj3;
                }
                s.b(obj2);
                Throwable b11 = r.b(obj);
                if (b11 != null) {
                    SendEventThrowableHandler sendEventExceptionHandler = getSendEventExceptionHandler();
                    eventManagerImpl$mapToHandled$1.L$0 = obj;
                    eventManagerImpl$mapToHandled$1.label = 1;
                    if (sendEventExceptionHandler.handleThrowable(b11, list, eventManagerImpl$mapToHandled$1) == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }
        eventManagerImpl$mapToHandled$1 = new EventManagerImpl$mapToHandled$1(this, dVar);
        Object obj22 = eventManagerImpl$mapToHandled$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eventManagerImpl$mapToHandled$1.label;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: mapToHandled-1vKEnOE$default, reason: not valid java name */
    static Object m1667mapToHandled1vKEnOE$default(EventManagerImpl eventManagerImpl, Object obj, List list, d dVar, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            list = K.f71697a;
        }
        return eventManagerImpl.m1666mapToHandled1vKEnOE(obj, list, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendBatches(EventUpdateHandler.UpdateState updateState, d<? super Unit> dVar) {
        Object f7 = C10727i.f(this.dispatcher.plus(N0.f105411a), new EventManagerImpl$sendBatches$2(this, updateState, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    private final void sendTrinityEventInternal(ActionType actionType, Cell.CustomCell custom, Page page, String pageToken, String widgetToken, String sliceToken, String cellToken, String userToken, String uuid, Long pageTimestamp, Boolean isFastEvent) {
        boolean d11 = Intrinsics.d(isFastEvent, Boolean.TRUE);
        ((H0) C10727i.c(this.trackerScope, null, null, new EventManagerImpl$sendTrinityEventInternal$job$1(d11, custom, this, actionType, uuid, page, pageToken, widgetToken, sliceToken, cellToken, userToken, pageTimestamp, isFastEvent, null), 3)).y(new EventManagerImpl$sendTrinityEventInternal$1(d11, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object syncForceSendEvents(d<? super Unit> dVar) {
        Object sendBatches = sendBatches(EventUpdateHandler.UpdateState.FORCE, dVar);
        return sendBatches == Wc.a.COROUTINE_SUSPENDED ? sendBatches : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String takeTrackCampaignUuid(ActionType actionType) {
        if (Intrinsics.d(actionType, ActionType.PAGE_VIEW.INSTANCE)) {
            return this.trackCampaignUuidReference.getAndSet(null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTrackCampaignUuid(ActionType actionType, String uuid) {
        if (Intrinsics.d(actionType, ActionType.TRACK_CAMPAIGN.INSTANCE)) {
            this.trackCampaignUuidReference.set(uuid);
        }
    }

    @Override // ru.ozon.tracker.sendEvent.EventManager
    public void clearAllEvents() {
        C10727i.c(this.trackerScope, null, null, new EventManagerImpl$clearAllEvents$1(this, null), 3);
    }

    @Override // ru.ozon.tracker.sendEvent.EventManager
    public void forceSendEvents() {
        C10727i.c(this.trackerScope, null, null, new EventManagerImpl$forceSendEvents$1(this, null), 3);
    }

    @Override // ru.ozon.tracker.sendEvent.EventManager
    public void sendCustomEvent(String uuid, Map<String, ? extends Object> custom) {
        C10727i.c(this.trackerScope, null, null, new EventManagerImpl$sendCustomEvent$1(this, uuid, custom, null), 3);
    }

    @Override // ru.ozon.tracker.sendEvent.EventManager
    @InterfaceC3999a
    public void sendEvent(@NotNull ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell custom, EventEntity.Widget widget, String uuid, EventEntity.Form form, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer discountRequestId, Integer advertisementCampaignId) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        EventManager.DefaultImpls.sendEvent$default(this, actionType, obj, properties, custom, widget, this.currentPageProvider.getCurrentPage(), uuid, form, null, posting, filter, sale, review, discountRequestId, advertisementCampaignId, null, 33024, null);
    }

    @Override // ru.ozon.tracker.sendEvent.EventManager
    public void sendPageView(@NotNull Page page) {
        Intrinsics.checkNotNullParameter(page, "page");
        C10727i.c(this.trackerScope, null, null, new EventManagerImpl$sendPageView$1(this, page, null), 3);
    }

    @Override // ru.ozon.tracker.sendEvent.EventManager
    public void sendTrinityEvent(@NotNull ActionType actionType, Cell.CustomCell custom, Page page, String pageToken, String widgetToken, String sliceToken, String cellToken, String userToken, String uuid, Long pageTimestamp, boolean isFastEvent) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        sendTrinityEventInternal(actionType, custom, page, pageToken, widgetToken, sliceToken, cellToken, userToken, uuid, pageTimestamp, Boolean.valueOf(isFastEvent));
    }

    @Override // ru.ozon.tracker.sendEvent.EventManager
    @InterfaceC3999a
    public void setPageView(@NotNull Page page) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.pageContainer.b(page);
    }

    @Override // ru.ozon.tracker.sendEvent.EventManager
    @InterfaceC3999a
    public /* synthetic */ void sendEvent(ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell custom, EventEntity.Widget widget, Page page, String uuid, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer discountRequestId, Integer advertisementCampaignId) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        EventManager.DefaultImpls.sendEvent$default(this, actionType, obj, properties, custom, widget, page, uuid, form, null, posting, filter, sale, review, discountRequestId, advertisementCampaignId, null, 33024, null);
    }

    @Override // ru.ozon.tracker.sendEvent.EventManager
    @InterfaceC3999a
    public void sendTrinityEvent(@NotNull ActionType actionType, Cell.CustomCell custom, String pageToken, String widgetToken, String sliceToken, String cellToken, String userToken, String uuid, Long pageTimestamp) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        sendTrinityEventInternal(actionType, custom, this.currentPageProvider.getCurrentPage(), pageToken, widgetToken, sliceToken, cellToken, userToken, uuid, pageTimestamp, null);
    }

    @Override // ru.ozon.tracker.sendEvent.EventManager
    public void sendEvent(@NotNull ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell custom, EventEntity.Widget widget, Page page, String uuid, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer discountRequestId, Integer advertisementCampaignId, EventEntity.Courier courier) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        C10727i.c(this.trackerScope, null, null, new EventManagerImpl$sendEvent$1(this, actionType, uuid, obj, properties, custom, widget, page, form, eventError, posting, filter, sale, review, discountRequestId, advertisementCampaignId, courier, null), 3);
    }

    @Override // ru.ozon.tracker.sendEvent.EventManager
    @InterfaceC3999a
    public /* synthetic */ void sendTrinityEvent(ActionType actionType, Cell.CustomCell custom, Page page, String pageToken, String widgetToken, String sliceToken, String cellToken, String userToken, String uuid, Long pageTimestamp) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        sendTrinityEventInternal(actionType, custom, page, pageToken, widgetToken, sliceToken, cellToken, userToken, uuid, pageTimestamp, null);
    }
}
