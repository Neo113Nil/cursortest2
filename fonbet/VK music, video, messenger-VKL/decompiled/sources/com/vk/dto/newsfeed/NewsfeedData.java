package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.cache.CachedNewsEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.attachments.ShitAttachment;
import defpackage.k0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.functions.c;
import io.reactivex.rxjava3.internal.operators.observable.i2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dy2;
import xsna.epx;
import xsna.l8k;
import xsna.nit;
import xsna.pvo0;
import xsna.qoy;
import xsna.shy;
import xsna.ttp0;
import xsna.vu5;
import xsna.wmi0;
import xsna.zcl;

/* compiled from: NewsfeedData.kt */
/* loaded from: classes18.dex */
public final class NewsfeedData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NewsfeedData> CREATOR = new b();
    public final List<NewsEntry> b;
    public final Info c;

    /* compiled from: NewsfeedData.kt */
    public static final class a {
        public static void a(int i, boolean z) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"NewsfeedCache", "Serializer storage cleared: listId " + i + ", isSmart " + z});
            }
            String b = b(i, "newsfeed_cache_info", z);
            if (b != null) {
                wmi0.a.c(b);
            }
            String b2 = b(i, "newsfeed_cache_items", z);
            if (b2 != null) {
                wmi0.a.c(b2);
            }
        }

        public static String b(int i, String str, boolean z) {
            if (i == -6) {
                return null;
            }
            if (i != 0) {
                if (i <= -10) {
                    return null;
                }
                return str + ':' + i;
            }
            return str + ':' + i + ':' + z;
        }

        public static q c(final UserId userId, final int i, final boolean z, w wVar) {
            String b = b(i, "newsfeed_cache_info", z);
            if (b == null) {
                return q.T(EmptyList.b);
            }
            String b2 = b(i, "newsfeed_cache_items", z);
            if (b2 == null) {
                return q.T(EmptyList.b);
            }
            wmi0 wmi0Var = wmi0.a;
            return q.I0(wmi0Var.f(b, wVar), wmi0Var.f(b2, wVar), new c() { // from class: xsna.bh60
                @Override // io.reactivex.rxjava3.functions.c
                public final Object apply(Object obj, Object obj2) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != 1) {
                        return EmptyList.b;
                    }
                    NewsfeedData.Info info = (NewsfeedData.Info) list.get(0);
                    UserId userId2 = info.b;
                    final UserId userId3 = userId;
                    if (!epx.f(userId2, userId3)) {
                        return EmptyList.b;
                    }
                    Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((CachedNewsEntry) it.next()).b);
                    }
                    final List e = NewsfeedData.a.e(arrayList);
                    final int i2 = i;
                    final boolean z2 = z;
                    L.c("NewsfeedCache", new gzs() { // from class: xsna.ch60
                        @Override // xsna.gzs
                        public final Object invoke() {
                            return "Reading from serializer storage: listId " + i2 + ", isSmart " + z2 + ", userId " + userId3 + ", entries size " + e.size();
                        }
                    });
                    return Collections.singletonList(new NewsfeedData(e, info));
                }
            });
        }

        public static long d(NewsEntry newsEntry) {
            long currentTimeMillis = (System.currentTimeMillis() & 4294967295L) | (System.identityHashCode(newsEntry) << 32);
            wmi0.a.m(k0.a(currentTimeMillis, "newsfeed_cache_post_to_open:"), Collections.singletonList(newsEntry));
            return currentTimeMillis;
        }

        public static List e(ArrayList arrayList) {
            if (!ttp0.f(arrayList)) {
                arrayList = new ArrayList(arrayList);
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    return arrayList;
                }
                NewsEntry newsEntry = (NewsEntry) arrayList.get(size);
                if (newsEntry instanceof PromoPost) {
                    if (((PromoPost) newsEntry).m < pvo0.a()) {
                        arrayList.remove(size);
                    }
                } else if (newsEntry instanceof ShitAttachment) {
                    ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
                    if (shitAttachment.E < pvo0.a()) {
                        arrayList.remove(size);
                    } else {
                        shitAttachment.l0 = dy2.i(shitAttachment.x);
                    }
                }
            }
        }

        public static i2 f(long j) {
            return wmi0.a.e("newsfeed_cache_post_to_open:" + j).U(new nit(new l8k(28), 10)).m0();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<NewsfeedData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NewsfeedData a(Serializer serializer) {
            return new NewsfeedData(serializer.k(NewsEntry.class), (Info) serializer.G(Info.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewsfeedData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedData(List<? extends NewsEntry> list, Info info) {
        this.b = list;
        this.c = info;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.i0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedData)) {
            return false;
        }
        NewsfeedData newsfeedData = (NewsfeedData) obj;
        return epx.f(this.b, newsfeedData.b) && epx.f(this.c, newsfeedData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "NewsfeedData(entries=" + this.b + ", info=" + this.c + ')';
    }

    /* compiled from: NewsfeedData.kt */
    public static final class Info extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Info> CREATOR = new a();
        public final UserId b;
        public final String c;
        public final int d;
        public final boolean e;
        public final long f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Info> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Info a(Serializer serializer) {
                return new Info((UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.u(), serializer.m(), serializer.w());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public /* synthetic */ Info(UserId userId, String str, int i, boolean z, long j, int i2, zcl zclVar) {
            this(userId, str, i, z, (i2 & 16) != 0 ? System.currentTimeMillis() : j);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
            serializer.j0(this.c);
            serializer.S(this.d);
            serializer.L(this.e ? (byte) 1 : (byte) 0);
            serializer.Y(this.f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return epx.f(this.b, info.b) && epx.f(this.c, info.c) && this.d == info.d && this.e == info.e && this.f == info.f;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.b.b) * 31;
            String str = this.c;
            return Long.hashCode(this.f) + qoy.b(shy.a(this.d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Info(userId=");
            sb.append(this.b);
            sb.append(", nextFrom=");
            sb.append(this.c);
            sb.append(", listId=");
            sb.append(this.d);
            sb.append(", isSmart=");
            sb.append(this.e);
            sb.append(", createdAt=");
            return vu5.a(')', this.f, sb);
        }

        public Info(UserId userId, String str, int i, boolean z, long j) {
            this.b = userId;
            this.c = str;
            this.d = i;
            this.e = z;
            this.f = j;
        }
    }
}
