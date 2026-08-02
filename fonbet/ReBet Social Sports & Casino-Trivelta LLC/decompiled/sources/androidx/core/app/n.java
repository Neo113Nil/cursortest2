package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f18875a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f18876b;

    /* renamed from: c, reason: collision with root package name */
    public String f18877c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18878d;

    /* renamed from: e, reason: collision with root package name */
    public List f18879e;

    public static class a {
        public static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        public static List b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        public static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    public static class b {
        public static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        public static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        public static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    public n(String str) {
        this.f18879e = Collections.EMPTY_LIST;
        this.f18875a = (String) x0.f.g(str);
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel a10 = m.a(it.next());
            if (this.f18875a.equals(a.c(a10))) {
                arrayList.add(new l(a10));
            }
        }
        return arrayList;
    }

    public NotificationChannelGroup b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannelGroup a10 = a.a(this.f18875a, this.f18876b);
        if (i10 >= 28) {
            b.c(a10, this.f18877c);
        }
        return a10;
    }

    public n(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.EMPTY_LIST);
    }

    public n(NotificationChannelGroup notificationChannelGroup, List list) {
        this(a.d(notificationChannelGroup));
        this.f18876b = a.e(notificationChannelGroup);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f18877c = b.a(notificationChannelGroup);
        }
        if (i10 >= 28) {
            this.f18878d = b.b(notificationChannelGroup);
            this.f18879e = a(a.b(notificationChannelGroup));
        } else {
            this.f18879e = a(list);
        }
    }
}
