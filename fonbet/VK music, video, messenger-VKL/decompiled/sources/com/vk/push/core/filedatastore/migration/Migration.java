package com.vk.push.core.filedatastore.migration;

import android.content.Context;
import kotlin.Result;
import xsna.spj;

/* compiled from: Migration.kt */
/* loaded from: classes.dex */
public interface Migration<T> {
    public static final Companion Companion = Companion.a;

    /* compiled from: Migration.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final <T> Migration<T> noMigration$core_release() {
            return new Migration<T>() { // from class: com.vk.push.core.filedatastore.migration.Migration$Companion$noMigration$1
                @Override // com.vk.push.core.filedatastore.migration.Migration
                /* renamed from: migrate-gIAlu-s */
                public Object mo103migrategIAlus(Context context, spj<? super Result<? extends T>> spjVar) {
                    return null;
                }

                @Override // com.vk.push.core.filedatastore.migration.Migration
                public Object shouldMigrate(Context context, spj<? super Boolean> spjVar) {
                    return Boolean.FALSE;
                }
            };
        }
    }

    /* renamed from: migrate-gIAlu-s, reason: not valid java name */
    Object mo103migrategIAlus(Context context, spj<? super Result<? extends T>> spjVar);

    Object shouldMigrate(Context context, spj<? super Boolean> spjVar);
}
