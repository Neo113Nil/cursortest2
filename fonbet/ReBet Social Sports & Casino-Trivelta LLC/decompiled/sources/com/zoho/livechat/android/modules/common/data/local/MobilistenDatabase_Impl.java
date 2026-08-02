package com.zoho.livechat.android.modules.common.data.local;

import A2.f;
import E2.g;
import E2.h;
import Hd.b;
import androidx.room.C2270h;
import androidx.room.q;
import androidx.room.w;
import androidx.room.z;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import df.InterfaceC4065a;
import df.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rf.InterfaceC6253a;

/* loaded from: classes4.dex */
public final class MobilistenDatabase_Impl extends MobilistenDatabase {

    /* renamed from: d, reason: collision with root package name */
    public volatile InterfaceC6253a f42597d;

    /* renamed from: e, reason: collision with root package name */
    public volatile InterfaceC4065a f42598e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Hd.a f42599f;

    @Override // androidx.room.w
    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.z("DELETE FROM `messages`");
            writableDatabase.z("DELETE FROM `article_categories`");
            writableDatabase.z("DELETE FROM `articles`");
            writableDatabase.z("DELETE FROM `forms`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.p1("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.F1()) {
                writableDatabase.z("VACUUM");
            }
        }
    }

    @Override // androidx.room.w
    public q createInvalidationTracker() {
        return new q(this, new HashMap(0), new HashMap(0), "messages", "article_categories", "articles", "forms");
    }

    @Override // androidx.room.w
    public h createOpenHelper(C2270h c2270h) {
        return c2270h.f23359c.a(h.b.a(c2270h.f23357a).d(c2270h.f23358b).c(new z(c2270h, new a(6), "75d708d35d831c19fb082ff63bcd713d", "93f3af7dc98154875c875525e1b12b2e")).b());
    }

    @Override // com.zoho.livechat.android.modules.common.data.local.MobilistenDatabase
    public InterfaceC4065a g() {
        InterfaceC4065a interfaceC4065a;
        if (this.f42598e != null) {
            return this.f42598e;
        }
        synchronized (this) {
            try {
                if (this.f42598e == null) {
                    this.f42598e = new f(this);
                }
                interfaceC4065a = this.f42598e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC4065a;
    }

    @Override // androidx.room.w
    public List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    @Override // androidx.room.w
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.w
    public Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC6253a.class, rf.h.L0());
        hashMap.put(InterfaceC4065a.class, f.T());
        hashMap.put(Hd.a.class, b.e());
        return hashMap;
    }

    @Override // com.zoho.livechat.android.modules.common.data.local.MobilistenDatabase
    public Hd.a h() {
        Hd.a aVar;
        if (this.f42599f != null) {
            return this.f42599f;
        }
        synchronized (this) {
            try {
                if (this.f42599f == null) {
                    this.f42599f = new b(this);
                }
                aVar = this.f42599f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.zoho.livechat.android.modules.common.data.local.MobilistenDatabase
    public InterfaceC6253a i() {
        InterfaceC6253a interfaceC6253a;
        if (this.f42597d != null) {
            return this.f42597d;
        }
        synchronized (this) {
            try {
                if (this.f42597d == null) {
                    this.f42597d = new rf.h(this);
                }
                interfaceC6253a = this.f42597d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC6253a;
    }

    public class a extends z.b {
        public a(int i10) {
            super(i10);
        }

        @Override // androidx.room.z.b
        public void createAllTables(g gVar) {
            gVar.z("CREATE TABLE IF NOT EXISTS `messages` (`acknowledgement_key` TEXT, `conversation_id` TEXT, `chat_id` TEXT NOT NULL, `r_chat_id` TEXT, `sequence_id` INTEGER, `message_type` TEXT, `status` INTEGER, `message_id` TEXT NOT NULL, `message_uid` TEXT NOT NULL, `message` TEXT, `formatted_message` TEXT, `markdowns` TEXT, `sender` TEXT, `display_name` TEXT, `attachment` TEXT, `meta` TEXT, `responded_message` TEXT, `is_bot` INTEGER NOT NULL, `read_status` INTEGER, `is_typing` INTEGER, `is_edited` INTEGER, `is_deleted` INTEGER, `reply_to` TEXT, `time_difference_content` TEXT, `is_right_aligned` INTEGER NOT NULL, `extras` TEXT, `server_time` INTEGER NOT NULL, `client_time` INTEGER NOT NULL, `previous_message_time` INTEGER NOT NULL, `edited_time` INTEGER NOT NULL, `deleted_time` INTEGER NOT NULL, `formatted_client_time` TEXT, PRIMARY KEY(`message_id`))");
            gVar.z("CREATE UNIQUE INDEX IF NOT EXISTS `index_messages_chat_id_message_id` ON `messages` (`chat_id`, `message_id`)");
            gVar.z("CREATE TABLE IF NOT EXISTS `article_categories` (`id` TEXT NOT NULL, `name` TEXT, `articles_count` INTEGER NOT NULL, `articles_modified_time` INTEGER, `children_count` INTEGER NOT NULL, `department_id` TEXT, `enabled` INTEGER NOT NULL, `order` INTEGER NOT NULL, `parent_category_id` TEXT, PRIMARY KEY(`id`))");
            gVar.z("CREATE TABLE IF NOT EXISTS `articles` (`id` TEXT NOT NULL, `category_id` TEXT, `category_name` TEXT, `title` TEXT, `titles` TEXT, `type` TEXT, `enabled` INTEGER, `channels` TEXT, `creator` TEXT, `modifier` TEXT, `department_id` TEXT, `language` TEXT, `created_time` INTEGER, `modified_time` INTEGER, `public_url` TEXT, `published_title` TEXT, `stats` TEXT, `content` TEXT, `rated_type` TEXT, `last_viewed_time` INTEGER, `recently_viewed_time_from_search` INTEGER, `local_meta_article_local_file_path` TEXT, PRIMARY KEY(`id`))");
            gVar.z("CREATE UNIQUE INDEX IF NOT EXISTS `index_articles_category_id_id` ON `articles` (`category_id`, `id`)");
            gVar.z("CREATE TABLE IF NOT EXISTS `forms` (`brand_status_type` TEXT NOT NULL, `display_name` TEXT, `fields_pre_fill_type` TEXT, `form_type` TEXT, `messages` TEXT, `title` TEXT, PRIMARY KEY(`brand_status_type`))");
            gVar.z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.z("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '75d708d35d831c19fb082ff63bcd713d')");
        }

        @Override // androidx.room.z.b
        public void dropAllTables(g gVar) {
            gVar.z("DROP TABLE IF EXISTS `messages`");
            gVar.z("DROP TABLE IF EXISTS `article_categories`");
            gVar.z("DROP TABLE IF EXISTS `articles`");
            gVar.z("DROP TABLE IF EXISTS `forms`");
            List list = ((w) MobilistenDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((w.b) it.next()).b(gVar);
                }
            }
        }

        @Override // androidx.room.z.b
        public void onCreate(g gVar) {
            List list = ((w) MobilistenDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((w.b) it.next()).a(gVar);
                }
            }
        }

        @Override // androidx.room.z.b
        public void onOpen(g gVar) {
            ((w) MobilistenDatabase_Impl.this).mDatabase = gVar;
            MobilistenDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List list = ((w) MobilistenDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((w.b) it.next()).c(gVar);
                }
            }
        }

        @Override // androidx.room.z.b
        public void onPreMigrate(g gVar) {
            A2.b.b(gVar);
        }

        @Override // androidx.room.z.b
        public z.c onValidateSchema(g gVar) {
            HashMap hashMap = new HashMap(32);
            hashMap.put("acknowledgement_key", new f.a("acknowledgement_key", "TEXT", false, 0, null, 1));
            hashMap.put("conversation_id", new f.a("conversation_id", "TEXT", false, 0, null, 1));
            hashMap.put("chat_id", new f.a("chat_id", "TEXT", true, 0, null, 1));
            hashMap.put("r_chat_id", new f.a("r_chat_id", "TEXT", false, 0, null, 1));
            hashMap.put("sequence_id", new f.a("sequence_id", "INTEGER", false, 0, null, 1));
            hashMap.put("message_type", new f.a("message_type", "TEXT", false, 0, null, 1));
            hashMap.put("status", new f.a("status", "INTEGER", false, 0, null, 1));
            hashMap.put("message_id", new f.a("message_id", "TEXT", true, 1, null, 1));
            hashMap.put("message_uid", new f.a("message_uid", "TEXT", true, 0, null, 1));
            hashMap.put("message", new f.a("message", "TEXT", false, 0, null, 1));
            hashMap.put("formatted_message", new f.a("formatted_message", "TEXT", false, 0, null, 1));
            hashMap.put("markdowns", new f.a("markdowns", "TEXT", false, 0, null, 1));
            hashMap.put("sender", new f.a("sender", "TEXT", false, 0, null, 1));
            hashMap.put("display_name", new f.a("display_name", "TEXT", false, 0, null, 1));
            hashMap.put("attachment", new f.a("attachment", "TEXT", false, 0, null, 1));
            hashMap.put("meta", new f.a("meta", "TEXT", false, 0, null, 1));
            hashMap.put("responded_message", new f.a("responded_message", "TEXT", false, 0, null, 1));
            hashMap.put("is_bot", new f.a("is_bot", "INTEGER", true, 0, null, 1));
            hashMap.put("read_status", new f.a("read_status", "INTEGER", false, 0, null, 1));
            hashMap.put("is_typing", new f.a("is_typing", "INTEGER", false, 0, null, 1));
            hashMap.put("is_edited", new f.a("is_edited", "INTEGER", false, 0, null, 1));
            hashMap.put("is_deleted", new f.a("is_deleted", "INTEGER", false, 0, null, 1));
            hashMap.put("reply_to", new f.a("reply_to", "TEXT", false, 0, null, 1));
            hashMap.put("time_difference_content", new f.a("time_difference_content", "TEXT", false, 0, null, 1));
            hashMap.put("is_right_aligned", new f.a("is_right_aligned", "INTEGER", true, 0, null, 1));
            hashMap.put("extras", new f.a("extras", "TEXT", false, 0, null, 1));
            hashMap.put("server_time", new f.a("server_time", "INTEGER", true, 0, null, 1));
            hashMap.put("client_time", new f.a("client_time", "INTEGER", true, 0, null, 1));
            hashMap.put("previous_message_time", new f.a("previous_message_time", "INTEGER", true, 0, null, 1));
            hashMap.put("edited_time", new f.a("edited_time", "INTEGER", true, 0, null, 1));
            hashMap.put("deleted_time", new f.a("deleted_time", "INTEGER", true, 0, null, 1));
            hashMap.put("formatted_client_time", new f.a("formatted_client_time", "TEXT", false, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new f.e("index_messages_chat_id_message_id", true, Arrays.asList("chat_id", "message_id"), Arrays.asList("ASC", "ASC")));
            A2.f fVar = new A2.f("messages", hashMap, hashSet, hashSet2);
            A2.f a10 = A2.f.a(gVar, "messages");
            if (!fVar.equals(a10)) {
                return new z.c(false, "messages(com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity).\n Expected:\n" + fVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(9);
            hashMap2.put(StackTraceHelper.ID_KEY, new f.a(StackTraceHelper.ID_KEY, "TEXT", true, 1, null, 1));
            hashMap2.put("name", new f.a("name", "TEXT", false, 0, null, 1));
            hashMap2.put("articles_count", new f.a("articles_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("articles_modified_time", new f.a("articles_modified_time", "INTEGER", false, 0, null, 1));
            hashMap2.put("children_count", new f.a("children_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("department_id", new f.a("department_id", "TEXT", false, 0, null, 1));
            hashMap2.put(ViewProps.ENABLED, new f.a(ViewProps.ENABLED, "INTEGER", true, 0, null, 1));
            hashMap2.put("order", new f.a("order", "INTEGER", true, 0, null, 1));
            hashMap2.put("parent_category_id", new f.a("parent_category_id", "TEXT", false, 0, null, 1));
            A2.f fVar2 = new A2.f("article_categories", hashMap2, new HashSet(0), new HashSet(0));
            A2.f a11 = A2.f.a(gVar, "article_categories");
            if (!fVar2.equals(a11)) {
                return new z.c(false, "article_categories(com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleCategoryEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(22);
            hashMap3.put(StackTraceHelper.ID_KEY, new f.a(StackTraceHelper.ID_KEY, "TEXT", true, 1, null, 1));
            hashMap3.put("category_id", new f.a("category_id", "TEXT", false, 0, null, 1));
            hashMap3.put("category_name", new f.a("category_name", "TEXT", false, 0, null, 1));
            hashMap3.put("title", new f.a("title", "TEXT", false, 0, null, 1));
            hashMap3.put("titles", new f.a("titles", "TEXT", false, 0, null, 1));
            hashMap3.put("type", new f.a("type", "TEXT", false, 0, null, 1));
            hashMap3.put(ViewProps.ENABLED, new f.a(ViewProps.ENABLED, "INTEGER", false, 0, null, 1));
            hashMap3.put("channels", new f.a("channels", "TEXT", false, 0, null, 1));
            hashMap3.put("creator", new f.a("creator", "TEXT", false, 0, null, 1));
            hashMap3.put("modifier", new f.a("modifier", "TEXT", false, 0, null, 1));
            hashMap3.put("department_id", new f.a("department_id", "TEXT", false, 0, null, 1));
            hashMap3.put("language", new f.a("language", "TEXT", false, 0, null, 1));
            hashMap3.put("created_time", new f.a("created_time", "INTEGER", false, 0, null, 1));
            hashMap3.put("modified_time", new f.a("modified_time", "INTEGER", false, 0, null, 1));
            hashMap3.put("public_url", new f.a("public_url", "TEXT", false, 0, null, 1));
            hashMap3.put("published_title", new f.a("published_title", "TEXT", false, 0, null, 1));
            hashMap3.put("stats", new f.a("stats", "TEXT", false, 0, null, 1));
            hashMap3.put("content", new f.a("content", "TEXT", false, 0, null, 1));
            hashMap3.put("rated_type", new f.a("rated_type", "TEXT", false, 0, null, 1));
            hashMap3.put("last_viewed_time", new f.a("last_viewed_time", "INTEGER", false, 0, null, 1));
            hashMap3.put("recently_viewed_time_from_search", new f.a("recently_viewed_time_from_search", "INTEGER", false, 0, null, 1));
            hashMap3.put("local_meta_article_local_file_path", new f.a("local_meta_article_local_file_path", "TEXT", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new f.e("index_articles_category_id_id", true, Arrays.asList("category_id", StackTraceHelper.ID_KEY), Arrays.asList("ASC", "ASC")));
            A2.f fVar3 = new A2.f("articles", hashMap3, hashSet3, hashSet4);
            A2.f a12 = A2.f.a(gVar, "articles");
            if (!fVar3.equals(a12)) {
                return new z.c(false, "articles(com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(6);
            hashMap4.put("brand_status_type", new f.a("brand_status_type", "TEXT", true, 1, null, 1));
            hashMap4.put("display_name", new f.a("display_name", "TEXT", false, 0, null, 1));
            hashMap4.put("fields_pre_fill_type", new f.a("fields_pre_fill_type", "TEXT", false, 0, null, 1));
            hashMap4.put("form_type", new f.a("form_type", "TEXT", false, 0, null, 1));
            hashMap4.put("messages", new f.a("messages", "TEXT", false, 0, null, 1));
            hashMap4.put("title", new f.a("title", "TEXT", false, 0, null, 1));
            A2.f fVar4 = new A2.f("forms", hashMap4, new HashSet(0), new HashSet(0));
            A2.f a13 = A2.f.a(gVar, "forms");
            if (fVar4.equals(a13)) {
                return new z.c(true, null);
            }
            return new z.c(false, "forms(com.zoho.livechat.android.modules.brand.data.local.entities.FormEntity).\n Expected:\n" + fVar4 + "\n Found:\n" + a13);
        }

        @Override // androidx.room.z.b
        public void onPostMigrate(g gVar) {
        }
    }
}
