package expo.modules.contacts.next;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import androidx.tracing.Trace;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.intents.ContactIntentDelegate;
import expo.modules.contacts.next.mappers.ContactRecordDomainMapper;
import expo.modules.contacts.next.mappers.domain.data.PhotoPropertyMapper;
import expo.modules.contacts.next.observers.ContactsObserverDelegate;
import expo.modules.contacts.next.records.ContactQueryOptions;
import expo.modules.contacts.next.records.contact.CreateContactRecord;
import expo.modules.contacts.next.records.contact.PatchContactRecord;
import expo.modules.contacts.next.records.fields.AddressRecord;
import expo.modules.contacts.next.records.fields.ContactField;
import expo.modules.contacts.next.records.fields.DateRecord;
import expo.modules.contacts.next.records.fields.EmailRecord;
import expo.modules.contacts.next.records.fields.ExtraNameRecord;
import expo.modules.contacts.next.records.fields.PhoneRecord;
import expo.modules.contacts.next.records.fields.RelationRecord;
import expo.modules.contacts.next.records.fields.UrlAddressRecord;
import expo.modules.contacts.next.services.ImageByteArrayConverter;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: ContactsNextModule.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010.\u001a\u00020/H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\r\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\r\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lexpo/modules/contacts/next/ContactsNextModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "imageByteArrayConverter", "Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", "getImageByteArrayConverter", "()Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", "imageByteArrayConverter$delegate", "Lkotlin/Lazy;", "photoPropertyMapper", "Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "getPhotoPropertyMapper", "()Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "photoPropertyMapper$delegate", "contactMapper", "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "getContactMapper", "()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "contactMapper$delegate", "contactIntentDelegate", "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "contactRepository", "Lexpo/modules/contacts/next/domain/ContactRepository;", "getContactRepository", "()Lexpo/modules/contacts/next/domain/ContactRepository;", "contactRepository$delegate", "contactFactory", "Lexpo/modules/contacts/next/ContactFactory;", "getContactFactory", "()Lexpo/modules/contacts/next/ContactFactory;", "contactFactory$delegate", "permissionsDelegate", "Lexpo/modules/contacts/next/ContactsPermissionsDelegate;", "getPermissionsDelegate", "()Lexpo/modules/contacts/next/ContactsPermissionsDelegate;", "permissionsDelegate$delegate", "observerDelegate", "Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;", "getObserverDelegate", "()Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;", "observerDelegate$delegate", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactsNextModule extends Module {

    /* renamed from: imageByteArrayConverter$delegate, reason: from kotlin metadata */
    private final Lazy imageByteArrayConverter = LazyKt.lazy(new Function0() { // from class: expo.modules.contacts.next.ContactsNextModule$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ImageByteArrayConverter imageByteArrayConverter_delegate$lambda$0;
            imageByteArrayConverter_delegate$lambda$0 = ContactsNextModule.imageByteArrayConverter_delegate$lambda$0(ContactsNextModule.this);
            return imageByteArrayConverter_delegate$lambda$0;
        }
    });

    /* renamed from: photoPropertyMapper$delegate, reason: from kotlin metadata */
    private final Lazy photoPropertyMapper = LazyKt.lazy(new Function0() { // from class: expo.modules.contacts.next.ContactsNextModule$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            PhotoPropertyMapper photoPropertyMapper_delegate$lambda$1;
            photoPropertyMapper_delegate$lambda$1 = ContactsNextModule.photoPropertyMapper_delegate$lambda$1(ContactsNextModule.this);
            return photoPropertyMapper_delegate$lambda$1;
        }
    });

    /* renamed from: contactMapper$delegate, reason: from kotlin metadata */
    private final Lazy contactMapper = LazyKt.lazy(new Function0() { // from class: expo.modules.contacts.next.ContactsNextModule$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ContactRecordDomainMapper contactMapper_delegate$lambda$2;
            contactMapper_delegate$lambda$2 = ContactsNextModule.contactMapper_delegate$lambda$2(ContactsNextModule.this);
            return contactMapper_delegate$lambda$2;
        }
    });
    private final ContactIntentDelegate contactIntentDelegate = new ContactIntentDelegate();

    /* renamed from: contactRepository$delegate, reason: from kotlin metadata */
    private final Lazy contactRepository = LazyKt.lazy(new Function0() { // from class: expo.modules.contacts.next.ContactsNextModule$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ContactRepository contactRepository_delegate$lambda$3;
            contactRepository_delegate$lambda$3 = ContactsNextModule.contactRepository_delegate$lambda$3(ContactsNextModule.this);
            return contactRepository_delegate$lambda$3;
        }
    });

    /* renamed from: contactFactory$delegate, reason: from kotlin metadata */
    private final Lazy contactFactory = LazyKt.lazy(new Function0() { // from class: expo.modules.contacts.next.ContactsNextModule$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ContactFactory contactFactory_delegate$lambda$4;
            contactFactory_delegate$lambda$4 = ContactsNextModule.contactFactory_delegate$lambda$4(ContactsNextModule.this);
            return contactFactory_delegate$lambda$4;
        }
    });

    /* renamed from: permissionsDelegate$delegate, reason: from kotlin metadata */
    private final Lazy permissionsDelegate = LazyKt.lazy(new Function0() { // from class: expo.modules.contacts.next.ContactsNextModule$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ContactsPermissionsDelegate permissionsDelegate_delegate$lambda$5;
            permissionsDelegate_delegate$lambda$5 = ContactsNextModule.permissionsDelegate_delegate$lambda$5(ContactsNextModule.this);
            return permissionsDelegate_delegate$lambda$5;
        }
    });

    /* renamed from: observerDelegate$delegate, reason: from kotlin metadata */
    private final Lazy observerDelegate = LazyKt.lazy(new Function0() { // from class: expo.modules.contacts.next.ContactsNextModule$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ContactsObserverDelegate observerDelegate_delegate$lambda$6;
            observerDelegate_delegate$lambda$6 = ContactsNextModule.observerDelegate_delegate$lambda$6(ContactsNextModule.this);
            return observerDelegate_delegate$lambda$6;
        }
    });

    private final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    private final ImageByteArrayConverter getImageByteArrayConverter() {
        return (ImageByteArrayConverter) this.imageByteArrayConverter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageByteArrayConverter imageByteArrayConverter_delegate$lambda$0(ContactsNextModule contactsNextModule) {
        ContentResolver contentResolver = contactsNextModule.getContext().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return new ImageByteArrayConverter(contentResolver);
    }

    private final PhotoPropertyMapper getPhotoPropertyMapper() {
        return (PhotoPropertyMapper) this.photoPropertyMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PhotoPropertyMapper photoPropertyMapper_delegate$lambda$1(ContactsNextModule contactsNextModule) {
        return new PhotoPropertyMapper(contactsNextModule.getImageByteArrayConverter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactRecordDomainMapper getContactMapper() {
        return (ContactRecordDomainMapper) this.contactMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactRecordDomainMapper contactMapper_delegate$lambda$2(ContactsNextModule contactsNextModule) {
        return new ContactRecordDomainMapper(contactsNextModule.getImageByteArrayConverter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactRepository getContactRepository() {
        return (ContactRepository) this.contactRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactRepository contactRepository_delegate$lambda$3(ContactsNextModule contactsNextModule) {
        ContentResolver contentResolver = contactsNextModule.getContext().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return new ContactRepository(contentResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactFactory getContactFactory() {
        return (ContactFactory) this.contactFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactFactory contactFactory_delegate$lambda$4(ContactsNextModule contactsNextModule) {
        return new ContactFactory(contactsNextModule.getContactRepository(), contactsNextModule.getContactMapper(), contactsNextModule.getPhotoPropertyMapper(), contactsNextModule.contactIntentDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactsPermissionsDelegate getPermissionsDelegate() {
        return (ContactsPermissionsDelegate) this.permissionsDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactsPermissionsDelegate permissionsDelegate_delegate$lambda$5(ContactsNextModule contactsNextModule) {
        return new ContactsPermissionsDelegate(contactsNextModule.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactsObserverDelegate getObserverDelegate() {
        return (ContactsObserverDelegate) this.observerDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactsObserverDelegate observerDelegate_delegate$lambda$6(ContactsNextModule contactsNextModule) {
        return new ContactsObserverDelegate(contactsNextModule.getAppContext(), contactsNextModule);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1015:0x301d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x2f6f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1047:0x2ee8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1063:0x2e37 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1079:0x2db2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1095:0x2d04 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1111:0x2c58 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1127:0x2bd3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1143:0x2b25 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1159:0x2a9e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1175:0x29ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1191:0x2968 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1207:0x28ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1223:0x280e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1239:0x2789 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1255:0x26db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1271:0x2654 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1287:0x25a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1303:0x251e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1319:0x2470 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1335:0x23c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1351:0x2316 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1367:0x2291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1383:0x21e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1399:0x2137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1415:0x20b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1431:0x2002 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1447:0x1f56 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1463:0x1ecf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1479:0x1e21 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1495:0x1d75 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1511:0x1cee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1527:0x1c40 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1543:0x1b94 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1559:0x1b0d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1575:0x1a5f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1591:0x19b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1607:0x192c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1623:0x187e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1639:0x17d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1655:0x174b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1671:0x169d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1687:0x15f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1703:0x156a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1719:0x14bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1735:0x1410 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1751:0x1389 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1767:0x12db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1783:0x122f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1799:0x11a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1815:0x10fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1831:0x104e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1847:0x0fc7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1863:0x0f19 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1879:0x0e6d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1895:0x0de6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1911:0x0d38 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1927:0x0c8c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1943:0x0c05 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1959:0x0b57 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1975:0x0aab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1991:0x0a24 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2007:0x0976 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2023:0x08c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2030:0x08fb A[Catch: all -> 0x4943, TryCatch #21 {all -> 0x4943, blocks: (B:27:0x0381, B:30:0x042d, B:33:0x04db, B:36:0x0562, B:39:0x0611, B:43:0x0698, B:46:0x0744, B:49:0x07f0, B:52:0x089e, B:56:0x092d, B:59:0x09d9, B:62:0x0a87, B:65:0x0b0e, B:68:0x0bba, B:71:0x0c68, B:74:0x0cef, B:77:0x0d9b, B:80:0x0e49, B:83:0x0ed0, B:86:0x0f7c, B:89:0x102a, B:92:0x10b1, B:95:0x115d, B:98:0x120b, B:101:0x1292, B:104:0x133e, B:107:0x13ec, B:110:0x1473, B:113:0x151f, B:116:0x15cd, B:119:0x1654, B:122:0x1700, B:125:0x17ae, B:128:0x1835, B:131:0x18e1, B:134:0x198f, B:137:0x1a16, B:140:0x1ac2, B:143:0x1b70, B:146:0x1bf7, B:149:0x1ca3, B:152:0x1d51, B:155:0x1dd8, B:158:0x1e84, B:161:0x1f32, B:164:0x1fb9, B:167:0x2065, B:170:0x2113, B:173:0x219a, B:176:0x2246, B:179:0x22f4, B:182:0x237b, B:185:0x2427, B:188:0x24d3, B:191:0x2581, B:194:0x2608, B:197:0x26b7, B:201:0x273e, B:204:0x27ec, B:207:0x2871, B:210:0x291d, B:213:0x29cb, B:216:0x2a52, B:219:0x2b01, B:223:0x2b88, B:226:0x2c36, B:229:0x2cbb, B:232:0x2d67, B:235:0x2e15, B:238:0x2e9c, B:241:0x2f4b, B:245:0x2fd2, B:248:0x3080, B:251:0x3105, B:254:0x31b1, B:257:0x325f, B:260:0x32e6, B:263:0x3395, B:267:0x341c, B:270:0x34ca, B:273:0x354f, B:276:0x35fb, B:279:0x36a9, B:282:0x3730, B:285:0x37df, B:289:0x3866, B:292:0x3914, B:295:0x3999, B:298:0x3a45, B:301:0x3af3, B:304:0x3b7a, B:307:0x3c29, B:311:0x3cb0, B:314:0x3d5e, B:317:0x3de3, B:320:0x3e8f, B:323:0x3f3d, B:326:0x3fc4, B:329:0x4073, B:333:0x40fa, B:336:0x41a8, B:339:0x422d, B:342:0x42d9, B:345:0x4385, B:521:0x434d, B:523:0x4353, B:524:0x4368, B:527:0x436f, B:530:0x437e, B:531:0x4374, B:534:0x4343, B:537:0x42a1, B:539:0x42a7, B:540:0x42bc, B:543:0x42c3, B:546:0x42d2, B:547:0x42c8, B:550:0x4297, B:553:0x41f5, B:555:0x41fb, B:556:0x4210, B:559:0x4217, B:562:0x4226, B:563:0x421c, B:566:0x41eb, B:569:0x4170, B:571:0x4176, B:572:0x418b, B:575:0x4192, B:578:0x41a1, B:579:0x4197, B:582:0x4166, B:585:0x40c2, B:587:0x40c8, B:588:0x40dd, B:591:0x40e4, B:594:0x40f3, B:595:0x40e9, B:598:0x40b8, B:601:0x403b, B:603:0x4041, B:604:0x4056, B:607:0x405d, B:610:0x406c, B:611:0x4062, B:614:0x4031, B:617:0x3f8c, B:619:0x3f92, B:620:0x3fa7, B:623:0x3fae, B:626:0x3fbd, B:627:0x3fb3, B:630:0x3f82, B:633:0x3f05, B:635:0x3f0b, B:636:0x3f20, B:639:0x3f27, B:642:0x3f36, B:643:0x3f2c, B:646:0x3efb, B:649:0x3e57, B:651:0x3e5d, B:652:0x3e72, B:655:0x3e79, B:658:0x3e88, B:659:0x3e7e, B:662:0x3e4d, B:665:0x3dab, B:667:0x3db1, B:668:0x3dc6, B:671:0x3dcd, B:674:0x3ddc, B:675:0x3dd2, B:678:0x3da1, B:681:0x3d26, B:683:0x3d2c, B:684:0x3d41, B:687:0x3d48, B:690:0x3d57, B:691:0x3d4d, B:694:0x3d1c, B:697:0x3c78, B:699:0x3c7e, B:700:0x3c93, B:703:0x3c9a, B:706:0x3ca9, B:707:0x3c9f, B:710:0x3c6e, B:713:0x3bf1, B:715:0x3bf7, B:716:0x3c0c, B:719:0x3c13, B:722:0x3c22, B:723:0x3c18, B:726:0x3be7, B:729:0x3b42, B:731:0x3b48, B:732:0x3b5d, B:735:0x3b64, B:738:0x3b73, B:739:0x3b69, B:742:0x3b38, B:745:0x3abb, B:747:0x3ac1, B:748:0x3ad6, B:751:0x3add, B:754:0x3aec, B:755:0x3ae2, B:758:0x3ab1, B:761:0x3a0d, B:763:0x3a13, B:764:0x3a28, B:767:0x3a2f, B:770:0x3a3e, B:771:0x3a34, B:774:0x3a03, B:777:0x3961, B:779:0x3967, B:780:0x397c, B:783:0x3983, B:786:0x3992, B:787:0x3988, B:790:0x3957, B:793:0x38dc, B:795:0x38e2, B:796:0x38f7, B:799:0x38fe, B:802:0x390d, B:803:0x3903, B:806:0x38d2, B:809:0x382e, B:811:0x3834, B:812:0x3849, B:815:0x3850, B:818:0x385f, B:819:0x3855, B:822:0x3824, B:825:0x37a7, B:827:0x37ad, B:828:0x37c2, B:831:0x37c9, B:834:0x37d8, B:835:0x37ce, B:838:0x379d, B:841:0x36f8, B:843:0x36fe, B:844:0x3713, B:847:0x371a, B:850:0x3729, B:851:0x371f, B:854:0x36ee, B:857:0x3671, B:859:0x3677, B:860:0x368c, B:863:0x3693, B:866:0x36a2, B:867:0x3698, B:870:0x3667, B:873:0x35c3, B:875:0x35c9, B:876:0x35de, B:879:0x35e5, B:882:0x35f4, B:883:0x35ea, B:886:0x35b9, B:889:0x3517, B:891:0x351d, B:892:0x3532, B:895:0x3539, B:898:0x3548, B:899:0x353e, B:902:0x350d, B:905:0x3492, B:907:0x3498, B:908:0x34ad, B:911:0x34b4, B:914:0x34c3, B:915:0x34b9, B:918:0x3488, B:921:0x33e4, B:923:0x33ea, B:924:0x33ff, B:927:0x3406, B:930:0x3415, B:931:0x340b, B:934:0x33da, B:937:0x335d, B:939:0x3363, B:940:0x3378, B:943:0x337f, B:946:0x338e, B:947:0x3384, B:950:0x3353, B:953:0x32ae, B:955:0x32b4, B:956:0x32c9, B:959:0x32d0, B:962:0x32df, B:963:0x32d5, B:966:0x32a4, B:969:0x3227, B:971:0x322d, B:972:0x3242, B:975:0x3249, B:978:0x3258, B:979:0x324e, B:982:0x321d, B:985:0x3179, B:987:0x317f, B:988:0x3194, B:991:0x319b, B:994:0x31aa, B:995:0x31a0, B:998:0x316f, B:1001:0x30cd, B:1003:0x30d3, B:1004:0x30e8, B:1007:0x30ef, B:1010:0x30fe, B:1011:0x30f4, B:1014:0x30c3, B:1017:0x3048, B:1019:0x304e, B:1020:0x3063, B:1023:0x306a, B:1026:0x3079, B:1027:0x306f, B:1030:0x303e, B:1033:0x2f9a, B:1035:0x2fa0, B:1036:0x2fb5, B:1039:0x2fbc, B:1042:0x2fcb, B:1043:0x2fc1, B:1046:0x2f90, B:1049:0x2f13, B:1051:0x2f19, B:1052:0x2f2e, B:1055:0x2f35, B:1058:0x2f44, B:1059:0x2f3a, B:1062:0x2f09, B:1065:0x2e64, B:1067:0x2e6a, B:1068:0x2e7f, B:1071:0x2e86, B:1074:0x2e95, B:1075:0x2e8b, B:1078:0x2e5a, B:1081:0x2ddd, B:1083:0x2de3, B:1084:0x2df8, B:1087:0x2dff, B:1090:0x2e0e, B:1091:0x2e04, B:1094:0x2dd3, B:1097:0x2d2f, B:1099:0x2d35, B:1100:0x2d4a, B:1103:0x2d51, B:1106:0x2d60, B:1107:0x2d56, B:1110:0x2d25, B:1113:0x2c83, B:1115:0x2c89, B:1116:0x2c9e, B:1119:0x2ca5, B:1122:0x2cb4, B:1123:0x2caa, B:1126:0x2c79, B:1129:0x2bfe, B:1131:0x2c04, B:1132:0x2c19, B:1135:0x2c20, B:1138:0x2c2f, B:1139:0x2c25, B:1142:0x2bf4, B:1145:0x2b50, B:1147:0x2b56, B:1148:0x2b6b, B:1151:0x2b72, B:1154:0x2b81, B:1155:0x2b77, B:1158:0x2b46, B:1161:0x2ac9, B:1163:0x2acf, B:1164:0x2ae4, B:1167:0x2aeb, B:1170:0x2afa, B:1171:0x2af0, B:1174:0x2abf, B:1177:0x2a1a, B:1179:0x2a20, B:1180:0x2a35, B:1183:0x2a3c, B:1186:0x2a4b, B:1187:0x2a41, B:1190:0x2a10, B:1193:0x2993, B:1195:0x2999, B:1196:0x29ae, B:1199:0x29b5, B:1202:0x29c4, B:1203:0x29ba, B:1206:0x2989, B:1209:0x28e5, B:1211:0x28eb, B:1212:0x2900, B:1215:0x2907, B:1218:0x2916, B:1219:0x290c, B:1222:0x28db, B:1225:0x2839, B:1227:0x283f, B:1228:0x2854, B:1231:0x285b, B:1234:0x286a, B:1235:0x2860, B:1238:0x282f, B:1241:0x27b4, B:1243:0x27ba, B:1244:0x27cf, B:1247:0x27d6, B:1250:0x27e5, B:1251:0x27db, B:1254:0x27aa, B:1257:0x2706, B:1259:0x270c, B:1260:0x2721, B:1263:0x2728, B:1266:0x2737, B:1267:0x272d, B:1270:0x26fc, B:1273:0x267f, B:1275:0x2685, B:1276:0x269a, B:1279:0x26a1, B:1282:0x26b0, B:1283:0x26a6, B:1286:0x2675, B:1289:0x25d0, B:1291:0x25d6, B:1292:0x25eb, B:1295:0x25f2, B:1298:0x2601, B:1299:0x25f7, B:1302:0x25c6, B:1305:0x2549, B:1307:0x254f, B:1308:0x2564, B:1311:0x256b, B:1314:0x257a, B:1315:0x2570, B:1318:0x253f, B:1321:0x249b, B:1323:0x24a1, B:1324:0x24b6, B:1327:0x24bd, B:1330:0x24cc, B:1331:0x24c2, B:1334:0x2491, B:1337:0x23ef, B:1339:0x23f5, B:1340:0x240a, B:1343:0x2411, B:1346:0x2420, B:1347:0x2416, B:1350:0x23e5, B:1353:0x2343, B:1355:0x2349, B:1356:0x235e, B:1359:0x2365, B:1362:0x2374, B:1363:0x236a, B:1366:0x2339, B:1369:0x22bc, B:1371:0x22c2, B:1372:0x22d7, B:1375:0x22de, B:1378:0x22ed, B:1379:0x22e3, B:1382:0x22b2, B:1385:0x220e, B:1387:0x2214, B:1388:0x2229, B:1391:0x2230, B:1394:0x223f, B:1395:0x2235, B:1398:0x2204, B:1401:0x2162, B:1403:0x2168, B:1404:0x217d, B:1407:0x2184, B:1410:0x2193, B:1411:0x2189, B:1414:0x2158, B:1417:0x20db, B:1419:0x20e1, B:1420:0x20f6, B:1423:0x20fd, B:1426:0x210c, B:1427:0x2102, B:1430:0x20d1, B:1433:0x202d, B:1435:0x2033, B:1436:0x2048, B:1439:0x204f, B:1442:0x205e, B:1443:0x2054, B:1446:0x2023, B:1449:0x1f81, B:1451:0x1f87, B:1452:0x1f9c, B:1455:0x1fa3, B:1458:0x1fb2, B:1459:0x1fa8, B:1462:0x1f77, B:1465:0x1efa, B:1467:0x1f00, B:1468:0x1f15, B:1471:0x1f1c, B:1474:0x1f2b, B:1475:0x1f21, B:1478:0x1ef0, B:1481:0x1e4c, B:1483:0x1e52, B:1484:0x1e67, B:1487:0x1e6e, B:1490:0x1e7d, B:1491:0x1e73, B:1494:0x1e42, B:1497:0x1da0, B:1499:0x1da6, B:1500:0x1dbb, B:1503:0x1dc2, B:1506:0x1dd1, B:1507:0x1dc7, B:1510:0x1d96, B:1513:0x1d19, B:1515:0x1d1f, B:1516:0x1d34, B:1519:0x1d3b, B:1522:0x1d4a, B:1523:0x1d40, B:1526:0x1d0f, B:1529:0x1c6b, B:1531:0x1c71, B:1532:0x1c86, B:1535:0x1c8d, B:1538:0x1c9c, B:1539:0x1c92, B:1542:0x1c61, B:1545:0x1bbf, B:1547:0x1bc5, B:1548:0x1bda, B:1551:0x1be1, B:1554:0x1bf0, B:1555:0x1be6, B:1558:0x1bb5, B:1561:0x1b38, B:1563:0x1b3e, B:1564:0x1b53, B:1567:0x1b5a, B:1570:0x1b69, B:1571:0x1b5f, B:1574:0x1b2e, B:1577:0x1a8a, B:1579:0x1a90, B:1580:0x1aa5, B:1583:0x1aac, B:1586:0x1abb, B:1587:0x1ab1, B:1590:0x1a80, B:1593:0x19de, B:1595:0x19e4, B:1596:0x19f9, B:1599:0x1a00, B:1602:0x1a0f, B:1603:0x1a05, B:1606:0x19d4, B:1609:0x1957, B:1611:0x195d, B:1612:0x1972, B:1615:0x1979, B:1618:0x1988, B:1619:0x197e, B:1622:0x194d, B:1625:0x18a9, B:1627:0x18af, B:1628:0x18c4, B:1631:0x18cb, B:1634:0x18da, B:1635:0x18d0, B:1638:0x189f, B:1641:0x17fd, B:1643:0x1803, B:1644:0x1818, B:1647:0x181f, B:1650:0x182e, B:1651:0x1824, B:1654:0x17f3, B:1657:0x1776, B:1659:0x177c, B:1660:0x1791, B:1663:0x1798, B:1666:0x17a7, B:1667:0x179d, B:1670:0x176c, B:1673:0x16c8, B:1675:0x16ce, B:1676:0x16e3, B:1679:0x16ea, B:1682:0x16f9, B:1683:0x16ef, B:1686:0x16be, B:1689:0x161c, B:1691:0x1622, B:1692:0x1637, B:1695:0x163e, B:1698:0x164d, B:1699:0x1643, B:1702:0x1612, B:1705:0x1595, B:1707:0x159b, B:1708:0x15b0, B:1711:0x15b7, B:1714:0x15c6, B:1715:0x15bc, B:1718:0x158b, B:1721:0x14e7, B:1723:0x14ed, B:1724:0x1502, B:1727:0x1509, B:1730:0x1518, B:1731:0x150e, B:1734:0x14dd, B:1737:0x143b, B:1739:0x1441, B:1740:0x1456, B:1743:0x145d, B:1746:0x146c, B:1747:0x1462, B:1750:0x1431, B:1753:0x13b4, B:1755:0x13ba, B:1756:0x13cf, B:1759:0x13d6, B:1762:0x13e5, B:1763:0x13db, B:1766:0x13aa, B:1769:0x1306, B:1771:0x130c, B:1772:0x1321, B:1775:0x1328, B:1778:0x1337, B:1779:0x132d, B:1782:0x12fc, B:1785:0x125a, B:1787:0x1260, B:1788:0x1275, B:1791:0x127c, B:1794:0x128b, B:1795:0x1281, B:1798:0x1250, B:1801:0x11d3, B:1803:0x11d9, B:1804:0x11ee, B:1807:0x11f5, B:1810:0x1204, B:1811:0x11fa, B:1814:0x11c9, B:1817:0x1125, B:1819:0x112b, B:1820:0x1140, B:1823:0x1147, B:1826:0x1156, B:1827:0x114c, B:1830:0x111b, B:1833:0x1079, B:1835:0x107f, B:1836:0x1094, B:1839:0x109b, B:1842:0x10aa, B:1843:0x10a0, B:1846:0x106f, B:1849:0x0ff2, B:1851:0x0ff8, B:1852:0x100d, B:1855:0x1014, B:1858:0x1023, B:1859:0x1019, B:1862:0x0fe8, B:1865:0x0f44, B:1867:0x0f4a, B:1868:0x0f5f, B:1871:0x0f66, B:1874:0x0f75, B:1875:0x0f6b, B:1878:0x0f3a, B:1881:0x0e98, B:1883:0x0e9e, B:1884:0x0eb3, B:1887:0x0eba, B:1890:0x0ec9, B:1891:0x0ebf, B:1894:0x0e8e, B:1897:0x0e11, B:1899:0x0e17, B:1900:0x0e2c, B:1903:0x0e33, B:1906:0x0e42, B:1907:0x0e38, B:1910:0x0e07, B:1913:0x0d63, B:1915:0x0d69, B:1916:0x0d7e, B:1919:0x0d85, B:1922:0x0d94, B:1923:0x0d8a, B:1926:0x0d59, B:1929:0x0cb7, B:1931:0x0cbd, B:1932:0x0cd2, B:1935:0x0cd9, B:1938:0x0ce8, B:1939:0x0cde, B:1942:0x0cad, B:1945:0x0c30, B:1947:0x0c36, B:1948:0x0c4b, B:1951:0x0c52, B:1954:0x0c61, B:1955:0x0c57, B:1958:0x0c26, B:1961:0x0b82, B:1963:0x0b88, B:1964:0x0b9d, B:1967:0x0ba4, B:1970:0x0bb3, B:1971:0x0ba9, B:1974:0x0b78, B:1977:0x0ad6, B:1979:0x0adc, B:1980:0x0af1, B:1983:0x0af8, B:1986:0x0b07, B:1987:0x0afd, B:1990:0x0acc, B:1993:0x0a4f, B:1995:0x0a55, B:1996:0x0a6a, B:1999:0x0a71, B:2002:0x0a80, B:2003:0x0a76, B:2006:0x0a45, B:2009:0x09a1, B:2011:0x09a7, B:2012:0x09bc, B:2015:0x09c3, B:2018:0x09d2, B:2019:0x09c8, B:2022:0x0997, B:2028:0x08f5, B:2030:0x08fb, B:2031:0x0910, B:2034:0x0917, B:2037:0x0926, B:2038:0x091c, B:2041:0x08eb, B:2047:0x0866, B:2049:0x086c, B:2050:0x0881, B:2053:0x0888, B:2056:0x0897, B:2057:0x088d, B:2060:0x085c, B:2063:0x07b8, B:2065:0x07be, B:2066:0x07d3, B:2069:0x07da, B:2072:0x07e9, B:2073:0x07df, B:2076:0x07ae, B:2079:0x070c, B:2081:0x0712, B:2082:0x0727, B:2085:0x072e, B:2088:0x073d, B:2089:0x0733, B:2092:0x0702, B:2095:0x0660, B:2097:0x0666, B:2098:0x067b, B:2101:0x0682, B:2104:0x0691, B:2105:0x0687, B:2108:0x0656, B:2111:0x05d9, B:2113:0x05df, B:2114:0x05f4, B:2117:0x05fb, B:2120:0x060a, B:2121:0x0600, B:2124:0x05cf, B:2127:0x052a, B:2129:0x0530, B:2130:0x0545, B:2133:0x054c, B:2136:0x055b, B:2137:0x0551, B:2140:0x0520, B:2143:0x04a3, B:2145:0x04a9, B:2146:0x04be, B:2149:0x04c5, B:2152:0x04d4, B:2153:0x04ca, B:2156:0x0499, B:2159:0x03f5, B:2161:0x03fb, B:2162:0x0410, B:2165:0x0417, B:2168:0x0426, B:2169:0x041c, B:2172:0x03eb, B:2181:0x033c, B:2183:0x0342, B:2184:0x0357, B:2187:0x035e, B:2190:0x0379, B:2191:0x0363, B:2195:0x0332, B:1432:0x2002, B:808:0x3803, B:1096:0x2d04, B:1944:0x0c05, B:1560:0x1b0d, B:1224:0x280e, B:1736:0x1410, B:600:0x4010, B:728:0x3b15, B:1352:0x2316, B:1864:0x0f19, B:1016:0x301d, B:1304:0x251e, B:1480:0x1e21, B:520:0x4322, B:1992:0x0a24, B:1144:0x2b25, B:1608:0x192c, B:648:0x3e2c, B:1784:0x122f, B:936:0x3332, B:2094:0x0635, B:776:0x3936, B:1400:0x2137, B:1912:0x0d38, B:1064:0x2e37, B:2046:0x083b, B:1528:0x1c40, B:568:0x4145, B:856:0x3646, B:1656:0x174b, B:696:0x3c4d, B:1832:0x104e, B:984:0x314e, B:1272:0x2654, B:1448:0x1f56, B:1960:0x0b57, B:1112:0x2c58, B:1576:0x1a5f, B:616:0x3f5f, B:904:0x3467, B:1192:0x2968, B:1704:0x156a, B:1880:0x0e6d, B:1032:0x2f6f, B:1320:0x2470, B:1496:0x1d75, B:2008:0x0976, B:536:0x4276, B:2142:0x0478, B:824:0x377c, B:1624:0x187e, B:664:0x3d80, B:952:0x3281, B:1752:0x1389, B:1240:0x2789, B:1928:0x0c8c, B:2062:0x078d, B:744:0x3a90, B:1368:0x2291, B:1544:0x1b94, B:584:0x4097, B:872:0x3598, B:1672:0x169d, B:1160:0x2a9e, B:1000:0x30a2, B:1288:0x25a3, B:1800:0x11a8, B:1976:0x0aab, B:2110:0x05ae, B:1416:0x20b0, B:792:0x38b1, B:1080:0x2db2, B:1592:0x19b3, B:920:0x33b9, B:1208:0x28ba, B:1720:0x14bc, B:1336:0x23c4, B:712:0x3bc6, B:1848:0x0fc7, B:2158:0x03ca, B:552:0x41ca, B:840:0x36cb, B:1464:0x1ecf, B:1640:0x17d2, B:1128:0x2bd3, B:632:0x3eda, B:1768:0x12db, B:1256:0x26db, B:2078:0x06e1, B:760:0x39e2, B:1384:0x21e3, B:1896:0x0de6, B:1048:0x2ee8, B:888:0x34ec, B:1512:0x1cee, B:1176:0x29ed, B:1688:0x15f1, B:1816:0x10fa, B:680:0x3cfb, B:968:0x31fc, B:2126:0x04fd), top: B:2194:0x0332, inners: #0, #1, #2, #3, #8, #9, #10, #11, #13, #14, #15, #16, #17, #19, #20, #22, #23, #24, #25, #26, #27, #29, #30, #32, #33, #34, #35, #36, #37, #38, #39, #40, #41, #42, #43, #44, #45, #46, #48, #49, #51, #53, #54, #55, #56, #57, #58, #59, #60, #61, #62, #64, #65, #66, #67, #68, #69, #70, #71, #72, #73, #74, #75, #77, #78, #79, #80, #81, #82, #83, #84, #85, #86, #87, #88, #89, #90, #91, #93, #94, #96, #97, #98, #100, #101, #102, #103, #104, #105, #106, #107, #108, #109, #110, #111, #112, #113, #114, #115, #116, #117, #119 }] */
    /* JADX WARN: Removed duplicated region for block: B:2033:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:2036:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:2038:0x091c A[Catch: all -> 0x4943, TryCatch #21 {all -> 0x4943, blocks: (B:27:0x0381, B:30:0x042d, B:33:0x04db, B:36:0x0562, B:39:0x0611, B:43:0x0698, B:46:0x0744, B:49:0x07f0, B:52:0x089e, B:56:0x092d, B:59:0x09d9, B:62:0x0a87, B:65:0x0b0e, B:68:0x0bba, B:71:0x0c68, B:74:0x0cef, B:77:0x0d9b, B:80:0x0e49, B:83:0x0ed0, B:86:0x0f7c, B:89:0x102a, B:92:0x10b1, B:95:0x115d, B:98:0x120b, B:101:0x1292, B:104:0x133e, B:107:0x13ec, B:110:0x1473, B:113:0x151f, B:116:0x15cd, B:119:0x1654, B:122:0x1700, B:125:0x17ae, B:128:0x1835, B:131:0x18e1, B:134:0x198f, B:137:0x1a16, B:140:0x1ac2, B:143:0x1b70, B:146:0x1bf7, B:149:0x1ca3, B:152:0x1d51, B:155:0x1dd8, B:158:0x1e84, B:161:0x1f32, B:164:0x1fb9, B:167:0x2065, B:170:0x2113, B:173:0x219a, B:176:0x2246, B:179:0x22f4, B:182:0x237b, B:185:0x2427, B:188:0x24d3, B:191:0x2581, B:194:0x2608, B:197:0x26b7, B:201:0x273e, B:204:0x27ec, B:207:0x2871, B:210:0x291d, B:213:0x29cb, B:216:0x2a52, B:219:0x2b01, B:223:0x2b88, B:226:0x2c36, B:229:0x2cbb, B:232:0x2d67, B:235:0x2e15, B:238:0x2e9c, B:241:0x2f4b, B:245:0x2fd2, B:248:0x3080, B:251:0x3105, B:254:0x31b1, B:257:0x325f, B:260:0x32e6, B:263:0x3395, B:267:0x341c, B:270:0x34ca, B:273:0x354f, B:276:0x35fb, B:279:0x36a9, B:282:0x3730, B:285:0x37df, B:289:0x3866, B:292:0x3914, B:295:0x3999, B:298:0x3a45, B:301:0x3af3, B:304:0x3b7a, B:307:0x3c29, B:311:0x3cb0, B:314:0x3d5e, B:317:0x3de3, B:320:0x3e8f, B:323:0x3f3d, B:326:0x3fc4, B:329:0x4073, B:333:0x40fa, B:336:0x41a8, B:339:0x422d, B:342:0x42d9, B:345:0x4385, B:521:0x434d, B:523:0x4353, B:524:0x4368, B:527:0x436f, B:530:0x437e, B:531:0x4374, B:534:0x4343, B:537:0x42a1, B:539:0x42a7, B:540:0x42bc, B:543:0x42c3, B:546:0x42d2, B:547:0x42c8, B:550:0x4297, B:553:0x41f5, B:555:0x41fb, B:556:0x4210, B:559:0x4217, B:562:0x4226, B:563:0x421c, B:566:0x41eb, B:569:0x4170, B:571:0x4176, B:572:0x418b, B:575:0x4192, B:578:0x41a1, B:579:0x4197, B:582:0x4166, B:585:0x40c2, B:587:0x40c8, B:588:0x40dd, B:591:0x40e4, B:594:0x40f3, B:595:0x40e9, B:598:0x40b8, B:601:0x403b, B:603:0x4041, B:604:0x4056, B:607:0x405d, B:610:0x406c, B:611:0x4062, B:614:0x4031, B:617:0x3f8c, B:619:0x3f92, B:620:0x3fa7, B:623:0x3fae, B:626:0x3fbd, B:627:0x3fb3, B:630:0x3f82, B:633:0x3f05, B:635:0x3f0b, B:636:0x3f20, B:639:0x3f27, B:642:0x3f36, B:643:0x3f2c, B:646:0x3efb, B:649:0x3e57, B:651:0x3e5d, B:652:0x3e72, B:655:0x3e79, B:658:0x3e88, B:659:0x3e7e, B:662:0x3e4d, B:665:0x3dab, B:667:0x3db1, B:668:0x3dc6, B:671:0x3dcd, B:674:0x3ddc, B:675:0x3dd2, B:678:0x3da1, B:681:0x3d26, B:683:0x3d2c, B:684:0x3d41, B:687:0x3d48, B:690:0x3d57, B:691:0x3d4d, B:694:0x3d1c, B:697:0x3c78, B:699:0x3c7e, B:700:0x3c93, B:703:0x3c9a, B:706:0x3ca9, B:707:0x3c9f, B:710:0x3c6e, B:713:0x3bf1, B:715:0x3bf7, B:716:0x3c0c, B:719:0x3c13, B:722:0x3c22, B:723:0x3c18, B:726:0x3be7, B:729:0x3b42, B:731:0x3b48, B:732:0x3b5d, B:735:0x3b64, B:738:0x3b73, B:739:0x3b69, B:742:0x3b38, B:745:0x3abb, B:747:0x3ac1, B:748:0x3ad6, B:751:0x3add, B:754:0x3aec, B:755:0x3ae2, B:758:0x3ab1, B:761:0x3a0d, B:763:0x3a13, B:764:0x3a28, B:767:0x3a2f, B:770:0x3a3e, B:771:0x3a34, B:774:0x3a03, B:777:0x3961, B:779:0x3967, B:780:0x397c, B:783:0x3983, B:786:0x3992, B:787:0x3988, B:790:0x3957, B:793:0x38dc, B:795:0x38e2, B:796:0x38f7, B:799:0x38fe, B:802:0x390d, B:803:0x3903, B:806:0x38d2, B:809:0x382e, B:811:0x3834, B:812:0x3849, B:815:0x3850, B:818:0x385f, B:819:0x3855, B:822:0x3824, B:825:0x37a7, B:827:0x37ad, B:828:0x37c2, B:831:0x37c9, B:834:0x37d8, B:835:0x37ce, B:838:0x379d, B:841:0x36f8, B:843:0x36fe, B:844:0x3713, B:847:0x371a, B:850:0x3729, B:851:0x371f, B:854:0x36ee, B:857:0x3671, B:859:0x3677, B:860:0x368c, B:863:0x3693, B:866:0x36a2, B:867:0x3698, B:870:0x3667, B:873:0x35c3, B:875:0x35c9, B:876:0x35de, B:879:0x35e5, B:882:0x35f4, B:883:0x35ea, B:886:0x35b9, B:889:0x3517, B:891:0x351d, B:892:0x3532, B:895:0x3539, B:898:0x3548, B:899:0x353e, B:902:0x350d, B:905:0x3492, B:907:0x3498, B:908:0x34ad, B:911:0x34b4, B:914:0x34c3, B:915:0x34b9, B:918:0x3488, B:921:0x33e4, B:923:0x33ea, B:924:0x33ff, B:927:0x3406, B:930:0x3415, B:931:0x340b, B:934:0x33da, B:937:0x335d, B:939:0x3363, B:940:0x3378, B:943:0x337f, B:946:0x338e, B:947:0x3384, B:950:0x3353, B:953:0x32ae, B:955:0x32b4, B:956:0x32c9, B:959:0x32d0, B:962:0x32df, B:963:0x32d5, B:966:0x32a4, B:969:0x3227, B:971:0x322d, B:972:0x3242, B:975:0x3249, B:978:0x3258, B:979:0x324e, B:982:0x321d, B:985:0x3179, B:987:0x317f, B:988:0x3194, B:991:0x319b, B:994:0x31aa, B:995:0x31a0, B:998:0x316f, B:1001:0x30cd, B:1003:0x30d3, B:1004:0x30e8, B:1007:0x30ef, B:1010:0x30fe, B:1011:0x30f4, B:1014:0x30c3, B:1017:0x3048, B:1019:0x304e, B:1020:0x3063, B:1023:0x306a, B:1026:0x3079, B:1027:0x306f, B:1030:0x303e, B:1033:0x2f9a, B:1035:0x2fa0, B:1036:0x2fb5, B:1039:0x2fbc, B:1042:0x2fcb, B:1043:0x2fc1, B:1046:0x2f90, B:1049:0x2f13, B:1051:0x2f19, B:1052:0x2f2e, B:1055:0x2f35, B:1058:0x2f44, B:1059:0x2f3a, B:1062:0x2f09, B:1065:0x2e64, B:1067:0x2e6a, B:1068:0x2e7f, B:1071:0x2e86, B:1074:0x2e95, B:1075:0x2e8b, B:1078:0x2e5a, B:1081:0x2ddd, B:1083:0x2de3, B:1084:0x2df8, B:1087:0x2dff, B:1090:0x2e0e, B:1091:0x2e04, B:1094:0x2dd3, B:1097:0x2d2f, B:1099:0x2d35, B:1100:0x2d4a, B:1103:0x2d51, B:1106:0x2d60, B:1107:0x2d56, B:1110:0x2d25, B:1113:0x2c83, B:1115:0x2c89, B:1116:0x2c9e, B:1119:0x2ca5, B:1122:0x2cb4, B:1123:0x2caa, B:1126:0x2c79, B:1129:0x2bfe, B:1131:0x2c04, B:1132:0x2c19, B:1135:0x2c20, B:1138:0x2c2f, B:1139:0x2c25, B:1142:0x2bf4, B:1145:0x2b50, B:1147:0x2b56, B:1148:0x2b6b, B:1151:0x2b72, B:1154:0x2b81, B:1155:0x2b77, B:1158:0x2b46, B:1161:0x2ac9, B:1163:0x2acf, B:1164:0x2ae4, B:1167:0x2aeb, B:1170:0x2afa, B:1171:0x2af0, B:1174:0x2abf, B:1177:0x2a1a, B:1179:0x2a20, B:1180:0x2a35, B:1183:0x2a3c, B:1186:0x2a4b, B:1187:0x2a41, B:1190:0x2a10, B:1193:0x2993, B:1195:0x2999, B:1196:0x29ae, B:1199:0x29b5, B:1202:0x29c4, B:1203:0x29ba, B:1206:0x2989, B:1209:0x28e5, B:1211:0x28eb, B:1212:0x2900, B:1215:0x2907, B:1218:0x2916, B:1219:0x290c, B:1222:0x28db, B:1225:0x2839, B:1227:0x283f, B:1228:0x2854, B:1231:0x285b, B:1234:0x286a, B:1235:0x2860, B:1238:0x282f, B:1241:0x27b4, B:1243:0x27ba, B:1244:0x27cf, B:1247:0x27d6, B:1250:0x27e5, B:1251:0x27db, B:1254:0x27aa, B:1257:0x2706, B:1259:0x270c, B:1260:0x2721, B:1263:0x2728, B:1266:0x2737, B:1267:0x272d, B:1270:0x26fc, B:1273:0x267f, B:1275:0x2685, B:1276:0x269a, B:1279:0x26a1, B:1282:0x26b0, B:1283:0x26a6, B:1286:0x2675, B:1289:0x25d0, B:1291:0x25d6, B:1292:0x25eb, B:1295:0x25f2, B:1298:0x2601, B:1299:0x25f7, B:1302:0x25c6, B:1305:0x2549, B:1307:0x254f, B:1308:0x2564, B:1311:0x256b, B:1314:0x257a, B:1315:0x2570, B:1318:0x253f, B:1321:0x249b, B:1323:0x24a1, B:1324:0x24b6, B:1327:0x24bd, B:1330:0x24cc, B:1331:0x24c2, B:1334:0x2491, B:1337:0x23ef, B:1339:0x23f5, B:1340:0x240a, B:1343:0x2411, B:1346:0x2420, B:1347:0x2416, B:1350:0x23e5, B:1353:0x2343, B:1355:0x2349, B:1356:0x235e, B:1359:0x2365, B:1362:0x2374, B:1363:0x236a, B:1366:0x2339, B:1369:0x22bc, B:1371:0x22c2, B:1372:0x22d7, B:1375:0x22de, B:1378:0x22ed, B:1379:0x22e3, B:1382:0x22b2, B:1385:0x220e, B:1387:0x2214, B:1388:0x2229, B:1391:0x2230, B:1394:0x223f, B:1395:0x2235, B:1398:0x2204, B:1401:0x2162, B:1403:0x2168, B:1404:0x217d, B:1407:0x2184, B:1410:0x2193, B:1411:0x2189, B:1414:0x2158, B:1417:0x20db, B:1419:0x20e1, B:1420:0x20f6, B:1423:0x20fd, B:1426:0x210c, B:1427:0x2102, B:1430:0x20d1, B:1433:0x202d, B:1435:0x2033, B:1436:0x2048, B:1439:0x204f, B:1442:0x205e, B:1443:0x2054, B:1446:0x2023, B:1449:0x1f81, B:1451:0x1f87, B:1452:0x1f9c, B:1455:0x1fa3, B:1458:0x1fb2, B:1459:0x1fa8, B:1462:0x1f77, B:1465:0x1efa, B:1467:0x1f00, B:1468:0x1f15, B:1471:0x1f1c, B:1474:0x1f2b, B:1475:0x1f21, B:1478:0x1ef0, B:1481:0x1e4c, B:1483:0x1e52, B:1484:0x1e67, B:1487:0x1e6e, B:1490:0x1e7d, B:1491:0x1e73, B:1494:0x1e42, B:1497:0x1da0, B:1499:0x1da6, B:1500:0x1dbb, B:1503:0x1dc2, B:1506:0x1dd1, B:1507:0x1dc7, B:1510:0x1d96, B:1513:0x1d19, B:1515:0x1d1f, B:1516:0x1d34, B:1519:0x1d3b, B:1522:0x1d4a, B:1523:0x1d40, B:1526:0x1d0f, B:1529:0x1c6b, B:1531:0x1c71, B:1532:0x1c86, B:1535:0x1c8d, B:1538:0x1c9c, B:1539:0x1c92, B:1542:0x1c61, B:1545:0x1bbf, B:1547:0x1bc5, B:1548:0x1bda, B:1551:0x1be1, B:1554:0x1bf0, B:1555:0x1be6, B:1558:0x1bb5, B:1561:0x1b38, B:1563:0x1b3e, B:1564:0x1b53, B:1567:0x1b5a, B:1570:0x1b69, B:1571:0x1b5f, B:1574:0x1b2e, B:1577:0x1a8a, B:1579:0x1a90, B:1580:0x1aa5, B:1583:0x1aac, B:1586:0x1abb, B:1587:0x1ab1, B:1590:0x1a80, B:1593:0x19de, B:1595:0x19e4, B:1596:0x19f9, B:1599:0x1a00, B:1602:0x1a0f, B:1603:0x1a05, B:1606:0x19d4, B:1609:0x1957, B:1611:0x195d, B:1612:0x1972, B:1615:0x1979, B:1618:0x1988, B:1619:0x197e, B:1622:0x194d, B:1625:0x18a9, B:1627:0x18af, B:1628:0x18c4, B:1631:0x18cb, B:1634:0x18da, B:1635:0x18d0, B:1638:0x189f, B:1641:0x17fd, B:1643:0x1803, B:1644:0x1818, B:1647:0x181f, B:1650:0x182e, B:1651:0x1824, B:1654:0x17f3, B:1657:0x1776, B:1659:0x177c, B:1660:0x1791, B:1663:0x1798, B:1666:0x17a7, B:1667:0x179d, B:1670:0x176c, B:1673:0x16c8, B:1675:0x16ce, B:1676:0x16e3, B:1679:0x16ea, B:1682:0x16f9, B:1683:0x16ef, B:1686:0x16be, B:1689:0x161c, B:1691:0x1622, B:1692:0x1637, B:1695:0x163e, B:1698:0x164d, B:1699:0x1643, B:1702:0x1612, B:1705:0x1595, B:1707:0x159b, B:1708:0x15b0, B:1711:0x15b7, B:1714:0x15c6, B:1715:0x15bc, B:1718:0x158b, B:1721:0x14e7, B:1723:0x14ed, B:1724:0x1502, B:1727:0x1509, B:1730:0x1518, B:1731:0x150e, B:1734:0x14dd, B:1737:0x143b, B:1739:0x1441, B:1740:0x1456, B:1743:0x145d, B:1746:0x146c, B:1747:0x1462, B:1750:0x1431, B:1753:0x13b4, B:1755:0x13ba, B:1756:0x13cf, B:1759:0x13d6, B:1762:0x13e5, B:1763:0x13db, B:1766:0x13aa, B:1769:0x1306, B:1771:0x130c, B:1772:0x1321, B:1775:0x1328, B:1778:0x1337, B:1779:0x132d, B:1782:0x12fc, B:1785:0x125a, B:1787:0x1260, B:1788:0x1275, B:1791:0x127c, B:1794:0x128b, B:1795:0x1281, B:1798:0x1250, B:1801:0x11d3, B:1803:0x11d9, B:1804:0x11ee, B:1807:0x11f5, B:1810:0x1204, B:1811:0x11fa, B:1814:0x11c9, B:1817:0x1125, B:1819:0x112b, B:1820:0x1140, B:1823:0x1147, B:1826:0x1156, B:1827:0x114c, B:1830:0x111b, B:1833:0x1079, B:1835:0x107f, B:1836:0x1094, B:1839:0x109b, B:1842:0x10aa, B:1843:0x10a0, B:1846:0x106f, B:1849:0x0ff2, B:1851:0x0ff8, B:1852:0x100d, B:1855:0x1014, B:1858:0x1023, B:1859:0x1019, B:1862:0x0fe8, B:1865:0x0f44, B:1867:0x0f4a, B:1868:0x0f5f, B:1871:0x0f66, B:1874:0x0f75, B:1875:0x0f6b, B:1878:0x0f3a, B:1881:0x0e98, B:1883:0x0e9e, B:1884:0x0eb3, B:1887:0x0eba, B:1890:0x0ec9, B:1891:0x0ebf, B:1894:0x0e8e, B:1897:0x0e11, B:1899:0x0e17, B:1900:0x0e2c, B:1903:0x0e33, B:1906:0x0e42, B:1907:0x0e38, B:1910:0x0e07, B:1913:0x0d63, B:1915:0x0d69, B:1916:0x0d7e, B:1919:0x0d85, B:1922:0x0d94, B:1923:0x0d8a, B:1926:0x0d59, B:1929:0x0cb7, B:1931:0x0cbd, B:1932:0x0cd2, B:1935:0x0cd9, B:1938:0x0ce8, B:1939:0x0cde, B:1942:0x0cad, B:1945:0x0c30, B:1947:0x0c36, B:1948:0x0c4b, B:1951:0x0c52, B:1954:0x0c61, B:1955:0x0c57, B:1958:0x0c26, B:1961:0x0b82, B:1963:0x0b88, B:1964:0x0b9d, B:1967:0x0ba4, B:1970:0x0bb3, B:1971:0x0ba9, B:1974:0x0b78, B:1977:0x0ad6, B:1979:0x0adc, B:1980:0x0af1, B:1983:0x0af8, B:1986:0x0b07, B:1987:0x0afd, B:1990:0x0acc, B:1993:0x0a4f, B:1995:0x0a55, B:1996:0x0a6a, B:1999:0x0a71, B:2002:0x0a80, B:2003:0x0a76, B:2006:0x0a45, B:2009:0x09a1, B:2011:0x09a7, B:2012:0x09bc, B:2015:0x09c3, B:2018:0x09d2, B:2019:0x09c8, B:2022:0x0997, B:2028:0x08f5, B:2030:0x08fb, B:2031:0x0910, B:2034:0x0917, B:2037:0x0926, B:2038:0x091c, B:2041:0x08eb, B:2047:0x0866, B:2049:0x086c, B:2050:0x0881, B:2053:0x0888, B:2056:0x0897, B:2057:0x088d, B:2060:0x085c, B:2063:0x07b8, B:2065:0x07be, B:2066:0x07d3, B:2069:0x07da, B:2072:0x07e9, B:2073:0x07df, B:2076:0x07ae, B:2079:0x070c, B:2081:0x0712, B:2082:0x0727, B:2085:0x072e, B:2088:0x073d, B:2089:0x0733, B:2092:0x0702, B:2095:0x0660, B:2097:0x0666, B:2098:0x067b, B:2101:0x0682, B:2104:0x0691, B:2105:0x0687, B:2108:0x0656, B:2111:0x05d9, B:2113:0x05df, B:2114:0x05f4, B:2117:0x05fb, B:2120:0x060a, B:2121:0x0600, B:2124:0x05cf, B:2127:0x052a, B:2129:0x0530, B:2130:0x0545, B:2133:0x054c, B:2136:0x055b, B:2137:0x0551, B:2140:0x0520, B:2143:0x04a3, B:2145:0x04a9, B:2146:0x04be, B:2149:0x04c5, B:2152:0x04d4, B:2153:0x04ca, B:2156:0x0499, B:2159:0x03f5, B:2161:0x03fb, B:2162:0x0410, B:2165:0x0417, B:2168:0x0426, B:2169:0x041c, B:2172:0x03eb, B:2181:0x033c, B:2183:0x0342, B:2184:0x0357, B:2187:0x035e, B:2190:0x0379, B:2191:0x0363, B:2195:0x0332, B:1432:0x2002, B:808:0x3803, B:1096:0x2d04, B:1944:0x0c05, B:1560:0x1b0d, B:1224:0x280e, B:1736:0x1410, B:600:0x4010, B:728:0x3b15, B:1352:0x2316, B:1864:0x0f19, B:1016:0x301d, B:1304:0x251e, B:1480:0x1e21, B:520:0x4322, B:1992:0x0a24, B:1144:0x2b25, B:1608:0x192c, B:648:0x3e2c, B:1784:0x122f, B:936:0x3332, B:2094:0x0635, B:776:0x3936, B:1400:0x2137, B:1912:0x0d38, B:1064:0x2e37, B:2046:0x083b, B:1528:0x1c40, B:568:0x4145, B:856:0x3646, B:1656:0x174b, B:696:0x3c4d, B:1832:0x104e, B:984:0x314e, B:1272:0x2654, B:1448:0x1f56, B:1960:0x0b57, B:1112:0x2c58, B:1576:0x1a5f, B:616:0x3f5f, B:904:0x3467, B:1192:0x2968, B:1704:0x156a, B:1880:0x0e6d, B:1032:0x2f6f, B:1320:0x2470, B:1496:0x1d75, B:2008:0x0976, B:536:0x4276, B:2142:0x0478, B:824:0x377c, B:1624:0x187e, B:664:0x3d80, B:952:0x3281, B:1752:0x1389, B:1240:0x2789, B:1928:0x0c8c, B:2062:0x078d, B:744:0x3a90, B:1368:0x2291, B:1544:0x1b94, B:584:0x4097, B:872:0x3598, B:1672:0x169d, B:1160:0x2a9e, B:1000:0x30a2, B:1288:0x25a3, B:1800:0x11a8, B:1976:0x0aab, B:2110:0x05ae, B:1416:0x20b0, B:792:0x38b1, B:1080:0x2db2, B:1592:0x19b3, B:920:0x33b9, B:1208:0x28ba, B:1720:0x14bc, B:1336:0x23c4, B:712:0x3bc6, B:1848:0x0fc7, B:2158:0x03ca, B:552:0x41ca, B:840:0x36cb, B:1464:0x1ecf, B:1640:0x17d2, B:1128:0x2bd3, B:632:0x3eda, B:1768:0x12db, B:1256:0x26db, B:2078:0x06e1, B:760:0x39e2, B:1384:0x21e3, B:1896:0x0de6, B:1048:0x2ee8, B:888:0x34ec, B:1512:0x1cee, B:1176:0x29ed, B:1688:0x15f1, B:1816:0x10fa, B:680:0x3cfb, B:968:0x31fc, B:2126:0x04fd), top: B:2194:0x0332, inners: #0, #1, #2, #3, #8, #9, #10, #11, #13, #14, #15, #16, #17, #19, #20, #22, #23, #24, #25, #26, #27, #29, #30, #32, #33, #34, #35, #36, #37, #38, #39, #40, #41, #42, #43, #44, #45, #46, #48, #49, #51, #53, #54, #55, #56, #57, #58, #59, #60, #61, #62, #64, #65, #66, #67, #68, #69, #70, #71, #72, #73, #74, #75, #77, #78, #79, #80, #81, #82, #83, #84, #85, #86, #87, #88, #89, #90, #91, #93, #94, #96, #97, #98, #100, #101, #102, #103, #104, #105, #106, #107, #108, #109, #110, #111, #112, #113, #114, #115, #116, #117, #119 }] */
    /* JADX WARN: Removed duplicated region for block: B:2045:0x083b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2061:0x078d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2077:0x06e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2093:0x0635 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2109:0x05ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2125:0x04fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2141:0x0478 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2157:0x03ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2183:0x0342 A[Catch: all -> 0x4943, TryCatch #21 {all -> 0x4943, blocks: (B:27:0x0381, B:30:0x042d, B:33:0x04db, B:36:0x0562, B:39:0x0611, B:43:0x0698, B:46:0x0744, B:49:0x07f0, B:52:0x089e, B:56:0x092d, B:59:0x09d9, B:62:0x0a87, B:65:0x0b0e, B:68:0x0bba, B:71:0x0c68, B:74:0x0cef, B:77:0x0d9b, B:80:0x0e49, B:83:0x0ed0, B:86:0x0f7c, B:89:0x102a, B:92:0x10b1, B:95:0x115d, B:98:0x120b, B:101:0x1292, B:104:0x133e, B:107:0x13ec, B:110:0x1473, B:113:0x151f, B:116:0x15cd, B:119:0x1654, B:122:0x1700, B:125:0x17ae, B:128:0x1835, B:131:0x18e1, B:134:0x198f, B:137:0x1a16, B:140:0x1ac2, B:143:0x1b70, B:146:0x1bf7, B:149:0x1ca3, B:152:0x1d51, B:155:0x1dd8, B:158:0x1e84, B:161:0x1f32, B:164:0x1fb9, B:167:0x2065, B:170:0x2113, B:173:0x219a, B:176:0x2246, B:179:0x22f4, B:182:0x237b, B:185:0x2427, B:188:0x24d3, B:191:0x2581, B:194:0x2608, B:197:0x26b7, B:201:0x273e, B:204:0x27ec, B:207:0x2871, B:210:0x291d, B:213:0x29cb, B:216:0x2a52, B:219:0x2b01, B:223:0x2b88, B:226:0x2c36, B:229:0x2cbb, B:232:0x2d67, B:235:0x2e15, B:238:0x2e9c, B:241:0x2f4b, B:245:0x2fd2, B:248:0x3080, B:251:0x3105, B:254:0x31b1, B:257:0x325f, B:260:0x32e6, B:263:0x3395, B:267:0x341c, B:270:0x34ca, B:273:0x354f, B:276:0x35fb, B:279:0x36a9, B:282:0x3730, B:285:0x37df, B:289:0x3866, B:292:0x3914, B:295:0x3999, B:298:0x3a45, B:301:0x3af3, B:304:0x3b7a, B:307:0x3c29, B:311:0x3cb0, B:314:0x3d5e, B:317:0x3de3, B:320:0x3e8f, B:323:0x3f3d, B:326:0x3fc4, B:329:0x4073, B:333:0x40fa, B:336:0x41a8, B:339:0x422d, B:342:0x42d9, B:345:0x4385, B:521:0x434d, B:523:0x4353, B:524:0x4368, B:527:0x436f, B:530:0x437e, B:531:0x4374, B:534:0x4343, B:537:0x42a1, B:539:0x42a7, B:540:0x42bc, B:543:0x42c3, B:546:0x42d2, B:547:0x42c8, B:550:0x4297, B:553:0x41f5, B:555:0x41fb, B:556:0x4210, B:559:0x4217, B:562:0x4226, B:563:0x421c, B:566:0x41eb, B:569:0x4170, B:571:0x4176, B:572:0x418b, B:575:0x4192, B:578:0x41a1, B:579:0x4197, B:582:0x4166, B:585:0x40c2, B:587:0x40c8, B:588:0x40dd, B:591:0x40e4, B:594:0x40f3, B:595:0x40e9, B:598:0x40b8, B:601:0x403b, B:603:0x4041, B:604:0x4056, B:607:0x405d, B:610:0x406c, B:611:0x4062, B:614:0x4031, B:617:0x3f8c, B:619:0x3f92, B:620:0x3fa7, B:623:0x3fae, B:626:0x3fbd, B:627:0x3fb3, B:630:0x3f82, B:633:0x3f05, B:635:0x3f0b, B:636:0x3f20, B:639:0x3f27, B:642:0x3f36, B:643:0x3f2c, B:646:0x3efb, B:649:0x3e57, B:651:0x3e5d, B:652:0x3e72, B:655:0x3e79, B:658:0x3e88, B:659:0x3e7e, B:662:0x3e4d, B:665:0x3dab, B:667:0x3db1, B:668:0x3dc6, B:671:0x3dcd, B:674:0x3ddc, B:675:0x3dd2, B:678:0x3da1, B:681:0x3d26, B:683:0x3d2c, B:684:0x3d41, B:687:0x3d48, B:690:0x3d57, B:691:0x3d4d, B:694:0x3d1c, B:697:0x3c78, B:699:0x3c7e, B:700:0x3c93, B:703:0x3c9a, B:706:0x3ca9, B:707:0x3c9f, B:710:0x3c6e, B:713:0x3bf1, B:715:0x3bf7, B:716:0x3c0c, B:719:0x3c13, B:722:0x3c22, B:723:0x3c18, B:726:0x3be7, B:729:0x3b42, B:731:0x3b48, B:732:0x3b5d, B:735:0x3b64, B:738:0x3b73, B:739:0x3b69, B:742:0x3b38, B:745:0x3abb, B:747:0x3ac1, B:748:0x3ad6, B:751:0x3add, B:754:0x3aec, B:755:0x3ae2, B:758:0x3ab1, B:761:0x3a0d, B:763:0x3a13, B:764:0x3a28, B:767:0x3a2f, B:770:0x3a3e, B:771:0x3a34, B:774:0x3a03, B:777:0x3961, B:779:0x3967, B:780:0x397c, B:783:0x3983, B:786:0x3992, B:787:0x3988, B:790:0x3957, B:793:0x38dc, B:795:0x38e2, B:796:0x38f7, B:799:0x38fe, B:802:0x390d, B:803:0x3903, B:806:0x38d2, B:809:0x382e, B:811:0x3834, B:812:0x3849, B:815:0x3850, B:818:0x385f, B:819:0x3855, B:822:0x3824, B:825:0x37a7, B:827:0x37ad, B:828:0x37c2, B:831:0x37c9, B:834:0x37d8, B:835:0x37ce, B:838:0x379d, B:841:0x36f8, B:843:0x36fe, B:844:0x3713, B:847:0x371a, B:850:0x3729, B:851:0x371f, B:854:0x36ee, B:857:0x3671, B:859:0x3677, B:860:0x368c, B:863:0x3693, B:866:0x36a2, B:867:0x3698, B:870:0x3667, B:873:0x35c3, B:875:0x35c9, B:876:0x35de, B:879:0x35e5, B:882:0x35f4, B:883:0x35ea, B:886:0x35b9, B:889:0x3517, B:891:0x351d, B:892:0x3532, B:895:0x3539, B:898:0x3548, B:899:0x353e, B:902:0x350d, B:905:0x3492, B:907:0x3498, B:908:0x34ad, B:911:0x34b4, B:914:0x34c3, B:915:0x34b9, B:918:0x3488, B:921:0x33e4, B:923:0x33ea, B:924:0x33ff, B:927:0x3406, B:930:0x3415, B:931:0x340b, B:934:0x33da, B:937:0x335d, B:939:0x3363, B:940:0x3378, B:943:0x337f, B:946:0x338e, B:947:0x3384, B:950:0x3353, B:953:0x32ae, B:955:0x32b4, B:956:0x32c9, B:959:0x32d0, B:962:0x32df, B:963:0x32d5, B:966:0x32a4, B:969:0x3227, B:971:0x322d, B:972:0x3242, B:975:0x3249, B:978:0x3258, B:979:0x324e, B:982:0x321d, B:985:0x3179, B:987:0x317f, B:988:0x3194, B:991:0x319b, B:994:0x31aa, B:995:0x31a0, B:998:0x316f, B:1001:0x30cd, B:1003:0x30d3, B:1004:0x30e8, B:1007:0x30ef, B:1010:0x30fe, B:1011:0x30f4, B:1014:0x30c3, B:1017:0x3048, B:1019:0x304e, B:1020:0x3063, B:1023:0x306a, B:1026:0x3079, B:1027:0x306f, B:1030:0x303e, B:1033:0x2f9a, B:1035:0x2fa0, B:1036:0x2fb5, B:1039:0x2fbc, B:1042:0x2fcb, B:1043:0x2fc1, B:1046:0x2f90, B:1049:0x2f13, B:1051:0x2f19, B:1052:0x2f2e, B:1055:0x2f35, B:1058:0x2f44, B:1059:0x2f3a, B:1062:0x2f09, B:1065:0x2e64, B:1067:0x2e6a, B:1068:0x2e7f, B:1071:0x2e86, B:1074:0x2e95, B:1075:0x2e8b, B:1078:0x2e5a, B:1081:0x2ddd, B:1083:0x2de3, B:1084:0x2df8, B:1087:0x2dff, B:1090:0x2e0e, B:1091:0x2e04, B:1094:0x2dd3, B:1097:0x2d2f, B:1099:0x2d35, B:1100:0x2d4a, B:1103:0x2d51, B:1106:0x2d60, B:1107:0x2d56, B:1110:0x2d25, B:1113:0x2c83, B:1115:0x2c89, B:1116:0x2c9e, B:1119:0x2ca5, B:1122:0x2cb4, B:1123:0x2caa, B:1126:0x2c79, B:1129:0x2bfe, B:1131:0x2c04, B:1132:0x2c19, B:1135:0x2c20, B:1138:0x2c2f, B:1139:0x2c25, B:1142:0x2bf4, B:1145:0x2b50, B:1147:0x2b56, B:1148:0x2b6b, B:1151:0x2b72, B:1154:0x2b81, B:1155:0x2b77, B:1158:0x2b46, B:1161:0x2ac9, B:1163:0x2acf, B:1164:0x2ae4, B:1167:0x2aeb, B:1170:0x2afa, B:1171:0x2af0, B:1174:0x2abf, B:1177:0x2a1a, B:1179:0x2a20, B:1180:0x2a35, B:1183:0x2a3c, B:1186:0x2a4b, B:1187:0x2a41, B:1190:0x2a10, B:1193:0x2993, B:1195:0x2999, B:1196:0x29ae, B:1199:0x29b5, B:1202:0x29c4, B:1203:0x29ba, B:1206:0x2989, B:1209:0x28e5, B:1211:0x28eb, B:1212:0x2900, B:1215:0x2907, B:1218:0x2916, B:1219:0x290c, B:1222:0x28db, B:1225:0x2839, B:1227:0x283f, B:1228:0x2854, B:1231:0x285b, B:1234:0x286a, B:1235:0x2860, B:1238:0x282f, B:1241:0x27b4, B:1243:0x27ba, B:1244:0x27cf, B:1247:0x27d6, B:1250:0x27e5, B:1251:0x27db, B:1254:0x27aa, B:1257:0x2706, B:1259:0x270c, B:1260:0x2721, B:1263:0x2728, B:1266:0x2737, B:1267:0x272d, B:1270:0x26fc, B:1273:0x267f, B:1275:0x2685, B:1276:0x269a, B:1279:0x26a1, B:1282:0x26b0, B:1283:0x26a6, B:1286:0x2675, B:1289:0x25d0, B:1291:0x25d6, B:1292:0x25eb, B:1295:0x25f2, B:1298:0x2601, B:1299:0x25f7, B:1302:0x25c6, B:1305:0x2549, B:1307:0x254f, B:1308:0x2564, B:1311:0x256b, B:1314:0x257a, B:1315:0x2570, B:1318:0x253f, B:1321:0x249b, B:1323:0x24a1, B:1324:0x24b6, B:1327:0x24bd, B:1330:0x24cc, B:1331:0x24c2, B:1334:0x2491, B:1337:0x23ef, B:1339:0x23f5, B:1340:0x240a, B:1343:0x2411, B:1346:0x2420, B:1347:0x2416, B:1350:0x23e5, B:1353:0x2343, B:1355:0x2349, B:1356:0x235e, B:1359:0x2365, B:1362:0x2374, B:1363:0x236a, B:1366:0x2339, B:1369:0x22bc, B:1371:0x22c2, B:1372:0x22d7, B:1375:0x22de, B:1378:0x22ed, B:1379:0x22e3, B:1382:0x22b2, B:1385:0x220e, B:1387:0x2214, B:1388:0x2229, B:1391:0x2230, B:1394:0x223f, B:1395:0x2235, B:1398:0x2204, B:1401:0x2162, B:1403:0x2168, B:1404:0x217d, B:1407:0x2184, B:1410:0x2193, B:1411:0x2189, B:1414:0x2158, B:1417:0x20db, B:1419:0x20e1, B:1420:0x20f6, B:1423:0x20fd, B:1426:0x210c, B:1427:0x2102, B:1430:0x20d1, B:1433:0x202d, B:1435:0x2033, B:1436:0x2048, B:1439:0x204f, B:1442:0x205e, B:1443:0x2054, B:1446:0x2023, B:1449:0x1f81, B:1451:0x1f87, B:1452:0x1f9c, B:1455:0x1fa3, B:1458:0x1fb2, B:1459:0x1fa8, B:1462:0x1f77, B:1465:0x1efa, B:1467:0x1f00, B:1468:0x1f15, B:1471:0x1f1c, B:1474:0x1f2b, B:1475:0x1f21, B:1478:0x1ef0, B:1481:0x1e4c, B:1483:0x1e52, B:1484:0x1e67, B:1487:0x1e6e, B:1490:0x1e7d, B:1491:0x1e73, B:1494:0x1e42, B:1497:0x1da0, B:1499:0x1da6, B:1500:0x1dbb, B:1503:0x1dc2, B:1506:0x1dd1, B:1507:0x1dc7, B:1510:0x1d96, B:1513:0x1d19, B:1515:0x1d1f, B:1516:0x1d34, B:1519:0x1d3b, B:1522:0x1d4a, B:1523:0x1d40, B:1526:0x1d0f, B:1529:0x1c6b, B:1531:0x1c71, B:1532:0x1c86, B:1535:0x1c8d, B:1538:0x1c9c, B:1539:0x1c92, B:1542:0x1c61, B:1545:0x1bbf, B:1547:0x1bc5, B:1548:0x1bda, B:1551:0x1be1, B:1554:0x1bf0, B:1555:0x1be6, B:1558:0x1bb5, B:1561:0x1b38, B:1563:0x1b3e, B:1564:0x1b53, B:1567:0x1b5a, B:1570:0x1b69, B:1571:0x1b5f, B:1574:0x1b2e, B:1577:0x1a8a, B:1579:0x1a90, B:1580:0x1aa5, B:1583:0x1aac, B:1586:0x1abb, B:1587:0x1ab1, B:1590:0x1a80, B:1593:0x19de, B:1595:0x19e4, B:1596:0x19f9, B:1599:0x1a00, B:1602:0x1a0f, B:1603:0x1a05, B:1606:0x19d4, B:1609:0x1957, B:1611:0x195d, B:1612:0x1972, B:1615:0x1979, B:1618:0x1988, B:1619:0x197e, B:1622:0x194d, B:1625:0x18a9, B:1627:0x18af, B:1628:0x18c4, B:1631:0x18cb, B:1634:0x18da, B:1635:0x18d0, B:1638:0x189f, B:1641:0x17fd, B:1643:0x1803, B:1644:0x1818, B:1647:0x181f, B:1650:0x182e, B:1651:0x1824, B:1654:0x17f3, B:1657:0x1776, B:1659:0x177c, B:1660:0x1791, B:1663:0x1798, B:1666:0x17a7, B:1667:0x179d, B:1670:0x176c, B:1673:0x16c8, B:1675:0x16ce, B:1676:0x16e3, B:1679:0x16ea, B:1682:0x16f9, B:1683:0x16ef, B:1686:0x16be, B:1689:0x161c, B:1691:0x1622, B:1692:0x1637, B:1695:0x163e, B:1698:0x164d, B:1699:0x1643, B:1702:0x1612, B:1705:0x1595, B:1707:0x159b, B:1708:0x15b0, B:1711:0x15b7, B:1714:0x15c6, B:1715:0x15bc, B:1718:0x158b, B:1721:0x14e7, B:1723:0x14ed, B:1724:0x1502, B:1727:0x1509, B:1730:0x1518, B:1731:0x150e, B:1734:0x14dd, B:1737:0x143b, B:1739:0x1441, B:1740:0x1456, B:1743:0x145d, B:1746:0x146c, B:1747:0x1462, B:1750:0x1431, B:1753:0x13b4, B:1755:0x13ba, B:1756:0x13cf, B:1759:0x13d6, B:1762:0x13e5, B:1763:0x13db, B:1766:0x13aa, B:1769:0x1306, B:1771:0x130c, B:1772:0x1321, B:1775:0x1328, B:1778:0x1337, B:1779:0x132d, B:1782:0x12fc, B:1785:0x125a, B:1787:0x1260, B:1788:0x1275, B:1791:0x127c, B:1794:0x128b, B:1795:0x1281, B:1798:0x1250, B:1801:0x11d3, B:1803:0x11d9, B:1804:0x11ee, B:1807:0x11f5, B:1810:0x1204, B:1811:0x11fa, B:1814:0x11c9, B:1817:0x1125, B:1819:0x112b, B:1820:0x1140, B:1823:0x1147, B:1826:0x1156, B:1827:0x114c, B:1830:0x111b, B:1833:0x1079, B:1835:0x107f, B:1836:0x1094, B:1839:0x109b, B:1842:0x10aa, B:1843:0x10a0, B:1846:0x106f, B:1849:0x0ff2, B:1851:0x0ff8, B:1852:0x100d, B:1855:0x1014, B:1858:0x1023, B:1859:0x1019, B:1862:0x0fe8, B:1865:0x0f44, B:1867:0x0f4a, B:1868:0x0f5f, B:1871:0x0f66, B:1874:0x0f75, B:1875:0x0f6b, B:1878:0x0f3a, B:1881:0x0e98, B:1883:0x0e9e, B:1884:0x0eb3, B:1887:0x0eba, B:1890:0x0ec9, B:1891:0x0ebf, B:1894:0x0e8e, B:1897:0x0e11, B:1899:0x0e17, B:1900:0x0e2c, B:1903:0x0e33, B:1906:0x0e42, B:1907:0x0e38, B:1910:0x0e07, B:1913:0x0d63, B:1915:0x0d69, B:1916:0x0d7e, B:1919:0x0d85, B:1922:0x0d94, B:1923:0x0d8a, B:1926:0x0d59, B:1929:0x0cb7, B:1931:0x0cbd, B:1932:0x0cd2, B:1935:0x0cd9, B:1938:0x0ce8, B:1939:0x0cde, B:1942:0x0cad, B:1945:0x0c30, B:1947:0x0c36, B:1948:0x0c4b, B:1951:0x0c52, B:1954:0x0c61, B:1955:0x0c57, B:1958:0x0c26, B:1961:0x0b82, B:1963:0x0b88, B:1964:0x0b9d, B:1967:0x0ba4, B:1970:0x0bb3, B:1971:0x0ba9, B:1974:0x0b78, B:1977:0x0ad6, B:1979:0x0adc, B:1980:0x0af1, B:1983:0x0af8, B:1986:0x0b07, B:1987:0x0afd, B:1990:0x0acc, B:1993:0x0a4f, B:1995:0x0a55, B:1996:0x0a6a, B:1999:0x0a71, B:2002:0x0a80, B:2003:0x0a76, B:2006:0x0a45, B:2009:0x09a1, B:2011:0x09a7, B:2012:0x09bc, B:2015:0x09c3, B:2018:0x09d2, B:2019:0x09c8, B:2022:0x0997, B:2028:0x08f5, B:2030:0x08fb, B:2031:0x0910, B:2034:0x0917, B:2037:0x0926, B:2038:0x091c, B:2041:0x08eb, B:2047:0x0866, B:2049:0x086c, B:2050:0x0881, B:2053:0x0888, B:2056:0x0897, B:2057:0x088d, B:2060:0x085c, B:2063:0x07b8, B:2065:0x07be, B:2066:0x07d3, B:2069:0x07da, B:2072:0x07e9, B:2073:0x07df, B:2076:0x07ae, B:2079:0x070c, B:2081:0x0712, B:2082:0x0727, B:2085:0x072e, B:2088:0x073d, B:2089:0x0733, B:2092:0x0702, B:2095:0x0660, B:2097:0x0666, B:2098:0x067b, B:2101:0x0682, B:2104:0x0691, B:2105:0x0687, B:2108:0x0656, B:2111:0x05d9, B:2113:0x05df, B:2114:0x05f4, B:2117:0x05fb, B:2120:0x060a, B:2121:0x0600, B:2124:0x05cf, B:2127:0x052a, B:2129:0x0530, B:2130:0x0545, B:2133:0x054c, B:2136:0x055b, B:2137:0x0551, B:2140:0x0520, B:2143:0x04a3, B:2145:0x04a9, B:2146:0x04be, B:2149:0x04c5, B:2152:0x04d4, B:2153:0x04ca, B:2156:0x0499, B:2159:0x03f5, B:2161:0x03fb, B:2162:0x0410, B:2165:0x0417, B:2168:0x0426, B:2169:0x041c, B:2172:0x03eb, B:2181:0x033c, B:2183:0x0342, B:2184:0x0357, B:2187:0x035e, B:2190:0x0379, B:2191:0x0363, B:2195:0x0332, B:1432:0x2002, B:808:0x3803, B:1096:0x2d04, B:1944:0x0c05, B:1560:0x1b0d, B:1224:0x280e, B:1736:0x1410, B:600:0x4010, B:728:0x3b15, B:1352:0x2316, B:1864:0x0f19, B:1016:0x301d, B:1304:0x251e, B:1480:0x1e21, B:520:0x4322, B:1992:0x0a24, B:1144:0x2b25, B:1608:0x192c, B:648:0x3e2c, B:1784:0x122f, B:936:0x3332, B:2094:0x0635, B:776:0x3936, B:1400:0x2137, B:1912:0x0d38, B:1064:0x2e37, B:2046:0x083b, B:1528:0x1c40, B:568:0x4145, B:856:0x3646, B:1656:0x174b, B:696:0x3c4d, B:1832:0x104e, B:984:0x314e, B:1272:0x2654, B:1448:0x1f56, B:1960:0x0b57, B:1112:0x2c58, B:1576:0x1a5f, B:616:0x3f5f, B:904:0x3467, B:1192:0x2968, B:1704:0x156a, B:1880:0x0e6d, B:1032:0x2f6f, B:1320:0x2470, B:1496:0x1d75, B:2008:0x0976, B:536:0x4276, B:2142:0x0478, B:824:0x377c, B:1624:0x187e, B:664:0x3d80, B:952:0x3281, B:1752:0x1389, B:1240:0x2789, B:1928:0x0c8c, B:2062:0x078d, B:744:0x3a90, B:1368:0x2291, B:1544:0x1b94, B:584:0x4097, B:872:0x3598, B:1672:0x169d, B:1160:0x2a9e, B:1000:0x30a2, B:1288:0x25a3, B:1800:0x11a8, B:1976:0x0aab, B:2110:0x05ae, B:1416:0x20b0, B:792:0x38b1, B:1080:0x2db2, B:1592:0x19b3, B:920:0x33b9, B:1208:0x28ba, B:1720:0x14bc, B:1336:0x23c4, B:712:0x3bc6, B:1848:0x0fc7, B:2158:0x03ca, B:552:0x41ca, B:840:0x36cb, B:1464:0x1ecf, B:1640:0x17d2, B:1128:0x2bd3, B:632:0x3eda, B:1768:0x12db, B:1256:0x26db, B:2078:0x06e1, B:760:0x39e2, B:1384:0x21e3, B:1896:0x0de6, B:1048:0x2ee8, B:888:0x34ec, B:1512:0x1cee, B:1176:0x29ed, B:1688:0x15f1, B:1816:0x10fa, B:680:0x3cfb, B:968:0x31fc, B:2126:0x04fd), top: B:2194:0x0332, inners: #0, #1, #2, #3, #8, #9, #10, #11, #13, #14, #15, #16, #17, #19, #20, #22, #23, #24, #25, #26, #27, #29, #30, #32, #33, #34, #35, #36, #37, #38, #39, #40, #41, #42, #43, #44, #45, #46, #48, #49, #51, #53, #54, #55, #56, #57, #58, #59, #60, #61, #62, #64, #65, #66, #67, #68, #69, #70, #71, #72, #73, #74, #75, #77, #78, #79, #80, #81, #82, #83, #84, #85, #86, #87, #88, #89, #90, #91, #93, #94, #96, #97, #98, #100, #101, #102, #103, #104, #105, #106, #107, #108, #109, #110, #111, #112, #113, #114, #115, #116, #117, #119 }] */
    /* JADX WARN: Removed duplicated region for block: B:2186:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:2189:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:2191:0x0363 A[Catch: all -> 0x4943, TryCatch #21 {all -> 0x4943, blocks: (B:27:0x0381, B:30:0x042d, B:33:0x04db, B:36:0x0562, B:39:0x0611, B:43:0x0698, B:46:0x0744, B:49:0x07f0, B:52:0x089e, B:56:0x092d, B:59:0x09d9, B:62:0x0a87, B:65:0x0b0e, B:68:0x0bba, B:71:0x0c68, B:74:0x0cef, B:77:0x0d9b, B:80:0x0e49, B:83:0x0ed0, B:86:0x0f7c, B:89:0x102a, B:92:0x10b1, B:95:0x115d, B:98:0x120b, B:101:0x1292, B:104:0x133e, B:107:0x13ec, B:110:0x1473, B:113:0x151f, B:116:0x15cd, B:119:0x1654, B:122:0x1700, B:125:0x17ae, B:128:0x1835, B:131:0x18e1, B:134:0x198f, B:137:0x1a16, B:140:0x1ac2, B:143:0x1b70, B:146:0x1bf7, B:149:0x1ca3, B:152:0x1d51, B:155:0x1dd8, B:158:0x1e84, B:161:0x1f32, B:164:0x1fb9, B:167:0x2065, B:170:0x2113, B:173:0x219a, B:176:0x2246, B:179:0x22f4, B:182:0x237b, B:185:0x2427, B:188:0x24d3, B:191:0x2581, B:194:0x2608, B:197:0x26b7, B:201:0x273e, B:204:0x27ec, B:207:0x2871, B:210:0x291d, B:213:0x29cb, B:216:0x2a52, B:219:0x2b01, B:223:0x2b88, B:226:0x2c36, B:229:0x2cbb, B:232:0x2d67, B:235:0x2e15, B:238:0x2e9c, B:241:0x2f4b, B:245:0x2fd2, B:248:0x3080, B:251:0x3105, B:254:0x31b1, B:257:0x325f, B:260:0x32e6, B:263:0x3395, B:267:0x341c, B:270:0x34ca, B:273:0x354f, B:276:0x35fb, B:279:0x36a9, B:282:0x3730, B:285:0x37df, B:289:0x3866, B:292:0x3914, B:295:0x3999, B:298:0x3a45, B:301:0x3af3, B:304:0x3b7a, B:307:0x3c29, B:311:0x3cb0, B:314:0x3d5e, B:317:0x3de3, B:320:0x3e8f, B:323:0x3f3d, B:326:0x3fc4, B:329:0x4073, B:333:0x40fa, B:336:0x41a8, B:339:0x422d, B:342:0x42d9, B:345:0x4385, B:521:0x434d, B:523:0x4353, B:524:0x4368, B:527:0x436f, B:530:0x437e, B:531:0x4374, B:534:0x4343, B:537:0x42a1, B:539:0x42a7, B:540:0x42bc, B:543:0x42c3, B:546:0x42d2, B:547:0x42c8, B:550:0x4297, B:553:0x41f5, B:555:0x41fb, B:556:0x4210, B:559:0x4217, B:562:0x4226, B:563:0x421c, B:566:0x41eb, B:569:0x4170, B:571:0x4176, B:572:0x418b, B:575:0x4192, B:578:0x41a1, B:579:0x4197, B:582:0x4166, B:585:0x40c2, B:587:0x40c8, B:588:0x40dd, B:591:0x40e4, B:594:0x40f3, B:595:0x40e9, B:598:0x40b8, B:601:0x403b, B:603:0x4041, B:604:0x4056, B:607:0x405d, B:610:0x406c, B:611:0x4062, B:614:0x4031, B:617:0x3f8c, B:619:0x3f92, B:620:0x3fa7, B:623:0x3fae, B:626:0x3fbd, B:627:0x3fb3, B:630:0x3f82, B:633:0x3f05, B:635:0x3f0b, B:636:0x3f20, B:639:0x3f27, B:642:0x3f36, B:643:0x3f2c, B:646:0x3efb, B:649:0x3e57, B:651:0x3e5d, B:652:0x3e72, B:655:0x3e79, B:658:0x3e88, B:659:0x3e7e, B:662:0x3e4d, B:665:0x3dab, B:667:0x3db1, B:668:0x3dc6, B:671:0x3dcd, B:674:0x3ddc, B:675:0x3dd2, B:678:0x3da1, B:681:0x3d26, B:683:0x3d2c, B:684:0x3d41, B:687:0x3d48, B:690:0x3d57, B:691:0x3d4d, B:694:0x3d1c, B:697:0x3c78, B:699:0x3c7e, B:700:0x3c93, B:703:0x3c9a, B:706:0x3ca9, B:707:0x3c9f, B:710:0x3c6e, B:713:0x3bf1, B:715:0x3bf7, B:716:0x3c0c, B:719:0x3c13, B:722:0x3c22, B:723:0x3c18, B:726:0x3be7, B:729:0x3b42, B:731:0x3b48, B:732:0x3b5d, B:735:0x3b64, B:738:0x3b73, B:739:0x3b69, B:742:0x3b38, B:745:0x3abb, B:747:0x3ac1, B:748:0x3ad6, B:751:0x3add, B:754:0x3aec, B:755:0x3ae2, B:758:0x3ab1, B:761:0x3a0d, B:763:0x3a13, B:764:0x3a28, B:767:0x3a2f, B:770:0x3a3e, B:771:0x3a34, B:774:0x3a03, B:777:0x3961, B:779:0x3967, B:780:0x397c, B:783:0x3983, B:786:0x3992, B:787:0x3988, B:790:0x3957, B:793:0x38dc, B:795:0x38e2, B:796:0x38f7, B:799:0x38fe, B:802:0x390d, B:803:0x3903, B:806:0x38d2, B:809:0x382e, B:811:0x3834, B:812:0x3849, B:815:0x3850, B:818:0x385f, B:819:0x3855, B:822:0x3824, B:825:0x37a7, B:827:0x37ad, B:828:0x37c2, B:831:0x37c9, B:834:0x37d8, B:835:0x37ce, B:838:0x379d, B:841:0x36f8, B:843:0x36fe, B:844:0x3713, B:847:0x371a, B:850:0x3729, B:851:0x371f, B:854:0x36ee, B:857:0x3671, B:859:0x3677, B:860:0x368c, B:863:0x3693, B:866:0x36a2, B:867:0x3698, B:870:0x3667, B:873:0x35c3, B:875:0x35c9, B:876:0x35de, B:879:0x35e5, B:882:0x35f4, B:883:0x35ea, B:886:0x35b9, B:889:0x3517, B:891:0x351d, B:892:0x3532, B:895:0x3539, B:898:0x3548, B:899:0x353e, B:902:0x350d, B:905:0x3492, B:907:0x3498, B:908:0x34ad, B:911:0x34b4, B:914:0x34c3, B:915:0x34b9, B:918:0x3488, B:921:0x33e4, B:923:0x33ea, B:924:0x33ff, B:927:0x3406, B:930:0x3415, B:931:0x340b, B:934:0x33da, B:937:0x335d, B:939:0x3363, B:940:0x3378, B:943:0x337f, B:946:0x338e, B:947:0x3384, B:950:0x3353, B:953:0x32ae, B:955:0x32b4, B:956:0x32c9, B:959:0x32d0, B:962:0x32df, B:963:0x32d5, B:966:0x32a4, B:969:0x3227, B:971:0x322d, B:972:0x3242, B:975:0x3249, B:978:0x3258, B:979:0x324e, B:982:0x321d, B:985:0x3179, B:987:0x317f, B:988:0x3194, B:991:0x319b, B:994:0x31aa, B:995:0x31a0, B:998:0x316f, B:1001:0x30cd, B:1003:0x30d3, B:1004:0x30e8, B:1007:0x30ef, B:1010:0x30fe, B:1011:0x30f4, B:1014:0x30c3, B:1017:0x3048, B:1019:0x304e, B:1020:0x3063, B:1023:0x306a, B:1026:0x3079, B:1027:0x306f, B:1030:0x303e, B:1033:0x2f9a, B:1035:0x2fa0, B:1036:0x2fb5, B:1039:0x2fbc, B:1042:0x2fcb, B:1043:0x2fc1, B:1046:0x2f90, B:1049:0x2f13, B:1051:0x2f19, B:1052:0x2f2e, B:1055:0x2f35, B:1058:0x2f44, B:1059:0x2f3a, B:1062:0x2f09, B:1065:0x2e64, B:1067:0x2e6a, B:1068:0x2e7f, B:1071:0x2e86, B:1074:0x2e95, B:1075:0x2e8b, B:1078:0x2e5a, B:1081:0x2ddd, B:1083:0x2de3, B:1084:0x2df8, B:1087:0x2dff, B:1090:0x2e0e, B:1091:0x2e04, B:1094:0x2dd3, B:1097:0x2d2f, B:1099:0x2d35, B:1100:0x2d4a, B:1103:0x2d51, B:1106:0x2d60, B:1107:0x2d56, B:1110:0x2d25, B:1113:0x2c83, B:1115:0x2c89, B:1116:0x2c9e, B:1119:0x2ca5, B:1122:0x2cb4, B:1123:0x2caa, B:1126:0x2c79, B:1129:0x2bfe, B:1131:0x2c04, B:1132:0x2c19, B:1135:0x2c20, B:1138:0x2c2f, B:1139:0x2c25, B:1142:0x2bf4, B:1145:0x2b50, B:1147:0x2b56, B:1148:0x2b6b, B:1151:0x2b72, B:1154:0x2b81, B:1155:0x2b77, B:1158:0x2b46, B:1161:0x2ac9, B:1163:0x2acf, B:1164:0x2ae4, B:1167:0x2aeb, B:1170:0x2afa, B:1171:0x2af0, B:1174:0x2abf, B:1177:0x2a1a, B:1179:0x2a20, B:1180:0x2a35, B:1183:0x2a3c, B:1186:0x2a4b, B:1187:0x2a41, B:1190:0x2a10, B:1193:0x2993, B:1195:0x2999, B:1196:0x29ae, B:1199:0x29b5, B:1202:0x29c4, B:1203:0x29ba, B:1206:0x2989, B:1209:0x28e5, B:1211:0x28eb, B:1212:0x2900, B:1215:0x2907, B:1218:0x2916, B:1219:0x290c, B:1222:0x28db, B:1225:0x2839, B:1227:0x283f, B:1228:0x2854, B:1231:0x285b, B:1234:0x286a, B:1235:0x2860, B:1238:0x282f, B:1241:0x27b4, B:1243:0x27ba, B:1244:0x27cf, B:1247:0x27d6, B:1250:0x27e5, B:1251:0x27db, B:1254:0x27aa, B:1257:0x2706, B:1259:0x270c, B:1260:0x2721, B:1263:0x2728, B:1266:0x2737, B:1267:0x272d, B:1270:0x26fc, B:1273:0x267f, B:1275:0x2685, B:1276:0x269a, B:1279:0x26a1, B:1282:0x26b0, B:1283:0x26a6, B:1286:0x2675, B:1289:0x25d0, B:1291:0x25d6, B:1292:0x25eb, B:1295:0x25f2, B:1298:0x2601, B:1299:0x25f7, B:1302:0x25c6, B:1305:0x2549, B:1307:0x254f, B:1308:0x2564, B:1311:0x256b, B:1314:0x257a, B:1315:0x2570, B:1318:0x253f, B:1321:0x249b, B:1323:0x24a1, B:1324:0x24b6, B:1327:0x24bd, B:1330:0x24cc, B:1331:0x24c2, B:1334:0x2491, B:1337:0x23ef, B:1339:0x23f5, B:1340:0x240a, B:1343:0x2411, B:1346:0x2420, B:1347:0x2416, B:1350:0x23e5, B:1353:0x2343, B:1355:0x2349, B:1356:0x235e, B:1359:0x2365, B:1362:0x2374, B:1363:0x236a, B:1366:0x2339, B:1369:0x22bc, B:1371:0x22c2, B:1372:0x22d7, B:1375:0x22de, B:1378:0x22ed, B:1379:0x22e3, B:1382:0x22b2, B:1385:0x220e, B:1387:0x2214, B:1388:0x2229, B:1391:0x2230, B:1394:0x223f, B:1395:0x2235, B:1398:0x2204, B:1401:0x2162, B:1403:0x2168, B:1404:0x217d, B:1407:0x2184, B:1410:0x2193, B:1411:0x2189, B:1414:0x2158, B:1417:0x20db, B:1419:0x20e1, B:1420:0x20f6, B:1423:0x20fd, B:1426:0x210c, B:1427:0x2102, B:1430:0x20d1, B:1433:0x202d, B:1435:0x2033, B:1436:0x2048, B:1439:0x204f, B:1442:0x205e, B:1443:0x2054, B:1446:0x2023, B:1449:0x1f81, B:1451:0x1f87, B:1452:0x1f9c, B:1455:0x1fa3, B:1458:0x1fb2, B:1459:0x1fa8, B:1462:0x1f77, B:1465:0x1efa, B:1467:0x1f00, B:1468:0x1f15, B:1471:0x1f1c, B:1474:0x1f2b, B:1475:0x1f21, B:1478:0x1ef0, B:1481:0x1e4c, B:1483:0x1e52, B:1484:0x1e67, B:1487:0x1e6e, B:1490:0x1e7d, B:1491:0x1e73, B:1494:0x1e42, B:1497:0x1da0, B:1499:0x1da6, B:1500:0x1dbb, B:1503:0x1dc2, B:1506:0x1dd1, B:1507:0x1dc7, B:1510:0x1d96, B:1513:0x1d19, B:1515:0x1d1f, B:1516:0x1d34, B:1519:0x1d3b, B:1522:0x1d4a, B:1523:0x1d40, B:1526:0x1d0f, B:1529:0x1c6b, B:1531:0x1c71, B:1532:0x1c86, B:1535:0x1c8d, B:1538:0x1c9c, B:1539:0x1c92, B:1542:0x1c61, B:1545:0x1bbf, B:1547:0x1bc5, B:1548:0x1bda, B:1551:0x1be1, B:1554:0x1bf0, B:1555:0x1be6, B:1558:0x1bb5, B:1561:0x1b38, B:1563:0x1b3e, B:1564:0x1b53, B:1567:0x1b5a, B:1570:0x1b69, B:1571:0x1b5f, B:1574:0x1b2e, B:1577:0x1a8a, B:1579:0x1a90, B:1580:0x1aa5, B:1583:0x1aac, B:1586:0x1abb, B:1587:0x1ab1, B:1590:0x1a80, B:1593:0x19de, B:1595:0x19e4, B:1596:0x19f9, B:1599:0x1a00, B:1602:0x1a0f, B:1603:0x1a05, B:1606:0x19d4, B:1609:0x1957, B:1611:0x195d, B:1612:0x1972, B:1615:0x1979, B:1618:0x1988, B:1619:0x197e, B:1622:0x194d, B:1625:0x18a9, B:1627:0x18af, B:1628:0x18c4, B:1631:0x18cb, B:1634:0x18da, B:1635:0x18d0, B:1638:0x189f, B:1641:0x17fd, B:1643:0x1803, B:1644:0x1818, B:1647:0x181f, B:1650:0x182e, B:1651:0x1824, B:1654:0x17f3, B:1657:0x1776, B:1659:0x177c, B:1660:0x1791, B:1663:0x1798, B:1666:0x17a7, B:1667:0x179d, B:1670:0x176c, B:1673:0x16c8, B:1675:0x16ce, B:1676:0x16e3, B:1679:0x16ea, B:1682:0x16f9, B:1683:0x16ef, B:1686:0x16be, B:1689:0x161c, B:1691:0x1622, B:1692:0x1637, B:1695:0x163e, B:1698:0x164d, B:1699:0x1643, B:1702:0x1612, B:1705:0x1595, B:1707:0x159b, B:1708:0x15b0, B:1711:0x15b7, B:1714:0x15c6, B:1715:0x15bc, B:1718:0x158b, B:1721:0x14e7, B:1723:0x14ed, B:1724:0x1502, B:1727:0x1509, B:1730:0x1518, B:1731:0x150e, B:1734:0x14dd, B:1737:0x143b, B:1739:0x1441, B:1740:0x1456, B:1743:0x145d, B:1746:0x146c, B:1747:0x1462, B:1750:0x1431, B:1753:0x13b4, B:1755:0x13ba, B:1756:0x13cf, B:1759:0x13d6, B:1762:0x13e5, B:1763:0x13db, B:1766:0x13aa, B:1769:0x1306, B:1771:0x130c, B:1772:0x1321, B:1775:0x1328, B:1778:0x1337, B:1779:0x132d, B:1782:0x12fc, B:1785:0x125a, B:1787:0x1260, B:1788:0x1275, B:1791:0x127c, B:1794:0x128b, B:1795:0x1281, B:1798:0x1250, B:1801:0x11d3, B:1803:0x11d9, B:1804:0x11ee, B:1807:0x11f5, B:1810:0x1204, B:1811:0x11fa, B:1814:0x11c9, B:1817:0x1125, B:1819:0x112b, B:1820:0x1140, B:1823:0x1147, B:1826:0x1156, B:1827:0x114c, B:1830:0x111b, B:1833:0x1079, B:1835:0x107f, B:1836:0x1094, B:1839:0x109b, B:1842:0x10aa, B:1843:0x10a0, B:1846:0x106f, B:1849:0x0ff2, B:1851:0x0ff8, B:1852:0x100d, B:1855:0x1014, B:1858:0x1023, B:1859:0x1019, B:1862:0x0fe8, B:1865:0x0f44, B:1867:0x0f4a, B:1868:0x0f5f, B:1871:0x0f66, B:1874:0x0f75, B:1875:0x0f6b, B:1878:0x0f3a, B:1881:0x0e98, B:1883:0x0e9e, B:1884:0x0eb3, B:1887:0x0eba, B:1890:0x0ec9, B:1891:0x0ebf, B:1894:0x0e8e, B:1897:0x0e11, B:1899:0x0e17, B:1900:0x0e2c, B:1903:0x0e33, B:1906:0x0e42, B:1907:0x0e38, B:1910:0x0e07, B:1913:0x0d63, B:1915:0x0d69, B:1916:0x0d7e, B:1919:0x0d85, B:1922:0x0d94, B:1923:0x0d8a, B:1926:0x0d59, B:1929:0x0cb7, B:1931:0x0cbd, B:1932:0x0cd2, B:1935:0x0cd9, B:1938:0x0ce8, B:1939:0x0cde, B:1942:0x0cad, B:1945:0x0c30, B:1947:0x0c36, B:1948:0x0c4b, B:1951:0x0c52, B:1954:0x0c61, B:1955:0x0c57, B:1958:0x0c26, B:1961:0x0b82, B:1963:0x0b88, B:1964:0x0b9d, B:1967:0x0ba4, B:1970:0x0bb3, B:1971:0x0ba9, B:1974:0x0b78, B:1977:0x0ad6, B:1979:0x0adc, B:1980:0x0af1, B:1983:0x0af8, B:1986:0x0b07, B:1987:0x0afd, B:1990:0x0acc, B:1993:0x0a4f, B:1995:0x0a55, B:1996:0x0a6a, B:1999:0x0a71, B:2002:0x0a80, B:2003:0x0a76, B:2006:0x0a45, B:2009:0x09a1, B:2011:0x09a7, B:2012:0x09bc, B:2015:0x09c3, B:2018:0x09d2, B:2019:0x09c8, B:2022:0x0997, B:2028:0x08f5, B:2030:0x08fb, B:2031:0x0910, B:2034:0x0917, B:2037:0x0926, B:2038:0x091c, B:2041:0x08eb, B:2047:0x0866, B:2049:0x086c, B:2050:0x0881, B:2053:0x0888, B:2056:0x0897, B:2057:0x088d, B:2060:0x085c, B:2063:0x07b8, B:2065:0x07be, B:2066:0x07d3, B:2069:0x07da, B:2072:0x07e9, B:2073:0x07df, B:2076:0x07ae, B:2079:0x070c, B:2081:0x0712, B:2082:0x0727, B:2085:0x072e, B:2088:0x073d, B:2089:0x0733, B:2092:0x0702, B:2095:0x0660, B:2097:0x0666, B:2098:0x067b, B:2101:0x0682, B:2104:0x0691, B:2105:0x0687, B:2108:0x0656, B:2111:0x05d9, B:2113:0x05df, B:2114:0x05f4, B:2117:0x05fb, B:2120:0x060a, B:2121:0x0600, B:2124:0x05cf, B:2127:0x052a, B:2129:0x0530, B:2130:0x0545, B:2133:0x054c, B:2136:0x055b, B:2137:0x0551, B:2140:0x0520, B:2143:0x04a3, B:2145:0x04a9, B:2146:0x04be, B:2149:0x04c5, B:2152:0x04d4, B:2153:0x04ca, B:2156:0x0499, B:2159:0x03f5, B:2161:0x03fb, B:2162:0x0410, B:2165:0x0417, B:2168:0x0426, B:2169:0x041c, B:2172:0x03eb, B:2181:0x033c, B:2183:0x0342, B:2184:0x0357, B:2187:0x035e, B:2190:0x0379, B:2191:0x0363, B:2195:0x0332, B:1432:0x2002, B:808:0x3803, B:1096:0x2d04, B:1944:0x0c05, B:1560:0x1b0d, B:1224:0x280e, B:1736:0x1410, B:600:0x4010, B:728:0x3b15, B:1352:0x2316, B:1864:0x0f19, B:1016:0x301d, B:1304:0x251e, B:1480:0x1e21, B:520:0x4322, B:1992:0x0a24, B:1144:0x2b25, B:1608:0x192c, B:648:0x3e2c, B:1784:0x122f, B:936:0x3332, B:2094:0x0635, B:776:0x3936, B:1400:0x2137, B:1912:0x0d38, B:1064:0x2e37, B:2046:0x083b, B:1528:0x1c40, B:568:0x4145, B:856:0x3646, B:1656:0x174b, B:696:0x3c4d, B:1832:0x104e, B:984:0x314e, B:1272:0x2654, B:1448:0x1f56, B:1960:0x0b57, B:1112:0x2c58, B:1576:0x1a5f, B:616:0x3f5f, B:904:0x3467, B:1192:0x2968, B:1704:0x156a, B:1880:0x0e6d, B:1032:0x2f6f, B:1320:0x2470, B:1496:0x1d75, B:2008:0x0976, B:536:0x4276, B:2142:0x0478, B:824:0x377c, B:1624:0x187e, B:664:0x3d80, B:952:0x3281, B:1752:0x1389, B:1240:0x2789, B:1928:0x0c8c, B:2062:0x078d, B:744:0x3a90, B:1368:0x2291, B:1544:0x1b94, B:584:0x4097, B:872:0x3598, B:1672:0x169d, B:1160:0x2a9e, B:1000:0x30a2, B:1288:0x25a3, B:1800:0x11a8, B:1976:0x0aab, B:2110:0x05ae, B:1416:0x20b0, B:792:0x38b1, B:1080:0x2db2, B:1592:0x19b3, B:920:0x33b9, B:1208:0x28ba, B:1720:0x14bc, B:1336:0x23c4, B:712:0x3bc6, B:1848:0x0fc7, B:2158:0x03ca, B:552:0x41ca, B:840:0x36cb, B:1464:0x1ecf, B:1640:0x17d2, B:1128:0x2bd3, B:632:0x3eda, B:1768:0x12db, B:1256:0x26db, B:2078:0x06e1, B:760:0x39e2, B:1384:0x21e3, B:1896:0x0de6, B:1048:0x2ee8, B:888:0x34ec, B:1512:0x1cee, B:1176:0x29ed, B:1688:0x15f1, B:1816:0x10fa, B:680:0x3cfb, B:968:0x31fc, B:2126:0x04fd), top: B:2194:0x0332, inners: #0, #1, #2, #3, #8, #9, #10, #11, #13, #14, #15, #16, #17, #19, #20, #22, #23, #24, #25, #26, #27, #29, #30, #32, #33, #34, #35, #36, #37, #38, #39, #40, #41, #42, #43, #44, #45, #46, #48, #49, #51, #53, #54, #55, #56, #57, #58, #59, #60, #61, #62, #64, #65, #66, #67, #68, #69, #70, #71, #72, #73, #74, #75, #77, #78, #79, #80, #81, #82, #83, #84, #85, #86, #87, #88, #89, #90, #91, #93, #94, #96, #97, #98, #100, #101, #102, #103, #104, #105, #106, #107, #108, #109, #110, #111, #112, #113, #114, #115, #116, #117, #119 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x4547  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x46c8 A[Catch: all -> 0x4954, TRY_ENTER, TryCatch #28 {all -> 0x4954, blocks: (B:347:0x438c, B:350:0x4431, B:354:0x44ff, B:358:0x45d9, B:361:0x4660, B:364:0x46c8, B:365:0x47cd, B:367:0x47e0, B:368:0x48e5, B:372:0x47f3, B:375:0x4881, B:377:0x4894, B:379:0x489d, B:381:0x48a5, B:382:0x48ad, B:384:0x48b5, B:385:0x48bd, B:387:0x48c5, B:388:0x48cd, B:390:0x48d5, B:391:0x48dd, B:394:0x4849, B:396:0x4850, B:397:0x4865, B:400:0x486c, B:403:0x487b, B:404:0x4871, B:407:0x483f, B:408:0x46db, B:411:0x4769, B:413:0x477c, B:415:0x4785, B:417:0x478d, B:418:0x4795, B:420:0x479d, B:421:0x47a5, B:423:0x47ad, B:424:0x47b5, B:426:0x47bd, B:427:0x47c5, B:430:0x4731, B:432:0x4737, B:433:0x474c, B:436:0x4753, B:439:0x4762, B:440:0x4758, B:443:0x4727, B:446:0x4628, B:448:0x462e, B:449:0x4643, B:452:0x464a, B:455:0x4659, B:456:0x464f, B:459:0x461e, B:465:0x4594, B:467:0x459a, B:468:0x45af, B:471:0x45b6, B:474:0x45d1, B:475:0x45bb, B:478:0x458a, B:484:0x44c7, B:486:0x44cd, B:487:0x44e2, B:490:0x44e9, B:493:0x44f8, B:494:0x44ee, B:497:0x44bd, B:500:0x43f9, B:502:0x43ff, B:503:0x4414, B:506:0x441b, B:509:0x442a, B:510:0x4420, B:513:0x43ef, B:2253:0x4948, B:2254:0x4953, B:429:0x4706, B:393:0x481e, B:483:0x449c, B:499:0x43ce, B:445:0x45fd), top: B:4:0x0044, inners: #4, #18, #76, #99, #118 }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x47e0 A[Catch: all -> 0x4954, TryCatch #28 {all -> 0x4954, blocks: (B:347:0x438c, B:350:0x4431, B:354:0x44ff, B:358:0x45d9, B:361:0x4660, B:364:0x46c8, B:365:0x47cd, B:367:0x47e0, B:368:0x48e5, B:372:0x47f3, B:375:0x4881, B:377:0x4894, B:379:0x489d, B:381:0x48a5, B:382:0x48ad, B:384:0x48b5, B:385:0x48bd, B:387:0x48c5, B:388:0x48cd, B:390:0x48d5, B:391:0x48dd, B:394:0x4849, B:396:0x4850, B:397:0x4865, B:400:0x486c, B:403:0x487b, B:404:0x4871, B:407:0x483f, B:408:0x46db, B:411:0x4769, B:413:0x477c, B:415:0x4785, B:417:0x478d, B:418:0x4795, B:420:0x479d, B:421:0x47a5, B:423:0x47ad, B:424:0x47b5, B:426:0x47bd, B:427:0x47c5, B:430:0x4731, B:432:0x4737, B:433:0x474c, B:436:0x4753, B:439:0x4762, B:440:0x4758, B:443:0x4727, B:446:0x4628, B:448:0x462e, B:449:0x4643, B:452:0x464a, B:455:0x4659, B:456:0x464f, B:459:0x461e, B:465:0x4594, B:467:0x459a, B:468:0x45af, B:471:0x45b6, B:474:0x45d1, B:475:0x45bb, B:478:0x458a, B:484:0x44c7, B:486:0x44cd, B:487:0x44e2, B:490:0x44e9, B:493:0x44f8, B:494:0x44ee, B:497:0x44bd, B:500:0x43f9, B:502:0x43ff, B:503:0x4414, B:506:0x441b, B:509:0x442a, B:510:0x4420, B:513:0x43ef, B:2253:0x4948, B:2254:0x4953, B:429:0x4706, B:393:0x481e, B:483:0x449c, B:499:0x43ce, B:445:0x45fd), top: B:4:0x0044, inners: #4, #18, #76, #99, #118 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x47f3 A[Catch: all -> 0x4954, TRY_LEAVE, TryCatch #28 {all -> 0x4954, blocks: (B:347:0x438c, B:350:0x4431, B:354:0x44ff, B:358:0x45d9, B:361:0x4660, B:364:0x46c8, B:365:0x47cd, B:367:0x47e0, B:368:0x48e5, B:372:0x47f3, B:375:0x4881, B:377:0x4894, B:379:0x489d, B:381:0x48a5, B:382:0x48ad, B:384:0x48b5, B:385:0x48bd, B:387:0x48c5, B:388:0x48cd, B:390:0x48d5, B:391:0x48dd, B:394:0x4849, B:396:0x4850, B:397:0x4865, B:400:0x486c, B:403:0x487b, B:404:0x4871, B:407:0x483f, B:408:0x46db, B:411:0x4769, B:413:0x477c, B:415:0x4785, B:417:0x478d, B:418:0x4795, B:420:0x479d, B:421:0x47a5, B:423:0x47ad, B:424:0x47b5, B:426:0x47bd, B:427:0x47c5, B:430:0x4731, B:432:0x4737, B:433:0x474c, B:436:0x4753, B:439:0x4762, B:440:0x4758, B:443:0x4727, B:446:0x4628, B:448:0x462e, B:449:0x4643, B:452:0x464a, B:455:0x4659, B:456:0x464f, B:459:0x461e, B:465:0x4594, B:467:0x459a, B:468:0x45af, B:471:0x45b6, B:474:0x45d1, B:475:0x45bb, B:478:0x458a, B:484:0x44c7, B:486:0x44cd, B:487:0x44e2, B:490:0x44e9, B:493:0x44f8, B:494:0x44ee, B:497:0x44bd, B:500:0x43f9, B:502:0x43ff, B:503:0x4414, B:506:0x441b, B:509:0x442a, B:510:0x4420, B:513:0x43ef, B:2253:0x4948, B:2254:0x4953, B:429:0x4706, B:393:0x481e, B:483:0x449c, B:499:0x43ce, B:445:0x45fd), top: B:4:0x0044, inners: #4, #18, #76, #99, #118 }] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x46db A[Catch: all -> 0x4954, TRY_LEAVE, TryCatch #28 {all -> 0x4954, blocks: (B:347:0x438c, B:350:0x4431, B:354:0x44ff, B:358:0x45d9, B:361:0x4660, B:364:0x46c8, B:365:0x47cd, B:367:0x47e0, B:368:0x48e5, B:372:0x47f3, B:375:0x4881, B:377:0x4894, B:379:0x489d, B:381:0x48a5, B:382:0x48ad, B:384:0x48b5, B:385:0x48bd, B:387:0x48c5, B:388:0x48cd, B:390:0x48d5, B:391:0x48dd, B:394:0x4849, B:396:0x4850, B:397:0x4865, B:400:0x486c, B:403:0x487b, B:404:0x4871, B:407:0x483f, B:408:0x46db, B:411:0x4769, B:413:0x477c, B:415:0x4785, B:417:0x478d, B:418:0x4795, B:420:0x479d, B:421:0x47a5, B:423:0x47ad, B:424:0x47b5, B:426:0x47bd, B:427:0x47c5, B:430:0x4731, B:432:0x4737, B:433:0x474c, B:436:0x4753, B:439:0x4762, B:440:0x4758, B:443:0x4727, B:446:0x4628, B:448:0x462e, B:449:0x4643, B:452:0x464a, B:455:0x4659, B:456:0x464f, B:459:0x461e, B:465:0x4594, B:467:0x459a, B:468:0x45af, B:471:0x45b6, B:474:0x45d1, B:475:0x45bb, B:478:0x458a, B:484:0x44c7, B:486:0x44cd, B:487:0x44e2, B:490:0x44e9, B:493:0x44f8, B:494:0x44ee, B:497:0x44bd, B:500:0x43f9, B:502:0x43ff, B:503:0x4414, B:506:0x441b, B:509:0x442a, B:510:0x4420, B:513:0x43ef, B:2253:0x4948, B:2254:0x4953, B:429:0x4706, B:393:0x481e, B:483:0x449c, B:499:0x43ce, B:445:0x45fd), top: B:4:0x0044, inners: #4, #18, #76, #99, #118 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x45fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x454d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x459a A[Catch: all -> 0x4954, TryCatch #28 {all -> 0x4954, blocks: (B:347:0x438c, B:350:0x4431, B:354:0x44ff, B:358:0x45d9, B:361:0x4660, B:364:0x46c8, B:365:0x47cd, B:367:0x47e0, B:368:0x48e5, B:372:0x47f3, B:375:0x4881, B:377:0x4894, B:379:0x489d, B:381:0x48a5, B:382:0x48ad, B:384:0x48b5, B:385:0x48bd, B:387:0x48c5, B:388:0x48cd, B:390:0x48d5, B:391:0x48dd, B:394:0x4849, B:396:0x4850, B:397:0x4865, B:400:0x486c, B:403:0x487b, B:404:0x4871, B:407:0x483f, B:408:0x46db, B:411:0x4769, B:413:0x477c, B:415:0x4785, B:417:0x478d, B:418:0x4795, B:420:0x479d, B:421:0x47a5, B:423:0x47ad, B:424:0x47b5, B:426:0x47bd, B:427:0x47c5, B:430:0x4731, B:432:0x4737, B:433:0x474c, B:436:0x4753, B:439:0x4762, B:440:0x4758, B:443:0x4727, B:446:0x4628, B:448:0x462e, B:449:0x4643, B:452:0x464a, B:455:0x4659, B:456:0x464f, B:459:0x461e, B:465:0x4594, B:467:0x459a, B:468:0x45af, B:471:0x45b6, B:474:0x45d1, B:475:0x45bb, B:478:0x458a, B:484:0x44c7, B:486:0x44cd, B:487:0x44e2, B:490:0x44e9, B:493:0x44f8, B:494:0x44ee, B:497:0x44bd, B:500:0x43f9, B:502:0x43ff, B:503:0x4414, B:506:0x441b, B:509:0x442a, B:510:0x4420, B:513:0x43ef, B:2253:0x4948, B:2254:0x4953, B:429:0x4706, B:393:0x481e, B:483:0x449c, B:499:0x43ce, B:445:0x45fd), top: B:4:0x0044, inners: #4, #18, #76, #99, #118 }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x45b5  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x45ba  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x45bb A[Catch: all -> 0x4954, TryCatch #28 {all -> 0x4954, blocks: (B:347:0x438c, B:350:0x4431, B:354:0x44ff, B:358:0x45d9, B:361:0x4660, B:364:0x46c8, B:365:0x47cd, B:367:0x47e0, B:368:0x48e5, B:372:0x47f3, B:375:0x4881, B:377:0x4894, B:379:0x489d, B:381:0x48a5, B:382:0x48ad, B:384:0x48b5, B:385:0x48bd, B:387:0x48c5, B:388:0x48cd, B:390:0x48d5, B:391:0x48dd, B:394:0x4849, B:396:0x4850, B:397:0x4865, B:400:0x486c, B:403:0x487b, B:404:0x4871, B:407:0x483f, B:408:0x46db, B:411:0x4769, B:413:0x477c, B:415:0x4785, B:417:0x478d, B:418:0x4795, B:420:0x479d, B:421:0x47a5, B:423:0x47ad, B:424:0x47b5, B:426:0x47bd, B:427:0x47c5, B:430:0x4731, B:432:0x4737, B:433:0x474c, B:436:0x4753, B:439:0x4762, B:440:0x4758, B:443:0x4727, B:446:0x4628, B:448:0x462e, B:449:0x4643, B:452:0x464a, B:455:0x4659, B:456:0x464f, B:459:0x461e, B:465:0x4594, B:467:0x459a, B:468:0x45af, B:471:0x45b6, B:474:0x45d1, B:475:0x45bb, B:478:0x458a, B:484:0x44c7, B:486:0x44cd, B:487:0x44e2, B:490:0x44e9, B:493:0x44f8, B:494:0x44ee, B:497:0x44bd, B:500:0x43f9, B:502:0x43ff, B:503:0x4414, B:506:0x441b, B:509:0x442a, B:510:0x4420, B:513:0x43ef, B:2253:0x4948, B:2254:0x4953, B:429:0x4706, B:393:0x481e, B:483:0x449c, B:499:0x43ce, B:445:0x45fd), top: B:4:0x0044, inners: #4, #18, #76, #99, #118 }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x449c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x43ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x4322 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x4276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x41ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:567:0x4145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:583:0x4097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:599:0x4010 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:615:0x3f5f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x3eda A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:647:0x3e2c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x3d80 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:679:0x3cfb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:695:0x3c4d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:711:0x3bc6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:727:0x3b15 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:743:0x3a90 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:759:0x39e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:775:0x3936 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:791:0x38b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:807:0x3803 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:823:0x377c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:839:0x36cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:855:0x3646 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:871:0x3598 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:887:0x34ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:903:0x3467 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:919:0x33b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:935:0x3332 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:951:0x3281 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:967:0x31fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:983:0x314e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:999:0x30a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v149 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    @Override // expo.modules.kotlin.modules.Module
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModuleDefinitionData definition() {
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        ModuleDefinitionBuilder moduleDefinitionBuilder2;
        KClass orCreateKotlinClass;
        Module module;
        Object m13470constructorimpl;
        AnyType anyType;
        Object m13470constructorimpl2;
        boolean z;
        boolean z2;
        Object m13470constructorimpl3;
        ModuleDefinitionBuilder moduleDefinitionBuilder3;
        String str;
        Object m13470constructorimpl4;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType2;
        Object m13470constructorimpl5;
        AnyType anyType3;
        Object m13470constructorimpl6;
        AnyType anyType4;
        Object m13470constructorimpl7;
        AnyType anyType5;
        Object m13470constructorimpl8;
        AnyType anyType6;
        Object m13470constructorimpl9;
        AnyType anyType7;
        Object m13470constructorimpl10;
        AnyType anyType8;
        Object m13470constructorimpl11;
        AnyType anyType9;
        Object m13470constructorimpl12;
        AnyType anyType10;
        String str2;
        Object m13470constructorimpl13;
        Throwable m13473exceptionOrNullimpl2;
        TypeDescriptor typeDescriptor2;
        AnyType anyType11;
        Object m13470constructorimpl14;
        AnyType anyType12;
        Object m13470constructorimpl15;
        AnyType anyType13;
        Object m13470constructorimpl16;
        AnyType anyType14;
        Object m13470constructorimpl17;
        AnyType anyType15;
        Object m13470constructorimpl18;
        AnyType anyType16;
        Object m13470constructorimpl19;
        AnyType anyType17;
        Object m13470constructorimpl20;
        AnyType anyType18;
        Object m13470constructorimpl21;
        AnyType anyType19;
        Object m13470constructorimpl22;
        AnyType anyType20;
        Object m13470constructorimpl23;
        AnyType anyType21;
        Object m13470constructorimpl24;
        AnyType anyType22;
        Object m13470constructorimpl25;
        AnyType anyType23;
        Object m13470constructorimpl26;
        AnyType anyType24;
        Object m13470constructorimpl27;
        AnyType anyType25;
        Object m13470constructorimpl28;
        AnyType anyType26;
        Object m13470constructorimpl29;
        AnyType anyType27;
        Object m13470constructorimpl30;
        AnyType anyType28;
        Object m13470constructorimpl31;
        AnyType anyType29;
        Object m13470constructorimpl32;
        AnyType anyType30;
        Object m13470constructorimpl33;
        AnyType anyType31;
        Object m13470constructorimpl34;
        AnyType anyType32;
        Object m13470constructorimpl35;
        AnyType anyType33;
        Object m13470constructorimpl36;
        AnyType anyType34;
        Object m13470constructorimpl37;
        AnyType anyType35;
        Object m13470constructorimpl38;
        AnyType anyType36;
        Object m13470constructorimpl39;
        AnyType anyType37;
        Object m13470constructorimpl40;
        AnyType anyType38;
        Object m13470constructorimpl41;
        AnyType anyType39;
        Object m13470constructorimpl42;
        AnyType anyType40;
        Object m13470constructorimpl43;
        AnyType anyType41;
        Object m13470constructorimpl44;
        AnyType anyType42;
        Object m13470constructorimpl45;
        AnyType anyType43;
        Object m13470constructorimpl46;
        AnyType anyType44;
        Object m13470constructorimpl47;
        AnyType anyType45;
        Object m13470constructorimpl48;
        AnyType anyType46;
        Object m13470constructorimpl49;
        AnyType anyType47;
        Object m13470constructorimpl50;
        AnyType anyType48;
        Object m13470constructorimpl51;
        AnyType anyType49;
        Object m13470constructorimpl52;
        AnyType anyType50;
        Object m13470constructorimpl53;
        AnyType anyType51;
        Object m13470constructorimpl54;
        AnyType anyType52;
        Object m13470constructorimpl55;
        AnyType anyType53;
        Object m13470constructorimpl56;
        AnyType anyType54;
        Object m13470constructorimpl57;
        AnyType anyType55;
        Object m13470constructorimpl58;
        AnyType anyType56;
        Object m13470constructorimpl59;
        AnyType anyType57;
        Object m13470constructorimpl60;
        AnyType anyType58;
        Object m13470constructorimpl61;
        AnyType anyType59;
        Object m13470constructorimpl62;
        AnyType anyType60;
        Object m13470constructorimpl63;
        AnyType anyType61;
        Object m13470constructorimpl64;
        AnyType anyType62;
        Object m13470constructorimpl65;
        AnyType anyType63;
        Object m13470constructorimpl66;
        AnyType anyType64;
        Object m13470constructorimpl67;
        AnyType anyType65;
        Object m13470constructorimpl68;
        AnyType anyType66;
        Object m13470constructorimpl69;
        AnyType anyType67;
        Object m13470constructorimpl70;
        AnyType anyType68;
        Object m13470constructorimpl71;
        AnyType anyType69;
        Object m13470constructorimpl72;
        AnyType anyType70;
        Object m13470constructorimpl73;
        AnyType anyType71;
        Object m13470constructorimpl74;
        AnyType anyType72;
        Object m13470constructorimpl75;
        AnyType anyType73;
        Object m13470constructorimpl76;
        AnyType anyType74;
        Object m13470constructorimpl77;
        AnyType anyType75;
        Object m13470constructorimpl78;
        AnyType anyType76;
        Object m13470constructorimpl79;
        AnyType anyType77;
        Object m13470constructorimpl80;
        AnyType anyType78;
        Object m13470constructorimpl81;
        AnyType anyType79;
        Object m13470constructorimpl82;
        AnyType anyType80;
        Object m13470constructorimpl83;
        AnyType anyType81;
        Object m13470constructorimpl84;
        AnyType anyType82;
        Object m13470constructorimpl85;
        AnyType anyType83;
        Object m13470constructorimpl86;
        AnyType anyType84;
        Object m13470constructorimpl87;
        AnyType anyType85;
        Object m13470constructorimpl88;
        AnyType anyType86;
        Object m13470constructorimpl89;
        AnyType anyType87;
        Object m13470constructorimpl90;
        AnyType anyType88;
        Object m13470constructorimpl91;
        AnyType anyType89;
        Object m13470constructorimpl92;
        AnyType anyType90;
        Object m13470constructorimpl93;
        AnyType anyType91;
        Object m13470constructorimpl94;
        AnyType anyType92;
        Object m13470constructorimpl95;
        AnyType anyType93;
        Object m13470constructorimpl96;
        AnyType anyType94;
        Object m13470constructorimpl97;
        AnyType anyType95;
        Object m13470constructorimpl98;
        AnyType anyType96;
        Object m13470constructorimpl99;
        AnyType anyType97;
        Object m13470constructorimpl100;
        AnyType anyType98;
        Object m13470constructorimpl101;
        AnyType anyType99;
        Object m13470constructorimpl102;
        AnyType anyType100;
        Object m13470constructorimpl103;
        AnyType anyType101;
        Object m13470constructorimpl104;
        AnyType anyType102;
        Object m13470constructorimpl105;
        AnyType anyType103;
        Object m13470constructorimpl106;
        AnyType anyType104;
        Object m13470constructorimpl107;
        AnyType anyType105;
        Object m13470constructorimpl108;
        AnyType anyType106;
        Object m13470constructorimpl109;
        AnyType anyType107;
        ClassComponentBuilder classComponentBuilder;
        Object m13470constructorimpl110;
        Throwable m13473exceptionOrNullimpl3;
        TypeDescriptor typeDescriptor3;
        AnyType anyType108;
        Object m13470constructorimpl111;
        Object m13470constructorimpl112;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent;
        Object m13470constructorimpl113;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent2;
        ContactsNextModule contactsNextModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (contactsNextModule.getClass() + ".ModuleDefinition"));
        try {
            moduleDefinitionBuilder = new ModuleDefinitionBuilder(contactsNextModule);
            moduleDefinitionBuilder.Name("ExpoContactsNext");
            moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Contact.class);
            module = moduleDefinitionBuilder2.getModule();
        } catch (Throwable th) {
            th = th;
            Trace.endSection();
            throw th;
        }
        try {
            if (module == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            AppContext appContext = module.getAppContext();
            String simpleName = JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            AnyType anyType109 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType109 != null) {
                anyType = anyType109;
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$$inlined$Class$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl4 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl4);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    m13470constructorimpl = null;
                }
                TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor4 == null) {
                    typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType = new AnyType(typeDescriptor4, null);
            }
            ClassComponentBuilder classComponentBuilder2 = new ClassComponentBuilder(appContext, simpleName, orCreateKotlinClass, anyType, moduleDefinitionBuilder2.getConverters());
            TypeConverterProvider converters = classComponentBuilder2.getConverters();
            AnyType[] anyTypeArr = new AnyType[1];
            AnyType anyType110 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType110 != null) {
                z2 = false;
            } else {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Constructor$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
                }
                Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                if (m13473exceptionOrNullimpl5 != null) {
                    z = false;
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl5);
                } else {
                    z = false;
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                    m13470constructorimpl2 = null;
                }
                TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl2;
                if (typeDescriptor5 == null) {
                    typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType110 = new AnyType(typeDescriptor5, converters);
                z2 = z;
            }
            anyTypeArr[z2 ? 1 : 0] = anyType110;
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
            if (returnType == null) {
                returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
                returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
            }
            classComponentBuilder2.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Constructor$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    ContactFactory contactFactory;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    String str3 = (String) objArr[0];
                    contactFactory = ContactsNextModule.this.getContactFactory();
                    return contactFactory.create(str3);
                }
            }));
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getTypeDescriptor(), "id");
            AnyType[] anyTypeArr2 = new AnyType[1];
            anyTypeArr2[z2 ? 1 : 0] = new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null);
            ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType2 = returnTypeProvider2.getTypes().get(Reflection.getOrCreateKotlinClass(String.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(Reflection.getOrCreateKotlinClass(String.class));
                returnTypeProvider2.getTypes().put(Reflection.getOrCreateKotlinClass(String.class), returnType2);
            }
            SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr2, returnType2, new Function1<Object[], Object>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return ((Contact) it[0]).getContactId();
                }
            });
            syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
            syncFunctionComponent.setCanTakeOwner(true);
            propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
            classComponentBuilder2.getProperties().put("id", propertyComponentBuilderWithThis);
            AsyncFunctionBuilder AsyncFunction = classComponentBuilder2.AsyncFunction("getDetails");
            String name = AsyncFunction.getName();
            TypeConverterProvider converters2 = AsyncFunction.getConverters();
            AnyType[] anyTypeArr3 = new AnyType[2];
            AnyType anyType111 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), Boolean.valueOf(z2)));
            ?? r17 = z2;
            if (anyType111 == null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), z2 ? 1 : 0)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th4) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
                }
                Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                if (m13473exceptionOrNullimpl6 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl6);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                    m13470constructorimpl3 = null;
                }
                TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl3;
                if (typeDescriptor6 == null) {
                    typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType111 = new AnyType(typeDescriptor6, converters2);
                r17 = 0;
            }
            anyTypeArr3[r17] = anyType111;
            AnyType anyType112 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Set.class), true));
            if (anyType112 != null) {
                moduleDefinitionBuilder3 = moduleDefinitionBuilder;
                str = "kotlin.String";
            } else {
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Set.class);
                    moduleDefinitionBuilder3 = moduleDefinitionBuilder;
                    try {
                        TypeInfo[] typeInfoArr = new TypeInfo[1];
                        str = "kotlin.String";
                        try {
                            typeInfoArr[0] = new TypeInfo.Simple("expo.modules.contacts.next.records.fields.ContactField", Reflection.getOrCreateKotlinClass(ContactField.class), false);
                            m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Parameterized("kotlin.collections.Set", orCreateKotlinClass2, true, ArraysKt.asList(typeInfoArr))), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$2
                                @Override // kotlin.jvm.functions.Function0
                                public final KType invoke() {
                                    return Reflection.nullableTypeOf(Set.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(ContactField.class)));
                                }
                            }));
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                Result.Companion companion8 = Result.INSTANCE;
                                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                                if (m13473exceptionOrNullimpl != null) {
                                }
                                if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                                }
                                typeDescriptor = (TypeDescriptor) m13470constructorimpl4;
                                if (typeDescriptor == null) {
                                }
                                anyType112 = new AnyType(typeDescriptor, converters2);
                                anyTypeArr3[1] = anyType112;
                                AsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, anyTypeArr3, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3(null)));
                                AsyncFunctionBuilder AsyncFunction2 = classComponentBuilder2.AsyncFunction("delete");
                                String name2 = AsyncFunction2.getName();
                                TypeConverterProvider converters3 = AsyncFunction2.getConverters();
                                AnyType[] anyTypeArr4 = new AnyType[1];
                                anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType2 == null) {
                                }
                                anyTypeArr4[0] = anyType2;
                                AsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, anyTypeArr4, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$5(null)));
                                AsyncFunctionBuilder AsyncFunction3 = classComponentBuilder2.AsyncFunction("patch");
                                String name3 = AsyncFunction3.getName();
                                TypeConverterProvider converters4 = AsyncFunction3.getConverters();
                                AnyType[] anyTypeArr5 = new AnyType[2];
                                anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType3 == null) {
                                }
                                anyTypeArr5[0] = anyType3;
                                anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PatchContactRecord.class), false));
                                if (anyType4 == null) {
                                }
                                anyTypeArr5[1] = anyType4;
                                AsyncFunction3.setAsyncFunctionComponent(new SuspendFunctionComponent(name3, anyTypeArr5, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$8(null)));
                                AsyncFunctionBuilder AsyncFunction4 = classComponentBuilder2.AsyncFunction("update");
                                String name4 = AsyncFunction4.getName();
                                TypeConverterProvider converters5 = AsyncFunction4.getConverters();
                                AnyType[] anyTypeArr6 = new AnyType[2];
                                anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType5 == null) {
                                }
                                anyTypeArr6[0] = anyType5;
                                anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CreateContactRecord.class), false));
                                if (anyType6 == null) {
                                }
                                anyTypeArr6[1] = anyType6;
                                AsyncFunction4.setAsyncFunctionComponent(new SuspendFunctionComponent(name4, anyTypeArr6, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$11(null)));
                                AsyncFunctionBuilder AsyncFunction5 = classComponentBuilder2.AsyncFunction("getFullName");
                                String name5 = AsyncFunction5.getName();
                                TypeConverterProvider converters6 = AsyncFunction5.getConverters();
                                AnyType[] anyTypeArr7 = new AnyType[1];
                                anyType7 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType7 == null) {
                                }
                                anyTypeArr7[0] = anyType7;
                                AsyncFunction5.setAsyncFunctionComponent(new SuspendFunctionComponent(name5, anyTypeArr7, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$13(null)));
                                AsyncFunctionBuilder AsyncFunction6 = classComponentBuilder2.AsyncFunction("getGivenName");
                                String name6 = AsyncFunction6.getName();
                                TypeConverterProvider converters7 = AsyncFunction6.getConverters();
                                AnyType[] anyTypeArr8 = new AnyType[1];
                                anyType8 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType8 == null) {
                                }
                                anyTypeArr8[0] = anyType8;
                                AsyncFunction6.setAsyncFunctionComponent(new SuspendFunctionComponent(name6, anyTypeArr8, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$15(null)));
                                AsyncFunctionBuilder AsyncFunction7 = classComponentBuilder2.AsyncFunction("setGivenName");
                                String name7 = AsyncFunction7.getName();
                                TypeConverterProvider converters8 = AsyncFunction7.getConverters();
                                AnyType[] anyTypeArr9 = new AnyType[2];
                                anyType9 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType9 == null) {
                                }
                                anyTypeArr9[0] = anyType9;
                                anyType10 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType10 != null) {
                                }
                                anyTypeArr9[1] = anyType10;
                                AsyncFunction7.setAsyncFunctionComponent(new SuspendFunctionComponent(name7, anyTypeArr9, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$18(null)));
                                AsyncFunctionBuilder AsyncFunction8 = classComponentBuilder2.AsyncFunction("getFamilyName");
                                String name8 = AsyncFunction8.getName();
                                TypeConverterProvider converters9 = AsyncFunction8.getConverters();
                                AnyType[] anyTypeArr10 = new AnyType[1];
                                anyType11 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType11 == null) {
                                }
                                anyTypeArr10[0] = anyType11;
                                AsyncFunction8.setAsyncFunctionComponent(new SuspendFunctionComponent(name8, anyTypeArr10, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$20(null)));
                                AsyncFunctionBuilder AsyncFunction9 = classComponentBuilder2.AsyncFunction("setFamilyName");
                                String name9 = AsyncFunction9.getName();
                                TypeConverterProvider converters10 = AsyncFunction9.getConverters();
                                AnyType[] anyTypeArr11 = new AnyType[2];
                                anyType12 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType12 == null) {
                                }
                                anyTypeArr11[0] = anyType12;
                                anyType13 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType13 == null) {
                                }
                                anyTypeArr11[1] = anyType13;
                                AsyncFunction9.setAsyncFunctionComponent(new SuspendFunctionComponent(name9, anyTypeArr11, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$23(null)));
                                AsyncFunctionBuilder AsyncFunction10 = classComponentBuilder2.AsyncFunction("getMiddleName");
                                String name10 = AsyncFunction10.getName();
                                TypeConverterProvider converters11 = AsyncFunction10.getConverters();
                                AnyType[] anyTypeArr12 = new AnyType[1];
                                anyType14 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType14 == null) {
                                }
                                anyTypeArr12[0] = anyType14;
                                AsyncFunction10.setAsyncFunctionComponent(new SuspendFunctionComponent(name10, anyTypeArr12, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$25(null)));
                                AsyncFunctionBuilder AsyncFunction11 = classComponentBuilder2.AsyncFunction("setMiddleName");
                                String name11 = AsyncFunction11.getName();
                                TypeConverterProvider converters12 = AsyncFunction11.getConverters();
                                AnyType[] anyTypeArr13 = new AnyType[2];
                                anyType15 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType15 == null) {
                                }
                                anyTypeArr13[0] = anyType15;
                                anyType16 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType16 == null) {
                                }
                                anyTypeArr13[1] = anyType16;
                                AsyncFunction11.setAsyncFunctionComponent(new SuspendFunctionComponent(name11, anyTypeArr13, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$28(null)));
                                AsyncFunctionBuilder AsyncFunction12 = classComponentBuilder2.AsyncFunction("getPrefix");
                                String name12 = AsyncFunction12.getName();
                                TypeConverterProvider converters13 = AsyncFunction12.getConverters();
                                AnyType[] anyTypeArr14 = new AnyType[1];
                                anyType17 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType17 == null) {
                                }
                                anyTypeArr14[0] = anyType17;
                                AsyncFunction12.setAsyncFunctionComponent(new SuspendFunctionComponent(name12, anyTypeArr14, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$30(null)));
                                AsyncFunctionBuilder AsyncFunction13 = classComponentBuilder2.AsyncFunction("setPrefix");
                                String name13 = AsyncFunction13.getName();
                                TypeConverterProvider converters14 = AsyncFunction13.getConverters();
                                AnyType[] anyTypeArr15 = new AnyType[2];
                                anyType18 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType18 == null) {
                                }
                                anyTypeArr15[0] = anyType18;
                                anyType19 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType19 == null) {
                                }
                                anyTypeArr15[1] = anyType19;
                                AsyncFunction13.setAsyncFunctionComponent(new SuspendFunctionComponent(name13, anyTypeArr15, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$33(null)));
                                AsyncFunctionBuilder AsyncFunction14 = classComponentBuilder2.AsyncFunction("getSuffix");
                                String name14 = AsyncFunction14.getName();
                                TypeConverterProvider converters15 = AsyncFunction14.getConverters();
                                AnyType[] anyTypeArr16 = new AnyType[1];
                                anyType20 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType20 == null) {
                                }
                                anyTypeArr16[0] = anyType20;
                                AsyncFunction14.setAsyncFunctionComponent(new SuspendFunctionComponent(name14, anyTypeArr16, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$35(null)));
                                AsyncFunctionBuilder AsyncFunction15 = classComponentBuilder2.AsyncFunction("setSuffix");
                                String name15 = AsyncFunction15.getName();
                                TypeConverterProvider converters16 = AsyncFunction15.getConverters();
                                AnyType[] anyTypeArr17 = new AnyType[2];
                                anyType21 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType21 == null) {
                                }
                                anyTypeArr17[0] = anyType21;
                                anyType22 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType22 == null) {
                                }
                                anyTypeArr17[1] = anyType22;
                                AsyncFunction15.setAsyncFunctionComponent(new SuspendFunctionComponent(name15, anyTypeArr17, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$38(null)));
                                AsyncFunctionBuilder AsyncFunction16 = classComponentBuilder2.AsyncFunction("getPhoneticGivenName");
                                String name16 = AsyncFunction16.getName();
                                TypeConverterProvider converters17 = AsyncFunction16.getConverters();
                                AnyType[] anyTypeArr18 = new AnyType[1];
                                anyType23 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType23 == null) {
                                }
                                anyTypeArr18[0] = anyType23;
                                AsyncFunction16.setAsyncFunctionComponent(new SuspendFunctionComponent(name16, anyTypeArr18, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$40(null)));
                                AsyncFunctionBuilder AsyncFunction17 = classComponentBuilder2.AsyncFunction("setPhoneticGivenName");
                                String name17 = AsyncFunction17.getName();
                                TypeConverterProvider converters18 = AsyncFunction17.getConverters();
                                AnyType[] anyTypeArr19 = new AnyType[2];
                                anyType24 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType24 == null) {
                                }
                                anyTypeArr19[0] = anyType24;
                                anyType25 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType25 == null) {
                                }
                                anyTypeArr19[1] = anyType25;
                                AsyncFunction17.setAsyncFunctionComponent(new SuspendFunctionComponent(name17, anyTypeArr19, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$43(null)));
                                AsyncFunctionBuilder AsyncFunction18 = classComponentBuilder2.AsyncFunction("getPhoneticMiddleName");
                                String name18 = AsyncFunction18.getName();
                                TypeConverterProvider converters19 = AsyncFunction18.getConverters();
                                AnyType[] anyTypeArr20 = new AnyType[1];
                                anyType26 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType26 == null) {
                                }
                                anyTypeArr20[0] = anyType26;
                                AsyncFunction18.setAsyncFunctionComponent(new SuspendFunctionComponent(name18, anyTypeArr20, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$45(null)));
                                AsyncFunctionBuilder AsyncFunction19 = classComponentBuilder2.AsyncFunction("setPhoneticMiddleName");
                                String name19 = AsyncFunction19.getName();
                                TypeConverterProvider converters20 = AsyncFunction19.getConverters();
                                AnyType[] anyTypeArr21 = new AnyType[2];
                                anyType27 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType27 == null) {
                                }
                                anyTypeArr21[0] = anyType27;
                                anyType28 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType28 == null) {
                                }
                                anyTypeArr21[1] = anyType28;
                                AsyncFunction19.setAsyncFunctionComponent(new SuspendFunctionComponent(name19, anyTypeArr21, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$48(null)));
                                AsyncFunctionBuilder AsyncFunction20 = classComponentBuilder2.AsyncFunction("getPhoneticFamilyName");
                                String name20 = AsyncFunction20.getName();
                                TypeConverterProvider converters21 = AsyncFunction20.getConverters();
                                AnyType[] anyTypeArr22 = new AnyType[1];
                                anyType29 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType29 == null) {
                                }
                                anyTypeArr22[0] = anyType29;
                                AsyncFunction20.setAsyncFunctionComponent(new SuspendFunctionComponent(name20, anyTypeArr22, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$50(null)));
                                AsyncFunctionBuilder AsyncFunction21 = classComponentBuilder2.AsyncFunction("setPhoneticFamilyName");
                                String name21 = AsyncFunction21.getName();
                                TypeConverterProvider converters22 = AsyncFunction21.getConverters();
                                AnyType[] anyTypeArr23 = new AnyType[2];
                                anyType30 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType30 == null) {
                                }
                                anyTypeArr23[0] = anyType30;
                                anyType31 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType31 == null) {
                                }
                                anyTypeArr23[1] = anyType31;
                                AsyncFunction21.setAsyncFunctionComponent(new SuspendFunctionComponent(name21, anyTypeArr23, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$53(null)));
                                AsyncFunctionBuilder AsyncFunction22 = classComponentBuilder2.AsyncFunction("getCompany");
                                String name22 = AsyncFunction22.getName();
                                TypeConverterProvider converters23 = AsyncFunction22.getConverters();
                                AnyType[] anyTypeArr24 = new AnyType[1];
                                anyType32 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType32 == null) {
                                }
                                anyTypeArr24[0] = anyType32;
                                AsyncFunction22.setAsyncFunctionComponent(new SuspendFunctionComponent(name22, anyTypeArr24, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$55(null)));
                                AsyncFunctionBuilder AsyncFunction23 = classComponentBuilder2.AsyncFunction("setCompany");
                                String name23 = AsyncFunction23.getName();
                                TypeConverterProvider converters24 = AsyncFunction23.getConverters();
                                AnyType[] anyTypeArr25 = new AnyType[2];
                                anyType33 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType33 == null) {
                                }
                                anyTypeArr25[0] = anyType33;
                                anyType34 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType34 == null) {
                                }
                                anyTypeArr25[1] = anyType34;
                                AsyncFunction23.setAsyncFunctionComponent(new SuspendFunctionComponent(name23, anyTypeArr25, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$58(null)));
                                AsyncFunctionBuilder AsyncFunction24 = classComponentBuilder2.AsyncFunction("getDepartment");
                                String name24 = AsyncFunction24.getName();
                                TypeConverterProvider converters25 = AsyncFunction24.getConverters();
                                AnyType[] anyTypeArr26 = new AnyType[1];
                                anyType35 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType35 == null) {
                                }
                                anyTypeArr26[0] = anyType35;
                                AsyncFunction24.setAsyncFunctionComponent(new SuspendFunctionComponent(name24, anyTypeArr26, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$60(null)));
                                AsyncFunctionBuilder AsyncFunction25 = classComponentBuilder2.AsyncFunction("setDepartment");
                                String name25 = AsyncFunction25.getName();
                                TypeConverterProvider converters26 = AsyncFunction25.getConverters();
                                AnyType[] anyTypeArr27 = new AnyType[2];
                                anyType36 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType36 == null) {
                                }
                                anyTypeArr27[0] = anyType36;
                                anyType37 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType37 == null) {
                                }
                                anyTypeArr27[1] = anyType37;
                                AsyncFunction25.setAsyncFunctionComponent(new SuspendFunctionComponent(name25, anyTypeArr27, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$63(null)));
                                AsyncFunctionBuilder AsyncFunction26 = classComponentBuilder2.AsyncFunction("getJobTitle");
                                String name26 = AsyncFunction26.getName();
                                TypeConverterProvider converters27 = AsyncFunction26.getConverters();
                                AnyType[] anyTypeArr28 = new AnyType[1];
                                anyType38 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType38 == null) {
                                }
                                anyTypeArr28[0] = anyType38;
                                AsyncFunction26.setAsyncFunctionComponent(new SuspendFunctionComponent(name26, anyTypeArr28, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$65(null)));
                                AsyncFunctionBuilder AsyncFunction27 = classComponentBuilder2.AsyncFunction("setJobTitle");
                                String name27 = AsyncFunction27.getName();
                                TypeConverterProvider converters28 = AsyncFunction27.getConverters();
                                AnyType[] anyTypeArr29 = new AnyType[2];
                                anyType39 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType39 == null) {
                                }
                                anyTypeArr29[0] = anyType39;
                                anyType40 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType40 == null) {
                                }
                                anyTypeArr29[1] = anyType40;
                                AsyncFunction27.setAsyncFunctionComponent(new SuspendFunctionComponent(name27, anyTypeArr29, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$68(null)));
                                AsyncFunctionBuilder AsyncFunction28 = classComponentBuilder2.AsyncFunction("getPhoneticCompanyName");
                                String name28 = AsyncFunction28.getName();
                                TypeConverterProvider converters29 = AsyncFunction28.getConverters();
                                AnyType[] anyTypeArr30 = new AnyType[1];
                                anyType41 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType41 == null) {
                                }
                                anyTypeArr30[0] = anyType41;
                                AsyncFunction28.setAsyncFunctionComponent(new SuspendFunctionComponent(name28, anyTypeArr30, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$70(null)));
                                AsyncFunctionBuilder AsyncFunction29 = classComponentBuilder2.AsyncFunction("setPhoneticCompanyName");
                                String name29 = AsyncFunction29.getName();
                                TypeConverterProvider converters30 = AsyncFunction29.getConverters();
                                AnyType[] anyTypeArr31 = new AnyType[2];
                                anyType42 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType42 == null) {
                                }
                                anyTypeArr31[0] = anyType42;
                                anyType43 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType43 == null) {
                                }
                                anyTypeArr31[1] = anyType43;
                                AsyncFunction29.setAsyncFunctionComponent(new SuspendFunctionComponent(name29, anyTypeArr31, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$73(null)));
                                AsyncFunctionBuilder AsyncFunction30 = classComponentBuilder2.AsyncFunction("getNote");
                                String name30 = AsyncFunction30.getName();
                                TypeConverterProvider converters31 = AsyncFunction30.getConverters();
                                AnyType[] anyTypeArr32 = new AnyType[1];
                                anyType44 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType44 == null) {
                                }
                                anyTypeArr32[0] = anyType44;
                                AsyncFunction30.setAsyncFunctionComponent(new SuspendFunctionComponent(name30, anyTypeArr32, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$75(null)));
                                AsyncFunctionBuilder AsyncFunction31 = classComponentBuilder2.AsyncFunction("setNote");
                                String name31 = AsyncFunction31.getName();
                                TypeConverterProvider converters32 = AsyncFunction31.getConverters();
                                AnyType[] anyTypeArr33 = new AnyType[2];
                                anyType45 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType45 == null) {
                                }
                                anyTypeArr33[0] = anyType45;
                                anyType46 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType46 == null) {
                                }
                                anyTypeArr33[1] = anyType46;
                                AsyncFunction31.setAsyncFunctionComponent(new SuspendFunctionComponent(name31, anyTypeArr33, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$78(null)));
                                AsyncFunctionBuilder AsyncFunction32 = classComponentBuilder2.AsyncFunction("getImage");
                                String name32 = AsyncFunction32.getName();
                                TypeConverterProvider converters33 = AsyncFunction32.getConverters();
                                AnyType[] anyTypeArr34 = new AnyType[1];
                                anyType47 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType47 == null) {
                                }
                                anyTypeArr34[0] = anyType47;
                                AsyncFunction32.setAsyncFunctionComponent(new SuspendFunctionComponent(name32, anyTypeArr34, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$80(null)));
                                AsyncFunctionBuilder AsyncFunction33 = classComponentBuilder2.AsyncFunction("setImage");
                                String name33 = AsyncFunction33.getName();
                                TypeConverterProvider converters34 = AsyncFunction33.getConverters();
                                AnyType[] anyTypeArr35 = new AnyType[2];
                                anyType48 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType48 == null) {
                                }
                                anyTypeArr35[0] = anyType48;
                                anyType49 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                                if (anyType49 == null) {
                                }
                                anyTypeArr35[1] = anyType49;
                                AsyncFunction33.setAsyncFunctionComponent(new SuspendFunctionComponent(name33, anyTypeArr35, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$83(null)));
                                AsyncFunctionBuilder AsyncFunction34 = classComponentBuilder2.AsyncFunction("getThumbnail");
                                String name34 = AsyncFunction34.getName();
                                TypeConverterProvider converters35 = AsyncFunction34.getConverters();
                                AnyType[] anyTypeArr36 = new AnyType[1];
                                anyType50 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType50 == null) {
                                }
                                anyTypeArr36[0] = anyType50;
                                AsyncFunction34.setAsyncFunctionComponent(new SuspendFunctionComponent(name34, anyTypeArr36, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$85(null)));
                                AsyncFunctionBuilder AsyncFunction35 = classComponentBuilder2.AsyncFunction("setIsFavourite");
                                String name35 = AsyncFunction35.getName();
                                TypeConverterProvider converters36 = AsyncFunction35.getConverters();
                                AnyType[] anyTypeArr37 = new AnyType[2];
                                anyType51 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType51 == null) {
                                }
                                anyTypeArr37[0] = anyType51;
                                anyType52 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), false));
                                if (anyType52 == null) {
                                }
                                anyTypeArr37[1] = anyType52;
                                AsyncFunction35.setAsyncFunctionComponent(new SuspendFunctionComponent(name35, anyTypeArr37, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$88(null)));
                                AsyncFunctionBuilder AsyncFunction36 = classComponentBuilder2.AsyncFunction("getIsFavourite");
                                String name36 = AsyncFunction36.getName();
                                TypeConverterProvider converters37 = AsyncFunction36.getConverters();
                                AnyType[] anyTypeArr38 = new AnyType[1];
                                anyType53 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType53 == null) {
                                }
                                anyTypeArr38[0] = anyType53;
                                AsyncFunction36.setAsyncFunctionComponent(new SuspendFunctionComponent(name36, anyTypeArr38, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$90(null)));
                                AsyncFunctionBuilder AsyncFunction37 = classComponentBuilder2.AsyncFunction("getEmails");
                                String name37 = AsyncFunction37.getName();
                                TypeConverterProvider converters38 = AsyncFunction37.getConverters();
                                AnyType[] anyTypeArr39 = new AnyType[1];
                                anyType54 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType54 == null) {
                                }
                                anyTypeArr39[0] = anyType54;
                                AsyncFunction37.setAsyncFunctionComponent(new SuspendFunctionComponent(name37, anyTypeArr39, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$92(null)));
                                AsyncFunctionBuilder AsyncFunction38 = classComponentBuilder2.AsyncFunction("addEmail");
                                String name38 = AsyncFunction38.getName();
                                TypeConverterProvider converters39 = AsyncFunction38.getConverters();
                                AnyType[] anyTypeArr40 = new AnyType[2];
                                anyType55 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType55 == null) {
                                }
                                anyTypeArr40[0] = anyType55;
                                anyType56 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.New.class), false));
                                if (anyType56 == null) {
                                }
                                anyTypeArr40[1] = anyType56;
                                AsyncFunction38.setAsyncFunctionComponent(new SuspendFunctionComponent(name38, anyTypeArr40, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$95(null)));
                                AsyncFunctionBuilder AsyncFunction39 = classComponentBuilder2.AsyncFunction("updateEmail");
                                String name39 = AsyncFunction39.getName();
                                TypeConverterProvider converters40 = AsyncFunction39.getConverters();
                                AnyType[] anyTypeArr41 = new AnyType[2];
                                anyType57 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType57 == null) {
                                }
                                anyTypeArr41[0] = anyType57;
                                anyType58 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.Existing.class), false));
                                if (anyType58 == null) {
                                }
                                anyTypeArr41[1] = anyType58;
                                AsyncFunction39.setAsyncFunctionComponent(new SuspendFunctionComponent(name39, anyTypeArr41, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$98(null)));
                                AsyncFunctionBuilder AsyncFunction40 = classComponentBuilder2.AsyncFunction("deleteEmail");
                                String name40 = AsyncFunction40.getName();
                                TypeConverterProvider converters41 = AsyncFunction40.getConverters();
                                AnyType[] anyTypeArr42 = new AnyType[2];
                                anyType59 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType59 == null) {
                                }
                                anyTypeArr42[0] = anyType59;
                                anyType60 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.Existing.class), false));
                                if (anyType60 == null) {
                                }
                                anyTypeArr42[1] = anyType60;
                                AsyncFunction40.setAsyncFunctionComponent(new SuspendFunctionComponent(name40, anyTypeArr42, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$101(null)));
                                AsyncFunctionBuilder AsyncFunction41 = classComponentBuilder2.AsyncFunction("getPhones");
                                String name41 = AsyncFunction41.getName();
                                TypeConverterProvider converters42 = AsyncFunction41.getConverters();
                                AnyType[] anyTypeArr43 = new AnyType[1];
                                anyType61 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType61 == null) {
                                }
                                anyTypeArr43[0] = anyType61;
                                AsyncFunction41.setAsyncFunctionComponent(new SuspendFunctionComponent(name41, anyTypeArr43, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$103(null)));
                                AsyncFunctionBuilder AsyncFunction42 = classComponentBuilder2.AsyncFunction("addPhone");
                                String name42 = AsyncFunction42.getName();
                                TypeConverterProvider converters43 = AsyncFunction42.getConverters();
                                AnyType[] anyTypeArr44 = new AnyType[2];
                                anyType62 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType62 == null) {
                                }
                                anyTypeArr44[0] = anyType62;
                                anyType63 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.New.class), false));
                                if (anyType63 == null) {
                                }
                                anyTypeArr44[1] = anyType63;
                                AsyncFunction42.setAsyncFunctionComponent(new SuspendFunctionComponent(name42, anyTypeArr44, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$106(null)));
                                AsyncFunctionBuilder AsyncFunction43 = classComponentBuilder2.AsyncFunction("updatePhone");
                                String name43 = AsyncFunction43.getName();
                                TypeConverterProvider converters44 = AsyncFunction43.getConverters();
                                AnyType[] anyTypeArr45 = new AnyType[2];
                                anyType64 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType64 == null) {
                                }
                                anyTypeArr45[0] = anyType64;
                                anyType65 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.Existing.class), false));
                                if (anyType65 == null) {
                                }
                                anyTypeArr45[1] = anyType65;
                                AsyncFunction43.setAsyncFunctionComponent(new SuspendFunctionComponent(name43, anyTypeArr45, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$109(null)));
                                AsyncFunctionBuilder AsyncFunction44 = classComponentBuilder2.AsyncFunction("deletePhone");
                                String name44 = AsyncFunction44.getName();
                                TypeConverterProvider converters45 = AsyncFunction44.getConverters();
                                AnyType[] anyTypeArr46 = new AnyType[2];
                                anyType66 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType66 == null) {
                                }
                                anyTypeArr46[0] = anyType66;
                                anyType67 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.Existing.class), false));
                                if (anyType67 == null) {
                                }
                                anyTypeArr46[1] = anyType67;
                                AsyncFunction44.setAsyncFunctionComponent(new SuspendFunctionComponent(name44, anyTypeArr46, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$112(null)));
                                AsyncFunctionBuilder AsyncFunction45 = classComponentBuilder2.AsyncFunction("getAddresses");
                                String name45 = AsyncFunction45.getName();
                                TypeConverterProvider converters46 = AsyncFunction45.getConverters();
                                AnyType[] anyTypeArr47 = new AnyType[1];
                                anyType68 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType68 == null) {
                                }
                                anyTypeArr47[0] = anyType68;
                                AsyncFunction45.setAsyncFunctionComponent(new SuspendFunctionComponent(name45, anyTypeArr47, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$114(null)));
                                AsyncFunctionBuilder AsyncFunction46 = classComponentBuilder2.AsyncFunction("addAddress");
                                String name46 = AsyncFunction46.getName();
                                TypeConverterProvider converters47 = AsyncFunction46.getConverters();
                                AnyType[] anyTypeArr48 = new AnyType[2];
                                anyType69 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType69 == null) {
                                }
                                anyTypeArr48[0] = anyType69;
                                anyType70 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.New.class), false));
                                if (anyType70 == null) {
                                }
                                anyTypeArr48[1] = anyType70;
                                AsyncFunction46.setAsyncFunctionComponent(new SuspendFunctionComponent(name46, anyTypeArr48, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$117(null)));
                                AsyncFunctionBuilder AsyncFunction47 = classComponentBuilder2.AsyncFunction("updateAddress");
                                String name47 = AsyncFunction47.getName();
                                TypeConverterProvider converters48 = AsyncFunction47.getConverters();
                                AnyType[] anyTypeArr49 = new AnyType[2];
                                anyType71 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType71 == null) {
                                }
                                anyTypeArr49[0] = anyType71;
                                anyType72 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.Existing.class), false));
                                if (anyType72 == null) {
                                }
                                anyTypeArr49[1] = anyType72;
                                AsyncFunction47.setAsyncFunctionComponent(new SuspendFunctionComponent(name47, anyTypeArr49, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$120(null)));
                                AsyncFunctionBuilder AsyncFunction48 = classComponentBuilder2.AsyncFunction("deleteAddress");
                                String name48 = AsyncFunction48.getName();
                                TypeConverterProvider converters49 = AsyncFunction48.getConverters();
                                AnyType[] anyTypeArr50 = new AnyType[2];
                                anyType73 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType73 == null) {
                                }
                                anyTypeArr50[0] = anyType73;
                                anyType74 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.Existing.class), false));
                                if (anyType74 == null) {
                                }
                                anyTypeArr50[1] = anyType74;
                                AsyncFunction48.setAsyncFunctionComponent(new SuspendFunctionComponent(name48, anyTypeArr50, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$123(null)));
                                AsyncFunctionBuilder AsyncFunction49 = classComponentBuilder2.AsyncFunction("getDates");
                                String name49 = AsyncFunction49.getName();
                                TypeConverterProvider converters50 = AsyncFunction49.getConverters();
                                AnyType[] anyTypeArr51 = new AnyType[1];
                                anyType75 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType75 == null) {
                                }
                                anyTypeArr51[0] = anyType75;
                                AsyncFunction49.setAsyncFunctionComponent(new SuspendFunctionComponent(name49, anyTypeArr51, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$125(null)));
                                AsyncFunctionBuilder AsyncFunction50 = classComponentBuilder2.AsyncFunction("addDate");
                                String name50 = AsyncFunction50.getName();
                                TypeConverterProvider converters51 = AsyncFunction50.getConverters();
                                AnyType[] anyTypeArr52 = new AnyType[2];
                                anyType76 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType76 == null) {
                                }
                                anyTypeArr52[0] = anyType76;
                                anyType77 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.New.class), false));
                                if (anyType77 == null) {
                                }
                                anyTypeArr52[1] = anyType77;
                                AsyncFunction50.setAsyncFunctionComponent(new SuspendFunctionComponent(name50, anyTypeArr52, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$128(null)));
                                AsyncFunctionBuilder AsyncFunction51 = classComponentBuilder2.AsyncFunction("updateDate");
                                String name51 = AsyncFunction51.getName();
                                TypeConverterProvider converters52 = AsyncFunction51.getConverters();
                                AnyType[] anyTypeArr53 = new AnyType[2];
                                anyType78 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType78 == null) {
                                }
                                anyTypeArr53[0] = anyType78;
                                anyType79 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.Existing.class), false));
                                if (anyType79 == null) {
                                }
                                anyTypeArr53[1] = anyType79;
                                AsyncFunction51.setAsyncFunctionComponent(new SuspendFunctionComponent(name51, anyTypeArr53, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$131(null)));
                                AsyncFunctionBuilder AsyncFunction52 = classComponentBuilder2.AsyncFunction("deleteDate");
                                String name52 = AsyncFunction52.getName();
                                TypeConverterProvider converters53 = AsyncFunction52.getConverters();
                                AnyType[] anyTypeArr54 = new AnyType[2];
                                anyType80 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType80 == null) {
                                }
                                anyTypeArr54[0] = anyType80;
                                anyType81 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.Existing.class), false));
                                if (anyType81 == null) {
                                }
                                anyTypeArr54[1] = anyType81;
                                AsyncFunction52.setAsyncFunctionComponent(new SuspendFunctionComponent(name52, anyTypeArr54, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$134(null)));
                                AsyncFunctionBuilder AsyncFunction53 = classComponentBuilder2.AsyncFunction("getExtraNames");
                                String name53 = AsyncFunction53.getName();
                                TypeConverterProvider converters54 = AsyncFunction53.getConverters();
                                AnyType[] anyTypeArr55 = new AnyType[1];
                                anyType82 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType82 == null) {
                                }
                                anyTypeArr55[0] = anyType82;
                                AsyncFunction53.setAsyncFunctionComponent(new SuspendFunctionComponent(name53, anyTypeArr55, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$136(null)));
                                AsyncFunctionBuilder AsyncFunction54 = classComponentBuilder2.AsyncFunction("addExtraName");
                                String name54 = AsyncFunction54.getName();
                                TypeConverterProvider converters55 = AsyncFunction54.getConverters();
                                AnyType[] anyTypeArr56 = new AnyType[2];
                                anyType83 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType83 == null) {
                                }
                                anyTypeArr56[0] = anyType83;
                                anyType84 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.New.class), false));
                                if (anyType84 == null) {
                                }
                                anyTypeArr56[1] = anyType84;
                                AsyncFunction54.setAsyncFunctionComponent(new SuspendFunctionComponent(name54, anyTypeArr56, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$139(null)));
                                AsyncFunctionBuilder AsyncFunction55 = classComponentBuilder2.AsyncFunction("updateExtraName");
                                String name55 = AsyncFunction55.getName();
                                TypeConverterProvider converters56 = AsyncFunction55.getConverters();
                                AnyType[] anyTypeArr57 = new AnyType[2];
                                anyType85 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType85 == null) {
                                }
                                anyTypeArr57[0] = anyType85;
                                anyType86 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.Existing.class), false));
                                if (anyType86 == null) {
                                }
                                anyTypeArr57[1] = anyType86;
                                AsyncFunction55.setAsyncFunctionComponent(new SuspendFunctionComponent(name55, anyTypeArr57, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$142(null)));
                                AsyncFunctionBuilder AsyncFunction56 = classComponentBuilder2.AsyncFunction("deleteExtraName");
                                String name56 = AsyncFunction56.getName();
                                TypeConverterProvider converters57 = AsyncFunction56.getConverters();
                                AnyType[] anyTypeArr58 = new AnyType[2];
                                anyType87 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType87 == null) {
                                }
                                anyTypeArr58[0] = anyType87;
                                anyType88 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.Existing.class), false));
                                if (anyType88 == null) {
                                }
                                anyTypeArr58[1] = anyType88;
                                AsyncFunction56.setAsyncFunctionComponent(new SuspendFunctionComponent(name56, anyTypeArr58, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$145(null)));
                                AsyncFunctionBuilder AsyncFunction57 = classComponentBuilder2.AsyncFunction("getRelations");
                                String name57 = AsyncFunction57.getName();
                                TypeConverterProvider converters58 = AsyncFunction57.getConverters();
                                AnyType[] anyTypeArr59 = new AnyType[1];
                                anyType89 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType89 == null) {
                                }
                                anyTypeArr59[0] = anyType89;
                                AsyncFunction57.setAsyncFunctionComponent(new SuspendFunctionComponent(name57, anyTypeArr59, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$147(null)));
                                AsyncFunctionBuilder AsyncFunction58 = classComponentBuilder2.AsyncFunction("addRelation");
                                String name58 = AsyncFunction58.getName();
                                TypeConverterProvider converters59 = AsyncFunction58.getConverters();
                                AnyType[] anyTypeArr60 = new AnyType[2];
                                anyType90 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType90 == null) {
                                }
                                anyTypeArr60[0] = anyType90;
                                anyType91 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.New.class), false));
                                if (anyType91 == null) {
                                }
                                anyTypeArr60[1] = anyType91;
                                AsyncFunction58.setAsyncFunctionComponent(new SuspendFunctionComponent(name58, anyTypeArr60, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$150(null)));
                                AsyncFunctionBuilder AsyncFunction59 = classComponentBuilder2.AsyncFunction("updateRelation");
                                String name59 = AsyncFunction59.getName();
                                TypeConverterProvider converters60 = AsyncFunction59.getConverters();
                                AnyType[] anyTypeArr61 = new AnyType[2];
                                anyType92 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType92 == null) {
                                }
                                anyTypeArr61[0] = anyType92;
                                anyType93 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.Existing.class), false));
                                if (anyType93 == null) {
                                }
                                anyTypeArr61[1] = anyType93;
                                AsyncFunction59.setAsyncFunctionComponent(new SuspendFunctionComponent(name59, anyTypeArr61, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$153(null)));
                                AsyncFunctionBuilder AsyncFunction60 = classComponentBuilder2.AsyncFunction("deleteRelation");
                                String name60 = AsyncFunction60.getName();
                                TypeConverterProvider converters61 = AsyncFunction60.getConverters();
                                AnyType[] anyTypeArr62 = new AnyType[2];
                                anyType94 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType94 == null) {
                                }
                                anyTypeArr62[0] = anyType94;
                                anyType95 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.Existing.class), false));
                                if (anyType95 == null) {
                                }
                                anyTypeArr62[1] = anyType95;
                                AsyncFunction60.setAsyncFunctionComponent(new SuspendFunctionComponent(name60, anyTypeArr62, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$156(null)));
                                AsyncFunctionBuilder AsyncFunction61 = classComponentBuilder2.AsyncFunction("getUrlAddresses");
                                String name61 = AsyncFunction61.getName();
                                TypeConverterProvider converters62 = AsyncFunction61.getConverters();
                                AnyType[] anyTypeArr63 = new AnyType[1];
                                anyType96 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType96 == null) {
                                }
                                anyTypeArr63[0] = anyType96;
                                AsyncFunction61.setAsyncFunctionComponent(new SuspendFunctionComponent(name61, anyTypeArr63, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$158(null)));
                                AsyncFunctionBuilder AsyncFunction62 = classComponentBuilder2.AsyncFunction("addUrlAddress");
                                String name62 = AsyncFunction62.getName();
                                TypeConverterProvider converters63 = AsyncFunction62.getConverters();
                                AnyType[] anyTypeArr64 = new AnyType[2];
                                anyType97 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType97 == null) {
                                }
                                anyTypeArr64[0] = anyType97;
                                anyType98 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.New.class), false));
                                if (anyType98 == null) {
                                }
                                anyTypeArr64[1] = anyType98;
                                AsyncFunction62.setAsyncFunctionComponent(new SuspendFunctionComponent(name62, anyTypeArr64, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$161(null)));
                                AsyncFunctionBuilder AsyncFunction63 = classComponentBuilder2.AsyncFunction("updateUrlAddress");
                                String name63 = AsyncFunction63.getName();
                                TypeConverterProvider converters64 = AsyncFunction63.getConverters();
                                AnyType[] anyTypeArr65 = new AnyType[2];
                                anyType99 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType99 == null) {
                                }
                                anyTypeArr65[0] = anyType99;
                                anyType100 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.Existing.class), false));
                                if (anyType100 == null) {
                                }
                                anyTypeArr65[1] = anyType100;
                                AsyncFunction63.setAsyncFunctionComponent(new SuspendFunctionComponent(name63, anyTypeArr65, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$164(null)));
                                AsyncFunctionBuilder AsyncFunction64 = classComponentBuilder2.AsyncFunction("deleteUrlAddress");
                                String name64 = AsyncFunction64.getName();
                                TypeConverterProvider converters65 = AsyncFunction64.getConverters();
                                AnyType[] anyTypeArr66 = new AnyType[2];
                                anyType101 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType101 == null) {
                                }
                                anyTypeArr66[0] = anyType101;
                                anyType102 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.Existing.class), false));
                                if (anyType102 == null) {
                                }
                                anyTypeArr66[1] = anyType102;
                                AsyncFunction64.setAsyncFunctionComponent(new SuspendFunctionComponent(name64, anyTypeArr66, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$167(null)));
                                AsyncFunctionBuilder AsyncFunction65 = classComponentBuilder2.AsyncFunction("editWithForm");
                                String name65 = AsyncFunction65.getName();
                                TypeConverterProvider converters66 = AsyncFunction65.getConverters();
                                AnyType[] anyTypeArr67 = new AnyType[1];
                                anyType103 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                                if (anyType103 == null) {
                                }
                                anyTypeArr67[0] = anyType103;
                                AsyncFunction65.setAsyncFunctionComponent(new SuspendFunctionComponent(name65, anyTypeArr67, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169(null)));
                                AsyncFunctionBuilder StaticAsyncFunction = classComponentBuilder2.StaticAsyncFunction("create");
                                String name66 = StaticAsyncFunction.getName();
                                TypeConverterProvider converters67 = StaticAsyncFunction.getConverters();
                                AnyType[] anyTypeArr68 = new AnyType[1];
                                anyType104 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CreateContactRecord.class), false));
                                if (anyType104 == null) {
                                }
                                anyTypeArr68[0] = anyType104;
                                StaticAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name66, anyTypeArr68, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171(null, this)));
                                AsyncFunctionBuilder StaticAsyncFunction2 = classComponentBuilder2.StaticAsyncFunction("presentCreateForm");
                                String name67 = StaticAsyncFunction2.getName();
                                TypeConverterProvider converters68 = StaticAsyncFunction2.getConverters();
                                AnyType[] anyTypeArr69 = new AnyType[1];
                                anyType105 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CreateContactRecord.class), true));
                                if (anyType105 == null) {
                                }
                                anyTypeArr69[0] = anyType105;
                                StaticAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name67, anyTypeArr69, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173(null, this)));
                                AsyncFunctionBuilder StaticAsyncFunction3 = classComponentBuilder2.StaticAsyncFunction("presentPicker");
                                SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(StaticAsyncFunction3.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$174(null, this));
                                StaticAsyncFunction3.setAsyncFunctionComponent(suspendFunctionComponent);
                                SuspendFunctionComponent suspendFunctionComponent2 = suspendFunctionComponent;
                                AsyncFunctionBuilder StaticAsyncFunction4 = classComponentBuilder2.StaticAsyncFunction("getAll");
                                String name68 = StaticAsyncFunction4.getName();
                                TypeConverterProvider converters69 = StaticAsyncFunction4.getConverters();
                                AnyType[] anyTypeArr70 = new AnyType[1];
                                anyType106 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ContactQueryOptions.class), true));
                                if (anyType106 == null) {
                                }
                                anyTypeArr70[0] = anyType106;
                                StaticAsyncFunction4.setAsyncFunctionComponent(new SuspendFunctionComponent(name68, anyTypeArr70, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$176(null, this)));
                                AsyncFunctionBuilder StaticAsyncFunction5 = classComponentBuilder2.StaticAsyncFunction("getAllDetails");
                                String name69 = StaticAsyncFunction5.getName();
                                TypeConverterProvider converters70 = StaticAsyncFunction5.getConverters();
                                AnyType[] anyTypeArr71 = new AnyType[2];
                                anyType107 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Set.class), false));
                                if (anyType107 == null) {
                                }
                                anyTypeArr71[0] = anyType107;
                                anyType108 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ContactQueryOptions.class), true));
                                if (anyType108 == null) {
                                }
                                anyTypeArr71[1] = anyType108;
                                StaticAsyncFunction5.setAsyncFunctionComponent(new SuspendFunctionComponent(name69, anyTypeArr71, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179(null, this)));
                                ClassComponentBuilder classComponentBuilder3 = classComponentBuilder;
                                AsyncFunctionBuilder StaticAsyncFunction6 = classComponentBuilder3.StaticAsyncFunction("getCount");
                                SuspendFunctionComponent suspendFunctionComponent3 = new SuspendFunctionComponent(StaticAsyncFunction6.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180(null, this));
                                StaticAsyncFunction6.setAsyncFunctionComponent(suspendFunctionComponent3);
                                SuspendFunctionComponent suspendFunctionComponent4 = suspendFunctionComponent3;
                                AsyncFunctionBuilder StaticAsyncFunction7 = classComponentBuilder3.StaticAsyncFunction("hasAny");
                                SuspendFunctionComponent suspendFunctionComponent5 = new SuspendFunctionComponent(StaticAsyncFunction7.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$181(null, this));
                                StaticAsyncFunction7.setAsyncFunctionComponent(suspendFunctionComponent5);
                                SuspendFunctionComponent suspendFunctionComponent6 = suspendFunctionComponent5;
                                if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                                }
                                classComponentBuilder3.getStaticAsyncFunctions().put("requestPermissionsAsync", intAsyncFunctionComponent);
                                if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                                }
                                classComponentBuilder3.getStaticAsyncFunctions().put("getPermissions", intAsyncFunctionComponent2);
                                moduleDefinitionBuilder2.getClassData().add(classComponentBuilder3.buildClass());
                                ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder3;
                                moduleDefinitionBuilder4.Events("onContactsChange");
                                moduleDefinitionBuilder4.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$$inlined$OnDestroy$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        ContactsObserverDelegate observerDelegate;
                                        observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                        observerDelegate.stopObservingContactChanges();
                                    }
                                }));
                                moduleDefinitionBuilder4.OnStartObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$3
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        ContactsObserverDelegate observerDelegate;
                                        observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                        observerDelegate.startObservingContactChanges();
                                    }
                                });
                                moduleDefinitionBuilder4.OnStopObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$4
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        ContactsObserverDelegate observerDelegate;
                                        observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                        observerDelegate.stopObservingContactChanges();
                                    }
                                });
                                moduleDefinitionBuilder4.RegisterActivityContracts(new ContactsNextModule$definition$1$5(this, null));
                                ModuleDefinitionData buildModule = moduleDefinitionBuilder4.buildModule();
                                Trace.endSection();
                                return buildModule;
                            } catch (Throwable th6) {
                                th = th6;
                                Trace.endSection();
                                throw th;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        str = "kotlin.String";
                        Result.Companion companion82 = Result.INSTANCE;
                        m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                        if (m13473exceptionOrNullimpl != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                        }
                        typeDescriptor = (TypeDescriptor) m13470constructorimpl4;
                        if (typeDescriptor == null) {
                        }
                        anyType112 = new AnyType(typeDescriptor, converters2);
                        anyTypeArr3[1] = anyType112;
                        AsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, anyTypeArr3, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3(null)));
                        AsyncFunctionBuilder AsyncFunction210 = classComponentBuilder2.AsyncFunction("delete");
                        String name210 = AsyncFunction210.getName();
                        TypeConverterProvider converters310 = AsyncFunction210.getConverters();
                        AnyType[] anyTypeArr410 = new AnyType[1];
                        anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType2 == null) {
                        }
                        anyTypeArr410[0] = anyType2;
                        AsyncFunction210.setAsyncFunctionComponent(new SuspendFunctionComponent(name210, anyTypeArr410, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$5(null)));
                        AsyncFunctionBuilder AsyncFunction310 = classComponentBuilder2.AsyncFunction("patch");
                        String name310 = AsyncFunction310.getName();
                        TypeConverterProvider converters410 = AsyncFunction310.getConverters();
                        AnyType[] anyTypeArr510 = new AnyType[2];
                        anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType3 == null) {
                        }
                        anyTypeArr510[0] = anyType3;
                        anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PatchContactRecord.class), false));
                        if (anyType4 == null) {
                        }
                        anyTypeArr510[1] = anyType4;
                        AsyncFunction310.setAsyncFunctionComponent(new SuspendFunctionComponent(name310, anyTypeArr510, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$8(null)));
                        AsyncFunctionBuilder AsyncFunction410 = classComponentBuilder2.AsyncFunction("update");
                        String name410 = AsyncFunction410.getName();
                        TypeConverterProvider converters510 = AsyncFunction410.getConverters();
                        AnyType[] anyTypeArr610 = new AnyType[2];
                        anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType5 == null) {
                        }
                        anyTypeArr610[0] = anyType5;
                        anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CreateContactRecord.class), false));
                        if (anyType6 == null) {
                        }
                        anyTypeArr610[1] = anyType6;
                        AsyncFunction410.setAsyncFunctionComponent(new SuspendFunctionComponent(name410, anyTypeArr610, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$11(null)));
                        AsyncFunctionBuilder AsyncFunction510 = classComponentBuilder2.AsyncFunction("getFullName");
                        String name510 = AsyncFunction510.getName();
                        TypeConverterProvider converters610 = AsyncFunction510.getConverters();
                        AnyType[] anyTypeArr72 = new AnyType[1];
                        anyType7 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType7 == null) {
                        }
                        anyTypeArr72[0] = anyType7;
                        AsyncFunction510.setAsyncFunctionComponent(new SuspendFunctionComponent(name510, anyTypeArr72, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$13(null)));
                        AsyncFunctionBuilder AsyncFunction66 = classComponentBuilder2.AsyncFunction("getGivenName");
                        String name610 = AsyncFunction66.getName();
                        TypeConverterProvider converters72 = AsyncFunction66.getConverters();
                        AnyType[] anyTypeArr82 = new AnyType[1];
                        anyType8 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType8 == null) {
                        }
                        anyTypeArr82[0] = anyType8;
                        AsyncFunction66.setAsyncFunctionComponent(new SuspendFunctionComponent(name610, anyTypeArr82, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$15(null)));
                        AsyncFunctionBuilder AsyncFunction72 = classComponentBuilder2.AsyncFunction("setGivenName");
                        String name72 = AsyncFunction72.getName();
                        TypeConverterProvider converters82 = AsyncFunction72.getConverters();
                        AnyType[] anyTypeArr92 = new AnyType[2];
                        anyType9 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType9 == null) {
                        }
                        anyTypeArr92[0] = anyType9;
                        anyType10 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType10 != null) {
                        }
                        anyTypeArr92[1] = anyType10;
                        AsyncFunction72.setAsyncFunctionComponent(new SuspendFunctionComponent(name72, anyTypeArr92, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$18(null)));
                        AsyncFunctionBuilder AsyncFunction82 = classComponentBuilder2.AsyncFunction("getFamilyName");
                        String name82 = AsyncFunction82.getName();
                        TypeConverterProvider converters92 = AsyncFunction82.getConverters();
                        AnyType[] anyTypeArr102 = new AnyType[1];
                        anyType11 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType11 == null) {
                        }
                        anyTypeArr102[0] = anyType11;
                        AsyncFunction82.setAsyncFunctionComponent(new SuspendFunctionComponent(name82, anyTypeArr102, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$20(null)));
                        AsyncFunctionBuilder AsyncFunction92 = classComponentBuilder2.AsyncFunction("setFamilyName");
                        String name92 = AsyncFunction92.getName();
                        TypeConverterProvider converters102 = AsyncFunction92.getConverters();
                        AnyType[] anyTypeArr112 = new AnyType[2];
                        anyType12 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType12 == null) {
                        }
                        anyTypeArr112[0] = anyType12;
                        anyType13 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType13 == null) {
                        }
                        anyTypeArr112[1] = anyType13;
                        AsyncFunction92.setAsyncFunctionComponent(new SuspendFunctionComponent(name92, anyTypeArr112, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$23(null)));
                        AsyncFunctionBuilder AsyncFunction102 = classComponentBuilder2.AsyncFunction("getMiddleName");
                        String name102 = AsyncFunction102.getName();
                        TypeConverterProvider converters112 = AsyncFunction102.getConverters();
                        AnyType[] anyTypeArr122 = new AnyType[1];
                        anyType14 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType14 == null) {
                        }
                        anyTypeArr122[0] = anyType14;
                        AsyncFunction102.setAsyncFunctionComponent(new SuspendFunctionComponent(name102, anyTypeArr122, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$25(null)));
                        AsyncFunctionBuilder AsyncFunction112 = classComponentBuilder2.AsyncFunction("setMiddleName");
                        String name112 = AsyncFunction112.getName();
                        TypeConverterProvider converters122 = AsyncFunction112.getConverters();
                        AnyType[] anyTypeArr132 = new AnyType[2];
                        anyType15 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType15 == null) {
                        }
                        anyTypeArr132[0] = anyType15;
                        anyType16 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType16 == null) {
                        }
                        anyTypeArr132[1] = anyType16;
                        AsyncFunction112.setAsyncFunctionComponent(new SuspendFunctionComponent(name112, anyTypeArr132, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$28(null)));
                        AsyncFunctionBuilder AsyncFunction122 = classComponentBuilder2.AsyncFunction("getPrefix");
                        String name122 = AsyncFunction122.getName();
                        TypeConverterProvider converters132 = AsyncFunction122.getConverters();
                        AnyType[] anyTypeArr142 = new AnyType[1];
                        anyType17 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType17 == null) {
                        }
                        anyTypeArr142[0] = anyType17;
                        AsyncFunction122.setAsyncFunctionComponent(new SuspendFunctionComponent(name122, anyTypeArr142, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$30(null)));
                        AsyncFunctionBuilder AsyncFunction132 = classComponentBuilder2.AsyncFunction("setPrefix");
                        String name132 = AsyncFunction132.getName();
                        TypeConverterProvider converters142 = AsyncFunction132.getConverters();
                        AnyType[] anyTypeArr152 = new AnyType[2];
                        anyType18 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType18 == null) {
                        }
                        anyTypeArr152[0] = anyType18;
                        anyType19 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType19 == null) {
                        }
                        anyTypeArr152[1] = anyType19;
                        AsyncFunction132.setAsyncFunctionComponent(new SuspendFunctionComponent(name132, anyTypeArr152, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$33(null)));
                        AsyncFunctionBuilder AsyncFunction142 = classComponentBuilder2.AsyncFunction("getSuffix");
                        String name142 = AsyncFunction142.getName();
                        TypeConverterProvider converters152 = AsyncFunction142.getConverters();
                        AnyType[] anyTypeArr162 = new AnyType[1];
                        anyType20 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType20 == null) {
                        }
                        anyTypeArr162[0] = anyType20;
                        AsyncFunction142.setAsyncFunctionComponent(new SuspendFunctionComponent(name142, anyTypeArr162, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$35(null)));
                        AsyncFunctionBuilder AsyncFunction152 = classComponentBuilder2.AsyncFunction("setSuffix");
                        String name152 = AsyncFunction152.getName();
                        TypeConverterProvider converters162 = AsyncFunction152.getConverters();
                        AnyType[] anyTypeArr172 = new AnyType[2];
                        anyType21 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType21 == null) {
                        }
                        anyTypeArr172[0] = anyType21;
                        anyType22 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType22 == null) {
                        }
                        anyTypeArr172[1] = anyType22;
                        AsyncFunction152.setAsyncFunctionComponent(new SuspendFunctionComponent(name152, anyTypeArr172, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$38(null)));
                        AsyncFunctionBuilder AsyncFunction162 = classComponentBuilder2.AsyncFunction("getPhoneticGivenName");
                        String name162 = AsyncFunction162.getName();
                        TypeConverterProvider converters172 = AsyncFunction162.getConverters();
                        AnyType[] anyTypeArr182 = new AnyType[1];
                        anyType23 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType23 == null) {
                        }
                        anyTypeArr182[0] = anyType23;
                        AsyncFunction162.setAsyncFunctionComponent(new SuspendFunctionComponent(name162, anyTypeArr182, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$40(null)));
                        AsyncFunctionBuilder AsyncFunction172 = classComponentBuilder2.AsyncFunction("setPhoneticGivenName");
                        String name172 = AsyncFunction172.getName();
                        TypeConverterProvider converters182 = AsyncFunction172.getConverters();
                        AnyType[] anyTypeArr192 = new AnyType[2];
                        anyType24 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType24 == null) {
                        }
                        anyTypeArr192[0] = anyType24;
                        anyType25 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType25 == null) {
                        }
                        anyTypeArr192[1] = anyType25;
                        AsyncFunction172.setAsyncFunctionComponent(new SuspendFunctionComponent(name172, anyTypeArr192, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$43(null)));
                        AsyncFunctionBuilder AsyncFunction182 = classComponentBuilder2.AsyncFunction("getPhoneticMiddleName");
                        String name182 = AsyncFunction182.getName();
                        TypeConverterProvider converters192 = AsyncFunction182.getConverters();
                        AnyType[] anyTypeArr202 = new AnyType[1];
                        anyType26 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType26 == null) {
                        }
                        anyTypeArr202[0] = anyType26;
                        AsyncFunction182.setAsyncFunctionComponent(new SuspendFunctionComponent(name182, anyTypeArr202, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$45(null)));
                        AsyncFunctionBuilder AsyncFunction192 = classComponentBuilder2.AsyncFunction("setPhoneticMiddleName");
                        String name192 = AsyncFunction192.getName();
                        TypeConverterProvider converters202 = AsyncFunction192.getConverters();
                        AnyType[] anyTypeArr212 = new AnyType[2];
                        anyType27 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType27 == null) {
                        }
                        anyTypeArr212[0] = anyType27;
                        anyType28 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType28 == null) {
                        }
                        anyTypeArr212[1] = anyType28;
                        AsyncFunction192.setAsyncFunctionComponent(new SuspendFunctionComponent(name192, anyTypeArr212, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$48(null)));
                        AsyncFunctionBuilder AsyncFunction202 = classComponentBuilder2.AsyncFunction("getPhoneticFamilyName");
                        String name202 = AsyncFunction202.getName();
                        TypeConverterProvider converters212 = AsyncFunction202.getConverters();
                        AnyType[] anyTypeArr222 = new AnyType[1];
                        anyType29 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType29 == null) {
                        }
                        anyTypeArr222[0] = anyType29;
                        AsyncFunction202.setAsyncFunctionComponent(new SuspendFunctionComponent(name202, anyTypeArr222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$50(null)));
                        AsyncFunctionBuilder AsyncFunction212 = classComponentBuilder2.AsyncFunction("setPhoneticFamilyName");
                        String name212 = AsyncFunction212.getName();
                        TypeConverterProvider converters222 = AsyncFunction212.getConverters();
                        AnyType[] anyTypeArr232 = new AnyType[2];
                        anyType30 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType30 == null) {
                        }
                        anyTypeArr232[0] = anyType30;
                        anyType31 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType31 == null) {
                        }
                        anyTypeArr232[1] = anyType31;
                        AsyncFunction212.setAsyncFunctionComponent(new SuspendFunctionComponent(name212, anyTypeArr232, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$53(null)));
                        AsyncFunctionBuilder AsyncFunction222 = classComponentBuilder2.AsyncFunction("getCompany");
                        String name222 = AsyncFunction222.getName();
                        TypeConverterProvider converters232 = AsyncFunction222.getConverters();
                        AnyType[] anyTypeArr242 = new AnyType[1];
                        anyType32 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType32 == null) {
                        }
                        anyTypeArr242[0] = anyType32;
                        AsyncFunction222.setAsyncFunctionComponent(new SuspendFunctionComponent(name222, anyTypeArr242, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$55(null)));
                        AsyncFunctionBuilder AsyncFunction232 = classComponentBuilder2.AsyncFunction("setCompany");
                        String name232 = AsyncFunction232.getName();
                        TypeConverterProvider converters242 = AsyncFunction232.getConverters();
                        AnyType[] anyTypeArr252 = new AnyType[2];
                        anyType33 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType33 == null) {
                        }
                        anyTypeArr252[0] = anyType33;
                        anyType34 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType34 == null) {
                        }
                        anyTypeArr252[1] = anyType34;
                        AsyncFunction232.setAsyncFunctionComponent(new SuspendFunctionComponent(name232, anyTypeArr252, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$58(null)));
                        AsyncFunctionBuilder AsyncFunction242 = classComponentBuilder2.AsyncFunction("getDepartment");
                        String name242 = AsyncFunction242.getName();
                        TypeConverterProvider converters252 = AsyncFunction242.getConverters();
                        AnyType[] anyTypeArr262 = new AnyType[1];
                        anyType35 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType35 == null) {
                        }
                        anyTypeArr262[0] = anyType35;
                        AsyncFunction242.setAsyncFunctionComponent(new SuspendFunctionComponent(name242, anyTypeArr262, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$60(null)));
                        AsyncFunctionBuilder AsyncFunction252 = classComponentBuilder2.AsyncFunction("setDepartment");
                        String name252 = AsyncFunction252.getName();
                        TypeConverterProvider converters262 = AsyncFunction252.getConverters();
                        AnyType[] anyTypeArr272 = new AnyType[2];
                        anyType36 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType36 == null) {
                        }
                        anyTypeArr272[0] = anyType36;
                        anyType37 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType37 == null) {
                        }
                        anyTypeArr272[1] = anyType37;
                        AsyncFunction252.setAsyncFunctionComponent(new SuspendFunctionComponent(name252, anyTypeArr272, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$63(null)));
                        AsyncFunctionBuilder AsyncFunction262 = classComponentBuilder2.AsyncFunction("getJobTitle");
                        String name262 = AsyncFunction262.getName();
                        TypeConverterProvider converters272 = AsyncFunction262.getConverters();
                        AnyType[] anyTypeArr282 = new AnyType[1];
                        anyType38 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType38 == null) {
                        }
                        anyTypeArr282[0] = anyType38;
                        AsyncFunction262.setAsyncFunctionComponent(new SuspendFunctionComponent(name262, anyTypeArr282, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$65(null)));
                        AsyncFunctionBuilder AsyncFunction272 = classComponentBuilder2.AsyncFunction("setJobTitle");
                        String name272 = AsyncFunction272.getName();
                        TypeConverterProvider converters282 = AsyncFunction272.getConverters();
                        AnyType[] anyTypeArr292 = new AnyType[2];
                        anyType39 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType39 == null) {
                        }
                        anyTypeArr292[0] = anyType39;
                        anyType40 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType40 == null) {
                        }
                        anyTypeArr292[1] = anyType40;
                        AsyncFunction272.setAsyncFunctionComponent(new SuspendFunctionComponent(name272, anyTypeArr292, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$68(null)));
                        AsyncFunctionBuilder AsyncFunction282 = classComponentBuilder2.AsyncFunction("getPhoneticCompanyName");
                        String name282 = AsyncFunction282.getName();
                        TypeConverterProvider converters292 = AsyncFunction282.getConverters();
                        AnyType[] anyTypeArr302 = new AnyType[1];
                        anyType41 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType41 == null) {
                        }
                        anyTypeArr302[0] = anyType41;
                        AsyncFunction282.setAsyncFunctionComponent(new SuspendFunctionComponent(name282, anyTypeArr302, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$70(null)));
                        AsyncFunctionBuilder AsyncFunction292 = classComponentBuilder2.AsyncFunction("setPhoneticCompanyName");
                        String name292 = AsyncFunction292.getName();
                        TypeConverterProvider converters302 = AsyncFunction292.getConverters();
                        AnyType[] anyTypeArr312 = new AnyType[2];
                        anyType42 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType42 == null) {
                        }
                        anyTypeArr312[0] = anyType42;
                        anyType43 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType43 == null) {
                        }
                        anyTypeArr312[1] = anyType43;
                        AsyncFunction292.setAsyncFunctionComponent(new SuspendFunctionComponent(name292, anyTypeArr312, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$73(null)));
                        AsyncFunctionBuilder AsyncFunction302 = classComponentBuilder2.AsyncFunction("getNote");
                        String name302 = AsyncFunction302.getName();
                        TypeConverterProvider converters312 = AsyncFunction302.getConverters();
                        AnyType[] anyTypeArr322 = new AnyType[1];
                        anyType44 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType44 == null) {
                        }
                        anyTypeArr322[0] = anyType44;
                        AsyncFunction302.setAsyncFunctionComponent(new SuspendFunctionComponent(name302, anyTypeArr322, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$75(null)));
                        AsyncFunctionBuilder AsyncFunction312 = classComponentBuilder2.AsyncFunction("setNote");
                        String name312 = AsyncFunction312.getName();
                        TypeConverterProvider converters322 = AsyncFunction312.getConverters();
                        AnyType[] anyTypeArr332 = new AnyType[2];
                        anyType45 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType45 == null) {
                        }
                        anyTypeArr332[0] = anyType45;
                        anyType46 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType46 == null) {
                        }
                        anyTypeArr332[1] = anyType46;
                        AsyncFunction312.setAsyncFunctionComponent(new SuspendFunctionComponent(name312, anyTypeArr332, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$78(null)));
                        AsyncFunctionBuilder AsyncFunction322 = classComponentBuilder2.AsyncFunction("getImage");
                        String name322 = AsyncFunction322.getName();
                        TypeConverterProvider converters332 = AsyncFunction322.getConverters();
                        AnyType[] anyTypeArr342 = new AnyType[1];
                        anyType47 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType47 == null) {
                        }
                        anyTypeArr342[0] = anyType47;
                        AsyncFunction322.setAsyncFunctionComponent(new SuspendFunctionComponent(name322, anyTypeArr342, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$80(null)));
                        AsyncFunctionBuilder AsyncFunction332 = classComponentBuilder2.AsyncFunction("setImage");
                        String name332 = AsyncFunction332.getName();
                        TypeConverterProvider converters342 = AsyncFunction332.getConverters();
                        AnyType[] anyTypeArr352 = new AnyType[2];
                        anyType48 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType48 == null) {
                        }
                        anyTypeArr352[0] = anyType48;
                        anyType49 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType49 == null) {
                        }
                        anyTypeArr352[1] = anyType49;
                        AsyncFunction332.setAsyncFunctionComponent(new SuspendFunctionComponent(name332, anyTypeArr352, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$83(null)));
                        AsyncFunctionBuilder AsyncFunction342 = classComponentBuilder2.AsyncFunction("getThumbnail");
                        String name342 = AsyncFunction342.getName();
                        TypeConverterProvider converters352 = AsyncFunction342.getConverters();
                        AnyType[] anyTypeArr362 = new AnyType[1];
                        anyType50 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType50 == null) {
                        }
                        anyTypeArr362[0] = anyType50;
                        AsyncFunction342.setAsyncFunctionComponent(new SuspendFunctionComponent(name342, anyTypeArr362, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$85(null)));
                        AsyncFunctionBuilder AsyncFunction352 = classComponentBuilder2.AsyncFunction("setIsFavourite");
                        String name352 = AsyncFunction352.getName();
                        TypeConverterProvider converters362 = AsyncFunction352.getConverters();
                        AnyType[] anyTypeArr372 = new AnyType[2];
                        anyType51 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType51 == null) {
                        }
                        anyTypeArr372[0] = anyType51;
                        anyType52 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), false));
                        if (anyType52 == null) {
                        }
                        anyTypeArr372[1] = anyType52;
                        AsyncFunction352.setAsyncFunctionComponent(new SuspendFunctionComponent(name352, anyTypeArr372, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$88(null)));
                        AsyncFunctionBuilder AsyncFunction362 = classComponentBuilder2.AsyncFunction("getIsFavourite");
                        String name362 = AsyncFunction362.getName();
                        TypeConverterProvider converters372 = AsyncFunction362.getConverters();
                        AnyType[] anyTypeArr382 = new AnyType[1];
                        anyType53 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType53 == null) {
                        }
                        anyTypeArr382[0] = anyType53;
                        AsyncFunction362.setAsyncFunctionComponent(new SuspendFunctionComponent(name362, anyTypeArr382, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$90(null)));
                        AsyncFunctionBuilder AsyncFunction372 = classComponentBuilder2.AsyncFunction("getEmails");
                        String name372 = AsyncFunction372.getName();
                        TypeConverterProvider converters382 = AsyncFunction372.getConverters();
                        AnyType[] anyTypeArr392 = new AnyType[1];
                        anyType54 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType54 == null) {
                        }
                        anyTypeArr392[0] = anyType54;
                        AsyncFunction372.setAsyncFunctionComponent(new SuspendFunctionComponent(name372, anyTypeArr392, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$92(null)));
                        AsyncFunctionBuilder AsyncFunction382 = classComponentBuilder2.AsyncFunction("addEmail");
                        String name382 = AsyncFunction382.getName();
                        TypeConverterProvider converters392 = AsyncFunction382.getConverters();
                        AnyType[] anyTypeArr402 = new AnyType[2];
                        anyType55 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType55 == null) {
                        }
                        anyTypeArr402[0] = anyType55;
                        anyType56 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.New.class), false));
                        if (anyType56 == null) {
                        }
                        anyTypeArr402[1] = anyType56;
                        AsyncFunction382.setAsyncFunctionComponent(new SuspendFunctionComponent(name382, anyTypeArr402, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$95(null)));
                        AsyncFunctionBuilder AsyncFunction392 = classComponentBuilder2.AsyncFunction("updateEmail");
                        String name392 = AsyncFunction392.getName();
                        TypeConverterProvider converters402 = AsyncFunction392.getConverters();
                        AnyType[] anyTypeArr412 = new AnyType[2];
                        anyType57 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType57 == null) {
                        }
                        anyTypeArr412[0] = anyType57;
                        anyType58 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.Existing.class), false));
                        if (anyType58 == null) {
                        }
                        anyTypeArr412[1] = anyType58;
                        AsyncFunction392.setAsyncFunctionComponent(new SuspendFunctionComponent(name392, anyTypeArr412, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$98(null)));
                        AsyncFunctionBuilder AsyncFunction402 = classComponentBuilder2.AsyncFunction("deleteEmail");
                        String name402 = AsyncFunction402.getName();
                        TypeConverterProvider converters412 = AsyncFunction402.getConverters();
                        AnyType[] anyTypeArr422 = new AnyType[2];
                        anyType59 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType59 == null) {
                        }
                        anyTypeArr422[0] = anyType59;
                        anyType60 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.Existing.class), false));
                        if (anyType60 == null) {
                        }
                        anyTypeArr422[1] = anyType60;
                        AsyncFunction402.setAsyncFunctionComponent(new SuspendFunctionComponent(name402, anyTypeArr422, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$101(null)));
                        AsyncFunctionBuilder AsyncFunction412 = classComponentBuilder2.AsyncFunction("getPhones");
                        String name412 = AsyncFunction412.getName();
                        TypeConverterProvider converters422 = AsyncFunction412.getConverters();
                        AnyType[] anyTypeArr432 = new AnyType[1];
                        anyType61 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType61 == null) {
                        }
                        anyTypeArr432[0] = anyType61;
                        AsyncFunction412.setAsyncFunctionComponent(new SuspendFunctionComponent(name412, anyTypeArr432, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$103(null)));
                        AsyncFunctionBuilder AsyncFunction422 = classComponentBuilder2.AsyncFunction("addPhone");
                        String name422 = AsyncFunction422.getName();
                        TypeConverterProvider converters432 = AsyncFunction422.getConverters();
                        AnyType[] anyTypeArr442 = new AnyType[2];
                        anyType62 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType62 == null) {
                        }
                        anyTypeArr442[0] = anyType62;
                        anyType63 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.New.class), false));
                        if (anyType63 == null) {
                        }
                        anyTypeArr442[1] = anyType63;
                        AsyncFunction422.setAsyncFunctionComponent(new SuspendFunctionComponent(name422, anyTypeArr442, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$106(null)));
                        AsyncFunctionBuilder AsyncFunction432 = classComponentBuilder2.AsyncFunction("updatePhone");
                        String name432 = AsyncFunction432.getName();
                        TypeConverterProvider converters442 = AsyncFunction432.getConverters();
                        AnyType[] anyTypeArr452 = new AnyType[2];
                        anyType64 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType64 == null) {
                        }
                        anyTypeArr452[0] = anyType64;
                        anyType65 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.Existing.class), false));
                        if (anyType65 == null) {
                        }
                        anyTypeArr452[1] = anyType65;
                        AsyncFunction432.setAsyncFunctionComponent(new SuspendFunctionComponent(name432, anyTypeArr452, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$109(null)));
                        AsyncFunctionBuilder AsyncFunction442 = classComponentBuilder2.AsyncFunction("deletePhone");
                        String name442 = AsyncFunction442.getName();
                        TypeConverterProvider converters452 = AsyncFunction442.getConverters();
                        AnyType[] anyTypeArr462 = new AnyType[2];
                        anyType66 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType66 == null) {
                        }
                        anyTypeArr462[0] = anyType66;
                        anyType67 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.Existing.class), false));
                        if (anyType67 == null) {
                        }
                        anyTypeArr462[1] = anyType67;
                        AsyncFunction442.setAsyncFunctionComponent(new SuspendFunctionComponent(name442, anyTypeArr462, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$112(null)));
                        AsyncFunctionBuilder AsyncFunction452 = classComponentBuilder2.AsyncFunction("getAddresses");
                        String name452 = AsyncFunction452.getName();
                        TypeConverterProvider converters462 = AsyncFunction452.getConverters();
                        AnyType[] anyTypeArr472 = new AnyType[1];
                        anyType68 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType68 == null) {
                        }
                        anyTypeArr472[0] = anyType68;
                        AsyncFunction452.setAsyncFunctionComponent(new SuspendFunctionComponent(name452, anyTypeArr472, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$114(null)));
                        AsyncFunctionBuilder AsyncFunction462 = classComponentBuilder2.AsyncFunction("addAddress");
                        String name462 = AsyncFunction462.getName();
                        TypeConverterProvider converters472 = AsyncFunction462.getConverters();
                        AnyType[] anyTypeArr482 = new AnyType[2];
                        anyType69 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType69 == null) {
                        }
                        anyTypeArr482[0] = anyType69;
                        anyType70 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.New.class), false));
                        if (anyType70 == null) {
                        }
                        anyTypeArr482[1] = anyType70;
                        AsyncFunction462.setAsyncFunctionComponent(new SuspendFunctionComponent(name462, anyTypeArr482, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$117(null)));
                        AsyncFunctionBuilder AsyncFunction472 = classComponentBuilder2.AsyncFunction("updateAddress");
                        String name472 = AsyncFunction472.getName();
                        TypeConverterProvider converters482 = AsyncFunction472.getConverters();
                        AnyType[] anyTypeArr492 = new AnyType[2];
                        anyType71 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType71 == null) {
                        }
                        anyTypeArr492[0] = anyType71;
                        anyType72 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.Existing.class), false));
                        if (anyType72 == null) {
                        }
                        anyTypeArr492[1] = anyType72;
                        AsyncFunction472.setAsyncFunctionComponent(new SuspendFunctionComponent(name472, anyTypeArr492, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$120(null)));
                        AsyncFunctionBuilder AsyncFunction482 = classComponentBuilder2.AsyncFunction("deleteAddress");
                        String name482 = AsyncFunction482.getName();
                        TypeConverterProvider converters492 = AsyncFunction482.getConverters();
                        AnyType[] anyTypeArr502 = new AnyType[2];
                        anyType73 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType73 == null) {
                        }
                        anyTypeArr502[0] = anyType73;
                        anyType74 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.Existing.class), false));
                        if (anyType74 == null) {
                        }
                        anyTypeArr502[1] = anyType74;
                        AsyncFunction482.setAsyncFunctionComponent(new SuspendFunctionComponent(name482, anyTypeArr502, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$123(null)));
                        AsyncFunctionBuilder AsyncFunction492 = classComponentBuilder2.AsyncFunction("getDates");
                        String name492 = AsyncFunction492.getName();
                        TypeConverterProvider converters502 = AsyncFunction492.getConverters();
                        AnyType[] anyTypeArr512 = new AnyType[1];
                        anyType75 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType75 == null) {
                        }
                        anyTypeArr512[0] = anyType75;
                        AsyncFunction492.setAsyncFunctionComponent(new SuspendFunctionComponent(name492, anyTypeArr512, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$125(null)));
                        AsyncFunctionBuilder AsyncFunction502 = classComponentBuilder2.AsyncFunction("addDate");
                        String name502 = AsyncFunction502.getName();
                        TypeConverterProvider converters512 = AsyncFunction502.getConverters();
                        AnyType[] anyTypeArr522 = new AnyType[2];
                        anyType76 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType76 == null) {
                        }
                        anyTypeArr522[0] = anyType76;
                        anyType77 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.New.class), false));
                        if (anyType77 == null) {
                        }
                        anyTypeArr522[1] = anyType77;
                        AsyncFunction502.setAsyncFunctionComponent(new SuspendFunctionComponent(name502, anyTypeArr522, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$128(null)));
                        AsyncFunctionBuilder AsyncFunction512 = classComponentBuilder2.AsyncFunction("updateDate");
                        String name512 = AsyncFunction512.getName();
                        TypeConverterProvider converters522 = AsyncFunction512.getConverters();
                        AnyType[] anyTypeArr532 = new AnyType[2];
                        anyType78 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType78 == null) {
                        }
                        anyTypeArr532[0] = anyType78;
                        anyType79 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.Existing.class), false));
                        if (anyType79 == null) {
                        }
                        anyTypeArr532[1] = anyType79;
                        AsyncFunction512.setAsyncFunctionComponent(new SuspendFunctionComponent(name512, anyTypeArr532, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$131(null)));
                        AsyncFunctionBuilder AsyncFunction522 = classComponentBuilder2.AsyncFunction("deleteDate");
                        String name522 = AsyncFunction522.getName();
                        TypeConverterProvider converters532 = AsyncFunction522.getConverters();
                        AnyType[] anyTypeArr542 = new AnyType[2];
                        anyType80 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType80 == null) {
                        }
                        anyTypeArr542[0] = anyType80;
                        anyType81 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.Existing.class), false));
                        if (anyType81 == null) {
                        }
                        anyTypeArr542[1] = anyType81;
                        AsyncFunction522.setAsyncFunctionComponent(new SuspendFunctionComponent(name522, anyTypeArr542, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$134(null)));
                        AsyncFunctionBuilder AsyncFunction532 = classComponentBuilder2.AsyncFunction("getExtraNames");
                        String name532 = AsyncFunction532.getName();
                        TypeConverterProvider converters542 = AsyncFunction532.getConverters();
                        AnyType[] anyTypeArr552 = new AnyType[1];
                        anyType82 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType82 == null) {
                        }
                        anyTypeArr552[0] = anyType82;
                        AsyncFunction532.setAsyncFunctionComponent(new SuspendFunctionComponent(name532, anyTypeArr552, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$136(null)));
                        AsyncFunctionBuilder AsyncFunction542 = classComponentBuilder2.AsyncFunction("addExtraName");
                        String name542 = AsyncFunction542.getName();
                        TypeConverterProvider converters552 = AsyncFunction542.getConverters();
                        AnyType[] anyTypeArr562 = new AnyType[2];
                        anyType83 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType83 == null) {
                        }
                        anyTypeArr562[0] = anyType83;
                        anyType84 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.New.class), false));
                        if (anyType84 == null) {
                        }
                        anyTypeArr562[1] = anyType84;
                        AsyncFunction542.setAsyncFunctionComponent(new SuspendFunctionComponent(name542, anyTypeArr562, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$139(null)));
                        AsyncFunctionBuilder AsyncFunction552 = classComponentBuilder2.AsyncFunction("updateExtraName");
                        String name552 = AsyncFunction552.getName();
                        TypeConverterProvider converters562 = AsyncFunction552.getConverters();
                        AnyType[] anyTypeArr572 = new AnyType[2];
                        anyType85 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType85 == null) {
                        }
                        anyTypeArr572[0] = anyType85;
                        anyType86 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.Existing.class), false));
                        if (anyType86 == null) {
                        }
                        anyTypeArr572[1] = anyType86;
                        AsyncFunction552.setAsyncFunctionComponent(new SuspendFunctionComponent(name552, anyTypeArr572, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$142(null)));
                        AsyncFunctionBuilder AsyncFunction562 = classComponentBuilder2.AsyncFunction("deleteExtraName");
                        String name562 = AsyncFunction562.getName();
                        TypeConverterProvider converters572 = AsyncFunction562.getConverters();
                        AnyType[] anyTypeArr582 = new AnyType[2];
                        anyType87 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType87 == null) {
                        }
                        anyTypeArr582[0] = anyType87;
                        anyType88 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.Existing.class), false));
                        if (anyType88 == null) {
                        }
                        anyTypeArr582[1] = anyType88;
                        AsyncFunction562.setAsyncFunctionComponent(new SuspendFunctionComponent(name562, anyTypeArr582, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$145(null)));
                        AsyncFunctionBuilder AsyncFunction572 = classComponentBuilder2.AsyncFunction("getRelations");
                        String name572 = AsyncFunction572.getName();
                        TypeConverterProvider converters582 = AsyncFunction572.getConverters();
                        AnyType[] anyTypeArr592 = new AnyType[1];
                        anyType89 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType89 == null) {
                        }
                        anyTypeArr592[0] = anyType89;
                        AsyncFunction572.setAsyncFunctionComponent(new SuspendFunctionComponent(name572, anyTypeArr592, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$147(null)));
                        AsyncFunctionBuilder AsyncFunction582 = classComponentBuilder2.AsyncFunction("addRelation");
                        String name582 = AsyncFunction582.getName();
                        TypeConverterProvider converters592 = AsyncFunction582.getConverters();
                        AnyType[] anyTypeArr602 = new AnyType[2];
                        anyType90 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType90 == null) {
                        }
                        anyTypeArr602[0] = anyType90;
                        anyType91 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.New.class), false));
                        if (anyType91 == null) {
                        }
                        anyTypeArr602[1] = anyType91;
                        AsyncFunction582.setAsyncFunctionComponent(new SuspendFunctionComponent(name582, anyTypeArr602, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$150(null)));
                        AsyncFunctionBuilder AsyncFunction592 = classComponentBuilder2.AsyncFunction("updateRelation");
                        String name592 = AsyncFunction592.getName();
                        TypeConverterProvider converters602 = AsyncFunction592.getConverters();
                        AnyType[] anyTypeArr612 = new AnyType[2];
                        anyType92 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType92 == null) {
                        }
                        anyTypeArr612[0] = anyType92;
                        anyType93 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.Existing.class), false));
                        if (anyType93 == null) {
                        }
                        anyTypeArr612[1] = anyType93;
                        AsyncFunction592.setAsyncFunctionComponent(new SuspendFunctionComponent(name592, anyTypeArr612, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$153(null)));
                        AsyncFunctionBuilder AsyncFunction602 = classComponentBuilder2.AsyncFunction("deleteRelation");
                        String name602 = AsyncFunction602.getName();
                        TypeConverterProvider converters612 = AsyncFunction602.getConverters();
                        AnyType[] anyTypeArr622 = new AnyType[2];
                        anyType94 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType94 == null) {
                        }
                        anyTypeArr622[0] = anyType94;
                        anyType95 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.Existing.class), false));
                        if (anyType95 == null) {
                        }
                        anyTypeArr622[1] = anyType95;
                        AsyncFunction602.setAsyncFunctionComponent(new SuspendFunctionComponent(name602, anyTypeArr622, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$156(null)));
                        AsyncFunctionBuilder AsyncFunction612 = classComponentBuilder2.AsyncFunction("getUrlAddresses");
                        String name612 = AsyncFunction612.getName();
                        TypeConverterProvider converters622 = AsyncFunction612.getConverters();
                        AnyType[] anyTypeArr632 = new AnyType[1];
                        anyType96 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType96 == null) {
                        }
                        anyTypeArr632[0] = anyType96;
                        AsyncFunction612.setAsyncFunctionComponent(new SuspendFunctionComponent(name612, anyTypeArr632, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$158(null)));
                        AsyncFunctionBuilder AsyncFunction622 = classComponentBuilder2.AsyncFunction("addUrlAddress");
                        String name622 = AsyncFunction622.getName();
                        TypeConverterProvider converters632 = AsyncFunction622.getConverters();
                        AnyType[] anyTypeArr642 = new AnyType[2];
                        anyType97 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType97 == null) {
                        }
                        anyTypeArr642[0] = anyType97;
                        anyType98 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.New.class), false));
                        if (anyType98 == null) {
                        }
                        anyTypeArr642[1] = anyType98;
                        AsyncFunction622.setAsyncFunctionComponent(new SuspendFunctionComponent(name622, anyTypeArr642, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$161(null)));
                        AsyncFunctionBuilder AsyncFunction632 = classComponentBuilder2.AsyncFunction("updateUrlAddress");
                        String name632 = AsyncFunction632.getName();
                        TypeConverterProvider converters642 = AsyncFunction632.getConverters();
                        AnyType[] anyTypeArr652 = new AnyType[2];
                        anyType99 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType99 == null) {
                        }
                        anyTypeArr652[0] = anyType99;
                        anyType100 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.Existing.class), false));
                        if (anyType100 == null) {
                        }
                        anyTypeArr652[1] = anyType100;
                        AsyncFunction632.setAsyncFunctionComponent(new SuspendFunctionComponent(name632, anyTypeArr652, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$164(null)));
                        AsyncFunctionBuilder AsyncFunction642 = classComponentBuilder2.AsyncFunction("deleteUrlAddress");
                        String name642 = AsyncFunction642.getName();
                        TypeConverterProvider converters652 = AsyncFunction642.getConverters();
                        AnyType[] anyTypeArr662 = new AnyType[2];
                        anyType101 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType101 == null) {
                        }
                        anyTypeArr662[0] = anyType101;
                        anyType102 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.Existing.class), false));
                        if (anyType102 == null) {
                        }
                        anyTypeArr662[1] = anyType102;
                        AsyncFunction642.setAsyncFunctionComponent(new SuspendFunctionComponent(name642, anyTypeArr662, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$167(null)));
                        AsyncFunctionBuilder AsyncFunction652 = classComponentBuilder2.AsyncFunction("editWithForm");
                        String name652 = AsyncFunction652.getName();
                        TypeConverterProvider converters662 = AsyncFunction652.getConverters();
                        AnyType[] anyTypeArr672 = new AnyType[1];
                        anyType103 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType103 == null) {
                        }
                        anyTypeArr672[0] = anyType103;
                        AsyncFunction652.setAsyncFunctionComponent(new SuspendFunctionComponent(name652, anyTypeArr672, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169(null)));
                        AsyncFunctionBuilder StaticAsyncFunction8 = classComponentBuilder2.StaticAsyncFunction("create");
                        String name662 = StaticAsyncFunction8.getName();
                        TypeConverterProvider converters672 = StaticAsyncFunction8.getConverters();
                        AnyType[] anyTypeArr682 = new AnyType[1];
                        anyType104 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CreateContactRecord.class), false));
                        if (anyType104 == null) {
                        }
                        anyTypeArr682[0] = anyType104;
                        StaticAsyncFunction8.setAsyncFunctionComponent(new SuspendFunctionComponent(name662, anyTypeArr682, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171(null, this)));
                        AsyncFunctionBuilder StaticAsyncFunction22 = classComponentBuilder2.StaticAsyncFunction("presentCreateForm");
                        String name672 = StaticAsyncFunction22.getName();
                        TypeConverterProvider converters682 = StaticAsyncFunction22.getConverters();
                        AnyType[] anyTypeArr692 = new AnyType[1];
                        anyType105 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CreateContactRecord.class), true));
                        if (anyType105 == null) {
                        }
                        anyTypeArr692[0] = anyType105;
                        StaticAsyncFunction22.setAsyncFunctionComponent(new SuspendFunctionComponent(name672, anyTypeArr692, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173(null, this)));
                        AsyncFunctionBuilder StaticAsyncFunction32 = classComponentBuilder2.StaticAsyncFunction("presentPicker");
                        SuspendFunctionComponent suspendFunctionComponent7 = new SuspendFunctionComponent(StaticAsyncFunction32.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$174(null, this));
                        StaticAsyncFunction32.setAsyncFunctionComponent(suspendFunctionComponent7);
                        SuspendFunctionComponent suspendFunctionComponent22 = suspendFunctionComponent7;
                        AsyncFunctionBuilder StaticAsyncFunction42 = classComponentBuilder2.StaticAsyncFunction("getAll");
                        String name682 = StaticAsyncFunction42.getName();
                        TypeConverterProvider converters692 = StaticAsyncFunction42.getConverters();
                        AnyType[] anyTypeArr702 = new AnyType[1];
                        anyType106 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ContactQueryOptions.class), true));
                        if (anyType106 == null) {
                        }
                        anyTypeArr702[0] = anyType106;
                        StaticAsyncFunction42.setAsyncFunctionComponent(new SuspendFunctionComponent(name682, anyTypeArr702, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$176(null, this)));
                        AsyncFunctionBuilder StaticAsyncFunction52 = classComponentBuilder2.StaticAsyncFunction("getAllDetails");
                        String name692 = StaticAsyncFunction52.getName();
                        TypeConverterProvider converters702 = StaticAsyncFunction52.getConverters();
                        AnyType[] anyTypeArr712 = new AnyType[2];
                        anyType107 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Set.class), false));
                        if (anyType107 == null) {
                        }
                        anyTypeArr712[0] = anyType107;
                        anyType108 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ContactQueryOptions.class), true));
                        if (anyType108 == null) {
                        }
                        anyTypeArr712[1] = anyType108;
                        StaticAsyncFunction52.setAsyncFunctionComponent(new SuspendFunctionComponent(name692, anyTypeArr712, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179(null, this)));
                        ClassComponentBuilder classComponentBuilder32 = classComponentBuilder;
                        AsyncFunctionBuilder StaticAsyncFunction62 = classComponentBuilder32.StaticAsyncFunction("getCount");
                        SuspendFunctionComponent suspendFunctionComponent32 = new SuspendFunctionComponent(StaticAsyncFunction62.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180(null, this));
                        StaticAsyncFunction62.setAsyncFunctionComponent(suspendFunctionComponent32);
                        SuspendFunctionComponent suspendFunctionComponent42 = suspendFunctionComponent32;
                        AsyncFunctionBuilder StaticAsyncFunction72 = classComponentBuilder32.StaticAsyncFunction("hasAny");
                        SuspendFunctionComponent suspendFunctionComponent52 = new SuspendFunctionComponent(StaticAsyncFunction72.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$181(null, this));
                        StaticAsyncFunction72.setAsyncFunctionComponent(suspendFunctionComponent52);
                        SuspendFunctionComponent suspendFunctionComponent62 = suspendFunctionComponent52;
                        if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                        }
                        classComponentBuilder32.getStaticAsyncFunctions().put("requestPermissionsAsync", intAsyncFunctionComponent);
                        if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                        }
                        classComponentBuilder32.getStaticAsyncFunctions().put("getPermissions", intAsyncFunctionComponent2);
                        moduleDefinitionBuilder2.getClassData().add(classComponentBuilder32.buildClass());
                        ModuleDefinitionBuilder moduleDefinitionBuilder42 = moduleDefinitionBuilder3;
                        moduleDefinitionBuilder42.Events("onContactsChange");
                        moduleDefinitionBuilder42.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$$inlined$OnDestroy$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ContactsObserverDelegate observerDelegate;
                                observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                observerDelegate.stopObservingContactChanges();
                            }
                        }));
                        moduleDefinitionBuilder42.OnStartObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$3
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ContactsObserverDelegate observerDelegate;
                                observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                observerDelegate.startObservingContactChanges();
                            }
                        });
                        moduleDefinitionBuilder42.OnStopObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$4
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ContactsObserverDelegate observerDelegate;
                                observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                observerDelegate.stopObservingContactChanges();
                            }
                        });
                        moduleDefinitionBuilder42.RegisterActivityContracts(new ContactsNextModule$definition$1$5(this, null));
                        ModuleDefinitionData buildModule2 = moduleDefinitionBuilder42.buildModule();
                        Trace.endSection();
                        return buildModule2;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    moduleDefinitionBuilder3 = moduleDefinitionBuilder;
                }
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                if (m13473exceptionOrNullimpl != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Set.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                    m13470constructorimpl4 = null;
                }
                typeDescriptor = (TypeDescriptor) m13470constructorimpl4;
                if (typeDescriptor == null) {
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(Set.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(ContactField.class))));
                }
                anyType112 = new AnyType(typeDescriptor, converters2);
            }
            anyTypeArr3[1] = anyType112;
            AsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, anyTypeArr3, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3(null)));
            AsyncFunctionBuilder AsyncFunction2102 = classComponentBuilder2.AsyncFunction("delete");
            String name2102 = AsyncFunction2102.getName();
            TypeConverterProvider converters3102 = AsyncFunction2102.getConverters();
            AnyType[] anyTypeArr4102 = new AnyType[1];
            anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$4
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th9) {
                    Result.Companion companion10 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th9));
                }
                Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
                if (m13473exceptionOrNullimpl7 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl7);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                    m13470constructorimpl5 = null;
                }
                TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl5;
                if (typeDescriptor7 == null) {
                    typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType2 = new AnyType(typeDescriptor7, converters3102);
            }
            anyTypeArr4102[0] = anyType2;
            AsyncFunction2102.setAsyncFunctionComponent(new SuspendFunctionComponent(name2102, anyTypeArr4102, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$5(null)));
            AsyncFunctionBuilder AsyncFunction3102 = classComponentBuilder2.AsyncFunction("patch");
            String name3102 = AsyncFunction3102.getName();
            TypeConverterProvider converters4102 = AsyncFunction3102.getConverters();
            AnyType[] anyTypeArr5102 = new AnyType[2];
            anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType3 == null) {
                try {
                    Result.Companion companion11 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$6
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th10) {
                    Result.Companion companion12 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th10));
                }
                Throwable m13473exceptionOrNullimpl8 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
                if (m13473exceptionOrNullimpl8 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl8);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                    m13470constructorimpl6 = null;
                }
                TypeDescriptor typeDescriptor8 = (TypeDescriptor) m13470constructorimpl6;
                if (typeDescriptor8 == null) {
                    typeDescriptor8 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType3 = new AnyType(typeDescriptor8, converters4102);
            }
            anyTypeArr5102[0] = anyType3;
            anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PatchContactRecord.class), false));
            if (anyType4 == null) {
                try {
                    Result.Companion companion13 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.contact.PatchContactRecord", Reflection.getOrCreateKotlinClass(PatchContactRecord.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$7
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(PatchContactRecord.class);
                        }
                    }));
                } catch (Throwable th11) {
                    Result.Companion companion14 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th11));
                }
                Throwable m13473exceptionOrNullimpl9 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
                if (m13473exceptionOrNullimpl9 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + PatchContactRecord.class.getName(), m13473exceptionOrNullimpl9);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                    m13470constructorimpl7 = null;
                }
                TypeDescriptor typeDescriptor9 = (TypeDescriptor) m13470constructorimpl7;
                if (typeDescriptor9 == null) {
                    typeDescriptor9 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(PatchContactRecord.class));
                }
                anyType4 = new AnyType(typeDescriptor9, converters4102);
            }
            anyTypeArr5102[1] = anyType4;
            AsyncFunction3102.setAsyncFunctionComponent(new SuspendFunctionComponent(name3102, anyTypeArr5102, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$8(null)));
            AsyncFunctionBuilder AsyncFunction4102 = classComponentBuilder2.AsyncFunction("update");
            String name4102 = AsyncFunction4102.getName();
            TypeConverterProvider converters5102 = AsyncFunction4102.getConverters();
            AnyType[] anyTypeArr6102 = new AnyType[2];
            anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType5 == null) {
                try {
                    Result.Companion companion15 = Result.INSTANCE;
                    m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$9
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th12) {
                    Result.Companion companion16 = Result.INSTANCE;
                    m13470constructorimpl8 = Result.m13470constructorimpl(ResultKt.createFailure(th12));
                }
                Throwable m13473exceptionOrNullimpl10 = Result.m13473exceptionOrNullimpl(m13470constructorimpl8);
                if (m13473exceptionOrNullimpl10 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl10);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl8)) {
                    m13470constructorimpl8 = null;
                }
                TypeDescriptor typeDescriptor10 = (TypeDescriptor) m13470constructorimpl8;
                if (typeDescriptor10 == null) {
                    typeDescriptor10 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType5 = new AnyType(typeDescriptor10, converters5102);
            }
            anyTypeArr6102[0] = anyType5;
            anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CreateContactRecord.class), false));
            if (anyType6 == null) {
                try {
                    Result.Companion companion17 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.contact.CreateContactRecord", Reflection.getOrCreateKotlinClass(CreateContactRecord.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$10
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(CreateContactRecord.class);
                        }
                    }));
                } catch (Throwable th13) {
                    Result.Companion companion18 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(ResultKt.createFailure(th13));
                }
                Throwable m13473exceptionOrNullimpl11 = Result.m13473exceptionOrNullimpl(m13470constructorimpl9);
                if (m13473exceptionOrNullimpl11 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + CreateContactRecord.class.getName(), m13473exceptionOrNullimpl11);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl9)) {
                    m13470constructorimpl9 = null;
                }
                TypeDescriptor typeDescriptor11 = (TypeDescriptor) m13470constructorimpl9;
                if (typeDescriptor11 == null) {
                    typeDescriptor11 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(CreateContactRecord.class));
                }
                anyType6 = new AnyType(typeDescriptor11, converters5102);
            }
            anyTypeArr6102[1] = anyType6;
            AsyncFunction4102.setAsyncFunctionComponent(new SuspendFunctionComponent(name4102, anyTypeArr6102, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$11(null)));
            AsyncFunctionBuilder AsyncFunction5102 = classComponentBuilder2.AsyncFunction("getFullName");
            String name5102 = AsyncFunction5102.getName();
            TypeConverterProvider converters6102 = AsyncFunction5102.getConverters();
            AnyType[] anyTypeArr722 = new AnyType[1];
            anyType7 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType7 == null) {
                try {
                    Result.Companion companion19 = Result.INSTANCE;
                    m13470constructorimpl10 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$12
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th14) {
                    Result.Companion companion20 = Result.INSTANCE;
                    m13470constructorimpl10 = Result.m13470constructorimpl(ResultKt.createFailure(th14));
                }
                Throwable m13473exceptionOrNullimpl12 = Result.m13473exceptionOrNullimpl(m13470constructorimpl10);
                if (m13473exceptionOrNullimpl12 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl12);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl10)) {
                    m13470constructorimpl10 = null;
                }
                TypeDescriptor typeDescriptor12 = (TypeDescriptor) m13470constructorimpl10;
                if (typeDescriptor12 == null) {
                    typeDescriptor12 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType7 = new AnyType(typeDescriptor12, converters6102);
            }
            anyTypeArr722[0] = anyType7;
            AsyncFunction5102.setAsyncFunctionComponent(new SuspendFunctionComponent(name5102, anyTypeArr722, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$13(null)));
            AsyncFunctionBuilder AsyncFunction662 = classComponentBuilder2.AsyncFunction("getGivenName");
            String name6102 = AsyncFunction662.getName();
            TypeConverterProvider converters722 = AsyncFunction662.getConverters();
            AnyType[] anyTypeArr822 = new AnyType[1];
            anyType8 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType8 == null) {
                try {
                    Result.Companion companion21 = Result.INSTANCE;
                    m13470constructorimpl11 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$14
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th15) {
                    Result.Companion companion22 = Result.INSTANCE;
                    m13470constructorimpl11 = Result.m13470constructorimpl(ResultKt.createFailure(th15));
                }
                Throwable m13473exceptionOrNullimpl13 = Result.m13473exceptionOrNullimpl(m13470constructorimpl11);
                if (m13473exceptionOrNullimpl13 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl13);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl11)) {
                    m13470constructorimpl11 = null;
                }
                TypeDescriptor typeDescriptor13 = (TypeDescriptor) m13470constructorimpl11;
                if (typeDescriptor13 == null) {
                    typeDescriptor13 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType8 = new AnyType(typeDescriptor13, converters722);
            }
            anyTypeArr822[0] = anyType8;
            AsyncFunction662.setAsyncFunctionComponent(new SuspendFunctionComponent(name6102, anyTypeArr822, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$15(null)));
            AsyncFunctionBuilder AsyncFunction722 = classComponentBuilder2.AsyncFunction("setGivenName");
            String name722 = AsyncFunction722.getName();
            TypeConverterProvider converters822 = AsyncFunction722.getConverters();
            AnyType[] anyTypeArr922 = new AnyType[2];
            anyType9 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType9 == null) {
                try {
                    Result.Companion companion23 = Result.INSTANCE;
                    m13470constructorimpl12 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$16
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th16) {
                    Result.Companion companion24 = Result.INSTANCE;
                    m13470constructorimpl12 = Result.m13470constructorimpl(ResultKt.createFailure(th16));
                }
                Throwable m13473exceptionOrNullimpl14 = Result.m13473exceptionOrNullimpl(m13470constructorimpl12);
                if (m13473exceptionOrNullimpl14 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl14);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl12)) {
                    m13470constructorimpl12 = null;
                }
                TypeDescriptor typeDescriptor14 = (TypeDescriptor) m13470constructorimpl12;
                if (typeDescriptor14 == null) {
                    typeDescriptor14 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType9 = new AnyType(typeDescriptor14, converters822);
            }
            anyTypeArr922[0] = anyType9;
            anyType10 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType10 != null) {
                str2 = str;
            } else {
                try {
                    Result.Companion companion25 = Result.INSTANCE;
                    str2 = str;
                    try {
                        m13470constructorimpl13 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$17
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.nullableTypeOf(String.class);
                            }
                        }));
                    } catch (Throwable th17) {
                        th = th17;
                        Result.Companion companion26 = Result.INSTANCE;
                        m13470constructorimpl13 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl13);
                        if (m13473exceptionOrNullimpl2 != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl13)) {
                        }
                        typeDescriptor2 = (TypeDescriptor) m13470constructorimpl13;
                        if (typeDescriptor2 != null) {
                        }
                        anyType10 = new AnyType(typeDescriptor2, converters822);
                        anyTypeArr922[1] = anyType10;
                        AsyncFunction722.setAsyncFunctionComponent(new SuspendFunctionComponent(name722, anyTypeArr922, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$18(null)));
                        AsyncFunctionBuilder AsyncFunction822 = classComponentBuilder2.AsyncFunction("getFamilyName");
                        String name822 = AsyncFunction822.getName();
                        TypeConverterProvider converters922 = AsyncFunction822.getConverters();
                        AnyType[] anyTypeArr1022 = new AnyType[1];
                        anyType11 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType11 == null) {
                        }
                        anyTypeArr1022[0] = anyType11;
                        AsyncFunction822.setAsyncFunctionComponent(new SuspendFunctionComponent(name822, anyTypeArr1022, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$20(null)));
                        AsyncFunctionBuilder AsyncFunction922 = classComponentBuilder2.AsyncFunction("setFamilyName");
                        String name922 = AsyncFunction922.getName();
                        TypeConverterProvider converters1022 = AsyncFunction922.getConverters();
                        AnyType[] anyTypeArr1122 = new AnyType[2];
                        anyType12 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType12 == null) {
                        }
                        anyTypeArr1122[0] = anyType12;
                        anyType13 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType13 == null) {
                        }
                        anyTypeArr1122[1] = anyType13;
                        AsyncFunction922.setAsyncFunctionComponent(new SuspendFunctionComponent(name922, anyTypeArr1122, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$23(null)));
                        AsyncFunctionBuilder AsyncFunction1022 = classComponentBuilder2.AsyncFunction("getMiddleName");
                        String name1022 = AsyncFunction1022.getName();
                        TypeConverterProvider converters1122 = AsyncFunction1022.getConverters();
                        AnyType[] anyTypeArr1222 = new AnyType[1];
                        anyType14 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType14 == null) {
                        }
                        anyTypeArr1222[0] = anyType14;
                        AsyncFunction1022.setAsyncFunctionComponent(new SuspendFunctionComponent(name1022, anyTypeArr1222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$25(null)));
                        AsyncFunctionBuilder AsyncFunction1122 = classComponentBuilder2.AsyncFunction("setMiddleName");
                        String name1122 = AsyncFunction1122.getName();
                        TypeConverterProvider converters1222 = AsyncFunction1122.getConverters();
                        AnyType[] anyTypeArr1322 = new AnyType[2];
                        anyType15 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType15 == null) {
                        }
                        anyTypeArr1322[0] = anyType15;
                        anyType16 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType16 == null) {
                        }
                        anyTypeArr1322[1] = anyType16;
                        AsyncFunction1122.setAsyncFunctionComponent(new SuspendFunctionComponent(name1122, anyTypeArr1322, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$28(null)));
                        AsyncFunctionBuilder AsyncFunction1222 = classComponentBuilder2.AsyncFunction("getPrefix");
                        String name1222 = AsyncFunction1222.getName();
                        TypeConverterProvider converters1322 = AsyncFunction1222.getConverters();
                        AnyType[] anyTypeArr1422 = new AnyType[1];
                        anyType17 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType17 == null) {
                        }
                        anyTypeArr1422[0] = anyType17;
                        AsyncFunction1222.setAsyncFunctionComponent(new SuspendFunctionComponent(name1222, anyTypeArr1422, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$30(null)));
                        AsyncFunctionBuilder AsyncFunction1322 = classComponentBuilder2.AsyncFunction("setPrefix");
                        String name1322 = AsyncFunction1322.getName();
                        TypeConverterProvider converters1422 = AsyncFunction1322.getConverters();
                        AnyType[] anyTypeArr1522 = new AnyType[2];
                        anyType18 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType18 == null) {
                        }
                        anyTypeArr1522[0] = anyType18;
                        anyType19 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType19 == null) {
                        }
                        anyTypeArr1522[1] = anyType19;
                        AsyncFunction1322.setAsyncFunctionComponent(new SuspendFunctionComponent(name1322, anyTypeArr1522, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$33(null)));
                        AsyncFunctionBuilder AsyncFunction1422 = classComponentBuilder2.AsyncFunction("getSuffix");
                        String name1422 = AsyncFunction1422.getName();
                        TypeConverterProvider converters1522 = AsyncFunction1422.getConverters();
                        AnyType[] anyTypeArr1622 = new AnyType[1];
                        anyType20 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType20 == null) {
                        }
                        anyTypeArr1622[0] = anyType20;
                        AsyncFunction1422.setAsyncFunctionComponent(new SuspendFunctionComponent(name1422, anyTypeArr1622, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$35(null)));
                        AsyncFunctionBuilder AsyncFunction1522 = classComponentBuilder2.AsyncFunction("setSuffix");
                        String name1522 = AsyncFunction1522.getName();
                        TypeConverterProvider converters1622 = AsyncFunction1522.getConverters();
                        AnyType[] anyTypeArr1722 = new AnyType[2];
                        anyType21 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType21 == null) {
                        }
                        anyTypeArr1722[0] = anyType21;
                        anyType22 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType22 == null) {
                        }
                        anyTypeArr1722[1] = anyType22;
                        AsyncFunction1522.setAsyncFunctionComponent(new SuspendFunctionComponent(name1522, anyTypeArr1722, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$38(null)));
                        AsyncFunctionBuilder AsyncFunction1622 = classComponentBuilder2.AsyncFunction("getPhoneticGivenName");
                        String name1622 = AsyncFunction1622.getName();
                        TypeConverterProvider converters1722 = AsyncFunction1622.getConverters();
                        AnyType[] anyTypeArr1822 = new AnyType[1];
                        anyType23 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType23 == null) {
                        }
                        anyTypeArr1822[0] = anyType23;
                        AsyncFunction1622.setAsyncFunctionComponent(new SuspendFunctionComponent(name1622, anyTypeArr1822, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$40(null)));
                        AsyncFunctionBuilder AsyncFunction1722 = classComponentBuilder2.AsyncFunction("setPhoneticGivenName");
                        String name1722 = AsyncFunction1722.getName();
                        TypeConverterProvider converters1822 = AsyncFunction1722.getConverters();
                        AnyType[] anyTypeArr1922 = new AnyType[2];
                        anyType24 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType24 == null) {
                        }
                        anyTypeArr1922[0] = anyType24;
                        anyType25 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType25 == null) {
                        }
                        anyTypeArr1922[1] = anyType25;
                        AsyncFunction1722.setAsyncFunctionComponent(new SuspendFunctionComponent(name1722, anyTypeArr1922, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$43(null)));
                        AsyncFunctionBuilder AsyncFunction1822 = classComponentBuilder2.AsyncFunction("getPhoneticMiddleName");
                        String name1822 = AsyncFunction1822.getName();
                        TypeConverterProvider converters1922 = AsyncFunction1822.getConverters();
                        AnyType[] anyTypeArr2022 = new AnyType[1];
                        anyType26 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType26 == null) {
                        }
                        anyTypeArr2022[0] = anyType26;
                        AsyncFunction1822.setAsyncFunctionComponent(new SuspendFunctionComponent(name1822, anyTypeArr2022, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$45(null)));
                        AsyncFunctionBuilder AsyncFunction1922 = classComponentBuilder2.AsyncFunction("setPhoneticMiddleName");
                        String name1922 = AsyncFunction1922.getName();
                        TypeConverterProvider converters2022 = AsyncFunction1922.getConverters();
                        AnyType[] anyTypeArr2122 = new AnyType[2];
                        anyType27 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType27 == null) {
                        }
                        anyTypeArr2122[0] = anyType27;
                        anyType28 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType28 == null) {
                        }
                        anyTypeArr2122[1] = anyType28;
                        AsyncFunction1922.setAsyncFunctionComponent(new SuspendFunctionComponent(name1922, anyTypeArr2122, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$48(null)));
                        AsyncFunctionBuilder AsyncFunction2022 = classComponentBuilder2.AsyncFunction("getPhoneticFamilyName");
                        String name2022 = AsyncFunction2022.getName();
                        TypeConverterProvider converters2122 = AsyncFunction2022.getConverters();
                        AnyType[] anyTypeArr2222 = new AnyType[1];
                        anyType29 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType29 == null) {
                        }
                        anyTypeArr2222[0] = anyType29;
                        AsyncFunction2022.setAsyncFunctionComponent(new SuspendFunctionComponent(name2022, anyTypeArr2222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$50(null)));
                        AsyncFunctionBuilder AsyncFunction2122 = classComponentBuilder2.AsyncFunction("setPhoneticFamilyName");
                        String name2122 = AsyncFunction2122.getName();
                        TypeConverterProvider converters2222 = AsyncFunction2122.getConverters();
                        AnyType[] anyTypeArr2322 = new AnyType[2];
                        anyType30 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType30 == null) {
                        }
                        anyTypeArr2322[0] = anyType30;
                        anyType31 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType31 == null) {
                        }
                        anyTypeArr2322[1] = anyType31;
                        AsyncFunction2122.setAsyncFunctionComponent(new SuspendFunctionComponent(name2122, anyTypeArr2322, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$53(null)));
                        AsyncFunctionBuilder AsyncFunction2222 = classComponentBuilder2.AsyncFunction("getCompany");
                        String name2222 = AsyncFunction2222.getName();
                        TypeConverterProvider converters2322 = AsyncFunction2222.getConverters();
                        AnyType[] anyTypeArr2422 = new AnyType[1];
                        anyType32 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType32 == null) {
                        }
                        anyTypeArr2422[0] = anyType32;
                        AsyncFunction2222.setAsyncFunctionComponent(new SuspendFunctionComponent(name2222, anyTypeArr2422, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$55(null)));
                        AsyncFunctionBuilder AsyncFunction2322 = classComponentBuilder2.AsyncFunction("setCompany");
                        String name2322 = AsyncFunction2322.getName();
                        TypeConverterProvider converters2422 = AsyncFunction2322.getConverters();
                        AnyType[] anyTypeArr2522 = new AnyType[2];
                        anyType33 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType33 == null) {
                        }
                        anyTypeArr2522[0] = anyType33;
                        anyType34 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType34 == null) {
                        }
                        anyTypeArr2522[1] = anyType34;
                        AsyncFunction2322.setAsyncFunctionComponent(new SuspendFunctionComponent(name2322, anyTypeArr2522, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$58(null)));
                        AsyncFunctionBuilder AsyncFunction2422 = classComponentBuilder2.AsyncFunction("getDepartment");
                        String name2422 = AsyncFunction2422.getName();
                        TypeConverterProvider converters2522 = AsyncFunction2422.getConverters();
                        AnyType[] anyTypeArr2622 = new AnyType[1];
                        anyType35 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType35 == null) {
                        }
                        anyTypeArr2622[0] = anyType35;
                        AsyncFunction2422.setAsyncFunctionComponent(new SuspendFunctionComponent(name2422, anyTypeArr2622, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$60(null)));
                        AsyncFunctionBuilder AsyncFunction2522 = classComponentBuilder2.AsyncFunction("setDepartment");
                        String name2522 = AsyncFunction2522.getName();
                        TypeConverterProvider converters2622 = AsyncFunction2522.getConverters();
                        AnyType[] anyTypeArr2722 = new AnyType[2];
                        anyType36 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType36 == null) {
                        }
                        anyTypeArr2722[0] = anyType36;
                        anyType37 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType37 == null) {
                        }
                        anyTypeArr2722[1] = anyType37;
                        AsyncFunction2522.setAsyncFunctionComponent(new SuspendFunctionComponent(name2522, anyTypeArr2722, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$63(null)));
                        AsyncFunctionBuilder AsyncFunction2622 = classComponentBuilder2.AsyncFunction("getJobTitle");
                        String name2622 = AsyncFunction2622.getName();
                        TypeConverterProvider converters2722 = AsyncFunction2622.getConverters();
                        AnyType[] anyTypeArr2822 = new AnyType[1];
                        anyType38 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType38 == null) {
                        }
                        anyTypeArr2822[0] = anyType38;
                        AsyncFunction2622.setAsyncFunctionComponent(new SuspendFunctionComponent(name2622, anyTypeArr2822, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$65(null)));
                        AsyncFunctionBuilder AsyncFunction2722 = classComponentBuilder2.AsyncFunction("setJobTitle");
                        String name2722 = AsyncFunction2722.getName();
                        TypeConverterProvider converters2822 = AsyncFunction2722.getConverters();
                        AnyType[] anyTypeArr2922 = new AnyType[2];
                        anyType39 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType39 == null) {
                        }
                        anyTypeArr2922[0] = anyType39;
                        anyType40 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType40 == null) {
                        }
                        anyTypeArr2922[1] = anyType40;
                        AsyncFunction2722.setAsyncFunctionComponent(new SuspendFunctionComponent(name2722, anyTypeArr2922, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$68(null)));
                        AsyncFunctionBuilder AsyncFunction2822 = classComponentBuilder2.AsyncFunction("getPhoneticCompanyName");
                        String name2822 = AsyncFunction2822.getName();
                        TypeConverterProvider converters2922 = AsyncFunction2822.getConverters();
                        AnyType[] anyTypeArr3022 = new AnyType[1];
                        anyType41 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType41 == null) {
                        }
                        anyTypeArr3022[0] = anyType41;
                        AsyncFunction2822.setAsyncFunctionComponent(new SuspendFunctionComponent(name2822, anyTypeArr3022, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$70(null)));
                        AsyncFunctionBuilder AsyncFunction2922 = classComponentBuilder2.AsyncFunction("setPhoneticCompanyName");
                        String name2922 = AsyncFunction2922.getName();
                        TypeConverterProvider converters3022 = AsyncFunction2922.getConverters();
                        AnyType[] anyTypeArr3122 = new AnyType[2];
                        anyType42 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType42 == null) {
                        }
                        anyTypeArr3122[0] = anyType42;
                        anyType43 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType43 == null) {
                        }
                        anyTypeArr3122[1] = anyType43;
                        AsyncFunction2922.setAsyncFunctionComponent(new SuspendFunctionComponent(name2922, anyTypeArr3122, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$73(null)));
                        AsyncFunctionBuilder AsyncFunction3022 = classComponentBuilder2.AsyncFunction("getNote");
                        String name3022 = AsyncFunction3022.getName();
                        TypeConverterProvider converters3122 = AsyncFunction3022.getConverters();
                        AnyType[] anyTypeArr3222 = new AnyType[1];
                        anyType44 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType44 == null) {
                        }
                        anyTypeArr3222[0] = anyType44;
                        AsyncFunction3022.setAsyncFunctionComponent(new SuspendFunctionComponent(name3022, anyTypeArr3222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$75(null)));
                        AsyncFunctionBuilder AsyncFunction3122 = classComponentBuilder2.AsyncFunction("setNote");
                        String name3122 = AsyncFunction3122.getName();
                        TypeConverterProvider converters3222 = AsyncFunction3122.getConverters();
                        AnyType[] anyTypeArr3322 = new AnyType[2];
                        anyType45 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType45 == null) {
                        }
                        anyTypeArr3322[0] = anyType45;
                        anyType46 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType46 == null) {
                        }
                        anyTypeArr3322[1] = anyType46;
                        AsyncFunction3122.setAsyncFunctionComponent(new SuspendFunctionComponent(name3122, anyTypeArr3322, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$78(null)));
                        AsyncFunctionBuilder AsyncFunction3222 = classComponentBuilder2.AsyncFunction("getImage");
                        String name3222 = AsyncFunction3222.getName();
                        TypeConverterProvider converters3322 = AsyncFunction3222.getConverters();
                        AnyType[] anyTypeArr3422 = new AnyType[1];
                        anyType47 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType47 == null) {
                        }
                        anyTypeArr3422[0] = anyType47;
                        AsyncFunction3222.setAsyncFunctionComponent(new SuspendFunctionComponent(name3222, anyTypeArr3422, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$80(null)));
                        AsyncFunctionBuilder AsyncFunction3322 = classComponentBuilder2.AsyncFunction("setImage");
                        String name3322 = AsyncFunction3322.getName();
                        TypeConverterProvider converters3422 = AsyncFunction3322.getConverters();
                        AnyType[] anyTypeArr3522 = new AnyType[2];
                        anyType48 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType48 == null) {
                        }
                        anyTypeArr3522[0] = anyType48;
                        anyType49 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                        if (anyType49 == null) {
                        }
                        anyTypeArr3522[1] = anyType49;
                        AsyncFunction3322.setAsyncFunctionComponent(new SuspendFunctionComponent(name3322, anyTypeArr3522, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$83(null)));
                        AsyncFunctionBuilder AsyncFunction3422 = classComponentBuilder2.AsyncFunction("getThumbnail");
                        String name3422 = AsyncFunction3422.getName();
                        TypeConverterProvider converters3522 = AsyncFunction3422.getConverters();
                        AnyType[] anyTypeArr3622 = new AnyType[1];
                        anyType50 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType50 == null) {
                        }
                        anyTypeArr3622[0] = anyType50;
                        AsyncFunction3422.setAsyncFunctionComponent(new SuspendFunctionComponent(name3422, anyTypeArr3622, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$85(null)));
                        AsyncFunctionBuilder AsyncFunction3522 = classComponentBuilder2.AsyncFunction("setIsFavourite");
                        String name3522 = AsyncFunction3522.getName();
                        TypeConverterProvider converters3622 = AsyncFunction3522.getConverters();
                        AnyType[] anyTypeArr3722 = new AnyType[2];
                        anyType51 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType51 == null) {
                        }
                        anyTypeArr3722[0] = anyType51;
                        anyType52 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), false));
                        if (anyType52 == null) {
                        }
                        anyTypeArr3722[1] = anyType52;
                        AsyncFunction3522.setAsyncFunctionComponent(new SuspendFunctionComponent(name3522, anyTypeArr3722, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$88(null)));
                        AsyncFunctionBuilder AsyncFunction3622 = classComponentBuilder2.AsyncFunction("getIsFavourite");
                        String name3622 = AsyncFunction3622.getName();
                        TypeConverterProvider converters3722 = AsyncFunction3622.getConverters();
                        AnyType[] anyTypeArr3822 = new AnyType[1];
                        anyType53 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType53 == null) {
                        }
                        anyTypeArr3822[0] = anyType53;
                        AsyncFunction3622.setAsyncFunctionComponent(new SuspendFunctionComponent(name3622, anyTypeArr3822, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$90(null)));
                        AsyncFunctionBuilder AsyncFunction3722 = classComponentBuilder2.AsyncFunction("getEmails");
                        String name3722 = AsyncFunction3722.getName();
                        TypeConverterProvider converters3822 = AsyncFunction3722.getConverters();
                        AnyType[] anyTypeArr3922 = new AnyType[1];
                        anyType54 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType54 == null) {
                        }
                        anyTypeArr3922[0] = anyType54;
                        AsyncFunction3722.setAsyncFunctionComponent(new SuspendFunctionComponent(name3722, anyTypeArr3922, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$92(null)));
                        AsyncFunctionBuilder AsyncFunction3822 = classComponentBuilder2.AsyncFunction("addEmail");
                        String name3822 = AsyncFunction3822.getName();
                        TypeConverterProvider converters3922 = AsyncFunction3822.getConverters();
                        AnyType[] anyTypeArr4022 = new AnyType[2];
                        anyType55 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType55 == null) {
                        }
                        anyTypeArr4022[0] = anyType55;
                        anyType56 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.New.class), false));
                        if (anyType56 == null) {
                        }
                        anyTypeArr4022[1] = anyType56;
                        AsyncFunction3822.setAsyncFunctionComponent(new SuspendFunctionComponent(name3822, anyTypeArr4022, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$95(null)));
                        AsyncFunctionBuilder AsyncFunction3922 = classComponentBuilder2.AsyncFunction("updateEmail");
                        String name3922 = AsyncFunction3922.getName();
                        TypeConverterProvider converters4022 = AsyncFunction3922.getConverters();
                        AnyType[] anyTypeArr4122 = new AnyType[2];
                        anyType57 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType57 == null) {
                        }
                        anyTypeArr4122[0] = anyType57;
                        anyType58 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.Existing.class), false));
                        if (anyType58 == null) {
                        }
                        anyTypeArr4122[1] = anyType58;
                        AsyncFunction3922.setAsyncFunctionComponent(new SuspendFunctionComponent(name3922, anyTypeArr4122, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$98(null)));
                        AsyncFunctionBuilder AsyncFunction4022 = classComponentBuilder2.AsyncFunction("deleteEmail");
                        String name4022 = AsyncFunction4022.getName();
                        TypeConverterProvider converters4122 = AsyncFunction4022.getConverters();
                        AnyType[] anyTypeArr4222 = new AnyType[2];
                        anyType59 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType59 == null) {
                        }
                        anyTypeArr4222[0] = anyType59;
                        anyType60 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.Existing.class), false));
                        if (anyType60 == null) {
                        }
                        anyTypeArr4222[1] = anyType60;
                        AsyncFunction4022.setAsyncFunctionComponent(new SuspendFunctionComponent(name4022, anyTypeArr4222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$101(null)));
                        AsyncFunctionBuilder AsyncFunction4122 = classComponentBuilder2.AsyncFunction("getPhones");
                        String name4122 = AsyncFunction4122.getName();
                        TypeConverterProvider converters4222 = AsyncFunction4122.getConverters();
                        AnyType[] anyTypeArr4322 = new AnyType[1];
                        anyType61 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType61 == null) {
                        }
                        anyTypeArr4322[0] = anyType61;
                        AsyncFunction4122.setAsyncFunctionComponent(new SuspendFunctionComponent(name4122, anyTypeArr4322, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$103(null)));
                        AsyncFunctionBuilder AsyncFunction4222 = classComponentBuilder2.AsyncFunction("addPhone");
                        String name4222 = AsyncFunction4222.getName();
                        TypeConverterProvider converters4322 = AsyncFunction4222.getConverters();
                        AnyType[] anyTypeArr4422 = new AnyType[2];
                        anyType62 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType62 == null) {
                        }
                        anyTypeArr4422[0] = anyType62;
                        anyType63 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.New.class), false));
                        if (anyType63 == null) {
                        }
                        anyTypeArr4422[1] = anyType63;
                        AsyncFunction4222.setAsyncFunctionComponent(new SuspendFunctionComponent(name4222, anyTypeArr4422, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$106(null)));
                        AsyncFunctionBuilder AsyncFunction4322 = classComponentBuilder2.AsyncFunction("updatePhone");
                        String name4322 = AsyncFunction4322.getName();
                        TypeConverterProvider converters4422 = AsyncFunction4322.getConverters();
                        AnyType[] anyTypeArr4522 = new AnyType[2];
                        anyType64 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType64 == null) {
                        }
                        anyTypeArr4522[0] = anyType64;
                        anyType65 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.Existing.class), false));
                        if (anyType65 == null) {
                        }
                        anyTypeArr4522[1] = anyType65;
                        AsyncFunction4322.setAsyncFunctionComponent(new SuspendFunctionComponent(name4322, anyTypeArr4522, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$109(null)));
                        AsyncFunctionBuilder AsyncFunction4422 = classComponentBuilder2.AsyncFunction("deletePhone");
                        String name4422 = AsyncFunction4422.getName();
                        TypeConverterProvider converters4522 = AsyncFunction4422.getConverters();
                        AnyType[] anyTypeArr4622 = new AnyType[2];
                        anyType66 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType66 == null) {
                        }
                        anyTypeArr4622[0] = anyType66;
                        anyType67 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.Existing.class), false));
                        if (anyType67 == null) {
                        }
                        anyTypeArr4622[1] = anyType67;
                        AsyncFunction4422.setAsyncFunctionComponent(new SuspendFunctionComponent(name4422, anyTypeArr4622, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$112(null)));
                        AsyncFunctionBuilder AsyncFunction4522 = classComponentBuilder2.AsyncFunction("getAddresses");
                        String name4522 = AsyncFunction4522.getName();
                        TypeConverterProvider converters4622 = AsyncFunction4522.getConverters();
                        AnyType[] anyTypeArr4722 = new AnyType[1];
                        anyType68 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType68 == null) {
                        }
                        anyTypeArr4722[0] = anyType68;
                        AsyncFunction4522.setAsyncFunctionComponent(new SuspendFunctionComponent(name4522, anyTypeArr4722, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$114(null)));
                        AsyncFunctionBuilder AsyncFunction4622 = classComponentBuilder2.AsyncFunction("addAddress");
                        String name4622 = AsyncFunction4622.getName();
                        TypeConverterProvider converters4722 = AsyncFunction4622.getConverters();
                        AnyType[] anyTypeArr4822 = new AnyType[2];
                        anyType69 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType69 == null) {
                        }
                        anyTypeArr4822[0] = anyType69;
                        anyType70 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.New.class), false));
                        if (anyType70 == null) {
                        }
                        anyTypeArr4822[1] = anyType70;
                        AsyncFunction4622.setAsyncFunctionComponent(new SuspendFunctionComponent(name4622, anyTypeArr4822, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$117(null)));
                        AsyncFunctionBuilder AsyncFunction4722 = classComponentBuilder2.AsyncFunction("updateAddress");
                        String name4722 = AsyncFunction4722.getName();
                        TypeConverterProvider converters4822 = AsyncFunction4722.getConverters();
                        AnyType[] anyTypeArr4922 = new AnyType[2];
                        anyType71 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType71 == null) {
                        }
                        anyTypeArr4922[0] = anyType71;
                        anyType72 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.Existing.class), false));
                        if (anyType72 == null) {
                        }
                        anyTypeArr4922[1] = anyType72;
                        AsyncFunction4722.setAsyncFunctionComponent(new SuspendFunctionComponent(name4722, anyTypeArr4922, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$120(null)));
                        AsyncFunctionBuilder AsyncFunction4822 = classComponentBuilder2.AsyncFunction("deleteAddress");
                        String name4822 = AsyncFunction4822.getName();
                        TypeConverterProvider converters4922 = AsyncFunction4822.getConverters();
                        AnyType[] anyTypeArr5022 = new AnyType[2];
                        anyType73 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType73 == null) {
                        }
                        anyTypeArr5022[0] = anyType73;
                        anyType74 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.Existing.class), false));
                        if (anyType74 == null) {
                        }
                        anyTypeArr5022[1] = anyType74;
                        AsyncFunction4822.setAsyncFunctionComponent(new SuspendFunctionComponent(name4822, anyTypeArr5022, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$123(null)));
                        AsyncFunctionBuilder AsyncFunction4922 = classComponentBuilder2.AsyncFunction("getDates");
                        String name4922 = AsyncFunction4922.getName();
                        TypeConverterProvider converters5022 = AsyncFunction4922.getConverters();
                        AnyType[] anyTypeArr5122 = new AnyType[1];
                        anyType75 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType75 == null) {
                        }
                        anyTypeArr5122[0] = anyType75;
                        AsyncFunction4922.setAsyncFunctionComponent(new SuspendFunctionComponent(name4922, anyTypeArr5122, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$125(null)));
                        AsyncFunctionBuilder AsyncFunction5022 = classComponentBuilder2.AsyncFunction("addDate");
                        String name5022 = AsyncFunction5022.getName();
                        TypeConverterProvider converters5122 = AsyncFunction5022.getConverters();
                        AnyType[] anyTypeArr5222 = new AnyType[2];
                        anyType76 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType76 == null) {
                        }
                        anyTypeArr5222[0] = anyType76;
                        anyType77 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.New.class), false));
                        if (anyType77 == null) {
                        }
                        anyTypeArr5222[1] = anyType77;
                        AsyncFunction5022.setAsyncFunctionComponent(new SuspendFunctionComponent(name5022, anyTypeArr5222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$128(null)));
                        AsyncFunctionBuilder AsyncFunction5122 = classComponentBuilder2.AsyncFunction("updateDate");
                        String name5122 = AsyncFunction5122.getName();
                        TypeConverterProvider converters5222 = AsyncFunction5122.getConverters();
                        AnyType[] anyTypeArr5322 = new AnyType[2];
                        anyType78 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType78 == null) {
                        }
                        anyTypeArr5322[0] = anyType78;
                        anyType79 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.Existing.class), false));
                        if (anyType79 == null) {
                        }
                        anyTypeArr5322[1] = anyType79;
                        AsyncFunction5122.setAsyncFunctionComponent(new SuspendFunctionComponent(name5122, anyTypeArr5322, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$131(null)));
                        AsyncFunctionBuilder AsyncFunction5222 = classComponentBuilder2.AsyncFunction("deleteDate");
                        String name5222 = AsyncFunction5222.getName();
                        TypeConverterProvider converters5322 = AsyncFunction5222.getConverters();
                        AnyType[] anyTypeArr5422 = new AnyType[2];
                        anyType80 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType80 == null) {
                        }
                        anyTypeArr5422[0] = anyType80;
                        anyType81 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.Existing.class), false));
                        if (anyType81 == null) {
                        }
                        anyTypeArr5422[1] = anyType81;
                        AsyncFunction5222.setAsyncFunctionComponent(new SuspendFunctionComponent(name5222, anyTypeArr5422, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$134(null)));
                        AsyncFunctionBuilder AsyncFunction5322 = classComponentBuilder2.AsyncFunction("getExtraNames");
                        String name5322 = AsyncFunction5322.getName();
                        TypeConverterProvider converters5422 = AsyncFunction5322.getConverters();
                        AnyType[] anyTypeArr5522 = new AnyType[1];
                        anyType82 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType82 == null) {
                        }
                        anyTypeArr5522[0] = anyType82;
                        AsyncFunction5322.setAsyncFunctionComponent(new SuspendFunctionComponent(name5322, anyTypeArr5522, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$136(null)));
                        AsyncFunctionBuilder AsyncFunction5422 = classComponentBuilder2.AsyncFunction("addExtraName");
                        String name5422 = AsyncFunction5422.getName();
                        TypeConverterProvider converters5522 = AsyncFunction5422.getConverters();
                        AnyType[] anyTypeArr5622 = new AnyType[2];
                        anyType83 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType83 == null) {
                        }
                        anyTypeArr5622[0] = anyType83;
                        anyType84 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.New.class), false));
                        if (anyType84 == null) {
                        }
                        anyTypeArr5622[1] = anyType84;
                        AsyncFunction5422.setAsyncFunctionComponent(new SuspendFunctionComponent(name5422, anyTypeArr5622, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$139(null)));
                        AsyncFunctionBuilder AsyncFunction5522 = classComponentBuilder2.AsyncFunction("updateExtraName");
                        String name5522 = AsyncFunction5522.getName();
                        TypeConverterProvider converters5622 = AsyncFunction5522.getConverters();
                        AnyType[] anyTypeArr5722 = new AnyType[2];
                        anyType85 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType85 == null) {
                        }
                        anyTypeArr5722[0] = anyType85;
                        anyType86 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.Existing.class), false));
                        if (anyType86 == null) {
                        }
                        anyTypeArr5722[1] = anyType86;
                        AsyncFunction5522.setAsyncFunctionComponent(new SuspendFunctionComponent(name5522, anyTypeArr5722, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$142(null)));
                        AsyncFunctionBuilder AsyncFunction5622 = classComponentBuilder2.AsyncFunction("deleteExtraName");
                        String name5622 = AsyncFunction5622.getName();
                        TypeConverterProvider converters5722 = AsyncFunction5622.getConverters();
                        AnyType[] anyTypeArr5822 = new AnyType[2];
                        anyType87 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType87 == null) {
                        }
                        anyTypeArr5822[0] = anyType87;
                        anyType88 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.Existing.class), false));
                        if (anyType88 == null) {
                        }
                        anyTypeArr5822[1] = anyType88;
                        AsyncFunction5622.setAsyncFunctionComponent(new SuspendFunctionComponent(name5622, anyTypeArr5822, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$145(null)));
                        AsyncFunctionBuilder AsyncFunction5722 = classComponentBuilder2.AsyncFunction("getRelations");
                        String name5722 = AsyncFunction5722.getName();
                        TypeConverterProvider converters5822 = AsyncFunction5722.getConverters();
                        AnyType[] anyTypeArr5922 = new AnyType[1];
                        anyType89 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType89 == null) {
                        }
                        anyTypeArr5922[0] = anyType89;
                        AsyncFunction5722.setAsyncFunctionComponent(new SuspendFunctionComponent(name5722, anyTypeArr5922, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$147(null)));
                        AsyncFunctionBuilder AsyncFunction5822 = classComponentBuilder2.AsyncFunction("addRelation");
                        String name5822 = AsyncFunction5822.getName();
                        TypeConverterProvider converters5922 = AsyncFunction5822.getConverters();
                        AnyType[] anyTypeArr6022 = new AnyType[2];
                        anyType90 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType90 == null) {
                        }
                        anyTypeArr6022[0] = anyType90;
                        anyType91 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.New.class), false));
                        if (anyType91 == null) {
                        }
                        anyTypeArr6022[1] = anyType91;
                        AsyncFunction5822.setAsyncFunctionComponent(new SuspendFunctionComponent(name5822, anyTypeArr6022, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$150(null)));
                        AsyncFunctionBuilder AsyncFunction5922 = classComponentBuilder2.AsyncFunction("updateRelation");
                        String name5922 = AsyncFunction5922.getName();
                        TypeConverterProvider converters6022 = AsyncFunction5922.getConverters();
                        AnyType[] anyTypeArr6122 = new AnyType[2];
                        anyType92 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType92 == null) {
                        }
                        anyTypeArr6122[0] = anyType92;
                        anyType93 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.Existing.class), false));
                        if (anyType93 == null) {
                        }
                        anyTypeArr6122[1] = anyType93;
                        AsyncFunction5922.setAsyncFunctionComponent(new SuspendFunctionComponent(name5922, anyTypeArr6122, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$153(null)));
                        AsyncFunctionBuilder AsyncFunction6022 = classComponentBuilder2.AsyncFunction("deleteRelation");
                        String name6022 = AsyncFunction6022.getName();
                        TypeConverterProvider converters6122 = AsyncFunction6022.getConverters();
                        AnyType[] anyTypeArr6222 = new AnyType[2];
                        anyType94 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType94 == null) {
                        }
                        anyTypeArr6222[0] = anyType94;
                        anyType95 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.Existing.class), false));
                        if (anyType95 == null) {
                        }
                        anyTypeArr6222[1] = anyType95;
                        AsyncFunction6022.setAsyncFunctionComponent(new SuspendFunctionComponent(name6022, anyTypeArr6222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$156(null)));
                        AsyncFunctionBuilder AsyncFunction6122 = classComponentBuilder2.AsyncFunction("getUrlAddresses");
                        String name6122 = AsyncFunction6122.getName();
                        TypeConverterProvider converters6222 = AsyncFunction6122.getConverters();
                        AnyType[] anyTypeArr6322 = new AnyType[1];
                        anyType96 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType96 == null) {
                        }
                        anyTypeArr6322[0] = anyType96;
                        AsyncFunction6122.setAsyncFunctionComponent(new SuspendFunctionComponent(name6122, anyTypeArr6322, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$158(null)));
                        AsyncFunctionBuilder AsyncFunction6222 = classComponentBuilder2.AsyncFunction("addUrlAddress");
                        String name6222 = AsyncFunction6222.getName();
                        TypeConverterProvider converters6322 = AsyncFunction6222.getConverters();
                        AnyType[] anyTypeArr6422 = new AnyType[2];
                        anyType97 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType97 == null) {
                        }
                        anyTypeArr6422[0] = anyType97;
                        anyType98 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.New.class), false));
                        if (anyType98 == null) {
                        }
                        anyTypeArr6422[1] = anyType98;
                        AsyncFunction6222.setAsyncFunctionComponent(new SuspendFunctionComponent(name6222, anyTypeArr6422, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$161(null)));
                        AsyncFunctionBuilder AsyncFunction6322 = classComponentBuilder2.AsyncFunction("updateUrlAddress");
                        String name6322 = AsyncFunction6322.getName();
                        TypeConverterProvider converters6422 = AsyncFunction6322.getConverters();
                        AnyType[] anyTypeArr6522 = new AnyType[2];
                        anyType99 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType99 == null) {
                        }
                        anyTypeArr6522[0] = anyType99;
                        anyType100 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.Existing.class), false));
                        if (anyType100 == null) {
                        }
                        anyTypeArr6522[1] = anyType100;
                        AsyncFunction6322.setAsyncFunctionComponent(new SuspendFunctionComponent(name6322, anyTypeArr6522, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$164(null)));
                        AsyncFunctionBuilder AsyncFunction6422 = classComponentBuilder2.AsyncFunction("deleteUrlAddress");
                        String name6422 = AsyncFunction6422.getName();
                        TypeConverterProvider converters6522 = AsyncFunction6422.getConverters();
                        AnyType[] anyTypeArr6622 = new AnyType[2];
                        anyType101 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType101 == null) {
                        }
                        anyTypeArr6622[0] = anyType101;
                        anyType102 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.Existing.class), false));
                        if (anyType102 == null) {
                        }
                        anyTypeArr6622[1] = anyType102;
                        AsyncFunction6422.setAsyncFunctionComponent(new SuspendFunctionComponent(name6422, anyTypeArr6622, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$167(null)));
                        AsyncFunctionBuilder AsyncFunction6522 = classComponentBuilder2.AsyncFunction("editWithForm");
                        String name6522 = AsyncFunction6522.getName();
                        TypeConverterProvider converters6622 = AsyncFunction6522.getConverters();
                        AnyType[] anyTypeArr6722 = new AnyType[1];
                        anyType103 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
                        if (anyType103 == null) {
                        }
                        anyTypeArr6722[0] = anyType103;
                        AsyncFunction6522.setAsyncFunctionComponent(new SuspendFunctionComponent(name6522, anyTypeArr6722, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169(null)));
                        AsyncFunctionBuilder StaticAsyncFunction82 = classComponentBuilder2.StaticAsyncFunction("create");
                        String name6622 = StaticAsyncFunction82.getName();
                        TypeConverterProvider converters6722 = StaticAsyncFunction82.getConverters();
                        AnyType[] anyTypeArr6822 = new AnyType[1];
                        anyType104 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CreateContactRecord.class), false));
                        if (anyType104 == null) {
                        }
                        anyTypeArr6822[0] = anyType104;
                        StaticAsyncFunction82.setAsyncFunctionComponent(new SuspendFunctionComponent(name6622, anyTypeArr6822, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171(null, this)));
                        AsyncFunctionBuilder StaticAsyncFunction222 = classComponentBuilder2.StaticAsyncFunction("presentCreateForm");
                        String name6722 = StaticAsyncFunction222.getName();
                        TypeConverterProvider converters6822 = StaticAsyncFunction222.getConverters();
                        AnyType[] anyTypeArr6922 = new AnyType[1];
                        anyType105 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CreateContactRecord.class), true));
                        if (anyType105 == null) {
                        }
                        anyTypeArr6922[0] = anyType105;
                        StaticAsyncFunction222.setAsyncFunctionComponent(new SuspendFunctionComponent(name6722, anyTypeArr6922, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173(null, this)));
                        AsyncFunctionBuilder StaticAsyncFunction322 = classComponentBuilder2.StaticAsyncFunction("presentPicker");
                        SuspendFunctionComponent suspendFunctionComponent72 = new SuspendFunctionComponent(StaticAsyncFunction322.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$174(null, this));
                        StaticAsyncFunction322.setAsyncFunctionComponent(suspendFunctionComponent72);
                        SuspendFunctionComponent suspendFunctionComponent222 = suspendFunctionComponent72;
                        AsyncFunctionBuilder StaticAsyncFunction422 = classComponentBuilder2.StaticAsyncFunction("getAll");
                        String name6822 = StaticAsyncFunction422.getName();
                        TypeConverterProvider converters6922 = StaticAsyncFunction422.getConverters();
                        AnyType[] anyTypeArr7022 = new AnyType[1];
                        anyType106 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ContactQueryOptions.class), true));
                        if (anyType106 == null) {
                        }
                        anyTypeArr7022[0] = anyType106;
                        StaticAsyncFunction422.setAsyncFunctionComponent(new SuspendFunctionComponent(name6822, anyTypeArr7022, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$176(null, this)));
                        AsyncFunctionBuilder StaticAsyncFunction522 = classComponentBuilder2.StaticAsyncFunction("getAllDetails");
                        String name6922 = StaticAsyncFunction522.getName();
                        TypeConverterProvider converters7022 = StaticAsyncFunction522.getConverters();
                        AnyType[] anyTypeArr7122 = new AnyType[2];
                        anyType107 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Set.class), false));
                        if (anyType107 == null) {
                        }
                        anyTypeArr7122[0] = anyType107;
                        anyType108 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ContactQueryOptions.class), true));
                        if (anyType108 == null) {
                        }
                        anyTypeArr7122[1] = anyType108;
                        StaticAsyncFunction522.setAsyncFunctionComponent(new SuspendFunctionComponent(name6922, anyTypeArr7122, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179(null, this)));
                        ClassComponentBuilder classComponentBuilder322 = classComponentBuilder;
                        AsyncFunctionBuilder StaticAsyncFunction622 = classComponentBuilder322.StaticAsyncFunction("getCount");
                        SuspendFunctionComponent suspendFunctionComponent322 = new SuspendFunctionComponent(StaticAsyncFunction622.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180(null, this));
                        StaticAsyncFunction622.setAsyncFunctionComponent(suspendFunctionComponent322);
                        SuspendFunctionComponent suspendFunctionComponent422 = suspendFunctionComponent322;
                        AsyncFunctionBuilder StaticAsyncFunction722 = classComponentBuilder322.StaticAsyncFunction("hasAny");
                        SuspendFunctionComponent suspendFunctionComponent522 = new SuspendFunctionComponent(StaticAsyncFunction722.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$181(null, this));
                        StaticAsyncFunction722.setAsyncFunctionComponent(suspendFunctionComponent522);
                        SuspendFunctionComponent suspendFunctionComponent622 = suspendFunctionComponent522;
                        if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                        }
                        classComponentBuilder322.getStaticAsyncFunctions().put("requestPermissionsAsync", intAsyncFunctionComponent);
                        if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                        }
                        classComponentBuilder322.getStaticAsyncFunctions().put("getPermissions", intAsyncFunctionComponent2);
                        moduleDefinitionBuilder2.getClassData().add(classComponentBuilder322.buildClass());
                        ModuleDefinitionBuilder moduleDefinitionBuilder422 = moduleDefinitionBuilder3;
                        moduleDefinitionBuilder422.Events("onContactsChange");
                        moduleDefinitionBuilder422.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$$inlined$OnDestroy$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ContactsObserverDelegate observerDelegate;
                                observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                observerDelegate.stopObservingContactChanges();
                            }
                        }));
                        moduleDefinitionBuilder422.OnStartObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$3
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ContactsObserverDelegate observerDelegate;
                                observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                observerDelegate.startObservingContactChanges();
                            }
                        });
                        moduleDefinitionBuilder422.OnStopObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$4
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ContactsObserverDelegate observerDelegate;
                                observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                observerDelegate.stopObservingContactChanges();
                            }
                        });
                        moduleDefinitionBuilder422.RegisterActivityContracts(new ContactsNextModule$definition$1$5(this, null));
                        ModuleDefinitionData buildModule22 = moduleDefinitionBuilder422.buildModule();
                        Trace.endSection();
                        return buildModule22;
                    }
                } catch (Throwable th18) {
                    th = th18;
                    str2 = str;
                }
                m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl13);
                if (m13473exceptionOrNullimpl2 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl13)) {
                    m13470constructorimpl13 = null;
                }
                typeDescriptor2 = (TypeDescriptor) m13470constructorimpl13;
                if (typeDescriptor2 != null) {
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType10 = new AnyType(typeDescriptor2, converters822);
            }
            anyTypeArr922[1] = anyType10;
            AsyncFunction722.setAsyncFunctionComponent(new SuspendFunctionComponent(name722, anyTypeArr922, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$18(null)));
            AsyncFunctionBuilder AsyncFunction8222 = classComponentBuilder2.AsyncFunction("getFamilyName");
            String name8222 = AsyncFunction8222.getName();
            TypeConverterProvider converters9222 = AsyncFunction8222.getConverters();
            AnyType[] anyTypeArr10222 = new AnyType[1];
            anyType11 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType11 == null) {
                try {
                    Result.Companion companion27 = Result.INSTANCE;
                    m13470constructorimpl14 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$19
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th19) {
                    Result.Companion companion28 = Result.INSTANCE;
                    m13470constructorimpl14 = Result.m13470constructorimpl(ResultKt.createFailure(th19));
                }
                Throwable m13473exceptionOrNullimpl15 = Result.m13473exceptionOrNullimpl(m13470constructorimpl14);
                if (m13473exceptionOrNullimpl15 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl15);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl14)) {
                    m13470constructorimpl14 = null;
                }
                TypeDescriptor typeDescriptor15 = (TypeDescriptor) m13470constructorimpl14;
                if (typeDescriptor15 == null) {
                    typeDescriptor15 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType11 = new AnyType(typeDescriptor15, converters9222);
            }
            anyTypeArr10222[0] = anyType11;
            AsyncFunction8222.setAsyncFunctionComponent(new SuspendFunctionComponent(name8222, anyTypeArr10222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$20(null)));
            AsyncFunctionBuilder AsyncFunction9222 = classComponentBuilder2.AsyncFunction("setFamilyName");
            String name9222 = AsyncFunction9222.getName();
            TypeConverterProvider converters10222 = AsyncFunction9222.getConverters();
            AnyType[] anyTypeArr11222 = new AnyType[2];
            anyType12 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType12 == null) {
                try {
                    Result.Companion companion29 = Result.INSTANCE;
                    m13470constructorimpl15 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$21
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th20) {
                    Result.Companion companion30 = Result.INSTANCE;
                    m13470constructorimpl15 = Result.m13470constructorimpl(ResultKt.createFailure(th20));
                }
                Throwable m13473exceptionOrNullimpl16 = Result.m13473exceptionOrNullimpl(m13470constructorimpl15);
                if (m13473exceptionOrNullimpl16 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl16);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl15)) {
                    m13470constructorimpl15 = null;
                }
                TypeDescriptor typeDescriptor16 = (TypeDescriptor) m13470constructorimpl15;
                if (typeDescriptor16 == null) {
                    typeDescriptor16 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType12 = new AnyType(typeDescriptor16, converters10222);
            }
            anyTypeArr11222[0] = anyType12;
            anyType13 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType13 == null) {
                try {
                    Result.Companion companion31 = Result.INSTANCE;
                    m13470constructorimpl16 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$22
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th21) {
                    Result.Companion companion32 = Result.INSTANCE;
                    m13470constructorimpl16 = Result.m13470constructorimpl(ResultKt.createFailure(th21));
                }
                Throwable m13473exceptionOrNullimpl17 = Result.m13473exceptionOrNullimpl(m13470constructorimpl16);
                if (m13473exceptionOrNullimpl17 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl17);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl16)) {
                    m13470constructorimpl16 = null;
                }
                TypeDescriptor typeDescriptor17 = (TypeDescriptor) m13470constructorimpl16;
                if (typeDescriptor17 == null) {
                    typeDescriptor17 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType13 = new AnyType(typeDescriptor17, converters10222);
            }
            anyTypeArr11222[1] = anyType13;
            AsyncFunction9222.setAsyncFunctionComponent(new SuspendFunctionComponent(name9222, anyTypeArr11222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$23(null)));
            AsyncFunctionBuilder AsyncFunction10222 = classComponentBuilder2.AsyncFunction("getMiddleName");
            String name10222 = AsyncFunction10222.getName();
            TypeConverterProvider converters11222 = AsyncFunction10222.getConverters();
            AnyType[] anyTypeArr12222 = new AnyType[1];
            anyType14 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType14 == null) {
                try {
                    Result.Companion companion33 = Result.INSTANCE;
                    m13470constructorimpl17 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$24
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th22) {
                    Result.Companion companion34 = Result.INSTANCE;
                    m13470constructorimpl17 = Result.m13470constructorimpl(ResultKt.createFailure(th22));
                }
                Throwable m13473exceptionOrNullimpl18 = Result.m13473exceptionOrNullimpl(m13470constructorimpl17);
                if (m13473exceptionOrNullimpl18 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl18);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl17)) {
                    m13470constructorimpl17 = null;
                }
                TypeDescriptor typeDescriptor18 = (TypeDescriptor) m13470constructorimpl17;
                if (typeDescriptor18 == null) {
                    typeDescriptor18 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType14 = new AnyType(typeDescriptor18, converters11222);
            }
            anyTypeArr12222[0] = anyType14;
            AsyncFunction10222.setAsyncFunctionComponent(new SuspendFunctionComponent(name10222, anyTypeArr12222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$25(null)));
            AsyncFunctionBuilder AsyncFunction11222 = classComponentBuilder2.AsyncFunction("setMiddleName");
            String name11222 = AsyncFunction11222.getName();
            TypeConverterProvider converters12222 = AsyncFunction11222.getConverters();
            AnyType[] anyTypeArr13222 = new AnyType[2];
            anyType15 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType15 == null) {
                try {
                    Result.Companion companion35 = Result.INSTANCE;
                    m13470constructorimpl18 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$26
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th23) {
                    Result.Companion companion36 = Result.INSTANCE;
                    m13470constructorimpl18 = Result.m13470constructorimpl(ResultKt.createFailure(th23));
                }
                Throwable m13473exceptionOrNullimpl19 = Result.m13473exceptionOrNullimpl(m13470constructorimpl18);
                if (m13473exceptionOrNullimpl19 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl19);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl18)) {
                    m13470constructorimpl18 = null;
                }
                TypeDescriptor typeDescriptor19 = (TypeDescriptor) m13470constructorimpl18;
                if (typeDescriptor19 == null) {
                    typeDescriptor19 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType15 = new AnyType(typeDescriptor19, converters12222);
            }
            anyTypeArr13222[0] = anyType15;
            anyType16 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType16 == null) {
                try {
                    Result.Companion companion37 = Result.INSTANCE;
                    m13470constructorimpl19 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$27
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th24) {
                    Result.Companion companion38 = Result.INSTANCE;
                    m13470constructorimpl19 = Result.m13470constructorimpl(ResultKt.createFailure(th24));
                }
                Throwable m13473exceptionOrNullimpl20 = Result.m13473exceptionOrNullimpl(m13470constructorimpl19);
                if (m13473exceptionOrNullimpl20 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl20);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl19)) {
                    m13470constructorimpl19 = null;
                }
                TypeDescriptor typeDescriptor20 = (TypeDescriptor) m13470constructorimpl19;
                if (typeDescriptor20 == null) {
                    typeDescriptor20 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType16 = new AnyType(typeDescriptor20, converters12222);
            }
            anyTypeArr13222[1] = anyType16;
            AsyncFunction11222.setAsyncFunctionComponent(new SuspendFunctionComponent(name11222, anyTypeArr13222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$28(null)));
            AsyncFunctionBuilder AsyncFunction12222 = classComponentBuilder2.AsyncFunction("getPrefix");
            String name12222 = AsyncFunction12222.getName();
            TypeConverterProvider converters13222 = AsyncFunction12222.getConverters();
            AnyType[] anyTypeArr14222 = new AnyType[1];
            anyType17 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType17 == null) {
                try {
                    Result.Companion companion39 = Result.INSTANCE;
                    m13470constructorimpl20 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$29
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th25) {
                    Result.Companion companion40 = Result.INSTANCE;
                    m13470constructorimpl20 = Result.m13470constructorimpl(ResultKt.createFailure(th25));
                }
                Throwable m13473exceptionOrNullimpl21 = Result.m13473exceptionOrNullimpl(m13470constructorimpl20);
                if (m13473exceptionOrNullimpl21 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl21);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl20)) {
                    m13470constructorimpl20 = null;
                }
                TypeDescriptor typeDescriptor21 = (TypeDescriptor) m13470constructorimpl20;
                if (typeDescriptor21 == null) {
                    typeDescriptor21 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType17 = new AnyType(typeDescriptor21, converters13222);
            }
            anyTypeArr14222[0] = anyType17;
            AsyncFunction12222.setAsyncFunctionComponent(new SuspendFunctionComponent(name12222, anyTypeArr14222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$30(null)));
            AsyncFunctionBuilder AsyncFunction13222 = classComponentBuilder2.AsyncFunction("setPrefix");
            String name13222 = AsyncFunction13222.getName();
            TypeConverterProvider converters14222 = AsyncFunction13222.getConverters();
            AnyType[] anyTypeArr15222 = new AnyType[2];
            anyType18 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType18 == null) {
                try {
                    Result.Companion companion41 = Result.INSTANCE;
                    m13470constructorimpl21 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$31
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th26) {
                    Result.Companion companion42 = Result.INSTANCE;
                    m13470constructorimpl21 = Result.m13470constructorimpl(ResultKt.createFailure(th26));
                }
                Throwable m13473exceptionOrNullimpl22 = Result.m13473exceptionOrNullimpl(m13470constructorimpl21);
                if (m13473exceptionOrNullimpl22 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl22);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl21)) {
                    m13470constructorimpl21 = null;
                }
                TypeDescriptor typeDescriptor22 = (TypeDescriptor) m13470constructorimpl21;
                if (typeDescriptor22 == null) {
                    typeDescriptor22 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType18 = new AnyType(typeDescriptor22, converters14222);
            }
            anyTypeArr15222[0] = anyType18;
            anyType19 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType19 == null) {
                try {
                    Result.Companion companion43 = Result.INSTANCE;
                    m13470constructorimpl22 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$32
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th27) {
                    Result.Companion companion44 = Result.INSTANCE;
                    m13470constructorimpl22 = Result.m13470constructorimpl(ResultKt.createFailure(th27));
                }
                Throwable m13473exceptionOrNullimpl23 = Result.m13473exceptionOrNullimpl(m13470constructorimpl22);
                if (m13473exceptionOrNullimpl23 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl23);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl22)) {
                    m13470constructorimpl22 = null;
                }
                TypeDescriptor typeDescriptor23 = (TypeDescriptor) m13470constructorimpl22;
                if (typeDescriptor23 == null) {
                    typeDescriptor23 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType19 = new AnyType(typeDescriptor23, converters14222);
            }
            anyTypeArr15222[1] = anyType19;
            AsyncFunction13222.setAsyncFunctionComponent(new SuspendFunctionComponent(name13222, anyTypeArr15222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$33(null)));
            AsyncFunctionBuilder AsyncFunction14222 = classComponentBuilder2.AsyncFunction("getSuffix");
            String name14222 = AsyncFunction14222.getName();
            TypeConverterProvider converters15222 = AsyncFunction14222.getConverters();
            AnyType[] anyTypeArr16222 = new AnyType[1];
            anyType20 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType20 == null) {
                try {
                    Result.Companion companion45 = Result.INSTANCE;
                    m13470constructorimpl23 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$34
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th28) {
                    Result.Companion companion46 = Result.INSTANCE;
                    m13470constructorimpl23 = Result.m13470constructorimpl(ResultKt.createFailure(th28));
                }
                Throwable m13473exceptionOrNullimpl24 = Result.m13473exceptionOrNullimpl(m13470constructorimpl23);
                if (m13473exceptionOrNullimpl24 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl24);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl23)) {
                    m13470constructorimpl23 = null;
                }
                TypeDescriptor typeDescriptor24 = (TypeDescriptor) m13470constructorimpl23;
                if (typeDescriptor24 == null) {
                    typeDescriptor24 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType20 = new AnyType(typeDescriptor24, converters15222);
            }
            anyTypeArr16222[0] = anyType20;
            AsyncFunction14222.setAsyncFunctionComponent(new SuspendFunctionComponent(name14222, anyTypeArr16222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$35(null)));
            AsyncFunctionBuilder AsyncFunction15222 = classComponentBuilder2.AsyncFunction("setSuffix");
            String name15222 = AsyncFunction15222.getName();
            TypeConverterProvider converters16222 = AsyncFunction15222.getConverters();
            AnyType[] anyTypeArr17222 = new AnyType[2];
            anyType21 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType21 == null) {
                try {
                    Result.Companion companion47 = Result.INSTANCE;
                    m13470constructorimpl24 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$36
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th29) {
                    Result.Companion companion48 = Result.INSTANCE;
                    m13470constructorimpl24 = Result.m13470constructorimpl(ResultKt.createFailure(th29));
                }
                Throwable m13473exceptionOrNullimpl25 = Result.m13473exceptionOrNullimpl(m13470constructorimpl24);
                if (m13473exceptionOrNullimpl25 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl25);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl24)) {
                    m13470constructorimpl24 = null;
                }
                TypeDescriptor typeDescriptor25 = (TypeDescriptor) m13470constructorimpl24;
                if (typeDescriptor25 == null) {
                    typeDescriptor25 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType21 = new AnyType(typeDescriptor25, converters16222);
            }
            anyTypeArr17222[0] = anyType21;
            anyType22 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType22 == null) {
                try {
                    Result.Companion companion49 = Result.INSTANCE;
                    m13470constructorimpl25 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$37
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th30) {
                    Result.Companion companion50 = Result.INSTANCE;
                    m13470constructorimpl25 = Result.m13470constructorimpl(ResultKt.createFailure(th30));
                }
                Throwable m13473exceptionOrNullimpl26 = Result.m13473exceptionOrNullimpl(m13470constructorimpl25);
                if (m13473exceptionOrNullimpl26 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl26);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl25)) {
                    m13470constructorimpl25 = null;
                }
                TypeDescriptor typeDescriptor26 = (TypeDescriptor) m13470constructorimpl25;
                if (typeDescriptor26 == null) {
                    typeDescriptor26 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType22 = new AnyType(typeDescriptor26, converters16222);
            }
            anyTypeArr17222[1] = anyType22;
            AsyncFunction15222.setAsyncFunctionComponent(new SuspendFunctionComponent(name15222, anyTypeArr17222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$38(null)));
            AsyncFunctionBuilder AsyncFunction16222 = classComponentBuilder2.AsyncFunction("getPhoneticGivenName");
            String name16222 = AsyncFunction16222.getName();
            TypeConverterProvider converters17222 = AsyncFunction16222.getConverters();
            AnyType[] anyTypeArr18222 = new AnyType[1];
            anyType23 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType23 == null) {
                try {
                    Result.Companion companion51 = Result.INSTANCE;
                    m13470constructorimpl26 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$39
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th31) {
                    Result.Companion companion52 = Result.INSTANCE;
                    m13470constructorimpl26 = Result.m13470constructorimpl(ResultKt.createFailure(th31));
                }
                Throwable m13473exceptionOrNullimpl27 = Result.m13473exceptionOrNullimpl(m13470constructorimpl26);
                if (m13473exceptionOrNullimpl27 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl27);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl26)) {
                    m13470constructorimpl26 = null;
                }
                TypeDescriptor typeDescriptor27 = (TypeDescriptor) m13470constructorimpl26;
                if (typeDescriptor27 == null) {
                    typeDescriptor27 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType23 = new AnyType(typeDescriptor27, converters17222);
            }
            anyTypeArr18222[0] = anyType23;
            AsyncFunction16222.setAsyncFunctionComponent(new SuspendFunctionComponent(name16222, anyTypeArr18222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$40(null)));
            AsyncFunctionBuilder AsyncFunction17222 = classComponentBuilder2.AsyncFunction("setPhoneticGivenName");
            String name17222 = AsyncFunction17222.getName();
            TypeConverterProvider converters18222 = AsyncFunction17222.getConverters();
            AnyType[] anyTypeArr19222 = new AnyType[2];
            anyType24 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType24 == null) {
                try {
                    Result.Companion companion53 = Result.INSTANCE;
                    m13470constructorimpl27 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$41
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th32) {
                    Result.Companion companion54 = Result.INSTANCE;
                    m13470constructorimpl27 = Result.m13470constructorimpl(ResultKt.createFailure(th32));
                }
                Throwable m13473exceptionOrNullimpl28 = Result.m13473exceptionOrNullimpl(m13470constructorimpl27);
                if (m13473exceptionOrNullimpl28 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl28);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl27)) {
                    m13470constructorimpl27 = null;
                }
                TypeDescriptor typeDescriptor28 = (TypeDescriptor) m13470constructorimpl27;
                if (typeDescriptor28 == null) {
                    typeDescriptor28 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType24 = new AnyType(typeDescriptor28, converters18222);
            }
            anyTypeArr19222[0] = anyType24;
            anyType25 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType25 == null) {
                try {
                    Result.Companion companion55 = Result.INSTANCE;
                    m13470constructorimpl28 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$42
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th33) {
                    Result.Companion companion56 = Result.INSTANCE;
                    m13470constructorimpl28 = Result.m13470constructorimpl(ResultKt.createFailure(th33));
                }
                Throwable m13473exceptionOrNullimpl29 = Result.m13473exceptionOrNullimpl(m13470constructorimpl28);
                if (m13473exceptionOrNullimpl29 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl29);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl28)) {
                    m13470constructorimpl28 = null;
                }
                TypeDescriptor typeDescriptor29 = (TypeDescriptor) m13470constructorimpl28;
                if (typeDescriptor29 == null) {
                    typeDescriptor29 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType25 = new AnyType(typeDescriptor29, converters18222);
            }
            anyTypeArr19222[1] = anyType25;
            AsyncFunction17222.setAsyncFunctionComponent(new SuspendFunctionComponent(name17222, anyTypeArr19222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$43(null)));
            AsyncFunctionBuilder AsyncFunction18222 = classComponentBuilder2.AsyncFunction("getPhoneticMiddleName");
            String name18222 = AsyncFunction18222.getName();
            TypeConverterProvider converters19222 = AsyncFunction18222.getConverters();
            AnyType[] anyTypeArr20222 = new AnyType[1];
            anyType26 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType26 == null) {
                try {
                    Result.Companion companion57 = Result.INSTANCE;
                    m13470constructorimpl29 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$44
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th34) {
                    Result.Companion companion58 = Result.INSTANCE;
                    m13470constructorimpl29 = Result.m13470constructorimpl(ResultKt.createFailure(th34));
                }
                Throwable m13473exceptionOrNullimpl30 = Result.m13473exceptionOrNullimpl(m13470constructorimpl29);
                if (m13473exceptionOrNullimpl30 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl30);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl29)) {
                    m13470constructorimpl29 = null;
                }
                TypeDescriptor typeDescriptor30 = (TypeDescriptor) m13470constructorimpl29;
                if (typeDescriptor30 == null) {
                    typeDescriptor30 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType26 = new AnyType(typeDescriptor30, converters19222);
            }
            anyTypeArr20222[0] = anyType26;
            AsyncFunction18222.setAsyncFunctionComponent(new SuspendFunctionComponent(name18222, anyTypeArr20222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$45(null)));
            AsyncFunctionBuilder AsyncFunction19222 = classComponentBuilder2.AsyncFunction("setPhoneticMiddleName");
            String name19222 = AsyncFunction19222.getName();
            TypeConverterProvider converters20222 = AsyncFunction19222.getConverters();
            AnyType[] anyTypeArr21222 = new AnyType[2];
            anyType27 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType27 == null) {
                try {
                    Result.Companion companion59 = Result.INSTANCE;
                    m13470constructorimpl30 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$46
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th35) {
                    Result.Companion companion60 = Result.INSTANCE;
                    m13470constructorimpl30 = Result.m13470constructorimpl(ResultKt.createFailure(th35));
                }
                Throwable m13473exceptionOrNullimpl31 = Result.m13473exceptionOrNullimpl(m13470constructorimpl30);
                if (m13473exceptionOrNullimpl31 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl31);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl30)) {
                    m13470constructorimpl30 = null;
                }
                TypeDescriptor typeDescriptor31 = (TypeDescriptor) m13470constructorimpl30;
                if (typeDescriptor31 == null) {
                    typeDescriptor31 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType27 = new AnyType(typeDescriptor31, converters20222);
            }
            anyTypeArr21222[0] = anyType27;
            anyType28 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType28 == null) {
                try {
                    Result.Companion companion61 = Result.INSTANCE;
                    m13470constructorimpl31 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$47
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th36) {
                    Result.Companion companion62 = Result.INSTANCE;
                    m13470constructorimpl31 = Result.m13470constructorimpl(ResultKt.createFailure(th36));
                }
                Throwable m13473exceptionOrNullimpl32 = Result.m13473exceptionOrNullimpl(m13470constructorimpl31);
                if (m13473exceptionOrNullimpl32 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl32);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl31)) {
                    m13470constructorimpl31 = null;
                }
                TypeDescriptor typeDescriptor32 = (TypeDescriptor) m13470constructorimpl31;
                if (typeDescriptor32 == null) {
                    typeDescriptor32 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType28 = new AnyType(typeDescriptor32, converters20222);
            }
            anyTypeArr21222[1] = anyType28;
            AsyncFunction19222.setAsyncFunctionComponent(new SuspendFunctionComponent(name19222, anyTypeArr21222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$48(null)));
            AsyncFunctionBuilder AsyncFunction20222 = classComponentBuilder2.AsyncFunction("getPhoneticFamilyName");
            String name20222 = AsyncFunction20222.getName();
            TypeConverterProvider converters21222 = AsyncFunction20222.getConverters();
            AnyType[] anyTypeArr22222 = new AnyType[1];
            anyType29 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType29 == null) {
                try {
                    Result.Companion companion63 = Result.INSTANCE;
                    m13470constructorimpl32 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$49
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th37) {
                    Result.Companion companion64 = Result.INSTANCE;
                    m13470constructorimpl32 = Result.m13470constructorimpl(ResultKt.createFailure(th37));
                }
                Throwable m13473exceptionOrNullimpl33 = Result.m13473exceptionOrNullimpl(m13470constructorimpl32);
                if (m13473exceptionOrNullimpl33 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl33);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl32)) {
                    m13470constructorimpl32 = null;
                }
                TypeDescriptor typeDescriptor33 = (TypeDescriptor) m13470constructorimpl32;
                if (typeDescriptor33 == null) {
                    typeDescriptor33 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType29 = new AnyType(typeDescriptor33, converters21222);
            }
            anyTypeArr22222[0] = anyType29;
            AsyncFunction20222.setAsyncFunctionComponent(new SuspendFunctionComponent(name20222, anyTypeArr22222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$50(null)));
            AsyncFunctionBuilder AsyncFunction21222 = classComponentBuilder2.AsyncFunction("setPhoneticFamilyName");
            String name21222 = AsyncFunction21222.getName();
            TypeConverterProvider converters22222 = AsyncFunction21222.getConverters();
            AnyType[] anyTypeArr23222 = new AnyType[2];
            anyType30 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType30 == null) {
                try {
                    Result.Companion companion65 = Result.INSTANCE;
                    m13470constructorimpl33 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$51
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th38) {
                    Result.Companion companion66 = Result.INSTANCE;
                    m13470constructorimpl33 = Result.m13470constructorimpl(ResultKt.createFailure(th38));
                }
                Throwable m13473exceptionOrNullimpl34 = Result.m13473exceptionOrNullimpl(m13470constructorimpl33);
                if (m13473exceptionOrNullimpl34 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl34);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl33)) {
                    m13470constructorimpl33 = null;
                }
                TypeDescriptor typeDescriptor34 = (TypeDescriptor) m13470constructorimpl33;
                if (typeDescriptor34 == null) {
                    typeDescriptor34 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType30 = new AnyType(typeDescriptor34, converters22222);
            }
            anyTypeArr23222[0] = anyType30;
            anyType31 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType31 == null) {
                try {
                    Result.Companion companion67 = Result.INSTANCE;
                    m13470constructorimpl34 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$52
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th39) {
                    Result.Companion companion68 = Result.INSTANCE;
                    m13470constructorimpl34 = Result.m13470constructorimpl(ResultKt.createFailure(th39));
                }
                Throwable m13473exceptionOrNullimpl35 = Result.m13473exceptionOrNullimpl(m13470constructorimpl34);
                if (m13473exceptionOrNullimpl35 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl35);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl34)) {
                    m13470constructorimpl34 = null;
                }
                TypeDescriptor typeDescriptor35 = (TypeDescriptor) m13470constructorimpl34;
                if (typeDescriptor35 == null) {
                    typeDescriptor35 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType31 = new AnyType(typeDescriptor35, converters22222);
            }
            anyTypeArr23222[1] = anyType31;
            AsyncFunction21222.setAsyncFunctionComponent(new SuspendFunctionComponent(name21222, anyTypeArr23222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$53(null)));
            AsyncFunctionBuilder AsyncFunction22222 = classComponentBuilder2.AsyncFunction("getCompany");
            String name22222 = AsyncFunction22222.getName();
            TypeConverterProvider converters23222 = AsyncFunction22222.getConverters();
            AnyType[] anyTypeArr24222 = new AnyType[1];
            anyType32 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType32 == null) {
                try {
                    Result.Companion companion69 = Result.INSTANCE;
                    m13470constructorimpl35 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$54
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th40) {
                    Result.Companion companion70 = Result.INSTANCE;
                    m13470constructorimpl35 = Result.m13470constructorimpl(ResultKt.createFailure(th40));
                }
                Throwable m13473exceptionOrNullimpl36 = Result.m13473exceptionOrNullimpl(m13470constructorimpl35);
                if (m13473exceptionOrNullimpl36 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl36);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl35)) {
                    m13470constructorimpl35 = null;
                }
                TypeDescriptor typeDescriptor36 = (TypeDescriptor) m13470constructorimpl35;
                if (typeDescriptor36 == null) {
                    typeDescriptor36 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType32 = new AnyType(typeDescriptor36, converters23222);
            }
            anyTypeArr24222[0] = anyType32;
            AsyncFunction22222.setAsyncFunctionComponent(new SuspendFunctionComponent(name22222, anyTypeArr24222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$55(null)));
            AsyncFunctionBuilder AsyncFunction23222 = classComponentBuilder2.AsyncFunction("setCompany");
            String name23222 = AsyncFunction23222.getName();
            TypeConverterProvider converters24222 = AsyncFunction23222.getConverters();
            AnyType[] anyTypeArr25222 = new AnyType[2];
            anyType33 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType33 == null) {
                try {
                    Result.Companion companion71 = Result.INSTANCE;
                    m13470constructorimpl36 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$56
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th41) {
                    Result.Companion companion72 = Result.INSTANCE;
                    m13470constructorimpl36 = Result.m13470constructorimpl(ResultKt.createFailure(th41));
                }
                Throwable m13473exceptionOrNullimpl37 = Result.m13473exceptionOrNullimpl(m13470constructorimpl36);
                if (m13473exceptionOrNullimpl37 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl37);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl36)) {
                    m13470constructorimpl36 = null;
                }
                TypeDescriptor typeDescriptor37 = (TypeDescriptor) m13470constructorimpl36;
                if (typeDescriptor37 == null) {
                    typeDescriptor37 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType33 = new AnyType(typeDescriptor37, converters24222);
            }
            anyTypeArr25222[0] = anyType33;
            anyType34 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType34 == null) {
                try {
                    Result.Companion companion73 = Result.INSTANCE;
                    m13470constructorimpl37 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$57
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th42) {
                    Result.Companion companion74 = Result.INSTANCE;
                    m13470constructorimpl37 = Result.m13470constructorimpl(ResultKt.createFailure(th42));
                }
                Throwable m13473exceptionOrNullimpl38 = Result.m13473exceptionOrNullimpl(m13470constructorimpl37);
                if (m13473exceptionOrNullimpl38 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl38);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl37)) {
                    m13470constructorimpl37 = null;
                }
                TypeDescriptor typeDescriptor38 = (TypeDescriptor) m13470constructorimpl37;
                if (typeDescriptor38 == null) {
                    typeDescriptor38 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType34 = new AnyType(typeDescriptor38, converters24222);
            }
            anyTypeArr25222[1] = anyType34;
            AsyncFunction23222.setAsyncFunctionComponent(new SuspendFunctionComponent(name23222, anyTypeArr25222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$58(null)));
            AsyncFunctionBuilder AsyncFunction24222 = classComponentBuilder2.AsyncFunction("getDepartment");
            String name24222 = AsyncFunction24222.getName();
            TypeConverterProvider converters25222 = AsyncFunction24222.getConverters();
            AnyType[] anyTypeArr26222 = new AnyType[1];
            anyType35 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType35 == null) {
                try {
                    Result.Companion companion75 = Result.INSTANCE;
                    m13470constructorimpl38 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$59
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th43) {
                    Result.Companion companion76 = Result.INSTANCE;
                    m13470constructorimpl38 = Result.m13470constructorimpl(ResultKt.createFailure(th43));
                }
                Throwable m13473exceptionOrNullimpl39 = Result.m13473exceptionOrNullimpl(m13470constructorimpl38);
                if (m13473exceptionOrNullimpl39 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl39);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl38)) {
                    m13470constructorimpl38 = null;
                }
                TypeDescriptor typeDescriptor39 = (TypeDescriptor) m13470constructorimpl38;
                if (typeDescriptor39 == null) {
                    typeDescriptor39 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType35 = new AnyType(typeDescriptor39, converters25222);
            }
            anyTypeArr26222[0] = anyType35;
            AsyncFunction24222.setAsyncFunctionComponent(new SuspendFunctionComponent(name24222, anyTypeArr26222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$60(null)));
            AsyncFunctionBuilder AsyncFunction25222 = classComponentBuilder2.AsyncFunction("setDepartment");
            String name25222 = AsyncFunction25222.getName();
            TypeConverterProvider converters26222 = AsyncFunction25222.getConverters();
            AnyType[] anyTypeArr27222 = new AnyType[2];
            anyType36 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType36 == null) {
                try {
                    Result.Companion companion77 = Result.INSTANCE;
                    m13470constructorimpl39 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$61
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th44) {
                    Result.Companion companion78 = Result.INSTANCE;
                    m13470constructorimpl39 = Result.m13470constructorimpl(ResultKt.createFailure(th44));
                }
                Throwable m13473exceptionOrNullimpl40 = Result.m13473exceptionOrNullimpl(m13470constructorimpl39);
                if (m13473exceptionOrNullimpl40 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl40);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl39)) {
                    m13470constructorimpl39 = null;
                }
                TypeDescriptor typeDescriptor40 = (TypeDescriptor) m13470constructorimpl39;
                if (typeDescriptor40 == null) {
                    typeDescriptor40 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType36 = new AnyType(typeDescriptor40, converters26222);
            }
            anyTypeArr27222[0] = anyType36;
            anyType37 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType37 == null) {
                try {
                    Result.Companion companion79 = Result.INSTANCE;
                    m13470constructorimpl40 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$62
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th45) {
                    Result.Companion companion80 = Result.INSTANCE;
                    m13470constructorimpl40 = Result.m13470constructorimpl(ResultKt.createFailure(th45));
                }
                Throwable m13473exceptionOrNullimpl41 = Result.m13473exceptionOrNullimpl(m13470constructorimpl40);
                if (m13473exceptionOrNullimpl41 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl41);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl40)) {
                    m13470constructorimpl40 = null;
                }
                TypeDescriptor typeDescriptor41 = (TypeDescriptor) m13470constructorimpl40;
                if (typeDescriptor41 == null) {
                    typeDescriptor41 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType37 = new AnyType(typeDescriptor41, converters26222);
            }
            anyTypeArr27222[1] = anyType37;
            AsyncFunction25222.setAsyncFunctionComponent(new SuspendFunctionComponent(name25222, anyTypeArr27222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$63(null)));
            AsyncFunctionBuilder AsyncFunction26222 = classComponentBuilder2.AsyncFunction("getJobTitle");
            String name26222 = AsyncFunction26222.getName();
            TypeConverterProvider converters27222 = AsyncFunction26222.getConverters();
            AnyType[] anyTypeArr28222 = new AnyType[1];
            anyType38 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType38 == null) {
                try {
                    Result.Companion companion81 = Result.INSTANCE;
                    m13470constructorimpl41 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$64
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th46) {
                    Result.Companion companion83 = Result.INSTANCE;
                    m13470constructorimpl41 = Result.m13470constructorimpl(ResultKt.createFailure(th46));
                }
                Throwable m13473exceptionOrNullimpl42 = Result.m13473exceptionOrNullimpl(m13470constructorimpl41);
                if (m13473exceptionOrNullimpl42 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl42);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl41)) {
                    m13470constructorimpl41 = null;
                }
                TypeDescriptor typeDescriptor42 = (TypeDescriptor) m13470constructorimpl41;
                if (typeDescriptor42 == null) {
                    typeDescriptor42 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType38 = new AnyType(typeDescriptor42, converters27222);
            }
            anyTypeArr28222[0] = anyType38;
            AsyncFunction26222.setAsyncFunctionComponent(new SuspendFunctionComponent(name26222, anyTypeArr28222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$65(null)));
            AsyncFunctionBuilder AsyncFunction27222 = classComponentBuilder2.AsyncFunction("setJobTitle");
            String name27222 = AsyncFunction27222.getName();
            TypeConverterProvider converters28222 = AsyncFunction27222.getConverters();
            AnyType[] anyTypeArr29222 = new AnyType[2];
            anyType39 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType39 == null) {
                try {
                    Result.Companion companion84 = Result.INSTANCE;
                    m13470constructorimpl42 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$66
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th47) {
                    Result.Companion companion85 = Result.INSTANCE;
                    m13470constructorimpl42 = Result.m13470constructorimpl(ResultKt.createFailure(th47));
                }
                Throwable m13473exceptionOrNullimpl43 = Result.m13473exceptionOrNullimpl(m13470constructorimpl42);
                if (m13473exceptionOrNullimpl43 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl43);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl42)) {
                    m13470constructorimpl42 = null;
                }
                TypeDescriptor typeDescriptor43 = (TypeDescriptor) m13470constructorimpl42;
                if (typeDescriptor43 == null) {
                    typeDescriptor43 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType39 = new AnyType(typeDescriptor43, converters28222);
            }
            anyTypeArr29222[0] = anyType39;
            anyType40 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType40 == null) {
                try {
                    Result.Companion companion86 = Result.INSTANCE;
                    m13470constructorimpl43 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$67
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th48) {
                    Result.Companion companion87 = Result.INSTANCE;
                    m13470constructorimpl43 = Result.m13470constructorimpl(ResultKt.createFailure(th48));
                }
                Throwable m13473exceptionOrNullimpl44 = Result.m13473exceptionOrNullimpl(m13470constructorimpl43);
                if (m13473exceptionOrNullimpl44 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl44);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl43)) {
                    m13470constructorimpl43 = null;
                }
                TypeDescriptor typeDescriptor44 = (TypeDescriptor) m13470constructorimpl43;
                if (typeDescriptor44 == null) {
                    typeDescriptor44 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType40 = new AnyType(typeDescriptor44, converters28222);
            }
            anyTypeArr29222[1] = anyType40;
            AsyncFunction27222.setAsyncFunctionComponent(new SuspendFunctionComponent(name27222, anyTypeArr29222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$68(null)));
            AsyncFunctionBuilder AsyncFunction28222 = classComponentBuilder2.AsyncFunction("getPhoneticCompanyName");
            String name28222 = AsyncFunction28222.getName();
            TypeConverterProvider converters29222 = AsyncFunction28222.getConverters();
            AnyType[] anyTypeArr30222 = new AnyType[1];
            anyType41 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType41 == null) {
                try {
                    Result.Companion companion88 = Result.INSTANCE;
                    m13470constructorimpl44 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$69
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th49) {
                    Result.Companion companion89 = Result.INSTANCE;
                    m13470constructorimpl44 = Result.m13470constructorimpl(ResultKt.createFailure(th49));
                }
                Throwable m13473exceptionOrNullimpl45 = Result.m13473exceptionOrNullimpl(m13470constructorimpl44);
                if (m13473exceptionOrNullimpl45 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl45);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl44)) {
                    m13470constructorimpl44 = null;
                }
                TypeDescriptor typeDescriptor45 = (TypeDescriptor) m13470constructorimpl44;
                if (typeDescriptor45 == null) {
                    typeDescriptor45 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType41 = new AnyType(typeDescriptor45, converters29222);
            }
            anyTypeArr30222[0] = anyType41;
            AsyncFunction28222.setAsyncFunctionComponent(new SuspendFunctionComponent(name28222, anyTypeArr30222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$70(null)));
            AsyncFunctionBuilder AsyncFunction29222 = classComponentBuilder2.AsyncFunction("setPhoneticCompanyName");
            String name29222 = AsyncFunction29222.getName();
            TypeConverterProvider converters30222 = AsyncFunction29222.getConverters();
            AnyType[] anyTypeArr31222 = new AnyType[2];
            anyType42 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType42 == null) {
                try {
                    Result.Companion companion90 = Result.INSTANCE;
                    m13470constructorimpl45 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$71
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th50) {
                    Result.Companion companion91 = Result.INSTANCE;
                    m13470constructorimpl45 = Result.m13470constructorimpl(ResultKt.createFailure(th50));
                }
                Throwable m13473exceptionOrNullimpl46 = Result.m13473exceptionOrNullimpl(m13470constructorimpl45);
                if (m13473exceptionOrNullimpl46 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl46);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl45)) {
                    m13470constructorimpl45 = null;
                }
                TypeDescriptor typeDescriptor46 = (TypeDescriptor) m13470constructorimpl45;
                if (typeDescriptor46 == null) {
                    typeDescriptor46 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType42 = new AnyType(typeDescriptor46, converters30222);
            }
            anyTypeArr31222[0] = anyType42;
            anyType43 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType43 == null) {
                try {
                    Result.Companion companion92 = Result.INSTANCE;
                    m13470constructorimpl46 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$72
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th51) {
                    Result.Companion companion93 = Result.INSTANCE;
                    m13470constructorimpl46 = Result.m13470constructorimpl(ResultKt.createFailure(th51));
                }
                Throwable m13473exceptionOrNullimpl47 = Result.m13473exceptionOrNullimpl(m13470constructorimpl46);
                if (m13473exceptionOrNullimpl47 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl47);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl46)) {
                    m13470constructorimpl46 = null;
                }
                TypeDescriptor typeDescriptor47 = (TypeDescriptor) m13470constructorimpl46;
                if (typeDescriptor47 == null) {
                    typeDescriptor47 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType43 = new AnyType(typeDescriptor47, converters30222);
            }
            anyTypeArr31222[1] = anyType43;
            AsyncFunction29222.setAsyncFunctionComponent(new SuspendFunctionComponent(name29222, anyTypeArr31222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$73(null)));
            AsyncFunctionBuilder AsyncFunction30222 = classComponentBuilder2.AsyncFunction("getNote");
            String name30222 = AsyncFunction30222.getName();
            TypeConverterProvider converters31222 = AsyncFunction30222.getConverters();
            AnyType[] anyTypeArr32222 = new AnyType[1];
            anyType44 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType44 == null) {
                try {
                    Result.Companion companion94 = Result.INSTANCE;
                    m13470constructorimpl47 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$74
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th52) {
                    Result.Companion companion95 = Result.INSTANCE;
                    m13470constructorimpl47 = Result.m13470constructorimpl(ResultKt.createFailure(th52));
                }
                Throwable m13473exceptionOrNullimpl48 = Result.m13473exceptionOrNullimpl(m13470constructorimpl47);
                if (m13473exceptionOrNullimpl48 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl48);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl47)) {
                    m13470constructorimpl47 = null;
                }
                TypeDescriptor typeDescriptor48 = (TypeDescriptor) m13470constructorimpl47;
                if (typeDescriptor48 == null) {
                    typeDescriptor48 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType44 = new AnyType(typeDescriptor48, converters31222);
            }
            anyTypeArr32222[0] = anyType44;
            AsyncFunction30222.setAsyncFunctionComponent(new SuspendFunctionComponent(name30222, anyTypeArr32222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$75(null)));
            AsyncFunctionBuilder AsyncFunction31222 = classComponentBuilder2.AsyncFunction("setNote");
            String name31222 = AsyncFunction31222.getName();
            TypeConverterProvider converters32222 = AsyncFunction31222.getConverters();
            AnyType[] anyTypeArr33222 = new AnyType[2];
            anyType45 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType45 == null) {
                try {
                    Result.Companion companion96 = Result.INSTANCE;
                    m13470constructorimpl48 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$76
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th53) {
                    Result.Companion companion97 = Result.INSTANCE;
                    m13470constructorimpl48 = Result.m13470constructorimpl(ResultKt.createFailure(th53));
                }
                Throwable m13473exceptionOrNullimpl49 = Result.m13473exceptionOrNullimpl(m13470constructorimpl48);
                if (m13473exceptionOrNullimpl49 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl49);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl48)) {
                    m13470constructorimpl48 = null;
                }
                TypeDescriptor typeDescriptor49 = (TypeDescriptor) m13470constructorimpl48;
                if (typeDescriptor49 == null) {
                    typeDescriptor49 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType45 = new AnyType(typeDescriptor49, converters32222);
            }
            anyTypeArr33222[0] = anyType45;
            anyType46 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType46 == null) {
                try {
                    Result.Companion companion98 = Result.INSTANCE;
                    m13470constructorimpl49 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$77
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th54) {
                    Result.Companion companion99 = Result.INSTANCE;
                    m13470constructorimpl49 = Result.m13470constructorimpl(ResultKt.createFailure(th54));
                }
                Throwable m13473exceptionOrNullimpl50 = Result.m13473exceptionOrNullimpl(m13470constructorimpl49);
                if (m13473exceptionOrNullimpl50 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl50);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl49)) {
                    m13470constructorimpl49 = null;
                }
                TypeDescriptor typeDescriptor50 = (TypeDescriptor) m13470constructorimpl49;
                if (typeDescriptor50 == null) {
                    typeDescriptor50 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType46 = new AnyType(typeDescriptor50, converters32222);
            }
            anyTypeArr33222[1] = anyType46;
            AsyncFunction31222.setAsyncFunctionComponent(new SuspendFunctionComponent(name31222, anyTypeArr33222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$78(null)));
            AsyncFunctionBuilder AsyncFunction32222 = classComponentBuilder2.AsyncFunction("getImage");
            String name32222 = AsyncFunction32222.getName();
            TypeConverterProvider converters33222 = AsyncFunction32222.getConverters();
            AnyType[] anyTypeArr34222 = new AnyType[1];
            anyType47 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType47 == null) {
                try {
                    Result.Companion companion100 = Result.INSTANCE;
                    m13470constructorimpl50 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$79
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th55) {
                    Result.Companion companion101 = Result.INSTANCE;
                    m13470constructorimpl50 = Result.m13470constructorimpl(ResultKt.createFailure(th55));
                }
                Throwable m13473exceptionOrNullimpl51 = Result.m13473exceptionOrNullimpl(m13470constructorimpl50);
                if (m13473exceptionOrNullimpl51 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl51);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl50)) {
                    m13470constructorimpl50 = null;
                }
                TypeDescriptor typeDescriptor51 = (TypeDescriptor) m13470constructorimpl50;
                if (typeDescriptor51 == null) {
                    typeDescriptor51 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType47 = new AnyType(typeDescriptor51, converters33222);
            }
            anyTypeArr34222[0] = anyType47;
            AsyncFunction32222.setAsyncFunctionComponent(new SuspendFunctionComponent(name32222, anyTypeArr34222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$80(null)));
            AsyncFunctionBuilder AsyncFunction33222 = classComponentBuilder2.AsyncFunction("setImage");
            String name33222 = AsyncFunction33222.getName();
            TypeConverterProvider converters34222 = AsyncFunction33222.getConverters();
            AnyType[] anyTypeArr35222 = new AnyType[2];
            anyType48 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType48 == null) {
                try {
                    Result.Companion companion102 = Result.INSTANCE;
                    m13470constructorimpl51 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$81
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th56) {
                    Result.Companion companion103 = Result.INSTANCE;
                    m13470constructorimpl51 = Result.m13470constructorimpl(ResultKt.createFailure(th56));
                }
                Throwable m13473exceptionOrNullimpl52 = Result.m13473exceptionOrNullimpl(m13470constructorimpl51);
                if (m13473exceptionOrNullimpl52 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl52);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl51)) {
                    m13470constructorimpl51 = null;
                }
                TypeDescriptor typeDescriptor52 = (TypeDescriptor) m13470constructorimpl51;
                if (typeDescriptor52 == null) {
                    typeDescriptor52 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType48 = new AnyType(typeDescriptor52, converters34222);
            }
            anyTypeArr35222[0] = anyType48;
            anyType49 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType49 == null) {
                try {
                    Result.Companion companion104 = Result.INSTANCE;
                    m13470constructorimpl52 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple(str2, Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$82
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th57) {
                    Result.Companion companion105 = Result.INSTANCE;
                    m13470constructorimpl52 = Result.m13470constructorimpl(ResultKt.createFailure(th57));
                }
                Throwable m13473exceptionOrNullimpl53 = Result.m13473exceptionOrNullimpl(m13470constructorimpl52);
                if (m13473exceptionOrNullimpl53 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl53);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl52)) {
                    m13470constructorimpl52 = null;
                }
                TypeDescriptor typeDescriptor53 = (TypeDescriptor) m13470constructorimpl52;
                if (typeDescriptor53 == null) {
                    typeDescriptor53 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType49 = new AnyType(typeDescriptor53, converters34222);
            }
            anyTypeArr35222[1] = anyType49;
            AsyncFunction33222.setAsyncFunctionComponent(new SuspendFunctionComponent(name33222, anyTypeArr35222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$83(null)));
            AsyncFunctionBuilder AsyncFunction34222 = classComponentBuilder2.AsyncFunction("getThumbnail");
            String name34222 = AsyncFunction34222.getName();
            TypeConverterProvider converters35222 = AsyncFunction34222.getConverters();
            AnyType[] anyTypeArr36222 = new AnyType[1];
            anyType50 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType50 == null) {
                try {
                    Result.Companion companion106 = Result.INSTANCE;
                    m13470constructorimpl53 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$84
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th58) {
                    Result.Companion companion107 = Result.INSTANCE;
                    m13470constructorimpl53 = Result.m13470constructorimpl(ResultKt.createFailure(th58));
                }
                Throwable m13473exceptionOrNullimpl54 = Result.m13473exceptionOrNullimpl(m13470constructorimpl53);
                if (m13473exceptionOrNullimpl54 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl54);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl53)) {
                    m13470constructorimpl53 = null;
                }
                TypeDescriptor typeDescriptor54 = (TypeDescriptor) m13470constructorimpl53;
                if (typeDescriptor54 == null) {
                    typeDescriptor54 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType50 = new AnyType(typeDescriptor54, converters35222);
            }
            anyTypeArr36222[0] = anyType50;
            AsyncFunction34222.setAsyncFunctionComponent(new SuspendFunctionComponent(name34222, anyTypeArr36222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$85(null)));
            AsyncFunctionBuilder AsyncFunction35222 = classComponentBuilder2.AsyncFunction("setIsFavourite");
            String name35222 = AsyncFunction35222.getName();
            TypeConverterProvider converters36222 = AsyncFunction35222.getConverters();
            AnyType[] anyTypeArr37222 = new AnyType[2];
            anyType51 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType51 == null) {
                try {
                    Result.Companion companion108 = Result.INSTANCE;
                    m13470constructorimpl54 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$86
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th59) {
                    Result.Companion companion109 = Result.INSTANCE;
                    m13470constructorimpl54 = Result.m13470constructorimpl(ResultKt.createFailure(th59));
                }
                Throwable m13473exceptionOrNullimpl55 = Result.m13473exceptionOrNullimpl(m13470constructorimpl54);
                if (m13473exceptionOrNullimpl55 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl55);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl54)) {
                    m13470constructorimpl54 = null;
                }
                TypeDescriptor typeDescriptor55 = (TypeDescriptor) m13470constructorimpl54;
                if (typeDescriptor55 == null) {
                    typeDescriptor55 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType51 = new AnyType(typeDescriptor55, converters36222);
            }
            anyTypeArr37222[0] = anyType51;
            anyType52 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), false));
            if (anyType52 == null) {
                try {
                    Result.Companion companion110 = Result.INSTANCE;
                    m13470constructorimpl55 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Boolean", Reflection.getOrCreateKotlinClass(Boolean.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$87
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Boolean.TYPE);
                        }
                    }));
                } catch (Throwable th60) {
                    Result.Companion companion111 = Result.INSTANCE;
                    m13470constructorimpl55 = Result.m13470constructorimpl(ResultKt.createFailure(th60));
                }
                Throwable m13473exceptionOrNullimpl56 = Result.m13473exceptionOrNullimpl(m13470constructorimpl55);
                if (m13473exceptionOrNullimpl56 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Boolean.class.getName(), m13473exceptionOrNullimpl56);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl55)) {
                    m13470constructorimpl55 = null;
                }
                TypeDescriptor typeDescriptor56 = (TypeDescriptor) m13470constructorimpl55;
                if (typeDescriptor56 == null) {
                    typeDescriptor56 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Boolean.TYPE));
                }
                anyType52 = new AnyType(typeDescriptor56, converters36222);
            }
            anyTypeArr37222[1] = anyType52;
            AsyncFunction35222.setAsyncFunctionComponent(new SuspendFunctionComponent(name35222, anyTypeArr37222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$88(null)));
            AsyncFunctionBuilder AsyncFunction36222 = classComponentBuilder2.AsyncFunction("getIsFavourite");
            String name36222 = AsyncFunction36222.getName();
            TypeConverterProvider converters37222 = AsyncFunction36222.getConverters();
            AnyType[] anyTypeArr38222 = new AnyType[1];
            anyType53 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType53 == null) {
                try {
                    Result.Companion companion112 = Result.INSTANCE;
                    m13470constructorimpl56 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$89
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th61) {
                    Result.Companion companion113 = Result.INSTANCE;
                    m13470constructorimpl56 = Result.m13470constructorimpl(ResultKt.createFailure(th61));
                }
                Throwable m13473exceptionOrNullimpl57 = Result.m13473exceptionOrNullimpl(m13470constructorimpl56);
                if (m13473exceptionOrNullimpl57 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl57);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl56)) {
                    m13470constructorimpl56 = null;
                }
                TypeDescriptor typeDescriptor57 = (TypeDescriptor) m13470constructorimpl56;
                if (typeDescriptor57 == null) {
                    typeDescriptor57 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType53 = new AnyType(typeDescriptor57, converters37222);
            }
            anyTypeArr38222[0] = anyType53;
            AsyncFunction36222.setAsyncFunctionComponent(new SuspendFunctionComponent(name36222, anyTypeArr38222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$90(null)));
            AsyncFunctionBuilder AsyncFunction37222 = classComponentBuilder2.AsyncFunction("getEmails");
            String name37222 = AsyncFunction37222.getName();
            TypeConverterProvider converters38222 = AsyncFunction37222.getConverters();
            AnyType[] anyTypeArr39222 = new AnyType[1];
            anyType54 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType54 == null) {
                try {
                    Result.Companion companion114 = Result.INSTANCE;
                    m13470constructorimpl57 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$91
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th62) {
                    Result.Companion companion115 = Result.INSTANCE;
                    m13470constructorimpl57 = Result.m13470constructorimpl(ResultKt.createFailure(th62));
                }
                Throwable m13473exceptionOrNullimpl58 = Result.m13473exceptionOrNullimpl(m13470constructorimpl57);
                if (m13473exceptionOrNullimpl58 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl58);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl57)) {
                    m13470constructorimpl57 = null;
                }
                TypeDescriptor typeDescriptor58 = (TypeDescriptor) m13470constructorimpl57;
                if (typeDescriptor58 == null) {
                    typeDescriptor58 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType54 = new AnyType(typeDescriptor58, converters38222);
            }
            anyTypeArr39222[0] = anyType54;
            AsyncFunction37222.setAsyncFunctionComponent(new SuspendFunctionComponent(name37222, anyTypeArr39222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$92(null)));
            AsyncFunctionBuilder AsyncFunction38222 = classComponentBuilder2.AsyncFunction("addEmail");
            String name38222 = AsyncFunction38222.getName();
            TypeConverterProvider converters39222 = AsyncFunction38222.getConverters();
            AnyType[] anyTypeArr40222 = new AnyType[2];
            anyType55 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType55 == null) {
                try {
                    Result.Companion companion116 = Result.INSTANCE;
                    m13470constructorimpl58 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$93
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th63) {
                    Result.Companion companion117 = Result.INSTANCE;
                    m13470constructorimpl58 = Result.m13470constructorimpl(ResultKt.createFailure(th63));
                }
                Throwable m13473exceptionOrNullimpl59 = Result.m13473exceptionOrNullimpl(m13470constructorimpl58);
                if (m13473exceptionOrNullimpl59 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl59);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl58)) {
                    m13470constructorimpl58 = null;
                }
                TypeDescriptor typeDescriptor59 = (TypeDescriptor) m13470constructorimpl58;
                if (typeDescriptor59 == null) {
                    typeDescriptor59 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType55 = new AnyType(typeDescriptor59, converters39222);
            }
            anyTypeArr40222[0] = anyType55;
            anyType56 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.New.class), false));
            if (anyType56 == null) {
                try {
                    Result.Companion companion118 = Result.INSTANCE;
                    m13470constructorimpl59 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.EmailRecord.New", Reflection.getOrCreateKotlinClass(EmailRecord.New.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$94
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(EmailRecord.New.class);
                        }
                    }));
                } catch (Throwable th64) {
                    Result.Companion companion119 = Result.INSTANCE;
                    m13470constructorimpl59 = Result.m13470constructorimpl(ResultKt.createFailure(th64));
                }
                Throwable m13473exceptionOrNullimpl60 = Result.m13473exceptionOrNullimpl(m13470constructorimpl59);
                if (m13473exceptionOrNullimpl60 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + EmailRecord.New.class.getName(), m13473exceptionOrNullimpl60);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl59)) {
                    m13470constructorimpl59 = null;
                }
                TypeDescriptor typeDescriptor60 = (TypeDescriptor) m13470constructorimpl59;
                if (typeDescriptor60 == null) {
                    typeDescriptor60 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(EmailRecord.New.class));
                }
                anyType56 = new AnyType(typeDescriptor60, converters39222);
            }
            anyTypeArr40222[1] = anyType56;
            AsyncFunction38222.setAsyncFunctionComponent(new SuspendFunctionComponent(name38222, anyTypeArr40222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$95(null)));
            AsyncFunctionBuilder AsyncFunction39222 = classComponentBuilder2.AsyncFunction("updateEmail");
            String name39222 = AsyncFunction39222.getName();
            TypeConverterProvider converters40222 = AsyncFunction39222.getConverters();
            AnyType[] anyTypeArr41222 = new AnyType[2];
            anyType57 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType57 == null) {
                try {
                    Result.Companion companion120 = Result.INSTANCE;
                    m13470constructorimpl60 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$96
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th65) {
                    Result.Companion companion121 = Result.INSTANCE;
                    m13470constructorimpl60 = Result.m13470constructorimpl(ResultKt.createFailure(th65));
                }
                Throwable m13473exceptionOrNullimpl61 = Result.m13473exceptionOrNullimpl(m13470constructorimpl60);
                if (m13473exceptionOrNullimpl61 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl61);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl60)) {
                    m13470constructorimpl60 = null;
                }
                TypeDescriptor typeDescriptor61 = (TypeDescriptor) m13470constructorimpl60;
                if (typeDescriptor61 == null) {
                    typeDescriptor61 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType57 = new AnyType(typeDescriptor61, converters40222);
            }
            anyTypeArr41222[0] = anyType57;
            anyType58 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.Existing.class), false));
            if (anyType58 == null) {
                try {
                    Result.Companion companion122 = Result.INSTANCE;
                    m13470constructorimpl61 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.EmailRecord.Existing", Reflection.getOrCreateKotlinClass(EmailRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$97
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(EmailRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th66) {
                    Result.Companion companion123 = Result.INSTANCE;
                    m13470constructorimpl61 = Result.m13470constructorimpl(ResultKt.createFailure(th66));
                }
                Throwable m13473exceptionOrNullimpl62 = Result.m13473exceptionOrNullimpl(m13470constructorimpl61);
                if (m13473exceptionOrNullimpl62 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + EmailRecord.Existing.class.getName(), m13473exceptionOrNullimpl62);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl61)) {
                    m13470constructorimpl61 = null;
                }
                TypeDescriptor typeDescriptor62 = (TypeDescriptor) m13470constructorimpl61;
                if (typeDescriptor62 == null) {
                    typeDescriptor62 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(EmailRecord.Existing.class));
                }
                anyType58 = new AnyType(typeDescriptor62, converters40222);
            }
            anyTypeArr41222[1] = anyType58;
            AsyncFunction39222.setAsyncFunctionComponent(new SuspendFunctionComponent(name39222, anyTypeArr41222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$98(null)));
            AsyncFunctionBuilder AsyncFunction40222 = classComponentBuilder2.AsyncFunction("deleteEmail");
            String name40222 = AsyncFunction40222.getName();
            TypeConverterProvider converters41222 = AsyncFunction40222.getConverters();
            AnyType[] anyTypeArr42222 = new AnyType[2];
            anyType59 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType59 == null) {
                try {
                    Result.Companion companion124 = Result.INSTANCE;
                    m13470constructorimpl62 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$99
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th67) {
                    Result.Companion companion125 = Result.INSTANCE;
                    m13470constructorimpl62 = Result.m13470constructorimpl(ResultKt.createFailure(th67));
                }
                Throwable m13473exceptionOrNullimpl63 = Result.m13473exceptionOrNullimpl(m13470constructorimpl62);
                if (m13473exceptionOrNullimpl63 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl63);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl62)) {
                    m13470constructorimpl62 = null;
                }
                TypeDescriptor typeDescriptor63 = (TypeDescriptor) m13470constructorimpl62;
                if (typeDescriptor63 == null) {
                    typeDescriptor63 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType59 = new AnyType(typeDescriptor63, converters41222);
            }
            anyTypeArr42222[0] = anyType59;
            anyType60 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EmailRecord.Existing.class), false));
            if (anyType60 == null) {
                try {
                    Result.Companion companion126 = Result.INSTANCE;
                    m13470constructorimpl63 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.EmailRecord.Existing", Reflection.getOrCreateKotlinClass(EmailRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$100
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(EmailRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th68) {
                    Result.Companion companion127 = Result.INSTANCE;
                    m13470constructorimpl63 = Result.m13470constructorimpl(ResultKt.createFailure(th68));
                }
                Throwable m13473exceptionOrNullimpl64 = Result.m13473exceptionOrNullimpl(m13470constructorimpl63);
                if (m13473exceptionOrNullimpl64 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + EmailRecord.Existing.class.getName(), m13473exceptionOrNullimpl64);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl63)) {
                    m13470constructorimpl63 = null;
                }
                TypeDescriptor typeDescriptor64 = (TypeDescriptor) m13470constructorimpl63;
                if (typeDescriptor64 == null) {
                    typeDescriptor64 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(EmailRecord.Existing.class));
                }
                anyType60 = new AnyType(typeDescriptor64, converters41222);
            }
            anyTypeArr42222[1] = anyType60;
            AsyncFunction40222.setAsyncFunctionComponent(new SuspendFunctionComponent(name40222, anyTypeArr42222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$101(null)));
            AsyncFunctionBuilder AsyncFunction41222 = classComponentBuilder2.AsyncFunction("getPhones");
            String name41222 = AsyncFunction41222.getName();
            TypeConverterProvider converters42222 = AsyncFunction41222.getConverters();
            AnyType[] anyTypeArr43222 = new AnyType[1];
            anyType61 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType61 == null) {
                try {
                    Result.Companion companion128 = Result.INSTANCE;
                    m13470constructorimpl64 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$102
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th69) {
                    Result.Companion companion129 = Result.INSTANCE;
                    m13470constructorimpl64 = Result.m13470constructorimpl(ResultKt.createFailure(th69));
                }
                Throwable m13473exceptionOrNullimpl65 = Result.m13473exceptionOrNullimpl(m13470constructorimpl64);
                if (m13473exceptionOrNullimpl65 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl65);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl64)) {
                    m13470constructorimpl64 = null;
                }
                TypeDescriptor typeDescriptor65 = (TypeDescriptor) m13470constructorimpl64;
                if (typeDescriptor65 == null) {
                    typeDescriptor65 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType61 = new AnyType(typeDescriptor65, converters42222);
            }
            anyTypeArr43222[0] = anyType61;
            AsyncFunction41222.setAsyncFunctionComponent(new SuspendFunctionComponent(name41222, anyTypeArr43222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$103(null)));
            AsyncFunctionBuilder AsyncFunction42222 = classComponentBuilder2.AsyncFunction("addPhone");
            String name42222 = AsyncFunction42222.getName();
            TypeConverterProvider converters43222 = AsyncFunction42222.getConverters();
            AnyType[] anyTypeArr44222 = new AnyType[2];
            anyType62 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType62 == null) {
                try {
                    Result.Companion companion130 = Result.INSTANCE;
                    m13470constructorimpl65 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$104
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th70) {
                    Result.Companion companion131 = Result.INSTANCE;
                    m13470constructorimpl65 = Result.m13470constructorimpl(ResultKt.createFailure(th70));
                }
                Throwable m13473exceptionOrNullimpl66 = Result.m13473exceptionOrNullimpl(m13470constructorimpl65);
                if (m13473exceptionOrNullimpl66 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl66);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl65)) {
                    m13470constructorimpl65 = null;
                }
                TypeDescriptor typeDescriptor66 = (TypeDescriptor) m13470constructorimpl65;
                if (typeDescriptor66 == null) {
                    typeDescriptor66 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType62 = new AnyType(typeDescriptor66, converters43222);
            }
            anyTypeArr44222[0] = anyType62;
            anyType63 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.New.class), false));
            if (anyType63 == null) {
                try {
                    Result.Companion companion132 = Result.INSTANCE;
                    m13470constructorimpl66 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.PhoneRecord.New", Reflection.getOrCreateKotlinClass(PhoneRecord.New.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$105
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(PhoneRecord.New.class);
                        }
                    }));
                } catch (Throwable th71) {
                    Result.Companion companion133 = Result.INSTANCE;
                    m13470constructorimpl66 = Result.m13470constructorimpl(ResultKt.createFailure(th71));
                }
                Throwable m13473exceptionOrNullimpl67 = Result.m13473exceptionOrNullimpl(m13470constructorimpl66);
                if (m13473exceptionOrNullimpl67 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + PhoneRecord.New.class.getName(), m13473exceptionOrNullimpl67);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl66)) {
                    m13470constructorimpl66 = null;
                }
                TypeDescriptor typeDescriptor67 = (TypeDescriptor) m13470constructorimpl66;
                if (typeDescriptor67 == null) {
                    typeDescriptor67 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(PhoneRecord.New.class));
                }
                anyType63 = new AnyType(typeDescriptor67, converters43222);
            }
            anyTypeArr44222[1] = anyType63;
            AsyncFunction42222.setAsyncFunctionComponent(new SuspendFunctionComponent(name42222, anyTypeArr44222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$106(null)));
            AsyncFunctionBuilder AsyncFunction43222 = classComponentBuilder2.AsyncFunction("updatePhone");
            String name43222 = AsyncFunction43222.getName();
            TypeConverterProvider converters44222 = AsyncFunction43222.getConverters();
            AnyType[] anyTypeArr45222 = new AnyType[2];
            anyType64 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType64 == null) {
                try {
                    Result.Companion companion134 = Result.INSTANCE;
                    m13470constructorimpl67 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$107
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th72) {
                    Result.Companion companion135 = Result.INSTANCE;
                    m13470constructorimpl67 = Result.m13470constructorimpl(ResultKt.createFailure(th72));
                }
                Throwable m13473exceptionOrNullimpl68 = Result.m13473exceptionOrNullimpl(m13470constructorimpl67);
                if (m13473exceptionOrNullimpl68 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl68);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl67)) {
                    m13470constructorimpl67 = null;
                }
                TypeDescriptor typeDescriptor68 = (TypeDescriptor) m13470constructorimpl67;
                if (typeDescriptor68 == null) {
                    typeDescriptor68 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType64 = new AnyType(typeDescriptor68, converters44222);
            }
            anyTypeArr45222[0] = anyType64;
            anyType65 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.Existing.class), false));
            if (anyType65 == null) {
                try {
                    Result.Companion companion136 = Result.INSTANCE;
                    m13470constructorimpl68 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.PhoneRecord.Existing", Reflection.getOrCreateKotlinClass(PhoneRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$108
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(PhoneRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th73) {
                    Result.Companion companion137 = Result.INSTANCE;
                    m13470constructorimpl68 = Result.m13470constructorimpl(ResultKt.createFailure(th73));
                }
                Throwable m13473exceptionOrNullimpl69 = Result.m13473exceptionOrNullimpl(m13470constructorimpl68);
                if (m13473exceptionOrNullimpl69 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + PhoneRecord.Existing.class.getName(), m13473exceptionOrNullimpl69);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl68)) {
                    m13470constructorimpl68 = null;
                }
                TypeDescriptor typeDescriptor69 = (TypeDescriptor) m13470constructorimpl68;
                if (typeDescriptor69 == null) {
                    typeDescriptor69 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(PhoneRecord.Existing.class));
                }
                anyType65 = new AnyType(typeDescriptor69, converters44222);
            }
            anyTypeArr45222[1] = anyType65;
            AsyncFunction43222.setAsyncFunctionComponent(new SuspendFunctionComponent(name43222, anyTypeArr45222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$109(null)));
            AsyncFunctionBuilder AsyncFunction44222 = classComponentBuilder2.AsyncFunction("deletePhone");
            String name44222 = AsyncFunction44222.getName();
            TypeConverterProvider converters45222 = AsyncFunction44222.getConverters();
            AnyType[] anyTypeArr46222 = new AnyType[2];
            anyType66 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType66 == null) {
                try {
                    Result.Companion companion138 = Result.INSTANCE;
                    m13470constructorimpl69 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$110
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th74) {
                    Result.Companion companion139 = Result.INSTANCE;
                    m13470constructorimpl69 = Result.m13470constructorimpl(ResultKt.createFailure(th74));
                }
                Throwable m13473exceptionOrNullimpl70 = Result.m13473exceptionOrNullimpl(m13470constructorimpl69);
                if (m13473exceptionOrNullimpl70 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl70);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl69)) {
                    m13470constructorimpl69 = null;
                }
                TypeDescriptor typeDescriptor70 = (TypeDescriptor) m13470constructorimpl69;
                if (typeDescriptor70 == null) {
                    typeDescriptor70 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType66 = new AnyType(typeDescriptor70, converters45222);
            }
            anyTypeArr46222[0] = anyType66;
            anyType67 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PhoneRecord.Existing.class), false));
            if (anyType67 == null) {
                try {
                    Result.Companion companion140 = Result.INSTANCE;
                    m13470constructorimpl70 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.PhoneRecord.Existing", Reflection.getOrCreateKotlinClass(PhoneRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$111
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(PhoneRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th75) {
                    Result.Companion companion141 = Result.INSTANCE;
                    m13470constructorimpl70 = Result.m13470constructorimpl(ResultKt.createFailure(th75));
                }
                Throwable m13473exceptionOrNullimpl71 = Result.m13473exceptionOrNullimpl(m13470constructorimpl70);
                if (m13473exceptionOrNullimpl71 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + PhoneRecord.Existing.class.getName(), m13473exceptionOrNullimpl71);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl70)) {
                    m13470constructorimpl70 = null;
                }
                TypeDescriptor typeDescriptor71 = (TypeDescriptor) m13470constructorimpl70;
                if (typeDescriptor71 == null) {
                    typeDescriptor71 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(PhoneRecord.Existing.class));
                }
                anyType67 = new AnyType(typeDescriptor71, converters45222);
            }
            anyTypeArr46222[1] = anyType67;
            AsyncFunction44222.setAsyncFunctionComponent(new SuspendFunctionComponent(name44222, anyTypeArr46222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$112(null)));
            AsyncFunctionBuilder AsyncFunction45222 = classComponentBuilder2.AsyncFunction("getAddresses");
            String name45222 = AsyncFunction45222.getName();
            TypeConverterProvider converters46222 = AsyncFunction45222.getConverters();
            AnyType[] anyTypeArr47222 = new AnyType[1];
            anyType68 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType68 == null) {
                try {
                    Result.Companion companion142 = Result.INSTANCE;
                    m13470constructorimpl71 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$113
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th76) {
                    Result.Companion companion143 = Result.INSTANCE;
                    m13470constructorimpl71 = Result.m13470constructorimpl(ResultKt.createFailure(th76));
                }
                Throwable m13473exceptionOrNullimpl72 = Result.m13473exceptionOrNullimpl(m13470constructorimpl71);
                if (m13473exceptionOrNullimpl72 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl72);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl71)) {
                    m13470constructorimpl71 = null;
                }
                TypeDescriptor typeDescriptor72 = (TypeDescriptor) m13470constructorimpl71;
                if (typeDescriptor72 == null) {
                    typeDescriptor72 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType68 = new AnyType(typeDescriptor72, converters46222);
            }
            anyTypeArr47222[0] = anyType68;
            AsyncFunction45222.setAsyncFunctionComponent(new SuspendFunctionComponent(name45222, anyTypeArr47222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$114(null)));
            AsyncFunctionBuilder AsyncFunction46222 = classComponentBuilder2.AsyncFunction("addAddress");
            String name46222 = AsyncFunction46222.getName();
            TypeConverterProvider converters47222 = AsyncFunction46222.getConverters();
            AnyType[] anyTypeArr48222 = new AnyType[2];
            anyType69 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType69 == null) {
                try {
                    Result.Companion companion144 = Result.INSTANCE;
                    m13470constructorimpl72 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$115
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th77) {
                    Result.Companion companion145 = Result.INSTANCE;
                    m13470constructorimpl72 = Result.m13470constructorimpl(ResultKt.createFailure(th77));
                }
                Throwable m13473exceptionOrNullimpl73 = Result.m13473exceptionOrNullimpl(m13470constructorimpl72);
                if (m13473exceptionOrNullimpl73 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl73);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl72)) {
                    m13470constructorimpl72 = null;
                }
                TypeDescriptor typeDescriptor73 = (TypeDescriptor) m13470constructorimpl72;
                if (typeDescriptor73 == null) {
                    typeDescriptor73 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType69 = new AnyType(typeDescriptor73, converters47222);
            }
            anyTypeArr48222[0] = anyType69;
            anyType70 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.New.class), false));
            if (anyType70 == null) {
                try {
                    Result.Companion companion146 = Result.INSTANCE;
                    m13470constructorimpl73 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.AddressRecord.New", Reflection.getOrCreateKotlinClass(AddressRecord.New.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$116
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(AddressRecord.New.class);
                        }
                    }));
                } catch (Throwable th78) {
                    Result.Companion companion147 = Result.INSTANCE;
                    m13470constructorimpl73 = Result.m13470constructorimpl(ResultKt.createFailure(th78));
                }
                Throwable m13473exceptionOrNullimpl74 = Result.m13473exceptionOrNullimpl(m13470constructorimpl73);
                if (m13473exceptionOrNullimpl74 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + AddressRecord.New.class.getName(), m13473exceptionOrNullimpl74);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl73)) {
                    m13470constructorimpl73 = null;
                }
                TypeDescriptor typeDescriptor74 = (TypeDescriptor) m13470constructorimpl73;
                if (typeDescriptor74 == null) {
                    typeDescriptor74 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(AddressRecord.New.class));
                }
                anyType70 = new AnyType(typeDescriptor74, converters47222);
            }
            anyTypeArr48222[1] = anyType70;
            AsyncFunction46222.setAsyncFunctionComponent(new SuspendFunctionComponent(name46222, anyTypeArr48222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$117(null)));
            AsyncFunctionBuilder AsyncFunction47222 = classComponentBuilder2.AsyncFunction("updateAddress");
            String name47222 = AsyncFunction47222.getName();
            TypeConverterProvider converters48222 = AsyncFunction47222.getConverters();
            AnyType[] anyTypeArr49222 = new AnyType[2];
            anyType71 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType71 == null) {
                try {
                    Result.Companion companion148 = Result.INSTANCE;
                    m13470constructorimpl74 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$118
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th79) {
                    Result.Companion companion149 = Result.INSTANCE;
                    m13470constructorimpl74 = Result.m13470constructorimpl(ResultKt.createFailure(th79));
                }
                Throwable m13473exceptionOrNullimpl75 = Result.m13473exceptionOrNullimpl(m13470constructorimpl74);
                if (m13473exceptionOrNullimpl75 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl75);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl74)) {
                    m13470constructorimpl74 = null;
                }
                TypeDescriptor typeDescriptor75 = (TypeDescriptor) m13470constructorimpl74;
                if (typeDescriptor75 == null) {
                    typeDescriptor75 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType71 = new AnyType(typeDescriptor75, converters48222);
            }
            anyTypeArr49222[0] = anyType71;
            anyType72 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.Existing.class), false));
            if (anyType72 == null) {
                try {
                    Result.Companion companion150 = Result.INSTANCE;
                    m13470constructorimpl75 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.AddressRecord.Existing", Reflection.getOrCreateKotlinClass(AddressRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$119
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(AddressRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th80) {
                    Result.Companion companion151 = Result.INSTANCE;
                    m13470constructorimpl75 = Result.m13470constructorimpl(ResultKt.createFailure(th80));
                }
                Throwable m13473exceptionOrNullimpl76 = Result.m13473exceptionOrNullimpl(m13470constructorimpl75);
                if (m13473exceptionOrNullimpl76 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + AddressRecord.Existing.class.getName(), m13473exceptionOrNullimpl76);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl75)) {
                    m13470constructorimpl75 = null;
                }
                TypeDescriptor typeDescriptor76 = (TypeDescriptor) m13470constructorimpl75;
                if (typeDescriptor76 == null) {
                    typeDescriptor76 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(AddressRecord.Existing.class));
                }
                anyType72 = new AnyType(typeDescriptor76, converters48222);
            }
            anyTypeArr49222[1] = anyType72;
            AsyncFunction47222.setAsyncFunctionComponent(new SuspendFunctionComponent(name47222, anyTypeArr49222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$120(null)));
            AsyncFunctionBuilder AsyncFunction48222 = classComponentBuilder2.AsyncFunction("deleteAddress");
            String name48222 = AsyncFunction48222.getName();
            TypeConverterProvider converters49222 = AsyncFunction48222.getConverters();
            AnyType[] anyTypeArr50222 = new AnyType[2];
            anyType73 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType73 == null) {
                try {
                    Result.Companion companion152 = Result.INSTANCE;
                    m13470constructorimpl76 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$121
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th81) {
                    Result.Companion companion153 = Result.INSTANCE;
                    m13470constructorimpl76 = Result.m13470constructorimpl(ResultKt.createFailure(th81));
                }
                Throwable m13473exceptionOrNullimpl77 = Result.m13473exceptionOrNullimpl(m13470constructorimpl76);
                if (m13473exceptionOrNullimpl77 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl77);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl76)) {
                    m13470constructorimpl76 = null;
                }
                TypeDescriptor typeDescriptor77 = (TypeDescriptor) m13470constructorimpl76;
                if (typeDescriptor77 == null) {
                    typeDescriptor77 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType73 = new AnyType(typeDescriptor77, converters49222);
            }
            anyTypeArr50222[0] = anyType73;
            anyType74 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(AddressRecord.Existing.class), false));
            if (anyType74 == null) {
                try {
                    Result.Companion companion154 = Result.INSTANCE;
                    m13470constructorimpl77 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.AddressRecord.Existing", Reflection.getOrCreateKotlinClass(AddressRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$122
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(AddressRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th82) {
                    Result.Companion companion155 = Result.INSTANCE;
                    m13470constructorimpl77 = Result.m13470constructorimpl(ResultKt.createFailure(th82));
                }
                Throwable m13473exceptionOrNullimpl78 = Result.m13473exceptionOrNullimpl(m13470constructorimpl77);
                if (m13473exceptionOrNullimpl78 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + AddressRecord.Existing.class.getName(), m13473exceptionOrNullimpl78);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl77)) {
                    m13470constructorimpl77 = null;
                }
                TypeDescriptor typeDescriptor78 = (TypeDescriptor) m13470constructorimpl77;
                if (typeDescriptor78 == null) {
                    typeDescriptor78 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(AddressRecord.Existing.class));
                }
                anyType74 = new AnyType(typeDescriptor78, converters49222);
            }
            anyTypeArr50222[1] = anyType74;
            AsyncFunction48222.setAsyncFunctionComponent(new SuspendFunctionComponent(name48222, anyTypeArr50222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$123(null)));
            AsyncFunctionBuilder AsyncFunction49222 = classComponentBuilder2.AsyncFunction("getDates");
            String name49222 = AsyncFunction49222.getName();
            TypeConverterProvider converters50222 = AsyncFunction49222.getConverters();
            AnyType[] anyTypeArr51222 = new AnyType[1];
            anyType75 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType75 == null) {
                try {
                    Result.Companion companion156 = Result.INSTANCE;
                    m13470constructorimpl78 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$124
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th83) {
                    Result.Companion companion157 = Result.INSTANCE;
                    m13470constructorimpl78 = Result.m13470constructorimpl(ResultKt.createFailure(th83));
                }
                Throwable m13473exceptionOrNullimpl79 = Result.m13473exceptionOrNullimpl(m13470constructorimpl78);
                if (m13473exceptionOrNullimpl79 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl79);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl78)) {
                    m13470constructorimpl78 = null;
                }
                TypeDescriptor typeDescriptor79 = (TypeDescriptor) m13470constructorimpl78;
                if (typeDescriptor79 == null) {
                    typeDescriptor79 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType75 = new AnyType(typeDescriptor79, converters50222);
            }
            anyTypeArr51222[0] = anyType75;
            AsyncFunction49222.setAsyncFunctionComponent(new SuspendFunctionComponent(name49222, anyTypeArr51222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$125(null)));
            AsyncFunctionBuilder AsyncFunction50222 = classComponentBuilder2.AsyncFunction("addDate");
            String name50222 = AsyncFunction50222.getName();
            TypeConverterProvider converters51222 = AsyncFunction50222.getConverters();
            AnyType[] anyTypeArr52222 = new AnyType[2];
            anyType76 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType76 == null) {
                try {
                    Result.Companion companion158 = Result.INSTANCE;
                    m13470constructorimpl79 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$126
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th84) {
                    Result.Companion companion159 = Result.INSTANCE;
                    m13470constructorimpl79 = Result.m13470constructorimpl(ResultKt.createFailure(th84));
                }
                Throwable m13473exceptionOrNullimpl80 = Result.m13473exceptionOrNullimpl(m13470constructorimpl79);
                if (m13473exceptionOrNullimpl80 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl80);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl79)) {
                    m13470constructorimpl79 = null;
                }
                TypeDescriptor typeDescriptor80 = (TypeDescriptor) m13470constructorimpl79;
                if (typeDescriptor80 == null) {
                    typeDescriptor80 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType76 = new AnyType(typeDescriptor80, converters51222);
            }
            anyTypeArr52222[0] = anyType76;
            anyType77 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.New.class), false));
            if (anyType77 == null) {
                try {
                    Result.Companion companion160 = Result.INSTANCE;
                    m13470constructorimpl80 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.DateRecord.New", Reflection.getOrCreateKotlinClass(DateRecord.New.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$127
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(DateRecord.New.class);
                        }
                    }));
                } catch (Throwable th85) {
                    Result.Companion companion161 = Result.INSTANCE;
                    m13470constructorimpl80 = Result.m13470constructorimpl(ResultKt.createFailure(th85));
                }
                Throwable m13473exceptionOrNullimpl81 = Result.m13473exceptionOrNullimpl(m13470constructorimpl80);
                if (m13473exceptionOrNullimpl81 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + DateRecord.New.class.getName(), m13473exceptionOrNullimpl81);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl80)) {
                    m13470constructorimpl80 = null;
                }
                TypeDescriptor typeDescriptor81 = (TypeDescriptor) m13470constructorimpl80;
                if (typeDescriptor81 == null) {
                    typeDescriptor81 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(DateRecord.New.class));
                }
                anyType77 = new AnyType(typeDescriptor81, converters51222);
            }
            anyTypeArr52222[1] = anyType77;
            AsyncFunction50222.setAsyncFunctionComponent(new SuspendFunctionComponent(name50222, anyTypeArr52222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$128(null)));
            AsyncFunctionBuilder AsyncFunction51222 = classComponentBuilder2.AsyncFunction("updateDate");
            String name51222 = AsyncFunction51222.getName();
            TypeConverterProvider converters52222 = AsyncFunction51222.getConverters();
            AnyType[] anyTypeArr53222 = new AnyType[2];
            anyType78 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType78 == null) {
                try {
                    Result.Companion companion162 = Result.INSTANCE;
                    m13470constructorimpl81 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$129
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th86) {
                    Result.Companion companion163 = Result.INSTANCE;
                    m13470constructorimpl81 = Result.m13470constructorimpl(ResultKt.createFailure(th86));
                }
                Throwable m13473exceptionOrNullimpl82 = Result.m13473exceptionOrNullimpl(m13470constructorimpl81);
                if (m13473exceptionOrNullimpl82 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl82);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl81)) {
                    m13470constructorimpl81 = null;
                }
                TypeDescriptor typeDescriptor82 = (TypeDescriptor) m13470constructorimpl81;
                if (typeDescriptor82 == null) {
                    typeDescriptor82 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType78 = new AnyType(typeDescriptor82, converters52222);
            }
            anyTypeArr53222[0] = anyType78;
            anyType79 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.Existing.class), false));
            if (anyType79 == null) {
                try {
                    Result.Companion companion164 = Result.INSTANCE;
                    m13470constructorimpl82 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.DateRecord.Existing", Reflection.getOrCreateKotlinClass(DateRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$130
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(DateRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th87) {
                    Result.Companion companion165 = Result.INSTANCE;
                    m13470constructorimpl82 = Result.m13470constructorimpl(ResultKt.createFailure(th87));
                }
                Throwable m13473exceptionOrNullimpl83 = Result.m13473exceptionOrNullimpl(m13470constructorimpl82);
                if (m13473exceptionOrNullimpl83 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + DateRecord.Existing.class.getName(), m13473exceptionOrNullimpl83);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl82)) {
                    m13470constructorimpl82 = null;
                }
                TypeDescriptor typeDescriptor83 = (TypeDescriptor) m13470constructorimpl82;
                if (typeDescriptor83 == null) {
                    typeDescriptor83 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(DateRecord.Existing.class));
                }
                anyType79 = new AnyType(typeDescriptor83, converters52222);
            }
            anyTypeArr53222[1] = anyType79;
            AsyncFunction51222.setAsyncFunctionComponent(new SuspendFunctionComponent(name51222, anyTypeArr53222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$131(null)));
            AsyncFunctionBuilder AsyncFunction52222 = classComponentBuilder2.AsyncFunction("deleteDate");
            String name52222 = AsyncFunction52222.getName();
            TypeConverterProvider converters53222 = AsyncFunction52222.getConverters();
            AnyType[] anyTypeArr54222 = new AnyType[2];
            anyType80 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType80 == null) {
                try {
                    Result.Companion companion166 = Result.INSTANCE;
                    m13470constructorimpl83 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$132
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th88) {
                    Result.Companion companion167 = Result.INSTANCE;
                    m13470constructorimpl83 = Result.m13470constructorimpl(ResultKt.createFailure(th88));
                }
                Throwable m13473exceptionOrNullimpl84 = Result.m13473exceptionOrNullimpl(m13470constructorimpl83);
                if (m13473exceptionOrNullimpl84 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl84);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl83)) {
                    m13470constructorimpl83 = null;
                }
                TypeDescriptor typeDescriptor84 = (TypeDescriptor) m13470constructorimpl83;
                if (typeDescriptor84 == null) {
                    typeDescriptor84 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType80 = new AnyType(typeDescriptor84, converters53222);
            }
            anyTypeArr54222[0] = anyType80;
            anyType81 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DateRecord.Existing.class), false));
            if (anyType81 == null) {
                try {
                    Result.Companion companion168 = Result.INSTANCE;
                    m13470constructorimpl84 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.DateRecord.Existing", Reflection.getOrCreateKotlinClass(DateRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$133
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(DateRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th89) {
                    Result.Companion companion169 = Result.INSTANCE;
                    m13470constructorimpl84 = Result.m13470constructorimpl(ResultKt.createFailure(th89));
                }
                Throwable m13473exceptionOrNullimpl85 = Result.m13473exceptionOrNullimpl(m13470constructorimpl84);
                if (m13473exceptionOrNullimpl85 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + DateRecord.Existing.class.getName(), m13473exceptionOrNullimpl85);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl84)) {
                    m13470constructorimpl84 = null;
                }
                TypeDescriptor typeDescriptor85 = (TypeDescriptor) m13470constructorimpl84;
                if (typeDescriptor85 == null) {
                    typeDescriptor85 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(DateRecord.Existing.class));
                }
                anyType81 = new AnyType(typeDescriptor85, converters53222);
            }
            anyTypeArr54222[1] = anyType81;
            AsyncFunction52222.setAsyncFunctionComponent(new SuspendFunctionComponent(name52222, anyTypeArr54222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$134(null)));
            AsyncFunctionBuilder AsyncFunction53222 = classComponentBuilder2.AsyncFunction("getExtraNames");
            String name53222 = AsyncFunction53222.getName();
            TypeConverterProvider converters54222 = AsyncFunction53222.getConverters();
            AnyType[] anyTypeArr55222 = new AnyType[1];
            anyType82 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType82 == null) {
                try {
                    Result.Companion companion170 = Result.INSTANCE;
                    m13470constructorimpl85 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$135
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th90) {
                    Result.Companion companion171 = Result.INSTANCE;
                    m13470constructorimpl85 = Result.m13470constructorimpl(ResultKt.createFailure(th90));
                }
                Throwable m13473exceptionOrNullimpl86 = Result.m13473exceptionOrNullimpl(m13470constructorimpl85);
                if (m13473exceptionOrNullimpl86 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl86);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl85)) {
                    m13470constructorimpl85 = null;
                }
                TypeDescriptor typeDescriptor86 = (TypeDescriptor) m13470constructorimpl85;
                if (typeDescriptor86 == null) {
                    typeDescriptor86 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType82 = new AnyType(typeDescriptor86, converters54222);
            }
            anyTypeArr55222[0] = anyType82;
            AsyncFunction53222.setAsyncFunctionComponent(new SuspendFunctionComponent(name53222, anyTypeArr55222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$136(null)));
            AsyncFunctionBuilder AsyncFunction54222 = classComponentBuilder2.AsyncFunction("addExtraName");
            String name54222 = AsyncFunction54222.getName();
            TypeConverterProvider converters55222 = AsyncFunction54222.getConverters();
            AnyType[] anyTypeArr56222 = new AnyType[2];
            anyType83 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType83 == null) {
                try {
                    Result.Companion companion172 = Result.INSTANCE;
                    m13470constructorimpl86 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$137
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th91) {
                    Result.Companion companion173 = Result.INSTANCE;
                    m13470constructorimpl86 = Result.m13470constructorimpl(ResultKt.createFailure(th91));
                }
                Throwable m13473exceptionOrNullimpl87 = Result.m13473exceptionOrNullimpl(m13470constructorimpl86);
                if (m13473exceptionOrNullimpl87 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl87);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl86)) {
                    m13470constructorimpl86 = null;
                }
                TypeDescriptor typeDescriptor87 = (TypeDescriptor) m13470constructorimpl86;
                if (typeDescriptor87 == null) {
                    typeDescriptor87 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType83 = new AnyType(typeDescriptor87, converters55222);
            }
            anyTypeArr56222[0] = anyType83;
            anyType84 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.New.class), false));
            if (anyType84 == null) {
                try {
                    Result.Companion companion174 = Result.INSTANCE;
                    m13470constructorimpl87 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.ExtraNameRecord.New", Reflection.getOrCreateKotlinClass(ExtraNameRecord.New.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$138
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ExtraNameRecord.New.class);
                        }
                    }));
                } catch (Throwable th92) {
                    Result.Companion companion175 = Result.INSTANCE;
                    m13470constructorimpl87 = Result.m13470constructorimpl(ResultKt.createFailure(th92));
                }
                Throwable m13473exceptionOrNullimpl88 = Result.m13473exceptionOrNullimpl(m13470constructorimpl87);
                if (m13473exceptionOrNullimpl88 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ExtraNameRecord.New.class.getName(), m13473exceptionOrNullimpl88);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl87)) {
                    m13470constructorimpl87 = null;
                }
                TypeDescriptor typeDescriptor88 = (TypeDescriptor) m13470constructorimpl87;
                if (typeDescriptor88 == null) {
                    typeDescriptor88 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ExtraNameRecord.New.class));
                }
                anyType84 = new AnyType(typeDescriptor88, converters55222);
            }
            anyTypeArr56222[1] = anyType84;
            AsyncFunction54222.setAsyncFunctionComponent(new SuspendFunctionComponent(name54222, anyTypeArr56222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$139(null)));
            AsyncFunctionBuilder AsyncFunction55222 = classComponentBuilder2.AsyncFunction("updateExtraName");
            String name55222 = AsyncFunction55222.getName();
            TypeConverterProvider converters56222 = AsyncFunction55222.getConverters();
            AnyType[] anyTypeArr57222 = new AnyType[2];
            anyType85 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType85 == null) {
                try {
                    Result.Companion companion176 = Result.INSTANCE;
                    m13470constructorimpl88 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$140
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th93) {
                    Result.Companion companion177 = Result.INSTANCE;
                    m13470constructorimpl88 = Result.m13470constructorimpl(ResultKt.createFailure(th93));
                }
                Throwable m13473exceptionOrNullimpl89 = Result.m13473exceptionOrNullimpl(m13470constructorimpl88);
                if (m13473exceptionOrNullimpl89 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl89);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl88)) {
                    m13470constructorimpl88 = null;
                }
                TypeDescriptor typeDescriptor89 = (TypeDescriptor) m13470constructorimpl88;
                if (typeDescriptor89 == null) {
                    typeDescriptor89 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType85 = new AnyType(typeDescriptor89, converters56222);
            }
            anyTypeArr57222[0] = anyType85;
            anyType86 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.Existing.class), false));
            if (anyType86 == null) {
                try {
                    Result.Companion companion178 = Result.INSTANCE;
                    m13470constructorimpl89 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.ExtraNameRecord.Existing", Reflection.getOrCreateKotlinClass(ExtraNameRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$141
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ExtraNameRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th94) {
                    Result.Companion companion179 = Result.INSTANCE;
                    m13470constructorimpl89 = Result.m13470constructorimpl(ResultKt.createFailure(th94));
                }
                Throwable m13473exceptionOrNullimpl90 = Result.m13473exceptionOrNullimpl(m13470constructorimpl89);
                if (m13473exceptionOrNullimpl90 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ExtraNameRecord.Existing.class.getName(), m13473exceptionOrNullimpl90);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl89)) {
                    m13470constructorimpl89 = null;
                }
                TypeDescriptor typeDescriptor90 = (TypeDescriptor) m13470constructorimpl89;
                if (typeDescriptor90 == null) {
                    typeDescriptor90 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ExtraNameRecord.Existing.class));
                }
                anyType86 = new AnyType(typeDescriptor90, converters56222);
            }
            anyTypeArr57222[1] = anyType86;
            AsyncFunction55222.setAsyncFunctionComponent(new SuspendFunctionComponent(name55222, anyTypeArr57222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$142(null)));
            AsyncFunctionBuilder AsyncFunction56222 = classComponentBuilder2.AsyncFunction("deleteExtraName");
            String name56222 = AsyncFunction56222.getName();
            TypeConverterProvider converters57222 = AsyncFunction56222.getConverters();
            AnyType[] anyTypeArr58222 = new AnyType[2];
            anyType87 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType87 == null) {
                try {
                    Result.Companion companion180 = Result.INSTANCE;
                    m13470constructorimpl90 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$143
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th95) {
                    Result.Companion companion181 = Result.INSTANCE;
                    m13470constructorimpl90 = Result.m13470constructorimpl(ResultKt.createFailure(th95));
                }
                Throwable m13473exceptionOrNullimpl91 = Result.m13473exceptionOrNullimpl(m13470constructorimpl90);
                if (m13473exceptionOrNullimpl91 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl91);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl90)) {
                    m13470constructorimpl90 = null;
                }
                TypeDescriptor typeDescriptor91 = (TypeDescriptor) m13470constructorimpl90;
                if (typeDescriptor91 == null) {
                    typeDescriptor91 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType87 = new AnyType(typeDescriptor91, converters57222);
            }
            anyTypeArr58222[0] = anyType87;
            anyType88 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExtraNameRecord.Existing.class), false));
            if (anyType88 == null) {
                try {
                    Result.Companion companion182 = Result.INSTANCE;
                    m13470constructorimpl91 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.ExtraNameRecord.Existing", Reflection.getOrCreateKotlinClass(ExtraNameRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$144
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ExtraNameRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th96) {
                    Result.Companion companion183 = Result.INSTANCE;
                    m13470constructorimpl91 = Result.m13470constructorimpl(ResultKt.createFailure(th96));
                }
                Throwable m13473exceptionOrNullimpl92 = Result.m13473exceptionOrNullimpl(m13470constructorimpl91);
                if (m13473exceptionOrNullimpl92 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ExtraNameRecord.Existing.class.getName(), m13473exceptionOrNullimpl92);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl91)) {
                    m13470constructorimpl91 = null;
                }
                TypeDescriptor typeDescriptor92 = (TypeDescriptor) m13470constructorimpl91;
                if (typeDescriptor92 == null) {
                    typeDescriptor92 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ExtraNameRecord.Existing.class));
                }
                anyType88 = new AnyType(typeDescriptor92, converters57222);
            }
            anyTypeArr58222[1] = anyType88;
            AsyncFunction56222.setAsyncFunctionComponent(new SuspendFunctionComponent(name56222, anyTypeArr58222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$145(null)));
            AsyncFunctionBuilder AsyncFunction57222 = classComponentBuilder2.AsyncFunction("getRelations");
            String name57222 = AsyncFunction57222.getName();
            TypeConverterProvider converters58222 = AsyncFunction57222.getConverters();
            AnyType[] anyTypeArr59222 = new AnyType[1];
            anyType89 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType89 == null) {
                try {
                    Result.Companion companion184 = Result.INSTANCE;
                    m13470constructorimpl92 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$146
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th97) {
                    Result.Companion companion185 = Result.INSTANCE;
                    m13470constructorimpl92 = Result.m13470constructorimpl(ResultKt.createFailure(th97));
                }
                Throwable m13473exceptionOrNullimpl93 = Result.m13473exceptionOrNullimpl(m13470constructorimpl92);
                if (m13473exceptionOrNullimpl93 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl93);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl92)) {
                    m13470constructorimpl92 = null;
                }
                TypeDescriptor typeDescriptor93 = (TypeDescriptor) m13470constructorimpl92;
                if (typeDescriptor93 == null) {
                    typeDescriptor93 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType89 = new AnyType(typeDescriptor93, converters58222);
            }
            anyTypeArr59222[0] = anyType89;
            AsyncFunction57222.setAsyncFunctionComponent(new SuspendFunctionComponent(name57222, anyTypeArr59222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$147(null)));
            AsyncFunctionBuilder AsyncFunction58222 = classComponentBuilder2.AsyncFunction("addRelation");
            String name58222 = AsyncFunction58222.getName();
            TypeConverterProvider converters59222 = AsyncFunction58222.getConverters();
            AnyType[] anyTypeArr60222 = new AnyType[2];
            anyType90 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType90 == null) {
                try {
                    Result.Companion companion186 = Result.INSTANCE;
                    m13470constructorimpl93 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$148
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th98) {
                    Result.Companion companion187 = Result.INSTANCE;
                    m13470constructorimpl93 = Result.m13470constructorimpl(ResultKt.createFailure(th98));
                }
                Throwable m13473exceptionOrNullimpl94 = Result.m13473exceptionOrNullimpl(m13470constructorimpl93);
                if (m13473exceptionOrNullimpl94 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl94);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl93)) {
                    m13470constructorimpl93 = null;
                }
                TypeDescriptor typeDescriptor94 = (TypeDescriptor) m13470constructorimpl93;
                if (typeDescriptor94 == null) {
                    typeDescriptor94 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType90 = new AnyType(typeDescriptor94, converters59222);
            }
            anyTypeArr60222[0] = anyType90;
            anyType91 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.New.class), false));
            if (anyType91 == null) {
                try {
                    Result.Companion companion188 = Result.INSTANCE;
                    m13470constructorimpl94 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.RelationRecord.New", Reflection.getOrCreateKotlinClass(RelationRecord.New.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$149
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(RelationRecord.New.class);
                        }
                    }));
                } catch (Throwable th99) {
                    Result.Companion companion189 = Result.INSTANCE;
                    m13470constructorimpl94 = Result.m13470constructorimpl(ResultKt.createFailure(th99));
                }
                Throwable m13473exceptionOrNullimpl95 = Result.m13473exceptionOrNullimpl(m13470constructorimpl94);
                if (m13473exceptionOrNullimpl95 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + RelationRecord.New.class.getName(), m13473exceptionOrNullimpl95);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl94)) {
                    m13470constructorimpl94 = null;
                }
                TypeDescriptor typeDescriptor95 = (TypeDescriptor) m13470constructorimpl94;
                if (typeDescriptor95 == null) {
                    typeDescriptor95 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(RelationRecord.New.class));
                }
                anyType91 = new AnyType(typeDescriptor95, converters59222);
            }
            anyTypeArr60222[1] = anyType91;
            AsyncFunction58222.setAsyncFunctionComponent(new SuspendFunctionComponent(name58222, anyTypeArr60222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$150(null)));
            AsyncFunctionBuilder AsyncFunction59222 = classComponentBuilder2.AsyncFunction("updateRelation");
            String name59222 = AsyncFunction59222.getName();
            TypeConverterProvider converters60222 = AsyncFunction59222.getConverters();
            AnyType[] anyTypeArr61222 = new AnyType[2];
            anyType92 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType92 == null) {
                try {
                    Result.Companion companion190 = Result.INSTANCE;
                    m13470constructorimpl95 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$151
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th100) {
                    Result.Companion companion191 = Result.INSTANCE;
                    m13470constructorimpl95 = Result.m13470constructorimpl(ResultKt.createFailure(th100));
                }
                Throwable m13473exceptionOrNullimpl96 = Result.m13473exceptionOrNullimpl(m13470constructorimpl95);
                if (m13473exceptionOrNullimpl96 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl96);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl95)) {
                    m13470constructorimpl95 = null;
                }
                TypeDescriptor typeDescriptor96 = (TypeDescriptor) m13470constructorimpl95;
                if (typeDescriptor96 == null) {
                    typeDescriptor96 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType92 = new AnyType(typeDescriptor96, converters60222);
            }
            anyTypeArr61222[0] = anyType92;
            anyType93 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.Existing.class), false));
            if (anyType93 == null) {
                try {
                    Result.Companion companion192 = Result.INSTANCE;
                    m13470constructorimpl96 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.RelationRecord.Existing", Reflection.getOrCreateKotlinClass(RelationRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$152
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(RelationRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th101) {
                    Result.Companion companion193 = Result.INSTANCE;
                    m13470constructorimpl96 = Result.m13470constructorimpl(ResultKt.createFailure(th101));
                }
                Throwable m13473exceptionOrNullimpl97 = Result.m13473exceptionOrNullimpl(m13470constructorimpl96);
                if (m13473exceptionOrNullimpl97 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + RelationRecord.Existing.class.getName(), m13473exceptionOrNullimpl97);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl96)) {
                    m13470constructorimpl96 = null;
                }
                TypeDescriptor typeDescriptor97 = (TypeDescriptor) m13470constructorimpl96;
                if (typeDescriptor97 == null) {
                    typeDescriptor97 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(RelationRecord.Existing.class));
                }
                anyType93 = new AnyType(typeDescriptor97, converters60222);
            }
            anyTypeArr61222[1] = anyType93;
            AsyncFunction59222.setAsyncFunctionComponent(new SuspendFunctionComponent(name59222, anyTypeArr61222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$153(null)));
            AsyncFunctionBuilder AsyncFunction60222 = classComponentBuilder2.AsyncFunction("deleteRelation");
            String name60222 = AsyncFunction60222.getName();
            TypeConverterProvider converters61222 = AsyncFunction60222.getConverters();
            AnyType[] anyTypeArr62222 = new AnyType[2];
            anyType94 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType94 == null) {
                try {
                    Result.Companion companion194 = Result.INSTANCE;
                    m13470constructorimpl97 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$154
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th102) {
                    Result.Companion companion195 = Result.INSTANCE;
                    m13470constructorimpl97 = Result.m13470constructorimpl(ResultKt.createFailure(th102));
                }
                Throwable m13473exceptionOrNullimpl98 = Result.m13473exceptionOrNullimpl(m13470constructorimpl97);
                if (m13473exceptionOrNullimpl98 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl98);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl97)) {
                    m13470constructorimpl97 = null;
                }
                TypeDescriptor typeDescriptor98 = (TypeDescriptor) m13470constructorimpl97;
                if (typeDescriptor98 == null) {
                    typeDescriptor98 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType94 = new AnyType(typeDescriptor98, converters61222);
            }
            anyTypeArr62222[0] = anyType94;
            anyType95 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelationRecord.Existing.class), false));
            if (anyType95 == null) {
                try {
                    Result.Companion companion196 = Result.INSTANCE;
                    m13470constructorimpl98 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.RelationRecord.Existing", Reflection.getOrCreateKotlinClass(RelationRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$155
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(RelationRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th103) {
                    Result.Companion companion197 = Result.INSTANCE;
                    m13470constructorimpl98 = Result.m13470constructorimpl(ResultKt.createFailure(th103));
                }
                Throwable m13473exceptionOrNullimpl99 = Result.m13473exceptionOrNullimpl(m13470constructorimpl98);
                if (m13473exceptionOrNullimpl99 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + RelationRecord.Existing.class.getName(), m13473exceptionOrNullimpl99);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl98)) {
                    m13470constructorimpl98 = null;
                }
                TypeDescriptor typeDescriptor99 = (TypeDescriptor) m13470constructorimpl98;
                if (typeDescriptor99 == null) {
                    typeDescriptor99 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(RelationRecord.Existing.class));
                }
                anyType95 = new AnyType(typeDescriptor99, converters61222);
            }
            anyTypeArr62222[1] = anyType95;
            AsyncFunction60222.setAsyncFunctionComponent(new SuspendFunctionComponent(name60222, anyTypeArr62222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$156(null)));
            AsyncFunctionBuilder AsyncFunction61222 = classComponentBuilder2.AsyncFunction("getUrlAddresses");
            String name61222 = AsyncFunction61222.getName();
            TypeConverterProvider converters62222 = AsyncFunction61222.getConverters();
            AnyType[] anyTypeArr63222 = new AnyType[1];
            anyType96 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType96 == null) {
                try {
                    Result.Companion companion198 = Result.INSTANCE;
                    m13470constructorimpl99 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$157
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th104) {
                    Result.Companion companion199 = Result.INSTANCE;
                    m13470constructorimpl99 = Result.m13470constructorimpl(ResultKt.createFailure(th104));
                }
                Throwable m13473exceptionOrNullimpl100 = Result.m13473exceptionOrNullimpl(m13470constructorimpl99);
                if (m13473exceptionOrNullimpl100 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl100);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl99)) {
                    m13470constructorimpl99 = null;
                }
                TypeDescriptor typeDescriptor100 = (TypeDescriptor) m13470constructorimpl99;
                if (typeDescriptor100 == null) {
                    typeDescriptor100 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType96 = new AnyType(typeDescriptor100, converters62222);
            }
            anyTypeArr63222[0] = anyType96;
            AsyncFunction61222.setAsyncFunctionComponent(new SuspendFunctionComponent(name61222, anyTypeArr63222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$158(null)));
            AsyncFunctionBuilder AsyncFunction62222 = classComponentBuilder2.AsyncFunction("addUrlAddress");
            String name62222 = AsyncFunction62222.getName();
            TypeConverterProvider converters63222 = AsyncFunction62222.getConverters();
            AnyType[] anyTypeArr64222 = new AnyType[2];
            anyType97 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType97 == null) {
                try {
                    Result.Companion companion200 = Result.INSTANCE;
                    m13470constructorimpl100 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$159
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th105) {
                    Result.Companion companion201 = Result.INSTANCE;
                    m13470constructorimpl100 = Result.m13470constructorimpl(ResultKt.createFailure(th105));
                }
                Throwable m13473exceptionOrNullimpl101 = Result.m13473exceptionOrNullimpl(m13470constructorimpl100);
                if (m13473exceptionOrNullimpl101 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl101);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl100)) {
                    m13470constructorimpl100 = null;
                }
                TypeDescriptor typeDescriptor101 = (TypeDescriptor) m13470constructorimpl100;
                if (typeDescriptor101 == null) {
                    typeDescriptor101 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType97 = new AnyType(typeDescriptor101, converters63222);
            }
            anyTypeArr64222[0] = anyType97;
            anyType98 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.New.class), false));
            if (anyType98 == null) {
                try {
                    Result.Companion companion202 = Result.INSTANCE;
                    m13470constructorimpl101 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.UrlAddressRecord.New", Reflection.getOrCreateKotlinClass(UrlAddressRecord.New.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$160
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(UrlAddressRecord.New.class);
                        }
                    }));
                } catch (Throwable th106) {
                    Result.Companion companion203 = Result.INSTANCE;
                    m13470constructorimpl101 = Result.m13470constructorimpl(ResultKt.createFailure(th106));
                }
                Throwable m13473exceptionOrNullimpl102 = Result.m13473exceptionOrNullimpl(m13470constructorimpl101);
                if (m13473exceptionOrNullimpl102 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + UrlAddressRecord.New.class.getName(), m13473exceptionOrNullimpl102);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl101)) {
                    m13470constructorimpl101 = null;
                }
                TypeDescriptor typeDescriptor102 = (TypeDescriptor) m13470constructorimpl101;
                if (typeDescriptor102 == null) {
                    typeDescriptor102 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(UrlAddressRecord.New.class));
                }
                anyType98 = new AnyType(typeDescriptor102, converters63222);
            }
            anyTypeArr64222[1] = anyType98;
            AsyncFunction62222.setAsyncFunctionComponent(new SuspendFunctionComponent(name62222, anyTypeArr64222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$161(null)));
            AsyncFunctionBuilder AsyncFunction63222 = classComponentBuilder2.AsyncFunction("updateUrlAddress");
            String name63222 = AsyncFunction63222.getName();
            TypeConverterProvider converters64222 = AsyncFunction63222.getConverters();
            AnyType[] anyTypeArr65222 = new AnyType[2];
            anyType99 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType99 == null) {
                try {
                    Result.Companion companion204 = Result.INSTANCE;
                    m13470constructorimpl102 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$162
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th107) {
                    Result.Companion companion205 = Result.INSTANCE;
                    m13470constructorimpl102 = Result.m13470constructorimpl(ResultKt.createFailure(th107));
                }
                Throwable m13473exceptionOrNullimpl103 = Result.m13473exceptionOrNullimpl(m13470constructorimpl102);
                if (m13473exceptionOrNullimpl103 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl103);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl102)) {
                    m13470constructorimpl102 = null;
                }
                TypeDescriptor typeDescriptor103 = (TypeDescriptor) m13470constructorimpl102;
                if (typeDescriptor103 == null) {
                    typeDescriptor103 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType99 = new AnyType(typeDescriptor103, converters64222);
            }
            anyTypeArr65222[0] = anyType99;
            anyType100 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.Existing.class), false));
            if (anyType100 == null) {
                try {
                    Result.Companion companion206 = Result.INSTANCE;
                    m13470constructorimpl103 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.UrlAddressRecord.Existing", Reflection.getOrCreateKotlinClass(UrlAddressRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$163
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(UrlAddressRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th108) {
                    Result.Companion companion207 = Result.INSTANCE;
                    m13470constructorimpl103 = Result.m13470constructorimpl(ResultKt.createFailure(th108));
                }
                Throwable m13473exceptionOrNullimpl104 = Result.m13473exceptionOrNullimpl(m13470constructorimpl103);
                if (m13473exceptionOrNullimpl104 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + UrlAddressRecord.Existing.class.getName(), m13473exceptionOrNullimpl104);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl103)) {
                    m13470constructorimpl103 = null;
                }
                TypeDescriptor typeDescriptor104 = (TypeDescriptor) m13470constructorimpl103;
                if (typeDescriptor104 == null) {
                    typeDescriptor104 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(UrlAddressRecord.Existing.class));
                }
                anyType100 = new AnyType(typeDescriptor104, converters64222);
            }
            anyTypeArr65222[1] = anyType100;
            AsyncFunction63222.setAsyncFunctionComponent(new SuspendFunctionComponent(name63222, anyTypeArr65222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$164(null)));
            AsyncFunctionBuilder AsyncFunction64222 = classComponentBuilder2.AsyncFunction("deleteUrlAddress");
            String name64222 = AsyncFunction64222.getName();
            TypeConverterProvider converters65222 = AsyncFunction64222.getConverters();
            AnyType[] anyTypeArr66222 = new AnyType[2];
            anyType101 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType101 == null) {
                try {
                    Result.Companion companion208 = Result.INSTANCE;
                    m13470constructorimpl104 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$165
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th109) {
                    Result.Companion companion209 = Result.INSTANCE;
                    m13470constructorimpl104 = Result.m13470constructorimpl(ResultKt.createFailure(th109));
                }
                Throwable m13473exceptionOrNullimpl105 = Result.m13473exceptionOrNullimpl(m13470constructorimpl104);
                if (m13473exceptionOrNullimpl105 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl105);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl104)) {
                    m13470constructorimpl104 = null;
                }
                TypeDescriptor typeDescriptor105 = (TypeDescriptor) m13470constructorimpl104;
                if (typeDescriptor105 == null) {
                    typeDescriptor105 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType101 = new AnyType(typeDescriptor105, converters65222);
            }
            anyTypeArr66222[0] = anyType101;
            anyType102 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UrlAddressRecord.Existing.class), false));
            if (anyType102 == null) {
                try {
                    Result.Companion companion210 = Result.INSTANCE;
                    m13470constructorimpl105 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.fields.UrlAddressRecord.Existing", Reflection.getOrCreateKotlinClass(UrlAddressRecord.Existing.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$166
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(UrlAddressRecord.Existing.class);
                        }
                    }));
                } catch (Throwable th110) {
                    Result.Companion companion211 = Result.INSTANCE;
                    m13470constructorimpl105 = Result.m13470constructorimpl(ResultKt.createFailure(th110));
                }
                Throwable m13473exceptionOrNullimpl106 = Result.m13473exceptionOrNullimpl(m13470constructorimpl105);
                if (m13473exceptionOrNullimpl106 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + UrlAddressRecord.Existing.class.getName(), m13473exceptionOrNullimpl106);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl105)) {
                    m13470constructorimpl105 = null;
                }
                TypeDescriptor typeDescriptor106 = (TypeDescriptor) m13470constructorimpl105;
                if (typeDescriptor106 == null) {
                    typeDescriptor106 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(UrlAddressRecord.Existing.class));
                }
                anyType102 = new AnyType(typeDescriptor106, converters65222);
            }
            anyTypeArr66222[1] = anyType102;
            AsyncFunction64222.setAsyncFunctionComponent(new SuspendFunctionComponent(name64222, anyTypeArr66222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$167(null)));
            AsyncFunctionBuilder AsyncFunction65222 = classComponentBuilder2.AsyncFunction("editWithForm");
            String name65222 = AsyncFunction65222.getName();
            TypeConverterProvider converters66222 = AsyncFunction65222.getConverters();
            AnyType[] anyTypeArr67222 = new AnyType[1];
            anyType103 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Contact.class), false));
            if (anyType103 == null) {
                try {
                    Result.Companion companion212 = Result.INSTANCE;
                    m13470constructorimpl106 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.Contact", Reflection.getOrCreateKotlinClass(Contact.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$168
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Contact.class);
                        }
                    }));
                } catch (Throwable th111) {
                    Result.Companion companion213 = Result.INSTANCE;
                    m13470constructorimpl106 = Result.m13470constructorimpl(ResultKt.createFailure(th111));
                }
                Throwable m13473exceptionOrNullimpl107 = Result.m13473exceptionOrNullimpl(m13470constructorimpl106);
                if (m13473exceptionOrNullimpl107 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Contact.class.getName(), m13473exceptionOrNullimpl107);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl106)) {
                    m13470constructorimpl106 = null;
                }
                TypeDescriptor typeDescriptor107 = (TypeDescriptor) m13470constructorimpl106;
                if (typeDescriptor107 == null) {
                    typeDescriptor107 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Contact.class));
                }
                anyType103 = new AnyType(typeDescriptor107, converters66222);
            }
            anyTypeArr67222[0] = anyType103;
            AsyncFunction65222.setAsyncFunctionComponent(new SuspendFunctionComponent(name65222, anyTypeArr67222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169(null)));
            AsyncFunctionBuilder StaticAsyncFunction822 = classComponentBuilder2.StaticAsyncFunction("create");
            String name66222 = StaticAsyncFunction822.getName();
            TypeConverterProvider converters67222 = StaticAsyncFunction822.getConverters();
            AnyType[] anyTypeArr68222 = new AnyType[1];
            anyType104 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CreateContactRecord.class), false));
            if (anyType104 == null) {
                try {
                    Result.Companion companion214 = Result.INSTANCE;
                    m13470constructorimpl107 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.contact.CreateContactRecord", Reflection.getOrCreateKotlinClass(CreateContactRecord.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$170
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(CreateContactRecord.class);
                        }
                    }));
                } catch (Throwable th112) {
                    Result.Companion companion215 = Result.INSTANCE;
                    m13470constructorimpl107 = Result.m13470constructorimpl(ResultKt.createFailure(th112));
                }
                Throwable m13473exceptionOrNullimpl108 = Result.m13473exceptionOrNullimpl(m13470constructorimpl107);
                if (m13473exceptionOrNullimpl108 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + CreateContactRecord.class.getName(), m13473exceptionOrNullimpl108);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl107)) {
                    m13470constructorimpl107 = null;
                }
                TypeDescriptor typeDescriptor108 = (TypeDescriptor) m13470constructorimpl107;
                if (typeDescriptor108 == null) {
                    typeDescriptor108 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(CreateContactRecord.class));
                }
                anyType104 = new AnyType(typeDescriptor108, converters67222);
            }
            anyTypeArr68222[0] = anyType104;
            StaticAsyncFunction822.setAsyncFunctionComponent(new SuspendFunctionComponent(name66222, anyTypeArr68222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$171(null, this)));
            AsyncFunctionBuilder StaticAsyncFunction2222 = classComponentBuilder2.StaticAsyncFunction("presentCreateForm");
            String name67222 = StaticAsyncFunction2222.getName();
            TypeConverterProvider converters68222 = StaticAsyncFunction2222.getConverters();
            AnyType[] anyTypeArr69222 = new AnyType[1];
            anyType105 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CreateContactRecord.class), true));
            if (anyType105 == null) {
                try {
                    Result.Companion companion216 = Result.INSTANCE;
                    m13470constructorimpl108 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.contact.CreateContactRecord", Reflection.getOrCreateKotlinClass(CreateContactRecord.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$172
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(CreateContactRecord.class);
                        }
                    }));
                } catch (Throwable th113) {
                    Result.Companion companion217 = Result.INSTANCE;
                    m13470constructorimpl108 = Result.m13470constructorimpl(ResultKt.createFailure(th113));
                }
                Throwable m13473exceptionOrNullimpl109 = Result.m13473exceptionOrNullimpl(m13470constructorimpl108);
                if (m13473exceptionOrNullimpl109 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + CreateContactRecord.class.getName(), m13473exceptionOrNullimpl109);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl108)) {
                    m13470constructorimpl108 = null;
                }
                TypeDescriptor typeDescriptor109 = (TypeDescriptor) m13470constructorimpl108;
                if (typeDescriptor109 == null) {
                    typeDescriptor109 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(CreateContactRecord.class));
                }
                anyType105 = new AnyType(typeDescriptor109, converters68222);
            }
            anyTypeArr69222[0] = anyType105;
            StaticAsyncFunction2222.setAsyncFunctionComponent(new SuspendFunctionComponent(name67222, anyTypeArr69222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173(null, this)));
            AsyncFunctionBuilder StaticAsyncFunction3222 = classComponentBuilder2.StaticAsyncFunction("presentPicker");
            SuspendFunctionComponent suspendFunctionComponent722 = new SuspendFunctionComponent(StaticAsyncFunction3222.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$174(null, this));
            StaticAsyncFunction3222.setAsyncFunctionComponent(suspendFunctionComponent722);
            SuspendFunctionComponent suspendFunctionComponent2222 = suspendFunctionComponent722;
            AsyncFunctionBuilder StaticAsyncFunction4222 = classComponentBuilder2.StaticAsyncFunction("getAll");
            String name68222 = StaticAsyncFunction4222.getName();
            TypeConverterProvider converters69222 = StaticAsyncFunction4222.getConverters();
            AnyType[] anyTypeArr70222 = new AnyType[1];
            anyType106 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ContactQueryOptions.class), true));
            if (anyType106 == null) {
                try {
                    Result.Companion companion218 = Result.INSTANCE;
                    m13470constructorimpl109 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.ContactQueryOptions", Reflection.getOrCreateKotlinClass(ContactQueryOptions.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$175
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(ContactQueryOptions.class);
                        }
                    }));
                } catch (Throwable th114) {
                    Result.Companion companion219 = Result.INSTANCE;
                    m13470constructorimpl109 = Result.m13470constructorimpl(ResultKt.createFailure(th114));
                }
                Throwable m13473exceptionOrNullimpl110 = Result.m13473exceptionOrNullimpl(m13470constructorimpl109);
                if (m13473exceptionOrNullimpl110 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ContactQueryOptions.class.getName(), m13473exceptionOrNullimpl110);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl109)) {
                    m13470constructorimpl109 = null;
                }
                TypeDescriptor typeDescriptor110 = (TypeDescriptor) m13470constructorimpl109;
                if (typeDescriptor110 == null) {
                    typeDescriptor110 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(ContactQueryOptions.class));
                }
                anyType106 = new AnyType(typeDescriptor110, converters69222);
            }
            anyTypeArr70222[0] = anyType106;
            StaticAsyncFunction4222.setAsyncFunctionComponent(new SuspendFunctionComponent(name68222, anyTypeArr70222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$176(null, this)));
            AsyncFunctionBuilder StaticAsyncFunction5222 = classComponentBuilder2.StaticAsyncFunction("getAllDetails");
            String name69222 = StaticAsyncFunction5222.getName();
            TypeConverterProvider converters70222 = StaticAsyncFunction5222.getConverters();
            AnyType[] anyTypeArr71222 = new AnyType[2];
            anyType107 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Set.class), false));
            if (anyType107 == null) {
                classComponentBuilder = classComponentBuilder2;
            } else {
                try {
                    Result.Companion companion220 = Result.INSTANCE;
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Set.class);
                    TypeInfo[] typeInfoArr2 = new TypeInfo[1];
                    classComponentBuilder = classComponentBuilder2;
                    try {
                        typeInfoArr2[0] = new TypeInfo.Simple("expo.modules.contacts.next.records.fields.ContactField", Reflection.getOrCreateKotlinClass(ContactField.class), false);
                        m13470constructorimpl110 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Parameterized("kotlin.collections.Set", orCreateKotlinClass3, false, ArraysKt.asList(typeInfoArr2))), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$177
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Set.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(ContactField.class)));
                            }
                        }));
                    } catch (Throwable th115) {
                        th = th115;
                        Result.Companion companion221 = Result.INSTANCE;
                        m13470constructorimpl110 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl110);
                        if (m13473exceptionOrNullimpl3 != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl110)) {
                        }
                        typeDescriptor3 = (TypeDescriptor) m13470constructorimpl110;
                        if (typeDescriptor3 != null) {
                        }
                        anyType107 = new AnyType(typeDescriptor3, converters70222);
                        anyTypeArr71222[0] = anyType107;
                        anyType108 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ContactQueryOptions.class), true));
                        if (anyType108 == null) {
                        }
                        anyTypeArr71222[1] = anyType108;
                        StaticAsyncFunction5222.setAsyncFunctionComponent(new SuspendFunctionComponent(name69222, anyTypeArr71222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179(null, this)));
                        ClassComponentBuilder classComponentBuilder3222 = classComponentBuilder;
                        AsyncFunctionBuilder StaticAsyncFunction6222 = classComponentBuilder3222.StaticAsyncFunction("getCount");
                        SuspendFunctionComponent suspendFunctionComponent3222 = new SuspendFunctionComponent(StaticAsyncFunction6222.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180(null, this));
                        StaticAsyncFunction6222.setAsyncFunctionComponent(suspendFunctionComponent3222);
                        SuspendFunctionComponent suspendFunctionComponent4222 = suspendFunctionComponent3222;
                        AsyncFunctionBuilder StaticAsyncFunction7222 = classComponentBuilder3222.StaticAsyncFunction("hasAny");
                        SuspendFunctionComponent suspendFunctionComponent5222 = new SuspendFunctionComponent(StaticAsyncFunction7222.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$181(null, this));
                        StaticAsyncFunction7222.setAsyncFunctionComponent(suspendFunctionComponent5222);
                        SuspendFunctionComponent suspendFunctionComponent6222 = suspendFunctionComponent5222;
                        if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                        }
                        classComponentBuilder3222.getStaticAsyncFunctions().put("requestPermissionsAsync", intAsyncFunctionComponent);
                        if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                        }
                        classComponentBuilder3222.getStaticAsyncFunctions().put("getPermissions", intAsyncFunctionComponent2);
                        moduleDefinitionBuilder2.getClassData().add(classComponentBuilder3222.buildClass());
                        ModuleDefinitionBuilder moduleDefinitionBuilder4222 = moduleDefinitionBuilder3;
                        moduleDefinitionBuilder4222.Events("onContactsChange");
                        moduleDefinitionBuilder4222.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$$inlined$OnDestroy$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ContactsObserverDelegate observerDelegate;
                                observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                observerDelegate.stopObservingContactChanges();
                            }
                        }));
                        moduleDefinitionBuilder4222.OnStartObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$3
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ContactsObserverDelegate observerDelegate;
                                observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                observerDelegate.startObservingContactChanges();
                            }
                        });
                        moduleDefinitionBuilder4222.OnStopObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$4
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ContactsObserverDelegate observerDelegate;
                                observerDelegate = ContactsNextModule.this.getObserverDelegate();
                                observerDelegate.stopObservingContactChanges();
                            }
                        });
                        moduleDefinitionBuilder4222.RegisterActivityContracts(new ContactsNextModule$definition$1$5(this, null));
                        ModuleDefinitionData buildModule222 = moduleDefinitionBuilder4222.buildModule();
                        Trace.endSection();
                        return buildModule222;
                    }
                } catch (Throwable th116) {
                    th = th116;
                    classComponentBuilder = classComponentBuilder2;
                }
                m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl110);
                if (m13473exceptionOrNullimpl3 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Set.class.getName(), m13473exceptionOrNullimpl3);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl110)) {
                    m13470constructorimpl110 = null;
                }
                typeDescriptor3 = (TypeDescriptor) m13470constructorimpl110;
                if (typeDescriptor3 != null) {
                    typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Set.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(ContactField.class))));
                }
                anyType107 = new AnyType(typeDescriptor3, converters70222);
            }
            anyTypeArr71222[0] = anyType107;
            anyType108 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ContactQueryOptions.class), true));
            if (anyType108 == null) {
                try {
                    Result.Companion companion222 = Result.INSTANCE;
                    m13470constructorimpl111 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.contacts.next.records.ContactQueryOptions", Reflection.getOrCreateKotlinClass(ContactQueryOptions.class), true)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$178
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(ContactQueryOptions.class);
                        }
                    }));
                } catch (Throwable th117) {
                    Result.Companion companion223 = Result.INSTANCE;
                    m13470constructorimpl111 = Result.m13470constructorimpl(ResultKt.createFailure(th117));
                }
                Throwable m13473exceptionOrNullimpl111 = Result.m13473exceptionOrNullimpl(m13470constructorimpl111);
                if (m13473exceptionOrNullimpl111 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ContactQueryOptions.class.getName(), m13473exceptionOrNullimpl111);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl111)) {
                    m13470constructorimpl111 = null;
                }
                TypeDescriptor typeDescriptor111 = (TypeDescriptor) m13470constructorimpl111;
                if (typeDescriptor111 == null) {
                    typeDescriptor111 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(ContactQueryOptions.class));
                }
                anyType108 = new AnyType(typeDescriptor111, converters70222);
            }
            anyTypeArr71222[1] = anyType108;
            StaticAsyncFunction5222.setAsyncFunctionComponent(new SuspendFunctionComponent(name69222, anyTypeArr71222, new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179(null, this)));
            ClassComponentBuilder classComponentBuilder32222 = classComponentBuilder;
            AsyncFunctionBuilder StaticAsyncFunction62222 = classComponentBuilder32222.StaticAsyncFunction("getCount");
            SuspendFunctionComponent suspendFunctionComponent32222 = new SuspendFunctionComponent(StaticAsyncFunction62222.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180(null, this));
            StaticAsyncFunction62222.setAsyncFunctionComponent(suspendFunctionComponent32222);
            SuspendFunctionComponent suspendFunctionComponent42222 = suspendFunctionComponent32222;
            AsyncFunctionBuilder StaticAsyncFunction72222 = classComponentBuilder32222.StaticAsyncFunction("hasAny");
            SuspendFunctionComponent suspendFunctionComponent52222 = new SuspendFunctionComponent(StaticAsyncFunction72222.getName(), new AnyType[0], new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$181(null, this));
            StaticAsyncFunction72222.setAsyncFunctionComponent(suspendFunctionComponent52222);
            SuspendFunctionComponent suspendFunctionComponent62222 = suspendFunctionComponent52222;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        ContactsPermissionsDelegate permissionsDelegate;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        permissionsDelegate = ContactsNextModule.this.getPermissionsDelegate();
                        permissionsDelegate.requestPermissions(promise);
                    }
                });
            } else {
                TypeConverterProvider converters71 = classComponentBuilder32222.getConverters();
                AnyType[] anyTypeArr73 = new AnyType[1];
                AnyType anyType113 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType113 == null) {
                    try {
                        Result.Companion companion224 = Result.INSTANCE;
                        m13470constructorimpl112 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$2
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th118) {
                        Result.Companion companion225 = Result.INSTANCE;
                        m13470constructorimpl112 = Result.m13470constructorimpl(ResultKt.createFailure(th118));
                    }
                    Throwable m13473exceptionOrNullimpl112 = Result.m13473exceptionOrNullimpl(m13470constructorimpl112);
                    if (m13473exceptionOrNullimpl112 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl112);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl112)) {
                        m13470constructorimpl112 = null;
                    }
                    TypeDescriptor typeDescriptor112 = (TypeDescriptor) m13470constructorimpl112;
                    if (typeDescriptor112 == null) {
                        typeDescriptor112 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType113 = new AnyType(typeDescriptor112, converters71);
                }
                anyTypeArr73[0] = anyType113;
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        ContactsPermissionsDelegate permissionsDelegate;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        permissionsDelegate = ContactsNextModule.this.getPermissionsDelegate();
                        permissionsDelegate.requestPermissions(promise);
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr73, function1) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr73, function1) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr73, function1) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr73, function1) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr73, function1) : new UntypedAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr73, function1);
            }
            classComponentBuilder32222.getStaticAsyncFunctions().put("requestPermissionsAsync", intAsyncFunctionComponent);
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("getPermissions", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        ContactsPermissionsDelegate permissionsDelegate;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        permissionsDelegate = ContactsNextModule.this.getPermissionsDelegate();
                        permissionsDelegate.getPermissions(promise);
                    }
                });
            } else {
                TypeConverterProvider converters73 = classComponentBuilder32222.getConverters();
                AnyType[] anyTypeArr74 = new AnyType[1];
                AnyType anyType114 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType114 == null) {
                    try {
                        Result.Companion companion226 = Result.INSTANCE;
                        m13470constructorimpl113 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$5
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th119) {
                        Result.Companion companion227 = Result.INSTANCE;
                        m13470constructorimpl113 = Result.m13470constructorimpl(ResultKt.createFailure(th119));
                    }
                    Object obj = m13470constructorimpl113;
                    Throwable m13473exceptionOrNullimpl113 = Result.m13473exceptionOrNullimpl(obj);
                    if (m13473exceptionOrNullimpl113 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl113);
                    }
                    if (Result.m13476isFailureimpl(obj)) {
                        obj = null;
                    }
                    TypeDescriptor typeDescriptor113 = (TypeDescriptor) obj;
                    if (typeDescriptor113 == null) {
                        typeDescriptor113 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType114 = new AnyType(typeDescriptor113, converters73);
                }
                anyTypeArr74[0] = anyType114;
                Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$StaticAsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        ContactsPermissionsDelegate permissionsDelegate;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        permissionsDelegate = ContactsNextModule.this.getPermissionsDelegate();
                        permissionsDelegate.getPermissions(promise);
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent2 = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getPermissions", anyTypeArr74, function12) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getPermissions", anyTypeArr74, function12) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getPermissions", anyTypeArr74, function12) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getPermissions", anyTypeArr74, function12) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("getPermissions", anyTypeArr74, function12) : new UntypedAsyncFunctionComponent("getPermissions", anyTypeArr74, function12);
            }
            classComponentBuilder32222.getStaticAsyncFunctions().put("getPermissions", intAsyncFunctionComponent2);
            moduleDefinitionBuilder2.getClassData().add(classComponentBuilder32222.buildClass());
            ModuleDefinitionBuilder moduleDefinitionBuilder42222 = moduleDefinitionBuilder3;
            moduleDefinitionBuilder42222.Events("onContactsChange");
            moduleDefinitionBuilder42222.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$$inlined$OnDestroy$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ContactsObserverDelegate observerDelegate;
                    observerDelegate = ContactsNextModule.this.getObserverDelegate();
                    observerDelegate.stopObservingContactChanges();
                }
            }));
            moduleDefinitionBuilder42222.OnStartObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$3
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ContactsObserverDelegate observerDelegate;
                    observerDelegate = ContactsNextModule.this.getObserverDelegate();
                    observerDelegate.startObservingContactChanges();
                }
            });
            moduleDefinitionBuilder42222.OnStopObserving("onContactsChange", new Function0<Unit>() { // from class: expo.modules.contacts.next.ContactsNextModule$definition$1$4
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ContactsObserverDelegate observerDelegate;
                    observerDelegate = ContactsNextModule.this.getObserverDelegate();
                    observerDelegate.stopObservingContactChanges();
                }
            });
            moduleDefinitionBuilder42222.RegisterActivityContracts(new ContactsNextModule$definition$1$5(this, null));
            ModuleDefinitionData buildModule2222 = moduleDefinitionBuilder42222.buildModule();
            Trace.endSection();
            return buildModule2222;
        } catch (Throwable th120) {
            th = th120;
            Trace.endSection();
            throw th;
        }
    }
}
