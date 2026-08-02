package com.zoho.livechat.android.modules.common.data.local;

import E2.g;
import androidx.room.w;
import com.google.android.material.shape.i;
import df.InterfaceC4065a;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rf.InterfaceC6253a;
import z2.AbstractC6912b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/zoho/livechat/android/modules/common/data/local/MobilistenDatabase;", "Landroidx/room/w;", "<init>", "()V", "Lrf/a;", i.f35755A, "()Lrf/a;", "Ldf/a;", "g", "()Ldf/a;", "LHd/a;", C4527h.f48087o, "()LHd/a;", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MobilistenDatabase extends w {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42591a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final AbstractC6912b f42592b = new C0611a();

        /* renamed from: c, reason: collision with root package name */
        public static final AbstractC6912b f42593c = new b();

        /* renamed from: d, reason: collision with root package name */
        public static final AbstractC6912b f42594d = new c();

        /* renamed from: e, reason: collision with root package name */
        public static final AbstractC6912b f42595e = new d();

        /* renamed from: f, reason: collision with root package name */
        public static final AbstractC6912b f42596f = new e();

        /* renamed from: com.zoho.livechat.android.modules.common.data.local.MobilistenDatabase$a$a, reason: collision with other inner class name */
        public static final class C0611a extends AbstractC6912b {
            public C0611a() {
                super(1, 2);
            }

            @Override // z2.AbstractC6912b
            public void a(g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.z("DELETE FROM messages");
            }
        }

        public static final class b extends AbstractC6912b {
            public b() {
                super(2, 3);
            }

            @Override // z2.AbstractC6912b
            public void a(g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.z("CREATE TABLE IF NOT EXISTS `article_categories` (`id` TEXT NOT NULL, `name` TEXT, `articles_count` INTEGER NOT NULL, `articles_modified_time` INTEGER, `children_count` INTEGER NOT NULL, `department_id` TEXT, `enabled` INTEGER NOT NULL, `order` INTEGER NOT NULL, `parent_category_id` TEXT, PRIMARY KEY(`id`))");
                db2.z("CREATE TABLE IF NOT EXISTS `articles` (`id` TEXT NOT NULL, `category_id` TEXT, `category_name` TEXT, `title` TEXT, `titles` TEXT, `type` TEXT, `enabled` INTEGER, `channels` TEXT, `creator` TEXT, `modifier` TEXT, `department_id` TEXT, `language` TEXT, `created_time` INTEGER, `modified_time` INTEGER, `public_url` TEXT, `published_title` TEXT, `stats` TEXT, `content` TEXT, `rated_type` TEXT, `last_viewed_time` INTEGER, `recently_viewed_time_from_search` INTEGER, PRIMARY KEY(`id`))");
                db2.z("CREATE UNIQUE INDEX IF NOT EXISTS `index_articles_category_id_id` ON `articles` (`category_id`, `id`)");
                db2.z("DELETE FROM `messages`");
            }
        }

        public static final class c extends AbstractC6912b {
            public c() {
                super(3, 4);
            }

            @Override // z2.AbstractC6912b
            public void a(g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.z("DROP TABLE IF EXISTS `messages`");
                db2.z("CREATE TABLE IF NOT EXISTS `messages` (`acknowledgement_key` TEXT, `conversation_id` TEXT, `chat_id` TEXT NOT NULL, `r_chat_id` TEXT, `sequence_id` INTEGER, `message_type` TEXT, `status` INTEGER, `message_id` TEXT NOT NULL, `message_uid` TEXT NOT NULL, `message` TEXT, `formatted_message` TEXT, `markdowns` TEXT, `sender` TEXT, `display_name` TEXT, `attachment` TEXT, `meta` TEXT, `responded_message` TEXT, `is_bot` INTEGER NOT NULL, `read_status` INTEGER, `is_typing` INTEGER, `is_edited` INTEGER, `is_deleted` INTEGER, `reply_to` TEXT, `time_difference_content` TEXT, `is_right_aligned` INTEGER NOT NULL, `extras` TEXT, `server_time` INTEGER NOT NULL, `client_time` INTEGER NOT NULL, `previous_message_time` INTEGER NOT NULL, `edited_time` INTEGER NOT NULL, `deleted_time` INTEGER NOT NULL, `formatted_client_time` TEXT, PRIMARY KEY(`message_id`))");
                db2.z("CREATE UNIQUE INDEX IF NOT EXISTS `index_messages_chat_id_message_id` ON `messages` (`chat_id`, `message_id`)");
            }
        }

        public static final class d extends AbstractC6912b {
            public d() {
                super(4, 5);
            }

            @Override // z2.AbstractC6912b
            public void a(g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.z("CREATE TABLE IF NOT EXISTS `forms` (`brand_status_type` TEXT NOT NULL, `display_name` TEXT, `fields_pre_fill_type` TEXT, `form_type` TEXT, `messages` TEXT, `title` TEXT, PRIMARY KEY(`brand_status_type`))");
            }
        }

        public static final class e extends AbstractC6912b {
            public e() {
                super(5, 6);
            }

            @Override // z2.AbstractC6912b
            public void a(g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.z("UPDATE `articles` SET `content` = NULL");
                db2.z("ALTER TABLE `articles` ADD COLUMN `local_meta_article_local_file_path` TEXT");
            }
        }

        public final AbstractC6912b a() {
            return f42592b;
        }

        public final AbstractC6912b b() {
            return f42593c;
        }

        public final AbstractC6912b c() {
            return f42594d;
        }

        public final AbstractC6912b d() {
            return f42595e;
        }

        public final AbstractC6912b e() {
            return f42596f;
        }
    }

    public abstract InterfaceC4065a g();

    public abstract Hd.a h();

    public abstract InterfaceC6253a i();
}
