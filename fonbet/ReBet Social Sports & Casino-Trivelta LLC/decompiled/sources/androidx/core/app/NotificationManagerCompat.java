package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import h.InterfaceC4396a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners;
    private static j sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    public static class a {
        public static List a(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    public static class b {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public static class c {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, List list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void d(NotificationManager notificationManager, List list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    public static class d {
        public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    public static class e {
        public static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    public static class f {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    public static class g {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.canPostPromotedNotifications();
        }
    }

    public static class h implements k {

        /* renamed from: a, reason: collision with root package name */
        public final String f18812a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18813b;

        /* renamed from: c, reason: collision with root package name */
        public final String f18814c;

        /* renamed from: d, reason: collision with root package name */
        public final Notification f18815d;

        public h(String str, int i10, String str2, Notification notification) {
            this.f18812a = str;
            this.f18813b = i10;
            this.f18814c = str2;
            this.f18815d = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.k
        public void a(InterfaceC4396a interfaceC4396a) {
            interfaceC4396a.H0(this.f18812a, this.f18813b, this.f18814c, this.f18815d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f18812a + ", id:" + this.f18813b + ", tag:" + this.f18814c + "]";
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f18816a;

        /* renamed from: b, reason: collision with root package name */
        public final IBinder f18817b;

        public i(ComponentName componentName, IBinder iBinder) {
            this.f18816a = componentName;
            this.f18817b = iBinder;
        }
    }

    public static class j implements Handler.Callback, ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final Context f18818a;

        /* renamed from: b, reason: collision with root package name */
        public final HandlerThread f18819b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f18820c;

        /* renamed from: d, reason: collision with root package name */
        public final Map f18821d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public Set f18822e = new HashSet();

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ComponentName f18823a;

            /* renamed from: c, reason: collision with root package name */
            public InterfaceC4396a f18825c;

            /* renamed from: b, reason: collision with root package name */
            public boolean f18824b = false;

            /* renamed from: d, reason: collision with root package name */
            public ArrayDeque f18826d = new ArrayDeque();

            /* renamed from: e, reason: collision with root package name */
            public int f18827e = 0;

            public a(ComponentName componentName) {
                this.f18823a = componentName;
            }
        }

        public j(Context context) {
            this.f18818a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f18819b = handlerThread;
            handlerThread.start();
            this.f18820c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.f18824b) {
                return true;
            }
            boolean bindService = this.f18818a.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(aVar.f18823a), this, 33);
            aVar.f18824b = bindService;
            if (bindService) {
                aVar.f18827e = 0;
            } else {
                Log.w(NotificationManagerCompat.TAG, "Unable to bind to listener " + aVar.f18823a);
                this.f18818a.unbindService(this);
            }
            return aVar.f18824b;
        }

        public final void b(a aVar) {
            if (aVar.f18824b) {
                this.f18818a.unbindService(this);
                aVar.f18824b = false;
            }
            aVar.f18825c = null;
        }

        public final void c(k kVar) {
            j();
            for (a aVar : this.f18821d.values()) {
                aVar.f18826d.add(kVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = (a) this.f18821d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f18821d.get(componentName);
            if (aVar != null) {
                aVar.f18825c = InterfaceC4396a.AbstractBinderC0709a.c(iBinder);
                aVar.f18827e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = (a) this.f18821d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Objects.toString(aVar.f18823a);
                aVar.f18826d.size();
            }
            if (aVar.f18826d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f18825c == null) {
                i(aVar);
                return;
            }
            while (true) {
                k kVar = (k) aVar.f18826d.peek();
                if (kVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        kVar.toString();
                    }
                    kVar.a(aVar.f18825c);
                    aVar.f18826d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Objects.toString(aVar.f18823a);
                    }
                } catch (RemoteException e10) {
                    Log.w(NotificationManagerCompat.TAG, "RemoteException communicating with " + aVar.f18823a, e10);
                }
            }
            if (aVar.f18826d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        public void h(k kVar) {
            this.f18820c.obtainMessage(0, kVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((k) message.obj);
                return true;
            }
            if (i10 == 1) {
                i iVar = (i) message.obj;
                e(iVar.f18816a, iVar.f18817b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        public final void i(a aVar) {
            if (this.f18820c.hasMessages(3, aVar.f18823a)) {
                return;
            }
            int i10 = aVar.f18827e + 1;
            aVar.f18827e = i10;
            if (i10 <= 6) {
                Log.isLoggable(NotificationManagerCompat.TAG, 3);
                this.f18820c.sendMessageDelayed(this.f18820c.obtainMessage(3, aVar.f18823a), (1 << r0) * 1000);
                return;
            }
            Log.w(NotificationManagerCompat.TAG, "Giving up on delivering " + aVar.f18826d.size() + " tasks to " + aVar.f18823a + " after " + aVar.f18827e + " retries");
            aVar.f18826d.clear();
        }

        public final void j() {
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.f18818a);
            if (enabledListenerPackages.equals(this.f18822e)) {
                return;
            }
            this.f18822e = enabledListenerPackages;
            List<ResolveInfo> queryIntentServices = this.f18818a.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(NotificationManagerCompat.TAG, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f18821d.containsKey(componentName2)) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Objects.toString(componentName2);
                    }
                    this.f18821d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f18821d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Objects.toString(entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Objects.toString(componentName);
            }
            this.f18820c.obtainMessage(1, new i(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Objects.toString(componentName);
            }
            this.f18820c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface k {
        void a(InterfaceC4396a interfaceC4396a);
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                try {
                    if (!string.equals(sEnabledNotificationListeners)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        sEnabledNotificationListenerPackages = hashSet;
                        sEnabledNotificationListeners = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(k kVar) {
        synchronized (sLock) {
            try {
                if (sSideChannelManager == null) {
                    sSideChannelManager = new j(this.mContext.getApplicationContext());
                }
                sSideChannelManager.h(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle a10 = o.a(notification);
        return a10 != null && a10.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean areNotificationsEnabled() {
        return b.a(this.mNotificationManager);
    }

    public boolean canPostPromotedNotifications() {
        if (Build.VERSION.SDK_INT >= 36) {
            return g.a(this.mNotificationManager);
        }
        return false;
    }

    public boolean canUseFullScreenIntent() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29) {
            return true;
        }
        return i10 < 34 ? this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0 : f.a(this.mNotificationManager);
    }

    public void cancel(int i10) {
        cancel(null, i10);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.a(this.mNotificationManager, notificationChannel);
        }
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.b(this.mNotificationManager, notificationChannelGroup);
        }
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.c(this.mNotificationManager, list);
        }
    }

    public void createNotificationChannelGroupsCompat(List<n> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        c.c(this.mNotificationManager, arrayList);
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.d(this.mNotificationManager, list);
        }
    }

    public void createNotificationChannelsCompat(List<l> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        c.d(this.mNotificationManager, arrayList);
    }

    public void deleteNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.e(this.mNotificationManager, str);
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.f(this.mNotificationManager, str);
        }
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it = c.k(this.mNotificationManager).iterator();
            while (it.hasNext()) {
                NotificationChannel a10 = m.a(it.next());
                if (!collection.contains(c.g(a10)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(e.b(a10)))) {
                    c.e(this.mNotificationManager, c.g(a10));
                }
            }
        }
    }

    public List<StatusBarNotification> getActiveNotifications() {
        return a.a(this.mNotificationManager);
    }

    public int getCurrentInterruptionFilter() {
        return a.b(this.mNotificationManager);
    }

    public int getImportance() {
        return b.b(this.mNotificationManager);
    }

    public NotificationChannel getNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.i(this.mNotificationManager, str);
        }
        return null;
    }

    public l getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new l(notificationChannel);
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return d.a(this.mNotificationManager, str);
        }
        if (i10 >= 26) {
            Iterator<NotificationChannelGroup> it = getNotificationChannelGroups().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup a10 = r.a(it.next());
                if (c.h(a10).equals(str)) {
                    return a10;
                }
            }
        }
        return null;
    }

    public n getNotificationChannelGroupCompat(String str) {
        NotificationChannelGroup notificationChannelGroup;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new n(notificationChannelGroup2);
            }
            return null;
        }
        if (i10 < 26 || (notificationChannelGroup = getNotificationChannelGroup(str)) == null) {
            return null;
        }
        return new n(notificationChannelGroup, getNotificationChannels());
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return Build.VERSION.SDK_INT >= 26 ? c.j(this.mNotificationManager) : Collections.EMPTY_LIST;
    }

    public List<n> getNotificationChannelGroupsCompat() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                List<NotificationChannel> notificationChannels = i10 >= 28 ? Collections.EMPTY_LIST : getNotificationChannels();
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                Iterator<NotificationChannelGroup> it = notificationChannelGroups.iterator();
                while (it.hasNext()) {
                    NotificationChannelGroup a10 = r.a(it.next());
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new n(a10));
                    } else {
                        arrayList.add(new n(a10, notificationChannels));
                    }
                }
                return arrayList;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public List<NotificationChannel> getNotificationChannels() {
        return Build.VERSION.SDK_INT >= 26 ? c.k(this.mNotificationManager) : Collections.EMPTY_LIST;
    }

    public List<l> getNotificationChannelsCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                Iterator<NotificationChannel> it = notificationChannels.iterator();
                while (it.hasNext()) {
                    arrayList.add(new l(m.a(it.next())));
                }
                return arrayList;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public void notify(int i10, Notification notification) {
        notify(null, i10, notification);
    }

    public void cancel(String str, int i10) {
        this.mNotificationManager.cancel(str, i10);
    }

    public void notify(String str, int i10, Notification notification) {
        if (!useSideChannelForNotification(notification)) {
            this.mNotificationManager.notify(str, i10, notification);
        } else {
            pushSideChannelQueue(new h(this.mContext.getPackageName(), i10, str, notification));
            this.mNotificationManager.cancel(str, i10);
        }
    }

    public void createNotificationChannel(l lVar) {
        createNotificationChannel(lVar.a());
    }

    public void createNotificationChannelGroup(n nVar) {
        createNotificationChannelGroup(nVar.b());
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return e.a(this.mNotificationManager, str, str2);
        }
        return getNotificationChannel(str);
    }

    public NotificationManagerCompat(NotificationManager notificationManager, Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    public l getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new l(notificationChannel);
    }

    public void notify(List<Object> list) {
        if (list.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(list.get(0));
        throw null;
    }
}
