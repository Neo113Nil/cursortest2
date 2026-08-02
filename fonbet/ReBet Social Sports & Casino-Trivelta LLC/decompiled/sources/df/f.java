package df;

import android.database.Cursor;
import androidx.room.AbstractC2268f;
import androidx.room.AbstractC2272j;
import androidx.room.G;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleCategoryEntity;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import jf.EnumC5132a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.InterfaceC5321f;

/* loaded from: classes4.dex */
public final class f implements InterfaceC4065a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.room.w f45214a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.k f45215b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.k f45216c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2272j f45217d;

    /* renamed from: e, reason: collision with root package name */
    public final G f45218e;

    /* renamed from: f, reason: collision with root package name */
    public final G f45219f;

    /* renamed from: g, reason: collision with root package name */
    public final G f45220g;

    /* renamed from: h, reason: collision with root package name */
    public final G f45221h;

    /* renamed from: i, reason: collision with root package name */
    public final G f45222i;

    /* renamed from: j, reason: collision with root package name */
    public final G f45223j;

    /* renamed from: k, reason: collision with root package name */
    public final G f45224k;

    /* renamed from: l, reason: collision with root package name */
    public final G f45225l;

    public class A extends G {
        public A(androidx.room.w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE articles SET last_viewed_time = ? WHERE id = ?";
        }
    }

    public class B extends G {
        public B(androidx.room.w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE articles SET rated_type = ? WHERE id = ?";
        }
    }

    public class C extends G {
        public C(androidx.room.w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE articles SET stats = ? WHERE id = ?";
        }
    }

    public class D extends G {
        public D(androidx.room.w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE articles SET recently_viewed_time_from_search = ? WHERE id = ?";
        }
    }

    /* renamed from: df.f$a, reason: case insensitive filesystem */
    public class C4069a extends G {
        public C4069a(androidx.room.w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM articles";
        }
    }

    /* renamed from: df.f$b, reason: case insensitive filesystem */
    public class C4070b extends G {
        public C4070b(androidx.room.w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM article_categories";
        }
    }

    /* renamed from: df.f$c, reason: case insensitive filesystem */
    public class CallableC4071c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f45232a;

        public CallableC4071c(List list) {
            this.f45232a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            f.this.f45214a.beginTransaction();
            try {
                f.this.f45215b.d(this.f45232a);
                f.this.f45214a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                f.this.f45214a.endTransaction();
            }
        }
    }

    /* renamed from: df.f$d, reason: case insensitive filesystem */
    public class CallableC4072d implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArticleEntity f45234a;

        public CallableC4072d(ArticleEntity articleEntity) {
            this.f45234a = articleEntity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            f.this.f45214a.beginTransaction();
            try {
                f.this.f45216c.e(this.f45234a);
                f.this.f45214a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                f.this.f45214a.endTransaction();
            }
        }
    }

    public class e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArticleEntity f45236a;

        public e(ArticleEntity articleEntity) {
            this.f45236a = articleEntity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            f.this.f45214a.beginTransaction();
            try {
                f.this.f45217d.handle(this.f45236a);
                f.this.f45214a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                f.this.f45214a.endTransaction();
            }
        }
    }

    /* renamed from: df.f$f, reason: collision with other inner class name */
    public class CallableC0657f implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45238a;

        public CallableC0657f(String str) {
            this.f45238a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = f.this.f45219f.acquire();
            acquire.P0(1, this.f45238a);
            try {
                f.this.f45214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    f.this.f45214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    f.this.f45214a.endTransaction();
                }
            } finally {
                f.this.f45219f.release(acquire);
            }
        }
    }

    public class g implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f45240a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45241b;

        public g(long j10, String str) {
            this.f45240a = j10;
            this.f45241b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            E2.k acquire = f.this.f45220g.acquire();
            acquire.h1(1, this.f45240a);
            acquire.P0(2, this.f45241b);
            try {
                f.this.f45214a.beginTransaction();
                try {
                    acquire.G();
                    f.this.f45214a.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    f.this.f45214a.endTransaction();
                }
            } finally {
                f.this.f45220g.release(acquire);
            }
        }
    }

    public class h implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45243a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45244b;

        public h(String str, String str2) {
            this.f45243a = str;
            this.f45244b = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            E2.k acquire = f.this.f45221h.acquire();
            acquire.P0(1, this.f45243a);
            acquire.P0(2, this.f45244b);
            try {
                f.this.f45214a.beginTransaction();
                try {
                    acquire.G();
                    f.this.f45214a.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    f.this.f45214a.endTransaction();
                }
            } finally {
                f.this.f45221h.release(acquire);
            }
        }
    }

    public class i implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45246a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45247b;

        public i(String str, String str2) {
            this.f45246a = str;
            this.f45247b = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            E2.k acquire = f.this.f45222i.acquire();
            acquire.P0(1, this.f45246a);
            acquire.P0(2, this.f45247b);
            try {
                f.this.f45214a.beginTransaction();
                try {
                    acquire.G();
                    f.this.f45214a.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    f.this.f45214a.endTransaction();
                }
            } finally {
                f.this.f45222i.release(acquire);
            }
        }
    }

    public class j extends androidx.room.k {
        public j(androidx.room.w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR REPLACE INTO `article_categories` (`id`,`name`,`articles_count`,`articles_modified_time`,`children_count`,`department_id`,`enabled`,`order`,`parent_category_id`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, ArticleCategoryEntity articleCategoryEntity) {
            kVar.P0(1, articleCategoryEntity.getId());
            if (articleCategoryEntity.getName() == null) {
                kVar.C1(2);
            } else {
                kVar.P0(2, articleCategoryEntity.getName());
            }
            kVar.h1(3, articleCategoryEntity.getArticlesCount());
            if (articleCategoryEntity.getArticlesModifiedTime() == null) {
                kVar.C1(4);
            } else {
                kVar.h1(4, articleCategoryEntity.getArticlesModifiedTime().longValue());
            }
            kVar.h1(5, articleCategoryEntity.getChildrenCount());
            if (articleCategoryEntity.getDepartmentId() == null) {
                kVar.C1(6);
            } else {
                kVar.P0(6, articleCategoryEntity.getDepartmentId());
            }
            kVar.h1(7, articleCategoryEntity.getEnabled() ? 1L : 0L);
            kVar.h1(8, articleCategoryEntity.getOrder());
            if (articleCategoryEntity.getParentCategoryId() == null) {
                kVar.C1(9);
            } else {
                kVar.P0(9, articleCategoryEntity.getParentCategoryId());
            }
        }
    }

    public class k implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f45250a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45251b;

        public k(long j10, String str) {
            this.f45250a = j10;
            this.f45251b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            E2.k acquire = f.this.f45223j.acquire();
            acquire.h1(1, this.f45250a);
            acquire.P0(2, this.f45251b);
            try {
                f.this.f45214a.beginTransaction();
                try {
                    acquire.G();
                    f.this.f45214a.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    f.this.f45214a.endTransaction();
                }
            } finally {
                f.this.f45223j.release(acquire);
            }
        }
    }

    public class l implements Callable {
        public l() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            E2.k acquire = f.this.f45224k.acquire();
            try {
                f.this.f45214a.beginTransaction();
                try {
                    acquire.G();
                    f.this.f45214a.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    f.this.f45214a.endTransaction();
                }
            } finally {
                f.this.f45224k.release(acquire);
            }
        }
    }

    public class m implements Callable {
        public m() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            E2.k acquire = f.this.f45225l.acquire();
            try {
                f.this.f45214a.beginTransaction();
                try {
                    acquire.G();
                    f.this.f45214a.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    f.this.f45214a.endTransaction();
                }
            } finally {
                f.this.f45225l.release(acquire);
            }
        }
    }

    public class n implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f45255a;

        public n(androidx.room.A a10) {
            this.f45255a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c10 = A2.b.c(f.this.f45214a, this.f45255a, false, null);
            try {
                int e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
                int e11 = A2.a.e(c10, "name");
                int e12 = A2.a.e(c10, "articles_count");
                int e13 = A2.a.e(c10, "articles_modified_time");
                int e14 = A2.a.e(c10, "children_count");
                int e15 = A2.a.e(c10, "department_id");
                int e16 = A2.a.e(c10, ViewProps.ENABLED);
                int e17 = A2.a.e(c10, "order");
                int e18 = A2.a.e(c10, "parent_category_id");
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    arrayList.add(new ArticleCategoryEntity(c10.getString(e10), c10.isNull(e11) ? null : c10.getString(e11), c10.getInt(e12), c10.isNull(e13) ? null : Long.valueOf(c10.getLong(e13)), c10.getInt(e14), c10.isNull(e15) ? null : c10.getString(e15), c10.getInt(e16) != 0, c10.getInt(e17), c10.isNull(e18) ? null : c10.getString(e18)));
                }
                return arrayList;
            } finally {
                c10.close();
            }
        }

        public void finalize() {
            this.f45255a.U();
        }
    }

    public class o implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f45257a;

        public o(androidx.room.A a10) {
            this.f45257a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursor;
            Boolean valueOf;
            int i10;
            int i11;
            Long valueOf2;
            int i12;
            int i13;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            int i17;
            String str3;
            int i18;
            int i19;
            String str4;
            int i20;
            int i21;
            String str5;
            int i22;
            int i23;
            Long l10;
            int i24;
            int i25;
            Long l11;
            int i26;
            ArticleEntity.a aVar;
            String string;
            Cursor c10 = A2.b.c(f.this.f45214a, this.f45257a, false, null);
            try {
                int e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
                int e11 = A2.a.e(c10, "category_id");
                int e12 = A2.a.e(c10, "category_name");
                int e13 = A2.a.e(c10, "title");
                int e14 = A2.a.e(c10, "titles");
                int e15 = A2.a.e(c10, "type");
                int e16 = A2.a.e(c10, ViewProps.ENABLED);
                int e17 = A2.a.e(c10, "channels");
                int e18 = A2.a.e(c10, "creator");
                int e19 = A2.a.e(c10, "modifier");
                int e20 = A2.a.e(c10, "department_id");
                int e21 = A2.a.e(c10, "language");
                int e22 = A2.a.e(c10, "created_time");
                int e23 = A2.a.e(c10, "modified_time");
                int e24 = A2.a.e(c10, "public_url");
                int e25 = A2.a.e(c10, "published_title");
                int e26 = A2.a.e(c10, "stats");
                int e27 = A2.a.e(c10, "content");
                int e28 = A2.a.e(c10, "rated_type");
                int e29 = A2.a.e(c10, "last_viewed_time");
                int e30 = A2.a.e(c10, "recently_viewed_time_from_search");
                int e31 = A2.a.e(c10, "local_meta_article_local_file_path");
                int i27 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string2 = c10.getString(e10);
                    String string3 = c10.isNull(e11) ? null : c10.getString(e11);
                    String string4 = c10.isNull(e12) ? null : c10.getString(e12);
                    String string5 = c10.isNull(e13) ? null : c10.getString(e13);
                    String string6 = c10.isNull(e14) ? null : c10.getString(e14);
                    String string7 = c10.isNull(e15) ? null : c10.getString(e15);
                    Integer valueOf3 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                    if (valueOf3 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf3.intValue() != 0);
                    }
                    String string8 = c10.isNull(e17) ? null : c10.getString(e17);
                    String string9 = c10.isNull(e18) ? null : c10.getString(e18);
                    String string10 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string11 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string12 = c10.isNull(e21) ? null : c10.getString(e21);
                    Long valueOf4 = c10.isNull(e22) ? null : Long.valueOf(c10.getLong(e22));
                    int i28 = i27;
                    if (c10.isNull(i28)) {
                        int i29 = e24;
                        i10 = e10;
                        i11 = i29;
                        valueOf2 = null;
                    } else {
                        int i30 = e24;
                        i10 = e10;
                        i11 = i30;
                        valueOf2 = Long.valueOf(c10.getLong(i28));
                    }
                    if (c10.isNull(i11)) {
                        int i31 = e25;
                        i12 = i11;
                        i13 = i31;
                        str = null;
                    } else {
                        String string13 = c10.getString(i11);
                        int i32 = e25;
                        i12 = i11;
                        i13 = i32;
                        str = string13;
                    }
                    if (c10.isNull(i13)) {
                        int i33 = e26;
                        i14 = i13;
                        i15 = i33;
                        str2 = null;
                    } else {
                        String string14 = c10.getString(i13);
                        int i34 = e26;
                        i14 = i13;
                        i15 = i34;
                        str2 = string14;
                    }
                    if (c10.isNull(i15)) {
                        int i35 = e27;
                        i16 = i15;
                        i17 = i35;
                        str3 = null;
                    } else {
                        String string15 = c10.getString(i15);
                        int i36 = e27;
                        i16 = i15;
                        i17 = i36;
                        str3 = string15;
                    }
                    if (c10.isNull(i17)) {
                        int i37 = e28;
                        i18 = i17;
                        i19 = i37;
                        str4 = null;
                    } else {
                        String string16 = c10.getString(i17);
                        int i38 = e28;
                        i18 = i17;
                        i19 = i38;
                        str4 = string16;
                    }
                    if (c10.isNull(i19)) {
                        int i39 = e29;
                        i20 = i19;
                        i21 = i39;
                        str5 = null;
                    } else {
                        String string17 = c10.getString(i19);
                        int i40 = e29;
                        i20 = i19;
                        i21 = i40;
                        str5 = string17;
                    }
                    if (c10.isNull(i21)) {
                        int i41 = e30;
                        i22 = i21;
                        i23 = i41;
                        l10 = null;
                    } else {
                        Long valueOf5 = Long.valueOf(c10.getLong(i21));
                        int i42 = e30;
                        i22 = i21;
                        i23 = i42;
                        l10 = valueOf5;
                    }
                    if (c10.isNull(i23)) {
                        int i43 = e31;
                        i24 = i23;
                        i25 = i43;
                        l11 = null;
                    } else {
                        Long valueOf6 = Long.valueOf(c10.getLong(i23));
                        int i44 = e31;
                        i24 = i23;
                        i25 = i44;
                        l11 = valueOf6;
                    }
                    if (c10.isNull(i25)) {
                        i26 = i25;
                        cursor = c10;
                        aVar = null;
                    } else {
                        if (c10.isNull(i25)) {
                            i26 = i25;
                            string = null;
                        } else {
                            i26 = i25;
                            string = c10.getString(i25);
                        }
                        cursor = c10;
                        try {
                            aVar = new ArticleEntity.a(string);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor.close();
                            throw th;
                        }
                    }
                    arrayList.add(new ArticleEntity(string2, string3, string4, string5, string6, string7, valueOf, string8, string9, string10, string11, string12, valueOf4, valueOf2, str, str2, str3, str4, str5, l10, l11, aVar));
                    e10 = i10;
                    e24 = i12;
                    e25 = i14;
                    e26 = i16;
                    e27 = i18;
                    e28 = i20;
                    e29 = i22;
                    e30 = i24;
                    c10 = cursor;
                    e31 = i26;
                    i27 = i28;
                }
                c10.close();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                cursor = c10;
            }
        }

        public void finalize() {
            this.f45257a.U();
        }
    }

    public class p implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f45259a;

        public p(androidx.room.A a10) {
            this.f45259a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursor;
            p pVar;
            Boolean valueOf;
            int i10;
            int i11;
            Long valueOf2;
            int i12;
            int i13;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            int i17;
            String str3;
            int i18;
            int i19;
            String str4;
            int i20;
            int i21;
            String str5;
            int i22;
            int i23;
            Long l10;
            int i24;
            int i25;
            Long l11;
            int i26;
            ArticleEntity.a aVar;
            String string;
            Cursor c10 = A2.b.c(f.this.f45214a, this.f45259a, false, null);
            try {
                int e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
                int e11 = A2.a.e(c10, "category_id");
                int e12 = A2.a.e(c10, "category_name");
                int e13 = A2.a.e(c10, "title");
                int e14 = A2.a.e(c10, "titles");
                int e15 = A2.a.e(c10, "type");
                int e16 = A2.a.e(c10, ViewProps.ENABLED);
                int e17 = A2.a.e(c10, "channels");
                int e18 = A2.a.e(c10, "creator");
                int e19 = A2.a.e(c10, "modifier");
                int e20 = A2.a.e(c10, "department_id");
                int e21 = A2.a.e(c10, "language");
                int e22 = A2.a.e(c10, "created_time");
                int e23 = A2.a.e(c10, "modified_time");
                try {
                    int e24 = A2.a.e(c10, "public_url");
                    int e25 = A2.a.e(c10, "published_title");
                    int e26 = A2.a.e(c10, "stats");
                    int e27 = A2.a.e(c10, "content");
                    int e28 = A2.a.e(c10, "rated_type");
                    int e29 = A2.a.e(c10, "last_viewed_time");
                    int e30 = A2.a.e(c10, "recently_viewed_time_from_search");
                    int e31 = A2.a.e(c10, "local_meta_article_local_file_path");
                    int i27 = e23;
                    ArrayList arrayList = new ArrayList(c10.getCount());
                    while (c10.moveToNext()) {
                        String string2 = c10.getString(e10);
                        String string3 = c10.isNull(e11) ? null : c10.getString(e11);
                        String string4 = c10.isNull(e12) ? null : c10.getString(e12);
                        String string5 = c10.isNull(e13) ? null : c10.getString(e13);
                        String string6 = c10.isNull(e14) ? null : c10.getString(e14);
                        String string7 = c10.isNull(e15) ? null : c10.getString(e15);
                        Integer valueOf3 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                        if (valueOf3 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf3.intValue() != 0);
                        }
                        String string8 = c10.isNull(e17) ? null : c10.getString(e17);
                        String string9 = c10.isNull(e18) ? null : c10.getString(e18);
                        String string10 = c10.isNull(e19) ? null : c10.getString(e19);
                        String string11 = c10.isNull(e20) ? null : c10.getString(e20);
                        String string12 = c10.isNull(e21) ? null : c10.getString(e21);
                        Long valueOf4 = c10.isNull(e22) ? null : Long.valueOf(c10.getLong(e22));
                        int i28 = i27;
                        if (c10.isNull(i28)) {
                            int i29 = e24;
                            i10 = e10;
                            i11 = i29;
                            valueOf2 = null;
                        } else {
                            int i30 = e24;
                            i10 = e10;
                            i11 = i30;
                            valueOf2 = Long.valueOf(c10.getLong(i28));
                        }
                        if (c10.isNull(i11)) {
                            int i31 = e25;
                            i12 = i11;
                            i13 = i31;
                            str = null;
                        } else {
                            String string13 = c10.getString(i11);
                            int i32 = e25;
                            i12 = i11;
                            i13 = i32;
                            str = string13;
                        }
                        if (c10.isNull(i13)) {
                            int i33 = e26;
                            i14 = i13;
                            i15 = i33;
                            str2 = null;
                        } else {
                            String string14 = c10.getString(i13);
                            int i34 = e26;
                            i14 = i13;
                            i15 = i34;
                            str2 = string14;
                        }
                        if (c10.isNull(i15)) {
                            int i35 = e27;
                            i16 = i15;
                            i17 = i35;
                            str3 = null;
                        } else {
                            String string15 = c10.getString(i15);
                            int i36 = e27;
                            i16 = i15;
                            i17 = i36;
                            str3 = string15;
                        }
                        if (c10.isNull(i17)) {
                            int i37 = e28;
                            i18 = i17;
                            i19 = i37;
                            str4 = null;
                        } else {
                            String string16 = c10.getString(i17);
                            int i38 = e28;
                            i18 = i17;
                            i19 = i38;
                            str4 = string16;
                        }
                        if (c10.isNull(i19)) {
                            int i39 = e29;
                            i20 = i19;
                            i21 = i39;
                            str5 = null;
                        } else {
                            String string17 = c10.getString(i19);
                            int i40 = e29;
                            i20 = i19;
                            i21 = i40;
                            str5 = string17;
                        }
                        if (c10.isNull(i21)) {
                            int i41 = e30;
                            i22 = i21;
                            i23 = i41;
                            l10 = null;
                        } else {
                            Long valueOf5 = Long.valueOf(c10.getLong(i21));
                            int i42 = e30;
                            i22 = i21;
                            i23 = i42;
                            l10 = valueOf5;
                        }
                        if (c10.isNull(i23)) {
                            int i43 = e31;
                            i24 = i23;
                            i25 = i43;
                            l11 = null;
                        } else {
                            Long valueOf6 = Long.valueOf(c10.getLong(i23));
                            int i44 = e31;
                            i24 = i23;
                            i25 = i44;
                            l11 = valueOf6;
                        }
                        if (c10.isNull(i25)) {
                            i26 = i25;
                            cursor = c10;
                            aVar = null;
                        } else {
                            if (c10.isNull(i25)) {
                                i26 = i25;
                                string = null;
                            } else {
                                i26 = i25;
                                string = c10.getString(i25);
                            }
                            cursor = c10;
                            try {
                                aVar = new ArticleEntity.a(string);
                            } catch (Throwable th2) {
                                th = th2;
                                pVar = this;
                                cursor.close();
                                pVar.f45259a.U();
                                throw th;
                            }
                        }
                        arrayList.add(new ArticleEntity(string2, string3, string4, string5, string6, string7, valueOf, string8, string9, string10, string11, string12, valueOf4, valueOf2, str, str2, str3, str4, str5, l10, l11, aVar));
                        e10 = i10;
                        e24 = i12;
                        e25 = i14;
                        e26 = i16;
                        e27 = i18;
                        e28 = i20;
                        e29 = i22;
                        e30 = i24;
                        c10 = cursor;
                        e31 = i26;
                        i27 = i28;
                    }
                    c10.close();
                    this.f45259a.U();
                    return arrayList;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = c10;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = c10;
                pVar = this;
            }
        }
    }

    public class q implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f45261a;

        public q(androidx.room.A a10) {
            this.f45261a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursor;
            Boolean valueOf;
            int i10;
            int i11;
            Long valueOf2;
            int i12;
            int i13;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            int i17;
            String str3;
            int i18;
            int i19;
            String str4;
            int i20;
            int i21;
            String str5;
            int i22;
            int i23;
            Long l10;
            int i24;
            int i25;
            Long l11;
            int i26;
            ArticleEntity.a aVar;
            String string;
            Cursor c10 = A2.b.c(f.this.f45214a, this.f45261a, false, null);
            try {
                int e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
                int e11 = A2.a.e(c10, "category_id");
                int e12 = A2.a.e(c10, "category_name");
                int e13 = A2.a.e(c10, "title");
                int e14 = A2.a.e(c10, "titles");
                int e15 = A2.a.e(c10, "type");
                int e16 = A2.a.e(c10, ViewProps.ENABLED);
                int e17 = A2.a.e(c10, "channels");
                int e18 = A2.a.e(c10, "creator");
                int e19 = A2.a.e(c10, "modifier");
                int e20 = A2.a.e(c10, "department_id");
                int e21 = A2.a.e(c10, "language");
                int e22 = A2.a.e(c10, "created_time");
                int e23 = A2.a.e(c10, "modified_time");
                int e24 = A2.a.e(c10, "public_url");
                int e25 = A2.a.e(c10, "published_title");
                int e26 = A2.a.e(c10, "stats");
                int e27 = A2.a.e(c10, "content");
                int e28 = A2.a.e(c10, "rated_type");
                int e29 = A2.a.e(c10, "last_viewed_time");
                int e30 = A2.a.e(c10, "recently_viewed_time_from_search");
                int e31 = A2.a.e(c10, "local_meta_article_local_file_path");
                int i27 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string2 = c10.getString(e10);
                    String string3 = c10.isNull(e11) ? null : c10.getString(e11);
                    String string4 = c10.isNull(e12) ? null : c10.getString(e12);
                    String string5 = c10.isNull(e13) ? null : c10.getString(e13);
                    String string6 = c10.isNull(e14) ? null : c10.getString(e14);
                    String string7 = c10.isNull(e15) ? null : c10.getString(e15);
                    Integer valueOf3 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                    if (valueOf3 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf3.intValue() != 0);
                    }
                    String string8 = c10.isNull(e17) ? null : c10.getString(e17);
                    String string9 = c10.isNull(e18) ? null : c10.getString(e18);
                    String string10 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string11 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string12 = c10.isNull(e21) ? null : c10.getString(e21);
                    Long valueOf4 = c10.isNull(e22) ? null : Long.valueOf(c10.getLong(e22));
                    int i28 = i27;
                    if (c10.isNull(i28)) {
                        int i29 = e24;
                        i10 = e10;
                        i11 = i29;
                        valueOf2 = null;
                    } else {
                        int i30 = e24;
                        i10 = e10;
                        i11 = i30;
                        valueOf2 = Long.valueOf(c10.getLong(i28));
                    }
                    if (c10.isNull(i11)) {
                        int i31 = e25;
                        i12 = i11;
                        i13 = i31;
                        str = null;
                    } else {
                        String string13 = c10.getString(i11);
                        int i32 = e25;
                        i12 = i11;
                        i13 = i32;
                        str = string13;
                    }
                    if (c10.isNull(i13)) {
                        int i33 = e26;
                        i14 = i13;
                        i15 = i33;
                        str2 = null;
                    } else {
                        String string14 = c10.getString(i13);
                        int i34 = e26;
                        i14 = i13;
                        i15 = i34;
                        str2 = string14;
                    }
                    if (c10.isNull(i15)) {
                        int i35 = e27;
                        i16 = i15;
                        i17 = i35;
                        str3 = null;
                    } else {
                        String string15 = c10.getString(i15);
                        int i36 = e27;
                        i16 = i15;
                        i17 = i36;
                        str3 = string15;
                    }
                    if (c10.isNull(i17)) {
                        int i37 = e28;
                        i18 = i17;
                        i19 = i37;
                        str4 = null;
                    } else {
                        String string16 = c10.getString(i17);
                        int i38 = e28;
                        i18 = i17;
                        i19 = i38;
                        str4 = string16;
                    }
                    if (c10.isNull(i19)) {
                        int i39 = e29;
                        i20 = i19;
                        i21 = i39;
                        str5 = null;
                    } else {
                        String string17 = c10.getString(i19);
                        int i40 = e29;
                        i20 = i19;
                        i21 = i40;
                        str5 = string17;
                    }
                    if (c10.isNull(i21)) {
                        int i41 = e30;
                        i22 = i21;
                        i23 = i41;
                        l10 = null;
                    } else {
                        Long valueOf5 = Long.valueOf(c10.getLong(i21));
                        int i42 = e30;
                        i22 = i21;
                        i23 = i42;
                        l10 = valueOf5;
                    }
                    if (c10.isNull(i23)) {
                        int i43 = e31;
                        i24 = i23;
                        i25 = i43;
                        l11 = null;
                    } else {
                        Long valueOf6 = Long.valueOf(c10.getLong(i23));
                        int i44 = e31;
                        i24 = i23;
                        i25 = i44;
                        l11 = valueOf6;
                    }
                    if (c10.isNull(i25)) {
                        i26 = i25;
                        cursor = c10;
                        aVar = null;
                    } else {
                        if (c10.isNull(i25)) {
                            i26 = i25;
                            string = null;
                        } else {
                            i26 = i25;
                            string = c10.getString(i25);
                        }
                        cursor = c10;
                        try {
                            aVar = new ArticleEntity.a(string);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor.close();
                            throw th;
                        }
                    }
                    arrayList.add(new ArticleEntity(string2, string3, string4, string5, string6, string7, valueOf, string8, string9, string10, string11, string12, valueOf4, valueOf2, str, str2, str3, str4, str5, l10, l11, aVar));
                    e10 = i10;
                    e24 = i12;
                    e25 = i14;
                    e26 = i16;
                    e27 = i18;
                    e28 = i20;
                    e29 = i22;
                    e30 = i24;
                    c10 = cursor;
                    e31 = i26;
                    i27 = i28;
                }
                c10.close();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                cursor = c10;
            }
        }

        public void finalize() {
            this.f45261a.U();
        }
    }

    public class r implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f45263a;

        public r(androidx.room.A a10) {
            this.f45263a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArticleEntity call() {
            ArticleEntity articleEntity;
            Boolean valueOf;
            ArticleEntity.a aVar;
            Cursor c10 = A2.b.c(f.this.f45214a, this.f45263a, false, null);
            try {
                int e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
                int e11 = A2.a.e(c10, "category_id");
                int e12 = A2.a.e(c10, "category_name");
                int e13 = A2.a.e(c10, "title");
                int e14 = A2.a.e(c10, "titles");
                int e15 = A2.a.e(c10, "type");
                int e16 = A2.a.e(c10, ViewProps.ENABLED);
                int e17 = A2.a.e(c10, "channels");
                int e18 = A2.a.e(c10, "creator");
                int e19 = A2.a.e(c10, "modifier");
                int e20 = A2.a.e(c10, "department_id");
                int e21 = A2.a.e(c10, "language");
                int e22 = A2.a.e(c10, "created_time");
                int e23 = A2.a.e(c10, "modified_time");
                int e24 = A2.a.e(c10, "public_url");
                int e25 = A2.a.e(c10, "published_title");
                int e26 = A2.a.e(c10, "stats");
                int e27 = A2.a.e(c10, "content");
                int e28 = A2.a.e(c10, "rated_type");
                int e29 = A2.a.e(c10, "last_viewed_time");
                int e30 = A2.a.e(c10, "recently_viewed_time_from_search");
                int e31 = A2.a.e(c10, "local_meta_article_local_file_path");
                if (c10.moveToFirst()) {
                    String string = c10.getString(e10);
                    String string2 = c10.isNull(e11) ? null : c10.getString(e11);
                    String string3 = c10.isNull(e12) ? null : c10.getString(e12);
                    String string4 = c10.isNull(e13) ? null : c10.getString(e13);
                    String string5 = c10.isNull(e14) ? null : c10.getString(e14);
                    String string6 = c10.isNull(e15) ? null : c10.getString(e15);
                    Integer valueOf2 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                    if (valueOf2 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf2.intValue() != 0);
                    }
                    String string7 = c10.isNull(e17) ? null : c10.getString(e17);
                    String string8 = c10.isNull(e18) ? null : c10.getString(e18);
                    String string9 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string10 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string11 = c10.isNull(e21) ? null : c10.getString(e21);
                    Long valueOf3 = c10.isNull(e22) ? null : Long.valueOf(c10.getLong(e22));
                    Long valueOf4 = c10.isNull(e23) ? null : Long.valueOf(c10.getLong(e23));
                    String string12 = c10.isNull(e24) ? null : c10.getString(e24);
                    String string13 = c10.isNull(e25) ? null : c10.getString(e25);
                    String string14 = c10.isNull(e26) ? null : c10.getString(e26);
                    String string15 = c10.isNull(e27) ? null : c10.getString(e27);
                    String string16 = c10.isNull(e28) ? null : c10.getString(e28);
                    Long valueOf5 = c10.isNull(e29) ? null : Long.valueOf(c10.getLong(e29));
                    Long valueOf6 = c10.isNull(e30) ? null : Long.valueOf(c10.getLong(e30));
                    if (c10.isNull(e31)) {
                        aVar = null;
                    } else {
                        aVar = new ArticleEntity.a(c10.isNull(e31) ? null : c10.getString(e31));
                    }
                    articleEntity = new ArticleEntity(string, string2, string3, string4, string5, string6, valueOf, string7, string8, string9, string10, string11, valueOf3, valueOf4, string12, string13, string14, string15, string16, valueOf5, valueOf6, aVar);
                } else {
                    articleEntity = null;
                }
                c10.close();
                return articleEntity;
            } catch (Throwable th2) {
                c10.close();
                throw th2;
            }
        }

        public void finalize() {
            this.f45263a.U();
        }
    }

    public class s implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f45265a;

        public s(androidx.room.A a10) {
            this.f45265a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursor;
            Boolean valueOf;
            int i10;
            int i11;
            Long valueOf2;
            int i12;
            int i13;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            int i17;
            String str3;
            int i18;
            int i19;
            String str4;
            int i20;
            int i21;
            String str5;
            int i22;
            int i23;
            Long l10;
            int i24;
            int i25;
            Long l11;
            int i26;
            ArticleEntity.a aVar;
            String string;
            Cursor c10 = A2.b.c(f.this.f45214a, this.f45265a, false, null);
            try {
                int e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
                int e11 = A2.a.e(c10, "category_id");
                int e12 = A2.a.e(c10, "category_name");
                int e13 = A2.a.e(c10, "title");
                int e14 = A2.a.e(c10, "titles");
                int e15 = A2.a.e(c10, "type");
                int e16 = A2.a.e(c10, ViewProps.ENABLED);
                int e17 = A2.a.e(c10, "channels");
                int e18 = A2.a.e(c10, "creator");
                int e19 = A2.a.e(c10, "modifier");
                int e20 = A2.a.e(c10, "department_id");
                int e21 = A2.a.e(c10, "language");
                int e22 = A2.a.e(c10, "created_time");
                int e23 = A2.a.e(c10, "modified_time");
                int e24 = A2.a.e(c10, "public_url");
                int e25 = A2.a.e(c10, "published_title");
                int e26 = A2.a.e(c10, "stats");
                int e27 = A2.a.e(c10, "content");
                int e28 = A2.a.e(c10, "rated_type");
                int e29 = A2.a.e(c10, "last_viewed_time");
                int e30 = A2.a.e(c10, "recently_viewed_time_from_search");
                int e31 = A2.a.e(c10, "local_meta_article_local_file_path");
                int i27 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string2 = c10.getString(e10);
                    String string3 = c10.isNull(e11) ? null : c10.getString(e11);
                    String string4 = c10.isNull(e12) ? null : c10.getString(e12);
                    String string5 = c10.isNull(e13) ? null : c10.getString(e13);
                    String string6 = c10.isNull(e14) ? null : c10.getString(e14);
                    String string7 = c10.isNull(e15) ? null : c10.getString(e15);
                    Integer valueOf3 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                    if (valueOf3 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf3.intValue() != 0);
                    }
                    String string8 = c10.isNull(e17) ? null : c10.getString(e17);
                    String string9 = c10.isNull(e18) ? null : c10.getString(e18);
                    String string10 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string11 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string12 = c10.isNull(e21) ? null : c10.getString(e21);
                    Long valueOf4 = c10.isNull(e22) ? null : Long.valueOf(c10.getLong(e22));
                    int i28 = i27;
                    if (c10.isNull(i28)) {
                        int i29 = e24;
                        i10 = e10;
                        i11 = i29;
                        valueOf2 = null;
                    } else {
                        int i30 = e24;
                        i10 = e10;
                        i11 = i30;
                        valueOf2 = Long.valueOf(c10.getLong(i28));
                    }
                    if (c10.isNull(i11)) {
                        int i31 = e25;
                        i12 = i11;
                        i13 = i31;
                        str = null;
                    } else {
                        String string13 = c10.getString(i11);
                        int i32 = e25;
                        i12 = i11;
                        i13 = i32;
                        str = string13;
                    }
                    if (c10.isNull(i13)) {
                        int i33 = e26;
                        i14 = i13;
                        i15 = i33;
                        str2 = null;
                    } else {
                        String string14 = c10.getString(i13);
                        int i34 = e26;
                        i14 = i13;
                        i15 = i34;
                        str2 = string14;
                    }
                    if (c10.isNull(i15)) {
                        int i35 = e27;
                        i16 = i15;
                        i17 = i35;
                        str3 = null;
                    } else {
                        String string15 = c10.getString(i15);
                        int i36 = e27;
                        i16 = i15;
                        i17 = i36;
                        str3 = string15;
                    }
                    if (c10.isNull(i17)) {
                        int i37 = e28;
                        i18 = i17;
                        i19 = i37;
                        str4 = null;
                    } else {
                        String string16 = c10.getString(i17);
                        int i38 = e28;
                        i18 = i17;
                        i19 = i38;
                        str4 = string16;
                    }
                    if (c10.isNull(i19)) {
                        int i39 = e29;
                        i20 = i19;
                        i21 = i39;
                        str5 = null;
                    } else {
                        String string17 = c10.getString(i19);
                        int i40 = e29;
                        i20 = i19;
                        i21 = i40;
                        str5 = string17;
                    }
                    if (c10.isNull(i21)) {
                        int i41 = e30;
                        i22 = i21;
                        i23 = i41;
                        l10 = null;
                    } else {
                        Long valueOf5 = Long.valueOf(c10.getLong(i21));
                        int i42 = e30;
                        i22 = i21;
                        i23 = i42;
                        l10 = valueOf5;
                    }
                    if (c10.isNull(i23)) {
                        int i43 = e31;
                        i24 = i23;
                        i25 = i43;
                        l11 = null;
                    } else {
                        Long valueOf6 = Long.valueOf(c10.getLong(i23));
                        int i44 = e31;
                        i24 = i23;
                        i25 = i44;
                        l11 = valueOf6;
                    }
                    if (c10.isNull(i25)) {
                        i26 = i25;
                        cursor = c10;
                        aVar = null;
                    } else {
                        if (c10.isNull(i25)) {
                            i26 = i25;
                            string = null;
                        } else {
                            i26 = i25;
                            string = c10.getString(i25);
                        }
                        cursor = c10;
                        try {
                            aVar = new ArticleEntity.a(string);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor.close();
                            throw th;
                        }
                    }
                    arrayList.add(new ArticleEntity(string2, string3, string4, string5, string6, string7, valueOf, string8, string9, string10, string11, string12, valueOf4, valueOf2, str, str2, str3, str4, str5, l10, l11, aVar));
                    e10 = i10;
                    e24 = i12;
                    e25 = i14;
                    e26 = i16;
                    e27 = i18;
                    e28 = i20;
                    e29 = i22;
                    e30 = i24;
                    c10 = cursor;
                    e31 = i26;
                    i27 = i28;
                }
                c10.close();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                cursor = c10;
            }
        }

        public void finalize() {
            this.f45265a.U();
        }
    }

    public class t implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f45267a;

        public t(androidx.room.A a10) {
            this.f45267a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursor;
            Boolean valueOf;
            int i10;
            int i11;
            Long valueOf2;
            int i12;
            int i13;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            int i17;
            String str3;
            int i18;
            int i19;
            String str4;
            int i20;
            int i21;
            String str5;
            int i22;
            int i23;
            Long l10;
            int i24;
            int i25;
            Long l11;
            int i26;
            ArticleEntity.a aVar;
            String string;
            Cursor c10 = A2.b.c(f.this.f45214a, this.f45267a, false, null);
            try {
                int e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
                int e11 = A2.a.e(c10, "category_id");
                int e12 = A2.a.e(c10, "category_name");
                int e13 = A2.a.e(c10, "title");
                int e14 = A2.a.e(c10, "titles");
                int e15 = A2.a.e(c10, "type");
                int e16 = A2.a.e(c10, ViewProps.ENABLED);
                int e17 = A2.a.e(c10, "channels");
                int e18 = A2.a.e(c10, "creator");
                int e19 = A2.a.e(c10, "modifier");
                int e20 = A2.a.e(c10, "department_id");
                int e21 = A2.a.e(c10, "language");
                int e22 = A2.a.e(c10, "created_time");
                int e23 = A2.a.e(c10, "modified_time");
                int e24 = A2.a.e(c10, "public_url");
                int e25 = A2.a.e(c10, "published_title");
                int e26 = A2.a.e(c10, "stats");
                int e27 = A2.a.e(c10, "content");
                int e28 = A2.a.e(c10, "rated_type");
                int e29 = A2.a.e(c10, "last_viewed_time");
                int e30 = A2.a.e(c10, "recently_viewed_time_from_search");
                int e31 = A2.a.e(c10, "local_meta_article_local_file_path");
                int i27 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string2 = c10.getString(e10);
                    String string3 = c10.isNull(e11) ? null : c10.getString(e11);
                    String string4 = c10.isNull(e12) ? null : c10.getString(e12);
                    String string5 = c10.isNull(e13) ? null : c10.getString(e13);
                    String string6 = c10.isNull(e14) ? null : c10.getString(e14);
                    String string7 = c10.isNull(e15) ? null : c10.getString(e15);
                    Integer valueOf3 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                    if (valueOf3 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf3.intValue() != 0);
                    }
                    String string8 = c10.isNull(e17) ? null : c10.getString(e17);
                    String string9 = c10.isNull(e18) ? null : c10.getString(e18);
                    String string10 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string11 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string12 = c10.isNull(e21) ? null : c10.getString(e21);
                    Long valueOf4 = c10.isNull(e22) ? null : Long.valueOf(c10.getLong(e22));
                    int i28 = i27;
                    if (c10.isNull(i28)) {
                        int i29 = e24;
                        i10 = e10;
                        i11 = i29;
                        valueOf2 = null;
                    } else {
                        int i30 = e24;
                        i10 = e10;
                        i11 = i30;
                        valueOf2 = Long.valueOf(c10.getLong(i28));
                    }
                    if (c10.isNull(i11)) {
                        int i31 = e25;
                        i12 = i11;
                        i13 = i31;
                        str = null;
                    } else {
                        String string13 = c10.getString(i11);
                        int i32 = e25;
                        i12 = i11;
                        i13 = i32;
                        str = string13;
                    }
                    if (c10.isNull(i13)) {
                        int i33 = e26;
                        i14 = i13;
                        i15 = i33;
                        str2 = null;
                    } else {
                        String string14 = c10.getString(i13);
                        int i34 = e26;
                        i14 = i13;
                        i15 = i34;
                        str2 = string14;
                    }
                    if (c10.isNull(i15)) {
                        int i35 = e27;
                        i16 = i15;
                        i17 = i35;
                        str3 = null;
                    } else {
                        String string15 = c10.getString(i15);
                        int i36 = e27;
                        i16 = i15;
                        i17 = i36;
                        str3 = string15;
                    }
                    if (c10.isNull(i17)) {
                        int i37 = e28;
                        i18 = i17;
                        i19 = i37;
                        str4 = null;
                    } else {
                        String string16 = c10.getString(i17);
                        int i38 = e28;
                        i18 = i17;
                        i19 = i38;
                        str4 = string16;
                    }
                    if (c10.isNull(i19)) {
                        int i39 = e29;
                        i20 = i19;
                        i21 = i39;
                        str5 = null;
                    } else {
                        String string17 = c10.getString(i19);
                        int i40 = e29;
                        i20 = i19;
                        i21 = i40;
                        str5 = string17;
                    }
                    if (c10.isNull(i21)) {
                        int i41 = e30;
                        i22 = i21;
                        i23 = i41;
                        l10 = null;
                    } else {
                        Long valueOf5 = Long.valueOf(c10.getLong(i21));
                        int i42 = e30;
                        i22 = i21;
                        i23 = i42;
                        l10 = valueOf5;
                    }
                    if (c10.isNull(i23)) {
                        int i43 = e31;
                        i24 = i23;
                        i25 = i43;
                        l11 = null;
                    } else {
                        Long valueOf6 = Long.valueOf(c10.getLong(i23));
                        int i44 = e31;
                        i24 = i23;
                        i25 = i44;
                        l11 = valueOf6;
                    }
                    if (c10.isNull(i25)) {
                        i26 = i25;
                        cursor = c10;
                        aVar = null;
                    } else {
                        if (c10.isNull(i25)) {
                            i26 = i25;
                            string = null;
                        } else {
                            i26 = i25;
                            string = c10.getString(i25);
                        }
                        cursor = c10;
                        try {
                            aVar = new ArticleEntity.a(string);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor.close();
                            throw th;
                        }
                    }
                    arrayList.add(new ArticleEntity(string2, string3, string4, string5, string6, string7, valueOf, string8, string9, string10, string11, string12, valueOf4, valueOf2, str, str2, str3, str4, str5, l10, l11, aVar));
                    e10 = i10;
                    e24 = i12;
                    e25 = i14;
                    e26 = i16;
                    e27 = i18;
                    e28 = i20;
                    e29 = i22;
                    e30 = i24;
                    c10 = cursor;
                    e31 = i26;
                    i27 = i28;
                }
                c10.close();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                cursor = c10;
            }
        }

        public void finalize() {
            this.f45267a.U();
        }
    }

    public class u extends androidx.room.k {
        public u(androidx.room.w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR REPLACE INTO `articles` (`id`,`category_id`,`category_name`,`title`,`titles`,`type`,`enabled`,`channels`,`creator`,`modifier`,`department_id`,`language`,`created_time`,`modified_time`,`public_url`,`published_title`,`stats`,`content`,`rated_type`,`last_viewed_time`,`recently_viewed_time_from_search`,`local_meta_article_local_file_path`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, ArticleEntity articleEntity) {
            kVar.P0(1, articleEntity.getId());
            if (articleEntity.getCategoryId() == null) {
                kVar.C1(2);
            } else {
                kVar.P0(2, articleEntity.getCategoryId());
            }
            if (articleEntity.getCategoryName() == null) {
                kVar.C1(3);
            } else {
                kVar.P0(3, articleEntity.getCategoryName());
            }
            if (articleEntity.getTitle() == null) {
                kVar.C1(4);
            } else {
                kVar.P0(4, articleEntity.getTitle());
            }
            if (articleEntity.getTitles() == null) {
                kVar.C1(5);
            } else {
                kVar.P0(5, articleEntity.getTitles());
            }
            if (articleEntity.getType() == null) {
                kVar.C1(6);
            } else {
                kVar.P0(6, articleEntity.getType());
            }
            if ((articleEntity.getEnabled() == null ? null : Integer.valueOf(articleEntity.getEnabled().booleanValue() ? 1 : 0)) == null) {
                kVar.C1(7);
            } else {
                kVar.h1(7, r0.intValue());
            }
            if (articleEntity.getChannels() == null) {
                kVar.C1(8);
            } else {
                kVar.P0(8, articleEntity.getChannels());
            }
            if (articleEntity.getCreator() == null) {
                kVar.C1(9);
            } else {
                kVar.P0(9, articleEntity.getCreator());
            }
            if (articleEntity.getModifier() == null) {
                kVar.C1(10);
            } else {
                kVar.P0(10, articleEntity.getModifier());
            }
            if (articleEntity.getDepartmentId() == null) {
                kVar.C1(11);
            } else {
                kVar.P0(11, articleEntity.getDepartmentId());
            }
            if (articleEntity.getLanguage() == null) {
                kVar.C1(12);
            } else {
                kVar.P0(12, articleEntity.getLanguage());
            }
            if (articleEntity.getCreatedTime() == null) {
                kVar.C1(13);
            } else {
                kVar.h1(13, articleEntity.getCreatedTime().longValue());
            }
            if (articleEntity.getModifiedTime() == null) {
                kVar.C1(14);
            } else {
                kVar.h1(14, articleEntity.getModifiedTime().longValue());
            }
            if (articleEntity.getPublicUrl() == null) {
                kVar.C1(15);
            } else {
                kVar.P0(15, articleEntity.getPublicUrl());
            }
            if (articleEntity.getPublishedTitle() == null) {
                kVar.C1(16);
            } else {
                kVar.P0(16, articleEntity.getPublishedTitle());
            }
            if (articleEntity.getStats() == null) {
                kVar.C1(17);
            } else {
                kVar.P0(17, articleEntity.getStats());
            }
            if (articleEntity.getContent() == null) {
                kVar.C1(18);
            } else {
                kVar.P0(18, articleEntity.getContent());
            }
            if (articleEntity.getRatedType() == null) {
                kVar.C1(19);
            } else {
                kVar.P0(19, articleEntity.getRatedType());
            }
            if (articleEntity.getLastViewedTime() == null) {
                kVar.C1(20);
            } else {
                kVar.h1(20, articleEntity.getLastViewedTime().longValue());
            }
            if (articleEntity.getRecentlyViewedTimeFromSearch() == null) {
                kVar.C1(21);
            } else {
                kVar.h1(21, articleEntity.getRecentlyViewedTimeFromSearch().longValue());
            }
            ArticleEntity.a localMeta = articleEntity.getLocalMeta();
            if (localMeta == null) {
                kVar.C1(22);
            } else if (localMeta.a() == null) {
                kVar.C1(22);
            } else {
                kVar.P0(22, localMeta.a());
            }
        }
    }

    public class v implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f45270a;

        public v(List list) {
            this.f45270a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            StringBuilder b10 = A2.e.b();
            b10.append("DELETE FROM articles WHERE id in (");
            A2.e.a(b10, this.f45270a.size());
            b10.append(") AND last_viewed_time IS NULL AND recently_viewed_time_from_search IS NULL AND rated_type IS NULL");
            E2.k compileStatement = f.this.f45214a.compileStatement(b10.toString());
            Iterator it = this.f45270a.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                compileStatement.P0(i10, (String) it.next());
                i10++;
            }
            f.this.f45214a.beginTransaction();
            try {
                Integer valueOf = Integer.valueOf(compileStatement.G());
                f.this.f45214a.setTransactionSuccessful();
                return valueOf;
            } finally {
                f.this.f45214a.endTransaction();
            }
        }
    }

    public class w implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f45272a;

        public w(List list) {
            this.f45272a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            StringBuilder b10 = A2.e.b();
            b10.append("DELETE FROM article_categories WHERE id in (");
            A2.e.a(b10, this.f45272a.size());
            b10.append(")");
            E2.k compileStatement = f.this.f45214a.compileStatement(b10.toString());
            Iterator it = this.f45272a.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                compileStatement.P0(i10, (String) it.next());
                i10++;
            }
            f.this.f45214a.beginTransaction();
            try {
                Integer valueOf = Integer.valueOf(compileStatement.G());
                f.this.f45214a.setTransactionSuccessful();
                return valueOf;
            } finally {
                f.this.f45214a.endTransaction();
            }
        }
    }

    public class x extends AbstractC2272j {
        public x(androidx.room.w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE OR ABORT `articles` SET `id` = ?,`category_id` = ?,`category_name` = ?,`title` = ?,`titles` = ?,`type` = ?,`enabled` = ?,`channels` = ?,`creator` = ?,`modifier` = ?,`department_id` = ?,`language` = ?,`created_time` = ?,`modified_time` = ?,`public_url` = ?,`published_title` = ?,`stats` = ?,`content` = ?,`rated_type` = ?,`last_viewed_time` = ?,`recently_viewed_time_from_search` = ?,`local_meta_article_local_file_path` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.AbstractC2272j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, ArticleEntity articleEntity) {
            kVar.P0(1, articleEntity.getId());
            if (articleEntity.getCategoryId() == null) {
                kVar.C1(2);
            } else {
                kVar.P0(2, articleEntity.getCategoryId());
            }
            if (articleEntity.getCategoryName() == null) {
                kVar.C1(3);
            } else {
                kVar.P0(3, articleEntity.getCategoryName());
            }
            if (articleEntity.getTitle() == null) {
                kVar.C1(4);
            } else {
                kVar.P0(4, articleEntity.getTitle());
            }
            if (articleEntity.getTitles() == null) {
                kVar.C1(5);
            } else {
                kVar.P0(5, articleEntity.getTitles());
            }
            if (articleEntity.getType() == null) {
                kVar.C1(6);
            } else {
                kVar.P0(6, articleEntity.getType());
            }
            if ((articleEntity.getEnabled() == null ? null : Integer.valueOf(articleEntity.getEnabled().booleanValue() ? 1 : 0)) == null) {
                kVar.C1(7);
            } else {
                kVar.h1(7, r0.intValue());
            }
            if (articleEntity.getChannels() == null) {
                kVar.C1(8);
            } else {
                kVar.P0(8, articleEntity.getChannels());
            }
            if (articleEntity.getCreator() == null) {
                kVar.C1(9);
            } else {
                kVar.P0(9, articleEntity.getCreator());
            }
            if (articleEntity.getModifier() == null) {
                kVar.C1(10);
            } else {
                kVar.P0(10, articleEntity.getModifier());
            }
            if (articleEntity.getDepartmentId() == null) {
                kVar.C1(11);
            } else {
                kVar.P0(11, articleEntity.getDepartmentId());
            }
            if (articleEntity.getLanguage() == null) {
                kVar.C1(12);
            } else {
                kVar.P0(12, articleEntity.getLanguage());
            }
            if (articleEntity.getCreatedTime() == null) {
                kVar.C1(13);
            } else {
                kVar.h1(13, articleEntity.getCreatedTime().longValue());
            }
            if (articleEntity.getModifiedTime() == null) {
                kVar.C1(14);
            } else {
                kVar.h1(14, articleEntity.getModifiedTime().longValue());
            }
            if (articleEntity.getPublicUrl() == null) {
                kVar.C1(15);
            } else {
                kVar.P0(15, articleEntity.getPublicUrl());
            }
            if (articleEntity.getPublishedTitle() == null) {
                kVar.C1(16);
            } else {
                kVar.P0(16, articleEntity.getPublishedTitle());
            }
            if (articleEntity.getStats() == null) {
                kVar.C1(17);
            } else {
                kVar.P0(17, articleEntity.getStats());
            }
            if (articleEntity.getContent() == null) {
                kVar.C1(18);
            } else {
                kVar.P0(18, articleEntity.getContent());
            }
            if (articleEntity.getRatedType() == null) {
                kVar.C1(19);
            } else {
                kVar.P0(19, articleEntity.getRatedType());
            }
            if (articleEntity.getLastViewedTime() == null) {
                kVar.C1(20);
            } else {
                kVar.h1(20, articleEntity.getLastViewedTime().longValue());
            }
            if (articleEntity.getRecentlyViewedTimeFromSearch() == null) {
                kVar.C1(21);
            } else {
                kVar.h1(21, articleEntity.getRecentlyViewedTimeFromSearch().longValue());
            }
            ArticleEntity.a localMeta = articleEntity.getLocalMeta();
            if (localMeta == null) {
                kVar.C1(22);
            } else if (localMeta.a() == null) {
                kVar.C1(22);
            } else {
                kVar.P0(22, localMeta.a());
            }
            kVar.P0(23, articleEntity.getId());
        }
    }

    public class y extends G {
        public y(androidx.room.w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM articles WHERE last_viewed_time IS NULL AND recently_viewed_time_from_search IS NULL AND rated_type IS NULL";
        }
    }

    public class z extends G {
        public z(androidx.room.w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM articles WHERE id = ?";
        }
    }

    public f(androidx.room.w wVar) {
        this.f45214a = wVar;
        this.f45215b = new j(wVar);
        this.f45216c = new u(wVar);
        this.f45217d = new x(wVar);
        this.f45218e = new y(wVar);
        this.f45219f = new z(wVar);
        this.f45220g = new A(wVar);
        this.f45221h = new B(wVar);
        this.f45222i = new C(wVar);
        this.f45223j = new D(wVar);
        this.f45224k = new C4069a(wVar);
        this.f45225l = new C4070b(wVar);
    }

    public static List T() {
        return Collections.EMPTY_LIST;
    }

    @Override // df.InterfaceC4065a
    public Object A(String str, Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new CallableC0657f(str), continuation);
    }

    @Override // df.InterfaceC4065a
    public Object B(final String str, final String str2, final boolean z10, final List list, Continuation continuation) {
        return androidx.room.x.d(this.f45214a, new Function1() { // from class: df.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object B10;
                B10 = super/*df.a*/.B(str, str2, z10, list, (Continuation) obj);
                return B10;
            }
        }, continuation);
    }

    @Override // df.InterfaceC4065a
    public Object C(Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new m(), continuation);
    }

    @Override // df.InterfaceC4065a
    public Object D(String str, long j10, Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new g(j10, str), continuation);
    }

    @Override // df.InterfaceC4065a
    public InterfaceC5321f a(String str) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM articles WHERE id = ?", 1);
        r10.P0(1, str);
        return AbstractC2268f.a(this.f45214a, false, new String[]{"articles"}, new r(r10));
    }

    @Override // df.InterfaceC4065a
    public Object b(final String str, final String str2, final boolean z10, final List list, Continuation continuation) {
        return androidx.room.x.d(this.f45214a, new Function1() { // from class: df.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object b10;
                b10 = super/*df.a*/.b(str, str2, z10, list, (Continuation) obj);
                return b10;
            }
        }, continuation);
    }

    @Override // df.InterfaceC4065a
    public Object c(ArticleEntity articleEntity, Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new CallableC4072d(articleEntity), continuation);
    }

    @Override // df.InterfaceC4065a
    public InterfaceC5321f e(String str, String str2, String str3, boolean z10) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM article_categories WHERE (enabled = 1 AND ((CASE WHEN (? IS NULL OR ? = '') THEN (parent_category_id IS NULL) ELSE (parent_category_id = ?) END) AND (CASE WHEN (? IS NULL OR ? = '') THEN (1) ELSE (department_id = ?) END)) AND CASE WHEN ? IS NULL THEN (1) ELSE (name LIKE '%' || ? || '%') END AND (CASE WHEN ? THEN (1) ELSE (children_count > 0 OR articles_count > 0) END)) ORDER BY `order` ASC", 9);
        if (str == null) {
            r10.C1(1);
        } else {
            r10.P0(1, str);
        }
        if (str == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str);
        }
        if (str == null) {
            r10.C1(3);
        } else {
            r10.P0(3, str);
        }
        if (str2 == null) {
            r10.C1(4);
        } else {
            r10.P0(4, str2);
        }
        if (str2 == null) {
            r10.C1(5);
        } else {
            r10.P0(5, str2);
        }
        if (str2 == null) {
            r10.C1(6);
        } else {
            r10.P0(6, str2);
        }
        if (str3 == null) {
            r10.C1(7);
        } else {
            r10.P0(7, str3);
        }
        if (str3 == null) {
            r10.C1(8);
        } else {
            r10.P0(8, str3);
        }
        r10.h1(9, z10 ? 1L : 0L);
        return AbstractC2268f.a(this.f45214a, false, new String[]{"article_categories"}, new n(r10));
    }

    @Override // df.InterfaceC4065a
    public Object f(final List list, final boolean z10, Continuation continuation) {
        return androidx.room.x.d(this.f45214a, new Function1() { // from class: df.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object f10;
                f10 = super/*df.a*/.f(list, z10, (Continuation) obj);
                return f10;
            }
        }, continuation);
    }

    @Override // df.InterfaceC4065a
    public List g(String str, String str2, boolean z10) {
        androidx.room.A r10 = androidx.room.A.r("SELECT id FROM articles WHERE (CASE WHEN (?) THEN (1) ELSE (CASE WHEN (? IS NULL OR ? = '') THEN category_id IS NULL ELSE (category_id = ?) END) END) AND (CASE WHEN (? IS NULL OR ? = '') THEN (1) ELSE (department_id = ?) END)", 7);
        r10.h1(1, z10 ? 1L : 0L);
        if (str2 == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str2);
        }
        if (str2 == null) {
            r10.C1(3);
        } else {
            r10.P0(3, str2);
        }
        if (str2 == null) {
            r10.C1(4);
        } else {
            r10.P0(4, str2);
        }
        if (str == null) {
            r10.C1(5);
        } else {
            r10.P0(5, str);
        }
        if (str == null) {
            r10.C1(6);
        } else {
            r10.P0(6, str);
        }
        if (str == null) {
            r10.C1(7);
        } else {
            r10.P0(7, str);
        }
        this.f45214a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f45214a, r10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(c10.getString(0));
            }
            return arrayList;
        } finally {
            c10.close();
            r10.U();
        }
    }

    @Override // df.InterfaceC4065a
    public Object i(List list, Continuation continuation) {
        StringBuilder b10 = A2.e.b();
        b10.append("SELECT * FROM articles WHERE id IN (");
        int size = list.size();
        A2.e.a(b10, size);
        b10.append(")");
        androidx.room.A r10 = androidx.room.A.r(b10.toString(), size);
        Iterator it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            r10.P0(i10, (String) it.next());
            i10++;
        }
        return AbstractC2268f.b(this.f45214a, false, A2.b.a(), new p(r10), continuation);
    }

    @Override // df.InterfaceC4065a
    public InterfaceC5321f j(String str, String str2, boolean z10, boolean z11, List list, int i10) {
        StringBuilder b10 = A2.e.b();
        b10.append("SELECT * FROM articles WHERE enabled = 1 AND (department_id in (");
        int size = list.size();
        A2.e.a(b10, size);
        b10.append(")) AND ((CASE WHEN ");
        b10.append("?");
        b10.append(" THEN (1) ELSE (CASE WHEN ");
        b10.append("?");
        b10.append(" THEN (category_id IN (SELECT id FROM article_categories WHERE (enabled = 1 AND ((CASE WHEN (");
        b10.append("?");
        b10.append(" IS NULL OR ");
        b10.append("?");
        b10.append(" = '') THEN (parent_category_id IS NULL) ELSE (parent_category_id = ");
        b10.append("?");
        b10.append(") END) AND (CASE WHEN (");
        b10.append("?");
        b10.append(" IS NULL OR ");
        b10.append("?");
        b10.append(" = '') THEN (1) ELSE (department_id = ");
        b10.append("?");
        b10.append(") END)) AND articles_count > 0))) ELSE (category_id = ");
        b10.append("?");
        b10.append(") END) END) AND (CASE WHEN (");
        b10.append("?");
        b10.append(" IS NULL OR ");
        b10.append("?");
        b10.append(" = '') THEN (1) ELSE (department_id = ");
        b10.append("?");
        b10.append(") END)) AND last_viewed_time IS NOT NULL ORDER BY last_viewed_time DESC LIMIT ");
        b10.append("?");
        int i11 = size + 13;
        androidx.room.A r10 = androidx.room.A.r(b10.toString(), i11);
        Iterator it = list.iterator();
        int i12 = 1;
        while (it.hasNext()) {
            r10.P0(i12, (String) it.next());
            i12++;
        }
        r10.h1(size + 1, z11 ? 1L : 0L);
        r10.h1(size + 2, z10 ? 1L : 0L);
        int i13 = size + 3;
        if (str2 == null) {
            r10.C1(i13);
        } else {
            r10.P0(i13, str2);
        }
        int i14 = size + 4;
        if (str2 == null) {
            r10.C1(i14);
        } else {
            r10.P0(i14, str2);
        }
        int i15 = size + 5;
        if (str2 == null) {
            r10.C1(i15);
        } else {
            r10.P0(i15, str2);
        }
        int i16 = size + 6;
        if (str == null) {
            r10.C1(i16);
        } else {
            r10.P0(i16, str);
        }
        int i17 = size + 7;
        if (str == null) {
            r10.C1(i17);
        } else {
            r10.P0(i17, str);
        }
        int i18 = size + 8;
        if (str == null) {
            r10.C1(i18);
        } else {
            r10.P0(i18, str);
        }
        int i19 = size + 9;
        if (str2 == null) {
            r10.C1(i19);
        } else {
            r10.P0(i19, str2);
        }
        int i20 = size + 10;
        if (str == null) {
            r10.C1(i20);
        } else {
            r10.P0(i20, str);
        }
        int i21 = size + 11;
        if (str == null) {
            r10.C1(i21);
        } else {
            r10.P0(i21, str);
        }
        int i22 = size + 12;
        if (str == null) {
            r10.C1(i22);
        } else {
            r10.P0(i22, str);
        }
        r10.h1(i11, i10);
        return AbstractC2268f.a(this.f45214a, false, new String[]{"articles", "article_categories"}, new s(r10));
    }

    @Override // df.InterfaceC4065a
    public InterfaceC5321f k(String str, String str2, String str3, boolean z10, boolean z11, List list) {
        StringBuilder b10 = A2.e.b();
        b10.append("SELECT * FROM articles WHERE enabled = 1 AND (department_id in (");
        int size = list.size();
        A2.e.a(b10, size);
        b10.append(")) AND (CASE WHEN ");
        b10.append("?");
        b10.append(" = 1 THEN (1) ELSE (((CASE WHEN ");
        b10.append("?");
        b10.append(" THEN (1) ELSE (CASE WHEN (");
        b10.append("?");
        b10.append(" IS NULL OR ");
        b10.append("?");
        b10.append(" = '') THEN category_id IS NULL ELSE (category_id = ");
        b10.append("?");
        b10.append(") END) END) AND (CASE WHEN (");
        b10.append("?");
        b10.append(" IS NULL OR ");
        b10.append("?");
        b10.append(" = '') THEN (1) ELSE (department_id = ");
        b10.append("?");
        b10.append(") END))) END) AND CASE WHEN ");
        b10.append("?");
        b10.append(" IS NULL THEN (1) ELSE (title LIKE '%' || ");
        b10.append("?");
        b10.append(" || '%') END ORDER BY modified_time DESC");
        int i10 = size + 10;
        androidx.room.A r10 = androidx.room.A.r(b10.toString(), i10);
        Iterator it = list.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            r10.P0(i11, (String) it.next());
            i11++;
        }
        r10.h1(size + 1, z11 ? 1L : 0L);
        r10.h1(size + 2, z10 ? 1L : 0L);
        int i12 = size + 3;
        if (str == null) {
            r10.C1(i12);
        } else {
            r10.P0(i12, str);
        }
        int i13 = size + 4;
        if (str == null) {
            r10.C1(i13);
        } else {
            r10.P0(i13, str);
        }
        int i14 = size + 5;
        if (str == null) {
            r10.C1(i14);
        } else {
            r10.P0(i14, str);
        }
        int i15 = size + 6;
        if (str2 == null) {
            r10.C1(i15);
        } else {
            r10.P0(i15, str2);
        }
        int i16 = size + 7;
        if (str2 == null) {
            r10.C1(i16);
        } else {
            r10.P0(i16, str2);
        }
        int i17 = size + 8;
        if (str2 == null) {
            r10.C1(i17);
        } else {
            r10.P0(i17, str2);
        }
        int i18 = size + 9;
        if (str3 == null) {
            r10.C1(i18);
        } else {
            r10.P0(i18, str3);
        }
        if (str3 == null) {
            r10.C1(i10);
        } else {
            r10.P0(i10, str3);
        }
        return AbstractC2268f.a(this.f45214a, false, new String[]{"articles"}, new o(r10));
    }

    @Override // df.InterfaceC4065a
    public Object m(final String str, final EnumC5132a enumC5132a, Continuation continuation) {
        return androidx.room.x.d(this.f45214a, new Function1() { // from class: df.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object m10;
                m10 = super/*df.a*/.m(str, enumC5132a, (Continuation) obj);
                return m10;
            }
        }, continuation);
    }

    @Override // df.InterfaceC4065a
    public InterfaceC5321f n(List list) {
        StringBuilder b10 = A2.e.b();
        b10.append("SELECT * FROM articles WHERE enabled = 1 AND (department_id in (");
        int size = list.size();
        A2.e.a(b10, size);
        b10.append(")) AND recently_viewed_time_from_search IS NOT NULL ORDER BY recently_viewed_time_from_search DESC LIMIT 5");
        androidx.room.A r10 = androidx.room.A.r(b10.toString(), size);
        Iterator it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            r10.P0(i10, (String) it.next());
            i10++;
        }
        return AbstractC2268f.a(this.f45214a, false, new String[]{"articles"}, new t(r10));
    }

    @Override // df.InterfaceC4065a
    public Object p(List list, Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new w(list), continuation);
    }

    @Override // df.InterfaceC4065a
    public Object q(List list, Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new v(list), continuation);
    }

    @Override // df.InterfaceC4065a
    public Object r(String str, String str2, Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new h(str2, str), continuation);
    }

    @Override // df.InterfaceC4065a
    public Object s(Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new l(), continuation);
    }

    @Override // df.InterfaceC4065a
    public Object t(ArticleEntity articleEntity, Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new e(articleEntity), continuation);
    }

    @Override // df.InterfaceC4065a
    public Object u(List list, Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new CallableC4071c(list), continuation);
    }

    @Override // df.InterfaceC4065a
    public Object v(String str, long j10, Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new k(j10, str), continuation);
    }

    @Override // df.InterfaceC4065a
    public List w(String str, String str2, boolean z10) {
        androidx.room.A r10 = androidx.room.A.r("SELECT id FROM article_categories WHERE (CASE WHEN (?) THEN (1) ELSE (CASE WHEN (? IS NULL OR ? = '') THEN parent_category_id IS NULL ELSE (parent_category_id = ?) END) END) AND (CASE WHEN (? IS NULL OR ? = '') THEN (1) ELSE (department_id = ?) END)", 7);
        r10.h1(1, z10 ? 1L : 0L);
        if (str2 == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str2);
        }
        if (str2 == null) {
            r10.C1(3);
        } else {
            r10.P0(3, str2);
        }
        if (str2 == null) {
            r10.C1(4);
        } else {
            r10.P0(4, str2);
        }
        if (str == null) {
            r10.C1(5);
        } else {
            r10.P0(5, str);
        }
        if (str == null) {
            r10.C1(6);
        } else {
            r10.P0(6, str);
        }
        if (str == null) {
            r10.C1(7);
        } else {
            r10.P0(7, str);
        }
        this.f45214a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f45214a, r10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(c10.getString(0));
            }
            return arrayList;
        } finally {
            c10.close();
            r10.U();
        }
    }

    @Override // df.InterfaceC4065a
    public InterfaceC5321f y(List list, String str, List list2) {
        StringBuilder b10 = A2.e.b();
        b10.append("SELECT * FROM articles WHERE enabled = 1 AND (department_id in (");
        int size = list2.size();
        A2.e.a(b10, size);
        b10.append(")) AND CASE WHEN ");
        b10.append("?");
        b10.append(" IS NULL OR ");
        b10.append("?");
        b10.append(" = '' THEN (0) ELSE (title LIKE '%' || ");
        b10.append("?");
        b10.append(" || '%') END AND id NOT IN (");
        int size2 = list.size();
        A2.e.a(b10, size2);
        b10.append(") ORDER BY modified_time DESC");
        int i10 = size + 3;
        androidx.room.A r10 = androidx.room.A.r(b10.toString(), size2 + i10);
        Iterator it = list2.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            r10.P0(i11, (String) it.next());
            i11++;
        }
        int i12 = size + 1;
        if (str == null) {
            r10.C1(i12);
        } else {
            r10.P0(i12, str);
        }
        int i13 = size + 2;
        if (str == null) {
            r10.C1(i13);
        } else {
            r10.P0(i13, str);
        }
        if (str == null) {
            r10.C1(i10);
        } else {
            r10.P0(i10, str);
        }
        int i14 = size + 4;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            r10.P0(i14, (String) it2.next());
            i14++;
        }
        return AbstractC2268f.a(this.f45214a, false, new String[]{"articles"}, new q(r10));
    }

    @Override // df.InterfaceC4065a
    public Object z(String str, String str2, Continuation continuation) {
        return AbstractC2268f.c(this.f45214a, true, new i(str2, str), continuation);
    }
}
