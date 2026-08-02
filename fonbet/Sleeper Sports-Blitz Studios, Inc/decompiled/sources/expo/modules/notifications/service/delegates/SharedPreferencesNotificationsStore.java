package expo.modules.notifications.service.delegates;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.service.NotificationsService;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SharedPreferencesNotificationsStore.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bJ \u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0002J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationsStore;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getNotificationRequest", "Lexpo/modules/notifications/notifications/model/NotificationRequest;", "identifier", "", "allNotificationRequests", "", "getAllNotificationRequests", "()Ljava/util/Collection;", "saveNotificationRequest", "", NotificationsService.NOTIFICATION_REQUEST_KEY, "removeNotificationRequest", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "editor", "removeAllNotificationRequests", "preferencesNotificationRequestKey", "Companion", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SharedPreferencesNotificationsStore {
    private static final String NOTIFICATION_REQUEST_KEY_PREFIX = "notification_request-";
    private static final String SHARED_PREFERENCES_NAME = "expo.modules.notifications.SharedPreferencesNotificationsStore";
    private final SharedPreferences sharedPreferences;

    public SharedPreferencesNotificationsStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
    }

    public final NotificationRequest getNotificationRequest(String identifier) throws IOException, ClassNotFoundException {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        String string = this.sharedPreferences.getString(preferencesNotificationRequestKey(identifier), null);
        if (string == null) {
            return null;
        }
        ObjectInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 2));
        try {
            byteArrayInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                Object readObject = byteArrayInputStream.readObject();
                if (readObject instanceof NotificationRequest) {
                    CloseableKt.closeFinally(byteArrayInputStream, null);
                    CloseableKt.closeFinally(byteArrayInputStream, null);
                    return (NotificationRequest) readObject;
                }
                throw new InvalidClassException("Expected serialized object to be an instance of " + NotificationRequest.class + ". Found: " + readObject);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection<NotificationRequest> getAllNotificationRequests() {
        NotificationRequest notificationRequest;
        String str;
        Map<String, ?> all = this.sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            if (StringsKt.startsWith$default(key, NOTIFICATION_REQUEST_KEY_PREFIX, false, 2, (Object) null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            try {
                str = (String) ((Map.Entry) it.next()).getValue();
            } catch (IOException | ClassNotFoundException unused) {
            }
            if (str != null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 2));
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        Object readObject = objectInputStream.readObject();
                        if (!(readObject instanceof NotificationRequest)) {
                            throw new InvalidClassException("Expected serialized object to be an instance of " + NotificationRequest.class + ". Found: " + readObject);
                        }
                        CloseableKt.closeFinally(objectInputStream, null);
                        CloseableKt.closeFinally(byteArrayInputStream, null);
                        notificationRequest = (NotificationRequest) readObject;
                        if (notificationRequest == null) {
                            arrayList.add(notificationRequest);
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(objectInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(byteArrayInputStream, th3);
                        throw th4;
                    }
                }
            }
            notificationRequest = null;
            if (notificationRequest == null) {
            }
        }
        return arrayList;
    }

    public final void saveNotificationRequest(NotificationRequest notificationRequest) throws IOException {
        Intrinsics.checkNotNullParameter(notificationRequest, "notificationRequest");
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        String identifier = notificationRequest.getIdentifier();
        Intrinsics.checkNotNullExpressionValue(identifier, "getIdentifier(...)");
        edit.putString(preferencesNotificationRequestKey(identifier), Base64SerializationKt.encodedInBase64(notificationRequest)).apply();
    }

    public final void removeNotificationRequest(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "edit(...)");
        removeNotificationRequest(edit, identifier).apply();
    }

    private final SharedPreferences.Editor removeNotificationRequest(SharedPreferences.Editor editor, String identifier) {
        return editor.remove(preferencesNotificationRequestKey(identifier));
    }

    public final Collection<String> removeAllNotificationRequests() {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        Collection<NotificationRequest> allNotificationRequests = getAllNotificationRequests();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(allNotificationRequests, 10));
        for (NotificationRequest notificationRequest : allNotificationRequests) {
            Intrinsics.checkNotNull(edit);
            String identifier = notificationRequest.getIdentifier();
            Intrinsics.checkNotNullExpressionValue(identifier, "getIdentifier(...)");
            removeNotificationRequest(edit, identifier);
            arrayList.add(notificationRequest.getIdentifier());
        }
        edit.apply();
        return arrayList;
    }

    private final String preferencesNotificationRequestKey(String identifier) {
        return NOTIFICATION_REQUEST_KEY_PREFIX + identifier;
    }
}
