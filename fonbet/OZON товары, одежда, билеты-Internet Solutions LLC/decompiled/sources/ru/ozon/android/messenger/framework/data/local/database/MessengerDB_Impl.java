package ru.ozon.android.messenger.framework.data.local.database;

import B90.C2616s;
import J4.h;
import J4.p;
import J4.s;
import J4.v;
import L4.e;
import O4.c;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.local.database.draft.i;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.e;

/* loaded from: classes6.dex */
public final class MessengerDB_Impl extends MessengerDB {

    /* renamed from: b, reason: collision with root package name */
    private volatile i f87463b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f87464c;

    final class a extends v.a {
        a() {
            super(3);
        }

        @Override // J4.v.a
        public final void createAllTables(@NonNull O4.b bVar) {
            Sh.b.d(bVar, "CREATE TABLE IF NOT EXISTS `chats` (`chat_id` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))", "CREATE TABLE IF NOT EXISTS `draft_texts` (`chat_id` TEXT NOT NULL, `text` TEXT NOT NULL, PRIMARY KEY(`chat_id`), FOREIGN KEY(`chat_id`) REFERENCES `chats`(`chat_id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `draft_attachments` (`id` TEXT NOT NULL, `chat_id` TEXT NOT NULL, `type` INTEGER NOT NULL, `local_url` TEXT NOT NULL, `remote_url` TEXT, `media_type` TEXT, `image_width` INTEGER, `image_height` INTEGER, `file_name` TEXT, `file_size` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`chat_id`) REFERENCES `chats`(`chat_id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `draft_custom_blocks` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chat_id` TEXT NOT NULL, `custom_block` TEXT NOT NULL, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`chat_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            Sh.b.d(bVar, "CREATE INDEX IF NOT EXISTS `index_draft_custom_blocks_chat_id` ON `draft_custom_blocks` (`chat_id`)", "CREATE TABLE IF NOT EXISTS `undelivered_messages` (`local_id` TEXT NOT NULL, `chat_id` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, `undelivered_message` TEXT NOT NULL, PRIMARY KEY(`local_id`))", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7ab7e75d27b1f4daf806915cd1d42b2d')");
        }

        @Override // J4.v.a
        public final void dropAllTables(@NonNull O4.b db2) {
            Sh.b.d(db2, "DROP TABLE IF EXISTS `chats`", "DROP TABLE IF EXISTS `draft_texts`", "DROP TABLE IF EXISTS `draft_attachments`", "DROP TABLE IF EXISTS `draft_custom_blocks`");
            db2.O0("DROP TABLE IF EXISTS `undelivered_messages`");
            List list = ((s) MessengerDB_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).getClass();
                    Intrinsics.checkNotNullParameter(db2, "db");
                }
            }
        }

        @Override // J4.v.a
        public final void onCreate(@NonNull O4.b bVar) {
            List list = ((s) MessengerDB_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).a(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onOpen(@NonNull O4.b bVar) {
            MessengerDB_Impl messengerDB_Impl = MessengerDB_Impl.this;
            ((s) messengerDB_Impl).mDatabase = bVar;
            bVar.O0("PRAGMA foreign_keys = ON");
            messengerDB_Impl.internalInitInvalidationTracker(bVar);
            List list = ((s) messengerDB_Impl).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).b(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onPostMigrate(@NonNull O4.b bVar) {
        }

        @Override // J4.v.a
        public final void onPreMigrate(@NonNull O4.b bVar) {
            L4.b.a(bVar);
        }

        @Override // J4.v.a
        @NonNull
        public final v.b onValidateSchema(@NonNull O4.b bVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("chat_id", new e.a("chat_id", "TEXT", 1, 1, true, null));
            L4.e eVar = new L4.e("chats", hashMap, H3.c.b(hashMap, "updated_at", new e.a("updated_at", "INTEGER", 0, 1, true, null), 0), new HashSet(0));
            L4.e a11 = L4.e.a(bVar, "chats");
            if (!eVar.equals(a11)) {
                return new v.b(false, C2616s.c("chats(ru.ozon.android.messenger.framework.data.local.database.draft.entity.DraftMessageChatEntity).\n Expected:\n", eVar, "\n Found:\n", a11));
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("chat_id", new e.a("chat_id", "TEXT", 1, 1, true, null));
            HashSet b11 = H3.c.b(hashMap2, "text", new e.a("text", "TEXT", 0, 1, true, null), 1);
            b11.add(new e.b("chats", Arrays.asList("chat_id"), "CASCADE", "NO ACTION", Arrays.asList("chat_id")));
            L4.e eVar2 = new L4.e("draft_texts", hashMap2, b11, new HashSet(0));
            L4.e a12 = L4.e.a(bVar, "draft_texts");
            if (!eVar2.equals(a12)) {
                return new v.b(false, C2616s.c("draft_texts(ru.ozon.android.messenger.framework.data.local.database.draft.entity.DraftTextEntity).\n Expected:\n", eVar2, "\n Found:\n", a12));
            }
            HashMap hashMap3 = new HashMap(10);
            hashMap3.put("id", new e.a("id", "TEXT", 1, 1, true, null));
            hashMap3.put("chat_id", new e.a("chat_id", "TEXT", 0, 1, true, null));
            hashMap3.put("type", new e.a("type", "INTEGER", 0, 1, true, null));
            hashMap3.put("local_url", new e.a("local_url", "TEXT", 0, 1, true, null));
            hashMap3.put("remote_url", new e.a("remote_url", "TEXT", 0, 1, false, null));
            hashMap3.put("media_type", new e.a("media_type", "TEXT", 0, 1, false, null));
            hashMap3.put("image_width", new e.a("image_width", "INTEGER", 0, 1, false, null));
            hashMap3.put("image_height", new e.a("image_height", "INTEGER", 0, 1, false, null));
            hashMap3.put("file_name", new e.a("file_name", "TEXT", 0, 1, false, null));
            HashSet b12 = H3.c.b(hashMap3, "file_size", new e.a("file_size", "TEXT", 0, 1, false, null), 1);
            b12.add(new e.b("chats", Arrays.asList("chat_id"), "CASCADE", "NO ACTION", Arrays.asList("chat_id")));
            L4.e eVar3 = new L4.e("draft_attachments", hashMap3, b12, new HashSet(0));
            L4.e a13 = L4.e.a(bVar, "draft_attachments");
            if (!eVar3.equals(a13)) {
                return new v.b(false, C2616s.c("draft_attachments(ru.ozon.android.messenger.framework.data.local.database.draft.entity.DraftAttachmentEntity).\n Expected:\n", eVar3, "\n Found:\n", a13));
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("id", new e.a("id", "INTEGER", 1, 1, true, null));
            hashMap4.put("chat_id", new e.a("chat_id", "TEXT", 0, 1, true, null));
            HashSet b13 = H3.c.b(hashMap4, "custom_block", new e.a("custom_block", "TEXT", 0, 1, true, null), 1);
            b13.add(new e.b("chats", Arrays.asList("chat_id"), "CASCADE", "NO ACTION", Arrays.asList("chat_id")));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new e.d(Arrays.asList("chat_id"), false, "index_draft_custom_blocks_chat_id", Arrays.asList("ASC")));
            L4.e eVar4 = new L4.e("draft_custom_blocks", hashMap4, b13, hashSet);
            L4.e a14 = L4.e.a(bVar, "draft_custom_blocks");
            if (!eVar4.equals(a14)) {
                return new v.b(false, C2616s.c("draft_custom_blocks(ru.ozon.android.messenger.framework.data.local.database.draft.entity.DraftCustomBlockEntity).\n Expected:\n", eVar4, "\n Found:\n", a14));
            }
            HashMap hashMap5 = new HashMap(4);
            hashMap5.put("local_id", new e.a("local_id", "TEXT", 1, 1, true, null));
            hashMap5.put("chat_id", new e.a("chat_id", "TEXT", 0, 1, true, null));
            hashMap5.put("updated_at", new e.a("updated_at", "INTEGER", 0, 1, true, null));
            L4.e eVar5 = new L4.e("undelivered_messages", hashMap5, H3.c.b(hashMap5, "undelivered_message", new e.a("undelivered_message", "TEXT", 0, 1, true, null), 0), new HashSet(0));
            L4.e a15 = L4.e.a(bVar, "undelivered_messages");
            return !eVar5.equals(a15) ? new v.b(false, C2616s.c("undelivered_messages(ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity).\n Expected:\n", eVar5, "\n Found:\n", a15)) : new v.b(true, null);
        }
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.MessengerDB
    public final ru.ozon.android.messenger.framework.data.local.database.draft.b a() {
        i iVar;
        if (this.f87463b != null) {
            return this.f87463b;
        }
        synchronized (this) {
            try {
                if (this.f87463b == null) {
                    this.f87463b = new i(this);
                }
                iVar = this.f87463b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.MessengerDB
    public final ru.ozon.android.messenger.framework.data.local.database.undelivered.a b() {
        ru.ozon.android.messenger.framework.data.local.database.undelivered.e eVar;
        if (this.f87464c != null) {
            return this.f87464c;
        }
        synchronized (this) {
            try {
                if (this.f87464c == null) {
                    this.f87464c = new ru.ozon.android.messenger.framework.data.local.database.undelivered.e(this);
                }
                eVar = this.f87464c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // J4.s
    public final void clearAllTables() {
        super.assertNotMainThread();
        O4.b writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.O0("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.O0("DELETE FROM `chats`");
            writableDatabase.O0("DELETE FROM `draft_texts`");
            writableDatabase.O0("DELETE FROM `draft_attachments`");
            writableDatabase.O0("DELETE FROM `draft_custom_blocks`");
            writableDatabase.O0("DELETE FROM `undelivered_messages`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.N1("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.T1()) {
                writableDatabase.O0("VACUUM");
            }
        }
    }

    @Override // J4.s
    @NonNull
    protected final p createInvalidationTracker() {
        return new p(this, new HashMap(0), new HashMap(0), "chats", "draft_texts", "draft_attachments", "draft_custom_blocks", "undelivered_messages");
    }

    @Override // J4.s
    @NonNull
    protected final O4.c createOpenHelper(@NonNull h hVar) {
        v vVar = new v(hVar, new a(), "7ab7e75d27b1f4daf806915cd1d42b2d", "eabdf51661fbd47b4989cb397f00879b");
        Context context = hVar.f13876a;
        Intrinsics.checkNotNullParameter(context, "context");
        c.b.a aVar = new c.b.a(context);
        aVar.d(hVar.f13877b);
        aVar.c(vVar);
        return hVar.f13878c.a(aVar.b());
    }

    @Override // J4.s
    @NonNull
    public final List<K4.a> getAutoMigrations(@NonNull Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // J4.s
    @NonNull
    public final Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // J4.s
    @NonNull
    protected final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(ru.ozon.android.messenger.framework.data.local.database.draft.b.class, list);
        hashMap.put(ru.ozon.android.messenger.framework.data.local.database.undelivered.a.class, list);
        return hashMap;
    }
}
