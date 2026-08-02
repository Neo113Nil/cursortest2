package expo.modules.contacts;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.ContactsContract;
import android.util.Log;
import androidx.tracing.Trace;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.gms.actions.SearchIntents;
import expo.modules.contacts.models.BaseModel;
import expo.modules.contacts.models.BirthdayModel;
import expo.modules.contacts.models.DateModel;
import expo.modules.contacts.models.DateModelKt;
import expo.modules.contacts.models.EmailModel;
import expo.modules.contacts.models.ExtraNameModel;
import expo.modules.contacts.models.ImAddressModel;
import expo.modules.contacts.models.PhoneNumberModel;
import expo.modules.contacts.models.PostalAddressModel;
import expo.modules.contacts.models.RelationshipModel;
import expo.modules.contacts.models.UrlAddressModel;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
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
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* compiled from: ContactsModule.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J&\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0002J\u0014\u0010'\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010%H\u0002J\"\u0010)\u001a\u0004\u0018\u00010\u001a2\b\u0010(\u001a\u0004\u0018\u00010%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020%0+H\u0002J*\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020%0+2\b\u0010/\u001a\u0004\u0018\u00010%H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010-2\u0006\u00101\u001a\u000202H\u0002J\u0016\u00103\u001a\u0002042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020%0+H\u0002JQ\u00105\u001a\u0004\u0018\u00010-2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020%0+2\b\u0010/\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0002\u0010<J:\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u001a0>j\b\u0012\u0004\u0012\u00020\u001a`?2\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u001a0>j\b\u0012\u0004\u0012\u00020\u001a`?2\b\u0010/\u001a\u0004\u0018\u00010%H\u0002J\u001c\u0010A\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001a0$2\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020\u0018H\u0002J\b\u0010E\u001a\u00020\u0018H\u0002J\b\u0010F\u001a\u00020\u0018H\u0002J\b\u0010G\u001a\u00020\u0018H\u0002J\b\u0010H\u001a\u00020\u0018H\u0002J\b\u0010I\u001a\u00020\u0018H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006J"}, d2 = {"Lexpo/modules/contacts/ContactsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "contactPickingPromise", "Lexpo/modules/kotlin/Promise;", "contactManipulationPromise", "contactChangeObserver", "Landroid/database/ContentObserver;", "contactsHandlerThread", "Landroid/os/HandlerThread;", "contactsHandler", "Landroid/os/Handler;", "permissionsManager", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissionsManager", "()Lexpo/modules/interfaces/permissions/Permissions;", "currentActivity", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "presentForm", "", "contact", "Lexpo/modules/contacts/Contact;", BaseJavaModule.METHOD_TYPE_PROMISE, "presentEditForm", "resolver", "Landroid/content/ContentResolver;", "getResolver", "()Landroid/content/ContentResolver;", "mutateContact", "initContact", "data", "", "", "", "getLookupKeyForContactId", "contactId", "getContactById", "keysToFetch", "", "getContactByName", "Lexpo/modules/contacts/ContactPage;", SearchIntents.EXTRA_QUERY, SDKConstants.PARAM_SORT_ORDER, "getAllContactsAsync", "options", "Lexpo/modules/contacts/ContactQuery;", "createProjectionForQuery", "Lexpo/modules/contacts/QueryArguments;", "fetchContacts", "pageOffset", "", "pageSize", "queryStrings", "", "initQueryField", "(II[Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)Lexpo/modules/contacts/ContactPage;", "sortContactsBy", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", MetricTracker.Object.INPUT, "loadContactsFrom", "cursor", "Landroid/database/Cursor;", "ensureReadPermission", "ensureWritePermission", "ensurePermissions", "startObservingContactChanges", "stopObservingContactChanges", "handleContactChange", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactsModule extends Module {
    private ContentObserver contactChangeObserver;
    private Promise contactManipulationPromise;
    private Promise contactPickingPromise;
    private Handler contactsHandler;
    private HandlerThread contactsHandlerThread;

    /* JADX INFO: Access modifiers changed from: private */
    public final Permissions getPermissionsManager() {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return permissions;
        }
        throw new Exceptions.PermissionsModuleNotFound();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getCurrentActivity() {
        return getAppContext().getThrowingActivity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0c09 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0c64 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0c7f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0c85 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0b7f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0a0a A[Catch: all -> 0x0ec8, TRY_LEAVE, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0af2 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0afb A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0a94 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0ab5 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0996 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0918 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0891 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0767 A[Catch: all -> 0x0ec8, TRY_LEAVE, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x05db A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0642 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0657 A[Catch: all -> 0x0ec8, TRY_LEAVE, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06e1 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0702 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0754 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05e3 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0563 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04f8 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0519 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x098e A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x09f5 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0db4 A[Catch: all -> 0x0ec8, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0dc7 A[Catch: all -> 0x0ec8, TRY_LEAVE, TryCatch #5 {all -> 0x0ec8, blocks: (B:3:0x002d, B:6:0x0083, B:7:0x0180, B:9:0x0196, B:10:0x0293, B:401:0x02f1, B:403:0x02f7, B:404:0x030c, B:407:0x0313, B:410:0x0322, B:411:0x0318, B:12:0x0328, B:14:0x034e, B:15:0x044b, B:19:0x0543, B:316:0x058f, B:318:0x0595, B:319:0x05aa, B:322:0x05b1, B:325:0x05c0, B:326:0x05b6, B:21:0x05c8, B:23:0x05db, B:24:0x062a, B:26:0x0642, B:27:0x073d, B:29:0x0754, B:30:0x0857, B:33:0x08f4, B:36:0x097b, B:38:0x098e, B:39:0x09dd, B:41:0x09f5, B:42:0x0b43, B:45:0x0be2, B:49:0x0caf, B:52:0x0d72, B:54:0x0db4, B:55:0x0eb9, B:60:0x0dc7, B:63:0x0e55, B:65:0x0e68, B:67:0x0e71, B:69:0x0e79, B:70:0x0e81, B:72:0x0e89, B:73:0x0e91, B:75:0x0e99, B:76:0x0ea1, B:78:0x0ea9, B:79:0x0eb1, B:82:0x0e1d, B:84:0x0e23, B:85:0x0e38, B:88:0x0e3f, B:91:0x0e4e, B:92:0x0e44, B:95:0x0e13, B:98:0x0d21, B:100:0x0d27, B:101:0x0d3c, B:104:0x0d43, B:107:0x0d6a, B:108:0x0d48, B:111:0x0d17, B:117:0x0c5e, B:119:0x0c64, B:120:0x0c79, B:123:0x0c80, B:126:0x0ca7, B:127:0x0c85, B:130:0x0c54, B:136:0x0baa, B:138:0x0bb0, B:139:0x0bc5, B:142:0x0bcc, B:145:0x0bdb, B:146:0x0bd1, B:149:0x0ba0, B:150:0x0a0a, B:154:0x0adf, B:156:0x0af2, B:158:0x0afb, B:160:0x0b03, B:161:0x0b0b, B:163:0x0b13, B:164:0x0b1b, B:166:0x0b23, B:167:0x0b2b, B:169:0x0b33, B:170:0x0b3b, B:176:0x0a8e, B:178:0x0a94, B:179:0x0aa9, B:182:0x0ab0, B:185:0x0ad7, B:186:0x0ab5, B:189:0x0a84, B:193:0x0996, B:195:0x099e, B:196:0x09a6, B:198:0x09ae, B:199:0x09b6, B:201:0x09be, B:202:0x09c6, B:204:0x09ce, B:205:0x09d6, B:208:0x0943, B:210:0x0949, B:211:0x095e, B:214:0x0965, B:217:0x0974, B:218:0x096a, B:221:0x0939, B:224:0x08bc, B:226:0x08c2, B:227:0x08d7, B:230:0x08de, B:233:0x08ed, B:234:0x08e3, B:237:0x08b2, B:238:0x0767, B:241:0x07f3, B:243:0x0806, B:245:0x080f, B:247:0x0817, B:248:0x081f, B:250:0x0827, B:251:0x082f, B:253:0x0837, B:254:0x083f, B:256:0x0847, B:257:0x084f, B:260:0x07bb, B:262:0x07c1, B:263:0x07d6, B:266:0x07dd, B:269:0x07ec, B:270:0x07e2, B:273:0x07b1, B:274:0x0657, B:278:0x072c, B:284:0x06db, B:286:0x06e1, B:287:0x06f6, B:290:0x06fd, B:293:0x0724, B:294:0x0702, B:297:0x06d1, B:301:0x05e3, B:303:0x05eb, B:304:0x05f3, B:306:0x05fb, B:307:0x0603, B:309:0x060b, B:310:0x0613, B:312:0x061b, B:313:0x0623, B:329:0x0585, B:341:0x04f2, B:343:0x04f8, B:344:0x050d, B:347:0x0514, B:350:0x053b, B:351:0x0519, B:354:0x04e8, B:364:0x0360, B:385:0x03b0, B:387:0x03b6, B:388:0x03cb, B:391:0x03d2, B:394:0x03e1, B:395:0x03d7, B:366:0x03e7, B:368:0x03fa, B:370:0x0403, B:372:0x040b, B:373:0x0413, B:375:0x041b, B:376:0x0423, B:378:0x042b, B:379:0x0433, B:381:0x043b, B:382:0x0443, B:398:0x03a6, B:414:0x02e7, B:415:0x01a8, B:436:0x01f8, B:438:0x01fe, B:439:0x0213, B:442:0x021a, B:445:0x0229, B:446:0x021f, B:417:0x022f, B:419:0x0242, B:421:0x024b, B:423:0x0253, B:424:0x025b, B:426:0x0263, B:427:0x026b, B:429:0x0273, B:430:0x027b, B:432:0x0283, B:433:0x028b, B:449:0x01ee, B:450:0x0095, B:471:0x00e5, B:473:0x00eb, B:474:0x0100, B:477:0x0107, B:480:0x0116, B:481:0x010c, B:452:0x011c, B:454:0x012f, B:456:0x0138, B:458:0x0140, B:459:0x0148, B:461:0x0150, B:462:0x0158, B:464:0x0160, B:465:0x0168, B:467:0x0170, B:468:0x0178, B:484:0x00db, B:315:0x0563, B:384:0x0386, B:400:0x02c5, B:435:0x01ce, B:259:0x0790, B:223:0x0891, B:81:0x0df2, B:97:0x0cd2, B:207:0x0918, B:470:0x00bb, B:135:0x0b7f), top: B:2:0x002d, inners: #2, #3, #4, #7, #10, #11, #13, #14, #16, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0cd2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // expo.modules.kotlin.modules.Module
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent;
        Object m13470constructorimpl2;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent3;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        ModuleDefinitionBuilder moduleDefinitionBuilder2;
        boolean z;
        Object m13470constructorimpl5;
        boolean z2;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        char c;
        boolean z3;
        AnyType anyType;
        Object m13470constructorimpl6;
        ModuleDefinitionBuilder moduleDefinitionBuilder3;
        Object m13470constructorimpl7;
        Throwable m13473exceptionOrNullimpl2;
        TypeDescriptor typeDescriptor2;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        Object m13470constructorimpl8;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent4;
        AnyType anyType2;
        Object m13470constructorimpl9;
        AnyType anyType3;
        Object m13470constructorimpl10;
        ModuleDefinitionBuilder moduleDefinitionBuilder4;
        Object m13470constructorimpl11;
        Throwable m13473exceptionOrNullimpl3;
        TypeDescriptor typeDescriptor3;
        KClass orCreateKotlinClass;
        TypeInfo[] typeInfoArr;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent5;
        AnyType anyType4;
        Object m13470constructorimpl12;
        AnyType anyType5;
        ModuleDefinitionBuilder moduleDefinitionBuilder5;
        Object m13470constructorimpl13;
        Throwable m13473exceptionOrNullimpl4;
        TypeDescriptor typeDescriptor4;
        AnyType anyType6;
        Object m13470constructorimpl14;
        Object m13470constructorimpl15;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent6;
        ContactsModule contactsModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (contactsModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder6 = new ModuleDefinitionBuilder(contactsModule);
            moduleDefinitionBuilder6.Name("ExpoContacts");
            moduleDefinitionBuilder6.Events("onContactsChange");
            moduleDefinitionBuilder6.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$OnDestroy$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ContactsModule.this.stopObservingContactChanges();
                }
            }));
            moduleDefinitionBuilder6.OnStartObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$1$2
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ContactsModule.this.ensureReadPermission();
                    ContactsModule.this.startObservingContactChanges();
                }
            });
            moduleDefinitionBuilder6.OnStopObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$1$3
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ContactsModule.this.stopObservingContactChanges();
                }
            });
            ModuleDefinitionBuilder moduleDefinitionBuilder7 = moduleDefinitionBuilder6;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Permissions permissionsManager;
                        Permissions permissionsManager2;
                        Permissions permissionsManager3;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        permissionsManager = ContactsModule.this.getPermissionsManager();
                        if (permissionsManager.isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            permissionsManager3 = ContactsModule.this.getPermissionsManager();
                            Permissions.askForPermissionsWithPermissionsManager(permissionsManager3, promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            permissionsManager2 = ContactsModule.this.getPermissionsManager();
                            Permissions.askForPermissionsWithPermissionsManager(permissionsManager2, promise, "android.permission.READ_CONTACTS");
                        }
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder7.getConverters();
                AnyType[] anyTypeArr = new AnyType[1];
                AnyType anyType7 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType7 == null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$2
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl5 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl5);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                        m13470constructorimpl = null;
                    }
                    TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor5 == null) {
                        typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType7 = new AnyType(typeDescriptor5, converters);
                }
                anyTypeArr[0] = anyType7;
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Permissions permissionsManager;
                        Permissions permissionsManager2;
                        Permissions permissionsManager3;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        permissionsManager = ContactsModule.this.getPermissionsManager();
                        if (permissionsManager.isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            permissionsManager3 = ContactsModule.this.getPermissionsManager();
                            Permissions.askForPermissionsWithPermissionsManager(permissionsManager3, promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            permissionsManager2 = ContactsModule.this.getPermissionsManager();
                            Permissions.askForPermissionsWithPermissionsManager(permissionsManager2, promise, "android.permission.READ_CONTACTS");
                        }
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder7.getAsyncFunctions().put("requestPermissionsAsync", intAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder8 = moduleDefinitionBuilder6;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Permissions permissionsManager;
                        Permissions permissionsManager2;
                        Permissions permissionsManager3;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        permissionsManager = ContactsModule.this.getPermissionsManager();
                        if (permissionsManager.isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            permissionsManager3 = ContactsModule.this.getPermissionsManager();
                            Permissions.getPermissionsWithPermissionsManager(permissionsManager3, promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            permissionsManager2 = ContactsModule.this.getPermissionsManager();
                            Permissions.getPermissionsWithPermissionsManager(permissionsManager2, promise, "android.permission.READ_CONTACTS");
                        }
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder8.getConverters();
                AnyType[] anyTypeArr2 = new AnyType[1];
                AnyType anyType8 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType8 == null) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$5
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                    if (m13473exceptionOrNullimpl6 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl6);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                        m13470constructorimpl2 = null;
                    }
                    TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl2;
                    if (typeDescriptor6 == null) {
                        typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType8 = new AnyType(typeDescriptor6, converters2);
                }
                anyTypeArr2[0] = anyType8;
                Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Permissions permissionsManager;
                        Permissions permissionsManager2;
                        Permissions permissionsManager3;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        permissionsManager = ContactsModule.this.getPermissionsManager();
                        if (permissionsManager.isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            permissionsManager3 = ContactsModule.this.getPermissionsManager();
                            Permissions.getPermissionsWithPermissionsManager(permissionsManager3, promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            permissionsManager2 = ContactsModule.this.getPermissionsManager();
                            Permissions.getPermissionsWithPermissionsManager(permissionsManager2, promise, "android.permission.READ_CONTACTS");
                        }
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent2 = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder8.getAsyncFunctions().put("getPermissionsAsync", intAsyncFunctionComponent2);
            ModuleDefinitionBuilder moduleDefinitionBuilder9 = moduleDefinitionBuilder6;
            TypeConverterProvider converters3 = moduleDefinitionBuilder9.getConverters();
            AnyType[] anyTypeArr3 = new AnyType[1];
            AnyType anyType9 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ContactQuery.class), false));
            if (anyType9 == null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.ContactQuery", Reflection.getOrCreateKotlinClass(ContactQuery.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ContactQuery.class);
                        }
                    }));
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
                }
                Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                if (m13473exceptionOrNullimpl7 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ContactQuery.class.getName(), m13473exceptionOrNullimpl7);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                    m13470constructorimpl3 = null;
                }
                TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl3;
                if (typeDescriptor7 == null) {
                    typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ContactQuery.class));
                }
                anyType9 = new AnyType(typeDescriptor7, converters3);
            }
            anyTypeArr3[0] = anyType9;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("getContactsAsync", anyTypeArr3, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    ContactQuery contactQuery = (ContactQuery) objArr[0];
                    ContactsModule.this.ensureReadPermission();
                    BuildersKt__Builders_commonKt.launch$default(ContactsModule.this.getAppContext().getBackgroundCoroutineScope(), null, null, new ContactsModule$definition$1$6$1(contactQuery, promise, ContactsModule.this, null), 3, null);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder9.getAsyncFunctions().put("getContactsAsync", asyncFunctionWithPromiseComponent);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = asyncFunctionWithPromiseComponent;
            ModuleDefinitionBuilder moduleDefinitionBuilder10 = moduleDefinitionBuilder6;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                intAsyncFunctionComponent3 = new AsyncFunctionWithPromiseComponent("hasContactsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ContactsModule.this.ensureReadPermission();
                        BuildersKt__Builders_commonKt.launch$default(ContactsModule.this.getAppContext().getBackgroundCoroutineScope(), null, null, new ContactsModule$definition$1$7$1(ContactsModule.this, promise, null), 3, null);
                    }
                });
            } else {
                TypeConverterProvider converters4 = moduleDefinitionBuilder10.getConverters();
                AnyType[] anyTypeArr4 = new AnyType[1];
                AnyType anyType10 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType10 == null) {
                    try {
                        Result.Companion companion7 = Result.INSTANCE;
                        m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$8
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th4) {
                        Result.Companion companion8 = Result.INSTANCE;
                        m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
                    }
                    Throwable m13473exceptionOrNullimpl8 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                    if (m13473exceptionOrNullimpl8 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl8);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                        m13470constructorimpl4 = null;
                    }
                    TypeDescriptor typeDescriptor8 = (TypeDescriptor) m13470constructorimpl4;
                    if (typeDescriptor8 == null) {
                        typeDescriptor8 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType10 = new AnyType(typeDescriptor8, converters4);
                }
                anyTypeArr4[0] = anyType10;
                Function1<Object[], Job> function13 = new Function1<Object[], Job>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$9
                    @Override // kotlin.jvm.functions.Function1
                    public final Job invoke(Object[] objArr) {
                        Job launch$default;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        ContactsModule.this.ensureReadPermission();
                        launch$default = BuildersKt__Builders_commonKt.launch$default(ContactsModule.this.getAppContext().getBackgroundCoroutineScope(), null, null, new ContactsModule$definition$1$7$1(ContactsModule.this, promise, null), 3, null);
                        return launch$default;
                    }
                };
                intAsyncFunctionComponent3 = Intrinsics.areEqual(Job.class, Integer.TYPE) ? new IntAsyncFunctionComponent("hasContactsAsync", anyTypeArr4, function13) : Intrinsics.areEqual(Job.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("hasContactsAsync", anyTypeArr4, function13) : Intrinsics.areEqual(Job.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("hasContactsAsync", anyTypeArr4, function13) : Intrinsics.areEqual(Job.class, Float.TYPE) ? new FloatAsyncFunctionComponent("hasContactsAsync", anyTypeArr4, function13) : Intrinsics.areEqual(Job.class, String.class) ? new StringAsyncFunctionComponent("hasContactsAsync", anyTypeArr4, function13) : new UntypedAsyncFunctionComponent("hasContactsAsync", anyTypeArr4, function13);
            }
            moduleDefinitionBuilder10.getAsyncFunctions().put("hasContactsAsync", intAsyncFunctionComponent3);
            ModuleDefinitionBuilder moduleDefinitionBuilder11 = moduleDefinitionBuilder6;
            TypeConverterProvider converters5 = moduleDefinitionBuilder11.getConverters();
            AnyType[] anyTypeArr5 = new AnyType[2];
            AnyType anyType11 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), false));
            if (anyType11 != null) {
                moduleDefinitionBuilder = moduleDefinitionBuilder11;
                moduleDefinitionBuilder2 = moduleDefinitionBuilder6;
                z3 = true;
                c = 0;
            } else {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    z = true;
                    try {
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Map.class);
                        moduleDefinitionBuilder = moduleDefinitionBuilder11;
                        try {
                            TypeInfo[] typeInfoArr2 = new TypeInfo[2];
                            moduleDefinitionBuilder2 = moduleDefinitionBuilder6;
                            try {
                                typeInfoArr2[0] = new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false);
                                typeInfoArr2[1] = new TypeInfo.Simple("kotlin.Any", Reflection.getOrCreateKotlinClass(Object.class), false);
                                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Parameterized("kotlin.collections.Map", orCreateKotlinClass2, false, ArraysKt.asList(typeInfoArr2))), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final KType invoke() {
                                        return Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Object.class)));
                                    }
                                }));
                                z2 = true;
                            } catch (Throwable th5) {
                                th = th5;
                                Result.Companion companion10 = Result.INSTANCE;
                                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                                z2 = z;
                                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
                                if (m13473exceptionOrNullimpl != null) {
                                }
                                if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                                }
                                typeDescriptor = (TypeDescriptor) m13470constructorimpl5;
                                if (typeDescriptor == null) {
                                }
                                anyType11 = new AnyType(typeDescriptor, converters5);
                                c = 0;
                                z3 = z2;
                                anyTypeArr5[c] = anyType11;
                                anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), Boolean.valueOf(z3)));
                                ?? r16 = z3;
                                if (anyType == null) {
                                }
                                anyTypeArr5[r16] = anyType;
                                Function1<Object[], String> function14 = new Function1<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$12
                                    @Override // kotlin.jvm.functions.Function1
                                    public final String invoke(Object[] objArr) {
                                        Contact mutateContact;
                                        ContentResolver resolver;
                                        ContentResolver resolver2;
                                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                        Object obj = objArr[0];
                                        ContactsModule.this.ensurePermissions();
                                        mutateContact = ContactsModule.this.mutateContact(null, (Map) obj);
                                        ArrayList<ContentProviderOperation> insertOperationList = mutateContact.toInsertOperationList();
                                        resolver = ContactsModule.this.getResolver();
                                        ContentProviderResult[] applyBatch = resolver.applyBatch("com.android.contacts", insertOperationList);
                                        Intrinsics.checkNotNullExpressionValue(applyBatch, "applyBatch(...)");
                                        if (!(applyBatch.length == 0)) {
                                            resolver2 = ContactsModule.this.getResolver();
                                            Uri uri = applyBatch[0].uri;
                                            Intrinsics.checkNotNull(uri);
                                            Cursor query = resolver2.query(uri, new String[]{"contact_id"}, null, null, null);
                                            try {
                                                Cursor cursor = query;
                                                if (cursor == null) {
                                                    throw new RetrieveIdException();
                                                }
                                                cursor.moveToNext();
                                                String valueOf = String.valueOf(cursor.getLong(0));
                                                CloseableKt.closeFinally(query, null);
                                                return valueOf;
                                            } finally {
                                            }
                                        } else {
                                            throw new AddContactException();
                                        }
                                    }
                                };
                                moduleDefinitionBuilder.getAsyncFunctions().put("addContactAsync", Intrinsics.areEqual(String.class, Integer.TYPE) ? new IntAsyncFunctionComponent("addContactAsync", anyTypeArr5, function14) : Intrinsics.areEqual(String.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("addContactAsync", anyTypeArr5, function14) : Intrinsics.areEqual(String.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("addContactAsync", anyTypeArr5, function14) : Intrinsics.areEqual(String.class, Float.TYPE) ? new FloatAsyncFunctionComponent("addContactAsync", anyTypeArr5, function14) : Intrinsics.areEqual(String.class, String.class) ? new StringAsyncFunctionComponent("addContactAsync", anyTypeArr5, function14) : new UntypedAsyncFunctionComponent("addContactAsync", anyTypeArr5, function14));
                                ModuleDefinitionBuilder moduleDefinitionBuilder12 = moduleDefinitionBuilder2;
                                if (Intrinsics.areEqual(Map.class, Promise.class)) {
                                }
                                moduleDefinitionBuilder3.getAsyncFunctions().put("updateContactAsync", untypedAsyncFunctionComponent);
                                ModuleDefinitionBuilder moduleDefinitionBuilder13 = moduleDefinitionBuilder2;
                                if (Intrinsics.areEqual(String.class, Promise.class)) {
                                }
                                moduleDefinitionBuilder13.getAsyncFunctions().put("removeContactAsync", intAsyncFunctionComponent4);
                                ModuleDefinitionBuilder moduleDefinitionBuilder14 = moduleDefinitionBuilder2;
                                TypeConverterProvider converters6 = moduleDefinitionBuilder14.getConverters();
                                AnyType[] anyTypeArr6 = new AnyType[2];
                                anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType2 == null) {
                                }
                                anyTypeArr6[0] = anyType2;
                                anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType3 == null) {
                                }
                                anyTypeArr6[1] = anyType3;
                                Function1<Object[], Unit> function15 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$21
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Unit invoke(Object[] objArr) {
                                        String lookupKeyForContactId;
                                        Activity currentActivity;
                                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                        Object obj = objArr[0];
                                        String str = (String) objArr[1];
                                        lookupKeyForContactId = ContactsModule.this.getLookupKeyForContactId((String) obj);
                                        if (lookupKeyForContactId == null) {
                                            throw new LookupKeyNotFoundException();
                                        }
                                        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId);
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/x-vcard");
                                        intent.putExtra("android.intent.extra.STREAM", withAppendedPath);
                                        intent.putExtra("android.intent.extra.SUBJECT", str);
                                        currentActivity = ContactsModule.this.getCurrentActivity();
                                        currentActivity.startActivity(intent);
                                        return Unit.INSTANCE;
                                    }
                                };
                                moduleDefinitionBuilder14.getAsyncFunctions().put("shareContactAsync", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function15) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function15) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function15) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function15) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function15) : new UntypedAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function15));
                                ModuleDefinitionBuilder moduleDefinitionBuilder15 = moduleDefinitionBuilder2;
                                if (Intrinsics.areEqual(Map.class, Promise.class)) {
                                }
                                moduleDefinitionBuilder4.getAsyncFunctions().put("writeContactToFileAsync", intAsyncFunctionComponent5);
                                ModuleDefinitionBuilder moduleDefinitionBuilder16 = moduleDefinitionBuilder2;
                                TypeConverterProvider converters7 = moduleDefinitionBuilder16.getConverters();
                                AnyType[] anyTypeArr7 = new AnyType[3];
                                anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType4 == null) {
                                }
                                anyTypeArr7[0] = anyType4;
                                anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
                                if (anyType5 != null) {
                                }
                                anyTypeArr7[1] = anyType5;
                                anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
                                if (anyType6 == null) {
                                }
                                anyTypeArr7[2] = anyType6;
                                AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("presentFormAsync", anyTypeArr7, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Object[] objArr, Promise promise) {
                                        Promise promise2;
                                        Contact mutateContact;
                                        Set set;
                                        Contact contactById;
                                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                        Intrinsics.checkNotNullParameter(promise, "promise");
                                        Object obj = objArr[0];
                                        Object obj2 = objArr[1];
                                        Map map = (Map) obj2;
                                        String str = (String) obj;
                                        ContactsModule.this.ensureReadPermission();
                                        promise2 = ContactsModule.this.contactManipulationPromise;
                                        if (promise2 != null) {
                                            throw new ContactManipulationInProgressException();
                                        }
                                        if (str != null) {
                                            ContactsModule contactsModule2 = ContactsModule.this;
                                            set = ContactsModuleKt.defaultFields;
                                            contactById = contactsModule2.getContactById(str, set);
                                            if (contactById != null) {
                                                ContactsModule.this.presentEditForm(contactById, promise);
                                            } else {
                                                throw new ContactNotFoundException();
                                            }
                                        }
                                        if (map != null) {
                                            mutateContact = ContactsModule.this.mutateContact(null, map);
                                            ContactsModule.this.presentForm(mutateContact, promise);
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                        invoke2(objArr, promise);
                                        return Unit.INSTANCE;
                                    }
                                });
                                moduleDefinitionBuilder5.getAsyncFunctions().put("presentFormAsync", asyncFunctionWithPromiseComponent3);
                                AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4 = asyncFunctionWithPromiseComponent3;
                                moduleDefinitionBuilder2.getEventListeners().put(EventName.ON_ACTIVITY_RESULT, new EventListenerWithSenderAndPayload(EventName.ON_ACTIVITY_RESULT, new Function2<Activity, OnActivityResultPayload, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$OnActivityResult$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                                        invoke2(activity, onActivityResultPayload);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
                                    
                                        r5 = r4.this$0.contactPickingPromise;
                                     */
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                                        Promise promise;
                                        Promise promise2;
                                        Set set;
                                        Contact contactById;
                                        Bundle bundle;
                                        Set<String> set2;
                                        Uri data;
                                        Intrinsics.checkNotNullParameter(sender, "sender");
                                        Intrinsics.checkNotNullParameter(payload, "payload");
                                        int requestCode = payload.getRequestCode();
                                        int resultCode = payload.getResultCode();
                                        Intent data2 = payload.getData();
                                        if (requestCode == 2137 || requestCode == 2139) {
                                            promise = ContactsModule.this.contactManipulationPromise;
                                            if (promise == null) {
                                                return;
                                            }
                                            promise.resolve(0);
                                            ContactsModule.this.contactManipulationPromise = null;
                                        }
                                        if (requestCode != 2138 || promise2 == null) {
                                            return;
                                        }
                                        if (resultCode == -1) {
                                            String lastPathSegment = (data2 == null || (data = data2.getData()) == null) ? null : data.getLastPathSegment();
                                            ContactsModule contactsModule2 = ContactsModule.this;
                                            set = ContactsModuleKt.defaultFields;
                                            contactById = contactsModule2.getContactById(lastPathSegment, set);
                                            if (contactById != null) {
                                                set2 = ContactsModuleKt.defaultFields;
                                                bundle = contactById.toMap(set2);
                                            } else {
                                                bundle = null;
                                            }
                                            promise2.resolve(bundle);
                                        } else {
                                            promise2.resolve();
                                        }
                                        ContactsModule.this.contactPickingPromise = null;
                                    }
                                }));
                                ModuleDefinitionBuilder moduleDefinitionBuilder17 = moduleDefinitionBuilder2;
                                if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                                }
                                moduleDefinitionBuilder17.getAsyncFunctions().put("presentContactPickerAsync", intAsyncFunctionComponent6);
                                return moduleDefinitionBuilder2.buildModule();
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            moduleDefinitionBuilder2 = moduleDefinitionBuilder6;
                            Result.Companion companion102 = Result.INSTANCE;
                            m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                            z2 = z;
                            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
                            if (m13473exceptionOrNullimpl != null) {
                            }
                            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                            }
                            typeDescriptor = (TypeDescriptor) m13470constructorimpl5;
                            if (typeDescriptor == null) {
                            }
                            anyType11 = new AnyType(typeDescriptor, converters5);
                            c = 0;
                            z3 = z2;
                            anyTypeArr5[c] = anyType11;
                            anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), Boolean.valueOf(z3)));
                            ?? r162 = z3;
                            if (anyType == null) {
                            }
                            anyTypeArr5[r162] = anyType;
                            Function1<Object[], String> function142 = new Function1<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$12
                                @Override // kotlin.jvm.functions.Function1
                                public final String invoke(Object[] objArr) {
                                    Contact mutateContact;
                                    ContentResolver resolver;
                                    ContentResolver resolver2;
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Object obj = objArr[0];
                                    ContactsModule.this.ensurePermissions();
                                    mutateContact = ContactsModule.this.mutateContact(null, (Map) obj);
                                    ArrayList<ContentProviderOperation> insertOperationList = mutateContact.toInsertOperationList();
                                    resolver = ContactsModule.this.getResolver();
                                    ContentProviderResult[] applyBatch = resolver.applyBatch("com.android.contacts", insertOperationList);
                                    Intrinsics.checkNotNullExpressionValue(applyBatch, "applyBatch(...)");
                                    if (!(applyBatch.length == 0)) {
                                        resolver2 = ContactsModule.this.getResolver();
                                        Uri uri = applyBatch[0].uri;
                                        Intrinsics.checkNotNull(uri);
                                        Cursor query = resolver2.query(uri, new String[]{"contact_id"}, null, null, null);
                                        try {
                                            Cursor cursor = query;
                                            if (cursor == null) {
                                                throw new RetrieveIdException();
                                            }
                                            cursor.moveToNext();
                                            String valueOf = String.valueOf(cursor.getLong(0));
                                            CloseableKt.closeFinally(query, null);
                                            return valueOf;
                                        } finally {
                                        }
                                    } else {
                                        throw new AddContactException();
                                    }
                                }
                            };
                            moduleDefinitionBuilder.getAsyncFunctions().put("addContactAsync", Intrinsics.areEqual(String.class, Integer.TYPE) ? new IntAsyncFunctionComponent("addContactAsync", anyTypeArr5, function142) : Intrinsics.areEqual(String.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("addContactAsync", anyTypeArr5, function142) : Intrinsics.areEqual(String.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("addContactAsync", anyTypeArr5, function142) : Intrinsics.areEqual(String.class, Float.TYPE) ? new FloatAsyncFunctionComponent("addContactAsync", anyTypeArr5, function142) : Intrinsics.areEqual(String.class, String.class) ? new StringAsyncFunctionComponent("addContactAsync", anyTypeArr5, function142) : new UntypedAsyncFunctionComponent("addContactAsync", anyTypeArr5, function142));
                            ModuleDefinitionBuilder moduleDefinitionBuilder122 = moduleDefinitionBuilder2;
                            if (Intrinsics.areEqual(Map.class, Promise.class)) {
                            }
                            moduleDefinitionBuilder3.getAsyncFunctions().put("updateContactAsync", untypedAsyncFunctionComponent);
                            ModuleDefinitionBuilder moduleDefinitionBuilder132 = moduleDefinitionBuilder2;
                            if (Intrinsics.areEqual(String.class, Promise.class)) {
                            }
                            moduleDefinitionBuilder132.getAsyncFunctions().put("removeContactAsync", intAsyncFunctionComponent4);
                            ModuleDefinitionBuilder moduleDefinitionBuilder142 = moduleDefinitionBuilder2;
                            TypeConverterProvider converters62 = moduleDefinitionBuilder142.getConverters();
                            AnyType[] anyTypeArr62 = new AnyType[2];
                            anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                            if (anyType2 == null) {
                            }
                            anyTypeArr62[0] = anyType2;
                            anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                            if (anyType3 == null) {
                            }
                            anyTypeArr62[1] = anyType3;
                            Function1<Object[], Unit> function152 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$21
                                @Override // kotlin.jvm.functions.Function1
                                public final Unit invoke(Object[] objArr) {
                                    String lookupKeyForContactId;
                                    Activity currentActivity;
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Object obj = objArr[0];
                                    String str = (String) objArr[1];
                                    lookupKeyForContactId = ContactsModule.this.getLookupKeyForContactId((String) obj);
                                    if (lookupKeyForContactId == null) {
                                        throw new LookupKeyNotFoundException();
                                    }
                                    Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId);
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/x-vcard");
                                    intent.putExtra("android.intent.extra.STREAM", withAppendedPath);
                                    intent.putExtra("android.intent.extra.SUBJECT", str);
                                    currentActivity = ContactsModule.this.getCurrentActivity();
                                    currentActivity.startActivity(intent);
                                    return Unit.INSTANCE;
                                }
                            };
                            moduleDefinitionBuilder142.getAsyncFunctions().put("shareContactAsync", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("shareContactAsync", anyTypeArr62, function152) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("shareContactAsync", anyTypeArr62, function152) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("shareContactAsync", anyTypeArr62, function152) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("shareContactAsync", anyTypeArr62, function152) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("shareContactAsync", anyTypeArr62, function152) : new UntypedAsyncFunctionComponent("shareContactAsync", anyTypeArr62, function152));
                            ModuleDefinitionBuilder moduleDefinitionBuilder152 = moduleDefinitionBuilder2;
                            if (Intrinsics.areEqual(Map.class, Promise.class)) {
                            }
                            moduleDefinitionBuilder4.getAsyncFunctions().put("writeContactToFileAsync", intAsyncFunctionComponent5);
                            ModuleDefinitionBuilder moduleDefinitionBuilder162 = moduleDefinitionBuilder2;
                            TypeConverterProvider converters72 = moduleDefinitionBuilder162.getConverters();
                            AnyType[] anyTypeArr72 = new AnyType[3];
                            anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                            if (anyType4 == null) {
                            }
                            anyTypeArr72[0] = anyType4;
                            anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
                            if (anyType5 != null) {
                            }
                            anyTypeArr72[1] = anyType5;
                            anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
                            if (anyType6 == null) {
                            }
                            anyTypeArr72[2] = anyType6;
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent32 = new AsyncFunctionWithPromiseComponent("presentFormAsync", anyTypeArr72, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Object[] objArr, Promise promise) {
                                    Promise promise2;
                                    Contact mutateContact;
                                    Set set;
                                    Contact contactById;
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Intrinsics.checkNotNullParameter(promise, "promise");
                                    Object obj = objArr[0];
                                    Object obj2 = objArr[1];
                                    Map map = (Map) obj2;
                                    String str = (String) obj;
                                    ContactsModule.this.ensureReadPermission();
                                    promise2 = ContactsModule.this.contactManipulationPromise;
                                    if (promise2 != null) {
                                        throw new ContactManipulationInProgressException();
                                    }
                                    if (str != null) {
                                        ContactsModule contactsModule2 = ContactsModule.this;
                                        set = ContactsModuleKt.defaultFields;
                                        contactById = contactsModule2.getContactById(str, set);
                                        if (contactById != null) {
                                            ContactsModule.this.presentEditForm(contactById, promise);
                                        } else {
                                            throw new ContactNotFoundException();
                                        }
                                    }
                                    if (map != null) {
                                        mutateContact = ContactsModule.this.mutateContact(null, map);
                                        ContactsModule.this.presentForm(mutateContact, promise);
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                    invoke2(objArr, promise);
                                    return Unit.INSTANCE;
                                }
                            });
                            moduleDefinitionBuilder5.getAsyncFunctions().put("presentFormAsync", asyncFunctionWithPromiseComponent32);
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent42 = asyncFunctionWithPromiseComponent32;
                            moduleDefinitionBuilder2.getEventListeners().put(EventName.ON_ACTIVITY_RESULT, new EventListenerWithSenderAndPayload(EventName.ON_ACTIVITY_RESULT, new Function2<Activity, OnActivityResultPayload, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$OnActivityResult$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                                    invoke2(activity, onActivityResultPayload);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
                                
                                    r5 = r4.this$0.contactPickingPromise;
                                 */
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                                    Promise promise;
                                    Promise promise2;
                                    Set set;
                                    Contact contactById;
                                    Bundle bundle;
                                    Set<String> set2;
                                    Uri data;
                                    Intrinsics.checkNotNullParameter(sender, "sender");
                                    Intrinsics.checkNotNullParameter(payload, "payload");
                                    int requestCode = payload.getRequestCode();
                                    int resultCode = payload.getResultCode();
                                    Intent data2 = payload.getData();
                                    if (requestCode == 2137 || requestCode == 2139) {
                                        promise = ContactsModule.this.contactManipulationPromise;
                                        if (promise == null) {
                                            return;
                                        }
                                        promise.resolve(0);
                                        ContactsModule.this.contactManipulationPromise = null;
                                    }
                                    if (requestCode != 2138 || promise2 == null) {
                                        return;
                                    }
                                    if (resultCode == -1) {
                                        String lastPathSegment = (data2 == null || (data = data2.getData()) == null) ? null : data.getLastPathSegment();
                                        ContactsModule contactsModule2 = ContactsModule.this;
                                        set = ContactsModuleKt.defaultFields;
                                        contactById = contactsModule2.getContactById(lastPathSegment, set);
                                        if (contactById != null) {
                                            set2 = ContactsModuleKt.defaultFields;
                                            bundle = contactById.toMap(set2);
                                        } else {
                                            bundle = null;
                                        }
                                        promise2.resolve(bundle);
                                    } else {
                                        promise2.resolve();
                                    }
                                    ContactsModule.this.contactPickingPromise = null;
                                }
                            }));
                            ModuleDefinitionBuilder moduleDefinitionBuilder172 = moduleDefinitionBuilder2;
                            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                            }
                            moduleDefinitionBuilder172.getAsyncFunctions().put("presentContactPickerAsync", intAsyncFunctionComponent6);
                            return moduleDefinitionBuilder2.buildModule();
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        moduleDefinitionBuilder = moduleDefinitionBuilder11;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    moduleDefinitionBuilder = moduleDefinitionBuilder11;
                    moduleDefinitionBuilder2 = moduleDefinitionBuilder6;
                    z = true;
                }
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
                if (m13473exceptionOrNullimpl != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Map.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                    m13470constructorimpl5 = null;
                }
                typeDescriptor = (TypeDescriptor) m13470constructorimpl5;
                if (typeDescriptor == null) {
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Object.class))));
                }
                anyType11 = new AnyType(typeDescriptor, converters5);
                c = 0;
                z3 = z2;
            }
            anyTypeArr5[c] = anyType11;
            anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), Boolean.valueOf(z3)));
            ?? r1622 = z3;
            if (anyType == null) {
                try {
                    Result.Companion companion11 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), z3 ? 1 : 0)), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$11
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th9) {
                    Result.Companion companion12 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th9));
                }
                Throwable m13473exceptionOrNullimpl9 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
                if (m13473exceptionOrNullimpl9 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl9);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                    m13470constructorimpl6 = null;
                }
                TypeDescriptor typeDescriptor9 = (TypeDescriptor) m13470constructorimpl6;
                if (typeDescriptor9 == null) {
                    typeDescriptor9 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType = new AnyType(typeDescriptor9, converters5);
                r1622 = 1;
            }
            anyTypeArr5[r1622] = anyType;
            Function1<Object[], String> function1422 = new Function1<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$12
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object[] objArr) {
                    Contact mutateContact;
                    ContentResolver resolver;
                    ContentResolver resolver2;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    ContactsModule.this.ensurePermissions();
                    mutateContact = ContactsModule.this.mutateContact(null, (Map) obj);
                    ArrayList<ContentProviderOperation> insertOperationList = mutateContact.toInsertOperationList();
                    resolver = ContactsModule.this.getResolver();
                    ContentProviderResult[] applyBatch = resolver.applyBatch("com.android.contacts", insertOperationList);
                    Intrinsics.checkNotNullExpressionValue(applyBatch, "applyBatch(...)");
                    if (!(applyBatch.length == 0)) {
                        resolver2 = ContactsModule.this.getResolver();
                        Uri uri = applyBatch[0].uri;
                        Intrinsics.checkNotNull(uri);
                        Cursor query = resolver2.query(uri, new String[]{"contact_id"}, null, null, null);
                        try {
                            Cursor cursor = query;
                            if (cursor == null) {
                                throw new RetrieveIdException();
                            }
                            cursor.moveToNext();
                            String valueOf = String.valueOf(cursor.getLong(0));
                            CloseableKt.closeFinally(query, null);
                            return valueOf;
                        } finally {
                        }
                    } else {
                        throw new AddContactException();
                    }
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("addContactAsync", Intrinsics.areEqual(String.class, Integer.TYPE) ? new IntAsyncFunctionComponent("addContactAsync", anyTypeArr5, function1422) : Intrinsics.areEqual(String.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("addContactAsync", anyTypeArr5, function1422) : Intrinsics.areEqual(String.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("addContactAsync", anyTypeArr5, function1422) : Intrinsics.areEqual(String.class, Float.TYPE) ? new FloatAsyncFunctionComponent("addContactAsync", anyTypeArr5, function1422) : Intrinsics.areEqual(String.class, String.class) ? new StringAsyncFunctionComponent("addContactAsync", anyTypeArr5, function1422) : new UntypedAsyncFunctionComponent("addContactAsync", anyTypeArr5, function1422));
            ModuleDefinitionBuilder moduleDefinitionBuilder1222 = moduleDefinitionBuilder2;
            if (Intrinsics.areEqual(Map.class, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("updateContactAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$13
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Set set;
                        Contact contactById;
                        Contact mutateContact;
                        ContentResolver resolver;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Map map = (Map) promise;
                        ContactsModule.this.ensurePermissions();
                        String str = map.containsKey("id") ? (String) map.get("id") : null;
                        ContactsModule contactsModule2 = ContactsModule.this;
                        set = ContactsModuleKt.defaultFields;
                        contactById = contactsModule2.getContactById(str, set);
                        if (contactById != null) {
                            mutateContact = ContactsModule.this.mutateContact(contactById, map);
                            ArrayList<ContentProviderOperation> updateOperationList = mutateContact.toUpdateOperationList();
                            resolver = ContactsModule.this.getResolver();
                            ContentProviderResult[] applyBatch = resolver.applyBatch("com.android.contacts", updateOperationList);
                            Intrinsics.checkNotNullExpressionValue(applyBatch, "applyBatch(...)");
                            if (applyBatch.length == 0) {
                                throw new ContactUpdateException();
                            }
                            return;
                        }
                        throw new ContactNotFoundException();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
                moduleDefinitionBuilder3 = moduleDefinitionBuilder1222;
            } else {
                TypeConverterProvider converters8 = moduleDefinitionBuilder1222.getConverters();
                AnyType[] anyTypeArr8 = new AnyType[1];
                AnyType anyType12 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), false));
                if (anyType12 != null) {
                    moduleDefinitionBuilder3 = moduleDefinitionBuilder1222;
                } else {
                    try {
                        Result.Companion companion13 = Result.INSTANCE;
                        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Map.class);
                        TypeInfo[] typeInfoArr3 = new TypeInfo[2];
                        moduleDefinitionBuilder3 = moduleDefinitionBuilder1222;
                        try {
                            typeInfoArr3[0] = new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false);
                            typeInfoArr3[1] = new TypeInfo.Simple("kotlin.Any", Reflection.getOrCreateKotlinClass(Object.class), false);
                            m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Parameterized("kotlin.collections.Map", orCreateKotlinClass3, false, ArraysKt.asList(typeInfoArr3))), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$14
                                @Override // kotlin.jvm.functions.Function0
                                public final KType invoke() {
                                    return Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Object.class)));
                                }
                            }));
                        } catch (Throwable th10) {
                            th = th10;
                            Result.Companion companion14 = Result.INSTANCE;
                            m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                            m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
                            if (m13473exceptionOrNullimpl2 != null) {
                            }
                            if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                            }
                            typeDescriptor2 = (TypeDescriptor) m13470constructorimpl7;
                            if (typeDescriptor2 != null) {
                            }
                            anyType12 = new AnyType(typeDescriptor2, converters8);
                            anyTypeArr8[0] = anyType12;
                            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("updateContactAsync", anyTypeArr8, new Function1<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$15
                                @Override // kotlin.jvm.functions.Function1
                                public final String invoke(Object[] objArr) {
                                    Set set;
                                    Contact contactById;
                                    Contact mutateContact;
                                    ContentResolver resolver;
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Map map = (Map) objArr[0];
                                    ContactsModule.this.ensurePermissions();
                                    String str = map.containsKey("id") ? (String) map.get("id") : null;
                                    ContactsModule contactsModule2 = ContactsModule.this;
                                    set = ContactsModuleKt.defaultFields;
                                    contactById = contactsModule2.getContactById(str, set);
                                    if (contactById != null) {
                                        mutateContact = ContactsModule.this.mutateContact(contactById, map);
                                        ArrayList<ContentProviderOperation> updateOperationList = mutateContact.toUpdateOperationList();
                                        resolver = ContactsModule.this.getResolver();
                                        ContentProviderResult[] applyBatch = resolver.applyBatch("com.android.contacts", updateOperationList);
                                        Intrinsics.checkNotNullExpressionValue(applyBatch, "applyBatch(...)");
                                        if (applyBatch.length == 0) {
                                            throw new ContactUpdateException();
                                        }
                                        return str;
                                    }
                                    throw new ContactNotFoundException();
                                }
                            });
                            moduleDefinitionBuilder3.getAsyncFunctions().put("updateContactAsync", untypedAsyncFunctionComponent);
                            ModuleDefinitionBuilder moduleDefinitionBuilder1322 = moduleDefinitionBuilder2;
                            if (Intrinsics.areEqual(String.class, Promise.class)) {
                            }
                            moduleDefinitionBuilder1322.getAsyncFunctions().put("removeContactAsync", intAsyncFunctionComponent4);
                            ModuleDefinitionBuilder moduleDefinitionBuilder1422 = moduleDefinitionBuilder2;
                            TypeConverterProvider converters622 = moduleDefinitionBuilder1422.getConverters();
                            AnyType[] anyTypeArr622 = new AnyType[2];
                            anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                            if (anyType2 == null) {
                            }
                            anyTypeArr622[0] = anyType2;
                            anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                            if (anyType3 == null) {
                            }
                            anyTypeArr622[1] = anyType3;
                            Function1<Object[], Unit> function1522 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$21
                                @Override // kotlin.jvm.functions.Function1
                                public final Unit invoke(Object[] objArr) {
                                    String lookupKeyForContactId;
                                    Activity currentActivity;
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Object obj = objArr[0];
                                    String str = (String) objArr[1];
                                    lookupKeyForContactId = ContactsModule.this.getLookupKeyForContactId((String) obj);
                                    if (lookupKeyForContactId == null) {
                                        throw new LookupKeyNotFoundException();
                                    }
                                    Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId);
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/x-vcard");
                                    intent.putExtra("android.intent.extra.STREAM", withAppendedPath);
                                    intent.putExtra("android.intent.extra.SUBJECT", str);
                                    currentActivity = ContactsModule.this.getCurrentActivity();
                                    currentActivity.startActivity(intent);
                                    return Unit.INSTANCE;
                                }
                            };
                            moduleDefinitionBuilder1422.getAsyncFunctions().put("shareContactAsync", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("shareContactAsync", anyTypeArr622, function1522) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("shareContactAsync", anyTypeArr622, function1522) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("shareContactAsync", anyTypeArr622, function1522) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("shareContactAsync", anyTypeArr622, function1522) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("shareContactAsync", anyTypeArr622, function1522) : new UntypedAsyncFunctionComponent("shareContactAsync", anyTypeArr622, function1522));
                            ModuleDefinitionBuilder moduleDefinitionBuilder1522 = moduleDefinitionBuilder2;
                            if (Intrinsics.areEqual(Map.class, Promise.class)) {
                            }
                            moduleDefinitionBuilder4.getAsyncFunctions().put("writeContactToFileAsync", intAsyncFunctionComponent5);
                            ModuleDefinitionBuilder moduleDefinitionBuilder1622 = moduleDefinitionBuilder2;
                            TypeConverterProvider converters722 = moduleDefinitionBuilder1622.getConverters();
                            AnyType[] anyTypeArr722 = new AnyType[3];
                            anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                            if (anyType4 == null) {
                            }
                            anyTypeArr722[0] = anyType4;
                            anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
                            if (anyType5 != null) {
                            }
                            anyTypeArr722[1] = anyType5;
                            anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
                            if (anyType6 == null) {
                            }
                            anyTypeArr722[2] = anyType6;
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent322 = new AsyncFunctionWithPromiseComponent("presentFormAsync", anyTypeArr722, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Object[] objArr, Promise promise) {
                                    Promise promise2;
                                    Contact mutateContact;
                                    Set set;
                                    Contact contactById;
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Intrinsics.checkNotNullParameter(promise, "promise");
                                    Object obj = objArr[0];
                                    Object obj2 = objArr[1];
                                    Map map = (Map) obj2;
                                    String str = (String) obj;
                                    ContactsModule.this.ensureReadPermission();
                                    promise2 = ContactsModule.this.contactManipulationPromise;
                                    if (promise2 != null) {
                                        throw new ContactManipulationInProgressException();
                                    }
                                    if (str != null) {
                                        ContactsModule contactsModule2 = ContactsModule.this;
                                        set = ContactsModuleKt.defaultFields;
                                        contactById = contactsModule2.getContactById(str, set);
                                        if (contactById != null) {
                                            ContactsModule.this.presentEditForm(contactById, promise);
                                        } else {
                                            throw new ContactNotFoundException();
                                        }
                                    }
                                    if (map != null) {
                                        mutateContact = ContactsModule.this.mutateContact(null, map);
                                        ContactsModule.this.presentForm(mutateContact, promise);
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                    invoke2(objArr, promise);
                                    return Unit.INSTANCE;
                                }
                            });
                            moduleDefinitionBuilder5.getAsyncFunctions().put("presentFormAsync", asyncFunctionWithPromiseComponent322);
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent422 = asyncFunctionWithPromiseComponent322;
                            moduleDefinitionBuilder2.getEventListeners().put(EventName.ON_ACTIVITY_RESULT, new EventListenerWithSenderAndPayload(EventName.ON_ACTIVITY_RESULT, new Function2<Activity, OnActivityResultPayload, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$OnActivityResult$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                                    invoke2(activity, onActivityResultPayload);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
                                
                                    r5 = r4.this$0.contactPickingPromise;
                                 */
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                                    Promise promise;
                                    Promise promise2;
                                    Set set;
                                    Contact contactById;
                                    Bundle bundle;
                                    Set<String> set2;
                                    Uri data;
                                    Intrinsics.checkNotNullParameter(sender, "sender");
                                    Intrinsics.checkNotNullParameter(payload, "payload");
                                    int requestCode = payload.getRequestCode();
                                    int resultCode = payload.getResultCode();
                                    Intent data2 = payload.getData();
                                    if (requestCode == 2137 || requestCode == 2139) {
                                        promise = ContactsModule.this.contactManipulationPromise;
                                        if (promise == null) {
                                            return;
                                        }
                                        promise.resolve(0);
                                        ContactsModule.this.contactManipulationPromise = null;
                                    }
                                    if (requestCode != 2138 || promise2 == null) {
                                        return;
                                    }
                                    if (resultCode == -1) {
                                        String lastPathSegment = (data2 == null || (data = data2.getData()) == null) ? null : data.getLastPathSegment();
                                        ContactsModule contactsModule2 = ContactsModule.this;
                                        set = ContactsModuleKt.defaultFields;
                                        contactById = contactsModule2.getContactById(lastPathSegment, set);
                                        if (contactById != null) {
                                            set2 = ContactsModuleKt.defaultFields;
                                            bundle = contactById.toMap(set2);
                                        } else {
                                            bundle = null;
                                        }
                                        promise2.resolve(bundle);
                                    } else {
                                        promise2.resolve();
                                    }
                                    ContactsModule.this.contactPickingPromise = null;
                                }
                            }));
                            ModuleDefinitionBuilder moduleDefinitionBuilder1722 = moduleDefinitionBuilder2;
                            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                            }
                            moduleDefinitionBuilder1722.getAsyncFunctions().put("presentContactPickerAsync", intAsyncFunctionComponent6);
                            return moduleDefinitionBuilder2.buildModule();
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        moduleDefinitionBuilder3 = moduleDefinitionBuilder1222;
                    }
                    m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
                    if (m13473exceptionOrNullimpl2 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Map.class.getName(), m13473exceptionOrNullimpl2);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                        m13470constructorimpl7 = null;
                    }
                    typeDescriptor2 = (TypeDescriptor) m13470constructorimpl7;
                    if (typeDescriptor2 != null) {
                        typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Object.class))));
                    }
                    anyType12 = new AnyType(typeDescriptor2, converters8);
                }
                anyTypeArr8[0] = anyType12;
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("updateContactAsync", anyTypeArr8, new Function1<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$15
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) {
                        Set set;
                        Contact contactById;
                        Contact mutateContact;
                        ContentResolver resolver;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Map map = (Map) objArr[0];
                        ContactsModule.this.ensurePermissions();
                        String str = map.containsKey("id") ? (String) map.get("id") : null;
                        ContactsModule contactsModule2 = ContactsModule.this;
                        set = ContactsModuleKt.defaultFields;
                        contactById = contactsModule2.getContactById(str, set);
                        if (contactById != null) {
                            mutateContact = ContactsModule.this.mutateContact(contactById, map);
                            ArrayList<ContentProviderOperation> updateOperationList = mutateContact.toUpdateOperationList();
                            resolver = ContactsModule.this.getResolver();
                            ContentProviderResult[] applyBatch = resolver.applyBatch("com.android.contacts", updateOperationList);
                            Intrinsics.checkNotNullExpressionValue(applyBatch, "applyBatch(...)");
                            if (applyBatch.length == 0) {
                                throw new ContactUpdateException();
                            }
                            return str;
                        }
                        throw new ContactNotFoundException();
                    }
                });
            }
            moduleDefinitionBuilder3.getAsyncFunctions().put("updateContactAsync", untypedAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder13222 = moduleDefinitionBuilder2;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                TypeConverterProvider converters9 = moduleDefinitionBuilder13222.getConverters();
                AnyType[] anyTypeArr9 = new AnyType[1];
                AnyType anyType13 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                if (anyType13 == null) {
                    try {
                        Result.Companion companion15 = Result.INSTANCE;
                        m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$17
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.nullableTypeOf(String.class);
                            }
                        }));
                    } catch (Throwable th12) {
                        Result.Companion companion16 = Result.INSTANCE;
                        m13470constructorimpl8 = Result.m13470constructorimpl(ResultKt.createFailure(th12));
                    }
                    Throwable m13473exceptionOrNullimpl10 = Result.m13473exceptionOrNullimpl(m13470constructorimpl8);
                    if (m13473exceptionOrNullimpl10 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl10);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl8)) {
                        m13470constructorimpl8 = null;
                    }
                    TypeDescriptor typeDescriptor10 = (TypeDescriptor) m13470constructorimpl8;
                    if (typeDescriptor10 == null) {
                        typeDescriptor10 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                    }
                    anyType13 = new AnyType(typeDescriptor10, converters9);
                }
                anyTypeArr9[0] = anyType13;
                Function1<Object[], Integer> function16 = new Function1<Object[], Integer>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$18
                    @Override // kotlin.jvm.functions.Function1
                    public final Integer invoke(Object[] objArr) {
                        ContentResolver resolver;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        ContactsModule.this.ensurePermissions();
                        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, str);
                        resolver = ContactsModule.this.getResolver();
                        return Integer.valueOf(resolver.delete(withAppendedPath, null, null));
                    }
                };
                intAsyncFunctionComponent4 = Intrinsics.areEqual(Integer.class, Integer.TYPE) ? new IntAsyncFunctionComponent("removeContactAsync", anyTypeArr9, function16) : Intrinsics.areEqual(Integer.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("removeContactAsync", anyTypeArr9, function16) : Intrinsics.areEqual(Integer.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("removeContactAsync", anyTypeArr9, function16) : Intrinsics.areEqual(Integer.class, Float.TYPE) ? new FloatAsyncFunctionComponent("removeContactAsync", anyTypeArr9, function16) : Intrinsics.areEqual(Integer.class, String.class) ? new StringAsyncFunctionComponent("removeContactAsync", anyTypeArr9, function16) : new UntypedAsyncFunctionComponent("removeContactAsync", anyTypeArr9, function16);
            } else {
                intAsyncFunctionComponent4 = new AsyncFunctionWithPromiseComponent("removeContactAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$16
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        ContentResolver resolver;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ContactsModule.this.ensurePermissions();
                        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, (String) promise);
                        resolver = ContactsModule.this.getResolver();
                        resolver.delete(withAppendedPath, null, null);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            }
            moduleDefinitionBuilder13222.getAsyncFunctions().put("removeContactAsync", intAsyncFunctionComponent4);
            ModuleDefinitionBuilder moduleDefinitionBuilder14222 = moduleDefinitionBuilder2;
            TypeConverterProvider converters6222 = moduleDefinitionBuilder14222.getConverters();
            AnyType[] anyTypeArr6222 = new AnyType[2];
            anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType2 == null) {
                try {
                    Result.Companion companion17 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$19
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th13) {
                    Result.Companion companion18 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(ResultKt.createFailure(th13));
                }
                Throwable m13473exceptionOrNullimpl11 = Result.m13473exceptionOrNullimpl(m13470constructorimpl9);
                if (m13473exceptionOrNullimpl11 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl11);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl9)) {
                    m13470constructorimpl9 = null;
                }
                TypeDescriptor typeDescriptor11 = (TypeDescriptor) m13470constructorimpl9;
                if (typeDescriptor11 == null) {
                    typeDescriptor11 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType2 = new AnyType(typeDescriptor11, converters6222);
            }
            anyTypeArr6222[0] = anyType2;
            anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType3 == null) {
                try {
                    Result.Companion companion19 = Result.INSTANCE;
                    m13470constructorimpl10 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$20
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th14) {
                    Result.Companion companion20 = Result.INSTANCE;
                    m13470constructorimpl10 = Result.m13470constructorimpl(ResultKt.createFailure(th14));
                }
                Throwable m13473exceptionOrNullimpl12 = Result.m13473exceptionOrNullimpl(m13470constructorimpl10);
                if (m13473exceptionOrNullimpl12 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl12);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl10)) {
                    m13470constructorimpl10 = null;
                }
                TypeDescriptor typeDescriptor12 = (TypeDescriptor) m13470constructorimpl10;
                if (typeDescriptor12 == null) {
                    typeDescriptor12 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType3 = new AnyType(typeDescriptor12, converters6222);
            }
            anyTypeArr6222[1] = anyType3;
            Function1<Object[], Unit> function15222 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$21
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    String lookupKeyForContactId;
                    Activity currentActivity;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    lookupKeyForContactId = ContactsModule.this.getLookupKeyForContactId((String) obj);
                    if (lookupKeyForContactId == null) {
                        throw new LookupKeyNotFoundException();
                    }
                    Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/x-vcard");
                    intent.putExtra("android.intent.extra.STREAM", withAppendedPath);
                    intent.putExtra("android.intent.extra.SUBJECT", str);
                    currentActivity = ContactsModule.this.getCurrentActivity();
                    currentActivity.startActivity(intent);
                    return Unit.INSTANCE;
                }
            };
            moduleDefinitionBuilder14222.getAsyncFunctions().put("shareContactAsync", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("shareContactAsync", anyTypeArr6222, function15222) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("shareContactAsync", anyTypeArr6222, function15222) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("shareContactAsync", anyTypeArr6222, function15222) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("shareContactAsync", anyTypeArr6222, function15222) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("shareContactAsync", anyTypeArr6222, function15222) : new UntypedAsyncFunctionComponent("shareContactAsync", anyTypeArr6222, function15222));
            ModuleDefinitionBuilder moduleDefinitionBuilder15222 = moduleDefinitionBuilder2;
            if (Intrinsics.areEqual(Map.class, Promise.class)) {
                TypeConverterProvider converters10 = moduleDefinitionBuilder15222.getConverters();
                AnyType[] anyTypeArr10 = new AnyType[1];
                AnyType anyType14 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), false));
                if (anyType14 != null) {
                    moduleDefinitionBuilder4 = moduleDefinitionBuilder15222;
                } else {
                    try {
                        Result.Companion companion21 = Result.INSTANCE;
                        orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Map.class);
                        typeInfoArr = new TypeInfo[2];
                        moduleDefinitionBuilder4 = moduleDefinitionBuilder15222;
                    } catch (Throwable th15) {
                        th = th15;
                        moduleDefinitionBuilder4 = moduleDefinitionBuilder15222;
                    }
                    try {
                        typeInfoArr[0] = new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false);
                        typeInfoArr[1] = new TypeInfo.Simple("kotlin.Any", Reflection.getOrCreateKotlinClass(Object.class), true);
                        m13470constructorimpl11 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Parameterized("kotlin.collections.Map", orCreateKotlinClass, false, ArraysKt.asList(typeInfoArr))), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$23
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Object.class)));
                            }
                        }));
                    } catch (Throwable th16) {
                        th = th16;
                        Result.Companion companion22 = Result.INSTANCE;
                        m13470constructorimpl11 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl11);
                        if (m13473exceptionOrNullimpl3 != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl11)) {
                        }
                        typeDescriptor3 = (TypeDescriptor) m13470constructorimpl11;
                        if (typeDescriptor3 != null) {
                        }
                        anyType14 = new AnyType(typeDescriptor3, converters10);
                        anyTypeArr10[0] = anyType14;
                        Function1<Object[], String> function17 = new Function1<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$24
                            @Override // kotlin.jvm.functions.Function1
                            public final String invoke(Object[] objArr) {
                                String lookupKeyForContactId;
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Map map = (Map) objArr[0];
                                ContactsModule.this.ensureReadPermission();
                                lookupKeyForContactId = ContactsModule.this.getLookupKeyForContactId(map.containsKey("id") ? (String) map.get("id") : null);
                                if (lookupKeyForContactId == null) {
                                    throw new LookupKeyNotFoundException();
                                }
                                return Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId).toString();
                            }
                        };
                        intAsyncFunctionComponent5 = !Intrinsics.areEqual(String.class, Integer.TYPE) ? new IntAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function17) : Intrinsics.areEqual(String.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function17) : Intrinsics.areEqual(String.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function17) : Intrinsics.areEqual(String.class, Float.TYPE) ? new FloatAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function17) : Intrinsics.areEqual(String.class, String.class) ? new StringAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function17) : new UntypedAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function17);
                        moduleDefinitionBuilder4.getAsyncFunctions().put("writeContactToFileAsync", intAsyncFunctionComponent5);
                        ModuleDefinitionBuilder moduleDefinitionBuilder16222 = moduleDefinitionBuilder2;
                        TypeConverterProvider converters7222 = moduleDefinitionBuilder16222.getConverters();
                        AnyType[] anyTypeArr7222 = new AnyType[3];
                        anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType4 == null) {
                        }
                        anyTypeArr7222[0] = anyType4;
                        anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
                        if (anyType5 != null) {
                        }
                        anyTypeArr7222[1] = anyType5;
                        anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
                        if (anyType6 == null) {
                        }
                        anyTypeArr7222[2] = anyType6;
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3222 = new AsyncFunctionWithPromiseComponent("presentFormAsync", anyTypeArr7222, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Object[] objArr, Promise promise) {
                                Promise promise2;
                                Contact mutateContact;
                                Set set;
                                Contact contactById;
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Intrinsics.checkNotNullParameter(promise, "promise");
                                Object obj = objArr[0];
                                Object obj2 = objArr[1];
                                Map map = (Map) obj2;
                                String str = (String) obj;
                                ContactsModule.this.ensureReadPermission();
                                promise2 = ContactsModule.this.contactManipulationPromise;
                                if (promise2 != null) {
                                    throw new ContactManipulationInProgressException();
                                }
                                if (str != null) {
                                    ContactsModule contactsModule2 = ContactsModule.this;
                                    set = ContactsModuleKt.defaultFields;
                                    contactById = contactsModule2.getContactById(str, set);
                                    if (contactById != null) {
                                        ContactsModule.this.presentEditForm(contactById, promise);
                                    } else {
                                        throw new ContactNotFoundException();
                                    }
                                }
                                if (map != null) {
                                    mutateContact = ContactsModule.this.mutateContact(null, map);
                                    ContactsModule.this.presentForm(mutateContact, promise);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                invoke2(objArr, promise);
                                return Unit.INSTANCE;
                            }
                        });
                        moduleDefinitionBuilder5.getAsyncFunctions().put("presentFormAsync", asyncFunctionWithPromiseComponent3222);
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4222 = asyncFunctionWithPromiseComponent3222;
                        moduleDefinitionBuilder2.getEventListeners().put(EventName.ON_ACTIVITY_RESULT, new EventListenerWithSenderAndPayload(EventName.ON_ACTIVITY_RESULT, new Function2<Activity, OnActivityResultPayload, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$OnActivityResult$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                                invoke2(activity, onActivityResultPayload);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
                            
                                r5 = r4.this$0.contactPickingPromise;
                             */
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                                Promise promise;
                                Promise promise2;
                                Set set;
                                Contact contactById;
                                Bundle bundle;
                                Set<String> set2;
                                Uri data;
                                Intrinsics.checkNotNullParameter(sender, "sender");
                                Intrinsics.checkNotNullParameter(payload, "payload");
                                int requestCode = payload.getRequestCode();
                                int resultCode = payload.getResultCode();
                                Intent data2 = payload.getData();
                                if (requestCode == 2137 || requestCode == 2139) {
                                    promise = ContactsModule.this.contactManipulationPromise;
                                    if (promise == null) {
                                        return;
                                    }
                                    promise.resolve(0);
                                    ContactsModule.this.contactManipulationPromise = null;
                                }
                                if (requestCode != 2138 || promise2 == null) {
                                    return;
                                }
                                if (resultCode == -1) {
                                    String lastPathSegment = (data2 == null || (data = data2.getData()) == null) ? null : data.getLastPathSegment();
                                    ContactsModule contactsModule2 = ContactsModule.this;
                                    set = ContactsModuleKt.defaultFields;
                                    contactById = contactsModule2.getContactById(lastPathSegment, set);
                                    if (contactById != null) {
                                        set2 = ContactsModuleKt.defaultFields;
                                        bundle = contactById.toMap(set2);
                                    } else {
                                        bundle = null;
                                    }
                                    promise2.resolve(bundle);
                                } else {
                                    promise2.resolve();
                                }
                                ContactsModule.this.contactPickingPromise = null;
                            }
                        }));
                        ModuleDefinitionBuilder moduleDefinitionBuilder17222 = moduleDefinitionBuilder2;
                        if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                        }
                        moduleDefinitionBuilder17222.getAsyncFunctions().put("presentContactPickerAsync", intAsyncFunctionComponent6);
                        return moduleDefinitionBuilder2.buildModule();
                    }
                    m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl11);
                    if (m13473exceptionOrNullimpl3 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Map.class.getName(), m13473exceptionOrNullimpl3);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl11)) {
                        m13470constructorimpl11 = null;
                    }
                    typeDescriptor3 = (TypeDescriptor) m13470constructorimpl11;
                    if (typeDescriptor3 != null) {
                        typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Object.class))));
                    }
                    anyType14 = new AnyType(typeDescriptor3, converters10);
                }
                anyTypeArr10[0] = anyType14;
                Function1<Object[], String> function172 = new Function1<Object[], String>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$24
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) {
                        String lookupKeyForContactId;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Map map = (Map) objArr[0];
                        ContactsModule.this.ensureReadPermission();
                        lookupKeyForContactId = ContactsModule.this.getLookupKeyForContactId(map.containsKey("id") ? (String) map.get("id") : null);
                        if (lookupKeyForContactId == null) {
                            throw new LookupKeyNotFoundException();
                        }
                        return Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId).toString();
                    }
                };
                intAsyncFunctionComponent5 = !Intrinsics.areEqual(String.class, Integer.TYPE) ? new IntAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function172) : Intrinsics.areEqual(String.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function172) : Intrinsics.areEqual(String.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function172) : Intrinsics.areEqual(String.class, Float.TYPE) ? new FloatAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function172) : Intrinsics.areEqual(String.class, String.class) ? new StringAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function172) : new UntypedAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr10, function172);
            } else {
                intAsyncFunctionComponent5 = new AsyncFunctionWithPromiseComponent("writeContactToFileAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$22
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        String lookupKeyForContactId;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Map map = (Map) promise;
                        ContactsModule.this.ensureReadPermission();
                        lookupKeyForContactId = ContactsModule.this.getLookupKeyForContactId(map.containsKey("id") ? (String) map.get("id") : null);
                        if (lookupKeyForContactId == null) {
                            throw new LookupKeyNotFoundException();
                        }
                        Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId).toString();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
                moduleDefinitionBuilder4 = moduleDefinitionBuilder15222;
            }
            moduleDefinitionBuilder4.getAsyncFunctions().put("writeContactToFileAsync", intAsyncFunctionComponent5);
            ModuleDefinitionBuilder moduleDefinitionBuilder162222 = moduleDefinitionBuilder2;
            TypeConverterProvider converters72222 = moduleDefinitionBuilder162222.getConverters();
            AnyType[] anyTypeArr72222 = new AnyType[3];
            anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType4 == null) {
                try {
                    Result.Companion companion23 = Result.INSTANCE;
                    m13470constructorimpl12 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$3
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th17) {
                    Result.Companion companion24 = Result.INSTANCE;
                    m13470constructorimpl12 = Result.m13470constructorimpl(ResultKt.createFailure(th17));
                }
                Throwable m13473exceptionOrNullimpl13 = Result.m13473exceptionOrNullimpl(m13470constructorimpl12);
                if (m13473exceptionOrNullimpl13 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl13);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl12)) {
                    m13470constructorimpl12 = null;
                }
                TypeDescriptor typeDescriptor13 = (TypeDescriptor) m13470constructorimpl12;
                if (typeDescriptor13 == null) {
                    typeDescriptor13 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType4 = new AnyType(typeDescriptor13, converters72222);
            }
            anyTypeArr72222[0] = anyType4;
            anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
            if (anyType5 != null) {
                moduleDefinitionBuilder5 = moduleDefinitionBuilder162222;
            } else {
                try {
                    Result.Companion companion25 = Result.INSTANCE;
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Map.class);
                    TypeInfo[] typeInfoArr4 = new TypeInfo[2];
                    moduleDefinitionBuilder5 = moduleDefinitionBuilder162222;
                    try {
                        typeInfoArr4[0] = new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false);
                        typeInfoArr4[1] = new TypeInfo.Simple("kotlin.Any", Reflection.getOrCreateKotlinClass(Object.class), false);
                        m13470constructorimpl13 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Parameterized("kotlin.collections.Map", orCreateKotlinClass4, true, ArraysKt.asList(typeInfoArr4))), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$4
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.nullableTypeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Object.class)));
                            }
                        }));
                    } catch (Throwable th18) {
                        th = th18;
                        Result.Companion companion26 = Result.INSTANCE;
                        m13470constructorimpl13 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl13);
                        if (m13473exceptionOrNullimpl4 != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl13)) {
                        }
                        typeDescriptor4 = (TypeDescriptor) m13470constructorimpl13;
                        if (typeDescriptor4 != null) {
                        }
                        anyType5 = new AnyType(typeDescriptor4, converters72222);
                        anyTypeArr72222[1] = anyType5;
                        anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
                        if (anyType6 == null) {
                        }
                        anyTypeArr72222[2] = anyType6;
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent32222 = new AsyncFunctionWithPromiseComponent("presentFormAsync", anyTypeArr72222, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Object[] objArr, Promise promise) {
                                Promise promise2;
                                Contact mutateContact;
                                Set set;
                                Contact contactById;
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Intrinsics.checkNotNullParameter(promise, "promise");
                                Object obj = objArr[0];
                                Object obj2 = objArr[1];
                                Map map = (Map) obj2;
                                String str = (String) obj;
                                ContactsModule.this.ensureReadPermission();
                                promise2 = ContactsModule.this.contactManipulationPromise;
                                if (promise2 != null) {
                                    throw new ContactManipulationInProgressException();
                                }
                                if (str != null) {
                                    ContactsModule contactsModule2 = ContactsModule.this;
                                    set = ContactsModuleKt.defaultFields;
                                    contactById = contactsModule2.getContactById(str, set);
                                    if (contactById != null) {
                                        ContactsModule.this.presentEditForm(contactById, promise);
                                    } else {
                                        throw new ContactNotFoundException();
                                    }
                                }
                                if (map != null) {
                                    mutateContact = ContactsModule.this.mutateContact(null, map);
                                    ContactsModule.this.presentForm(mutateContact, promise);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                invoke2(objArr, promise);
                                return Unit.INSTANCE;
                            }
                        });
                        moduleDefinitionBuilder5.getAsyncFunctions().put("presentFormAsync", asyncFunctionWithPromiseComponent32222);
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent42222 = asyncFunctionWithPromiseComponent32222;
                        moduleDefinitionBuilder2.getEventListeners().put(EventName.ON_ACTIVITY_RESULT, new EventListenerWithSenderAndPayload(EventName.ON_ACTIVITY_RESULT, new Function2<Activity, OnActivityResultPayload, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$OnActivityResult$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                                invoke2(activity, onActivityResultPayload);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
                            
                                r5 = r4.this$0.contactPickingPromise;
                             */
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                                Promise promise;
                                Promise promise2;
                                Set set;
                                Contact contactById;
                                Bundle bundle;
                                Set<String> set2;
                                Uri data;
                                Intrinsics.checkNotNullParameter(sender, "sender");
                                Intrinsics.checkNotNullParameter(payload, "payload");
                                int requestCode = payload.getRequestCode();
                                int resultCode = payload.getResultCode();
                                Intent data2 = payload.getData();
                                if (requestCode == 2137 || requestCode == 2139) {
                                    promise = ContactsModule.this.contactManipulationPromise;
                                    if (promise == null) {
                                        return;
                                    }
                                    promise.resolve(0);
                                    ContactsModule.this.contactManipulationPromise = null;
                                }
                                if (requestCode != 2138 || promise2 == null) {
                                    return;
                                }
                                if (resultCode == -1) {
                                    String lastPathSegment = (data2 == null || (data = data2.getData()) == null) ? null : data.getLastPathSegment();
                                    ContactsModule contactsModule2 = ContactsModule.this;
                                    set = ContactsModuleKt.defaultFields;
                                    contactById = contactsModule2.getContactById(lastPathSegment, set);
                                    if (contactById != null) {
                                        set2 = ContactsModuleKt.defaultFields;
                                        bundle = contactById.toMap(set2);
                                    } else {
                                        bundle = null;
                                    }
                                    promise2.resolve(bundle);
                                } else {
                                    promise2.resolve();
                                }
                                ContactsModule.this.contactPickingPromise = null;
                            }
                        }));
                        ModuleDefinitionBuilder moduleDefinitionBuilder172222 = moduleDefinitionBuilder2;
                        if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                        }
                        moduleDefinitionBuilder172222.getAsyncFunctions().put("presentContactPickerAsync", intAsyncFunctionComponent6);
                        return moduleDefinitionBuilder2.buildModule();
                    }
                } catch (Throwable th19) {
                    th = th19;
                    moduleDefinitionBuilder5 = moduleDefinitionBuilder162222;
                }
                m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl13);
                if (m13473exceptionOrNullimpl4 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Map.class.getName(), m13473exceptionOrNullimpl4);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl13)) {
                    m13470constructorimpl13 = null;
                }
                typeDescriptor4 = (TypeDescriptor) m13470constructorimpl13;
                if (typeDescriptor4 != null) {
                    typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Object.class))));
                }
                anyType5 = new AnyType(typeDescriptor4, converters72222);
            }
            anyTypeArr72222[1] = anyType5;
            anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
            if (anyType6 == null) {
                try {
                    Result.Companion companion27 = Result.INSTANCE;
                    m13470constructorimpl14 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Parameterized("kotlin.collections.Map", Reflection.getOrCreateKotlinClass(Map.class), true, ArraysKt.asList(new TypeInfo[]{new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false), new TypeInfo.Simple("kotlin.Any", Reflection.getOrCreateKotlinClass(Object.class), true)}))), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Object.class)));
                        }
                    }));
                } catch (Throwable th20) {
                    Result.Companion companion28 = Result.INSTANCE;
                    m13470constructorimpl14 = Result.m13470constructorimpl(ResultKt.createFailure(th20));
                }
                Throwable m13473exceptionOrNullimpl14 = Result.m13473exceptionOrNullimpl(m13470constructorimpl14);
                if (m13473exceptionOrNullimpl14 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Map.class.getName(), m13473exceptionOrNullimpl14);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl14)) {
                    m13470constructorimpl14 = null;
                }
                TypeDescriptor typeDescriptor14 = (TypeDescriptor) m13470constructorimpl14;
                if (typeDescriptor14 == null) {
                    typeDescriptor14 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Object.class))));
                }
                anyType6 = new AnyType(typeDescriptor14, converters72222);
            }
            anyTypeArr72222[2] = anyType6;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent322222 = new AsyncFunctionWithPromiseComponent("presentFormAsync", anyTypeArr72222, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Promise promise2;
                    Contact mutateContact;
                    Set set;
                    Contact contactById;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    Map map = (Map) obj2;
                    String str = (String) obj;
                    ContactsModule.this.ensureReadPermission();
                    promise2 = ContactsModule.this.contactManipulationPromise;
                    if (promise2 != null) {
                        throw new ContactManipulationInProgressException();
                    }
                    if (str != null) {
                        ContactsModule contactsModule2 = ContactsModule.this;
                        set = ContactsModuleKt.defaultFields;
                        contactById = contactsModule2.getContactById(str, set);
                        if (contactById != null) {
                            ContactsModule.this.presentEditForm(contactById, promise);
                        } else {
                            throw new ContactNotFoundException();
                        }
                    }
                    if (map != null) {
                        mutateContact = ContactsModule.this.mutateContact(null, map);
                        ContactsModule.this.presentForm(mutateContact, promise);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder5.getAsyncFunctions().put("presentFormAsync", asyncFunctionWithPromiseComponent322222);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent422222 = asyncFunctionWithPromiseComponent322222;
            moduleDefinitionBuilder2.getEventListeners().put(EventName.ON_ACTIVITY_RESULT, new EventListenerWithSenderAndPayload(EventName.ON_ACTIVITY_RESULT, new Function2<Activity, OnActivityResultPayload, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$OnActivityResult$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                    invoke2(activity, onActivityResultPayload);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
                
                    r5 = r4.this$0.contactPickingPromise;
                 */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                    Promise promise;
                    Promise promise2;
                    Set set;
                    Contact contactById;
                    Bundle bundle;
                    Set<String> set2;
                    Uri data;
                    Intrinsics.checkNotNullParameter(sender, "sender");
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    int requestCode = payload.getRequestCode();
                    int resultCode = payload.getResultCode();
                    Intent data2 = payload.getData();
                    if (requestCode == 2137 || requestCode == 2139) {
                        promise = ContactsModule.this.contactManipulationPromise;
                        if (promise == null) {
                            return;
                        }
                        promise.resolve(0);
                        ContactsModule.this.contactManipulationPromise = null;
                    }
                    if (requestCode != 2138 || promise2 == null) {
                        return;
                    }
                    if (resultCode == -1) {
                        String lastPathSegment = (data2 == null || (data = data2.getData()) == null) ? null : data.getLastPathSegment();
                        ContactsModule contactsModule2 = ContactsModule.this;
                        set = ContactsModuleKt.defaultFields;
                        contactById = contactsModule2.getContactById(lastPathSegment, set);
                        if (contactById != null) {
                            set2 = ContactsModuleKt.defaultFields;
                            bundle = contactById.toMap(set2);
                        } else {
                            bundle = null;
                        }
                        promise2.resolve(bundle);
                    } else {
                        promise2.resolve();
                    }
                    ContactsModule.this.contactPickingPromise = null;
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder1722222 = moduleDefinitionBuilder2;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                TypeConverterProvider converters11 = moduleDefinitionBuilder1722222.getConverters();
                AnyType[] anyTypeArr11 = new AnyType[1];
                AnyType anyType15 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType15 == null) {
                    try {
                        Result.Companion companion29 = Result.INSTANCE;
                        m13470constructorimpl15 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$26
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th21) {
                        Result.Companion companion30 = Result.INSTANCE;
                        m13470constructorimpl15 = Result.m13470constructorimpl(ResultKt.createFailure(th21));
                    }
                    Throwable m13473exceptionOrNullimpl15 = Result.m13473exceptionOrNullimpl(m13470constructorimpl15);
                    if (m13473exceptionOrNullimpl15 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl15);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl15)) {
                        m13470constructorimpl15 = null;
                    }
                    TypeDescriptor typeDescriptor15 = (TypeDescriptor) m13470constructorimpl15;
                    if (typeDescriptor15 == null) {
                        typeDescriptor15 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType15 = new AnyType(typeDescriptor15, converters11);
                }
                anyTypeArr11[0] = anyType15;
                Function1<Object[], Unit> function18 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$27
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Promise promise;
                        Activity currentActivity;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise2 = (Promise) objArr[0];
                        promise = ContactsModule.this.contactPickingPromise;
                        if (promise != null) {
                            throw new ContactPickingInProgressException();
                        }
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("vnd.android.cursor.dir/contact");
                        ContactsModule.this.contactPickingPromise = promise2;
                        currentActivity = ContactsModule.this.getCurrentActivity();
                        currentActivity.startActivityForResult(intent, ContactsModuleKt.RC_PICK_CONTACT);
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent6 = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr11, function18) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr11, function18) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr11, function18) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr11, function18) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr11, function18) : new UntypedAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr11, function18);
            } else {
                intAsyncFunctionComponent6 = new AsyncFunctionWithPromiseComponent("presentContactPickerAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$25
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Promise promise2;
                        Activity currentActivity;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        promise2 = ContactsModule.this.contactPickingPromise;
                        if (promise2 != null) {
                            throw new ContactPickingInProgressException();
                        }
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("vnd.android.cursor.dir/contact");
                        ContactsModule.this.contactPickingPromise = promise;
                        currentActivity = ContactsModule.this.getCurrentActivity();
                        currentActivity.startActivityForResult(intent, ContactsModuleKt.RC_PICK_CONTACT);
                    }
                });
            }
            moduleDefinitionBuilder1722222.getAsyncFunctions().put("presentContactPickerAsync", intAsyncFunctionComponent6);
            return moduleDefinitionBuilder2.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentForm(Contact contact, Promise promise) {
        Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra("name", contact.getFinalDisplayName());
        intent.putParcelableArrayListExtra("data", contact.getContentValues());
        this.contactManipulationPromise = promise;
        getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_ADD_CONTACT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentEditForm(Contact contact, Promise promise) {
        Uri lookupUri = ContactsContract.Contacts.getLookupUri(Long.parseLong(contact.getContactId()), contact.getLookupKey());
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(lookupUri, "vnd.android.cursor.item/contact");
        this.contactManipulationPromise = promise;
        getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_EDIT_CONTACT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getResolver() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext == null) {
            throw new Exceptions.ReactContextLost();
        }
        ContentResolver contentResolver = reactContext.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Contact mutateContact(Contact initContact, Map<String, ? extends Object> data) {
        if (initContact == null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            initContact = new Contact(uuid, getAppContext());
        }
        String str = (String) ContactsModuleKt.safeGet(data, "firstName");
        if (str != null) {
            initContact.setFirstName(str);
        }
        String str2 = (String) ContactsModuleKt.safeGet(data, "middleName");
        if (str2 != null) {
            initContact.setMiddleName(str2);
        }
        String str3 = (String) ContactsModuleKt.safeGet(data, "lastName");
        if (str3 != null) {
            initContact.setLastName(str3);
        }
        String str4 = (String) ContactsModuleKt.safeGet(data, "namePrefix");
        if (str4 != null) {
            initContact.setPrefix(str4);
        }
        String str5 = (String) ContactsModuleKt.safeGet(data, "nameSuffix");
        if (str5 != null) {
            initContact.setSuffix(str5);
        }
        String str6 = (String) ContactsModuleKt.safeGet(data, "phoneticFirstName");
        if (str6 != null) {
            initContact.setPhoneticFirstName(str6);
        }
        String str7 = (String) ContactsModuleKt.safeGet(data, "phoneticMiddleName");
        if (str7 != null) {
            initContact.setPhoneticMiddleName(str7);
        }
        String str8 = (String) ContactsModuleKt.safeGet(data, "phoneticLastName");
        if (str8 != null) {
            initContact.setPhoneticLastName(str8);
        }
        String str9 = (String) ContactsModuleKt.safeGet(data, "company");
        if (str9 != null) {
            initContact.setCompany(str9);
        }
        String str10 = (String) ContactsModuleKt.safeGet(data, "jobTitle");
        if (str10 != null) {
            initContact.setJobTitle(str10);
        }
        String str11 = (String) ContactsModuleKt.safeGet(data, "department");
        if (str11 != null) {
            initContact.setDepartment(str11);
        }
        String str12 = (String) ContactsModuleKt.safeGet(data, "note");
        if (str12 != null) {
            initContact.setNote(str12);
        }
        if (data.containsKey("image")) {
            Object obj = data.get("image");
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey("uri")) {
                    String str13 = (String) map.get("uri");
                    if (str13 != null && !StringsKt.startsWith$default(str13, "file://", false, 2, (Object) null) && !StringsKt.startsWith$default(str13, "content://", false, 2, (Object) null) && !StringsKt.startsWith$default(str13, "android.resource://", false, 2, (Object) null)) {
                        throw new RemoteImageUriException(str13);
                    }
                    initContact.setPhotoUri(str13);
                    initContact.setHasPhoto(true);
                }
            }
        }
        List<PostalAddressModel> decodeList = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "addresses"), PostalAddressModel.class);
        if (decodeList != null) {
            initContact.setAddresses(decodeList);
        }
        List<PhoneNumberModel> decodeList2 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "phoneNumbers"), PhoneNumberModel.class);
        if (decodeList2 != null) {
            initContact.setPhones(decodeList2);
        }
        List<EmailModel> decodeList3 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "emails"), EmailModel.class);
        if (decodeList3 != null) {
            initContact.setEmails(decodeList3);
        }
        List<ImAddressModel> decodeList4 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "instantMessageAddresses"), ImAddressModel.class);
        if (decodeList4 != null) {
            initContact.setImAddresses(decodeList4);
        }
        List<UrlAddressModel> decodeList5 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "urlAddresses"), UrlAddressModel.class);
        if (decodeList5 != null) {
            initContact.setUrlAddresses(decodeList5);
        }
        List<ExtraNameModel> decodeList6 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "extraNames"), ExtraNameModel.class);
        if (decodeList6 != null) {
            initContact.setExtraNames(decodeList6);
        }
        List<DateModel> decodeList7 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "dates"), DateModel.class);
        if (decodeList7 != null) {
            initContact.setDates(decodeList7);
        }
        Object obj2 = data.get(DateModelKt.BIRTHDAY);
        if (obj2 != null) {
            Object obj3 = obj2 instanceof Map ? obj2 : null;
            if (obj3 != null) {
                List<DateModel> dates = initContact.getDates();
                BirthdayModel birthdayModel = new BirthdayModel();
                birthdayModel.fromMap((Map) obj3);
                dates.add(birthdayModel);
            }
        }
        List<RelationshipModel> decodeList8 = BaseModel.INSTANCE.decodeList((List) ContactsModuleKt.safeGet(data, "relationships"), RelationshipModel.class);
        if (decodeList8 != null) {
            initContact.setRelationships(decodeList8);
        }
        Boolean bool = (Boolean) ContactsModuleKt.safeGet(data, "isFavorite");
        if (bool != null) {
            initContact.setFavorite(bool.booleanValue());
        }
        return initContact;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLookupKeyForContactId(String contactId) {
        Cursor query = getResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"lookup"}, "_id = " + contactId, null, null);
        if (query == null) {
            return null;
        }
        Cursor cursor = query;
        try {
            Cursor cursor2 = cursor;
            String string = cursor2.moveToFirst() ? cursor2.getString(0) : null;
            CloseableKt.closeFinally(cursor, null);
            return string;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Contact getContactById(String contactId, Set<String> keysToFetch) {
        Cursor query = getResolver().query(ContactsContract.Data.CONTENT_URI, createProjectionForQuery(keysToFetch).getProjection(), "contact_id = ?", new String[]{contactId}, null);
        if (query == null) {
            return null;
        }
        Cursor cursor = query;
        try {
            Contact contact = (Contact) CollectionsKt.firstOrNull(loadContactsFrom(cursor).values());
            CloseableKt.closeFinally(cursor, null);
            return contact;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactPage getContactByName(String query, Set<String> keysToFetch, String sortOrder) {
        return fetchContacts(0, 9999, new String[]{query}, Columns.DISPLAY_NAME, keysToFetch, sortOrder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactPage getAllContactsAsync(ContactQuery options) {
        return fetchContacts(options.getPageOffset(), options.getPageSize(), null, null, options.getFields(), options.getSort());
    }

    private final QueryArguments createProjectionForQuery(Set<String> keysToFetch) {
        List list;
        String str;
        list = ContactsModuleKt.DEFAULT_PROJECTION;
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.listOf((Object[]) new String[]{"vnd.android.cursor.item/name", "vnd.android.cursor.item/organization"}));
        if (!keysToFetch.contains("phoneNumbers")) {
            str = "mimetype=? OR mimetype=?";
        } else {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.IS_PRIMARY);
            arrayList.add("_id");
            arrayList2.add("vnd.android.cursor.item/phone_v2");
            str = "mimetype=? OR mimetype=? OR mimetype=?";
        }
        if (keysToFetch.contains("emails")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.IS_PRIMARY);
            arrayList.add("_id");
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/email_v2");
        }
        if (keysToFetch.contains("addresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.DATA_4);
            arrayList.add(Columns.DATA_5);
            arrayList.add(Columns.DATA_6);
            arrayList.add(Columns.DATA_7);
            arrayList.add(Columns.DATA_8);
            arrayList.add(Columns.DATA_9);
            arrayList.add(Columns.DATA_10);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/postal-address_v2");
        }
        if (keysToFetch.contains("note")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/note");
        }
        if (keysToFetch.contains(DateModelKt.BIRTHDAY) || keysToFetch.contains("dates")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/contact_event");
        }
        if (keysToFetch.contains("instantMessageAddresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.DATA_5);
            arrayList.add("_id");
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/im");
        }
        if (keysToFetch.contains("urlAddresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add("_id");
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/website");
        }
        if (keysToFetch.contains("extraNames")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/nickname");
        }
        if (keysToFetch.contains("relationships")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add("_id");
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/relation");
        }
        if (keysToFetch.contains("phoneticFirstName")) {
            arrayList.add(Columns.DATA_7);
        }
        if (keysToFetch.contains("phoneticLastName")) {
            arrayList.add(Columns.DATA_9);
        }
        if (keysToFetch.contains("phoneticMiddleName")) {
            arrayList.add(Columns.DATA_8);
        }
        if (keysToFetch.contains("namePrefix")) {
            arrayList.add(Columns.DATA_4);
        }
        if (keysToFetch.contains("nameSuffix")) {
            arrayList.add(Columns.DATA_6);
        }
        if (keysToFetch.contains("isFavorite")) {
            arrayList.add(Columns.STARRED);
        }
        return new QueryArguments((String[]) arrayList.toArray(new String[0]), str, (String[]) arrayList2.toArray(new String[0]));
    }

    private final ContactPage fetchContacts(int pageOffset, int pageSize, String[] queryStrings, String initQueryField, Set<String> keysToFetch, String sortOrder) {
        Cursor query;
        if (initQueryField == null) {
            initQueryField = "contact_id";
        }
        boolean z = true;
        boolean z2 = pageSize == 0;
        QueryArguments createProjectionForQuery = createProjectionForQuery(keysToFetch);
        ContentResolver resolver = getResolver();
        if (queryStrings != null && queryStrings.length != 0) {
            query = resolver.query(ContactsContract.Data.CONTENT_URI, createProjectionForQuery.getProjection(), initQueryField + " LIKE ?", queryStrings, null);
        } else {
            query = resolver.query(ContactsContract.Data.CONTENT_URI, createProjectionForQuery.getProjection(), createProjectionForQuery.getSelection(), createProjectionForQuery.getSelectionArgs(), null);
        }
        if (query == null) {
            return null;
        }
        Cursor cursor = query;
        try {
            Map<String, Contact> loadContactsFrom = loadContactsFrom(cursor);
            ArrayList arrayList = new ArrayList();
            ArrayList<Contact> sortContactsBy = sortContactsBy(new ArrayList<>(loadContactsFrom.values()), sortOrder);
            int size = sortContactsBy.size();
            for (int i = z2 ? 0 : pageOffset; i < size; i++) {
                Contact contact = sortContactsBy.get(i);
                Intrinsics.checkNotNullExpressionValue(contact, "get(...)");
                Contact contact2 = contact;
                if (!z2 && i - pageOffset >= pageSize) {
                    break;
                }
                arrayList.add(contact2);
            }
            ArrayList arrayList2 = arrayList;
            boolean z3 = pageOffset > 0;
            if (pageOffset + pageSize >= size) {
                z = false;
            }
            ContactPage contactPage = new ContactPage(arrayList2, z3, z, size);
            CloseableKt.closeFinally(cursor, null);
            return contactPage;
        } finally {
        }
    }

    private final ArrayList<Contact> sortContactsBy(ArrayList<Contact> input, String sortOrder) {
        if (Intrinsics.areEqual(sortOrder, "firstName")) {
            final Function2 function2 = new Function2() { // from class: expo.modules.contacts.ContactsModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int sortContactsBy$lambda$43;
                    sortContactsBy$lambda$43 = ContactsModule.sortContactsBy$lambda$43((Contact) obj, (Contact) obj2);
                    return Integer.valueOf(sortContactsBy$lambda$43);
                }
            };
            CollectionsKt.sortWith(input, new Comparator() { // from class: expo.modules.contacts.ContactsModule$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int sortContactsBy$lambda$44;
                    sortContactsBy$lambda$44 = ContactsModule.sortContactsBy$lambda$44(Function2.this, obj, obj2);
                    return sortContactsBy$lambda$44;
                }
            });
            return input;
        }
        if (Intrinsics.areEqual(sortOrder, "lastName")) {
            final Function2 function22 = new Function2() { // from class: expo.modules.contacts.ContactsModule$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int sortContactsBy$lambda$45;
                    sortContactsBy$lambda$45 = ContactsModule.sortContactsBy$lambda$45((Contact) obj, (Contact) obj2);
                    return Integer.valueOf(sortContactsBy$lambda$45);
                }
            };
            CollectionsKt.sortWith(input, new Comparator() { // from class: expo.modules.contacts.ContactsModule$$ExternalSyntheticLambda3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int sortContactsBy$lambda$46;
                    sortContactsBy$lambda$46 = ContactsModule.sortContactsBy$lambda$46(Function2.this, obj, obj2);
                    return sortContactsBy$lambda$46;
                }
            });
        }
        return input;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$43(Contact contact, Contact contact2) {
        return StringsKt.compareTo(contact.getFinalFirstName(), contact2.getFinalFirstName(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$44(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$45(Contact contact, Contact contact2) {
        return StringsKt.compareTo(contact.getFinalLastName(), contact2.getFinalLastName(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$46(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private final Map<String, Contact> loadContactsFrom(Cursor cursor) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex("contact_id"));
            Object obj = linkedHashMap.get(string);
            if (obj == null) {
                Intrinsics.checkNotNull(string);
                obj = new Contact(string, getAppContext());
                linkedHashMap.put(string, obj);
            }
            ((Contact) obj).fromCursor(cursor);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureReadPermission() {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.READ_CONTACTS")) {
            throw new MissingPermissionException("android.permission.READ_CONTACTS");
        }
    }

    private final void ensureWritePermission() {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.WRITE_CONTACTS")) {
            throw new MissingPermissionException("android.permission.WRITE_CONTACTS");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensurePermissions() {
        ensureReadPermission();
        ensureWritePermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startObservingContactChanges() {
        if (this.contactChangeObserver != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ContactsObserverThread");
        this.contactsHandlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.contactsHandlerThread;
        Intrinsics.checkNotNull(handlerThread2);
        final Handler handler = new Handler(handlerThread2.getLooper());
        this.contactsHandler = handler;
        ContentObserver contentObserver = new ContentObserver(handler) { // from class: expo.modules.contacts.ContactsModule$startObservingContactChanges$observer$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, Uri uri) {
                super.onChange(selfChange, uri);
                ContactsModule.this.handleContactChange();
            }
        };
        Iterator it = CollectionsKt.listOf((Object[]) new Uri[]{ContactsContract.Contacts.CONTENT_URI, ContactsContract.RawContacts.CONTENT_URI}).iterator();
        while (it.hasNext()) {
            getResolver().registerContentObserver((Uri) it.next(), true, contentObserver);
        }
        this.contactChangeObserver = contentObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopObservingContactChanges() {
        ContentObserver contentObserver = this.contactChangeObserver;
        if (contentObserver != null) {
            getResolver().unregisterContentObserver(contentObserver);
            this.contactChangeObserver = null;
        }
        this.contactsHandler = null;
        HandlerThread handlerThread = this.contactsHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.contactsHandlerThread = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleContactChange() {
        sendEvent("onContactsChange", MapsKt.mapOf(TuplesKt.to("body", null)));
    }
}
