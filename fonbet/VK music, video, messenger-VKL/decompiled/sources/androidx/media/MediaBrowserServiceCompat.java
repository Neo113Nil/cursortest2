package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSessionManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import xsna.ar;
import xsna.cqi;
import xsna.qg90;
import xsna.tdj;
import xsna.zk3;

/* loaded from: classes12.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public static final /* synthetic */ int h = 0;
    public f b;
    public final i c = new i();
    public final ArrayList<b> d;
    public final zk3<IBinder, b> e;
    public final l f;
    public MediaSessionCompat.Token g;

    public static final class a {
        public final Bundle a;

        public a(@Nullable Bundle bundle) {
            this.a = bundle;
        }
    }

    public class b implements IBinder.DeathRecipient {
        public final String b;
        public final int c;
        public final int d;
        public final j e;
        public final HashMap<String, List<qg90<IBinder, Bundle>>> f = new HashMap<>();
        public a g;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                MediaBrowserServiceCompat.this.e.remove(((k) bVar.e).a.getBinder());
            }
        }

        public b(String str, int i, int i2, k kVar) {
            this.b = str;
            this.c = i;
            this.d = i2;
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.e = kVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            MediaBrowserServiceCompat.this.f.post(new a());
        }
    }

    public class c {
        public final ArrayList a = new ArrayList();
        public a b;
        public Messenger c;

        public class a extends MediaBrowserService {
            public final /* synthetic */ e b;

            public a(e eVar, Context context) {
                this.b = eVar;
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundle2;
                a aVar;
                MediaSessionCompat.ensureClassLoader(bundle);
                e eVar = this.b;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
                int i2 = -1;
                if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
                    bundle2 = null;
                } else {
                    bundle3.remove("extra_client_version");
                    eVar.c = new Messenger(mediaBrowserServiceCompat.f);
                    Bundle b = ar.b(2, "extra_service_version");
                    b.putBinder("extra_messenger", eVar.c.getBinder());
                    MediaSessionCompat.Token token = mediaBrowserServiceCompat.g;
                    if (token != null) {
                        IMediaSession extraBinder = token.getExtraBinder();
                        b.putBinder("extra_session_binder", extraBinder == null ? null : extraBinder.asBinder());
                    } else {
                        eVar.a.add(b);
                    }
                    i2 = bundle3.getInt("extra_calling_pid", -1);
                    bundle3.remove("extra_calling_pid");
                    bundle2 = b;
                }
                b bVar = mediaBrowserServiceCompat.new b(str, i2, i, null);
                a c = mediaBrowserServiceCompat.c(str, i, bundle3);
                if (c == null) {
                    aVar = null;
                } else {
                    Bundle bundle4 = c.a;
                    if (eVar.c != null) {
                        mediaBrowserServiceCompat.d.add(bVar);
                    }
                    if (bundle2 == null) {
                        bundle2 = bundle4;
                    } else if (bundle4 != null) {
                        bundle2.putAll(bundle4);
                    }
                    aVar = new a(bundle2);
                }
                if (aVar == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(DomExceptionUtils.SEPARATOR, aVar.a);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                MediaBrowserServiceCompat.this.d(str, new androidx.media.f(str, new h(result)));
            }
        }

        public c() {
        }
    }

    public class d extends c {

        public class a extends c.a {
            @Override // android.service.media.MediaBrowserService
            public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                new h(result).a(null);
            }
        }
    }

    public class e extends d {

        public class a extends d.a {
            public a(Context context) {
                super(e.this, context);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                e eVar = e.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                androidx.media.h hVar = new androidx.media.h(eVar, str, new h(result), bundle);
                hVar.e = 1;
                mediaBrowserServiceCompat.d(str, hVar);
            }
        }

        public e() {
            super();
        }
    }

    public class f extends e {
    }

    public static class g<T> {
        public final Object a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;

        public g(Object obj) {
            this.a = obj;
        }

        public void a() {
            boolean z = this.b;
            Object obj = this.a;
            if (z) {
                throw new IllegalStateException(cqi.c(obj, "detach() called when detach() had already been called for: "));
            }
            if (this.c) {
                throw new IllegalStateException(cqi.c(obj, "detach() called when sendResult() had already been called for: "));
            }
            if (this.d) {
                throw new IllegalStateException(cqi.c(obj, "detach() called when sendError() had already been called for: "));
            }
            this.b = true;
        }

        public final boolean b() {
            return this.b || this.c || this.d;
        }

        public void c() {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.a);
        }

        public void d(@Nullable T t) {
            throw null;
        }

        public final void e() {
            if (this.c || this.d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.a);
            }
            this.d = true;
            c();
        }

        public final void f(@Nullable T t) {
            if (this.c || this.d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.a);
            }
            this.c = true;
            d(t);
        }
    }

    public static class h<T> {
        public final MediaBrowserService.Result a;

        public h(MediaBrowserService.Result result) {
            this.a = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(T t) {
            boolean z = t instanceof List;
            ArrayList arrayList = null;
            MediaBrowserService.Result result = this.a;
            if (!z) {
                if (!(t instanceof Parcel)) {
                    result.sendResult(null);
                    return;
                }
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            List<Parcel> list = (List) t;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Parcel parcel2 : list) {
                    parcel2.setDataPosition(0);
                    arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                    parcel2.recycle();
                }
            }
            result.sendResult(arrayList);
        }
    }

    public class i {
        public i() {
        }
    }

    public interface j {
    }

    public static class k implements j {
        public final Messenger a;

        public k(Messenger messenger) {
            this.a = messenger;
        }

        public final void a(String str, List list, Bundle bundle) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", null);
            if (list != null) {
                bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            b(3, bundle2);
        }

        public final void b(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.a.send(obtain);
        }
    }

    public static final class l extends Handler {

        @Nullable
        public MediaBrowserServiceCompat a;

        public final void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = this.a;
            if (mediaBrowserServiceCompat == null) {
                removeCallbacksAndMessages(null);
                return;
            }
            i iVar = mediaBrowserServiceCompat.c;
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle);
                    String string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_pid");
                    int i2 = data.getInt("data_calling_uid");
                    k kVar = new k(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                    if (string != null) {
                        String[] packagesForUid = mediaBrowserServiceCompat2.getPackageManager().getPackagesForUid(i2);
                        int length = packagesForUid.length;
                        int i3 = 0;
                        while (i3 < length) {
                            if (packagesForUid[i3].equals(string)) {
                                mediaBrowserServiceCompat2.f.a(new androidx.media.i(i, i2, bundle, iVar, kVar, string));
                                return;
                            }
                            i3++;
                            i = i;
                            i2 = i2;
                        }
                    }
                    throw new IllegalArgumentException(com.vk.movika.sdk.base.model.history.b.b(i2, "Package/uid mismatch: uid=", " package=", string));
                case 2:
                    MediaBrowserServiceCompat.this.f.a(new androidx.media.j(iVar, new k(message.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    String string2 = data.getString("data_media_item_id");
                    IBinder binder = data.getBinder("data_callback_token");
                    MediaBrowserServiceCompat.this.f.a(new androidx.media.k(iVar, new k(message.replyTo), string2, binder, bundle2));
                    return;
                case 4:
                    String string3 = data.getString("data_media_item_id");
                    IBinder binder2 = data.getBinder("data_callback_token");
                    MediaBrowserServiceCompat.this.f.a(new androidx.media.l(iVar, new k(message.replyTo), string3, binder2));
                    return;
                case 5:
                    String string4 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    k kVar2 = new k(message.replyTo);
                    iVar.getClass();
                    if (TextUtils.isEmpty(string4) || resultReceiver == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f.a(new m(iVar, kVar2, string4, resultReceiver));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    k kVar3 = new k(message.replyTo);
                    String string5 = data.getString("data_package_name");
                    int i4 = data.getInt("data_calling_pid");
                    MediaBrowserServiceCompat.this.f.a(new n(data.getInt("data_calling_uid"), i4, bundle3, iVar, kVar3, string5));
                    return;
                case 7:
                    MediaBrowserServiceCompat.this.f.a(new o(iVar, new k(message.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    String string6 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    k kVar4 = new k(message.replyTo);
                    iVar.getClass();
                    if (TextUtils.isEmpty(string6) || resultReceiver2 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f.a(new p(iVar, kVar4, string6, bundle4, resultReceiver2));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    String string7 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    k kVar5 = new k(message.replyTo);
                    iVar.getClass();
                    if (TextUtils.isEmpty(string7) || resultReceiver3 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f.a(new q(iVar, kVar5, string7, bundle5, resultReceiver3));
                    return;
                default:
                    message.toString();
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public MediaBrowserServiceCompat() {
        new b("android.media.session.MediaController", -1, -1, null);
        this.d = new ArrayList<>();
        this.e = new zk3<>();
        l lVar = new l();
        lVar.a = this;
        this.f = lVar;
    }

    public static List a(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i3 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int i5 = i4 + i3;
        if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
            return Collections.EMPTY_LIST;
        }
        if (i5 > list.size()) {
            i5 = list.size();
        }
        return list.subList(i4, i5);
    }

    public void b(@NonNull String str, Bundle bundle, @NonNull androidx.media.d dVar) {
        dVar.e();
    }

    @Nullable
    public abstract a c(@NonNull String str, int i2, @Nullable Bundle bundle);

    public abstract void d(@NonNull String str, @NonNull g<List<MediaBrowserCompat.MediaItem>> gVar);

    public void e(@NonNull String str, Bundle bundle, @NonNull androidx.media.c cVar) {
        cVar.e = 4;
        cVar.f(null);
    }

    public final void f(String str, b bVar, Bundle bundle) {
        androidx.media.a aVar = new androidx.media.a(this, str, bVar, str, bundle);
        if (bundle == null) {
            d(str, aVar);
        } else {
            aVar.e = 1;
            d(str, aVar);
        }
        if (!aVar.b()) {
            throw new IllegalStateException(tdj.a(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), bVar.b, " id=", str));
        }
    }

    public final void g(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.g != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.g = token;
        f fVar = this.b;
        MediaBrowserServiceCompat.this.f.a(new androidx.media.e(fVar, token));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.b.b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f fVar = new f();
        this.b = fVar;
        e.a aVar = new e.a(this);
        fVar.b = aVar;
        aVar.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f.a = null;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
