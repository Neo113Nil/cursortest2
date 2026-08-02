package com.vk.push.pushsdk.data;

import androidx.room.b;
import androidx.room.e;
import androidx.room.m;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.a5w0;
import xsna.b5w0;
import xsna.c5w0;
import xsna.fje0;
import xsna.g790;
import xsna.kje0;
import xsna.nxn0;
import xsna.ple0;
import xsna.qin0;
import xsna.sin0;
import xsna.ske0;
import xsna.t3j0;
import xsna.t790;
import xsna.tin0;
import xsna.urk;
import xsna.vr;
import xsna.z4w0;

/* loaded from: classes5.dex */
public final class VkpnsPushDatabase_Impl extends VkpnsPushDatabase {
    public volatile ple0 m;
    public volatile kje0 n;
    public volatile t790 o;

    @Override // com.vk.push.pushsdk.data.VkpnsPushDatabase
    public final ske0 A() {
        ple0 ple0Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new ple0(this);
                }
                ple0Var = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ple0Var;
    }

    @Override // androidx.room.RoomDatabase
    public final e e() {
        return new e(this, new HashMap(0), new HashMap(0), "push_token", "push_message", "package_info");
    }

    @Override // androidx.room.RoomDatabase
    public final tin0 g(b bVar) {
        return bVar.c.create(new tin0.b(bVar.a, bVar.b, new m(bVar, new a(), "b1e66599bcd97657c57420a5c345645c", "861f367f957c5a680b84eec5d45e47ed"), false, false));
    }

    @Override // androidx.room.RoomDatabase
    public final List h() {
        return Arrays.asList(new z4w0(2, 3), new a5w0(5, 6), new b5w0(6, 7), new c5w0(8, 9));
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<Object>> l() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map<Class<?>, List<Class<?>>> n() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(ske0.class, list);
        hashMap.put(fje0.class, list);
        hashMap.put(g790.class, list);
        return hashMap;
    }

    @Override // com.vk.push.pushsdk.data.VkpnsPushDatabase
    public final g790 y() {
        t790 t790Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new t790(this);
                }
                t790Var = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t790Var;
    }

    @Override // com.vk.push.pushsdk.data.VkpnsPushDatabase
    public final fje0 z() {
        kje0 kje0Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new kje0(this);
                }
                kje0Var = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kje0Var;
    }

    public class a extends m.a {
        public a() {
            super(9);
        }

        @Override // androidx.room.m.a
        public final void a(sin0 sin0Var) {
            vr.d(sin0Var, "CREATE TABLE IF NOT EXISTS `push_token` (`package_info_id` INTEGER NOT NULL, `token` TEXT NOT NULL, `project_id` TEXT NOT NULL, `created_time` INTEGER NOT NULL, `invalidate_time` INTEGER, `test_token` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`package_info_id`), FOREIGN KEY(`package_info_id`) REFERENCES `package_info`(`package_id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_push_token_package_info_id` ON `push_token` (`package_info_id`)", "CREATE INDEX IF NOT EXISTS `index_push_token_token` ON `push_token` (`token`)", "CREATE TABLE IF NOT EXISTS `push_message` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `token_package_id` INTEGER NOT NULL, `syn` INTEGER NOT NULL, `collapse_key` TEXT, `priority` TEXT NOT NULL, `ttl` INTEGER, `actual_ttl` INTEGER NOT NULL DEFAULT 0, `expiring_time` INTEGER, `from` TEXT NOT NULL DEFAULT '', `data` BLOB, `received_by_push_server_at` INTEGER NOT NULL, `delivery_attempts` INTEGER NOT NULL DEFAULT 0, `received_by` TEXT, `title` TEXT, `body` TEXT, `image` TEXT, `icon` TEXT, `color` TEXT, `channel_id` TEXT, `click_action` TEXT, `click_action_type` TEXT, FOREIGN KEY(`token_package_id`) REFERENCES `push_token`(`package_info_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            vr.d(sin0Var, "CREATE INDEX IF NOT EXISTS `index_push_message_token_package_id` ON `push_message` (`token_package_id`)", "CREATE TABLE IF NOT EXISTS `package_info` (`package_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `package_name` TEXT NOT NULL, `sha_hash` TEXT NOT NULL, `package_invalidate_time` INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_package_info_package_name` ON `package_info` (`package_name`)", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sin0Var.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b1e66599bcd97657c57420a5c345645c')");
        }

        @Override // androidx.room.m.a
        public final void b(sin0 sin0Var) {
            sin0Var.execSQL("DROP TABLE IF EXISTS `push_token`");
            sin0Var.execSQL("DROP TABLE IF EXISTS `push_message`");
            sin0Var.execSQL("DROP TABLE IF EXISTS `package_info`");
        }

        @Override // androidx.room.m.a
        public final void d(sin0 sin0Var) {
            VkpnsPushDatabase_Impl.this.a = sin0Var;
            sin0Var.execSQL("PRAGMA foreign_keys = ON");
            VkpnsPushDatabase_Impl.this.r(new qin0(sin0Var));
        }

        @Override // androidx.room.m.a
        public final void e(sin0 sin0Var) {
            urk.a(new qin0(sin0Var));
        }

        @Override // androidx.room.m.a
        public final m.b f(sin0 sin0Var) {
            HashMap hashMap = new HashMap(6);
            hashMap.put("package_info_id", new nxn0.a(1, "package_info_id", "INTEGER", null, true, 1));
            hashMap.put("token", new nxn0.a(0, "token", "TEXT", null, true, 1));
            hashMap.put("project_id", new nxn0.a(0, "project_id", "TEXT", null, true, 1));
            hashMap.put("created_time", new nxn0.a(0, "created_time", "INTEGER", null, true, 1));
            hashMap.put("invalidate_time", new nxn0.a(0, "invalidate_time", "INTEGER", null, false, 1));
            hashMap.put("test_token", new nxn0.a(0, "test_token", "INTEGER", "0", true, 1));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new nxn0.c("package_info", "CASCADE", "NO ACTION", Arrays.asList("package_info_id"), Arrays.asList("package_id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new nxn0.d("index_push_token_package_info_id", Arrays.asList("package_info_id"), Arrays.asList("ASC"), false));
            hashSet2.add(new nxn0.d("index_push_token_token", Arrays.asList("token"), Arrays.asList("ASC"), false));
            nxn0 nxn0Var = new nxn0("push_token", hashMap, hashSet, hashSet2);
            nxn0 a = nxn0.a(sin0Var, "push_token");
            if (!nxn0Var.equals(a)) {
                return new m.b(false, t3j0.a("push_token(com.vk.push.pushsdk.data.entity.PushToken).\n Expected:\n", nxn0Var, "\n Found:\n", a));
            }
            HashMap hashMap2 = new HashMap(21);
            hashMap2.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
            hashMap2.put("token_package_id", new nxn0.a(0, "token_package_id", "INTEGER", null, true, 1));
            hashMap2.put("syn", new nxn0.a(0, "syn", "INTEGER", null, true, 1));
            hashMap2.put("collapse_key", new nxn0.a(0, "collapse_key", "TEXT", null, false, 1));
            hashMap2.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, new nxn0.a(0, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "TEXT", null, true, 1));
            hashMap2.put("ttl", new nxn0.a(0, "ttl", "INTEGER", null, false, 1));
            hashMap2.put("actual_ttl", new nxn0.a(0, "actual_ttl", "INTEGER", "0", true, 1));
            hashMap2.put("expiring_time", new nxn0.a(0, "expiring_time", "INTEGER", null, false, 1));
            hashMap2.put("from", new nxn0.a(0, "from", "TEXT", "''", true, 1));
            hashMap2.put("data", new nxn0.a(0, "data", "BLOB", null, false, 1));
            hashMap2.put("received_by_push_server_at", new nxn0.a(0, "received_by_push_server_at", "INTEGER", null, true, 1));
            hashMap2.put("delivery_attempts", new nxn0.a(0, "delivery_attempts", "INTEGER", "0", true, 1));
            hashMap2.put("received_by", new nxn0.a(0, "received_by", "TEXT", null, false, 1));
            hashMap2.put("title", new nxn0.a(0, "title", "TEXT", null, false, 1));
            hashMap2.put("body", new nxn0.a(0, "body", "TEXT", null, false, 1));
            hashMap2.put("image", new nxn0.a(0, "image", "TEXT", null, false, 1));
            hashMap2.put("icon", new nxn0.a(0, "icon", "TEXT", null, false, 1));
            hashMap2.put("color", new nxn0.a(0, "color", "TEXT", null, false, 1));
            hashMap2.put("channel_id", new nxn0.a(0, "channel_id", "TEXT", null, false, 1));
            hashMap2.put("click_action", new nxn0.a(0, "click_action", "TEXT", null, false, 1));
            hashMap2.put("click_action_type", new nxn0.a(0, "click_action_type", "TEXT", null, false, 1));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new nxn0.c("push_token", "CASCADE", "NO ACTION", Arrays.asList("token_package_id"), Arrays.asList("package_info_id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new nxn0.d("index_push_message_token_package_id", Arrays.asList("token_package_id"), Arrays.asList("ASC"), false));
            nxn0 nxn0Var2 = new nxn0("push_message", hashMap2, hashSet3, hashSet4);
            nxn0 a2 = nxn0.a(sin0Var, "push_message");
            if (!nxn0Var2.equals(a2)) {
                return new m.b(false, t3j0.a("push_message(com.vk.push.pushsdk.data.entity.PushMessage).\n Expected:\n", nxn0Var2, "\n Found:\n", a2));
            }
            HashMap hashMap3 = new HashMap(4);
            hashMap3.put("package_id", new nxn0.a(1, "package_id", "INTEGER", null, true, 1));
            hashMap3.put("package_name", new nxn0.a(0, "package_name", "TEXT", null, true, 1));
            hashMap3.put("sha_hash", new nxn0.a(0, "sha_hash", "TEXT", null, true, 1));
            hashMap3.put("package_invalidate_time", new nxn0.a(0, "package_invalidate_time", "INTEGER", null, false, 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new nxn0.d("index_package_info_package_name", Arrays.asList("package_name"), Arrays.asList("ASC"), true));
            nxn0 nxn0Var3 = new nxn0("package_info", hashMap3, hashSet5, hashSet6);
            nxn0 a3 = nxn0.a(sin0Var, "package_info");
            return !nxn0Var3.equals(a3) ? new m.b(false, t3j0.a("package_info(com.vk.push.pushsdk.data.entity.PackageInfo).\n Expected:\n", nxn0Var3, "\n Found:\n", a3)) : new m.b(true, null);
        }

        @Override // androidx.room.m.a
        public final void c() {
        }
    }
}
