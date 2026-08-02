package com.blaze.blazesdk.database;

import android.database.Cursor;
import androidx.annotation.Keep;
import defpackage.bvl;
import defpackage.bzl;
import defpackage.c6m;
import defpackage.dni;
import defpackage.njc;
import defpackage.vql;
import defpackage.x2m;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/blaze/blazesdk/database/BlazeDatabaseMigrations;", "", "<init>", "()V", "Ldni;", "database", "", "migrateToVersion7", "(Ldni;)V", "Lnjc;", "MIGRATION_9_10", "Lnjc;", "MIGRATION_8_9", "MIGRATION_7_8", "MIGRATION_6_7", "MIGRATION_5_7", "", "getAllMigrations", "()[Lnjc;", "allMigrations", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeDatabaseMigrations {

    @NotNull
    public static final BlazeDatabaseMigrations INSTANCE = new BlazeDatabaseMigrations();

    @NotNull
    private static final njc MIGRATION_9_10 = new c6m();

    @NotNull
    private static final njc MIGRATION_8_9 = new x2m();

    @NotNull
    private static final njc MIGRATION_7_8 = new bzl();

    @Keep
    @NotNull
    private static final njc MIGRATION_6_7 = new bvl();

    @NotNull
    private static final njc MIGRATION_5_7 = new vql();
    public static final int $stable = 8;

    private BlazeDatabaseMigrations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void migrateToVersion7(dni database) {
        try {
            try {
                database.E("CREATE TABLE IF NOT EXISTS `analytics_track` \n(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `request` TEXT NOT NULL, `response` TEXT, `type` TEXT NOT NULL)");
                database.E("CREATE TABLE IF NOT EXISTS `analytics_do_not_track` \n(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `request` TEXT NOT NULL, `response` TEXT, `type` TEXT NOT NULL)");
                database.E("CREATE TABLE IF NOT EXISTS `stories_pages_status` \n(`page_id` TEXT NOT NULL , `story_id` TEXT NOT NULL , `is_synced` INTEGER NOT NULL, PRIMARY KEY(`page_id`))");
                database.E("INSERT INTO `stories_pages_status` ( `page_id` , `story_id`, `is_synced`)\nSELECT `id` , `story_id`, 0 FROM `stories_pages_read_status` WHERE `is_read` = 1");
                Cursor A0 = database.A0("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='moments_liked_status';");
                boolean z = false;
                if (A0.moveToFirst() && A0.getInt(0) > 0) {
                    z = true;
                }
                A0.close();
                if (z) {
                    database.E("CREATE TABLE `moments_liked_status_temp` \n(`moment_id` TEXT NOT NULL, `is_liked` INTEGER NOT NULL, PRIMARY KEY(`moment_id`))");
                    database.E("INSERT INTO `moments_liked_status_temp` (`moment_id`, `is_liked`)\nSELECT `id`, `is_liked` FROM `moments_liked_status`");
                    database.E("DROP TABLE `moments_liked_status`");
                    database.E("ALTER TABLE `moments_liked_status_temp` RENAME TO `moments_liked_status`");
                }
                database.E("CREATE TABLE IF NOT EXISTS `moments_viewed` \n(`moment_id` TEXT NOT NULL, `is_synced` INTEGER NOT NULL, PRIMARY KEY(`moment_id`))");
                database.E("DROP TABLE IF EXISTS `analytics`");
            } finally {
                try {
                } finally {
                    try {
                        database.E("DROP TABLE IF EXISTS `stories_pages_read_status`");
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    @NotNull
    public final njc[] getAllMigrations() {
        return new njc[]{MIGRATION_5_7, MIGRATION_6_7, MIGRATION_7_8, MIGRATION_8_9, MIGRATION_9_10};
    }
}
