package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.common.logging.FLog;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

@ReactModule(name = "RNCAsyncStorage")
/* loaded from: classes8.dex */
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private final SerialExecutor executor;
    private ReactDatabaseSupplier mReactDatabaseSupplier;
    private boolean mShuttingDown;

    public AsyncStorageModule(ReactApplicationContext reactContext) {
        this(reactContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @VisibleForTesting
    AsyncStorageModule(ReactApplicationContext reactContext, Executor executor) {
        super(reactContext);
        this.mShuttingDown = false;
        AsyncStorageExpoMigration.migrate(reactContext);
        this.executor = new SerialExecutor(executor);
        this.mReactDatabaseSupplier = ReactDatabaseSupplier.getInstance(reactContext);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        this.mReactDatabaseSupplier.closeDatabase();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.reactnativecommunity.asyncstorage.AsyncStorageModule$1] */
    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(final ReadableArray keys, final Callback callback) {
        if (keys == null) {
            callback.invoke(AsyncStorageErrorUtil.getInvalidKeyError(null), null);
        } else {
            new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.reactnativecommunity.asyncstorage.AsyncStorageModule.1
                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX WARN: Finally extract failed */
                @Override // com.facebook.react.bridge.GuardedAsyncTask
                public void doInBackgroundGuarded(Void... params) {
                    if (!AsyncStorageModule.this.ensureDatabase()) {
                        callback.invoke(AsyncStorageErrorUtil.getDBError(null), null);
                        return;
                    }
                    String[] strArr = {SDKConstants.PARAM_KEY, "value"};
                    HashSet hashSet = new HashSet();
                    WritableArray createArray = Arguments.createArray();
                    for (int i = 0; i < keys.size(); i += 999) {
                        int min = Math.min(keys.size() - i, 999);
                        Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.get().query("catalystLocalStorage", strArr, AsyncLocalStorageUtil.buildKeySelection(min), AsyncLocalStorageUtil.buildKeySelectionArgs(keys, i, min), null, null, null);
                        hashSet.clear();
                        try {
                            try {
                                if (query.getCount() != keys.size()) {
                                    for (int i2 = i; i2 < i + min; i2++) {
                                        hashSet.add(keys.getString(i2));
                                    }
                                }
                                if (query.moveToFirst()) {
                                    do {
                                        WritableArray createArray2 = Arguments.createArray();
                                        createArray2.pushString(query.getString(0));
                                        createArray2.pushString(query.getString(1));
                                        createArray.pushArray(createArray2);
                                        hashSet.remove(query.getString(0));
                                    } while (query.moveToNext());
                                }
                                query.close();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    String str = (String) it.next();
                                    WritableArray createArray3 = Arguments.createArray();
                                    createArray3.pushString(str);
                                    createArray3.pushNull();
                                    createArray.pushArray(createArray3);
                                }
                                hashSet.clear();
                            } catch (Exception e) {
                                FLog.w("ReactNative", e.getMessage(), e);
                                callback.invoke(AsyncStorageErrorUtil.getError(null, e.getMessage()), null);
                                query.close();
                                return;
                            }
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    callback.invoke(null, createArray);
                }
            }.executeOnExecutor(this.executor, new Void[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.reactnativecommunity.asyncstorage.AsyncStorageModule$2] */
    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiSet(final ReadableArray keyValueArray, final Callback callback) {
        if (keyValueArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.reactnativecommunity.asyncstorage.AsyncStorageModule.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.facebook.react.bridge.GuardedAsyncTask
                public void doInBackgroundGuarded(Void... voidArr) {
                    String str = null;
                    WritableMap error = null;
                    if (!AsyncStorageModule.this.ensureDatabase()) {
                        callback.invoke(AsyncStorageErrorUtil.getDBError(null));
                        return;
                    }
                    SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.get().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
                    try {
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.get().beginTransaction();
                            for (int i = 0; i < keyValueArray.size(); i++) {
                                if (keyValueArray.getArray(i).size() != 2) {
                                    WritableMap invalidValueError = AsyncStorageErrorUtil.getInvalidValueError(null);
                                    try {
                                        AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                        return;
                                    } catch (Exception e) {
                                        e = e;
                                        FLog.w("ReactNative", e.getMessage(), e);
                                        if (invalidValueError != null) {
                                            return;
                                        }
                                    }
                                } else if (keyValueArray.getArray(i).getString(0) == null) {
                                    WritableMap invalidKeyError = AsyncStorageErrorUtil.getInvalidKeyError(null);
                                    try {
                                        AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                        return;
                                    } catch (Exception e2) {
                                        e = e2;
                                        FLog.w("ReactNative", e.getMessage(), e);
                                        if (invalidKeyError != null) {
                                            return;
                                        }
                                    }
                                } else if (keyValueArray.getArray(i).getString(1) == null) {
                                    WritableMap invalidValueError2 = AsyncStorageErrorUtil.getInvalidValueError(null);
                                    try {
                                        AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                        return;
                                    } catch (Exception e3) {
                                        e = e3;
                                        FLog.w("ReactNative", e.getMessage(), e);
                                        if (invalidValueError2 != null) {
                                            return;
                                        }
                                    }
                                } else {
                                    compileStatement.clearBindings();
                                    compileStatement.bindString(1, keyValueArray.getArray(i).getString(0));
                                    compileStatement.bindString(2, keyValueArray.getArray(i).getString(1));
                                    compileStatement.execute();
                                }
                                AsyncStorageErrorUtil.getError(null, e.getMessage());
                                return;
                            }
                            AsyncStorageModule.this.mReactDatabaseSupplier.get().setTransactionSuccessful();
                        } finally {
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                            } catch (Exception e4) {
                                FLog.w("ReactNative", e4.getMessage(), e4);
                                AsyncStorageErrorUtil.getError(null, e4.getMessage());
                            }
                        }
                    } catch (Exception e5) {
                        FLog.w("ReactNative", e5.getMessage(), e5);
                        WritableMap error2 = AsyncStorageErrorUtil.getError(null, e5.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                        } catch (Exception e6) {
                            FLog.w("ReactNative", e6.getMessage(), e6);
                            if (error2 == null) {
                                error = AsyncStorageErrorUtil.getError(null, e6.getMessage());
                            }
                        }
                        error = error2;
                    }
                    if (error != null) {
                        callback.invoke(error);
                    } else {
                        callback.invoke(new Object[0]);
                    }
                }
            }.executeOnExecutor(this.executor, new Void[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.reactnativecommunity.asyncstorage.AsyncStorageModule$3] */
    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(final ReadableArray keys, final Callback callback) {
        if (keys.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.reactnativecommunity.asyncstorage.AsyncStorageModule.3
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.facebook.react.bridge.GuardedAsyncTask
                public void doInBackgroundGuarded(Void... voidArr) {
                    String str = null;
                    WritableMap error = null;
                    if (!AsyncStorageModule.this.ensureDatabase()) {
                        callback.invoke(AsyncStorageErrorUtil.getDBError(null));
                        return;
                    }
                    try {
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.get().beginTransaction();
                            for (int i = 0; i < keys.size(); i += 999) {
                                int min = Math.min(keys.size() - i, 999);
                                AsyncStorageModule.this.mReactDatabaseSupplier.get().delete("catalystLocalStorage", AsyncLocalStorageUtil.buildKeySelection(min), AsyncLocalStorageUtil.buildKeySelectionArgs(keys, i, min));
                            }
                            AsyncStorageModule.this.mReactDatabaseSupplier.get().setTransactionSuccessful();
                        } catch (Exception e) {
                            FLog.w("ReactNative", e.getMessage(), e);
                            WritableMap error2 = AsyncStorageErrorUtil.getError(null, e.getMessage());
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                            } catch (Exception e2) {
                                FLog.w("ReactNative", e2.getMessage(), e2);
                                if (error2 == null) {
                                    error = AsyncStorageErrorUtil.getError(null, e2.getMessage());
                                }
                            }
                            error = error2;
                        }
                        if (error != null) {
                            callback.invoke(error);
                        } else {
                            callback.invoke(new Object[0]);
                        }
                    } finally {
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                        } catch (Exception e3) {
                            FLog.w("ReactNative", e3.getMessage(), e3);
                            AsyncStorageErrorUtil.getError(null, e3.getMessage());
                        }
                    }
                }
            }.executeOnExecutor(this.executor, new Void[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.reactnativecommunity.asyncstorage.AsyncStorageModule$4] */
    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(final ReadableArray keyValueArray, final Callback callback) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.reactnativecommunity.asyncstorage.AsyncStorageModule.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... voidArr) {
                String str = null;
                WritableMap error = null;
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(AsyncStorageErrorUtil.getDBError(null));
                    return;
                }
                try {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.get().beginTransaction();
                        for (int i = 0; i < keyValueArray.size(); i++) {
                            if (keyValueArray.getArray(i).size() != 2) {
                                WritableMap invalidValueError = AsyncStorageErrorUtil.getInvalidValueError(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                    return;
                                } catch (Exception e) {
                                    e = e;
                                    FLog.w("ReactNative", e.getMessage(), e);
                                    if (invalidValueError != null) {
                                        return;
                                    }
                                }
                            } else if (keyValueArray.getArray(i).getString(0) == null) {
                                WritableMap invalidKeyError = AsyncStorageErrorUtil.getInvalidKeyError(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                    return;
                                } catch (Exception e2) {
                                    e = e2;
                                    FLog.w("ReactNative", e.getMessage(), e);
                                    if (invalidKeyError != null) {
                                        return;
                                    }
                                }
                            } else if (keyValueArray.getArray(i).getString(1) == null) {
                                WritableMap invalidValueError2 = AsyncStorageErrorUtil.getInvalidValueError(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                    return;
                                } catch (Exception e3) {
                                    e = e3;
                                    FLog.w("ReactNative", e.getMessage(), e);
                                    if (invalidValueError2 != null) {
                                        return;
                                    }
                                }
                            } else if (!AsyncLocalStorageUtil.mergeImpl(AsyncStorageModule.this.mReactDatabaseSupplier.get(), keyValueArray.getArray(i).getString(0), keyValueArray.getArray(i).getString(1))) {
                                WritableMap dBError = AsyncStorageErrorUtil.getDBError(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                    return;
                                } catch (Exception e4) {
                                    e = e4;
                                    FLog.w("ReactNative", e.getMessage(), e);
                                    if (dBError != null) {
                                        return;
                                    }
                                }
                            }
                            AsyncStorageErrorUtil.getError(null, e.getMessage());
                            return;
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.get().setTransactionSuccessful();
                    } catch (Exception e5) {
                        FLog.w("ReactNative", e5.getMessage(), e5);
                        WritableMap error2 = AsyncStorageErrorUtil.getError(null, e5.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                        } catch (Exception e6) {
                            FLog.w("ReactNative", e6.getMessage(), e6);
                            if (error2 == null) {
                                error = AsyncStorageErrorUtil.getError(null, e6.getMessage());
                            }
                        }
                        error = error2;
                    }
                    if (error != null) {
                        callback.invoke(error);
                    } else {
                        callback.invoke(new Object[0]);
                    }
                } finally {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                    } catch (Exception e7) {
                        FLog.w("ReactNative", e7.getMessage(), e7);
                        AsyncStorageErrorUtil.getError(null, e7.getMessage());
                    }
                }
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.reactnativecommunity.asyncstorage.AsyncStorageModule$5] */
    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(final Callback callback) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.reactnativecommunity.asyncstorage.AsyncStorageModule.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... params) {
                if (!AsyncStorageModule.this.mReactDatabaseSupplier.ensureDatabase()) {
                    callback.invoke(AsyncStorageErrorUtil.getDBError(null));
                    return;
                }
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.clear();
                    callback.invoke(new Object[0]);
                } catch (Exception e) {
                    FLog.w("ReactNative", e.getMessage(), e);
                    callback.invoke(AsyncStorageErrorUtil.getError(null, e.getMessage()));
                }
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.reactnativecommunity.asyncstorage.AsyncStorageModule$6] */
    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(final Callback callback) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.reactnativecommunity.asyncstorage.AsyncStorageModule.6
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Finally extract failed */
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... params) {
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(AsyncStorageErrorUtil.getDBError(null), null);
                    return;
                }
                WritableArray createArray = Arguments.createArray();
                Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.get().query("catalystLocalStorage", new String[]{SDKConstants.PARAM_KEY}, null, null, null, null, null);
                try {
                    try {
                        if (query.moveToFirst()) {
                            do {
                                createArray.pushString(query.getString(0));
                            } while (query.moveToNext());
                        }
                        query.close();
                        callback.invoke(null, createArray);
                    } catch (Exception e) {
                        FLog.w("ReactNative", e.getMessage(), e);
                        callback.invoke(AsyncStorageErrorUtil.getError(null, e.getMessage()), null);
                        query.close();
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.ensureDatabase();
    }
}
