package ru.ozon.android.messenger.framework.data.local.database;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f87467a = new a(1, 2);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C1570b f87468b = new C1570b(2, 3);

    public static final class a extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE `draft_texts`");
            database.O0("CREATE TABLE `draft_texts` (`chat_id` TEXT PRIMARY KEY NOT NULL, `text` TEXT NOT NULL, FOREIGN KEY (`chat_id`) REFERENCES 'chats'(`chat_id`) ON DELETE CASCADE)");
            database.O0("DROP TABLE `draft_attachments`");
            database.O0("CREATE TABLE `draft_attachments` (`id` TEXT PRIMARY KEY NOT NULL, `chat_id` TEXT NOT NULL, `type` INTEGER NOT NULL, `local_url` TEXT NOT NULL, `remote_url` TEXT, `media_type` TEXT, `image_width` INTEGER, `image_height` INTEGER, `file_name` TEXT, `file_size` TEXT, FOREIGN KEY (`chat_id`) REFERENCES 'chats'(`chat_id`) ON DELETE CASCADE)");
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.data.local.database.b$b, reason: collision with other inner class name */
    public static final class C1570b extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DELETE FROM `undelivered_messages`");
        }
    }

    @NotNull
    public static a a() {
        return f87467a;
    }

    @NotNull
    public static C1570b b() {
        return f87468b;
    }
}
