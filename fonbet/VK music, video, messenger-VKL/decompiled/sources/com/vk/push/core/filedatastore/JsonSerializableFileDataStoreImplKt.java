package com.vk.push.core.filedatastore;

import android.content.Context;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.filedatastore.migration.Migration;
import xsna.bdn;
import xsna.f4k;
import xsna.h8r;
import xsna.i7f0;
import xsna.wgl;
import xsna.yvj;
import xsna.zvj;

/* compiled from: JsonSerializableFileDataStoreImpl.kt */
/* loaded from: classes.dex */
public final class JsonSerializableFileDataStoreImplKt {
    public static final <T extends JsonSerializer> i7f0<Context, FileDataStore<T>> fileDataStore(String str, JsonDeserializer<T> jsonDeserializer, Migration<T> migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2, yvj yvjVar) {
        return new h8r(str, jsonDeserializer, migration, crashReporterRepository, z, z2, yvjVar);
    }

    public static i7f0 fileDataStore$default(String str, JsonDeserializer jsonDeserializer, Migration migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2, yvj yvjVar, int i, Object obj) {
        if ((i & 4) != 0) {
            migration = Migration.Companion.noMigration$core_release();
        }
        Migration migration2 = migration;
        if ((i & 8) != 0) {
            crashReporterRepository = new f4k();
        }
        CrashReporterRepository crashReporterRepository2 = crashReporterRepository;
        if ((i & 16) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            bdn bdnVar = bdn.a;
            yvjVar = zvj.a(wgl.c);
        }
        return fileDataStore(str, jsonDeserializer, migration2, crashReporterRepository2, z3, z4, yvjVar);
    }
}
