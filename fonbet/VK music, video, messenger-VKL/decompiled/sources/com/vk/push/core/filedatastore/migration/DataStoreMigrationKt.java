package com.vk.push.core.filedatastore.migration;

import android.content.Context;
import java.io.File;

/* compiled from: DataStoreMigration.kt */
/* loaded from: classes.dex */
public final class DataStoreMigrationKt {
    public static final File getFileToMigrate(Context context, String str) {
        return new File(context.getFilesDir().getPath() + "/datastore/" + str + ".preferences_pb");
    }
}
