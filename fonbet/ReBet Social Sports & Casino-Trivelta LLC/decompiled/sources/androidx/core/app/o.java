package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k0.AbstractC5143b;

/* loaded from: classes.dex */
public abstract class o {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f18880a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f18881b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f18882c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f18883d;

        /* renamed from: e, reason: collision with root package name */
        public final int f18884e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f18885f;

        /* renamed from: g, reason: collision with root package name */
        public int f18886g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f18887h;

        /* renamed from: i, reason: collision with root package name */
        public PendingIntent f18888i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f18889j;
        private final x[] mDataOnlyRemoteInputs;
        private final x[] mRemoteInputs;

        /* renamed from: androidx.core.app.o$a$a, reason: collision with other inner class name */
        public static final class C0359a {

            /* renamed from: a, reason: collision with root package name */
            public final IconCompat f18890a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f18891b;

            /* renamed from: c, reason: collision with root package name */
            public final PendingIntent f18892c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f18893d;

            /* renamed from: e, reason: collision with root package name */
            public final Bundle f18894e;

            /* renamed from: f, reason: collision with root package name */
            public ArrayList f18895f;

            /* renamed from: g, reason: collision with root package name */
            public int f18896g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f18897h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f18898i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f18899j;

            public C0359a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.c(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0359a a(Bundle bundle) {
                if (bundle != null) {
                    this.f18894e.putAll(bundle);
                }
                return this;
            }

            public C0359a b(x xVar) {
                if (this.f18895f == null) {
                    this.f18895f = new ArrayList();
                }
                if (xVar != null) {
                    this.f18895f.add(xVar);
                }
                return this;
            }

            public a c() {
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f18895f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        x xVar = (x) it.next();
                        if (xVar.j()) {
                            arrayList.add(xVar);
                        } else {
                            arrayList2.add(xVar);
                        }
                    }
                }
                return new a(this.f18890a, this.f18891b, this.f18892c, this.f18894e, arrayList2.isEmpty() ? null : (x[]) arrayList2.toArray(new x[arrayList2.size()]), arrayList.isEmpty() ? null : (x[]) arrayList.toArray(new x[arrayList.size()]), this.f18893d, this.f18896g, this.f18897h, this.f18898i, this.f18899j);
            }

            public final void d() {
                if (this.f18898i && this.f18892c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0359a e(boolean z10) {
                this.f18893d = z10;
                return this;
            }

            public C0359a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, x[] xVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f18893d = true;
                this.f18897h = true;
                this.f18890a = iconCompat;
                this.f18891b = e.f(charSequence);
                this.f18892c = pendingIntent;
                this.f18894e = bundle;
                this.f18895f = xVarArr == null ? null : new ArrayList(Arrays.asList(xVarArr));
                this.f18893d = z10;
                this.f18896g = i10;
                this.f18897h = z11;
                this.f18898i = z12;
                this.f18899j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.c(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f18888i;
        }

        public boolean b() {
            return this.f18882c;
        }

        public Bundle c() {
            return this.f18880a;
        }

        public IconCompat d() {
            int i10;
            if (this.f18881b == null && (i10 = this.f18886g) != 0) {
                this.f18881b = IconCompat.c(null, "", i10);
            }
            return this.f18881b;
        }

        public x[] e() {
            return this.mRemoteInputs;
        }

        public int f() {
            return this.f18884e;
        }

        public boolean g() {
            return this.f18883d;
        }

        public CharSequence h() {
            return this.f18887h;
        }

        public boolean i() {
            return this.f18889j;
        }

        public boolean j() {
            return this.f18885f;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, x[] xVarArr, x[] xVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f18883d = true;
            this.f18881b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f18886g = iconCompat.e();
            }
            this.f18887h = e.f(charSequence);
            this.f18888i = pendingIntent;
            this.f18880a = bundle == null ? new Bundle() : bundle;
            this.mRemoteInputs = xVarArr;
            this.mDataOnlyRemoteInputs = xVarArr2;
            this.f18882c = z10;
            this.f18884e = i10;
            this.f18883d = z11;
            this.f18885f = z12;
            this.f18889j = z13;
        }
    }

    public static class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public IconCompat f18900a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f18901b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f18902c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f18903d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f18904e;

        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.o$b$b, reason: collision with other inner class name */
        public static class C0360b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public b a(Bitmap bitmap) {
            this.f18901b = bitmap == null ? null : IconCompat.b(bitmap);
            this.f18902c = true;
            return this;
        }

        @Override // androidx.core.app.o.i
        public void apply(k kVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(kVar.a()).setBigContentTitle(this.mBigContentTitle);
            IconCompat iconCompat = this.f18900a;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0360b.a(bigContentTitle, this.f18900a.n(kVar instanceof p ? ((p) kVar).f() : null));
                } else if (iconCompat.g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f18900a.d());
                }
            }
            if (this.f18902c) {
                if (this.f18901b == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f18901b.n(kVar instanceof p ? ((p) kVar).f() : null));
                }
            }
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0360b.c(bigContentTitle, this.f18904e);
                C0360b.b(bigContentTitle, this.f18903d);
            }
        }

        public b b(Bitmap bitmap) {
            this.f18900a = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }

        public b c(CharSequence charSequence) {
            this.mBigContentTitle = e.f(charSequence);
            return this;
        }

        public b d(CharSequence charSequence) {
            this.mSummaryText = e.f(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @Override // androidx.core.app.o.i
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
    }

    public static class c extends i {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f18905a;

        public c a(CharSequence charSequence) {
            this.f18905a = e.f(charSequence);
            return this;
        }

        @Override // androidx.core.app.o.i
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.o.i
        public void apply(k kVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(kVar.a()).setBigContentTitle(this.mBigContentTitle).bigText(this.f18905a);
            if (this.mSummaryTextSet) {
                bigText.setSummaryText(this.mSummaryText);
            }
        }

        public c b(CharSequence charSequence) {
            this.mBigContentTitle = e.f(charSequence);
            return this;
        }

        public c c(CharSequence charSequence) {
            this.mSummaryText = e.f(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @Override // androidx.core.app.o.i
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class f extends i {

        public static class a {
            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.o.i
        public void apply(k kVar) {
            kVar.a().setStyle(a.a());
        }

        @Override // androidx.core.app.o.i
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.o.i
        public RemoteViews makeBigContentView(k kVar) {
            return null;
        }

        @Override // androidx.core.app.o.i
        public RemoteViews makeContentView(k kVar) {
            return null;
        }

        @Override // androidx.core.app.o.i
        public RemoteViews makeHeadsUpContentView(k kVar) {
            return null;
        }
    }

    public static class g extends i {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f18953a = new ArrayList();

        public g a(CharSequence charSequence) {
            if (charSequence != null) {
                this.f18953a.add(e.f(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.o.i
        public void apply(k kVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(kVar.a()).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            Iterator it = this.f18953a.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        public g b(CharSequence charSequence) {
            this.mBigContentTitle = e.f(charSequence);
            return this;
        }

        public g c(CharSequence charSequence) {
            this.mSummaryText = e.f(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @Override // androidx.core.app.o.i
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public static class h extends i {

        /* renamed from: a, reason: collision with root package name */
        public final List f18954a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final List f18955b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public v f18956c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f18957d;

        /* renamed from: e, reason: collision with root package name */
        public Boolean f18958e;

        public static class a {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        public static class b {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        public static class c {
            public static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
                return messagingStyle.setGroupConversation(z10);
            }
        }

        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f18959a;

            /* renamed from: b, reason: collision with root package name */
            public final long f18960b;

            /* renamed from: c, reason: collision with root package name */
            public final v f18961c;

            /* renamed from: d, reason: collision with root package name */
            public Bundle f18962d = new Bundle();

            /* renamed from: e, reason: collision with root package name */
            public String f18963e;

            /* renamed from: f, reason: collision with root package name */
            public Uri f18964f;

            public static class a {
                public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            public static class b {
                public static Parcelable a(Person person) {
                    return person;
                }

                public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }
            }

            public d(CharSequence charSequence, long j10, v vVar) {
                this.f18959a = charSequence;
                this.f18960b = j10;
                this.f18961c = vVar;
            }

            public static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = ((d) list.get(i10)).h();
                }
                return bundleArr;
            }

            public String b() {
                return this.f18963e;
            }

            public Uri c() {
                return this.f18964f;
            }

            public v d() {
                return this.f18961c;
            }

            public CharSequence e() {
                return this.f18959a;
            }

            public long f() {
                return this.f18960b;
            }

            public Notification.MessagingStyle.Message g() {
                Notification.MessagingStyle.Message a10;
                v d10 = d();
                if (Build.VERSION.SDK_INT >= 28) {
                    a10 = b.b(e(), f(), d10 != null ? d10.h() : null);
                } else {
                    a10 = a.a(e(), f(), d10 != null ? d10.c() : null);
                }
                if (b() != null) {
                    a.b(a10, b(), c());
                }
                return a10;
            }

            public final Bundle h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f18959a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f18960b);
                v vVar = this.f18961c;
                if (vVar != null) {
                    bundle.putCharSequence("sender", vVar.c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(this.f18961c.h()));
                    } else {
                        bundle.putBundle("person", this.f18961c.i());
                    }
                }
                String str = this.f18963e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f18964f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f18962d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        public h(v vVar) {
            if (TextUtils.isEmpty(vVar.c())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f18956c = vVar;
        }

        public h a(d dVar) {
            if (dVar != null) {
                this.f18954a.add(dVar);
                if (this.f18954a.size() > 25) {
                    this.f18954a.remove(0);
                }
            }
            return this;
        }

        @Override // androidx.core.app.o.i
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f18956c.c());
            bundle.putBundle("android.messagingStyleUser", this.f18956c.i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f18957d);
            if (this.f18957d != null && this.f18958e.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f18957d);
            }
            if (!this.f18954a.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f18954a));
            }
            if (!this.f18955b.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f18955b));
            }
            Boolean bool = this.f18958e;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.o.i
        public void apply(k kVar) {
            d(c());
            Notification.MessagingStyle a10 = Build.VERSION.SDK_INT >= 28 ? c.a(this.f18956c.h()) : a.b(this.f18956c.c());
            Iterator it = this.f18954a.iterator();
            while (it.hasNext()) {
                a.a(a10, ((d) it.next()).g());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it2 = this.f18955b.iterator();
                while (it2.hasNext()) {
                    b.a(a10, ((d) it2.next()).g());
                }
            }
            if (this.f18958e.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(a10, this.f18957d);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(a10, this.f18958e.booleanValue());
            }
            a10.setBuilder(kVar.a());
        }

        public h b(CharSequence charSequence, long j10, v vVar) {
            a(new d(charSequence, j10, vVar));
            return this;
        }

        public boolean c() {
            e eVar = this.mBuilder;
            if (eVar != null && eVar.f18927a.getApplicationInfo().targetSdkVersion < 28 && this.f18958e == null) {
                return this.f18957d != null;
            }
            Boolean bool = this.f18958e;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public h d(boolean z10) {
            this.f18958e = Boolean.valueOf(z10);
            return this;
        }

        @Override // androidx.core.app.o.i
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }
    }

    public static abstract class i {
        CharSequence mBigContentTitle;
        protected e mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet = false;

        public void addCompatExtras(Bundle bundle) {
            if (this.mSummaryTextSet) {
                bundle.putCharSequence("android.summaryText", this.mSummaryText);
            }
            CharSequence charSequence = this.mBigContentTitle;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
            }
        }

        public void apply(k kVar) {
        }

        public String getClassName() {
            return null;
        }

        public RemoteViews makeBigContentView(k kVar) {
            return null;
        }

        public RemoteViews makeContentView(k kVar) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(k kVar) {
            return null;
        }

        public void setBuilder(e eVar) {
            if (this.mBuilder != eVar) {
                this.mBuilder = eVar;
                if (eVar != null) {
                    eVar.G(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC5143b.f54010b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC5143b.f54009a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    public static class e {

        /* renamed from: A, reason: collision with root package name */
        public boolean f18906A;

        /* renamed from: B, reason: collision with root package name */
        public boolean f18907B;

        /* renamed from: C, reason: collision with root package name */
        public String f18908C;

        /* renamed from: D, reason: collision with root package name */
        public Bundle f18909D;

        /* renamed from: E, reason: collision with root package name */
        public int f18910E;

        /* renamed from: F, reason: collision with root package name */
        public int f18911F;

        /* renamed from: G, reason: collision with root package name */
        public Notification f18912G;

        /* renamed from: H, reason: collision with root package name */
        public RemoteViews f18913H;

        /* renamed from: I, reason: collision with root package name */
        public RemoteViews f18914I;

        /* renamed from: J, reason: collision with root package name */
        public RemoteViews f18915J;

        /* renamed from: K, reason: collision with root package name */
        public String f18916K;

        /* renamed from: L, reason: collision with root package name */
        public int f18917L;

        /* renamed from: M, reason: collision with root package name */
        public String f18918M;

        /* renamed from: N, reason: collision with root package name */
        public long f18919N;

        /* renamed from: O, reason: collision with root package name */
        public int f18920O;

        /* renamed from: P, reason: collision with root package name */
        public int f18921P;

        /* renamed from: Q, reason: collision with root package name */
        public boolean f18922Q;

        /* renamed from: R, reason: collision with root package name */
        public Notification f18923R;

        /* renamed from: S, reason: collision with root package name */
        public boolean f18924S;

        /* renamed from: T, reason: collision with root package name */
        public Object f18925T;

        /* renamed from: U, reason: collision with root package name */
        public ArrayList f18926U;

        /* renamed from: a, reason: collision with root package name */
        public Context f18927a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f18928b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f18929c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f18930d;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f18931e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f18932f;

        /* renamed from: g, reason: collision with root package name */
        public String f18933g;

        /* renamed from: h, reason: collision with root package name */
        public PendingIntent f18934h;

        /* renamed from: i, reason: collision with root package name */
        public PendingIntent f18935i;

        /* renamed from: j, reason: collision with root package name */
        public RemoteViews f18936j;

        /* renamed from: k, reason: collision with root package name */
        public IconCompat f18937k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f18938l;

        /* renamed from: m, reason: collision with root package name */
        public int f18939m;
        CharSequence[] mRemoteInputHistory;

        /* renamed from: n, reason: collision with root package name */
        public int f18940n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f18941o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f18942p;

        /* renamed from: q, reason: collision with root package name */
        public i f18943q;

        /* renamed from: r, reason: collision with root package name */
        public CharSequence f18944r;

        /* renamed from: s, reason: collision with root package name */
        public CharSequence f18945s;

        /* renamed from: t, reason: collision with root package name */
        public int f18946t;

        /* renamed from: u, reason: collision with root package name */
        public int f18947u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f18948v;

        /* renamed from: w, reason: collision with root package name */
        public String f18949w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f18950x;

        /* renamed from: y, reason: collision with root package name */
        public String f18951y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f18952z;

        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f18928b = new ArrayList();
            this.f18929c = new ArrayList();
            this.f18930d = new ArrayList();
            this.f18941o = true;
            this.f18952z = false;
            this.f18910E = 0;
            this.f18911F = 0;
            this.f18917L = 0;
            this.f18920O = 0;
            this.f18921P = 0;
            Notification notification = new Notification();
            this.f18923R = notification;
            this.f18927a = context;
            this.f18916K = str;
            notification.when = System.currentTimeMillis();
            this.f18923R.audioStreamType = -1;
            this.f18940n = 0;
            this.f18926U = new ArrayList();
            this.f18922Q = true;
        }

        public static CharSequence f(CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e A(int i10) {
            this.f18940n = i10;
            return this;
        }

        public e B(Notification notification) {
            this.f18912G = notification;
            return this;
        }

        public e C(String str) {
            this.f18918M = str;
            return this;
        }

        public e D(boolean z10) {
            this.f18941o = z10;
            return this;
        }

        public e E(int i10) {
            this.f18923R.icon = i10;
            return this;
        }

        public e F(Uri uri) {
            Notification notification = this.f18923R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder d10 = a.d(a.c(a.b(), 4), 5);
            this.f18923R.audioAttributes = a.a(d10);
            return this;
        }

        public e G(i iVar) {
            if (this.f18943q != iVar) {
                this.f18943q = iVar;
                if (iVar != null) {
                    iVar.setBuilder(this);
                }
            }
            return this;
        }

        public e H(CharSequence charSequence) {
            this.f18944r = f(charSequence);
            return this;
        }

        public e I(CharSequence charSequence) {
            this.f18923R.tickerText = f(charSequence);
            return this;
        }

        public e J(long j10) {
            this.f18919N = j10;
            return this;
        }

        public e K(boolean z10) {
            this.f18942p = z10;
            return this;
        }

        public e L(long[] jArr) {
            this.f18923R.vibrate = jArr;
            return this;
        }

        public e M(int i10) {
            this.f18911F = i10;
            return this;
        }

        public e N(long j10) {
            this.f18923R.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f18928b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f18928b.add(aVar);
            }
            return this;
        }

        public e c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f18909D;
                if (bundle2 == null) {
                    this.f18909D = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public Notification d() {
            return new p(this).c();
        }

        public Bundle e() {
            if (this.f18909D == null) {
                this.f18909D = new Bundle();
            }
            return this.f18909D;
        }

        public e g(boolean z10) {
            r(16, z10);
            return this;
        }

        public e h(String str) {
            this.f18908C = str;
            return this;
        }

        public e i(String str) {
            this.f18916K = str;
            return this;
        }

        public e j(int i10) {
            this.f18910E = i10;
            return this;
        }

        public e k(PendingIntent pendingIntent) {
            this.f18934h = pendingIntent;
            return this;
        }

        public e l(CharSequence charSequence) {
            this.f18932f = f(charSequence);
            return this;
        }

        public e m(CharSequence charSequence) {
            this.f18931e = f(charSequence);
            return this;
        }

        public e n(RemoteViews remoteViews) {
            this.f18914I = remoteViews;
            return this;
        }

        public e o(RemoteViews remoteViews) {
            this.f18913H = remoteViews;
            return this;
        }

        public e p(int i10) {
            Notification notification = this.f18923R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e q(PendingIntent pendingIntent) {
            this.f18923R.deleteIntent = pendingIntent;
            return this;
        }

        public final void r(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f18923R;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f18923R;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public e s(String str) {
            this.f18949w = str;
            return this;
        }

        public e t(boolean z10) {
            this.f18950x = z10;
            return this;
        }

        public e u(Bitmap bitmap) {
            this.f18937k = bitmap == null ? null : IconCompat.b(o.b(this.f18927a, bitmap));
            return this;
        }

        public e v(int i10, int i11, int i12) {
            Notification notification = this.f18923R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e w(boolean z10) {
            this.f18952z = z10;
            return this;
        }

        public e x(int i10) {
            this.f18939m = i10;
            return this;
        }

        public e y(boolean z10) {
            r(2, z10);
            return this;
        }

        public e z(boolean z10) {
            r(8, z10);
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
